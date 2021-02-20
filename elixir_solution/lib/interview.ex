defmodule Interview do
  def convertToTitleCase(string) when is_binary(string) do
    string
    |> String.split(~r/[^[:alnum:]]/u, trim: true)
    |> Enum.map(&String.capitalize/1)
    |> Enum.join(" ")
  end

  def convertUnixToDateString(seconds) when is_integer(seconds) do
    seconds
    |> DateTime.from_unix!()
    |> Calendar.strftime("%B %-d, %Y")
  end
end
