package rg;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.j6;
import w7.y5;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class a extends LinearLayout {
    public a(Context context) {
        super(context);
        setOrientation(1);
        setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        TextView f7 = org.telegram.messenger.l0.f(context, 1, 14.0f);
        int i10 = j6.G6;
        f7.setTextColor(j6.w0(null, i10, false));
        f7.setTypeface(AndroidUtilities.bold());
        f7.setText(LocaleController.getString(R.string.AboutPremiumTitle));
        addView(f7);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(j6.w0(null, i10, false));
        org.telegram.messenger.l0.l(R.string.AboutPremiumDescription, textView);
        addView(textView, y5.p(-1, -2, 0.0f, 0, 0, 0, 0, 0));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(j6.w0(null, i10, false));
        org.telegram.messenger.l0.l(R.string.AboutPremiumDescription2, textView2);
        addView(textView2, y5.p(-1, -2, 0.0f, 0, 0, 24, 0, 0));
    }
}
