package xh;

import yh.p7;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final /* synthetic */ class p4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z4 b;

    public /* synthetic */ p4(z4 z4Var, int i10) {
        this.a = i10;
        this.b = z4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.X(false);
                break;
            case 1:
                this.b.X(true);
                break;
            case 2:
                z4.S(this.b);
                break;
            case 3:
                v.S(r0.getContext(), r0.c0, this.b.resourcesProvider);
                break;
            case 4:
                new p7(r0.getContext(), this.b.resourcesProvider).show();
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
