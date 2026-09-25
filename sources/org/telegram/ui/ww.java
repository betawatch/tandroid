package org.telegram.ui;

import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class ww extends org.telegram.ui.Components.ti0 {
    public final /* synthetic */ int f0 = 0;
    public final /* synthetic */ Object g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ww(wf1 wf1Var, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(spannableStringBuilder, spannableStringBuilder2);
        this.g0 = wf1Var;
    }

    @Override // org.telegram.ui.Components.ti0
    public final float d() {
        switch (this.f0) {
            case 0:
                return ((py) this.g0).a.getViewOffset();
            default:
                return ((wf1) this.g0).N.f3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ww(String str, String str2, py pyVar) {
        super(str, str2);
        this.g0 = pyVar;
    }
}
