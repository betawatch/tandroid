package yf;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class g1 {
    public double a;
    public double b;

    public g1(double d, double d10) {
        this.a = d;
        this.b = d10;
    }

    public final double a(double d, double d10) {
        return Math.sqrt(Math.pow(d10 - this.b, 2.0d) + Math.pow(d - this.a, 2.0d));
    }
}
