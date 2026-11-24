// default package

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class xl extends ClickableSpan {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ylb c;
    public final /* synthetic */ Runnable d;

    public xl(int i, int i2, ylb ylbVar, Runnable runnable) {
        this.a = i;
        this.b = i2;
        this.c = ylbVar;
        this.d = runnable;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Runnable runnable = this.d;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        int i = this.a;
        textPaint.setUnderlineText(i == 4);
        int i2 = this.b;
        if (i2 >= 0) {
            textPaint.setColor(cmb.v0(i2, this.c));
        }
        if (i == 2) {
            textPaint.setTypeface(gm.o());
        }
    }
}
