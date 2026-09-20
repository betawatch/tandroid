package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public abstract class vm extends org.telegram.ui.Components.vl0 implements ai.s9 {
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
        iArr[1] = org.telegram.messenger.l0.A(3.0f, znVar.x0.getPaddingBottom(), znVar.x0.getMeasuredHeight());
    }
}
