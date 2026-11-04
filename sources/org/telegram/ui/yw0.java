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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class yw0 extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs {
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
    public int a0;
    public org.telegram.ui.Components.tj0 b;
    public boolean b0;
    public ww0 c;
    public boolean c0;
    public AnimatorSet d;
    public final org.telegram.ui.ActionBar.e6 e;
    public final long f;
    public final long h;
    public final boolean n;
    public boolean r;
    public xw0 s;
    public org.telegram.ui.Components.jn w;
    public int x;
    public int y;

    public yw0(Bundle bundle, org.telegram.ui.ActionBar.e6 e6Var) {
        super(bundle);
        this.e = e6Var;
        this.f = bundle.getLong("dialog_id");
        this.h = bundle.getLong("topic_id");
        this.n = bundle.getBoolean("exception", false);
    }

    public static void Z(yw0 yw0Var, String str, int i3, int i10) {
        org.telegram.messenger.hp.s1(yw0Var.currentAccount).d7.edit().putInt("smart_max_count_" + str, i3).putInt("smart_delay_" + str, i10).apply();
        ww0 ww0Var = yw0Var.c;
        if (ww0Var != null) {
            ww0Var.g(yw0Var.J);
        }
    }

    public static void a0(final yw0 yw0Var, Context context, String str, View view, int i3) {
        org.telegram.ui.ActionBar.e6 e6Var = yw0Var.e;
        if (view.isEnabled()) {
            final int i10 = 0;
            Parcelable parcelable = null;
            if (i3 == yw0Var.Y) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
                String M0 = org.telegram.messenger.bd.M0(2131746112, null);
                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                s1Var.S = M0;
                s1Var.U = org.telegram.messenger.bd.M0(2131746113, null);
                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131746128, null), new tw0(yw0Var, str));
                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                yw0Var.showDialog(s1Var);
                TextView textView = (TextView) s1Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, null);
                    return;
                }
                return;
            }
            if (i3 == yw0Var.H) {
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", yw0Var.f);
                bundle.putLong("topic_id", yw0Var.h);
                yw0Var.presentFragment(new ph0(bundle, e6Var));
                return;
            }
            final int i11 = 1;
            if (i3 == yw0Var.S) {
                try {
                    Intent intent = new Intent("android.intent.action.RINGTONE_PICKER");
                    intent.putExtra("android.intent.extra.ringtone.TYPE", 1);
                    intent.putExtra("android.intent.extra.ringtone.SHOW_DEFAULT", true);
                    intent.putExtra("android.intent.extra.ringtone.SHOW_SILENT", true);
                    intent.putExtra("android.intent.extra.ringtone.DEFAULT_URI", RingtoneManager.getDefaultUri(1));
                    SharedPreferences sharedPreferences = org.telegram.messenger.hp.s1(yw0Var.currentAccount).d7;
                    Uri uri = Settings.System.DEFAULT_NOTIFICATION_URI;
                    String path = uri != null ? uri.getPath() : null;
                    String string = sharedPreferences.getString("ringtone_path_" + str, path);
                    if (string != null && !string.equals("NoSound")) {
                        parcelable = string.equals(path) ? uri : Uri.parse(string);
                    }
                    intent.putExtra("android.intent.extra.ringtone.EXISTING_URI", parcelable);
                    yw0Var.startActivityForResult(intent, 13);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            }
            if (i3 == yw0Var.I) {
                Activity parentActivity = yw0Var.getParentActivity();
                long j10 = yw0Var.f;
                long j11 = yw0Var.h;
                Runnable runnable = new Runnable(yw0Var) { // from class: org.telegram.ui.uw0
                    public final /* synthetic */ yw0 b;

                    {
                        this.b = yw0Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                yw0 yw0Var2 = this.b;
                                ww0 ww0Var = yw0Var2.c;
                                if (ww0Var != null) {
                                    ww0Var.g(yw0Var2.I);
                                    break;
                                }
                                break;
                            case 1:
                                yw0 yw0Var3 = this.b;
                                ww0 ww0Var2 = yw0Var3.c;
                                if (ww0Var2 != null) {
                                    ww0Var2.g(yw0Var3.T);
                                    break;
                                }
                                break;
                            case 2:
                                yw0 yw0Var4 = this.b;
                                ww0 ww0Var3 = yw0Var4.c;
                                if (ww0Var3 != null) {
                                    ww0Var3.g(yw0Var4.K);
                                    break;
                                }
                                break;
                            default:
                                yw0 yw0Var5 = this.b;
                                ww0 ww0Var4 = yw0Var5.c;
                                if (ww0Var4 != null) {
                                    ww0Var4.g(yw0Var5.W);
                                    break;
                                }
                                break;
                        }
                    }
                };
                org.telegram.ui.ActionBar.e6 e6Var2 = yw0Var.e;
                Pattern pattern = org.telegram.ui.Components.t4.a;
                yw0Var.showDialog(org.telegram.ui.Components.t4.X(parentActivity, j10, j11, j10 != 0 ? a1.g.p(j10, "vibrate_") : "vibrate_messages", runnable, e6Var2));
                return;
            }
            if (i3 == yw0Var.F) {
                org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
                boolean z10 = !q8Var.e.h;
                yw0Var.r = z10;
                q8Var.setChecked(z10);
                int childCount = yw0Var.b.getChildCount();
                ArrayList arrayList = new ArrayList();
                while (i10 < childCount) {
                    org.telegram.ui.Components.bj0 bj0Var = (org.telegram.ui.Components.bj0) yw0Var.b.T(yw0Var.b.getChildAt(i10));
                    int i12 = bj0Var.f;
                    View view2 = bj0Var.a;
                    int b10 = bj0Var.b();
                    if (b10 != yw0Var.F && b10 != yw0Var.Y) {
                        if (i12 == 0) {
                            ((org.telegram.ui.Cells.n4) view2).a(arrayList, yw0Var.r);
                        } else if (i12 == 1) {
                            ((org.telegram.ui.Cells.v9) view2).a(arrayList, yw0Var.r);
                        } else if (i12 == 2) {
                            ((org.telegram.ui.Cells.y8) view2).c(arrayList, yw0Var.r);
                        } else if (i12 == 3) {
                            ((org.telegram.ui.Cells.s8) view2).a(arrayList, yw0Var.r);
                        } else if (i12 == 4) {
                            ((org.telegram.ui.Cells.h6) view2).b(arrayList, yw0Var.r);
                        } else if (i12 == 7 && b10 == yw0Var.G) {
                            ((org.telegram.ui.Cells.q8) view2).e(arrayList, yw0Var.r);
                        }
                    }
                    i10++;
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                AnimatorSet animatorSet = yw0Var.d;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                yw0Var.d = animatorSet2;
                animatorSet2.playTogether(arrayList);
                yw0Var.d.addListener(new y20(yw0Var, 23));
                yw0Var.d.setDuration(150L);
                yw0Var.d.start();
                return;
            }
            if (i3 == yw0Var.G) {
                org.telegram.ui.Cells.q8 q8Var2 = (org.telegram.ui.Cells.q8) view;
                Switch r32 = q8Var2.e;
                org.telegram.messenger.hp.s1(yw0Var.currentAccount).d7.edit().putBoolean(t4.c.f("content_preview_", str), !r32.h).apply();
                q8Var2.setChecked(!r32.h);
                return;
            }
            if (i3 == yw0Var.T) {
                yw0Var.showDialog(org.telegram.ui.Components.t4.X(yw0Var.getParentActivity(), yw0Var.f, yw0Var.h, t4.c.f("calls_vibrate_", str), new Runnable(yw0Var) { // from class: org.telegram.ui.uw0
                    public final /* synthetic */ yw0 b;

                    {
                        this.b = yw0Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                yw0 yw0Var2 = this.b;
                                ww0 ww0Var = yw0Var2.c;
                                if (ww0Var != null) {
                                    ww0Var.g(yw0Var2.I);
                                    break;
                                }
                                break;
                            case 1:
                                yw0 yw0Var3 = this.b;
                                ww0 ww0Var2 = yw0Var3.c;
                                if (ww0Var2 != null) {
                                    ww0Var2.g(yw0Var3.T);
                                    break;
                                }
                                break;
                            case 2:
                                yw0 yw0Var4 = this.b;
                                ww0 ww0Var3 = yw0Var4.c;
                                if (ww0Var3 != null) {
                                    ww0Var3.g(yw0Var4.K);
                                    break;
                                }
                                break;
                            default:
                                yw0 yw0Var5 = this.b;
                                ww0 ww0Var4 = yw0Var5.c;
                                if (ww0Var4 != null) {
                                    ww0Var4.g(yw0Var5.W);
                                    break;
                                }
                                break;
                        }
                    }
                }, yw0Var.e));
                return;
            }
            if (i3 == yw0Var.K) {
                yw0Var.showDialog(org.telegram.ui.Components.t4.H(yw0Var.getParentActivity(), yw0Var.f, yw0Var.h, -1, new Runnable(yw0Var) { // from class: org.telegram.ui.uw0
                    public final /* synthetic */ yw0 b;

                    {
                        this.b = yw0Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (r2) {
                            case 0:
                                yw0 yw0Var2 = this.b;
                                ww0 ww0Var = yw0Var2.c;
                                if (ww0Var != null) {
                                    ww0Var.g(yw0Var2.I);
                                    break;
                                }
                                break;
                            case 1:
                                yw0 yw0Var3 = this.b;
                                ww0 ww0Var2 = yw0Var3.c;
                                if (ww0Var2 != null) {
                                    ww0Var2.g(yw0Var3.T);
                                    break;
                                }
                                break;
                            case 2:
                                yw0 yw0Var4 = this.b;
                                ww0 ww0Var3 = yw0Var4.c;
                                if (ww0Var3 != null) {
                                    ww0Var3.g(yw0Var4.K);
                                    break;
                                }
                                break;
                            default:
                                yw0 yw0Var5 = this.b;
                                ww0 ww0Var4 = yw0Var5.c;
                                if (ww0Var4 != null) {
                                    ww0Var4.g(yw0Var5.W);
                                    break;
                                }
                                break;
                        }
                    }
                }, yw0Var.e));
                return;
            }
            if (i3 != yw0Var.J) {
                if (i3 == yw0Var.W) {
                    if (yw0Var.getParentActivity() == null) {
                        return;
                    }
                    final int i13 = 3;
                    yw0Var.showDialog(org.telegram.ui.Components.t4.t(yw0Var.getParentActivity(), yw0Var.f, yw0Var.h, -1, new Runnable(yw0Var) { // from class: org.telegram.ui.uw0
                        public final /* synthetic */ yw0 b;

                        {
                            this.b = yw0Var;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i13) {
                                case 0:
                                    yw0 yw0Var2 = this.b;
                                    ww0 ww0Var = yw0Var2.c;
                                    if (ww0Var != null) {
                                        ww0Var.g(yw0Var2.I);
                                        break;
                                    }
                                    break;
                                case 1:
                                    yw0 yw0Var3 = this.b;
                                    ww0 ww0Var2 = yw0Var3.c;
                                    if (ww0Var2 != null) {
                                        ww0Var2.g(yw0Var3.T);
                                        break;
                                    }
                                    break;
                                case 2:
                                    yw0 yw0Var4 = this.b;
                                    ww0 ww0Var3 = yw0Var4.c;
                                    if (ww0Var3 != null) {
                                        ww0Var3.g(yw0Var4.K);
                                        break;
                                    }
                                    break;
                                default:
                                    yw0 yw0Var5 = this.b;
                                    ww0 ww0Var4 = yw0Var5.c;
                                    if (ww0Var4 != null) {
                                        ww0Var4.g(yw0Var5.W);
                                        break;
                                    }
                                    break;
                            }
                        }
                    }, yw0Var.e));
                    return;
                }
                if (i3 == yw0Var.N) {
                    org.telegram.messenger.hp.s1(yw0Var.currentAccount).d7.edit().putInt("popup_" + str, 1).apply();
                    ((org.telegram.ui.Cells.h6) view).a(true, true);
                    View findViewWithTag = yw0Var.b.findViewWithTag(2);
                    if (findViewWithTag != null) {
                        ((org.telegram.ui.Cells.h6) findViewWithTag).a(false, true);
                        return;
                    }
                    return;
                }
                if (i3 == yw0Var.O) {
                    org.telegram.messenger.hp.s1(yw0Var.currentAccount).d7.edit().putInt("popup_" + str, 2).apply();
                    ((org.telegram.ui.Cells.h6) view).a(true, true);
                    View findViewWithTag2 = yw0Var.b.findViewWithTag(1);
                    if (findViewWithTag2 != null) {
                        ((org.telegram.ui.Cells.h6) findViewWithTag2).a(false, true);
                        return;
                    }
                    return;
                }
                if (i3 == yw0Var.Q) {
                    org.telegram.ui.Cells.q8 q8Var3 = (org.telegram.ui.Cells.q8) view;
                    boolean z11 = q8Var3.e.h;
                    boolean z12 = !z11;
                    q8Var3.setChecked(z12);
                    SharedPreferences.Editor edit = org.telegram.messenger.hp.s1(yw0Var.currentAccount).d7.edit();
                    if (!yw0Var.b0 || z11) {
                        edit.putBoolean("stories_" + str, z12);
                    } else {
                        edit.remove("stories_" + str);
                    }
                    edit.apply();
                    yw0Var.getNotificationsController().c0(yw0Var.f, yw0Var.h, true);
                    return;
                }
                return;
            }
            if (yw0Var.getParentActivity() == null) {
                return;
            }
            SharedPreferences sharedPreferences2 = org.telegram.messenger.hp.s1(yw0Var.currentAccount).d7;
            int c2 = org.telegram.messenger.k5.c("smart_max_count_", str, sharedPreferences2, 2);
            int c10 = org.telegram.messenger.k5.c("smart_delay_", str, sharedPreferences2, org.telegram.messenger.hs.K2);
            r9 = c2 != 0 ? c2 : 2;
            Activity parentActivity2 = yw0Var.getParentActivity();
            tw0 tw0Var = new tw0(yw0Var, str);
            Pattern pattern2 = org.telegram.ui.Components.t4.a;
            if (parentActivity2 == null) {
                return;
            }
            int i14 = org.telegram.ui.ActionBar.k6.j5;
            int f10 = e6Var != null ? e6Var.f(i14) : org.telegram.ui.ActionBar.k6.x0(null, i14, false);
            int i15 = org.telegram.ui.ActionBar.k6.h5;
            int f11 = e6Var != null ? e6Var.f(i15) : org.telegram.ui.ActionBar.k6.x0(null, i15, false);
            int i16 = org.telegram.ui.ActionBar.k6.xj;
            if (e6Var != null) {
                e6Var.f(i16);
            } else {
                org.telegram.ui.ActionBar.k6.x0(null, i16, false);
            }
            int i17 = org.telegram.ui.ActionBar.k6.Bj;
            if (e6Var != null) {
                e6Var.f(i17);
            } else {
                org.telegram.ui.ActionBar.k6.x0(null, i17, false);
            }
            int i18 = org.telegram.ui.ActionBar.k6.E8;
            if (e6Var != null) {
                e6Var.f(i18);
            } else {
                org.telegram.ui.ActionBar.k6.x0(null, i18, false);
            }
            int i19 = org.telegram.ui.ActionBar.k6.G8;
            if (e6Var != null) {
                e6Var.f(i19);
            } else {
                org.telegram.ui.ActionBar.k6.x0(null, i19, false);
            }
            int i20 = org.telegram.ui.ActionBar.k6.i6;
            if (e6Var != null) {
                e6Var.f(i20);
            } else {
                org.telegram.ui.ActionBar.k6.x0(null, i20, false);
            }
            int i21 = org.telegram.ui.ActionBar.k6.Gi;
            int f12 = e6Var != null ? e6Var.f(i21) : org.telegram.ui.ActionBar.k6.x0(null, i21, false);
            int i22 = org.telegram.ui.ActionBar.k6.Ci;
            int f13 = e6Var != null ? e6Var.f(i22) : org.telegram.ui.ActionBar.k6.x0(null, i22, false);
            int i23 = org.telegram.ui.ActionBar.k6.Ei;
            int f14 = e6Var != null ? e6Var.f(i23) : org.telegram.ui.ActionBar.k6.x0(null, i23, false);
            hi.d dVar = new hi.d(parentActivity2, e6Var);
            ((org.telegram.ui.ActionBar.t2) dVar.b).w0 = false;
            org.telegram.ui.Components.e4 e4Var = new org.telegram.ui.Components.e4(parentActivity2, e6Var);
            e4Var.setMinValue(0);
            e4Var.setMaxValue(10);
            e4Var.setTextColor(f10);
            e4Var.setValue(r9 - 1);
            e4Var.setWrapSelectorWheel(false);
            e4Var.setFormatter(new org.telegram.ui.Components.c(17));
            org.telegram.ui.Components.f4 f4Var = new org.telegram.ui.Components.f4(parentActivity2, e6Var);
            f4Var.setMinValue(0);
            f4Var.setMaxValue(10);
            f4Var.setTextColor(f10);
            f4Var.setValue((c10 / 60) - 1);
            f4Var.setWrapSelectorWheel(false);
            f4Var.setFormatter(new org.telegram.ui.Components.c(18));
            org.telegram.ui.Components.cb0 cb0Var = new org.telegram.ui.Components.cb0(parentActivity2, e6Var);
            cb0Var.setMinValue(0);
            cb0Var.setMaxValue(0);
            cb0Var.setTextColor(f10);
            cb0Var.setValue(0);
            cb0Var.setWrapSelectorWheel(false);
            cb0Var.setFormatter(new org.telegram.ui.Components.c(19));
            int i24 = f12;
            org.telegram.ui.Components.n3 n3Var = new org.telegram.ui.Components.n3(parentActivity2, e4Var, f4Var, cb0Var, 5);
            n3Var.setOrientation(1);
            FrameLayout frameLayout = new FrameLayout(parentActivity2);
            n3Var.addView(frameLayout, b8.mf.t(-1, -2, 51, 22, 0, 0, 4));
            TextView textView2 = new TextView(parentActivity2);
            textView2.setText(org.telegram.messenger.bd.M0(2131748128, null));
            textView2.setTextColor(f10);
            k2.p1.t(textView2, 1, 20.0f);
            frameLayout.addView(textView2, b8.mf.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
            textView2.setOnTouchListener(new fi.a(10));
            LinearLayout linearLayout = new LinearLayout(parentActivity2);
            linearLayout.setOrientation(0);
            linearLayout.setWeightSum(1.0f);
            n3Var.addView(linearLayout, b8.mf.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
            ci.ec ecVar = new ci.ec(parentActivity2, 18);
            linearLayout.addView(e4Var, b8.mf.l(0.4f, 0, org.telegram.messenger.hs.t4));
            linearLayout.addView(cb0Var, b8.mf.p(0, -2, 0.2f, 16));
            linearLayout.addView(f4Var, b8.mf.l(0.4f, 0, org.telegram.messenger.hs.t4));
            ecVar.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
            ecVar.setGravity(17);
            ecVar.setTextColor(i24);
            ecVar.setTextSize(1, 14.0f);
            ecVar.setTypeface(org.telegram.messenger.g0.o());
            int L = org.telegram.messenger.g0.L(8.0f);
            ecVar.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.k0(L, L, L, L, f13, f14, f14));
            ecVar.setText(org.telegram.messenger.bd.M0(2131753866, null));
            n3Var.addView(ecVar, b8.mf.t(-1, 48, 83, 16, 15, 16, 16));
            org.telegram.ui.Components.c cVar = new org.telegram.ui.Components.c(3);
            e4Var.setOnValueChangedListener(cVar);
            f4Var.setOnValueChangedListener(cVar);
            ecVar.setOnClickListener(new ai.r4(e4Var, f4Var, tw0Var, dVar, 8));
            org.telegram.ui.ActionBar.t2 t2Var = (org.telegram.ui.ActionBar.t2) dVar.b;
            t2Var.O = n3Var;
            t2Var.show();
            t2Var.v0(f11);
            t2Var.O(f11);
        }
    }

    public static void b0(yw0 yw0Var, String str) {
        yw0Var.c0 = true;
        org.telegram.messenger.hp.s1(yw0Var.currentAccount).d7.edit().putBoolean("custom_" + str, false).remove("notify2_" + str).apply();
        yw0Var.finishFragment();
        xw0 xw0Var = yw0Var.s;
        if (xw0Var != null) {
            xw0Var.a0();
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.h7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.g7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d6));
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final View createView(Context context) {
        int i3 = 1;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        long j10 = this.f;
        long j11 = this.h;
        String v = org.telegram.messenger.us.v(j10, j11, false);
        this.simpleActionBar.setActionBarMenuOnItemClick(new vw0(this, v));
        org.telegram.ui.ActionBar.e6 e6Var = this.e;
        org.telegram.ui.Components.jn jnVar = new org.telegram.ui.Components.jn(context, null, false, e6Var);
        this.w = jnVar;
        jnVar.setOccupyStatusBar(!org.telegram.messenger.g0.Q1());
        if (j10 >= 0) {
            TLRPC.User a22 = getMessagesController().a2(Long.valueOf(j10));
            if (a22 != null) {
                this.w.setUserAvatar(a22);
                this.simpleActionBar.setTitle(org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name));
            }
        } else if (j11 != 0) {
            TLRPC.TL_forumTopic f10 = getMessagesController().q7.f(-j10, j11);
            rg.c.p(this.w.getAvatarImageView(), f10, false, true, e6Var);
            this.simpleActionBar.setTitle(f10.title);
        } else {
            TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-j10));
            this.w.setChatAvatar(M0);
            this.simpleActionBar.setTitle(M0.title);
        }
        if (this.n) {
            this.simpleActionBar.setSubtitle(org.telegram.messenger.bd.M0(2131747903, null));
            this.simpleActionBar.n(org.telegram.messenger.bd.M0(2131745956, null));
        } else {
            this.simpleActionBar.setSubtitle(org.telegram.messenger.bd.M0(2131751685, null));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.tj0 tj0Var = new org.telegram.ui.Components.tj0(context, null);
        this.b = tj0Var;
        tj0Var.r1();
        this.b.setSectionsDrawBackground(true);
        frameLayout.addView(this.b, b8.mf.c(-1.0f, -1));
        org.telegram.ui.Components.tj0 tj0Var2 = this.b;
        ww0 ww0Var = new ww0(this, context);
        this.c = ww0Var;
        tj0Var2.setAdapter(ww0Var);
        this.b.setItemAnimator(null);
        this.b.setLayoutAnimation(null);
        this.b.setLayoutManager(new kg.y(17));
        this.b.setOnItemClickListener(new p51(this, context, v, i3));
        this.a = frameLayout;
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.f0) {
            try {
                this.c.f();
            } catch (Exception unused) {
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final org.telegram.ui.Components.tj0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final org.telegram.ui.ActionBar.e6 getResourceProvider() {
        return this.e;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        h6 h6Var = new h6(19, this);
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{org.telegram.ui.Cells.oa.class}, new String[]{"statusColor"}, (Drawable[]) null, h6Var, org.telegram.ui.ActionBar.k6.y6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{org.telegram.ui.Cells.oa.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, h6Var, org.telegram.ui.ActionBar.k6.n6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onActivityResultFragment(int i3, int i10, Intent intent) {
        Ringtone ringtone;
        if (i10 != -1 || intent == null) {
            return;
        }
        Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
        String str = null;
        if (uri != null && (ringtone = RingtoneManager.getRingtone(org.telegram.messenger.t0.b, uri)) != null) {
            str = i3 == 13 ? uri.equals(Settings.System.DEFAULT_RINGTONE_URI) ? org.telegram.messenger.bd.M0(2131751600, null) : ringtone.getTitle(getParentActivity()) : uri.equals(Settings.System.DEFAULT_NOTIFICATION_URI) ? org.telegram.messenger.bd.M0(2131745290, null) : ringtone.getTitle(getParentActivity());
            ringtone.stop();
        }
        SharedPreferences.Editor edit = org.telegram.messenger.hp.s1(this.currentAccount).d7.edit();
        String v = org.telegram.messenger.us.v(this.f, this.h, false);
        if (i3 == 12) {
            if (str != null) {
                edit.putString("sound_" + v, str);
                edit.putString("sound_path_" + v, uri.toString());
            } else {
                edit.putString("sound_" + v, "NoSound");
                edit.putString("sound_path_" + v, "NoSound");
            }
            getNotificationsController().l(this.f, this.h);
        } else if (i3 == 13) {
            if (str != null) {
                edit.putString("ringtone_" + v, str);
                edit.putString("ringtone_path_" + v, uri.toString());
            } else {
                edit.putString("ringtone_" + v, "NoSound");
                edit.putString("ringtone_path_" + v, "NoSound");
            }
        }
        edit.apply();
        ww0 ww0Var = this.c;
        if (ww0Var != null) {
            ww0Var.g(i3 == 13 ? this.S : this.H);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010f  */
    @Override // org.telegram.ui.ActionBar.d2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onFragmentCreate() {
        boolean z10;
        long j10 = this.f;
        if (org.telegram.messenger.m5.E(j10)) {
            ArrayList arrayList = getMediaDataController().j1;
            int i3 = 0;
            while (true) {
                if (i3 >= arrayList.size()) {
                    break;
                }
                TLRPC.Peer peer = ((TLRPC.TL_topPeer) arrayList.get(i3)).peer;
                if ((peer instanceof TLRPC.TL_peerUser) && peer.user_id == j10) {
                    this.b0 = i3 < 5;
                } else {
                    i3++;
                }
            }
        }
        this.a0 = 0;
        boolean z11 = this.n;
        if (z11) {
            this.y = 0;
            this.a0 = 2;
            this.E = 1;
        } else {
            this.y = -1;
            this.E = -1;
        }
        int i10 = this.a0;
        int i11 = i10 + 1;
        this.a0 = i11;
        this.x = i10;
        long j11 = this.h;
        if (z11 || j11 != 0) {
            this.a0 = i10 + 2;
            this.F = i11;
        } else {
            this.F = -1;
        }
        this.Q = -1;
        if (org.telegram.messenger.m5.C(j10)) {
            this.G = -1;
        } else {
            int i12 = this.a0;
            this.a0 = i12 + 1;
            this.G = i12;
            if (org.telegram.messenger.m5.E(j10)) {
                int i13 = this.a0;
                this.a0 = i13 + 1;
                this.Q = i13;
            }
        }
        int i14 = this.a0;
        this.H = i14;
        this.a0 = i14 + 2;
        this.I = i14 + 1;
        if (org.telegram.messenger.m5.z(j10)) {
            int i15 = this.a0;
            this.a0 = i15 + 1;
            this.J = i15;
        } else {
            this.J = -1;
        }
        int i16 = this.a0;
        this.K = i16;
        this.a0 = i16 + 2;
        this.L = i16 + 1;
        if (org.telegram.messenger.m5.z(j10)) {
            TLRPC.Chat M0 = org.telegram.messenger.hp.s1(this.currentAccount).M0(Long.valueOf(-j10));
            if (org.telegram.messenger.t3.T(M0) && !M0.megagroup) {
                z10 = true;
                if (!org.telegram.messenger.m5.C(j10) || z10) {
                    this.M = -1;
                    this.N = -1;
                    this.O = -1;
                    this.P = -1;
                } else {
                    int i17 = this.a0;
                    this.M = i17;
                    this.N = i17 + 1;
                    this.O = i17 + 2;
                    this.a0 = i17 + 4;
                    this.P = i17 + 3;
                }
                if (org.telegram.messenger.m5.E(j10)) {
                    this.R = -1;
                    this.T = -1;
                    this.S = -1;
                    this.U = -1;
                } else {
                    int i18 = this.a0;
                    this.R = i18;
                    this.T = i18 + 1;
                    this.S = i18 + 2;
                    this.a0 = i18 + 4;
                    this.U = i18 + 3;
                }
                int i19 = this.a0;
                this.V = i19;
                this.W = i19 + 1;
                int i20 = i19 + 3;
                this.a0 = i20;
                this.X = i19 + 2;
                if (z11) {
                    this.Y = i20;
                    this.a0 = i19 + 5;
                    this.Z = i19 + 4;
                } else {
                    this.Y = -1;
                    this.Z = -1;
                }
                boolean D = org.telegram.messenger.us.t(this.currentAccount).D(this.f, null, false, false);
                if (z11) {
                    SharedPreferences sharedPreferences = org.telegram.messenger.hp.s1(this.currentAccount).d7;
                    String v = org.telegram.messenger.us.v(j10, j11, false);
                    boolean contains = sharedPreferences.contains("notify2_" + v);
                    int c2 = org.telegram.messenger.k5.c("notify2_", v, sharedPreferences, 0);
                    if (c2 == 0) {
                        if (contains) {
                            this.r = true;
                        } else {
                            this.r = org.telegram.messenger.us.t(this.currentAccount).D(this.f, null, false, false);
                        }
                    } else if (c2 == 1) {
                        this.r = true;
                    } else if (c2 == 2) {
                        this.r = false;
                    } else {
                        this.r = false;
                    }
                } else {
                    this.r = !D;
                }
                org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.f0);
                return super.onFragmentCreate();
            }
        }
        z10 = false;
        if (org.telegram.messenger.m5.C(j10)) {
        }
        this.M = -1;
        this.N = -1;
        this.O = -1;
        this.P = -1;
        if (org.telegram.messenger.m5.E(j10)) {
        }
        int i192 = this.a0;
        this.V = i192;
        this.W = i192 + 1;
        int i202 = i192 + 3;
        this.a0 = i202;
        this.X = i192 + 2;
        if (z11) {
        }
        boolean D2 = org.telegram.messenger.us.t(this.currentAccount).D(this.f, null, false, false);
        if (z11) {
        }
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.f0);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.c0) {
            String v = org.telegram.messenger.us.v(this.f, this.h, false);
            org.telegram.messenger.hp.s1(this.currentAccount).d7.edit().putBoolean("custom_" + v, true).apply();
        }
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.f0);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onInsets(int i3, int i10, int i11, int i12) {
        super.onInsets(i3, i10, i11, i12);
        org.telegram.messenger.g0.B3(this.w.e, 0, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - org.telegram.messenger.g0.L(42.0f)) / 2) + this.mSystemInsets.b, org.telegram.messenger.g0.L(6.0f), 0);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        org.telegram.messenger.g0.E2(this.w.e);
        if (!this.n) {
            this.a.addView(this.w.e, b8.mf.e(42, 42, 53));
        }
        org.telegram.messenger.g0.B3(this.w.e, 0, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - org.telegram.messenger.g0.L(42.0f)) / 2) + this.mSystemInsets.b, org.telegram.messenger.g0.L(6.0f), 0);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
