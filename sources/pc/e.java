package pc;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class e extends n3.a {
    public final StringBuilder c;

    public e() {
        super(4, 1);
        this.c = new StringBuilder();
    }

    @Override // n3.a
    public final n3.a g() {
        n3.a.h(this.c);
        return this;
    }

    @Override // n3.a
    public final String toString() {
        return "<!--" + this.c.toString() + "-->";
    }
}
