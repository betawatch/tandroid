package sg;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class b1 {
    public double a;
    public double b;

    public b1(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public final double a(double d, double d2) {
        return Math.sqrt(Math.pow(d2 - this.b, 2.0d) + Math.pow(d - this.a, 2.0d));
    }
}
