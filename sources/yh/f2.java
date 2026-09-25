package yh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final class f2 extends ClickableSpan {
    public final /* synthetic */ long a;
    public final /* synthetic */ x3 b;

    public f2(x3 x3Var, long j3) {
        this.b = x3Var;
        this.a = j3;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.b.X1(this.a);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
