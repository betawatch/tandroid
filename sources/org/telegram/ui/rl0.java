package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class rl0 extends org.telegram.ui.Components.t61 {
    public static final /* synthetic */ int a = 0;

    static {
        org.telegram.ui.Components.t61.setup(new rl0());
    }

    @Override // org.telegram.ui.Components.t61
    public final void bindView(View view, org.telegram.ui.Components.u61 u61Var, boolean z10, org.telegram.ui.Components.k71 k71Var, org.telegram.ui.Components.s71 s71Var) {
        sl0 sl0Var = (sl0) view;
        TL_account.Passkey passkey = (TL_account.Passkey) u61Var.G;
        View.OnClickListener onClickListener = u61Var.D;
        TextView textView = sl0Var.n;
        TextView textView2 = sl0Var.h;
        org.telegram.ui.ActionBar.u6 u6Var = sl0Var.d;
        FrameLayout frameLayout = sl0Var.e;
        org.telegram.ui.Components.y9 y9Var = sl0Var.f;
        sl0Var.v = passkey.id;
        long j10 = passkey.software_emoji_id;
        if (j10 != 0) {
            y9Var.setAnimatedEmojiDrawable(org.telegram.ui.Components.t5.n(sl0Var.c, j10, null, 3));
            frameLayout.setBackground(null);
            y9Var.setColorFilter(null);
            sl0Var.a = false;
            y9Var.setScaleX(1.0f);
            y9Var.setScaleY(1.0f);
        } else {
            int dp = AndroidUtilities.dp(4.0f);
            int i10 = org.telegram.ui.ActionBar.y6.G6;
            org.telegram.ui.ActionBar.f7.C(frameLayout, org.telegram.ui.ActionBar.y6.c0(dp, org.telegram.ui.ActionBar.y6.o1(0.04f, org.telegram.ui.ActionBar.y6.w0(i10, u6Var))), org.telegram.ui.ActionBar.f7.L(0.04f, i10), u6Var);
            sl0Var.a();
            y9Var.setImageResource(R.drawable.msg2_permissions);
            y9Var.setScaleX(0.666f);
            y9Var.setScaleY(0.666f);
            y9Var.setAnimatedEmojiDrawable(null);
        }
        if (TextUtils.isEmpty(passkey.name)) {
            textView2.setText(LocaleController.getString(R.string.PasskeyUnknown));
        } else {
            textView2.setText(passkey.name);
        }
        int i11 = passkey.last_usage_date;
        if (i11 != 0) {
            textView.setText(LocaleController.formatString(R.string.PasskeyLastUsedOn, LocaleController.formatDateTime(i11, false)));
        } else {
            textView.setText(LocaleController.formatString(R.string.PasskeyCreatedOn, LocaleController.formatDateTime(passkey.date, false)));
        }
        sl0Var.r.setOnClickListener(onClickListener);
        sl0Var.s = z10;
        sl0Var.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.t61
    public final View createView(Context context, org.telegram.ui.Components.nm0 nm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        return new sl0(context, i10, u6Var);
    }
}
