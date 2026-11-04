package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class yz0 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public ShapeDrawable E;
    public int F;
    public final /* synthetic */ g11 G;
    public final /* synthetic */ g11 H;
    public final FrameLayout a;
    public final ImageView b;
    public final ImageView c;
    public final gi.q3 d;
    public final View e;
    public final org.telegram.ui.Components.jl0 f;
    public final ai.z h;
    public v01 n;
    public float r;
    public ValueAnimator s;
    public pu0 w;
    public boolean x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yz0(g11 g11Var, Context context, boolean z10) {
        super(context);
        org.telegram.ui.ActionBar.e6 e6Var = g11Var.a1;
        this.H = g11Var;
        this.G = g11Var;
        final int i3 = 0;
        this.x = false;
        final int i10 = 1;
        setClickable(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.a = frameLayout;
        if (z10) {
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.G8, this, e6Var);
        }
        int L = org.telegram.messenger.g0.L(18.0f);
        int i11 = org.telegram.ui.ActionBar.k6.wf;
        Drawable d02 = org.telegram.ui.ActionBar.k6.d0(L, org.telegram.ui.ActionBar.k6.w0(i11, e6Var));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i11);
        frameLayout.setBackground(d02);
        org.telegram.ui.ActionBar.r6.k(frameLayout, d02, N, null, e6Var);
        frameLayout.setClipToOutline(true);
        float L2 = org.telegram.messenger.g0.L(18.0f);
        cg.p0 p0Var = cg.t0.a;
        frameLayout.setOutlineProvider(new cg.r0(0, L2));
        addView(frameLayout, b8.mf.d(-1, 36.0f, 55, 8.0f, 12.0f, 8.0f, 8.0f));
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        org.telegram.ui.Components.jl0 jl0Var = new org.telegram.ui.Components.jl0();
        this.f = jl0Var;
        jl0Var.c(0, false, false);
        int i12 = org.telegram.ui.ActionBar.k6.yf;
        jl0Var.a(org.telegram.ui.ActionBar.k6.w0(i12, e6Var));
        imageView.setImageDrawable(jl0Var);
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.s01
            public final /* synthetic */ yz0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        yz0 yz0Var = this.b;
                        ai.z zVar = yz0Var.h;
                        if (yz0Var.f.k == 1) {
                            zVar.setText("");
                            yz0Var.G.v(null, true, false);
                            v01 v01Var = yz0Var.n;
                            if (v01Var != null) {
                                v01Var.I1(null);
                                yz0Var.n.J1(true, true);
                                yz0Var.n.G1();
                            }
                            zVar.clearAnimation();
                            zVar.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.xq.h).start();
                            yz0Var.c(false);
                            break;
                        }
                        break;
                    case 1:
                        yz0 yz0Var2 = this.b;
                        g11 g11Var2 = yz0Var2.G;
                        if (!g11Var2.u()) {
                            g11Var2.q();
                            yz0Var2.h.requestFocus();
                            g11.a(g11Var2, 0, 0);
                            break;
                        }
                        break;
                    default:
                        yz0 yz0Var3 = this.b;
                        ai.z zVar2 = yz0Var3.h;
                        zVar2.setText("");
                        yz0Var3.G.v(null, true, false);
                        v01 v01Var2 = yz0Var3.n;
                        if (v01Var2 != null) {
                            v01Var2.I1(null);
                            yz0Var3.n.J1(true, true);
                        }
                        zVar2.clearAnimation();
                        zVar2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.xq.h).start();
                        yz0Var3.c(false);
                        break;
                }
            }
        });
        imageView.setClickable(false);
        final int i13 = 2;
        imageView.setImportantForAccessibility(2);
        frameLayout.addView(imageView, b8.mf.e(36, 36, 51));
        gi.q3 q3Var = new gi.q3(this, context, z10);
        this.d = q3Var;
        frameLayout.addView(q3Var, b8.mf.d(-1, -1.0f, org.telegram.messenger.hs.E1, 36.0f, 0.0f, 0.0f, 0.0f));
        ai.z zVar = new ai.z(this, context, e6Var, i13);
        this.h = zVar;
        zVar.addTextChangedListener(new n0(this, 15));
        zVar.setBackground(null);
        zVar.setPadding(0, 0, org.telegram.messenger.g0.L(4.0f), 0);
        zVar.setTextSize(1, 16.0f);
        zVar.setHint(org.telegram.messenger.bd.M0(2131745846, null));
        org.telegram.ui.ActionBar.r6.E(zVar, i12, e6Var);
        org.telegram.ui.ActionBar.r6.V(zVar, org.telegram.ui.ActionBar.k6.G6, e6Var);
        zVar.setImeOptions(268435459);
        org.telegram.ui.ActionBar.r6.m(zVar, 30, org.telegram.ui.ActionBar.k6.Ai, e6Var);
        zVar.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        zVar.setGravity(19);
        zVar.setCursorWidth(1.5f);
        zVar.setMaxLines(1);
        zVar.setSingleLine(true);
        zVar.setLines(1);
        zVar.setTranslationY(org.telegram.messenger.g0.L(-1.0f));
        q3Var.addView(zVar, b8.mf.d(-1, -1.0f, org.telegram.messenger.hs.E1, 0.0f, 0.0f, 32.0f, 0.0f));
        if (z10) {
            View view = new View(context);
            this.e = view;
            Drawable g7 = k2.p1.g(context, R.drawable.gradient_right);
            org.telegram.ui.ActionBar.r6.y(this, g7, i11, e6Var, PorterDuff.Mode.MULTIPLY);
            view.setBackground(g7);
            view.setAlpha(0.0f);
            q3Var.addView(view, b8.mf.e(18, -1, 3));
        }
        setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.s01
            public final /* synthetic */ yz0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i10) {
                    case 0:
                        yz0 yz0Var = this.b;
                        ai.z zVar2 = yz0Var.h;
                        if (yz0Var.f.k == 1) {
                            zVar2.setText("");
                            yz0Var.G.v(null, true, false);
                            v01 v01Var = yz0Var.n;
                            if (v01Var != null) {
                                v01Var.I1(null);
                                yz0Var.n.J1(true, true);
                                yz0Var.n.G1();
                            }
                            zVar2.clearAnimation();
                            zVar2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.xq.h).start();
                            yz0Var.c(false);
                            break;
                        }
                        break;
                    case 1:
                        yz0 yz0Var2 = this.b;
                        g11 g11Var2 = yz0Var2.G;
                        if (!g11Var2.u()) {
                            g11Var2.q();
                            yz0Var2.h.requestFocus();
                            g11.a(g11Var2, 0, 0);
                            break;
                        }
                        break;
                    default:
                        yz0 yz0Var3 = this.b;
                        ai.z zVar22 = yz0Var3.h;
                        zVar22.setText("");
                        yz0Var3.G.v(null, true, false);
                        v01 v01Var2 = yz0Var3.n;
                        if (v01Var2 != null) {
                            v01Var2.I1(null);
                            yz0Var3.n.J1(true, true);
                        }
                        zVar22.clearAnimation();
                        zVar22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.xq.h).start();
                        yz0Var3.c(false);
                        break;
                }
            }
        });
        ImageView imageView2 = new ImageView(context);
        this.c = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new gi.b2(this));
        int i14 = org.telegram.ui.ActionBar.k6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i14, e6Var), 1, org.telegram.messenger.g0.L(15.0f));
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i14);
        imageView2.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(imageView2, h02, null, N2, e6Var);
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.s01
            public final /* synthetic */ yz0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        yz0 yz0Var = this.b;
                        ai.z zVar2 = yz0Var.h;
                        if (yz0Var.f.k == 1) {
                            zVar2.setText("");
                            yz0Var.G.v(null, true, false);
                            v01 v01Var = yz0Var.n;
                            if (v01Var != null) {
                                v01Var.I1(null);
                                yz0Var.n.J1(true, true);
                                yz0Var.n.G1();
                            }
                            zVar2.clearAnimation();
                            zVar2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.xq.h).start();
                            yz0Var.c(false);
                            break;
                        }
                        break;
                    case 1:
                        yz0 yz0Var2 = this.b;
                        g11 g11Var2 = yz0Var2.G;
                        if (!g11Var2.u()) {
                            g11Var2.q();
                            yz0Var2.h.requestFocus();
                            g11.a(g11Var2, 0, 0);
                            break;
                        }
                        break;
                    default:
                        yz0 yz0Var3 = this.b;
                        ai.z zVar22 = yz0Var3.h;
                        zVar22.setText("");
                        yz0Var3.G.v(null, true, false);
                        v01 v01Var2 = yz0Var3.n;
                        if (v01Var2 != null) {
                            v01Var2.I1(null);
                            yz0Var3.n.J1(true, true);
                        }
                        zVar22.clearAnimation();
                        zVar22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.xq.h).start();
                        yz0Var3.c(false);
                        break;
                }
            }
        });
        frameLayout.addView(imageView2, b8.mf.e(36, 36, 53));
        if (dh.d0.d) {
            return;
        }
        b();
    }

    public static void a(yz0 yz0Var, boolean z10) {
        if (z10) {
            if (yz0Var.w == null) {
                pu0 pu0Var = new pu0(yz0Var, 15);
                yz0Var.w = pu0Var;
                org.telegram.messenger.g0.i3(pu0Var, 340L);
                return;
            }
            return;
        }
        pu0 pu0Var2 = yz0Var.w;
        if (pu0Var2 != null) {
            org.telegram.messenger.g0.r(pu0Var2);
            yz0Var.w = null;
        }
        org.telegram.messenger.g0.V3(yz0Var.c, false, true);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.E8));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        g11 g11Var = this.G;
        int i3 = g11Var.a0;
        if (this.n != null || getContext() == null) {
            return;
        }
        int i10 = 2;
        if (i3 == 1 || i3 == 11 || i3 == 2 || i3 == 0 || i3 == 12 || i3 == 4 || i3 == 10 || i3 == 9 || i3 == 14) {
            if (i3 != 0) {
                if (i3 != 4) {
                    if (i3 != 12) {
                        i10 = 0;
                    }
                }
                v01 v01Var = new v01(this, getContext(), i10, g11Var.a1);
                this.n = v01Var;
                v01Var.setShownButtonsAtStart(i3 != 4 ? 6.5f : 4.5f);
                v01 v01Var2 = this.n;
                ai.z zVar = this.h;
                v01Var2.setDontOccupyWidth((int) zVar.getPaint().measureText(((Object) zVar.getHint()) + ""));
                final int i11 = 0;
                this.n.setOnScrollIntoOccupiedWidth(new org.telegram.messenger.u10(this) { // from class: org.telegram.ui.t01
                    public final /* synthetic */ yz0 b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.messenger.u10
                    public final void a(Object obj) {
                        switch (i11) {
                            case 0:
                                Integer num = (Integer) obj;
                                yz0 yz0Var = this.b;
                                yz0Var.h.setTranslationX(-Math.max(0, num.intValue()));
                                yz0Var.c(num.intValue() > 0);
                                yz0Var.d(false);
                                break;
                            default:
                                org.telegram.ui.Components.tu0 tu0Var = (org.telegram.ui.Components.tu0) obj;
                                yz0 yz0Var2 = this.b;
                                g11 g11Var2 = yz0Var2.G;
                                if (yz0Var2.n.getSelectedCategory() != tu0Var) {
                                    g11Var2.v(tu0Var.a, false, false);
                                    yz0Var2.n.I1(tu0Var);
                                    break;
                                } else {
                                    g11Var2.v(null, false, false);
                                    yz0Var2.n.I1(null);
                                    break;
                                }
                        }
                    }
                });
                final int i12 = 1;
                this.n.setOnCategoryClick(new org.telegram.messenger.u10(this) { // from class: org.telegram.ui.t01
                    public final /* synthetic */ yz0 b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.messenger.u10
                    public final void a(Object obj) {
                        switch (i12) {
                            case 0:
                                Integer num = (Integer) obj;
                                yz0 yz0Var = this.b;
                                yz0Var.h.setTranslationX(-Math.max(0, num.intValue()));
                                yz0Var.c(num.intValue() > 0);
                                yz0Var.d(false);
                                break;
                            default:
                                org.telegram.ui.Components.tu0 tu0Var = (org.telegram.ui.Components.tu0) obj;
                                yz0 yz0Var2 = this.b;
                                g11 g11Var2 = yz0Var2.G;
                                if (yz0Var2.n.getSelectedCategory() != tu0Var) {
                                    g11Var2.v(tu0Var.a, false, false);
                                    yz0Var2.n.I1(tu0Var);
                                    break;
                                } else {
                                    g11Var2.v(null, false, false);
                                    yz0Var2.n.I1(null);
                                    break;
                                }
                        }
                    }
                });
                this.a.addView(this.n, b8.mf.d(-1, -1.0f, org.telegram.messenger.hs.E1, 36.0f, 0.0f, 0.0f, 0.0f));
            }
            i10 = 1;
            v01 v01Var3 = new v01(this, getContext(), i10, g11Var.a1);
            this.n = v01Var3;
            v01Var3.setShownButtonsAtStart(i3 != 4 ? 6.5f : 4.5f);
            v01 v01Var22 = this.n;
            ai.z zVar2 = this.h;
            v01Var22.setDontOccupyWidth((int) zVar2.getPaint().measureText(((Object) zVar2.getHint()) + ""));
            final int i112 = 0;
            this.n.setOnScrollIntoOccupiedWidth(new org.telegram.messenger.u10(this) { // from class: org.telegram.ui.t01
                public final /* synthetic */ yz0 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.u10
                public final void a(Object obj) {
                    switch (i112) {
                        case 0:
                            Integer num = (Integer) obj;
                            yz0 yz0Var = this.b;
                            yz0Var.h.setTranslationX(-Math.max(0, num.intValue()));
                            yz0Var.c(num.intValue() > 0);
                            yz0Var.d(false);
                            break;
                        default:
                            org.telegram.ui.Components.tu0 tu0Var = (org.telegram.ui.Components.tu0) obj;
                            yz0 yz0Var2 = this.b;
                            g11 g11Var2 = yz0Var2.G;
                            if (yz0Var2.n.getSelectedCategory() != tu0Var) {
                                g11Var2.v(tu0Var.a, false, false);
                                yz0Var2.n.I1(tu0Var);
                                break;
                            } else {
                                g11Var2.v(null, false, false);
                                yz0Var2.n.I1(null);
                                break;
                            }
                    }
                }
            });
            final int i122 = 1;
            this.n.setOnCategoryClick(new org.telegram.messenger.u10(this) { // from class: org.telegram.ui.t01
                public final /* synthetic */ yz0 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.u10
                public final void a(Object obj) {
                    switch (i122) {
                        case 0:
                            Integer num = (Integer) obj;
                            yz0 yz0Var = this.b;
                            yz0Var.h.setTranslationX(-Math.max(0, num.intValue()));
                            yz0Var.c(num.intValue() > 0);
                            yz0Var.d(false);
                            break;
                        default:
                            org.telegram.ui.Components.tu0 tu0Var = (org.telegram.ui.Components.tu0) obj;
                            yz0 yz0Var2 = this.b;
                            g11 g11Var2 = yz0Var2.G;
                            if (yz0Var2.n.getSelectedCategory() != tu0Var) {
                                g11Var2.v(tu0Var.a, false, false);
                                yz0Var2.n.I1(tu0Var);
                                break;
                            } else {
                                g11Var2.v(null, false, false);
                                yz0Var2.n.I1(null);
                                break;
                            }
                    }
                }
            });
            this.a.addView(this.n, b8.mf.d(-1, -1.0f, org.telegram.messenger.hs.E1, 36.0f, 0.0f, 0.0f, 0.0f));
        }
    }

    public final void c(boolean z10) {
        if (z10 == this.x) {
            return;
        }
        this.x = z10;
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.r, z10 ? 1.0f : 0.0f);
        this.s = ofFloat;
        ofFloat.addUpdateListener(new xy0(this, 5));
        this.s.setDuration(120L);
        this.s.setInterpolator(org.telegram.ui.Components.xq.h);
        this.s.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v5 */
    public final void d(boolean z10) {
        v01 v01Var;
        v01 v01Var2;
        org.telegram.ui.Components.jl0 jl0Var = this.f;
        int i3 = jl0Var.k;
        ai.z zVar = this.h;
        if (i3 != 2 || ((zVar.length() == 0 && ((v01Var2 = this.n) == null || v01Var2.getSelectedCategory() == null)) || z10)) {
            ?? r62 = (zVar.length() > 0 || ((v01Var = this.n) != null && v01Var.w3 > 0.5f && (v01Var.r3 || v01Var.getSelectedCategory() != null))) ? 1 : 0;
            jl0Var.b(r62);
            ImageView imageView = this.b;
            imageView.setClickable(r62);
            imageView.setContentDescription(r62 != 0 ? org.telegram.messenger.bd.M0(2131754878, null) : null);
            imageView.setImportantForAccessibility(r62 != 0 ? 1 : 2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        g11 g11Var = this.H;
        yg0 yg0Var = g11Var.h0;
        yz0 yz0Var = g11Var.g0;
        h01 h01Var = g11Var.V;
        if (h01Var != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float x10 = yg0Var.getX() + yz0Var.getX();
            float y9 = yg0Var.getY() + yz0Var.getY();
            ai.n nVar = (ai.n) h01Var;
            dh.a0 a0Var = (dh.a0) nVar.b;
            dh.z zVar = a0Var.a;
            org.telegram.ui.Components.li0 li0Var = (org.telegram.ui.Components.li0) nVar.c;
            RectF rectF = org.telegram.messenger.g0.P;
            float f10 = 0;
            rectF.set(f10, f10, measuredWidth, measuredHeight);
            li0Var.getDelegate().E(canvas, rectF, 0.0f, zVar.getX() + x10, (a0Var.y == 1 ? zVar.getY() - org.telegram.messenger.g0.m : zVar.getY() + a0Var.c.getY()) + y9, org.telegram.messenger.hs.e4, true);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    public final void invalidate() {
        if (dh.d0.b(this)) {
            return;
        }
        super.invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(52.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        if (f10 != getTranslationY()) {
            super.setTranslationY(f10);
            if (this.H.V != null) {
                invalidate();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        FrameLayout frameLayout;
        org.telegram.ui.ActionBar.e6 e6Var = this.G.a1;
        try {
            org.telegram.ui.Components.jl0 jl0Var = this.f;
            if (jl0Var != null) {
                jl0Var.a(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.yf, e6Var));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (!this.y || (frameLayout = this.a) == null) {
            return;
        }
        int r12 = org.telegram.ui.ActionBar.k6.r1(0.06f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.E8, e6Var));
        if (this.E != null) {
            Drawable background = frameLayout.getBackground();
            ShapeDrawable shapeDrawable = this.E;
            if (background == shapeDrawable) {
                if (r12 != this.F) {
                    org.telegram.ui.ActionBar.k6.C1(r12, shapeDrawable);
                    frameLayout.invalidate();
                }
                this.F = r12;
            }
        }
        ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(18.0f), r12);
        this.E = d02;
        frameLayout.setBackground(d02);
        this.F = r12;
    }
}
