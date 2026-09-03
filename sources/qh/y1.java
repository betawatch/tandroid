package qh;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c2 b;
    public final /* synthetic */ org.telegram.ui.web.d1 c;

    public /* synthetic */ y1(c2 c2Var, org.telegram.ui.web.d1 d1Var, int i10) {
        this.a = i10;
        this.b = c2Var;
        this.c = d1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                c2 c2Var = this.b;
                c2Var.getClass();
                AndroidUtilities.runOnUIThread(new y1(c2Var, this.c, 1), 320L);
                break;
            default:
                c2 c2Var2 = this.b;
                c2Var2.getClass();
                this.c.run(new org.telegram.ui.web.d1(c2Var2, 6));
                break;
        }
    }
}
