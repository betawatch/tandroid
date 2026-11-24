// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class qg9 extends ReplacementSpan {
    public final og9 a;
    public final TL_iv.textButton b;
    public final RectF c = new RectF();
    public float d;
    public boolean e;
    public int f;
    public View h;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public qg9(rh9 rh9Var, int i, TL_iv.textButton textbutton, Boolean bool) {
        boolean z;
        boolean z2;
        this.b = textbutton;
        TL_iv.RichText richText = textbutton.text;
        if (richText instanceof TL_iv.textConcat) {
            TL_iv.textConcat textconcat = (TL_iv.textConcat) richText;
            if (!textconcat.texts.isEmpty()) {
                boolean z3 = textconcat.texts.get(0) instanceof TL_iv.textCustomEmoji;
                z2 = b00.f(1, textconcat.texts) instanceof TL_iv.textCustomEmoji;
                z = z3;
                TL_keyboard.RichButtonStyle richButtonStyle = textbutton.style;
                boolean z4 = richButtonStyle == null && richButtonStyle.link;
                SpannableStringBuilder l = rh9Var.l(textbutton.text, !z4 ? rh9.Q(512, 0) : rh9.Q(16, 13));
                TL_keyboard.InlineButtonType inlineButtonType = textbutton.type;
                og9 og9Var = new og9(rh9Var, i, l, null, inlineButtonType, textbutton.style, inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeDisabled, z, z2, z4, true, bool, new sr8(this, (byte) 25));
                this.a = og9Var;
                og9Var.e = og9Var.h();
            }
        }
        z = false;
        z2 = false;
        TL_keyboard.RichButtonStyle richButtonStyle2 = textbutton.style;
        if (richButtonStyle2 == null) {
        }
        SpannableStringBuilder l2 = rh9Var.l(textbutton.text, !z4 ? rh9.Q(512, 0) : rh9.Q(16, 13));
        TL_keyboard.InlineButtonType inlineButtonType2 = textbutton.type;
        og9 og9Var2 = new og9(rh9Var, i, l2, null, inlineButtonType2, textbutton.style, inlineButtonType2 instanceof TL_keyboard.TL_inlineButtonTypeDisabled, z, z2, z4, true, bool, new sr8(this, (byte) 25));
        this.a = og9Var2;
        og9Var2.e = og9Var2.h();
    }

    public final void a(View view) {
        this.h = view;
        this.a.a.i(view);
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        float f2;
        og9 og9Var = this.a;
        int i6 = og9Var.a.s;
        int i7 = (i6 <= 0 || this.f <= 0) ? 0 : 1;
        if (i7 == 0 && i6 > 0 && (charSequence instanceof Spanned)) {
            oh9[] oh9VarArr = (oh9[]) ((Spanned) charSequence).getSpans(i, i2, oh9.class);
            int length = oh9VarArr.length;
            int i8 = 0;
            while (true) {
                if (i8 >= length) {
                    break;
                }
                if ((oh9VarArr[i8].b & 15) == 14) {
                    i7 = 1;
                    break;
                }
                i8++;
            }
        }
        if (i7 != 0) {
            f2 = (i3 + i5) / 2.0f;
        } else {
            Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
            f2 = ((fontMetricsInt.ascent + fontMetricsInt.descent) / 2.0f) + i4;
        }
        canvas.save();
        int round = Math.round(f + (og9Var.s ? 0 : gl.L(1.0f)));
        int ceil = (int) Math.ceil((f2 - (og9Var.c() / 2.0f)) + (i7 ^ 1));
        float f3 = round;
        float f4 = ceil;
        this.c.set(f3, f4, round + og9Var.e, og9Var.c() + ceil);
        canvas.translate(f3, f4);
        og9Var.a(canvas);
        canvas.restore();
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z = this.e && fontMetricsInt != null;
        if (z) {
            i3 = fontMetricsInt.top;
            i4 = fontMetricsInt.ascent;
            i5 = fontMetricsInt.descent;
            i6 = fontMetricsInt.bottom;
            i7 = fontMetricsInt.leading;
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
        }
        int L = gl.L(8.0f);
        int L2 = gl.L(10.0f);
        og9 og9Var = this.a;
        if (fontMetricsInt != null && og9Var.s) {
            float f = this.d;
            int i8 = (int) (((-L2) - L) * f);
            fontMetricsInt.top = i8;
            int i9 = (int) ((L2 - L) * f);
            fontMetricsInt.bottom = i9;
            fontMetricsInt.ascent = i8;
            fontMetricsInt.descent = i9;
            fontMetricsInt.leading = 0;
        }
        if (z) {
            fontMetricsInt.top = i3;
            fontMetricsInt.ascent = i4;
            fontMetricsInt.descent = i5;
            fontMetricsInt.bottom = i6;
            fontMetricsInt.leading = i7;
            int i10 = this.f;
            int i11 = i5 - i4;
            if (i10 > i11) {
                int i12 = i10 - i11;
                int i13 = (i12 + 1) / 2;
                int i14 = i4 - i13;
                fontMetricsInt.ascent = i14;
                fontMetricsInt.descent = i5 + (i12 - i13);
                fontMetricsInt.top = Math.min(i3, i14);
                fontMetricsInt.bottom = Math.max(fontMetricsInt.bottom, fontMetricsInt.descent);
            }
        }
        return og9Var.e + (og9Var.s ? 0 : gl.L(1.0f) << 1);
    }
}
