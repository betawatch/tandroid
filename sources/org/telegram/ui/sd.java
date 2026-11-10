package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class sd extends org.telegram.ui.Components.rj0 {
    public final /* synthetic */ vd c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sd(vd vdVar, Context context, org.telegram.ui.ActionBar.h6 h6Var, zd zdVar) {
        super(context, h6Var, zdVar);
        this.c0 = vdVar;
    }

    @Override // org.telegram.ui.Components.v61, android.view.View
    public final boolean canScrollHorizontally(int i7) {
        return this.c0.x.Q0 && super.canScrollHorizontally(i7);
    }
}
