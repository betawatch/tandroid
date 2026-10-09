package org.telegram.ui;

import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class zw extends org.telegram.ui.Components.nj0 {
    public final /* synthetic */ int f0 = 0;
    public final /* synthetic */ Object g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zw(fg1 fg1Var, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(spannableStringBuilder, spannableStringBuilder2);
        this.g0 = fg1Var;
    }

    @Override // org.telegram.ui.Components.nj0
    public final float d() {
        switch (this.f0) {
            case 0:
                return ((sy) this.g0).a.getViewOffset();
            default:
                return ((fg1) this.g0).N.d3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zw(String str, String str2, sy syVar) {
        super(str, str2);
        this.g0 = syVar;
    }
}
