package xg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import di.l4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.y9;
import org.telegram.ui.Components.zq;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public abstract class c extends FrameLayout {
    public final u6 a;
    public final j9 b;
    public final y9 c;
    public final l4 d;
    public final b6 e;
    public final RadioButton f;
    public final Paint h;
    public boolean n;
    public final View r;

    public c(Context context, u6 u6Var) {
        super(context);
        j9 j9Var = new j9((u6) null);
        this.b = j9Var;
        this.h = new Paint(1);
        this.a = u6Var;
        View view = new View(context);
        this.r = view;
        addView(view, kb1.r(-1, -1));
        f7.i(y6.h5, view, u6Var);
        j9Var.r = AndroidUtilities.dp(40.0f);
        y9 y9Var = new y9(context);
        this.c = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        addView(y9Var);
        l4 l4Var = new l4(context, 5);
        this.d = l4Var;
        NotificationCenter.listenEmojiLoading(l4Var);
        NotificationCenter.listenEmojiLoading(y9Var);
        l4Var.setTextSize(16);
        int i10 = y6.j5;
        f7.Y(l4Var, i10, u6Var);
        l4Var.setGravity(LocaleController.isRTL ? 5 : 3);
        addView(l4Var);
        b6 b6Var = new b6(context);
        this.e = b6Var;
        b6Var.setTextSize(14);
        f7.Y(b6Var, i10, u6Var);
        b6Var.setGravity(LocaleController.isRTL ? 5 : 3);
        addView(b6Var);
        RadioButton radioButton = new RadioButton(context);
        this.f = radioButton;
        radioButton.setSize(AndroidUtilities.dp(20.0f));
        f7.P(radioButton, y6.j7, y6.E5, u6Var);
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
        this.c.setLayoutParams(kb1.h(40, 40.0f, (LocaleController.isRTL ? 5 : 3) | 16, b() ? 53.0f : 16.0f, 0.0f, b() ? 53.0f : 16.0f, 0.0f));
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
        this.d.setLayoutParams(kb1.h(-1, -2.0f, i10, f7, 0.0f, f10, 0.0f));
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
        this.e.setLayoutParams(kb1.h(-1, -2.0f, i11, f11, 0.0f, f12, 0.0f));
        boolean z12 = LocaleController.isRTL;
        this.f.setLayoutParams(kb1.h(22, 22.0f, (z12 ? 5 : 3) | 16, z12 ? 15.0f : 20.0f, 0.0f, z12 ? 20.0f : 15.0f, 0.0f));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.n) {
            int w02 = y6.w0(y6.d7, this.a);
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
        zq zqVar = new zq(2, drawable);
        drawable.setBounds(0, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(12.0f));
        spannableString.setSpan(zqVar, 0, spannableString.length(), 33);
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
        b6 b6Var = this.e;
        if (isEmpty) {
            l4Var.setTranslationY(0.0f);
            b6Var.setVisibility(8);
        } else {
            l4Var.setTranslationY(AndroidUtilities.dp(-9.0f));
            b6Var.setTranslationY(AndroidUtilities.dp(12.0f));
            b6Var.l(charSequence, false);
            b6Var.setVisibility(0);
        }
        if (this.c.getVisibility() == 8) {
            if (LocaleController.isRTL) {
                l4Var.setTranslationX(AndroidUtilities.dp(40.0f));
                b6Var.setTranslationX(AndroidUtilities.dp(40.0f));
            } else {
                l4Var.setTranslationX(AndroidUtilities.dp(-40.0f));
                b6Var.setTranslationX(AndroidUtilities.dp(-40.0f));
            }
        }
    }
}
