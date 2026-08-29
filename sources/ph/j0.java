package ph;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.ImageView;
import i7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.y5;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class j0 extends FrameLayout {
    public final gh.s a;
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
        gh.s sVar = new gh.s(context);
        this.a = sVar;
        sVar.f = false;
        sVar.setTextSize(1, 14.0f);
        sVar.setTypeface(AndroidUtilities.bold());
        NotificationCenter.listenEmojiLoading(sVar);
        addView(sVar, f6.e(-2, -2, 17));
        NotificationCenter.listenEmojiLoading(sVar);
        setTag(keyboardButton);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TL_keyboard.KeyboardButtonStyle keyboardButtonStyle = keyboardButton.style;
        if (keyboardButtonStyle != null && keyboardButtonStyle.icon != 0) {
            spannableStringBuilder.append((CharSequence) "* ");
            spannableStringBuilder.setSpan(new y5(keyboardButton.style.icon, sVar.getPaint().getFontMetricsInt()), 0, 1, 33);
        }
        spannableStringBuilder.append(Emoji.replaceEmoji(keyboardButton.text, sVar.getPaint().getFontMetricsInt(), false));
        ImageView imageView = new ImageView(getContext());
        this.b = imageView;
        imageView.setColorFilter(g6.v0(g6.Xe, l0Var.a));
        if (kf.c.b(keyboardButton)) {
            imageView.setImageResource(R.drawable.bot_webview);
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        addView(imageView, f6.d(12, 12.0f, 53, 0.0f, 8.0f, 8.0f, 0.0f));
        sVar.setText(spannableStringBuilder);
    }

    public final void a() {
        int i10;
        int i11;
        int l1;
        int h;
        int dp = AndroidUtilities.dp(21.0f);
        int dp2 = AndroidUtilities.dp(11.0f);
        int i12 = g6.Ye;
        c6 c6Var = this.n.a;
        int v02 = g6.v0(i12, c6Var);
        int v03 = g6.v0(g6.Ze, c6Var);
        int v04 = g6.v0(g6.Xe, c6Var);
        TL_keyboard.KeyboardButtonStyle keyboardButtonStyle = this.c.style;
        if (keyboardButtonStyle != null) {
            if (keyboardButtonStyle.bg_primary) {
                l1 = g6.l1(0.8f, g6.v0(g6.dl, c6Var));
                h = i0.a.h(g6.v0(g6.i6, c6Var), l1);
            } else if (keyboardButtonStyle.bg_danger) {
                l1 = g6.l1(0.8f, g6.v0(g6.el, c6Var));
                h = i0.a.h(g6.v0(g6.i6, c6Var), l1);
            } else if (keyboardButtonStyle.bg_success) {
                l1 = g6.l1(0.8f, g6.v0(g6.fl, c6Var));
                h = i0.a.h(g6.v0(g6.i6, c6Var), l1);
            }
            i10 = l1;
            i11 = h;
            v04 = -1;
            this.b.setColorFilter(v04);
            this.a.setTextColor(v04);
            boolean z10 = this.d;
            int i13 = (z10 || !this.e) ? dp2 : dp;
            boolean z11 = this.f;
            setBackground(g6.i0(i13, (z11 || !this.e) ? dp2 : dp, (z11 || !this.h) ? dp2 : dp, (z10 || !this.h) ? dp2 : dp, i10, i11, i11));
        }
        i10 = v02;
        i11 = v03;
        this.b.setColorFilter(v04);
        this.a.setTextColor(v04);
        boolean z102 = this.d;
        if (z102) {
        }
        boolean z112 = this.f;
        setBackground(g6.i0(i13, (z112 || !this.e) ? dp2 : dp, (z112 || !this.h) ? dp2 : dp, (z102 || !this.h) ? dp2 : dp, i10, i11, i11));
    }
}
