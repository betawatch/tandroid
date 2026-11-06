package ti;

import java.util.Arrays;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes4.dex */
public final class k {
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
