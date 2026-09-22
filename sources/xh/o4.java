package xh;

import yh.n7;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final /* synthetic */ class o4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y4 b;

    public /* synthetic */ o4(y4 y4Var, int i10) {
        this.a = i10;
        this.b = y4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.Y(false);
                break;
            case 1:
                this.b.Y(true);
                break;
            case 2:
                y4.U(this.b);
                break;
            case 3:
                v.U(r0.getContext(), r0.c0, this.b.resourcesProvider);
                break;
            case 4:
                new n7(r0.getContext(), this.b.resourcesProvider).show();
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
