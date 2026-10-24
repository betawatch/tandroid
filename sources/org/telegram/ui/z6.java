package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class z6 extends v7 {
    public final /* synthetic */ int x;
    public final /* synthetic */ Object y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z6(Object obj, Context context, org.telegram.ui.ActionBar.o2 o2Var, int i10) {
        super(context, o2Var);
        this.x = i10;
        this.y = obj;
    }

    public void e(boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        c7 c7Var = ((a7) this.y).e;
        if (!z10) {
            kVar = ((org.telegram.ui.ActionBar.o2) c7Var).actionBar;
            kVar.r();
        } else {
            c7.b0(c7Var, true);
            kVar2 = ((org.telegram.ui.ActionBar.o2) c7Var).actionBar;
            kVar2.N(null, null);
        }
    }

    @Override // org.telegram.ui.v7, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        switch (this.x) {
            case 0:
                super.onMeasure(i10, org.telegram.messenger.sl.c(12.0f, View.MeasureSpec.getSize(i11) - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((((yu) this.y).h - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight, TLObject.FLAG_30));
                break;
        }
    }
}
