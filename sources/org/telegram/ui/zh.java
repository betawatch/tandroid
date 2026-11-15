package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class zh extends org.telegram.ui.Components.xn {
    public final /* synthetic */ an N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zh(an anVar, Activity activity, int i7, TLRPC.Document document, org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity, i7, document, e6Var);
        this.N = anVar;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        float y10 = getY();
        an anVar = this.N;
        float y11 = anVar.g1.getY() + y10;
        this.K = anVar.m1.getBackgroundSizeY();
        this.J = y11;
    }
}
