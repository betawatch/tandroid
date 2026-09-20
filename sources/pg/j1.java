package pg;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class j1 {
    public double a;
    public double b;

    public j1(double d, double d10) {
        this.a = d;
        this.b = d10;
    }

    public final double a(double d, double d10) {
        return Math.sqrt(Math.pow(d10 - this.b, 2.0d) + Math.pow(d - this.a, 2.0d));
    }
}
