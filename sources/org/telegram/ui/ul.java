package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public abstract class ul extends org.telegram.ui.Components.pj0 implements di.g7 {
    public final /* synthetic */ cn e3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ul(cn cnVar, Context context, an anVar) {
        super(context, anVar);
        this.e3 = cnVar;
    }

    @Override // di.g7
    public final void a(int[] iArr) {
        cn cnVar = this.e3;
        iArr[0] = ((int) cnVar.N9) - org.telegram.messenger.g0.L(4.0f);
        iArr[1] = org.telegram.messenger.k5.B(3.0f, cnVar.z0.getPaddingBottom(), cnVar.z0.getMeasuredHeight());
    }
}
