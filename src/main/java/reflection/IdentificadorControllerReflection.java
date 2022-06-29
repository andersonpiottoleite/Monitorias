package reflection;

public class IdentificadorControllerReflection {

    private String pacoteBase;

    public IdentificadorControllerReflection(String pacoteBase) {
        this.pacoteBase = pacoteBase;
    }

    public Object executa(String url) {
        String[] partesUrl = url.replaceFirst("/", "")
                .split("/");

        String nomeController = Character
                .toUpperCase(partesUrl[0].charAt(0)) +
                partesUrl[0]
                        .substring(1) + "Controller";

        try {
            Class<?> classeController = Class.forName(pacoteBase + nomeController);
            Object instanciaController = classeController.newInstance();
            System.out.println(instanciaController.getClass().getSimpleName());
            System.out.println(instanciaController.getClass().getName());

        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }


        return null;
    }

}
