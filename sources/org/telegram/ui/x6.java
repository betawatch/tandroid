package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class x6 extends sg.b {
    public final /* synthetic */ int d;
    public final Context e;
    public final /* synthetic */ org.telegram.ui.ActionBar.d2 f;

    public /* synthetic */ x6(int i3, Context context, org.telegram.ui.ActionBar.d2 d2Var) {
        this.d = i3;
        this.f = d2Var;
        this.e = context;
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        int i3;
        switch (this.d) {
            case 0:
                long b10 = d1Var.b();
                z6 z6Var = (z6) this.f;
                return b10 == z6Var.K || ((i3 = d1Var.f) == 2 && z6Var.H > 0 && !z6Var.L) || i3 == 5 || i3 == 7 || i3 == 11;
            default:
                int i10 = d1Var.f;
                return (i10 == 0 || i10 == 4) ? false : true;
        }
    }

    @Override // u4.h0
    public final int b() {
        switch (this.d) {
            case 0:
                return ((z6) this.f).g0.size();
            default:
                return ((NotificationsCustomSettingsActivity) this.f).J.size();
        }
    }

    @Override // u4.h0
    public final int d(int i3) {
        switch (this.d) {
            case 0:
                return ((v6) ((z6) this.f).g0.get(i3)).a;
            default:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.f;
                if (i3 < 0 || i3 >= notificationsCustomSettingsActivity.J.size()) {
                    return 5;
                }
                return ((gh0) notificationsCustomSettingsActivity.J.get(i3)).a;
        }
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        int i10;
        org.telegram.ui.Cells.l8 l8Var;
        int i11 = this.d;
        org.telegram.ui.ActionBar.d2 d2Var = this.f;
        switch (i11) {
            case 0:
                z6 z6Var = (z6) d2Var;
                ArrayList arrayList = z6Var.g0;
                v6 v6Var = (v6) arrayList.get(i3);
                int i12 = d1Var.f;
                View view = d1Var.a;
                if (i12 == 0) {
                    org.telegram.ui.Cells.v9 v9Var = (org.telegram.ui.Cells.v9) view;
                    if (i3 == z6Var.K) {
                        v9Var.c(org.telegram.messenger.bd.M0(2131748442, null), null, false, false);
                        break;
                    }
                } else if (i12 == 1) {
                    ((org.telegram.ui.Cells.y8) view).setText(org.telegram.messenger.g0.X2(v6Var.e));
                    break;
                } else if (i12 == 2) {
                    final org.telegram.ui.Components.gw0 gw0Var = (org.telegram.ui.Components.gw0) view;
                    boolean z10 = z6Var.L;
                    long j10 = z6Var.e;
                    long j11 = z6Var.H;
                    long j12 = z6Var.J;
                    long j13 = z6Var.I;
                    b4.n nVar = gw0Var.J;
                    View view2 = gw0Var.x;
                    TextView textView = gw0Var.n;
                    TextView textView2 = gw0Var.h;
                    TextView textView3 = gw0Var.w;
                    org.telegram.ui.Cells.v9 v9Var2 = gw0Var.E;
                    gw0Var.e = z10;
                    TextView textView4 = gw0Var.r;
                    textView4.setText(org.telegram.messenger.bd.a0("TotalDeviceFreeSize", null, 2131743983, org.telegram.messenger.g0.i0(j12, false, false)));
                    TextView textView5 = gw0Var.s;
                    long j14 = j13 - j12;
                    textView5.setText(org.telegram.messenger.bd.a0("TotalDeviceSize", null, 2131743982, org.telegram.messenger.g0.i0(j14, false, false)));
                    if (z10) {
                        textView3.setVisibility(0);
                        textView2.setVisibility(8);
                        textView4.setVisibility(8);
                        textView5.setVisibility(8);
                        textView.setVisibility(8);
                        view2.setVisibility(8);
                        v9Var2.setVisibility(8);
                        gw0Var.F = 0.0f;
                        gw0Var.G = 0.0f;
                        if (nVar != null) {
                            nVar.c(textView3);
                        }
                    } else {
                        if (nVar != null) {
                            nVar.z(textView3);
                        }
                        textView3.setVisibility(8);
                        if (j11 > 0) {
                            i10 = 0;
                            view2.setVisibility(0);
                            v9Var2.setVisibility(0);
                            textView2.setVisibility(0);
                            textView.setVisibility(8);
                            v9Var2.c(org.telegram.messenger.bd.M0(2131752047, null), org.telegram.messenger.g0.i0(j11, false, false), false, true);
                            textView2.setText(org.telegram.messenger.bd.a0("TelegramCacheSize", null, 2131744256, org.telegram.messenger.g0.i0(j11 + j10, false, false)));
                        } else {
                            i10 = 0;
                            textView2.setVisibility(8);
                            textView.setVisibility(0);
                            textView.setText(org.telegram.messenger.bd.a0("LocalDatabaseSize", null, 2131748777, org.telegram.messenger.g0.i0(j10, false, false)));
                            view2.setVisibility(8);
                            v9Var2.setVisibility(8);
                        }
                        textView4.setVisibility(i10);
                        textView5.setVisibility(i10);
                        float f10 = j11 + j10;
                        float f11 = j13;
                        float f12 = f10 / f11;
                        float f13 = j14 / f11;
                        if (gw0Var.F != f12) {
                            ValueAnimator valueAnimator = gw0Var.H;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            final int i13 = 0;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(gw0Var.F, f12);
                            gw0Var.H = ofFloat;
                            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.fw0
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                    switch (i13) {
                                        case 0:
                                            gw0 gw0Var2 = gw0Var;
                                            gw0Var2.getClass();
                                            gw0Var2.F = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                            gw0Var2.invalidate();
                                            break;
                                        default:
                                            gw0 gw0Var3 = gw0Var;
                                            gw0Var3.getClass();
                                            gw0Var3.G = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                            gw0Var3.invalidate();
                                            break;
                                    }
                                }
                            });
                            gw0Var.H.start();
                        }
                        if (gw0Var.G != f13) {
                            ValueAnimator valueAnimator2 = gw0Var.I;
                            if (valueAnimator2 != null) {
                                valueAnimator2.cancel();
                            }
                            final int i14 = 1;
                            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(gw0Var.G, f13);
                            gw0Var.I = ofFloat2;
                            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.fw0
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                                    switch (i14) {
                                        case 0:
                                            gw0 gw0Var2 = gw0Var;
                                            gw0Var2.getClass();
                                            gw0Var2.F = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                            gw0Var2.invalidate();
                                            break;
                                        default:
                                            gw0 gw0Var3 = gw0Var;
                                            gw0Var3.getClass();
                                            gw0Var3.G = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                            gw0Var3.invalidate();
                                            break;
                                    }
                                }
                            });
                            gw0Var.I.start();
                        }
                    }
                    org.telegram.ui.ActionBar.r6.V(v9Var2.getTextView(), org.telegram.ui.ActionBar.k6.G6, null);
                    gw0Var.requestLayout();
                    break;
                } else if (i12 == 3) {
                    org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                    n4Var.setText(((v6) arrayList.get(i3)).d);
                    ((v6) arrayList.get(i3)).getClass();
                    n4Var.setTopMargin(15);
                    ((v6) arrayList.get(i3)).getClass();
                    n4Var.setBottomMargin(0);
                    break;
                } else if (i12 == 7) {
                    org.telegram.ui.Cells.l8 l8Var2 = (org.telegram.ui.Cells.l8) view;
                    org.telegram.messenger.u2 u2Var = z6Var.getMessagesController().r7;
                    int i15 = v6Var.c;
                    int size = u2Var.d(((v6) arrayList.get(i3)).c).size();
                    String G = size > 0 ? org.telegram.messenger.bd.G(size, "ExceptionShort", Integer.valueOf(size)) : null;
                    String f14 = org.telegram.messenger.u2.f(u2Var.c(i15));
                    if (((v6) arrayList.get(i3)).c == 0) {
                        l8Var = l8Var2;
                        l8Var.r(org.telegram.messenger.bd.M0(2131746761, null), f14, true, R.drawable.msg_filled_menu_users, -11565578, -13276952, true);
                    } else {
                        l8Var = l8Var2;
                        if (((v6) arrayList.get(i3)).c == 1) {
                            l8Var.r(org.telegram.messenger.bd.M0(2131749465, null), f14, true, R.drawable.msg_filled_menu_groups, -11154873, -14175180, true);
                        } else if (((v6) arrayList.get(i3)).c == 2) {
                            l8Var.r(org.telegram.messenger.bd.M0(2131752650, null), f14, true, R.drawable.msg_filled_menu_channels, -1007845, -1996271, true);
                        } else if (((v6) arrayList.get(i3)).c == 3) {
                            l8Var.r(org.telegram.messenger.bd.M0(2131752646, null), f14, false, R.drawable.msg_filled_stories, -765355, -2148011, false);
                        }
                    }
                    l8Var.setSubtitle(G);
                    break;
                } else {
                    switch (i12) {
                        case 9:
                            z6Var.y0();
                            break;
                        case 10:
                            m6 m6Var = z6Var.Y;
                            if (m6Var != null && !z6Var.L) {
                                long j15 = z6Var.H;
                                boolean z11 = j15 > 0;
                                long j16 = z6Var.I;
                                m6Var.b(j16 <= 0 ? 0.0f : j15 / j16, (z6Var.J <= 0 || j16 <= 0) ? 0.0f : (j16 - r6) / j16, z11);
                                break;
                            }
                            break;
                        case 11:
                            org.telegram.ui.Cells.c2 c2Var = (org.telegram.ui.Cells.c2) view;
                            int i16 = v6Var.f;
                            boolean t02 = i16 < 0 ? z6Var.t0() : z6Var.d[i16];
                            CharSequence charSequence = v6Var.d;
                            int[] iArr = z6Var.V;
                            int i17 = v6Var.f;
                            if (i17 < 0) {
                                i17 = 9;
                            }
                            int i18 = iArr[i17];
                            SpannableString spannableString = new SpannableString(i18 <= 0 ? String.format("<%.1f%%", Float.valueOf(1.0f)) : String.format("%d%%", Integer.valueOf(i18)));
                            spannableString.setSpan(new RelativeSizeSpan(0.834f), 0, spannableString.length(), 33);
                            spannableString.setSpan(new org.telegram.ui.Components.o31(org.telegram.messenger.g0.o()), 0, spannableString.length(), 33);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                            spannableStringBuilder.append((CharSequence) "  ");
                            spannableStringBuilder.append((CharSequence) spannableString);
                            c2Var.e(spannableStringBuilder, org.telegram.messenger.g0.i0(v6Var.g, false, false), t02, v6Var.f >= 0 ? !v6Var.j : !z6Var.M, false);
                            int i19 = v6Var.h;
                            int i20 = org.telegram.ui.ActionBar.k6.k7;
                            org.telegram.ui.Components.wo woVar = c2Var.r;
                            if (woVar != null) {
                                woVar.b(i19, i19, i20);
                            }
                            c2Var.setCollapsed(v6Var.f < 0 ? Boolean.valueOf(z6Var.M) : null);
                            if (v6Var.f == -1) {
                                c2Var.d(new a(this, 6), new org.telegram.messenger.video.g(10, this, c2Var));
                            } else {
                                c2Var.d(null, null);
                            }
                            c2Var.setPad(v6Var.i ? 1 : 0);
                            break;
                    }
                }
                break;
            default:
                ArrayList arrayList2 = ((NotificationsCustomSettingsActivity) d2Var).J;
                if (i3 >= 0 && i3 < arrayList2.size()) {
                    gh0 gh0Var = (gh0) arrayList2.get(i3);
                    int i21 = i3 + 1;
                    boolean z12 = i21 < arrayList2.size() && ((gh0) arrayList2.get(i21)).a != 4;
                    int i22 = d1Var.f;
                    View view3 = d1Var.a;
                    switch (i22) {
                        case 0:
                            ((org.telegram.ui.Cells.n4) view3).setText(gh0Var.e);
                            break;
                        case 1:
                            ((org.telegram.ui.Cells.q8) view3).f("" + ((Object) gh0Var.e), gh0Var.i, z12);
                            break;
                        case 2:
                            ((org.telegram.ui.Cells.pa) view3).f(gh0Var.g, null, z12);
                            break;
                        case 3:
                            ((org.telegram.ui.Cells.s8) view3).b(gh0Var.h, "" + ((Object) gh0Var.e), z12);
                            break;
                        case 4:
                            org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view3;
                            if (gh0Var.e != null) {
                                y8Var.setFixedSize(0);
                                y8Var.setText(gh0Var.e);
                                break;
                            } else {
                                y8Var.setFixedSize(12);
                                y8Var.setText(null);
                                break;
                            }
                        case 5:
                            ((org.telegram.ui.Cells.v9) view3).c(gh0Var.e, gh0Var.f, false, z12);
                            break;
                        case 6:
                            org.telegram.ui.Cells.h5 h5Var = (org.telegram.ui.Cells.h5) view3;
                            h5Var.setDrawLine(true);
                            h5Var.setChecked(gh0Var.i);
                            h5Var.b(gh0Var.e, gh0Var.f, gh0Var.d, gh0Var.i, 0, false, z12, true);
                            break;
                        case 7:
                            org.telegram.ui.Cells.l8 l8Var3 = (org.telegram.ui.Cells.l8) view3;
                            if (gh0Var.d != 0) {
                                l8Var3.g(org.telegram.ui.ActionBar.k6.v6, org.telegram.ui.ActionBar.k6.u6);
                                l8Var3.o(gh0Var.d, "" + ((Object) gh0Var.e), z12);
                                break;
                            } else {
                                l8Var3.g(-1, org.telegram.ui.ActionBar.k6.p7);
                                l8Var3.k("" + ((Object) gh0Var.e), z12);
                                break;
                            }
                        case 8:
                            fh0 fh0Var = (fh0) view3;
                            fh0Var.g(org.telegram.ui.ActionBar.k6.v6, org.telegram.ui.ActionBar.k6.u6);
                            CharSequence charSequence2 = gh0Var.e;
                            org.telegram.messenger.camera.q.l(fh0Var.a0.animate().rotation(gh0Var.d == 1 ? 0.0f : 180.0f), org.telegram.ui.Components.xq.h, 340L);
                            fh0Var.k(charSequence2, z12);
                            break;
                    }
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View view;
        w6 w6Var;
        org.telegram.ui.ActionBar.e6 e6Var;
        FrameLayout h5Var;
        int i10 = this.d;
        Context context = this.e;
        org.telegram.ui.ActionBar.d2 d2Var = this.f;
        switch (i10) {
            case 0:
                z6 z6Var = (z6) d2Var;
                if (i3 != 0) {
                    int i11 = 26;
                    switch (i3) {
                        case 2:
                            org.telegram.ui.Components.gw0 gw0Var = new org.telegram.ui.Components.gw0(context);
                            Paint paint = new Paint(1);
                            gw0Var.a = paint;
                            Paint paint2 = new Paint(1);
                            Paint paint3 = new Paint(1);
                            gw0Var.b = paint3;
                            Paint paint4 = new Paint(1);
                            gw0Var.c = paint4;
                            gw0Var.d = new Paint();
                            org.telegram.ui.Components.voip.g gVar = new org.telegram.ui.Components.voip.g(org.telegram.messenger.hs.x3, org.telegram.messenger.hs.e4);
                            gw0Var.M = gVar;
                            gw0Var.setWillNotDraw(false);
                            gVar.k = false;
                            paint.setStrokeWidth(org.telegram.messenger.g0.L(6.0f));
                            paint2.setStrokeWidth(org.telegram.messenger.g0.L(6.0f));
                            paint3.setStrokeWidth(org.telegram.messenger.g0.L(6.0f));
                            paint4.setStrokeWidth(org.telegram.messenger.g0.L(6.0f));
                            Paint.Cap cap = Paint.Cap.ROUND;
                            paint.setStrokeCap(cap);
                            paint2.setStrokeCap(cap);
                            paint3.setStrokeCap(cap);
                            paint4.setStrokeCap(cap);
                            ai.x2 x2Var = new ai.x2(29, context, gw0Var);
                            gw0Var.f = x2Var;
                            gw0Var.addView(x2Var, b8.mf.c(-2.0f, -1));
                            LinearLayout linearLayout = new LinearLayout(context);
                            linearLayout.setOrientation(1);
                            gw0Var.addView(linearLayout, b8.mf.c(-2.0f, -1));
                            ai.d2 d2Var2 = new ai.d2(context, 23);
                            linearLayout.addView(d2Var2, b8.mf.k(21.0f, 40.0f, 21.0f, 16.0f, -1, -2));
                            TextView textView = new TextView(context);
                            gw0Var.w = textView;
                            int i12 = org.telegram.ui.ActionBar.k6.y6;
                            org.telegram.ui.ActionBar.r6.V(textView, i12, null);
                            String M0 = org.telegram.messenger.bd.M0(2131752643, "CalculatingSize");
                            int indexOf = M0.indexOf("...");
                            if (indexOf >= 0) {
                                SpannableString spannableString = new SpannableString(M0);
                                b4.n nVar = new b4.n(textView);
                                gw0Var.J = nVar;
                                nVar.E(spannableString, indexOf);
                                textView.setText(spannableString);
                            } else {
                                textView.setText(M0);
                            }
                            TextView textView2 = new TextView(context);
                            gw0Var.h = textView2;
                            textView2.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
                            org.telegram.ui.ActionBar.r6.V(textView2, i12, null);
                            TextView textView3 = new TextView(context);
                            gw0Var.n = textView3;
                            textView3.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
                            org.telegram.ui.ActionBar.r6.V(textView3, i12, null);
                            TextView textView4 = new TextView(context);
                            gw0Var.r = textView4;
                            textView4.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
                            org.telegram.ui.ActionBar.r6.V(textView4, i12, null);
                            TextView textView5 = new TextView(context);
                            gw0Var.s = textView5;
                            textView5.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
                            org.telegram.ui.ActionBar.r6.V(textView5, i12, null);
                            gw0Var.y = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Jj, false);
                            textView2.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.k6.L(org.telegram.messenger.g0.L(10.0f), gw0Var.y), (Drawable) null, (Drawable) null, (Drawable) null);
                            textView2.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
                            textView4.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.k6.L(org.telegram.messenger.g0.L(10.0f), i0.a.o(gw0Var.y, 64)), (Drawable) null, (Drawable) null, (Drawable) null);
                            textView4.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
                            textView5.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.k6.L(org.telegram.messenger.g0.L(10.0f), i0.a.o(gw0Var.y, org.telegram.messenger.hs.L1)), (Drawable) null, (Drawable) null, (Drawable) null);
                            textView5.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
                            textView3.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.k6.L(org.telegram.messenger.g0.L(10.0f), gw0Var.y), (Drawable) null, (Drawable) null, (Drawable) null);
                            textView3.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
                            d2Var2.addView(textView, b8.mf.c(-2.0f, -2));
                            d2Var2.addView(textView3, b8.mf.c(-2.0f, -2));
                            d2Var2.addView(textView2, b8.mf.c(-2.0f, -2));
                            d2Var2.addView(textView5, b8.mf.c(-2.0f, -2));
                            d2Var2.addView(textView4, b8.mf.c(-2.0f, -2));
                            View view2 = new View(gw0Var.getContext());
                            gw0Var.x = view2;
                            linearLayout.addView(view2, b8.mf.t(-1, -2, 0, 21, 0, 0, 0));
                            view2.getLayoutParams().height = 1;
                            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d7, view2, null);
                            org.telegram.ui.Cells.v9 v9Var = new org.telegram.ui.Cells.v9(gw0Var.getContext());
                            gw0Var.E = v9Var;
                            linearLayout.addView(v9Var, b8.mf.o(-1, -2));
                            view = gw0Var;
                            break;
                        case 3:
                            view = new org.telegram.ui.Cells.n4(context);
                            break;
                        case 4:
                            org.telegram.ui.Components.ut0 ut0Var = new org.telegram.ui.Components.ut0(context, null);
                            ut0Var.setCallback(new org.telegram.messenger.go(12));
                            int i13 = org.telegram.messenger.az.G;
                            ut0Var.b(i13 == 3 ? 0 : i13 + 1, null, org.telegram.messenger.bd.G(3, "Days", new Object[0]), org.telegram.messenger.bd.G(1, "Weeks", new Object[0]), org.telegram.messenger.bd.G(1, "Months", new Object[0]), org.telegram.messenger.bd.M0(2131749067, null));
                            view = ut0Var;
                            break;
                        case 5:
                            view = new y6(z6Var.getParentActivity(), z6Var.getResourceProvider());
                            break;
                        case 6:
                            org.telegram.ui.Components.iz izVar = new org.telegram.ui.Components.iz(z6Var.getParentActivity(), null);
                            izVar.setIsSingleCell(true);
                            izVar.setItemsCount(3);
                            izVar.setIgnoreHeightCheck(true);
                            izVar.setViewType(25);
                            view = izVar;
                            break;
                        case 7:
                            view = new org.telegram.ui.Cells.l8(context);
                            break;
                        case 8:
                            org.telegram.ui.Components.gt0 gt0Var = z6Var.c0;
                            gt0Var.getClass();
                            View x2Var2 = new ai.x2(i11, context, gt0Var);
                            x2Var2.setTag(-33024);
                            x2Var2.setLayoutParams(new u4.p0(-1, -1));
                            view = x2Var2;
                            break;
                        case 9:
                            w6 w6Var2 = new w6(this, context);
                            z6Var.X = w6Var2;
                            w6Var2.setTag(-33024);
                            w6Var = w6Var2;
                            view = w6Var;
                            break;
                        case 10:
                            m6 m6Var = new m6(z6Var, context);
                            z6Var.Y = m6Var;
                            m6Var.setTag(-33024);
                            w6Var = m6Var;
                            view = w6Var;
                            break;
                        case 11:
                            view = new org.telegram.ui.Cells.c2(this.e, 4, 21, false, z6Var.getResourceProvider());
                            break;
                        case 12:
                            org.telegram.ui.Components.iz izVar2 = new org.telegram.ui.Components.iz(z6Var.getParentActivity(), null);
                            izVar2.setIsSingleCell(true);
                            izVar2.setItemsCount(1);
                            izVar2.setIgnoreHeightCheck(true);
                            izVar2.setViewType(26);
                            view = izVar2;
                            break;
                        case 13:
                            r6 r6Var = new r6(z6Var, context);
                            z6Var.Z = r6Var;
                            view = r6Var;
                            break;
                        case 14:
                            org.telegram.ui.Components.ut0 ut0Var2 = new org.telegram.ui.Components.ut0(context, null);
                            float f10 = ((int) ((z6Var.I / 1024) / 1024)) / 1000.0f;
                            ArrayList arrayList = new ArrayList();
                            if (f10 <= 17.0f) {
                                arrayList.add(2);
                            }
                            if (f10 > 5.0f) {
                                arrayList.add(5);
                            }
                            if (f10 > 16.0f) {
                                arrayList.add(16);
                            }
                            if (f10 > 32.0f) {
                                arrayList.add(32);
                            }
                            arrayList.add(Integer.valueOf(ConnectionsManager.DEFAULT_DATACENTER_ID));
                            String[] strArr = new String[arrayList.size()];
                            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                                if (((Integer) arrayList.get(i14)).intValue() == 1) {
                                    strArr[i14] = "300 MB";
                                } else if (((Integer) arrayList.get(i14)).intValue() == Integer.MAX_VALUE) {
                                    strArr[i14] = org.telegram.messenger.bd.M0(2131748210, null);
                                } else {
                                    strArr[i14] = String.format("%d GB", arrayList.get(i14));
                                }
                            }
                            ut0Var2.setCallback(new x0(arrayList, 10));
                            int indexOf2 = arrayList.indexOf(Integer.valueOf(org.telegram.messenger.az.q().getInt("cache_limit", ConnectionsManager.DEFAULT_DATACENTER_ID)));
                            if (indexOf2 < 0) {
                                indexOf2 = arrayList.size() - 1;
                            }
                            ut0Var2.b(indexOf2, null, strArr);
                            view = ut0Var2;
                            break;
                        default:
                            view = new org.telegram.ui.Cells.y8(context);
                            break;
                    }
                } else {
                    view = new org.telegram.ui.Cells.v9(context);
                }
                return new org.telegram.ui.Components.bj0(view);
            default:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) d2Var;
                switch (i3) {
                    case 0:
                        h5Var = new org.telegram.ui.Cells.n4(context);
                        break;
                    case 1:
                        h5Var = new org.telegram.ui.Cells.q8(context);
                        break;
                    case 2:
                        h5Var = new org.telegram.ui.Cells.pa(context, 6, 0, false);
                        break;
                    case 3:
                        h5Var = new org.telegram.ui.Cells.s8(context, null);
                        break;
                    case 4:
                        h5Var = new org.telegram.ui.Cells.y8(context);
                        break;
                    case 5:
                        h5Var = new org.telegram.ui.Cells.v9(context);
                        break;
                    case 6:
                        e6Var = ((org.telegram.ui.ActionBar.d2) notificationsCustomSettingsActivity).resourceProvider;
                        h5Var = new org.telegram.ui.Cells.h5(this.e, 21, 64, true, e6Var);
                        break;
                    case 7:
                    default:
                        h5Var = new org.telegram.ui.Cells.l8(context);
                        break;
                    case 8:
                        fh0 fh0Var = new fh0(context);
                        ImageView imageView = new ImageView(context);
                        fh0Var.a0 = imageView;
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.v6, notificationsCustomSettingsActivity.getResourceProvider(), PorterDuff.Mode.SRC_IN);
                        imageView.setImageResource(R.drawable.msg_expand);
                        fh0Var.addView(imageView, b8.mf.d(24, 24.0f, (org.telegram.messenger.bd.a0 ? 3 : 5) | 16, 17.0f, 0.0f, 17.0f, 0.0f));
                        h5Var = fh0Var;
                        break;
                }
                return new org.telegram.ui.Components.bj0(h5Var);
        }
    }

    @Override // u4.h0
    public void y(u4.d1 d1Var) {
        boolean B;
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.d) {
            case 1:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.f;
                ArrayList arrayList3 = notificationsCustomSettingsActivity.J;
                int i3 = notificationsCustomSettingsActivity.s;
                if (i3 == 3 || ((arrayList2 = notificationsCustomSettingsActivity.x) != null && arrayList2.isEmpty())) {
                    if (i3 == 3) {
                        Boolean bool = notificationsCustomSettingsActivity.n;
                        B = bool == null || bool.booleanValue() || !((arrayList = notificationsCustomSettingsActivity.x) == null || arrayList.isEmpty());
                    } else {
                        B = notificationsCustomSettingsActivity.getNotificationsController().B(i3);
                    }
                    int b10 = d1Var.b();
                    View view = d1Var.a;
                    gh0 gh0Var = (b10 < 0 || b10 >= arrayList3.size()) ? null : (gh0) arrayList3.get(b10);
                    if (gh0Var == null || gh0Var.c != 102) {
                        int i10 = d1Var.f;
                        if (i10 == 0) {
                            ((org.telegram.ui.Cells.n4) view).a(null, B);
                            break;
                        } else if (i10 == 1) {
                            ((org.telegram.ui.Cells.q8) view).e(null, B);
                            break;
                        } else if (i10 == 3) {
                            ((org.telegram.ui.Cells.s8) view).a(null, B);
                            break;
                        } else if (i10 == 5) {
                            ((org.telegram.ui.Cells.v9) view).a(null, B);
                            break;
                        }
                    }
                }
                break;
        }
    }
}
