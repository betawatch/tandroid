package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.provider.Settings;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.NotificationsSettingsFacade;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.Switch;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class w11 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public boolean Z;
    public org.telegram.ui.Components.yl0 a;
    public boolean a0;
    public u11 b;
    public AnimatorSet c;
    public final org.telegram.ui.ActionBar.f6 d;
    public final long e;
    public final long f;
    public final boolean h;
    public boolean n;
    public v11 r;
    public org.telegram.ui.Components.eo s;
    public int v;
    public int w;
    public int x;
    public int y;

    public w11(Bundle bundle, org.telegram.ui.ActionBar.f6 f6Var) {
        super(bundle);
        this.d = f6Var;
        this.e = bundle.getLong("dialog_id");
        this.f = bundle.getLong("topic_id");
        this.h = bundle.getBoolean("exception", false);
    }

    public static /* synthetic */ void U(w11 w11Var, String str, int i10, int i11) {
        MessagesController.getNotificationsSettings(w11Var.currentAccount).edit().putInt("smart_max_count_" + str, i10).putInt("smart_delay_" + str, i11).apply();
        u11 u11Var = w11Var.b;
        if (u11Var != null) {
            u11Var.m(w11Var.H);
        }
    }

    public static void V(final w11 w11Var, Context context, String str, View view, int i10) {
        long j3 = w11Var.f;
        long j10 = w11Var.e;
        org.telegram.ui.ActionBar.f6 f6Var = w11Var.d;
        if (view.isEnabled()) {
            Parcelable parcelable = null;
            final int i11 = 0;
            if (i10 == w11Var.W) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
                String string = LocaleController.getString(R.string.ResetCustomNotificationsAlertTitle);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                b2Var.R = string;
                b2Var.T = LocaleController.getString(R.string.ResetCustomNotificationsAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new r11(w11Var, str));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                w11Var.showDialog(b2Var);
                TextView textView = (TextView) b2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
                    return;
                }
                return;
            }
            if (i10 == w11Var.F) {
                Bundle e = v7.j0.e(j10, "dialog_id");
                e.putLong("topic_id", j3);
                w11Var.presentFragment(new bl0(e, f6Var));
                return;
            }
            final int i12 = 1;
            if (i10 == w11Var.Q) {
                try {
                    Intent intent = new Intent("android.intent.action.RINGTONE_PICKER");
                    intent.putExtra("android.intent.extra.ringtone.TYPE", 1);
                    intent.putExtra("android.intent.extra.ringtone.SHOW_DEFAULT", true);
                    intent.putExtra("android.intent.extra.ringtone.SHOW_SILENT", true);
                    intent.putExtra("android.intent.extra.ringtone.DEFAULT_URI", RingtoneManager.getDefaultUri(1));
                    SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(w11Var.currentAccount);
                    Uri uri = Settings.System.DEFAULT_NOTIFICATION_URI;
                    String path = uri != null ? uri.getPath() : null;
                    String string2 = notificationsSettings.getString("ringtone_path_" + str, path);
                    if (string2 != null && !string2.equals("NoSound")) {
                        parcelable = string2.equals(path) ? uri : Uri.parse(string2);
                    }
                    intent.putExtra("android.intent.extra.ringtone.EXISTING_URI", parcelable);
                    w11Var.startActivityForResult(intent, 13);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            }
            if (i10 == w11Var.G) {
                Activity parentActivity = w11Var.getParentActivity();
                long j11 = w11Var.e;
                long j12 = w11Var.f;
                Runnable runnable = new Runnable(w11Var) { // from class: org.telegram.ui.s11
                    public final /* synthetic */ w11 b;

                    {
                        this.b = w11Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                w11 w11Var2 = this.b;
                                u11 u11Var = w11Var2.b;
                                if (u11Var != null) {
                                    u11Var.m(w11Var2.G);
                                    break;
                                }
                                break;
                            case 1:
                                w11 w11Var3 = this.b;
                                u11 u11Var2 = w11Var3.b;
                                if (u11Var2 != null) {
                                    u11Var2.m(w11Var3.R);
                                    break;
                                }
                                break;
                            case 2:
                                w11 w11Var4 = this.b;
                                u11 u11Var3 = w11Var4.b;
                                if (u11Var3 != null) {
                                    u11Var3.m(w11Var4.I);
                                    break;
                                }
                                break;
                            default:
                                w11 w11Var5 = this.b;
                                u11 u11Var4 = w11Var5.b;
                                if (u11Var4 != null) {
                                    u11Var4.m(w11Var5.U);
                                    break;
                                }
                                break;
                        }
                    }
                };
                org.telegram.ui.ActionBar.f6 f6Var2 = w11Var.d;
                Pattern pattern = org.telegram.ui.Components.d5.a;
                w11Var.showDialog(org.telegram.ui.Components.d5.Y(parentActivity, j11, j12, j11 != 0 ? a4.a.o(j11, "vibrate_") : "vibrate_messages", runnable, f6Var2));
                return;
            }
            int i13 = 16;
            final int i14 = 3;
            if (i10 == w11Var.y) {
                org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
                boolean z10 = !x8Var.e.h;
                w11Var.n = z10;
                x8Var.setChecked(z10);
                int childCount = w11Var.a.getChildCount();
                ArrayList arrayList = new ArrayList();
                while (i11 < childCount) {
                    org.telegram.ui.Components.il0 il0Var = (org.telegram.ui.Components.il0) w11Var.a.U(w11Var.a.getChildAt(i11));
                    int i15 = il0Var.f;
                    View view2 = il0Var.a;
                    int b10 = il0Var.b();
                    if (b10 != w11Var.y && b10 != w11Var.W) {
                        if (i15 == 0) {
                            ((org.telegram.ui.Cells.n4) view2).a(arrayList, w11Var.n);
                        } else if (i15 == 1) {
                            ((org.telegram.ui.Cells.fa) view2).a(arrayList, w11Var.n);
                        } else if (i15 == 2) {
                            ((org.telegram.ui.Cells.f9) view2).c(arrayList, w11Var.n);
                        } else if (i15 == 3) {
                            ((org.telegram.ui.Cells.z8) view2).a(arrayList, w11Var.n);
                        } else if (i15 == 4) {
                            ((org.telegram.ui.Cells.l6) view2).b(arrayList, w11Var.n);
                        } else if (i15 == 7 && b10 == w11Var.E) {
                            ((org.telegram.ui.Cells.x8) view2).e(arrayList, w11Var.n);
                        }
                    }
                    i11++;
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                AnimatorSet animatorSet = w11Var.c;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                w11Var.c = animatorSet2;
                animatorSet2.playTogether(arrayList);
                w11Var.c.addListener(new gp0(w11Var, i13));
                w11Var.c.setDuration(150L);
                w11Var.c.start();
                return;
            }
            if (i10 == w11Var.E) {
                org.telegram.ui.Cells.x8 x8Var2 = (org.telegram.ui.Cells.x8) view;
                Switch r32 = x8Var2.e;
                MessagesController.getNotificationsSettings(w11Var.currentAccount).edit().putBoolean(v7.j0.g(NotificationsSettingsFacade.PROPERTY_CONTENT_PREVIEW, str), !r32.h).apply();
                x8Var2.setChecked(!r32.h);
                return;
            }
            if (i10 == w11Var.R) {
                w11Var.showDialog(org.telegram.ui.Components.d5.Y(w11Var.getParentActivity(), w11Var.e, w11Var.f, v7.j0.g("calls_vibrate_", str), new Runnable(w11Var) { // from class: org.telegram.ui.s11
                    public final /* synthetic */ w11 b;

                    {
                        this.b = w11Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                w11 w11Var2 = this.b;
                                u11 u11Var = w11Var2.b;
                                if (u11Var != null) {
                                    u11Var.m(w11Var2.G);
                                    break;
                                }
                                break;
                            case 1:
                                w11 w11Var3 = this.b;
                                u11 u11Var2 = w11Var3.b;
                                if (u11Var2 != null) {
                                    u11Var2.m(w11Var3.R);
                                    break;
                                }
                                break;
                            case 2:
                                w11 w11Var4 = this.b;
                                u11 u11Var3 = w11Var4.b;
                                if (u11Var3 != null) {
                                    u11Var3.m(w11Var4.I);
                                    break;
                                }
                                break;
                            default:
                                w11 w11Var5 = this.b;
                                u11 u11Var4 = w11Var5.b;
                                if (u11Var4 != null) {
                                    u11Var4.m(w11Var5.U);
                                    break;
                                }
                                break;
                        }
                    }
                }, w11Var.d));
                return;
            }
            if (i10 == w11Var.I) {
                w11Var.showDialog(org.telegram.ui.Components.d5.I(w11Var.getParentActivity(), w11Var.e, w11Var.f, -1, new Runnable(w11Var) { // from class: org.telegram.ui.s11
                    public final /* synthetic */ w11 b;

                    {
                        this.b = w11Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (r2) {
                            case 0:
                                w11 w11Var2 = this.b;
                                u11 u11Var = w11Var2.b;
                                if (u11Var != null) {
                                    u11Var.m(w11Var2.G);
                                    break;
                                }
                                break;
                            case 1:
                                w11 w11Var3 = this.b;
                                u11 u11Var2 = w11Var3.b;
                                if (u11Var2 != null) {
                                    u11Var2.m(w11Var3.R);
                                    break;
                                }
                                break;
                            case 2:
                                w11 w11Var4 = this.b;
                                u11 u11Var3 = w11Var4.b;
                                if (u11Var3 != null) {
                                    u11Var3.m(w11Var4.I);
                                    break;
                                }
                                break;
                            default:
                                w11 w11Var5 = this.b;
                                u11 u11Var4 = w11Var5.b;
                                if (u11Var4 != null) {
                                    u11Var4.m(w11Var5.U);
                                    break;
                                }
                                break;
                        }
                    }
                }, w11Var.d));
                return;
            }
            if (i10 != w11Var.H) {
                if (i10 == w11Var.U) {
                    if (w11Var.getParentActivity() == null) {
                        return;
                    }
                    w11Var.showDialog(org.telegram.ui.Components.d5.u(w11Var.getParentActivity(), w11Var.e, w11Var.f, -1, new Runnable(w11Var) { // from class: org.telegram.ui.s11
                        public final /* synthetic */ w11 b;

                        {
                            this.b = w11Var;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i14) {
                                case 0:
                                    w11 w11Var2 = this.b;
                                    u11 u11Var = w11Var2.b;
                                    if (u11Var != null) {
                                        u11Var.m(w11Var2.G);
                                        break;
                                    }
                                    break;
                                case 1:
                                    w11 w11Var3 = this.b;
                                    u11 u11Var2 = w11Var3.b;
                                    if (u11Var2 != null) {
                                        u11Var2.m(w11Var3.R);
                                        break;
                                    }
                                    break;
                                case 2:
                                    w11 w11Var4 = this.b;
                                    u11 u11Var3 = w11Var4.b;
                                    if (u11Var3 != null) {
                                        u11Var3.m(w11Var4.I);
                                        break;
                                    }
                                    break;
                                default:
                                    w11 w11Var5 = this.b;
                                    u11 u11Var4 = w11Var5.b;
                                    if (u11Var4 != null) {
                                        u11Var4.m(w11Var5.U);
                                        break;
                                    }
                                    break;
                            }
                        }
                    }, w11Var.d));
                    return;
                }
                if (i10 == w11Var.L) {
                    MessagesController.getNotificationsSettings(w11Var.currentAccount).edit().putInt("popup_" + str, 1).apply();
                    ((org.telegram.ui.Cells.l6) view).a(true, true);
                    View findViewWithTag = w11Var.a.findViewWithTag(2);
                    if (findViewWithTag != null) {
                        ((org.telegram.ui.Cells.l6) findViewWithTag).a(false, true);
                        return;
                    }
                    return;
                }
                if (i10 == w11Var.M) {
                    MessagesController.getNotificationsSettings(w11Var.currentAccount).edit().putInt("popup_" + str, 2).apply();
                    ((org.telegram.ui.Cells.l6) view).a(true, true);
                    View findViewWithTag2 = w11Var.a.findViewWithTag(1);
                    if (findViewWithTag2 != null) {
                        ((org.telegram.ui.Cells.l6) findViewWithTag2).a(false, true);
                        return;
                    }
                    return;
                }
                if (i10 == w11Var.O) {
                    org.telegram.ui.Cells.x8 x8Var3 = (org.telegram.ui.Cells.x8) view;
                    boolean z11 = x8Var3.e.h;
                    boolean z12 = !z11;
                    x8Var3.setChecked(z12);
                    SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(w11Var.currentAccount).edit();
                    if (!w11Var.Z || z11) {
                        edit.putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, z12);
                    } else {
                        edit.remove(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str);
                    }
                    edit.apply();
                    w11Var.getNotificationsController().updateServerNotificationsSettings(j10, j3);
                    return;
                }
                return;
            }
            if (w11Var.getParentActivity() == null) {
                return;
            }
            SharedPreferences notificationsSettings2 = MessagesController.getNotificationsSettings(w11Var.currentAccount);
            int c10 = org.telegram.messenger.l0.c("smart_max_count_", str, notificationsSettings2, 2);
            int c11 = org.telegram.messenger.l0.c("smart_delay_", str, notificationsSettings2, 180);
            r14 = c10 != 0 ? c10 : 2;
            Activity parentActivity2 = w11Var.getParentActivity();
            r11 r11Var = new r11(w11Var, str);
            Pattern pattern2 = org.telegram.ui.Components.d5.a;
            if (parentActivity2 == null) {
                return;
            }
            int i16 = org.telegram.ui.ActionBar.j6.j5;
            int f02 = f6Var != null ? f6Var.f0(i16) : org.telegram.ui.ActionBar.j6.w0(null, i16, false);
            int i17 = org.telegram.ui.ActionBar.j6.h5;
            int f03 = f6Var != null ? f6Var.f0(i17) : org.telegram.ui.ActionBar.j6.w0(null, i17, false);
            int i18 = org.telegram.ui.ActionBar.j6.Ji;
            if (f6Var != null) {
                f6Var.f0(i18);
            } else {
                org.telegram.ui.ActionBar.j6.w0(null, i18, false);
            }
            int i19 = org.telegram.ui.ActionBar.j6.Ni;
            if (f6Var != null) {
                f6Var.f0(i19);
            } else {
                org.telegram.ui.ActionBar.j6.w0(null, i19, false);
            }
            int i20 = org.telegram.ui.ActionBar.j6.E8;
            if (f6Var != null) {
                f6Var.f0(i20);
            } else {
                org.telegram.ui.ActionBar.j6.w0(null, i20, false);
            }
            int i21 = org.telegram.ui.ActionBar.j6.G8;
            if (f6Var != null) {
                f6Var.f0(i21);
            } else {
                org.telegram.ui.ActionBar.j6.w0(null, i21, false);
            }
            int i22 = org.telegram.ui.ActionBar.j6.i6;
            if (f6Var != null) {
                f6Var.f0(i22);
            } else {
                org.telegram.ui.ActionBar.j6.w0(null, i22, false);
            }
            int i23 = org.telegram.ui.ActionBar.j6.Sh;
            int f04 = f6Var != null ? f6Var.f0(i23) : org.telegram.ui.ActionBar.j6.w0(null, i23, false);
            int i24 = org.telegram.ui.ActionBar.j6.Oh;
            int f05 = f6Var != null ? f6Var.f0(i24) : org.telegram.ui.ActionBar.j6.w0(null, i24, false);
            int i25 = org.telegram.ui.ActionBar.j6.Qh;
            int f06 = f6Var != null ? f6Var.f0(i25) : org.telegram.ui.ActionBar.j6.w0(null, i25, false);
            org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(parentActivity2, f6Var);
            a3Var.a();
            org.telegram.ui.Components.j4 j4Var = new org.telegram.ui.Components.j4(parentActivity2, f6Var);
            j4Var.setMinValue(0);
            j4Var.setMaxValue(10);
            j4Var.setTextColor(f02);
            j4Var.setValue(r14 - 1);
            j4Var.setWrapSelectorWheel(false);
            j4Var.setFormatter(new es(23));
            org.telegram.ui.Components.k4 k4Var = new org.telegram.ui.Components.k4(parentActivity2, f6Var);
            k4Var.setMinValue(0);
            k4Var.setMaxValue(10);
            k4Var.setTextColor(f02);
            k4Var.setValue((c11 / 60) - 1);
            k4Var.setWrapSelectorWheel(false);
            k4Var.setFormatter(new es(24));
            org.telegram.ui.Components.fd0 fd0Var = new org.telegram.ui.Components.fd0(parentActivity2, f6Var);
            fd0Var.setMinValue(0);
            fd0Var.setMaxValue(0);
            fd0Var.setTextColor(f02);
            fd0Var.setValue(0);
            fd0Var.setWrapSelectorWheel(false);
            fd0Var.setFormatter(new es(25));
            org.telegram.ui.Components.v3 v3Var = new org.telegram.ui.Components.v3(parentActivity2, j4Var, k4Var, fd0Var);
            v3Var.setOrientation(1);
            FrameLayout frameLayout = new FrameLayout(parentActivity2);
            v3Var.addView(frameLayout, w7.y5.t(-1, -2, 51, 22, 0, 0, 4));
            TextView textView2 = new TextView(parentActivity2);
            textView2.setText(LocaleController.getString(R.string.NotfificationsFrequencyTitle));
            textView2.setTextColor(f02);
            textView2.setTextSize(1, 20.0f);
            textView2.setTypeface(AndroidUtilities.bold());
            frameLayout.addView(textView2, w7.y5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
            textView2.setOnTouchListener(new bi.d(10));
            LinearLayout linearLayout = new LinearLayout(parentActivity2);
            linearLayout.setOrientation(0);
            linearLayout.setWeightSum(1.0f);
            v3Var.addView(linearLayout, w7.y5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
            ai.p4 p4Var = new ai.p4(parentActivity2, 18);
            linearLayout.addView(j4Var, w7.y5.l(0.4f, 0, 270));
            linearLayout.addView(fd0Var, w7.y5.o(0, -2, 0.2f, 16));
            linearLayout.addView(k4Var, w7.y5.l(0.4f, 0, 270));
            p4Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            p4Var.setGravity(17);
            p4Var.setTextColor(f04);
            p4Var.setTextSize(1, 14.0f);
            p4Var.setTypeface(AndroidUtilities.bold());
            int dp = AndroidUtilities.dp(8.0f);
            p4Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, f05, f06, f06));
            p4Var.setText(LocaleController.getString(R.string.AutoDeleteConfirm));
            v3Var.addView(p4Var, w7.y5.t(-1, 48, 83, 16, 15, 16, 16));
            es esVar = new es(12);
            j4Var.setOnValueChangedListener(esVar);
            k4Var.setOnValueChangedListener(esVar);
            p4Var.setOnClickListener(new ai.p5(j4Var, k4Var, r11Var, a3Var, 7));
            a3Var.b(v3Var);
            org.telegram.ui.ActionBar.f3 f3Var = a3Var.a;
            f3Var.show();
            f3Var.setBackgroundColor(f03);
            f3Var.fixNavigationBar(f03);
        }
    }

    public static /* synthetic */ void W(w11 w11Var, String str) {
        w11Var.a0 = true;
        MessagesController.getNotificationsSettings(w11Var.currentAccount).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_CUSTOM + str, false).remove(NotificationsSettingsFacade.PROPERTY_NOTIFY + str).apply();
        w11Var.finishFragment();
        v11 v11Var = w11Var.r;
        if (v11Var != null) {
            v11Var.c0();
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.f8;
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        kVar.A(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), false);
        this.actionBar.B(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.v8, f6Var), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        long j3 = this.e;
        long j10 = this.f;
        String sharedPrefKey = NotificationsController.getSharedPrefKey(j3, j10);
        this.actionBar.setActionBarMenuOnItemClick(new t11(this, sharedPrefKey));
        org.telegram.ui.Components.eo eoVar = new org.telegram.ui.Components.eo(context, null, false, f6Var);
        this.s = eoVar;
        eoVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        this.actionBar.addView(this.s, 0, w7.y5.d(-2, -1.0f, 51, !this.inPreviewMode ? 56.0f : 0.0f, 0.0f, 40.0f, 0.0f));
        this.actionBar.setAllowOverlayTitle(false);
        if (j3 >= 0) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(j3));
            if (user != null) {
                this.s.setUserAvatar(user);
                this.s.setTitle(ContactsController.formatName(user.first_name, user.last_name));
            }
        } else if (j10 != 0) {
            TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(-j3, j10);
            ng.d.p(this.s.getAvatarImageView(), findTopic, false, true, f6Var);
            this.s.setTitle(findTopic.title);
        } else {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j3));
            this.s.setChatAvatar(chat);
            this.s.setTitle(chat.title);
        }
        if (this.h) {
            this.s.setSubtitle(LocaleController.getString(R.string.NotificationsNewException));
            this.actionBar.n().e(1, LocaleController.getString(R.string.Done).toUpperCase());
        } else {
            this.s.setSubtitle(LocaleController.getString(R.string.CustomNotifications));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.a7, f6Var));
        org.telegram.ui.Components.yl0 yl0Var = new org.telegram.ui.Components.yl0(context, null);
        this.a = yl0Var;
        yl0Var.q1();
        this.actionBar.setAdaptiveBackground(this.a);
        frameLayout.addView(this.a, w7.y5.c(-1.0f, -1));
        org.telegram.ui.Components.yl0 yl0Var2 = this.a;
        u11 u11Var = new u11(this, context);
        this.b = u11Var;
        yl0Var2.setAdapter(u11Var);
        this.a.setItemAnimator(null);
        this.a.setLayoutAnimation(null);
        this.a.setLayoutManager(new gg.b0(17));
        this.a.setOnItemClickListener(new ac1(this, context, sharedPrefKey, 1));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.notificationsSettingsUpdated) {
            try {
                this.b.l();
            } catch (Exception unused) {
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final org.telegram.ui.ActionBar.f6 getResourceProvider() {
        return this.d;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        wy0 wy0Var = new wy0(1, this);
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 16, new Class[]{org.telegram.ui.Cells.n4.class, org.telegram.ui.Cells.fa.class, org.telegram.ui.Cells.z8.class, org.telegram.ui.Cells.l6.class, org.telegram.ui.Cells.za.class, org.telegram.ui.Cells.x8.class, org.telegram.ui.Cells.t8.class}, null, null, null, org.telegram.ui.ActionBar.j6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.s8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.k0, null, null, org.telegram.ui.ActionBar.j6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.n4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.fa.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.fa.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.l6.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 8192, new Class[]{org.telegram.ui.Cells.l6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.g7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 16384, new Class[]{org.telegram.ui.Cells.l6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.h7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.z6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.za.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.za.class}, new String[]{"statusColor"}, null, null, -1, wy0Var, org.telegram.ui.ActionBar.j6.y6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.za.class}, new String[]{"statusOnlineColor"}, null, null, -1, wy0Var, org.telegram.ui.ActionBar.j6.n6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.za.class}, null, org.telegram.ui.ActionBar.j6.r0, null, org.telegram.ui.ActionBar.j6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, wy0Var, org.telegram.ui.ActionBar.j6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, wy0Var, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, wy0Var, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, wy0Var, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, wy0Var, org.telegram.ui.ActionBar.j6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, wy0Var, org.telegram.ui.ActionBar.j6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, wy0Var, org.telegram.ui.ActionBar.j6.U7));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        String str;
        Ringtone ringtone;
        if (i11 != -1 || intent == null) {
            return;
        }
        Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
        if (uri == null || (ringtone = RingtoneManager.getRingtone(ApplicationLoader.applicationContext, uri)) == null) {
            str = null;
        } else {
            str = i10 == 13 ? uri.equals(Settings.System.DEFAULT_RINGTONE_URI) ? LocaleController.getString(R.string.DefaultRingtone) : ringtone.getTitle(getParentActivity()) : uri.equals(Settings.System.DEFAULT_NOTIFICATION_URI) ? LocaleController.getString(R.string.SoundDefault) : ringtone.getTitle(getParentActivity());
            ringtone.stop();
        }
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(this.currentAccount).edit();
        String sharedPrefKey = NotificationsController.getSharedPrefKey(this.e, this.f);
        if (i10 == 12) {
            if (str != null) {
                edit.putString("sound_" + sharedPrefKey, str);
                edit.putString("sound_path_" + sharedPrefKey, uri.toString());
            } else {
                edit.putString("sound_" + sharedPrefKey, "NoSound");
                edit.putString("sound_path_" + sharedPrefKey, "NoSound");
            }
            getNotificationsController().deleteNotificationChannel(this.e, this.f);
        } else if (i10 == 13) {
            if (str != null) {
                edit.putString("ringtone_" + sharedPrefKey, str);
                edit.putString("ringtone_path_" + sharedPrefKey, uri.toString());
            } else {
                edit.putString("ringtone_" + sharedPrefKey, "NoSound");
                edit.putString("ringtone_path_" + sharedPrefKey, "NoSound");
            }
        }
        edit.apply();
        u11 u11Var = this.b;
        if (u11Var != null) {
            u11Var.m(i10 == 13 ? this.Q : this.F);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010f  */
    @Override // org.telegram.ui.ActionBar.n2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onFragmentCreate() {
        boolean z10;
        long j3 = this.e;
        if (DialogObject.isUserDialog(j3)) {
            ArrayList<TLRPC.TL_topPeer> arrayList = getMediaDataController().hints;
            int i10 = 0;
            while (true) {
                if (i10 >= arrayList.size()) {
                    break;
                }
                TLRPC.Peer peer = arrayList.get(i10).peer;
                if ((peer instanceof TLRPC.TL_peerUser) && peer.user_id == j3) {
                    this.Z = i10 < 5;
                } else {
                    i10++;
                }
            }
        }
        this.Y = 0;
        boolean z11 = this.h;
        if (z11) {
            this.w = 0;
            this.Y = 1 + 1;
            this.x = 1;
        } else {
            this.w = -1;
            this.x = -1;
        }
        int i11 = this.Y;
        int i12 = i11 + 1;
        this.Y = i12;
        this.v = i11;
        long j10 = this.f;
        if (z11 || j10 != 0) {
            this.Y = i11 + 2;
            this.y = i12;
        } else {
            this.y = -1;
        }
        this.O = -1;
        if (DialogObject.isEncryptedDialog(j3)) {
            this.E = -1;
        } else {
            int i13 = this.Y;
            this.Y = i13 + 1;
            this.E = i13;
            if (DialogObject.isUserDialog(j3)) {
                int i14 = this.Y;
                this.Y = i14 + 1;
                this.O = i14;
            }
        }
        int i15 = this.Y;
        this.F = i15;
        this.Y = i15 + 2;
        this.G = i15 + 1;
        if (DialogObject.isChatDialog(j3)) {
            int i16 = this.Y;
            this.Y = i16 + 1;
            this.H = i16;
        } else {
            this.H = -1;
        }
        int i17 = this.Y;
        this.I = i17;
        this.Y = i17 + 2;
        this.J = i17 + 1;
        if (DialogObject.isChatDialog(j3)) {
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j3));
            if (ChatObject.isChannel(chat) && !chat.megagroup) {
                z10 = true;
                if (!DialogObject.isEncryptedDialog(j3) || z10) {
                    this.K = -1;
                    this.L = -1;
                    this.M = -1;
                    this.N = -1;
                } else {
                    int i18 = this.Y;
                    this.K = i18;
                    this.L = i18 + 1;
                    this.M = i18 + 2;
                    this.Y = i18 + 4;
                    this.N = i18 + 3;
                }
                if (DialogObject.isUserDialog(j3)) {
                    this.P = -1;
                    this.R = -1;
                    this.Q = -1;
                    this.S = -1;
                } else {
                    int i19 = this.Y;
                    this.P = i19;
                    this.R = i19 + 1;
                    this.Q = i19 + 2;
                    this.Y = i19 + 4;
                    this.S = i19 + 3;
                }
                int i20 = this.Y;
                this.T = i20;
                this.U = i20 + 1;
                int i21 = i20 + 3;
                this.Y = i21;
                this.V = i20 + 2;
                if (z11) {
                    this.W = i21;
                    this.Y = i20 + 5;
                    this.X = i20 + 4;
                } else {
                    this.W = -1;
                    this.X = -1;
                }
                boolean isGlobalNotificationsEnabled = NotificationsController.getInstance(this.currentAccount).isGlobalNotificationsEnabled(j3, false, false);
                if (z11) {
                    SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.currentAccount);
                    String sharedPrefKey = NotificationsController.getSharedPrefKey(j3, j10);
                    boolean contains = notificationsSettings.contains(NotificationsSettingsFacade.PROPERTY_NOTIFY + sharedPrefKey);
                    int c10 = org.telegram.messenger.l0.c(NotificationsSettingsFacade.PROPERTY_NOTIFY, sharedPrefKey, notificationsSettings, 0);
                    if (c10 == 0) {
                        if (contains) {
                            this.n = true;
                        } else {
                            this.n = NotificationsController.getInstance(this.currentAccount).isGlobalNotificationsEnabled(j3, false, false);
                        }
                    } else if (c10 == 1) {
                        this.n = true;
                    } else if (c10 == 2) {
                        this.n = false;
                    } else {
                        this.n = false;
                    }
                } else {
                    this.n = !isGlobalNotificationsEnabled;
                }
                NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.notificationsSettingsUpdated);
                return super.onFragmentCreate();
            }
        }
        z10 = false;
        if (DialogObject.isEncryptedDialog(j3)) {
        }
        this.K = -1;
        this.L = -1;
        this.M = -1;
        this.N = -1;
        if (DialogObject.isUserDialog(j3)) {
        }
        int i202 = this.Y;
        this.T = i202;
        this.U = i202 + 1;
        int i212 = i202 + 3;
        this.Y = i212;
        this.V = i202 + 2;
        if (z11) {
        }
        boolean isGlobalNotificationsEnabled2 = NotificationsController.getInstance(this.currentAccount).isGlobalNotificationsEnabled(j3, false, false);
        if (z11) {
        }
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.notificationsSettingsUpdated);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.a0) {
            String sharedPrefKey = NotificationsController.getSharedPrefKey(this.e, this.f);
            MessagesController.getNotificationsSettings(this.currentAccount).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_CUSTOM + sharedPrefKey, true).apply();
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.notificationsSettingsUpdated);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.a.setPadding(0, 0, 0, i13);
        this.a.setClipToPadding(false);
    }
}
