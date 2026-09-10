package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class v6 extends r7 {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v6(Object obj, Context context, org.telegram.ui.ActionBar.p2 p2Var, int i10) {
        super(context, p2Var);
        this.w = i10;
        this.x = obj;
    }

    public void e(boolean z10) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        y6 y6Var = ((w6) this.x).e;
        if (!z10) {
            lVar = ((org.telegram.ui.ActionBar.p2) y6Var).actionBar;
            lVar.r();
        } else {
            y6.b0(y6Var, true);
            lVar2 = ((org.telegram.ui.ActionBar.p2) y6Var).actionBar;
            lVar2.O(null, null);
        }
    }

    @Override // org.telegram.ui.r7, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        switch (this.w) {
            case 0:
                super.onMeasure(i10, org.telegram.messenger.em.d(12.0f, View.MeasureSpec.getSize(i11) - (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / 2), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((((lv) this.x).h - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight, TLObject.FLAG_30));
                break;
        }
    }
}
