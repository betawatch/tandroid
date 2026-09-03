package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class wg1 extends FrameLayout {
    public final fg.b1 a;

    public wg1(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        LinearLayout linearLayout = new LinearLayout(context);
        addView(linearLayout, k7.c6.e(-1, -2, 80));
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        textView.setTextColor(i0.a.k(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G6, g6Var), 100));
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        textView.setText(LocaleController.getString(R.string.UnlockPremiumStickersDescription));
        linearLayout.addView(textView, k7.c6.t(-1, -2, 0, 16, 17, 17, 16));
        fg.b1 b1Var = new fg.b1(context, g6Var, false);
        this.a = b1Var;
        String string = LocaleController.getString(R.string.UnlockPremiumStickers);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d ").setSpan(new org.telegram.ui.Components.oq(0, context.getDrawable(R.drawable.msg_premium_normal)), 0, 1, 0);
        spannableStringBuilder.append((CharSequence) string);
        b1Var.d.setText(spannableStringBuilder);
        linearLayout.addView(b1Var, k7.c6.t(-1, 48, 0, 16, 0, 16, 16));
    }
}
