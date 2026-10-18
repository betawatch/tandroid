package yh;

import ai.dd;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
                this.b.Z(false);
                break;
            case 1:
                this.b.Z(true);
                break;
            case 2:
                y4.V(this.b);
                break;
            case 3:
                w.V(r0.getContext(), r0.c0, this.b.resourcesProvider);
                break;
            case 4:
                new dd(r0.getContext(), this.b.resourcesProvider).show();
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
