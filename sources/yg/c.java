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
import c8.ma;
import fi.u3;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m5;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.q9;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public abstract class c extends FrameLayout {
    public final h6 a;
    public final b9 b;
    public final q9 c;
    public final u3 d;
    public final m5 e;
    public final RadioButton f;
    public final Paint h;
    public boolean n;
    public final View r;

    public c(Context context, h6 h6Var) {
        super(context);
        b9 b9Var = new b9((h6) null);
        this.b = b9Var;
        this.h = new Paint(1);
        this.a = h6Var;
        View view = new View(context);
        this.r = view;
        addView(view, ma.o(-1, -1));
        t6.h(m6.h5, view, h6Var);
        b9Var.r = g0.L(40.0f);
        q9 q9Var = new q9(context);
        this.c = q9Var;
        q9Var.setRoundRadius(g0.L(20.0f));
        addView(q9Var);
        u3 u3Var = new u3(context, 5);
        this.d = u3Var;
        ls.i(u3Var);
        ls.i(q9Var);
        u3Var.setTextSize(16);
        int i7 = m6.j5;
        t6.X(u3Var, i7, h6Var);
        u3Var.setGravity(hd.a0 ? 5 : 3);
        addView(u3Var);
        m5 m5Var = new m5(context);
        this.e = m5Var;
        m5Var.setTextSize(14);
        t6.X(m5Var, i7, h6Var);
        m5Var.setGravity(hd.a0 ? 5 : 3);
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

    public void c(boolean z10, boolean z11) {
        RadioButton radioButton = this.f;
        if (radioButton.getVisibility() == 0) {
            radioButton.a(z10, true);
        }
    }

    public void d() {
        float f10;
        float f11;
        float f12;
        float f13;
        this.c.setLayoutParams(ma.d(40, 40.0f, (hd.a0 ? 5 : 3) | 16, b() ? 53.0f : 16.0f, 0.0f, b() ? 53.0f : 16.0f, 0.0f));
        boolean z10 = hd.a0;
        int i7 = (z10 ? 5 : 3) | 16;
        if (z10) {
            f10 = 20.0f;
        } else {
            f10 = b() ? 105 : 70;
        }
        if (hd.a0) {
            f11 = b() ? 105 : 70;
        } else {
            f11 = 20.0f;
        }
        this.d.setLayoutParams(ma.d(-1, -2.0f, i7, f10, 0.0f, f11, 0.0f));
        boolean z11 = hd.a0;
        int i10 = (z11 ? 5 : 3) | 16;
        if (z11) {
            f12 = 20.0f;
        } else {
            f12 = b() ? 105 : 70;
        }
        if (hd.a0) {
            f13 = b() ? 105 : 70;
        } else {
            f13 = 20.0f;
        }
        this.e.setLayoutParams(ma.d(-1, -2.0f, i10, f12, 0.0f, f13, 0.0f));
        boolean z12 = hd.a0;
        this.f.setLayoutParams(ma.d(22, 22.0f, (z12 ? 5 : 3) | 16, z12 ? 15.0f : 20.0f, 0.0f, z12 ? 20.0f : 15.0f, 0.0f));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.n) {
            int w02 = m6.w0(m6.d7, this.a);
            Paint paint = this.h;
            paint.setColor(w02);
            int i7 = b() ? ls.q1 : 70;
            if (this.c.getVisibility() == 8) {
                i7 -= 40;
            }
            int a10 = a() + i7;
            if (hd.a0) {
                canvas.drawRect(0.0f, getHeight() - 1, getWidth() - g0.L(a10), getHeight(), paint);
            } else {
                canvas.drawRect(g0.L(a10), getHeight() - 1, getWidth(), getHeight(), paint);
            }
        }
    }

    public final SpannableStringBuilder e(CharSequence charSequence) {
        SpannableString spannableString = new SpannableString(">");
        Drawable drawable = getContext().getResources().getDrawable(R.drawable.attach_arrow_right);
        nq nqVar = new nq(2, drawable);
        drawable.setBounds(0, g0.L(1.0f), g0.L(11.0f), g0.L(12.0f));
        spannableString.setSpan(nqVar, 0, spannableString.length(), 33);
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

    public void setCellBackgroundVisible(boolean z10) {
        this.r.setVisibility(z10 ? 0 : 8);
    }

    public void setDivider(boolean z10) {
        this.n = z10;
        invalidate();
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        u3 u3Var = this.d;
        m5 m5Var = this.e;
        if (isEmpty) {
            u3Var.setTranslationY(0.0f);
            m5Var.setVisibility(8);
        } else {
            u3Var.setTranslationY(g0.L(-9.0f));
            m5Var.setTranslationY(g0.L(12.0f));
            m5Var.l(charSequence, false);
            m5Var.setVisibility(0);
        }
        if (this.c.getVisibility() == 8) {
            if (hd.a0) {
                u3Var.setTranslationX(g0.L(40.0f));
                m5Var.setTranslationX(g0.L(40.0f));
            } else {
                u3Var.setTranslationX(g0.L(-40.0f));
                m5Var.setTranslationX(g0.L(-40.0f));
            }
        }
    }

    public void setSubtitleColorKey(int i7) {
        t6.X(this.e, i7, this.a);
    }
}
