package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class qk extends wg.e {
    public final /* synthetic */ zn I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qk(zn znVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, hj hjVar, ng.a aVar) {
        super(context, aVar, f6Var, hjVar);
        this.I = znVar;
    }

    @Override // wg.e, android.view.View
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        this.I.yc.h(3, i10 == 0, getMeasuredWidth() > 0);
    }
}
