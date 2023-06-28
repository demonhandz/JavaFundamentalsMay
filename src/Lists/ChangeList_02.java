package Lists;

import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Collectors;

public class ChangeList_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")) {

            if(command.contains("Delete")){
                //must delete all elements from the list which are == numberForRemove

                int numberForRemove = Integer.parseInt(command.split(" ")[1]);

                numbers.removeAll(Arrays.asList(numberForRemove));

            } else if (command.contains("Insert")) {
                //insert an element at the given position
                int element = Integer.parseInt(command.split(" ")[1]);
                int position = Integer.parseInt(command.split(" ")[2]);
                numbers.add(position, element);
            }
            command = scanner.nextLine();
        }
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
