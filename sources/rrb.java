// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class rrb extends eu5 {
    public final StringBuilder e;

    public rrb() {
        super(4, (byte) 2);
        this.e = new StringBuilder();
    }

    @Override // eu5
    public final eu5 s() {
        eu5.t(this.e);
        return this;
    }

    @Override // eu5
    public final String toString() {
        return "<!--" + this.e.toString() + "-->";
    }
}
