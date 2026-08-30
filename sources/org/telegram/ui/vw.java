package org.telegram.ui;

import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class vw extends org.telegram.ui.Components.pi0 {
    public final /* synthetic */ int f0 = 0;
    public final /* synthetic */ Object g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vw(kf1 kf1Var, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(spannableStringBuilder, spannableStringBuilder2);
        this.g0 = kf1Var;
    }

    @Override // org.telegram.ui.Components.pi0
    public final float d() {
        switch (this.f0) {
            case 0:
                return ((ny) this.g0).a.getViewOffset();
            default:
                return ((kf1) this.g0).K.c3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vw(String str, String str2, ny nyVar) {
        super(str, str2);
        this.g0 = nyVar;
    }
}
