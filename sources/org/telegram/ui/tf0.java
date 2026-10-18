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

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class tf0 extends FrameLayout {
    public static final /* synthetic */ int E = 0;
    public final dg0 a;
    public final ViewGroup b;
    public final View c;
    public final View d;
    public final View e;
    public final org.telegram.ui.Components.z31 f;
    public final org.telegram.ui.Components.h20 h;
    public final TextView n;
    public final TextView r;
    public final TextView s;
    public final TextView v;
    public final FrameLayout w;
    public boolean x;
    public final PointF y;

    public tf0(Context context, ViewGroup viewGroup, View view, String str, final dg0 dg0Var) {
        super(context);
        PointF pointF = new PointF();
        this.y = pointF;
        this.b = viewGroup;
        this.c = view;
        this.a = dg0Var;
        View view2 = new View(getContext());
        this.d = view2;
        view2.setOnClickListener(new qf0(this));
        addView(view2, w7.z5.d(-1.0f, -1));
        View view3 = new View(getContext());
        this.e = view3;
        view3.setBackgroundColor(TLObject.FLAG_30);
        view3.setAlpha(0.0f);
        addView(view3, w7.z5.d(-1.0f, -1));
        org.telegram.ui.Components.z31 z31Var = new org.telegram.ui.Components.z31(getContext());
        this.f = z31Var;
        z31Var.setTransformType(1);
        z31Var.setDrawBackground(false);
        org.telegram.ui.Components.h20 h20Var = new org.telegram.ui.Components.h20(context, null, false);
        this.h = h20Var;
        h20Var.addView(z31Var, w7.z5.e(56, 56, 17));
        h20Var.a(z31Var);
        final int i10 = 0;
        h20Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.rf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                switch (i10) {
                    case 0:
                        dg0Var.a(this);
                        break;
                    default:
                        dg0Var.a(this);
                        break;
                }
            }
        });
        h20Var.setContentDescription(LocaleController.getString(R.string.Done));
        addView(h20Var, w7.z5.e(56, 56, 51));
        FrameLayout frameLayout = new FrameLayout(context);
        this.w = frameLayout;
        addView(frameLayout, w7.z5.a(140.0f, 24.0f, 0.0f, 24.0f, 0.0f, -1, 49));
        TextView textView = new TextView(context);
        this.n = textView;
        textView.setText(LocaleController.getString(R.string.ConfirmCorrectNumber));
        textView.setTextSize(1, 14.0f);
        textView.setSingleLine();
        TextView j10 = org.telegram.ui.Cells.c1.j(frameLayout, textView, w7.z5.a(-2.0f, 24.0f, 20.0f, 24.0f, 0.0f, -1, LocaleController.isRTL ? 5 : 3), context);
        this.r = j10;
        j10.setText(str);
        j10.setTextSize(1, 18.0f);
        j10.setTypeface(AndroidUtilities.bold());
        j10.setSingleLine();
        frameLayout.addView(j10, w7.z5.a(-2.0f, 24.0f, 48.0f, 24.0f, 0.0f, -1, LocaleController.isRTL ? 5 : 3));
        int dp = AndroidUtilities.dp(16.0f);
        TextView textView2 = new TextView(context);
        this.s = textView2;
        textView2.setText(LocaleController.getString(R.string.Edit));
        textView2.setSingleLine();
        textView2.setTextSize(1, 16.0f);
        int dp2 = AndroidUtilities.dp(6.0f);
        int i11 = org.telegram.ui.ActionBar.h6.Wh;
        textView2.setBackground(org.telegram.ui.ActionBar.h6.H0(dp2, org.telegram.ui.ActionBar.h6.x0(null, i11, false)));
        textView2.setOnClickListener(new qf0(this, dg0Var));
        Typeface typeface = Typeface.DEFAULT_BOLD;
        textView2.setTypeface(typeface);
        int i12 = dp / 2;
        textView2.setPadding(dp, i12, dp, i12);
        float f7 = 8;
        TextView j11 = org.telegram.ui.Cells.c1.j(frameLayout, textView2, w7.z5.a(-2.0f, f7, f7, f7, f7, -2, (LocaleController.isRTL ? 5 : 3) | 80), context);
        this.v = j11;
        j11.setText(LocaleController.getString(R.string.CheckPhoneNumberYes));
        j11.setSingleLine();
        j11.setTextSize(1, 16.0f);
        j11.setBackground(org.telegram.ui.ActionBar.h6.H0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.h6.x0(null, i11, false)));
        final int i13 = 1;
        j11.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.rf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                switch (i13) {
                    case 0:
                        dg0Var.a(this);
                        break;
                    default:
                        dg0Var.a(this);
                        break;
                }
            }
        });
        j11.setTypeface(typeface);
        j11.setPadding(dp, i12, dp, i12);
        frameLayout.addView(j11, w7.z5.a(-2.0f, f7, f7, f7, f7, -2, (LocaleController.isRTL ? 3 : 5) | 80));
        ih.j.b(view, viewGroup, pointF);
        h20Var.setTranslationX(pointF.x);
        h20Var.setTranslationY(pointF.y);
        requestLayout();
        b();
    }

    public final void a() {
        if (this.x) {
            return;
        }
        this.x = true;
        this.a.a.V.b0 = null;
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(250L);
        duration.addListener(new sf0(this, 1));
        duration.addUpdateListener(new pf0(this, 0));
        duration.setInterpolator(org.telegram.ui.Components.bs.f);
        duration.start();
    }

    public final void b() {
        int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.O9, false);
        org.telegram.ui.Components.z31 z31Var = this.f;
        z31Var.setColor(x02);
        z31Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.P9, false));
        this.w.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(12.0f), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.h5, false)));
        this.n.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.q5, false));
        this.r.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.j5, false));
        int i10 = org.telegram.ui.ActionBar.h6.Wh;
        this.s.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        this.v.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        this.h.g();
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
