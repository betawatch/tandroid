// default package

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextPaint;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class t2c extends Drawable {
    public final b29 a;
    public int b;
    public final TextPaint c;

    public t2c(TextPaint textPaint) {
        jn jnVar = new jn(this, (byte) 12);
        this.c = textPaint;
        float textSize = textPaint.getTextSize() * 0.89f;
        b29 b29Var = new b29(R.raw.dots_loading, (int) textSize, (int) (textSize * 1.25f));
        this.a = b29Var;
        b29Var.setCallback(jnVar);
        b29Var.F(1);
        b29Var.H((int) ((SystemClock.elapsedRealtime() / 16.0f) % 60.0f));
        b29Var.E(true);
        b29Var.start();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int color = this.c.getColor();
        int i = this.b;
        b29 b29Var = this.a;
        if (color != i) {
            b29Var.a0 = true;
            b29Var.L(color, "Comp 1");
            b29Var.j();
            b29Var.E(true);
            b29Var.Q(0L);
            this.b = color;
        }
        b29Var.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
