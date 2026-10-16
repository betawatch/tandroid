package qg;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class h1 {
    public double a;
    public double b;

    public h1(double d, double d10) {
        this.a = d;
        this.b = d10;
    }

    public final double a(double d, double d10) {
        return Math.sqrt(Math.pow(d10 - this.b, 2.0d) + Math.pow(d - this.a, 2.0d));
    }
}
