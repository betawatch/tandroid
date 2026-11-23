package wg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import android.util.Pair;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Cells.r1;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.nr;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class a extends ReplacementSpan {
    public final Drawable a;
    public final Drawable b;
    public boolean c;
    public boolean d;
    public final n6 e;
    public final TextPaint f;
    public final int h;

    public a(r1 r1Var, TextPaint textPaint, int i7) {
        this.f = textPaint;
        n6 n6Var = new n6(false, false, true);
        this.e = n6Var;
        n6Var.n(0.3f, 250L, nr.h);
        n6Var.setCallback(r1Var);
        n6Var.w(org.telegram.messenger.g0.L(11.5f));
        n6Var.x(org.telegram.messenger.g0.o());
        n6Var.t("", true, true);
        n6Var.b = 17;
        Drawable mutate = r1Var.getContext().getDrawable(R.drawable.mini_boost_profile_badge).mutate();
        this.a = mutate;
        Drawable mutate2 = r1Var.getContext().getDrawable(R.drawable.mini_boost_profile_badge2).mutate();
        this.b = mutate2;
        mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
        mutate2.setBounds(0, 0, mutate2.getIntrinsicWidth(), mutate2.getIntrinsicHeight());
        this.h = i7;
        n6Var.t(i7 > 1 ? String.valueOf(i7) : "", false, true);
    }

    public static Pair a(r1 r1Var, TextPaint textPaint, int i7) {
        SpannableString spannableString = new SpannableString("d");
        a aVar = new a(r1Var, textPaint, i7);
        spannableString.setSpan(aVar, 0, 1, 33);
        return new Pair(spannableString, aVar);
    }

    public final int b() {
        return (int) (this.e.e() + org.telegram.messenger.g0.L((this.d ? 8 : 0) + 16));
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        TextPaint textPaint = this.f;
        int color = textPaint.getColor();
        n6 n6Var = this.e;
        int color2 = n6Var.a.getColor();
        Drawable drawable = this.b;
        Drawable drawable2 = this.a;
        if (color != color2) {
            n6Var.u(textPaint.getColor());
            int color3 = n6Var.a.getColor();
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable2.setColorFilter(new PorterDuffColorFilter(color3, mode));
            drawable.setColorFilter(new PorterDuffColorFilter(n6Var.a.getColor(), mode));
        }
        canvas.save();
        canvas.translate(f10 + ((!this.d || this.c) ? 0 : org.telegram.messenger.g0.L(8.0f)), -org.telegram.messenger.g0.L(0.2f));
        if (this.h == 1) {
            canvas.translate(org.telegram.messenger.g0.L(1.5f), 0.0f);
            drawable2.draw(canvas);
        } else {
            drawable.draw(canvas);
        }
        canvas.translate(org.telegram.messenger.g0.L(16.0f), 0.0f);
        Rect rect = org.telegram.messenger.g0.Q;
        rect.set(0, 0, (int) n6Var.c(), (int) n6Var.e);
        n6Var.setBounds(rect);
        n6Var.draw(canvas);
        canvas.restore();
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        return b();
    }
}
