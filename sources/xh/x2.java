package xh;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.uq;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.wr;
import org.telegram.ui.mg;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class x2 extends FrameLayout {
    public final org.telegram.ui.Components.x5 E;
    public final n2 F;
    public final LinearLayout G;
    public final org.telegram.ui.Components.o6 H;
    public final org.telegram.ui.Components.o6 I;
    public final kj0 J;
    public final TextView K;
    public final TextView L;
    public final TextView M;
    public final LinearLayout N;
    public wh.h1[] O;
    public final FrameLayout P;
    public final FrameLayout Q;
    public final FrameLayout R;
    public final FrameLayout S;
    public bi.x4 T;
    public final int[] U;
    public final int[] V;
    public int W;
    public final org.telegram.ui.ActionBar.f6 a;
    public long a0;
    public final w2 b;
    public TLRPC.Document b0;
    public final ImageView c;
    public String c0;
    public final r2[] d;
    public ArrayList d0;
    public final r2 e;
    public Utilities.Callback3 e0;
    public final t2 f;
    public Utilities.Callback2 f0;
    public Runnable g0;
    public final q2 h;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public Runnable k0;
    public kj0 l0;
    public SpannableStringBuilder m0;
    public final v2[] n;
    public final uh.o r;
    public boolean s;
    public final LinearLayout v;
    public final LinearLayout w;
    public final m2[] x;
    public final m2[] y;

    public x2(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.U = new int[]{-14861233, -15787732, -11327734, -14742773, -14527649, -15920861};
        this.V = new int[]{org.telegram.ui.ActionBar.j6.l1(0.08f, -1), org.telegram.ui.ActionBar.j6.l1(0.08f, -1), -294362, -3914963, -13519030, -12613223};
        this.a = f6Var;
        w2 w2Var = new w2();
        this.b = w2Var;
        Drawable mutate = context.getResources().getDrawable(R.drawable.filled_forge).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_IN));
        w2Var.g = mutate;
        setBackground(w2Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.P = frameLayout;
        addView(frameLayout, w7.a6.e(-1, 60, 55));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setImageResource(R.drawable.outline_question_mark);
        imageView.setBackground(new k3(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.j6.l1(0.08f, -1)));
        frameLayout.addView(imageView, w7.a6.d(32, 32.0f, 51, 14.0f, 14.0f, 14.0f, 14.0f));
        imageView.setOnClickListener(new l2(this, 0));
        w7.c6.a(imageView);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.msg_close);
        imageView2.setBackground(new k3(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.j6.l1(0.08f, -1)));
        frameLayout.addView(imageView2, w7.a6.d(32, 32.0f, 53, 14.0f, 14.0f, 14.0f, 14.0f));
        imageView2.setOnClickListener(new l2(this, 1));
        w7.c6.a(imageView2);
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setTextSize(1, 20.0f);
        textView.setTextColor(-1);
        textView.setText(LocaleController.getString(R.string.GiftCraftTitle));
        addView(textView, w7.a6.d(-1, -2.0f, 49, 0.0f, 20.0f, 0.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.Q = frameLayout2;
        addView(frameLayout2, w7.a6.e(-1, -1, 119));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.R = frameLayout3;
        frameLayout3.setAlpha(0.0f);
        addView(frameLayout3, w7.a6.e(-1, -1, 119));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.S = frameLayout4;
        frameLayout4.setAlpha(0.0f);
        addView(frameLayout4, w7.a6.e(-1, -1, 119));
        uh.o oVar = new uh.o(context);
        this.r = oVar;
        oVar.setGravity(17);
        oVar.setTextSize(1, 13.0f);
        oVar.setTextColor(-1);
        frameLayout2.addView(oVar, w7.a6.d(-1, -2.0f, 49, 32.0f, 244.0f, 32.0f, 84.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.v = linearLayout;
        LayoutTransition layoutTransition = new LayoutTransition();
        int i10 = 2;
        layoutTransition.setDuration(2, 320L);
        int i11 = 3;
        layoutTransition.setDuration(3, 320L);
        layoutTransition.setDuration(0, 320L);
        layoutTransition.setDuration(1, 320L);
        layoutTransition.setDuration(4, 320L);
        wr wrVar = wr.h;
        layoutTransition.setInterpolator(2, wrVar);
        layoutTransition.setInterpolator(3, wrVar);
        layoutTransition.setInterpolator(0, wrVar);
        layoutTransition.setInterpolator(1, wrVar);
        layoutTransition.setInterpolator(4, wrVar);
        linearLayout.setLayoutTransition(layoutTransition);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.w = linearLayout2;
        LayoutTransition layoutTransition2 = new LayoutTransition();
        layoutTransition2.setDuration(2, 320L);
        layoutTransition2.setDuration(3, 320L);
        layoutTransition2.setDuration(0, 320L);
        layoutTransition2.setDuration(1, 320L);
        layoutTransition2.setDuration(4, 320L);
        layoutTransition2.setInterpolator(2, wrVar);
        layoutTransition2.setInterpolator(3, wrVar);
        layoutTransition2.setInterpolator(0, wrVar);
        layoutTransition2.setInterpolator(1, wrVar);
        layoutTransition2.setInterpolator(4, wrVar);
        linearLayout2.setLayoutTransition(layoutTransition2);
        linearLayout2.setOrientation(0);
        linearLayout2.setAlpha(0.0f);
        linearLayout2.setGravity(17);
        this.x = new m2[4];
        this.y = new m2[4];
        for (int i12 = 0; i12 < 4; i12++) {
            LinearLayout linearLayout3 = this.v;
            m2[] m2VarArr = this.x;
            m2 m2Var = new m2(context);
            m2VarArr[i12] = m2Var;
            linearLayout3.addView(m2Var, w7.a6.k(0.0f, 0.0f, 0.0f, 0.0f, 48, 54));
            this.x[i12].setOnClickListener(new l2(this, i10));
        }
        for (int i13 = 0; i13 < 4; i13++) {
            LinearLayout linearLayout4 = this.v;
            m2[] m2VarArr2 = this.y;
            m2 m2Var2 = new m2(context);
            m2VarArr2[i13] = m2Var2;
            linearLayout4.addView(m2Var2, w7.a6.k(0.0f, 0.0f, 0.0f, 0.0f, 48, 54));
            this.y[i13].setOnClickListener(new l2(this, i11));
        }
        this.n = new v2[4];
        this.d = new r2[6];
        int i14 = 0;
        for (int i15 = 6; i14 < i15; i15 = 6) {
            r2[] r2VarArr = this.d;
            boolean z10 = i14 == 5;
            r2 r2Var = new r2(context);
            FrameLayout frameLayout5 = new FrameLayout(context);
            frameLayout5.setBackground(new k3(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.j6.l1(0.08f, -1)));
            r2Var.addView(frameLayout5, w7.a6.d(-1, -1.0f, 119, 2.0f, 2.0f, 2.0f, 2.0f));
            w9 w9Var = new w9(context);
            w9Var.setImageResource(R.drawable.large_forge);
            w9Var.setAlpha(z10 ? 1.0f : 0.45f);
            frameLayout5.addView(w9Var, w7.a6.e(z10 ? 42 : 64, z10 ? 42 : 64, 17));
            if (z10) {
                w9Var.setTranslationX(AndroidUtilities.dp(-4.0f));
                s2 s2Var = new s2(context);
                r2Var.b = s2Var;
                s2Var.e = AndroidUtilities.dp(37.0f);
                s2Var.a.setStrokeWidth(AndroidUtilities.dpf2(4.66f));
                frameLayout5.addView(s2Var, w7.a6.e(90, 90, 17));
                org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, false, false, false);
                r2Var.a = o6Var;
                o6Var.getDrawable().o(false, true, false);
                o6Var.setTypeface(AndroidUtilities.bold());
                o6Var.setTextColor(-1);
                o6Var.setTextSize(AndroidUtilities.dp(14.0f));
                o6Var.setGravity(17);
                o6Var.setText("0%");
                frameLayout5.addView(o6Var, w7.a6.d(-1, 16.0f, 55, 12.0f, 80.0f, 12.0f, 0.0f));
            }
            r2VarArr[i14] = r2Var;
            i14++;
        }
        this.e = this.d[5];
        t2 t2Var = new t2(context);
        this.f = t2Var;
        t2Var.setVisibility(8);
        t2Var.setAlpha(0.0f);
        addView(t2Var, w7.a6.d(300, 300.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        q2 q2Var = new q2(context, this.d);
        this.h = q2Var;
        addView(q2Var, w7.a6.d(-1, 300.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.x5 x5Var = new org.telegram.ui.Components.x5(context);
        this.E = x5Var;
        x5Var.setTextSize(1, 12.0f);
        x5Var.setTypeface(AndroidUtilities.bold());
        x5Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.GiftCraftViewAllVariants), false, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f)));
        x5Var.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
        x5Var.setGravity(17);
        x5Var.setTextColor(-1);
        x5Var.setAlpha(this.d0 != null ? 1.0f : 0.25f);
        x5Var.setBackground(new k3(AndroidUtilities.dp(14.0f), org.telegram.ui.ActionBar.j6.l1(0.08f, -1)));
        w7.c6.b(x5Var, 0.02f, 1.2f);
        this.Q.addView(x5Var, w7.a6.d(-2, 27.0f, 49, 32.0f, 412.0f, 32.0f, 84.0f));
        x5Var.setOnClickListener(new s1(2, this, f6Var));
        this.Q.addView(this.v, w7.a6.d(-2, 54.0f, 49, 32.0f, 340.0f, 32.0f, 84.0f));
        this.Q.addView(this.w, w7.a6.d(-2, 54.0f, 49, 32.0f, 394.0f, 32.0f, 84.0f));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.G = linearLayout5;
        linearLayout5.setOrientation(1);
        n2 n2Var = new n2();
        this.F = n2Var;
        linearLayout5.setBackground(n2Var);
        n2Var.a(org.telegram.ui.ActionBar.j6.l1(0.08f, -1), org.telegram.ui.ActionBar.j6.l1(0.08f, -1));
        w7.c6.b(linearLayout5, 0.02f, 1.2f);
        addView(linearLayout5, w7.a6.d(-1, -2.0f, 87, 20.0f, 0.0f, 20.0f, 18.0f));
        linearLayout5.setOnClickListener(new l2(this, 4));
        org.telegram.ui.Components.o6 o6Var2 = new org.telegram.ui.Components.o6(context, false, false, false);
        this.H = o6Var2;
        o6Var2.setTypeface(AndroidUtilities.bold());
        o6Var2.setGravity(17);
        o6Var2.setTextColor(org.telegram.ui.ActionBar.j6.l1(0.75f, -1));
        o6Var2.setText(LocaleController.getString(R.string.GiftCraftButton));
        o6Var2.setTextSize(AndroidUtilities.dp(14.0f));
        linearLayout5.addView(o6Var2, w7.a6.r(-1, 18, 55, 16.0f, 7.33f, 16.0f, 0.0f));
        org.telegram.ui.Components.o6 o6Var3 = new org.telegram.ui.Components.o6(context, false, false, false);
        this.I = o6Var3;
        o6Var3.getDrawable().o(true, false, false);
        o6Var3.setGravity(17);
        o6Var3.setTextColor(org.telegram.ui.ActionBar.j6.l1(0.75f, -1));
        o6Var3.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCraftSuccessChance, "0%")));
        o6Var3.setTextSize(AndroidUtilities.dp(12.0f));
        linearLayout5.addView(o6Var3, w7.a6.r(-1, 14, 55, 16.0f, 2.66f, 16.0f, 7.66f));
        LinearLayout linearLayout6 = new LinearLayout(context);
        linearLayout6.setOrientation(0);
        linearLayout6.setGravity(17);
        kj0 kj0Var = new kj0(context);
        this.J = kj0Var;
        kj0Var.setAutoRepeat(true);
        kj0Var.f(R.raw.gift_crafting, 30, 30, null);
        linearLayout6.addView(kj0Var, w7.a6.t(30, 30, 17, 0, 0, 4, 0));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 20.0f);
        textView2.setTextColor(-1);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.GiftCraftProgressTitle));
        linearLayout6.addView(textView2, w7.a6.t(-2, -2, 17, 0, 0, 0, 0));
        this.R.addView(linearLayout6, w7.a6.d(-1, -2.0f, 49, 0.0f, 350.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.K = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setTextColor(org.telegram.ui.ActionBar.j6.l1(0.5f, -1));
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setGravity(17);
        TextView f7 = org.telegram.ui.Cells.r6.f(this.R, textView3, w7.a6.d(-1, -2.0f, 49, 0.0f, 383.0f, 0.0f, 0.0f), context);
        this.L = f7;
        f7.setTextSize(1, 13.0f);
        f7.setTextColor(-1);
        f7.setTypeface(AndroidUtilities.bold());
        f7.setGravity(17);
        f7.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
        f7.setBackground(new k3(AndroidUtilities.dp(14.0f), org.telegram.ui.ActionBar.j6.l1(0.08f, -1)));
        TextView f10 = org.telegram.ui.Cells.r6.f(this.R, f7, w7.a6.d(-2, 27.0f, 81, 0.0f, 0.0f, 0.0f, 74.0f), context);
        f10.setTextSize(1, 13.0f);
        f10.setTextColor(org.telegram.ui.ActionBar.j6.l1(0.5f, -1));
        f10.setGravity(17);
        f10.setText(LocaleController.getString(R.string.GiftCraftProgressText));
        TextView f11 = org.telegram.ui.Cells.r6.f(this.R, f10, w7.a6.d(-1, -2.0f, 81, 42.0f, 0.0f, 42.0f, 24.0f), context);
        f11.setText(LocaleController.getString(R.string.GiftCraftFailedTitle));
        f11.setTextColor(-505270);
        f11.setTextSize(1, 20.0f);
        f11.setTypeface(AndroidUtilities.bold());
        f11.setGravity(17);
        TextView f12 = org.telegram.ui.Cells.r6.f(this.S, f11, w7.a6.d(-1, -2.0f, 55, 32.0f, 352.0f, 32.0f, 0.0f), context);
        this.M = f12;
        f12.setTextColor(-17253);
        f12.setTextSize(1, 13.0f);
        f12.setGravity(17);
        this.S.addView(f12, w7.a6.d(-1, -2.0f, 55, 32.0f, 383.0f, 32.0f, 0.0f));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.N = linearLayout7;
        linearLayout7.setOrientation(0);
        this.S.addView(linearLayout7, w7.a6.d(-2, -2.0f, 49, 0.0f, 250.0f, 0.0f, 0.0f));
        this.O = null;
        d(true);
    }

    public final void a(int i10, long j3, TLRPC.Document document, String str) {
        v2[] v2VarArr;
        this.W = i10;
        this.a0 = j3;
        this.b0 = document;
        this.c0 = str;
        this.h0 = false;
        this.j0 = false;
        int i11 = 0;
        while (true) {
            v2VarArr = this.n;
            if (i11 >= v2VarArr.length) {
                break;
            }
            v2 v2Var = v2VarArr[i11];
            if (v2Var != null) {
                AndroidUtilities.removeFromParent(v2Var);
            }
            i11++;
        }
        q2 q2Var = this.h;
        View[] viewArr = q2Var.a;
        p2 p2Var = q2Var.H;
        if (p2Var != null) {
            p2Var.e = true;
            p2Var.l = false;
            p2Var.a.H = null;
            q2Var.H = null;
        }
        ValueAnimator valueAnimator = q2Var.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            q2Var.G = null;
        }
        q2Var.F = -1;
        q2Var.E = 0.0f;
        q2Var.v.clear();
        q2Var.w.clear();
        q2Var.x.clear();
        for (int i12 = 0; i12 < 6; i12++) {
            q2Var.y[i12] = 0.0f;
        }
        q2Var.removeAllViews();
        for (int i13 = 0; i13 < viewArr.length; i13++) {
            viewArr[i13].setAlpha(1.0f);
            viewArr[i13].setVisibility(0);
            q2Var.addView(viewArr[i13], w7.a6.e(108, 108, 17));
        }
        Matrix.setIdentityM(q2Var.c, 0);
        q2Var.e = 0.0f;
        q2Var.d = 0.0f;
        q2Var.f = true;
        v2 v2Var2 = new v2(getContext());
        v2VarArr[0] = v2Var2;
        addView(v2Var2, w7.a6.d(76, 76.0f, 49, -117.0f, 74.0f, 0.0f, 0.0f));
        v2 v2Var3 = new v2(getContext());
        v2VarArr[1] = v2Var3;
        addView(v2Var3, w7.a6.d(76, 76.0f, 49, -117.0f, 149.0f, 0.0f, 0.0f));
        v2 v2Var4 = new v2(getContext());
        v2VarArr[2] = v2Var4;
        addView(v2Var4, w7.a6.d(76, 76.0f, 49, 117.0f, 74.0f, 0.0f, 0.0f));
        v2 v2Var5 = new v2(getContext());
        v2VarArr[3] = v2Var5;
        addView(v2Var5, w7.a6.d(76, 76.0f, 49, 117.0f, 149.0f, 0.0f, 0.0f));
        for (int i14 = 0; i14 < v2VarArr.length; i14++) {
            w7.c6.a(v2VarArr[i14]);
            v2VarArr[i14].setClickable(true);
            v2VarArr[i14].setOnClickListener(new l2(this, 5));
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
        t2 t2Var = this.f;
        t2Var.setVisibility(8);
        t2Var.setAlpha(0.0f);
        String string = LocaleController.getString(R.string.GiftCraftButton);
        org.telegram.ui.Components.o6 o6Var = this.H;
        o6Var.setText(string);
        o6Var.setTranslationY(0.0f);
        this.I.setAlpha(1.0f);
        GiftAuctionController.getInstance(i10).requestAuctionUpgrades(j3, new mg(this, j3, j3, 2));
    }

    public final void b(m2 m2Var) {
        if (m2Var.d != null) {
            c(m2Var, AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCraftBackdropChance", Math.round(m2Var.f * 100.0f), m2Var.d.name)));
        } else if (m2Var.e != null) {
            c(m2Var, AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCraftSymbolChance", Math.round(m2Var.f * 100.0f), m2Var.e.name)));
        }
    }

    public final void c(m2 m2Var, SpannableStringBuilder spannableStringBuilder) {
        bi.x4 x4Var = this.T;
        if (x4Var != null) {
            x4Var.e(true);
            this.T = null;
        }
        if (this.h0 || this.j0) {
            return;
        }
        View view = m2Var.getParent() instanceof View ? (View) m2Var.getParent() : null;
        float x10 = m2Var.getX() + (view != null ? view.getX() : 0.0f);
        float y3 = m2Var.getY() + (view != null ? view.getY() : 0.0f);
        bi.x4 x4Var2 = new bi.x4(getContext(), 3);
        this.T = x4Var2;
        x4Var2.p(true);
        this.T.s(spannableStringBuilder);
        bi.x4 x4Var3 = this.T;
        x4Var3.h = bi.x4.a(x4Var3.getText(), this.T.getTextPaint());
        bi.x4 x4Var4 = this.T;
        x4Var4.K = Layout.Alignment.ALIGN_CENTER;
        x4Var4.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        addView(this.T, w7.a6.d(-1, 100.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        this.T.setTranslationY(y3 - AndroidUtilities.dp(100.0f));
        this.T.m(0.0f, ((m2Var.getWidth() / 2.0f) + x10) - AndroidUtilities.dp(2.0f));
        this.T.u();
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x04a9, code lost:
    
        if (r5 != null) goto L186;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(boolean z10) {
        v2[] v2VarArr;
        HashMap hashMap;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop;
        int i10;
        HashMap hashMap2;
        m2[] m2VarArr;
        TL_stars.starGiftAttributePattern stargiftattributepattern;
        LinearLayout linearLayout;
        TL_stars.StarGift starGift;
        int giftsSelectedCount = getGiftsSelectedCount();
        float giftsSuccessChance = getGiftsSuccessChance() / 10.0f;
        r2 r2Var = this.e;
        org.telegram.ui.Components.o6 o6Var = r2Var.a;
        if (o6Var != null) {
            o6Var.c(Math.round(giftsSuccessChance) + "%", z10, true);
            s2 s2Var = r2Var.b;
            float f7 = giftsSuccessChance / 100.0f;
            s2Var.d = f7;
            if (!z10) {
                s2Var.b.d(f7, true);
            }
            s2Var.invalidate();
        }
        org.telegram.ui.Components.o6 o6Var2 = this.I;
        if (giftsSelectedCount <= 0) {
            if (this.m0 == null) {
                this.m0 = new SpannableStringBuilder("+");
                uq uqVar = new uq(R.drawable.filled_add_album, 0);
                uqVar.setScale(0.65f, 0.65f);
                SpannableStringBuilder spannableStringBuilder = this.m0;
                spannableStringBuilder.setSpan(uqVar, 0, spannableStringBuilder.length(), 33);
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.GiftCraftButtonEmpty));
            AndroidUtilities.replaceMultipleCharSequence("+", spannableStringBuilder2, this.m0);
            o6Var2.setText(spannableStringBuilder2);
        } else {
            o6Var2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCraftSuccessChance, di.m.G0(getGiftsSuccessChance()))));
        }
        int i11 = (giftsSelectedCount == 0 ? 0 : giftsSelectedCount < 4 ? 1 : 2) * 2;
        int[] iArr = this.V;
        int i12 = i11 + 1;
        this.F.a(iArr[i11], iArr[i12]);
        int[] iArr2 = this.U;
        this.b.a(iArr2[i11], iArr2[i12]);
        this.f.a(iArr[i12], iArr[i11]);
        if (this.b0 != null) {
            TL_stars.StarGift firstGift = getFirstGift();
            uh.o oVar = this.r;
            if (firstGift != null) {
                SpannableString spannableString = new SpannableString("x");
                spannableString.setSpan(new org.telegram.ui.Components.y5(this.b0, oVar.getPaint().getFontMetricsInt()), 0, spannableString.length(), 33);
                oVar.setText(TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.getString(R.string.GiftCraftText1)), "\n", spannableString, " ", AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCraftText2, this.c0, LocaleController.formatNumber(firstGift.num, ',')))));
            } else {
                SpannableString spannableString2 = new SpannableString("x");
                spannableString2.setSpan(new org.telegram.ui.Components.y5(this.b0, oVar.getPaint().getFontMetricsInt()), 0, spannableString2.length(), 33);
                oVar.setText(TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.getString(R.string.GiftCraftTextEmpty1)), "\n", spannableString2, " ", AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCraftTextEmpty2, this.c0))));
            }
        }
        int[][] iArr3 = MessagesController.getInstance(this.W).stargiftsCraftAttributesPermilles;
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        ArrayList arrayList = new ArrayList();
        int i13 = 0;
        int i14 = 0;
        while (true) {
            v2VarArr = this.n;
            if (i13 >= v2VarArr.length) {
                break;
            }
            v2 v2Var = v2VarArr[i13];
            if (v2Var != null) {
                TL_stars.StarGift starGift2 = v2Var.h;
                if ((starGift2 != null ? starGift2 : null) != null) {
                    i14++;
                    TL_stars.StarGift starGift3 = starGift2 != null ? starGift2 : null;
                    TL_stars.starGiftAttributePattern stargiftattributepattern2 = (TL_stars.starGiftAttributePattern) v5.l(starGift3.attributes, TL_stars.starGiftAttributePattern.class);
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = (TL_stars.starGiftAttributeBackdrop) v5.l(starGift3.attributes, TL_stars.starGiftAttributeBackdrop.class);
                    hashMap3.put(Integer.valueOf(stargiftattributebackdrop2.backdrop_id), Integer.valueOf(((Integer) Map.-EL.getOrDefault(hashMap3, Integer.valueOf(stargiftattributebackdrop2.backdrop_id), 0)).intValue() + 1));
                    hashMap4.put(Long.valueOf(stargiftattributepattern2.document.id), Integer.valueOf(((Integer) Map.-EL.getOrDefault(hashMap4, Long.valueOf(stargiftattributepattern2.document.id), 0)).intValue() + 1));
                }
            }
            i13++;
        }
        boolean isEmpty = hashMap3.isEmpty();
        m2[] m2VarArr2 = this.x;
        if (isEmpty) {
            m2 m2Var = m2VarArr2[0];
            m2Var.a(null);
            m2Var.c(0.0f, true);
            arrayList.add(m2Var);
            for (int i15 = 1; i15 < 4; i15++) {
                m2VarArr2[i15].setVisibility(8);
            }
            hashMap = hashMap4;
        } else {
            ArrayList arrayList2 = new ArrayList(hashMap3.entrySet());
            Collections.sort(arrayList2, Map$Entry$-CC.comparingByValue());
            int size = arrayList2.size();
            int i16 = 0;
            int i17 = 0;
            while (i16 < size) {
                Object obj = arrayList2.get(i16);
                i16++;
                Map.Entry entry = (Map.Entry) obj;
                int intValue = ((Integer) entry.getKey()).intValue();
                int intValue2 = ((Integer) entry.getValue()).intValue();
                int i18 = 0;
                while (true) {
                    if (i18 >= v2VarArr.length) {
                        stargiftattributebackdrop = null;
                        break;
                    }
                    v2 v2Var2 = v2VarArr[i18];
                    if (v2Var2 != null) {
                        TL_stars.StarGift starGift4 = v2Var2.h;
                        if ((starGift4 != null ? starGift4 : null) != null) {
                            if (starGift4 == null) {
                                starGift4 = null;
                            }
                            stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) v5.l(starGift4.attributes, TL_stars.starGiftAttributeBackdrop.class);
                            if (stargiftattributebackdrop.backdrop_id == intValue) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                    i18++;
                }
                if (stargiftattributebackdrop != null) {
                    m2 m2Var2 = m2VarArr2[i17];
                    m2Var2.a(stargiftattributebackdrop);
                    i10 = size;
                    int[] iArr4 = iArr3[Utilities.clamp(i14 - 1, iArr3.length - 1, 0)];
                    int i19 = intValue2 - 1;
                    hashMap2 = hashMap4;
                    m2Var2.c(iArr4[Utilities.clamp(i19, iArr4.length - 1, 0)] / 1000.0f, true);
                    arrayList.add(m2Var2);
                    i17++;
                } else {
                    i10 = size;
                    hashMap2 = hashMap4;
                }
                hashMap4 = hashMap2;
                size = i10;
            }
            hashMap = hashMap4;
            for (int i20 = i17; i20 < 4; i20++) {
                m2VarArr2[i20].setVisibility(8);
            }
        }
        boolean isEmpty2 = hashMap.isEmpty();
        m2[] m2VarArr3 = this.y;
        if (isEmpty2) {
            m2 m2Var3 = m2VarArr3[0];
            m2Var3.b(null);
            m2Var3.c(0.0f, true);
            arrayList.add(m2Var3);
            for (int i21 = 1; i21 < 4; i21++) {
                m2VarArr3[i21].setVisibility(8);
            }
        } else {
            ArrayList arrayList3 = new ArrayList(hashMap.entrySet());
            Collections.sort(arrayList3, Map$Entry$-CC.comparingByValue());
            int size2 = arrayList3.size();
            int i22 = 0;
            int i23 = 0;
            while (i23 < size2) {
                Object obj2 = arrayList3.get(i23);
                i23++;
                Map.Entry entry2 = (Map.Entry) obj2;
                long longValue = ((Long) entry2.getKey()).longValue();
                int intValue3 = ((Integer) entry2.getValue()).intValue();
                int i24 = 0;
                while (true) {
                    if (i24 >= v2VarArr.length) {
                        m2VarArr = m2VarArr3;
                        stargiftattributepattern = null;
                        break;
                    }
                    v2 v2Var3 = v2VarArr[i24];
                    if (v2Var3 != null) {
                        TL_stars.StarGift starGift5 = v2Var3.h;
                        if ((starGift5 != null ? starGift5 : null) != null) {
                            if (starGift5 == null) {
                                starGift5 = null;
                            }
                            TL_stars.starGiftAttributePattern stargiftattributepattern3 = (TL_stars.starGiftAttributePattern) v5.l(starGift5.attributes, TL_stars.starGiftAttributePattern.class);
                            if (stargiftattributepattern3 != null) {
                                m2VarArr = m2VarArr3;
                                if (stargiftattributepattern3.document.id == longValue) {
                                    stargiftattributepattern = stargiftattributepattern3;
                                    break;
                                } else {
                                    i24++;
                                    m2VarArr3 = m2VarArr;
                                }
                            }
                        }
                    }
                    m2VarArr = m2VarArr3;
                    i24++;
                    m2VarArr3 = m2VarArr;
                }
                if (stargiftattributepattern != null) {
                    int i25 = i22 + 1;
                    m2 m2Var4 = m2VarArr[i22];
                    m2Var4.b(stargiftattributepattern);
                    int[] iArr5 = iArr3[Utilities.clamp(i14 - 1, iArr3.length - 1, 0)];
                    m2Var4.c(iArr5[Utilities.clamp(intValue3 - 1, iArr5.length - 1, 0)] / 1000.0f, true);
                    arrayList.add(m2Var4);
                    i22 = i25;
                }
                m2VarArr3 = m2VarArr;
            }
            m2[] m2VarArr4 = m2VarArr3;
            while (i22 < 4) {
                m2VarArr4[i22].setVisibility(8);
                i22++;
            }
        }
        this.s = arrayList.size() > 5;
        int i26 = 0;
        while (true) {
            int size3 = arrayList.size();
            linearLayout = this.w;
            if (i26 >= size3) {
                break;
            }
            m2 m2Var5 = (m2) arrayList.get(i26);
            if (!this.s || i26 < arrayList.size() / 2.0f) {
                linearLayout = this.v;
            }
            if (m2Var5.getParent() != linearLayout) {
                ViewParent parent = m2Var5.getParent();
                if (parent instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) parent;
                    LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
                    boolean z11 = layoutTransition != null;
                    if (z11) {
                        layoutTransition.disableTransitionType(3);
                    }
                    viewGroup.removeView(m2Var5);
                    if (z11) {
                        layoutTransition.enableTransitionType(3);
                    }
                    m2Var5.animate().cancel();
                    m2Var5.clearAnimation();
                    m2Var5.setTranslationX(0.0f);
                    m2Var5.setTranslationY(0.0f);
                    m2Var5.setTranslationZ(0.0f);
                    m2Var5.setAlpha(0.0f);
                    m2Var5.setScaleX(1.0f);
                    m2Var5.setScaleY(1.0f);
                    m2Var5.setRotation(0.0f);
                    m2Var5.setRotationX(0.0f);
                    m2Var5.setRotationY(0.0f);
                }
                linearLayout.addView(m2Var5, w7.a6.k(0.0f, 0.0f, 0.0f, 0.0f, 48, 54));
            }
            m2Var5.setVisibility(0);
            i26++;
        }
        linearLayout.animate().alpha(this.s ? 1.0f : 0.0f);
        this.E.animate().alpha(this.s ? 0.0f : this.d0 != null ? 1.0f : 0.25f);
        boolean z12 = true;
        for (int i27 = 0; i27 < v2VarArr.length; i27++) {
            v2 v2Var4 = v2VarArr[i27];
            if (v2Var4 != null) {
                TL_stars.StarGift starGift6 = v2Var4.h;
                if (starGift6 == null) {
                    starGift6 = null;
                }
                if (starGift6 != null) {
                    if (z12) {
                        int i28 = i27 + 1;
                        while (true) {
                            if (i28 >= v2VarArr.length) {
                                break;
                            }
                            v2 v2Var5 = v2VarArr[i28];
                            if (v2Var5 != null) {
                                starGift = v2Var5.h;
                                if ((starGift != null ? starGift : null) != null) {
                                }
                            }
                            i28++;
                        }
                        starGift = null;
                        v2 v2Var6 = v2VarArr[i27];
                        boolean z13 = (starGift == null || TextUtils.isEmpty(starGift.gift_address)) ? false : true;
                        ImageView imageView = v2Var6.f;
                        imageView.setScaleX(0.8f);
                        imageView.setScaleY(0.8f);
                        v2Var6.n = z13;
                        imageView.setImageResource(z13 ? R.drawable.mini_replace2 : R.drawable.msg_close);
                    } else {
                        ImageView imageView2 = v2Var4.f;
                        imageView2.setScaleX(0.8f);
                        imageView2.setScaleY(0.8f);
                        v2Var4.n = false;
                        imageView2.setImageResource(R.drawable.msg_close);
                    }
                    z12 = false;
                }
            }
        }
    }

    public TL_stars.StarGift getFirstGift() {
        int i10 = 0;
        while (true) {
            v2[] v2VarArr = this.n;
            if (i10 >= v2VarArr.length) {
                return null;
            }
            v2 v2Var = v2VarArr[i10];
            if (v2Var != null) {
                TL_stars.StarGift starGift = v2Var.h;
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
            v2[] v2VarArr = this.n;
            if (i10 >= v2VarArr.length) {
                return i11;
            }
            v2 v2Var = v2VarArr[i10];
            if (v2Var != null) {
                TL_stars.StarGift starGift = v2Var.h;
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
            v2[] v2VarArr = this.n;
            if (i10 >= v2VarArr.length) {
                return i11;
            }
            v2 v2Var = v2VarArr[i10];
            if (v2Var != null) {
                TL_stars.StarGift starGift = v2Var.h;
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

    public void setOnAddGift(Utilities.Callback2<Utilities.Callback<TL_stars.StarGift>, Boolean> callback2) {
        this.f0 = callback2;
    }

    public void setOnClose(Runnable runnable) {
        this.g0 = runnable;
    }

    public void setOnCraft(Utilities.Callback3<ArrayList<TL_stars.StarGift>, Utilities.Callback2<TL_stars.StarGift, Runnable>, Runnable> callback3) {
        this.e0 = callback3;
    }
}
