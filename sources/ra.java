// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class ra {
    public final String a;
    public final int b;
    public transient String c;

    public ra(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final String toString() {
        String str = this.c;
        if (str != null) {
            return str;
        }
        String format = String.format("%s:%d", this.a, Integer.valueOf(this.b));
        this.c = format;
        return format;
    }
}
