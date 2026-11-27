// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
