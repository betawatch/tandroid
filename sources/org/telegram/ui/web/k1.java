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
import bi.fc;
import bi.yd;
import c8.ha;
import c8.xa;
import fi.v3;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c20;
import org.telegram.messenger.i6;
import org.telegram.messenger.id;
import org.telegram.messenger.iz;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.v4;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.h70;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.v5;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Wallet.oa;
import org.telegram.ui.Wallet.y5;
import org.telegram.ui.c50;
import org.telegram.ui.g4;
import org.telegram.ui.k3;
import org.telegram.ui.q61;
import org.telegram.ui.t3;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public abstract class k1 extends FrameLayout {
    public boolean A0;
    public int D;
    public final TextPaint E;
    public int F;
    public float G;
    public final bi.t H;
    public final bi.t I;
    public final ImageView J;
    public final org.telegram.ui.Cells.y K;
    public final ImageView L;
    public final org.telegram.ui.ActionBar.y1 M;
    public final org.telegram.ui.Cells.y N;
    public final ImageView O;
    public final y5 P;
    public final org.telegram.ui.Cells.y Q;
    public final ImageView R;
    public final org.telegram.ui.Cells.y S;
    public boolean T;
    public float U;
    public final bi.v V;
    public boolean W;
    public final RectF a;
    public float a0;
    public final lg.f[] b;
    public final bi.v b0;
    public float c;
    public int c0;
    public final float[] d;
    public final h70 d0;
    public final boolean[] e;
    public boolean e0;
    public final Paint[] f;
    public c20 f0;
    public int g0;
    public final Paint[] h;
    public int h0;
    public int i0;
    public int j0;
    public ValueAnimator k0;
    public int l0;
    public int m0;
    public final Paint[] n;
    public int n0;
    public boolean o0;
    public boolean p0;
    public boolean q0;
    public final Paint r;
    public final h6.m r0;
    public final Paint s;
    public boolean s0;
    public ValueAnimator t0;
    public boolean u0;
    public org.telegram.messenger.voip.k v0;
    public final Paint w;
    public ValueAnimator w0;
    public int x;
    public float x0;
    public int y;
    public long y0;
    public final h1 z0;

    public k1(Context context) {
        super(context);
        this.a = new RectF();
        this.b = new lg.f[2];
        this.c = 0.0f;
        this.d = new float[2];
        this.e = new boolean[3];
        this.f = new Paint[2];
        this.h = new Paint[2];
        this.n = new Paint[2];
        final int i7 = 1;
        this.r = new Paint(1);
        this.s = new Paint(1);
        this.w = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.E = textPaint;
        this.F = org.telegram.messenger.g0.L(56.0f);
        this.G = 1.0f;
        this.U = 0.0f;
        this.a0 = 0.0f;
        this.g0 = -1;
        this.r0 = new h6.m(28);
        final org.telegram.ui.l0 l0Var = (org.telegram.ui.l0) this;
        final int i10 = 0;
        this.z0 = new h1(l0Var, i10);
        this.A0 = false;
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setTextSize(org.telegram.messenger.g0.L(18.33f));
        for (int i11 = 0; i11 < 2; i11++) {
            this.f[i11] = new Paint(1);
            this.h[i11] = new Paint(1);
            this.n[i11] = new Paint(1);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, ha.e(-1, 56, 87));
        FrameLayout frameLayout2 = new FrameLayout(context);
        addView(frameLayout2, ha.e(-1, 56, 87));
        bi.t tVar = new bi.t(context, 10);
        this.H = tVar;
        tVar.setOrientation(0);
        addView(tVar, ha.e(-2, 56, 83));
        ImageView imageView = new ImageView(context);
        this.L = imageView;
        imageView.setContentDescription(id.M0(2131754878, null));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        org.telegram.ui.ActionBar.y1 y1Var = new org.telegram.ui.ActionBar.y1(false);
        this.M = y1Var;
        y1Var.k = 200.0f;
        y1Var.c(false, 1.0f);
        imageView.setImageDrawable(y1Var);
        org.telegram.ui.Cells.y h02 = m6.h0(1090519039, 1, -1);
        this.N = h02;
        imageView.setBackground(h02);
        tVar.addView(imageView, ha.o(54, 56));
        bi.t tVar2 = new bi.t(context, 11);
        this.I = tVar2;
        tVar2.setOrientation(0);
        addView(tVar2, ha.e(-2, 56, 85));
        ImageView imageView2 = new ImageView(context);
        this.O = imageView2;
        imageView2.setScaleType(scaleType);
        y5 y5Var = new y5(l0Var);
        this.P = y5Var;
        imageView2.setImageDrawable(y5Var);
        y5Var.c();
        org.telegram.ui.Cells.y h03 = m6.h0(1090519039, 1, -1);
        this.Q = h03;
        imageView2.setBackground(h03);
        tVar2.addView(imageView2, ha.o(54, 56));
        ImageView imageView3 = new ImageView(context);
        this.R = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.ic_ab_other);
        imageView3.setColorFilter(new PorterDuffColorFilter(0, PorterDuff.Mode.SRC_IN));
        imageView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.web.i1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i12;
                int i13 = i10;
                org.telegram.ui.l0 l0Var2 = l0Var;
                switch (i13) {
                    case 0:
                        int i14 = 1;
                        if (l0Var2.getParent() instanceof ViewGroup) {
                            fc fcVar = new fc(l0Var2, 3);
                            k60 F = k60.F((ViewGroup) l0Var2.getParent(), null, l0Var2.R);
                            F.s = 0;
                            F.S(l0Var2.m0, l0Var2.n0);
                            F.a0(0.0f, -org.telegram.messenger.g0.L(52.0f));
                            F.S = qs.e3;
                            int w10 = m6.w(l0Var2.l0, m6.r1(0.1f, l0Var2.m0));
                            F.l0 = Integer.valueOf(w10);
                            int i15 = 0;
                            while (i15 < F.A.getChildCount()) {
                                View childAt = i15 == F.A.getChildCount() - i14 ? F.D : F.A.getChildAt(i15);
                                if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt;
                                    int i16 = 0;
                                    while (i16 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount()) {
                                        View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i16);
                                        int i17 = i14;
                                        if (childAt2 instanceof org.telegram.ui.ActionBar.z0) {
                                            ((org.telegram.ui.ActionBar.z0) childAt2).setSelectorColor(w10);
                                        }
                                        i16++;
                                        i14 = i17;
                                    }
                                    i12 = i14;
                                } else {
                                    i12 = i14;
                                    if (childAt instanceof org.telegram.ui.ActionBar.z0) {
                                        ((org.telegram.ui.ActionBar.z0) childAt).setSelectorColor(w10);
                                    }
                                }
                                i15++;
                                i14 = i12;
                            }
                            int i18 = i14;
                            if (org.telegram.messenger.g0.B(l0Var2.l0) > 0.721f) {
                                F.P(-1);
                                F.T(-986896);
                            } else {
                                F.P(-14737633);
                                F.T(-15592942);
                            }
                            int i19 = l0Var2.g0;
                            if (i19 == 0) {
                                F.c(R.drawable.msg_openin, id.M0(2131747796, null), (Runnable) fcVar.a(3), false);
                                F.c(R.drawable.msg_search, id.M0(2131745836, null), (Runnable) fcVar.a(1), false);
                                F.l(R.drawable.msg_share, id.M0(2131745459, null), (Runnable) fcVar.a(2), !l0Var2.q0);
                                F.c(R.drawable.msg_settings_old, id.M0(2131745495, null), (Runnable) fcVar.a(4), false);
                            } else if (i19 == i18) {
                                if (!l0Var2.p0) {
                                    F.c(R.drawable.msg_openin, id.M0(2131747796, null), (Runnable) fcVar.a(3), false);
                                    F.k();
                                }
                                if (l0Var2.o0) {
                                    F.c(R.drawable.msg_arrow_forward, id.M0(2131742921, null), (Runnable) fcVar.a(9), false);
                                }
                                u1 instantViewLoader = l0Var2.getInstantViewLoader();
                                if (instantViewLoader != null && (((!instantViewLoader.g || !instantViewLoader.i) && instantViewLoader.h == null && instantViewLoader.j == null && !instantViewLoader.c) || instantViewLoader.b() != null)) {
                                    F.c(R.drawable.menu_instant_view, id.M0(2131747788, null), (Runnable) fcVar.a(10), false);
                                    org.telegram.ui.ActionBar.z0 y10 = F.y();
                                    y10.setEnabled(instantViewLoader.b() != null);
                                    y10.setAlpha(y10.isEnabled() ? 1.0f : 0.5f);
                                    s sVar = new s(4, y10, instantViewLoader);
                                    instantViewLoader.m.add(sVar);
                                    F.p = new s(8, instantViewLoader, sVar);
                                }
                                F.c(R.drawable.msg_reset, id.M0(2131746340, null), (Runnable) fcVar.a(5), false);
                                F.c(R.drawable.msg_search, id.M0(2131745836, null), (Runnable) fcVar.a(1), false);
                                F.c(R.drawable.msg_saved, id.M0(2131742942, null), (Runnable) fcVar.a(6), false);
                                F.c(R.drawable.msg_share, id.M0(2131745459, null), (Runnable) fcVar.a(2), false);
                                F.k();
                                if (!xa.a(null).isEmpty()) {
                                    F.c(R.drawable.menu_views_recent, id.M0(2131742920, null), (Runnable) fcVar.a(8), false);
                                }
                                F.c(R.drawable.menu_browser_bookmarks, id.M0(2131742939, null), (Runnable) fcVar.a(7), false);
                                F.c(R.drawable.msg_settings_old, id.M0(2131745495, null), (Runnable) fcVar.a(4), false);
                            }
                            F.p = new q61(l0Var2);
                            F.Z();
                            break;
                        }
                        break;
                    default:
                        l0Var2.V.setText("");
                        break;
                }
            }
        });
        org.telegram.ui.Cells.y h04 = m6.h0(1090519039, 1, -1);
        this.S = h04;
        imageView3.setBackground(h04);
        imageView3.setContentDescription(id.M0(2131754839, "AccDescrMoreOptions"));
        tVar2.addView(imageView3, ha.o(54, 56));
        bi.v vVar = new bi.v(context, 5);
        this.V = vVar;
        vVar.setVisibility(8);
        vVar.setAlpha(0.0f);
        vVar.setTextSize(1, 18.0f);
        vVar.setSingleLine(true);
        vVar.setHint(id.M0(2131745836, null));
        vVar.setBackgroundResource(0);
        vVar.setCursorWidth(1.5f);
        vVar.setGravity(qs.x1);
        vVar.setClipToPadding(true);
        vVar.setPadding(org.telegram.messenger.g0.L(58.0f), 0, org.telegram.messenger.g0.L(112.0f), 0);
        vVar.setTranslationY(-org.telegram.messenger.g0.L(0.66f));
        vVar.setInputType(vVar.getInputType() | TLObject.FLAG_19);
        vVar.setImeOptions(33554435);
        vVar.setTextIsSelectable(false);
        vVar.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: org.telegram.ui.web.j1
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i12, KeyEvent keyEvent) {
                switch (i10) {
                    case 0:
                        if (keyEvent != null) {
                            if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                                org.telegram.messenger.g0.v1(l0Var.V);
                                break;
                            }
                        }
                        break;
                    default:
                        if (i12 == 2) {
                            org.telegram.ui.l0 l0Var2 = l0Var;
                            org.telegram.messenger.voip.k kVar = l0Var2.v0;
                            if (kVar != null) {
                                kVar.a(l0Var2.b0.getText().toString());
                            }
                            l0Var2.k(false);
                            break;
                        }
                        break;
                }
                return false;
            }
        });
        vVar.addTextChangedListener(new oa(l0Var, i7));
        frameLayout.addView(vVar, ha.e(-1, -1, qs.E1));
        bi.v vVar2 = new bi.v(context, 6);
        this.b0 = vVar2;
        vVar2.setVisibility(8);
        vVar2.setAlpha(0.0f);
        vVar2.setTextSize(1, 15.66f);
        vVar2.setSingleLine(true);
        this.c0 = iz.p0;
        vVar2.setHint(id.a0(null, null, 2131754351, f1.a().a));
        vVar2.setBackgroundResource(0);
        vVar2.setCursorWidth(1.5f);
        vVar2.setGravity(qs.x1);
        vVar2.setInputType(vVar2.getInputType() | TLObject.FLAG_19);
        vVar2.setImeOptions(33554434);
        vVar2.setTextIsSelectable(false);
        vVar2.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: org.telegram.ui.web.j1
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i12, KeyEvent keyEvent) {
                switch (i7) {
                    case 0:
                        if (keyEvent != null) {
                            if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                                org.telegram.messenger.g0.v1(l0Var.V);
                                break;
                            }
                        }
                        break;
                    default:
                        if (i12 == 2) {
                            org.telegram.ui.l0 l0Var2 = l0Var;
                            org.telegram.messenger.voip.k kVar = l0Var2.v0;
                            if (kVar != null) {
                                kVar.a(l0Var2.b0.getText().toString());
                            }
                            l0Var2.k(false);
                            break;
                        }
                        break;
                }
                return false;
            }
        });
        frameLayout2.addView(vVar2, ha.d(-1, -1.0f, qs.E1, 48.0f, 0.0f, 12.0f, 0.0f));
        ImageView imageView4 = new ImageView(context);
        this.J = imageView4;
        imageView4.setScaleType(scaleType);
        imageView4.setImageResource(R.drawable.ic_close_white);
        org.telegram.ui.Cells.y h05 = m6.h0(1090519039, 1, -1);
        this.K = h05;
        imageView4.setBackground(h05);
        imageView4.setVisibility(8);
        imageView4.setAlpha(0.0f);
        imageView4.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.web.i1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i12;
                int i13 = i7;
                org.telegram.ui.l0 l0Var2 = l0Var;
                switch (i13) {
                    case 0:
                        int i14 = 1;
                        if (l0Var2.getParent() instanceof ViewGroup) {
                            fc fcVar = new fc(l0Var2, 3);
                            k60 F = k60.F((ViewGroup) l0Var2.getParent(), null, l0Var2.R);
                            F.s = 0;
                            F.S(l0Var2.m0, l0Var2.n0);
                            F.a0(0.0f, -org.telegram.messenger.g0.L(52.0f));
                            F.S = qs.e3;
                            int w10 = m6.w(l0Var2.l0, m6.r1(0.1f, l0Var2.m0));
                            F.l0 = Integer.valueOf(w10);
                            int i15 = 0;
                            while (i15 < F.A.getChildCount()) {
                                View childAt = i15 == F.A.getChildCount() - i14 ? F.D : F.A.getChildAt(i15);
                                if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt;
                                    int i16 = 0;
                                    while (i16 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount()) {
                                        View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i16);
                                        int i17 = i14;
                                        if (childAt2 instanceof org.telegram.ui.ActionBar.z0) {
                                            ((org.telegram.ui.ActionBar.z0) childAt2).setSelectorColor(w10);
                                        }
                                        i16++;
                                        i14 = i17;
                                    }
                                    i12 = i14;
                                } else {
                                    i12 = i14;
                                    if (childAt instanceof org.telegram.ui.ActionBar.z0) {
                                        ((org.telegram.ui.ActionBar.z0) childAt).setSelectorColor(w10);
                                    }
                                }
                                i15++;
                                i14 = i12;
                            }
                            int i18 = i14;
                            if (org.telegram.messenger.g0.B(l0Var2.l0) > 0.721f) {
                                F.P(-1);
                                F.T(-986896);
                            } else {
                                F.P(-14737633);
                                F.T(-15592942);
                            }
                            int i19 = l0Var2.g0;
                            if (i19 == 0) {
                                F.c(R.drawable.msg_openin, id.M0(2131747796, null), (Runnable) fcVar.a(3), false);
                                F.c(R.drawable.msg_search, id.M0(2131745836, null), (Runnable) fcVar.a(1), false);
                                F.l(R.drawable.msg_share, id.M0(2131745459, null), (Runnable) fcVar.a(2), !l0Var2.q0);
                                F.c(R.drawable.msg_settings_old, id.M0(2131745495, null), (Runnable) fcVar.a(4), false);
                            } else if (i19 == i18) {
                                if (!l0Var2.p0) {
                                    F.c(R.drawable.msg_openin, id.M0(2131747796, null), (Runnable) fcVar.a(3), false);
                                    F.k();
                                }
                                if (l0Var2.o0) {
                                    F.c(R.drawable.msg_arrow_forward, id.M0(2131742921, null), (Runnable) fcVar.a(9), false);
                                }
                                u1 instantViewLoader = l0Var2.getInstantViewLoader();
                                if (instantViewLoader != null && (((!instantViewLoader.g || !instantViewLoader.i) && instantViewLoader.h == null && instantViewLoader.j == null && !instantViewLoader.c) || instantViewLoader.b() != null)) {
                                    F.c(R.drawable.menu_instant_view, id.M0(2131747788, null), (Runnable) fcVar.a(10), false);
                                    org.telegram.ui.ActionBar.z0 y10 = F.y();
                                    y10.setEnabled(instantViewLoader.b() != null);
                                    y10.setAlpha(y10.isEnabled() ? 1.0f : 0.5f);
                                    s sVar = new s(4, y10, instantViewLoader);
                                    instantViewLoader.m.add(sVar);
                                    F.p = new s(8, instantViewLoader, sVar);
                                }
                                F.c(R.drawable.msg_reset, id.M0(2131746340, null), (Runnable) fcVar.a(5), false);
                                F.c(R.drawable.msg_search, id.M0(2131745836, null), (Runnable) fcVar.a(1), false);
                                F.c(R.drawable.msg_saved, id.M0(2131742942, null), (Runnable) fcVar.a(6), false);
                                F.c(R.drawable.msg_share, id.M0(2131745459, null), (Runnable) fcVar.a(2), false);
                                F.k();
                                if (!xa.a(null).isEmpty()) {
                                    F.c(R.drawable.menu_views_recent, id.M0(2131742920, null), (Runnable) fcVar.a(8), false);
                                }
                                F.c(R.drawable.menu_browser_bookmarks, id.M0(2131742939, null), (Runnable) fcVar.a(7), false);
                                F.c(R.drawable.msg_settings_old, id.M0(2131745495, null), (Runnable) fcVar.a(4), false);
                            }
                            F.p = new q61(l0Var2);
                            F.Z();
                            break;
                        }
                        break;
                    default:
                        l0Var2.V.setText("");
                        break;
                }
            }
        });
        addView(imageView4, ha.e(54, 56, 85));
        h70 h70Var = new h70(context);
        this.d0 = h70Var;
        h70Var.setPivotX(0.0f);
        h70Var.setPivotY(org.telegram.messenger.g0.L(2.0f));
        addView(h70Var, ha.e(-1, 2, 87));
        setWillNotDraw(false);
        this.b[0] = new lg.f(l0Var);
        this.b[1] = new lg.f(l0Var);
        int i12 = m6.Dl;
        d(m6.v0(i12), false);
        setMenuColors(m6.v0(i12));
    }

    public final void a(Canvas canvas, float f10, float f11, boolean z9) {
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
            paintArr3[1].setAlpha((int) ((1.0f - this.a0) * (1.0f - this.U) * alpha2 * 1.0f));
            canvas.drawRect(rectF, paintArr3[1]);
            paintArr3[1].setAlpha(alpha2);
            if (z9) {
                rectF.set(0.0f, f13, width, f13 + max);
                int alpha3 = paintArr2[1].getAlpha();
                paintArr2[1].setAlpha((int) ((1.0f - this.a0) * alpha3 * 1.0f * f11));
                canvas.drawRect(rectF, paintArr2[1]);
                paintArr2[1].setAlpha(alpha3);
            }
        } else {
            f12 = 1.0f;
        }
        float f15 = this.c;
        if (f15 < f12) {
            int r12 = m6.r1((f12 - f15) * f12, 1610612736);
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
        paintArr3[0].setAlpha((int) ((f12 - this.a0) * (f12 - this.U) * (f12 - Utilities.l(this.c * 4.0f)) * alpha5 * f12));
        canvas.drawRect(rectF, paintArr3[0]);
        paintArr3[0].setAlpha(alpha5);
        if (z9) {
            rectF.set(width, f13, getWidth() + width, max + f13);
            int alpha6 = paintArr2[0].getAlpha();
            paintArr2[0].setAlpha((int) ((f12 - this.a0) * alpha6 * f12 * f11));
            canvas.drawRect(rectF, paintArr2[0]);
            paintArr2[0].setAlpha(alpha6);
        }
    }

    public final void b(int i7, int i10) {
        boolean[] zArr = this.e;
        boolean z9 = zArr[i7];
        Paint[] paintArr = this.f;
        if (z9 && paintArr[i7].getColor() == i10) {
            return;
        }
        zArr[i7] = true;
        paintArr[i7].setColor(i10);
        float f10 = org.telegram.messenger.g0.B(i10) <= 0.721f ? 1.0f : 0.0f;
        int f11 = i0.a.f(f10, -16777216, -1);
        this.h[i7].setColor(m6.w(i10, m6.r1(org.telegram.messenger.g0.T1(0.07f, 0.2f, f10), f11)));
        this.n[i7].setColor(m6.w(i10, m6.r1(org.telegram.messenger.g0.T1(0.14f, 0.24f, f10), f11)));
        lg.f[] fVarArr = this.b;
        ((h6) fVarArr[i7].d).u(f11);
        fVarArr[i7].a = m6.w(i10, m6.r1(0.6f, f11));
        lg.f fVar = fVarArr[i7];
        ((h6) fVar.e).u(i0.a.f(((v5) fVarArr[i7].f).c, fVar.a, m6.x0(null, m6.q7, false)));
        invalidate();
    }

    public final void c(final int i7, float f10, boolean z9) {
        boolean[] zArr = this.e;
        if (zArr[2] && this.i0 == i7) {
            return;
        }
        if (z9) {
            ValueAnimator valueAnimator = this.k0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            int i10 = this.i0;
            this.h0 = i10;
            final float f11 = org.telegram.messenger.g0.B(i10) <= 0.721f ? 1.0f : 0.0f;
            final float f12 = org.telegram.messenger.g0.B(i7) > 0.721f ? 0.0f : 1.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.k0 = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.web.g1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    k1 k1Var = k1.this;
                    k1Var.getClass();
                    float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    k1Var.c(i0.a.f(floatValue, k1Var.h0, i7), org.telegram.messenger.g0.T1(f11, f12, floatValue), false);
                }
            });
            this.k0.addListener(new yd(this, i7, f12, 2));
            this.k0.start();
            return;
        }
        zArr[2] = true;
        if (f10 < 0.0f) {
            f10 = org.telegram.messenger.g0.B(i7) <= 0.721f ? 1.0f : 0.0f;
        }
        int f13 = i0.a.f(f10, -16777216, -1);
        this.x = f13;
        m6.r1(0.55f, f13);
        this.i0 = i7;
        this.y = i0.a.f(f10, -1, -16777216);
        int f14 = i0.a.f(1.0f - f10, -1, -16777216);
        this.D = f14;
        int i11 = this.y;
        g4 g4Var = ((org.telegram.ui.l0) this).B0;
        j jVar = g4Var.i0;
        if (jVar != null) {
            jVar.c(i11, f14);
        }
        this.s.setColor(this.y);
        this.w.setColor(m6.w(this.y, m6.r1(org.telegram.messenger.g0.T1(0.07f, 0.2f, f10), this.x)));
        int r12 = m6.r1(0.6f, this.D);
        bi.v vVar = this.b0;
        vVar.setHintTextColor(r12);
        vVar.setTextColor(this.D);
        vVar.setCursorColor(this.D);
        vVar.setHandlesColor(this.D);
        this.d0.setProgressColor(m6.v0(m6.Fl));
        int f15 = i0.a.f(this.a0, this.x, this.D);
        org.telegram.ui.ActionBar.y1 y1Var = this.M;
        y1Var.a(f15);
        y1Var.b(i0.a.f(this.a0, this.x, this.D));
        int i12 = this.x;
        y5 y5Var = this.P;
        y5Var.c.setColor(i12);
        y5Var.invalidateSelf();
        int i13 = this.x;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.R.setColorFilter(new PorterDuffColorFilter(i13, mode));
        this.O.setColorFilter(new PorterDuffColorFilter(this.x, mode));
        this.J.setColorFilter(new PorterDuffColorFilter(this.x, mode));
        int w10 = m6.w(i7, m6.r1(0.22f, this.x));
        this.j0 = w10;
        m6.H1(this.N, w10, true);
        m6.H1(this.Q, this.j0, true);
        m6.H1(this.S, this.j0, true);
        m6.H1(this.K, this.j0, true);
        int r13 = m6.r1(0.6f, this.x);
        bi.v vVar2 = this.V;
        vVar2.setHintTextColor(r13);
        vVar2.setTextColor(this.x);
        vVar2.setCursorColor(this.x);
        vVar2.setHandlesColor(this.x);
        t3 t3Var = g4Var.K;
        if (t3Var != null) {
            t3Var.u();
        }
        invalidate();
    }

    public final void d(int i7, boolean z9) {
        c(i7, -1.0f, z9);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        a(canvas, (this.e0 ? org.telegram.messenger.g0.m : 0) + this.F, 1.0f, this.s0);
        float right = this.H.getRight();
        float left = this.I.getLeft();
        boolean z9 = this.e0;
        float f10 = z9 ? org.telegram.messenger.g0.m : 0;
        float f11 = (z9 ? org.telegram.messenger.g0.m : 0) + this.F;
        float f12 = this.c;
        lg.f[] fVarArr = this.b;
        if (f12 < 1.0f) {
            canvas.save();
            float width = (getWidth() * this.c) - (Utilities.l(this.c * 2.0f) * org.telegram.messenger.g0.L(30.0f));
            canvas.translate(right + width, f10);
            fVarArr[0].c(canvas, (left - right) - width, f11 - f10, (1.0f - this.U) * (1.0f - this.c));
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
            fVarArr[1].c(canvas, left - right, f13, (1.0f - this.a0) * (1.0f - this.U) * this.c);
            canvas.restore();
        }
        float f14 = this.a0;
        RectF rectF = this.a;
        if (f14 > 0.0f) {
            Paint paint = this.s;
            int alpha = paint.getAlpha();
            paint.setAlpha((int) (alpha * this.a0));
            canvas.drawRect(0.0f, 0.0f, getWidth(), (this.e0 ? org.telegram.messenger.g0.m : 0) + this.F, paint);
            paint.setAlpha(alpha);
            float f15 = (f10 + f11) / 2.0f;
            float L = org.telegram.messenger.g0.L(42.0f) / 2.0f;
            rectF.set(org.telegram.messenger.g0.L(6.0f), f15 - L, org.telegram.messenger.g0.T1(left, getWidth() - org.telegram.messenger.g0.L(6.0f), this.a0), f15 + L);
            Paint paint2 = this.w;
            int alpha2 = paint2.getAlpha();
            paint2.setAlpha((int) (alpha2 * this.a0));
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
        u0 webView;
        int action = motionEvent.getAction();
        h1 h1Var = this.z0;
        if (action == 0) {
            this.A0 = false;
            org.telegram.messenger.g0.r(h1Var);
            if (motionEvent.getX() > this.H.getRight() && motionEvent.getX() < this.I.getLeft() && !this.T && !this.W) {
                this.x0 = motionEvent.getX();
                motionEvent.getY();
                this.y0 = System.currentTimeMillis();
                org.telegram.messenger.g0.i3(h1Var, (long) (ViewConfiguration.getLongPressTimeout() * 0.8f));
            }
        } else if (motionEvent.getAction() == 2 && System.currentTimeMillis() - this.y0 > ViewConfiguration.getLongPressTimeout() * 0.8f) {
            org.telegram.messenger.g0.r(h1Var);
            this.A0 = true;
            float x10 = (motionEvent.getX() - this.x0) / (getWidth() * 0.8f);
            k3 k3Var = ((org.telegram.ui.l0) this).B0.u0[0];
            float l10 = Utilities.l(k3Var.getProgress() + x10);
            if (!k3Var.c() && k3Var.f() && (webView = k3Var.f.getWebView()) != null) {
                webView.setScrollProgress(l10);
                k3Var.L.d0();
            }
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            org.telegram.messenger.g0.r(h1Var);
            this.y0 = 0L;
        }
        this.x0 = motionEvent.getX();
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e(int i7, boolean z9) {
        lg.f fVar = this.b[i7];
        if (fVar.c != z9) {
            fVar.c = z9;
            ((v5) fVar.f).e(true, z9 ? 1.0f : 0.0f);
            invalidate();
        }
    }

    public final void f(int i7, String str) {
        lg.f[] fVarArr = this.b;
        CharSequence charSequence = ((h6) fVarArr[i7].e).i;
        if (charSequence == null || !TextUtils.equals(charSequence.toString(), str)) {
            ((h6) fVarArr[i7].e).t(i6.m(str, ((h6) fVarArr[i7].e).a.getFontMetricsInt(), false, null, 0), false, true);
        }
    }

    public final void g(int i7, String str, boolean z9) {
        lg.f[] fVarArr = this.b;
        CharSequence charSequence = ((h6) fVarArr[i7].d).i;
        if (charSequence == null || !TextUtils.equals(charSequence.toString(), str)) {
            ((h6) fVarArr[i7].d).t(i6.m(str, ((h6) fVarArr[i7].d).a.getFontMetricsInt(), false, null, 0), z9, true);
        }
    }

    public int getBackgroundColor() {
        return this.i0;
    }

    public u1 getInstantViewLoader() {
        return null;
    }

    public int getTextColor() {
        return this.x;
    }

    public String getTitle() {
        CharSequence charSequence = ((h6) this.b[0].d).i;
        return charSequence == null ? "" : charSequence.toString();
    }

    public final void h(boolean z9) {
        if (this.T == z9) {
            return;
        }
        ValueAnimator valueAnimator = this.t0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.T = z9;
        bi.v vVar = this.V;
        boolean z10 = false;
        vVar.setVisibility(0);
        this.M.c(true, (this.u0 || z9) ? 0.0f : 1.0f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.U, z9 ? 1.0f : 0.0f);
        this.t0 = ofFloat;
        ofFloat.addUpdateListener(new v3(this, 22));
        this.t0.addListener(new c50(12, this, z9));
        this.t0.setInterpolator(wq.h);
        this.t0.setDuration(320L);
        this.t0.start();
        boolean z11 = !z9;
        org.telegram.messenger.g0.V3(this.O, z11, true);
        org.telegram.messenger.g0.V3(this.R, z11, true);
        if (vVar.length() > 0 && this.T) {
            z10 = true;
        }
        org.telegram.messenger.g0.V3(this.J, z10, true);
    }

    public final void i() {
        lg.f[] fVarArr = this.b;
        lg.f fVar = fVarArr[0];
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
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        super.onMeasure(i7, org.telegram.messenger.camera.q.B(56.0f, this.e0 ? org.telegram.messenger.g0.m : 0, TLObject.FLAG_30));
    }

    public void setBackButton(boolean z9) {
        this.u0 = z9;
        if (this.T || this.W) {
            return;
        }
        this.M.c(true, z9 ? 0.0f : 1.0f);
    }

    public void setBackButtonCached(boolean z9) {
        this.u0 = z9;
    }

    public void setHasForward(boolean z9) {
        this.o0 = z9;
    }

    public void setHeight(int i7) {
        if (this.F != i7) {
            this.F = i7;
            float pow = (float) Math.pow(i7 / org.telegram.messenger.g0.L(56.0f), 0.5d);
            this.G = pow;
            bi.t tVar = this.H;
            tVar.setScaleX(pow);
            tVar.setScaleY(this.G);
            tVar.setTranslationX((1.0f - this.G) * org.telegram.messenger.g0.L(42.0f));
            tVar.setTranslationY((1.0f - this.G) * org.telegram.messenger.g0.L(-12.0f));
            float f10 = this.G;
            bi.t tVar2 = this.I;
            tVar2.setScaleX(f10);
            tVar2.setScaleY(this.G);
            tVar2.setTranslationX((1.0f - this.G) * (-org.telegram.messenger.g0.L(42.0f)));
            tVar2.setTranslationY((1.0f - this.G) * org.telegram.messenger.g0.L(-12.0f));
            this.d0.setTranslationY(this.F - org.telegram.messenger.g0.L(56.0f));
            invalidate();
        }
    }

    public void setIsLocal(boolean z9) {
        this.q0 = z9;
    }

    public void setIsTonsite(boolean z9) {
        this.p0 = z9;
    }

    public void setMenuColors(int i7) {
        boolean z9 = v4.f(v4.e(i7))[0] < 0.5d;
        this.l0 = z9 ? -16777216 : -1;
        int i10 = z9 ? -1 : -16777216;
        this.m0 = i10;
        this.n0 = m6.r1(0.6f, i10);
    }

    public void setMenuListener(c20 c20Var) {
        this.f0 = c20Var;
    }

    public void setMenuType(int i7) {
        if (this.g0 != i7) {
            this.g0 = i7;
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

    public void setIsLoaded(boolean z9) {
    }
}
