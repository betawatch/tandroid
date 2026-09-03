package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class um0 extends ClickableSpan {
    public final /* synthetic */ fn0 a;

    public um0(fn0 fn0Var) {
        this.a = fn0Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        fn0 fn0Var = this.a;
        ze.d.s(fn0Var.getParentActivity(), fn0Var.y.privacy_policy_url);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(true);
        textPaint.setTypeface(AndroidUtilities.bold());
    }
}
