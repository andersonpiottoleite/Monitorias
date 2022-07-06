package streams;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

import static java.util.stream.Collectors.toMap;

public class TestStreams {

    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>();
        palavras.add("Perseverança");
        palavras.add("Força");
        palavras.add("Resiliência");

        List<Integer> valores = new ArrayList<>();
        valores.add(1);
        valores.add(2);
        valores.add(2);
        valores.add(3);
        valores.add(4);
        valores.add(4);
        valores.add(5);

        /*
        forEachImprimindoComLamba(palavras);
        forEachImprimindoComMethosReference(palavras);
        filtrandoComFilter(palavras);
        count(palavras);
        max(palavras);
        pegaQualquerUm(palavras);
        pegaPrimeiro(palavras);
        mapeiaParaListDeInt(palavras);
        mapeiaParaMapDeInt(palavras);
        mapeiaParaStreamDouble(valores);
        selecionaOsTresUltimosValoresMasPulaOPrimeiro(valores);
        media(valores);
        soma(valores);
        sumario(valores);
        agrupando(valores);
        reducingMax(valores);
        reducingMin(valores);
        flatMapEmLista();
        flatMapEmHashMapDeIntegerAndListString();
        flatMapEmHashMapDeIntegerAndListDouble();
         */
    }

    private static void flatMapEmHashMapDeIntegerAndListDouble() {

        Map<Integer, List<Double>> matrizNumeros = new HashMap<>();

        matrizNumeros.put(1, Arrays.asList(10.0,20.0));
        matrizNumeros.put(2, Arrays.asList(30.0,40.0));
        matrizNumeros.put(3, Arrays.asList(50.0,60.0));

        System.out.println(matrizNumeros);

        var mapNumerosValorChave = matrizNumeros.entrySet()
                .stream()
                .flatMap(entry -> entry.getValue()
                        .stream()
                        .map(s -> Map.entry(s, entry.getKey())))
                .collect(toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println(mapNumerosValorChave);

        AtomicInteger counter = new AtomicInteger(0);

        var mapNumeroChaveValor = matrizNumeros.entrySet()
                .stream()
                .flatMap(entry -> entry.getValue()
                        .stream()
                        // .map(s -> Map.entry(new Random().nextInt(1, 100000) ,s)))
                        .map(s -> Map.entry(counter.getAndIncrement() ,s)))
                .collect(toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println(mapNumeroChaveValor);
    }

    private static void flatMapEmHashMapDeIntegerAndListString() {
        Map<Integer, List<String>> matrizPalavras = new HashMap<>();

        matrizPalavras.put(1, Arrays.asList("palavra1","palavra2"));
        matrizPalavras.put(2, Arrays.asList("palavra3","palavra4"));
        matrizPalavras.put(3, Arrays.asList("palavra5","palavra6"));

        System.out.println(matrizPalavras);

        var mapValorChave = matrizPalavras.entrySet()
                .stream()
                .flatMap(entry -> entry.getValue()
                        .stream()
                        .map(s -> Map.entry(s, entry.getKey())))
                .collect(toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println(mapValorChave);

        AtomicInteger counter = new AtomicInteger(0);

        var mapChaveValor = matrizPalavras.entrySet()
                .stream()
                .flatMap(entry -> entry.getValue()
                        .stream()
                        // .map(s -> Map.entry(new Random().nextInt(1, 100000) ,s)))
                        .map(s -> Map.entry(counter.getAndIncrement() ,s)))
                .collect(toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println(mapChaveValor);
    }

    private static void flatMapEmLista() {
        List<List<String>> matrizPalavras = new ArrayList<>();

        matrizPalavras.add(Arrays.asList("palavra1","palavra2"));
        matrizPalavras.add(Arrays.asList("palavra3","palavra4"));
        matrizPalavras.add(Arrays.asList("palavra5","palavra6"));
        System.out.println(matrizPalavras);

        List<String> listDerivadaDeMap = matrizPalavras.stream().map(m -> m.get(0) + m.get(1)).collect(Collectors.toList());
        listDerivadaDeMap.forEach(l -> System.out.println("A partir de map - " + l));

        List<String> listDerivadaDeFlatMap = matrizPalavras.stream().flatMap(Collection::stream).collect(Collectors.toList());
        listDerivadaDeFlatMap.forEach(l -> System.out.println("A partir de flatMap - " + l));
    }

    private static void reducingMin(List<Integer> valores) {
        Optional<Integer> reducing = valores.stream().reduce(BinaryOperator.minBy(Comparator.comparing(v -> v.intValue())));
        //Optional<Integer> reducing = valores.stream().collect(Collectors.reducing(BinaryOperator.minBy(Comparator.comparing(v -> v.intValue()))));
        System.out.println(reducing.get());
    }

    private static void reducingMax(List<Integer> valores) {
        Optional<Integer> reducing = valores.stream().reduce(BinaryOperator.maxBy(Comparator.comparing(v -> v.intValue())));
        //Optional<Integer> reducing = valores.stream().collect(Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(v -> v.intValue()))));
        System.out.println(reducing.get());
    }

    private static void agrupando(List<Integer> valores) {
        Map<Object, List<Integer>> sumary = valores.stream().collect(Collectors.groupingBy(v -> v.intValue()));
        sumary.entrySet().stream().forEach(System.out::println);
    }

    private static void sumario(List<Integer> valores) {
        IntSummaryStatistics sumary = valores.stream().collect(Collectors.summarizingInt(v -> v.intValue()));
        System.out.println(sumary);
    }

    private static void soma(List<Integer> valores) {
        Integer soma = valores.stream().collect(Collectors.summingInt(v -> v.intValue()));
        System.out.println(soma);
    }

    private static void media(List<Integer> valores) {
        Double media = valores.stream().collect(Collectors.averagingInt(v -> v.intValue()));
        System.out.println(media);
    }

    private static void selecionaOsTresUltimosValoresMasPulaOPrimeiro(List<Integer> valores) {
        valores.stream().limit(3).skip(1).forEach(System.out::println);
    }

    private static void pulaOsDoisPrimeiro(List<Integer> valores) {
        valores.stream().skip(2).forEach(System.out::println);
    }

    private static void imprimeSomenteOsDoisPrimeiros(List<Integer> valores) {
        valores.stream().limit(2).forEach(System.out::println);
    }

    private static void mapeiaParaStreamDouble(List<Integer> valores) {
        DoubleStream doubleStream = valores.stream().mapToDouble( v -> v.intValue());
        doubleStream.forEach(System.out::println);
    }

    private static void mapeiaParaMapDeInt(List<String> palavras) {
        Map<Integer, String> map = palavras.stream().collect(toMap(p -> p.length(), Function.identity()));

        map.entrySet().stream().forEach(c -> System.out.println(c.getKey() + " - " + c.getValue()));

    }

    private static void mapeiaParaListDeInt(List<String> palavras) {
        palavras.stream().map(p -> {
            return p.length();
        }).collect(Collectors.toList()).forEach(System.out::println);
    }

    private static void pegaPrimeiro(List<String> palavras) {
        Optional<String> primeiro = palavras.stream().findFirst();
        System.out.println(primeiro.get());
    }

    private static void pegaQualquerUm(List<String> palavras) {
        Optional<String> qualquerUm = palavras.stream().findAny();
        System.out.println(qualquerUm.get());
    }

    private static void max(List<String> palavras) {
        Optional<String> max = palavras.stream().max((s1, s2) -> Integer.compare(s1.length(), s2.length()));
        System.out.println(max.get());
    }

    private static void count(List<String> palavras) {
        long count = palavras.stream().filter(p -> p.equals("Força")).count();
        System.out.println(count);

        long count2 = palavras.stream().count();
        System.out.println(count2);
    }

    private static void filtrandoComFilter(List<String> palavras) {
        palavras.stream().filter( p -> p.equals("Força")).forEach(
                System.out::println
        );
    }

    private static void forEachImprimindoComMethosReference(List<String> palavras) {
        palavras.stream().forEach(System.out::println);
    }

    private static void forEachImprimindoComLamba(List<String> palavras) {
        palavras.stream().forEach(c -> System.out.println(c));
    }
}

