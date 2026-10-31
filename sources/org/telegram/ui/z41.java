package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class z41 extends LinearLayout implements org.telegram.ui.ActionBar.k6 {
    public final org.telegram.ui.ActionBar.p6 a;
    public final org.telegram.ui.Components.r8 b;
    public final org.telegram.ui.Components.g9 c;
    public final org.telegram.ui.ActionBar.u5 d;
    public final TextView e;
    public final ImageView f;
    public final org.telegram.ui.Components.d5 h;
    public final org.telegram.ui.Components.d5 n;
    public int r;

    public z41(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.a = p6Var;
        setOrientation(0);
        this.b = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
        this.c = g9Var;
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(14.0f));
        org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(context);
        this.d = u5Var;
        u5Var.setTextSize(15);
        u5Var.setTypeface(org.telegram.messenger.i0.o());
        org.telegram.ui.ActionBar.a7.Y(u5Var, org.telegram.ui.ActionBar.t6.G6, p6Var);
        this.h = new org.telegram.ui.Components.d5(org.telegram.messenger.i0.L(24.0f), 7, u5Var, false);
        this.n = new org.telegram.ui.Components.d5(org.telegram.messenger.i0.L(24.0f), 7, u5Var, false);
        u5Var.addOnAttachStateChangeListener(new d5(this, 5));
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setPadding(org.telegram.messenger.i0.L(6.66f), 0, org.telegram.messenger.i0.L(6.66f), 0);
        textView.setTextSize(1, 11.0f);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setGravity(17);
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.Gi, p6Var);
        int L = org.telegram.messenger.i0.L(10.0f);
        int i10 = org.telegram.ui.ActionBar.t6.Ci;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(L, org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i10);
        textView.setBackground(d02);
        org.telegram.ui.ActionBar.a7.k(textView, d02, N, null, p6Var);
        ImageView imageView = new ImageView(context);
        this.f = imageView;
        imageView.setImageResource(R.drawable.msg_arrowright);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.a7.t(imageView, org.telegram.ui.ActionBar.t6.m6, p6Var, PorterDuff.Mode.SRC_IN);
        if (!org.telegram.messenger.cd.X) {
            u5Var.setGravity(19);
            addView(g9Var, w7.b6.t(28, 28, 19, 18, 0, 18, 0));
            addView(u5Var, w7.b6.q(0, -1, 1.0f, org.telegram.messenger.zs.E1, 0, 0, 18, 0));
            addView(textView, w7.b6.q(-2, 20, 0.0f, 16, 0, 0, 0, 0));
            addView(imageView, w7.b6.q(24, 24, 0.0f, 21, 0, 0, 12, 0));
            return;
        }
        u5Var.setGravity(21);
        imageView.setScaleX(-1.0f);
        addView(imageView, w7.b6.q(24, 24, 0.0f, 19, 12, 0, 0, 0));
        addView(textView, w7.b6.q(-2, 20, 0.0f, 16, 0, 0, 0, 0));
        addView(u5Var, w7.b6.q(0, -1, 1.0f, org.telegram.messenger.zs.E1, 18, 0, 0, 0));
        addView(g9Var, w7.b6.t(28, 28, 21, 18, 0, 18, 0));
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.ni));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(48.0f), TLObject.FLAG_30));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void set(int i10) {
        Long h;
        TLRPC.User f7 = org.telegram.messenger.d20.i(i10).f();
        org.telegram.ui.Components.r8 r8Var = this.b;
        r8Var.r(f7);
        org.telegram.ui.Components.g9 g9Var = this.c;
        g9Var.getImageReceiver().d = i10;
        g9Var.e(f7, r8Var);
        String p5 = org.telegram.messenger.h20.p(f7);
        org.telegram.ui.ActionBar.u5 u5Var = this.d;
        u5Var.l(p5, false);
        Integer valueOf = Integer.valueOf(i10);
        org.telegram.ui.Components.d5 d5Var = this.h;
        d5Var.y = valueOf;
        Integer valueOf2 = Integer.valueOf(i10);
        org.telegram.ui.Components.d5 d5Var2 = this.n;
        d5Var2.y = valueOf2;
        int i11 = org.telegram.ui.ActionBar.t6.ni;
        org.telegram.ui.ActionBar.p6 p6Var = this.a;
        d5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.t6.w0(i11, p6Var)));
        if (f7 != null) {
            long j10 = f7.bot_verification_icon;
            if (j10 != 0) {
                d5Var.j(j10, false);
                h = org.telegram.messenger.h20.h(f7);
                d5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.t6.w0(i11, p6Var)));
                if (h == null) {
                    d5Var2.j(h.longValue(), false);
                } else if (f7 == null || !f7.premium) {
                    d5Var2.g(null, false);
                } else {
                    d5Var2.g(getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate(), false);
                }
                if (d5Var.d()) {
                    d5Var = null;
                }
                u5Var.setLeftDrawable(d5Var);
                if (d5Var2.d()) {
                    d5Var2 = null;
                }
                u5Var.i(d5Var2);
                int i12 = org.telegram.messenger.hs.a0(i10).K;
                int i13 = i12 <= 0 ? 8 : 0;
                TextView textView = this.e;
                textView.setVisibility(i13);
                textView.setText(org.telegram.messenger.cd.E(i12, ','));
            }
        }
        d5Var.g(null, false);
        h = org.telegram.messenger.h20.h(f7);
        d5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.t6.w0(i11, p6Var)));
        if (h == null) {
        }
        if (d5Var.d()) {
        }
        u5Var.setLeftDrawable(d5Var);
        if (d5Var2.d()) {
        }
        u5Var.i(d5Var2);
        int i122 = org.telegram.messenger.hs.a0(i10).K;
        if (i122 <= 0) {
        }
        TextView textView2 = this.e;
        textView2.setVisibility(i13);
        textView2.setText(org.telegram.messenger.cd.E(i122, ','));
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        int i10 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.p6 p6Var = this.a;
        int w02 = org.telegram.ui.ActionBar.t6.w0(i10, p6Var);
        org.telegram.ui.ActionBar.u5 u5Var = this.d;
        u5Var.setTextColor(w02);
        TextView textView = this.e;
        org.telegram.ui.ActionBar.t6.C1(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, p6Var), textView.getBackground());
        textView.invalidate();
        int w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.m6, p6Var);
        int i11 = this.r;
        ImageView imageView = this.f;
        if (w03 != i11 || imageView.getColorFilter() == null) {
            this.r = w03;
            imageView.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
        }
        int i12 = org.telegram.ui.ActionBar.t6.ni;
        this.n.k(Integer.valueOf(org.telegram.ui.ActionBar.t6.w0(i12, p6Var)));
        try {
            org.telegram.ui.Components.d5 d5Var = this.h;
            if (d5Var != null) {
                d5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.t6.w0(i12, p6Var)));
                u5Var.invalidate();
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}
