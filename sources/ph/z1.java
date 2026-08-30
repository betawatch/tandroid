package ph;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d2 b;
    public final /* synthetic */ org.telegram.ui.web.y0 c;

    public /* synthetic */ z1(d2 d2Var, org.telegram.ui.web.y0 y0Var, int i10) {
        this.a = i10;
        this.b = d2Var;
        this.c = y0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                d2 d2Var = this.b;
                d2Var.getClass();
                AndroidUtilities.runOnUIThread(new z1(d2Var, this.c, 1), 320L);
                break;
            default:
                d2 d2Var2 = this.b;
                d2Var2.getClass();
                this.c.run(new org.telegram.ui.web.y0(d2Var2, 6));
                break;
        }
    }
}
