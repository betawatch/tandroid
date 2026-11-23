package p4;

import org.telegram.messenger.cf;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class y implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e0 b;

    public /* synthetic */ y(e0 e0Var, int i7) {
        this.a = i7;
        this.b = e0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                e0 e0Var = this.b;
                cf cfVar = e0Var.u;
                if (cfVar != null) {
                    e0Var.t.h0(cfVar);
                    break;
                }
                break;
            case 1:
                this.b.getClass();
                break;
            case 2:
                e0.a(this.b);
                break;
            default:
                this.b.t();
                break;
        }
    }
}
