package rh;

import android.animation.LayoutTransition;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.opengl.Matrix;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Map;
import j$.util.Map$Entry$-CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.j20;
import org.telegram.messenger.l20;
import org.telegram.messenger.vp;
import org.telegram.messenger.x9;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.ei0;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.gr;
import org.telegram.ui.dg;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class a3 extends FrameLayout {
    public final q2[] D;
    public final org.telegram.ui.Components.n5 E;
    public final r2 F;
    public final LinearLayout G;
    public final org.telegram.ui.Components.f6 H;
    public final org.telegram.ui.Components.f6 I;
    public final ei0 J;
    public final TextView K;
    public final TextView L;
    public final TextView M;
    public final LinearLayout N;
    public ph.c1[] O;
    public final FrameLayout P;
    public final FrameLayout Q;
    public final FrameLayout R;
    public final FrameLayout S;
    public vh.p2 T;
    public final int[] U;
    public final int[] V;
    public int W;
    public final org.telegram.ui.ActionBar.p6 a;
    public long a0;
    public final z2 b;
    public TLRPC.Document b0;
    public final ImageView c;
    public String c0;
    public final ph.k[] d;
    public ArrayList d0;
    public final ph.k e;
    public l20 e0;
    public final w2 f;
    public j20 f0;
    public Runnable g0;
    public final u2 h;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public Runnable k0;
    public ei0 l0;
    public SpannableStringBuilder m0;
    public final y2[] n;
    public final nh.p r;
    public boolean s;
    public final LinearLayout w;
    public final LinearLayout x;
    public final q2[] y;

    public a3(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        int i10 = 6;
        this.U = new int[]{-14861233, -15787732, -11327734, -14742773, -14527649, -15920861};
        this.V = new int[]{org.telegram.ui.ActionBar.t6.r1(0.08f, -1), org.telegram.ui.ActionBar.t6.r1(0.08f, -1), -294362, -3914963, -13519030, -12613223};
        this.a = p6Var;
        z2 z2Var = new z2();
        this.b = z2Var;
        Drawable f7 = i0.a.f(context, R.drawable.filled_forge);
        f7.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_IN));
        z2Var.g = f7;
        setBackground(z2Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.P = frameLayout;
        addView(frameLayout, w7.b6.e(-1, 60, 55));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setImageResource(R.drawable.outline_question_mark);
        imageView.setBackground(new o3(org.telegram.messenger.i0.L(24.0f), org.telegram.ui.ActionBar.t6.r1(0.08f, -1)));
        frameLayout.addView(imageView, w7.b6.d(32, 32.0f, 51, 14.0f, 14.0f, 14.0f, 14.0f));
        imageView.setOnClickListener(new p2(this, 0));
        w7.e6.a(imageView);
        ImageView e = z20.e(context, R.drawable.msg_close);
        e.setBackground(new o3(org.telegram.messenger.i0.L(24.0f), org.telegram.ui.ActionBar.t6.r1(0.08f, -1)));
        frameLayout.addView(e, w7.b6.d(32, 32.0f, 53, 14.0f, 14.0f, 14.0f, 14.0f));
        int i11 = 1;
        e.setOnClickListener(new p2(this, i11));
        w7.e6.a(e);
        TextView textView = new TextView(context);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setGravity(17);
        textView.setTextSize(1, 20.0f);
        textView.setTextColor(-1);
        textView.setText(cd.L0(2131749767, null));
        addView(textView, w7.b6.d(-1, -2.0f, 49, 0.0f, 20.0f, 0.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.Q = frameLayout2;
        addView(frameLayout2, w7.b6.e(-1, -1, zs.E1));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.R = frameLayout3;
        frameLayout3.setAlpha(0.0f);
        addView(frameLayout3, w7.b6.e(-1, -1, zs.E1));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.S = frameLayout4;
        frameLayout4.setAlpha(0.0f);
        addView(frameLayout4, w7.b6.e(-1, -1, zs.E1));
        nh.p pVar = new nh.p(context);
        this.r = pVar;
        pVar.setGravity(17);
        pVar.setTextSize(1, 13.0f);
        pVar.setTextColor(-1);
        frameLayout2.addView(pVar, w7.b6.d(-1, -2.0f, 49, 32.0f, 244.0f, 32.0f, 84.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.w = linearLayout;
        LayoutTransition layoutTransition = new LayoutTransition();
        int i12 = 2;
        layoutTransition.setDuration(2, 320L);
        int i13 = 3;
        layoutTransition.setDuration(3, 320L);
        layoutTransition.setDuration(0, 320L);
        layoutTransition.setDuration(1, 320L);
        layoutTransition.setDuration(4, 320L);
        gr grVar = gr.h;
        layoutTransition.setInterpolator(2, grVar);
        layoutTransition.setInterpolator(3, grVar);
        layoutTransition.setInterpolator(0, grVar);
        layoutTransition.setInterpolator(1, grVar);
        layoutTransition.setInterpolator(4, grVar);
        linearLayout.setLayoutTransition(layoutTransition);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.x = linearLayout2;
        LayoutTransition layoutTransition2 = new LayoutTransition();
        layoutTransition2.setDuration(2, 320L);
        layoutTransition2.setDuration(3, 320L);
        layoutTransition2.setDuration(0, 320L);
        layoutTransition2.setDuration(1, 320L);
        layoutTransition2.setDuration(4, 320L);
        layoutTransition2.setInterpolator(2, grVar);
        layoutTransition2.setInterpolator(3, grVar);
        layoutTransition2.setInterpolator(0, grVar);
        layoutTransition2.setInterpolator(1, grVar);
        layoutTransition2.setInterpolator(4, grVar);
        linearLayout2.setLayoutTransition(layoutTransition2);
        linearLayout2.setOrientation(0);
        linearLayout2.setAlpha(0.0f);
        linearLayout2.setGravity(17);
        this.y = new q2[4];
        this.D = new q2[4];
        for (int i14 = 0; i14 < 4; i14++) {
            LinearLayout linearLayout3 = this.w;
            q2[] q2VarArr = this.y;
            q2 q2Var = new q2(context);
            q2VarArr[i14] = q2Var;
            linearLayout3.addView(q2Var, w7.b6.k(0.0f, 0.0f, 0.0f, 0.0f, 48, 54));
            this.y[i14].setOnClickListener(new p2(this, i12));
        }
        for (int i15 = 0; i15 < 4; i15++) {
            LinearLayout linearLayout4 = this.w;
            q2[] q2VarArr2 = this.D;
            q2 q2Var2 = new q2(context);
            q2VarArr2[i15] = q2Var2;
            linearLayout4.addView(q2Var2, w7.b6.k(0.0f, 0.0f, 0.0f, 0.0f, 48, 54));
            this.D[i15].setOnClickListener(new p2(this, i13));
        }
        this.n = new y2[4];
        this.d = new ph.k[6];
        int i16 = 0;
        while (i16 < i10) {
            ph.k[] kVarArr = this.d;
            int i17 = i16 == 5 ? i11 : 0;
            ph.k kVar = new ph.k(context, i11);
            FrameLayout frameLayout5 = new FrameLayout(context);
            frameLayout5.setBackground(new o3(org.telegram.messenger.i0.L(24.0f), org.telegram.ui.ActionBar.t6.r1(0.08f, -1)));
            kVar.addView(frameLayout5, w7.b6.d(-1, -1.0f, zs.E1, 2.0f, 2.0f, 2.0f, 2.0f));
            g9 g9Var = new g9(context);
            g9Var.setImageResource(R.drawable.large_forge);
            g9Var.setAlpha(i17 != 0 ? 1.0f : 0.45f);
            frameLayout5.addView(g9Var, w7.b6.e(i17 != 0 ? 42 : 64, i17 != 0 ? 42 : 64, 17));
            if (i17 != 0) {
                g9Var.setTranslationX(org.telegram.messenger.i0.L(-4.0f));
                v2 v2Var = new v2(context);
                kVar.c = v2Var;
                v2Var.e = org.telegram.messenger.i0.L(37.0f);
                v2Var.a.setStrokeWidth(org.telegram.messenger.i0.N(4.66f));
                frameLayout5.addView(v2Var, w7.b6.e(90, 90, 17));
                org.telegram.ui.Components.f6 f6Var = new org.telegram.ui.Components.f6(context, false, false, false);
                kVar.b = f6Var;
                f6Var.getDrawable().r(false, true);
                f6Var.setTypeface(org.telegram.messenger.i0.o());
                f6Var.setTextColor(-1);
                f6Var.setTextSize(org.telegram.messenger.i0.L(14.0f));
                f6Var.setGravity(17);
                f6Var.setText("0%");
                frameLayout5.addView(f6Var, w7.b6.d(-1, 16.0f, 55, 12.0f, 80.0f, 12.0f, 0.0f));
            }
            kVarArr[i16] = kVar;
            i16++;
            i10 = 6;
            i11 = 1;
        }
        this.e = this.d[5];
        w2 w2Var = new w2(context);
        this.f = w2Var;
        w2Var.setVisibility(8);
        w2Var.setAlpha(0.0f);
        addView(w2Var, w7.b6.d(zs.X4, 300.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        u2 u2Var = new u2(context, this.d);
        this.h = u2Var;
        addView(u2Var, w7.b6.d(-1, 300.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.n5 n5Var = new org.telegram.ui.Components.n5(context);
        this.E = n5Var;
        n5Var.setTextSize(1, 12.0f);
        n5Var.setTypeface(org.telegram.messenger.i0.o());
        n5Var.setText(org.telegram.messenger.i0.H2(cd.L0(2131749763, null), false, org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f)));
        n5Var.setPadding(org.telegram.messenger.i0.L(9.0f), 0, org.telegram.messenger.i0.L(9.0f), 0);
        n5Var.setGravity(17);
        n5Var.setTextColor(-1);
        n5Var.setAlpha(this.d0 != null ? 1.0f : 0.25f);
        n5Var.setBackground(new o3(org.telegram.messenger.i0.L(14.0f), org.telegram.ui.ActionBar.t6.r1(0.08f, -1)));
        w7.e6.b(n5Var, 0.02f, 1.2f);
        this.Q.addView(n5Var, w7.b6.d(-2, 27.0f, 49, 32.0f, 412.0f, 32.0f, 84.0f));
        n5Var.setOnClickListener(new u1(2, this, p6Var));
        this.Q.addView(this.w, w7.b6.d(-2, 54.0f, 49, 32.0f, 340.0f, 32.0f, 84.0f));
        this.Q.addView(this.x, w7.b6.d(-2, 54.0f, 49, 32.0f, 394.0f, 32.0f, 84.0f));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.G = linearLayout5;
        linearLayout5.setOrientation(1);
        r2 r2Var = new r2();
        this.F = r2Var;
        linearLayout5.setBackground(r2Var);
        r2Var.a(org.telegram.ui.ActionBar.t6.r1(0.08f, -1), org.telegram.ui.ActionBar.t6.r1(0.08f, -1));
        w7.e6.b(linearLayout5, 0.02f, 1.2f);
        addView(linearLayout5, w7.b6.d(-1, -2.0f, 87, 20.0f, 0.0f, 20.0f, 18.0f));
        linearLayout5.setOnClickListener(new p2(this, 4));
        org.telegram.ui.Components.f6 f6Var2 = new org.telegram.ui.Components.f6(context, false, false, false);
        this.H = f6Var2;
        f6Var2.setTypeface(org.telegram.messenger.i0.o());
        f6Var2.setGravity(17);
        f6Var2.setTextColor(org.telegram.ui.ActionBar.t6.r1(0.75f, -1));
        f6Var2.setText(cd.L0(2131749806, null));
        f6Var2.setTextSize(org.telegram.messenger.i0.L(14.0f));
        linearLayout5.addView(f6Var2, w7.b6.s(-1, 18, 55, 16.0f, 7.33f, 16.0f, 0.0f));
        org.telegram.ui.Components.f6 f6Var3 = new org.telegram.ui.Components.f6(context, false, false, false);
        this.I = f6Var3;
        f6Var3.getDrawable().r(true, false);
        f6Var3.setGravity(17);
        f6Var3.setTextColor(org.telegram.ui.ActionBar.t6.r1(0.75f, -1));
        f6Var3.setText(org.telegram.messenger.i0.W2(cd.a0(null, null, 2131749775, "0%")));
        f6Var3.setTextSize(org.telegram.messenger.i0.L(12.0f));
        linearLayout5.addView(f6Var3, w7.b6.s(-1, 14, 55, 16.0f, 2.66f, 16.0f, 7.66f));
        LinearLayout linearLayout6 = new LinearLayout(context);
        linearLayout6.setOrientation(0);
        linearLayout6.setGravity(17);
        ei0 ei0Var = new ei0(context);
        this.J = ei0Var;
        ei0Var.setAutoRepeat(true);
        ei0Var.f(R.raw.gift_crafting, 30, 30, null);
        linearLayout6.addView(ei0Var, w7.b6.t(30, 30, 17, 0, 0, 4, 0));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 20.0f);
        textView2.setTextColor(-1);
        textView2.setTypeface(org.telegram.messenger.i0.o());
        textView2.setGravity(17);
        textView2.setText(cd.L0(2131749783, null));
        linearLayout6.addView(textView2, w7.b6.t(-2, -2, 17, 0, 0, 0, 0));
        this.R.addView(linearLayout6, w7.b6.d(-1, -2.0f, 49, 0.0f, 350.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.K = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setTextColor(org.telegram.ui.ActionBar.t6.r1(0.5f, -1));
        textView3.setTypeface(org.telegram.messenger.i0.o());
        textView3.setGravity(17);
        TextView l4 = org.telegram.ui.Cells.f1.l(this.R, textView3, w7.b6.d(-1, -2.0f, 49, 0.0f, 383.0f, 0.0f, 0.0f), context);
        this.L = l4;
        l4.setTextSize(1, 13.0f);
        l4.setTextColor(-1);
        l4.setTypeface(org.telegram.messenger.i0.o());
        l4.setGravity(17);
        l4.setPadding(org.telegram.messenger.i0.L(9.0f), 0, org.telegram.messenger.i0.L(9.0f), 0);
        l4.setBackground(new o3(org.telegram.messenger.i0.L(14.0f), org.telegram.ui.ActionBar.t6.r1(0.08f, -1)));
        TextView l10 = org.telegram.ui.Cells.f1.l(this.R, l4, w7.b6.d(-2, 27.0f, 81, 0.0f, 0.0f, 0.0f, 74.0f), context);
        l10.setTextSize(1, 13.0f);
        l10.setTextColor(org.telegram.ui.ActionBar.t6.r1(0.5f, -1));
        org.telegram.messenger.m5.l(l10, 17, null, 2131749784);
        TextView l11 = org.telegram.ui.Cells.f1.l(this.R, l10, w7.b6.d(-1, -2.0f, 81, 42.0f, 0.0f, 42.0f, 24.0f), context);
        l11.setText(cd.L0(2131749797, null));
        l11.setTextColor(-505270);
        l11.setTextSize(1, 20.0f);
        l11.setTypeface(org.telegram.messenger.i0.o());
        l11.setGravity(17);
        TextView l12 = org.telegram.ui.Cells.f1.l(this.S, l11, w7.b6.d(-1, -2.0f, 55, 32.0f, 352.0f, 32.0f, 0.0f), context);
        this.M = l12;
        l12.setTextColor(-17253);
        l12.setTextSize(1, 13.0f);
        l12.setGravity(17);
        this.S.addView(l12, w7.b6.d(-1, -2.0f, 55, 32.0f, 383.0f, 32.0f, 0.0f));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.N = linearLayout7;
        linearLayout7.setOrientation(0);
        this.S.addView(linearLayout7, w7.b6.d(-2, -2.0f, 49, 0.0f, 250.0f, 0.0f, 0.0f));
        this.O = null;
        d(true);
    }

    public final void a(int i10, long j10, TLRPC.Document document, String str) {
        y2[] y2VarArr;
        this.W = i10;
        this.a0 = j10;
        this.b0 = document;
        this.c0 = str;
        this.h0 = false;
        this.j0 = false;
        int i11 = 0;
        while (true) {
            y2VarArr = this.n;
            if (i11 >= y2VarArr.length) {
                break;
            }
            y2 y2Var = y2VarArr[i11];
            if (y2Var != null) {
                org.telegram.messenger.i0.E2(y2Var);
            }
            i11++;
        }
        u2 u2Var = this.h;
        View[] viewArr = u2Var.a;
        t2 t2Var = u2Var.H;
        if (t2Var != null) {
            t2Var.e = true;
            t2Var.l = false;
            t2Var.a.H = null;
            u2Var.H = null;
        }
        ValueAnimator valueAnimator = u2Var.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            u2Var.G = null;
        }
        u2Var.F = -1;
        u2Var.E = 0.0f;
        u2Var.w.clear();
        u2Var.x.clear();
        u2Var.y.clear();
        for (int i12 = 0; i12 < 6; i12++) {
            u2Var.D[i12] = 0.0f;
        }
        u2Var.removeAllViews();
        for (int i13 = 0; i13 < viewArr.length; i13++) {
            viewArr[i13].setAlpha(1.0f);
            viewArr[i13].setVisibility(0);
            u2Var.addView(viewArr[i13], w7.b6.e(zs.t1, zs.t1, 17));
        }
        Matrix.setIdentityM(u2Var.c, 0);
        u2Var.e = 0.0f;
        u2Var.d = 0.0f;
        u2Var.f = true;
        y2 y2Var2 = new y2(getContext());
        y2VarArr[0] = y2Var2;
        addView(y2Var2, w7.b6.d(76, 76.0f, 49, -117.0f, 74.0f, 0.0f, 0.0f));
        y2 y2Var3 = new y2(getContext());
        y2VarArr[1] = y2Var3;
        addView(y2Var3, w7.b6.d(76, 76.0f, 49, -117.0f, 149.0f, 0.0f, 0.0f));
        y2 y2Var4 = new y2(getContext());
        y2VarArr[2] = y2Var4;
        addView(y2Var4, w7.b6.d(76, 76.0f, 49, 117.0f, 74.0f, 0.0f, 0.0f));
        y2 y2Var5 = new y2(getContext());
        y2VarArr[3] = y2Var5;
        addView(y2Var5, w7.b6.d(76, 76.0f, 49, 117.0f, 149.0f, 0.0f, 0.0f));
        for (int i14 = 0; i14 < y2VarArr.length; i14++) {
            w7.e6.a(y2VarArr[i14]);
            y2VarArr[i14].setClickable(true);
            y2VarArr[i14].setOnClickListener(new p2(this, 5));
        }
        d(false);
        this.h0 = false;
        FrameLayout frameLayout = this.Q;
        frameLayout.animate().cancel();
        frameLayout.setAlpha(1.0f);
        LinearLayout linearLayout = this.G;
        linearLayout.animate().cancel();
        linearLayout.setAlpha(1.0f);
        FrameLayout frameLayout2 = this.R;
        frameLayout2.animate().cancel();
        frameLayout2.setAlpha(0.0f);
        FrameLayout frameLayout3 = this.S;
        frameLayout3.animate().cancel();
        frameLayout3.setAlpha(0.0f);
        FrameLayout frameLayout4 = this.P;
        frameLayout4.animate().cancel();
        frameLayout4.setAlpha(1.0f);
        this.E.setAlpha(this.s ? 0.0f : this.d0 != null ? 1.0f : 0.25f);
        w2 w2Var = this.f;
        w2Var.setVisibility(8);
        w2Var.setAlpha(0.0f);
        String L0 = cd.L0(2131749806, null);
        org.telegram.ui.Components.f6 f6Var = this.H;
        f6Var.setText(L0);
        f6Var.setTranslationY(0.0f);
        this.I.setAlpha(1.0f);
        x9.c(i10).j(j10, new dg(this, j10, j10, 2));
    }

    public final void b(q2 q2Var) {
        if (q2Var.d != null) {
            c(q2Var, org.telegram.messenger.i0.W2(cd.G(Math.round(q2Var.f * 100.0f), "GiftCraftBackdropChance", q2Var.d.name)));
        } else if (q2Var.e != null) {
            c(q2Var, org.telegram.messenger.i0.W2(cd.G(Math.round(q2Var.f * 100.0f), "GiftCraftSymbolChance", q2Var.e.name)));
        }
    }

    public final void c(q2 q2Var, SpannableStringBuilder spannableStringBuilder) {
        vh.p2 p2Var = this.T;
        if (p2Var != null) {
            p2Var.e(true);
            this.T = null;
        }
        if (this.h0 || this.j0) {
            return;
        }
        View view = q2Var.getParent() instanceof View ? (View) q2Var.getParent() : null;
        float x10 = q2Var.getX() + (view != null ? view.getX() : 0.0f);
        float y3 = q2Var.getY() + (view != null ? view.getY() : 0.0f);
        vh.p2 p2Var2 = new vh.p2(getContext(), 3);
        this.T = p2Var2;
        p2Var2.p(true);
        this.T.s(spannableStringBuilder);
        vh.p2 p2Var3 = this.T;
        p2Var3.h = vh.p2.a(p2Var3.getText(), this.T.getTextPaint());
        vh.p2 p2Var4 = this.T;
        p2Var4.K = Layout.Alignment.ALIGN_CENTER;
        p2Var4.setPadding(org.telegram.messenger.i0.L(2.0f), 0, org.telegram.messenger.i0.L(2.0f), 0);
        addView(this.T, w7.b6.d(-1, 100.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        this.T.setTranslationY(y3 - org.telegram.messenger.i0.L(100.0f));
        this.T.m(0.0f, ((q2Var.getWidth() / 2.0f) + x10) - org.telegram.messenger.i0.L(2.0f));
        this.T.u();
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x04bd, code lost:
    
        if (r4 != null) goto L187;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(boolean z10) {
        int i10;
        y2[] y2VarArr;
        HashMap hashMap;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop;
        int i11;
        HashMap hashMap2;
        boolean z11;
        q2[] q2VarArr;
        TL_stars.starGiftAttributePattern stargiftattributepattern;
        LinearLayout linearLayout;
        boolean z12;
        TL_stars.StarGift starGift;
        int i12;
        int giftsSelectedCount = getGiftsSelectedCount();
        float giftsSuccessChance = getGiftsSuccessChance() / 10.0f;
        ph.k kVar = this.e;
        org.telegram.ui.Components.f6 f6Var = (org.telegram.ui.Components.f6) kVar.b;
        boolean z13 = true;
        if (f6Var != null) {
            f6Var.c(Math.round(giftsSuccessChance) + "%", z10, true);
            v2 v2Var = (v2) kVar.c;
            float f7 = giftsSuccessChance / 100.0f;
            v2Var.d = f7;
            if (!z10) {
                v2Var.b.e(true, f7);
            }
            v2Var.invalidate();
        }
        org.telegram.ui.Components.f6 f6Var2 = this.I;
        int i13 = 0;
        if (giftsSelectedCount <= 0) {
            if (this.m0 == null) {
                this.m0 = new SpannableStringBuilder("+");
                dq dqVar = new dq(R.drawable.filled_add_album, 0);
                dqVar.H = 0.65f;
                dqVar.I = 0.65f;
                SpannableStringBuilder spannableStringBuilder = this.m0;
                spannableStringBuilder.setSpan(dqVar, 0, spannableStringBuilder.length(), 33);
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(cd.L0(2131749805, null));
            org.telegram.messenger.i0.L2(spannableStringBuilder2, this.m0, "+");
            f6Var2.setText(spannableStringBuilder2);
        } else {
            f6Var2.setText(org.telegram.messenger.i0.W2(cd.a0(null, null, 2131749775, xh.i.I0(getGiftsSuccessChance()))));
        }
        int i14 = (giftsSelectedCount == 0 ? 0 : giftsSelectedCount < 4 ? 1 : 2) * 2;
        int[] iArr = this.V;
        int i15 = i14 + 1;
        this.F.a(iArr[i14], iArr[i15]);
        int[] iArr2 = this.U;
        this.b.a(iArr2[i14], iArr2[i15]);
        this.f.a(iArr[i15], iArr[i14]);
        if (this.b0 != null) {
            TL_stars.StarGift firstGift = getFirstGift();
            nh.p pVar = this.r;
            if (firstGift != null) {
                SpannableString spannableString = new SpannableString("x");
                i10 = 3;
                spannableString.setSpan(new org.telegram.ui.Components.o5(this.b0, pVar.getPaint().getFontMetricsInt()), 0, spannableString.length(), 33);
                pVar.setText(TextUtils.concat(org.telegram.messenger.i0.W2(cd.L0(2131749771, null)), "\n", spannableString, " ", org.telegram.messenger.i0.W2(cd.a0(null, null, 2131749770, this.c0, cd.E(firstGift.num, ',')))));
            } else {
                i10 = 3;
                SpannableString spannableString2 = new SpannableString("x");
                spannableString2.setSpan(new org.telegram.ui.Components.o5(this.b0, pVar.getPaint().getFontMetricsInt()), 0, spannableString2.length(), 33);
                pVar.setText(TextUtils.concat(org.telegram.messenger.i0.W2(cd.L0(2131749769, null)), "\n", spannableString2, " ", org.telegram.messenger.i0.W2(cd.a0(null, null, 2131749768, this.c0))));
            }
        } else {
            i10 = 3;
        }
        int[][] iArr3 = vp.r1(this.W).d7;
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        ArrayList arrayList = new ArrayList();
        int i16 = 0;
        int i17 = 0;
        while (true) {
            y2VarArr = this.n;
            if (i16 >= y2VarArr.length) {
                break;
            }
            y2 y2Var = y2VarArr[i16];
            if (y2Var != null) {
                TL_stars.StarGift starGift2 = y2Var.h;
                if ((starGift2 != null ? starGift2 : null) != null) {
                    i17++;
                    if (starGift2 == null) {
                        starGift2 = null;
                    }
                    TL_stars.starGiftAttributePattern stargiftattributepattern2 = (TL_stars.starGiftAttributePattern) e6.l(starGift2.attributes, TL_stars.starGiftAttributePattern.class);
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = (TL_stars.starGiftAttributeBackdrop) e6.l(starGift2.attributes, TL_stars.starGiftAttributeBackdrop.class);
                    hashMap3.put(Integer.valueOf(stargiftattributebackdrop2.backdrop_id), Integer.valueOf(((Integer) Map.-EL.getOrDefault(hashMap3, Integer.valueOf(stargiftattributebackdrop2.backdrop_id), 0)).intValue() + 1));
                    hashMap4.put(Long.valueOf(stargiftattributepattern2.document.id), Integer.valueOf(((Integer) Map.-EL.getOrDefault(hashMap4, Long.valueOf(stargiftattributepattern2.document.id), 0)).intValue() + 1));
                }
            }
            i16++;
        }
        boolean isEmpty = hashMap3.isEmpty();
        q2[] q2VarArr2 = this.y;
        if (isEmpty) {
            q2 q2Var = q2VarArr2[0];
            q2Var.a(null);
            q2Var.c(true, 0.0f);
            arrayList.add(q2Var);
            for (int i18 = 1; i18 < 4; i18++) {
                q2VarArr2[i18].setVisibility(8);
            }
            hashMap = hashMap4;
        } else {
            ArrayList arrayList2 = new ArrayList(hashMap3.entrySet());
            Collections.sort(arrayList2, Map$Entry$-CC.comparingByValue());
            int size = arrayList2.size();
            int i19 = 0;
            int i20 = 0;
            while (i19 < size) {
                Object obj = arrayList2.get(i19);
                i19++;
                Map.Entry entry = (Map.Entry) obj;
                int intValue = ((Integer) entry.getKey()).intValue();
                int intValue2 = ((Integer) entry.getValue()).intValue();
                int i21 = i13;
                boolean z14 = z13;
                while (true) {
                    if (i21 >= y2VarArr.length) {
                        stargiftattributebackdrop = null;
                        break;
                    }
                    y2 y2Var2 = y2VarArr[i21];
                    if (y2Var2 != null) {
                        TL_stars.StarGift starGift3 = y2Var2.h;
                        if ((starGift3 != null ? starGift3 : null) != null) {
                            if (starGift3 == null) {
                                starGift3 = null;
                            }
                            stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) e6.l(starGift3.attributes, TL_stars.starGiftAttributeBackdrop.class);
                            if (stargiftattributebackdrop.backdrop_id == intValue) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                    i21++;
                }
                if (stargiftattributebackdrop != null) {
                    q2 q2Var2 = q2VarArr2[i20];
                    q2Var2.a(stargiftattributebackdrop);
                    i11 = size;
                    int[] iArr4 = iArr3[Utilities.j(i17 - 1, iArr3.length - 1, 0)];
                    int i22 = intValue2 - 1;
                    hashMap2 = hashMap4;
                    q2Var2.c(z14, iArr4[Utilities.j(i22, iArr4.length - 1, 0)] / 1000.0f);
                    arrayList.add(q2Var2);
                    i20++;
                } else {
                    i11 = size;
                    hashMap2 = hashMap4;
                }
                hashMap4 = hashMap2;
                size = i11;
                i13 = 0;
                z13 = true;
            }
            hashMap = hashMap4;
            for (int i23 = i20; i23 < 4; i23++) {
                q2VarArr2[i23].setVisibility(8);
            }
        }
        boolean isEmpty2 = hashMap.isEmpty();
        q2[] q2VarArr3 = this.D;
        if (isEmpty2) {
            q2 q2Var3 = q2VarArr3[0];
            q2Var3.b(null);
            q2Var3.c(true, 0.0f);
            arrayList.add(q2Var3);
            for (int i24 = 1; i24 < 4; i24++) {
                q2VarArr3[i24].setVisibility(8);
            }
            z11 = true;
        } else {
            ArrayList arrayList3 = new ArrayList(hashMap.entrySet());
            Collections.sort(arrayList3, Map$Entry$-CC.comparingByValue());
            int size2 = arrayList3.size();
            int i25 = 0;
            int i26 = 0;
            while (i26 < size2) {
                Object obj2 = arrayList3.get(i26);
                i26++;
                Map.Entry entry2 = (Map.Entry) obj2;
                long longValue = ((Long) entry2.getKey()).longValue();
                int intValue3 = ((Integer) entry2.getValue()).intValue();
                int i27 = 0;
                while (true) {
                    if (i27 >= y2VarArr.length) {
                        q2VarArr = q2VarArr3;
                        stargiftattributepattern = null;
                        break;
                    }
                    y2 y2Var3 = y2VarArr[i27];
                    if (y2Var3 != null) {
                        TL_stars.StarGift starGift4 = y2Var3.h;
                        if ((starGift4 != null ? starGift4 : null) != null) {
                            if (starGift4 == null) {
                                starGift4 = null;
                            }
                            TL_stars.starGiftAttributePattern stargiftattributepattern3 = (TL_stars.starGiftAttributePattern) e6.l(starGift4.attributes, TL_stars.starGiftAttributePattern.class);
                            if (stargiftattributepattern3 != null) {
                                q2VarArr = q2VarArr3;
                                if (stargiftattributepattern3.document.id == longValue) {
                                    stargiftattributepattern = stargiftattributepattern3;
                                    break;
                                } else {
                                    i27++;
                                    q2VarArr3 = q2VarArr;
                                }
                            }
                        }
                    }
                    q2VarArr = q2VarArr3;
                    i27++;
                    q2VarArr3 = q2VarArr;
                }
                if (stargiftattributepattern != null) {
                    int i28 = i25 + 1;
                    q2 q2Var4 = q2VarArr[i25];
                    q2Var4.b(stargiftattributepattern);
                    int[] iArr5 = iArr3[Utilities.j(i17 - 1, iArr3.length - 1, 0)];
                    q2Var4.c(true, iArr5[Utilities.j(intValue3 - 1, iArr5.length - 1, 0)] / 1000.0f);
                    arrayList.add(q2Var4);
                    i25 = i28;
                }
                q2VarArr3 = q2VarArr;
            }
            q2[] q2VarArr4 = q2VarArr3;
            z11 = true;
            while (i25 < 4) {
                q2VarArr4[i25].setVisibility(8);
                i25++;
            }
        }
        this.s = arrayList.size() > 5 ? z11 : false;
        int i29 = 0;
        while (true) {
            int size3 = arrayList.size();
            linearLayout = this.x;
            if (i29 >= size3) {
                break;
            }
            q2 q2Var5 = (q2) arrayList.get(i29);
            if (!this.s || i29 < arrayList.size() / 2.0f) {
                linearLayout = this.w;
            }
            if (q2Var5.getParent() != linearLayout) {
                ViewParent parent = q2Var5.getParent();
                if (parent instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) parent;
                    LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
                    boolean z15 = layoutTransition != null ? z11 : false;
                    i12 = i10;
                    if (z15) {
                        layoutTransition.disableTransitionType(i12);
                    }
                    viewGroup.removeView(q2Var5);
                    if (z15) {
                        layoutTransition.enableTransitionType(i12);
                    }
                    q2Var5.animate().cancel();
                    q2Var5.clearAnimation();
                    q2Var5.setTranslationX(0.0f);
                    q2Var5.setTranslationY(0.0f);
                    q2Var5.setTranslationZ(0.0f);
                    q2Var5.setAlpha(0.0f);
                    q2Var5.setScaleX(1.0f);
                    q2Var5.setScaleY(1.0f);
                    q2Var5.setRotation(0.0f);
                    q2Var5.setRotationX(0.0f);
                    q2Var5.setRotationY(0.0f);
                } else {
                    i12 = i10;
                }
                linearLayout.addView(q2Var5, w7.b6.k(0.0f, 0.0f, 0.0f, 0.0f, 48, 54));
            } else {
                i12 = i10;
            }
            q2Var5.setVisibility(0);
            i29++;
            i10 = i12;
        }
        linearLayout.animate().alpha(this.s ? 1.0f : 0.0f);
        this.E.animate().alpha(this.s ? 0.0f : this.d0 != null ? 1.0f : 0.25f);
        boolean z16 = z11;
        for (int i30 = 0; i30 < y2VarArr.length; i30++) {
            y2 y2Var4 = y2VarArr[i30];
            if (y2Var4 != null) {
                TL_stars.StarGift starGift5 = y2Var4.h;
                if (starGift5 == null) {
                    starGift5 = null;
                }
                if (starGift5 != null) {
                    int i31 = R.drawable.msg_close;
                    if (z16) {
                        int i32 = i30 + 1;
                        while (true) {
                            if (i32 >= y2VarArr.length) {
                                break;
                            }
                            y2 y2Var5 = y2VarArr[i32];
                            if (y2Var5 != null) {
                                starGift = y2Var5.h;
                                if ((starGift != null ? starGift : null) != null) {
                                }
                            }
                            i32++;
                        }
                        starGift = null;
                        y2 y2Var6 = y2VarArr[i30];
                        boolean z17 = (starGift == null || TextUtils.isEmpty(starGift.gift_address)) ? false : z11;
                        ImageView imageView = y2Var6.f;
                        imageView.setScaleX(0.8f);
                        imageView.setScaleY(0.8f);
                        y2Var6.n = z17;
                        if (z17) {
                            i31 = R.drawable.mini_replace2;
                        }
                        imageView.setImageResource(i31);
                        z12 = false;
                    } else {
                        ImageView imageView2 = y2Var4.f;
                        imageView2.setScaleX(0.8f);
                        imageView2.setScaleY(0.8f);
                        z12 = false;
                        y2Var4.n = false;
                        imageView2.setImageResource(R.drawable.msg_close);
                    }
                    z16 = z12;
                }
            }
        }
    }

    public TL_stars.StarGift getFirstGift() {
        int i10 = 0;
        while (true) {
            y2[] y2VarArr = this.n;
            if (i10 >= y2VarArr.length) {
                return null;
            }
            y2 y2Var = y2VarArr[i10];
            if (y2Var != null) {
                TL_stars.StarGift starGift = y2Var.h;
                if ((starGift != null ? starGift : null) != null) {
                    if (starGift != null) {
                        return starGift;
                    }
                    return null;
                }
            }
            i10++;
        }
    }

    public int getGiftsSelectedCount() {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            y2[] y2VarArr = this.n;
            if (i10 >= y2VarArr.length) {
                return i11;
            }
            y2 y2Var = y2VarArr[i10];
            if (y2Var != null) {
                TL_stars.StarGift starGift = y2Var.h;
                if (starGift == null) {
                    starGift = null;
                }
                if (starGift != null) {
                    i11++;
                }
            }
            i10++;
        }
    }

    public int getGiftsSuccessChance() {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            y2[] y2VarArr = this.n;
            if (i10 >= y2VarArr.length) {
                return i11;
            }
            y2 y2Var = y2VarArr[i10];
            if (y2Var != null) {
                TL_stars.StarGift starGift = y2Var.h;
                if ((starGift != null ? starGift : null) != null) {
                    if (starGift == null) {
                        starGift = null;
                    }
                    i11 += starGift.craft_chance_permille;
                }
            }
            i10++;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), i11);
    }

    public void setOnAddGift(j20 j20Var) {
        this.f0 = j20Var;
    }

    public void setOnClose(Runnable runnable) {
        this.g0 = runnable;
    }

    public void setOnCraft(l20 l20Var) {
        this.e0 = l20Var;
    }
}
