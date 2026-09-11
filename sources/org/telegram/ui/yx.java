package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class yx extends UndoView {
    public final /* synthetic */ uy f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yx(uy uyVar, Activity activity) {
        super(activity);
        this.f0 = uyVar;
    }

    @Override // org.telegram.ui.Components.UndoView
    public final boolean a() {
        int i10 = 0;
        while (true) {
            ty[] tyVarArr = this.f0.e0;
            if (i10 >= tyVarArr.length) {
                return true;
            }
            if (tyVarArr[i10].x.k()) {
                return false;
            }
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void h(int i10, long j3) {
        if (i10 == 1 || i10 == 27) {
            uy uyVar = this.f0;
            uyVar.y3 = 1;
            uyVar.A4(true, true);
            if (uyVar.R1 != null) {
                int i11 = 0;
                while (true) {
                    if (i11 >= uyVar.R1.size()) {
                        i11 = -1;
                        break;
                    } else if (((TLRPC.Dialog) uyVar.R1.get(i11)).id == j3) {
                        break;
                    } else {
                        i11++;
                    }
                }
                if (i11 >= 0) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) uyVar.R1.remove(i11);
                    uyVar.e0[0].d.l();
                    AndroidUtilities.runOnUIThread(new dm(this, i11, dialog, 26));
                } else {
                    uyVar.A4(false, true);
                }
            }
            uyVar.o3();
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        uy uyVar = this.f0;
        UndoView[] undoViewArr = uyVar.y0;
        if (this == undoViewArr[0]) {
            UndoView undoView = undoViewArr[1];
            if (undoView == null || undoView.getVisibility() != 0) {
                uyVar.u1 = Math.max(0.0f, (AndroidUtilities.dp(8.0f) + getMeasuredHeight()) - f7);
                uyVar.X4();
            }
        }
    }
}
