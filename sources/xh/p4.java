package xh;

import yh.m7;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
                this.b.Y(false);
                break;
            case 1:
                this.b.Y(true);
                break;
            case 2:
                z4.U(this.b);
                break;
            case 3:
                v.U(r0.getContext(), r0.c0, this.b.resourcesProvider);
                break;
            case 4:
                new m7(r0.getContext(), this.b.resourcesProvider).show();
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
