package p4;

import org.telegram.messenger.df;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
