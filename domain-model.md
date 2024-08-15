| `Classes`   | `Members`                      | `Methods`                                  | `Scenario`          | `Outcome`                                    |
|-------------|--------------------------------|--------------------------------------------|---------------------|----------------------------------------------|
| `Todo-list` | `HashMap<String,String> Tasks` | `Add(String task)`                         | Task in Tasks       | Return false, Task is not added anew         |
|             |                                |                                            | Task not in Tasks   | Return true, Task is added                   |
|             |                                | `Display()`                                | Tasks is empty      | Return false, Print nothing                  |
|             |                                |                                            | Tasks is not empty  | Return true, Print tasks                     |
|             |                                | `changeStatus(String task, String status)` | Task exists         | Return true, change status of task           |
|             |                                |                                            | Task does not exist | Return false                                 |
|             |                                | `statusDisplay(boolean status)`            | Tasks exist         | Return true, display all tasks of given status |
|             |                                |                                            | Tasks do not exist  | Return false, display nothing                |
|             |                                | `search(String task)`                      | Task exists         | Return true                                  |
|             |                                |                                            | Task does not exist | Return false                                 |
|             |                                | `remove(String task)`                      | Task exists         | Return true, remove task from Tasks          |
|             |                                |                                            | Task does not exist | Return false                                 |
|             |                                | `sort(boolean order)`                       | Tasks has values    | Return true, display tasks in given order    |
|             |                                |                                            | Tasks is empty      | Return false                                 |