package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class xx extends UndoView {
    public final /* synthetic */ ty f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xx(ty tyVar, Activity activity) {
        super(activity);
        this.f0 = tyVar;
    }

    @Override // org.telegram.ui.Components.UndoView
    public final boolean a() {
        int i10 = 0;
        while (true) {
            sy[] syVarArr = this.f0.e0;
            if (i10 >= syVarArr.length) {
                return true;
            }
            if (syVarArr[i10].x.k()) {
                return false;
            }
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void h(int i10, long j3) {
        if (i10 == 1 || i10 == 27) {
            ty tyVar = this.f0;
            tyVar.y3 = 1;
            tyVar.x4(true, true);
            if (tyVar.R1 != null) {
                int i11 = 0;
                while (true) {
                    if (i11 >= tyVar.R1.size()) {
                        i11 = -1;
                        break;
                    } else if (((TLRPC.Dialog) tyVar.R1.get(i11)).id == j3) {
                        break;
                    } else {
                        i11++;
                    }
                }
                if (i11 >= 0) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) tyVar.R1.remove(i11);
                    tyVar.e0[0].d.l();
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.zk(this, i11, dialog, 26));
                } else {
                    tyVar.x4(false, true);
                }
            }
            tyVar.l3();
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        ty tyVar = this.f0;
        UndoView[] undoViewArr = tyVar.y0;
        if (this == undoViewArr[0]) {
            UndoView undoView = undoViewArr[1];
            if (undoView == null || undoView.getVisibility() != 0) {
                tyVar.u1 = Math.max(0.0f, (AndroidUtilities.dp(8.0f) + getMeasuredHeight()) - f7);
                tyVar.U4();
            }
        }
    }
}
