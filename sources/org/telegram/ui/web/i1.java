package org.telegram.ui.web;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import b8.mf;
import b8.xf;
import ci.ab;
import ci.pc;
import gi.j3;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hs;
import org.telegram.messenger.i6;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.u4;
import org.telegram.ui.Components.d70;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Wallet.ma;
import org.telegram.ui.Wallet.v5;
import org.telegram.ui.hb1;
import org.telegram.ui.hc1;
import org.telegram.ui.i4;
import org.telegram.ui.l3;
import org.telegram.ui.u3;
import org.telegram.ui.u40;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public abstract class i1 extends FrameLayout {
    public final f1 A0;
    public boolean B0;
    public int E;
    public final TextPaint F;
    public int G;
    public float H;
    public final ci.q I;
    public final ci.q J;
    public final ImageView K;
    public final org.telegram.ui.Cells.y L;
    public final ImageView M;
    public final org.telegram.ui.ActionBar.w1 N;
    public final org.telegram.ui.Cells.y O;
    public final ImageView P;
    public final v5 Q;
    public final org.telegram.ui.Cells.y R;
    public final ImageView S;
    public final org.telegram.ui.Cells.y T;
    public boolean U;
    public float V;
    public final ci.s W;
    public final RectF a;
    public boolean a0;
    public final mg.f[] b;
    public float b0;
    public float c;
    public final ci.s c0;
    public final float[] d;
    public int d0;
    public final boolean[] e;
    public final d70 e0;
    public final Paint[] f;
    public boolean f0;
    public u10 g0;
    public final Paint[] h;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public ValueAnimator l0;
    public int m0;
    public final Paint[] n;
    public int n0;
    public int o0;
    public boolean p0;
    public boolean q0;
    public final Paint r;
    public boolean r0;
    public final Paint s;
    public final k4.j s0;
    public boolean t0;
    public ValueAnimator u0;
    public boolean v0;
    public final Paint w;
    public mi.f w0;
    public int x;
    public ValueAnimator x0;
    public int y;
    public float y0;
    public long z0;

    public i1(Context context) {
        super(context);
        this.a = new RectF();
        this.b = new mg.f[2];
        this.c = 0.0f;
        this.d = new float[2];
        this.e = new boolean[3];
        this.f = new Paint[2];
        this.h = new Paint[2];
        this.n = new Paint[2];
        final int i3 = 1;
        this.r = new Paint(1);
        this.s = new Paint(1);
        this.w = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.F = textPaint;
        this.G = org.telegram.messenger.g0.L(56.0f);
        this.H = 1.0f;
        this.V = 0.0f;
        this.b0 = 0.0f;
        this.h0 = -1;
        this.s0 = new k4.j(24);
        final org.telegram.ui.m0 m0Var = (org.telegram.ui.m0) this;
        final int i10 = 0;
        this.A0 = new f1(m0Var, i10);
        this.B0 = false;
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setTextSize(org.telegram.messenger.g0.L(18.33f));
        for (int i11 = 0; i11 < 2; i11++) {
            this.f[i11] = new Paint(1);
            this.h[i11] = new Paint(1);
            this.n[i11] = new Paint(1);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, mf.e(-1, 56, 87));
        FrameLayout frameLayout2 = new FrameLayout(context);
        addView(frameLayout2, mf.e(-1, 56, 87));
        ci.q qVar = new ci.q(context, 10);
        this.I = qVar;
        qVar.setOrientation(0);
        addView(qVar, mf.e(-2, 56, 83));
        ImageView imageView = new ImageView(context);
        this.M = imageView;
        imageView.setContentDescription(bd.M0(2131754878, null));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        org.telegram.ui.ActionBar.w1 w1Var = new org.telegram.ui.ActionBar.w1(false);
        this.N = w1Var;
        w1Var.k = 200.0f;
        w1Var.c(false, 1.0f);
        imageView.setImageDrawable(w1Var);
        org.telegram.ui.Cells.y h02 = k6.h0(1090519039, 1, -1);
        this.O = h02;
        imageView.setBackground(h02);
        qVar.addView(imageView, mf.o(54, 56));
        ci.q qVar2 = new ci.q(context, 11);
        this.J = qVar2;
        qVar2.setOrientation(0);
        addView(qVar2, mf.e(-2, 56, 85));
        ImageView imageView2 = new ImageView(context);
        this.P = imageView2;
        imageView2.setScaleType(scaleType);
        v5 v5Var = new v5(m0Var);
        this.Q = v5Var;
        imageView2.setImageDrawable(v5Var);
        v5Var.c();
        org.telegram.ui.Cells.y h03 = k6.h0(1090519039, 1, -1);
        this.R = h03;
        imageView2.setBackground(h03);
        qVar2.addView(imageView2, mf.o(54, 56));
        ImageView imageView3 = new ImageView(context);
        this.S = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.ic_ab_other);
        imageView3.setColorFilter(new PorterDuffColorFilter(0, PorterDuff.Mode.SRC_IN));
        imageView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.web.g1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i12;
                int i13 = i10;
                org.telegram.ui.m0 m0Var2 = m0Var;
                switch (i13) {
                    case 0:
                        int i14 = 1;
                        if (m0Var2.getParent() instanceof ViewGroup) {
                            ab abVar = new ab(m0Var2, 3);
                            f60 F = f60.F((ViewGroup) m0Var2.getParent(), null, m0Var2.S);
                            F.s = 0;
                            F.S(m0Var2.n0, m0Var2.o0);
                            F.a0(0.0f, -org.telegram.messenger.g0.L(52.0f));
                            F.S = hs.e3;
                            int w10 = k6.w(m0Var2.m0, k6.r1(0.1f, m0Var2.n0));
                            F.l0 = Integer.valueOf(w10);
                            int i15 = 0;
                            while (i15 < F.A.getChildCount()) {
                                View childAt = i15 == F.A.getChildCount() - i14 ? F.D : F.A.getChildAt(i15);
                                if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt;
                                    int i16 = 0;
                                    while (i16 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount()) {
                                        View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i16);
                                        int i17 = i14;
                                        if (childAt2 instanceof org.telegram.ui.ActionBar.y0) {
                                            ((org.telegram.ui.ActionBar.y0) childAt2).setSelectorColor(w10);
                                        }
                                        i16++;
                                        i14 = i17;
                                    }
                                    i12 = i14;
                                } else {
                                    i12 = i14;
                                    if (childAt instanceof org.telegram.ui.ActionBar.y0) {
                                        ((org.telegram.ui.ActionBar.y0) childAt).setSelectorColor(w10);
                                    }
                                }
                                i15++;
                                i14 = i12;
                            }
                            int i18 = i14;
                            if (org.telegram.messenger.g0.B(m0Var2.m0) > 0.721f) {
                                F.P(-1);
                                F.T(-986896);
                            } else {
                                F.P(-14737633);
                                F.T(-15592942);
                            }
                            int i19 = m0Var2.h0;
                            if (i19 == 0) {
                                F.c(R.drawable.msg_openin, bd.M0(2131747804, null), (Runnable) abVar.a(3), false);
                                F.c(R.drawable.msg_search, bd.M0(2131745846, null), (Runnable) abVar.a(1), false);
                                F.l(R.drawable.msg_share, bd.M0(2131745469, null), (Runnable) abVar.a(2), !m0Var2.r0);
                                F.c(R.drawable.msg_settings_old, bd.M0(2131745505, null), (Runnable) abVar.a(4), false);
                            } else if (i19 == i18) {
                                if (!m0Var2.q0) {
                                    F.c(R.drawable.msg_openin, bd.M0(2131747804, null), (Runnable) abVar.a(3), false);
                                    F.k();
                                }
                                if (m0Var2.p0) {
                                    F.c(R.drawable.msg_arrow_forward, bd.M0(2131742931, null), (Runnable) abVar.a(9), false);
                                }
                                s1 instantViewLoader = m0Var2.getInstantViewLoader();
                                if (instantViewLoader != null && (((!instantViewLoader.g || !instantViewLoader.i) && instantViewLoader.h == null && instantViewLoader.j == null && !instantViewLoader.c) || instantViewLoader.b() != null)) {
                                    F.c(R.drawable.menu_instant_view, bd.M0(2131747796, null), (Runnable) abVar.a(10), false);
                                    org.telegram.ui.ActionBar.y0 y9 = F.y();
                                    y9.setEnabled(instantViewLoader.b() != null);
                                    y9.setAlpha(y9.isEnabled() ? 1.0f : 0.5f);
                                    hc1 hc1Var = new hc1(8, y9, instantViewLoader);
                                    instantViewLoader.m.add(hc1Var);
                                    F.p = new hc1(12, instantViewLoader, hc1Var);
                                }
                                F.c(R.drawable.msg_reset, bd.M0(2131746348, null), (Runnable) abVar.a(5), false);
                                F.c(R.drawable.msg_search, bd.M0(2131745846, null), (Runnable) abVar.a(1), false);
                                F.c(R.drawable.msg_saved, bd.M0(2131742952, null), (Runnable) abVar.a(6), false);
                                F.c(R.drawable.msg_share, bd.M0(2131745469, null), (Runnable) abVar.a(2), false);
                                F.k();
                                if (!xf.a(null).isEmpty()) {
                                    F.c(R.drawable.menu_views_recent, bd.M0(2131742930, null), (Runnable) abVar.a(8), false);
                                }
                                F.c(R.drawable.menu_browser_bookmarks, bd.M0(2131742949, null), (Runnable) abVar.a(7), false);
                                F.c(R.drawable.msg_settings_old, bd.M0(2131745505, null), (Runnable) abVar.a(4), false);
                            }
                            F.p = new hb1(m0Var2);
                            F.Z();
                            break;
                        }
                        break;
                    default:
                        m0Var2.W.setText("");
                        break;
                }
            }
        });
        org.telegram.ui.Cells.y h04 = k6.h0(1090519039, 1, -1);
        this.T = h04;
        imageView3.setBackground(h04);
        imageView3.setContentDescription(bd.M0(2131754839, "AccDescrMoreOptions"));
        qVar2.addView(imageView3, mf.o(54, 56));
        ci.s sVar = new ci.s(context, 5);
        this.W = sVar;
        sVar.setVisibility(8);
        sVar.setAlpha(0.0f);
        sVar.setTextSize(1, 18.0f);
        sVar.setSingleLine(true);
        sVar.setHint(bd.M0(2131745846, null));
        sVar.setBackgroundResource(0);
        sVar.setCursorWidth(1.5f);
        sVar.setGravity(hs.x1);
        sVar.setClipToPadding(true);
        sVar.setPadding(org.telegram.messenger.g0.L(58.0f), 0, org.telegram.messenger.g0.L(112.0f), 0);
        sVar.setTranslationY(-org.telegram.messenger.g0.L(0.66f));
        sVar.setInputType(sVar.getInputType() | TLObject.FLAG_19);
        sVar.setImeOptions(33554435);
        sVar.setTextIsSelectable(false);
        sVar.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: org.telegram.ui.web.h1
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i12, KeyEvent keyEvent) {
                switch (i10) {
                    case 0:
                        if (keyEvent != null) {
                            if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                                org.telegram.messenger.g0.v1(m0Var.W);
                                break;
                            }
                        }
                        break;
                    default:
                        if (i12 == 2) {
                            org.telegram.ui.m0 m0Var2 = m0Var;
                            mi.f fVar = m0Var2.w0;
                            if (fVar != null) {
                                fVar.a(m0Var2.c0.getText().toString());
                            }
                            m0Var2.k(false);
                            break;
                        }
                        break;
                }
                return false;
            }
        });
        sVar.addTextChangedListener(new ma(m0Var, i3));
        frameLayout.addView(sVar, mf.e(-1, -1, hs.E1));
        ci.s sVar2 = new ci.s(context, 6);
        this.c0 = sVar2;
        sVar2.setVisibility(8);
        sVar2.setAlpha(0.0f);
        sVar2.setTextSize(1, 15.66f);
        sVar2.setSingleLine(true);
        this.d0 = az.p0;
        sVar2.setHint(bd.a0(null, null, 2131754351, d1.a().a));
        sVar2.setBackgroundResource(0);
        sVar2.setCursorWidth(1.5f);
        sVar2.setGravity(hs.x1);
        sVar2.setInputType(sVar2.getInputType() | TLObject.FLAG_19);
        sVar2.setImeOptions(33554434);
        sVar2.setTextIsSelectable(false);
        sVar2.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: org.telegram.ui.web.h1
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i12, KeyEvent keyEvent) {
                switch (i3) {
                    case 0:
                        if (keyEvent != null) {
                            if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                                org.telegram.messenger.g0.v1(m0Var.W);
                                break;
                            }
                        }
                        break;
                    default:
                        if (i12 == 2) {
                            org.telegram.ui.m0 m0Var2 = m0Var;
                            mi.f fVar = m0Var2.w0;
                            if (fVar != null) {
                                fVar.a(m0Var2.c0.getText().toString());
                            }
                            m0Var2.k(false);
                            break;
                        }
                        break;
                }
                return false;
            }
        });
        frameLayout2.addView(sVar2, mf.d(-1, -1.0f, hs.E1, 48.0f, 0.0f, 12.0f, 0.0f));
        ImageView imageView4 = new ImageView(context);
        this.K = imageView4;
        imageView4.setScaleType(scaleType);
        imageView4.setImageResource(R.drawable.ic_close_white);
        org.telegram.ui.Cells.y h05 = k6.h0(1090519039, 1, -1);
        this.L = h05;
        imageView4.setBackground(h05);
        imageView4.setVisibility(8);
        imageView4.setAlpha(0.0f);
        imageView4.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.web.g1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i12;
                int i13 = i3;
                org.telegram.ui.m0 m0Var2 = m0Var;
                switch (i13) {
                    case 0:
                        int i14 = 1;
                        if (m0Var2.getParent() instanceof ViewGroup) {
                            ab abVar = new ab(m0Var2, 3);
                            f60 F = f60.F((ViewGroup) m0Var2.getParent(), null, m0Var2.S);
                            F.s = 0;
                            F.S(m0Var2.n0, m0Var2.o0);
                            F.a0(0.0f, -org.telegram.messenger.g0.L(52.0f));
                            F.S = hs.e3;
                            int w10 = k6.w(m0Var2.m0, k6.r1(0.1f, m0Var2.n0));
                            F.l0 = Integer.valueOf(w10);
                            int i15 = 0;
                            while (i15 < F.A.getChildCount()) {
                                View childAt = i15 == F.A.getChildCount() - i14 ? F.D : F.A.getChildAt(i15);
                                if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt;
                                    int i16 = 0;
                                    while (i16 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount()) {
                                        View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i16);
                                        int i17 = i14;
                                        if (childAt2 instanceof org.telegram.ui.ActionBar.y0) {
                                            ((org.telegram.ui.ActionBar.y0) childAt2).setSelectorColor(w10);
                                        }
                                        i16++;
                                        i14 = i17;
                                    }
                                    i12 = i14;
                                } else {
                                    i12 = i14;
                                    if (childAt instanceof org.telegram.ui.ActionBar.y0) {
                                        ((org.telegram.ui.ActionBar.y0) childAt).setSelectorColor(w10);
                                    }
                                }
                                i15++;
                                i14 = i12;
                            }
                            int i18 = i14;
                            if (org.telegram.messenger.g0.B(m0Var2.m0) > 0.721f) {
                                F.P(-1);
                                F.T(-986896);
                            } else {
                                F.P(-14737633);
                                F.T(-15592942);
                            }
                            int i19 = m0Var2.h0;
                            if (i19 == 0) {
                                F.c(R.drawable.msg_openin, bd.M0(2131747804, null), (Runnable) abVar.a(3), false);
                                F.c(R.drawable.msg_search, bd.M0(2131745846, null), (Runnable) abVar.a(1), false);
                                F.l(R.drawable.msg_share, bd.M0(2131745469, null), (Runnable) abVar.a(2), !m0Var2.r0);
                                F.c(R.drawable.msg_settings_old, bd.M0(2131745505, null), (Runnable) abVar.a(4), false);
                            } else if (i19 == i18) {
                                if (!m0Var2.q0) {
                                    F.c(R.drawable.msg_openin, bd.M0(2131747804, null), (Runnable) abVar.a(3), false);
                                    F.k();
                                }
                                if (m0Var2.p0) {
                                    F.c(R.drawable.msg_arrow_forward, bd.M0(2131742931, null), (Runnable) abVar.a(9), false);
                                }
                                s1 instantViewLoader = m0Var2.getInstantViewLoader();
                                if (instantViewLoader != null && (((!instantViewLoader.g || !instantViewLoader.i) && instantViewLoader.h == null && instantViewLoader.j == null && !instantViewLoader.c) || instantViewLoader.b() != null)) {
                                    F.c(R.drawable.menu_instant_view, bd.M0(2131747796, null), (Runnable) abVar.a(10), false);
                                    org.telegram.ui.ActionBar.y0 y9 = F.y();
                                    y9.setEnabled(instantViewLoader.b() != null);
                                    y9.setAlpha(y9.isEnabled() ? 1.0f : 0.5f);
                                    hc1 hc1Var = new hc1(8, y9, instantViewLoader);
                                    instantViewLoader.m.add(hc1Var);
                                    F.p = new hc1(12, instantViewLoader, hc1Var);
                                }
                                F.c(R.drawable.msg_reset, bd.M0(2131746348, null), (Runnable) abVar.a(5), false);
                                F.c(R.drawable.msg_search, bd.M0(2131745846, null), (Runnable) abVar.a(1), false);
                                F.c(R.drawable.msg_saved, bd.M0(2131742952, null), (Runnable) abVar.a(6), false);
                                F.c(R.drawable.msg_share, bd.M0(2131745469, null), (Runnable) abVar.a(2), false);
                                F.k();
                                if (!xf.a(null).isEmpty()) {
                                    F.c(R.drawable.menu_views_recent, bd.M0(2131742930, null), (Runnable) abVar.a(8), false);
                                }
                                F.c(R.drawable.menu_browser_bookmarks, bd.M0(2131742949, null), (Runnable) abVar.a(7), false);
                                F.c(R.drawable.msg_settings_old, bd.M0(2131745505, null), (Runnable) abVar.a(4), false);
                            }
                            F.p = new hb1(m0Var2);
                            F.Z();
                            break;
                        }
                        break;
                    default:
                        m0Var2.W.setText("");
                        break;
                }
            }
        });
        addView(imageView4, mf.e(54, 56, 85));
        d70 d70Var = new d70(context);
        this.e0 = d70Var;
        d70Var.setPivotX(0.0f);
        d70Var.setPivotY(org.telegram.messenger.g0.L(2.0f));
        addView(d70Var, mf.e(-1, 2, 87));
        setWillNotDraw(false);
        this.b[0] = new mg.f(m0Var);
        this.b[1] = new mg.f(m0Var);
        int i12 = k6.Dl;
        d(k6.v0(i12), false);
        setMenuColors(k6.v0(i12));
    }

    public final void a(Canvas canvas, float f10, float f11, boolean z10) {
        float f12;
        float max = Math.max(org.telegram.messenger.g0.L(0.66f), 1);
        float f13 = f10 - max;
        float width = getWidth() * this.c;
        float width2 = getWidth();
        RectF rectF = this.a;
        rectF.set(0.0f, 0.0f, width2, f10);
        Paint[] paintArr = this.f;
        int alpha = paintArr[1].getAlpha();
        paintArr[1].setAlpha((int) (alpha * 1.0f));
        canvas.drawRect(rectF, paintArr[1]);
        paintArr[1].setAlpha(alpha);
        float f14 = this.c;
        float[] fArr = this.d;
        Paint[] paintArr2 = this.n;
        Paint[] paintArr3 = this.h;
        if (f14 > 0.0f) {
            rectF.set(0.0f, 0.0f, fArr[1] * getWidth(), f10);
            int alpha2 = paintArr3[1].getAlpha();
            f12 = 1.0f;
            paintArr3[1].setAlpha((int) ((1.0f - this.b0) * (1.0f - this.V) * alpha2 * 1.0f));
            canvas.drawRect(rectF, paintArr3[1]);
            paintArr3[1].setAlpha(alpha2);
            if (z10) {
                rectF.set(0.0f, f13, width, f13 + max);
                int alpha3 = paintArr2[1].getAlpha();
                paintArr2[1].setAlpha((int) ((1.0f - this.b0) * alpha3 * 1.0f * f11));
                canvas.drawRect(rectF, paintArr2[1]);
                paintArr2[1].setAlpha(alpha3);
            }
        } else {
            f12 = 1.0f;
        }
        float f15 = this.c;
        if (f15 < f12) {
            int r12 = k6.r1((f12 - f15) * f12, 1610612736);
            Paint paint = this.r;
            paint.setColor(r12);
            rectF.set(0.0f, 0.0f, width, f10);
            canvas.drawRect(rectF, paint);
            rectF.set(width, 0.0f, getWidth(), f10);
            int alpha4 = paintArr[0].getAlpha();
            paintArr[0].setAlpha((int) (alpha4 * f12));
            canvas.drawRect(rectF, paintArr[0]);
            paintArr[0].setAlpha(alpha4);
        }
        rectF.set(width, 0.0f, (fArr[0] * getWidth()) + width, f10);
        int alpha5 = paintArr3[0].getAlpha();
        paintArr3[0].setAlpha((int) ((f12 - this.b0) * (f12 - this.V) * (f12 - Utilities.l(this.c * 4.0f)) * alpha5 * f12));
        canvas.drawRect(rectF, paintArr3[0]);
        paintArr3[0].setAlpha(alpha5);
        if (z10) {
            rectF.set(width, f13, getWidth() + width, max + f13);
            int alpha6 = paintArr2[0].getAlpha();
            paintArr2[0].setAlpha((int) ((f12 - this.b0) * alpha6 * f12 * f11));
            canvas.drawRect(rectF, paintArr2[0]);
            paintArr2[0].setAlpha(alpha6);
        }
    }

    public final void b(int i3, int i10) {
        boolean[] zArr = this.e;
        boolean z10 = zArr[i3];
        Paint[] paintArr = this.f;
        if (z10 && paintArr[i3].getColor() == i10) {
            return;
        }
        zArr[i3] = true;
        paintArr[i3].setColor(i10);
        float f10 = org.telegram.messenger.g0.B(i10) <= 0.721f ? 1.0f : 0.0f;
        int f11 = i0.a.f(f10, -16777216, -1);
        this.h[i3].setColor(k6.w(i10, k6.r1(org.telegram.messenger.g0.T1(0.07f, 0.2f, f10), f11)));
        this.n[i3].setColor(k6.w(i10, k6.r1(org.telegram.messenger.g0.T1(0.14f, 0.24f, f10), f11)));
        mg.f[] fVarArr = this.b;
        ((g6) fVarArr[i3].d).u(f11);
        fVarArr[i3].a = k6.w(i10, k6.r1(0.6f, f11));
        mg.f fVar = fVarArr[i3];
        ((g6) fVar.e).u(i0.a.f(((u5) fVarArr[i3].f).c, fVar.a, k6.x0(null, k6.q7, false)));
        invalidate();
    }

    public final void c(final int i3, float f10, boolean z10) {
        boolean[] zArr = this.e;
        if (zArr[2] && this.j0 == i3) {
            return;
        }
        if (z10) {
            ValueAnimator valueAnimator = this.l0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            int i10 = this.j0;
            this.i0 = i10;
            final float f11 = org.telegram.messenger.g0.B(i10) <= 0.721f ? 1.0f : 0.0f;
            final float f12 = org.telegram.messenger.g0.B(i3) > 0.721f ? 0.0f : 1.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.l0 = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.web.e1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    i1 i1Var = i1.this;
                    i1Var.getClass();
                    float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    i1Var.c(i0.a.f(floatValue, i1Var.i0, i3), org.telegram.messenger.g0.T1(f11, f12, floatValue), false);
                }
            });
            this.l0.addListener(new pc(this, i3, f12, 2));
            this.l0.start();
            return;
        }
        zArr[2] = true;
        if (f10 < 0.0f) {
            f10 = org.telegram.messenger.g0.B(i3) <= 0.721f ? 1.0f : 0.0f;
        }
        int f13 = i0.a.f(f10, -16777216, -1);
        this.x = f13;
        k6.r1(0.55f, f13);
        this.j0 = i3;
        this.y = i0.a.f(f10, -1, -16777216);
        int f14 = i0.a.f(1.0f - f10, -1, -16777216);
        this.E = f14;
        int i11 = this.y;
        i4 i4Var = ((org.telegram.ui.m0) this).C0;
        l lVar = i4Var.j0;
        if (lVar != null) {
            lVar.c(i11, f14);
        }
        this.s.setColor(this.y);
        this.w.setColor(k6.w(this.y, k6.r1(org.telegram.messenger.g0.T1(0.07f, 0.2f, f10), this.x)));
        int r12 = k6.r1(0.6f, this.E);
        ci.s sVar = this.c0;
        sVar.setHintTextColor(r12);
        sVar.setTextColor(this.E);
        sVar.setCursorColor(this.E);
        sVar.setHandlesColor(this.E);
        this.e0.setProgressColor(k6.v0(k6.Fl));
        int f15 = i0.a.f(this.b0, this.x, this.E);
        org.telegram.ui.ActionBar.w1 w1Var = this.N;
        w1Var.a(f15);
        w1Var.b(i0.a.f(this.b0, this.x, this.E));
        int i12 = this.x;
        v5 v5Var = this.Q;
        v5Var.c.setColor(i12);
        v5Var.invalidateSelf();
        int i13 = this.x;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.S.setColorFilter(new PorterDuffColorFilter(i13, mode));
        this.P.setColorFilter(new PorterDuffColorFilter(this.x, mode));
        this.K.setColorFilter(new PorterDuffColorFilter(this.x, mode));
        int w10 = k6.w(i3, k6.r1(0.22f, this.x));
        this.k0 = w10;
        k6.H1(this.O, w10, true);
        k6.H1(this.R, this.k0, true);
        k6.H1(this.T, this.k0, true);
        k6.H1(this.L, this.k0, true);
        int r13 = k6.r1(0.6f, this.x);
        ci.s sVar2 = this.W;
        sVar2.setHintTextColor(r13);
        sVar2.setTextColor(this.x);
        sVar2.setCursorColor(this.x);
        sVar2.setHandlesColor(this.x);
        u3 u3Var = i4Var.L;
        if (u3Var != null) {
            u3Var.u();
        }
        invalidate();
    }

    public final void d(int i3, boolean z10) {
        c(i3, -1.0f, z10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        a(canvas, (this.f0 ? org.telegram.messenger.g0.m : 0) + this.G, 1.0f, this.t0);
        float right = this.I.getRight();
        float left = this.J.getLeft();
        boolean z10 = this.f0;
        float f10 = z10 ? org.telegram.messenger.g0.m : 0;
        float f11 = (z10 ? org.telegram.messenger.g0.m : 0) + this.G;
        float f12 = this.c;
        mg.f[] fVarArr = this.b;
        if (f12 < 1.0f) {
            canvas.save();
            float width = (getWidth() * this.c) - (Utilities.l(this.c * 2.0f) * org.telegram.messenger.g0.L(30.0f));
            canvas.translate(right + width, f10);
            fVarArr[0].c(canvas, (left - right) - width, f11 - f10, (1.0f - this.V) * (1.0f - this.c));
            canvas.restore();
        }
        if (this.c > 0.0f) {
            float width2 = getWidth() * this.c;
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, width2, getHeight());
            canvas.translate(right, f10);
            canvas.translate((1.0f - this.c) * org.telegram.messenger.g0.L(-12.0f), 0.0f);
            float T1 = org.telegram.messenger.g0.T1(1.0f, 0.5f, 1.0f - this.c);
            float f13 = f11 - f10;
            canvas.scale(T1, T1, 0.0f, f13 / 2.0f);
            fVarArr[1].c(canvas, left - right, f13, (1.0f - this.b0) * (1.0f - this.V) * this.c);
            canvas.restore();
        }
        float f14 = this.b0;
        RectF rectF = this.a;
        if (f14 > 0.0f) {
            Paint paint = this.s;
            int alpha = paint.getAlpha();
            paint.setAlpha((int) (alpha * this.b0));
            canvas.drawRect(0.0f, 0.0f, getWidth(), (this.f0 ? org.telegram.messenger.g0.m : 0) + this.G, paint);
            paint.setAlpha(alpha);
            float f15 = (f10 + f11) / 2.0f;
            float L = org.telegram.messenger.g0.L(42.0f) / 2.0f;
            rectF.set(org.telegram.messenger.g0.L(6.0f), f15 - L, org.telegram.messenger.g0.T1(left, getWidth() - org.telegram.messenger.g0.L(6.0f), this.b0), f15 + L);
            Paint paint2 = this.w;
            int alpha2 = paint2.getAlpha();
            paint2.setAlpha((int) (alpha2 * this.b0));
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f), paint2);
            paint2.setAlpha(alpha2);
        }
        rectF.set(0.0f, f10, getWidth(), f11);
        canvas.save();
        canvas.clipRect(rectF);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        t0 webView;
        int action = motionEvent.getAction();
        f1 f1Var = this.A0;
        if (action == 0) {
            this.B0 = false;
            org.telegram.messenger.g0.r(f1Var);
            if (motionEvent.getX() > this.I.getRight() && motionEvent.getX() < this.J.getLeft() && !this.U && !this.a0) {
                this.y0 = motionEvent.getX();
                motionEvent.getY();
                this.z0 = System.currentTimeMillis();
                org.telegram.messenger.g0.i3(f1Var, (long) (ViewConfiguration.getLongPressTimeout() * 0.8f));
            }
        } else if (motionEvent.getAction() == 2 && System.currentTimeMillis() - this.z0 > ViewConfiguration.getLongPressTimeout() * 0.8f) {
            org.telegram.messenger.g0.r(f1Var);
            this.B0 = true;
            float x10 = (motionEvent.getX() - this.y0) / (getWidth() * 0.8f);
            l3 l3Var = ((org.telegram.ui.m0) this).C0.v0[0];
            float l10 = Utilities.l(l3Var.getProgress() + x10);
            if (!l3Var.c() && l3Var.f() && (webView = l3Var.f.getWebView()) != null) {
                webView.setScrollProgress(l10);
                l3Var.M.d0();
            }
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            org.telegram.messenger.g0.r(f1Var);
            this.z0 = 0L;
        }
        this.y0 = motionEvent.getX();
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e(int i3, boolean z10) {
        mg.f fVar = this.b[i3];
        if (fVar.c != z10) {
            fVar.c = z10;
            ((u5) fVar.f).e(true, z10 ? 1.0f : 0.0f);
            invalidate();
        }
    }

    public final void f(int i3, String str) {
        mg.f[] fVarArr = this.b;
        CharSequence charSequence = ((g6) fVarArr[i3].e).i;
        if (charSequence == null || !TextUtils.equals(charSequence.toString(), str)) {
            ((g6) fVarArr[i3].e).t(i6.m(str, ((g6) fVarArr[i3].e).a.getFontMetricsInt(), false, null, 0), false, true);
        }
    }

    public final void g(int i3, String str, boolean z10) {
        mg.f[] fVarArr = this.b;
        CharSequence charSequence = ((g6) fVarArr[i3].d).i;
        if (charSequence == null || !TextUtils.equals(charSequence.toString(), str)) {
            ((g6) fVarArr[i3].d).t(i6.m(str, ((g6) fVarArr[i3].d).a.getFontMetricsInt(), false, null, 0), z10, true);
        }
    }

    public int getBackgroundColor() {
        return this.j0;
    }

    public s1 getInstantViewLoader() {
        return null;
    }

    public int getTextColor() {
        return this.x;
    }

    public String getTitle() {
        CharSequence charSequence = ((g6) this.b[0].d).i;
        return charSequence == null ? "" : charSequence.toString();
    }

    public final void h(boolean z10) {
        if (this.U == z10) {
            return;
        }
        ValueAnimator valueAnimator = this.u0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.U = z10;
        ci.s sVar = this.W;
        boolean z11 = false;
        sVar.setVisibility(0);
        this.N.c(true, (this.v0 || z10) ? 0.0f : 1.0f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.V, z10 ? 1.0f : 0.0f);
        this.u0 = ofFloat;
        ofFloat.addUpdateListener(new j3(this, 23));
        this.u0.addListener(new u40(12, this, z10));
        this.u0.setInterpolator(xq.h);
        this.u0.setDuration(320L);
        this.u0.start();
        boolean z12 = !z10;
        org.telegram.messenger.g0.V3(this.P, z12, true);
        org.telegram.messenger.g0.V3(this.S, z12, true);
        if (sVar.length() > 0 && this.U) {
            z11 = true;
        }
        org.telegram.messenger.g0.V3(this.K, z11, true);
    }

    public final void i() {
        mg.f[] fVarArr = this.b;
        mg.f fVar = fVarArr[0];
        fVarArr[0] = fVarArr[1];
        fVarArr[1] = fVar;
        float[] fArr = this.d;
        float f10 = fArr[0];
        fArr[0] = fArr[1];
        fArr[1] = f10;
        Paint[] paintArr = this.f;
        int color = paintArr[0].getColor();
        b(0, paintArr[1].getColor());
        b(1, color);
        invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i3, int i10) {
        super.onMeasure(i3, org.telegram.messenger.camera.q.B(56.0f, this.f0 ? org.telegram.messenger.g0.m : 0, TLObject.FLAG_30));
    }

    public void setBackButton(boolean z10) {
        this.v0 = z10;
        if (this.U || this.a0) {
            return;
        }
        this.N.c(true, z10 ? 0.0f : 1.0f);
    }

    public void setBackButtonCached(boolean z10) {
        this.v0 = z10;
    }

    public void setHasForward(boolean z10) {
        this.p0 = z10;
    }

    public void setHeight(int i3) {
        if (this.G != i3) {
            this.G = i3;
            float pow = (float) Math.pow(i3 / org.telegram.messenger.g0.L(56.0f), 0.5d);
            this.H = pow;
            ci.q qVar = this.I;
            qVar.setScaleX(pow);
            qVar.setScaleY(this.H);
            qVar.setTranslationX((1.0f - this.H) * org.telegram.messenger.g0.L(42.0f));
            qVar.setTranslationY((1.0f - this.H) * org.telegram.messenger.g0.L(-12.0f));
            float f10 = this.H;
            ci.q qVar2 = this.J;
            qVar2.setScaleX(f10);
            qVar2.setScaleY(this.H);
            qVar2.setTranslationX((1.0f - this.H) * (-org.telegram.messenger.g0.L(42.0f)));
            qVar2.setTranslationY((1.0f - this.H) * org.telegram.messenger.g0.L(-12.0f));
            this.e0.setTranslationY(this.G - org.telegram.messenger.g0.L(56.0f));
            invalidate();
        }
    }

    public void setIsLocal(boolean z10) {
        this.r0 = z10;
    }

    public void setIsTonsite(boolean z10) {
        this.q0 = z10;
    }

    public void setMenuColors(int i3) {
        boolean z10 = u4.f(u4.e(i3))[0] < 0.5d;
        this.m0 = z10 ? -16777216 : -1;
        int i10 = z10 ? -1 : -16777216;
        this.n0 = i10;
        this.o0 = k6.r1(0.6f, i10);
    }

    public void setMenuListener(u10 u10Var) {
        this.g0 = u10Var;
    }

    public void setMenuType(int i3) {
        if (this.h0 != i3) {
            this.h0 = i3;
        }
    }

    public void setProgress(float f10) {
        this.d[0] = f10;
        invalidate();
    }

    public void setTransitionProgress(float f10) {
        this.c = f10;
        invalidate();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return true;
    }

    public void setIsLoaded(boolean z10) {
    }
}
