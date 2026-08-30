package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class sm0 extends ClickableSpan {
    public final /* synthetic */ dn0 a;

    public sm0(dn0 dn0Var) {
        this.a = dn0Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        dn0 dn0Var = this.a;
        af.g.s(dn0Var.getParentActivity(), dn0Var.y.privacy_policy_url);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(true);
        textPaint.setTypeface(AndroidUtilities.bold());
    }
}
