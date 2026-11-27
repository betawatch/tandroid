// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
