package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class qj0 extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate {
    public final pj0 b;
    public final org.telegram.ui.Components.pi0 c;
    public Utilities.Callback d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qj0(Context context, boolean z10, Utilities.Callback callback) {
        super(context, false);
        final int i9 = 0;
        this.d = callback;
        final int i10 = 1;
        LinearLayout f10 = org.telegram.messenger.ll.f(context, 1);
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.Components.pi0 pi0Var = new org.telegram.ui.Components.pi0(context);
        this.c = pi0Var;
        pi0Var.setScaleType(ImageView.ScaleType.CENTER);
        pi0Var.f(R.raw.silent_unmute, 46, 46, null);
        pi0Var.d();
        int dp = AndroidUtilities.dp(72.0f);
        int i11 = org.telegram.ui.ActionBar.f6.Oh;
        pi0Var.setBackground(org.telegram.ui.ActionBar.f6.K(dp, org.telegram.ui.ActionBar.f6.w0(null, i11, false)));
        frameLayout.addView(pi0Var, g7.e6.e(72, 72, 17));
        pj0 pj0Var = new pj0(context);
        this.b = pj0Var;
        frameLayout.addView(pj0Var, g7.e6.d(64, 32.0f, 49, 29.0f, 16.0f, 0.0f, 0.0f));
        pj0Var.a(0);
        frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.oj0
            public final /* synthetic */ qj0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i9) {
                    case 0:
                        org.telegram.ui.Components.pi0 pi0Var2 = this.b.c;
                        if (!pi0Var2.b()) {
                            pi0Var2.setProgress(0.0f);
                            pi0Var2.d();
                            break;
                        }
                        break;
                    default:
                        qj0 qj0Var = this.b;
                        Utilities.Callback callback2 = qj0Var.d;
                        if (callback2 != null) {
                            callback2.run(Boolean.TRUE);
                            qj0Var.d = null;
                        }
                        qj0Var.dismiss();
                        break;
                }
            }
        });
        f10.addView(frameLayout, g7.e6.n(-1, 110));
        TextView textView = new TextView(context);
        int i12 = org.telegram.ui.ActionBar.f6.j5;
        textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i12, false));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 20.0f);
        textView.setGravity(1);
        textView.setPadding(org.telegram.ui.Cells.j2.c(30.0f, R.string.NotificationsPermissionAlertTitle, textView), 0, AndroidUtilities.dp(30.0f), 0);
        f10.addView(textView, g7.e6.n(-1, -2));
        TextView textView2 = new TextView(context);
        textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i12, false));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        textView2.setPadding(org.telegram.ui.Cells.j2.c(30.0f, R.string.NotificationsPermissionAlertSubtitle, textView2), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(21.0f));
        f10.addView(textView2, g7.e6.n(-1, -2));
        f10.addView(new dh.g(context, LocaleController.getString(R.string.NotificationsPermissionAlert1), R.drawable.msg_message_s), g7.e6.n(-1, -2));
        f10.addView(new dh.g(context, LocaleController.getString(R.string.NotificationsPermissionAlert2), R.drawable.msg_members_list2), g7.e6.n(-1, -2));
        f10.addView(new dh.g(context, LocaleController.getString(R.string.NotificationsPermissionAlert3), R.drawable.msg_customize_s), g7.e6.n(-1, -2));
        setCustomView(f10);
        fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.f6.h5));
        TextView textView3 = new TextView(context);
        textView3.setText(LocaleController.getString(z10 ? R.string.NotificationsPermissionSettings : R.string.NotificationsPermissionContinue));
        textView3.setGravity(17);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Sh, false));
        textView3.setBackground(org.telegram.ui.ActionBar.v5.e(new float[]{24.0f}, org.telegram.ui.ActionBar.f6.w0(null, i11, false)));
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.oj0
            public final /* synthetic */ qj0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        org.telegram.ui.Components.pi0 pi0Var2 = this.b.c;
                        if (!pi0Var2.b()) {
                            pi0Var2.setProgress(0.0f);
                            pi0Var2.d();
                            break;
                        }
                        break;
                    default:
                        qj0 qj0Var = this.b;
                        Utilities.Callback callback2 = qj0Var.d;
                        if (callback2 != null) {
                            callback2.run(Boolean.TRUE);
                            qj0Var.d = null;
                        }
                        qj0Var.dismiss();
                        break;
                }
            }
        });
        f10.addView(textView3, g7.e6.k(14.0f, 14.0f, 14.0f, 10.0f, -1, 48));
        while (i9 < 4) {
            try {
                NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.updateInterfaces);
            } catch (Exception unused) {
            }
            i9++;
        }
    }

    public static void m() {
        long j10 = MessagesController.getGlobalMainSettings().getLong("askNotificationsDuration", 86400000L);
        long currentTimeMillis = System.currentTimeMillis() + j10;
        long j11 = 259200000;
        if (j10 >= 259200000) {
            j11 = 604800000;
            if (j10 >= 604800000) {
                j11 = 2592000000L;
            }
        }
        MessagesController.getGlobalMainSettings().edit().putLong("askNotificationsAfter", currentTimeMillis).putLong("askNotificationsDuration", j11).apply();
    }

    public static boolean n(Activity activity) {
        if (Build.VERSION.SDK_INT < 23 || activity.checkSelfPermission("android.permission.POST_NOTIFICATIONS") == 0) {
            return false;
        }
        long j10 = MessagesController.getGlobalMainSettings().getLong("askNotificationsAfter", -1L);
        if (j10 != -2) {
            return j10 < 0 || System.currentTimeMillis() >= j10;
        }
        return false;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.updateInterfaces) {
            if ((((Integer) objArr[0]).intValue() & MessagesController.UPDATE_MASK_READ_DIALOG_MESSAGE) >= 0) {
                int i11 = 0;
                for (int i12 = 0; i12 < 4; i12++) {
                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i12);
                    if (messagesStorage != null) {
                        i11 = messagesStorage.getMainUnreadCount() + i11;
                    }
                }
                if (this.b.a(i11)) {
                    org.telegram.ui.Components.pi0 pi0Var = this.c;
                    if (pi0Var.b()) {
                        return;
                    }
                    pi0Var.setProgress(0.0f);
                    pi0Var.d();
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        super.dismiss();
        Utilities.Callback callback = this.d;
        if (callback != null) {
            callback.run(Boolean.FALSE);
            this.d = null;
            m();
        }
        for (int i9 = 0; i9 < 4; i9++) {
            try {
                NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.updateInterfaces);
            } catch (Exception unused) {
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void show() {
        super.show();
        System.currentTimeMillis();
    }
}
