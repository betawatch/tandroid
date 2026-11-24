// default package

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class zl extends ClickableSpan {
    public final /* synthetic */ int a;
    public final /* synthetic */ Runnable b;

    public zl(int i, Runnable runnable) {
        this.a = i;
        this.b = runnable;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Runnable runnable = this.b;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        textPaint.setColor(this.a);
    }
}
