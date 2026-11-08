package p4;

import org.telegram.messenger.df;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final /* synthetic */ class y implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d0 b;

    public /* synthetic */ y(d0 d0Var, int i7) {
        this.a = i7;
        this.b = d0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                d0 d0Var = this.b;
                df dfVar = d0Var.u;
                if (dfVar != null) {
                    d0Var.t.h0(dfVar);
                    break;
                }
                break;
            case 1:
                this.b.getClass();
                break;
            case 2:
                d0.a(this.b);
                break;
            default:
                this.b.t();
                break;
        }
    }
}
