package pc;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class e extends n3.a {
    public final StringBuilder c;

    public e() {
        super(4, 1);
        this.c = new StringBuilder();
    }

    @Override // n3.a
    public final n3.a h() {
        n3.a.i(this.c);
        return this;
    }

    @Override // n3.a
    public final String toString() {
        return "<!--" + this.c.toString() + "-->";
    }
}
