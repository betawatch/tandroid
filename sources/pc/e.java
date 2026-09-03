package pc;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class e extends n3.a {
    public final StringBuilder c;

    public e() {
        super(4, 1);
        this.c = new StringBuilder();
    }

    @Override // n3.a
    public final n3.a g() {
        n3.a.i(this.c);
        return this;
    }

    @Override // n3.a
    public final String toString() {
        return "<!--" + this.c.toString() + "-->";
    }
}
