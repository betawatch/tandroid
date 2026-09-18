package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class x6 extends u7 {
    public final /* synthetic */ int F = 1;
    public final /* synthetic */ Object G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x6(lv lvVar, Context context, a7 a7Var) {
        super(context, a7Var, null);
        this.G = lvVar;
    }

    public void f(boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        a7 a7Var = ((y6) this.G).e;
        if (!z10) {
            kVar = ((org.telegram.ui.ActionBar.o2) a7Var).actionBar;
            kVar.r();
            return;
        }
        le.b bVar = a7Var.Q;
        if (bVar != null) {
            bVar.a(true, true);
        }
        kVar2 = ((org.telegram.ui.ActionBar.o2) a7Var).actionBar;
        kVar2.O(null, null);
    }

    @Override // org.telegram.ui.u7, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.F) {
            case 1:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((((lv) this.G).h - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight, TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x6(y6 y6Var, Context context, org.telegram.ui.ActionBar.o2 o2Var, ki.i iVar) {
        super(context, o2Var, iVar);
        this.G = y6Var;
    }
}
