package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class tx extends UndoView {
    public final /* synthetic */ py c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tx(py pyVar, Activity activity) {
        super(activity);
        this.c0 = pyVar;
    }

    @Override // org.telegram.ui.Components.UndoView
    public final boolean a() {
        int i10 = 0;
        while (true) {
            oy[] oyVarArr = this.c0.b0;
            if (i10 >= oyVarArr.length) {
                return true;
            }
            if (oyVarArr[i10].x.k()) {
                return false;
            }
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void h(int i10, long j10) {
        if (i10 == 1 || i10 == 27) {
            py pyVar = this.c0;
            pyVar.v3 = 1;
            pyVar.A4(true, true);
            if (pyVar.O1 != null) {
                int i11 = 0;
                while (true) {
                    if (i11 >= pyVar.O1.size()) {
                        i11 = -1;
                        break;
                    } else if (((TLRPC.Dialog) pyVar.O1.get(i11)).id == j10) {
                        break;
                    } else {
                        i11++;
                    }
                }
                if (i11 >= 0) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) pyVar.O1.remove(i11);
                    pyVar.b0[0].d.l();
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.gy(this, i11, dialog, 23));
                } else {
                    pyVar.A4(false, true);
                }
            }
            pyVar.o3();
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        py pyVar = this.c0;
        UndoView[] undoViewArr = pyVar.v0;
        if (this == undoViewArr[0]) {
            UndoView undoView = undoViewArr[1];
            if (undoView == null || undoView.getVisibility() != 0) {
                pyVar.r1 = Math.max(0.0f, (AndroidUtilities.dp(8.0f) + getMeasuredHeight()) - f10);
                pyVar.X4();
            }
        }
    }
}
