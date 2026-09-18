package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public abstract class vm extends org.telegram.ui.Components.wl0 implements ai.s9 {
    public final /* synthetic */ zn X2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vm(zn znVar, Context context, xn xnVar) {
        super(context, xnVar);
        this.X2 = znVar;
    }

    @Override // ai.s9
    public final void a(int[] iArr) {
        zn znVar = this.X2;
        iArr[0] = ((int) znVar.s9) - AndroidUtilities.dp(4.0f);
        iArr[1] = org.telegram.messenger.q.B(3.0f, znVar.x0.getPaddingBottom(), znVar.x0.getMeasuredHeight());
    }
}
