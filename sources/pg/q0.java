package pg;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class q0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s0 b;
    public final /* synthetic */ a5.a c;

    public /* synthetic */ q0(s0 s0Var, a5.a aVar, int i10) {
        this.a = i10;
        this.b = s0Var;
        this.c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.p(this.c, true);
                break;
            default:
                s0 s0Var = this.b;
                s0Var.f.f(new q0(s0Var, this.c, 0));
                break;
        }
    }
}
