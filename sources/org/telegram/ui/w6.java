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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class w6 extends hg.c {
    public final /* synthetic */ int d;
    public final Context e;
    public final /* synthetic */ org.telegram.ui.ActionBar.k2 f;

    public /* synthetic */ w6(int i10, Context context, org.telegram.ui.ActionBar.k2 k2Var) {
        this.d = i10;
        this.f = k2Var;
        this.e = context;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        int i10;
        switch (this.d) {
            case 0:
                long b10 = c1Var.b();
                y6 y6Var = (y6) this.f;
                return b10 == y6Var.J || ((i10 = c1Var.f) == 2 && y6Var.G > 0 && !y6Var.K) || i10 == 5 || i10 == 7 || i10 == 11;
            default:
                int i11 = c1Var.f;
                return (i11 == 0 || i11 == 4) ? false : true;
        }
    }

    @Override // s4.g0
    public final int b() {
        switch (this.d) {
            case 0:
                return ((y6) this.f).f0.size();
            default:
                return ((NotificationsCustomSettingsActivity) this.f).I.size();
        }
    }

    @Override // s4.g0
    public final int d(int i10) {
        switch (this.d) {
            case 0:
                return ((u6) ((y6) this.f).f0.get(i10)).a;
            default:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.f;
                if (i10 < 0 || i10 >= notificationsCustomSettingsActivity.I.size()) {
                    return 5;
                }
                return ((qi0) notificationsCustomSettingsActivity.I.get(i10)).a;
        }
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        int i11;
        org.telegram.ui.Cells.p8 p8Var;
        int i12 = this.d;
        org.telegram.ui.ActionBar.k2 k2Var = this.f;
        switch (i12) {
            case 0:
                y6 y6Var = (y6) k2Var;
                ArrayList arrayList = y6Var.f0;
                u6 u6Var = (u6) arrayList.get(i10);
                int i13 = c1Var.f;
                View view = c1Var.a;
                if (i13 == 0) {
                    org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) view;
                    if (i10 == y6Var.J) {
                        x9Var.c(org.telegram.messenger.cd.L0(2131748449, null), null, false, false);
                        break;
                    }
                } else if (i13 == 1) {
                    ((org.telegram.ui.Cells.b9) view).setText(org.telegram.messenger.i0.W2(u6Var.e));
                    break;
                } else if (i13 == 2) {
                    final org.telegram.ui.Components.lx0 lx0Var = (org.telegram.ui.Components.lx0) view;
                    boolean z10 = y6Var.K;
                    long j10 = y6Var.e;
                    long j11 = y6Var.G;
                    long j12 = y6Var.I;
                    long j13 = y6Var.H;
                    ac.a aVar = lx0Var.I;
                    View view2 = lx0Var.x;
                    TextView textView = lx0Var.n;
                    TextView textView2 = lx0Var.h;
                    TextView textView3 = lx0Var.w;
                    org.telegram.ui.Cells.x9 x9Var2 = lx0Var.D;
                    lx0Var.e = z10;
                    TextView textView4 = lx0Var.r;
                    textView4.setText(org.telegram.messenger.cd.a0("TotalDeviceFreeSize", null, 2131743998, org.telegram.messenger.i0.i0(j12, false, false)));
                    TextView textView5 = lx0Var.s;
                    long j14 = j13 - j12;
                    textView5.setText(org.telegram.messenger.cd.a0("TotalDeviceSize", null, 2131743997, org.telegram.messenger.i0.i0(j14, false, false)));
                    if (z10) {
                        textView3.setVisibility(0);
                        textView2.setVisibility(8);
                        textView4.setVisibility(8);
                        textView5.setVisibility(8);
                        textView.setVisibility(8);
                        view2.setVisibility(8);
                        x9Var2.setVisibility(8);
                        lx0Var.E = 0.0f;
                        lx0Var.F = 0.0f;
                        if (aVar != null) {
                            aVar.c(textView3);
                        }
                    } else {
                        if (aVar != null) {
                            aVar.w(textView3);
                        }
                        textView3.setVisibility(8);
                        if (j11 > 0) {
                            i11 = 0;
                            view2.setVisibility(0);
                            x9Var2.setVisibility(0);
                            textView2.setVisibility(0);
                            textView.setVisibility(8);
                            x9Var2.c(org.telegram.messenger.cd.L0(2131752047, null), org.telegram.messenger.i0.i0(j11, false, false), false, true);
                            textView2.setText(org.telegram.messenger.cd.a0("TelegramCacheSize", null, 2131744271, org.telegram.messenger.i0.i0(j11 + j10, false, false)));
                        } else {
                            i11 = 0;
                            textView2.setVisibility(8);
                            textView.setVisibility(0);
                            textView.setText(org.telegram.messenger.cd.a0("LocalDatabaseSize", null, 2131748779, org.telegram.messenger.i0.i0(j10, false, false)));
                            view2.setVisibility(8);
                            x9Var2.setVisibility(8);
                        }
                        textView4.setVisibility(i11);
                        textView5.setVisibility(i11);
                        float f7 = j11 + j10;
                        float f10 = j13;
                        float f11 = f7 / f10;
                        float f12 = j14 / f10;
                        if (lx0Var.E != f11) {
                            ValueAnimator valueAnimator = lx0Var.G;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            final int i14 = 0;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(lx0Var.E, f11);
                            lx0Var.G = ofFloat;
                            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.kx0
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                    switch (i14) {
                                        case 0:
                                            lx0 lx0Var2 = lx0Var;
                                            lx0Var2.getClass();
                                            lx0Var2.E = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                            lx0Var2.invalidate();
                                            break;
                                        default:
                                            lx0 lx0Var3 = lx0Var;
                                            lx0Var3.getClass();
                                            lx0Var3.F = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                            lx0Var3.invalidate();
                                            break;
                                    }
                                }
                            });
                            lx0Var.G.start();
                        }
                        if (lx0Var.F != f12) {
                            ValueAnimator valueAnimator2 = lx0Var.H;
                            if (valueAnimator2 != null) {
                                valueAnimator2.cancel();
                            }
                            final int i15 = 1;
                            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(lx0Var.F, f12);
                            lx0Var.H = ofFloat2;
                            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.kx0
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                                    switch (i15) {
                                        case 0:
                                            lx0 lx0Var2 = lx0Var;
                                            lx0Var2.getClass();
                                            lx0Var2.E = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                            lx0Var2.invalidate();
                                            break;
                                        default:
                                            lx0 lx0Var3 = lx0Var;
                                            lx0Var3.getClass();
                                            lx0Var3.F = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                            lx0Var3.invalidate();
                                            break;
                                    }
                                }
                            });
                            lx0Var.H.start();
                        }
                    }
                    org.telegram.ui.ActionBar.a7.V(x9Var2.getTextView(), org.telegram.ui.ActionBar.t6.G6, null);
                    lx0Var.requestLayout();
                    break;
                } else if (i13 == 3) {
                    org.telegram.ui.Cells.p4 p4Var = (org.telegram.ui.Cells.p4) view;
                    p4Var.setText(((u6) arrayList.get(i10)).d);
                    ((u6) arrayList.get(i10)).getClass();
                    p4Var.setTopMargin(15);
                    ((u6) arrayList.get(i10)).getClass();
                    p4Var.setBottomMargin(0);
                    break;
                } else if (i13 == 7) {
                    org.telegram.ui.Cells.p8 p8Var2 = (org.telegram.ui.Cells.p8) view;
                    org.telegram.messenger.y2 y2Var = y6Var.getMessagesController().s7;
                    int i16 = u6Var.c;
                    int size = y2Var.d(((u6) arrayList.get(i10)).c).size();
                    String G = size > 0 ? org.telegram.messenger.cd.G(size, "ExceptionShort", Integer.valueOf(size)) : null;
                    String f13 = org.telegram.messenger.y2.f(y2Var.c(i16));
                    if (((u6) arrayList.get(i10)).c == 0) {
                        p8Var = p8Var2;
                        p8Var.r(org.telegram.messenger.cd.L0(2131746768, null), f13, true, R.drawable.msg_filled_menu_users, -11565578, -13276952, true);
                    } else {
                        p8Var = p8Var2;
                        if (((u6) arrayList.get(i10)).c == 1) {
                            p8Var.r(org.telegram.messenger.cd.L0(2131749466, null), f13, true, R.drawable.msg_filled_menu_groups, -11154873, -14175180, true);
                        } else if (((u6) arrayList.get(i10)).c == 2) {
                            p8Var.r(org.telegram.messenger.cd.L0(2131752650, null), f13, true, R.drawable.msg_filled_menu_channels, -1007845, -1996271, true);
                        } else if (((u6) arrayList.get(i10)).c == 3) {
                            p8Var.r(org.telegram.messenger.cd.L0(2131752646, null), f13, false, R.drawable.msg_filled_stories, -765355, -2148011, false);
                        }
                    }
                    p8Var.setSubtitle(G);
                    break;
                } else {
                    switch (i13) {
                        case 9:
                            y6Var.x0();
                            break;
                        case 10:
                            l6 l6Var = y6Var.X;
                            if (l6Var != null && !y6Var.K) {
                                long j15 = y6Var.G;
                                boolean z11 = j15 > 0;
                                long j16 = y6Var.H;
                                l6Var.b(j16 <= 0 ? 0.0f : j15 / j16, (y6Var.I <= 0 || j16 <= 0) ? 0.0f : (j16 - r6) / j16, z11);
                                break;
                            }
                            break;
                        case 11:
                            org.telegram.ui.Cells.c2 c2Var = (org.telegram.ui.Cells.c2) view;
                            int i17 = u6Var.f;
                            boolean s02 = i17 < 0 ? y6Var.s0() : y6Var.d[i17];
                            CharSequence charSequence = u6Var.d;
                            int[] iArr = y6Var.U;
                            int i18 = u6Var.f;
                            if (i18 < 0) {
                                i18 = 9;
                            }
                            int i19 = iArr[i18];
                            SpannableString spannableString = new SpannableString(i19 <= 0 ? String.format("<%.1f%%", Float.valueOf(1.0f)) : String.format("%d%%", Integer.valueOf(i19)));
                            spannableString.setSpan(new RelativeSizeSpan(0.834f), 0, spannableString.length(), 33);
                            spannableString.setSpan(new org.telegram.ui.Components.x41(org.telegram.messenger.i0.o()), 0, spannableString.length(), 33);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                            spannableStringBuilder.append((CharSequence) "  ");
                            spannableStringBuilder.append((CharSequence) spannableString);
                            c2Var.e(spannableStringBuilder, org.telegram.messenger.i0.i0(u6Var.g, false, false), s02, u6Var.f >= 0 ? !u6Var.j : !y6Var.L, false);
                            int i20 = u6Var.h;
                            int i21 = org.telegram.ui.ActionBar.t6.k7;
                            org.telegram.ui.Components.ep epVar = c2Var.r;
                            if (epVar != null) {
                                epVar.b(i20, i20, i21);
                            }
                            c2Var.setCollapsed(u6Var.f < 0 ? Boolean.valueOf(y6Var.L) : null);
                            if (u6Var.f == -1) {
                                c2Var.d(new a(this, 6), new ag.t0(26, this, c2Var));
                            } else {
                                c2Var.d(null, null);
                            }
                            c2Var.setPad(u6Var.i ? 1 : 0);
                            break;
                    }
                }
                break;
            default:
                ArrayList arrayList2 = ((NotificationsCustomSettingsActivity) k2Var).I;
                if (i10 >= 0 && i10 < arrayList2.size()) {
                    qi0 qi0Var = (qi0) arrayList2.get(i10);
                    int i22 = i10 + 1;
                    boolean z12 = i22 < arrayList2.size() && ((qi0) arrayList2.get(i22)).a != 4;
                    int i23 = c1Var.f;
                    View view3 = c1Var.a;
                    switch (i23) {
                        case 0:
                            ((org.telegram.ui.Cells.p4) view3).setText(qi0Var.e);
                            break;
                        case 1:
                            ((org.telegram.ui.Cells.t8) view3).f("" + ((Object) qi0Var.e), qi0Var.i, z12);
                            break;
                        case 2:
                            ((org.telegram.ui.Cells.pa) view3).f(qi0Var.g, null, z12);
                            break;
                        case 3:
                            ((org.telegram.ui.Cells.v8) view3).b(qi0Var.h, "" + ((Object) qi0Var.e), z12);
                            break;
                        case 4:
                            org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view3;
                            if (qi0Var.e != null) {
                                b9Var.setFixedSize(0);
                                b9Var.setText(qi0Var.e);
                                break;
                            } else {
                                b9Var.setFixedSize(12);
                                b9Var.setText(null);
                                break;
                            }
                        case 5:
                            ((org.telegram.ui.Cells.x9) view3).c(qi0Var.e, qi0Var.f, false, z12);
                            break;
                        case 6:
                            org.telegram.ui.Cells.l5 l5Var = (org.telegram.ui.Cells.l5) view3;
                            l5Var.setDrawLine(true);
                            l5Var.setChecked(qi0Var.i);
                            l5Var.b(qi0Var.e, qi0Var.f, qi0Var.d, qi0Var.i, 0, false, z12, true);
                            break;
                        case 7:
                            org.telegram.ui.Cells.p8 p8Var3 = (org.telegram.ui.Cells.p8) view3;
                            if (qi0Var.d != 0) {
                                p8Var3.g(org.telegram.ui.ActionBar.t6.v6, org.telegram.ui.ActionBar.t6.u6);
                                p8Var3.o(qi0Var.d, "" + ((Object) qi0Var.e), z12);
                                break;
                            } else {
                                p8Var3.g(-1, org.telegram.ui.ActionBar.t6.p7);
                                p8Var3.k("" + ((Object) qi0Var.e), z12);
                                break;
                            }
                        case 8:
                            pi0 pi0Var = (pi0) view3;
                            pi0Var.g(org.telegram.ui.ActionBar.t6.v6, org.telegram.ui.ActionBar.t6.u6);
                            CharSequence charSequence2 = qi0Var.e;
                            org.telegram.messenger.z20.m(pi0Var.W.animate().rotation(qi0Var.d == 1 ? 0.0f : 180.0f), org.telegram.ui.Components.gr.h, 340L);
                            pi0Var.k(charSequence2, z12);
                            break;
                    }
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View view;
        View t0Var;
        v6 v6Var;
        org.telegram.ui.ActionBar.p6 p6Var;
        FrameLayout l5Var;
        int i11 = this.d;
        Context context = this.e;
        org.telegram.ui.ActionBar.k2 k2Var = this.f;
        switch (i11) {
            case 0:
                y6 y6Var = (y6) k2Var;
                if (i10 != 0) {
                    switch (i10) {
                        case 2:
                            org.telegram.ui.Components.lx0 lx0Var = new org.telegram.ui.Components.lx0(context);
                            Paint paint = new Paint(1);
                            lx0Var.a = paint;
                            Paint paint2 = new Paint(1);
                            Paint paint3 = new Paint(1);
                            lx0Var.b = paint3;
                            Paint paint4 = new Paint(1);
                            lx0Var.c = paint4;
                            lx0Var.d = new Paint();
                            org.telegram.ui.Components.voip.g gVar = new org.telegram.ui.Components.voip.g(org.telegram.messenger.zs.x3, org.telegram.messenger.zs.e4);
                            lx0Var.L = gVar;
                            lx0Var.setWillNotDraw(false);
                            gVar.k = false;
                            paint.setStrokeWidth(org.telegram.messenger.i0.L(6.0f));
                            paint2.setStrokeWidth(org.telegram.messenger.i0.L(6.0f));
                            paint3.setStrokeWidth(org.telegram.messenger.i0.L(6.0f));
                            paint4.setStrokeWidth(org.telegram.messenger.i0.L(6.0f));
                            Paint.Cap cap = Paint.Cap.ROUND;
                            paint.setStrokeCap(cap);
                            paint2.setStrokeCap(cap);
                            paint3.setStrokeCap(cap);
                            paint4.setStrokeCap(cap);
                            bi.t0 t0Var2 = new bi.t0(lx0Var, context, 23);
                            lx0Var.f = t0Var2;
                            lx0Var.addView(t0Var2, w7.b6.c(-2.0f, -1));
                            LinearLayout linearLayout = new LinearLayout(context);
                            linearLayout.setOrientation(1);
                            lx0Var.addView(linearLayout, w7.b6.c(-2.0f, -1));
                            org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(context, 25);
                            linearLayout.addView(a5Var, w7.b6.k(21.0f, 40.0f, 21.0f, 16.0f, -1, -2));
                            TextView textView = new TextView(context);
                            lx0Var.w = textView;
                            int i12 = org.telegram.ui.ActionBar.t6.y6;
                            org.telegram.ui.ActionBar.a7.V(textView, i12, null);
                            String L0 = org.telegram.messenger.cd.L0(2131752643, "CalculatingSize");
                            int indexOf = L0.indexOf("...");
                            if (indexOf >= 0) {
                                SpannableString spannableString = new SpannableString(L0);
                                ac.a aVar = new ac.a(textView);
                                lx0Var.I = aVar;
                                aVar.D(spannableString, indexOf);
                                textView.setText(spannableString);
                            } else {
                                textView.setText(L0);
                            }
                            TextView textView2 = new TextView(context);
                            lx0Var.h = textView2;
                            textView2.setCompoundDrawablePadding(org.telegram.messenger.i0.L(6.0f));
                            org.telegram.ui.ActionBar.a7.V(textView2, i12, null);
                            TextView textView3 = new TextView(context);
                            lx0Var.n = textView3;
                            textView3.setCompoundDrawablePadding(org.telegram.messenger.i0.L(6.0f));
                            org.telegram.ui.ActionBar.a7.V(textView3, i12, null);
                            TextView textView4 = new TextView(context);
                            lx0Var.r = textView4;
                            textView4.setCompoundDrawablePadding(org.telegram.messenger.i0.L(6.0f));
                            org.telegram.ui.ActionBar.a7.V(textView4, i12, null);
                            TextView textView5 = new TextView(context);
                            lx0Var.s = textView5;
                            textView5.setCompoundDrawablePadding(org.telegram.messenger.i0.L(6.0f));
                            org.telegram.ui.ActionBar.a7.V(textView5, i12, null);
                            lx0Var.y = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Jj, false);
                            textView2.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.t6.L(org.telegram.messenger.i0.L(10.0f), lx0Var.y), (Drawable) null, (Drawable) null, (Drawable) null);
                            textView2.setCompoundDrawablePadding(org.telegram.messenger.i0.L(6.0f));
                            textView4.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.t6.L(org.telegram.messenger.i0.L(10.0f), i0.b.o(lx0Var.y, 64)), (Drawable) null, (Drawable) null, (Drawable) null);
                            textView4.setCompoundDrawablePadding(org.telegram.messenger.i0.L(6.0f));
                            textView5.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.t6.L(org.telegram.messenger.i0.L(10.0f), i0.b.o(lx0Var.y, org.telegram.messenger.zs.L1)), (Drawable) null, (Drawable) null, (Drawable) null);
                            textView5.setCompoundDrawablePadding(org.telegram.messenger.i0.L(6.0f));
                            textView3.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.t6.L(org.telegram.messenger.i0.L(10.0f), lx0Var.y), (Drawable) null, (Drawable) null, (Drawable) null);
                            textView3.setCompoundDrawablePadding(org.telegram.messenger.i0.L(6.0f));
                            a5Var.addView(textView, w7.b6.c(-2.0f, -2));
                            a5Var.addView(textView3, w7.b6.c(-2.0f, -2));
                            a5Var.addView(textView2, w7.b6.c(-2.0f, -2));
                            a5Var.addView(textView5, w7.b6.c(-2.0f, -2));
                            a5Var.addView(textView4, w7.b6.c(-2.0f, -2));
                            View view2 = new View(lx0Var.getContext());
                            lx0Var.x = view2;
                            linearLayout.addView(view2, w7.b6.t(-1, -2, 0, 21, 0, 0, 0));
                            view2.getLayoutParams().height = 1;
                            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d7, view2, null);
                            org.telegram.ui.Cells.x9 x9Var = new org.telegram.ui.Cells.x9(lx0Var.getContext());
                            lx0Var.D = x9Var;
                            linearLayout.addView(x9Var, w7.b6.o(-1, -2));
                            view = lx0Var;
                            break;
                        case 3:
                            view = new org.telegram.ui.Cells.p4(context);
                            break;
                        case 4:
                            org.telegram.ui.Components.yu0 yu0Var = new org.telegram.ui.Components.yu0(context, null);
                            yu0Var.setCallback(new org.telegram.messenger.e9(29));
                            int i13 = org.telegram.messenger.tz.G;
                            yu0Var.b(i13 == 3 ? 0 : i13 + 1, null, org.telegram.messenger.cd.G(3, "Days", new Object[0]), org.telegram.messenger.cd.G(1, "Weeks", new Object[0]), org.telegram.messenger.cd.G(1, "Months", new Object[0]), org.telegram.messenger.cd.L0(2131749069, null));
                            view = yu0Var;
                            break;
                        case 5:
                            view = new x6(y6Var.getParentActivity(), y6Var.getResourceProvider());
                            break;
                        case 6:
                            org.telegram.ui.Components.zz zzVar = new org.telegram.ui.Components.zz(y6Var.getParentActivity(), null);
                            zzVar.setIsSingleCell(true);
                            zzVar.setItemsCount(3);
                            zzVar.setIgnoreHeightCheck(true);
                            zzVar.setViewType(25);
                            view = zzVar;
                            break;
                        case 7:
                            view = new org.telegram.ui.Cells.p8(context);
                            break;
                        case 8:
                            org.telegram.ui.Components.ku0 ku0Var = y6Var.b0;
                            ku0Var.getClass();
                            t0Var = new bi.t0(ku0Var, context, 20);
                            t0Var.setTag(-33024);
                            t0Var.setLayoutParams(new s4.o0(-1, -1));
                            view = t0Var;
                            break;
                        case 9:
                            v6 v6Var2 = new v6(this, context);
                            y6Var.W = v6Var2;
                            v6Var2.setTag(-33024);
                            v6Var = v6Var2;
                            view = v6Var;
                            break;
                        case 10:
                            l6 l6Var = new l6(y6Var, context);
                            y6Var.X = l6Var;
                            l6Var.setTag(-33024);
                            v6Var = l6Var;
                            view = v6Var;
                            break;
                        case 11:
                            t0Var = new org.telegram.ui.Cells.c2(4, 21, this.e, y6Var.getResourceProvider(), false);
                            view = t0Var;
                            break;
                        case 12:
                            org.telegram.ui.Components.zz zzVar2 = new org.telegram.ui.Components.zz(y6Var.getParentActivity(), null);
                            zzVar2.setIsSingleCell(true);
                            zzVar2.setItemsCount(1);
                            zzVar2.setIgnoreHeightCheck(true);
                            zzVar2.setViewType(26);
                            view = zzVar2;
                            break;
                        case 13:
                            q6 q6Var = new q6(y6Var, context);
                            y6Var.Y = q6Var;
                            view = q6Var;
                            break;
                        case 14:
                            org.telegram.ui.Components.yu0 yu0Var2 = new org.telegram.ui.Components.yu0(context, null);
                            float f7 = ((int) ((y6Var.H / 1024) / 1024)) / 1000.0f;
                            ArrayList arrayList = new ArrayList();
                            if (f7 <= 17.0f) {
                                arrayList.add(2);
                            }
                            if (f7 > 5.0f) {
                                arrayList.add(5);
                            }
                            if (f7 > 16.0f) {
                                arrayList.add(16);
                            }
                            if (f7 > 32.0f) {
                                arrayList.add(32);
                            }
                            arrayList.add(Integer.valueOf(ConnectionsManager.DEFAULT_DATACENTER_ID));
                            String[] strArr = new String[arrayList.size()];
                            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                                if (((Integer) arrayList.get(i14)).intValue() == 1) {
                                    strArr[i14] = "300 MB";
                                } else if (((Integer) arrayList.get(i14)).intValue() == Integer.MAX_VALUE) {
                                    strArr[i14] = org.telegram.messenger.cd.L0(2131748219, null);
                                } else {
                                    strArr[i14] = String.format("%d GB", arrayList.get(i14));
                                }
                            }
                            yu0Var2.setCallback(new y0(arrayList, 10));
                            int indexOf2 = arrayList.indexOf(Integer.valueOf(org.telegram.messenger.tz.q().getInt("cache_limit", ConnectionsManager.DEFAULT_DATACENTER_ID)));
                            if (indexOf2 < 0) {
                                indexOf2 = arrayList.size() - 1;
                            }
                            yu0Var2.b(indexOf2, null, strArr);
                            view = yu0Var2;
                            break;
                        default:
                            view = new org.telegram.ui.Cells.b9(context);
                            break;
                    }
                } else {
                    view = new org.telegram.ui.Cells.x9(context);
                }
                return new org.telegram.ui.Components.ck0(view);
            default:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) k2Var;
                switch (i10) {
                    case 0:
                        l5Var = new org.telegram.ui.Cells.p4(context);
                        break;
                    case 1:
                        l5Var = new org.telegram.ui.Cells.t8(context);
                        break;
                    case 2:
                        l5Var = new org.telegram.ui.Cells.pa(context, 6, 0, false);
                        break;
                    case 3:
                        l5Var = new org.telegram.ui.Cells.v8(context, null);
                        break;
                    case 4:
                        l5Var = new org.telegram.ui.Cells.b9(context);
                        break;
                    case 5:
                        l5Var = new org.telegram.ui.Cells.x9(context);
                        break;
                    case 6:
                        p6Var = ((org.telegram.ui.ActionBar.k2) notificationsCustomSettingsActivity).resourceProvider;
                        l5Var = new org.telegram.ui.Cells.l5(21, 64, this.e, p6Var, true);
                        break;
                    case 7:
                    default:
                        l5Var = new org.telegram.ui.Cells.p8(context);
                        break;
                    case 8:
                        pi0 pi0Var = new pi0(context);
                        ImageView imageView = new ImageView(context);
                        pi0Var.W = imageView;
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        org.telegram.ui.ActionBar.a7.t(imageView, org.telegram.ui.ActionBar.t6.v6, notificationsCustomSettingsActivity.getResourceProvider(), PorterDuff.Mode.SRC_IN);
                        imageView.setImageResource(R.drawable.msg_expand);
                        pi0Var.addView(imageView, w7.b6.d(24, 24.0f, (org.telegram.messenger.cd.X ? 3 : 5) | 16, 17.0f, 0.0f, 17.0f, 0.0f));
                        l5Var = pi0Var;
                        break;
                }
                return new org.telegram.ui.Components.ck0(l5Var);
        }
    }

    @Override // s4.g0
    public void y(s4.c1 c1Var) {
        boolean B;
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.d) {
            case 1:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.f;
                ArrayList arrayList3 = notificationsCustomSettingsActivity.I;
                int i10 = notificationsCustomSettingsActivity.s;
                if (i10 == 3 || ((arrayList2 = notificationsCustomSettingsActivity.x) != null && arrayList2.isEmpty())) {
                    if (i10 == 3) {
                        Boolean bool = notificationsCustomSettingsActivity.n;
                        B = bool == null || bool.booleanValue() || !((arrayList = notificationsCustomSettingsActivity.x) == null || arrayList.isEmpty());
                    } else {
                        B = notificationsCustomSettingsActivity.getNotificationsController().B(i10);
                    }
                    int b10 = c1Var.b();
                    View view = c1Var.a;
                    qi0 qi0Var = (b10 < 0 || b10 >= arrayList3.size()) ? null : (qi0) arrayList3.get(b10);
                    if (qi0Var == null || qi0Var.c != 102) {
                        int i11 = c1Var.f;
                        if (i11 == 0) {
                            ((org.telegram.ui.Cells.p4) view).a(null, B);
                            break;
                        } else if (i11 == 1) {
                            ((org.telegram.ui.Cells.t8) view).e(null, B);
                            break;
                        } else if (i11 == 3) {
                            ((org.telegram.ui.Cells.v8) view).a(null, B);
                            break;
                        } else if (i11 == 5) {
                            ((org.telegram.ui.Cells.x9) view).a(null, B);
                            break;
                        }
                    }
                }
                break;
        }
    }
}
