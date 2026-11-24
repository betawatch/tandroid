// default package

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
