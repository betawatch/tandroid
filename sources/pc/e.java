package pc;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
