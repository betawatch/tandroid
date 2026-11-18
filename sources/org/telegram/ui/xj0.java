package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class xj0 extends ClickableSpan {
    public final /* synthetic */ hk0 a;

    public xj0(hk0 hk0Var) {
        this.a = hk0Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        hk0 hk0Var = this.a;
        vf.c.t(hk0Var.getParentActivity(), hk0Var.E.privacy_policy_url);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(true);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
    }
}
