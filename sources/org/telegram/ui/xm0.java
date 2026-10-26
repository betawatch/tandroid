package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class xm0 extends ClickableSpan {
    public final /* synthetic */ in0 a;

    public xm0(in0 in0Var) {
        this.a = in0Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        in0 in0Var = this.a;
        qf.d.r(in0Var.getParentActivity(), in0Var.y.privacy_policy_url);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(true);
        textPaint.setTypeface(AndroidUtilities.bold());
    }
}
