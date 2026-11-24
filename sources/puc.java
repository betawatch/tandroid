// default package

import android.animation.ValueAnimator;
import android.app.Activity;
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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.m;
import org.telegram.ui.o;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class puc extends FrameLayout {
    public final muc A0;
    public boolean B0;
    public int E;
    public final TextPaint F;
    public int G;
    public float H;
    public final t1 I;
    public final t1 J;
    public final ImageView K;
    public final fg0 L;
    public final ImageView M;
    public final ee0 N;
    public final fg0 O;
    public final ImageView P;
    public final foc Q;
    public final fg0 R;
    public final ImageView S;
    public final fg0 T;
    public boolean U;
    public float V;
    public final vc W;
    public final RectF a;
    public boolean a0;
    public final mg0[] b;
    public float b0;
    public float c;
    public final vc c0;
    public final float[] d;
    public int d0;
    public final boolean[] e;
    public final k46 e0;
    public final Paint[] f;
    public boolean f0;
    public qac g0;
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
    public final in3 s0;
    public boolean t0;
    public ValueAnimator u0;
    public boolean v0;
    public final Paint w;
    public x0 w0;
    public int x;
    public ValueAnimator x0;
    public int y;
    public float y0;
    public long z0;

    /* JADX WARN: Multi-variable type inference failed */
    public puc(Activity activity) {
        super(activity);
        this.a = new RectF();
        this.b = new mg0[2];
        this.c = 0.0f;
        this.d = new float[2];
        this.e = new boolean[3];
        this.f = new Paint[2];
        this.h = new Paint[2];
        this.n = new Paint[2];
        final byte b = 1;
        this.r = new Paint(1);
        this.s = new Paint(1);
        this.w = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.F = textPaint;
        this.G = gm.L(56.0f);
        this.H = 1.0f;
        this.V = 0.0f;
        this.b0 = 0.0f;
        this.h0 = -1;
        this.s0 = new in3((byte) 7);
        final wu wuVar = (wu) this;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        this.A0 = new muc(wuVar, (byte) 0);
        this.B0 = false;
        textPaint.setTypeface(gm.o());
        textPaint.setTextSize(gm.L(18.33f));
        for (int i = 0; i < 2; i++) {
            this.f[i] = new Paint(1);
            this.h[i] = new Paint(1);
            this.n[i] = new Paint(1);
        }
        FrameLayout frameLayout = new FrameLayout(activity);
        addView(frameLayout, qoe.e(-1, 56, 87));
        FrameLayout frameLayout2 = new FrameLayout(activity);
        addView(frameLayout2, qoe.e(-1, 56, 87));
        t1 t1Var = new t1((byte) 12, activity, objArr4 == true ? 1 : 0);
        this.I = t1Var;
        t1Var.setOrientation(0);
        addView(t1Var, qoe.e(-2, 56, 83));
        ImageView imageView = new ImageView(activity);
        this.M = imageView;
        imageView.setContentDescription(jb6.M0(2131754878, null));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ee0 ee0Var = new ee0(false);
        this.N = ee0Var;
        ee0Var.k = 200.0f;
        ee0Var.c(false, 1.0f);
        imageView.setImageDrawable(ee0Var);
        fg0 f0 = cmb.f0(1090519039, 1, -1);
        this.O = f0;
        imageView.setBackground(f0);
        t1Var.addView(imageView, qoe.o(54, 56));
        t1 t1Var2 = new t1((byte) 13, activity, objArr3 == true ? 1 : 0);
        this.J = t1Var2;
        t1Var2.setOrientation(0);
        addView(t1Var2, qoe.e(-2, 56, 85));
        ImageView imageView2 = new ImageView(activity);
        this.P = imageView2;
        imageView2.setScaleType(scaleType);
        foc focVar = new foc(wuVar);
        this.Q = focVar;
        imageView2.setImageDrawable(focVar);
        focVar.c();
        fg0 f02 = cmb.f0(1090519039, 1, -1);
        this.R = f02;
        imageView2.setBackground(f02);
        t1Var2.addView(imageView2, qoe.o(54, 56));
        ImageView imageView3 = new ImageView(activity);
        this.S = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.ic_ab_other);
        imageView3.setColorFilter(new PorterDuffColorFilter(0, PorterDuff.Mode.SRC_IN));
        final Object[] objArr5 = objArr2 == true ? 1 : 0;
        imageView3.setOnClickListener(new View.OnClickListener() { // from class: nuc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b2 = objArr5;
                wu wuVar2 = wuVar;
                switch (b2) {
                    case 0:
                        if (wuVar2.getParent() instanceof ViewGroup) {
                            k22 k22Var = new k22(wuVar2, (byte) 12);
                            bu5 G = bu5.G((ViewGroup) wuVar2.getParent(), null, wuVar2.S);
                            G.s = (short) 0;
                            G.T(wuVar2.n0, wuVar2.o0);
                            G.b0(0.0f, -gm.L(52.0f));
                            G.V = nm7.d3;
                            int v = cmb.v(wuVar2.m0, cmb.p1(0.1f, wuVar2.n0));
                            G.o0 = Integer.valueOf(v);
                            int i2 = 0;
                            while (i2 < G.A.getChildCount()) {
                                View childAt = i2 == G.A.getChildCount() - 1 ? G.D : G.A.getChildAt(i2);
                                if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt;
                                    for (int i3 = 0; i3 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount(); i3++) {
                                        View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i3);
                                        if (childAt2 instanceof a8) {
                                            ((a8) childAt2).setSelectorColor(v);
                                        }
                                    }
                                } else if (childAt instanceof a8) {
                                    ((a8) childAt).setSelectorColor(v);
                                }
                                i2++;
                            }
                            if (gm.B(wuVar2.m0) > 0.721f) {
                                G.Q(-1);
                                G.U(-986896);
                            } else {
                                G.Q(-14737633);
                                G.U(-15592942);
                            }
                            int i4 = wuVar2.h0;
                            if (i4 == 0) {
                                G.b(R.drawable.msg_openin, jb6.M0(2131747529, null), (Runnable) k22Var.a(3), false);
                                G.b(R.drawable.msg_search, jb6.M0(2131745570, null), (Runnable) k22Var.a(1), false);
                                G.k(R.drawable.msg_share, jb6.M0(2131745193, null), (Runnable) k22Var.a(2), !wuVar2.r0);
                                G.b(R.drawable.msg_settings_old, jb6.M0(2131745229, null), (Runnable) k22Var.a(4), false);
                            } else if (i4 == 1) {
                                if (!wuVar2.q0) {
                                    G.b(R.drawable.msg_openin, jb6.M0(2131747529, null), (Runnable) k22Var.a(3), false);
                                    G.j();
                                }
                                if (wuVar2.p0) {
                                    G.b(R.drawable.msg_arrow_forward, jb6.M0(2131742584, null), (Runnable) k22Var.a(9), false);
                                }
                                bvc instantViewLoader = wuVar2.getInstantViewLoader();
                                if (instantViewLoader != null && (((!instantViewLoader.g || !instantViewLoader.i) && instantViewLoader.h == null && instantViewLoader.j == null && !instantViewLoader.c) || instantViewLoader.b() != null)) {
                                    G.b(R.drawable.menu_instant_view, jb6.M0(2131747521, null), (Runnable) k22Var.a(10), false);
                                    a8 z = G.z();
                                    z.setEnabled(instantViewLoader.b() != null);
                                    z.setAlpha(z.isEnabled() ? 1.0f : 0.5f);
                                    ptc ptcVar = new ptc(z, instantViewLoader, (byte) 2);
                                    instantViewLoader.m.add(ptcVar);
                                    G.p = new ptc(instantViewLoader, ptcVar, (byte) 6);
                                }
                                G.b(R.drawable.msg_reset, jb6.M0(2131746073, null), (Runnable) k22Var.a(5), false);
                                G.b(R.drawable.msg_search, jb6.M0(2131745570, null), (Runnable) k22Var.a(1), false);
                                G.b(R.drawable.msg_saved, jb6.M0(2131742605, null), (Runnable) k22Var.a(6), false);
                                G.b(R.drawable.msg_share, jb6.M0(2131745193, null), (Runnable) k22Var.a(2), false);
                                G.j();
                                if (!crd.a(null).isEmpty()) {
                                    G.b(R.drawable.menu_views_recent, jb6.M0(2131742583, null), (Runnable) k22Var.a(8), false);
                                }
                                G.b(R.drawable.menu_browser_bookmarks, jb6.M0(2131742602, null), (Runnable) k22Var.a(7), false);
                                G.b(R.drawable.msg_settings_old, jb6.M0(2131745229, null), (Runnable) k22Var.a(4), false);
                            }
                            G.p = new e1b(wuVar2);
                            G.a0();
                            break;
                        }
                        break;
                    default:
                        wuVar2.W.setText("");
                        break;
                }
            }
        });
        fg0 f03 = cmb.f0(1090519039, 1, -1);
        this.T = f03;
        imageView3.setBackground(f03);
        imageView3.setContentDescription(jb6.M0(2131754838, "AccDescrMoreOptions"));
        t1Var2.addView(imageView3, qoe.o(54, 56));
        vc vcVar = new vc((Context) activity, (byte) 7);
        this.W = vcVar;
        vcVar.setVisibility(8);
        vcVar.setAlpha(0.0f);
        vcVar.setTextSize(1, 18.0f);
        vcVar.setSingleLine(true);
        vcVar.setHint(jb6.M0(2131745570, null));
        vcVar.setBackgroundResource(0);
        vcVar.setCursorWidth(1.5f);
        vcVar.setGravity(nm7.w1);
        vcVar.setClipToPadding(true);
        vcVar.setPadding(gm.L(58.0f), 0, gm.L(112.0f), 0);
        vcVar.setTranslationY(-gm.L(0.66f));
        vcVar.setInputType(vcVar.getInputType() | TLObject.FLAG_19);
        vcVar.setImeOptions(33554435);
        vcVar.setTextIsSelectable(false);
        final Object[] objArr6 = objArr == true ? 1 : 0;
        vcVar.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: ouc
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                byte b2 = objArr6;
                wu wuVar2 = wuVar;
                switch (b2) {
                    case 0:
                        if (keyEvent != null && ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66))) {
                            gm.t1(wuVar2.W);
                            break;
                        }
                        break;
                    default:
                        if (i2 == 2) {
                            x0 x0Var = wuVar2.w0;
                            if (x0Var != null) {
                                x0Var.a(wuVar2.c0.getText().toString());
                            }
                            wuVar2.k(false);
                            break;
                        }
                        break;
                }
                return false;
            }
        });
        vcVar.addTextChangedListener(new og6(wuVar, (byte) 29));
        frameLayout.addView(vcVar, qoe.e(-1, -1, nm7.D1));
        vc vcVar2 = new vc((Context) activity, (byte) 8);
        this.c0 = vcVar2;
        vcVar2.setVisibility(8);
        vcVar2.setAlpha(0.0f);
        vcVar2.setTextSize(1, 15.66f);
        vcVar2.setSingleLine(true);
        this.d0 = gda.m0;
        vcVar2.setHint(jb6.a0(null, null, 2131754348, ku9.a().a));
        vcVar2.setBackgroundResource(0);
        vcVar2.setCursorWidth(1.5f);
        vcVar2.setGravity(nm7.w1);
        vcVar2.setInputType(vcVar2.getInputType() | TLObject.FLAG_19);
        vcVar2.setImeOptions(33554434);
        vcVar2.setTextIsSelectable(false);
        vcVar2.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: ouc
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                byte b2 = b;
                wu wuVar2 = wuVar;
                switch (b2) {
                    case 0:
                        if (keyEvent != null && ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66))) {
                            gm.t1(wuVar2.W);
                            break;
                        }
                        break;
                    default:
                        if (i2 == 2) {
                            x0 x0Var = wuVar2.w0;
                            if (x0Var != null) {
                                x0Var.a(wuVar2.c0.getText().toString());
                            }
                            wuVar2.k(false);
                            break;
                        }
                        break;
                }
                return false;
            }
        });
        frameLayout2.addView(vcVar2, qoe.d(-1, -1.0f, nm7.D1, 48.0f, 0.0f, 12.0f, 0.0f));
        ImageView imageView4 = new ImageView(activity);
        this.K = imageView4;
        imageView4.setScaleType(scaleType);
        imageView4.setImageResource(R.drawable.ic_close_white);
        fg0 f04 = cmb.f0(1090519039, 1, -1);
        this.L = f04;
        imageView4.setBackground(f04);
        imageView4.setVisibility(8);
        imageView4.setAlpha(0.0f);
        imageView4.setOnClickListener(new View.OnClickListener() { // from class: nuc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b2 = b;
                wu wuVar2 = wuVar;
                switch (b2) {
                    case 0:
                        if (wuVar2.getParent() instanceof ViewGroup) {
                            k22 k22Var = new k22(wuVar2, (byte) 12);
                            bu5 G = bu5.G((ViewGroup) wuVar2.getParent(), null, wuVar2.S);
                            G.s = (short) 0;
                            G.T(wuVar2.n0, wuVar2.o0);
                            G.b0(0.0f, -gm.L(52.0f));
                            G.V = nm7.d3;
                            int v = cmb.v(wuVar2.m0, cmb.p1(0.1f, wuVar2.n0));
                            G.o0 = Integer.valueOf(v);
                            int i2 = 0;
                            while (i2 < G.A.getChildCount()) {
                                View childAt = i2 == G.A.getChildCount() - 1 ? G.D : G.A.getChildAt(i2);
                                if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt;
                                    for (int i3 = 0; i3 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount(); i3++) {
                                        View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i3);
                                        if (childAt2 instanceof a8) {
                                            ((a8) childAt2).setSelectorColor(v);
                                        }
                                    }
                                } else if (childAt instanceof a8) {
                                    ((a8) childAt).setSelectorColor(v);
                                }
                                i2++;
                            }
                            if (gm.B(wuVar2.m0) > 0.721f) {
                                G.Q(-1);
                                G.U(-986896);
                            } else {
                                G.Q(-14737633);
                                G.U(-15592942);
                            }
                            int i4 = wuVar2.h0;
                            if (i4 == 0) {
                                G.b(R.drawable.msg_openin, jb6.M0(2131747529, null), (Runnable) k22Var.a(3), false);
                                G.b(R.drawable.msg_search, jb6.M0(2131745570, null), (Runnable) k22Var.a(1), false);
                                G.k(R.drawable.msg_share, jb6.M0(2131745193, null), (Runnable) k22Var.a(2), !wuVar2.r0);
                                G.b(R.drawable.msg_settings_old, jb6.M0(2131745229, null), (Runnable) k22Var.a(4), false);
                            } else if (i4 == 1) {
                                if (!wuVar2.q0) {
                                    G.b(R.drawable.msg_openin, jb6.M0(2131747529, null), (Runnable) k22Var.a(3), false);
                                    G.j();
                                }
                                if (wuVar2.p0) {
                                    G.b(R.drawable.msg_arrow_forward, jb6.M0(2131742584, null), (Runnable) k22Var.a(9), false);
                                }
                                bvc instantViewLoader = wuVar2.getInstantViewLoader();
                                if (instantViewLoader != null && (((!instantViewLoader.g || !instantViewLoader.i) && instantViewLoader.h == null && instantViewLoader.j == null && !instantViewLoader.c) || instantViewLoader.b() != null)) {
                                    G.b(R.drawable.menu_instant_view, jb6.M0(2131747521, null), (Runnable) k22Var.a(10), false);
                                    a8 z = G.z();
                                    z.setEnabled(instantViewLoader.b() != null);
                                    z.setAlpha(z.isEnabled() ? 1.0f : 0.5f);
                                    ptc ptcVar = new ptc(z, instantViewLoader, (byte) 2);
                                    instantViewLoader.m.add(ptcVar);
                                    G.p = new ptc(instantViewLoader, ptcVar, (byte) 6);
                                }
                                G.b(R.drawable.msg_reset, jb6.M0(2131746073, null), (Runnable) k22Var.a(5), false);
                                G.b(R.drawable.msg_search, jb6.M0(2131745570, null), (Runnable) k22Var.a(1), false);
                                G.b(R.drawable.msg_saved, jb6.M0(2131742605, null), (Runnable) k22Var.a(6), false);
                                G.b(R.drawable.msg_share, jb6.M0(2131745193, null), (Runnable) k22Var.a(2), false);
                                G.j();
                                if (!crd.a(null).isEmpty()) {
                                    G.b(R.drawable.menu_views_recent, jb6.M0(2131742583, null), (Runnable) k22Var.a(8), false);
                                }
                                G.b(R.drawable.menu_browser_bookmarks, jb6.M0(2131742602, null), (Runnable) k22Var.a(7), false);
                                G.b(R.drawable.msg_settings_old, jb6.M0(2131745229, null), (Runnable) k22Var.a(4), false);
                            }
                            G.p = new e1b(wuVar2);
                            G.a0();
                            break;
                        }
                        break;
                    default:
                        wuVar2.W.setText("");
                        break;
                }
            }
        });
        addView(imageView4, qoe.e(54, 56, 85));
        k46 k46Var = new k46(activity);
        this.e0 = k46Var;
        k46Var.setPivotX(0.0f);
        k46Var.setPivotY(gm.L(2.0f));
        addView(k46Var, qoe.e(-1, 2, 87));
        setWillNotDraw(false);
        this.b[0] = new mg0(wuVar);
        this.b[1] = new mg0(wuVar);
        int i2 = cmb.Fl;
        d(cmb.w0(null, i2, false), false);
        setMenuColors(cmb.w0(null, i2, false));
    }

    public final void a(Canvas canvas, float f, float f2, boolean z) {
        float f3;
        float max = Math.max(gm.L(0.66f), 1);
        float f4 = f - max;
        float width = getWidth() * this.c;
        float width2 = getWidth();
        RectF rectF = this.a;
        rectF.set(0.0f, 0.0f, width2, f);
        Paint[] paintArr = this.f;
        int alpha = paintArr[1].getAlpha();
        paintArr[1].setAlpha((int) (alpha * 1.0f));
        canvas.drawRect(rectF, paintArr[1]);
        paintArr[1].setAlpha(alpha);
        float f5 = this.c;
        float[] fArr = this.d;
        Paint[] paintArr2 = this.n;
        Paint[] paintArr3 = this.h;
        if (f5 > 0.0f) {
            rectF.set(0.0f, 0.0f, fArr[1] * getWidth(), f);
            int alpha2 = paintArr3[1].getAlpha();
            f3 = 1.0f;
            paintArr3[1].setAlpha((int) ((1.0f - this.b0) * (1.0f - this.V) * alpha2 * 1.0f));
            canvas.drawRect(rectF, paintArr3[1]);
            paintArr3[1].setAlpha(alpha2);
            if (z) {
                rectF.set(0.0f, f4, width, f4 + max);
                int alpha3 = paintArr2[1].getAlpha();
                paintArr2[1].setAlpha((int) ((1.0f - this.b0) * alpha3 * 1.0f * f2));
                canvas.drawRect(rectF, paintArr2[1]);
                paintArr2[1].setAlpha(alpha3);
            }
        } else {
            f3 = 1.0f;
        }
        float f6 = this.c;
        if (f6 < f3) {
            int p1 = cmb.p1((f3 - f6) * f3, 1610612736);
            Paint paint = this.r;
            paint.setColor(p1);
            rectF.set(0.0f, 0.0f, width, f);
            canvas.drawRect(rectF, paint);
            rectF.set(width, 0.0f, getWidth(), f);
            int alpha4 = paintArr[0].getAlpha();
            paintArr[0].setAlpha((int) (alpha4 * f3));
            canvas.drawRect(rectF, paintArr[0]);
            paintArr[0].setAlpha(alpha4);
        }
        rectF.set(width, 0.0f, (fArr[0] * getWidth()) + width, f);
        int alpha5 = paintArr3[0].getAlpha();
        paintArr3[0].setAlpha((int) ((f3 - this.b0) * (f3 - this.V) * (f3 - Utilities.l(this.c * 4.0f)) * alpha5 * f3));
        canvas.drawRect(rectF, paintArr3[0]);
        paintArr3[0].setAlpha(alpha5);
        if (z) {
            rectF.set(width, f4, getWidth() + width, max + f4);
            int alpha6 = paintArr2[0].getAlpha();
            paintArr2[0].setAlpha((int) ((f3 - this.b0) * alpha6 * f3 * f2));
            canvas.drawRect(rectF, paintArr2[0]);
            paintArr2[0].setAlpha(alpha6);
        }
    }

    public final void b(int i, int i2) {
        boolean[] zArr = this.e;
        boolean z = zArr[i];
        Paint[] paintArr = this.f;
        if (z && paintArr[i].getColor() == i2) {
            return;
        }
        zArr[i] = true;
        paintArr[i].setColor(i2);
        float f = gm.B(i2) <= 0.721f ? 1.0f : 0.0f;
        int f2 = on2.f(f, -16777216, -1);
        this.h[i].setColor(cmb.v(i2, cmb.p1(gm.R1(0.07f, 0.2f, f), f2)));
        this.n[i].setColor(cmb.v(i2, cmb.p1(gm.R1(0.14f, 0.24f, f), f2)));
        mg0[] mg0VarArr = this.b;
        ((ho) mg0VarArr[i].d).u(f2);
        mg0VarArr[i].a = cmb.v(i2, cmb.p1(0.6f, f2));
        mg0 mg0Var = mg0VarArr[i];
        ((ho) mg0Var.e).u(on2.f(((ln) mg0VarArr[i].f).c, mg0Var.a, cmb.w0(null, cmb.p7, false)));
        invalidate();
    }

    public final void c(final int i, float f, boolean z) {
        boolean[] zArr = this.e;
        if (zArr[2] && this.j0 == i) {
            return;
        }
        if (z) {
            ValueAnimator valueAnimator = this.l0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            int i2 = this.j0;
            this.i0 = i2;
            final float f2 = gm.B(i2) <= 0.721f ? 1.0f : 0.0f;
            final float f3 = gm.B(i) > 0.721f ? 0.0f : 1.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.l0 = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: luc
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    puc pucVar = puc.this;
                    pucVar.c(on2.f(floatValue, pucVar.i0, i), gm.R1(f2, f3, floatValue), false);
                }
            });
            this.l0.addListener(new fg4(this, i, f3, (byte) 2));
            this.l0.start();
            return;
        }
        zArr[2] = true;
        if (f < 0.0f) {
            f = gm.B(i) <= 0.721f ? 1.0f : 0.0f;
        }
        int f4 = on2.f(f, -16777216, -1);
        this.x = f4;
        cmb.p1(0.55f, f4);
        this.j0 = i;
        this.y = on2.f(f, -1, -16777216);
        int f5 = on2.f(1.0f - f, -1, -16777216);
        this.E = f5;
        int i3 = this.y;
        o oVar = ((wu) this).C0;
        eb ebVar = oVar.j0;
        if (ebVar != null) {
            ebVar.c(i3, f5);
        }
        this.s.setColor(this.y);
        this.w.setColor(cmb.v(this.y, cmb.p1(gm.R1(0.07f, 0.2f, f), this.x)));
        int p1 = cmb.p1(0.6f, this.E);
        vc vcVar = this.c0;
        vcVar.setHintTextColor(p1);
        vcVar.setTextColor(this.E);
        vcVar.setCursorColor(this.E);
        vcVar.setHandlesColor(this.E);
        this.e0.setProgressColor(cmb.w0(null, cmb.Hl, false));
        int f6 = on2.f(this.b0, this.x, this.E);
        ee0 ee0Var = this.N;
        ee0Var.a(f6);
        ee0Var.b(on2.f(this.b0, this.x, this.E));
        int i4 = this.x;
        foc focVar = this.Q;
        focVar.c.setColor(i4);
        focVar.invalidateSelf();
        int i5 = this.x;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.S.setColorFilter(new PorterDuffColorFilter(i5, mode));
        this.P.setColorFilter(new PorterDuffColorFilter(this.x, mode));
        this.K.setColorFilter(new PorterDuffColorFilter(this.x, mode));
        int v = cmb.v(i, cmb.p1(0.22f, this.x));
        this.k0 = v;
        cmb.F1(this.O, v, true);
        cmb.F1(this.R, this.k0, true);
        cmb.F1(this.T, this.k0, true);
        cmb.F1(this.L, this.k0, true);
        int p12 = cmb.p1(0.6f, this.x);
        vc vcVar2 = this.W;
        vcVar2.setHintTextColor(p12);
        vcVar2.setTextColor(this.x);
        vcVar2.setCursorColor(this.x);
        vcVar2.setHandlesColor(this.x);
        sx sxVar = oVar.L;
        if (sxVar != null) {
            sxVar.u();
        }
        invalidate();
    }

    public final void d(int i, boolean z) {
        c(i, -1.0f, z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        a(canvas, (this.f0 ? gm.m : 0) + this.G, 1.0f, this.t0);
        float right = this.I.getRight();
        float left = this.J.getLeft();
        boolean z = this.f0;
        float f = z ? gm.m : 0;
        float f2 = (z ? gm.m : 0) + this.G;
        float f3 = this.c;
        mg0[] mg0VarArr = this.b;
        if (f3 < 1.0f) {
            canvas.save();
            float width = (getWidth() * this.c) - (Utilities.l(this.c * 2.0f) * gm.L(30.0f));
            canvas.translate(right + width, f);
            mg0VarArr[0].a(canvas, (left - right) - width, f2 - f, (1.0f - this.V) * (1.0f - this.c));
            canvas.restore();
        }
        if (this.c > 0.0f) {
            float width2 = getWidth() * this.c;
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, width2, getHeight());
            canvas.translate(right, f);
            canvas.translate((1.0f - this.c) * gm.L(-12.0f), 0.0f);
            float R1 = gm.R1(1.0f, 0.5f, 1.0f - this.c);
            float f4 = f2 - f;
            canvas.scale(R1, R1, 0.0f, f4 / 2.0f);
            mg0VarArr[1].a(canvas, left - right, f4, (1.0f - this.b0) * (1.0f - this.V) * this.c);
            canvas.restore();
        }
        float f5 = this.b0;
        RectF rectF = this.a;
        if (f5 > 0.0f) {
            Paint paint = this.s;
            int alpha = paint.getAlpha();
            paint.setAlpha((int) (alpha * this.b0));
            canvas.drawRect(0.0f, 0.0f, getWidth(), (this.f0 ? gm.m : 0) + this.G, paint);
            paint.setAlpha(alpha);
            float f6 = (f + f2) / 2.0f;
            float L = gm.L(42.0f) / 2.0f;
            rectF.set(gm.L(6.0f), f6 - L, gm.R1(left, getWidth() - gm.L(6.0f), this.b0), f6 + L);
            Paint paint2 = this.w;
            int alpha2 = paint2.getAlpha();
            paint2.setAlpha((int) (alpha2 * this.b0));
            canvas.drawRoundRect(rectF, gm.L(50.0f), gm.L(50.0f), paint2);
            paint2.setAlpha(alpha2);
        }
        rectF.set(0.0f, f, getWidth(), f2);
        canvas.save();
        canvas.clipRect(rectF);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        mw0 webView;
        int action = motionEvent.getAction();
        muc mucVar = this.A0;
        if (action == 0) {
            this.B0 = false;
            gm.r(mucVar);
            if (motionEvent.getX() > this.I.getRight() && motionEvent.getX() < this.J.getLeft() && !this.U && !this.a0) {
                this.y0 = motionEvent.getX();
                motionEvent.getY();
                this.z0 = System.currentTimeMillis();
                gm.d3(mucVar, (long) (ViewConfiguration.getLongPressTimeout() * 0.8f));
            }
        } else if (motionEvent.getAction() == 2 && System.currentTimeMillis() - this.z0 > ViewConfiguration.getLongPressTimeout() * 0.8f) {
            gm.r(mucVar);
            this.B0 = true;
            float x = (motionEvent.getX() - this.y0) / (getWidth() * 0.8f);
            m mVar = ((wu) this).C0.v0[0];
            float l = Utilities.l(mVar.getProgress() + x);
            if (!mVar.b() && mVar.e() && (webView = mVar.f.getWebView()) != null) {
                webView.setScrollProgress(l);
                mVar.M.d0();
            }
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            gm.r(mucVar);
            this.z0 = 0L;
        }
        this.y0 = motionEvent.getX();
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e(int i, boolean z) {
        mg0 mg0Var = this.b[i];
        if (mg0Var.b != z) {
            mg0Var.b = z;
            ((ln) mg0Var.f).e(true, z ? 1.0f : 0.0f);
            invalidate();
        }
    }

    public final void f(int i, String str) {
        mg0[] mg0VarArr = this.b;
        CharSequence charSequence = ((ho) mg0VarArr[i].e).i;
        if (charSequence == null || !TextUtils.equals(charSequence.toString(), str)) {
            ((ho) mg0VarArr[i].e).t(gw3.m(str, ((ho) mg0VarArr[i].e).a.getFontMetricsInt(), false, null, 0), false, true);
        }
    }

    public final void g(int i, String str, boolean z) {
        mg0[] mg0VarArr = this.b;
        CharSequence charSequence = ((ho) mg0VarArr[i].d).i;
        if (charSequence == null || !TextUtils.equals(charSequence.toString(), str)) {
            ((ho) mg0VarArr[i].d).t(gw3.m(str, ((ho) mg0VarArr[i].d).a.getFontMetricsInt(), false, null, 0), z, true);
        }
    }

    public int getBackgroundColor() {
        return this.j0;
    }

    public bvc getInstantViewLoader() {
        return null;
    }

    public int getTextColor() {
        return this.x;
    }

    public String getTitle() {
        CharSequence charSequence = ((ho) this.b[0].d).i;
        return charSequence == null ? "" : charSequence.toString();
    }

    public final void h(boolean z) {
        if (this.U == z) {
            return;
        }
        ValueAnimator valueAnimator = this.u0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.U = z;
        vc vcVar = this.W;
        boolean z2 = false;
        vcVar.setVisibility(0);
        this.N.c(true, (this.v0 || z) ? 0.0f : 1.0f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.V, z ? 1.0f : 0.0f);
        this.u0 = ofFloat;
        ofFloat.addUpdateListener(new oxb(this, (byte) 21));
        this.u0.addListener(new sw9((byte) 18, this, z));
        this.u0.setInterpolator(d53.h);
        this.u0.setDuration(320L);
        this.u0.start();
        boolean z3 = !z;
        gm.P3(this.P, z3, true);
        gm.P3(this.S, z3, true);
        if (vcVar.length() > 0 && this.U) {
            z2 = true;
        }
        gm.P3(this.K, z2, true);
    }

    public final void i() {
        mg0[] mg0VarArr = this.b;
        mg0 mg0Var = mg0VarArr[0];
        mg0VarArr[0] = mg0VarArr[1];
        mg0VarArr[1] = mg0Var;
        float[] fArr = this.d;
        float f = fArr[0];
        fArr[0] = fArr[1];
        fArr[1] = f;
        Paint[] paintArr = this.f;
        int color = paintArr[0].getColor();
        b(0, paintArr[1].getColor());
        b(1, color);
        invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, wi8.E(56.0f, this.f0 ? gm.m : 0, TLObject.FLAG_30));
    }

    public void setBackButton(boolean z) {
        this.v0 = z;
        if (this.U || this.a0) {
            return;
        }
        this.N.c(true, z ? 0.0f : 1.0f);
    }

    public void setBackButtonCached(boolean z) {
        this.v0 = z;
    }

    public void setHasForward(boolean z) {
        this.p0 = z;
    }

    public void setHeight(int i) {
        if (this.G != i) {
            this.G = i;
            float pow = (float) Math.pow(i / gm.L(56.0f), 0.5d);
            this.H = pow;
            t1 t1Var = this.I;
            t1Var.setScaleX(pow);
            t1Var.setScaleY(this.H);
            t1Var.setTranslationX((1.0f - this.H) * gm.L(42.0f));
            t1Var.setTranslationY((1.0f - this.H) * gm.L(-12.0f));
            float f = this.H;
            t1 t1Var2 = this.J;
            t1Var2.setScaleX(f);
            t1Var2.setScaleY(this.H);
            t1Var2.setTranslationX((1.0f - this.H) * (-gm.L(42.0f)));
            t1Var2.setTranslationY((1.0f - this.H) * gm.L(-12.0f));
            this.e0.setTranslationY(this.G - gm.L(56.0f));
            invalidate();
        }
    }

    public void setIsLocal(boolean z) {
        this.r0 = z;
    }

    public void setIsTonsite(boolean z) {
        this.q0 = z;
    }

    public void setMenuColors(int i) {
        boolean z = ddd.c(ddd.b(i))[0] < 0.5d;
        this.m0 = z ? -16777216 : -1;
        int i2 = z ? -1 : -16777216;
        this.n0 = i2;
        this.o0 = cmb.p1(0.6f, i2);
    }

    public void setMenuListener(qac qacVar) {
        this.g0 = qacVar;
    }

    public void setMenuType(int i) {
        if (this.h0 != i) {
            this.h0 = i;
        }
    }

    public void setProgress(float f) {
        this.d[0] = f;
        invalidate();
    }

    public void setTransitionProgress(float f) {
        this.c = f;
        invalidate();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return true;
    }

    public void setIsLoaded(boolean z) {
    }
}
