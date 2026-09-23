package rg;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.h6;
import w7.x5;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class a extends LinearLayout {
    public a(Context context) {
        super(context);
        setOrientation(1);
        setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        TextView g10 = org.telegram.messenger.z0.g(context, 1, 14.0f);
        int i10 = h6.G6;
        g10.setTextColor(h6.w0(null, i10, false));
        g10.setTypeface(AndroidUtilities.bold());
        g10.setText(LocaleController.getString(R.string.AboutPremiumTitle));
        addView(g10);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(h6.w0(null, i10, false));
        org.telegram.messenger.z0.m(R.string.AboutPremiumDescription, textView);
        addView(textView, x5.p(-1, -2, 0.0f, 0, 0, 0, 0, 0));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(h6.w0(null, i10, false));
        org.telegram.messenger.z0.m(R.string.AboutPremiumDescription2, textView2);
        addView(textView2, x5.p(-1, -2, 0.0f, 0, 0, 24, 0, 0));
    }
}
