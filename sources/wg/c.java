package wg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import ci.l4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.yq;
import w7.z5;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public abstract class c extends FrameLayout {
    public final d6 a;
    public final h9 b;
    public final w9 c;
    public final l4 d;
    public final j5 e;
    public final RadioButton f;
    public final Paint h;
    public boolean n;
    public final View r;

    public c(Context context, d6 d6Var) {
        super(context);
        h9 h9Var = new h9((d6) null);
        this.b = h9Var;
        this.h = new Paint(1);
        this.a = d6Var;
        View view = new View(context);
        this.r = view;
        addView(view, z5.n(-1, -1));
        view.setBackgroundColor(h6.w0(h6.h5, d6Var));
        h9Var.r = AndroidUtilities.dp(40.0f);
        w9 w9Var = new w9(context);
        this.c = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        addView(w9Var);
        l4 l4Var = new l4(context, 5);
        this.d = l4Var;
        NotificationCenter.listenEmojiLoading(l4Var);
        NotificationCenter.listenEmojiLoading(w9Var);
        l4Var.setTextSize(16);
        int i10 = h6.j5;
        l4Var.setTextColor(h6.w0(i10, d6Var));
        l4Var.setGravity(LocaleController.isRTL ? 5 : 3);
        addView(l4Var);
        j5 j5Var = new j5(context);
        this.e = j5Var;
        j5Var.setTextSize(14);
        j5Var.setTextColor(h6.w0(i10, d6Var));
        j5Var.setGravity(LocaleController.isRTL ? 5 : 3);
        addView(j5Var);
        RadioButton radioButton = new RadioButton(context);
        this.f = radioButton;
        radioButton.setSize(AndroidUtilities.dp(20.0f));
        radioButton.b(h6.w0(h6.j7, d6Var), h6.w0(h6.E5, d6Var));
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
        float f13;
        int i10 = (LocaleController.isRTL ? 5 : 3) | 16;
        float f14 = 53.0f;
        if (b()) {
            f7 = 53.0f;
        } else {
            f7 = 53.0f;
            f14 = 16.0f;
        }
        this.c.setLayoutParams(z5.a(40.0f, f14, 0.0f, b() ? f7 : 16.0f, 0.0f, 40, i10));
        boolean z10 = LocaleController.isRTL;
        int i11 = (z10 ? 5 : 3) | 16;
        if (z10) {
            f10 = 20.0f;
        } else {
            f10 = b() ? 105 : 70;
        }
        if (LocaleController.isRTL) {
            f11 = b() ? 105 : 70;
        } else {
            f11 = 20.0f;
        }
        this.d.setLayoutParams(z5.a(-2.0f, f10, 0.0f, f11, 0.0f, -1, i11));
        boolean z11 = LocaleController.isRTL;
        int i12 = (z11 ? 5 : 3) | 16;
        if (z11) {
            f12 = 20.0f;
        } else {
            f12 = b() ? 105 : 70;
        }
        if (LocaleController.isRTL) {
            f13 = b() ? 105 : 70;
        } else {
            f13 = 20.0f;
        }
        this.e.setLayoutParams(z5.a(-2.0f, f12, 0.0f, f13, 0.0f, -1, i12));
        boolean z12 = LocaleController.isRTL;
        this.f.setLayoutParams(z5.a(22.0f, z12 ? 15.0f : 20.0f, 0.0f, z12 ? 20.0f : 15.0f, 0.0f, 22, (z12 ? 5 : 3) | 16));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.n) {
            int w02 = h6.w0(h6.d7, this.a);
            Paint paint = this.h;
            paint.setColor(w02);
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
        yq yqVar = new yq(2, drawable);
        drawable.setBounds(0, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(12.0f));
        spannableString.setSpan(yqVar, 0, spannableString.length(), 33);
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
        l4 l4Var = this.d;
        j5 j5Var = this.e;
        if (isEmpty) {
            l4Var.setTranslationY(0.0f);
            j5Var.setVisibility(8);
        } else {
            l4Var.setTranslationY(AndroidUtilities.dp(-9.0f));
            j5Var.setTranslationY(AndroidUtilities.dp(12.0f));
            j5Var.l(charSequence, false);
            j5Var.setVisibility(0);
        }
        if (this.c.getVisibility() == 8) {
            if (LocaleController.isRTL) {
                l4Var.setTranslationX(AndroidUtilities.dp(40.0f));
                j5Var.setTranslationX(AndroidUtilities.dp(40.0f));
            } else {
                l4Var.setTranslationX(AndroidUtilities.dp(-40.0f));
                j5Var.setTranslationX(AndroidUtilities.dp(-40.0f));
            }
        }
    }
}
