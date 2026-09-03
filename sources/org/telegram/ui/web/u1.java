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
import dg.u3;
import k7.b6;
import lh.ab;
import nh.e5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.o80;
import org.telegram.ui.Components.p70;
import org.telegram.ui.a4;
import org.telegram.ui.i20;
import org.telegram.ui.j21;
import org.telegram.ui.n4;
import org.telegram.ui.r3;
import org.telegram.ui.s61;
import org.telegram.ui.sg1;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public abstract class u1 extends FrameLayout {
    public final TextPaint B;
    public int C;
    public float D;
    public final u3 E;
    public final u3 F;
    public final ImageView G;
    public final org.telegram.ui.Cells.z H;
    public final ImageView I;
    public final org.telegram.ui.ActionBar.i2 J;
    public final org.telegram.ui.Cells.z K;
    public final ImageView L;
    public final s1 M;
    public final org.telegram.ui.Cells.z N;
    public final ImageView O;
    public final org.telegram.ui.Cells.z P;
    public boolean Q;
    public float R;
    public final lh.n S;
    public boolean T;
    public float U;
    public final lh.n V;
    public int W;
    public final RectF a;
    public final o80 a0;
    public final t1[] b;
    public boolean b0;
    public float c;
    public Utilities.Callback c0;
    public final float[] d;
    public int d0;
    public final boolean[] e;
    public int e0;
    public final Paint[] f;
    public int f0;
    public int g0;
    public final Paint[] h;
    public ValueAnimator h0;
    public int i0;
    public int j0;
    public int k0;
    public boolean l0;
    public boolean m0;
    public final Paint[] n;
    public boolean n0;
    public final i20 o0;
    public boolean p0;
    public ValueAnimator q0;
    public final Paint r;
    public boolean r0;
    public final Paint s;
    public kh.a1 s0;
    public ValueAnimator t0;
    public float u0;
    public final Paint v;
    public long v0;
    public int w;
    public final p1 w0;
    public int x;
    public boolean x0;
    public int y;

    public u1(Context context) {
        super(context);
        this.a = new RectF();
        this.b = new t1[2];
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
        this.B = textPaint;
        this.C = AndroidUtilities.dp(56.0f);
        this.D = 1.0f;
        this.R = 0.0f;
        this.U = 0.0f;
        this.d0 = -1;
        this.o0 = new i20();
        final org.telegram.ui.o0 o0Var = (org.telegram.ui.o0) this;
        final int i11 = 0;
        this.w0 = new p1(o0Var, i11);
        this.x0 = false;
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(18.33f));
        for (int i12 = 0; i12 < 2; i12++) {
            this.f[i12] = new Paint(1);
            this.h[i12] = new Paint(1);
            this.n[i12] = new Paint(1);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, b6.e(-1, 56, 87));
        FrameLayout frameLayout2 = new FrameLayout(context);
        addView(frameLayout2, b6.e(-1, 56, 87));
        u3 u3Var = new u3(context, 9);
        this.E = u3Var;
        u3Var.setOrientation(0);
        addView(u3Var, b6.e(-2, 56, 83));
        ImageView imageView = new ImageView(context);
        this.I = imageView;
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        org.telegram.ui.ActionBar.i2 i2Var = new org.telegram.ui.ActionBar.i2(false);
        this.J = i2Var;
        i2Var.k = 200.0f;
        i2Var.c(1.0f, false);
        imageView.setImageDrawable(i2Var);
        org.telegram.ui.Cells.z f02 = j6.f0(1090519039, 1, -1);
        this.K = f02;
        imageView.setBackground(f02);
        u3Var.addView(imageView, b6.n(54, 56));
        u3 u3Var2 = new u3(context, 10);
        this.F = u3Var2;
        u3Var2.setOrientation(0);
        addView(u3Var2, b6.e(-2, 56, 85));
        ImageView imageView2 = new ImageView(context);
        this.L = imageView2;
        imageView2.setScaleType(scaleType);
        s1 s1Var = new s1(o0Var);
        this.M = s1Var;
        imageView2.setImageDrawable(s1Var);
        s1Var.f();
        org.telegram.ui.Cells.z f03 = j6.f0(1090519039, 1, -1);
        this.N = f03;
        imageView2.setBackground(f03);
        u3Var2.addView(imageView2, b6.n(54, 56));
        ImageView imageView3 = new ImageView(context);
        this.O = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.ic_ab_other);
        imageView3.setColorFilter(new PorterDuffColorFilter(0, PorterDuff.Mode.SRC_IN));
        imageView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.web.q1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Utilities.Callback callback;
                switch (i11) {
                    case 0:
                        org.telegram.ui.o0 o0Var2 = o0Var;
                        if (o0Var2.getParent() instanceof ViewGroup) {
                            dg.a0 a0Var = new dg.a0(o0Var2, 3);
                            Utilities.Callback callback2 = null;
                            p70 F = p70.F((ViewGroup) o0Var2.getParent(), null, o0Var2.O);
                            F.s = 0;
                            F.S(o0Var2.j0, o0Var2.k0);
                            F.a0(0.0f, -AndroidUtilities.dp(52.0f));
                            F.S = 200;
                            int v = j6.v(o0Var2.i0, j6.l1(0.1f, o0Var2.j0));
                            F.l0 = Integer.valueOf(v);
                            int i13 = 0;
                            while (i13 < F.A.getChildCount()) {
                                View childAt = i13 == F.A.getChildCount() - 1 ? F.D : F.A.getChildAt(i13);
                                if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt;
                                    int i14 = 0;
                                    while (i14 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount()) {
                                        View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.I.getChildAt(i14);
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
                            if (AndroidUtilities.computePerceivedBrightness(o0Var2.i0) > 0.721f) {
                                F.P(-1);
                                F.T(-986896);
                            } else {
                                F.P(-14737633);
                                F.T(-15592942);
                            }
                            int i15 = o0Var2.d0;
                            if (i15 == 0) {
                                F.c(R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp), (Runnable) a0Var.run(3), false);
                                F.c(R.drawable.msg_search, LocaleController.getString(R.string.Search), (Runnable) a0Var.run(1), false);
                                F.l(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), (Runnable) a0Var.run(2), !o0Var2.n0);
                                F.c(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), (Runnable) a0Var.run(4), false);
                            } else if (i15 == 1) {
                                if (!o0Var2.m0) {
                                    F.c(R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp), (Runnable) a0Var.run(3), false);
                                    F.k();
                                }
                                if (o0Var2.l0) {
                                    F.c(R.drawable.msg_arrow_forward, LocaleController.getString(R.string.WebForward), (Runnable) a0Var.run(9), false);
                                }
                                f2 instantViewLoader = o0Var2.getInstantViewLoader();
                                if (instantViewLoader != null && (((!instantViewLoader.g || !instantViewLoader.i) && instantViewLoader.h == null && instantViewLoader.j == null && !instantViewLoader.c) || instantViewLoader.b() != null)) {
                                    F.c(R.drawable.menu_instant_view, LocaleController.getString(R.string.OpenLocalInstantView), (Runnable) a0Var.run(10), false);
                                    org.telegram.ui.ActionBar.g1 y10 = F.y();
                                    y10.setEnabled(instantViewLoader.b() != null);
                                    y10.setAlpha(y10.isEnabled() ? 1.0f : 0.5f);
                                    sg1 sg1Var = new sg1(12, y10, instantViewLoader);
                                    instantViewLoader.m.add(sg1Var);
                                    F.p = new sg1(16, instantViewLoader, sg1Var);
                                }
                                F.c(R.drawable.msg_reset, LocaleController.getString(R.string.Refresh), (Runnable) a0Var.run(5), false);
                                F.c(R.drawable.msg_search, LocaleController.getString(R.string.Search), (Runnable) a0Var.run(1), false);
                                F.c(R.drawable.msg_saved, LocaleController.getString(R.string.WebBookmark), (Runnable) a0Var.run(6), false);
                                F.c(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), (Runnable) a0Var.run(2), false);
                                F.k();
                                if (!e1.a(callback4).isEmpty()) {
                                    F.c(R.drawable.menu_views_recent, LocaleController.getString(R.string.WebHistory), (Runnable) a0Var.run(8), false);
                                }
                                F.c(R.drawable.menu_browser_bookmarks, LocaleController.getString(R.string.WebBookmarks), (Runnable) a0Var.run(7), false);
                                F.c(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), (Runnable) a0Var.run(4), false);
                            }
                            F.p = new j21(o0Var2, 10);
                            F.Z();
                            break;
                        }
                        break;
                    default:
                        o0Var.S.setText("");
                        break;
                }
            }
        });
        org.telegram.ui.Cells.z f04 = j6.f0(1090519039, 1, -1);
        this.P = f04;
        imageView3.setBackground(f04);
        imageView3.setContentDescription(LocaleController.getString("AccDescrMoreOptions", R.string.AccDescrMoreOptions));
        u3Var2.addView(imageView3, b6.n(54, 56));
        lh.n nVar = new lh.n(context, 3);
        this.S = nVar;
        nVar.setVisibility(8);
        nVar.setAlpha(0.0f);
        nVar.setTextSize(1, 18.0f);
        nVar.setSingleLine(true);
        nVar.setHint(LocaleController.getString(R.string.Search));
        nVar.setBackgroundResource(0);
        nVar.setCursorWidth(1.5f);
        nVar.setGravity(112);
        nVar.setClipToPadding(true);
        nVar.setPadding(AndroidUtilities.dp(58.0f), 0, AndroidUtilities.dp(112.0f), 0);
        nVar.setTranslationY(-AndroidUtilities.dp(0.66f));
        nVar.setInputType(nVar.getInputType() | TLObject.FLAG_19);
        nVar.setImeOptions(33554435);
        nVar.setTextIsSelectable(false);
        nVar.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: org.telegram.ui.web.r1
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i13, KeyEvent keyEvent) {
                switch (i11) {
                    case 0:
                        if (keyEvent != null) {
                            if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                                AndroidUtilities.hideKeyboard(o0Var.S);
                                break;
                            }
                        }
                        break;
                    default:
                        if (i13 == 2) {
                            org.telegram.ui.o0 o0Var2 = o0Var;
                            kh.a1 a1Var = o0Var2.s0;
                            if (a1Var != null) {
                                a1Var.run(o0Var2.V.getText().toString());
                            }
                            o0Var2.k(false);
                            break;
                        }
                        break;
                }
                return false;
            }
        });
        nVar.addTextChangedListener(new dh.c(o0Var, 15));
        frameLayout.addView(nVar, b6.e(-1, -1, 119));
        lh.n nVar2 = new lh.n(context, 4);
        this.V = nVar2;
        nVar2.setVisibility(8);
        nVar2.setAlpha(0.0f);
        nVar2.setTextSize(1, 15.66f);
        nVar2.setSingleLine(true);
        this.W = SharedConfig.searchEngineType;
        nVar2.setHint(LocaleController.formatString(R.string.AddressPlaceholder, n1.a().a));
        nVar2.setBackgroundResource(0);
        nVar2.setCursorWidth(1.5f);
        nVar2.setGravity(112);
        nVar2.setInputType(nVar2.getInputType() | TLObject.FLAG_19);
        nVar2.setImeOptions(33554434);
        nVar2.setTextIsSelectable(false);
        nVar2.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: org.telegram.ui.web.r1
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i13, KeyEvent keyEvent) {
                switch (i10) {
                    case 0:
                        if (keyEvent != null) {
                            if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                                AndroidUtilities.hideKeyboard(o0Var.S);
                                break;
                            }
                        }
                        break;
                    default:
                        if (i13 == 2) {
                            org.telegram.ui.o0 o0Var2 = o0Var;
                            kh.a1 a1Var = o0Var2.s0;
                            if (a1Var != null) {
                                a1Var.run(o0Var2.V.getText().toString());
                            }
                            o0Var2.k(false);
                            break;
                        }
                        break;
                }
                return false;
            }
        });
        frameLayout2.addView(nVar2, b6.d(-1, -1.0f, 119, 48.0f, 0.0f, 12.0f, 0.0f));
        ImageView imageView4 = new ImageView(context);
        this.G = imageView4;
        imageView4.setScaleType(scaleType);
        imageView4.setImageResource(R.drawable.ic_close_white);
        org.telegram.ui.Cells.z f05 = j6.f0(1090519039, 1, -1);
        this.H = f05;
        imageView4.setBackground(f05);
        imageView4.setVisibility(8);
        imageView4.setAlpha(0.0f);
        imageView4.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.web.q1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Utilities.Callback callback;
                switch (i10) {
                    case 0:
                        org.telegram.ui.o0 o0Var2 = o0Var;
                        if (o0Var2.getParent() instanceof ViewGroup) {
                            dg.a0 a0Var = new dg.a0(o0Var2, 3);
                            Utilities.Callback callback2 = null;
                            p70 F = p70.F((ViewGroup) o0Var2.getParent(), null, o0Var2.O);
                            F.s = 0;
                            F.S(o0Var2.j0, o0Var2.k0);
                            F.a0(0.0f, -AndroidUtilities.dp(52.0f));
                            F.S = 200;
                            int v = j6.v(o0Var2.i0, j6.l1(0.1f, o0Var2.j0));
                            F.l0 = Integer.valueOf(v);
                            int i13 = 0;
                            while (i13 < F.A.getChildCount()) {
                                View childAt = i13 == F.A.getChildCount() - 1 ? F.D : F.A.getChildAt(i13);
                                if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt;
                                    int i14 = 0;
                                    while (i14 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount()) {
                                        View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.I.getChildAt(i14);
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
                            if (AndroidUtilities.computePerceivedBrightness(o0Var2.i0) > 0.721f) {
                                F.P(-1);
                                F.T(-986896);
                            } else {
                                F.P(-14737633);
                                F.T(-15592942);
                            }
                            int i15 = o0Var2.d0;
                            if (i15 == 0) {
                                F.c(R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp), (Runnable) a0Var.run(3), false);
                                F.c(R.drawable.msg_search, LocaleController.getString(R.string.Search), (Runnable) a0Var.run(1), false);
                                F.l(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), (Runnable) a0Var.run(2), !o0Var2.n0);
                                F.c(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), (Runnable) a0Var.run(4), false);
                            } else if (i15 == 1) {
                                if (!o0Var2.m0) {
                                    F.c(R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp), (Runnable) a0Var.run(3), false);
                                    F.k();
                                }
                                if (o0Var2.l0) {
                                    F.c(R.drawable.msg_arrow_forward, LocaleController.getString(R.string.WebForward), (Runnable) a0Var.run(9), false);
                                }
                                f2 instantViewLoader = o0Var2.getInstantViewLoader();
                                if (instantViewLoader != null && (((!instantViewLoader.g || !instantViewLoader.i) && instantViewLoader.h == null && instantViewLoader.j == null && !instantViewLoader.c) || instantViewLoader.b() != null)) {
                                    F.c(R.drawable.menu_instant_view, LocaleController.getString(R.string.OpenLocalInstantView), (Runnable) a0Var.run(10), false);
                                    org.telegram.ui.ActionBar.g1 y10 = F.y();
                                    y10.setEnabled(instantViewLoader.b() != null);
                                    y10.setAlpha(y10.isEnabled() ? 1.0f : 0.5f);
                                    sg1 sg1Var = new sg1(12, y10, instantViewLoader);
                                    instantViewLoader.m.add(sg1Var);
                                    F.p = new sg1(16, instantViewLoader, sg1Var);
                                }
                                F.c(R.drawable.msg_reset, LocaleController.getString(R.string.Refresh), (Runnable) a0Var.run(5), false);
                                F.c(R.drawable.msg_search, LocaleController.getString(R.string.Search), (Runnable) a0Var.run(1), false);
                                F.c(R.drawable.msg_saved, LocaleController.getString(R.string.WebBookmark), (Runnable) a0Var.run(6), false);
                                F.c(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), (Runnable) a0Var.run(2), false);
                                F.k();
                                if (!e1.a(callback4).isEmpty()) {
                                    F.c(R.drawable.menu_views_recent, LocaleController.getString(R.string.WebHistory), (Runnable) a0Var.run(8), false);
                                }
                                F.c(R.drawable.menu_browser_bookmarks, LocaleController.getString(R.string.WebBookmarks), (Runnable) a0Var.run(7), false);
                                F.c(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), (Runnable) a0Var.run(4), false);
                            }
                            F.p = new j21(o0Var2, 10);
                            F.Z();
                            break;
                        }
                        break;
                    default:
                        o0Var.S.setText("");
                        break;
                }
            }
        });
        addView(imageView4, b6.e(54, 56, 85));
        o80 o80Var = new o80(context);
        this.a0 = o80Var;
        o80Var.setPivotX(0.0f);
        o80Var.setPivotY(AndroidUtilities.dp(2.0f));
        addView(o80Var, b6.e(-1, 2, 87));
        setWillNotDraw(false);
        this.b[0] = new t1(o0Var);
        this.b[1] = new t1(o0Var);
        int i13 = j6.Pk;
        d(j6.w0(null, i13, false), false);
        setMenuColors(j6.w0(null, i13, false));
    }

    public final void a(Canvas canvas, float f10, float f11, boolean z4) {
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
            paintArr3[1].setAlpha((int) ((1.0f - this.U) * (1.0f - this.R) * alpha2 * 1.0f));
            canvas.drawRect(rectF, paintArr3[1]);
            paintArr3[1].setAlpha(alpha2);
            if (z4) {
                rectF.set(0.0f, f13, width, f13 + max);
                int alpha3 = paintArr2[1].getAlpha();
                paintArr2[1].setAlpha((int) ((1.0f - this.U) * alpha3 * 1.0f * f11));
                canvas.drawRect(rectF, paintArr2[1]);
                paintArr2[1].setAlpha(alpha3);
            }
        } else {
            f12 = 1.0f;
        }
        float f15 = this.c;
        if (f15 < f12) {
            int l1 = j6.l1((f12 - f15) * f12, 1610612736);
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
        paintArr3[0].setAlpha((int) ((f12 - this.U) * (f12 - this.R) * (f12 - Utilities.clamp01(this.c * 4.0f)) * alpha5 * f12));
        canvas.drawRect(rectF, paintArr3[0]);
        paintArr3[0].setAlpha(alpha5);
        if (z4) {
            rectF.set(width, f13, getWidth() + width, max + f13);
            int alpha6 = paintArr2[0].getAlpha();
            paintArr2[0].setAlpha((int) ((f12 - this.U) * alpha6 * f12 * f11));
            canvas.drawRect(rectF, paintArr2[0]);
            paintArr2[0].setAlpha(alpha6);
        }
    }

    public final void b(int i10, int i11) {
        boolean[] zArr = this.e;
        boolean z4 = zArr[i10];
        Paint[] paintArr = this.f;
        if (z4 && paintArr[i10].getColor() == i11) {
            return;
        }
        zArr[i10] = true;
        paintArr[i10].setColor(i11);
        float f10 = AndroidUtilities.computePerceivedBrightness(i11) <= 0.721f ? 1.0f : 0.0f;
        int d = i0.a.d(f10, -16777216, -1);
        this.h[i10].setColor(j6.v(i11, j6.l1(AndroidUtilities.lerp(0.07f, 0.2f, f10), d)));
        this.n[i10].setColor(j6.v(i11, j6.l1(AndroidUtilities.lerp(0.14f, 0.24f, f10), d)));
        t1[] t1VarArr = this.b;
        t1VarArr[i10].a.r(d);
        t1VarArr[i10].d = j6.v(i11, j6.l1(0.6f, d));
        t1 t1Var = t1VarArr[i10];
        t1Var.b.r(i0.a.d(t1VarArr[i10].c.c, t1Var.d, j6.w0(null, j6.q7, false)));
        invalidate();
    }

    public final void c(final int i10, float f10, boolean z4) {
        boolean[] zArr = this.e;
        if (zArr[2] && this.f0 == i10) {
            return;
        }
        if (z4) {
            ValueAnimator valueAnimator = this.h0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            int i11 = this.f0;
            this.e0 = i11;
            final float f11 = AndroidUtilities.computePerceivedBrightness(i11) <= 0.721f ? 1.0f : 0.0f;
            final float f12 = AndroidUtilities.computePerceivedBrightness(i10) > 0.721f ? 0.0f : 1.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.h0 = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.web.o1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    u1 u1Var = u1.this;
                    u1Var.getClass();
                    float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    u1Var.c(i0.a.d(floatValue, u1Var.e0, i10), AndroidUtilities.lerp(f11, f12, floatValue), false);
                }
            });
            this.h0.addListener(new ab(this, i10, f12, 2));
            this.h0.start();
            return;
        }
        zArr[2] = true;
        if (f10 < 0.0f) {
            f10 = AndroidUtilities.computePerceivedBrightness(i10) <= 0.721f ? 1.0f : 0.0f;
        }
        int d = i0.a.d(f10, -16777216, -1);
        this.w = d;
        j6.l1(0.55f, d);
        this.f0 = i10;
        this.x = i0.a.d(f10, -1, -16777216);
        int d10 = i0.a.d(1.0f - f10, -1, -16777216);
        this.y = d10;
        int i12 = this.x;
        n4 n4Var = ((org.telegram.ui.o0) this).y0;
        k kVar = n4Var.f0;
        if (kVar != null) {
            kVar.c(i12, d10);
        }
        this.s.setColor(this.x);
        this.v.setColor(j6.v(this.x, j6.l1(AndroidUtilities.lerp(0.07f, 0.2f, f10), this.w)));
        int l1 = j6.l1(0.6f, this.y);
        lh.n nVar = this.V;
        nVar.setHintTextColor(l1);
        nVar.setTextColor(this.y);
        nVar.setCursorColor(this.y);
        nVar.setHandlesColor(this.y);
        this.a0.setProgressColor(j6.w0(null, j6.Rk, false));
        int d11 = i0.a.d(this.U, this.w, this.y);
        org.telegram.ui.ActionBar.i2 i2Var = this.J;
        i2Var.a(d11);
        i2Var.b(i0.a.d(this.U, this.w, this.y));
        int i13 = this.w;
        s1 s1Var = this.M;
        s1Var.c.setColor(i13);
        s1Var.invalidateSelf();
        int i14 = this.w;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.O.setColorFilter(new PorterDuffColorFilter(i14, mode));
        this.L.setColorFilter(new PorterDuffColorFilter(this.w, mode));
        this.G.setColorFilter(new PorterDuffColorFilter(this.w, mode));
        int v = j6.v(i10, j6.l1(0.22f, this.w));
        this.g0 = v;
        j6.B1(this.K, v, true);
        j6.B1(this.N, this.g0, true);
        j6.B1(this.P, this.g0, true);
        j6.B1(this.H, this.g0, true);
        int l12 = j6.l1(0.6f, this.w);
        lh.n nVar2 = this.S;
        nVar2.setHintTextColor(l12);
        nVar2.setTextColor(this.w);
        nVar2.setCursorColor(this.w);
        nVar2.setHandlesColor(this.w);
        a4 a4Var = n4Var.H;
        if (a4Var != null) {
            a4Var.i();
        }
        invalidate();
    }

    public final void d(int i10, boolean z4) {
        c(i10, -1.0f, z4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        a(canvas, (this.b0 ? AndroidUtilities.statusBarHeight : 0) + this.C, 1.0f, this.p0);
        float right = this.E.getRight();
        float left = this.F.getLeft();
        boolean z4 = this.b0;
        float f10 = z4 ? AndroidUtilities.statusBarHeight : 0;
        float f11 = (z4 ? AndroidUtilities.statusBarHeight : 0) + this.C;
        float f12 = this.c;
        t1[] t1VarArr = this.b;
        if (f12 < 1.0f) {
            canvas.save();
            float width = (getWidth() * this.c) - (Utilities.clamp01(this.c * 2.0f) * AndroidUtilities.dp(30.0f));
            canvas.translate(right + width, f10);
            AndroidUtilities.lerp(1.0f, 0.5f, this.c);
            t1VarArr[0].a(canvas, (left - right) - width, f11 - f10, (1.0f - this.R) * (1.0f - this.c));
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
            t1VarArr[1].a(canvas, left - right, f13, (1.0f - this.U) * (1.0f - this.R) * this.c);
            canvas.restore();
        }
        float f14 = this.U;
        RectF rectF = this.a;
        if (f14 > 0.0f) {
            Paint paint = this.s;
            int alpha = paint.getAlpha();
            paint.setAlpha((int) (alpha * this.U));
            canvas.drawRect(0.0f, 0.0f, getWidth(), (this.b0 ? AndroidUtilities.statusBarHeight : 0) + this.C, paint);
            paint.setAlpha(alpha);
            float f15 = (f10 + f11) / 2.0f;
            float dp = AndroidUtilities.dp(42.0f) / 2.0f;
            rectF.set(AndroidUtilities.dp(6.0f), f15 - dp, AndroidUtilities.lerp(left, getWidth() - AndroidUtilities.dp(6.0f), this.U), f15 + dp);
            Paint paint2 = this.v;
            int alpha2 = paint2.getAlpha();
            paint2.setAlpha((int) (alpha2 * this.U));
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
        y0 webView;
        int action = motionEvent.getAction();
        p1 p1Var = this.w0;
        if (action == 0) {
            this.x0 = false;
            AndroidUtilities.cancelRunOnUIThread(p1Var);
            if (motionEvent.getX() > this.E.getRight() && motionEvent.getX() < this.F.getLeft() && !this.Q && !this.T) {
                this.u0 = motionEvent.getX();
                motionEvent.getY();
                this.v0 = System.currentTimeMillis();
                AndroidUtilities.runOnUIThread(p1Var, (long) (ViewConfiguration.getLongPressTimeout() * 0.8f));
            }
        } else if (motionEvent.getAction() == 2 && System.currentTimeMillis() - this.v0 > ViewConfiguration.getLongPressTimeout() * 0.8f) {
            AndroidUtilities.cancelRunOnUIThread(p1Var);
            this.x0 = true;
            float x10 = (motionEvent.getX() - this.u0) / (getWidth() * 0.8f);
            r3 r3Var = ((org.telegram.ui.o0) this).y0.r0[0];
            float clamp01 = Utilities.clamp01(r3Var.getProgress() + x10);
            if (!r3Var.c() && r3Var.f() && (webView = r3Var.f.getWebView()) != null) {
                webView.setScrollProgress(clamp01);
                r3Var.H.f0();
            }
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(p1Var);
            this.v0 = 0L;
        }
        this.u0 = motionEvent.getX();
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e(int i10, boolean z4) {
        t1 t1Var = this.b[i10];
        if (t1Var.e != z4) {
            t1Var.e = z4;
            t1Var.c.d(z4 ? 1.0f : 0.0f, true);
            invalidate();
        }
    }

    public final void f(int i10, String str) {
        t1[] t1VarArr = this.b;
        CharSequence charSequence = t1VarArr[i10].b.g;
        if (charSequence == null || !TextUtils.equals(charSequence.toString(), str)) {
            t1VarArr[i10].b.q(Emoji.replaceEmoji(str, t1VarArr[i10].b.a.getFontMetricsInt(), false), false, true);
        }
    }

    public final void g(int i10, String str, boolean z4) {
        t1[] t1VarArr = this.b;
        CharSequence charSequence = t1VarArr[i10].a.g;
        if (charSequence == null || !TextUtils.equals(charSequence.toString(), str)) {
            t1VarArr[i10].a.q(Emoji.replaceEmoji(str, t1VarArr[i10].a.a.getFontMetricsInt(), false), z4, true);
        }
    }

    public int getBackgroundColor() {
        return this.f0;
    }

    public f2 getInstantViewLoader() {
        return null;
    }

    public int getTextColor() {
        return this.w;
    }

    public String getTitle() {
        CharSequence charSequence = this.b[0].a.g;
        return charSequence == null ? "" : charSequence.toString();
    }

    public final void h(boolean z4) {
        if (this.Q == z4) {
            return;
        }
        ValueAnimator valueAnimator = this.q0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.Q = z4;
        lh.n nVar = this.S;
        boolean z10 = false;
        nVar.setVisibility(0);
        this.J.c((this.r0 || z4) ? 0.0f : 1.0f, true);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.R, z4 ? 1.0f : 0.0f);
        this.q0 = ofFloat;
        ofFloat.addUpdateListener(new e5(this, 10));
        this.q0.addListener(new s61(4, this, z4));
        this.q0.setInterpolator(mr.h);
        this.q0.setDuration(320L);
        this.q0.start();
        boolean z11 = !z4;
        AndroidUtilities.updateViewShow(this.L, z11, true, true);
        AndroidUtilities.updateViewShow(this.O, z11, true, true);
        if (nVar.length() > 0 && this.Q) {
            z10 = true;
        }
        AndroidUtilities.updateViewShow(this.G, z10, true, true);
    }

    public final void i() {
        t1[] t1VarArr = this.b;
        t1 t1Var = t1VarArr[0];
        t1VarArr[0] = t1VarArr[1];
        t1VarArr[1] = t1Var;
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
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, org.telegram.ui.b.B(56.0f, this.b0 ? AndroidUtilities.statusBarHeight : 0, TLObject.FLAG_30));
    }

    public void setBackButton(boolean z4) {
        this.r0 = z4;
        if (this.Q || this.T) {
            return;
        }
        this.J.c(z4 ? 0.0f : 1.0f, true);
    }

    public void setBackButtonCached(boolean z4) {
        this.r0 = z4;
    }

    public void setHasForward(boolean z4) {
        this.l0 = z4;
    }

    public void setHeight(int i10) {
        if (this.C != i10) {
            this.C = i10;
            float pow = (float) Math.pow(i10 / AndroidUtilities.dp(56.0f), 0.5d);
            this.D = pow;
            u3 u3Var = this.E;
            u3Var.setScaleX(pow);
            u3Var.setScaleY(this.D);
            u3Var.setTranslationX((1.0f - this.D) * AndroidUtilities.dp(42.0f));
            u3Var.setTranslationY((1.0f - this.D) * AndroidUtilities.dp(-12.0f));
            float f10 = this.D;
            u3 u3Var2 = this.F;
            u3Var2.setScaleX(f10);
            u3Var2.setScaleY(this.D);
            u3Var2.setTranslationX((1.0f - this.D) * (-AndroidUtilities.dp(42.0f)));
            u3Var2.setTranslationY((1.0f - this.D) * AndroidUtilities.dp(-12.0f));
            this.a0.setTranslationY(this.C - AndroidUtilities.dp(56.0f));
            invalidate();
        }
    }

    public void setIsLocal(boolean z4) {
        this.n0 = z4;
    }

    public void setIsTonsite(boolean z4) {
        this.m0 = z4;
    }

    public void setMenuColors(int i10) {
        double[] j10 = h5.j(h5.a, h5.j(h5.c, new double[]{Color.red(i10) / 255.0d, Color.green(i10) / 255.0d, Color.blue(i10) / 255.0d}));
        for (int i11 = 0; i11 < 3; i11++) {
            j10[i11] = Math.cbrt(j10[i11]);
        }
        double[] j11 = h5.j(h5.b, j10);
        double d = j11[0];
        double d10 = j11[1];
        double d11 = j11[2];
        boolean z4 = new double[]{d, Math.sqrt(Math.pow(d11, 2.0d) + Math.pow(d10, 2.0d)), ((Math.abs(d10) > 2.0E-4d ? 1 : (Math.abs(d10) == 2.0E-4d ? 0 : -1)) >= 0 || (Math.abs(d11) > 2.0E-4d ? 1 : (Math.abs(d11) == 2.0E-4d ? 0 : -1)) >= 0) ? ((((Math.atan2(d11, d10) * 180.0d) / 3.141592653589793d) % 360.0d) + 360.0d) % 360.0d : Double.NaN}[0] < 0.5d;
        this.i0 = z4 ? -16777216 : -1;
        int i12 = z4 ? -1 : -16777216;
        this.j0 = i12;
        this.k0 = j6.l1(0.6f, i12);
    }

    public void setMenuListener(Utilities.Callback<Integer> callback) {
        this.c0 = callback;
    }

    public void setMenuType(int i10) {
        if (this.d0 != i10) {
            this.d0 = i10;
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

    public void setIsLoaded(boolean z4) {
    }
}
