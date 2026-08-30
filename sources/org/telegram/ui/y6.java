package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class y6 extends u7 {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y6(Object obj, Context context, org.telegram.ui.ActionBar.p2 p2Var, int i10) {
        super(context, p2Var);
        this.w = i10;
        this.x = obj;
    }

    public void e(boolean z4) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        b7 b7Var = ((z6) this.x).e;
        if (!z4) {
            kVar = ((org.telegram.ui.ActionBar.p2) b7Var).actionBar;
            kVar.r();
        } else {
            b7.b0(b7Var, true);
            kVar2 = ((org.telegram.ui.ActionBar.p2) b7Var).actionBar;
            kVar2.O(null, null);
        }
    }

    @Override // org.telegram.ui.u7, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        switch (this.w) {
            case 0:
                super.onMeasure(i10, b.d(12.0f, View.MeasureSpec.getSize(i11) - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((((gv) this.x).h - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight, TLObject.FLAG_30));
                break;
        }
    }
}
