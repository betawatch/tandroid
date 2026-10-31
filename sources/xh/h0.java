package xh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.k6;
import org.telegram.messenger.zs;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.o5;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class h0 extends FrameLayout {
    public final nh.p a;
    public final ImageView b;
    public final TL_keyboard.KeyboardButton c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean h;
    public final /* synthetic */ j0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(j0 j0Var, Context context, TL_keyboard.KeyboardButton keyboardButton) {
        super(context);
        this.n = j0Var;
        this.c = keyboardButton;
        nh.p pVar = new nh.p(context);
        this.a = pVar;
        pVar.r = false;
        pVar.setTextSize(1, 14.0f);
        pVar.setTypeface(org.telegram.messenger.i0.o());
        zs.i(pVar);
        addView(pVar, b6.e(-2, -2, 17));
        zs.i(pVar);
        setTag(keyboardButton);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TL_keyboard.KeyboardButtonStyle keyboardButtonStyle = keyboardButton.style;
        if (keyboardButtonStyle != null && keyboardButtonStyle.icon != 0) {
            spannableStringBuilder.append((CharSequence) "* ");
            spannableStringBuilder.setSpan(new o5(keyboardButton.style.icon, pVar.getPaint().getFontMetricsInt()), 0, 1, 33);
        }
        spannableStringBuilder.append(k6.m(keyboardButton.text, pVar.getPaint().getFontMetricsInt(), false, null, 0));
        ImageView imageView = new ImageView(getContext());
        this.b = imageView;
        a7.t(imageView, t6.Mf, j0Var.a, PorterDuff.Mode.SRC_ATOP);
        if (sf.c.b(keyboardButton)) {
            imageView.setImageResource(R.drawable.bot_webview);
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        addView(imageView, b6.d(12, 12.0f, 53, 0.0f, 8.0f, 8.0f, 0.0f));
        pVar.setText(spannableStringBuilder);
    }

    public final void a() {
        int i10;
        int i11;
        int r12;
        int k10;
        int L = org.telegram.messenger.i0.L(21.0f);
        int L2 = org.telegram.messenger.i0.L(11.0f);
        int i12 = t6.Nf;
        p6 p6Var = this.n.a;
        int w02 = t6.w0(i12, p6Var);
        int w03 = t6.w0(t6.Of, p6Var);
        int w04 = t6.w0(t6.Mf, p6Var);
        TL_keyboard.KeyboardButtonStyle keyboardButtonStyle = this.c.style;
        if (keyboardButtonStyle != null) {
            if (keyboardButtonStyle.bg_primary) {
                r12 = t6.r1(0.8f, t6.w0(t6.Rl, p6Var));
                k10 = i0.b.k(t6.w0(t6.i6, p6Var), r12);
            } else if (keyboardButtonStyle.bg_danger) {
                r12 = t6.r1(0.8f, t6.w0(t6.Sl, p6Var));
                k10 = i0.b.k(t6.w0(t6.i6, p6Var), r12);
            } else if (keyboardButtonStyle.bg_success) {
                r12 = t6.r1(0.8f, t6.w0(t6.Tl, p6Var));
                k10 = i0.b.k(t6.w0(t6.i6, p6Var), r12);
            }
            i10 = r12;
            i11 = k10;
            w04 = -1;
            this.b.setColorFilter(w04);
            this.a.setTextColor(w04);
            boolean z10 = this.d;
            int i13 = (z10 || !this.e) ? L2 : L;
            boolean z11 = this.f;
            setBackground(t6.k0(i13, (z11 || !this.e) ? L2 : L, (z11 || !this.h) ? L2 : L, (z10 || !this.h) ? L2 : L, i10, i11, i11));
        }
        i10 = w02;
        i11 = w03;
        this.b.setColorFilter(w04);
        this.a.setTextColor(w04);
        boolean z102 = this.d;
        if (z102) {
        }
        boolean z112 = this.f;
        setBackground(t6.k0(i13, (z112 || !this.e) ? L2 : L, (z112 || !this.h) ? L2 : L, (z102 || !this.h) ? L2 : L, i10, i11, i11));
    }
}
