package zh;

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
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.br;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.z9;
import org.telegram.ui.ih;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class s2 extends FrameLayout {
    public final org.telegram.ui.Components.a6 E;
    public final i2 F;
    public final LinearLayout G;
    public final org.telegram.ui.Components.s6 H;
    public final org.telegram.ui.Components.s6 I;
    public final bk0 J;
    public final TextView K;
    public final TextView L;
    public final TextView M;
    public final LinearLayout N;
    public yh.h1[] O;
    public final FrameLayout P;
    public final FrameLayout Q;
    public final FrameLayout R;
    public final FrameLayout S;
    public di.d4 T;
    public final int[] U;
    public final int[] V;
    public int W;
    public final org.telegram.ui.ActionBar.c6 a;
    public long a0;
    public final r2 b;
    public TLRPC.Document b0;
    public final ImageView c;
    public String c0;
    public final m2[] d;
    public ArrayList d0;
    public final m2 e;
    public Utilities.Callback3 e0;
    public final o2 f;
    public Utilities.Callback2 f0;
    public Runnable g0;
    public final l2 h;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public Runnable k0;
    public bk0 l0;
    public SpannableStringBuilder m0;
    public final q2[] n;
    public final wh.n r;
    public boolean s;
    public final LinearLayout v;
    public final LinearLayout w;
    public final h2[] x;
    public final h2[] y;

    public s2(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        int i10 = 6;
        this.U = new int[]{-14861233, -15787732, -11327734, -14742773, -14527649, -15920861};
        this.V = new int[]{org.telegram.ui.ActionBar.g6.m1(0.08f, -1), org.telegram.ui.ActionBar.g6.m1(0.08f, -1), -294362, -3914963, -13519030, -12613223};
        this.a = c6Var;
        r2 r2Var = new r2();
        this.b = r2Var;
        Drawable mutate = context.getResources().getDrawable(R.drawable.filled_forge).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_IN));
        r2Var.g = mutate;
        setBackground(r2Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.P = frameLayout;
        addView(frameLayout, w7.a6.e(-1, 60, 55));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setImageResource(R.drawable.outline_question_mark);
        imageView.setBackground(new f3(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.g6.m1(0.08f, -1)));
        frameLayout.addView(imageView, w7.a6.a(32.0f, 14.0f, 14.0f, 14.0f, 14.0f, 32, 51));
        imageView.setOnClickListener(new g2(this, 0));
        w7.c6.a(imageView);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.msg_close);
        imageView2.setBackground(new f3(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.g6.m1(0.08f, -1)));
        frameLayout.addView(imageView2, w7.a6.a(32.0f, 14.0f, 14.0f, 14.0f, 14.0f, 32, 53));
        int i11 = 1;
        imageView2.setOnClickListener(new g2(this, i11));
        w7.c6.a(imageView2);
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setTextSize(1, 20.0f);
        textView.setTextColor(-1);
        textView.setText(LocaleController.getString(R.string.GiftCraftTitle));
        addView(textView, w7.a6.a(-2.0f, 0.0f, 20.0f, 0.0f, 0.0f, -1, 49));
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
        wh.n nVar = new wh.n(context);
        this.r = nVar;
        nVar.setGravity(17);
        nVar.setTextSize(1, 13.0f);
        nVar.setTextColor(-1);
        frameLayout2.addView(nVar, w7.a6.a(-2.0f, 32.0f, 244.0f, 32.0f, 84.0f, -1, 49));
        LinearLayout linearLayout = new LinearLayout(context);
        this.v = linearLayout;
        LayoutTransition layoutTransition = new LayoutTransition();
        int i12 = 2;
        layoutTransition.setDuration(2, 320L);
        int i13 = 3;
        layoutTransition.setDuration(3, 320L);
        layoutTransition.setDuration(0, 320L);
        layoutTransition.setDuration(1, 320L);
        layoutTransition.setDuration(4, 320L);
        es esVar = es.h;
        layoutTransition.setInterpolator(2, esVar);
        layoutTransition.setInterpolator(3, esVar);
        layoutTransition.setInterpolator(0, esVar);
        layoutTransition.setInterpolator(1, esVar);
        layoutTransition.setInterpolator(4, esVar);
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
        layoutTransition2.setInterpolator(2, esVar);
        layoutTransition2.setInterpolator(3, esVar);
        layoutTransition2.setInterpolator(0, esVar);
        layoutTransition2.setInterpolator(1, esVar);
        layoutTransition2.setInterpolator(4, esVar);
        linearLayout2.setLayoutTransition(layoutTransition2);
        linearLayout2.setOrientation(0);
        linearLayout2.setAlpha(0.0f);
        linearLayout2.setGravity(17);
        this.x = new h2[4];
        this.y = new h2[4];
        for (int i14 = 0; i14 < 4; i14++) {
            LinearLayout linearLayout3 = this.v;
            h2[] h2VarArr = this.x;
            h2 h2Var = new h2(context);
            h2VarArr[i14] = h2Var;
            linearLayout3.addView(h2Var, w7.a6.k(0.0f, 0.0f, 0.0f, 0.0f, 48, 54));
            this.x[i14].setOnClickListener(new g2(this, i12));
        }
        for (int i15 = 0; i15 < 4; i15++) {
            LinearLayout linearLayout4 = this.v;
            h2[] h2VarArr2 = this.y;
            h2 h2Var2 = new h2(context);
            h2VarArr2[i15] = h2Var2;
            linearLayout4.addView(h2Var2, w7.a6.k(0.0f, 0.0f, 0.0f, 0.0f, 48, 54));
            this.y[i15].setOnClickListener(new g2(this, i13));
        }
        this.n = new q2[4];
        this.d = new m2[6];
        int i16 = 0;
        while (i16 < i10) {
            m2[] m2VarArr = this.d;
            int i17 = i16 == 5 ? i11 : 0;
            m2 m2Var = new m2(context);
            FrameLayout frameLayout5 = new FrameLayout(context);
            frameLayout5.setBackground(new f3(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.g6.m1(0.08f, -1)));
            m2Var.addView(frameLayout5, w7.a6.a(-1.0f, 2.0f, 2.0f, 2.0f, 2.0f, -1, 119));
            z9 z9Var = new z9(context);
            z9Var.setImageResource(R.drawable.large_forge);
            z9Var.setAlpha(i17 != 0 ? 1.0f : 0.45f);
            frameLayout5.addView(z9Var, w7.a6.e(i17 != 0 ? 42 : 64, i17 != 0 ? 42 : 64, 17));
            if (i17 != 0) {
                z9Var.setTranslationX(AndroidUtilities.dp(-4.0f));
                n2 n2Var = new n2(context);
                m2Var.b = n2Var;
                n2Var.e = AndroidUtilities.dp(37.0f);
                n2Var.a.setStrokeWidth(AndroidUtilities.dpf2(4.66f));
                frameLayout5.addView(n2Var, w7.a6.e(90, 90, 17));
                org.telegram.ui.Components.s6 s6Var = new org.telegram.ui.Components.s6(context, false, false, false);
                m2Var.a = s6Var;
                s6Var.getDrawable().r(false, true);
                s6Var.setTypeface(AndroidUtilities.bold());
                s6Var.setTextColor(-1);
                s6Var.setTextSize(AndroidUtilities.dp(14.0f));
                s6Var.setGravity(17);
                s6Var.setText("0%");
                frameLayout5.addView(s6Var, w7.a6.a(16.0f, 12.0f, 80.0f, 12.0f, 0.0f, -1, 55));
            }
            m2VarArr[i16] = m2Var;
            i16++;
            i10 = 6;
            i11 = 1;
        }
        this.e = this.d[5];
        o2 o2Var = new o2(context);
        this.f = o2Var;
        o2Var.setVisibility(8);
        o2Var.setAlpha(0.0f);
        addView(o2Var, w7.a6.a(300.0f, 0.0f, 0.0f, 0.0f, 0.0f, 300, 49));
        l2 l2Var = new l2(context, this.d);
        this.h = l2Var;
        addView(l2Var, w7.a6.a(300.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 55));
        org.telegram.ui.Components.a6 a6Var = new org.telegram.ui.Components.a6(context);
        this.E = a6Var;
        a6Var.setTextSize(1, 12.0f);
        a6Var.setTypeface(AndroidUtilities.bold());
        a6Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.GiftCraftViewAllVariants), false, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f)));
        a6Var.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
        a6Var.setGravity(17);
        a6Var.setTextColor(-1);
        a6Var.setAlpha(this.d0 != null ? 1.0f : 0.25f);
        a6Var.setBackground(new f3(AndroidUtilities.dp(14.0f), org.telegram.ui.ActionBar.g6.m1(0.08f, -1)));
        w7.c6.b(a6Var, 0.02f, 1.2f);
        this.Q.addView(a6Var, w7.a6.a(27.0f, 32.0f, 412.0f, 32.0f, 84.0f, -2, 49));
        a6Var.setOnClickListener(new yh.a(12, this, c6Var));
        this.Q.addView(this.v, w7.a6.a(54.0f, 32.0f, 340.0f, 32.0f, 84.0f, -2, 49));
        this.Q.addView(this.w, w7.a6.a(54.0f, 32.0f, 394.0f, 32.0f, 84.0f, -2, 49));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.G = linearLayout5;
        linearLayout5.setOrientation(1);
        i2 i2Var = new i2();
        this.F = i2Var;
        linearLayout5.setBackground(i2Var);
        i2Var.a(org.telegram.ui.ActionBar.g6.m1(0.08f, -1), org.telegram.ui.ActionBar.g6.m1(0.08f, -1));
        w7.c6.b(linearLayout5, 0.02f, 1.2f);
        addView(linearLayout5, w7.a6.a(-2.0f, 20.0f, 0.0f, 20.0f, 18.0f, -1, 87));
        linearLayout5.setOnClickListener(new g2(this, 4));
        org.telegram.ui.Components.s6 s6Var2 = new org.telegram.ui.Components.s6(context, false, false, false);
        this.H = s6Var2;
        s6Var2.setTypeface(AndroidUtilities.bold());
        s6Var2.setGravity(17);
        s6Var2.setTextColor(org.telegram.ui.ActionBar.g6.m1(0.75f, -1));
        s6Var2.setText(LocaleController.getString(R.string.GiftCraftButton));
        s6Var2.setTextSize(AndroidUtilities.dp(14.0f));
        linearLayout5.addView(s6Var2, w7.a6.r(-1, 18, 55, 16.0f, 7.33f, 16.0f, 0.0f));
        org.telegram.ui.Components.s6 s6Var3 = new org.telegram.ui.Components.s6(context, false, false, false);
        this.I = s6Var3;
        s6Var3.getDrawable().r(true, false);
        s6Var3.setGravity(17);
        s6Var3.setTextColor(org.telegram.ui.ActionBar.g6.m1(0.75f, -1));
        s6Var3.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCraftSuccessChance, "0%")));
        s6Var3.setTextSize(AndroidUtilities.dp(12.0f));
        linearLayout5.addView(s6Var3, w7.a6.r(-1, 14, 55, 16.0f, 2.66f, 16.0f, 7.66f));
        LinearLayout linearLayout6 = new LinearLayout(context);
        linearLayout6.setOrientation(0);
        linearLayout6.setGravity(17);
        bk0 bk0Var = new bk0(context);
        this.J = bk0Var;
        bk0Var.setAutoRepeat(true);
        bk0Var.f(R.raw.gift_crafting, 30, 30, null);
        linearLayout6.addView(bk0Var, w7.a6.t(30, 30, 17, 0, 0, 4, 0));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 20.0f);
        textView2.setTextColor(-1);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.GiftCraftProgressTitle));
        linearLayout6.addView(textView2, w7.a6.t(-2, -2, 17, 0, 0, 0, 0));
        this.R.addView(linearLayout6, w7.a6.a(-2.0f, 0.0f, 350.0f, 0.0f, 0.0f, -1, 49));
        TextView textView3 = new TextView(context);
        this.K = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setTextColor(org.telegram.ui.ActionBar.g6.m1(0.5f, -1));
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setGravity(17);
        TextView h = org.telegram.ui.Cells.d0.h(this.R, textView3, w7.a6.a(-2.0f, 0.0f, 383.0f, 0.0f, 0.0f, -1, 49), context);
        this.L = h;
        h.setTextSize(1, 13.0f);
        h.setTextColor(-1);
        h.setTypeface(AndroidUtilities.bold());
        h.setGravity(17);
        h.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
        h.setBackground(new f3(AndroidUtilities.dp(14.0f), org.telegram.ui.ActionBar.g6.m1(0.08f, -1)));
        TextView h10 = org.telegram.ui.Cells.d0.h(this.R, h, w7.a6.a(27.0f, 0.0f, 0.0f, 0.0f, 74.0f, -2, 81), context);
        h10.setTextSize(1, 13.0f);
        h10.setTextColor(org.telegram.ui.ActionBar.g6.m1(0.5f, -1));
        h10.setGravity(17);
        h10.setText(LocaleController.getString(R.string.GiftCraftProgressText));
        TextView h11 = org.telegram.ui.Cells.d0.h(this.R, h10, w7.a6.a(-2.0f, 42.0f, 0.0f, 42.0f, 24.0f, -1, 81), context);
        h11.setText(LocaleController.getString(R.string.GiftCraftFailedTitle));
        h11.setTextColor(-505270);
        h11.setTextSize(1, 20.0f);
        h11.setTypeface(AndroidUtilities.bold());
        h11.setGravity(17);
        TextView h12 = org.telegram.ui.Cells.d0.h(this.S, h11, w7.a6.a(-2.0f, 32.0f, 352.0f, 32.0f, 0.0f, -1, 55), context);
        this.M = h12;
        h12.setTextColor(-17253);
        h12.setTextSize(1, 13.0f);
        h12.setGravity(17);
        this.S.addView(h12, w7.a6.a(-2.0f, 32.0f, 383.0f, 32.0f, 0.0f, -1, 55));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.N = linearLayout7;
        linearLayout7.setOrientation(0);
        this.S.addView(linearLayout7, w7.a6.a(-2.0f, 0.0f, 250.0f, 0.0f, 0.0f, -2, 49));
        this.O = null;
        d(true);
    }

    public final void a(int i10, long j10, TLRPC.Document document, String str) {
        q2[] q2VarArr;
        this.W = i10;
        this.a0 = j10;
        this.b0 = document;
        this.c0 = str;
        this.h0 = false;
        this.j0 = false;
        int i11 = 0;
        while (true) {
            q2VarArr = this.n;
            if (i11 >= q2VarArr.length) {
                break;
            }
            q2 q2Var = q2VarArr[i11];
            if (q2Var != null) {
                AndroidUtilities.removeFromParent(q2Var);
            }
            i11++;
        }
        l2 l2Var = this.h;
        View[] viewArr = l2Var.a;
        k2 k2Var = l2Var.H;
        if (k2Var != null) {
            k2Var.e = true;
            k2Var.l = false;
            k2Var.a.H = null;
            l2Var.H = null;
        }
        ValueAnimator valueAnimator = l2Var.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            l2Var.G = null;
        }
        l2Var.F = -1;
        l2Var.E = 0.0f;
        l2Var.v.clear();
        l2Var.w.clear();
        l2Var.x.clear();
        for (int i12 = 0; i12 < 6; i12++) {
            l2Var.y[i12] = 0.0f;
        }
        l2Var.removeAllViews();
        for (int i13 = 0; i13 < viewArr.length; i13++) {
            viewArr[i13].setAlpha(1.0f);
            viewArr[i13].setVisibility(0);
            l2Var.addView(viewArr[i13], w7.a6.e(108, 108, 17));
        }
        Matrix.setIdentityM(l2Var.c, 0);
        l2Var.e = 0.0f;
        l2Var.d = 0.0f;
        l2Var.f = true;
        q2 q2Var2 = new q2(getContext());
        q2VarArr[0] = q2Var2;
        addView(q2Var2, w7.a6.a(76.0f, -117.0f, 74.0f, 0.0f, 0.0f, 76, 49));
        q2 q2Var3 = new q2(getContext());
        q2VarArr[1] = q2Var3;
        addView(q2Var3, w7.a6.a(76.0f, -117.0f, 149.0f, 0.0f, 0.0f, 76, 49));
        q2 q2Var4 = new q2(getContext());
        q2VarArr[2] = q2Var4;
        addView(q2Var4, w7.a6.a(76.0f, 117.0f, 74.0f, 0.0f, 0.0f, 76, 49));
        q2 q2Var5 = new q2(getContext());
        q2VarArr[3] = q2Var5;
        addView(q2Var5, w7.a6.a(76.0f, 117.0f, 149.0f, 0.0f, 0.0f, 76, 49));
        for (int i14 = 0; i14 < q2VarArr.length; i14++) {
            w7.c6.a(q2VarArr[i14]);
            q2VarArr[i14].setClickable(true);
            q2VarArr[i14].setOnClickListener(new g2(this, 5));
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
        o2 o2Var = this.f;
        o2Var.setVisibility(8);
        o2Var.setAlpha(0.0f);
        String string = LocaleController.getString(R.string.GiftCraftButton);
        org.telegram.ui.Components.s6 s6Var = this.H;
        s6Var.setText(string);
        s6Var.setTranslationY(0.0f);
        this.I.setAlpha(1.0f);
        GiftAuctionController.getInstance(i10).requestAuctionUpgrades(j10, new ih(this, j10, j10, 2));
    }

    public final void b(h2 h2Var) {
        if (h2Var.d != null) {
            c(h2Var, AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCraftBackdropChance", Math.round(h2Var.f * 100.0f), h2Var.d.name)));
        } else if (h2Var.e != null) {
            c(h2Var, AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCraftSymbolChance", Math.round(h2Var.f * 100.0f), h2Var.e.name)));
        }
    }

    public final void c(h2 h2Var, SpannableStringBuilder spannableStringBuilder) {
        di.d4 d4Var = this.T;
        if (d4Var != null) {
            d4Var.e(true);
            this.T = null;
        }
        if (this.h0 || this.j0) {
            return;
        }
        View view = h2Var.getParent() instanceof View ? (View) h2Var.getParent() : null;
        float x10 = h2Var.getX() + (view != null ? view.getX() : 0.0f);
        float y3 = h2Var.getY() + (view != null ? view.getY() : 0.0f);
        di.d4 d4Var2 = new di.d4(getContext(), 3);
        this.T = d4Var2;
        d4Var2.p(true);
        this.T.s(spannableStringBuilder);
        di.d4 d4Var3 = this.T;
        d4Var3.h = di.d4.a(d4Var3.getText(), this.T.getTextPaint());
        di.d4 d4Var4 = this.T;
        d4Var4.K = Layout.Alignment.ALIGN_CENTER;
        d4Var4.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        addView(this.T, w7.a6.a(100.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 55));
        this.T.setTranslationY(y3 - AndroidUtilities.dp(100.0f));
        this.T.m(0.0f, ((h2Var.getWidth() / 2.0f) + x10) - AndroidUtilities.dp(2.0f));
        this.T.u();
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x04a9, code lost:
    
        if (r5 != null) goto L185;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(boolean z10) {
        int i10;
        q2[] q2VarArr;
        HashMap hashMap;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop;
        int i11;
        HashMap hashMap2;
        boolean z11;
        h2[] h2VarArr;
        TL_stars.starGiftAttributePattern stargiftattributepattern;
        LinearLayout linearLayout;
        boolean z12;
        TL_stars.StarGift starGift;
        int giftsSelectedCount = getGiftsSelectedCount();
        float giftsSuccessChance = getGiftsSuccessChance() / 10.0f;
        m2 m2Var = this.e;
        org.telegram.ui.Components.s6 s6Var = m2Var.a;
        if (s6Var != null) {
            s6Var.c(Math.round(giftsSuccessChance) + "%", z10, true);
            n2 n2Var = m2Var.b;
            float f7 = giftsSuccessChance / 100.0f;
            n2Var.d = f7;
            if (!z10) {
                n2Var.b.d(f7, true);
            }
            n2Var.invalidate();
        }
        org.telegram.ui.Components.s6 s6Var2 = this.I;
        int i12 = 0;
        if (giftsSelectedCount <= 0) {
            if (this.m0 == null) {
                this.m0 = new SpannableStringBuilder("+");
                br brVar = new br(R.drawable.filled_add_album, 0);
                brVar.setScale(0.65f, 0.65f);
                SpannableStringBuilder spannableStringBuilder = this.m0;
                spannableStringBuilder.setSpan(brVar, 0, spannableStringBuilder.length(), 33);
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.GiftCraftButtonEmpty));
            AndroidUtilities.replaceMultipleCharSequence("+", spannableStringBuilder2, this.m0);
            s6Var2.setText(spannableStringBuilder2);
        } else {
            s6Var2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCraftSuccessChance, fi.l.H0(getGiftsSuccessChance()))));
        }
        int i13 = (giftsSelectedCount == 0 ? 0 : giftsSelectedCount < 4 ? 1 : 2) * 2;
        int[] iArr = this.V;
        int i14 = i13 + 1;
        this.F.a(iArr[i13], iArr[i14]);
        int[] iArr2 = this.U;
        this.b.a(iArr2[i13], iArr2[i14]);
        this.f.a(iArr[i14], iArr[i13]);
        if (this.b0 != null) {
            TL_stars.StarGift firstGift = getFirstGift();
            wh.n nVar = this.r;
            if (firstGift != null) {
                SpannableString spannableString = new SpannableString("x");
                spannableString.setSpan(new org.telegram.ui.Components.b6(this.b0, nVar.getPaint().getFontMetricsInt()), 0, spannableString.length(), 33);
                i10 = 4;
                nVar.setText(TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.getString(R.string.GiftCraftText1)), "\n", spannableString, " ", AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCraftText2, this.c0, LocaleController.formatNumber(firstGift.num, ',')))));
            } else {
                i10 = 4;
                SpannableString spannableString2 = new SpannableString("x");
                spannableString2.setSpan(new org.telegram.ui.Components.b6(this.b0, nVar.getPaint().getFontMetricsInt()), 0, spannableString2.length(), 33);
                nVar.setText(TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.getString(R.string.GiftCraftTextEmpty1)), "\n", spannableString2, " ", AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCraftTextEmpty2, this.c0))));
            }
        } else {
            i10 = 4;
        }
        int[][] iArr3 = MessagesController.getInstance(this.W).stargiftsCraftAttributesPermilles;
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        ArrayList arrayList = new ArrayList();
        int i15 = 0;
        int i16 = 0;
        while (true) {
            q2VarArr = this.n;
            if (i15 >= q2VarArr.length) {
                break;
            }
            q2 q2Var = q2VarArr[i15];
            if (q2Var != null) {
                TL_stars.StarGift starGift2 = q2Var.h;
                if ((starGift2 != null ? starGift2 : null) != null) {
                    i16++;
                    TL_stars.StarGift starGift3 = starGift2 != null ? starGift2 : null;
                    TL_stars.starGiftAttributePattern stargiftattributepattern2 = (TL_stars.starGiftAttributePattern) n5.l(starGift3.attributes, TL_stars.starGiftAttributePattern.class);
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = (TL_stars.starGiftAttributeBackdrop) n5.l(starGift3.attributes, TL_stars.starGiftAttributeBackdrop.class);
                    hashMap3.put(Integer.valueOf(stargiftattributebackdrop2.backdrop_id), Integer.valueOf(((Integer) Map.-EL.getOrDefault(hashMap3, Integer.valueOf(stargiftattributebackdrop2.backdrop_id), 0)).intValue() + 1));
                    hashMap4.put(Long.valueOf(stargiftattributepattern2.document.id), Integer.valueOf(((Integer) Map.-EL.getOrDefault(hashMap4, Long.valueOf(stargiftattributepattern2.document.id), 0)).intValue() + 1));
                }
            }
            i15++;
        }
        boolean isEmpty = hashMap3.isEmpty();
        h2[] h2VarArr2 = this.x;
        if (isEmpty) {
            h2 h2Var = h2VarArr2[0];
            h2Var.a(null);
            h2Var.c(0.0f, true);
            arrayList.add(h2Var);
            int i17 = 1;
            for (int i18 = i10; i17 < i18; i18 = 4) {
                h2VarArr2[i17].setVisibility(8);
                i17++;
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
                int i21 = i12;
                while (true) {
                    if (i21 >= q2VarArr.length) {
                        stargiftattributebackdrop = null;
                        break;
                    }
                    q2 q2Var2 = q2VarArr[i21];
                    if (q2Var2 != null) {
                        TL_stars.StarGift starGift4 = q2Var2.h;
                        if ((starGift4 != null ? starGift4 : null) != null) {
                            if (starGift4 == null) {
                                starGift4 = null;
                            }
                            stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) n5.l(starGift4.attributes, TL_stars.starGiftAttributeBackdrop.class);
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
                    h2 h2Var2 = h2VarArr2[i20];
                    h2Var2.a(stargiftattributebackdrop);
                    i11 = size;
                    int[] iArr4 = iArr3[Utilities.clamp(i16 - 1, iArr3.length - 1, 0)];
                    int i22 = intValue2 - 1;
                    hashMap2 = hashMap4;
                    h2Var2.c(iArr4[Utilities.clamp(i22, iArr4.length - 1, 0)] / 1000.0f, true);
                    arrayList.add(h2Var2);
                    i20++;
                } else {
                    i11 = size;
                    hashMap2 = hashMap4;
                }
                hashMap4 = hashMap2;
                size = i11;
                i12 = 0;
            }
            hashMap = hashMap4;
            for (int i23 = i20; i23 < 4; i23++) {
                h2VarArr2[i23].setVisibility(8);
            }
        }
        boolean isEmpty2 = hashMap.isEmpty();
        h2[] h2VarArr3 = this.y;
        if (isEmpty2) {
            h2 h2Var3 = h2VarArr3[0];
            h2Var3.b(null);
            h2Var3.c(0.0f, true);
            arrayList.add(h2Var3);
            for (int i24 = 1; i24 < 4; i24++) {
                h2VarArr3[i24].setVisibility(8);
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
                    if (i27 >= q2VarArr.length) {
                        h2VarArr = h2VarArr3;
                        stargiftattributepattern = null;
                        break;
                    }
                    q2 q2Var3 = q2VarArr[i27];
                    if (q2Var3 != null) {
                        TL_stars.StarGift starGift5 = q2Var3.h;
                        if ((starGift5 != null ? starGift5 : null) != null) {
                            if (starGift5 == null) {
                                starGift5 = null;
                            }
                            TL_stars.starGiftAttributePattern stargiftattributepattern3 = (TL_stars.starGiftAttributePattern) n5.l(starGift5.attributes, TL_stars.starGiftAttributePattern.class);
                            if (stargiftattributepattern3 != null) {
                                h2VarArr = h2VarArr3;
                                if (stargiftattributepattern3.document.id == longValue) {
                                    stargiftattributepattern = stargiftattributepattern3;
                                    break;
                                } else {
                                    i27++;
                                    h2VarArr3 = h2VarArr;
                                }
                            }
                        }
                    }
                    h2VarArr = h2VarArr3;
                    i27++;
                    h2VarArr3 = h2VarArr;
                }
                if (stargiftattributepattern != null) {
                    int i28 = i25 + 1;
                    h2 h2Var4 = h2VarArr[i25];
                    h2Var4.b(stargiftattributepattern);
                    int[] iArr5 = iArr3[Utilities.clamp(i16 - 1, iArr3.length - 1, 0)];
                    h2Var4.c(iArr5[Utilities.clamp(intValue3 - 1, iArr5.length - 1, 0)] / 1000.0f, true);
                    arrayList.add(h2Var4);
                    i25 = i28;
                }
                h2VarArr3 = h2VarArr;
            }
            h2[] h2VarArr4 = h2VarArr3;
            z11 = true;
            while (i25 < 4) {
                h2VarArr4[i25].setVisibility(8);
                i25++;
            }
        }
        this.s = arrayList.size() > 5 ? z11 : false;
        int i29 = 0;
        while (true) {
            int size3 = arrayList.size();
            linearLayout = this.w;
            if (i29 >= size3) {
                break;
            }
            h2 h2Var5 = (h2) arrayList.get(i29);
            if (!this.s || i29 < arrayList.size() / 2.0f) {
                linearLayout = this.v;
            }
            if (h2Var5.getParent() != linearLayout) {
                ViewParent parent = h2Var5.getParent();
                if (parent instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) parent;
                    LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
                    boolean z13 = layoutTransition != null ? z11 : false;
                    if (z13) {
                        layoutTransition.disableTransitionType(3);
                    }
                    viewGroup.removeView(h2Var5);
                    if (z13) {
                        layoutTransition.enableTransitionType(3);
                    }
                    h2Var5.animate().cancel();
                    h2Var5.clearAnimation();
                    h2Var5.setTranslationX(0.0f);
                    h2Var5.setTranslationY(0.0f);
                    h2Var5.setTranslationZ(0.0f);
                    h2Var5.setAlpha(0.0f);
                    h2Var5.setScaleX(1.0f);
                    h2Var5.setScaleY(1.0f);
                    h2Var5.setRotation(0.0f);
                    h2Var5.setRotationX(0.0f);
                    h2Var5.setRotationY(0.0f);
                }
                linearLayout.addView(h2Var5, w7.a6.k(0.0f, 0.0f, 0.0f, 0.0f, 48, 54));
            }
            h2Var5.setVisibility(0);
            i29++;
        }
        linearLayout.animate().alpha(this.s ? 1.0f : 0.0f);
        this.E.animate().alpha(this.s ? 0.0f : this.d0 != null ? 1.0f : 0.25f);
        boolean z14 = z11;
        for (int i30 = 0; i30 < q2VarArr.length; i30++) {
            q2 q2Var4 = q2VarArr[i30];
            if (q2Var4 != null) {
                TL_stars.StarGift starGift6 = q2Var4.h;
                if (starGift6 == null) {
                    starGift6 = null;
                }
                if (starGift6 != null) {
                    if (z14) {
                        int i31 = i30 + 1;
                        while (true) {
                            if (i31 >= q2VarArr.length) {
                                break;
                            }
                            q2 q2Var5 = q2VarArr[i31];
                            if (q2Var5 != null) {
                                starGift = q2Var5.h;
                                if ((starGift != null ? starGift : null) != null) {
                                }
                            }
                            i31++;
                        }
                        starGift = null;
                        q2 q2Var6 = q2VarArr[i30];
                        boolean z15 = (starGift == null || TextUtils.isEmpty(starGift.gift_address)) ? false : z11;
                        ImageView imageView = q2Var6.f;
                        imageView.setScaleX(0.8f);
                        imageView.setScaleY(0.8f);
                        q2Var6.n = z15;
                        imageView.setImageResource(z15 ? R.drawable.mini_replace2 : R.drawable.msg_close);
                        z12 = false;
                    } else {
                        ImageView imageView2 = q2Var4.f;
                        imageView2.setScaleX(0.8f);
                        imageView2.setScaleY(0.8f);
                        z12 = false;
                        q2Var4.n = false;
                        imageView2.setImageResource(R.drawable.msg_close);
                    }
                    z14 = z12;
                }
            }
        }
    }

    public TL_stars.StarGift getFirstGift() {
        int i10 = 0;
        while (true) {
            q2[] q2VarArr = this.n;
            if (i10 >= q2VarArr.length) {
                return null;
            }
            q2 q2Var = q2VarArr[i10];
            if (q2Var != null) {
                TL_stars.StarGift starGift = q2Var.h;
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
            q2[] q2VarArr = this.n;
            if (i10 >= q2VarArr.length) {
                return i11;
            }
            q2 q2Var = q2VarArr[i10];
            if (q2Var != null) {
                TL_stars.StarGift starGift = q2Var.h;
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
            q2[] q2VarArr = this.n;
            if (i10 >= q2VarArr.length) {
                return i11;
            }
            q2 q2Var = q2VarArr[i10];
            if (q2Var != null) {
                TL_stars.StarGift starGift = q2Var.h;
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
