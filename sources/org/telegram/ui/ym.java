package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public abstract class ym extends org.telegram.ui.Components.ll0 implements bi.b9 {
    public final /* synthetic */ co X2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ym(co coVar, Context context, ao aoVar) {
        super(context, aoVar);
        this.X2 = coVar;
    }

    @Override // bi.b9
    public final void a(int[] iArr) {
        co coVar = this.X2;
        iArr[0] = ((int) coVar.s9) - AndroidUtilities.dp(4.0f);
        iArr[1] = org.telegram.messenger.w1.z(3.0f, coVar.x0.getPaddingBottom(), coVar.x0.getMeasuredHeight());
    }
}
