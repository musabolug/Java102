## filter()
#### Bu metodu kullanarak akışın elemanlarını filtreleyebilirsiniz. Predicate<T> türünde bir parametre alır. Bu teste uymayan elemanları akışa almaz.
list .stream().filter(number -> number > 60) şeklinde yazılır


## distinct()
#### Bu metodu kullanarak akışın içinde her elemanın en fazla 1 kez yer almasını sağlayabilirsiniz. Eğer akışın içinde bir eleman daha önce tanımlanmışsa, ikinci kez yer almaz. Parametre almaz.
list.stream().distinct() .forEach(number -> System.out.println(number));


## sorted()
#### Bu metodu kullanarak akışın elemanlarını sıralayabilirsiniz.
list.stream().sorted().forEach(number -> System.out.println(number));


## limit()
#### Bu metodu kullanarak akış üzerinde gerçekleştireceğiniz işlemleri belli bir sayıyla sınırlandırabilirsiniz. long türünde bir sayıyı parametre olarak alır.
list .stream().limit(5L).forEach(number -> System.out.println(number));


## skip()
#### Bu metodu kullanarak akışın belli sayıda elemanını atlayabilirsiniz. Bu elemanlar üzerinde işlem yapılmaz. long türünde bir sayıyı parametre olarak alır
list .stream().skip(5L).limit(2L).forEach(number -> System.out.println(number));


## count()
#### Bu metodu kullanarak akıştaki eleman sayısını öğrenebilirsiniz. Bu metot akışı sonlandıran bir metottur, yani bu metodu kullandıktan sonra akış üzerinde başka bir işlem yapamazsınız.
long count = list .stream().filter(number -> number < 40).distinct().count();
System.out.println(count);


## anyMatch()
#### Predicate<T> türünde bir parametre alır ve bu testi akışın bütün elemanları üzerinde uygular. Elemanlardan herhangi biri bu testten geçiyorsa true, aksi halde false döndürür. Bu metot akışı sonlandıran bir metottur, yani bu metodu kullandıktan sonra akış üzerinde başka bir işlem yapamazsınız.
boolean match = list .stream().anyMatch(number -> number < 5);
System.out.println(match);


## map()
#### Akışın elemanlarını değiştirmek için bu metodu kullanabilirsiniz. Function<T,R> türünde bir parametre alır ve bu fonksiyonu akışın bütün elemanlarına uygular. Akışın yeni elemanları bu metottan dönen değerlerdir.
list .stream().map(number -> number * 2).forEach(number -> System.out.println(number));



