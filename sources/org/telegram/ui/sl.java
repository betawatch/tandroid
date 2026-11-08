package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public abstract class sl extends org.telegram.ui.Components.pj0 implements di.f7 {
    public final /* synthetic */ an e3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sl(an anVar, Context context, ym ymVar) {
        super(context, ymVar);
        this.e3 = anVar;
    }

    @Override // di.f7
    public final void a(int[] iArr) {
        an anVar = this.e3;
        iArr[0] = ((int) anVar.L9) - org.telegram.messenger.g0.L(4.0f);
        iArr[1] = org.telegram.messenger.k5.B(3.0f, anVar.z0.getPaddingBottom(), anVar.z0.getMeasuredHeight());
    }
}
