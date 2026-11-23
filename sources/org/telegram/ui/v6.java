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

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class v6 extends rg.b {
    public final /* synthetic */ int d;
    public final Context e;
    public final /* synthetic */ org.telegram.ui.ActionBar.g2 f;

    public /* synthetic */ v6(int i7, Context context, org.telegram.ui.ActionBar.g2 g2Var) {
        this.d = i7;
        this.f = g2Var;
        this.e = context;
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        int i7;
        switch (this.d) {
            case 0:
                long b10 = f1Var.b();
                x6 x6Var = (x6) this.f;
                return b10 == x6Var.K || ((i7 = f1Var.f) == 2 && x6Var.H > 0 && !x6Var.L) || i7 == 5 || i7 == 7 || i7 == 11;
            default:
                int i10 = f1Var.f;
                return (i10 == 0 || i10 == 4) ? false : true;
        }
    }

    @Override // v4.i0
    public final int b() {
        switch (this.d) {
            case 0:
                return ((x6) this.f).g0.size();
            default:
                return ((NotificationsCustomSettingsActivity) this.f).J.size();
        }
    }

    @Override // v4.i0
    public final int d(int i7) {
        switch (this.d) {
            case 0:
                return ((t6) ((x6) this.f).g0.get(i7)).a;
            default:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.f;
                if (i7 < 0 || i7 >= notificationsCustomSettingsActivity.J.size()) {
                    return 5;
                }
                return ((qh0) notificationsCustomSettingsActivity.J.get(i7)).a;
        }
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        int i10;
        org.telegram.ui.Cells.n8 n8Var;
        int i11 = this.d;
        org.telegram.ui.ActionBar.g2 g2Var = this.f;
        switch (i11) {
            case 0:
                x6 x6Var = (x6) g2Var;
                ArrayList arrayList = x6Var.g0;
                t6 t6Var = (t6) arrayList.get(i7);
                int i12 = f1Var.f;
                View view = f1Var.a;
                if (i12 == 0) {
                    org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) view;
                    if (i7 == x6Var.K) {
                        x9Var.c(org.telegram.messenger.hd.N0(2131748241, null), null, false, false);
                        break;
                    }
                } else if (i12 == 1) {
                    ((org.telegram.ui.Cells.a9) view).setText(org.telegram.messenger.g0.W2(t6Var.e));
                    break;
                } else if (i12 == 2) {
                    final org.telegram.ui.Components.tw0 tw0Var = (org.telegram.ui.Components.tw0) view;
                    boolean z10 = x6Var.L;
                    long j3 = x6Var.e;
                    long j10 = x6Var.H;
                    long j11 = x6Var.J;
                    long j12 = x6Var.I;
                    ab.q qVar = tw0Var.J;
                    View view2 = tw0Var.x;
                    TextView textView = tw0Var.n;
                    TextView textView2 = tw0Var.h;
                    TextView textView3 = tw0Var.w;
                    org.telegram.ui.Cells.x9 x9Var2 = tw0Var.E;
                    tw0Var.e = z10;
                    TextView textView4 = tw0Var.r;
                    textView4.setText(org.telegram.messenger.hd.a0("TotalDeviceFreeSize", null, 2131743728, org.telegram.messenger.g0.i0(j11, false, false)));
                    TextView textView5 = tw0Var.s;
                    long j13 = j12 - j11;
                    textView5.setText(org.telegram.messenger.hd.a0("TotalDeviceSize", null, 2131743727, org.telegram.messenger.g0.i0(j13, false, false)));
                    if (z10) {
                        textView3.setVisibility(0);
                        textView2.setVisibility(8);
                        textView4.setVisibility(8);
                        textView5.setVisibility(8);
                        textView.setVisibility(8);
                        view2.setVisibility(8);
                        x9Var2.setVisibility(8);
                        tw0Var.F = 0.0f;
                        tw0Var.G = 0.0f;
                        if (qVar != null) {
                            qVar.c(textView3);
                        }
                    } else {
                        if (qVar != null) {
                            qVar.y(textView3);
                        }
                        textView3.setVisibility(8);
                        if (j10 > 0) {
                            i10 = 0;
                            view2.setVisibility(0);
                            x9Var2.setVisibility(0);
                            textView2.setVisibility(0);
                            textView.setVisibility(8);
                            x9Var2.c(org.telegram.messenger.hd.N0(2131752035, null), org.telegram.messenger.g0.i0(j10, false, false), false, true);
                            textView2.setText(org.telegram.messenger.hd.a0("TelegramCacheSize", null, 2131744003, org.telegram.messenger.g0.i0(j10 + j3, false, false)));
                        } else {
                            i10 = 0;
                            textView2.setVisibility(8);
                            textView.setVisibility(0);
                            textView.setText(org.telegram.messenger.hd.a0("LocalDatabaseSize", null, 2131748576, org.telegram.messenger.g0.i0(j3, false, false)));
                            view2.setVisibility(8);
                            x9Var2.setVisibility(8);
                        }
                        textView4.setVisibility(i10);
                        textView5.setVisibility(i10);
                        float f10 = j10 + j3;
                        float f11 = j12;
                        float f12 = f10 / f11;
                        float f13 = j13 / f11;
                        if (tw0Var.F != f12) {
                            ValueAnimator valueAnimator = tw0Var.H;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            final int i13 = 0;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(tw0Var.F, f12);
                            tw0Var.H = ofFloat;
                            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.sw0
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                    switch (i13) {
                                        case 0:
                                            tw0 tw0Var2 = tw0Var;
                                            tw0Var2.getClass();
                                            tw0Var2.F = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                            tw0Var2.invalidate();
                                            break;
                                        default:
                                            tw0 tw0Var3 = tw0Var;
                                            tw0Var3.getClass();
                                            tw0Var3.G = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                            tw0Var3.invalidate();
                                            break;
                                    }
                                }
                            });
                            tw0Var.H.start();
                        }
                        if (tw0Var.G != f13) {
                            ValueAnimator valueAnimator2 = tw0Var.I;
                            if (valueAnimator2 != null) {
                                valueAnimator2.cancel();
                            }
                            final int i14 = 1;
                            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(tw0Var.G, f13);
                            tw0Var.I = ofFloat2;
                            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.sw0
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                                    switch (i14) {
                                        case 0:
                                            tw0 tw0Var2 = tw0Var;
                                            tw0Var2.getClass();
                                            tw0Var2.F = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                            tw0Var2.invalidate();
                                            break;
                                        default:
                                            tw0 tw0Var3 = tw0Var;
                                            tw0Var3.getClass();
                                            tw0Var3.G = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                            tw0Var3.invalidate();
                                            break;
                                    }
                                }
                            });
                            tw0Var.I.start();
                        }
                    }
                    org.telegram.ui.ActionBar.t6.U(x9Var2.getTextView(), org.telegram.ui.ActionBar.m6.G6, null);
                    tw0Var.requestLayout();
                    break;
                } else if (i12 == 3) {
                    org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) view;
                    o4Var.setText(((t6) arrayList.get(i7)).d);
                    ((t6) arrayList.get(i7)).getClass();
                    o4Var.setTopMargin(15);
                    ((t6) arrayList.get(i7)).getClass();
                    o4Var.setBottomMargin(0);
                    break;
                } else if (i12 == 7) {
                    org.telegram.ui.Cells.n8 n8Var2 = (org.telegram.ui.Cells.n8) view;
                    org.telegram.messenger.v2 v2Var = x6Var.getMessagesController().u7;
                    int i15 = t6Var.c;
                    int size = v2Var.d(((t6) arrayList.get(i7)).c).size();
                    String G = size > 0 ? org.telegram.messenger.hd.G(size, "ExceptionShort", Integer.valueOf(size)) : null;
                    String f14 = org.telegram.messenger.v2.f(v2Var.c(i15));
                    if (((t6) arrayList.get(i7)).c == 0) {
                        n8Var = n8Var2;
                        n8Var.r(org.telegram.messenger.hd.N0(2131746559, null), f14, true, R.drawable.msg_filled_menu_users, -11565578, -13276952, true);
                    } else {
                        n8Var = n8Var2;
                        if (((t6) arrayList.get(i7)).c == 1) {
                            n8Var.r(org.telegram.messenger.hd.N0(2131749264, null), f14, true, R.drawable.msg_filled_menu_groups, -11154873, -14175180, true);
                        } else if (((t6) arrayList.get(i7)).c == 2) {
                            n8Var.r(org.telegram.messenger.hd.N0(2131752638, null), f14, true, R.drawable.msg_filled_menu_channels, -1007845, -1996271, true);
                        } else if (((t6) arrayList.get(i7)).c == 3) {
                            n8Var.r(org.telegram.messenger.hd.N0(2131752634, null), f14, false, R.drawable.msg_filled_stories, -765355, -2148011, false);
                        }
                    }
                    n8Var.setSubtitle(G);
                    break;
                } else {
                    switch (i12) {
                        case 9:
                            x6Var.y0();
                            break;
                        case 10:
                            k6 k6Var = x6Var.Y;
                            if (k6Var != null && !x6Var.L) {
                                long j14 = x6Var.H;
                                boolean z11 = j14 > 0;
                                long j15 = x6Var.I;
                                k6Var.b(j15 <= 0 ? 0.0f : j14 / j15, (x6Var.J <= 0 || j15 <= 0) ? 0.0f : (j15 - r6) / j15, z11);
                                break;
                            }
                            break;
                        case 11:
                            org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) view;
                            int i16 = t6Var.f;
                            boolean t02 = i16 < 0 ? x6Var.t0() : x6Var.d[i16];
                            CharSequence charSequence = t6Var.d;
                            int[] iArr = x6Var.V;
                            int i17 = t6Var.f;
                            if (i17 < 0) {
                                i17 = 9;
                            }
                            int i18 = iArr[i17];
                            SpannableString spannableString = new SpannableString(i18 <= 0 ? String.format("<%.1f%%", Float.valueOf(1.0f)) : String.format("%d%%", Integer.valueOf(i18)));
                            spannableString.setSpan(new RelativeSizeSpan(0.834f), 0, spannableString.length(), 33);
                            spannableString.setSpan(new org.telegram.ui.Components.l41(org.telegram.messenger.g0.o()), 0, spannableString.length(), 33);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                            spannableStringBuilder.append((CharSequence) "  ");
                            spannableStringBuilder.append((CharSequence) spannableString);
                            d2Var.e(spannableStringBuilder, org.telegram.messenger.g0.i0(t6Var.g, false, false), t02, t6Var.f >= 0 ? !t6Var.j : !x6Var.M, false);
                            int i19 = t6Var.h;
                            int i20 = org.telegram.ui.ActionBar.m6.k7;
                            org.telegram.ui.Components.op opVar = d2Var.r;
                            if (opVar != null) {
                                opVar.b(i19, i19, i20);
                            }
                            d2Var.setCollapsed(t6Var.f < 0 ? Boolean.valueOf(x6Var.M) : null);
                            if (t6Var.f == -1) {
                                int i21 = 6;
                                d2Var.d(new a(this, i21), new oi.i1(i21, this, d2Var));
                            } else {
                                d2Var.d(null, null);
                            }
                            d2Var.setPad(t6Var.i ? 1 : 0);
                            break;
                    }
                }
                break;
            default:
                ArrayList arrayList2 = ((NotificationsCustomSettingsActivity) g2Var).J;
                if (i7 >= 0 && i7 < arrayList2.size()) {
                    qh0 qh0Var = (qh0) arrayList2.get(i7);
                    int i22 = i7 + 1;
                    boolean z12 = i22 < arrayList2.size() && ((qh0) arrayList2.get(i22)).a != 4;
                    int i23 = f1Var.f;
                    View view3 = f1Var.a;
                    switch (i23) {
                        case 0:
                            ((org.telegram.ui.Cells.o4) view3).setText(qh0Var.e);
                            break;
                        case 1:
                            ((org.telegram.ui.Cells.s8) view3).f("" + ((Object) qh0Var.e), qh0Var.i, z12);
                            break;
                        case 2:
                            ((org.telegram.ui.Cells.ra) view3).f(qh0Var.g, null, z12);
                            break;
                        case 3:
                            ((org.telegram.ui.Cells.u8) view3).b(qh0Var.h, "" + ((Object) qh0Var.e), z12);
                            break;
                        case 4:
                            org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view3;
                            if (qh0Var.e != null) {
                                a9Var.setFixedSize(0);
                                a9Var.setText(qh0Var.e);
                                break;
                            } else {
                                a9Var.setFixedSize(12);
                                a9Var.setText(null);
                                break;
                            }
                        case 5:
                            ((org.telegram.ui.Cells.x9) view3).c(qh0Var.e, qh0Var.f, false, z12);
                            break;
                        case 6:
                            org.telegram.ui.Cells.j5 j5Var = (org.telegram.ui.Cells.j5) view3;
                            j5Var.setDrawLine(true);
                            j5Var.setChecked(qh0Var.i);
                            j5Var.b(qh0Var.e, qh0Var.f, qh0Var.d, qh0Var.i, 0, false, z12, true);
                            break;
                        case 7:
                            org.telegram.ui.Cells.n8 n8Var3 = (org.telegram.ui.Cells.n8) view3;
                            if (qh0Var.d != 0) {
                                n8Var3.g(org.telegram.ui.ActionBar.m6.v6, org.telegram.ui.ActionBar.m6.u6);
                                n8Var3.o(qh0Var.d, "" + ((Object) qh0Var.e), z12);
                                break;
                            } else {
                                n8Var3.g(-1, org.telegram.ui.ActionBar.m6.p7);
                                n8Var3.k("" + ((Object) qh0Var.e), z12);
                                break;
                            }
                        case 8:
                            ph0 ph0Var = (ph0) view3;
                            ph0Var.g(org.telegram.ui.ActionBar.m6.v6, org.telegram.ui.ActionBar.m6.u6);
                            CharSequence charSequence2 = qh0Var.e;
                            org.telegram.messenger.o10.o(ph0Var.a0.animate().rotation(qh0Var.d == 1 ? 0.0f : 180.0f), org.telegram.ui.Components.nr.h, 340L);
                            ph0Var.k(charSequence2, z12);
                            break;
                    }
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View view;
        u6 u6Var;
        org.telegram.ui.ActionBar.h6 h6Var;
        FrameLayout j5Var;
        int i10 = this.d;
        Context context = this.e;
        org.telegram.ui.ActionBar.g2 g2Var = this.f;
        switch (i10) {
            case 0:
                x6 x6Var = (x6) g2Var;
                if (i7 != 0) {
                    switch (i7) {
                        case 2:
                            org.telegram.ui.Components.tw0 tw0Var = new org.telegram.ui.Components.tw0(context);
                            Paint paint = new Paint(1);
                            tw0Var.a = paint;
                            Paint paint2 = new Paint(1);
                            Paint paint3 = new Paint(1);
                            tw0Var.b = paint3;
                            Paint paint4 = new Paint(1);
                            tw0Var.c = paint4;
                            tw0Var.d = new Paint();
                            org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n(org.telegram.messenger.ls.x3, org.telegram.messenger.ls.e4);
                            tw0Var.M = nVar;
                            tw0Var.setWillNotDraw(false);
                            nVar.k = false;
                            paint.setStrokeWidth(org.telegram.messenger.g0.L(6.0f));
                            paint2.setStrokeWidth(org.telegram.messenger.g0.L(6.0f));
                            paint3.setStrokeWidth(org.telegram.messenger.g0.L(6.0f));
                            paint4.setStrokeWidth(org.telegram.messenger.g0.L(6.0f));
                            Paint.Cap cap = Paint.Cap.ROUND;
                            paint.setStrokeCap(cap);
                            paint2.setStrokeCap(cap);
                            paint3.setStrokeCap(cap);
                            paint4.setStrokeCap(cap);
                            bi.m3 m3Var = new bi.m3(29, context, tw0Var);
                            tw0Var.f = m3Var;
                            tw0Var.addView(m3Var, c8.ma.c(-2.0f, -1));
                            LinearLayout linearLayout = new LinearLayout(context);
                            linearLayout.setOrientation(1);
                            tw0Var.addView(linearLayout, c8.ma.c(-2.0f, -1));
                            bi.t2 t2Var = new bi.t2(context, 23);
                            linearLayout.addView(t2Var, c8.ma.k(21.0f, 40.0f, 21.0f, 16.0f, -1, -2));
                            TextView textView = new TextView(context);
                            tw0Var.w = textView;
                            int i11 = org.telegram.ui.ActionBar.m6.y6;
                            org.telegram.ui.ActionBar.t6.U(textView, i11, null);
                            String N0 = org.telegram.messenger.hd.N0(2131752631, "CalculatingSize");
                            int indexOf = N0.indexOf("...");
                            if (indexOf >= 0) {
                                SpannableString spannableString = new SpannableString(N0);
                                ab.q qVar = new ab.q(textView);
                                tw0Var.J = qVar;
                                qVar.F(spannableString, indexOf);
                                textView.setText(spannableString);
                            } else {
                                textView.setText(N0);
                            }
                            TextView textView2 = new TextView(context);
                            tw0Var.h = textView2;
                            textView2.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
                            org.telegram.ui.ActionBar.t6.U(textView2, i11, null);
                            TextView textView3 = new TextView(context);
                            tw0Var.n = textView3;
                            textView3.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
                            org.telegram.ui.ActionBar.t6.U(textView3, i11, null);
                            TextView textView4 = new TextView(context);
                            tw0Var.r = textView4;
                            textView4.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
                            org.telegram.ui.ActionBar.t6.U(textView4, i11, null);
                            TextView textView5 = new TextView(context);
                            tw0Var.s = textView5;
                            textView5.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
                            org.telegram.ui.ActionBar.t6.U(textView5, i11, null);
                            tw0Var.y = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Mj, false);
                            textView2.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.m6.L(org.telegram.messenger.g0.L(10.0f), tw0Var.y), (Drawable) null, (Drawable) null, (Drawable) null);
                            textView2.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
                            textView4.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.m6.L(org.telegram.messenger.g0.L(10.0f), i0.a.o(tw0Var.y, 64)), (Drawable) null, (Drawable) null, (Drawable) null);
                            textView4.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
                            textView5.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.m6.L(org.telegram.messenger.g0.L(10.0f), i0.a.o(tw0Var.y, org.telegram.messenger.ls.L1)), (Drawable) null, (Drawable) null, (Drawable) null);
                            textView5.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
                            textView3.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.m6.L(org.telegram.messenger.g0.L(10.0f), tw0Var.y), (Drawable) null, (Drawable) null, (Drawable) null);
                            textView3.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
                            t2Var.addView(textView, c8.ma.c(-2.0f, -2));
                            t2Var.addView(textView3, c8.ma.c(-2.0f, -2));
                            t2Var.addView(textView2, c8.ma.c(-2.0f, -2));
                            t2Var.addView(textView5, c8.ma.c(-2.0f, -2));
                            t2Var.addView(textView4, c8.ma.c(-2.0f, -2));
                            View view2 = new View(tw0Var.getContext());
                            tw0Var.x = view2;
                            linearLayout.addView(view2, c8.ma.t(-1, -2, 0, 21, 0, 0, 0));
                            view2.getLayoutParams().height = 1;
                            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d7, view2, null);
                            org.telegram.ui.Cells.x9 x9Var = new org.telegram.ui.Cells.x9(tw0Var.getContext());
                            tw0Var.E = x9Var;
                            linearLayout.addView(x9Var, c8.ma.o(-1, -2));
                            view = tw0Var;
                            break;
                        case 3:
                            view = new org.telegram.ui.Cells.o4(context);
                            break;
                        case 4:
                            org.telegram.ui.Components.hu0 hu0Var = new org.telegram.ui.Components.hu0(context, null);
                            hu0Var.setCallback(new org.telegram.messenger.fd(20));
                            int i12 = org.telegram.messenger.cz.G;
                            hu0Var.b(i12 == 3 ? 0 : i12 + 1, null, org.telegram.messenger.hd.G(3, "Days", new Object[0]), org.telegram.messenger.hd.G(1, "Weeks", new Object[0]), org.telegram.messenger.hd.G(1, "Months", new Object[0]), org.telegram.messenger.hd.N0(2131748866, null));
                            view = hu0Var;
                            break;
                        case 5:
                            view = new w6(x6Var.getParentActivity(), x6Var.getResourceProvider());
                            break;
                        case 6:
                            org.telegram.ui.Components.yz yzVar = new org.telegram.ui.Components.yz(x6Var.getParentActivity(), null);
                            yzVar.setIsSingleCell(true);
                            yzVar.setItemsCount(3);
                            yzVar.setIgnoreHeightCheck(true);
                            yzVar.setViewType(25);
                            view = yzVar;
                            break;
                        case 7:
                            view = new org.telegram.ui.Cells.n8(context);
                            break;
                        case 8:
                            org.telegram.ui.Components.tt0 tt0Var = x6Var.c0;
                            tt0Var.getClass();
                            View m3Var2 = new bi.m3(26, context, tt0Var);
                            m3Var2.setTag(-33024);
                            m3Var2.setLayoutParams(new v4.q0(-1, -1));
                            view = m3Var2;
                            break;
                        case 9:
                            u6 u6Var2 = new u6(this, context);
                            x6Var.X = u6Var2;
                            u6Var2.setTag(-33024);
                            u6Var = u6Var2;
                            view = u6Var;
                            break;
                        case 10:
                            k6 k6Var = new k6(x6Var, context);
                            x6Var.Y = k6Var;
                            k6Var.setTag(-33024);
                            u6Var = k6Var;
                            view = u6Var;
                            break;
                        case 11:
                            view = new org.telegram.ui.Cells.d2(this.e, 4, 21, false, x6Var.getResourceProvider());
                            break;
                        case 12:
                            org.telegram.ui.Components.yz yzVar2 = new org.telegram.ui.Components.yz(x6Var.getParentActivity(), null);
                            yzVar2.setIsSingleCell(true);
                            yzVar2.setItemsCount(1);
                            yzVar2.setIgnoreHeightCheck(true);
                            yzVar2.setViewType(26);
                            view = yzVar2;
                            break;
                        case 13:
                            p6 p6Var = new p6(x6Var, context);
                            x6Var.Z = p6Var;
                            view = p6Var;
                            break;
                        case 14:
                            org.telegram.ui.Components.hu0 hu0Var2 = new org.telegram.ui.Components.hu0(context, null);
                            float f10 = ((int) ((x6Var.I / 1024) / 1024)) / 1000.0f;
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
                            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                                if (((Integer) arrayList.get(i13)).intValue() == 1) {
                                    strArr[i13] = "300 MB";
                                } else if (((Integer) arrayList.get(i13)).intValue() == Integer.MAX_VALUE) {
                                    strArr[i13] = org.telegram.messenger.hd.N0(2131748009, null);
                                } else {
                                    strArr[i13] = String.format("%d GB", arrayList.get(i13));
                                }
                            }
                            hu0Var2.setCallback(new w0(arrayList, 10));
                            int indexOf2 = arrayList.indexOf(Integer.valueOf(org.telegram.messenger.cz.q().getInt("cache_limit", ConnectionsManager.DEFAULT_DATACENTER_ID)));
                            if (indexOf2 < 0) {
                                indexOf2 = arrayList.size() - 1;
                            }
                            hu0Var2.b(indexOf2, null, strArr);
                            view = hu0Var2;
                            break;
                        default:
                            view = new org.telegram.ui.Cells.a9(context);
                            break;
                    }
                } else {
                    view = new org.telegram.ui.Cells.x9(context);
                }
                return new org.telegram.ui.Components.mj0(view);
            default:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) g2Var;
                switch (i7) {
                    case 0:
                        j5Var = new org.telegram.ui.Cells.o4(context);
                        break;
                    case 1:
                        j5Var = new org.telegram.ui.Cells.s8(context);
                        break;
                    case 2:
                        j5Var = new org.telegram.ui.Cells.ra(context, 6, 0, false);
                        break;
                    case 3:
                        j5Var = new org.telegram.ui.Cells.u8(context, null);
                        break;
                    case 4:
                        j5Var = new org.telegram.ui.Cells.a9(context);
                        break;
                    case 5:
                        j5Var = new org.telegram.ui.Cells.x9(context);
                        break;
                    case 6:
                        h6Var = ((org.telegram.ui.ActionBar.g2) notificationsCustomSettingsActivity).resourceProvider;
                        j5Var = new org.telegram.ui.Cells.j5(this.e, 21, 64, true, h6Var);
                        break;
                    case 7:
                    default:
                        j5Var = new org.telegram.ui.Cells.n8(context);
                        break;
                    case 8:
                        ph0 ph0Var = new ph0(context);
                        ImageView imageView = new ImageView(context);
                        ph0Var.a0 = imageView;
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        org.telegram.ui.ActionBar.t6.s(imageView, org.telegram.ui.ActionBar.m6.v6, notificationsCustomSettingsActivity.getResourceProvider(), PorterDuff.Mode.SRC_IN);
                        imageView.setImageResource(R.drawable.msg_expand);
                        ph0Var.addView(imageView, c8.ma.d(24, 24.0f, (org.telegram.messenger.hd.a0 ? 3 : 5) | 16, 17.0f, 0.0f, 17.0f, 0.0f));
                        j5Var = ph0Var;
                        break;
                }
                return new org.telegram.ui.Components.mj0(j5Var);
        }
    }

    @Override // v4.i0
    public void y(v4.f1 f1Var) {
        boolean B;
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.d) {
            case 1:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.f;
                ArrayList arrayList3 = notificationsCustomSettingsActivity.J;
                int i7 = notificationsCustomSettingsActivity.s;
                if (i7 == 3 || ((arrayList2 = notificationsCustomSettingsActivity.x) != null && arrayList2.isEmpty())) {
                    if (i7 == 3) {
                        Boolean bool = notificationsCustomSettingsActivity.n;
                        B = bool == null || bool.booleanValue() || !((arrayList = notificationsCustomSettingsActivity.x) == null || arrayList.isEmpty());
                    } else {
                        B = notificationsCustomSettingsActivity.getNotificationsController().B(i7);
                    }
                    int b10 = f1Var.b();
                    View view = f1Var.a;
                    qh0 qh0Var = (b10 < 0 || b10 >= arrayList3.size()) ? null : (qh0) arrayList3.get(b10);
                    if (qh0Var == null || qh0Var.c != 102) {
                        int i10 = f1Var.f;
                        if (i10 == 0) {
                            ((org.telegram.ui.Cells.o4) view).a(null, B);
                            break;
                        } else if (i10 == 1) {
                            ((org.telegram.ui.Cells.s8) view).e(null, B);
                            break;
                        } else if (i10 == 3) {
                            ((org.telegram.ui.Cells.u8) view).a(null, B);
                            break;
                        } else if (i10 == 5) {
                            ((org.telegram.ui.Cells.x9) view).a(null, B);
                            break;
                        }
                    }
                }
                break;
        }
    }
}
