// default package

import java.util.Locale;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class vm3 {
    public final String a;
    public final float b;
    public final boolean c;

    public vm3(String str, float f, boolean z) {
        this.a = str;
        this.b = f;
        this.c = z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(String.format(Locale.US, " %.2f", Float.valueOf(this.b)));
        sb.append(this.c ? " sure" : "");
        return sb.toString();
    }
}
