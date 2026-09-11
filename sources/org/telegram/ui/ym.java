package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
