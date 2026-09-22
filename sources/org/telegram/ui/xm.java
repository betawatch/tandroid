package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public abstract class xm extends org.telegram.ui.Components.ll0 implements ai.s9 {
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
        iArr[1] = org.telegram.messenger.y0.z(3.0f, boVar.x0.getPaddingBottom(), boVar.x0.getMeasuredHeight());
    }
}
