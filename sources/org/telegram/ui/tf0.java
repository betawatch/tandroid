package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class tf0 extends FrameLayout {
    public static final /* synthetic */ int F = 0;
    public int E;
    public final eg0 a;
    public final ViewGroup b;
    public final View c;
    public final View d;
    public final View e;
    public final org.telegram.ui.Components.m41 f;
    public final org.telegram.ui.Components.j20 h;
    public final TextView n;
    public final TextView r;
    public final TextView s;
    public final TextView v;
    public final FrameLayout w;
    public boolean x;
    public final PointF y;

    public tf0(Context context, ViewGroup viewGroup, View view, String str, final eg0 eg0Var) {
        super(context);
        PointF pointF = new PointF();
        this.y = pointF;
        this.b = viewGroup;
        this.c = view;
        this.a = eg0Var;
        View view2 = new View(getContext());
        this.d = view2;
        view2.setOnClickListener(new qf0(this));
        addView(view2, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        View view3 = new View(getContext());
        this.e = view3;
        view3.setBackgroundColor(TLObject.FLAG_30);
        view3.setAlpha(0.0f);
        addView(view3, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        org.telegram.ui.Components.m41 m41Var = new org.telegram.ui.Components.m41(getContext());
        this.f = m41Var;
        m41Var.setTransformType(1);
        m41Var.setDrawBackground(false);
        org.telegram.ui.Components.j20 j20Var = new org.telegram.ui.Components.j20(context, null, false);
        this.h = j20Var;
        j20Var.addView(m41Var, org.telegram.ui.Components.gb1.i(56, 56, 17));
        j20Var.a(m41Var);
        final int i10 = 0;
        j20Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.rf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                switch (i10) {
                    case 0:
                        eg0Var.a(this);
                        break;
                    default:
                        eg0Var.a(this);
                        break;
                }
            }
        });
        j20Var.setContentDescription(LocaleController.getString(R.string.Done));
        addView(j20Var, org.telegram.ui.Components.gb1.i(56, 56, 51));
        FrameLayout frameLayout = new FrameLayout(context);
        this.w = frameLayout;
        addView(frameLayout, org.telegram.ui.Components.gb1.h(-1, 140.0f, 49, 24.0f, 0.0f, 24.0f, 0.0f));
        TextView textView = new TextView(context);
        this.n = textView;
        textView.setText(LocaleController.getString(R.string.ConfirmCorrectNumber));
        textView.setTextSize(1, 14.0f);
        textView.setSingleLine();
        TextView k10 = d3.k(frameLayout, textView, org.telegram.ui.Components.gb1.h(-1, -2.0f, LocaleController.isRTL ? 5 : 3, 24.0f, 20.0f, 24.0f, 0.0f), context);
        this.r = k10;
        k10.setText(str);
        k10.setTextSize(1, 18.0f);
        k10.setTypeface(AndroidUtilities.bold());
        k10.setSingleLine();
        frameLayout.addView(k10, org.telegram.ui.Components.gb1.h(-1, -2.0f, LocaleController.isRTL ? 5 : 3, 24.0f, 48.0f, 24.0f, 0.0f));
        int dp = AndroidUtilities.dp(16.0f);
        TextView textView2 = new TextView(context);
        this.s = textView2;
        textView2.setText(LocaleController.getString(R.string.Edit));
        textView2.setSingleLine();
        textView2.setTextSize(1, 16.0f);
        int dp2 = AndroidUtilities.dp(6.0f);
        int i11 = org.telegram.ui.ActionBar.y6.Wh;
        textView2.setBackground(org.telegram.ui.ActionBar.y6.I0(dp2, org.telegram.ui.ActionBar.y6.x0(null, i11, false)));
        textView2.setOnClickListener(new qf0(this, eg0Var));
        Typeface typeface = Typeface.DEFAULT_BOLD;
        textView2.setTypeface(typeface);
        int i12 = dp / 2;
        textView2.setPadding(dp, i12, dp, i12);
        float f7 = 8;
        TextView k11 = d3.k(frameLayout, textView2, org.telegram.ui.Components.gb1.h(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 80, f7, f7, f7, f7), context);
        this.v = k11;
        k11.setText(LocaleController.getString(R.string.CheckPhoneNumberYes));
        k11.setSingleLine();
        k11.setTextSize(1, 16.0f);
        k11.setBackground(org.telegram.ui.ActionBar.y6.I0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.y6.x0(null, i11, false)));
        final int i13 = 1;
        k11.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.rf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                switch (i13) {
                    case 0:
                        eg0Var.a(this);
                        break;
                    default:
                        eg0Var.a(this);
                        break;
                }
            }
        });
        k11.setTypeface(typeface);
        k11.setPadding(dp, i12, dp, i12);
        frameLayout.addView(k11, org.telegram.ui.Components.gb1.h(-2, -2.0f, (LocaleController.isRTL ? 3 : 5) | 80, f7, f7, f7, f7));
        jh.k.b(view, viewGroup, pointF);
        j20Var.setTranslationX(pointF.x);
        j20Var.setTranslationY(pointF.y);
        requestLayout();
        b();
    }

    public final void a() {
        if (this.x) {
            return;
        }
        this.x = true;
        this.a.a.a0.b0 = null;
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(250L);
        duration.addListener(new sf0(this, 1));
        duration.addUpdateListener(new pf0(this, 0));
        duration.setInterpolator(org.telegram.ui.Components.ds.f);
        duration.start();
    }

    public final void b() {
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.O9, false);
        org.telegram.ui.Components.m41 m41Var = this.f;
        m41Var.setColor(x02);
        m41Var.setBackgroundColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.P9, false));
        int x03 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.h5, false);
        FrameLayout frameLayout = this.w;
        if (frameLayout.getBackground() == null) {
            frameLayout.setBackground(org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(12.0f), x03));
        } else if (x03 != this.E) {
            org.telegram.ui.ActionBar.y6.z1(x03, frameLayout.getBackground());
            frameLayout.invalidate();
        }
        this.E = x03;
        this.n.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.q5, false));
        this.r.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.j5, false));
        int i10 = org.telegram.ui.ActionBar.y6.Wh;
        this.s.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, i10, false));
        this.v.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, i10, false));
        this.h.updateColors();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        FrameLayout frameLayout = this.w;
        int measuredHeight = frameLayout.getMeasuredHeight();
        int translationY = (int) (this.h.getTranslationY() - AndroidUtilities.dp(32.0f));
        frameLayout.layout(frameLayout.getLeft(), translationY - measuredHeight, frameLayout.getRight(), translationY);
    }
}
