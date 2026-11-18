package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class yh extends org.telegram.ui.Components.go {
    public final /* synthetic */ bn N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yh(bn bnVar, Activity activity, int i7, TLRPC.Document document, org.telegram.ui.ActionBar.i6 i6Var) {
        super(activity, i7, document, i6Var);
        this.N = bnVar;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        float y10 = getY();
        bn bnVar = this.N;
        float y11 = bnVar.g1.getY() + y10;
        this.K = bnVar.m1.getBackgroundSizeY();
        this.J = y11;
    }
}
