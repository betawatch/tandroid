package org.telegram.ui;

import android.app.Activity;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class x91 extends org.telegram.ui.ActionBar.f3 {
    public static x91 b;

    public static /* synthetic */ void n(x91 x91Var, cy cyVar) {
        if (cyVar.getParentActivity() == null) {
            return;
        }
        MessagesController.getInstance(x91Var.currentAccount).clearQueryTime();
        cyVar.getMessagesStorage().clearLocalDatabase();
    }

    public static void o(cy cyVar) {
        if (b == null) {
            x91 x91Var = new x91(cyVar.getParentActivity(), false);
            Activity parentActivity = cyVar.getParentActivity();
            LinearLayout e = org.telegram.messenger.g0.e(parentActivity, 1);
            org.telegram.ui.Components.tx0 tx0Var = new org.telegram.ui.Components.tx0(parentActivity, x91Var.currentAccount);
            tx0Var.setStickerNum(7);
            tx0Var.getImageReceiver().setAutoRepeat(1);
            e.addView(tx0Var, w7.z5.t(144, 144, 1, 0, 16, 0, 0));
            TextView textView = new TextView(parentActivity);
            textView.setGravity(8388611);
            int i10 = org.telegram.ui.ActionBar.h6.j5;
            org.telegram.messenger.g0.m(20.0f, org.telegram.ui.ActionBar.h6.x0(null, i10, false), 1, textView);
            textView.setText(LocaleController.getString(R.string.SuggestClearDatabaseTitle));
            e.addView(textView, w7.z5.d(-1, -2.0f, 0, 21.0f, 30.0f, 21.0f, 0.0f));
            TextView textView2 = new TextView(parentActivity);
            textView2.setGravity(8388611);
            textView2.setTextSize(1, 15.0f);
            textView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
            textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString("SuggestClearDatabaseMessage", R.string.SuggestClearDatabaseMessage, AndroidUtilities.formatFileSize(cyVar.getMessagesStorage().getDatabaseSize()))));
            e.addView(textView2, w7.z5.d(-1, -2.0f, 0, 21.0f, 15.0f, 21.0f, 16.0f));
            TextView textView3 = new TextView(parentActivity);
            textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            textView3.setGravity(17);
            textView3.setTextSize(1, 14.0f);
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setText(LocaleController.getString(R.string.ClearLocalDatabase));
            textView3.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Sh, false));
            int dp = AndroidUtilities.dp(6.0f);
            int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Oh, false);
            int o10 = i0.a.o(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.d6, false), 120);
            textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.j0(dp, dp, dp, dp, x02, o10, o10));
            e.addView(textView3, w7.z5.d(-1, 48.0f, 0, 16.0f, 15.0f, 16.0f, 16.0f));
            textView3.setOnClickListener(new cf0(18, x91Var, cyVar));
            ScrollView scrollView = new ScrollView(parentActivity);
            scrollView.addView(e);
            x91Var.setCustomView(scrollView);
            b = x91Var;
            x91Var.show();
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        super.dismiss();
        b = null;
    }
}
