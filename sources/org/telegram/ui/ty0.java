package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
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
import java.util.HashSet;
import java.util.regex.Pattern;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.Switch;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class ty0 extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.vs {
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
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public FrameLayout a;
    public boolean a0;
    public org.telegram.ui.Components.uk0 b;
    public boolean b0;
    public ry0 c;
    public AnimatorSet d;
    public final org.telegram.ui.ActionBar.p6 e;
    public final long f;
    public final long h;
    public final boolean n;
    public boolean r;
    public sy0 s;
    public org.telegram.ui.Components.sn w;
    public int x;
    public int y;

    public ty0(Bundle bundle, org.telegram.ui.ActionBar.p6 p6Var) {
        super(bundle);
        this.e = p6Var;
        this.f = bundle.getLong("dialog_id");
        this.h = bundle.getLong("topic_id");
        this.n = bundle.getBoolean("exception", false);
    }

    public static void Z(ty0 ty0Var, String str, int i10, int i11) {
        org.telegram.messenger.wp.r1(ty0Var.currentAccount).e7.edit().putInt("smart_max_count_" + str, i10).putInt("smart_delay_" + str, i11).apply();
        ry0 ry0Var = ty0Var.c;
        if (ry0Var != null) {
            ry0Var.g(ty0Var.I);
        }
    }

    public static void a0(final ty0 ty0Var, Context context, String str, View view, int i10) {
        org.telegram.ui.ActionBar.p6 p6Var = ty0Var.e;
        if (view.isEnabled()) {
            final int i11 = 0;
            Parcelable parcelable = null;
            if (i10 == ty0Var.X) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, p6Var);
                String L0 = org.telegram.messenger.dd.L0(2131746119, null);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                x1Var.R = L0;
                x1Var.T = org.telegram.messenger.dd.L0(2131746120, null);
                alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131746135, null), new oy0(ty0Var, str));
                alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                ty0Var.showDialog(x1Var);
                TextView textView = (TextView) x1Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q7, null);
                    return;
                }
                return;
            }
            if (i10 == ty0Var.G) {
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", ty0Var.f);
                bundle.putLong("topic_id", ty0Var.h);
                ty0Var.presentFragment(new wi0(bundle, p6Var));
                return;
            }
            final int i12 = 1;
            if (i10 == ty0Var.R) {
                try {
                    Intent intent = new Intent("android.intent.action.RINGTONE_PICKER");
                    intent.putExtra("android.intent.extra.ringtone.TYPE", 1);
                    intent.putExtra("android.intent.extra.ringtone.SHOW_DEFAULT", true);
                    intent.putExtra("android.intent.extra.ringtone.SHOW_SILENT", true);
                    intent.putExtra("android.intent.extra.ringtone.DEFAULT_URI", RingtoneManager.getDefaultUri(1));
                    SharedPreferences sharedPreferences = org.telegram.messenger.wp.r1(ty0Var.currentAccount).e7;
                    Uri uri = Settings.System.DEFAULT_NOTIFICATION_URI;
                    String path = uri != null ? uri.getPath() : null;
                    String string = sharedPreferences.getString("ringtone_path_" + str, path);
                    if (string != null && !string.equals("NoSound")) {
                        parcelable = string.equals(path) ? uri : Uri.parse(string);
                    }
                    intent.putExtra("android.intent.extra.ringtone.EXISTING_URI", parcelable);
                    ty0Var.startActivityForResult(intent, 13);
                    return;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    return;
                }
            }
            if (i10 == ty0Var.H) {
                Activity parentActivity = ty0Var.getParentActivity();
                long j10 = ty0Var.f;
                long j11 = ty0Var.h;
                Runnable runnable = new Runnable(ty0Var) { // from class: org.telegram.ui.py0
                    public final /* synthetic */ ty0 b;

                    {
                        this.b = ty0Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                ty0 ty0Var2 = this.b;
                                ry0 ry0Var = ty0Var2.c;
                                if (ry0Var != null) {
                                    ry0Var.g(ty0Var2.H);
                                    break;
                                }
                                break;
                            case 1:
                                ty0 ty0Var3 = this.b;
                                ry0 ry0Var2 = ty0Var3.c;
                                if (ry0Var2 != null) {
                                    ry0Var2.g(ty0Var3.S);
                                    break;
                                }
                                break;
                            case 2:
                                ty0 ty0Var4 = this.b;
                                ry0 ry0Var3 = ty0Var4.c;
                                if (ry0Var3 != null) {
                                    ry0Var3.g(ty0Var4.J);
                                    break;
                                }
                                break;
                            default:
                                ty0 ty0Var5 = this.b;
                                ry0 ry0Var4 = ty0Var5.c;
                                if (ry0Var4 != null) {
                                    ry0Var4.g(ty0Var5.V);
                                    break;
                                }
                                break;
                        }
                    }
                };
                org.telegram.ui.ActionBar.p6 p6Var2 = ty0Var.e;
                Pattern pattern = org.telegram.ui.Components.s4.a;
                ty0Var.showDialog(org.telegram.ui.Components.s4.X(parentActivity, j10, j11, j10 != 0 ? a1.g.l(j10, "vibrate_") : "vibrate_messages", runnable, p6Var2));
                return;
            }
            final int i13 = 3;
            int i14 = 4;
            if (i10 == ty0Var.E) {
                org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
                boolean z10 = !t8Var.e.h;
                ty0Var.r = z10;
                t8Var.setChecked(z10);
                int childCount = ty0Var.b.getChildCount();
                ArrayList arrayList = new ArrayList();
                while (i11 < childCount) {
                    org.telegram.ui.Components.dk0 dk0Var = (org.telegram.ui.Components.dk0) ty0Var.b.T(ty0Var.b.getChildAt(i11));
                    int i15 = dk0Var.f;
                    View view2 = dk0Var.a;
                    int b10 = dk0Var.b();
                    if (b10 != ty0Var.E && b10 != ty0Var.X) {
                        if (i15 == 0) {
                            ((org.telegram.ui.Cells.p4) view2).a(arrayList, ty0Var.r);
                        } else if (i15 == 1) {
                            ((org.telegram.ui.Cells.x9) view2).a(arrayList, ty0Var.r);
                        } else if (i15 == 2) {
                            ((org.telegram.ui.Cells.b9) view2).c(arrayList, ty0Var.r);
                        } else if (i15 == 3) {
                            ((org.telegram.ui.Cells.v8) view2).a(arrayList, ty0Var.r);
                        } else if (i15 == 4) {
                            ((org.telegram.ui.Cells.m6) view2).b(arrayList, ty0Var.r);
                        } else if (i15 == 7 && b10 == ty0Var.F) {
                            ((org.telegram.ui.Cells.t8) view2).e(arrayList, ty0Var.r);
                        }
                    }
                    i11++;
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                AnimatorSet animatorSet = ty0Var.d;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                ty0Var.d = animatorSet2;
                animatorSet2.playTogether(arrayList);
                ty0Var.d.addListener(new ms0(ty0Var, i14));
                ty0Var.d.setDuration(150L);
                ty0Var.d.start();
                return;
            }
            if (i10 == ty0Var.F) {
                org.telegram.ui.Cells.t8 t8Var2 = (org.telegram.ui.Cells.t8) view;
                Switch r32 = t8Var2.e;
                org.telegram.messenger.wp.r1(ty0Var.currentAccount).e7.edit().putBoolean(sc.e.h("content_preview_", str), !r32.h).apply();
                t8Var2.setChecked(!r32.h);
                return;
            }
            if (i10 == ty0Var.S) {
                ty0Var.showDialog(org.telegram.ui.Components.s4.X(ty0Var.getParentActivity(), ty0Var.f, ty0Var.h, sc.e.h("calls_vibrate_", str), new Runnable(ty0Var) { // from class: org.telegram.ui.py0
                    public final /* synthetic */ ty0 b;

                    {
                        this.b = ty0Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                ty0 ty0Var2 = this.b;
                                ry0 ry0Var = ty0Var2.c;
                                if (ry0Var != null) {
                                    ry0Var.g(ty0Var2.H);
                                    break;
                                }
                                break;
                            case 1:
                                ty0 ty0Var3 = this.b;
                                ry0 ry0Var2 = ty0Var3.c;
                                if (ry0Var2 != null) {
                                    ry0Var2.g(ty0Var3.S);
                                    break;
                                }
                                break;
                            case 2:
                                ty0 ty0Var4 = this.b;
                                ry0 ry0Var3 = ty0Var4.c;
                                if (ry0Var3 != null) {
                                    ry0Var3.g(ty0Var4.J);
                                    break;
                                }
                                break;
                            default:
                                ty0 ty0Var5 = this.b;
                                ry0 ry0Var4 = ty0Var5.c;
                                if (ry0Var4 != null) {
                                    ry0Var4.g(ty0Var5.V);
                                    break;
                                }
                                break;
                        }
                    }
                }, ty0Var.e));
                return;
            }
            if (i10 == ty0Var.J) {
                ty0Var.showDialog(org.telegram.ui.Components.s4.H(ty0Var.getParentActivity(), ty0Var.f, ty0Var.h, -1, new Runnable(ty0Var) { // from class: org.telegram.ui.py0
                    public final /* synthetic */ ty0 b;

                    {
                        this.b = ty0Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (r2) {
                            case 0:
                                ty0 ty0Var2 = this.b;
                                ry0 ry0Var = ty0Var2.c;
                                if (ry0Var != null) {
                                    ry0Var.g(ty0Var2.H);
                                    break;
                                }
                                break;
                            case 1:
                                ty0 ty0Var3 = this.b;
                                ry0 ry0Var2 = ty0Var3.c;
                                if (ry0Var2 != null) {
                                    ry0Var2.g(ty0Var3.S);
                                    break;
                                }
                                break;
                            case 2:
                                ty0 ty0Var4 = this.b;
                                ry0 ry0Var3 = ty0Var4.c;
                                if (ry0Var3 != null) {
                                    ry0Var3.g(ty0Var4.J);
                                    break;
                                }
                                break;
                            default:
                                ty0 ty0Var5 = this.b;
                                ry0 ry0Var4 = ty0Var5.c;
                                if (ry0Var4 != null) {
                                    ry0Var4.g(ty0Var5.V);
                                    break;
                                }
                                break;
                        }
                    }
                }, ty0Var.e));
                return;
            }
            if (i10 != ty0Var.I) {
                if (i10 == ty0Var.V) {
                    if (ty0Var.getParentActivity() == null) {
                        return;
                    }
                    ty0Var.showDialog(org.telegram.ui.Components.s4.t(ty0Var.getParentActivity(), ty0Var.f, ty0Var.h, -1, new Runnable(ty0Var) { // from class: org.telegram.ui.py0
                        public final /* synthetic */ ty0 b;

                        {
                            this.b = ty0Var;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i13) {
                                case 0:
                                    ty0 ty0Var2 = this.b;
                                    ry0 ry0Var = ty0Var2.c;
                                    if (ry0Var != null) {
                                        ry0Var.g(ty0Var2.H);
                                        break;
                                    }
                                    break;
                                case 1:
                                    ty0 ty0Var3 = this.b;
                                    ry0 ry0Var2 = ty0Var3.c;
                                    if (ry0Var2 != null) {
                                        ry0Var2.g(ty0Var3.S);
                                        break;
                                    }
                                    break;
                                case 2:
                                    ty0 ty0Var4 = this.b;
                                    ry0 ry0Var3 = ty0Var4.c;
                                    if (ry0Var3 != null) {
                                        ry0Var3.g(ty0Var4.J);
                                        break;
                                    }
                                    break;
                                default:
                                    ty0 ty0Var5 = this.b;
                                    ry0 ry0Var4 = ty0Var5.c;
                                    if (ry0Var4 != null) {
                                        ry0Var4.g(ty0Var5.V);
                                        break;
                                    }
                                    break;
                            }
                        }
                    }, ty0Var.e));
                    return;
                }
                if (i10 == ty0Var.M) {
                    org.telegram.messenger.wp.r1(ty0Var.currentAccount).e7.edit().putInt("popup_" + str, 1).apply();
                    ((org.telegram.ui.Cells.m6) view).a(true, true);
                    View findViewWithTag = ty0Var.b.findViewWithTag(2);
                    if (findViewWithTag != null) {
                        ((org.telegram.ui.Cells.m6) findViewWithTag).a(false, true);
                        return;
                    }
                    return;
                }
                if (i10 == ty0Var.N) {
                    org.telegram.messenger.wp.r1(ty0Var.currentAccount).e7.edit().putInt("popup_" + str, 2).apply();
                    ((org.telegram.ui.Cells.m6) view).a(true, true);
                    View findViewWithTag2 = ty0Var.b.findViewWithTag(1);
                    if (findViewWithTag2 != null) {
                        ((org.telegram.ui.Cells.m6) findViewWithTag2).a(false, true);
                        return;
                    }
                    return;
                }
                if (i10 == ty0Var.P) {
                    org.telegram.ui.Cells.t8 t8Var3 = (org.telegram.ui.Cells.t8) view;
                    boolean z11 = t8Var3.e.h;
                    boolean z12 = !z11;
                    t8Var3.setChecked(z12);
                    SharedPreferences.Editor edit = org.telegram.messenger.wp.r1(ty0Var.currentAccount).e7.edit();
                    if (!ty0Var.a0 || z11) {
                        edit.putBoolean("stories_" + str, z12);
                    } else {
                        edit.remove("stories_" + str);
                    }
                    edit.apply();
                    ty0Var.getNotificationsController().c0(ty0Var.f, ty0Var.h, true);
                    return;
                }
                return;
            }
            if (ty0Var.getParentActivity() == null) {
                return;
            }
            SharedPreferences sharedPreferences2 = org.telegram.messenger.wp.r1(ty0Var.currentAccount).e7;
            int c10 = org.telegram.messenger.m5.c("smart_max_count_", str, sharedPreferences2, 2);
            int c11 = org.telegram.messenger.m5.c("smart_delay_", str, sharedPreferences2, org.telegram.messenger.at.K2);
            r10 = c10 != 0 ? c10 : 2;
            Activity parentActivity2 = ty0Var.getParentActivity();
            oy0 oy0Var = new oy0(ty0Var, str);
            Pattern pattern2 = org.telegram.ui.Components.s4.a;
            if (parentActivity2 == null) {
                return;
            }
            int i16 = org.telegram.ui.ActionBar.t6.j5;
            int f7 = p6Var != null ? p6Var.f(i16) : org.telegram.ui.ActionBar.t6.x0(null, i16, false);
            int i17 = org.telegram.ui.ActionBar.t6.h5;
            int f10 = p6Var != null ? p6Var.f(i17) : org.telegram.ui.ActionBar.t6.x0(null, i17, false);
            int i18 = org.telegram.ui.ActionBar.t6.xj;
            if (p6Var != null) {
                p6Var.f(i18);
            } else {
                org.telegram.ui.ActionBar.t6.x0(null, i18, false);
            }
            int i19 = org.telegram.ui.ActionBar.t6.Bj;
            if (p6Var != null) {
                p6Var.f(i19);
            } else {
                org.telegram.ui.ActionBar.t6.x0(null, i19, false);
            }
            int i20 = org.telegram.ui.ActionBar.t6.E8;
            if (p6Var != null) {
                p6Var.f(i20);
            } else {
                org.telegram.ui.ActionBar.t6.x0(null, i20, false);
            }
            int i21 = org.telegram.ui.ActionBar.t6.G8;
            if (p6Var != null) {
                p6Var.f(i21);
            } else {
                org.telegram.ui.ActionBar.t6.x0(null, i21, false);
            }
            int i22 = org.telegram.ui.ActionBar.t6.i6;
            if (p6Var != null) {
                p6Var.f(i22);
            } else {
                org.telegram.ui.ActionBar.t6.x0(null, i22, false);
            }
            int i23 = org.telegram.ui.ActionBar.t6.Gi;
            int f11 = p6Var != null ? p6Var.f(i23) : org.telegram.ui.ActionBar.t6.x0(null, i23, false);
            int i24 = org.telegram.ui.ActionBar.t6.Ci;
            int f12 = p6Var != null ? p6Var.f(i24) : org.telegram.ui.ActionBar.t6.x0(null, i24, false);
            int i25 = org.telegram.ui.ActionBar.t6.Ei;
            int f13 = p6Var != null ? p6Var.f(i25) : org.telegram.ui.ActionBar.t6.x0(null, i25, false);
            l2.f fVar = new l2.f(parentActivity2, p6Var);
            ((org.telegram.ui.ActionBar.z2) fVar.b).v0 = false;
            org.telegram.ui.Components.d4 d4Var = new org.telegram.ui.Components.d4(parentActivity2, p6Var);
            d4Var.setMinValue(0);
            d4Var.setMaxValue(10);
            d4Var.setTextColor(f7);
            d4Var.setValue(r10 - 1);
            d4Var.setWrapSelectorWheel(false);
            d4Var.setFormatter(new org.telegram.ui.Components.v1(i14));
            org.telegram.ui.Components.e4 e4Var = new org.telegram.ui.Components.e4(parentActivity2, p6Var);
            e4Var.setMinValue(0);
            e4Var.setMaxValue(10);
            e4Var.setTextColor(f7);
            e4Var.setValue((c11 / 60) - 1);
            e4Var.setWrapSelectorWheel(false);
            e4Var.setFormatter(new org.telegram.ui.Components.v1(5));
            org.telegram.ui.Components.ac0 ac0Var = new org.telegram.ui.Components.ac0(parentActivity2, p6Var);
            ac0Var.setMinValue(0);
            ac0Var.setMaxValue(0);
            ac0Var.setTextColor(f7);
            ac0Var.setValue(0);
            ac0Var.setWrapSelectorWheel(false);
            ac0Var.setFormatter(new org.telegram.ui.Components.v1(6));
            org.telegram.ui.Components.n3 n3Var = new org.telegram.ui.Components.n3(parentActivity2, d4Var, e4Var, ac0Var, 5);
            n3Var.setOrientation(1);
            FrameLayout frameLayout = new FrameLayout(parentActivity2);
            n3Var.addView(frameLayout, w7.b6.t(-1, -2, 51, 22, 0, 0, 4));
            TextView textView2 = new TextView(parentActivity2);
            textView2.setText(org.telegram.messenger.dd.L0(2131748136, null));
            textView2.setTextColor(f7);
            sc.e.t(textView2, 1, 20.0f);
            frameLayout.addView(textView2, w7.b6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
            textView2.setOnTouchListener(new org.telegram.ui.ActionBar.n2(9));
            LinearLayout linearLayout = new LinearLayout(parentActivity2);
            linearLayout.setOrientation(0);
            linearLayout.setWeightSum(1.0f);
            n3Var.addView(linearLayout, w7.b6.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
            ag.j3 j3Var = new ag.j3(parentActivity2, 15);
            linearLayout.addView(d4Var, w7.b6.l(0.4f, 0, org.telegram.messenger.at.t4));
            linearLayout.addView(ac0Var, w7.b6.p(0, -2, 0.2f, 16));
            linearLayout.addView(e4Var, w7.b6.l(0.4f, 0, org.telegram.messenger.at.t4));
            j3Var.setPadding(org.telegram.messenger.i0.L(34.0f), 0, org.telegram.messenger.i0.L(34.0f), 0);
            j3Var.setGravity(17);
            j3Var.setTextColor(f11);
            j3Var.setTextSize(1, 14.0f);
            j3Var.setTypeface(org.telegram.messenger.i0.o());
            int L = org.telegram.messenger.i0.L(8.0f);
            j3Var.setBackgroundDrawable(org.telegram.ui.ActionBar.t6.k0(L, L, L, L, f12, f13, f13));
            j3Var.setText(org.telegram.messenger.dd.L0(2131753866, null));
            n3Var.addView(j3Var, w7.b6.t(-1, 48, 83, 16, 15, 16, 16));
            org.telegram.ui.Cells.m5 m5Var = new org.telegram.ui.Cells.m5(20);
            d4Var.setOnValueChangedListener(m5Var);
            e4Var.setOnValueChangedListener(m5Var);
            j3Var.setOnClickListener(new org.telegram.messenger.video.h(d4Var, e4Var, oy0Var, fVar, 3));
            org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) fVar.b;
            z2Var.N = n3Var;
            z2Var.show();
            z2Var.v0(f10);
            z2Var.P(f10);
        }
    }

    public static void b0(ty0 ty0Var, String str) {
        ty0Var.b0 = true;
        org.telegram.messenger.wp.r1(ty0Var.currentAccount).e7.edit().putBoolean("custom_" + str, false).remove("notify2_" + str).apply();
        ty0Var.finishFragment();
        sy0 sy0Var = ty0Var.s;
        if (sy0Var != null) {
            sy0Var.b0();
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.h7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.g7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.d6));
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        int i10 = 1;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        long j10 = this.f;
        long j11 = this.h;
        String v = org.telegram.messenger.pt.v(j10, j11, false);
        this.simpleActionBar.setActionBarMenuOnItemClick(new qy0(this, v));
        org.telegram.ui.ActionBar.p6 p6Var = this.e;
        org.telegram.ui.Components.sn snVar = new org.telegram.ui.Components.sn(context, null, false, p6Var);
        this.w = snVar;
        snVar.setOccupyStatusBar(!org.telegram.messenger.i0.Q1());
        if (j10 >= 0) {
            TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(j10));
            if (Z1 != null) {
                this.w.setUserAvatar(Z1);
                this.simpleActionBar.setTitle(org.telegram.messenger.i5.m(0, Z1.first_name, Z1.last_name));
            }
        } else if (j11 != 0) {
            TLRPC.TL_forumTopic f7 = getMessagesController().r7.f(-j10, j11);
            gg.e.p(this.w.getAvatarImageView(), f7, false, true, p6Var);
            this.simpleActionBar.setTitle(f7.title);
        } else {
            TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(-j10));
            this.w.setChatAvatar(L0);
            this.simpleActionBar.setTitle(L0.title);
        }
        if (this.n) {
            this.simpleActionBar.setSubtitle(org.telegram.messenger.dd.L0(2131747911, null));
            this.simpleActionBar.n(org.telegram.messenger.dd.L0(2131745963, null));
        } else {
            this.simpleActionBar.setSubtitle(org.telegram.messenger.dd.L0(2131751685, null));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.uk0 uk0Var = new org.telegram.ui.Components.uk0(context, null);
        this.b = uk0Var;
        uk0Var.r1();
        this.b.setSectionsDrawBackground(true);
        frameLayout.addView(this.b, w7.b6.c(-1.0f, -1));
        org.telegram.ui.Components.uk0 uk0Var2 = this.b;
        ry0 ry0Var = new ry0(this, context);
        this.c = ry0Var;
        uk0Var2.setAdapter(ry0Var);
        this.b.setItemAnimator(null);
        this.b.setLayoutAnimation(null);
        this.b.setLayoutManager(new dh.f(16));
        this.b.setOnItemClickListener(new p71(this, context, v, i10));
        this.a = frameLayout;
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.vs
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.at.f0) {
            try {
                this.c.f();
            } catch (Exception unused) {
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final org.telegram.ui.Components.uk0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final org.telegram.ui.ActionBar.p6 getResourceProvider() {
        return this.e;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        g6 g6Var = new g6(19, this);
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b, 0, new Class[]{org.telegram.ui.Cells.oa.class}, new String[]{"statusColor"}, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.t6.y6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b, 0, new Class[]{org.telegram.ui.Cells.oa.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.t6.n6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        Ringtone ringtone;
        if (i11 != -1 || intent == null) {
            return;
        }
        Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
        String str = null;
        if (uri != null && (ringtone = RingtoneManager.getRingtone(org.telegram.messenger.w0.b, uri)) != null) {
            str = i10 == 13 ? uri.equals(Settings.System.DEFAULT_RINGTONE_URI) ? org.telegram.messenger.dd.L0(2131751600, null) : ringtone.getTitle(getParentActivity()) : uri.equals(Settings.System.DEFAULT_NOTIFICATION_URI) ? org.telegram.messenger.dd.L0(2131745298, null) : ringtone.getTitle(getParentActivity());
            ringtone.stop();
        }
        SharedPreferences.Editor edit = org.telegram.messenger.wp.r1(this.currentAccount).e7.edit();
        String v = org.telegram.messenger.pt.v(this.f, this.h, false);
        if (i10 == 12) {
            if (str != null) {
                edit.putString("sound_" + v, str);
                edit.putString("sound_path_" + v, uri.toString());
            } else {
                edit.putString("sound_" + v, "NoSound");
                edit.putString("sound_path_" + v, "NoSound");
            }
            getNotificationsController().l(this.f, this.h);
        } else if (i10 == 13) {
            if (str != null) {
                edit.putString("ringtone_" + v, str);
                edit.putString("ringtone_path_" + v, uri.toString());
            } else {
                edit.putString("ringtone_" + v, "NoSound");
                edit.putString("ringtone_path_" + v, "NoSound");
            }
        }
        edit.apply();
        ry0 ry0Var = this.c;
        if (ry0Var != null) {
            ry0Var.g(i10 == 13 ? this.R : this.G);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010f  */
    @Override // org.telegram.ui.ActionBar.k2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onFragmentCreate() {
        boolean z10;
        long j10 = this.f;
        if (org.telegram.messenger.o5.E(j10)) {
            ArrayList arrayList = getMediaDataController().i1;
            int i10 = 0;
            while (true) {
                if (i10 >= arrayList.size()) {
                    break;
                }
                TLRPC.Peer peer = ((TLRPC.TL_topPeer) arrayList.get(i10)).peer;
                if ((peer instanceof TLRPC.TL_peerUser) && peer.user_id == j10) {
                    this.a0 = i10 < 5;
                } else {
                    i10++;
                }
            }
        }
        this.Z = 0;
        boolean z11 = this.n;
        if (z11) {
            this.y = 0;
            this.Z = 2;
            this.D = 1;
        } else {
            this.y = -1;
            this.D = -1;
        }
        int i11 = this.Z;
        int i12 = i11 + 1;
        this.Z = i12;
        this.x = i11;
        long j11 = this.h;
        if (z11 || j11 != 0) {
            this.Z = i11 + 2;
            this.E = i12;
        } else {
            this.E = -1;
        }
        this.P = -1;
        if (org.telegram.messenger.o5.C(j10)) {
            this.F = -1;
        } else {
            int i13 = this.Z;
            this.Z = i13 + 1;
            this.F = i13;
            if (org.telegram.messenger.o5.E(j10)) {
                int i14 = this.Z;
                this.Z = i14 + 1;
                this.P = i14;
            }
        }
        int i15 = this.Z;
        this.G = i15;
        this.Z = i15 + 2;
        this.H = i15 + 1;
        if (org.telegram.messenger.o5.z(j10)) {
            int i16 = this.Z;
            this.Z = i16 + 1;
            this.I = i16;
        } else {
            this.I = -1;
        }
        int i17 = this.Z;
        this.J = i17;
        this.Z = i17 + 2;
        this.K = i17 + 1;
        if (org.telegram.messenger.o5.z(j10)) {
            TLRPC.Chat L0 = org.telegram.messenger.wp.r1(this.currentAccount).L0(Long.valueOf(-j10));
            if (org.telegram.messenger.w3.T(L0) && !L0.megagroup) {
                z10 = true;
                if (!org.telegram.messenger.o5.C(j10) || z10) {
                    this.L = -1;
                    this.M = -1;
                    this.N = -1;
                    this.O = -1;
                } else {
                    int i18 = this.Z;
                    this.L = i18;
                    this.M = i18 + 1;
                    this.N = i18 + 2;
                    this.Z = i18 + 4;
                    this.O = i18 + 3;
                }
                if (org.telegram.messenger.o5.E(j10)) {
                    this.Q = -1;
                    this.S = -1;
                    this.R = -1;
                    this.T = -1;
                } else {
                    int i19 = this.Z;
                    this.Q = i19;
                    this.S = i19 + 1;
                    this.R = i19 + 2;
                    this.Z = i19 + 4;
                    this.T = i19 + 3;
                }
                int i20 = this.Z;
                this.U = i20;
                this.V = i20 + 1;
                int i21 = i20 + 3;
                this.Z = i21;
                this.W = i20 + 2;
                if (z11) {
                    this.X = i21;
                    this.Z = i20 + 5;
                    this.Y = i20 + 4;
                } else {
                    this.X = -1;
                    this.Y = -1;
                }
                boolean D = org.telegram.messenger.pt.t(this.currentAccount).D(this.f, null, false, false);
                if (z11) {
                    SharedPreferences sharedPreferences = org.telegram.messenger.wp.r1(this.currentAccount).e7;
                    String v = org.telegram.messenger.pt.v(j10, j11, false);
                    boolean contains = sharedPreferences.contains("notify2_" + v);
                    int c10 = org.telegram.messenger.m5.c("notify2_", v, sharedPreferences, 0);
                    if (c10 == 0) {
                        if (contains) {
                            this.r = true;
                        } else {
                            this.r = org.telegram.messenger.pt.t(this.currentAccount).D(this.f, null, false, false);
                        }
                    } else if (c10 == 1) {
                        this.r = true;
                    } else if (c10 == 2) {
                        this.r = false;
                    } else {
                        this.r = false;
                    }
                } else {
                    this.r = !D;
                }
                org.telegram.messenger.at.f(this.currentAccount).c(this, org.telegram.messenger.at.f0);
                return super.onFragmentCreate();
            }
        }
        z10 = false;
        if (org.telegram.messenger.o5.C(j10)) {
        }
        this.L = -1;
        this.M = -1;
        this.N = -1;
        this.O = -1;
        if (org.telegram.messenger.o5.E(j10)) {
        }
        int i202 = this.Z;
        this.U = i202;
        this.V = i202 + 1;
        int i212 = i202 + 3;
        this.Z = i212;
        this.W = i202 + 2;
        if (z11) {
        }
        boolean D2 = org.telegram.messenger.pt.t(this.currentAccount).D(this.f, null, false, false);
        if (z11) {
        }
        org.telegram.messenger.at.f(this.currentAccount).c(this, org.telegram.messenger.at.f0);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.b0) {
            String v = org.telegram.messenger.pt.v(this.f, this.h, false);
            org.telegram.messenger.wp.r1(this.currentAccount).e7.edit().putBoolean("custom_" + v, true).apply();
        }
        org.telegram.messenger.at.f(this.currentAccount).n(this, org.telegram.messenger.at.f0);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        super.onInsets(i10, i11, i12, i13);
        org.telegram.messenger.i0.A3(this.w.e, 0, ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - org.telegram.messenger.i0.L(42.0f)) / 2) + this.mSystemInsets.b, org.telegram.messenger.i0.L(6.0f), 0);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        org.telegram.messenger.i0.E2(this.w.e);
        if (!this.n) {
            this.a.addView(this.w.e, w7.b6.e(42, 42, 53));
        }
        org.telegram.messenger.i0.A3(this.w.e, 0, ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - org.telegram.messenger.i0.L(42.0f)) / 2) + this.mSystemInsets.b, org.telegram.messenger.i0.L(6.0f), 0);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
