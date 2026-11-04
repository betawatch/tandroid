package zg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import b8.mf;
import ei.e4;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.hs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.u8;
import org.telegram.ui.Components.wp;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class c extends FrameLayout {
    public final e6 a;
    public final u8 b;
    public final k9 c;
    public final e4 d;
    public final k5 e;
    public final RadioButton f;
    public final Paint h;
    public boolean n;
    public final View r;

    public c(Context context, e6 e6Var) {
        super(context);
        u8 u8Var = new u8((e6) null);
        this.b = u8Var;
        this.h = new Paint(1);
        this.a = e6Var;
        View view = new View(context);
        this.r = view;
        addView(view, mf.o(-1, -1));
        r6.i(k6.h5, view, e6Var);
        u8Var.r = g0.L(40.0f);
        k9 k9Var = new k9(context);
        this.c = k9Var;
        k9Var.setRoundRadius(g0.L(20.0f));
        addView(k9Var);
        e4 e4Var = new e4(context, 5);
        this.d = e4Var;
        hs.i(e4Var);
        hs.i(k9Var);
        e4Var.setTextSize(16);
        int i3 = k6.j5;
        r6.Y(e4Var, i3, e6Var);
        e4Var.setGravity(bd.a0 ? 5 : 3);
        addView(e4Var);
        k5 k5Var = new k5(context);
        this.e = k5Var;
        k5Var.setTextSize(14);
        r6.Y(k5Var, i3, e6Var);
        k5Var.setGravity(bd.a0 ? 5 : 3);
        addView(k5Var);
        RadioButton radioButton = new RadioButton(context);
        this.f = radioButton;
        radioButton.setSize(g0.L(20.0f));
        r6.P(radioButton, k6.j7, k6.E5, e6Var);
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
        this.c.setLayoutParams(mf.d(40, 40.0f, (bd.a0 ? 5 : 3) | 16, b() ? 53.0f : 16.0f, 0.0f, b() ? 53.0f : 16.0f, 0.0f));
        boolean z10 = bd.a0;
        int i3 = (z10 ? 5 : 3) | 16;
        if (z10) {
            f10 = 20.0f;
        } else {
            f10 = b() ? 105 : 70;
        }
        if (bd.a0) {
            f11 = b() ? 105 : 70;
        } else {
            f11 = 20.0f;
        }
        this.d.setLayoutParams(mf.d(-1, -2.0f, i3, f10, 0.0f, f11, 0.0f));
        boolean z11 = bd.a0;
        int i10 = (z11 ? 5 : 3) | 16;
        if (z11) {
            f12 = 20.0f;
        } else {
            f12 = b() ? 105 : 70;
        }
        if (bd.a0) {
            f13 = b() ? 105 : 70;
        } else {
            f13 = 20.0f;
        }
        this.e.setLayoutParams(mf.d(-1, -2.0f, i10, f12, 0.0f, f13, 0.0f));
        boolean z12 = bd.a0;
        this.f.setLayoutParams(mf.d(22, 22.0f, (z12 ? 5 : 3) | 16, z12 ? 15.0f : 20.0f, 0.0f, z12 ? 20.0f : 15.0f, 0.0f));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.n) {
            int w02 = k6.w0(k6.d7, this.a);
            Paint paint = this.h;
            paint.setColor(w02);
            int i3 = b() ? hs.q1 : 70;
            if (this.c.getVisibility() == 8) {
                i3 -= 40;
            }
            int a10 = a() + i3;
            if (bd.a0) {
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
    public void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(g0.L(getFullHeight()), TLObject.FLAG_30));
    }

    public void setDivider(boolean z10) {
        this.n = z10;
        invalidate();
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        e4 e4Var = this.d;
        k5 k5Var = this.e;
        if (isEmpty) {
            e4Var.setTranslationY(0.0f);
            k5Var.setVisibility(8);
        } else {
            e4Var.setTranslationY(g0.L(-9.0f));
            k5Var.setTranslationY(g0.L(12.0f));
            k5Var.l(charSequence, false);
            k5Var.setVisibility(0);
        }
        if (this.c.getVisibility() == 8) {
            if (bd.a0) {
                e4Var.setTranslationX(g0.L(40.0f));
                k5Var.setTranslationX(g0.L(40.0f));
            } else {
                e4Var.setTranslationX(g0.L(-40.0f));
                k5Var.setTranslationX(g0.L(-40.0f));
            }
        }
    }
}
