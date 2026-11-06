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

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class w6 extends rg.b {
    public final /* synthetic */ int d;
    public final Context e;
    public final /* synthetic */ org.telegram.ui.ActionBar.f2 f;

    public /* synthetic */ w6(int i7, Context context, org.telegram.ui.ActionBar.f2 f2Var) {
        this.d = i7;
        this.f = f2Var;
        this.e = context;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        int i7;
        switch (this.d) {
            case 0:
                long b10 = d1Var.b();
                y6 y6Var = (y6) this.f;
                return b10 == y6Var.J || ((i7 = d1Var.f) == 2 && y6Var.G > 0 && !y6Var.K) || i7 == 5 || i7 == 7 || i7 == 11;
            default:
                int i10 = d1Var.f;
                return (i10 == 0 || i10 == 4) ? false : true;
        }
    }

    @Override // v4.g0
    public final int b() {
        switch (this.d) {
            case 0:
                return ((y6) this.f).f0.size();
            default:
                return ((NotificationsCustomSettingsActivity) this.f).I.size();
        }
    }

    @Override // v4.g0
    public final int d(int i7) {
        switch (this.d) {
            case 0:
                return ((u6) ((y6) this.f).f0.get(i7)).a;
            default:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.f;
                if (i7 < 0 || i7 >= notificationsCustomSettingsActivity.I.size()) {
                    return 5;
                }
                return ((kh0) notificationsCustomSettingsActivity.I.get(i7)).a;
        }
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        int i10;
        long j3;
        org.telegram.ui.Cells.m8 m8Var;
        int i11 = this.d;
        int i12 = 4;
        org.telegram.ui.ActionBar.f2 f2Var = this.f;
        switch (i11) {
            case 0:
                y6 y6Var = (y6) f2Var;
                ArrayList arrayList = y6Var.f0;
                u6 u6Var = (u6) arrayList.get(i7);
                int i13 = d1Var.f;
                View view = d1Var.a;
                if (i13 == 0) {
                    org.telegram.ui.Cells.w9 w9Var = (org.telegram.ui.Cells.w9) view;
                    if (i7 == y6Var.J) {
                        w9Var.c(org.telegram.messenger.hd.M0(2131748433, null), null, false, false);
                        break;
                    }
                } else if (i13 == 1) {
                    ((org.telegram.ui.Cells.z8) view).setText(org.telegram.messenger.g0.X2(u6Var.e));
                    break;
                } else if (i13 == 2) {
                    final org.telegram.ui.Components.hw0 hw0Var = (org.telegram.ui.Components.hw0) view;
                    boolean z9 = y6Var.K;
                    long j10 = y6Var.e;
                    long j11 = y6Var.G;
                    long j12 = y6Var.I;
                    long j13 = y6Var.H;
                    ab.q qVar = hw0Var.I;
                    View view2 = hw0Var.x;
                    TextView textView = hw0Var.n;
                    TextView textView2 = hw0Var.h;
                    TextView textView3 = hw0Var.w;
                    org.telegram.ui.Cells.w9 w9Var2 = hw0Var.D;
                    hw0Var.e = z9;
                    TextView textView4 = hw0Var.r;
                    textView4.setText(org.telegram.messenger.hd.a0("TotalDeviceFreeSize", null, 2131743974, org.telegram.messenger.g0.i0(j12, false, false)));
                    TextView textView5 = hw0Var.s;
                    long j14 = j13 - j12;
                    textView5.setText(org.telegram.messenger.hd.a0("TotalDeviceSize", null, 2131743973, org.telegram.messenger.g0.i0(j14, false, false)));
                    if (z9) {
                        textView3.setVisibility(0);
                        textView2.setVisibility(8);
                        textView4.setVisibility(8);
                        textView5.setVisibility(8);
                        textView.setVisibility(8);
                        view2.setVisibility(8);
                        w9Var2.setVisibility(8);
                        hw0Var.E = 0.0f;
                        hw0Var.F = 0.0f;
                        if (qVar != null) {
                            qVar.c(textView3);
                        }
                    } else {
                        if (qVar != null) {
                            qVar.x(textView3);
                        }
                        textView3.setVisibility(8);
                        if (j11 > 0) {
                            i10 = 0;
                            view2.setVisibility(0);
                            w9Var2.setVisibility(0);
                            textView2.setVisibility(0);
                            textView.setVisibility(8);
                            w9Var2.c(org.telegram.messenger.hd.M0(2131752047, null), org.telegram.messenger.g0.i0(j11, false, false), false, true);
                            textView2.setText(org.telegram.messenger.hd.a0("TelegramCacheSize", null, 2131744247, org.telegram.messenger.g0.i0(j11 + j10, false, false)));
                            j3 = j10;
                        } else {
                            i10 = 0;
                            textView2.setVisibility(8);
                            textView.setVisibility(0);
                            j3 = j10;
                            textView.setText(org.telegram.messenger.hd.a0("LocalDatabaseSize", null, 2131748768, org.telegram.messenger.g0.i0(j3, false, false)));
                            view2.setVisibility(8);
                            w9Var2.setVisibility(8);
                        }
                        textView4.setVisibility(i10);
                        textView5.setVisibility(i10);
                        float f10 = j13;
                        float f11 = (j11 + j3) / f10;
                        float f12 = j14 / f10;
                        if (hw0Var.E != f11) {
                            ValueAnimator valueAnimator = hw0Var.G;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            final int i14 = 0;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(hw0Var.E, f11);
                            hw0Var.G = ofFloat;
                            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.gw0
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                    switch (i14) {
                                        case 0:
                                            hw0 hw0Var2 = hw0Var;
                                            hw0Var2.getClass();
                                            hw0Var2.E = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                            hw0Var2.invalidate();
                                            break;
                                        default:
                                            hw0 hw0Var3 = hw0Var;
                                            hw0Var3.getClass();
                                            hw0Var3.F = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                            hw0Var3.invalidate();
                                            break;
                                    }
                                }
                            });
                            hw0Var.G.start();
                        }
                        if (hw0Var.F != f12) {
                            ValueAnimator valueAnimator2 = hw0Var.H;
                            if (valueAnimator2 != null) {
                                valueAnimator2.cancel();
                            }
                            final int i15 = 1;
                            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(hw0Var.F, f12);
                            hw0Var.H = ofFloat2;
                            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.gw0
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                                    switch (i15) {
                                        case 0:
                                            hw0 hw0Var2 = hw0Var;
                                            hw0Var2.getClass();
                                            hw0Var2.E = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                            hw0Var2.invalidate();
                                            break;
                                        default:
                                            hw0 hw0Var3 = hw0Var;
                                            hw0Var3.getClass();
                                            hw0Var3.F = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                            hw0Var3.invalidate();
                                            break;
                                    }
                                }
                            });
                            hw0Var.H.start();
                        }
                    }
                    org.telegram.ui.ActionBar.r6.V(w9Var2.getTextView(), org.telegram.ui.ActionBar.k6.G6, null);
                    hw0Var.requestLayout();
                    break;
                } else if (i13 == 3) {
                    org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                    n4Var.setText(((u6) arrayList.get(i7)).d);
                    ((u6) arrayList.get(i7)).getClass();
                    n4Var.setTopMargin(15);
                    ((u6) arrayList.get(i7)).getClass();
                    n4Var.setBottomMargin(0);
                    break;
                } else if (i13 == 7) {
                    org.telegram.ui.Cells.m8 m8Var2 = (org.telegram.ui.Cells.m8) view;
                    org.telegram.messenger.u2 u2Var = y6Var.getMessagesController().r7;
                    int i16 = u6Var.c;
                    int size = u2Var.d(((u6) arrayList.get(i7)).c).size();
                    String G = size > 0 ? org.telegram.messenger.hd.G(size, "ExceptionShort", Integer.valueOf(size)) : null;
                    String f13 = org.telegram.messenger.u2.f(u2Var.c(i16));
                    if (((u6) arrayList.get(i7)).c == 0) {
                        m8Var = m8Var2;
                        m8Var.r(org.telegram.messenger.hd.M0(2131746752, null), f13, true, R.drawable.msg_filled_menu_users, -11565578, -13276952, true);
                    } else {
                        m8Var = m8Var2;
                        if (((u6) arrayList.get(i7)).c == 1) {
                            m8Var.r(org.telegram.messenger.hd.M0(2131749456, null), f13, true, R.drawable.msg_filled_menu_groups, -11154873, -14175180, true);
                        } else if (((u6) arrayList.get(i7)).c == 2) {
                            m8Var.r(org.telegram.messenger.hd.M0(2131752650, null), f13, true, R.drawable.msg_filled_menu_channels, -1007845, -1996271, true);
                        } else if (((u6) arrayList.get(i7)).c == 3) {
                            m8Var.r(org.telegram.messenger.hd.M0(2131752646, null), f13, false, R.drawable.msg_filled_stories, -765355, -2148011, false);
                        }
                    }
                    m8Var.setSubtitle(G);
                    break;
                } else {
                    switch (i13) {
                        case 9:
                            y6Var.y0();
                            break;
                        case 10:
                            k6 k6Var = y6Var.X;
                            if (k6Var != null && !y6Var.K) {
                                long j15 = y6Var.G;
                                boolean z10 = j15 > 0;
                                long j16 = y6Var.H;
                                k6Var.b(j16 <= 0 ? 0.0f : j15 / j16, (y6Var.I <= 0 || j16 <= 0) ? 0.0f : (j16 - r6) / j16, z10);
                                break;
                            }
                            break;
                        case 11:
                            org.telegram.ui.Cells.c2 c2Var = (org.telegram.ui.Cells.c2) view;
                            int i17 = u6Var.f;
                            boolean t02 = i17 < 0 ? y6Var.t0() : y6Var.d[i17];
                            CharSequence charSequence = u6Var.d;
                            int[] iArr = y6Var.U;
                            int i18 = u6Var.f;
                            if (i18 < 0) {
                                i18 = 9;
                            }
                            int i19 = iArr[i18];
                            SpannableString spannableString = new SpannableString(i19 <= 0 ? String.format("<%.1f%%", Float.valueOf(1.0f)) : String.format("%d%%", Integer.valueOf(i19)));
                            spannableString.setSpan(new RelativeSizeSpan(0.834f), 0, spannableString.length(), 33);
                            spannableString.setSpan(new org.telegram.ui.Components.u31(org.telegram.messenger.g0.o()), 0, spannableString.length(), 33);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                            spannableStringBuilder.append((CharSequence) "  ");
                            spannableStringBuilder.append((CharSequence) spannableString);
                            c2Var.e(spannableStringBuilder, org.telegram.messenger.g0.i0(u6Var.g, false, false), t02, u6Var.f >= 0 ? !u6Var.j : !y6Var.L, false);
                            int i20 = u6Var.h;
                            int i21 = org.telegram.ui.ActionBar.k6.k7;
                            org.telegram.ui.Components.wo woVar = c2Var.r;
                            if (woVar != null) {
                                woVar.b(i20, i20, i21);
                            }
                            c2Var.setCollapsed(u6Var.f < 0 ? Boolean.valueOf(y6Var.L) : null);
                            if (u6Var.f == -1) {
                                c2Var.d(new a(this, 6), new org.telegram.ui.ActionBar.l1(i12, this, c2Var));
                            } else {
                                c2Var.d(null, null);
                            }
                            c2Var.setPad(u6Var.i ? 1 : 0);
                            break;
                    }
                }
                break;
            default:
                ArrayList arrayList2 = ((NotificationsCustomSettingsActivity) f2Var).I;
                if (i7 >= 0 && i7 < arrayList2.size()) {
                    kh0 kh0Var = (kh0) arrayList2.get(i7);
                    int i22 = i7 + 1;
                    boolean z11 = i22 < arrayList2.size() && ((kh0) arrayList2.get(i22)).a != 4;
                    int i23 = d1Var.f;
                    View view3 = d1Var.a;
                    switch (i23) {
                        case 0:
                            ((org.telegram.ui.Cells.n4) view3).setText(kh0Var.e);
                            break;
                        case 1:
                            ((org.telegram.ui.Cells.r8) view3).f("" + ((Object) kh0Var.e), kh0Var.i, z11);
                            break;
                        case 2:
                            ((org.telegram.ui.Cells.pa) view3).f(kh0Var.g, null, z11);
                            break;
                        case 3:
                            ((org.telegram.ui.Cells.t8) view3).b(kh0Var.h, "" + ((Object) kh0Var.e), z11);
                            break;
                        case 4:
                            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view3;
                            if (kh0Var.e != null) {
                                z8Var.setFixedSize(0);
                                z8Var.setText(kh0Var.e);
                                break;
                            } else {
                                z8Var.setFixedSize(12);
                                z8Var.setText(null);
                                break;
                            }
                        case 5:
                            ((org.telegram.ui.Cells.w9) view3).c(kh0Var.e, kh0Var.f, false, z11);
                            break;
                        case 6:
                            org.telegram.ui.Cells.h5 h5Var = (org.telegram.ui.Cells.h5) view3;
                            h5Var.setDrawLine(true);
                            h5Var.setChecked(kh0Var.i);
                            h5Var.b(kh0Var.e, kh0Var.f, kh0Var.d, kh0Var.i, 0, false, z11, true);
                            break;
                        case 7:
                            org.telegram.ui.Cells.m8 m8Var3 = (org.telegram.ui.Cells.m8) view3;
                            if (kh0Var.d != 0) {
                                m8Var3.g(org.telegram.ui.ActionBar.k6.v6, org.telegram.ui.ActionBar.k6.u6);
                                m8Var3.o(kh0Var.d, "" + ((Object) kh0Var.e), z11);
                                break;
                            } else {
                                m8Var3.g(-1, org.telegram.ui.ActionBar.k6.p7);
                                m8Var3.k("" + ((Object) kh0Var.e), z11);
                                break;
                            }
                        case 8:
                            jh0 jh0Var = (jh0) view3;
                            jh0Var.g(org.telegram.ui.ActionBar.k6.v6, org.telegram.ui.ActionBar.k6.u6);
                            CharSequence charSequence2 = kh0Var.e;
                            org.telegram.messenger.camera.q.l(jh0Var.W.animate().rotation(kh0Var.d == 1 ? 0.0f : 180.0f), org.telegram.ui.Components.xq.h, 340L);
                            jh0Var.k(charSequence2, z11);
                            break;
                    }
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View view;
        View ecVar;
        v6 v6Var;
        org.telegram.ui.ActionBar.f6 f6Var;
        FrameLayout h5Var;
        int i10 = this.d;
        Context context = this.e;
        org.telegram.ui.ActionBar.f2 f2Var = this.f;
        switch (i10) {
            case 0:
                y6 y6Var = (y6) f2Var;
                if (i7 != 0) {
                    switch (i7) {
                        case 2:
                            org.telegram.ui.Components.hw0 hw0Var = new org.telegram.ui.Components.hw0(context);
                            Paint paint = new Paint(1);
                            hw0Var.a = paint;
                            Paint paint2 = new Paint(1);
                            Paint paint3 = new Paint(1);
                            hw0Var.b = paint3;
                            Paint paint4 = new Paint(1);
                            hw0Var.c = paint4;
                            hw0Var.d = new Paint();
                            org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n(org.telegram.messenger.qs.x3, org.telegram.messenger.qs.e4);
                            hw0Var.L = nVar;
                            hw0Var.setWillNotDraw(false);
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
                            bi.ec ecVar2 = new bi.ec(28, context, hw0Var);
                            hw0Var.f = ecVar2;
                            hw0Var.addView(ecVar2, c8.ha.c(-2.0f, -1));
                            LinearLayout linearLayout = new LinearLayout(context);
                            linearLayout.setOrientation(1);
                            hw0Var.addView(linearLayout, c8.ha.c(-2.0f, -1));
                            di.a4 a4Var = new di.a4(context, 21);
                            linearLayout.addView(a4Var, c8.ha.k(21.0f, 40.0f, 21.0f, 16.0f, -1, -2));
                            TextView textView = new TextView(context);
                            hw0Var.w = textView;
                            int i11 = org.telegram.ui.ActionBar.k6.y6;
                            org.telegram.ui.ActionBar.r6.V(textView, i11, null);
                            String M0 = org.telegram.messenger.hd.M0(2131752643, "CalculatingSize");
                            int indexOf = M0.indexOf("...");
                            if (indexOf >= 0) {
                                SpannableString spannableString = new SpannableString(M0);
                                ab.q qVar = new ab.q(textView);
                                hw0Var.I = qVar;
                                qVar.E(spannableString, indexOf);
                                textView.setText(spannableString);
                            } else {
                                textView.setText(M0);
                            }
                            TextView textView2 = new TextView(context);
                            hw0Var.h = textView2;
                            textView2.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
                            org.telegram.ui.ActionBar.r6.V(textView2, i11, null);
                            TextView textView3 = new TextView(context);
                            hw0Var.n = textView3;
                            textView3.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
                            org.telegram.ui.ActionBar.r6.V(textView3, i11, null);
                            TextView textView4 = new TextView(context);
                            hw0Var.r = textView4;
                            textView4.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
                            org.telegram.ui.ActionBar.r6.V(textView4, i11, null);
                            TextView textView5 = new TextView(context);
                            hw0Var.s = textView5;
                            textView5.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
                            org.telegram.ui.ActionBar.r6.V(textView5, i11, null);
                            hw0Var.y = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Jj, false);
                            textView2.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.k6.L(org.telegram.messenger.g0.L(10.0f), hw0Var.y), (Drawable) null, (Drawable) null, (Drawable) null);
                            textView2.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
                            textView4.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.k6.L(org.telegram.messenger.g0.L(10.0f), i0.a.o(hw0Var.y, 64)), (Drawable) null, (Drawable) null, (Drawable) null);
                            textView4.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
                            textView5.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.k6.L(org.telegram.messenger.g0.L(10.0f), i0.a.o(hw0Var.y, org.telegram.messenger.qs.L1)), (Drawable) null, (Drawable) null, (Drawable) null);
                            textView5.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
                            textView3.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.k6.L(org.telegram.messenger.g0.L(10.0f), hw0Var.y), (Drawable) null, (Drawable) null, (Drawable) null);
                            textView3.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
                            a4Var.addView(textView, c8.ha.c(-2.0f, -2));
                            a4Var.addView(textView3, c8.ha.c(-2.0f, -2));
                            a4Var.addView(textView2, c8.ha.c(-2.0f, -2));
                            a4Var.addView(textView5, c8.ha.c(-2.0f, -2));
                            a4Var.addView(textView4, c8.ha.c(-2.0f, -2));
                            View view2 = new View(hw0Var.getContext());
                            hw0Var.x = view2;
                            linearLayout.addView(view2, c8.ha.t(-1, -2, 0, 21, 0, 0, 0));
                            view2.getLayoutParams().height = 1;
                            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d7, view2, null);
                            org.telegram.ui.Cells.w9 w9Var = new org.telegram.ui.Cells.w9(hw0Var.getContext());
                            hw0Var.D = w9Var;
                            linearLayout.addView(w9Var, c8.ha.o(-1, -2));
                            view = hw0Var;
                            break;
                        case 3:
                            view = new org.telegram.ui.Cells.n4(context);
                            break;
                        case 4:
                            org.telegram.ui.Components.vt0 vt0Var = new org.telegram.ui.Components.vt0(context, null);
                            vt0Var.setCallback(new org.telegram.messenger.ch(15));
                            int i12 = org.telegram.messenger.iz.G;
                            vt0Var.b(i12 == 3 ? 0 : i12 + 1, null, org.telegram.messenger.hd.G(3, "Days", new Object[0]), org.telegram.messenger.hd.G(1, "Weeks", new Object[0]), org.telegram.messenger.hd.G(1, "Months", new Object[0]), org.telegram.messenger.hd.M0(2131749058, null));
                            view = vt0Var;
                            break;
                        case 5:
                            view = new x6(y6Var.getParentActivity(), y6Var.getResourceProvider());
                            break;
                        case 6:
                            org.telegram.ui.Components.lz lzVar = new org.telegram.ui.Components.lz(y6Var.getParentActivity(), null);
                            lzVar.setIsSingleCell(true);
                            lzVar.setItemsCount(3);
                            lzVar.setIgnoreHeightCheck(true);
                            lzVar.setViewType(25);
                            view = lzVar;
                            break;
                        case 7:
                            view = new org.telegram.ui.Cells.m8(context);
                            break;
                        case 8:
                            org.telegram.ui.Components.ht0 ht0Var = y6Var.b0;
                            ht0Var.getClass();
                            ecVar = new bi.ec(25, context, ht0Var);
                            ecVar.setTag(-33024);
                            ecVar.setLayoutParams(new v4.o0(-1, -1));
                            view = ecVar;
                            break;
                        case 9:
                            v6 v6Var2 = new v6(this, context);
                            y6Var.W = v6Var2;
                            v6Var2.setTag(-33024);
                            v6Var = v6Var2;
                            view = v6Var;
                            break;
                        case 10:
                            k6 k6Var = new k6(y6Var, context);
                            y6Var.X = k6Var;
                            k6Var.setTag(-33024);
                            v6Var = k6Var;
                            view = v6Var;
                            break;
                        case 11:
                            ecVar = new org.telegram.ui.Cells.c2(this.e, 4, 21, false, y6Var.getResourceProvider());
                            view = ecVar;
                            break;
                        case 12:
                            org.telegram.ui.Components.lz lzVar2 = new org.telegram.ui.Components.lz(y6Var.getParentActivity(), null);
                            lzVar2.setIsSingleCell(true);
                            lzVar2.setItemsCount(1);
                            lzVar2.setIgnoreHeightCheck(true);
                            lzVar2.setViewType(26);
                            view = lzVar2;
                            break;
                        case 13:
                            q6 q6Var = new q6(y6Var, context);
                            y6Var.Y = q6Var;
                            view = q6Var;
                            break;
                        case 14:
                            org.telegram.ui.Components.vt0 vt0Var2 = new org.telegram.ui.Components.vt0(context, null);
                            float f10 = ((int) ((y6Var.H / 1024) / 1024)) / 1000.0f;
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
                                    strArr[i13] = org.telegram.messenger.hd.M0(2131748201, null);
                                } else {
                                    strArr[i13] = String.format("%d GB", arrayList.get(i13));
                                }
                            }
                            vt0Var2.setCallback(new w0(arrayList, 10));
                            int indexOf2 = arrayList.indexOf(Integer.valueOf(org.telegram.messenger.iz.q().getInt("cache_limit", ConnectionsManager.DEFAULT_DATACENTER_ID)));
                            if (indexOf2 < 0) {
                                indexOf2 = arrayList.size() - 1;
                            }
                            vt0Var2.b(indexOf2, null, strArr);
                            view = vt0Var2;
                            break;
                        default:
                            view = new org.telegram.ui.Cells.z8(context);
                            break;
                    }
                } else {
                    view = new org.telegram.ui.Cells.w9(context);
                }
                return new org.telegram.ui.Components.xi0(view);
            default:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) f2Var;
                switch (i7) {
                    case 0:
                        h5Var = new org.telegram.ui.Cells.n4(context);
                        break;
                    case 1:
                        h5Var = new org.telegram.ui.Cells.r8(context);
                        break;
                    case 2:
                        h5Var = new org.telegram.ui.Cells.pa(context, 6, 0, false);
                        break;
                    case 3:
                        h5Var = new org.telegram.ui.Cells.t8(context, null);
                        break;
                    case 4:
                        h5Var = new org.telegram.ui.Cells.z8(context);
                        break;
                    case 5:
                        h5Var = new org.telegram.ui.Cells.w9(context);
                        break;
                    case 6:
                        f6Var = ((org.telegram.ui.ActionBar.f2) notificationsCustomSettingsActivity).resourceProvider;
                        h5Var = new org.telegram.ui.Cells.h5(this.e, 21, 64, true, f6Var);
                        break;
                    case 7:
                    default:
                        h5Var = new org.telegram.ui.Cells.m8(context);
                        break;
                    case 8:
                        jh0 jh0Var = new jh0(context);
                        ImageView imageView = new ImageView(context);
                        jh0Var.W = imageView;
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.v6, notificationsCustomSettingsActivity.getResourceProvider(), PorterDuff.Mode.SRC_IN);
                        imageView.setImageResource(R.drawable.msg_expand);
                        jh0Var.addView(imageView, c8.ha.d(24, 24.0f, (org.telegram.messenger.hd.a0 ? 3 : 5) | 16, 17.0f, 0.0f, 17.0f, 0.0f));
                        h5Var = jh0Var;
                        break;
                }
                return new org.telegram.ui.Components.xi0(h5Var);
        }
    }

    @Override // v4.g0
    public void y(v4.d1 d1Var) {
        boolean B;
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.d) {
            case 1:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.f;
                ArrayList arrayList3 = notificationsCustomSettingsActivity.I;
                int i7 = notificationsCustomSettingsActivity.s;
                if (i7 == 3 || ((arrayList2 = notificationsCustomSettingsActivity.x) != null && arrayList2.isEmpty())) {
                    if (i7 == 3) {
                        Boolean bool = notificationsCustomSettingsActivity.n;
                        B = bool == null || bool.booleanValue() || !((arrayList = notificationsCustomSettingsActivity.x) == null || arrayList.isEmpty());
                    } else {
                        B = notificationsCustomSettingsActivity.getNotificationsController().B(i7);
                    }
                    int b10 = d1Var.b();
                    View view = d1Var.a;
                    kh0 kh0Var = (b10 < 0 || b10 >= arrayList3.size()) ? null : (kh0) arrayList3.get(b10);
                    if (kh0Var == null || kh0Var.c != 102) {
                        int i10 = d1Var.f;
                        if (i10 == 0) {
                            ((org.telegram.ui.Cells.n4) view).a(null, B);
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
