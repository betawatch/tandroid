package qg;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class c0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e0 b;
    public final /* synthetic */ u0 c;

    public /* synthetic */ c0(e0 e0Var, u0 u0Var, int i10) {
        this.a = i10;
        this.b = e0Var;
        this.c = u0Var;
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
