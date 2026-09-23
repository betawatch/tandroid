package org.telegram.ui;

import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class xw extends org.telegram.ui.Components.ji0 {
    public final /* synthetic */ int f0 = 0;
    public final /* synthetic */ Object g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xw(wf1 wf1Var, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(spannableStringBuilder, spannableStringBuilder2);
        this.g0 = wf1Var;
    }

    @Override // org.telegram.ui.Components.ji0
    public final float d() {
        switch (this.f0) {
            case 0:
                return ((qy) this.g0).a.getViewOffset();
            default:
                return ((wf1) this.g0).N.f3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xw(String str, String str2, qy qyVar) {
        super(str, str2);
        this.g0 = qyVar;
    }
}
