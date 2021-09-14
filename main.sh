clear
cd HealthSystem
printf "Compilando ..."
javac -d build/classes src/healthsystem/*.java
if [$? == 0]
then
  clear
  java -cp build/classes healthsystem.HealthSystem
else
  printf "\n\n\nError - Exit code $?"
fi