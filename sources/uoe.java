// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public enum uoe {
    b(0),
    c(1),
    d(2),
    e(3);

    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    uoe(int i) {
        this.a = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.a);
    }
}
