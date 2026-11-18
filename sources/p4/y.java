package p4;

import org.telegram.messenger.bf;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
                bf bfVar = d0Var.u;
                if (bfVar != null) {
                    d0Var.t.h0(bfVar);
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
