package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class xm0 extends ClickableSpan {
    public final /* synthetic */ in0 a;

    public xm0(in0 in0Var) {
        this.a = in0Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        in0 in0Var = this.a;
        nf.f.s(in0Var.getParentActivity(), in0Var.y.privacy_policy_url);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(true);
        textPaint.setTypeface(AndroidUtilities.bold());
    }
}
