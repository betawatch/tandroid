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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class we0 extends FrameLayout {
    public static final /* synthetic */ int F = 0;
    public final PointF D;
    public int E;
    public final e a;
    public final ViewGroup b;
    public final View c;
    public final View d;
    public final View e;
    public final org.telegram.ui.Components.v21 f;
    public final org.telegram.ui.Components.f10 h;
    public final TextView n;
    public final TextView r;
    public final TextView s;
    public final TextView w;
    public final FrameLayout x;
    public boolean y;

    public we0(Context context, ViewGroup viewGroup, View view, String str, final e eVar) {
        super(context);
        PointF pointF = new PointF();
        this.D = pointF;
        this.b = viewGroup;
        this.c = view;
        this.a = eVar;
        View view2 = new View(getContext());
        this.d = view2;
        view2.setOnClickListener(new f50(this, 9));
        addView(view2, w7.b6.c(-1.0f, -1));
        View view3 = new View(getContext());
        this.e = view3;
        view3.setBackgroundColor(TLObject.FLAG_30);
        view3.setAlpha(0.0f);
        addView(view3, w7.b6.c(-1.0f, -1));
        org.telegram.ui.Components.v21 v21Var = new org.telegram.ui.Components.v21(getContext());
        this.f = v21Var;
        final int i10 = 1;
        v21Var.setTransformType(1);
        final int i11 = 0;
        v21Var.setDrawBackground(false);
        org.telegram.ui.Components.f10 f10Var = new org.telegram.ui.Components.f10(context, null, false);
        this.h = f10Var;
        f10Var.addView(v21Var, w7.b6.e(56, 56, 17));
        f10Var.a(v21Var);
        f10Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.ue0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                switch (i11) {
                    case 0:
                        we0 we0Var = this;
                        we0Var.getClass();
                        eVar.a2(we0Var);
                        break;
                    case 1:
                        we0 we0Var2 = this;
                        we0Var2.getClass();
                        eVar.getClass();
                        we0Var2.a();
                        break;
                    default:
                        we0 we0Var3 = this;
                        we0Var3.getClass();
                        eVar.a2(we0Var3);
                        break;
                }
            }
        });
        f10Var.setContentDescription(org.telegram.messenger.cd.L0(2131751355, null));
        addView(f10Var, w7.b6.e(56, 56, 51));
        FrameLayout frameLayout = new FrameLayout(context);
        this.x = frameLayout;
        addView(frameLayout, w7.b6.d(-1, 140.0f, 49, 24.0f, 0.0f, 24.0f, 0.0f));
        TextView textView = new TextView(context);
        this.n = textView;
        textView.setText(org.telegram.messenger.cd.L0(2131751816, null));
        textView.setTextSize(1, 14.0f);
        textView.setSingleLine();
        TextView l4 = org.telegram.ui.Cells.f1.l(frameLayout, textView, w7.b6.d(-1, -2.0f, org.telegram.messenger.cd.X ? 5 : 3, 24.0f, 20.0f, 24.0f, 0.0f), context);
        this.r = l4;
        l4.setText(str);
        l4.setTextSize(1, 18.0f);
        l4.setTypeface(org.telegram.messenger.i0.o());
        l4.setSingleLine();
        frameLayout.addView(l4, w7.b6.d(-1, -2.0f, org.telegram.messenger.cd.X ? 5 : 3, 24.0f, 48.0f, 24.0f, 0.0f));
        int L = org.telegram.messenger.i0.L(16.0f);
        TextView textView2 = new TextView(context);
        this.s = textView2;
        textView2.setText(org.telegram.messenger.cd.L0(2131751336, null));
        textView2.setSingleLine();
        textView2.setTextSize(1, 16.0f);
        int L2 = org.telegram.messenger.i0.L(6.0f);
        int i12 = org.telegram.ui.ActionBar.t6.Ki;
        textView2.setBackground(org.telegram.ui.ActionBar.t6.J0(L2, org.telegram.ui.ActionBar.t6.x0(null, i12, false)));
        textView2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.ue0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                switch (i10) {
                    case 0:
                        we0 we0Var = this;
                        we0Var.getClass();
                        eVar.a2(we0Var);
                        break;
                    case 1:
                        we0 we0Var2 = this;
                        we0Var2.getClass();
                        eVar.getClass();
                        we0Var2.a();
                        break;
                    default:
                        we0 we0Var3 = this;
                        we0Var3.getClass();
                        eVar.a2(we0Var3);
                        break;
                }
            }
        });
        Typeface typeface = Typeface.DEFAULT_BOLD;
        textView2.setTypeface(typeface);
        int i13 = L / 2;
        textView2.setPadding(L, i13, L, i13);
        float f7 = 8;
        TextView l10 = org.telegram.ui.Cells.f1.l(frameLayout, textView2, w7.b6.d(-2, -2.0f, (org.telegram.messenger.cd.X ? 5 : 3) | 80, f7, f7, f7, f7), context);
        this.w = l10;
        l10.setText(org.telegram.messenger.cd.L0(2131752152, null));
        l10.setSingleLine();
        l10.setTextSize(1, 16.0f);
        l10.setBackground(org.telegram.ui.ActionBar.t6.J0(org.telegram.messenger.i0.L(6.0f), org.telegram.ui.ActionBar.t6.x0(null, i12, false)));
        final int i14 = 2;
        l10.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.ue0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                switch (i14) {
                    case 0:
                        we0 we0Var = this;
                        we0Var.getClass();
                        eVar.a2(we0Var);
                        break;
                    case 1:
                        we0 we0Var2 = this;
                        we0Var2.getClass();
                        eVar.getClass();
                        we0Var2.a();
                        break;
                    default:
                        we0 we0Var3 = this;
                        we0Var3.getClass();
                        eVar.a2(we0Var3);
                        break;
                }
            }
        });
        l10.setTypeface(typeface);
        l10.setPadding(L, i13, L, i13);
        frameLayout.addView(l10, w7.b6.d(-2, -2.0f, (org.telegram.messenger.cd.X ? 3 : 5) | 80, f7, f7, f7, f7));
        zg.h.b(view, viewGroup, pointF);
        f10Var.setTranslationX(pointF.x);
        f10Var.setTranslationY(pointF.y);
        requestLayout();
        b();
    }

    public final void a() {
        if (this.y) {
            return;
        }
        this.y = true;
        ((gf0) this.a.b).a0.b0 = null;
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(250L);
        duration.addListener(new ve0(this, 1));
        duration.addUpdateListener(new te0(this, 0));
        duration.setInterpolator(org.telegram.ui.Components.gr.f);
        duration.start();
    }

    public final void b() {
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.O9, false);
        org.telegram.ui.Components.v21 v21Var = this.f;
        v21Var.setColor(x02);
        v21Var.setBackgroundColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.P9, false));
        int x03 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.h5, false);
        FrameLayout frameLayout = this.x;
        if (frameLayout.getBackground() == null) {
            frameLayout.setBackground(org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(12.0f), x03));
        } else if (x03 != this.E) {
            org.telegram.ui.ActionBar.t6.C1(x03, frameLayout.getBackground());
            frameLayout.invalidate();
        }
        this.E = x03;
        this.n.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.q5, false));
        this.r.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.j5, false));
        int i10 = org.telegram.ui.ActionBar.t6.Ki;
        this.s.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, i10, false));
        this.w.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, i10, false));
        this.h.updateColors();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        FrameLayout frameLayout = this.x;
        int measuredHeight = frameLayout.getMeasuredHeight();
        int translationY = (int) (this.h.getTranslationY() - org.telegram.messenger.i0.L(32.0f));
        frameLayout.layout(frameLayout.getLeft(), translationY - measuredHeight, frameLayout.getRight(), translationY);
    }
}
