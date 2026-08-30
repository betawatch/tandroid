package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class sx extends UndoView {
    public final /* synthetic */ oy c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sx(oy oyVar, Activity activity) {
        super(activity);
        this.c0 = oyVar;
    }

    @Override // org.telegram.ui.Components.UndoView
    public final boolean a() {
        int i10 = 0;
        while (true) {
            ny[] nyVarArr = this.c0.b0;
            if (i10 >= nyVarArr.length) {
                return true;
            }
            if (nyVarArr[i10].x.k()) {
                return false;
            }
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void h(int i10, long j10) {
        if (i10 == 1 || i10 == 27) {
            oy oyVar = this.c0;
            oyVar.v3 = 1;
            oyVar.A4(true, true);
            if (oyVar.O1 != null) {
                int i11 = 0;
                while (true) {
                    if (i11 >= oyVar.O1.size()) {
                        i11 = -1;
                        break;
                    } else if (((TLRPC.Dialog) oyVar.O1.get(i11)).id == j10) {
                        break;
                    } else {
                        i11++;
                    }
                }
                if (i11 >= 0) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) oyVar.O1.remove(i11);
                    oyVar.b0[0].d.l();
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ey(this, i11, dialog, 23));
                } else {
                    oyVar.A4(false, true);
                }
            }
            oyVar.o3();
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        oy oyVar = this.c0;
        UndoView[] undoViewArr = oyVar.v0;
        if (this == undoViewArr[0]) {
            UndoView undoView = undoViewArr[1];
            if (undoView == null || undoView.getVisibility() != 0) {
                oyVar.r1 = Math.max(0.0f, (AndroidUtilities.dp(8.0f) + getMeasuredHeight()) - f10);
                oyVar.X4();
            }
        }
    }
}
