package vg;

import ai.a6;
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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.f9;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.u9;
import w7.x5;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public abstract class c extends FrameLayout {
    public final e6 a;
    public final f9 b;
    public final u9 c;
    public final a6 d;
    public final j5 e;
    public final RadioButton f;
    public final Paint h;
    public boolean n;

    public c(Context context, e6 e6Var) {
        super(context);
        f9 f9Var = new f9((e6) null);
        this.b = f9Var;
        this.h = new Paint(1);
        this.a = e6Var;
        View view = new View(context);
        addView(view, x5.n(-1, -1));
        view.setBackgroundColor(i6.v0(i6.h5, e6Var));
        f9Var.r = AndroidUtilities.dp(40.0f);
        u9 u9Var = new u9(context);
        this.c = u9Var;
        u9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        addView(u9Var);
        a6 a6Var = new a6(context, 5);
        this.d = a6Var;
        NotificationCenter.listenEmojiLoading(a6Var);
        NotificationCenter.listenEmojiLoading(u9Var);
        a6Var.setTextSize(16);
        int i10 = i6.j5;
        a6Var.setTextColor(i6.v0(i10, e6Var));
        a6Var.setGravity(LocaleController.isRTL ? 5 : 3);
        addView(a6Var);
        j5 j5Var = new j5(context);
        this.e = j5Var;
        j5Var.setTextSize(14);
        j5Var.setTextColor(i6.v0(i10, e6Var));
        j5Var.setGravity(LocaleController.isRTL ? 5 : 3);
        addView(j5Var);
        RadioButton radioButton = new RadioButton(context);
        this.f = radioButton;
        radioButton.setSize(AndroidUtilities.dp(20.0f));
        radioButton.b(i6.v0(i6.j7, e6Var), i6.v0(i6.E5, e6Var));
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
        this.c.setLayoutParams(x5.d(40, 40.0f, (LocaleController.isRTL ? 5 : 3) | 16, b() ? 53.0f : 16.0f, 0.0f, b() ? 53.0f : 16.0f, 0.0f));
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
        this.d.setLayoutParams(x5.d(-1, -2.0f, i10, f7, 0.0f, f10, 0.0f));
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
        this.e.setLayoutParams(x5.d(-1, -2.0f, i11, f11, 0.0f, f12, 0.0f));
        boolean z12 = LocaleController.isRTL;
        this.f.setLayoutParams(x5.d(22, 22.0f, (z12 ? 5 : 3) | 16, z12 ? 15.0f : 20.0f, 0.0f, z12 ? 20.0f : 15.0f, 0.0f));
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
        oq oqVar = new oq(2, drawable);
        drawable.setBounds(0, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(12.0f));
        spannableString.setSpan(oqVar, 0, spannableString.length(), 33);
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
        a6 a6Var = this.d;
        j5 j5Var = this.e;
        if (isEmpty) {
            a6Var.setTranslationY(0.0f);
            j5Var.setVisibility(8);
        } else {
            a6Var.setTranslationY(AndroidUtilities.dp(-9.0f));
            j5Var.setTranslationY(AndroidUtilities.dp(12.0f));
            j5Var.l(charSequence, false);
            j5Var.setVisibility(0);
        }
        if (this.c.getVisibility() == 8) {
            if (LocaleController.isRTL) {
                a6Var.setTranslationX(AndroidUtilities.dp(40.0f));
                j5Var.setTranslationX(AndroidUtilities.dp(40.0f));
            } else {
                a6Var.setTranslationX(AndroidUtilities.dp(-40.0f));
                j5Var.setTranslationX(AndroidUtilities.dp(-40.0f));
            }
        }
    }
}
