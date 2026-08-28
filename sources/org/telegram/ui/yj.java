package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class yj extends org.telegram.ui.Components.jo {
    public final /* synthetic */ qn f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yj(qn qnVar, Context context) {
        super(context);
        this.f = qnVar;
    }

    @Override // org.telegram.ui.Components.jo
    public final void a(boolean z10) {
        qn qnVar = this.f;
        qnVar.t7();
        qnVar.r7();
        qnVar.u7();
        qnVar.v7();
        rk rkVar = qnVar.Xa;
        if (rkVar != null) {
            rkVar.setTranslationY(qnVar.s9 + getCurrentHeight());
        }
        if (!z10) {
            qnVar.o9();
        } else {
            qnVar.z9 = true;
            qnVar.jc();
        }
    }
}
