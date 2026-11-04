package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class yv extends UndoView {
    public final /* synthetic */ uw k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yv(uw uwVar, Activity activity) {
        super(activity);
        this.k0 = uwVar;
    }

    @Override // org.telegram.ui.Components.UndoView
    public final boolean a() {
        int i3 = 0;
        while (true) {
            tw[] twVarArr = this.k0.f0;
            if (i3 >= twVarArr.length) {
                return true;
            }
            if (twVarArr[i3].y.k()) {
                return false;
            }
            i3++;
        }
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void g(int i3, long j10) {
        if (i3 == 1 || i3 == 27) {
            uw uwVar = this.k0;
            uwVar.M4(true, true);
            if (uwVar.S1 != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= uwVar.S1.size()) {
                        i10 = -1;
                        break;
                    } else if (((TLRPC.Dialog) uwVar.S1.get(i10)).id == j10) {
                        break;
                    } else {
                        i10++;
                    }
                }
                if (i10 >= 0) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) uwVar.S1.remove(i10);
                    uwVar.f0[0].d.f();
                    org.telegram.messenger.g0.h3(new f4(this, i10, dialog, 29));
                } else {
                    uwVar.M4(false, true);
                }
            }
            uwVar.z3();
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        uw uwVar = this.k0;
        UndoView[] undoViewArr = uwVar.z0;
        if (this == undoViewArr[0]) {
            UndoView undoView = undoViewArr[1];
            if (undoView == null || undoView.getVisibility() != 0) {
                uwVar.v1 = Math.max(0.0f, (org.telegram.messenger.g0.L(8.0f) + getMeasuredHeight()) - f10);
                uwVar.k5();
            }
        }
    }
}
