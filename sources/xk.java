// default package

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class xk extends ClickableSpan {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ wjb c;
    public final /* synthetic */ Runnable d;

    public xk(int i, int i2, wjb wjbVar, Runnable runnable) {
        this.a = i;
        this.b = i2;
        this.c = wjbVar;
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
            textPaint.setColor(bkb.v0(i2, this.c));
        }
        if (i == 2) {
            textPaint.setTypeface(gl.o());
        }
    }
}
