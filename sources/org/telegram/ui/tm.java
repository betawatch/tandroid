package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public abstract class tm extends org.telegram.ui.Components.tl0 implements oh.a7 {
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
