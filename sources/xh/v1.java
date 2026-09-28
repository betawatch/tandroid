package xh;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
