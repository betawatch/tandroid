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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class w6 extends rg.b {
    public final /* synthetic */ int d;
    public final Context e;
    public final /* synthetic */ org.telegram.ui.ActionBar.g2 f;

    public /* synthetic */ w6(int i7, Context context, org.telegram.ui.ActionBar.g2 g2Var) {
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
                y6 y6Var = (y6) this.f;
                return b10 == y6Var.K || ((i7 = f1Var.f) == 2 && y6Var.H > 0 && !y6Var.L) || i7 == 5 || i7 == 7 || i7 == 11;
            default:
                int i10 = f1Var.f;
                return (i10 == 0 || i10 == 4) ? false : true;
        }
    }

    @Override // v4.i0
    public final int b() {
        switch (this.d) {
            case 0:
                return ((y6) this.f).g0.size();
            default:
                return ((NotificationsCustomSettingsActivity) this.f).J.size();
        }
    }

    @Override // v4.i0
    public final int d(int i7) {
        switch (this.d) {
            case 0:
                return ((u6) ((y6) this.f).g0.get(i7)).a;
            default:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.f;
                if (i7 < 0 || i7 >= notificationsCustomSettingsActivity.J.size()) {
                    return 5;
                }
                return ((oh0) notificationsCustomSettingsActivity.J.get(i7)).a;
        }
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        int i10;
        org.telegram.ui.Cells.m8 m8Var;
        int i11 = this.d;
        org.telegram.ui.ActionBar.g2 g2Var = this.f;
        switch (i11) {
            case 0:
                y6 y6Var = (y6) g2Var;
                ArrayList arrayList = y6Var.g0;
                u6 u6Var = (u6) arrayList.get(i7);
                int i12 = f1Var.f;
                View view = f1Var.a;
                if (i12 == 0) {
                    org.telegram.ui.Cells.w9 w9Var = (org.telegram.ui.Cells.w9) view;
                    if (i7 == y6Var.K) {
                        w9Var.c(org.telegram.messenger.gd.N0(2131748241, null), null, false, false);
                        break;
                    }
                } else if (i12 == 1) {
                    ((org.telegram.ui.Cells.z8) view).setText(org.telegram.messenger.g0.W2(u6Var.e));
                    break;
                } else if (i12 == 2) {
                    final org.telegram.ui.Components.sw0 sw0Var = (org.telegram.ui.Components.sw0) view;
                    boolean z10 = y6Var.L;
                    long j3 = y6Var.e;
                    long j10 = y6Var.H;
                    long j11 = y6Var.J;
                    long j12 = y6Var.I;
                    ab.q qVar = sw0Var.J;
                    View view2 = sw0Var.x;
                    TextView textView = sw0Var.n;
                    TextView textView2 = sw0Var.h;
                    TextView textView3 = sw0Var.w;
                    org.telegram.ui.Cells.w9 w9Var2 = sw0Var.E;
                    sw0Var.e = z10;
                    TextView textView4 = sw0Var.r;
                    textView4.setText(org.telegram.messenger.gd.a0("TotalDeviceFreeSize", null, 2131743726, org.telegram.messenger.g0.i0(j11, false, false)));
                    TextView textView5 = sw0Var.s;
                    long j13 = j12 - j11;
                    textView5.setText(org.telegram.messenger.gd.a0("TotalDeviceSize", null, 2131743725, org.telegram.messenger.g0.i0(j13, false, false)));
                    if (z10) {
                        textView3.setVisibility(0);
                        textView2.setVisibility(8);
                        textView4.setVisibility(8);
                        textView5.setVisibility(8);
                        textView.setVisibility(8);
                        view2.setVisibility(8);
                        w9Var2.setVisibility(8);
                        sw0Var.F = 0.0f;
                        sw0Var.G = 0.0f;
                        if (qVar != null) {
                            qVar.c(textView3);
                        }
                    } else {
                        if (qVar != null) {
                            qVar.z(textView3);
                        }
                        textView3.setVisibility(8);
                        if (j10 > 0) {
                            i10 = 0;
                            view2.setVisibility(0);
                            w9Var2.setVisibility(0);
                            textView2.setVisibility(0);
                            textView.setVisibility(8);
                            w9Var2.c(org.telegram.messenger.gd.N0(2131752035, null), org.telegram.messenger.g0.i0(j10, false, false), false, true);
                            textView2.setText(org.telegram.messenger.gd.a0("TelegramCacheSize", null, 2131744001, org.telegram.messenger.g0.i0(j10 + j3, false, false)));
                        } else {
                            i10 = 0;
                            textView2.setVisibility(8);
                            textView.setVisibility(0);
                            textView.setText(org.telegram.messenger.gd.a0("LocalDatabaseSize", null, 2131748576, org.telegram.messenger.g0.i0(j3, false, false)));
                            view2.setVisibility(8);
                            w9Var2.setVisibility(8);
                        }
                        textView4.setVisibility(i10);
                        textView5.setVisibility(i10);
                        float f10 = j10 + j3;
                        float f11 = j12;
                        float f12 = f10 / f11;
                        float f13 = j13 / f11;
                        if (sw0Var.F != f12) {
                            ValueAnimator valueAnimator = sw0Var.H;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            final int i13 = 0;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(sw0Var.F, f12);
                            sw0Var.H = ofFloat;
                            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.rw0
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                    switch (i13) {
                                        case 0:
                                            sw0 sw0Var2 = sw0Var;
                                            sw0Var2.getClass();
                                            sw0Var2.F = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                            sw0Var2.invalidate();
                                            break;
                                        default:
                                            sw0 sw0Var3 = sw0Var;
                                            sw0Var3.getClass();
                                            sw0Var3.G = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                            sw0Var3.invalidate();
                                            break;
                                    }
                                }
                            });
                            sw0Var.H.start();
                        }
                        if (sw0Var.G != f13) {
                            ValueAnimator valueAnimator2 = sw0Var.I;
                            if (valueAnimator2 != null) {
                                valueAnimator2.cancel();
                            }
                            final int i14 = 1;
                            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(sw0Var.G, f13);
                            sw0Var.I = ofFloat2;
                            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.rw0
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                                    switch (i14) {
                                        case 0:
                                            sw0 sw0Var2 = sw0Var;
                                            sw0Var2.getClass();
                                            sw0Var2.F = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                            sw0Var2.invalidate();
                                            break;
                                        default:
                                            sw0 sw0Var3 = sw0Var;
                                            sw0Var3.getClass();
                                            sw0Var3.G = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                            sw0Var3.invalidate();
                                            break;
                                    }
                                }
                            });
                            sw0Var.I.start();
                        }
                    }
                    org.telegram.ui.ActionBar.u6.U(w9Var2.getTextView(), org.telegram.ui.ActionBar.n6.G6, null);
                    sw0Var.requestLayout();
                    break;
                } else if (i12 == 3) {
                    org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) view;
                    o4Var.setText(((u6) arrayList.get(i7)).d);
                    ((u6) arrayList.get(i7)).getClass();
                    o4Var.setTopMargin(15);
                    ((u6) arrayList.get(i7)).getClass();
                    o4Var.setBottomMargin(0);
                    break;
                } else if (i12 == 7) {
                    org.telegram.ui.Cells.m8 m8Var2 = (org.telegram.ui.Cells.m8) view;
                    org.telegram.messenger.v2 v2Var = y6Var.getMessagesController().u7;
                    int i15 = u6Var.c;
                    int size = v2Var.d(((u6) arrayList.get(i7)).c).size();
                    String G = size > 0 ? org.telegram.messenger.gd.G(size, "ExceptionShort", Integer.valueOf(size)) : null;
                    String f14 = org.telegram.messenger.v2.f(v2Var.c(i15));
                    if (((u6) arrayList.get(i7)).c == 0) {
                        m8Var = m8Var2;
                        m8Var.r(org.telegram.messenger.gd.N0(2131746559, null), f14, true, R.drawable.msg_filled_menu_users, -11565578, -13276952, true);
                    } else {
                        m8Var = m8Var2;
                        if (((u6) arrayList.get(i7)).c == 1) {
                            m8Var.r(org.telegram.messenger.gd.N0(2131749264, null), f14, true, R.drawable.msg_filled_menu_groups, -11154873, -14175180, true);
                        } else if (((u6) arrayList.get(i7)).c == 2) {
                            m8Var.r(org.telegram.messenger.gd.N0(2131752638, null), f14, true, R.drawable.msg_filled_menu_channels, -1007845, -1996271, true);
                        } else if (((u6) arrayList.get(i7)).c == 3) {
                            m8Var.r(org.telegram.messenger.gd.N0(2131752634, null), f14, false, R.drawable.msg_filled_stories, -765355, -2148011, false);
                        }
                    }
                    m8Var.setSubtitle(G);
                    break;
                } else {
                    switch (i12) {
                        case 9:
                            y6Var.y0();
                            break;
                        case 10:
                            l6 l6Var = y6Var.Y;
                            if (l6Var != null && !y6Var.L) {
                                long j14 = y6Var.H;
                                boolean z11 = j14 > 0;
                                long j15 = y6Var.I;
                                l6Var.b(j15 <= 0 ? 0.0f : j14 / j15, (y6Var.J <= 0 || j15 <= 0) ? 0.0f : (j15 - r6) / j15, z11);
                                break;
                            }
                            break;
                        case 11:
                            org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) view;
                            int i16 = u6Var.f;
                            boolean t02 = i16 < 0 ? y6Var.t0() : y6Var.d[i16];
                            CharSequence charSequence = u6Var.d;
                            int[] iArr = y6Var.V;
                            int i17 = u6Var.f;
                            if (i17 < 0) {
                                i17 = 9;
                            }
                            int i18 = iArr[i17];
                            SpannableString spannableString = new SpannableString(i18 <= 0 ? String.format("<%.1f%%", Float.valueOf(1.0f)) : String.format("%d%%", Integer.valueOf(i18)));
                            spannableString.setSpan(new RelativeSizeSpan(0.834f), 0, spannableString.length(), 33);
                            spannableString.setSpan(new org.telegram.ui.Components.k41(org.telegram.messenger.g0.o()), 0, spannableString.length(), 33);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                            spannableStringBuilder.append((CharSequence) "  ");
                            spannableStringBuilder.append((CharSequence) spannableString);
                            d2Var.e(spannableStringBuilder, org.telegram.messenger.g0.i0(u6Var.g, false, false), t02, u6Var.f >= 0 ? !u6Var.j : !y6Var.M, false);
                            int i19 = u6Var.h;
                            int i20 = org.telegram.ui.ActionBar.n6.k7;
                            org.telegram.ui.Components.lp lpVar = d2Var.r;
                            if (lpVar != null) {
                                lpVar.b(i19, i19, i20);
                            }
                            d2Var.setCollapsed(u6Var.f < 0 ? Boolean.valueOf(y6Var.M) : null);
                            if (u6Var.f == -1) {
                                int i21 = 6;
                                d2Var.d(new a(this, i21), new oi.i1(i21, this, d2Var));
                            } else {
                                d2Var.d(null, null);
                            }
                            d2Var.setPad(u6Var.i ? 1 : 0);
                            break;
                    }
                }
                break;
            default:
                ArrayList arrayList2 = ((NotificationsCustomSettingsActivity) g2Var).J;
                if (i7 >= 0 && i7 < arrayList2.size()) {
                    oh0 oh0Var = (oh0) arrayList2.get(i7);
                    int i22 = i7 + 1;
                    boolean z12 = i22 < arrayList2.size() && ((oh0) arrayList2.get(i22)).a != 4;
                    int i23 = f1Var.f;
                    View view3 = f1Var.a;
                    switch (i23) {
                        case 0:
                            ((org.telegram.ui.Cells.o4) view3).setText(oh0Var.e);
                            break;
                        case 1:
                            ((org.telegram.ui.Cells.r8) view3).f("" + ((Object) oh0Var.e), oh0Var.i, z12);
                            break;
                        case 2:
                            ((org.telegram.ui.Cells.sa) view3).f(oh0Var.g, null, z12);
                            break;
                        case 3:
                            ((org.telegram.ui.Cells.t8) view3).b(oh0Var.h, "" + ((Object) oh0Var.e), z12);
                            break;
                        case 4:
                            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view3;
                            if (oh0Var.e != null) {
                                z8Var.setFixedSize(0);
                                z8Var.setText(oh0Var.e);
                                break;
                            } else {
                                z8Var.setFixedSize(12);
                                z8Var.setText(null);
                                break;
                            }
                        case 5:
                            ((org.telegram.ui.Cells.w9) view3).c(oh0Var.e, oh0Var.f, false, z12);
                            break;
                        case 6:
                            org.telegram.ui.Cells.i5 i5Var = (org.telegram.ui.Cells.i5) view3;
                            i5Var.setDrawLine(true);
                            i5Var.setChecked(oh0Var.i);
                            i5Var.b(oh0Var.e, oh0Var.f, oh0Var.d, oh0Var.i, 0, false, z12, true);
                            break;
                        case 7:
                            org.telegram.ui.Cells.m8 m8Var3 = (org.telegram.ui.Cells.m8) view3;
                            if (oh0Var.d != 0) {
                                m8Var3.g(org.telegram.ui.ActionBar.n6.v6, org.telegram.ui.ActionBar.n6.u6);
                                m8Var3.o(oh0Var.d, "" + ((Object) oh0Var.e), z12);
                                break;
                            } else {
                                m8Var3.g(-1, org.telegram.ui.ActionBar.n6.p7);
                                m8Var3.k("" + ((Object) oh0Var.e), z12);
                                break;
                            }
                        case 8:
                            nh0 nh0Var = (nh0) view3;
                            nh0Var.g(org.telegram.ui.ActionBar.n6.v6, org.telegram.ui.ActionBar.n6.u6);
                            CharSequence charSequence2 = oh0Var.e;
                            org.telegram.messenger.m10.o(nh0Var.a0.animate().rotation(oh0Var.d == 1 ? 0.0f : 180.0f), org.telegram.ui.Components.kr.h, 340L);
                            nh0Var.k(charSequence2, z12);
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
        v6 v6Var;
        org.telegram.ui.ActionBar.i6 i6Var;
        FrameLayout i5Var;
        int i10 = this.d;
        Context context = this.e;
        org.telegram.ui.ActionBar.g2 g2Var = this.f;
        switch (i10) {
            case 0:
                y6 y6Var = (y6) g2Var;
                if (i7 != 0) {
                    switch (i7) {
                        case 2:
                            org.telegram.ui.Components.sw0 sw0Var = new org.telegram.ui.Components.sw0(context);
                            Paint paint = new Paint(1);
                            sw0Var.a = paint;
                            Paint paint2 = new Paint(1);
                            Paint paint3 = new Paint(1);
                            sw0Var.b = paint3;
                            Paint paint4 = new Paint(1);
                            sw0Var.c = paint4;
                            sw0Var.d = new Paint();
                            org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n(org.telegram.messenger.ks.x3, org.telegram.messenger.ks.e4);
                            sw0Var.M = nVar;
                            sw0Var.setWillNotDraw(false);
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
                            bi.o3 o3Var = new bi.o3(29, context, sw0Var);
                            sw0Var.f = o3Var;
                            sw0Var.addView(o3Var, c8.na.c(-2.0f, -1));
                            LinearLayout linearLayout = new LinearLayout(context);
                            linearLayout.setOrientation(1);
                            sw0Var.addView(linearLayout, c8.na.c(-2.0f, -1));
                            bi.v2 v2Var = new bi.v2(context, 23);
                            linearLayout.addView(v2Var, c8.na.k(21.0f, 40.0f, 21.0f, 16.0f, -1, -2));
                            TextView textView = new TextView(context);
                            sw0Var.w = textView;
                            int i11 = org.telegram.ui.ActionBar.n6.y6;
                            org.telegram.ui.ActionBar.u6.U(textView, i11, null);
                            String N0 = org.telegram.messenger.gd.N0(2131752631, "CalculatingSize");
                            int indexOf = N0.indexOf("...");
                            if (indexOf >= 0) {
                                SpannableString spannableString = new SpannableString(N0);
                                ab.q qVar = new ab.q(textView);
                                sw0Var.J = qVar;
                                qVar.F(spannableString, indexOf);
                                textView.setText(spannableString);
                            } else {
                                textView.setText(N0);
                            }
                            TextView textView2 = new TextView(context);
                            sw0Var.h = textView2;
                            textView2.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
                            org.telegram.ui.ActionBar.u6.U(textView2, i11, null);
                            TextView textView3 = new TextView(context);
                            sw0Var.n = textView3;
                            textView3.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
                            org.telegram.ui.ActionBar.u6.U(textView3, i11, null);
                            TextView textView4 = new TextView(context);
                            sw0Var.r = textView4;
                            textView4.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
                            org.telegram.ui.ActionBar.u6.U(textView4, i11, null);
                            TextView textView5 = new TextView(context);
                            sw0Var.s = textView5;
                            textView5.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
                            org.telegram.ui.ActionBar.u6.U(textView5, i11, null);
                            sw0Var.y = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Mj, false);
                            textView2.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.n6.L(org.telegram.messenger.g0.L(10.0f), sw0Var.y), (Drawable) null, (Drawable) null, (Drawable) null);
                            textView2.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
                            textView4.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.n6.L(org.telegram.messenger.g0.L(10.0f), i0.a.o(sw0Var.y, 64)), (Drawable) null, (Drawable) null, (Drawable) null);
                            textView4.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
                            textView5.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.n6.L(org.telegram.messenger.g0.L(10.0f), i0.a.o(sw0Var.y, org.telegram.messenger.ks.L1)), (Drawable) null, (Drawable) null, (Drawable) null);
                            textView5.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
                            textView3.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.n6.L(org.telegram.messenger.g0.L(10.0f), sw0Var.y), (Drawable) null, (Drawable) null, (Drawable) null);
                            textView3.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
                            v2Var.addView(textView, c8.na.c(-2.0f, -2));
                            v2Var.addView(textView3, c8.na.c(-2.0f, -2));
                            v2Var.addView(textView2, c8.na.c(-2.0f, -2));
                            v2Var.addView(textView5, c8.na.c(-2.0f, -2));
                            v2Var.addView(textView4, c8.na.c(-2.0f, -2));
                            View view2 = new View(sw0Var.getContext());
                            sw0Var.x = view2;
                            linearLayout.addView(view2, c8.na.t(-1, -2, 0, 21, 0, 0, 0));
                            view2.getLayoutParams().height = 1;
                            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d7, view2, null);
                            org.telegram.ui.Cells.w9 w9Var = new org.telegram.ui.Cells.w9(sw0Var.getContext());
                            sw0Var.E = w9Var;
                            linearLayout.addView(w9Var, c8.na.o(-1, -2));
                            view = sw0Var;
                            break;
                        case 3:
                            view = new org.telegram.ui.Cells.o4(context);
                            break;
                        case 4:
                            org.telegram.ui.Components.gu0 gu0Var = new org.telegram.ui.Components.gu0(context, null);
                            gu0Var.setCallback(new org.telegram.messenger.ed(20));
                            int i12 = org.telegram.messenger.bz.G;
                            gu0Var.b(i12 == 3 ? 0 : i12 + 1, null, org.telegram.messenger.gd.G(3, "Days", new Object[0]), org.telegram.messenger.gd.G(1, "Weeks", new Object[0]), org.telegram.messenger.gd.G(1, "Months", new Object[0]), org.telegram.messenger.gd.N0(2131748866, null));
                            view = gu0Var;
                            break;
                        case 5:
                            view = new x6(y6Var.getParentActivity(), y6Var.getResourceProvider());
                            break;
                        case 6:
                            org.telegram.ui.Components.vz vzVar = new org.telegram.ui.Components.vz(y6Var.getParentActivity(), null);
                            vzVar.setIsSingleCell(true);
                            vzVar.setItemsCount(3);
                            vzVar.setIgnoreHeightCheck(true);
                            vzVar.setViewType(25);
                            view = vzVar;
                            break;
                        case 7:
                            view = new org.telegram.ui.Cells.m8(context);
                            break;
                        case 8:
                            org.telegram.ui.Components.st0 st0Var = y6Var.c0;
                            st0Var.getClass();
                            View o3Var2 = new bi.o3(26, context, st0Var);
                            o3Var2.setTag(-33024);
                            o3Var2.setLayoutParams(new v4.q0(-1, -1));
                            view = o3Var2;
                            break;
                        case 9:
                            v6 v6Var2 = new v6(this, context);
                            y6Var.X = v6Var2;
                            v6Var2.setTag(-33024);
                            v6Var = v6Var2;
                            view = v6Var;
                            break;
                        case 10:
                            l6 l6Var = new l6(y6Var, context);
                            y6Var.Y = l6Var;
                            l6Var.setTag(-33024);
                            v6Var = l6Var;
                            view = v6Var;
                            break;
                        case 11:
                            view = new org.telegram.ui.Cells.d2(this.e, 4, 21, false, y6Var.getResourceProvider());
                            break;
                        case 12:
                            org.telegram.ui.Components.vz vzVar2 = new org.telegram.ui.Components.vz(y6Var.getParentActivity(), null);
                            vzVar2.setIsSingleCell(true);
                            vzVar2.setItemsCount(1);
                            vzVar2.setIgnoreHeightCheck(true);
                            vzVar2.setViewType(26);
                            view = vzVar2;
                            break;
                        case 13:
                            q6 q6Var = new q6(y6Var, context);
                            y6Var.Z = q6Var;
                            view = q6Var;
                            break;
                        case 14:
                            org.telegram.ui.Components.gu0 gu0Var2 = new org.telegram.ui.Components.gu0(context, null);
                            float f10 = ((int) ((y6Var.I / 1024) / 1024)) / 1000.0f;
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
                                    strArr[i13] = org.telegram.messenger.gd.N0(2131748009, null);
                                } else {
                                    strArr[i13] = String.format("%d GB", arrayList.get(i13));
                                }
                            }
                            gu0Var2.setCallback(new w0(arrayList, 10));
                            int indexOf2 = arrayList.indexOf(Integer.valueOf(org.telegram.messenger.bz.q().getInt("cache_limit", ConnectionsManager.DEFAULT_DATACENTER_ID)));
                            if (indexOf2 < 0) {
                                indexOf2 = arrayList.size() - 1;
                            }
                            gu0Var2.b(indexOf2, null, strArr);
                            view = gu0Var2;
                            break;
                        default:
                            view = new org.telegram.ui.Cells.z8(context);
                            break;
                    }
                } else {
                    view = new org.telegram.ui.Cells.w9(context);
                }
                return new org.telegram.ui.Components.mj0(view);
            default:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) g2Var;
                switch (i7) {
                    case 0:
                        i5Var = new org.telegram.ui.Cells.o4(context);
                        break;
                    case 1:
                        i5Var = new org.telegram.ui.Cells.r8(context);
                        break;
                    case 2:
                        i5Var = new org.telegram.ui.Cells.sa(context, 6, 0, false);
                        break;
                    case 3:
                        i5Var = new org.telegram.ui.Cells.t8(context, null);
                        break;
                    case 4:
                        i5Var = new org.telegram.ui.Cells.z8(context);
                        break;
                    case 5:
                        i5Var = new org.telegram.ui.Cells.w9(context);
                        break;
                    case 6:
                        i6Var = ((org.telegram.ui.ActionBar.g2) notificationsCustomSettingsActivity).resourceProvider;
                        i5Var = new org.telegram.ui.Cells.i5(this.e, 21, 64, true, i6Var);
                        break;
                    case 7:
                    default:
                        i5Var = new org.telegram.ui.Cells.m8(context);
                        break;
                    case 8:
                        nh0 nh0Var = new nh0(context);
                        ImageView imageView = new ImageView(context);
                        nh0Var.a0 = imageView;
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        org.telegram.ui.ActionBar.u6.s(imageView, org.telegram.ui.ActionBar.n6.v6, notificationsCustomSettingsActivity.getResourceProvider(), PorterDuff.Mode.SRC_IN);
                        imageView.setImageResource(R.drawable.msg_expand);
                        nh0Var.addView(imageView, c8.na.d(24, 24.0f, (org.telegram.messenger.gd.a0 ? 3 : 5) | 16, 17.0f, 0.0f, 17.0f, 0.0f));
                        i5Var = nh0Var;
                        break;
                }
                return new org.telegram.ui.Components.mj0(i5Var);
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
                    oh0 oh0Var = (b10 < 0 || b10 >= arrayList3.size()) ? null : (oh0) arrayList3.get(b10);
                    if (oh0Var == null || oh0Var.c != 102) {
                        int i10 = f1Var.f;
                        if (i10 == 0) {
                            ((org.telegram.ui.Cells.o4) view).a(null, B);
                            break;
                        } else if (i10 == 1) {
                            ((org.telegram.ui.Cells.r8) view).e(null, B);
                            break;
                        } else if (i10 == 3) {
                            ((org.telegram.ui.Cells.t8) view).a(null, B);
                            break;
                        } else if (i10 == 5) {
                            ((org.telegram.ui.Cells.w9) view).a(null, B);
                            break;
                        }
                    }
                }
                break;
        }
    }
}
