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

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class z01 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
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
    public org.telegram.ui.Components.im0 a;
    public boolean a0;
    public x01 b;
    public AnimatorSet c;
    public final org.telegram.ui.ActionBar.d6 d;
    public final long e;
    public final long f;
    public final boolean h;
    public boolean n;
    public y01 r;
    public org.telegram.ui.Components.oo s;
    public int v;
    public int w;
    public int x;
    public int y;

    public z01(Bundle bundle, org.telegram.ui.ActionBar.d6 d6Var) {
        super(bundle);
        this.d = d6Var;
        this.e = bundle.getLong("dialog_id");
        this.f = bundle.getLong("topic_id");
        this.h = bundle.getBoolean("exception", false);
    }

    public static /* synthetic */ void U(z01 z01Var, String str, int i10, int i11) {
        MessagesController.getNotificationsSettings(z01Var.currentAccount).edit().putInt("smart_max_count_" + str, i10).putInt("smart_delay_" + str, i11).apply();
        x01 x01Var = z01Var.b;
        if (x01Var != null) {
            x01Var.m(z01Var.H);
        }
    }

    public static void V(final z01 z01Var, Context context, String str, View view, int i10) {
        long j10 = z01Var.f;
        long j11 = z01Var.e;
        org.telegram.ui.ActionBar.d6 d6Var = z01Var.d;
        if (view.isEnabled()) {
            Parcelable parcelable = null;
            final int i11 = 0;
            if (i10 == z01Var.W) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, d6Var);
                String string = LocaleController.getString(R.string.ResetCustomNotificationsAlertTitle);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                b2Var.R = string;
                b2Var.T = LocaleController.getString(R.string.ResetCustomNotificationsAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new u01(z01Var, str));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                z01Var.showDialog(b2Var);
                TextView textView = (TextView) b2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.q7, false));
                    return;
                }
                return;
            }
            if (i10 == z01Var.F) {
                Bundle b10 = zf.d0.b(j11, "dialog_id");
                b10.putLong("topic_id", j10);
                z01Var.presentFragment(new kk0(b10, d6Var));
                return;
            }
            final int i12 = 1;
            if (i10 == z01Var.Q) {
                try {
                    Intent intent = new Intent("android.intent.action.RINGTONE_PICKER");
                    intent.putExtra("android.intent.extra.ringtone.TYPE", 1);
                    intent.putExtra("android.intent.extra.ringtone.SHOW_DEFAULT", true);
                    intent.putExtra("android.intent.extra.ringtone.SHOW_SILENT", true);
                    intent.putExtra("android.intent.extra.ringtone.DEFAULT_URI", RingtoneManager.getDefaultUri(1));
                    SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(z01Var.currentAccount);
                    Uri uri = Settings.System.DEFAULT_NOTIFICATION_URI;
                    String path = uri != null ? uri.getPath() : null;
                    String string2 = notificationsSettings.getString("ringtone_path_" + str, path);
                    if (string2 != null && !string2.equals("NoSound")) {
                        parcelable = string2.equals(path) ? uri : Uri.parse(string2);
                    }
                    intent.putExtra("android.intent.extra.ringtone.EXISTING_URI", parcelable);
                    z01Var.startActivityForResult(intent, 13);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            }
            if (i10 == z01Var.G) {
                Activity parentActivity = z01Var.getParentActivity();
                long j12 = z01Var.e;
                long j13 = z01Var.f;
                Runnable runnable = new Runnable(z01Var) { // from class: org.telegram.ui.v01
                    public final /* synthetic */ z01 b;

                    {
                        this.b = z01Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                z01 z01Var2 = this.b;
                                x01 x01Var = z01Var2.b;
                                if (x01Var != null) {
                                    x01Var.m(z01Var2.G);
                                    break;
                                }
                                break;
                            case 1:
                                z01 z01Var3 = this.b;
                                x01 x01Var2 = z01Var3.b;
                                if (x01Var2 != null) {
                                    x01Var2.m(z01Var3.R);
                                    break;
                                }
                                break;
                            case 2:
                                z01 z01Var4 = this.b;
                                x01 x01Var3 = z01Var4.b;
                                if (x01Var3 != null) {
                                    x01Var3.m(z01Var4.I);
                                    break;
                                }
                                break;
                            default:
                                z01 z01Var5 = this.b;
                                x01 x01Var4 = z01Var5.b;
                                if (x01Var4 != null) {
                                    x01Var4.m(z01Var5.U);
                                    break;
                                }
                                break;
                        }
                    }
                };
                org.telegram.ui.ActionBar.d6 d6Var2 = z01Var.d;
                Pattern pattern = org.telegram.ui.Components.f5.a;
                z01Var.showDialog(org.telegram.ui.Components.f5.X(parentActivity, j12, j13, j12 != 0 ? a1.g.o(j12, "vibrate_") : "vibrate_messages", runnable, d6Var2));
                return;
            }
            int i13 = 21;
            final int i14 = 3;
            if (i10 == z01Var.y) {
                org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) view;
                boolean z10 = !v8Var.e.h;
                z01Var.n = z10;
                v8Var.setChecked(z10);
                int childCount = z01Var.a.getChildCount();
                ArrayList arrayList = new ArrayList();
                while (i11 < childCount) {
                    org.telegram.ui.Components.sl0 sl0Var = (org.telegram.ui.Components.sl0) z01Var.a.T(z01Var.a.getChildAt(i11));
                    int i15 = sl0Var.f;
                    View view2 = sl0Var.a;
                    int b11 = sl0Var.b();
                    if (b11 != z01Var.y && b11 != z01Var.W) {
                        if (i15 == 0) {
                            ((org.telegram.ui.Cells.l4) view2).a(arrayList, z01Var.n);
                        } else if (i15 == 1) {
                            ((org.telegram.ui.Cells.ba) view2).a(arrayList, z01Var.n);
                        } else if (i15 == 2) {
                            ((org.telegram.ui.Cells.d9) view2).c(arrayList, z01Var.n);
                        } else if (i15 == 3) {
                            ((org.telegram.ui.Cells.x8) view2).a(arrayList, z01Var.n);
                        } else if (i15 == 4) {
                            ((org.telegram.ui.Cells.j6) view2).b(arrayList, z01Var.n);
                        } else if (i15 == 7 && b11 == z01Var.E) {
                            ((org.telegram.ui.Cells.v8) view2).e(arrayList, z01Var.n);
                        }
                    }
                    i11++;
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                AnimatorSet animatorSet = z01Var.c;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                z01Var.c = animatorSet2;
                animatorSet2.playTogether(arrayList);
                z01Var.c.addListener(new zb0(z01Var, i13));
                z01Var.c.setDuration(150L);
                z01Var.c.start();
                return;
            }
            if (i10 == z01Var.E) {
                org.telegram.ui.Cells.v8 v8Var2 = (org.telegram.ui.Cells.v8) view;
                Switch r32 = v8Var2.e;
                MessagesController.getNotificationsSettings(z01Var.currentAccount).edit().putBoolean(r4.c.h(NotificationsSettingsFacade.PROPERTY_CONTENT_PREVIEW, str), !r32.h).apply();
                v8Var2.setChecked(!r32.h);
                return;
            }
            if (i10 == z01Var.R) {
                z01Var.showDialog(org.telegram.ui.Components.f5.X(z01Var.getParentActivity(), z01Var.e, z01Var.f, r4.c.h("calls_vibrate_", str), new Runnable(z01Var) { // from class: org.telegram.ui.v01
                    public final /* synthetic */ z01 b;

                    {
                        this.b = z01Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                z01 z01Var2 = this.b;
                                x01 x01Var = z01Var2.b;
                                if (x01Var != null) {
                                    x01Var.m(z01Var2.G);
                                    break;
                                }
                                break;
                            case 1:
                                z01 z01Var3 = this.b;
                                x01 x01Var2 = z01Var3.b;
                                if (x01Var2 != null) {
                                    x01Var2.m(z01Var3.R);
                                    break;
                                }
                                break;
                            case 2:
                                z01 z01Var4 = this.b;
                                x01 x01Var3 = z01Var4.b;
                                if (x01Var3 != null) {
                                    x01Var3.m(z01Var4.I);
                                    break;
                                }
                                break;
                            default:
                                z01 z01Var5 = this.b;
                                x01 x01Var4 = z01Var5.b;
                                if (x01Var4 != null) {
                                    x01Var4.m(z01Var5.U);
                                    break;
                                }
                                break;
                        }
                    }
                }, z01Var.d));
                return;
            }
            if (i10 == z01Var.I) {
                z01Var.showDialog(org.telegram.ui.Components.f5.H(z01Var.getParentActivity(), z01Var.e, z01Var.f, -1, new Runnable(z01Var) { // from class: org.telegram.ui.v01
                    public final /* synthetic */ z01 b;

                    {
                        this.b = z01Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (r2) {
                            case 0:
                                z01 z01Var2 = this.b;
                                x01 x01Var = z01Var2.b;
                                if (x01Var != null) {
                                    x01Var.m(z01Var2.G);
                                    break;
                                }
                                break;
                            case 1:
                                z01 z01Var3 = this.b;
                                x01 x01Var2 = z01Var3.b;
                                if (x01Var2 != null) {
                                    x01Var2.m(z01Var3.R);
                                    break;
                                }
                                break;
                            case 2:
                                z01 z01Var4 = this.b;
                                x01 x01Var3 = z01Var4.b;
                                if (x01Var3 != null) {
                                    x01Var3.m(z01Var4.I);
                                    break;
                                }
                                break;
                            default:
                                z01 z01Var5 = this.b;
                                x01 x01Var4 = z01Var5.b;
                                if (x01Var4 != null) {
                                    x01Var4.m(z01Var5.U);
                                    break;
                                }
                                break;
                        }
                    }
                }, z01Var.d));
                return;
            }
            if (i10 != z01Var.H) {
                if (i10 == z01Var.U) {
                    if (z01Var.getParentActivity() == null) {
                        return;
                    }
                    z01Var.showDialog(org.telegram.ui.Components.f5.t(z01Var.getParentActivity(), z01Var.e, z01Var.f, -1, new Runnable(z01Var) { // from class: org.telegram.ui.v01
                        public final /* synthetic */ z01 b;

                        {
                            this.b = z01Var;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i14) {
                                case 0:
                                    z01 z01Var2 = this.b;
                                    x01 x01Var = z01Var2.b;
                                    if (x01Var != null) {
                                        x01Var.m(z01Var2.G);
                                        break;
                                    }
                                    break;
                                case 1:
                                    z01 z01Var3 = this.b;
                                    x01 x01Var2 = z01Var3.b;
                                    if (x01Var2 != null) {
                                        x01Var2.m(z01Var3.R);
                                        break;
                                    }
                                    break;
                                case 2:
                                    z01 z01Var4 = this.b;
                                    x01 x01Var3 = z01Var4.b;
                                    if (x01Var3 != null) {
                                        x01Var3.m(z01Var4.I);
                                        break;
                                    }
                                    break;
                                default:
                                    z01 z01Var5 = this.b;
                                    x01 x01Var4 = z01Var5.b;
                                    if (x01Var4 != null) {
                                        x01Var4.m(z01Var5.U);
                                        break;
                                    }
                                    break;
                            }
                        }
                    }, z01Var.d));
                    return;
                }
                if (i10 == z01Var.L) {
                    MessagesController.getNotificationsSettings(z01Var.currentAccount).edit().putInt("popup_" + str, 1).apply();
                    ((org.telegram.ui.Cells.j6) view).a(true, true);
                    View findViewWithTag = z01Var.a.findViewWithTag(2);
                    if (findViewWithTag != null) {
                        ((org.telegram.ui.Cells.j6) findViewWithTag).a(false, true);
                        return;
                    }
                    return;
                }
                if (i10 == z01Var.M) {
                    MessagesController.getNotificationsSettings(z01Var.currentAccount).edit().putInt("popup_" + str, 2).apply();
                    ((org.telegram.ui.Cells.j6) view).a(true, true);
                    View findViewWithTag2 = z01Var.a.findViewWithTag(1);
                    if (findViewWithTag2 != null) {
                        ((org.telegram.ui.Cells.j6) findViewWithTag2).a(false, true);
                        return;
                    }
                    return;
                }
                if (i10 == z01Var.O) {
                    org.telegram.ui.Cells.v8 v8Var3 = (org.telegram.ui.Cells.v8) view;
                    boolean z11 = v8Var3.e.h;
                    boolean z12 = !z11;
                    v8Var3.setChecked(z12);
                    SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(z01Var.currentAccount).edit();
                    if (!z01Var.Z || z11) {
                        edit.putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, z12);
                    } else {
                        edit.remove(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str);
                    }
                    edit.apply();
                    z01Var.getNotificationsController().updateServerNotificationsSettings(j11, j10);
                    return;
                }
                return;
            }
            if (z01Var.getParentActivity() == null) {
                return;
            }
            SharedPreferences notificationsSettings2 = MessagesController.getNotificationsSettings(z01Var.currentAccount);
            int c10 = org.telegram.messenger.g0.c("smart_max_count_", str, notificationsSettings2, 2);
            int c11 = org.telegram.messenger.g0.c("smart_delay_", str, notificationsSettings2, 180);
            r14 = c10 != 0 ? c10 : 2;
            Activity parentActivity2 = z01Var.getParentActivity();
            u01 u01Var = new u01(z01Var, str);
            Pattern pattern2 = org.telegram.ui.Components.f5.a;
            if (parentActivity2 == null) {
                return;
            }
            int i16 = org.telegram.ui.ActionBar.h6.j5;
            int r10 = d6Var != null ? d6Var.r(i16) : org.telegram.ui.ActionBar.h6.x0(null, i16, false);
            int i17 = org.telegram.ui.ActionBar.h6.h5;
            int r11 = d6Var != null ? d6Var.r(i17) : org.telegram.ui.ActionBar.h6.x0(null, i17, false);
            int i18 = org.telegram.ui.ActionBar.h6.Ji;
            if (d6Var != null) {
                d6Var.r(i18);
            } else {
                org.telegram.ui.ActionBar.h6.x0(null, i18, false);
            }
            int i19 = org.telegram.ui.ActionBar.h6.Ni;
            if (d6Var != null) {
                d6Var.r(i19);
            } else {
                org.telegram.ui.ActionBar.h6.x0(null, i19, false);
            }
            int i20 = org.telegram.ui.ActionBar.h6.E8;
            if (d6Var != null) {
                d6Var.r(i20);
            } else {
                org.telegram.ui.ActionBar.h6.x0(null, i20, false);
            }
            int i21 = org.telegram.ui.ActionBar.h6.G8;
            if (d6Var != null) {
                d6Var.r(i21);
            } else {
                org.telegram.ui.ActionBar.h6.x0(null, i21, false);
            }
            int i22 = org.telegram.ui.ActionBar.h6.i6;
            if (d6Var != null) {
                d6Var.r(i22);
            } else {
                org.telegram.ui.ActionBar.h6.x0(null, i22, false);
            }
            int i23 = org.telegram.ui.ActionBar.h6.Sh;
            int r12 = d6Var != null ? d6Var.r(i23) : org.telegram.ui.ActionBar.h6.x0(null, i23, false);
            int i24 = org.telegram.ui.ActionBar.h6.Oh;
            int r13 = d6Var != null ? d6Var.r(i24) : org.telegram.ui.ActionBar.h6.x0(null, i24, false);
            int i25 = org.telegram.ui.ActionBar.h6.Qh;
            int r14 = d6Var != null ? d6Var.r(i25) : org.telegram.ui.ActionBar.h6.x0(null, i25, false);
            org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(parentActivity2, d6Var);
            a3Var.a();
            org.telegram.ui.Components.l4 l4Var = new org.telegram.ui.Components.l4(parentActivity2, d6Var);
            l4Var.setMinValue(0);
            l4Var.setMaxValue(10);
            l4Var.setTextColor(r10);
            l4Var.setValue(r14 - 1);
            l4Var.setWrapSelectorWheel(false);
            l4Var.setFormatter(new rr(i13));
            org.telegram.ui.Components.m4 m4Var = new org.telegram.ui.Components.m4(parentActivity2, d6Var);
            m4Var.setMinValue(0);
            m4Var.setMaxValue(10);
            m4Var.setTextColor(r10);
            m4Var.setValue((c11 / 60) - 1);
            m4Var.setWrapSelectorWheel(false);
            m4Var.setFormatter(new rr(22));
            org.telegram.ui.Components.od0 od0Var = new org.telegram.ui.Components.od0(parentActivity2, d6Var);
            od0Var.setMinValue(0);
            od0Var.setMaxValue(0);
            od0Var.setTextColor(r10);
            od0Var.setValue(0);
            od0Var.setWrapSelectorWheel(false);
            od0Var.setFormatter(new rr(23));
            org.telegram.ui.Components.x3 x3Var = new org.telegram.ui.Components.x3(parentActivity2, l4Var, m4Var, od0Var);
            x3Var.setOrientation(1);
            FrameLayout frameLayout = new FrameLayout(parentActivity2);
            x3Var.addView(frameLayout, w7.z5.t(-1, -2, 51, 22, 0, 0, 4));
            TextView textView2 = new TextView(parentActivity2);
            textView2.setText(LocaleController.getString(R.string.NotfificationsFrequencyTitle));
            textView2.setTextColor(r10);
            textView2.setTextSize(1, 20.0f);
            textView2.setTypeface(AndroidUtilities.bold());
            frameLayout.addView(textView2, w7.z5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
            textView2.setOnTouchListener(new di.d(10));
            LinearLayout linearLayout = new LinearLayout(parentActivity2);
            linearLayout.setOrientation(0);
            linearLayout.setWeightSum(1.0f);
            x3Var.addView(linearLayout, w7.z5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
            ai.vd vdVar = new ai.vd(parentActivity2, 19);
            linearLayout.addView(l4Var, w7.z5.l(0.4f, 0, 270));
            linearLayout.addView(od0Var, w7.z5.o(0, -2, 0.2f, 16));
            linearLayout.addView(m4Var, w7.z5.l(0.4f, 0, 270));
            vdVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            vdVar.setGravity(17);
            vdVar.setTextColor(r12);
            vdVar.setTextSize(1, 14.0f);
            vdVar.setTypeface(AndroidUtilities.bold());
            int dp = AndroidUtilities.dp(8.0f);
            vdVar.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.j0(dp, dp, dp, dp, r13, r14, r14));
            vdVar.setText(LocaleController.getString(R.string.AutoDeleteConfirm));
            x3Var.addView(vdVar, w7.z5.t(-1, 48, 83, 16, 15, 16, 16));
            rr rrVar = new rr(10);
            l4Var.setOnValueChangedListener(rrVar);
            m4Var.setOnValueChangedListener(rrVar);
            vdVar.setOnClickListener(new ci.c4(l4Var, m4Var, u01Var, a3Var, 7));
            a3Var.b(x3Var);
            org.telegram.ui.ActionBar.f3 f3Var = a3Var.a;
            f3Var.show();
            f3Var.setBackgroundColor(r11);
            f3Var.fixNavigationBar(r11);
        }
    }

    public static /* synthetic */ void W(z01 z01Var, String str) {
        z01Var.a0 = true;
        MessagesController.getNotificationsSettings(z01Var.currentAccount).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_CUSTOM + str, false).remove(NotificationsSettingsFacade.PROPERTY_NOTIFY + str).apply();
        z01Var.finishFragment();
        y01 y01Var = z01Var.r;
        if (y01Var != null) {
            y01Var.O();
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.h6.f8;
        org.telegram.ui.ActionBar.d6 d6Var = this.d;
        kVar.B(org.telegram.ui.ActionBar.h6.w0(i10, d6Var), false);
        this.actionBar.C(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.v8, d6Var), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        long j10 = this.e;
        long j11 = this.f;
        String sharedPrefKey = NotificationsController.getSharedPrefKey(j10, j11);
        this.actionBar.setActionBarMenuOnItemClick(new w01(this, sharedPrefKey));
        org.telegram.ui.Components.oo ooVar = new org.telegram.ui.Components.oo(context, null, false, d6Var);
        this.s = ooVar;
        ooVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        this.actionBar.addView(this.s, 0, w7.z5.d(-2, -1.0f, 51, !this.inPreviewMode ? 56.0f : 0.0f, 0.0f, 40.0f, 0.0f));
        this.actionBar.setAllowOverlayTitle(false);
        if (j10 >= 0) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(j10));
            if (user != null) {
                this.s.setUserAvatar(user);
                this.s.setTitle(ContactsController.formatName(user.first_name, user.last_name));
            }
        } else if (j11 != 0) {
            TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(-j10, j11);
            og.d.p(this.s.getAvatarImageView(), findTopic, false, true, d6Var);
            this.s.setTitle(findTopic.title);
        } else {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j10));
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
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.a7, d6Var));
        org.telegram.ui.Components.im0 im0Var = new org.telegram.ui.Components.im0(context, null);
        this.a = im0Var;
        im0Var.p1();
        this.actionBar.setAdaptiveBackground(this.a);
        frameLayout.addView(this.a, w7.z5.c(-1.0f, -1));
        org.telegram.ui.Components.im0 im0Var2 = this.a;
        x01 x01Var = new x01(this, context);
        this.b = x01Var;
        im0Var2.setAdapter(x01Var);
        this.a.setItemAnimator(null);
        this.a.setLayoutAnimation(null);
        this.a.setLayoutManager(new hg.a0(17));
        this.a.setOnItemClickListener(new na1(this, context, sharedPrefKey, 1));
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
    public final org.telegram.ui.ActionBar.d6 getResourceProvider() {
        return this.d;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        zx0 zx0Var = new zx0(1, this);
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.a, 16, new Class[]{org.telegram.ui.Cells.l4.class, org.telegram.ui.Cells.ba.class, org.telegram.ui.Cells.x8.class, org.telegram.ui.Cells.j6.class, org.telegram.ui.Cells.ua.class, org.telegram.ui.Cells.v8.class, org.telegram.ui.Cells.r8.class}, null, null, null, org.telegram.ui.ActionBar.h6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.h6.s8;
        arrayList.add(new org.telegram.ui.ActionBar.j6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.a, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.a, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.k0, null, null, org.telegram.ui.ActionBar.h6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.a, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.L6));
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.a, 0, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.a, 0, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.a, 0, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.a, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.a, 0, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.a, 8192, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.g7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.a, 16384, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.h7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.a, 0, new Class[]{org.telegram.ui.Cells.v8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.a, 0, new Class[]{org.telegram.ui.Cells.v8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.z6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.a, 0, new Class[]{org.telegram.ui.Cells.v8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.a, 0, new Class[]{org.telegram.ui.Cells.v8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.a, 0, new Class[]{org.telegram.ui.Cells.ua.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.a, 0, new Class[]{org.telegram.ui.Cells.ua.class}, new String[]{"statusColor"}, null, null, -1, zx0Var, org.telegram.ui.ActionBar.h6.y6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.a, 0, new Class[]{org.telegram.ui.Cells.ua.class}, new String[]{"statusOnlineColor"}, null, null, -1, zx0Var, org.telegram.ui.ActionBar.h6.n6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.a, 0, new Class[]{org.telegram.ui.Cells.ua.class}, null, org.telegram.ui.ActionBar.h6.r0, null, org.telegram.ui.ActionBar.h6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, zx0Var, org.telegram.ui.ActionBar.h6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, zx0Var, org.telegram.ui.ActionBar.h6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, zx0Var, org.telegram.ui.ActionBar.h6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, zx0Var, org.telegram.ui.ActionBar.h6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, zx0Var, org.telegram.ui.ActionBar.h6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, zx0Var, org.telegram.ui.ActionBar.h6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, zx0Var, org.telegram.ui.ActionBar.h6.U7));
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
        x01 x01Var = this.b;
        if (x01Var != null) {
            x01Var.m(i10 == 13 ? this.Q : this.F);
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
        long j10 = this.e;
        if (DialogObject.isUserDialog(j10)) {
            ArrayList<TLRPC.TL_topPeer> arrayList = getMediaDataController().hints;
            int i10 = 0;
            while (true) {
                if (i10 >= arrayList.size()) {
                    break;
                }
                TLRPC.Peer peer = arrayList.get(i10).peer;
                if ((peer instanceof TLRPC.TL_peerUser) && peer.user_id == j10) {
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
        long j11 = this.f;
        if (z11 || j11 != 0) {
            this.Y = i11 + 2;
            this.y = i12;
        } else {
            this.y = -1;
        }
        this.O = -1;
        if (DialogObject.isEncryptedDialog(j10)) {
            this.E = -1;
        } else {
            int i13 = this.Y;
            this.Y = i13 + 1;
            this.E = i13;
            if (DialogObject.isUserDialog(j10)) {
                int i14 = this.Y;
                this.Y = i14 + 1;
                this.O = i14;
            }
        }
        int i15 = this.Y;
        this.F = i15;
        this.Y = i15 + 2;
        this.G = i15 + 1;
        if (DialogObject.isChatDialog(j10)) {
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
        if (DialogObject.isChatDialog(j10)) {
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
            if (ChatObject.isChannel(chat) && !chat.megagroup) {
                z10 = true;
                if (!DialogObject.isEncryptedDialog(j10) || z10) {
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
                if (DialogObject.isUserDialog(j10)) {
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
                boolean isGlobalNotificationsEnabled = NotificationsController.getInstance(this.currentAccount).isGlobalNotificationsEnabled(j10, false, false);
                if (z11) {
                    SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.currentAccount);
                    String sharedPrefKey = NotificationsController.getSharedPrefKey(j10, j11);
                    boolean contains = notificationsSettings.contains(NotificationsSettingsFacade.PROPERTY_NOTIFY + sharedPrefKey);
                    int c10 = org.telegram.messenger.g0.c(NotificationsSettingsFacade.PROPERTY_NOTIFY, sharedPrefKey, notificationsSettings, 0);
                    if (c10 == 0) {
                        if (contains) {
                            this.n = true;
                        } else {
                            this.n = NotificationsController.getInstance(this.currentAccount).isGlobalNotificationsEnabled(j10, false, false);
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
        if (DialogObject.isEncryptedDialog(j10)) {
        }
        this.K = -1;
        this.L = -1;
        this.M = -1;
        this.N = -1;
        if (DialogObject.isUserDialog(j10)) {
        }
        int i202 = this.Y;
        this.T = i202;
        this.U = i202 + 1;
        int i212 = i202 + 3;
        this.Y = i212;
        this.V = i202 + 2;
        if (z11) {
        }
        boolean isGlobalNotificationsEnabled2 = NotificationsController.getInstance(this.currentAccount).isGlobalNotificationsEnabled(j10, false, false);
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
