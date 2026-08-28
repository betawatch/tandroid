package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class v6 extends r7 {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v6(Object obj, Context context, org.telegram.ui.ActionBar.o2 o2Var, int i9) {
        super(context, o2Var);
        this.w = i9;
        this.x = obj;
    }

    public void e(boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        y6 y6Var = ((w6) this.x).e;
        if (!z10) {
            kVar = ((org.telegram.ui.ActionBar.o2) y6Var).actionBar;
            kVar.r();
        } else {
            y6.a0(y6Var, true);
            kVar2 = ((org.telegram.ui.ActionBar.o2) y6Var).actionBar;
            kVar2.N(null, null);
        }
    }

    @Override // org.telegram.ui.r7, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        switch (this.w) {
            case 0:
                super.onMeasure(i9, org.telegram.messenger.ll.d(12.0f, View.MeasureSpec.getSize(i10) - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec((((xu) this.x).h - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight, TLObject.FLAG_30));
                break;
        }
    }
}
