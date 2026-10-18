package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class z6 extends v7 {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z6(Object obj, Context context, org.telegram.ui.ActionBar.n2 n2Var, int i10) {
        super(context, n2Var);
        this.w = i10;
        this.x = obj;
    }

    public void e(boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        c7 c7Var = ((a7) this.x).e;
        if (!z10) {
            kVar = ((org.telegram.ui.ActionBar.n2) c7Var).actionBar;
            kVar.r();
        } else {
            c7.b0(c7Var, true);
            kVar2 = ((org.telegram.ui.ActionBar.n2) c7Var).actionBar;
            kVar2.O(null, null);
        }
    }

    @Override // org.telegram.ui.v7, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        switch (this.w) {
            case 0:
                super.onMeasure(i10, org.telegram.messenger.lk.c(12.0f, View.MeasureSpec.getSize(i11) - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((((xu) this.x).h - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight, TLObject.FLAG_30));
                break;
        }
    }
}
