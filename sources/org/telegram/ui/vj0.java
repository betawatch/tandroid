package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class vj0 extends ClickableSpan {
    public final /* synthetic */ fk0 a;

    public vj0(fk0 fk0Var) {
        this.a = fk0Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        fk0 fk0Var = this.a;
        vf.c.t(fk0Var.getParentActivity(), fk0Var.E.privacy_policy_url);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(true);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
    }
}
