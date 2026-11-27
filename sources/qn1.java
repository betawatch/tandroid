// default package

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class qn1 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fu5 b;

    public /* synthetic */ qn1(fu5 fu5Var, kc kcVar) {
        this.a = (byte) 1;
        this.b = fu5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        fu5 fu5Var = this.b;
        switch (b) {
            case 0:
                fu5Var.r();
                break;
            case 1:
                if (fu5Var.J) {
                    fu5Var.u();
                    break;
                }
                break;
            case 2:
                Drawable[] drawableArr = PhotoViewer.d9;
                fu5Var.r();
                break;
            default:
                fu5Var.r();
                break;
        }
    }

    public /* synthetic */ qn1(fu5 fu5Var, byte b) {
        this.a = b;
        this.b = fu5Var;
    }
}
