package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public abstract class tm extends org.telegram.ui.Components.sl0 implements oh.a7 {
    public final /* synthetic */ xn U2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tm(xn xnVar, Context context, vn vnVar) {
        super(context, vnVar);
        this.U2 = xnVar;
    }

    @Override // oh.a7
    public final void a(int[] iArr) {
        xn xnVar = this.U2;
        iArr[0] = ((int) xnVar.p9) - AndroidUtilities.dp(4.0f);
        iArr[1] = org.telegram.messenger.y3.z(3.0f, xnVar.u0.getPaddingBottom(), xnVar.u0.getMeasuredHeight());
    }
}
