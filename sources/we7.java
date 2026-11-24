// default package

import java.util.Arrays;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class we7 {
    public float a;
    public float[] b;
    public int[] c;
    public boolean d;
    public int[] e;
    public float f;

    public final String toString() {
        return (this.d ? "columns " : "rows ") + Arrays.toString(this.e) + " aspect=" + this.a + " cost=" + this.f + " order=" + Arrays.toString(this.c);
    }
}
