package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class zm0 extends ClickableSpan {
    public final /* synthetic */ kn0 a;

    public zm0(kn0 kn0Var) {
        this.a = kn0Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        kn0 kn0Var = this.a;
        nf.f.s(kn0Var.getParentActivity(), kn0Var.y.privacy_policy_url);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(true);
        textPaint.setTypeface(AndroidUtilities.bold());
    }
}
