package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class tk extends ih.e {
    public final /* synthetic */ eo L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tk(eo eoVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, lj ljVar, zg.a aVar) {
        super(context, ljVar, f6Var, aVar);
        this.L = eoVar;
    }

    @Override // ih.e, android.view.View
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        this.L.Bc.j(3, i10 == 0, getMeasuredWidth() > 0);
    }
}
