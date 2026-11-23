package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public abstract class tl extends org.telegram.ui.Components.ek0 implements fi.w6 {
    public final /* synthetic */ bn f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tl(bn bnVar, Context context, zm zmVar) {
        super(context, zmVar);
        this.f3 = bnVar;
    }

    @Override // fi.w6
    public final void a(int[] iArr) {
        bn bnVar = this.f3;
        iArr[0] = ((int) bnVar.P9) - org.telegram.messenger.g0.L(4.0f);
        iArr[1] = org.telegram.messenger.f3.B(3.0f, bnVar.A0.getPaddingBottom(), bnVar.A0.getMeasuredHeight());
    }
}
