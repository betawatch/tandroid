package sh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.ImageView;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.u5;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class j0 extends FrameLayout {
    public final jh.s a;
    public final ImageView b;
    public final TL_keyboard.KeyboardButton c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean h;
    public final /* synthetic */ l0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(l0 l0Var, Context context, TL_keyboard.KeyboardButton keyboardButton) {
        super(context);
        this.n = l0Var;
        this.c = keyboardButton;
        jh.s sVar = new jh.s(context);
        this.a = sVar;
        sVar.f = false;
        sVar.setTextSize(1, 14.0f);
        sVar.setTypeface(AndroidUtilities.bold());
        NotificationCenter.listenEmojiLoading(sVar);
        addView(sVar, c6.e(-2, -2, 17));
        NotificationCenter.listenEmojiLoading(sVar);
        setTag(keyboardButton);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TL_keyboard.KeyboardButtonStyle keyboardButtonStyle = keyboardButton.style;
        if (keyboardButtonStyle != null && keyboardButtonStyle.icon != 0) {
            spannableStringBuilder.append((CharSequence) "* ");
            spannableStringBuilder.setSpan(new u5(keyboardButton.style.icon, sVar.getPaint().getFontMetricsInt()), 0, 1, 33);
        }
        spannableStringBuilder.append(Emoji.replaceEmoji(keyboardButton.text, sVar.getPaint().getFontMetricsInt(), false));
        ImageView imageView = new ImageView(getContext());
        this.b = imageView;
        imageView.setColorFilter(k6.v0(k6.Xe, l0Var.a));
        if (mf.c.b(keyboardButton)) {
            imageView.setImageResource(R.drawable.bot_webview);
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        addView(imageView, c6.d(12, 12.0f, 53, 0.0f, 8.0f, 8.0f, 0.0f));
        sVar.setText(spannableStringBuilder);
    }

    public final void a() {
        int i10;
        int i11;
        int l1;
        int h;
        int dp = AndroidUtilities.dp(21.0f);
        int dp2 = AndroidUtilities.dp(11.0f);
        int i12 = k6.Ye;
        g6 g6Var = this.n.a;
        int v02 = k6.v0(i12, g6Var);
        int v03 = k6.v0(k6.Ze, g6Var);
        int v04 = k6.v0(k6.Xe, g6Var);
        TL_keyboard.KeyboardButtonStyle keyboardButtonStyle = this.c.style;
        if (keyboardButtonStyle != null) {
            if (keyboardButtonStyle.bg_primary) {
                l1 = k6.l1(0.8f, k6.v0(k6.dl, g6Var));
                h = i0.a.h(k6.v0(k6.i6, g6Var), l1);
            } else if (keyboardButtonStyle.bg_danger) {
                l1 = k6.l1(0.8f, k6.v0(k6.el, g6Var));
                h = i0.a.h(k6.v0(k6.i6, g6Var), l1);
            } else if (keyboardButtonStyle.bg_success) {
                l1 = k6.l1(0.8f, k6.v0(k6.fl, g6Var));
                h = i0.a.h(k6.v0(k6.i6, g6Var), l1);
            }
            i10 = l1;
            i11 = h;
            v04 = -1;
            this.b.setColorFilter(v04);
            this.a.setTextColor(v04);
            boolean z4 = this.d;
            int i13 = (z4 || !this.e) ? dp2 : dp;
            boolean z10 = this.f;
            setBackground(k6.i0(i13, (z10 || !this.e) ? dp2 : dp, (z10 || !this.h) ? dp2 : dp, (z4 || !this.h) ? dp2 : dp, i10, i11, i11));
        }
        i10 = v02;
        i11 = v03;
        this.b.setColorFilter(v04);
        this.a.setTextColor(v04);
        boolean z42 = this.d;
        if (z42) {
        }
        boolean z102 = this.f;
        setBackground(k6.i0(i13, (z102 || !this.e) ? dp2 : dp, (z102 || !this.h) ? dp2 : dp, (z42 || !this.h) ? dp2 : dp, i10, i11, i11));
    }
}
