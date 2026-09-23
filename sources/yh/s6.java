package yh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final class s6 extends ClickableSpan {
    public final /* synthetic */ w5 a;

    public s6(w5 w5Var) {
        this.a = w5Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.a.run();
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
