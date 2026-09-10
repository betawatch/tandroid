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
import bi.c9;
import bi.u2;
import bi.y2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.em;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.i5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.o00;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.w80;
import org.telegram.ui.Components.wr;
import org.telegram.ui.iw0;
import org.telegram.ui.j4;
import org.telegram.ui.m20;
import org.telegram.ui.n3;
import org.telegram.ui.r91;
import org.telegram.ui.w3;
import org.telegram.ui.zd;
import w7.a6;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public abstract class v1 extends FrameLayout {
    public boolean A0;
    public final TextPaint E;
    public int F;
    public float G;
    public final zd H;
    public final zd I;
    public final ImageView J;
    public final org.telegram.ui.Cells.z K;
    public final ImageView L;
    public final org.telegram.ui.ActionBar.i2 M;
    public final org.telegram.ui.Cells.z N;
    public final ImageView O;
    public final t1 P;
    public final org.telegram.ui.Cells.z Q;
    public final ImageView R;
    public final org.telegram.ui.Cells.z S;
    public boolean T;
    public float U;
    public final ei.o V;
    public boolean W;
    public final RectF a;
    public float a0;
    public final u1[] b;
    public final ei.o b0;
    public float c;
    public int c0;
    public final float[] d;
    public final w80 d0;
    public final boolean[] e;
    public boolean e0;
    public final Paint[] f;
    public Utilities.Callback f0;
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
    public final m20 r0;
    public final Paint s;
    public boolean s0;
    public ValueAnimator t0;
    public boolean u0;
    public final Paint v;
    public y2 v0;
    public int w;
    public ValueAnimator w0;
    public int x;
    public float x0;
    public int y;
    public long y0;
    public final q1 z0;

    public v1(Context context) {
        super(context);
        this.a = new RectF();
        this.b = new u1[2];
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
        this.E = textPaint;
        this.F = AndroidUtilities.dp(56.0f);
        this.G = 1.0f;
        this.U = 0.0f;
        this.a0 = 0.0f;
        this.g0 = -1;
        this.r0 = new m20();
        final org.telegram.ui.l0 l0Var = (org.telegram.ui.l0) this;
        final int i11 = 0;
        this.z0 = new q1(l0Var, i11);
        this.A0 = false;
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(18.33f));
        for (int i12 = 0; i12 < 2; i12++) {
            this.f[i12] = new Paint(1);
            this.h[i12] = new Paint(1);
            this.n[i12] = new Paint(1);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, a6.e(-1, 56, 87));
        FrameLayout frameLayout2 = new FrameLayout(context);
        addView(frameLayout2, a6.e(-1, 56, 87));
        zd zdVar = new zd(context, 6);
        this.H = zdVar;
        zdVar.setOrientation(0);
        addView(zdVar, a6.e(-2, 56, 83));
        ImageView imageView = new ImageView(context);
        this.L = imageView;
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        org.telegram.ui.ActionBar.i2 i2Var = new org.telegram.ui.ActionBar.i2(false);
        this.M = i2Var;
        i2Var.k = 200.0f;
        i2Var.c(1.0f, false);
        imageView.setImageDrawable(i2Var);
        org.telegram.ui.Cells.z f02 = j6.f0(1090519039, 1, -1);
        this.N = f02;
        imageView.setBackground(f02);
        zdVar.addView(imageView, a6.n(54, 56));
        zd zdVar2 = new zd(context, 7);
        this.I = zdVar2;
        zdVar2.setOrientation(0);
        addView(zdVar2, a6.e(-2, 56, 85));
        ImageView imageView2 = new ImageView(context);
        this.O = imageView2;
        imageView2.setScaleType(scaleType);
        t1 t1Var = new t1(l0Var);
        this.P = t1Var;
        imageView2.setImageDrawable(t1Var);
        t1Var.f();
        org.telegram.ui.Cells.z f03 = j6.f0(1090519039, 1, -1);
        this.Q = f03;
        imageView2.setBackground(f03);
        zdVar2.addView(imageView2, a6.n(54, 56));
        ImageView imageView3 = new ImageView(context);
        this.R = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.ic_ab_other);
        imageView3.setColorFilter(new PorterDuffColorFilter(0, PorterDuff.Mode.SRC_IN));
        imageView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.web.r1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Utilities.Callback callback;
                switch (i11) {
                    case 0:
                        org.telegram.ui.l0 l0Var2 = l0Var;
                        if (l0Var2.getParent() instanceof ViewGroup) {
                            c9 c9Var = new c9(l0Var2, 2);
                            Utilities.Callback callback2 = null;
                            w70 F = w70.F((ViewGroup) l0Var2.getParent(), null, l0Var2.R);
                            F.s = 0;
                            F.S(l0Var2.m0, l0Var2.n0);
                            F.a0(0.0f, -AndroidUtilities.dp(52.0f));
                            F.S = 200;
                            int v = j6.v(l0Var2.l0, j6.l1(0.1f, l0Var2.m0));
                            F.l0 = Integer.valueOf(v);
                            int i13 = 0;
                            while (i13 < F.A.getChildCount()) {
                                View childAt = i13 == F.A.getChildCount() - 1 ? F.D : F.A.getChildAt(i13);
                                if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt;
                                    int i14 = 0;
                                    while (i14 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount()) {
                                        View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i14);
                                        Utilities.Callback callback3 = callback2;
                                        if (childAt2 instanceof org.telegram.ui.ActionBar.g1) {
                                            ((org.telegram.ui.ActionBar.g1) childAt2).setSelectorColor(v);
                                        }
                                        i14++;
                                        callback2 = callback3;
                                    }
                                    callback = callback2;
                                } else {
                                    callback = callback2;
                                    if (childAt instanceof org.telegram.ui.ActionBar.g1) {
                                        ((org.telegram.ui.ActionBar.g1) childAt).setSelectorColor(v);
                                    }
                                }
                                i13++;
                                callback2 = callback;
                            }
                            Utilities.Callback callback4 = callback2;
                            if (AndroidUtilities.computePerceivedBrightness(l0Var2.l0) > 0.721f) {
                                F.P(-1);
                                F.T(-986896);
                            } else {
                                F.P(-14737633);
                                F.T(-15592942);
                            }
                            int i15 = l0Var2.g0;
                            if (i15 == 0) {
                                F.c(R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp), (Runnable) c9Var.run(3), false);
                                F.c(R.drawable.msg_search, LocaleController.getString(R.string.Search), (Runnable) c9Var.run(1), false);
                                F.l(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), (Runnable) c9Var.run(2), !l0Var2.q0);
                                F.c(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), (Runnable) c9Var.run(4), false);
                            } else if (i15 == 1) {
                                if (!l0Var2.p0) {
                                    F.c(R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp), (Runnable) c9Var.run(3), false);
                                    F.k();
                                }
                                if (l0Var2.o0) {
                                    F.c(R.drawable.msg_arrow_forward, LocaleController.getString(R.string.WebForward), (Runnable) c9Var.run(9), false);
                                }
                                i2 instantViewLoader = l0Var2.getInstantViewLoader();
                                if (instantViewLoader != null && (((!instantViewLoader.g || !instantViewLoader.i) && instantViewLoader.h == null && instantViewLoader.j == null && !instantViewLoader.c) || instantViewLoader.b() != null)) {
                                    F.c(R.drawable.menu_instant_view, LocaleController.getString(R.string.OpenLocalInstantView), (Runnable) c9Var.run(10), false);
                                    org.telegram.ui.ActionBar.g1 y3 = F.y();
                                    y3.setEnabled(instantViewLoader.b() != null);
                                    y3.setAlpha(y3.isEnabled() ? 1.0f : 0.5f);
                                    r91 r91Var = new r91(28, y3, instantViewLoader);
                                    instantViewLoader.m.add(r91Var);
                                    F.p = new x1(2, instantViewLoader, r91Var);
                                }
                                F.c(R.drawable.msg_reset, LocaleController.getString(R.string.Refresh), (Runnable) c9Var.run(5), false);
                                F.c(R.drawable.msg_search, LocaleController.getString(R.string.Search), (Runnable) c9Var.run(1), false);
                                F.c(R.drawable.msg_saved, LocaleController.getString(R.string.WebBookmark), (Runnable) c9Var.run(6), false);
                                F.c(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), (Runnable) c9Var.run(2), false);
                                F.k();
                                if (!f1.a(callback4).isEmpty()) {
                                    F.c(R.drawable.menu_views_recent, LocaleController.getString(R.string.WebHistory), (Runnable) c9Var.run(8), false);
                                }
                                F.c(R.drawable.menu_browser_bookmarks, LocaleController.getString(R.string.WebBookmarks), (Runnable) c9Var.run(7), false);
                                F.c(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), (Runnable) c9Var.run(4), false);
                            }
                            F.p = new d1(l0Var2, 2);
                            F.Z();
                            break;
                        }
                        break;
                    default:
                        l0Var.V.setText("");
                        break;
                }
            }
        });
        org.telegram.ui.Cells.z f04 = j6.f0(1090519039, 1, -1);
        this.S = f04;
        imageView3.setBackground(f04);
        imageView3.setContentDescription(LocaleController.getString("AccDescrMoreOptions", R.string.AccDescrMoreOptions));
        zdVar2.addView(imageView3, a6.n(54, 56));
        ei.o oVar = new ei.o(context, 3);
        this.V = oVar;
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
        oVar.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: org.telegram.ui.web.s1
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i13, KeyEvent keyEvent) {
                switch (i11) {
                    case 0:
                        if (keyEvent != null) {
                            if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                                AndroidUtilities.hideKeyboard(l0Var.V);
                                break;
                            }
                        }
                        break;
                    default:
                        if (i13 == 2) {
                            org.telegram.ui.l0 l0Var2 = l0Var;
                            y2 y2Var = l0Var2.v0;
                            if (y2Var != null) {
                                y2Var.run(l0Var2.b0.getText().toString());
                            }
                            l0Var2.k(false);
                            break;
                        }
                        break;
                }
                return false;
            }
        });
        oVar.addTextChangedListener(new u2(l0Var, 15));
        frameLayout.addView(oVar, a6.e(-1, -1, 119));
        ei.o oVar2 = new ei.o(context, 4);
        this.b0 = oVar2;
        oVar2.setVisibility(8);
        oVar2.setAlpha(0.0f);
        oVar2.setTextSize(1, 15.66f);
        oVar2.setSingleLine(true);
        this.c0 = SharedConfig.searchEngineType;
        oVar2.setHint(LocaleController.formatString(R.string.AddressPlaceholder, o1.a().a));
        oVar2.setBackgroundResource(0);
        oVar2.setCursorWidth(1.5f);
        oVar2.setGravity(112);
        oVar2.setInputType(oVar2.getInputType() | TLObject.FLAG_19);
        oVar2.setImeOptions(33554434);
        oVar2.setTextIsSelectable(false);
        oVar2.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: org.telegram.ui.web.s1
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i13, KeyEvent keyEvent) {
                switch (i10) {
                    case 0:
                        if (keyEvent != null) {
                            if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                                AndroidUtilities.hideKeyboard(l0Var.V);
                                break;
                            }
                        }
                        break;
                    default:
                        if (i13 == 2) {
                            org.telegram.ui.l0 l0Var2 = l0Var;
                            y2 y2Var = l0Var2.v0;
                            if (y2Var != null) {
                                y2Var.run(l0Var2.b0.getText().toString());
                            }
                            l0Var2.k(false);
                            break;
                        }
                        break;
                }
                return false;
            }
        });
        frameLayout2.addView(oVar2, a6.d(-1, -1.0f, 119, 48.0f, 0.0f, 12.0f, 0.0f));
        ImageView imageView4 = new ImageView(context);
        this.J = imageView4;
        imageView4.setScaleType(scaleType);
        imageView4.setImageResource(R.drawable.ic_close_white);
        org.telegram.ui.Cells.z f05 = j6.f0(1090519039, 1, -1);
        this.K = f05;
        imageView4.setBackground(f05);
        imageView4.setVisibility(8);
        imageView4.setAlpha(0.0f);
        imageView4.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.web.r1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Utilities.Callback callback;
                switch (i10) {
                    case 0:
                        org.telegram.ui.l0 l0Var2 = l0Var;
                        if (l0Var2.getParent() instanceof ViewGroup) {
                            c9 c9Var = new c9(l0Var2, 2);
                            Utilities.Callback callback2 = null;
                            w70 F = w70.F((ViewGroup) l0Var2.getParent(), null, l0Var2.R);
                            F.s = 0;
                            F.S(l0Var2.m0, l0Var2.n0);
                            F.a0(0.0f, -AndroidUtilities.dp(52.0f));
                            F.S = 200;
                            int v = j6.v(l0Var2.l0, j6.l1(0.1f, l0Var2.m0));
                            F.l0 = Integer.valueOf(v);
                            int i13 = 0;
                            while (i13 < F.A.getChildCount()) {
                                View childAt = i13 == F.A.getChildCount() - 1 ? F.D : F.A.getChildAt(i13);
                                if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt;
                                    int i14 = 0;
                                    while (i14 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount()) {
                                        View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i14);
                                        Utilities.Callback callback3 = callback2;
                                        if (childAt2 instanceof org.telegram.ui.ActionBar.g1) {
                                            ((org.telegram.ui.ActionBar.g1) childAt2).setSelectorColor(v);
                                        }
                                        i14++;
                                        callback2 = callback3;
                                    }
                                    callback = callback2;
                                } else {
                                    callback = callback2;
                                    if (childAt instanceof org.telegram.ui.ActionBar.g1) {
                                        ((org.telegram.ui.ActionBar.g1) childAt).setSelectorColor(v);
                                    }
                                }
                                i13++;
                                callback2 = callback;
                            }
                            Utilities.Callback callback4 = callback2;
                            if (AndroidUtilities.computePerceivedBrightness(l0Var2.l0) > 0.721f) {
                                F.P(-1);
                                F.T(-986896);
                            } else {
                                F.P(-14737633);
                                F.T(-15592942);
                            }
                            int i15 = l0Var2.g0;
                            if (i15 == 0) {
                                F.c(R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp), (Runnable) c9Var.run(3), false);
                                F.c(R.drawable.msg_search, LocaleController.getString(R.string.Search), (Runnable) c9Var.run(1), false);
                                F.l(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), (Runnable) c9Var.run(2), !l0Var2.q0);
                                F.c(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), (Runnable) c9Var.run(4), false);
                            } else if (i15 == 1) {
                                if (!l0Var2.p0) {
                                    F.c(R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp), (Runnable) c9Var.run(3), false);
                                    F.k();
                                }
                                if (l0Var2.o0) {
                                    F.c(R.drawable.msg_arrow_forward, LocaleController.getString(R.string.WebForward), (Runnable) c9Var.run(9), false);
                                }
                                i2 instantViewLoader = l0Var2.getInstantViewLoader();
                                if (instantViewLoader != null && (((!instantViewLoader.g || !instantViewLoader.i) && instantViewLoader.h == null && instantViewLoader.j == null && !instantViewLoader.c) || instantViewLoader.b() != null)) {
                                    F.c(R.drawable.menu_instant_view, LocaleController.getString(R.string.OpenLocalInstantView), (Runnable) c9Var.run(10), false);
                                    org.telegram.ui.ActionBar.g1 y3 = F.y();
                                    y3.setEnabled(instantViewLoader.b() != null);
                                    y3.setAlpha(y3.isEnabled() ? 1.0f : 0.5f);
                                    r91 r91Var = new r91(28, y3, instantViewLoader);
                                    instantViewLoader.m.add(r91Var);
                                    F.p = new x1(2, instantViewLoader, r91Var);
                                }
                                F.c(R.drawable.msg_reset, LocaleController.getString(R.string.Refresh), (Runnable) c9Var.run(5), false);
                                F.c(R.drawable.msg_search, LocaleController.getString(R.string.Search), (Runnable) c9Var.run(1), false);
                                F.c(R.drawable.msg_saved, LocaleController.getString(R.string.WebBookmark), (Runnable) c9Var.run(6), false);
                                F.c(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), (Runnable) c9Var.run(2), false);
                                F.k();
                                if (!f1.a(callback4).isEmpty()) {
                                    F.c(R.drawable.menu_views_recent, LocaleController.getString(R.string.WebHistory), (Runnable) c9Var.run(8), false);
                                }
                                F.c(R.drawable.menu_browser_bookmarks, LocaleController.getString(R.string.WebBookmarks), (Runnable) c9Var.run(7), false);
                                F.c(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), (Runnable) c9Var.run(4), false);
                            }
                            F.p = new d1(l0Var2, 2);
                            F.Z();
                            break;
                        }
                        break;
                    default:
                        l0Var.V.setText("");
                        break;
                }
            }
        });
        addView(imageView4, a6.e(54, 56, 85));
        w80 w80Var = new w80(context);
        this.d0 = w80Var;
        w80Var.setPivotX(0.0f);
        w80Var.setPivotY(AndroidUtilities.dp(2.0f));
        addView(w80Var, a6.e(-1, 2, 87));
        setWillNotDraw(false);
        this.b[0] = new u1(l0Var);
        this.b[1] = new u1(l0Var);
        int i13 = j6.Pk;
        d(j6.w0(null, i13, false), false);
        setMenuColors(j6.w0(null, i13, false));
    }

    public final void a(Canvas canvas, float f7, float f10, boolean z10) {
        float f11;
        float max = Math.max(AndroidUtilities.dp(0.66f), 1);
        float f12 = f7 - max;
        float width = getWidth() * this.c;
        float width2 = getWidth();
        RectF rectF = this.a;
        rectF.set(0.0f, 0.0f, width2, f7);
        Paint[] paintArr = this.f;
        int alpha = paintArr[1].getAlpha();
        paintArr[1].setAlpha((int) (alpha * 1.0f));
        canvas.drawRect(rectF, paintArr[1]);
        paintArr[1].setAlpha(alpha);
        float f13 = this.c;
        float[] fArr = this.d;
        Paint[] paintArr2 = this.n;
        Paint[] paintArr3 = this.h;
        if (f13 > 0.0f) {
            rectF.set(0.0f, 0.0f, fArr[1] * getWidth(), f7);
            int alpha2 = paintArr3[1].getAlpha();
            f11 = 1.0f;
            paintArr3[1].setAlpha((int) ((1.0f - this.a0) * (1.0f - this.U) * alpha2 * 1.0f));
            canvas.drawRect(rectF, paintArr3[1]);
            paintArr3[1].setAlpha(alpha2);
            if (z10) {
                rectF.set(0.0f, f12, width, f12 + max);
                int alpha3 = paintArr2[1].getAlpha();
                paintArr2[1].setAlpha((int) ((1.0f - this.a0) * alpha3 * 1.0f * f10));
                canvas.drawRect(rectF, paintArr2[1]);
                paintArr2[1].setAlpha(alpha3);
            }
        } else {
            f11 = 1.0f;
        }
        float f14 = this.c;
        if (f14 < f11) {
            int l1 = j6.l1((f11 - f14) * f11, 1610612736);
            Paint paint = this.r;
            paint.setColor(l1);
            rectF.set(0.0f, 0.0f, width, f7);
            canvas.drawRect(rectF, paint);
            rectF.set(width, 0.0f, getWidth(), f7);
            int alpha4 = paintArr[0].getAlpha();
            paintArr[0].setAlpha((int) (alpha4 * f11));
            canvas.drawRect(rectF, paintArr[0]);
            paintArr[0].setAlpha(alpha4);
        }
        rectF.set(width, 0.0f, (fArr[0] * getWidth()) + width, f7);
        int alpha5 = paintArr3[0].getAlpha();
        paintArr3[0].setAlpha((int) ((f11 - this.a0) * (f11 - this.U) * (f11 - Utilities.clamp01(this.c * 4.0f)) * alpha5 * f11));
        canvas.drawRect(rectF, paintArr3[0]);
        paintArr3[0].setAlpha(alpha5);
        if (z10) {
            rectF.set(width, f12, getWidth() + width, max + f12);
            int alpha6 = paintArr2[0].getAlpha();
            paintArr2[0].setAlpha((int) ((f11 - this.a0) * alpha6 * f11 * f10));
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
        float f7 = AndroidUtilities.computePerceivedBrightness(i11) <= 0.721f ? 1.0f : 0.0f;
        int d = i0.a.d(f7, -16777216, -1);
        this.h[i10].setColor(j6.v(i11, j6.l1(AndroidUtilities.lerp(0.07f, 0.2f, f7), d)));
        this.n[i10].setColor(j6.v(i11, j6.l1(AndroidUtilities.lerp(0.14f, 0.24f, f7), d)));
        u1[] u1VarArr = this.b;
        u1VarArr[i10].a.r(d);
        u1VarArr[i10].d = j6.v(i11, j6.l1(0.6f, d));
        u1 u1Var = u1VarArr[i10];
        u1Var.b.r(i0.a.d(u1VarArr[i10].c.c, u1Var.d, j6.w0(null, j6.q7, false)));
        invalidate();
    }

    public final void c(final int i10, float f7, boolean z10) {
        boolean[] zArr = this.e;
        if (zArr[2] && this.i0 == i10) {
            return;
        }
        if (z10) {
            ValueAnimator valueAnimator = this.k0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            int i11 = this.i0;
            this.h0 = i11;
            final float f10 = AndroidUtilities.computePerceivedBrightness(i11) <= 0.721f ? 1.0f : 0.0f;
            final float f11 = AndroidUtilities.computePerceivedBrightness(i10) > 0.721f ? 0.0f : 1.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.k0 = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.web.p1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    v1 v1Var = v1.this;
                    v1Var.getClass();
                    float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    v1Var.c(i0.a.d(floatValue, v1Var.h0, i10), AndroidUtilities.lerp(f10, f11, floatValue), false);
                }
            });
            this.k0.addListener(new o00(this, i10, f11, 1));
            this.k0.start();
            return;
        }
        zArr[2] = true;
        if (f7 < 0.0f) {
            f7 = AndroidUtilities.computePerceivedBrightness(i10) <= 0.721f ? 1.0f : 0.0f;
        }
        int d = i0.a.d(f7, -16777216, -1);
        this.w = d;
        j6.l1(0.55f, d);
        this.i0 = i10;
        this.x = i0.a.d(f7, -1, -16777216);
        int d10 = i0.a.d(1.0f - f7, -1, -16777216);
        this.y = d10;
        int i12 = this.x;
        j4 j4Var = ((org.telegram.ui.l0) this).B0;
        l lVar = j4Var.i0;
        if (lVar != null) {
            lVar.c(i12, d10);
        }
        this.s.setColor(this.x);
        this.v.setColor(j6.v(this.x, j6.l1(AndroidUtilities.lerp(0.07f, 0.2f, f7), this.w)));
        int l1 = j6.l1(0.6f, this.y);
        ei.o oVar = this.b0;
        oVar.setHintTextColor(l1);
        oVar.setTextColor(this.y);
        oVar.setCursorColor(this.y);
        oVar.setHandlesColor(this.y);
        this.d0.setProgressColor(j6.w0(null, j6.Rk, false));
        int d11 = i0.a.d(this.a0, this.w, this.y);
        org.telegram.ui.ActionBar.i2 i2Var = this.M;
        i2Var.a(d11);
        i2Var.b(i0.a.d(this.a0, this.w, this.y));
        int i13 = this.w;
        t1 t1Var = this.P;
        t1Var.c.setColor(i13);
        t1Var.invalidateSelf();
        int i14 = this.w;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.R.setColorFilter(new PorterDuffColorFilter(i14, mode));
        this.O.setColorFilter(new PorterDuffColorFilter(this.w, mode));
        this.J.setColorFilter(new PorterDuffColorFilter(this.w, mode));
        int v = j6.v(i10, j6.l1(0.22f, this.w));
        this.j0 = v;
        j6.B1(this.N, v, true);
        j6.B1(this.Q, this.j0, true);
        j6.B1(this.S, this.j0, true);
        j6.B1(this.K, this.j0, true);
        int l12 = j6.l1(0.6f, this.w);
        ei.o oVar2 = this.V;
        oVar2.setHintTextColor(l12);
        oVar2.setTextColor(this.w);
        oVar2.setCursorColor(this.w);
        oVar2.setHandlesColor(this.w);
        w3 w3Var = j4Var.K;
        if (w3Var != null) {
            w3Var.i();
        }
        invalidate();
    }

    public final void d(int i10, boolean z10) {
        c(i10, -1.0f, z10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        a(canvas, (this.e0 ? AndroidUtilities.statusBarHeight : 0) + this.F, 1.0f, this.s0);
        float right = this.H.getRight();
        float left = this.I.getLeft();
        boolean z10 = this.e0;
        float f7 = z10 ? AndroidUtilities.statusBarHeight : 0;
        float f10 = (z10 ? AndroidUtilities.statusBarHeight : 0) + this.F;
        float f11 = this.c;
        u1[] u1VarArr = this.b;
        if (f11 < 1.0f) {
            canvas.save();
            float width = (getWidth() * this.c) - (Utilities.clamp01(this.c * 2.0f) * AndroidUtilities.dp(30.0f));
            canvas.translate(right + width, f7);
            AndroidUtilities.lerp(1.0f, 0.5f, this.c);
            u1VarArr[0].a(canvas, (left - right) - width, f10 - f7, (1.0f - this.U) * (1.0f - this.c));
            canvas.restore();
        }
        if (this.c > 0.0f) {
            float width2 = getWidth() * this.c;
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, width2, getHeight());
            canvas.translate(right, f7);
            canvas.translate((1.0f - this.c) * AndroidUtilities.dp(-12.0f), 0.0f);
            float lerp = AndroidUtilities.lerp(1.0f, 0.5f, 1.0f - this.c);
            float f12 = f10 - f7;
            canvas.scale(lerp, lerp, 0.0f, f12 / 2.0f);
            u1VarArr[1].a(canvas, left - right, f12, (1.0f - this.a0) * (1.0f - this.U) * this.c);
            canvas.restore();
        }
        float f13 = this.a0;
        RectF rectF = this.a;
        if (f13 > 0.0f) {
            Paint paint = this.s;
            int alpha = paint.getAlpha();
            paint.setAlpha((int) (alpha * this.a0));
            canvas.drawRect(0.0f, 0.0f, getWidth(), (this.e0 ? AndroidUtilities.statusBarHeight : 0) + this.F, paint);
            paint.setAlpha(alpha);
            float f14 = (f7 + f10) / 2.0f;
            float dp = AndroidUtilities.dp(42.0f) / 2.0f;
            rectF.set(AndroidUtilities.dp(6.0f), f14 - dp, AndroidUtilities.lerp(left, getWidth() - AndroidUtilities.dp(6.0f), this.a0), f14 + dp);
            Paint paint2 = this.v;
            int alpha2 = paint2.getAlpha();
            paint2.setAlpha((int) (alpha2 * this.a0));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), paint2);
            paint2.setAlpha(alpha2);
        }
        rectF.set(0.0f, f7, getWidth(), f10);
        canvas.save();
        canvas.clipRect(rectF);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        y0 webView;
        int action = motionEvent.getAction();
        q1 q1Var = this.z0;
        if (action == 0) {
            this.A0 = false;
            AndroidUtilities.cancelRunOnUIThread(q1Var);
            if (motionEvent.getX() > this.H.getRight() && motionEvent.getX() < this.I.getLeft() && !this.T && !this.W) {
                this.x0 = motionEvent.getX();
                motionEvent.getY();
                this.y0 = System.currentTimeMillis();
                AndroidUtilities.runOnUIThread(q1Var, (long) (ViewConfiguration.getLongPressTimeout() * 0.8f));
            }
        } else if (motionEvent.getAction() == 2 && System.currentTimeMillis() - this.y0 > ViewConfiguration.getLongPressTimeout() * 0.8f) {
            AndroidUtilities.cancelRunOnUIThread(q1Var);
            this.A0 = true;
            float x10 = (motionEvent.getX() - this.x0) / (getWidth() * 0.8f);
            n3 n3Var = ((org.telegram.ui.l0) this).B0.u0[0];
            float clamp01 = Utilities.clamp01(n3Var.getProgress() + x10);
            if (!n3Var.c() && n3Var.f() && (webView = n3Var.f.getWebView()) != null) {
                webView.setScrollProgress(clamp01);
                n3Var.K.f0();
            }
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(q1Var);
            this.y0 = 0L;
        }
        this.x0 = motionEvent.getX();
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e(int i10, boolean z10) {
        u1 u1Var = this.b[i10];
        if (u1Var.e != z10) {
            u1Var.e = z10;
            u1Var.c.d(z10 ? 1.0f : 0.0f, true);
            invalidate();
        }
    }

    public final void f(int i10, String str) {
        u1[] u1VarArr = this.b;
        CharSequence charSequence = u1VarArr[i10].b.g;
        if (charSequence == null || !TextUtils.equals(charSequence.toString(), str)) {
            u1VarArr[i10].b.q(Emoji.replaceEmoji(str, u1VarArr[i10].b.a.getFontMetricsInt(), false), false, true);
        }
    }

    public final void g(int i10, String str, boolean z10) {
        u1[] u1VarArr = this.b;
        CharSequence charSequence = u1VarArr[i10].a.g;
        if (charSequence == null || !TextUtils.equals(charSequence.toString(), str)) {
            u1VarArr[i10].a.q(Emoji.replaceEmoji(str, u1VarArr[i10].a.a.getFontMetricsInt(), false), z10, true);
        }
    }

    public int getBackgroundColor() {
        return this.i0;
    }

    public i2 getInstantViewLoader() {
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
        if (this.T == z10) {
            return;
        }
        ValueAnimator valueAnimator = this.t0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.T = z10;
        ei.o oVar = this.V;
        boolean z11 = false;
        oVar.setVisibility(0);
        this.M.c((this.u0 || z10) ? 0.0f : 1.0f, true);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.U, z10 ? 1.0f : 0.0f);
        this.t0 = ofFloat;
        ofFloat.addUpdateListener(new ai.a(this, 22));
        this.t0.addListener(new iw0(8, this, z10));
        this.t0.setInterpolator(wr.h);
        this.t0.setDuration(320L);
        this.t0.start();
        boolean z12 = !z10;
        AndroidUtilities.updateViewShow(this.O, z12, true, true);
        AndroidUtilities.updateViewShow(this.R, z12, true, true);
        if (oVar.length() > 0 && this.T) {
            z11 = true;
        }
        AndroidUtilities.updateViewShow(this.J, z11, true, true);
    }

    public final void i() {
        u1[] u1VarArr = this.b;
        u1 u1Var = u1VarArr[0];
        u1VarArr[0] = u1VarArr[1];
        u1VarArr[1] = u1Var;
        float[] fArr = this.d;
        float f7 = fArr[0];
        fArr[0] = fArr[1];
        fArr[1] = f7;
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
        super.onMeasure(i10, em.C(56.0f, this.e0 ? AndroidUtilities.statusBarHeight : 0, TLObject.FLAG_30));
    }

    public void setBackButton(boolean z10) {
        this.u0 = z10;
        if (this.T || this.W) {
            return;
        }
        this.M.c(z10 ? 0.0f : 1.0f, true);
    }

    public void setBackButtonCached(boolean z10) {
        this.u0 = z10;
    }

    public void setHasForward(boolean z10) {
        this.o0 = z10;
    }

    public void setHeight(int i10) {
        if (this.F != i10) {
            this.F = i10;
            float pow = (float) Math.pow(i10 / AndroidUtilities.dp(56.0f), 0.5d);
            this.G = pow;
            zd zdVar = this.H;
            zdVar.setScaleX(pow);
            zdVar.setScaleY(this.G);
            zdVar.setTranslationX((1.0f - this.G) * AndroidUtilities.dp(42.0f));
            zdVar.setTranslationY((1.0f - this.G) * AndroidUtilities.dp(-12.0f));
            float f7 = this.G;
            zd zdVar2 = this.I;
            zdVar2.setScaleX(f7);
            zdVar2.setScaleY(this.G);
            zdVar2.setTranslationX((1.0f - this.G) * (-AndroidUtilities.dp(42.0f)));
            zdVar2.setTranslationY((1.0f - this.G) * AndroidUtilities.dp(-12.0f));
            this.d0.setTranslationY(this.F - AndroidUtilities.dp(56.0f));
            invalidate();
        }
    }

    public void setIsLocal(boolean z10) {
        this.q0 = z10;
    }

    public void setIsTonsite(boolean z10) {
        this.p0 = z10;
    }

    public void setMenuColors(int i10) {
        double[] j3 = i5.j(i5.a, i5.j(i5.c, new double[]{Color.red(i10) / 255.0d, Color.green(i10) / 255.0d, Color.blue(i10) / 255.0d}));
        for (int i11 = 0; i11 < 3; i11++) {
            j3[i11] = Math.cbrt(j3[i11]);
        }
        double[] j10 = i5.j(i5.b, j3);
        double d = j10[0];
        double d10 = j10[1];
        double d11 = j10[2];
        boolean z10 = new double[]{d, Math.sqrt(Math.pow(d11, 2.0d) + Math.pow(d10, 2.0d)), ((Math.abs(d10) > 2.0E-4d ? 1 : (Math.abs(d10) == 2.0E-4d ? 0 : -1)) >= 0 || (Math.abs(d11) > 2.0E-4d ? 1 : (Math.abs(d11) == 2.0E-4d ? 0 : -1)) >= 0) ? ((((Math.atan2(d11, d10) * 180.0d) / 3.141592653589793d) % 360.0d) + 360.0d) % 360.0d : Double.NaN}[0] < 0.5d;
        this.l0 = z10 ? -16777216 : -1;
        int i12 = z10 ? -1 : -16777216;
        this.m0 = i12;
        this.n0 = j6.l1(0.6f, i12);
    }

    public void setMenuListener(Utilities.Callback<Integer> callback) {
        this.f0 = callback;
    }

    public void setMenuType(int i10) {
        if (this.g0 != i10) {
            this.g0 = i10;
        }
    }

    public void setProgress(float f7) {
        this.d[0] = f7;
        invalidate();
    }

    public void setTransitionProgress(float f7) {
        this.c = f7;
        invalidate();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return true;
    }

    public void setIsLoaded(boolean z10) {
    }
}
