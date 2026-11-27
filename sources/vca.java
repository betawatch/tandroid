// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class vca {
    public double a;
    public double b;

    public vca(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public final double a(double d, double d2) {
        return Math.sqrt(Math.pow(d2 - this.b, 2.0d) + Math.pow(d - this.a, 2.0d));
    }
}
