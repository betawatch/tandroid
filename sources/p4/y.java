package p4;

import org.telegram.messenger.bf;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
                bf bfVar = e0Var.u;
                if (bfVar != null) {
                    e0Var.t.h0(bfVar);
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
