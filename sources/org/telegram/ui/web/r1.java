package org.telegram.ui.web;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
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
import h7.z5;
import hh.fb;
import lh.m2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.rl;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.e5;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.z70;
import org.telegram.ui.m4;
import org.telegram.ui.n40;
import org.telegram.ui.q3;
import org.telegram.ui.tq0;
import org.telegram.ui.v10;
import org.telegram.ui.z3;
import org.telegram.ui.zh1;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public abstract class r1 extends FrameLayout {
    public final TextPaint A;
    public int B;
    public float C;
    public final hh.m D;
    public final hh.m E;
    public final ImageView F;
    public final org.telegram.ui.Cells.z G;
    public final ImageView H;
    public final org.telegram.ui.ActionBar.g2 I;
    public final org.telegram.ui.Cells.z J;
    public final ImageView K;
    public final p1 L;
    public final org.telegram.ui.Cells.z M;
    public final ImageView N;
    public final org.telegram.ui.Cells.z O;
    public boolean P;
    public float Q;
    public final hh.o R;
    public boolean S;
    public float T;
    public final hh.o U;
    public int V;
    public final z70 W;
    public final RectF a;
    public boolean a0;
    public final q1[] b;
    public Utilities.Callback b0;
    public float c;
    public int c0;
    public final float[] d;
    public int d0;
    public final boolean[] e;
    public int e0;
    public final Paint[] f;
    public int f0;
    public ValueAnimator g0;
    public final Paint[] h;
    public int h0;
    public int i0;
    public int j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;
    public final Paint[] n;
    public final v10 n0;
    public boolean o0;
    public ValueAnimator p0;
    public boolean q0;
    public final Paint r;
    public gh.d1 r0;
    public final Paint s;
    public ValueAnimator s0;
    public float t0;
    public long u0;
    public final Paint v;
    public final m1 v0;
    public int w;
    public boolean w0;
    public int x;
    public int y;

    public r1(Context context) {
        super(context);
        this.a = new RectF();
        this.b = new q1[2];
        this.c = 0.0f;
        this.d = new float[2];
        this.e = new boolean[3];
        this.f = new Paint[2];
        this.h = new Paint[2];
        this.n = new Paint[2];
        final int i10 = 1;
        this.r = new Paint(1);
        this.s = new Paint(1);
        this.v = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.A = textPaint;
        this.B = AndroidUtilities.dp(56.0f);
        this.C = 1.0f;
        this.Q = 0.0f;
        this.T = 0.0f;
        this.c0 = -1;
        this.n0 = new v10();
        final org.telegram.ui.o0 o0Var = (org.telegram.ui.o0) this;
        final int i11 = 0;
        this.v0 = new m1(o0Var, i11);
        this.w0 = false;
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(18.33f));
        for (int i12 = 0; i12 < 2; i12++) {
            this.f[i12] = new Paint(1);
            this.h[i12] = new Paint(1);
            this.n[i12] = new Paint(1);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, z5.e(-1, 56, 87));
        FrameLayout frameLayout2 = new FrameLayout(context);
        addView(frameLayout2, z5.e(-1, 56, 87));
        hh.m mVar = new hh.m(context, 8);
        this.D = mVar;
        mVar.setOrientation(0);
        addView(mVar, z5.e(-2, 56, 83));
        ImageView imageView = new ImageView(context);
        this.H = imageView;
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(false);
        this.I = g2Var;
        g2Var.k = 200.0f;
        g2Var.c(1.0f, false);
        imageView.setImageDrawable(g2Var);
        org.telegram.ui.Cells.z f02 = g6.f0(1090519039, 1, -1);
        this.J = f02;
        imageView.setBackground(f02);
        mVar.addView(imageView, z5.n(54, 56));
        hh.m mVar2 = new hh.m(context, 9);
        this.E = mVar2;
        mVar2.setOrientation(0);
        addView(mVar2, z5.e(-2, 56, 85));
        ImageView imageView2 = new ImageView(context);
        this.K = imageView2;
        imageView2.setScaleType(scaleType);
        p1 p1Var = new p1(o0Var);
        this.L = p1Var;
        imageView2.setImageDrawable(p1Var);
        p1Var.f();
        org.telegram.ui.Cells.z f03 = g6.f0(1090519039, 1, -1);
        this.M = f03;
        imageView2.setBackground(f03);
        mVar2.addView(imageView2, z5.n(54, 56));
        ImageView imageView3 = new ImageView(context);
        this.N = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.ic_ab_other);
        imageView3.setColorFilter(new PorterDuffColorFilter(0, PorterDuff.Mode.SRC_IN));
        imageView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.web.n1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Utilities.Callback callback;
                switch (i11) {
                    case 0:
                        org.telegram.ui.o0 o0Var2 = o0Var;
                        if (o0Var2.getParent() instanceof ViewGroup) {
                            eg.o oVar = new eg.o(o0Var2, 4);
                            Utilities.Callback callback2 = null;
                            b70 F = b70.F((ViewGroup) o0Var2.getParent(), null, o0Var2.N);
                            F.s = 0;
                            F.S(o0Var2.i0, o0Var2.j0);
                            F.a0(0.0f, -AndroidUtilities.dp(52.0f));
                            F.S = 200;
                            int v = g6.v(o0Var2.h0, g6.l1(0.1f, o0Var2.i0));
                            F.l0 = Integer.valueOf(v);
                            int i13 = 0;
                            while (i13 < F.A.getChildCount()) {
                                View childAt = i13 == F.A.getChildCount() - 1 ? F.D : F.A.getChildAt(i13);
                                if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt;
                                    int i14 = 0;
                                    while (i14 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount()) {
                                        View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.H.getChildAt(i14);
                                        Utilities.Callback callback3 = callback2;
                                        if (childAt2 instanceof org.telegram.ui.ActionBar.f1) {
                                            ((org.telegram.ui.ActionBar.f1) childAt2).setSelectorColor(v);
                                        }
                                        i14++;
                                        callback2 = callback3;
                                    }
                                    callback = callback2;
                                } else {
                                    callback = callback2;
                                    if (childAt instanceof org.telegram.ui.ActionBar.f1) {
                                        ((org.telegram.ui.ActionBar.f1) childAt).setSelectorColor(v);
                                    }
                                }
                                i13++;
                                callback2 = callback;
                            }
                            Utilities.Callback callback4 = callback2;
                            if (AndroidUtilities.computePerceivedBrightness(o0Var2.h0) > 0.721f) {
                                F.P(-1);
                                F.T(-986896);
                            } else {
                                F.P(-14737633);
                                F.T(-15592942);
                            }
                            int i15 = o0Var2.c0;
                            if (i15 == 0) {
                                F.c(R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp), (Runnable) oVar.run(3), false);
                                F.c(R.drawable.msg_search, LocaleController.getString(R.string.Search), (Runnable) oVar.run(1), false);
                                F.l(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), (Runnable) oVar.run(2), !o0Var2.m0);
                                F.c(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), (Runnable) oVar.run(4), false);
                            } else if (i15 == 1) {
                                if (!o0Var2.l0) {
                                    F.c(R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp), (Runnable) oVar.run(3), false);
                                    F.k();
                                }
                                if (o0Var2.k0) {
                                    F.c(R.drawable.msg_arrow_forward, LocaleController.getString(R.string.WebForward), (Runnable) oVar.run(9), false);
                                }
                                c2 instantViewLoader = o0Var2.getInstantViewLoader();
                                if (instantViewLoader != null && (((!instantViewLoader.g || !instantViewLoader.i) && instantViewLoader.h == null && instantViewLoader.j == null && !instantViewLoader.c) || instantViewLoader.b() != null)) {
                                    F.c(R.drawable.menu_instant_view, LocaleController.getString(R.string.OpenLocalInstantView), (Runnable) oVar.run(10), false);
                                    org.telegram.ui.ActionBar.f1 y10 = F.y();
                                    y10.setEnabled(instantViewLoader.b() != null);
                                    y10.setAlpha(y10.isEnabled() ? 1.0f : 0.5f);
                                    zh1 zh1Var = new zh1(6, y10, instantViewLoader);
                                    instantViewLoader.m.add(zh1Var);
                                    F.p = new zh1(10, instantViewLoader, zh1Var);
                                }
                                F.c(R.drawable.msg_reset, LocaleController.getString(R.string.Refresh), (Runnable) oVar.run(5), false);
                                F.c(R.drawable.msg_search, LocaleController.getString(R.string.Search), (Runnable) oVar.run(1), false);
                                F.c(R.drawable.msg_saved, LocaleController.getString(R.string.WebBookmark), (Runnable) oVar.run(6), false);
                                F.c(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), (Runnable) oVar.run(2), false);
                                F.k();
                                if (!b1.a(callback4).isEmpty()) {
                                    F.c(R.drawable.menu_views_recent, LocaleController.getString(R.string.WebHistory), (Runnable) oVar.run(8), false);
                                }
                                F.c(R.drawable.menu_browser_bookmarks, LocaleController.getString(R.string.WebBookmarks), (Runnable) oVar.run(7), false);
                                F.c(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), (Runnable) oVar.run(4), false);
                            }
                            F.p = new tq0(o0Var2, 11);
                            F.Z();
                            break;
                        }
                        break;
                    default:
                        o0Var.R.setText("");
                        break;
                }
            }
        });
        org.telegram.ui.Cells.z f04 = g6.f0(1090519039, 1, -1);
        this.O = f04;
        imageView3.setBackground(f04);
        imageView3.setContentDescription(LocaleController.getString("AccDescrMoreOptions", R.string.AccDescrMoreOptions));
        mVar2.addView(imageView3, z5.n(54, 56));
        hh.o oVar = new hh.o(context, 4);
        this.R = oVar;
        oVar.setVisibility(8);
        oVar.setAlpha(0.0f);
        oVar.setTextSize(1, 18.0f);
        oVar.setSingleLine(true);
        oVar.setHint(LocaleController.getString(R.string.Search));
        oVar.setBackgroundResource(0);
        oVar.setCursorWidth(1.5f);
        oVar.setGravity(112);
        oVar.setClipToPadding(true);
        oVar.setPadding(AndroidUtilities.dp(58.0f), 0, AndroidUtilities.dp(112.0f), 0);
        oVar.setTranslationY(-AndroidUtilities.dp(0.66f));
        oVar.setInputType(oVar.getInputType() | TLObject.FLAG_19);
        oVar.setImeOptions(33554435);
        oVar.setTextIsSelectable(false);
        oVar.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: org.telegram.ui.web.o1
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i13, KeyEvent keyEvent) {
                switch (i11) {
                    case 0:
                        if (keyEvent != null) {
                            if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                                AndroidUtilities.hideKeyboard(o0Var.R);
                                break;
                            }
                        }
                        break;
                    default:
                        if (i13 == 2) {
                            org.telegram.ui.o0 o0Var2 = o0Var;
                            gh.d1 d1Var = o0Var2.r0;
                            if (d1Var != null) {
                                d1Var.run(o0Var2.U.getText().toString());
                            }
                            o0Var2.k(false);
                            break;
                        }
                        break;
                }
                return false;
            }
        });
        oVar.addTextChangedListener(new ch.e(o0Var, 16));
        frameLayout.addView(oVar, z5.e(-1, -1, 119));
        hh.o oVar2 = new hh.o(context, 5);
        this.U = oVar2;
        oVar2.setVisibility(8);
        oVar2.setAlpha(0.0f);
        oVar2.setTextSize(1, 15.66f);
        oVar2.setSingleLine(true);
        this.V = SharedConfig.searchEngineType;
        oVar2.setHint(LocaleController.formatString(R.string.AddressPlaceholder, k1.a().a));
        oVar2.setBackgroundResource(0);
        oVar2.setCursorWidth(1.5f);
        oVar2.setGravity(112);
        oVar2.setInputType(oVar2.getInputType() | TLObject.FLAG_19);
        oVar2.setImeOptions(33554434);
        oVar2.setTextIsSelectable(false);
        oVar2.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: org.telegram.ui.web.o1
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i13, KeyEvent keyEvent) {
                switch (i10) {
                    case 0:
                        if (keyEvent != null) {
                            if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                                AndroidUtilities.hideKeyboard(o0Var.R);
                                break;
                            }
                        }
                        break;
                    default:
                        if (i13 == 2) {
                            org.telegram.ui.o0 o0Var2 = o0Var;
                            gh.d1 d1Var = o0Var2.r0;
                            if (d1Var != null) {
                                d1Var.run(o0Var2.U.getText().toString());
                            }
                            o0Var2.k(false);
                            break;
                        }
                        break;
                }
                return false;
            }
        });
        frameLayout2.addView(oVar2, z5.d(-1, -1.0f, 119, 48.0f, 0.0f, 12.0f, 0.0f));
        ImageView imageView4 = new ImageView(context);
        this.F = imageView4;
        imageView4.setScaleType(scaleType);
        imageView4.setImageResource(R.drawable.ic_close_white);
        org.telegram.ui.Cells.z f05 = g6.f0(1090519039, 1, -1);
        this.G = f05;
        imageView4.setBackground(f05);
        imageView4.setVisibility(8);
        imageView4.setAlpha(0.0f);
        imageView4.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.web.n1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Utilities.Callback callback;
                switch (i10) {
                    case 0:
                        org.telegram.ui.o0 o0Var2 = o0Var;
                        if (o0Var2.getParent() instanceof ViewGroup) {
                            eg.o oVar3 = new eg.o(o0Var2, 4);
                            Utilities.Callback callback2 = null;
                            b70 F = b70.F((ViewGroup) o0Var2.getParent(), null, o0Var2.N);
                            F.s = 0;
                            F.S(o0Var2.i0, o0Var2.j0);
                            F.a0(0.0f, -AndroidUtilities.dp(52.0f));
                            F.S = 200;
                            int v = g6.v(o0Var2.h0, g6.l1(0.1f, o0Var2.i0));
                            F.l0 = Integer.valueOf(v);
                            int i13 = 0;
                            while (i13 < F.A.getChildCount()) {
                                View childAt = i13 == F.A.getChildCount() - 1 ? F.D : F.A.getChildAt(i13);
                                if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt;
                                    int i14 = 0;
                                    while (i14 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount()) {
                                        View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.H.getChildAt(i14);
                                        Utilities.Callback callback3 = callback2;
                                        if (childAt2 instanceof org.telegram.ui.ActionBar.f1) {
                                            ((org.telegram.ui.ActionBar.f1) childAt2).setSelectorColor(v);
                                        }
                                        i14++;
                                        callback2 = callback3;
                                    }
                                    callback = callback2;
                                } else {
                                    callback = callback2;
                                    if (childAt instanceof org.telegram.ui.ActionBar.f1) {
                                        ((org.telegram.ui.ActionBar.f1) childAt).setSelectorColor(v);
                                    }
                                }
                                i13++;
                                callback2 = callback;
                            }
                            Utilities.Callback callback4 = callback2;
                            if (AndroidUtilities.computePerceivedBrightness(o0Var2.h0) > 0.721f) {
                                F.P(-1);
                                F.T(-986896);
                            } else {
                                F.P(-14737633);
                                F.T(-15592942);
                            }
                            int i15 = o0Var2.c0;
                            if (i15 == 0) {
                                F.c(R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp), (Runnable) oVar3.run(3), false);
                                F.c(R.drawable.msg_search, LocaleController.getString(R.string.Search), (Runnable) oVar3.run(1), false);
                                F.l(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), (Runnable) oVar3.run(2), !o0Var2.m0);
                                F.c(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), (Runnable) oVar3.run(4), false);
                            } else if (i15 == 1) {
                                if (!o0Var2.l0) {
                                    F.c(R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp), (Runnable) oVar3.run(3), false);
                                    F.k();
                                }
                                if (o0Var2.k0) {
                                    F.c(R.drawable.msg_arrow_forward, LocaleController.getString(R.string.WebForward), (Runnable) oVar3.run(9), false);
                                }
                                c2 instantViewLoader = o0Var2.getInstantViewLoader();
                                if (instantViewLoader != null && (((!instantViewLoader.g || !instantViewLoader.i) && instantViewLoader.h == null && instantViewLoader.j == null && !instantViewLoader.c) || instantViewLoader.b() != null)) {
                                    F.c(R.drawable.menu_instant_view, LocaleController.getString(R.string.OpenLocalInstantView), (Runnable) oVar3.run(10), false);
                                    org.telegram.ui.ActionBar.f1 y10 = F.y();
                                    y10.setEnabled(instantViewLoader.b() != null);
                                    y10.setAlpha(y10.isEnabled() ? 1.0f : 0.5f);
                                    zh1 zh1Var = new zh1(6, y10, instantViewLoader);
                                    instantViewLoader.m.add(zh1Var);
                                    F.p = new zh1(10, instantViewLoader, zh1Var);
                                }
                                F.c(R.drawable.msg_reset, LocaleController.getString(R.string.Refresh), (Runnable) oVar3.run(5), false);
                                F.c(R.drawable.msg_search, LocaleController.getString(R.string.Search), (Runnable) oVar3.run(1), false);
                                F.c(R.drawable.msg_saved, LocaleController.getString(R.string.WebBookmark), (Runnable) oVar3.run(6), false);
                                F.c(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), (Runnable) oVar3.run(2), false);
                                F.k();
                                if (!b1.a(callback4).isEmpty()) {
                                    F.c(R.drawable.menu_views_recent, LocaleController.getString(R.string.WebHistory), (Runnable) oVar3.run(8), false);
                                }
                                F.c(R.drawable.menu_browser_bookmarks, LocaleController.getString(R.string.WebBookmarks), (Runnable) oVar3.run(7), false);
                                F.c(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), (Runnable) oVar3.run(4), false);
                            }
                            F.p = new tq0(o0Var2, 11);
                            F.Z();
                            break;
                        }
                        break;
                    default:
                        o0Var.R.setText("");
                        break;
                }
            }
        });
        addView(imageView4, z5.e(54, 56, 85));
        z70 z70Var = new z70(context);
        this.W = z70Var;
        z70Var.setPivotX(0.0f);
        z70Var.setPivotY(AndroidUtilities.dp(2.0f));
        addView(z70Var, z5.e(-1, 2, 87));
        setWillNotDraw(false);
        this.b[0] = new q1(o0Var);
        this.b[1] = new q1(o0Var);
        int i13 = g6.Pk;
        d(g6.w0(null, i13, false), false);
        setMenuColors(g6.w0(null, i13, false));
    }

    public final void a(Canvas canvas, float f10, float f11, boolean z10) {
        float f12;
        float max = Math.max(AndroidUtilities.dp(0.66f), 1);
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
            paintArr3[1].setAlpha((int) ((1.0f - this.T) * (1.0f - this.Q) * alpha2 * 1.0f));
            canvas.drawRect(rectF, paintArr3[1]);
            paintArr3[1].setAlpha(alpha2);
            if (z10) {
                rectF.set(0.0f, f13, width, f13 + max);
                int alpha3 = paintArr2[1].getAlpha();
                paintArr2[1].setAlpha((int) ((1.0f - this.T) * alpha3 * 1.0f * f11));
                canvas.drawRect(rectF, paintArr2[1]);
                paintArr2[1].setAlpha(alpha3);
            }
        } else {
            f12 = 1.0f;
        }
        float f15 = this.c;
        if (f15 < f12) {
            int l1 = g6.l1((f12 - f15) * f12, 1610612736);
            Paint paint = this.r;
            paint.setColor(l1);
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
        paintArr3[0].setAlpha((int) ((f12 - this.T) * (f12 - this.Q) * (f12 - Utilities.clamp01(this.c * 4.0f)) * alpha5 * f12));
        canvas.drawRect(rectF, paintArr3[0]);
        paintArr3[0].setAlpha(alpha5);
        if (z10) {
            rectF.set(width, f13, getWidth() + width, max + f13);
            int alpha6 = paintArr2[0].getAlpha();
            paintArr2[0].setAlpha((int) ((f12 - this.T) * alpha6 * f12 * f11));
            canvas.drawRect(rectF, paintArr2[0]);
            paintArr2[0].setAlpha(alpha6);
        }
    }

    public final void b(int i10, int i11) {
        boolean[] zArr = this.e;
        boolean z10 = zArr[i10];
        Paint[] paintArr = this.f;
        if (z10 && paintArr[i10].getColor() == i11) {
            return;
        }
        zArr[i10] = true;
        paintArr[i10].setColor(i11);
        float f10 = AndroidUtilities.computePerceivedBrightness(i11) <= 0.721f ? 1.0f : 0.0f;
        int d = i0.b.d(f10, -16777216, -1);
        this.h[i10].setColor(g6.v(i11, g6.l1(AndroidUtilities.lerp(0.07f, 0.2f, f10), d)));
        this.n[i10].setColor(g6.v(i11, g6.l1(AndroidUtilities.lerp(0.14f, 0.24f, f10), d)));
        q1[] q1VarArr = this.b;
        q1VarArr[i10].a.r(d);
        q1VarArr[i10].d = g6.v(i11, g6.l1(0.6f, d));
        q1 q1Var = q1VarArr[i10];
        q1Var.b.r(i0.b.d(q1VarArr[i10].c.c, q1Var.d, g6.w0(null, g6.q7, false)));
        invalidate();
    }

    public final void c(final int i10, float f10, boolean z10) {
        boolean[] zArr = this.e;
        if (zArr[2] && this.e0 == i10) {
            return;
        }
        if (z10) {
            ValueAnimator valueAnimator = this.g0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            int i11 = this.e0;
            this.d0 = i11;
            final float f11 = AndroidUtilities.computePerceivedBrightness(i11) <= 0.721f ? 1.0f : 0.0f;
            final float f12 = AndroidUtilities.computePerceivedBrightness(i10) > 0.721f ? 0.0f : 1.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.g0 = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.web.l1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    r1 r1Var = r1.this;
                    r1Var.getClass();
                    float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    r1Var.c(i0.b.d(floatValue, r1Var.d0, i10), AndroidUtilities.lerp(f11, f12, floatValue), false);
                }
            });
            this.g0.addListener(new fb(this, i10, f12, 2));
            this.g0.start();
            return;
        }
        zArr[2] = true;
        if (f10 < 0.0f) {
            f10 = AndroidUtilities.computePerceivedBrightness(i10) <= 0.721f ? 1.0f : 0.0f;
        }
        int d = i0.b.d(f10, -16777216, -1);
        this.w = d;
        g6.l1(0.55f, d);
        this.e0 = i10;
        this.x = i0.b.d(f10, -1, -16777216);
        int d10 = i0.b.d(1.0f - f10, -1, -16777216);
        this.y = d10;
        int i12 = this.x;
        m4 m4Var = ((org.telegram.ui.o0) this).x0;
        l lVar = m4Var.e0;
        if (lVar != null) {
            lVar.c(i12, d10);
        }
        this.s.setColor(this.x);
        this.v.setColor(g6.v(this.x, g6.l1(AndroidUtilities.lerp(0.07f, 0.2f, f10), this.w)));
        int l1 = g6.l1(0.6f, this.y);
        hh.o oVar = this.U;
        oVar.setHintTextColor(l1);
        oVar.setTextColor(this.y);
        oVar.setCursorColor(this.y);
        oVar.setHandlesColor(this.y);
        this.W.setProgressColor(g6.w0(null, g6.Rk, false));
        int d11 = i0.b.d(this.T, this.w, this.y);
        org.telegram.ui.ActionBar.g2 g2Var = this.I;
        g2Var.a(d11);
        g2Var.b(i0.b.d(this.T, this.w, this.y));
        int i13 = this.w;
        p1 p1Var = this.L;
        p1Var.c.setColor(i13);
        p1Var.invalidateSelf();
        int i14 = this.w;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.N.setColorFilter(new PorterDuffColorFilter(i14, mode));
        this.K.setColorFilter(new PorterDuffColorFilter(this.w, mode));
        this.F.setColorFilter(new PorterDuffColorFilter(this.w, mode));
        int v = g6.v(i10, g6.l1(0.22f, this.w));
        this.f0 = v;
        g6.B1(this.J, v, true);
        g6.B1(this.M, this.f0, true);
        g6.B1(this.O, this.f0, true);
        g6.B1(this.G, this.f0, true);
        int l12 = g6.l1(0.6f, this.w);
        hh.o oVar2 = this.R;
        oVar2.setHintTextColor(l12);
        oVar2.setTextColor(this.w);
        oVar2.setCursorColor(this.w);
        oVar2.setHandlesColor(this.w);
        z3 z3Var = m4Var.G;
        if (z3Var != null) {
            z3Var.i();
        }
        invalidate();
    }

    public final void d(int i10, boolean z10) {
        c(i10, -1.0f, z10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        a(canvas, (this.a0 ? AndroidUtilities.statusBarHeight : 0) + this.B, 1.0f, this.o0);
        float right = this.D.getRight();
        float left = this.E.getLeft();
        boolean z10 = this.a0;
        float f10 = z10 ? AndroidUtilities.statusBarHeight : 0;
        float f11 = (z10 ? AndroidUtilities.statusBarHeight : 0) + this.B;
        float f12 = this.c;
        q1[] q1VarArr = this.b;
        if (f12 < 1.0f) {
            canvas.save();
            float width = (getWidth() * this.c) - (Utilities.clamp01(this.c * 2.0f) * AndroidUtilities.dp(30.0f));
            canvas.translate(right + width, f10);
            AndroidUtilities.lerp(1.0f, 0.5f, this.c);
            q1VarArr[0].a(canvas, (left - right) - width, f11 - f10, (1.0f - this.Q) * (1.0f - this.c));
            canvas.restore();
        }
        if (this.c > 0.0f) {
            float width2 = getWidth() * this.c;
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, width2, getHeight());
            canvas.translate(right, f10);
            canvas.translate((1.0f - this.c) * AndroidUtilities.dp(-12.0f), 0.0f);
            float lerp = AndroidUtilities.lerp(1.0f, 0.5f, 1.0f - this.c);
            float f13 = f11 - f10;
            canvas.scale(lerp, lerp, 0.0f, f13 / 2.0f);
            q1VarArr[1].a(canvas, left - right, f13, (1.0f - this.T) * (1.0f - this.Q) * this.c);
            canvas.restore();
        }
        float f14 = this.T;
        RectF rectF = this.a;
        if (f14 > 0.0f) {
            Paint paint = this.s;
            int alpha = paint.getAlpha();
            paint.setAlpha((int) (alpha * this.T));
            canvas.drawRect(0.0f, 0.0f, getWidth(), (this.a0 ? AndroidUtilities.statusBarHeight : 0) + this.B, paint);
            paint.setAlpha(alpha);
            float f15 = (f10 + f11) / 2.0f;
            float dp = AndroidUtilities.dp(42.0f) / 2.0f;
            rectF.set(AndroidUtilities.dp(6.0f), f15 - dp, AndroidUtilities.lerp(left, getWidth() - AndroidUtilities.dp(6.0f), this.T), f15 + dp);
            Paint paint2 = this.v;
            int alpha2 = paint2.getAlpha();
            paint2.setAlpha((int) (alpha2 * this.T));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), paint2);
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
        w0 webView;
        int action = motionEvent.getAction();
        m1 m1Var = this.v0;
        if (action == 0) {
            this.w0 = false;
            AndroidUtilities.cancelRunOnUIThread(m1Var);
            if (motionEvent.getX() > this.D.getRight() && motionEvent.getX() < this.E.getLeft() && !this.P && !this.S) {
                this.t0 = motionEvent.getX();
                motionEvent.getY();
                this.u0 = System.currentTimeMillis();
                AndroidUtilities.runOnUIThread(m1Var, (long) (ViewConfiguration.getLongPressTimeout() * 0.8f));
            }
        } else if (motionEvent.getAction() == 2 && System.currentTimeMillis() - this.u0 > ViewConfiguration.getLongPressTimeout() * 0.8f) {
            AndroidUtilities.cancelRunOnUIThread(m1Var);
            this.w0 = true;
            float x8 = (motionEvent.getX() - this.t0) / (getWidth() * 0.8f);
            q3 q3Var = ((org.telegram.ui.o0) this).x0.q0[0];
            float clamp01 = Utilities.clamp01(q3Var.getProgress() + x8);
            if (!q3Var.c() && q3Var.f() && (webView = q3Var.f.getWebView()) != null) {
                webView.setScrollProgress(clamp01);
                q3Var.G.f0();
            }
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(m1Var);
            this.u0 = 0L;
        }
        this.t0 = motionEvent.getX();
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e(int i10, boolean z10) {
        q1 q1Var = this.b[i10];
        if (q1Var.e != z10) {
            q1Var.e = z10;
            q1Var.c.d(z10 ? 1.0f : 0.0f, true);
            invalidate();
        }
    }

    public final void f(int i10, String str) {
        q1[] q1VarArr = this.b;
        CharSequence charSequence = q1VarArr[i10].b.g;
        if (charSequence == null || !TextUtils.equals(charSequence.toString(), str)) {
            q1VarArr[i10].b.q(Emoji.replaceEmoji(str, q1VarArr[i10].b.a.getFontMetricsInt(), false), false, true);
        }
    }

    public final void g(int i10, String str, boolean z10) {
        q1[] q1VarArr = this.b;
        CharSequence charSequence = q1VarArr[i10].a.g;
        if (charSequence == null || !TextUtils.equals(charSequence.toString(), str)) {
            q1VarArr[i10].a.q(Emoji.replaceEmoji(str, q1VarArr[i10].a.a.getFontMetricsInt(), false), z10, true);
        }
    }

    public int getBackgroundColor() {
        return this.e0;
    }

    public c2 getInstantViewLoader() {
        return null;
    }

    public int getTextColor() {
        return this.w;
    }

    public String getTitle() {
        CharSequence charSequence = this.b[0].a.g;
        return charSequence == null ? "" : charSequence.toString();
    }

    public final void h(boolean z10) {
        if (this.P == z10) {
            return;
        }
        ValueAnimator valueAnimator = this.p0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.P = z10;
        hh.o oVar = this.R;
        boolean z11 = false;
        oVar.setVisibility(0);
        this.I.c((this.q0 || z10) ? 0.0f : 1.0f, true);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.Q, z10 ? 1.0f : 0.0f);
        this.p0 = ofFloat;
        ofFloat.addUpdateListener(new m2(this, 16));
        this.p0.addListener(new n40(13, this, z10));
        this.p0.setInterpolator(er.h);
        this.p0.setDuration(320L);
        this.p0.start();
        boolean z12 = !z10;
        AndroidUtilities.updateViewShow(this.K, z12, true, true);
        AndroidUtilities.updateViewShow(this.N, z12, true, true);
        if (oVar.length() > 0 && this.P) {
            z11 = true;
        }
        AndroidUtilities.updateViewShow(this.F, z11, true, true);
    }

    public final void i() {
        q1[] q1VarArr = this.b;
        q1 q1Var = q1VarArr[0];
        q1VarArr[0] = q1VarArr[1];
        q1VarArr[1] = q1Var;
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
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, rl.B(56.0f, this.a0 ? AndroidUtilities.statusBarHeight : 0, TLObject.FLAG_30));
    }

    public void setBackButton(boolean z10) {
        this.q0 = z10;
        if (this.P || this.S) {
            return;
        }
        this.I.c(z10 ? 0.0f : 1.0f, true);
    }

    public void setBackButtonCached(boolean z10) {
        this.q0 = z10;
    }

    public void setHasForward(boolean z10) {
        this.k0 = z10;
    }

    public void setHeight(int i10) {
        if (this.B != i10) {
            this.B = i10;
            float pow = (float) Math.pow(i10 / AndroidUtilities.dp(56.0f), 0.5d);
            this.C = pow;
            hh.m mVar = this.D;
            mVar.setScaleX(pow);
            mVar.setScaleY(this.C);
            mVar.setTranslationX((1.0f - this.C) * AndroidUtilities.dp(42.0f));
            mVar.setTranslationY((1.0f - this.C) * AndroidUtilities.dp(-12.0f));
            float f10 = this.C;
            hh.m mVar2 = this.E;
            mVar2.setScaleX(f10);
            mVar2.setScaleY(this.C);
            mVar2.setTranslationX((1.0f - this.C) * (-AndroidUtilities.dp(42.0f)));
            mVar2.setTranslationY((1.0f - this.C) * AndroidUtilities.dp(-12.0f));
            this.W.setTranslationY(this.B - AndroidUtilities.dp(56.0f));
            invalidate();
        }
    }

    public void setIsLocal(boolean z10) {
        this.m0 = z10;
    }

    public void setIsTonsite(boolean z10) {
        this.l0 = z10;
    }

    public void setMenuColors(int i10) {
        double[] j10 = e5.j(e5.a, e5.j(e5.c, new double[]{Color.red(i10) / 255.0d, Color.green(i10) / 255.0d, Color.blue(i10) / 255.0d}));
        for (int i11 = 0; i11 < 3; i11++) {
            j10[i11] = Math.cbrt(j10[i11]);
        }
        double[] j11 = e5.j(e5.b, j10);
        double d = j11[0];
        double d10 = j11[1];
        double d11 = j11[2];
        boolean z10 = new double[]{d, Math.sqrt(Math.pow(d11, 2.0d) + Math.pow(d10, 2.0d)), ((Math.abs(d10) > 2.0E-4d ? 1 : (Math.abs(d10) == 2.0E-4d ? 0 : -1)) >= 0 || (Math.abs(d11) > 2.0E-4d ? 1 : (Math.abs(d11) == 2.0E-4d ? 0 : -1)) >= 0) ? ((((Math.atan2(d11, d10) * 180.0d) / 3.141592653589793d) % 360.0d) + 360.0d) % 360.0d : Double.NaN}[0] < 0.5d;
        this.h0 = z10 ? -16777216 : -1;
        int i12 = z10 ? -1 : -16777216;
        this.i0 = i12;
        this.j0 = g6.l1(0.6f, i12);
    }

    public void setMenuListener(Utilities.Callback<Integer> callback) {
        this.b0 = callback;
    }

    public void setMenuType(int i10) {
        if (this.c0 != i10) {
            this.c0 = i10;
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
