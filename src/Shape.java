public record Shape() implements SealedShape {
    @Override
    public double surface() {
        return 0;
    }
}
