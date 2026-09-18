package xh;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
