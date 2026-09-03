package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
