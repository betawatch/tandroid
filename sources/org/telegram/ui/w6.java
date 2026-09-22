package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class w6 extends t7 {
    public final /* synthetic */ int F = 1;
    public final /* synthetic */ Object G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w6(kv kvVar, Context context, z6 z6Var) {
        super(context, z6Var, null);
        this.G = kvVar;
    }

    public void f(boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        z6 z6Var = ((x6) this.G).e;
        if (!z10) {
            kVar = ((org.telegram.ui.ActionBar.n2) z6Var).actionBar;
            kVar.r();
            return;
        }
        le.b bVar = z6Var.Q;
        if (bVar != null) {
            bVar.a(true, true);
        }
        kVar2 = ((org.telegram.ui.ActionBar.n2) z6Var).actionBar;
        kVar2.O(null, null);
    }

    @Override // org.telegram.ui.t7, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.F) {
            case 1:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((((kv) this.G).h - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight, TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w6(x6 x6Var, Context context, org.telegram.ui.ActionBar.n2 n2Var, li.i iVar) {
        super(context, n2Var, iVar);
        this.G = x6Var;
    }
}
