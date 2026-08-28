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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class s01 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
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
    public org.telegram.ui.Components.wk0 a;
    public q01 b;
    public AnimatorSet c;
    public final org.telegram.ui.ActionBar.b6 d;
    public final long e;
    public final long f;
    public final boolean h;
    public boolean n;
    public r01 r;
    public org.telegram.ui.Components.tn s;
    public int v;
    public int w;
    public int x;
    public int y;

    public s01(Bundle bundle, org.telegram.ui.ActionBar.b6 b6Var) {
        super(bundle);
        this.d = b6Var;
        this.e = bundle.getLong("dialog_id");
        this.f = bundle.getLong("topic_id");
        this.h = bundle.getBoolean("exception", false);
    }

    public static /* synthetic */ void T(s01 s01Var, String str, int i9, int i10) {
        MessagesController.getNotificationsSettings(s01Var.currentAccount).edit().putInt("smart_max_count_" + str, i9).putInt("smart_delay_" + str, i10).apply();
        q01 q01Var = s01Var.b;
        if (q01Var != null) {
            q01Var.m(s01Var.D);
        }
    }

    public static void U(final s01 s01Var, Context context, String str, View view, int i9) {
        long j10 = s01Var.f;
        long j11 = s01Var.e;
        org.telegram.ui.ActionBar.b6 b6Var = s01Var.d;
        if (view.isEnabled()) {
            Parcelable parcelable = null;
            final int i10 = 0;
            if (i9 == s01Var.S) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, b6Var);
                String string = LocaleController.getString(R.string.ResetCustomNotificationsAlertTitle);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                c2Var.N = string;
                c2Var.P = LocaleController.getString(R.string.ResetCustomNotificationsAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new n01(s01Var, str));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                s01Var.showDialog(c2Var);
                TextView textView = (TextView) c2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q7, false));
                    return;
                }
                return;
            }
            if (i9 == s01Var.B) {
                Bundle g10 = e2.c.g(j11, "dialog_id");
                g10.putLong("topic_id", j10);
                s01Var.presentFragment(new kk0(g10, b6Var));
                return;
            }
            final int i11 = 1;
            if (i9 == s01Var.M) {
                try {
                    Intent intent = new Intent("android.intent.action.RINGTONE_PICKER");
                    intent.putExtra("android.intent.extra.ringtone.TYPE", 1);
                    intent.putExtra("android.intent.extra.ringtone.SHOW_DEFAULT", true);
                    intent.putExtra("android.intent.extra.ringtone.SHOW_SILENT", true);
                    intent.putExtra("android.intent.extra.ringtone.DEFAULT_URI", RingtoneManager.getDefaultUri(1));
                    SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(s01Var.currentAccount);
                    Uri uri = Settings.System.DEFAULT_NOTIFICATION_URI;
                    String path = uri != null ? uri.getPath() : null;
                    String string2 = notificationsSettings.getString("ringtone_path_" + str, path);
                    if (string2 != null && !string2.equals("NoSound")) {
                        parcelable = string2.equals(path) ? uri : Uri.parse(string2);
                    }
                    intent.putExtra("android.intent.extra.ringtone.EXISTING_URI", parcelable);
                    s01Var.startActivityForResult(intent, 13);
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            }
            if (i9 == s01Var.C) {
                Activity parentActivity = s01Var.getParentActivity();
                long j12 = s01Var.e;
                long j13 = s01Var.f;
                Runnable runnable = new Runnable(s01Var) { // from class: org.telegram.ui.o01
                    public final /* synthetic */ s01 b;

                    {
                        this.b = s01Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                s01 s01Var2 = this.b;
                                q01 q01Var = s01Var2.b;
                                if (q01Var != null) {
                                    q01Var.m(s01Var2.C);
                                    break;
                                }
                                break;
                            case 1:
                                s01 s01Var3 = this.b;
                                q01 q01Var2 = s01Var3.b;
                                if (q01Var2 != null) {
                                    q01Var2.m(s01Var3.N);
                                    break;
                                }
                                break;
                            case 2:
                                s01 s01Var4 = this.b;
                                q01 q01Var3 = s01Var4.b;
                                if (q01Var3 != null) {
                                    q01Var3.m(s01Var4.E);
                                    break;
                                }
                                break;
                            default:
                                s01 s01Var5 = this.b;
                                q01 q01Var4 = s01Var5.b;
                                if (q01Var4 != null) {
                                    q01Var4.m(s01Var5.Q);
                                    break;
                                }
                                break;
                        }
                    }
                };
                org.telegram.ui.ActionBar.b6 b6Var2 = s01Var.d;
                Pattern pattern = org.telegram.ui.Components.y4.a;
                s01Var.showDialog(org.telegram.ui.Components.y4.Y(parentActivity, j12, j13, j12 != 0 ? aa.d.m(j12, "vibrate_") : "vibrate_messages", runnable, b6Var2));
                return;
            }
            int i12 = 21;
            final int i13 = 3;
            if (i9 == s01Var.y) {
                org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
                boolean z10 = !t8Var.e.h;
                s01Var.n = z10;
                t8Var.setChecked(z10);
                int childCount = s01Var.a.getChildCount();
                ArrayList arrayList = new ArrayList();
                while (i10 < childCount) {
                    org.telegram.ui.Components.ik0 ik0Var = (org.telegram.ui.Components.ik0) s01Var.a.T(s01Var.a.getChildAt(i10));
                    int i14 = ik0Var.f;
                    View view2 = ik0Var.a;
                    int b10 = ik0Var.b();
                    if (b10 != s01Var.y && b10 != s01Var.S) {
                        if (i14 == 0) {
                            ((org.telegram.ui.Cells.m4) view2).a(arrayList, s01Var.n);
                        } else if (i14 == 1) {
                            ((org.telegram.ui.Cells.ba) view2).a(arrayList, s01Var.n);
                        } else if (i14 == 2) {
                            ((org.telegram.ui.Cells.b9) view2).c(arrayList, s01Var.n);
                        } else if (i14 == 3) {
                            ((org.telegram.ui.Cells.v8) view2).a(arrayList, s01Var.n);
                        } else if (i14 == 4) {
                            ((org.telegram.ui.Cells.j6) view2).b(arrayList, s01Var.n);
                        } else if (i14 == 7 && b10 == s01Var.A) {
                            ((org.telegram.ui.Cells.t8) view2).e(arrayList, s01Var.n);
                        }
                    }
                    i10++;
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                AnimatorSet animatorSet = s01Var.c;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                s01Var.c = animatorSet2;
                animatorSet2.playTogether(arrayList);
                s01Var.c.addListener(new bc0(s01Var, i12));
                s01Var.c.setDuration(150L);
                s01Var.c.start();
                return;
            }
            if (i9 == s01Var.A) {
                org.telegram.ui.Cells.t8 t8Var2 = (org.telegram.ui.Cells.t8) view;
                Switch r32 = t8Var2.e;
                MessagesController.getNotificationsSettings(s01Var.currentAccount).edit().putBoolean(ta.b.d(NotificationsSettingsFacade.PROPERTY_CONTENT_PREVIEW, str), !r32.h).apply();
                t8Var2.setChecked(!r32.h);
                return;
            }
            if (i9 == s01Var.N) {
                s01Var.showDialog(org.telegram.ui.Components.y4.Y(s01Var.getParentActivity(), s01Var.e, s01Var.f, ta.b.d("calls_vibrate_", str), new Runnable(s01Var) { // from class: org.telegram.ui.o01
                    public final /* synthetic */ s01 b;

                    {
                        this.b = s01Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                s01 s01Var2 = this.b;
                                q01 q01Var = s01Var2.b;
                                if (q01Var != null) {
                                    q01Var.m(s01Var2.C);
                                    break;
                                }
                                break;
                            case 1:
                                s01 s01Var3 = this.b;
                                q01 q01Var2 = s01Var3.b;
                                if (q01Var2 != null) {
                                    q01Var2.m(s01Var3.N);
                                    break;
                                }
                                break;
                            case 2:
                                s01 s01Var4 = this.b;
                                q01 q01Var3 = s01Var4.b;
                                if (q01Var3 != null) {
                                    q01Var3.m(s01Var4.E);
                                    break;
                                }
                                break;
                            default:
                                s01 s01Var5 = this.b;
                                q01 q01Var4 = s01Var5.b;
                                if (q01Var4 != null) {
                                    q01Var4.m(s01Var5.Q);
                                    break;
                                }
                                break;
                        }
                    }
                }, s01Var.d));
                return;
            }
            if (i9 == s01Var.E) {
                s01Var.showDialog(org.telegram.ui.Components.y4.I(s01Var.getParentActivity(), s01Var.e, s01Var.f, -1, new Runnable(s01Var) { // from class: org.telegram.ui.o01
                    public final /* synthetic */ s01 b;

                    {
                        this.b = s01Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (r2) {
                            case 0:
                                s01 s01Var2 = this.b;
                                q01 q01Var = s01Var2.b;
                                if (q01Var != null) {
                                    q01Var.m(s01Var2.C);
                                    break;
                                }
                                break;
                            case 1:
                                s01 s01Var3 = this.b;
                                q01 q01Var2 = s01Var3.b;
                                if (q01Var2 != null) {
                                    q01Var2.m(s01Var3.N);
                                    break;
                                }
                                break;
                            case 2:
                                s01 s01Var4 = this.b;
                                q01 q01Var3 = s01Var4.b;
                                if (q01Var3 != null) {
                                    q01Var3.m(s01Var4.E);
                                    break;
                                }
                                break;
                            default:
                                s01 s01Var5 = this.b;
                                q01 q01Var4 = s01Var5.b;
                                if (q01Var4 != null) {
                                    q01Var4.m(s01Var5.Q);
                                    break;
                                }
                                break;
                        }
                    }
                }, s01Var.d));
                return;
            }
            if (i9 != s01Var.D) {
                if (i9 == s01Var.Q) {
                    if (s01Var.getParentActivity() == null) {
                        return;
                    }
                    s01Var.showDialog(org.telegram.ui.Components.y4.u(s01Var.getParentActivity(), s01Var.e, s01Var.f, -1, new Runnable(s01Var) { // from class: org.telegram.ui.o01
                        public final /* synthetic */ s01 b;

                        {
                            this.b = s01Var;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i13) {
                                case 0:
                                    s01 s01Var2 = this.b;
                                    q01 q01Var = s01Var2.b;
                                    if (q01Var != null) {
                                        q01Var.m(s01Var2.C);
                                        break;
                                    }
                                    break;
                                case 1:
                                    s01 s01Var3 = this.b;
                                    q01 q01Var2 = s01Var3.b;
                                    if (q01Var2 != null) {
                                        q01Var2.m(s01Var3.N);
                                        break;
                                    }
                                    break;
                                case 2:
                                    s01 s01Var4 = this.b;
                                    q01 q01Var3 = s01Var4.b;
                                    if (q01Var3 != null) {
                                        q01Var3.m(s01Var4.E);
                                        break;
                                    }
                                    break;
                                default:
                                    s01 s01Var5 = this.b;
                                    q01 q01Var4 = s01Var5.b;
                                    if (q01Var4 != null) {
                                        q01Var4.m(s01Var5.Q);
                                        break;
                                    }
                                    break;
                            }
                        }
                    }, s01Var.d));
                    return;
                }
                if (i9 == s01Var.H) {
                    MessagesController.getNotificationsSettings(s01Var.currentAccount).edit().putInt("popup_" + str, 1).apply();
                    ((org.telegram.ui.Cells.j6) view).a(true, true);
                    View findViewWithTag = s01Var.a.findViewWithTag(2);
                    if (findViewWithTag != null) {
                        ((org.telegram.ui.Cells.j6) findViewWithTag).a(false, true);
                        return;
                    }
                    return;
                }
                if (i9 == s01Var.I) {
                    MessagesController.getNotificationsSettings(s01Var.currentAccount).edit().putInt("popup_" + str, 2).apply();
                    ((org.telegram.ui.Cells.j6) view).a(true, true);
                    View findViewWithTag2 = s01Var.a.findViewWithTag(1);
                    if (findViewWithTag2 != null) {
                        ((org.telegram.ui.Cells.j6) findViewWithTag2).a(false, true);
                        return;
                    }
                    return;
                }
                if (i9 == s01Var.K) {
                    org.telegram.ui.Cells.t8 t8Var3 = (org.telegram.ui.Cells.t8) view;
                    boolean z11 = t8Var3.e.h;
                    boolean z12 = !z11;
                    t8Var3.setChecked(z12);
                    SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(s01Var.currentAccount).edit();
                    if (!s01Var.V || z11) {
                        edit.putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, z12);
                    } else {
                        edit.remove(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str);
                    }
                    edit.apply();
                    s01Var.getNotificationsController().updateServerNotificationsSettings(j11, j10);
                    return;
                }
                return;
            }
            if (s01Var.getParentActivity() == null) {
                return;
            }
            SharedPreferences notificationsSettings2 = MessagesController.getNotificationsSettings(s01Var.currentAccount);
            int c10 = org.telegram.messenger.l0.c("smart_max_count_", str, notificationsSettings2, 2);
            int c11 = org.telegram.messenger.l0.c("smart_delay_", str, notificationsSettings2, 180);
            r14 = c10 != 0 ? c10 : 2;
            Activity parentActivity2 = s01Var.getParentActivity();
            n01 n01Var = new n01(s01Var, str);
            Pattern pattern2 = org.telegram.ui.Components.y4.a;
            if (parentActivity2 == null) {
                return;
            }
            int i15 = org.telegram.ui.ActionBar.f6.j5;
            int p02 = b6Var != null ? b6Var.p0(i15) : org.telegram.ui.ActionBar.f6.w0(null, i15, false);
            int i16 = org.telegram.ui.ActionBar.f6.h5;
            int p03 = b6Var != null ? b6Var.p0(i16) : org.telegram.ui.ActionBar.f6.w0(null, i16, false);
            int i17 = org.telegram.ui.ActionBar.f6.Ji;
            if (b6Var != null) {
                b6Var.p0(i17);
            } else {
                org.telegram.ui.ActionBar.f6.w0(null, i17, false);
            }
            int i18 = org.telegram.ui.ActionBar.f6.Ni;
            if (b6Var != null) {
                b6Var.p0(i18);
            } else {
                org.telegram.ui.ActionBar.f6.w0(null, i18, false);
            }
            int i19 = org.telegram.ui.ActionBar.f6.E8;
            if (b6Var != null) {
                b6Var.p0(i19);
            } else {
                org.telegram.ui.ActionBar.f6.w0(null, i19, false);
            }
            int i20 = org.telegram.ui.ActionBar.f6.G8;
            if (b6Var != null) {
                b6Var.p0(i20);
            } else {
                org.telegram.ui.ActionBar.f6.w0(null, i20, false);
            }
            int i21 = org.telegram.ui.ActionBar.f6.i6;
            if (b6Var != null) {
                b6Var.p0(i21);
            } else {
                org.telegram.ui.ActionBar.f6.w0(null, i21, false);
            }
            int i22 = org.telegram.ui.ActionBar.f6.Sh;
            int p04 = b6Var != null ? b6Var.p0(i22) : org.telegram.ui.ActionBar.f6.w0(null, i22, false);
            int i23 = org.telegram.ui.ActionBar.f6.Oh;
            int p05 = b6Var != null ? b6Var.p0(i23) : org.telegram.ui.ActionBar.f6.w0(null, i23, false);
            int i24 = org.telegram.ui.ActionBar.f6.Qh;
            int p06 = b6Var != null ? b6Var.p0(i24) : org.telegram.ui.ActionBar.f6.w0(null, i24, false);
            org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(parentActivity2, b6Var);
            a3Var.a();
            org.telegram.ui.Components.e4 e4Var = new org.telegram.ui.Components.e4(parentActivity2, b6Var);
            e4Var.setMinValue(0);
            e4Var.setMaxValue(10);
            e4Var.setTextColor(p02);
            e4Var.setValue(r14 - 1);
            e4Var.setWrapSelectorWheel(false);
            e4Var.setFormatter(new tr(i12));
            org.telegram.ui.Components.f4 f4Var = new org.telegram.ui.Components.f4(parentActivity2, b6Var);
            f4Var.setMinValue(0);
            f4Var.setMaxValue(10);
            f4Var.setTextColor(p02);
            f4Var.setValue((c11 / 60) - 1);
            f4Var.setWrapSelectorWheel(false);
            f4Var.setFormatter(new tr(22));
            org.telegram.ui.Components.bc0 bc0Var = new org.telegram.ui.Components.bc0(parentActivity2, b6Var);
            bc0Var.setMinValue(0);
            bc0Var.setMaxValue(0);
            bc0Var.setTextColor(p02);
            bc0Var.setValue(0);
            bc0Var.setWrapSelectorWheel(false);
            bc0Var.setFormatter(new tr(23));
            org.telegram.ui.Components.r3 r3Var = new org.telegram.ui.Components.r3(parentActivity2, e4Var, f4Var, bc0Var);
            r3Var.setOrientation(1);
            FrameLayout frameLayout = new FrameLayout(parentActivity2);
            r3Var.addView(frameLayout, g7.e6.t(-1, -2, 51, 22, 0, 0, 4));
            TextView textView2 = new TextView(parentActivity2);
            textView2.setText(LocaleController.getString(R.string.NotfificationsFrequencyTitle));
            textView2.setTextColor(p02);
            textView2.setTextSize(1, 20.0f);
            textView2.setTypeface(AndroidUtilities.bold());
            frameLayout.addView(textView2, g7.e6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
            textView2.setOnTouchListener(new jh.d(10));
            LinearLayout linearLayout = new LinearLayout(parentActivity2);
            linearLayout.setOrientation(0);
            linearLayout.setWeightSum(1.0f);
            r3Var.addView(linearLayout, g7.e6.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
            bg.t tVar = new bg.t(parentActivity2, 19);
            linearLayout.addView(e4Var, g7.e6.l(0.4f, 0, 270));
            linearLayout.addView(bc0Var, g7.e6.o(0, -2, 0.2f, 16));
            linearLayout.addView(f4Var, g7.e6.l(0.4f, 0, 270));
            tVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            tVar.setGravity(17);
            tVar.setTextColor(p04);
            tVar.setTextSize(1, 14.0f);
            tVar.setTypeface(AndroidUtilities.bold());
            int dp = AndroidUtilities.dp(8.0f);
            tVar.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.i0(dp, dp, dp, dp, p05, p06, p06));
            tVar.setText(LocaleController.getString(R.string.AutoDeleteConfirm));
            r3Var.addView(tVar, g7.e6.t(-1, 48, 83, 16, 15, 16, 16));
            tr trVar = new tr(10);
            e4Var.setOnValueChangedListener(trVar);
            f4Var.setOnValueChangedListener(trVar);
            tVar.setOnClickListener(new fh.g4(e4Var, f4Var, n01Var, a3Var, 8));
            a3Var.b(r3Var);
            org.telegram.ui.ActionBar.f3 f3Var = a3Var.a;
            f3Var.show();
            f3Var.setBackgroundColor(p03);
            f3Var.fixNavigationBar(p03);
        }
    }

    public static /* synthetic */ void V(s01 s01Var, String str) {
        s01Var.W = true;
        MessagesController.getNotificationsSettings(s01Var.currentAccount).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_CUSTOM + str, false).remove(NotificationsSettingsFacade.PROPERTY_NOTIFY + str).apply();
        s01Var.finishFragment();
        r01 r01Var = s01Var.r;
        if (r01Var != null) {
            r01Var.E();
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i9 = org.telegram.ui.ActionBar.f6.f8;
        org.telegram.ui.ActionBar.b6 b6Var = this.d;
        kVar.A(org.telegram.ui.ActionBar.f6.v0(i9, b6Var), false);
        this.actionBar.C(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.v8, b6Var), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        long j10 = this.e;
        long j11 = this.f;
        String sharedPrefKey = NotificationsController.getSharedPrefKey(j10, j11);
        this.actionBar.setActionBarMenuOnItemClick(new p01(this, sharedPrefKey));
        org.telegram.ui.Components.tn tnVar = new org.telegram.ui.Components.tn(context, null, false, b6Var);
        this.s = tnVar;
        tnVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        this.actionBar.addView(this.s, 0, g7.e6.d(-2, -1.0f, 51, !this.inPreviewMode ? 56.0f : 0.0f, 0.0f, 40.0f, 0.0f));
        this.actionBar.setAllowOverlayTitle(false);
        if (j10 >= 0) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(j10));
            if (user != null) {
                this.s.setUserAvatar(user);
                this.s.setTitle(ContactsController.formatName(user.first_name, user.last_name));
            }
        } else if (j11 != 0) {
            TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(-j10, j11);
            vf.c.p(this.s.getAvatarImageView(), findTopic, false, true, b6Var);
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
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.a7, b6Var));
        org.telegram.ui.Components.wk0 wk0Var = new org.telegram.ui.Components.wk0(context, null);
        this.a = wk0Var;
        wk0Var.p1();
        this.actionBar.setAdaptiveBackground(this.a);
        frameLayout.addView(this.a, g7.e6.c(-1.0f, -1));
        org.telegram.ui.Components.wk0 wk0Var2 = this.a;
        q01 q01Var = new q01(this, context);
        this.b = q01Var;
        wk0Var2.setAdapter(q01Var);
        this.a.setItemAnimator(null);
        this.a.setLayoutAnimation(null);
        this.a.setLayoutManager(new of.y(16));
        this.a.setOnItemClickListener(new qa1(this, context, sharedPrefKey, 1));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.notificationsSettingsUpdated) {
            try {
                this.b.l();
            } catch (Exception unused) {
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final org.telegram.ui.ActionBar.b6 getResourceProvider() {
        return this.d;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        sx0 sx0Var = new sx0(1, this);
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 16, new Class[]{org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.ba.class, org.telegram.ui.Cells.v8.class, org.telegram.ui.Cells.j6.class, org.telegram.ui.Cells.ua.class, org.telegram.ui.Cells.t8.class, org.telegram.ui.Cells.q8.class}, null, null, null, org.telegram.ui.ActionBar.f6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i9 = org.telegram.ui.ActionBar.f6.s8;
        arrayList.add(new org.telegram.ui.ActionBar.h6(kVar, 1, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 32768, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.f6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.f6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 4096, null, null, null, null, org.telegram.ui.ActionBar.f6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.f6.k0, null, null, org.telegram.ui.ActionBar.f6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.L6));
        int i10 = org.telegram.ui.ActionBar.f6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 0, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 0, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 0, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 0, new Class[]{org.telegram.ui.Cells.v8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 0, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 8192, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.g7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 16384, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.h7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.z6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 0, new Class[]{org.telegram.ui.Cells.ua.class}, new String[]{"nameTextView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 0, new Class[]{org.telegram.ui.Cells.ua.class}, new String[]{"statusColor"}, null, null, -1, sx0Var, org.telegram.ui.ActionBar.f6.y6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 0, new Class[]{org.telegram.ui.Cells.ua.class}, new String[]{"statusOnlineColor"}, null, null, -1, sx0Var, org.telegram.ui.ActionBar.f6.n6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 0, new Class[]{org.telegram.ui.Cells.ua.class}, null, org.telegram.ui.ActionBar.f6.r0, null, org.telegram.ui.ActionBar.f6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, sx0Var, org.telegram.ui.ActionBar.f6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, sx0Var, org.telegram.ui.ActionBar.f6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, sx0Var, org.telegram.ui.ActionBar.f6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, sx0Var, org.telegram.ui.ActionBar.f6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, sx0Var, org.telegram.ui.ActionBar.f6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, sx0Var, org.telegram.ui.ActionBar.f6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, sx0Var, org.telegram.ui.ActionBar.f6.U7));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onActivityResultFragment(int i9, int i10, Intent intent) {
        String str;
        Ringtone ringtone;
        if (i10 != -1 || intent == null) {
            return;
        }
        Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
        if (uri == null || (ringtone = RingtoneManager.getRingtone(ApplicationLoader.applicationContext, uri)) == null) {
            str = null;
        } else {
            str = i9 == 13 ? uri.equals(Settings.System.DEFAULT_RINGTONE_URI) ? LocaleController.getString(R.string.DefaultRingtone) : ringtone.getTitle(getParentActivity()) : uri.equals(Settings.System.DEFAULT_NOTIFICATION_URI) ? LocaleController.getString(R.string.SoundDefault) : ringtone.getTitle(getParentActivity());
            ringtone.stop();
        }
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(this.currentAccount).edit();
        String sharedPrefKey = NotificationsController.getSharedPrefKey(this.e, this.f);
        if (i9 == 12) {
            if (str != null) {
                edit.putString("sound_" + sharedPrefKey, str);
                edit.putString("sound_path_" + sharedPrefKey, uri.toString());
            } else {
                edit.putString("sound_" + sharedPrefKey, "NoSound");
                edit.putString("sound_path_" + sharedPrefKey, "NoSound");
            }
            getNotificationsController().deleteNotificationChannel(this.e, this.f);
        } else if (i9 == 13) {
            if (str != null) {
                edit.putString("ringtone_" + sharedPrefKey, str);
                edit.putString("ringtone_path_" + sharedPrefKey, uri.toString());
            } else {
                edit.putString("ringtone_" + sharedPrefKey, "NoSound");
                edit.putString("ringtone_path_" + sharedPrefKey, "NoSound");
            }
        }
        edit.apply();
        q01 q01Var = this.b;
        if (q01Var != null) {
            q01Var.m(i9 == 13 ? this.M : this.B);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010f  */
    @Override // org.telegram.ui.ActionBar.o2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onFragmentCreate() {
        boolean z10;
        long j10 = this.e;
        if (DialogObject.isUserDialog(j10)) {
            ArrayList<TLRPC.TL_topPeer> arrayList = getMediaDataController().hints;
            int i9 = 0;
            while (true) {
                if (i9 >= arrayList.size()) {
                    break;
                }
                TLRPC.Peer peer = arrayList.get(i9).peer;
                if ((peer instanceof TLRPC.TL_peerUser) && peer.user_id == j10) {
                    this.V = i9 < 5;
                } else {
                    i9++;
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
        int i10 = this.U;
        int i11 = i10 + 1;
        this.U = i11;
        this.v = i10;
        long j11 = this.f;
        if (z11 || j11 != 0) {
            this.U = i10 + 2;
            this.y = i11;
        } else {
            this.y = -1;
        }
        this.K = -1;
        if (DialogObject.isEncryptedDialog(j10)) {
            this.A = -1;
        } else {
            int i12 = this.U;
            this.U = i12 + 1;
            this.A = i12;
            if (DialogObject.isUserDialog(j10)) {
                int i13 = this.U;
                this.U = i13 + 1;
                this.K = i13;
            }
        }
        int i14 = this.U;
        this.B = i14;
        this.U = i14 + 2;
        this.C = i14 + 1;
        if (DialogObject.isChatDialog(j10)) {
            int i15 = this.U;
            this.U = i15 + 1;
            this.D = i15;
        } else {
            this.D = -1;
        }
        int i16 = this.U;
        this.E = i16;
        this.U = i16 + 2;
        this.F = i16 + 1;
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
                    int i17 = this.U;
                    this.G = i17;
                    this.H = i17 + 1;
                    this.I = i17 + 2;
                    this.U = i17 + 4;
                    this.J = i17 + 3;
                }
                if (DialogObject.isUserDialog(j10)) {
                    this.L = -1;
                    this.N = -1;
                    this.M = -1;
                    this.O = -1;
                } else {
                    int i18 = this.U;
                    this.L = i18;
                    this.N = i18 + 1;
                    this.M = i18 + 2;
                    this.U = i18 + 4;
                    this.O = i18 + 3;
                }
                int i19 = this.U;
                this.P = i19;
                this.Q = i19 + 1;
                int i20 = i19 + 3;
                this.U = i20;
                this.R = i19 + 2;
                if (z11) {
                    this.S = i20;
                    this.U = i19 + 5;
                    this.T = i19 + 4;
                } else {
                    this.S = -1;
                    this.T = -1;
                }
                boolean isGlobalNotificationsEnabled = NotificationsController.getInstance(this.currentAccount).isGlobalNotificationsEnabled(j10, false, false);
                if (z11) {
                    SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.currentAccount);
                    String sharedPrefKey = NotificationsController.getSharedPrefKey(j10, j11);
                    boolean contains = notificationsSettings.contains(NotificationsSettingsFacade.PROPERTY_NOTIFY + sharedPrefKey);
                    int c10 = org.telegram.messenger.l0.c(NotificationsSettingsFacade.PROPERTY_NOTIFY, sharedPrefKey, notificationsSettings, 0);
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
        int i192 = this.U;
        this.P = i192;
        this.Q = i192 + 1;
        int i202 = i192 + 3;
        this.U = i202;
        this.R = i192 + 2;
        if (z11) {
        }
        boolean isGlobalNotificationsEnabled2 = NotificationsController.getInstance(this.currentAccount).isGlobalNotificationsEnabled(j10, false, false);
        if (z11) {
        }
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.notificationsSettingsUpdated);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.W) {
            String sharedPrefKey = NotificationsController.getSharedPrefKey(this.e, this.f);
            MessagesController.getNotificationsSettings(this.currentAccount).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_CUSTOM + sharedPrefKey, true).apply();
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.notificationsSettingsUpdated);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onInsets(int i9, int i10, int i11, int i12) {
        this.a.setPadding(0, 0, 0, i12);
        this.a.setClipToPadding(false);
    }
}
