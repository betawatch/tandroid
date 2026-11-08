package yg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import c8.ha;
import di.d4;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.id;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.w8;
import org.telegram.ui.Components.wp;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public abstract class c extends FrameLayout {
    public final f6 a;
    public final w8 b;
    public final l9 c;
    public final d4 d;
    public final k5 e;
    public final RadioButton f;
    public final Paint h;
    public boolean n;
    public final View r;

    public c(Context context, f6 f6Var) {
        super(context);
        w8 w8Var = new w8((f6) null);
        this.b = w8Var;
        this.h = new Paint(1);
        this.a = f6Var;
        View view = new View(context);
        this.r = view;
        addView(view, ha.o(-1, -1));
        r6.i(k6.h5, view, f6Var);
        w8Var.r = g0.L(40.0f);
        l9 l9Var = new l9(context);
        this.c = l9Var;
        l9Var.setRoundRadius(g0.L(20.0f));
        addView(l9Var);
        d4 d4Var = new d4(context, 5);
        this.d = d4Var;
        qs.i(d4Var);
        qs.i(l9Var);
        d4Var.setTextSize(16);
        int i7 = k6.j5;
        r6.Y(d4Var, i7, f6Var);
        d4Var.setGravity(id.a0 ? 5 : 3);
        addView(d4Var);
        k5 k5Var = new k5(context);
        this.e = k5Var;
        k5Var.setTextSize(14);
        r6.Y(k5Var, i7, f6Var);
        k5Var.setGravity(id.a0 ? 5 : 3);
        addView(k5Var);
        RadioButton radioButton = new RadioButton(context);
        this.f = radioButton;
        radioButton.setSize(g0.L(20.0f));
        r6.P(radioButton, k6.j7, k6.E5, f6Var);
        addView(radioButton);
        d();
        if (b()) {
            return;
        }
        radioButton.setVisibility(8);
    }

    public int a() {
        return 0;
    }

    public abstract boolean b();

    public void c(boolean z9, boolean z10) {
        RadioButton radioButton = this.f;
        if (radioButton.getVisibility() == 0) {
            radioButton.a(z9, true);
        }
    }

    public void d() {
        float f10;
        float f11;
        float f12;
        float f13;
        this.c.setLayoutParams(ha.d(40, 40.0f, (id.a0 ? 5 : 3) | 16, b() ? 53.0f : 16.0f, 0.0f, b() ? 53.0f : 16.0f, 0.0f));
        boolean z9 = id.a0;
        int i7 = (z9 ? 5 : 3) | 16;
        if (z9) {
            f10 = 20.0f;
        } else {
            f10 = b() ? 105 : 70;
        }
        if (id.a0) {
            f11 = b() ? 105 : 70;
        } else {
            f11 = 20.0f;
        }
        this.d.setLayoutParams(ha.d(-1, -2.0f, i7, f10, 0.0f, f11, 0.0f));
        boolean z10 = id.a0;
        int i10 = (z10 ? 5 : 3) | 16;
        if (z10) {
            f12 = 20.0f;
        } else {
            f12 = b() ? 105 : 70;
        }
        if (id.a0) {
            f13 = b() ? 105 : 70;
        } else {
            f13 = 20.0f;
        }
        this.e.setLayoutParams(ha.d(-1, -2.0f, i10, f12, 0.0f, f13, 0.0f));
        boolean z11 = id.a0;
        this.f.setLayoutParams(ha.d(22, 22.0f, (z11 ? 5 : 3) | 16, z11 ? 15.0f : 20.0f, 0.0f, z11 ? 20.0f : 15.0f, 0.0f));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.n) {
            int w02 = k6.w0(k6.d7, this.a);
            Paint paint = this.h;
            paint.setColor(w02);
            int i7 = b() ? qs.q1 : 70;
            if (this.c.getVisibility() == 8) {
                i7 -= 40;
            }
            int a10 = a() + i7;
            if (id.a0) {
                canvas.drawRect(0.0f, getHeight() - 1, getWidth() - g0.L(a10), getHeight(), paint);
            } else {
                canvas.drawRect(g0.L(a10), getHeight() - 1, getWidth(), getHeight(), paint);
            }
        }
    }

    public final SpannableStringBuilder e(CharSequence charSequence) {
        SpannableString spannableString = new SpannableString(">");
        Drawable drawable = getContext().getResources().getDrawable(R.drawable.attach_arrow_right);
        wp wpVar = new wp(2, drawable);
        drawable.setBounds(0, g0.L(1.0f), g0.L(11.0f), g0.L(12.0f));
        spannableString.setSpan(wpVar, 0, spannableString.length(), 33);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(charSequence).append((CharSequence) " ").append((CharSequence) spannableString);
        return spannableStringBuilder;
    }

    public int getFullHeight() {
        return 56;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(g0.L(getFullHeight()), TLObject.FLAG_30));
    }

    public void setDivider(boolean z9) {
        this.n = z9;
        invalidate();
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        d4 d4Var = this.d;
        k5 k5Var = this.e;
        if (isEmpty) {
            d4Var.setTranslationY(0.0f);
            k5Var.setVisibility(8);
        } else {
            d4Var.setTranslationY(g0.L(-9.0f));
            k5Var.setTranslationY(g0.L(12.0f));
            k5Var.l(charSequence, false);
            k5Var.setVisibility(0);
        }
        if (this.c.getVisibility() == 8) {
            if (id.a0) {
                d4Var.setTranslationX(g0.L(40.0f));
                k5Var.setTranslationX(g0.L(40.0f));
            } else {
                d4Var.setTranslationX(g0.L(-40.0f));
                k5Var.setTranslationX(g0.L(-40.0f));
            }
        }
    }
}
