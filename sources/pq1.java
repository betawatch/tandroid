// default package

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class pq1 implements i59 {
    public final /* synthetic */ yv1 a;

    public pq1(yv1 yv1Var) {
        this.a = yv1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007b  */
    @Override // i59
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(float f, float f2, int i, View view) {
        boolean z;
        boolean z2;
        a aVar;
        View view2;
        boolean z3;
        yv1 yv1Var = this.a;
        nu1 nu1Var = yv1Var.u9;
        if ((nu1Var == null || !nu1Var.z) && !yv1Var.B7()) {
            z = ((d) yv1Var).inPreviewMode;
            if (!z && !yv1Var.mb) {
                yv1Var.R4 = true;
                if (view instanceof cm1) {
                    cm1 cm1Var = (cm1) view;
                    k47 messageObject = cm1Var.getMessageObject();
                    if (messageObject != null) {
                        if (!(messageObject.k.action instanceof TLRPC.TL_messageActionSetMessagesTTL) && cm1Var.getMessageObject().D != 21 && !cm1Var.getMessageObject().W4() && cm1Var.getMessageObject().D != 30) {
                            z2 = false;
                            aVar = ((d) yv1Var).actionBar;
                            if (!aVar.y() || (yv1Var.c8() && !z2)) {
                                view2 = view;
                                yv1Var.Ra(view2, f, f2, view2 instanceof rc2 ? !((rc2) view2).E2(f) : false);
                                z3 = true;
                            } else {
                                z3 = yv1Var.Y5(view, false, true, f, f2, true, true, false);
                                view2 = view;
                            }
                            if (view2 instanceof rc2) {
                                rc2 rc2Var = (rc2) view2;
                                if (rc2Var.getMessageObject() != null && rc2Var.getMessageObject().D != 27) {
                                    yv1Var.Fc(i);
                                    return true;
                                }
                            }
                            return z3;
                        }
                    }
                }
                z2 = true;
                aVar = ((d) yv1Var).actionBar;
                if (aVar.y()) {
                }
                view2 = view;
                yv1Var.Ra(view2, f, f2, view2 instanceof rc2 ? !((rc2) view2).E2(f) : false);
                z3 = true;
                if (view2 instanceof rc2) {
                }
                return z3;
            }
        }
        return false;
    }

    @Override // i59
    public final void i() {
    }

    @Override // i59
    public final void k(float f) {
    }
}
