package tg;

import b8.kg;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i0 b;
    public final /* synthetic */ kg c;

    public /* synthetic */ g0(i0 i0Var, kg kgVar, int i3) {
        this.a = i3;
        this.b = i0Var;
        this.c = kgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.p(this.c, true);
                break;
            default:
                i0 i0Var = this.b;
                i0Var.f.f(new g0(i0Var, this.c, 0));
                break;
        }
    }
}
