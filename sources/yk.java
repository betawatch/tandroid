// default package

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class yk extends ClickableSpan {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ vnb c;
    public final /* synthetic */ Runnable d;

    public yk(int i, int i2, vnb vnbVar, Runnable runnable) {
        this.a = i;
        this.b = i2;
        this.c = vnbVar;
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
            textPaint.setColor(aob.v0(i2, this.c));
        }
        if (i == 2) {
            textPaint.setTypeface(hl.o());
        }
    }
}
