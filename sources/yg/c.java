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
import di.e4;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.id;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m5;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.v8;
import org.telegram.ui.Components.wp;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public abstract class c extends FrameLayout {
    public final h6 a;
    public final v8 b;
    public final k9 c;
    public final e4 d;
    public final m5 e;
    public final RadioButton f;
    public final Paint h;
    public boolean n;
    public final View r;

    public c(Context context, h6 h6Var) {
        super(context);
        v8 v8Var = new v8((h6) null);
        this.b = v8Var;
        this.h = new Paint(1);
        this.a = h6Var;
        View view = new View(context);
        this.r = view;
        addView(view, ha.o(-1, -1));
        t6.h(m6.h5, view, h6Var);
        v8Var.r = g0.L(40.0f);
        k9 k9Var = new k9(context);
        this.c = k9Var;
        k9Var.setRoundRadius(g0.L(20.0f));
        addView(k9Var);
        e4 e4Var = new e4(context, 5);
        this.d = e4Var;
        qs.i(e4Var);
        qs.i(k9Var);
        e4Var.setTextSize(16);
        int i7 = m6.j5;
        t6.X(e4Var, i7, h6Var);
        e4Var.setGravity(id.a0 ? 5 : 3);
        addView(e4Var);
        m5 m5Var = new m5(context);
        this.e = m5Var;
        m5Var.setTextSize(14);
        t6.X(m5Var, i7, h6Var);
        m5Var.setGravity(id.a0 ? 5 : 3);
        addView(m5Var);
        RadioButton radioButton = new RadioButton(context);
        this.f = radioButton;
        radioButton.setSize(g0.L(20.0f));
        t6.O(radioButton, m6.j7, m6.E5, h6Var);
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
            int w02 = m6.w0(m6.d7, this.a);
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
        e4 e4Var = this.d;
        m5 m5Var = this.e;
        if (isEmpty) {
            e4Var.setTranslationY(0.0f);
            m5Var.setVisibility(8);
        } else {
            e4Var.setTranslationY(g0.L(-9.0f));
            m5Var.setTranslationY(g0.L(12.0f));
            m5Var.l(charSequence, false);
            m5Var.setVisibility(0);
        }
        if (this.c.getVisibility() == 8) {
            if (id.a0) {
                e4Var.setTranslationX(g0.L(40.0f));
                m5Var.setTranslationX(g0.L(40.0f));
            } else {
                e4Var.setTranslationX(g0.L(-40.0f));
                m5Var.setTranslationX(g0.L(-40.0f));
            }
        }
    }
}
