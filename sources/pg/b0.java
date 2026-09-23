package pg;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class b0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d0 b;
    public final /* synthetic */ s0 c;

    public /* synthetic */ b0(d0 d0Var, s0 s0Var, int i10) {
        this.a = i10;
        this.b = d0Var;
        this.c = s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new b0(this.b, this.c, 1));
                break;
            default:
                d0 d0Var = this.b;
                d0Var.getClass();
                d0Var.i = this.c.a;
                break;
        }
    }
}
