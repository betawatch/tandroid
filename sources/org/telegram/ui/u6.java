package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class u6 extends q7 {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u6(Object obj, Context context, org.telegram.ui.ActionBar.o2 o2Var, int i10) {
        super(context, o2Var);
        this.w = i10;
        this.x = obj;
    }

    public void e(boolean z10) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        x6 x6Var = ((v6) this.x).e;
        if (!z10) {
            lVar = ((org.telegram.ui.ActionBar.o2) x6Var).actionBar;
            lVar.r();
        } else {
            x6.b0(x6Var, true);
            lVar2 = ((org.telegram.ui.ActionBar.o2) x6Var).actionBar;
            lVar2.O(null, null);
        }
    }

    @Override // org.telegram.ui.q7, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        switch (this.w) {
            case 0:
                super.onMeasure(i10, b.d(12.0f, View.MeasureSpec.getSize(i11) - (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / 2), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((((yu) this.x).h - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight, TLObject.FLAG_30));
                break;
        }
    }
}
