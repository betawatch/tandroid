package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class vx extends UndoView {
    public final /* synthetic */ ry f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vx(ry ryVar, Activity activity) {
        super(activity);
        this.f0 = ryVar;
    }

    @Override // org.telegram.ui.Components.UndoView
    public final boolean a() {
        int i10 = 0;
        while (true) {
            qy[] qyVarArr = this.f0.e0;
            if (i10 >= qyVarArr.length) {
                return true;
            }
            if (qyVarArr[i10].x.k()) {
                return false;
            }
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void h(int i10, long j3) {
        if (i10 == 1 || i10 == 27) {
            ry ryVar = this.f0;
            ryVar.y3 = 1;
            ryVar.A4(true, true);
            if (ryVar.R1 != null) {
                int i11 = 0;
                while (true) {
                    if (i11 >= ryVar.R1.size()) {
                        i11 = -1;
                        break;
                    } else if (((TLRPC.Dialog) ryVar.R1.get(i11)).id == j3) {
                        break;
                    } else {
                        i11++;
                    }
                }
                if (i11 >= 0) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) ryVar.R1.remove(i11);
                    ryVar.e0[0].d.l();
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.xm(this, i11, dialog, 25));
                } else {
                    ryVar.A4(false, true);
                }
            }
            ryVar.o3();
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        ry ryVar = this.f0;
        UndoView[] undoViewArr = ryVar.y0;
        if (this == undoViewArr[0]) {
            UndoView undoView = undoViewArr[1];
            if (undoView == null || undoView.getVisibility() != 0) {
                ryVar.u1 = Math.max(0.0f, (AndroidUtilities.dp(8.0f) + getMeasuredHeight()) - f7);
                ryVar.X4();
            }
        }
    }
}
