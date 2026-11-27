// default package

import android.view.ContextThemeWrapper;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class p10 extends kd1 {
    public final /* synthetic */ byte b;
    public final /* synthetic */ fn7 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p10(fn7 fn7Var, ContextThemeWrapper contextThemeWrapper, byte b) {
        super(contextThemeWrapper);
        this.b = b;
        this.c = fn7Var;
    }

    @Override // kd1
    public final void c(boolean z) {
        byte b = this.b;
        fn7 fn7Var = this.c;
        switch (b) {
            case 0:
                j20 j20Var = (j20) fn7Var;
                j20Var.updateColors();
                eh2 eh2Var = j20Var.H1;
                if (eh2Var != null) {
                    eh2Var.a(go.w());
                    break;
                }
                break;
            default:
                PhotoViewer photoViewer = (PhotoViewer) fn7Var;
                b8 b8Var = photoViewer.G0;
                if (b8Var != null) {
                    b8Var.f(z);
                    photoViewer.G0.setSelectorColor(z ? 259241196 : 268435455);
                }
                kfc kfcVar = photoViewer.G2;
                if (kfcVar != null) {
                    kfcVar.s0(go.w() || photoViewer.r);
                }
                eh2 eh2Var2 = photoViewer.x0;
                if (eh2Var2 != null) {
                    eh2Var2.a(go.w());
                    break;
                }
                break;
        }
    }
}
