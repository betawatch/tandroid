package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ux extends UndoView {
    public final /* synthetic */ qy c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ux(qy qyVar, Activity activity) {
        super(activity);
        this.c0 = qyVar;
    }

    @Override // org.telegram.ui.Components.UndoView
    public final boolean a() {
        int i10 = 0;
        while (true) {
            py[] pyVarArr = this.c0.b0;
            if (i10 >= pyVarArr.length) {
                return true;
            }
            if (pyVarArr[i10].x.k()) {
                return false;
            }
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void h(int i10, long j10) {
        if (i10 == 1 || i10 == 27) {
            qy qyVar = this.c0;
            qyVar.v3 = 1;
            qyVar.A4(true, true);
            if (qyVar.O1 != null) {
                int i11 = 0;
                while (true) {
                    if (i11 >= qyVar.O1.size()) {
                        i11 = -1;
                        break;
                    } else if (((TLRPC.Dialog) qyVar.O1.get(i11)).id == j10) {
                        break;
                    } else {
                        i11++;
                    }
                }
                if (i11 >= 0) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) qyVar.O1.remove(i11);
                    qyVar.b0[0].d.l();
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ey(this, i11, dialog, 23));
                } else {
                    qyVar.A4(false, true);
                }
            }
            qyVar.o3();
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        qy qyVar = this.c0;
        UndoView[] undoViewArr = qyVar.v0;
        if (this == undoViewArr[0]) {
            UndoView undoView = undoViewArr[1];
            if (undoView == null || undoView.getVisibility() != 0) {
                qyVar.r1 = Math.max(0.0f, (AndroidUtilities.dp(8.0f) + getMeasuredHeight()) - f10);
                qyVar.X4();
            }
        }
    }
}
