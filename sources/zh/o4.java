package zh;

import bi.uc;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
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
                new uc(r0.getContext(), this.b.resourcesProvider).show();
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
