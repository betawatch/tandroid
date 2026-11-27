// default package

import android.view.View;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class qv3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ tv3 c;

    public qv3(tv3 tv3Var, int i, int i2) {
        this.c = tv3Var;
        this.a = i;
        this.b = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wb2 wb2Var;
        zu1 zu1Var;
        tv3 tv3Var = this.c;
        wq1 wq1Var = tv3Var.I;
        if (tv3Var.n) {
            int i = 0;
            while (true) {
                if (i >= wq1Var.getChildCount()) {
                    wb2Var = null;
                    break;
                }
                View childAt = wq1Var.getChildAt(i);
                if (childAt instanceof wb2) {
                    wb2Var = (wb2) childAt;
                    String V1 = wb2Var.getMessageObject().V1();
                    if (V1 == null) {
                        V1 = wb2Var.getMessageObject().k.message;
                    }
                    if (wb2Var.getPhotoImage().E() && V1 != null && wb2Var.getMessageObject().e1() == this.a) {
                        break;
                    }
                }
                i++;
            }
            if (wb2Var == null || (zu1Var = tv3Var.a) == null) {
                return;
            }
            zu1Var.ib(wb2Var);
            String V12 = wb2Var.getMessageObject().V1();
            if (!jx3.a(V12) && !"🍑".equals(V12) && !"⚰".equals(V12) && !wb2Var.getMessageObject().V3() && !wb2Var.getMessageObject().F2()) {
                try {
                    wb2Var.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
            tv3Var.n(wb2Var, this.b, false, true);
        }
    }
}
