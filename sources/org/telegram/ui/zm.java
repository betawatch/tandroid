package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public abstract class zm extends org.telegram.ui.Components.vl0 implements zh.q5 {
    public final /* synthetic */ eo X2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zm(eo eoVar, Context context, bo boVar) {
        super(context, boVar);
        this.X2 = eoVar;
    }

    @Override // zh.q5
    public final void a(int[] iArr) {
        eo eoVar = this.X2;
        iArr[0] = ((int) eoVar.s9) - AndroidUtilities.dp(4.0f);
        iArr[1] = org.telegram.messenger.a2.z(3.0f, eoVar.x0.getPaddingBottom(), eoVar.x0.getMeasuredHeight());
    }
}
