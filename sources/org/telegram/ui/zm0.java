package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
