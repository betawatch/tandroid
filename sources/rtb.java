// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
