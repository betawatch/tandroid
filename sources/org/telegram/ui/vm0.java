package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class vm0 extends ClickableSpan {
    public final /* synthetic */ gn0 a;

    public vm0(gn0 gn0Var) {
        this.a = gn0Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        gn0 gn0Var = this.a;
        nf.f.s(gn0Var.getParentActivity(), gn0Var.y.privacy_policy_url);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(true);
        textPaint.setTypeface(AndroidUtilities.bold());
    }
}
