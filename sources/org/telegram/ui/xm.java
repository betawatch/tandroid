package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public abstract class xm extends org.telegram.ui.Components.ml0 implements ai.s9 {
    public final /* synthetic */ bo X2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xm(bo boVar, Context context, zn znVar) {
        super(context, znVar);
        this.X2 = boVar;
    }

    @Override // ai.s9
    public final void a(int[] iArr) {
        bo boVar = this.X2;
        iArr[0] = ((int) boVar.s9) - AndroidUtilities.dp(4.0f);
        iArr[1] = org.telegram.messenger.w1.z(3.0f, boVar.x0.getPaddingBottom(), boVar.x0.getMeasuredHeight());
    }
}
