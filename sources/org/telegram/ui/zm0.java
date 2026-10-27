package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class zm0 extends ClickableSpan {
    public final /* synthetic */ kn0 a;

    public zm0(kn0 kn0Var) {
        this.a = kn0Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        kn0 kn0Var = this.a;
        qf.d.r(kn0Var.getParentActivity(), kn0Var.y.privacy_policy_url);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(true);
        textPaint.setTypeface(AndroidUtilities.bold());
    }
}
