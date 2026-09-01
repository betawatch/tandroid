package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class um0 extends ClickableSpan {
    public final /* synthetic */ fn0 a;

    public um0(fn0 fn0Var) {
        this.a = fn0Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        fn0 fn0Var = this.a;
        af.g.s(fn0Var.getParentActivity(), fn0Var.y.privacy_policy_url);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(true);
        textPaint.setTypeface(AndroidUtilities.bold());
    }
}
