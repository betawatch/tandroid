package org.telegram.ui;

import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class yw extends org.telegram.ui.Components.vi0 {
    public final /* synthetic */ int f0 = 0;
    public final /* synthetic */ Object g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yw(wf1 wf1Var, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(spannableStringBuilder, spannableStringBuilder2);
        this.g0 = wf1Var;
    }

    @Override // org.telegram.ui.Components.vi0
    public final float d() {
        switch (this.f0) {
            case 0:
                return ((ty) this.g0).a.getViewOffset();
            default:
                return ((wf1) this.g0).N.m3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yw(String str, String str2, ty tyVar) {
        super(str, str2);
        this.g0 = tyVar;
    }
}
