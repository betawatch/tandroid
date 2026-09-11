package yh;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final /* synthetic */ class t1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m2 b;
    public final /* synthetic */ int c;

    public /* synthetic */ t1(m2 m2Var, int i10, int i11) {
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
