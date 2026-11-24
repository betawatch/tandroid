// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class p44 {
    public final double a;
    public final o44 b = new o44(9.0d);
    public final o44 c = new o44(3.0d);
    public final o44 d = new o44(9.0d);

    public p44(double d) {
        this.a = d;
    }

    public final double a() {
        o44 o44Var = this.c;
        return o44Var.c >= 0.001d ? Math.min(o44Var.a(), this.b.a()) : this.a;
    }

    public final double b() {
        o44 o44Var = this.d;
        if (o44Var.c >= 0.001d) {
            return o44Var.a();
        }
        return 100.0d;
    }

    public final void c(long j, double d) {
        if (j <= 0) {
            return;
        }
        double max = (j * 8.0d) / (Math.max(d, 50.0d) / 1000.0d);
        this.c.b(1.0d, max);
        this.b.b(1.0d, max);
    }
}
