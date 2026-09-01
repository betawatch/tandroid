package org.telegram.ui;

import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class ww extends org.telegram.ui.Components.ri0 {
    public final /* synthetic */ int f0 = 0;
    public final /* synthetic */ Object g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ww(mf1 mf1Var, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(spannableStringBuilder, spannableStringBuilder2);
        this.g0 = mf1Var;
    }

    @Override // org.telegram.ui.Components.ri0
    public final float d() {
        switch (this.f0) {
            case 0:
                return ((oy) this.g0).a.getViewOffset();
            default:
                return ((mf1) this.g0).K.c3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ww(String str, String str2, oy oyVar) {
        super(str, str2);
        this.g0 = oyVar;
    }
}
