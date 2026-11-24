// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public enum see implements eqe {
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
    F(13);

    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    see(int i) {
        this.a = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + see.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + ((int) this.a) + " name=" + name() + '>';
    }
}
