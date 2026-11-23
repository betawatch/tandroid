package wi;

import java.util.Arrays;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class j {
    public float a;
    public float[] b;
    public int[] c;
    public boolean d;
    public int[] e;
    public float f;

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.d ? "columns " : "rows ");
        sb2.append(Arrays.toString(this.e));
        sb2.append(" aspect=");
        sb2.append(this.a);
        sb2.append(" cost=");
        sb2.append(this.f);
        sb2.append(" order=");
        sb2.append(Arrays.toString(this.c));
        return sb2.toString();
    }
}
