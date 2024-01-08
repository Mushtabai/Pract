import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

    public static <T> List<T> convertArrayToList(T[] array) {
        List<T> list = new ArrayList<>();
        for (T item : array) {
            list.add(item);
        }
        return list;
    }

    public static List<String> getDirectoryContents(String path) {
        File directory = new File(path);
        if (directory.exists() && directory.isDirectory()) {
            File[] files = directory.listFiles();
            if (files != null) {
                List<String> fileList = new ArrayList<>();
                for (int i = 0; i < Math.min(5, files.length); i++) {
                    fileList.add(files[i].getName());
                }
                return fileList;
            }
        }
        return new ArrayList<>();
    }
    public static void main(String[] args) {
        String[] stringArray = {"Hello", "World", "Java"};

        List<String> stringListA = Arrays.stream(stringArray).map(s -> s + "Test").toList();

        List<String> stringList = convertArrayToList(stringArray);
        System.out.println(stringList);

        Integer[] intArray = {1, 2, 3, 4, 5};
        List<Integer> intList = convertArrayToList(intArray);
        System.out.println(intList);


        Integer[] newintArray = {1, 2, 3, 4, 5};
        GenericArray<Integer> intArrayWrapper = new GenericArray<>(newintArray);
        System.out.println(intArrayWrapper.getElement(2)); // Выведет "3"

        String[] newstringArray = {"Hello", "World", "Java"};
        GenericArray<String> stringArrayWrapper = new GenericArray<>(stringArray);
        System.out.println(stringArrayWrapper.getElement(1)); // Выведет "World"


        String directoryPath = "D:\\D0niL\\files";
        List<String> fileList = getDirectoryContents(directoryPath);
        System.out.println("First 5 elements in the directory: " + Arrays.toString(fileList.toArray()));
    }
}