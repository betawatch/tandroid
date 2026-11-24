// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class qa {
    public final String a;
    public final int b;
    public transient String c;

    public qa(String str, int i) {
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
