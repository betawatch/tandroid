// default package

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class vi3 extends UndoView {
    public final /* synthetic */ uj3 k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vi3(uj3 uj3Var, Activity activity) {
        super(activity);
        this.k0 = uj3Var;
    }

    @Override // org.telegram.ui.Components.UndoView
    public final boolean a() {
        int i = 0;
        while (true) {
            tj3[] tj3VarArr = this.k0.f0;
            if (i >= tj3VarArr.length) {
                return true;
            }
            if (tj3VarArr[i].y.k()) {
                return false;
            }
            i++;
        }
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void g(int i, long j) {
        if (i == 1 || i == 27) {
            uj3 uj3Var = this.k0;
            uj3Var.U4(true, true);
            if (uj3Var.T1 != null) {
                int i2 = 0;
                while (true) {
                    if (i2 >= uj3Var.T1.size()) {
                        i2 = -1;
                        break;
                    } else if (((TLRPC.Dialog) uj3Var.T1.get(i2)).id == j) {
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i2 >= 0) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) uj3Var.T1.remove(i2);
                    uj3Var.f0[0].d.f();
                    hl.c3(new ze7(this, i2, dialog, (byte) 18));
                } else {
                    uj3Var.U4(false, true);
                }
            }
            uj3Var.I2();
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        super.setTranslationY(f);
        uj3 uj3Var = this.k0;
        UndoView[] undoViewArr = uj3Var.z0;
        if (this == undoViewArr[0]) {
            UndoView undoView = undoViewArr[1];
            if (undoView == null || undoView.getVisibility() != 0) {
                uj3Var.w1 = Math.max(0.0f, (hl.L(8.0f) + getMeasuredHeight()) - f);
                uj3Var.u5();
            }
        }
    }
}
