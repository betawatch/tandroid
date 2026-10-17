package yh;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m2 b;
    public final /* synthetic */ int c;

    public /* synthetic */ s1(m2 m2Var, int i10, int i11) {
        this.a = i11;
        this.b = m2Var;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.f.scrollBy(0, this.c);
                break;
            default:
                h2 h2Var = this.b.f;
                if (h2Var != null) {
                    h2Var.setSpanCount(this.c);
                    break;
                }
                break;
        }
    }
}
