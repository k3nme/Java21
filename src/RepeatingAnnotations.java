import java.lang.annotation.Repeatable;

public class RepeatingAnnotations {

    @Repeatable(Shaper.class)
    public @interface Shopify {
        String shape();
    }

    public @interface Shaper{
        Shopify[] value();
    }
}
