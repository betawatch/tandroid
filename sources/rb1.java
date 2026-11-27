// default package

import android.graphics.drawable.Drawable;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class rb1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ub1 b;

    public /* synthetic */ rb1(ub1 ub1Var, byte b) {
        this.a = b;
        this.b = ub1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ub1 ub1Var = this.b;
        switch (b) {
            case 0:
                if (ub1Var.o1) {
                    ub1Var.o1 = false;
                    ub1Var.invalidate();
                    break;
                }
                break;
            default:
                Drawable[] drawableArr = PhotoViewer.d9;
                ub1Var.setVisibility(8);
                break;
        }
    }
}
