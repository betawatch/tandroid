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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class t01 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public int A;
    public int B;
    public int C;
    public int D;
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
    public boolean V;
    public boolean W;
    public org.telegram.ui.Components.zk0 a;
    public r01 b;
    public AnimatorSet c;
    public final org.telegram.ui.ActionBar.c6 d;
    public final long e;
    public final long f;
    public final boolean h;
    public boolean n;
    public s01 r;
    public org.telegram.ui.Components.rn s;
    public int v;
    public int w;
    public int x;
    public int y;

    public t01(Bundle bundle, org.telegram.ui.ActionBar.c6 c6Var) {
        super(bundle);
        this.d = c6Var;
        this.e = bundle.getLong("dialog_id");
        this.f = bundle.getLong("topic_id");
        this.h = bundle.getBoolean("exception", false);
    }

    public static /* synthetic */ void U(t01 t01Var, String str, int i10, int i11) {
        MessagesController.getNotificationsSettings(t01Var.currentAccount).edit().putInt("smart_max_count_" + str, i10).putInt("smart_delay_" + str, i11).apply();
        r01 r01Var = t01Var.b;
        if (r01Var != null) {
            r01Var.m(t01Var.D);
        }
    }

    public static void V(final t01 t01Var, Context context, String str, View view, int i10) {
        long j10 = t01Var.f;
        long j11 = t01Var.e;
        org.telegram.ui.ActionBar.c6 c6Var = t01Var.d;
        if (view.isEnabled()) {
            Parcelable parcelable = null;
            final int i11 = 0;
            if (i10 == t01Var.S) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
                String string = LocaleController.getString(R.string.ResetCustomNotificationsAlertTitle);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                b2Var.N = string;
                b2Var.P = LocaleController.getString(R.string.ResetCustomNotificationsAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new o01(t01Var, str));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                t01Var.showDialog(b2Var);
                TextView textView = (TextView) b2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q7, false));
                    return;
                }
                return;
            }
            if (i10 == t01Var.B) {
                Bundle h = com.google.android.recaptcha.internal.a.h(j11, "dialog_id");
                h.putLong("topic_id", j10);
                t01Var.presentFragment(new kk0(h, c6Var));
                return;
            }
            final int i12 = 1;
            if (i10 == t01Var.M) {
                try {
                    Intent intent = new Intent("android.intent.action.RINGTONE_PICKER");
                    intent.putExtra("android.intent.extra.ringtone.TYPE", 1);
                    intent.putExtra("android.intent.extra.ringtone.SHOW_DEFAULT", true);
                    intent.putExtra("android.intent.extra.ringtone.SHOW_SILENT", true);
                    intent.putExtra("android.intent.extra.ringtone.DEFAULT_URI", RingtoneManager.getDefaultUri(1));
                    SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(t01Var.currentAccount);
                    Uri uri = Settings.System.DEFAULT_NOTIFICATION_URI;
                    String path = uri != null ? uri.getPath() : null;
                    String string2 = notificationsSettings.getString("ringtone_path_" + str, path);
                    if (string2 != null && !string2.equals("NoSound")) {
                        parcelable = string2.equals(path) ? uri : Uri.parse(string2);
                    }
                    intent.putExtra("android.intent.extra.ringtone.EXISTING_URI", parcelable);
                    t01Var.startActivityForResult(intent, 13);
                    return;
                } catch (Exception e9) {
                    FileLog.e(e9);
                    return;
                }
            }
            if (i10 == t01Var.C) {
                Activity parentActivity = t01Var.getParentActivity();
                long j12 = t01Var.e;
                long j13 = t01Var.f;
                Runnable runnable = new Runnable(t01Var) { // from class: org.telegram.ui.p01
                    public final /* synthetic */ t01 b;

                    {
                        this.b = t01Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                t01 t01Var2 = this.b;
                                r01 r01Var = t01Var2.b;
                                if (r01Var != null) {
                                    r01Var.m(t01Var2.C);
                                    break;
                                }
                                break;
                            case 1:
                                t01 t01Var3 = this.b;
                                r01 r01Var2 = t01Var3.b;
                                if (r01Var2 != null) {
                                    r01Var2.m(t01Var3.N);
                                    break;
                                }
                                break;
                            case 2:
                                t01 t01Var4 = this.b;
                                r01 r01Var3 = t01Var4.b;
                                if (r01Var3 != null) {
                                    r01Var3.m(t01Var4.E);
                                    break;
                                }
                                break;
                            default:
                                t01 t01Var5 = this.b;
                                r01 r01Var4 = t01Var5.b;
                                if (r01Var4 != null) {
                                    r01Var4.m(t01Var5.Q);
                                    break;
                                }
                                break;
                        }
                    }
                };
                org.telegram.ui.ActionBar.c6 c6Var2 = t01Var.d;
                Pattern pattern = org.telegram.ui.Components.y4.a;
                t01Var.showDialog(org.telegram.ui.Components.y4.Y(parentActivity, j12, j13, j12 != 0 ? a9.p.l(j12, "vibrate_") : "vibrate_messages", runnable, c6Var2));
                return;
            }
            final int i13 = 3;
            if (i10 == t01Var.y) {
                org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
                boolean z10 = !p8Var.e.h;
                t01Var.n = z10;
                p8Var.setChecked(z10);
                int childCount = t01Var.a.getChildCount();
                ArrayList arrayList = new ArrayList();
                while (i11 < childCount) {
                    org.telegram.ui.Components.lk0 lk0Var = (org.telegram.ui.Components.lk0) t01Var.a.T(t01Var.a.getChildAt(i11));
                    int i14 = lk0Var.f;
                    View view2 = lk0Var.a;
                    int b10 = lk0Var.b();
                    if (b10 != t01Var.y && b10 != t01Var.S) {
                        if (i14 == 0) {
                            ((org.telegram.ui.Cells.j4) view2).a(arrayList, t01Var.n);
                        } else if (i14 == 1) {
                            ((org.telegram.ui.Cells.x9) view2).a(arrayList, t01Var.n);
                        } else if (i14 == 2) {
                            ((org.telegram.ui.Cells.x8) view2).c(arrayList, t01Var.n);
                        } else if (i14 == 3) {
                            ((org.telegram.ui.Cells.r8) view2).a(arrayList, t01Var.n);
                        } else if (i14 == 4) {
                            ((org.telegram.ui.Cells.g6) view2).b(arrayList, t01Var.n);
                        } else if (i14 == 7 && b10 == t01Var.A) {
                            ((org.telegram.ui.Cells.p8) view2).e(arrayList, t01Var.n);
                        }
                    }
                    i11++;
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                AnimatorSet animatorSet = t01Var.c;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                t01Var.c = animatorSet2;
                animatorSet2.playTogether(arrayList);
                t01Var.c.addListener(new f50(t01Var, 23));
                t01Var.c.setDuration(150L);
                t01Var.c.start();
                return;
            }
            if (i10 == t01Var.A) {
                org.telegram.ui.Cells.p8 p8Var2 = (org.telegram.ui.Cells.p8) view;
                Switch r32 = p8Var2.e;
                MessagesController.getNotificationsSettings(t01Var.currentAccount).edit().putBoolean(s3.c.e(NotificationsSettingsFacade.PROPERTY_CONTENT_PREVIEW, str), !r32.h).apply();
                p8Var2.setChecked(!r32.h);
                return;
            }
            if (i10 == t01Var.N) {
                t01Var.showDialog(org.telegram.ui.Components.y4.Y(t01Var.getParentActivity(), t01Var.e, t01Var.f, s3.c.e("calls_vibrate_", str), new Runnable(t01Var) { // from class: org.telegram.ui.p01
                    public final /* synthetic */ t01 b;

                    {
                        this.b = t01Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                t01 t01Var2 = this.b;
                                r01 r01Var = t01Var2.b;
                                if (r01Var != null) {
                                    r01Var.m(t01Var2.C);
                                    break;
                                }
                                break;
                            case 1:
                                t01 t01Var3 = this.b;
                                r01 r01Var2 = t01Var3.b;
                                if (r01Var2 != null) {
                                    r01Var2.m(t01Var3.N);
                                    break;
                                }
                                break;
                            case 2:
                                t01 t01Var4 = this.b;
                                r01 r01Var3 = t01Var4.b;
                                if (r01Var3 != null) {
                                    r01Var3.m(t01Var4.E);
                                    break;
                                }
                                break;
                            default:
                                t01 t01Var5 = this.b;
                                r01 r01Var4 = t01Var5.b;
                                if (r01Var4 != null) {
                                    r01Var4.m(t01Var5.Q);
                                    break;
                                }
                                break;
                        }
                    }
                }, t01Var.d));
                return;
            }
            if (i10 == t01Var.E) {
                t01Var.showDialog(org.telegram.ui.Components.y4.I(t01Var.getParentActivity(), t01Var.e, t01Var.f, -1, new Runnable(t01Var) { // from class: org.telegram.ui.p01
                    public final /* synthetic */ t01 b;

                    {
                        this.b = t01Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (r2) {
                            case 0:
                                t01 t01Var2 = this.b;
                                r01 r01Var = t01Var2.b;
                                if (r01Var != null) {
                                    r01Var.m(t01Var2.C);
                                    break;
                                }
                                break;
                            case 1:
                                t01 t01Var3 = this.b;
                                r01 r01Var2 = t01Var3.b;
                                if (r01Var2 != null) {
                                    r01Var2.m(t01Var3.N);
                                    break;
                                }
                                break;
                            case 2:
                                t01 t01Var4 = this.b;
                                r01 r01Var3 = t01Var4.b;
                                if (r01Var3 != null) {
                                    r01Var3.m(t01Var4.E);
                                    break;
                                }
                                break;
                            default:
                                t01 t01Var5 = this.b;
                                r01 r01Var4 = t01Var5.b;
                                if (r01Var4 != null) {
                                    r01Var4.m(t01Var5.Q);
                                    break;
                                }
                                break;
                        }
                    }
                }, t01Var.d));
                return;
            }
            if (i10 != t01Var.D) {
                if (i10 == t01Var.Q) {
                    if (t01Var.getParentActivity() == null) {
                        return;
                    }
                    t01Var.showDialog(org.telegram.ui.Components.y4.u(t01Var.getParentActivity(), t01Var.e, t01Var.f, -1, new Runnable(t01Var) { // from class: org.telegram.ui.p01
                        public final /* synthetic */ t01 b;

                        {
                            this.b = t01Var;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i13) {
                                case 0:
                                    t01 t01Var2 = this.b;
                                    r01 r01Var = t01Var2.b;
                                    if (r01Var != null) {
                                        r01Var.m(t01Var2.C);
                                        break;
                                    }
                                    break;
                                case 1:
                                    t01 t01Var3 = this.b;
                                    r01 r01Var2 = t01Var3.b;
                                    if (r01Var2 != null) {
                                        r01Var2.m(t01Var3.N);
                                        break;
                                    }
                                    break;
                                case 2:
                                    t01 t01Var4 = this.b;
                                    r01 r01Var3 = t01Var4.b;
                                    if (r01Var3 != null) {
                                        r01Var3.m(t01Var4.E);
                                        break;
                                    }
                                    break;
                                default:
                                    t01 t01Var5 = this.b;
                                    r01 r01Var4 = t01Var5.b;
                                    if (r01Var4 != null) {
                                        r01Var4.m(t01Var5.Q);
                                        break;
                                    }
                                    break;
                            }
                        }
                    }, t01Var.d));
                    return;
                }
                if (i10 == t01Var.H) {
                    MessagesController.getNotificationsSettings(t01Var.currentAccount).edit().putInt("popup_" + str, 1).apply();
                    ((org.telegram.ui.Cells.g6) view).a(true, true);
                    View findViewWithTag = t01Var.a.findViewWithTag(2);
                    if (findViewWithTag != null) {
                        ((org.telegram.ui.Cells.g6) findViewWithTag).a(false, true);
                        return;
                    }
                    return;
                }
                if (i10 == t01Var.I) {
                    MessagesController.getNotificationsSettings(t01Var.currentAccount).edit().putInt("popup_" + str, 2).apply();
                    ((org.telegram.ui.Cells.g6) view).a(true, true);
                    View findViewWithTag2 = t01Var.a.findViewWithTag(1);
                    if (findViewWithTag2 != null) {
                        ((org.telegram.ui.Cells.g6) findViewWithTag2).a(false, true);
                        return;
                    }
                    return;
                }
                if (i10 == t01Var.K) {
                    org.telegram.ui.Cells.p8 p8Var3 = (org.telegram.ui.Cells.p8) view;
                    boolean z11 = p8Var3.e.h;
                    boolean z12 = !z11;
                    p8Var3.setChecked(z12);
                    SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(t01Var.currentAccount).edit();
                    if (!t01Var.V || z11) {
                        edit.putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, z12);
                    } else {
                        edit.remove(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str);
                    }
                    edit.apply();
                    t01Var.getNotificationsController().updateServerNotificationsSettings(j11, j10);
                    return;
                }
                return;
            }
            if (t01Var.getParentActivity() == null) {
                return;
            }
            SharedPreferences notificationsSettings2 = MessagesController.getNotificationsSettings(t01Var.currentAccount);
            int c10 = org.telegram.messenger.y1.c("smart_max_count_", str, notificationsSettings2, 2);
            int c11 = org.telegram.messenger.y1.c("smart_delay_", str, notificationsSettings2, 180);
            r13 = c10 != 0 ? c10 : 2;
            Activity parentActivity2 = t01Var.getParentActivity();
            o01 o01Var = new o01(t01Var, str);
            Pattern pattern2 = org.telegram.ui.Components.y4.a;
            if (parentActivity2 == null) {
                return;
            }
            int i15 = org.telegram.ui.ActionBar.g6.j5;
            int q02 = c6Var != null ? c6Var.q0(i15) : org.telegram.ui.ActionBar.g6.w0(null, i15, false);
            int i16 = org.telegram.ui.ActionBar.g6.h5;
            int q03 = c6Var != null ? c6Var.q0(i16) : org.telegram.ui.ActionBar.g6.w0(null, i16, false);
            int i17 = org.telegram.ui.ActionBar.g6.Ji;
            if (c6Var != null) {
                c6Var.q0(i17);
            } else {
                org.telegram.ui.ActionBar.g6.w0(null, i17, false);
            }
            int i18 = org.telegram.ui.ActionBar.g6.Ni;
            if (c6Var != null) {
                c6Var.q0(i18);
            } else {
                org.telegram.ui.ActionBar.g6.w0(null, i18, false);
            }
            int i19 = org.telegram.ui.ActionBar.g6.E8;
            if (c6Var != null) {
                c6Var.q0(i19);
            } else {
                org.telegram.ui.ActionBar.g6.w0(null, i19, false);
            }
            int i20 = org.telegram.ui.ActionBar.g6.G8;
            if (c6Var != null) {
                c6Var.q0(i20);
            } else {
                org.telegram.ui.ActionBar.g6.w0(null, i20, false);
            }
            int i21 = org.telegram.ui.ActionBar.g6.i6;
            if (c6Var != null) {
                c6Var.q0(i21);
            } else {
                org.telegram.ui.ActionBar.g6.w0(null, i21, false);
            }
            int i22 = org.telegram.ui.ActionBar.g6.Sh;
            int q04 = c6Var != null ? c6Var.q0(i22) : org.telegram.ui.ActionBar.g6.w0(null, i22, false);
            int i23 = org.telegram.ui.ActionBar.g6.Oh;
            int q05 = c6Var != null ? c6Var.q0(i23) : org.telegram.ui.ActionBar.g6.w0(null, i23, false);
            int i24 = org.telegram.ui.ActionBar.g6.Qh;
            int q06 = c6Var != null ? c6Var.q0(i24) : org.telegram.ui.ActionBar.g6.w0(null, i24, false);
            org.telegram.ui.ActionBar.z2 z2Var = new org.telegram.ui.ActionBar.z2(parentActivity2, c6Var);
            z2Var.a();
            org.telegram.ui.Components.e4 e4Var = new org.telegram.ui.Components.e4(parentActivity2, c6Var);
            e4Var.setMinValue(0);
            e4Var.setMaxValue(10);
            e4Var.setTextColor(q02);
            e4Var.setValue(r13 - 1);
            e4Var.setWrapSelectorWheel(false);
            e4Var.setFormatter(new fr(26));
            org.telegram.ui.Components.f4 f4Var = new org.telegram.ui.Components.f4(parentActivity2, c6Var);
            f4Var.setMinValue(0);
            f4Var.setMaxValue(10);
            f4Var.setTextColor(q02);
            f4Var.setValue((c11 / 60) - 1);
            f4Var.setWrapSelectorWheel(false);
            f4Var.setFormatter(new fr(27));
            org.telegram.ui.Components.fc0 fc0Var = new org.telegram.ui.Components.fc0(parentActivity2, c6Var);
            fc0Var.setMinValue(0);
            fc0Var.setMaxValue(0);
            fc0Var.setTextColor(q02);
            fc0Var.setValue(0);
            fc0Var.setWrapSelectorWheel(false);
            fc0Var.setFormatter(new fr(28));
            org.telegram.ui.Components.r3 r3Var = new org.telegram.ui.Components.r3(parentActivity2, e4Var, f4Var, fc0Var);
            r3Var.setOrientation(1);
            FrameLayout frameLayout = new FrameLayout(parentActivity2);
            r3Var.addView(frameLayout, h7.z5.t(-1, -2, 51, 22, 0, 0, 4));
            TextView textView2 = new TextView(parentActivity2);
            textView2.setText(LocaleController.getString(R.string.NotfificationsFrequencyTitle));
            textView2.setTextColor(q02);
            textView2.setTextSize(1, 20.0f);
            textView2.setTypeface(AndroidUtilities.bold());
            frameLayout.addView(textView2, h7.z5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
            textView2.setOnTouchListener(new kh.e(10));
            LinearLayout linearLayout = new LinearLayout(parentActivity2);
            linearLayout.setOrientation(0);
            linearLayout.setWeightSum(1.0f);
            r3Var.addView(linearLayout, h7.z5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
            cg.q qVar = new cg.q(parentActivity2, 19);
            linearLayout.addView(e4Var, h7.z5.l(0.4f, 0, 270));
            linearLayout.addView(fc0Var, h7.z5.o(0, -2, 0.2f, 16));
            linearLayout.addView(f4Var, h7.z5.l(0.4f, 0, 270));
            qVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            qVar.setGravity(17);
            qVar.setTextColor(q04);
            qVar.setTextSize(1, 14.0f);
            qVar.setTypeface(AndroidUtilities.bold());
            int dp = AndroidUtilities.dp(8.0f);
            qVar.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.i0(dp, dp, dp, dp, q05, q06, q06));
            qVar.setText(LocaleController.getString(R.string.AutoDeleteConfirm));
            r3Var.addView(qVar, h7.z5.t(-1, 48, 83, 16, 15, 16, 16));
            fr frVar = new fr(15);
            e4Var.setOnValueChangedListener(frVar);
            f4Var.setOnValueChangedListener(frVar);
            qVar.setOnClickListener(new gh.a4(e4Var, f4Var, o01Var, z2Var, 8));
            z2Var.b(r3Var);
            org.telegram.ui.ActionBar.e3 e3Var = z2Var.a;
            e3Var.show();
            e3Var.setBackgroundColor(q03);
            e3Var.fixNavigationBar(q03);
        }
    }

    public static /* synthetic */ void W(t01 t01Var, String str) {
        t01Var.W = true;
        MessagesController.getNotificationsSettings(t01Var.currentAccount).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_CUSTOM + str, false).remove(NotificationsSettingsFacade.PROPERTY_NOTIFY + str).apply();
        t01Var.finishFragment();
        s01 s01Var = t01Var.r;
        if (s01Var != null) {
            s01Var.G();
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.g6.f8;
        org.telegram.ui.ActionBar.c6 c6Var = this.d;
        kVar.C(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), false);
        this.actionBar.D(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.v8, c6Var), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        long j10 = this.e;
        long j11 = this.f;
        String sharedPrefKey = NotificationsController.getSharedPrefKey(j10, j11);
        this.actionBar.setActionBarMenuOnItemClick(new q01(this, sharedPrefKey));
        org.telegram.ui.Components.rn rnVar = new org.telegram.ui.Components.rn(context, null, false, c6Var);
        this.s = rnVar;
        rnVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        this.actionBar.addView(this.s, 0, h7.z5.d(-2, -1.0f, 51, !this.inPreviewMode ? 56.0f : 0.0f, 0.0f, 40.0f, 0.0f));
        this.actionBar.setAllowOverlayTitle(false);
        if (j10 >= 0) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(j10));
            if (user != null) {
                this.s.setUserAvatar(user);
                this.s.setTitle(ContactsController.formatName(user.first_name, user.last_name));
            }
        } else if (j11 != 0) {
            TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(-j10, j11);
            wf.c.p(this.s.getAvatarImageView(), findTopic, false, true, c6Var);
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
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.a7, c6Var));
        org.telegram.ui.Components.zk0 zk0Var = new org.telegram.ui.Components.zk0(context, null);
        this.a = zk0Var;
        zk0Var.p1();
        this.actionBar.setAdaptiveBackground(this.a);
        frameLayout.addView(this.a, h7.z5.c(-1.0f, -1));
        org.telegram.ui.Components.zk0 zk0Var2 = this.a;
        r01 r01Var = new r01(this, context);
        this.b = r01Var;
        zk0Var2.setAdapter(r01Var);
        this.a.setItemAnimator(null);
        this.a.setLayoutAnimation(null);
        this.a.setLayoutManager(new j(15));
        this.a.setOnItemClickListener(new oa1(this, context, sharedPrefKey, 1));
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
    public final org.telegram.ui.ActionBar.c6 getResourceProvider() {
        return this.d;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        sx0 sx0Var = new sx0(1, this);
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.a, 16, new Class[]{org.telegram.ui.Cells.j4.class, org.telegram.ui.Cells.x9.class, org.telegram.ui.Cells.r8.class, org.telegram.ui.Cells.g6.class, org.telegram.ui.Cells.ra.class, org.telegram.ui.Cells.p8.class, org.telegram.ui.Cells.m8.class}, null, null, null, org.telegram.ui.ActionBar.g6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.g6.s8;
        arrayList.add(new org.telegram.ui.ActionBar.i6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.a, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.a, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.k0, null, null, org.telegram.ui.ActionBar.g6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.a, 0, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.L6));
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.a, 0, new Class[]{org.telegram.ui.Cells.x9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.a, 0, new Class[]{org.telegram.ui.Cells.x9.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.a, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.a, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.a, 0, new Class[]{org.telegram.ui.Cells.g6.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.a, 8192, new Class[]{org.telegram.ui.Cells.g6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.g7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.a, 16384, new Class[]{org.telegram.ui.Cells.g6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.h7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.a, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.a, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.z6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.a, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.a, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.a, 0, new Class[]{org.telegram.ui.Cells.ra.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.a, 0, new Class[]{org.telegram.ui.Cells.ra.class}, new String[]{"statusColor"}, null, null, -1, sx0Var, org.telegram.ui.ActionBar.g6.y6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.a, 0, new Class[]{org.telegram.ui.Cells.ra.class}, new String[]{"statusOnlineColor"}, null, null, -1, sx0Var, org.telegram.ui.ActionBar.g6.n6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.a, 0, new Class[]{org.telegram.ui.Cells.ra.class}, null, org.telegram.ui.ActionBar.g6.r0, null, org.telegram.ui.ActionBar.g6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, sx0Var, org.telegram.ui.ActionBar.g6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, sx0Var, org.telegram.ui.ActionBar.g6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, sx0Var, org.telegram.ui.ActionBar.g6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, sx0Var, org.telegram.ui.ActionBar.g6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, sx0Var, org.telegram.ui.ActionBar.g6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, sx0Var, org.telegram.ui.ActionBar.g6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, sx0Var, org.telegram.ui.ActionBar.g6.U7));
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
        r01 r01Var = this.b;
        if (r01Var != null) {
            r01Var.m(i10 == 13 ? this.M : this.B);
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
                    this.V = i10 < 5;
                } else {
                    i10++;
                }
            }
        }
        this.U = 0;
        boolean z11 = this.h;
        if (z11) {
            this.w = 0;
            this.U = 1 + 1;
            this.x = 1;
        } else {
            this.w = -1;
            this.x = -1;
        }
        int i11 = this.U;
        int i12 = i11 + 1;
        this.U = i12;
        this.v = i11;
        long j11 = this.f;
        if (z11 || j11 != 0) {
            this.U = i11 + 2;
            this.y = i12;
        } else {
            this.y = -1;
        }
        this.K = -1;
        if (DialogObject.isEncryptedDialog(j10)) {
            this.A = -1;
        } else {
            int i13 = this.U;
            this.U = i13 + 1;
            this.A = i13;
            if (DialogObject.isUserDialog(j10)) {
                int i14 = this.U;
                this.U = i14 + 1;
                this.K = i14;
            }
        }
        int i15 = this.U;
        this.B = i15;
        this.U = i15 + 2;
        this.C = i15 + 1;
        if (DialogObject.isChatDialog(j10)) {
            int i16 = this.U;
            this.U = i16 + 1;
            this.D = i16;
        } else {
            this.D = -1;
        }
        int i17 = this.U;
        this.E = i17;
        this.U = i17 + 2;
        this.F = i17 + 1;
        if (DialogObject.isChatDialog(j10)) {
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
            if (ChatObject.isChannel(chat) && !chat.megagroup) {
                z10 = true;
                if (!DialogObject.isEncryptedDialog(j10) || z10) {
                    this.G = -1;
                    this.H = -1;
                    this.I = -1;
                    this.J = -1;
                } else {
                    int i18 = this.U;
                    this.G = i18;
                    this.H = i18 + 1;
                    this.I = i18 + 2;
                    this.U = i18 + 4;
                    this.J = i18 + 3;
                }
                if (DialogObject.isUserDialog(j10)) {
                    this.L = -1;
                    this.N = -1;
                    this.M = -1;
                    this.O = -1;
                } else {
                    int i19 = this.U;
                    this.L = i19;
                    this.N = i19 + 1;
                    this.M = i19 + 2;
                    this.U = i19 + 4;
                    this.O = i19 + 3;
                }
                int i20 = this.U;
                this.P = i20;
                this.Q = i20 + 1;
                int i21 = i20 + 3;
                this.U = i21;
                this.R = i20 + 2;
                if (z11) {
                    this.S = i21;
                    this.U = i20 + 5;
                    this.T = i20 + 4;
                } else {
                    this.S = -1;
                    this.T = -1;
                }
                boolean isGlobalNotificationsEnabled = NotificationsController.getInstance(this.currentAccount).isGlobalNotificationsEnabled(j10, false, false);
                if (z11) {
                    SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.currentAccount);
                    String sharedPrefKey = NotificationsController.getSharedPrefKey(j10, j11);
                    boolean contains = notificationsSettings.contains(NotificationsSettingsFacade.PROPERTY_NOTIFY + sharedPrefKey);
                    int c10 = org.telegram.messenger.y1.c(NotificationsSettingsFacade.PROPERTY_NOTIFY, sharedPrefKey, notificationsSettings, 0);
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
        this.G = -1;
        this.H = -1;
        this.I = -1;
        this.J = -1;
        if (DialogObject.isUserDialog(j10)) {
        }
        int i202 = this.U;
        this.P = i202;
        this.Q = i202 + 1;
        int i212 = i202 + 3;
        this.U = i212;
        this.R = i202 + 2;
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
        if (!this.W) {
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
