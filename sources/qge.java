// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public enum qge implements sse {
    b(0),
    c(1),
    d(2),
    e(3),
    f(4),
    h(5),
    n(6),
    r(7),
    s(8),
    w(9),
    x(10),
    y(11),
    E(12),
    F(13),
    G(14),
    H(16);

    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    qge(int i) {
        this.a = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + qge.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + ((int) this.a) + " name=" + name() + '>';
    }
}
