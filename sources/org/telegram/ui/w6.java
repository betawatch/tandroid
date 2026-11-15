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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class w6 extends rg.b {
    public final /* synthetic */ int d;
    public final Context e;
    public final /* synthetic */ org.telegram.ui.ActionBar.e2 f;

    public /* synthetic */ w6(int i7, Context context, org.telegram.ui.ActionBar.e2 e2Var) {
        this.d = i7;
        this.f = e2Var;
        this.e = context;
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        int i7;
        switch (this.d) {
            case 0:
                long b10 = e1Var.b();
                y6 y6Var = (y6) this.f;
                return b10 == y6Var.K || ((i7 = e1Var.f) == 2 && y6Var.H > 0 && !y6Var.L) || i7 == 5 || i7 == 7 || i7 == 11;
            default:
                int i10 = e1Var.f;
                return (i10 == 0 || i10 == 4) ? false : true;
        }
    }

    @Override // v4.h0
    public final int b() {
        switch (this.d) {
            case 0:
                return ((y6) this.f).g0.size();
            default:
                return ((NotificationsCustomSettingsActivity) this.f).J.size();
        }
    }

    @Override // v4.h0
    public final int d(int i7) {
        switch (this.d) {
            case 0:
                return ((u6) ((y6) this.f).g0.get(i7)).a;
            default:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.f;
                if (i7 < 0 || i7 >= notificationsCustomSettingsActivity.J.size()) {
                    return 5;
                }
                return ((mh0) notificationsCustomSettingsActivity.J.get(i7)).a;
        }
    }

    @Override // v4.h0
    public final void t(v4.e1 e1Var, int i7) {
        int i10;
        org.telegram.ui.Cells.l8 l8Var;
        int i11 = this.d;
        org.telegram.ui.ActionBar.e2 e2Var = this.f;
        switch (i11) {
            case 0:
                y6 y6Var = (y6) e2Var;
                ArrayList arrayList = y6Var.g0;
                u6 u6Var = (u6) arrayList.get(i7);
                int i12 = e1Var.f;
                View view = e1Var.a;
                if (i12 == 0) {
                    org.telegram.ui.Cells.v9 v9Var = (org.telegram.ui.Cells.v9) view;
                    if (i7 == y6Var.K) {
                        v9Var.c(org.telegram.messenger.hd.M0(2131748434, null), null, false, false);
                        break;
                    }
                } else if (i12 == 1) {
                    ((org.telegram.ui.Cells.y8) view).setText(org.telegram.messenger.g0.X2(u6Var.e));
                    break;
                } else if (i12 == 2) {
                    final org.telegram.ui.Components.kw0 kw0Var = (org.telegram.ui.Components.kw0) view;
                    boolean z10 = y6Var.L;
                    long j3 = y6Var.e;
                    long j10 = y6Var.H;
                    long j11 = y6Var.J;
                    long j12 = y6Var.I;
                    ab.q qVar = kw0Var.J;
                    View view2 = kw0Var.x;
                    TextView textView = kw0Var.n;
                    TextView textView2 = kw0Var.h;
                    TextView textView3 = kw0Var.w;
                    org.telegram.ui.Cells.v9 v9Var2 = kw0Var.E;
                    kw0Var.e = z10;
                    TextView textView4 = kw0Var.r;
                    textView4.setText(org.telegram.messenger.hd.a0("TotalDeviceFreeSize", null, 2131743973, org.telegram.messenger.g0.i0(j11, false, false)));
                    TextView textView5 = kw0Var.s;
                    long j13 = j12 - j11;
                    textView5.setText(org.telegram.messenger.hd.a0("TotalDeviceSize", null, 2131743972, org.telegram.messenger.g0.i0(j13, false, false)));
                    if (z10) {
                        textView3.setVisibility(0);
                        textView2.setVisibility(8);
                        textView4.setVisibility(8);
                        textView5.setVisibility(8);
                        textView.setVisibility(8);
                        view2.setVisibility(8);
                        v9Var2.setVisibility(8);
                        kw0Var.F = 0.0f;
                        kw0Var.G = 0.0f;
                        if (qVar != null) {
                            qVar.c(textView3);
                        }
                    } else {
                        if (qVar != null) {
                            qVar.x(textView3);
                        }
                        textView3.setVisibility(8);
                        if (j10 > 0) {
                            i10 = 0;
                            view2.setVisibility(0);
                            v9Var2.setVisibility(0);
                            textView2.setVisibility(0);
                            textView.setVisibility(8);
                            v9Var2.c(org.telegram.messenger.hd.M0(2131752047, null), org.telegram.messenger.g0.i0(j10, false, false), false, true);
                            textView2.setText(org.telegram.messenger.hd.a0("TelegramCacheSize", null, 2131744246, org.telegram.messenger.g0.i0(j10 + j3, false, false)));
                        } else {
                            i10 = 0;
                            textView2.setVisibility(8);
                            textView.setVisibility(0);
                            textView.setText(org.telegram.messenger.hd.a0("LocalDatabaseSize", null, 2131748769, org.telegram.messenger.g0.i0(j3, false, false)));
                            view2.setVisibility(8);
                            v9Var2.setVisibility(8);
                        }
                        textView4.setVisibility(i10);
                        textView5.setVisibility(i10);
                        float f10 = j10 + j3;
                        float f11 = j12;
                        float f12 = f10 / f11;
                        float f13 = j13 / f11;
                        if (kw0Var.F != f12) {
                            ValueAnimator valueAnimator = kw0Var.H;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            final int i13 = 0;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(kw0Var.F, f12);
                            kw0Var.H = ofFloat;
                            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.jw0
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                    switch (i13) {
                                        case 0:
                                            kw0 kw0Var2 = kw0Var;
                                            kw0Var2.getClass();
                                            kw0Var2.F = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                            kw0Var2.invalidate();
                                            break;
                                        default:
                                            kw0 kw0Var3 = kw0Var;
                                            kw0Var3.getClass();
                                            kw0Var3.G = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                            kw0Var3.invalidate();
                                            break;
                                    }
                                }
                            });
                            kw0Var.H.start();
                        }
                        if (kw0Var.G != f13) {
                            ValueAnimator valueAnimator2 = kw0Var.I;
                            if (valueAnimator2 != null) {
                                valueAnimator2.cancel();
                            }
                            final int i14 = 1;
                            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(kw0Var.G, f13);
                            kw0Var.I = ofFloat2;
                            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.jw0
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                                    switch (i14) {
                                        case 0:
                                            kw0 kw0Var2 = kw0Var;
                                            kw0Var2.getClass();
                                            kw0Var2.F = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                            kw0Var2.invalidate();
                                            break;
                                        default:
                                            kw0 kw0Var3 = kw0Var;
                                            kw0Var3.getClass();
                                            kw0Var3.G = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                            kw0Var3.invalidate();
                                            break;
                                    }
                                }
                            });
                            kw0Var.I.start();
                        }
                    }
                    org.telegram.ui.ActionBar.q6.U(v9Var2.getTextView(), org.telegram.ui.ActionBar.j6.G6, null);
                    kw0Var.requestLayout();
                    break;
                } else if (i12 == 3) {
                    org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                    n4Var.setText(((u6) arrayList.get(i7)).d);
                    ((u6) arrayList.get(i7)).getClass();
                    n4Var.setTopMargin(15);
                    ((u6) arrayList.get(i7)).getClass();
                    n4Var.setBottomMargin(0);
                    break;
                } else if (i12 == 7) {
                    org.telegram.ui.Cells.l8 l8Var2 = (org.telegram.ui.Cells.l8) view;
                    org.telegram.messenger.u2 u2Var = y6Var.getMessagesController().s7;
                    int i15 = u6Var.c;
                    int size = u2Var.d(((u6) arrayList.get(i7)).c).size();
                    String G = size > 0 ? org.telegram.messenger.hd.G(size, "ExceptionShort", Integer.valueOf(size)) : null;
                    String f14 = org.telegram.messenger.u2.f(u2Var.c(i15));
                    if (((u6) arrayList.get(i7)).c == 0) {
                        l8Var = l8Var2;
                        l8Var.r(org.telegram.messenger.hd.M0(2131746753, null), f14, true, R.drawable.msg_filled_menu_users, -11565578, -13276952, true);
                    } else {
                        l8Var = l8Var2;
                        if (((u6) arrayList.get(i7)).c == 1) {
                            l8Var.r(org.telegram.messenger.hd.M0(2131749457, null), f14, true, R.drawable.msg_filled_menu_groups, -11154873, -14175180, true);
                        } else if (((u6) arrayList.get(i7)).c == 2) {
                            l8Var.r(org.telegram.messenger.hd.M0(2131752650, null), f14, true, R.drawable.msg_filled_menu_channels, -1007845, -1996271, true);
                        } else if (((u6) arrayList.get(i7)).c == 3) {
                            l8Var.r(org.telegram.messenger.hd.M0(2131752646, null), f14, false, R.drawable.msg_filled_stories, -765355, -2148011, false);
                        }
                    }
                    l8Var.setSubtitle(G);
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
                            org.telegram.ui.Cells.c2 c2Var = (org.telegram.ui.Cells.c2) view;
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
                            spannableString.setSpan(new org.telegram.ui.Components.y31(org.telegram.messenger.g0.o()), 0, spannableString.length(), 33);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                            spannableStringBuilder.append((CharSequence) "  ");
                            spannableStringBuilder.append((CharSequence) spannableString);
                            c2Var.e(spannableStringBuilder, org.telegram.messenger.g0.i0(u6Var.g, false, false), t02, u6Var.f >= 0 ? !u6Var.j : !y6Var.M, false);
                            int i19 = u6Var.h;
                            int i20 = org.telegram.ui.ActionBar.j6.k7;
                            org.telegram.ui.Components.fp fpVar = c2Var.r;
                            if (fpVar != null) {
                                fpVar.b(i19, i19, i20);
                            }
                            c2Var.setCollapsed(u6Var.f < 0 ? Boolean.valueOf(y6Var.M) : null);
                            if (u6Var.f == -1) {
                                c2Var.d(new a(this, 6), new org.telegram.messenger.video.e(11, this, c2Var));
                            } else {
                                c2Var.d(null, null);
                            }
                            c2Var.setPad(u6Var.i ? 1 : 0);
                            break;
                    }
                }
                break;
            default:
                ArrayList arrayList2 = ((NotificationsCustomSettingsActivity) e2Var).J;
                if (i7 >= 0 && i7 < arrayList2.size()) {
                    mh0 mh0Var = (mh0) arrayList2.get(i7);
                    int i21 = i7 + 1;
                    boolean z12 = i21 < arrayList2.size() && ((mh0) arrayList2.get(i21)).a != 4;
                    int i22 = e1Var.f;
                    View view3 = e1Var.a;
                    switch (i22) {
                        case 0:
                            ((org.telegram.ui.Cells.n4) view3).setText(mh0Var.e);
                            break;
                        case 1:
                            ((org.telegram.ui.Cells.q8) view3).f("" + ((Object) mh0Var.e), mh0Var.i, z12);
                            break;
                        case 2:
                            ((org.telegram.ui.Cells.pa) view3).f(mh0Var.g, null, z12);
                            break;
                        case 3:
                            ((org.telegram.ui.Cells.s8) view3).b(mh0Var.h, "" + ((Object) mh0Var.e), z12);
                            break;
                        case 4:
                            org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view3;
                            if (mh0Var.e != null) {
                                y8Var.setFixedSize(0);
                                y8Var.setText(mh0Var.e);
                                break;
                            } else {
                                y8Var.setFixedSize(12);
                                y8Var.setText(null);
                                break;
                            }
                        case 5:
                            ((org.telegram.ui.Cells.v9) view3).c(mh0Var.e, mh0Var.f, false, z12);
                            break;
                        case 6:
                            org.telegram.ui.Cells.h5 h5Var = (org.telegram.ui.Cells.h5) view3;
                            h5Var.setDrawLine(true);
                            h5Var.setChecked(mh0Var.i);
                            h5Var.b(mh0Var.e, mh0Var.f, mh0Var.d, mh0Var.i, 0, false, z12, true);
                            break;
                        case 7:
                            org.telegram.ui.Cells.l8 l8Var3 = (org.telegram.ui.Cells.l8) view3;
                            if (mh0Var.d != 0) {
                                l8Var3.g(org.telegram.ui.ActionBar.j6.v6, org.telegram.ui.ActionBar.j6.u6);
                                l8Var3.o(mh0Var.d, "" + ((Object) mh0Var.e), z12);
                                break;
                            } else {
                                l8Var3.g(-1, org.telegram.ui.ActionBar.j6.p7);
                                l8Var3.k("" + ((Object) mh0Var.e), z12);
                                break;
                            }
                        case 8:
                            lh0 lh0Var = (lh0) view3;
                            lh0Var.g(org.telegram.ui.ActionBar.j6.v6, org.telegram.ui.ActionBar.j6.u6);
                            CharSequence charSequence2 = mh0Var.e;
                            org.telegram.messenger.i20.n(lh0Var.a0.animate().rotation(mh0Var.d == 1 ? 0.0f : 180.0f), org.telegram.ui.Components.er.h, 340L);
                            lh0Var.k(charSequence2, z12);
                            break;
                    }
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View view;
        v6 v6Var;
        org.telegram.ui.ActionBar.e6 e6Var;
        FrameLayout h5Var;
        int i10 = this.d;
        Context context = this.e;
        org.telegram.ui.ActionBar.e2 e2Var = this.f;
        switch (i10) {
            case 0:
                y6 y6Var = (y6) e2Var;
                if (i7 != 0) {
                    switch (i7) {
                        case 2:
                            org.telegram.ui.Components.kw0 kw0Var = new org.telegram.ui.Components.kw0(context);
                            Paint paint = new Paint(1);
                            kw0Var.a = paint;
                            Paint paint2 = new Paint(1);
                            Paint paint3 = new Paint(1);
                            kw0Var.b = paint3;
                            Paint paint4 = new Paint(1);
                            kw0Var.c = paint4;
                            kw0Var.d = new Paint();
                            org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n(org.telegram.messenger.ns.x3, org.telegram.messenger.ns.e4);
                            kw0Var.M = nVar;
                            kw0Var.setWillNotDraw(false);
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
                            bi.o2 o2Var = new bi.o2(29, context, kw0Var);
                            kw0Var.f = o2Var;
                            kw0Var.addView(o2Var, c8.ja.c(-2.0f, -1));
                            LinearLayout linearLayout = new LinearLayout(context);
                            linearLayout.setOrientation(1);
                            kw0Var.addView(linearLayout, c8.ja.c(-2.0f, -1));
                            bi.v1 v1Var = new bi.v1(context, 23);
                            linearLayout.addView(v1Var, c8.ja.k(21.0f, 40.0f, 21.0f, 16.0f, -1, -2));
                            TextView textView = new TextView(context);
                            kw0Var.w = textView;
                            int i11 = org.telegram.ui.ActionBar.j6.y6;
                            org.telegram.ui.ActionBar.q6.U(textView, i11, null);
                            String M0 = org.telegram.messenger.hd.M0(2131752643, "CalculatingSize");
                            int indexOf = M0.indexOf("...");
                            if (indexOf >= 0) {
                                SpannableString spannableString = new SpannableString(M0);
                                ab.q qVar = new ab.q(textView);
                                kw0Var.J = qVar;
                                qVar.F(spannableString, indexOf);
                                textView.setText(spannableString);
                            } else {
                                textView.setText(M0);
                            }
                            TextView textView2 = new TextView(context);
                            kw0Var.h = textView2;
                            textView2.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
                            org.telegram.ui.ActionBar.q6.U(textView2, i11, null);
                            TextView textView3 = new TextView(context);
                            kw0Var.n = textView3;
                            textView3.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
                            org.telegram.ui.ActionBar.q6.U(textView3, i11, null);
                            TextView textView4 = new TextView(context);
                            kw0Var.r = textView4;
                            textView4.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
                            org.telegram.ui.ActionBar.q6.U(textView4, i11, null);
                            TextView textView5 = new TextView(context);
                            kw0Var.s = textView5;
                            textView5.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
                            org.telegram.ui.ActionBar.q6.U(textView5, i11, null);
                            kw0Var.y = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Mj, false);
                            textView2.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.j6.L(org.telegram.messenger.g0.L(10.0f), kw0Var.y), (Drawable) null, (Drawable) null, (Drawable) null);
                            textView2.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
                            textView4.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.j6.L(org.telegram.messenger.g0.L(10.0f), i0.a.o(kw0Var.y, 64)), (Drawable) null, (Drawable) null, (Drawable) null);
                            textView4.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
                            textView5.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.j6.L(org.telegram.messenger.g0.L(10.0f), i0.a.o(kw0Var.y, org.telegram.messenger.ns.L1)), (Drawable) null, (Drawable) null, (Drawable) null);
                            textView5.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
                            textView3.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.j6.L(org.telegram.messenger.g0.L(10.0f), kw0Var.y), (Drawable) null, (Drawable) null, (Drawable) null);
                            textView3.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
                            v1Var.addView(textView, c8.ja.c(-2.0f, -2));
                            v1Var.addView(textView3, c8.ja.c(-2.0f, -2));
                            v1Var.addView(textView2, c8.ja.c(-2.0f, -2));
                            v1Var.addView(textView5, c8.ja.c(-2.0f, -2));
                            v1Var.addView(textView4, c8.ja.c(-2.0f, -2));
                            View view2 = new View(kw0Var.getContext());
                            kw0Var.x = view2;
                            linearLayout.addView(view2, c8.ja.t(-1, -2, 0, 21, 0, 0, 0));
                            view2.getLayoutParams().height = 1;
                            org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d7, view2, null);
                            org.telegram.ui.Cells.v9 v9Var = new org.telegram.ui.Cells.v9(kw0Var.getContext());
                            kw0Var.E = v9Var;
                            linearLayout.addView(v9Var, c8.ja.o(-1, -2));
                            view = kw0Var;
                            break;
                        case 3:
                            view = new org.telegram.ui.Cells.n4(context);
                            break;
                        case 4:
                            org.telegram.ui.Components.wt0 wt0Var = new org.telegram.ui.Components.wt0(context, null);
                            wt0Var.setCallback(new org.telegram.messenger.fd(19));
                            int i12 = org.telegram.messenger.gz.G;
                            wt0Var.b(i12 == 3 ? 0 : i12 + 1, null, org.telegram.messenger.hd.G(3, "Days", new Object[0]), org.telegram.messenger.hd.G(1, "Weeks", new Object[0]), org.telegram.messenger.hd.G(1, "Months", new Object[0]), org.telegram.messenger.hd.M0(2131749059, null));
                            view = wt0Var;
                            break;
                        case 5:
                            view = new x6(y6Var.getParentActivity(), y6Var.getResourceProvider());
                            break;
                        case 6:
                            org.telegram.ui.Components.pz pzVar = new org.telegram.ui.Components.pz(y6Var.getParentActivity(), null);
                            pzVar.setIsSingleCell(true);
                            pzVar.setItemsCount(3);
                            pzVar.setIgnoreHeightCheck(true);
                            pzVar.setViewType(25);
                            view = pzVar;
                            break;
                        case 7:
                            view = new org.telegram.ui.Cells.l8(context);
                            break;
                        case 8:
                            org.telegram.ui.Components.it0 it0Var = y6Var.c0;
                            it0Var.getClass();
                            View o2Var2 = new bi.o2(26, context, it0Var);
                            o2Var2.setTag(-33024);
                            o2Var2.setLayoutParams(new v4.p0(-1, -1));
                            view = o2Var2;
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
                            view = new org.telegram.ui.Cells.c2(this.e, 4, 21, false, y6Var.getResourceProvider());
                            break;
                        case 12:
                            org.telegram.ui.Components.pz pzVar2 = new org.telegram.ui.Components.pz(y6Var.getParentActivity(), null);
                            pzVar2.setIsSingleCell(true);
                            pzVar2.setItemsCount(1);
                            pzVar2.setIgnoreHeightCheck(true);
                            pzVar2.setViewType(26);
                            view = pzVar2;
                            break;
                        case 13:
                            q6 q6Var = new q6(y6Var, context);
                            y6Var.Z = q6Var;
                            view = q6Var;
                            break;
                        case 14:
                            org.telegram.ui.Components.wt0 wt0Var2 = new org.telegram.ui.Components.wt0(context, null);
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
                                    strArr[i13] = org.telegram.messenger.hd.M0(2131748202, null);
                                } else {
                                    strArr[i13] = String.format("%d GB", arrayList.get(i13));
                                }
                            }
                            wt0Var2.setCallback(new w0(arrayList, 10));
                            int indexOf2 = arrayList.indexOf(Integer.valueOf(org.telegram.messenger.gz.q().getInt("cache_limit", ConnectionsManager.DEFAULT_DATACENTER_ID)));
                            if (indexOf2 < 0) {
                                indexOf2 = arrayList.size() - 1;
                            }
                            wt0Var2.b(indexOf2, null, strArr);
                            view = wt0Var2;
                            break;
                        default:
                            view = new org.telegram.ui.Cells.y8(context);
                            break;
                    }
                } else {
                    view = new org.telegram.ui.Cells.v9(context);
                }
                return new org.telegram.ui.Components.cj0(view);
            default:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) e2Var;
                switch (i7) {
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
                        e6Var = ((org.telegram.ui.ActionBar.e2) notificationsCustomSettingsActivity).resourceProvider;
                        h5Var = new org.telegram.ui.Cells.h5(this.e, 21, 64, true, e6Var);
                        break;
                    case 7:
                    default:
                        h5Var = new org.telegram.ui.Cells.l8(context);
                        break;
                    case 8:
                        lh0 lh0Var = new lh0(context);
                        ImageView imageView = new ImageView(context);
                        lh0Var.a0 = imageView;
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        org.telegram.ui.ActionBar.q6.s(imageView, org.telegram.ui.ActionBar.j6.v6, notificationsCustomSettingsActivity.getResourceProvider(), PorterDuff.Mode.SRC_IN);
                        imageView.setImageResource(R.drawable.msg_expand);
                        lh0Var.addView(imageView, c8.ja.d(24, 24.0f, (org.telegram.messenger.hd.a0 ? 3 : 5) | 16, 17.0f, 0.0f, 17.0f, 0.0f));
                        h5Var = lh0Var;
                        break;
                }
                return new org.telegram.ui.Components.cj0(h5Var);
        }
    }

    @Override // v4.h0
    public void y(v4.e1 e1Var) {
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
                    int b10 = e1Var.b();
                    View view = e1Var.a;
                    mh0 mh0Var = (b10 < 0 || b10 >= arrayList3.size()) ? null : (mh0) arrayList3.get(b10);
                    if (mh0Var == null || mh0Var.c != 102) {
                        int i10 = e1Var.f;
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
