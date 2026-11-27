// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class rtb extends iu5 {
    public final StringBuilder e;

    public rtb() {
        super(4, (byte) 2);
        this.e = new StringBuilder();
    }

    @Override // iu5
    public final iu5 s() {
        iu5.t(this.e);
        return this;
    }

    @Override // iu5
    public final String toString() {
        return "<!--" + this.e.toString() + "-->";
    }
}
