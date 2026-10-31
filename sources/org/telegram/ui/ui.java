package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ui extends org.telegram.ui.Components.xn {
    public final /* synthetic */ un M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ui(un unVar, Activity activity, int i10, TLRPC.Document document, org.telegram.ui.ActionBar.p6 p6Var) {
        super(activity, i10, document, p6Var);
        this.M = unVar;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        float y3 = getY();
        un unVar = this.M;
        float y10 = unVar.f1.getY() + y3;
        this.J = unVar.l1.getBackgroundSizeY();
        this.I = y10;
    }
}
