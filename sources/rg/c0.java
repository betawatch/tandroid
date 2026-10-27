package rg;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e0 b;
    public final /* synthetic */ r0 c;

    public /* synthetic */ c0(e0 e0Var, r0 r0Var, int i10) {
        this.a = i10;
        this.b = e0Var;
        this.c = r0Var;
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
