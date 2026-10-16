package yh;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.b5;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import w7.d6;
import w7.z5;
import zh.f5;
import zh.n5;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class p2 extends org.telegram.ui.ActionBar.e3 {
    public long b;

    public p2(Context context, long j10, TL_stars.SavedStarGift savedStarGift, c6 c6Var, Utilities.Callback0Return callback0Return) {
        super(1, context, c6Var, false);
        this.b = 0L;
        fixNavigationBar();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        TextView b10 = d6.b(context, 20.0f, g6.G6, true, c6Var);
        b10.setText(LocaleController.getString(R.string.Gift2UnpinAlertTitle));
        linearLayout.addView(b10, z5.k(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
        TextView b11 = d6.b(context, 14.0f, g6.y6, false, c6Var);
        b11.setText(LocaleController.getString(R.string.Gift2UnpinAlertSubtitle));
        linearLayout.addView(b11, z5.k(22.0f, 4.33f, 22.0f, 10.0f, -1, -2));
        di.d dVar = new di.d(context, c6Var, true);
        f5 G = n5.y(this.currentAccount, false).G(j10, true);
        o2 o2Var = new o2(context, this.currentAccount, 0, false, new rh.r(2, this, G), new org.telegram.ui.web.o0(22, this, dVar), null, c6Var);
        o2Var.setSpanCount(3);
        o2Var.setOverScrollMode(2);
        o2Var.setScrollEnabled(false);
        linearLayout.addView(o2Var, z5.k(11.0f, 0.0f, 11.0f, 0.0f, -1, -2));
        dVar.g(LocaleController.getString(R.string.Gift2UnpinAlertButton), false, true);
        linearLayout.addView(dVar, z5.k(22.0f, 9.0f, 22.0f, 9.0f, -1, 48));
        dVar.setEnabled(false);
        dVar.setOnClickListener(new b5(this, G, savedStarGift, callback0Return, 16));
        setCustomView(linearLayout);
    }
}
