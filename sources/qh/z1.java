package qh;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d2 b;
    public final /* synthetic */ org.telegram.ui.web.d1 c;

    public /* synthetic */ z1(d2 d2Var, org.telegram.ui.web.d1 d1Var, int i10) {
        this.a = i10;
        this.b = d2Var;
        this.c = d1Var;
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
                this.c.run(new org.telegram.ui.web.d1(d2Var2, 6));
                break;
        }
    }
}
