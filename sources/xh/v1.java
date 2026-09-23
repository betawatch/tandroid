package xh;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final /* synthetic */ class v1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o2 b;
    public final /* synthetic */ int c;

    public /* synthetic */ v1(o2 o2Var, int i10, int i11) {
        this.a = i11;
        this.b = o2Var;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.f.scrollBy(0, this.c);
                break;
            default:
                j2 j2Var = this.b.f;
                if (j2Var != null) {
                    j2Var.setSpanCount(this.c);
                    break;
                }
                break;
        }
    }
}
