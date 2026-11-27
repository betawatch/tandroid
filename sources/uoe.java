// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
