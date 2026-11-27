// default package

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class qp1 implements u69 {
    public final /* synthetic */ zu1 a;

    public qp1(zu1 zu1Var) {
        this.a = zu1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007b  */
    @Override // u69
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(float f, float f2, int i, View view) {
        boolean z;
        boolean z2;
        a aVar;
        View view2;
        boolean z3;
        zu1 zu1Var = this.a;
        ot1 ot1Var = zu1Var.u9;
        if ((ot1Var == null || !ot1Var.z) && !zu1Var.B7()) {
            z = ((e) zu1Var).inPreviewMode;
            if (!z && !zu1Var.mb) {
                zu1Var.R4 = true;
                if (view instanceof dl1) {
                    dl1 dl1Var = (dl1) view;
                    r47 messageObject = dl1Var.getMessageObject();
                    if (messageObject != null) {
                        if (!(messageObject.k.action instanceof TLRPC.TL_messageActionSetMessagesTTL) && dl1Var.getMessageObject().D != 21 && !dl1Var.getMessageObject().W4() && dl1Var.getMessageObject().D != 30) {
                            z2 = false;
                            aVar = ((e) zu1Var).actionBar;
                            if (!aVar.z() || (zu1Var.c8() && !z2)) {
                                view2 = view;
                                zu1Var.Sa(view2, f, f2, view2 instanceof wb2 ? !((wb2) view2).E2(f) : false);
                                z3 = true;
                            } else {
                                z3 = zu1Var.Y5(view, false, true, f, f2, true, true, false);
                                view2 = view;
                            }
                            if (view2 instanceof wb2) {
                                wb2 wb2Var = (wb2) view2;
                                if (wb2Var.getMessageObject() != null && wb2Var.getMessageObject().D != 27) {
                                    zu1Var.Fc(i);
                                    return true;
                                }
                            }
                            return z3;
                        }
                    }
                }
                z2 = true;
                aVar = ((e) zu1Var).actionBar;
                if (aVar.z()) {
                }
                view2 = view;
                zu1Var.Sa(view2, f, f2, view2 instanceof wb2 ? !((wb2) view2).E2(f) : false);
                z3 = true;
                if (view2 instanceof wb2) {
                }
                return z3;
            }
        }
        return false;
    }

    @Override // u69
    public final void f() {
    }

    @Override // u69
    public final void h(float f) {
    }
}
