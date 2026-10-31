package xc;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class e extends f2.f {
    public final StringBuilder c;

    public e() {
        super(4, 1);
        this.c = new StringBuilder();
    }

    @Override // f2.f
    public final f2.f b() {
        f2.f.c(this.c);
        return this;
    }

    @Override // f2.f
    public final String toString() {
        return "<!--" + this.c.toString() + "-->";
    }
}
