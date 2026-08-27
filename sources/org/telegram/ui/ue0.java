package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ue0 extends org.telegram.ui.Components.ev0 {
    public final /* synthetic */ ig0 A;
    public final org.telegram.ui.Components.ri0 a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public w5 h;
    public Bundle n;
    public String r;
    public String s;
    public String v;
    public int w;
    public int x;
    public Boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ue0(ig0 ig0Var, Context context) {
        super(context);
        this.A = ig0Var;
        setOrientation(1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.Components.ri0 ri0Var = new org.telegram.ui.Components.ri0(context);
        this.a = ri0Var;
        ri0Var.setAutoRepeat(true);
        ri0Var.f(R.raw.sandclock, 120, 120, null);
        frameLayout.addView(ri0Var, h7.z5.e(120, 120, 1));
        Point point = AndroidUtilities.displaySize;
        frameLayout.setVisibility((point.x <= point.y || AndroidUtilities.isTablet()) ? 0 : 8);
        linearLayout.addView(frameLayout, h7.z5.e(-1, -2, 1));
        TextView textView = new TextView(context);
        this.b = textView;
        org.telegram.ui.Cells.pa.m(18.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.ResetAccount));
        textView.setGravity(17);
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        linearLayout.addView(textView, h7.z5.d(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.c = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        linearLayout.addView(textView2, h7.z5.t(-2, -2, 1, 12, 8, 12, 0));
        addView(linearLayout, h7.z5.l(1.0f, -1, 0));
        TextView textView3 = new TextView(context);
        this.f = textView3;
        textView3.setGravity(1);
        textView3.setText(LocaleController.getString("ResetAccountStatus", R.string.ResetAccountStatus));
        textView3.setTextSize(1, 14.0f);
        textView3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView3, h7.z5.t(-2, -2, 49, 0, 24, 0, 0));
        TextView textView4 = new TextView(context);
        this.e = textView4;
        textView4.setGravity(1);
        textView4.setTextSize(1, 20.0f);
        textView4.setTypeface(AndroidUtilities.bold());
        textView4.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView4, h7.z5.t(-2, -2, 1, 0, 8, 0, 0));
        TextView textView5 = new TextView(context);
        this.d = textView5;
        textView5.setGravity(17);
        textView5.setText(LocaleController.getString(R.string.ResetAccount));
        textView5.setTypeface(AndroidUtilities.bold());
        textView5.setTextSize(1, 15.0f);
        textView5.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView5.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        textView5.setTextColor(-1);
        addView(textView5, h7.z5.t(-1, 50, 1, 16, 32, 16, 48));
        textView5.setOnClickListener(new u50(this, 7));
    }

    @Override // org.telegram.ui.Components.ev0
    public final boolean b() {
        return true;
    }

    @Override // org.telegram.ui.Components.ev0
    public final boolean c(boolean z10) {
        this.A.k1(true, true);
        AndroidUtilities.cancelRunOnUIThread(this.h);
        this.h = null;
        this.n = null;
        return true;
    }

    @Override // org.telegram.ui.Components.ev0
    public String getHeaderName() {
        return LocaleController.getString("ResetAccount", R.string.ResetAccount);
    }

    @Override // org.telegram.ui.Components.ev0
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("resetview_params");
        this.n = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
    }

    @Override // org.telegram.ui.Components.ev0
    public final void l(Bundle bundle) {
        Bundle bundle2 = this.n;
        if (bundle2 != null) {
            bundle.putBundle("resetview_params", bundle2);
        }
    }

    @Override // org.telegram.ui.Components.ev0
    public final void m(Bundle bundle, boolean z10) {
        if (bundle == null) {
            return;
        }
        this.n = bundle;
        this.r = bundle.getString("phoneFormated");
        this.s = bundle.getString("phoneHash");
        this.v = bundle.getString("code");
        this.w = bundle.getInt("startTime");
        this.x = bundle.getInt("waitTime");
        this.c.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ResetAccountInfo", R.string.ResetAccountInfo, LocaleController.addNbsp(oe.b.c().b("+" + this.r)))));
        o();
        w5 w5Var = new w5(this, 9);
        this.h = w5Var;
        AndroidUtilities.runOnUIThread(w5Var, 1000L);
    }

    @Override // org.telegram.ui.Components.ev0
    public final void n() {
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        this.b.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        this.c.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        this.f.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        this.e.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        int dp = AndroidUtilities.dp(6.0f);
        int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Wh, false);
        int w03 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Q9, false);
        this.d.setBackground(org.telegram.ui.ActionBar.g6.i0(dp, dp, dp, dp, w02, w03, w03));
    }

    public final void o() {
        int i10;
        int i11 = this.x;
        i10 = ((org.telegram.ui.ActionBar.n2) this.A).currentAccount;
        int max = Math.max(0, i11 - (ConnectionsManager.getInstance(i10).getCurrentTime() - this.w));
        int i12 = max / 86400;
        int round = Math.round(max / 86400.0f);
        int i13 = max / 3600;
        int i14 = (max / 60) % 60;
        int i15 = max % 60;
        TextView textView = this.e;
        if (i12 >= 2) {
            textView.setText(LocaleController.formatPluralString("Days", round, new Object[0]));
        } else {
            textView.setText(String.format(Locale.getDefault(), "%02d:%02d:%02d", Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(i15)));
        }
        boolean z10 = max == 0;
        Boolean bool = this.y;
        if (bool == null || bool.booleanValue() != z10) {
            org.telegram.ui.Components.ri0 ri0Var = this.a;
            if (z10) {
                ri0Var.getAnimatedDrawable().I(0);
            } else {
                ri0Var.setAutoRepeat(true);
                if (!ri0Var.b()) {
                    ri0Var.d();
                }
            }
            textView.setVisibility(z10 ? 4 : 0);
            this.f.setVisibility(z10 ? 4 : 0);
            this.d.setVisibility(z10 ? 0 : 4);
            this.y = Boolean.valueOf(z10);
        }
    }
}
