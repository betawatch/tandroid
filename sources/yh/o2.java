package yh;

import ai.ha;
import ai.y9;
import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Wallet.e8;
import w7.d6;
import w7.z5;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class o2 extends org.telegram.ui.ActionBar.h3 {
    public long b;

    public o2(Context context, long j10, TL_stars.SavedStarGift savedStarGift, g6 g6Var, Utilities.Callback0Return callback0Return) {
        super(1, context, g6Var, false);
        this.b = 0L;
        fixNavigationBar();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        TextView b10 = d6.b(context, 20.0f, k6.G6, true, g6Var);
        b10.setText(LocaleController.getString(R.string.Gift2UnpinAlertTitle));
        linearLayout.addView(b10, z5.k(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
        TextView b11 = d6.b(context, 14.0f, k6.y6, false, g6Var);
        b11.setText(LocaleController.getString(R.string.Gift2UnpinAlertSubtitle));
        linearLayout.addView(b11, z5.k(22.0f, 4.33f, 22.0f, 10.0f, -1, -2));
        ei.d dVar = new ei.d(context, g6Var, true);
        y9 G = ha.y(this.currentAccount, false).G(j10, true);
        n2 n2Var = new n2(context, this.currentAccount, 0, false, new org.telegram.ui.Wallet.r1(7, this, G), new e8(26, this, dVar), null, g6Var);
        n2Var.setSpanCount(3);
        n2Var.setOverScrollMode(2);
        n2Var.setScrollEnabled(false);
        linearLayout.addView(n2Var, z5.k(11.0f, 0.0f, 11.0f, 0.0f, -1, -2));
        dVar.i(LocaleController.getString(R.string.Gift2UnpinAlertButton), false, true);
        linearLayout.addView(dVar, z5.k(22.0f, 9.0f, 22.0f, 9.0f, -1, 48));
        dVar.setEnabled(false);
        dVar.setOnClickListener(new ci.b4(this, G, savedStarGift, callback0Return, 16));
        setCustomView(linearLayout);
    }
}
