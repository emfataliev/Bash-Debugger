package ru.emil.bashdb.commands;

public enum UserInterfaceCommand {
  RUN("run", "continue script execution"),
  STOP("stop", "stop script execution"),
  VARIABLES("vars", "get stack of variables"),
  HELP("help", "get all available commands");

  private final String command;
  private final String description;

  private static final String DELIMITER = " - ";
  private static final String TAB = "\t";

  UserInterfaceCommand(final String command, final String description) {
    this.command = command;
    this.description = description;
  }

  public String getCommand() {
    return command;
  }

  public String getDescription() {
    return description;
  }

  public static String getHelp() {
    StringBuilder commandsWithDescription = new StringBuilder();

    for (UserInterfaceCommand command : UserInterfaceCommand.values()) {
      commandsWithDescription
          .append(TAB)
          .append(command.command)
          .append(DELIMITER)
          .append(command.description)
          .append(System.lineSeparator());
    }

    return commandsWithDescription.toString();
  }
}
