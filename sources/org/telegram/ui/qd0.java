package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class qd0 extends FrameLayout {
    public static final /* synthetic */ int G = 0;
    public final PointF E;
    public int F;
    public final f a;
    public final ViewGroup b;
    public final View c;
    public final View d;
    public final View e;
    public final org.telegram.ui.Components.k21 f;
    public final org.telegram.ui.Components.c10 h;
    public final TextView n;
    public final TextView r;
    public final TextView s;
    public final TextView w;
    public final FrameLayout x;
    public boolean y;

    public qd0(Context context, ViewGroup viewGroup, View view, String str, final f fVar) {
        super(context);
        PointF pointF = new PointF();
        this.E = pointF;
        this.b = viewGroup;
        this.c = view;
        this.a = fVar;
        View view2 = new View(getContext());
        this.d = view2;
        view2.setOnClickListener(new j40(this, 9));
        addView(view2, c8.ma.c(-1.0f, -1));
        View view3 = new View(getContext());
        this.e = view3;
        view3.setBackgroundColor(TLObject.FLAG_30);
        view3.setAlpha(0.0f);
        addView(view3, c8.ma.c(-1.0f, -1));
        org.telegram.ui.Components.k21 k21Var = new org.telegram.ui.Components.k21(getContext());
        this.f = k21Var;
        final int i7 = 1;
        k21Var.setTransformType(1);
        final int i10 = 0;
        k21Var.setDrawBackground(false);
        org.telegram.ui.Components.c10 c10Var = new org.telegram.ui.Components.c10(context, null, false);
        this.h = c10Var;
        c10Var.addView(k21Var, c8.ma.e(56, 56, 17));
        c10Var.a(k21Var);
        c10Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.od0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                switch (i10) {
                    case 0:
                        qd0 qd0Var = this;
                        qd0Var.getClass();
                        fVar.w1(qd0Var);
                        break;
                    case 1:
                        qd0 qd0Var2 = this;
                        qd0Var2.getClass();
                        fVar.getClass();
                        qd0Var2.a();
                        break;
                    default:
                        qd0 qd0Var3 = this;
                        qd0Var3.getClass();
                        fVar.w1(qd0Var3);
                        break;
                }
            }
        });
        c10Var.setContentDescription(org.telegram.messenger.hd.N0(2131751342, null));
        addView(c10Var, c8.ma.e(56, 56, 51));
        FrameLayout frameLayout = new FrameLayout(context);
        this.x = frameLayout;
        addView(frameLayout, c8.ma.d(-1, 140.0f, 49, 24.0f, 0.0f, 24.0f, 0.0f));
        TextView textView = new TextView(context);
        this.n = textView;
        textView.setText(org.telegram.messenger.hd.N0(2131751804, null));
        textView.setTextSize(1, 14.0f);
        textView.setSingleLine();
        TextView m10 = org.telegram.ui.Cells.c0.m(frameLayout, textView, c8.ma.d(-1, -2.0f, org.telegram.messenger.hd.a0 ? 5 : 3, 24.0f, 20.0f, 24.0f, 0.0f), context);
        this.r = m10;
        m10.setText(str);
        m10.setTextSize(1, 18.0f);
        m10.setTypeface(org.telegram.messenger.g0.o());
        m10.setSingleLine();
        frameLayout.addView(m10, c8.ma.d(-1, -2.0f, org.telegram.messenger.hd.a0 ? 5 : 3, 24.0f, 48.0f, 24.0f, 0.0f));
        int L = org.telegram.messenger.g0.L(16.0f);
        TextView textView2 = new TextView(context);
        this.s = textView2;
        textView2.setText(org.telegram.messenger.hd.N0(2131751323, null));
        textView2.setSingleLine();
        textView2.setTextSize(1, 16.0f);
        int L2 = org.telegram.messenger.g0.L(6.0f);
        int i11 = org.telegram.ui.ActionBar.m6.Ni;
        textView2.setBackground(org.telegram.ui.ActionBar.m6.J0(L2, org.telegram.ui.ActionBar.m6.x0(null, i11, false)));
        textView2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.od0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                switch (i7) {
                    case 0:
                        qd0 qd0Var = this;
                        qd0Var.getClass();
                        fVar.w1(qd0Var);
                        break;
                    case 1:
                        qd0 qd0Var2 = this;
                        qd0Var2.getClass();
                        fVar.getClass();
                        qd0Var2.a();
                        break;
                    default:
                        qd0 qd0Var3 = this;
                        qd0Var3.getClass();
                        fVar.w1(qd0Var3);
                        break;
                }
            }
        });
        Typeface typeface = Typeface.DEFAULT_BOLD;
        textView2.setTypeface(typeface);
        int i12 = L / 2;
        textView2.setPadding(L, i12, L, i12);
        float f10 = 8;
        TextView m11 = org.telegram.ui.Cells.c0.m(frameLayout, textView2, c8.ma.d(-2, -2.0f, (org.telegram.messenger.hd.a0 ? 5 : 3) | 80, f10, f10, f10, f10), context);
        this.w = m11;
        m11.setText(org.telegram.messenger.hd.N0(2131752140, null));
        m11.setSingleLine();
        m11.setTextSize(1, 16.0f);
        m11.setBackground(org.telegram.ui.ActionBar.m6.J0(org.telegram.messenger.g0.L(6.0f), org.telegram.ui.ActionBar.m6.x0(null, i11, false)));
        final int i13 = 2;
        m11.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.od0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                switch (i13) {
                    case 0:
                        qd0 qd0Var = this;
                        qd0Var.getClass();
                        fVar.w1(qd0Var);
                        break;
                    case 1:
                        qd0 qd0Var2 = this;
                        qd0Var2.getClass();
                        fVar.getClass();
                        qd0Var2.a();
                        break;
                    default:
                        qd0 qd0Var3 = this;
                        qd0Var3.getClass();
                        fVar.w1(qd0Var3);
                        break;
                }
            }
        });
        m11.setTypeface(typeface);
        m11.setPadding(L, i12, L, i12);
        frameLayout.addView(m11, c8.ma.d(-2, -2.0f, (org.telegram.messenger.hd.a0 ? 3 : 5) | 80, f10, f10, f10, f10));
        jh.k.b(view, viewGroup, pointF);
        c10Var.setTranslationX(pointF.x);
        c10Var.setTranslationY(pointF.y);
        requestLayout();
        b();
    }

    public final void a() {
        if (this.y) {
            return;
        }
        this.y = true;
        ((ce0) this.a.b).h0.c0 = null;
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(250L);
        duration.addListener(new pd0(this, 1));
        duration.addUpdateListener(new nd0(this, 0));
        duration.setInterpolator(org.telegram.ui.Components.nr.f);
        duration.start();
    }

    public final void b() {
        int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.O9, false);
        org.telegram.ui.Components.k21 k21Var = this.f;
        k21Var.setColor(x02);
        k21Var.setBackgroundColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.P9, false));
        int x03 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.h5, false);
        FrameLayout frameLayout = this.x;
        if (frameLayout.getBackground() == null) {
            frameLayout.setBackground(org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(12.0f), x03));
        } else if (x03 != this.F) {
            org.telegram.ui.ActionBar.m6.C1(x03, frameLayout.getBackground());
            frameLayout.invalidate();
        }
        this.F = x03;
        this.n.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.q5, false));
        this.r.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.j5, false));
        int i7 = org.telegram.ui.ActionBar.m6.Ni;
        this.s.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, i7, false));
        this.w.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, i7, false));
        this.h.updateColors();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        FrameLayout frameLayout = this.x;
        int measuredHeight = frameLayout.getMeasuredHeight();
        int translationY = (int) (this.h.getTranslationY() - org.telegram.messenger.g0.L(32.0f));
        frameLayout.layout(frameLayout.getLeft(), translationY - measuredHeight, frameLayout.getRight(), translationY);
    }
}
