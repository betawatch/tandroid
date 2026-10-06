package vg;

import ai.z5;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i5;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.rq;
import org.telegram.ui.Components.w9;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public abstract class c extends FrameLayout {
    public final d6 a;
    public final h9 b;
    public final w9 c;
    public final z5 d;
    public final i5 e;
    public final RadioButton f;
    public final Paint h;
    public boolean n;

    public c(Context context, d6 d6Var) {
        super(context);
        h9 h9Var = new h9((d6) null);
        this.b = h9Var;
        this.h = new Paint(1);
        this.a = d6Var;
        View view = new View(context);
        addView(view, w7.z5.n(-1, -1));
        view.setBackgroundColor(i6.v0(i6.h5, d6Var));
        h9Var.r = AndroidUtilities.dp(40.0f);
        w9 w9Var = new w9(context);
        this.c = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        addView(w9Var);
        z5 z5Var = new z5(context, 5);
        this.d = z5Var;
        NotificationCenter.listenEmojiLoading(z5Var);
        NotificationCenter.listenEmojiLoading(w9Var);
        z5Var.setTextSize(16);
        int i10 = i6.j5;
        z5Var.setTextColor(i6.v0(i10, d6Var));
        z5Var.setGravity(LocaleController.isRTL ? 5 : 3);
        addView(z5Var);
        i5 i5Var = new i5(context);
        this.e = i5Var;
        i5Var.setTextSize(14);
        i5Var.setTextColor(i6.v0(i10, d6Var));
        i5Var.setGravity(LocaleController.isRTL ? 5 : 3);
        addView(i5Var);
        RadioButton radioButton = new RadioButton(context);
        this.f = radioButton;
        radioButton.setSize(AndroidUtilities.dp(20.0f));
        radioButton.b(i6.v0(i6.j7, d6Var), i6.v0(i6.E5, d6Var));
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
        float f7;
        float f10;
        float f11;
        float f12;
        this.c.setLayoutParams(w7.z5.d(40, 40.0f, (LocaleController.isRTL ? 5 : 3) | 16, b() ? 53.0f : 16.0f, 0.0f, b() ? 53.0f : 16.0f, 0.0f));
        boolean z10 = LocaleController.isRTL;
        int i10 = (z10 ? 5 : 3) | 16;
        if (z10) {
            f7 = 20.0f;
        } else {
            f7 = b() ? 105 : 70;
        }
        if (LocaleController.isRTL) {
            f10 = b() ? 105 : 70;
        } else {
            f10 = 20.0f;
        }
        this.d.setLayoutParams(w7.z5.d(-1, -2.0f, i10, f7, 0.0f, f10, 0.0f));
        boolean z11 = LocaleController.isRTL;
        int i11 = (z11 ? 5 : 3) | 16;
        if (z11) {
            f11 = 20.0f;
        } else {
            f11 = b() ? 105 : 70;
        }
        if (LocaleController.isRTL) {
            f12 = b() ? 105 : 70;
        } else {
            f12 = 20.0f;
        }
        this.e.setLayoutParams(w7.z5.d(-1, -2.0f, i11, f11, 0.0f, f12, 0.0f));
        boolean z12 = LocaleController.isRTL;
        this.f.setLayoutParams(w7.z5.d(22, 22.0f, (z12 ? 5 : 3) | 16, z12 ? 15.0f : 20.0f, 0.0f, z12 ? 20.0f : 15.0f, 0.0f));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.n) {
            int v02 = i6.v0(i6.d7, this.a);
            Paint paint = this.h;
            paint.setColor(v02);
            int i10 = b() ? 105 : 70;
            if (this.c.getVisibility() == 8) {
                i10 -= 40;
            }
            int a2 = a() + i10;
            if (LocaleController.isRTL) {
                canvas.drawRect(0.0f, getHeight() - 1, getWidth() - AndroidUtilities.dp(a2), getHeight(), paint);
            } else {
                canvas.drawRect(AndroidUtilities.dp(a2), getHeight() - 1, getWidth(), getHeight(), paint);
            }
        }
    }

    public final SpannableStringBuilder e(CharSequence charSequence) {
        SpannableString spannableString = new SpannableString(">");
        Drawable drawable = getContext().getResources().getDrawable(R.drawable.attach_arrow_right);
        rq rqVar = new rq(2, drawable);
        drawable.setBounds(0, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(12.0f));
        spannableString.setSpan(rqVar, 0, spannableString.length(), 33);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(charSequence).append((CharSequence) " ").append((CharSequence) spannableString);
        return spannableStringBuilder;
    }

    public int getFullHeight() {
        return 56;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(getFullHeight()), TLObject.FLAG_30));
    }

    public void setDivider(boolean z10) {
        this.n = z10;
        invalidate();
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        z5 z5Var = this.d;
        i5 i5Var = this.e;
        if (isEmpty) {
            z5Var.setTranslationY(0.0f);
            i5Var.setVisibility(8);
        } else {
            z5Var.setTranslationY(AndroidUtilities.dp(-9.0f));
            i5Var.setTranslationY(AndroidUtilities.dp(12.0f));
            i5Var.l(charSequence, false);
            i5Var.setVisibility(0);
        }
        if (this.c.getVisibility() == 8) {
            if (LocaleController.isRTL) {
                z5Var.setTranslationX(AndroidUtilities.dp(40.0f));
                i5Var.setTranslationX(AndroidUtilities.dp(40.0f));
            } else {
                z5Var.setTranslationX(AndroidUtilities.dp(-40.0f));
                i5Var.setTranslationX(AndroidUtilities.dp(-40.0f));
            }
        }
    }
}
