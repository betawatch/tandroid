package org.telegram.ui;

import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class ww extends org.telegram.ui.Components.ri0 {
    public final /* synthetic */ int f0 = 0;
    public final /* synthetic */ Object g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ww(sf1 sf1Var, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(spannableStringBuilder, spannableStringBuilder2);
        this.g0 = sf1Var;
    }

    @Override // org.telegram.ui.Components.ri0
    public final float d() {
        switch (this.f0) {
            case 0:
                return ((oy) this.g0).a.getViewOffset();
            default:
                return ((sf1) this.g0).K.c3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ww(String str, String str2, oy oyVar) {
        super(str, str2);
        this.g0 = oyVar;
    }
}
