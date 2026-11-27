// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class vk2 {
    public int a;
    public cf0 b;

    public abstract void a(int i);

    public abstract int b();

    public abstract boolean c();

    public abstract void d(int i);

    public abstract int e(int i);

    public abstract boolean f();

    public abstract n51 g();

    public abstract double h();

    public abstract int i();

    public abstract int j();

    public abstract long k();

    public abstract float l();

    public abstract int m();

    public abstract long n();

    public abstract int o();

    public abstract long p();

    public abstract int q();

    public abstract long r();

    public abstract String s();

    public abstract String t();

    public abstract int u();

    public abstract int v();

    public abstract long w();

    public abstract boolean x(int i);

    public final void y() {
        int u;
        do {
            u = u();
            if (u == 0) {
                return;
            }
            int i = this.a;
            if (i >= 100) {
                throw new bs5("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.a = i + 1;
            this.a--;
        } while (x(u));
    }
}
