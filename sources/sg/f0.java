package sg;

import a8.xa;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class f0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h0 b;
    public final /* synthetic */ xa c;

    public /* synthetic */ f0(h0 h0Var, xa xaVar, int i7) {
        this.a = i7;
        this.b = h0Var;
        this.c = xaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.p(this.c, true);
                break;
            default:
                h0 h0Var = this.b;
                h0Var.f.f(new f0(h0Var, this.c, 0));
                break;
        }
    }
}
