package qg;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e0 b;
    public final /* synthetic */ t0 c;

    public /* synthetic */ c0(e0 e0Var, t0 t0Var, int i10) {
        this.a = i10;
        this.b = e0Var;
        this.c = t0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new c0(this.b, this.c, 1));
                break;
            default:
                e0 e0Var = this.b;
                e0Var.getClass();
                e0Var.i = this.c.a;
                break;
        }
    }
}
