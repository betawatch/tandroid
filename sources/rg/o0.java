package rg;

import a8.ng;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q0 b;
    public final /* synthetic */ ng c;

    public /* synthetic */ o0(q0 q0Var, ng ngVar, int i10) {
        this.a = i10;
        this.b = q0Var;
        this.c = ngVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.p(this.c, true);
                break;
            default:
                q0 q0Var = this.b;
                q0Var.f.f(new o0(q0Var, this.c, 0));
                break;
        }
    }
}
