package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public abstract class ul extends org.telegram.ui.Components.qj0 implements di.g7 {
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
