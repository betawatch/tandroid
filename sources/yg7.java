// default package

import java.util.Arrays;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class yg7 {
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
