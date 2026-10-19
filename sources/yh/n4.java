package yh;

import ai.dd;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final /* synthetic */ class n4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x4 b;

    public /* synthetic */ n4(x4 x4Var, int i10) {
        this.a = i10;
        this.b = x4Var;
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
                x4.V(this.b);
                break;
            case 3:
                v.V(r0.getContext(), r0.c0, this.b.resourcesProvider);
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
