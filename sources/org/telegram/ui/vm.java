package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public abstract class vm extends org.telegram.ui.Components.rl0 implements nh.a7 {
    public final /* synthetic */ zn U2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vm(zn znVar, Context context, xn xnVar) {
        super(context, xnVar);
        this.U2 = znVar;
    }

    @Override // nh.a7
    public final void a(int[] iArr) {
        zn znVar = this.U2;
        iArr[0] = ((int) znVar.p9) - AndroidUtilities.dp(4.0f);
        iArr[1] = org.telegram.messenger.y3.z(3.0f, znVar.u0.getPaddingBottom(), znVar.u0.getMeasuredHeight());
    }
}
