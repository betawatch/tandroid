package org.telegram.ui;

import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class xw extends org.telegram.ui.Components.qi0 {
    public final /* synthetic */ int f0 = 0;
    public final /* synthetic */ Object g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xw(sf1 sf1Var, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(spannableStringBuilder, spannableStringBuilder2);
        this.g0 = sf1Var;
    }

    @Override // org.telegram.ui.Components.qi0
    public final float d() {
        switch (this.f0) {
            case 0:
                return ((py) this.g0).a.getViewOffset();
            default:
                return ((sf1) this.g0).K.c3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xw(String str, String str2, py pyVar) {
        super(str, str2);
        this.g0 = pyVar;
    }
}
