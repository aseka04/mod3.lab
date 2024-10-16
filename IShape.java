package labka;


class Circle{
    private double _radius;

    public Circle(double radius) {
        this._radius = radius;
    }

    public double CalculateArea() {
        return Math.PI * _radius * _radius;
    }
}

class Square{
    private double _side;

    public Square(double side){
        this._side = side;
    }

    public double CalculateArea(){
        return _side * _side;
    }
}
