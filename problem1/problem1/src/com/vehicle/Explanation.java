/*
 Type Conversions
Implicit Type Conversions (Widening Conversion):
Java automatically converts smaller types to larger types.
For example, when calculating kilometersDriven in the ElectricCar class, distance is an int,
 but Java implicitly converts it to a double during division.
Explicit Type Conversions (Narrowing Conversion):
This is when you manually convert a larger type into a smaller type.
In the Car class, after calculating the remaining fuel,
the resulting double value is explicitly cast into an int using (int) to return an integer percentage.
 */