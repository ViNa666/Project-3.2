public class BmService {
    public float calculate(int mass, int height) {
        float bmIndex = mass / ((height / 100) ^ 2);
        return bmIndex;
    }
}
