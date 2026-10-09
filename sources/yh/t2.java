package yh;

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
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.y9;
import org.telegram.ui.eh;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class t2 extends FrameLayout {
    public final org.telegram.ui.Components.a6 E;
    public final j2 F;
    public final LinearLayout G;
    public final org.telegram.ui.Components.r6 H;
    public final org.telegram.ui.Components.r6 I;
    public final fk0 J;
    public final TextView K;
    public final TextView L;
    public final TextView M;
    public final LinearLayout N;
    public xh.j1[] O;
    public final FrameLayout P;
    public final FrameLayout Q;
    public final FrameLayout R;
    public final FrameLayout S;
    public ci.d4 T;
    public final int[] U;
    public final int[] V;
    public int W;
    public final org.telegram.ui.ActionBar.e6 a;
    public long a0;
    public final s2 b;
    public TLRPC.Document b0;
    public final ImageView c;
    public String c0;
    public final n2[] d;
    public ArrayList d0;
    public final n2 e;
    public Utilities.Callback3 e0;
    public final p2 f;
    public Utilities.Callback2 f0;
    public Runnable g0;
    public final m2 h;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public Runnable k0;
    public fk0 l0;
    public SpannableStringBuilder m0;
    public final r2[] n;
    public final vh.n r;
    public boolean s;
    public final LinearLayout v;
    public final LinearLayout w;
    public final i2[] x;
    public final i2[] y;

    public t2(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        int i10 = 6;
        this.U = new int[]{-14861233, -15787732, -11327734, -14742773, -14527649, -15920861};
        this.V = new int[]{org.telegram.ui.ActionBar.i6.m1(0.08f, -1), org.telegram.ui.ActionBar.i6.m1(0.08f, -1), -294362, -3914963, -13519030, -12613223};
        this.a = e6Var;
        s2 s2Var = new s2();
        this.b = s2Var;
        Drawable mutate = context.getResources().getDrawable(R.drawable.filled_forge).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_IN));
        s2Var.g = mutate;
        setBackground(s2Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.P = frameLayout;
        addView(frameLayout, w7.x5.e(-1, 60, 55));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setImageResource(R.drawable.outline_question_mark);
        imageView.setBackground(new g3(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.i6.m1(0.08f, -1)));
        frameLayout.addView(imageView, w7.x5.a(32.0f, 14.0f, 14.0f, 14.0f, 14.0f, 32, 51));
        imageView.setOnClickListener(new h2(this, 0));
        w7.z5.a(imageView);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.msg_close);
        imageView2.setBackground(new g3(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.i6.m1(0.08f, -1)));
        frameLayout.addView(imageView2, w7.x5.a(32.0f, 14.0f, 14.0f, 14.0f, 14.0f, 32, 53));
        int i11 = 1;
        imageView2.setOnClickListener(new h2(this, i11));
        w7.z5.a(imageView2);
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setTextSize(1, 20.0f);
        textView.setTextColor(-1);
        textView.setText(LocaleController.getString(R.string.GiftCraftTitle));
        addView(textView, w7.x5.a(-2.0f, 0.0f, 20.0f, 0.0f, 0.0f, -1, 49));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.Q = frameLayout2;
        addView(frameLayout2, w7.x5.e(-1, -1, 119));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.R = frameLayout3;
        frameLayout3.setAlpha(0.0f);
        addView(frameLayout3, w7.x5.e(-1, -1, 119));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.S = frameLayout4;
        frameLayout4.setAlpha(0.0f);
        addView(frameLayout4, w7.x5.e(-1, -1, 119));
        vh.n nVar = new vh.n(context);
        this.r = nVar;
        nVar.setGravity(17);
        nVar.setTextSize(1, 13.0f);
        nVar.setTextColor(-1);
        frameLayout2.addView(nVar, w7.x5.a(-2.0f, 32.0f, 244.0f, 32.0f, 84.0f, -1, 49));
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
        hs hsVar = hs.h;
        layoutTransition.setInterpolator(2, hsVar);
        layoutTransition.setInterpolator(3, hsVar);
        layoutTransition.setInterpolator(0, hsVar);
        layoutTransition.setInterpolator(1, hsVar);
        layoutTransition.setInterpolator(4, hsVar);
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
        layoutTransition2.setInterpolator(2, hsVar);
        layoutTransition2.setInterpolator(3, hsVar);
        layoutTransition2.setInterpolator(0, hsVar);
        layoutTransition2.setInterpolator(1, hsVar);
        layoutTransition2.setInterpolator(4, hsVar);
        linearLayout2.setLayoutTransition(layoutTransition2);
        linearLayout2.setOrientation(0);
        linearLayout2.setAlpha(0.0f);
        linearLayout2.setGravity(17);
        this.x = new i2[4];
        this.y = new i2[4];
        for (int i14 = 0; i14 < 4; i14++) {
            LinearLayout linearLayout3 = this.v;
            i2[] i2VarArr = this.x;
            i2 i2Var = new i2(context);
            i2VarArr[i14] = i2Var;
            linearLayout3.addView(i2Var, w7.x5.k(0.0f, 0.0f, 0.0f, 0.0f, 48, 54));
            this.x[i14].setOnClickListener(new h2(this, i12));
        }
        for (int i15 = 0; i15 < 4; i15++) {
            LinearLayout linearLayout4 = this.v;
            i2[] i2VarArr2 = this.y;
            i2 i2Var2 = new i2(context);
            i2VarArr2[i15] = i2Var2;
            linearLayout4.addView(i2Var2, w7.x5.k(0.0f, 0.0f, 0.0f, 0.0f, 48, 54));
            this.y[i15].setOnClickListener(new h2(this, i13));
        }
        this.n = new r2[4];
        this.d = new n2[6];
        int i16 = 0;
        while (i16 < i10) {
            n2[] n2VarArr = this.d;
            int i17 = i16 == 5 ? i11 : 0;
            n2 n2Var = new n2(context);
            FrameLayout frameLayout5 = new FrameLayout(context);
            frameLayout5.setBackground(new g3(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.i6.m1(0.08f, -1)));
            n2Var.addView(frameLayout5, w7.x5.a(-1.0f, 2.0f, 2.0f, 2.0f, 2.0f, -1, 119));
            y9 y9Var = new y9(context);
            y9Var.setImageResource(R.drawable.large_forge);
            y9Var.setAlpha(i17 != 0 ? 1.0f : 0.45f);
            frameLayout5.addView(y9Var, w7.x5.e(i17 != 0 ? 42 : 64, i17 != 0 ? 42 : 64, 17));
            if (i17 != 0) {
                y9Var.setTranslationX(AndroidUtilities.dp(-4.0f));
                o2 o2Var = new o2(context);
                n2Var.b = o2Var;
                o2Var.e = AndroidUtilities.dp(37.0f);
                o2Var.a.setStrokeWidth(AndroidUtilities.dpf2(4.66f));
                frameLayout5.addView(o2Var, w7.x5.e(90, 90, 17));
                org.telegram.ui.Components.r6 r6Var = new org.telegram.ui.Components.r6(context, false, false, false);
                n2Var.a = r6Var;
                r6Var.getDrawable().r(false, true);
                r6Var.setTypeface(AndroidUtilities.bold());
                r6Var.setTextColor(-1);
                r6Var.setTextSize(AndroidUtilities.dp(14.0f));
                r6Var.setGravity(17);
                r6Var.setText("0%");
                frameLayout5.addView(r6Var, w7.x5.a(16.0f, 12.0f, 80.0f, 12.0f, 0.0f, -1, 55));
            }
            n2VarArr[i16] = n2Var;
            i16++;
            i10 = 6;
            i11 = 1;
        }
        this.e = this.d[5];
        p2 p2Var = new p2(context);
        this.f = p2Var;
        p2Var.setVisibility(8);
        p2Var.setAlpha(0.0f);
        addView(p2Var, w7.x5.a(300.0f, 0.0f, 0.0f, 0.0f, 0.0f, 300, 49));
        m2 m2Var = new m2(context, this.d);
        this.h = m2Var;
        addView(m2Var, w7.x5.a(300.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 55));
        org.telegram.ui.Components.a6 a6Var = new org.telegram.ui.Components.a6(context);
        this.E = a6Var;
        a6Var.setTextSize(1, 12.0f);
        a6Var.setTypeface(AndroidUtilities.bold());
        a6Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.GiftCraftViewAllVariants), false, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f)));
        a6Var.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
        a6Var.setGravity(17);
        a6Var.setTextColor(-1);
        a6Var.setAlpha(this.d0 != null ? 1.0f : 0.25f);
        a6Var.setBackground(new g3(AndroidUtilities.dp(14.0f), org.telegram.ui.ActionBar.i6.m1(0.08f, -1)));
        w7.z5.b(a6Var, 0.02f, 1.2f);
        this.Q.addView(a6Var, w7.x5.a(27.0f, 32.0f, 412.0f, 32.0f, 84.0f, -2, 49));
        a6Var.setOnClickListener(new xh.a(12, this, e6Var));
        this.Q.addView(this.v, w7.x5.a(54.0f, 32.0f, 340.0f, 32.0f, 84.0f, -2, 49));
        this.Q.addView(this.w, w7.x5.a(54.0f, 32.0f, 394.0f, 32.0f, 84.0f, -2, 49));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.G = linearLayout5;
        linearLayout5.setOrientation(1);
        j2 j2Var = new j2();
        this.F = j2Var;
        linearLayout5.setBackground(j2Var);
        j2Var.a(org.telegram.ui.ActionBar.i6.m1(0.08f, -1), org.telegram.ui.ActionBar.i6.m1(0.08f, -1));
        w7.z5.b(linearLayout5, 0.02f, 1.2f);
        addView(linearLayout5, w7.x5.a(-2.0f, 20.0f, 0.0f, 20.0f, 18.0f, -1, 87));
        linearLayout5.setOnClickListener(new h2(this, 4));
        org.telegram.ui.Components.r6 r6Var2 = new org.telegram.ui.Components.r6(context, false, false, false);
        this.H = r6Var2;
        r6Var2.setTypeface(AndroidUtilities.bold());
        r6Var2.setGravity(17);
        r6Var2.setTextColor(org.telegram.ui.ActionBar.i6.m1(0.75f, -1));
        r6Var2.setText(LocaleController.getString(R.string.GiftCraftButton));
        r6Var2.setTextSize(AndroidUtilities.dp(14.0f));
        linearLayout5.addView(r6Var2, w7.x5.r(-1, 18, 55, 16.0f, 7.33f, 16.0f, 0.0f));
        org.telegram.ui.Components.r6 r6Var3 = new org.telegram.ui.Components.r6(context, false, false, false);
        this.I = r6Var3;
        r6Var3.getDrawable().r(true, false);
        r6Var3.setGravity(17);
        r6Var3.setTextColor(org.telegram.ui.ActionBar.i6.m1(0.75f, -1));
        r6Var3.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCraftSuccessChance, "0%")));
        r6Var3.setTextSize(AndroidUtilities.dp(12.0f));
        linearLayout5.addView(r6Var3, w7.x5.r(-1, 14, 55, 16.0f, 2.66f, 16.0f, 7.66f));
        LinearLayout linearLayout6 = new LinearLayout(context);
        linearLayout6.setOrientation(0);
        linearLayout6.setGravity(17);
        fk0 fk0Var = new fk0(context);
        this.J = fk0Var;
        fk0Var.setAutoRepeat(true);
        fk0Var.f(R.raw.gift_crafting, 30, 30, null);
        linearLayout6.addView(fk0Var, w7.x5.t(30, 30, 17, 0, 0, 4, 0));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 20.0f);
        textView2.setTextColor(-1);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.GiftCraftProgressTitle));
        linearLayout6.addView(textView2, w7.x5.t(-2, -2, 17, 0, 0, 0, 0));
        this.R.addView(linearLayout6, w7.x5.a(-2.0f, 0.0f, 350.0f, 0.0f, 0.0f, -1, 49));
        TextView textView3 = new TextView(context);
        this.K = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setTextColor(org.telegram.ui.ActionBar.i6.m1(0.5f, -1));
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setGravity(17);
        TextView g10 = org.telegram.ui.Cells.c1.g(this.R, textView3, w7.x5.a(-2.0f, 0.0f, 383.0f, 0.0f, 0.0f, -1, 49), context);
        this.L = g10;
        g10.setTextSize(1, 13.0f);
        g10.setTextColor(-1);
        g10.setTypeface(AndroidUtilities.bold());
        g10.setGravity(17);
        g10.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
        g10.setBackground(new g3(AndroidUtilities.dp(14.0f), org.telegram.ui.ActionBar.i6.m1(0.08f, -1)));
        TextView g11 = org.telegram.ui.Cells.c1.g(this.R, g10, w7.x5.a(27.0f, 0.0f, 0.0f, 0.0f, 74.0f, -2, 81), context);
        g11.setTextSize(1, 13.0f);
        g11.setTextColor(org.telegram.ui.ActionBar.i6.m1(0.5f, -1));
        g11.setGravity(17);
        g11.setText(LocaleController.getString(R.string.GiftCraftProgressText));
        TextView g12 = org.telegram.ui.Cells.c1.g(this.R, g11, w7.x5.a(-2.0f, 42.0f, 0.0f, 42.0f, 24.0f, -1, 81), context);
        g12.setText(LocaleController.getString(R.string.GiftCraftFailedTitle));
        g12.setTextColor(-505270);
        g12.setTextSize(1, 20.0f);
        g12.setTypeface(AndroidUtilities.bold());
        g12.setGravity(17);
        TextView g13 = org.telegram.ui.Cells.c1.g(this.S, g12, w7.x5.a(-2.0f, 32.0f, 352.0f, 32.0f, 0.0f, -1, 55), context);
        this.M = g13;
        g13.setTextColor(-17253);
        g13.setTextSize(1, 13.0f);
        g13.setGravity(17);
        this.S.addView(g13, w7.x5.a(-2.0f, 32.0f, 383.0f, 32.0f, 0.0f, -1, 55));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.N = linearLayout7;
        linearLayout7.setOrientation(0);
        this.S.addView(linearLayout7, w7.x5.a(-2.0f, 0.0f, 250.0f, 0.0f, 0.0f, -2, 49));
        this.O = null;
        d(true);
    }

    public final void a(int i10, long j3, TLRPC.Document document, String str) {
        r2[] r2VarArr;
        this.W = i10;
        this.a0 = j3;
        this.b0 = document;
        this.c0 = str;
        this.h0 = false;
        this.j0 = false;
        int i11 = 0;
        while (true) {
            r2VarArr = this.n;
            if (i11 >= r2VarArr.length) {
                break;
            }
            r2 r2Var = r2VarArr[i11];
            if (r2Var != null) {
                AndroidUtilities.removeFromParent(r2Var);
            }
            i11++;
        }
        m2 m2Var = this.h;
        View[] viewArr = m2Var.a;
        l2 l2Var = m2Var.H;
        if (l2Var != null) {
            l2Var.e = true;
            l2Var.l = false;
            l2Var.a.H = null;
            m2Var.H = null;
        }
        ValueAnimator valueAnimator = m2Var.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            m2Var.G = null;
        }
        m2Var.F = -1;
        m2Var.E = 0.0f;
        m2Var.v.clear();
        m2Var.w.clear();
        m2Var.x.clear();
        for (int i12 = 0; i12 < 6; i12++) {
            m2Var.y[i12] = 0.0f;
        }
        m2Var.removeAllViews();
        for (int i13 = 0; i13 < viewArr.length; i13++) {
            viewArr[i13].setAlpha(1.0f);
            viewArr[i13].setVisibility(0);
            m2Var.addView(viewArr[i13], w7.x5.e(108, 108, 17));
        }
        Matrix.setIdentityM(m2Var.c, 0);
        m2Var.e = 0.0f;
        m2Var.d = 0.0f;
        m2Var.f = true;
        r2 r2Var2 = new r2(getContext());
        r2VarArr[0] = r2Var2;
        addView(r2Var2, w7.x5.a(76.0f, -117.0f, 74.0f, 0.0f, 0.0f, 76, 49));
        r2 r2Var3 = new r2(getContext());
        r2VarArr[1] = r2Var3;
        addView(r2Var3, w7.x5.a(76.0f, -117.0f, 149.0f, 0.0f, 0.0f, 76, 49));
        r2 r2Var4 = new r2(getContext());
        r2VarArr[2] = r2Var4;
        addView(r2Var4, w7.x5.a(76.0f, 117.0f, 74.0f, 0.0f, 0.0f, 76, 49));
        r2 r2Var5 = new r2(getContext());
        r2VarArr[3] = r2Var5;
        addView(r2Var5, w7.x5.a(76.0f, 117.0f, 149.0f, 0.0f, 0.0f, 76, 49));
        for (int i14 = 0; i14 < r2VarArr.length; i14++) {
            w7.z5.a(r2VarArr[i14]);
            r2VarArr[i14].setClickable(true);
            r2VarArr[i14].setOnClickListener(new h2(this, 5));
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
        p2 p2Var = this.f;
        p2Var.setVisibility(8);
        p2Var.setAlpha(0.0f);
        String string = LocaleController.getString(R.string.GiftCraftButton);
        org.telegram.ui.Components.r6 r6Var = this.H;
        r6Var.setText(string);
        r6Var.setTranslationY(0.0f);
        this.I.setAlpha(1.0f);
        GiftAuctionController.getInstance(i10).requestAuctionUpgrades(j3, new eh(this, j3, j3, 2));
    }

    public final void b(i2 i2Var) {
        if (i2Var.d != null) {
            c(i2Var, AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCraftBackdropChance", Math.round(i2Var.f * 100.0f), i2Var.d.name)));
        } else if (i2Var.e != null) {
            c(i2Var, AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCraftSymbolChance", Math.round(i2Var.f * 100.0f), i2Var.e.name)));
        }
    }

    public final void c(i2 i2Var, SpannableStringBuilder spannableStringBuilder) {
        ci.d4 d4Var = this.T;
        if (d4Var != null) {
            d4Var.e(true);
            this.T = null;
        }
        if (this.h0 || this.j0) {
            return;
        }
        View view = i2Var.getParent() instanceof View ? (View) i2Var.getParent() : null;
        float x10 = i2Var.getX() + (view != null ? view.getX() : 0.0f);
        float y3 = i2Var.getY() + (view != null ? view.getY() : 0.0f);
        ci.d4 d4Var2 = new ci.d4(getContext(), 3);
        this.T = d4Var2;
        d4Var2.p(true);
        this.T.s(spannableStringBuilder);
        ci.d4 d4Var3 = this.T;
        d4Var3.h = ci.d4.a(d4Var3.getText(), this.T.getTextPaint());
        ci.d4 d4Var4 = this.T;
        d4Var4.K = Layout.Alignment.ALIGN_CENTER;
        d4Var4.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        addView(this.T, w7.x5.a(100.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 55));
        this.T.setTranslationY(y3 - AndroidUtilities.dp(100.0f));
        this.T.m(0.0f, ((i2Var.getWidth() / 2.0f) + x10) - AndroidUtilities.dp(2.0f));
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
        r2[] r2VarArr;
        HashMap hashMap;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop;
        int i11;
        HashMap hashMap2;
        boolean z11;
        i2[] i2VarArr;
        TL_stars.starGiftAttributePattern stargiftattributepattern;
        LinearLayout linearLayout;
        boolean z12;
        TL_stars.StarGift starGift;
        int giftsSelectedCount = getGiftsSelectedCount();
        float giftsSuccessChance = getGiftsSuccessChance() / 10.0f;
        n2 n2Var = this.e;
        org.telegram.ui.Components.r6 r6Var = n2Var.a;
        if (r6Var != null) {
            r6Var.c(Math.round(giftsSuccessChance) + "%", z10, true);
            o2 o2Var = n2Var.b;
            float f7 = giftsSuccessChance / 100.0f;
            o2Var.d = f7;
            if (!z10) {
                o2Var.b.d(f7, true);
            }
            o2Var.invalidate();
        }
        org.telegram.ui.Components.r6 r6Var2 = this.I;
        int i12 = 0;
        if (giftsSelectedCount <= 0) {
            if (this.m0 == null) {
                this.m0 = new SpannableStringBuilder("+");
                er erVar = new er(R.drawable.filled_add_album, 0);
                erVar.setScale(0.65f, 0.65f);
                SpannableStringBuilder spannableStringBuilder = this.m0;
                spannableStringBuilder.setSpan(erVar, 0, spannableStringBuilder.length(), 33);
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.GiftCraftButtonEmpty));
            AndroidUtilities.replaceMultipleCharSequence("+", spannableStringBuilder2, this.m0);
            r6Var2.setText(spannableStringBuilder2);
        } else {
            r6Var2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCraftSuccessChance, ei.l.H0(getGiftsSuccessChance()))));
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
            vh.n nVar = this.r;
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
            r2VarArr = this.n;
            if (i15 >= r2VarArr.length) {
                break;
            }
            r2 r2Var = r2VarArr[i15];
            if (r2Var != null) {
                TL_stars.StarGift starGift2 = r2Var.h;
                if ((starGift2 != null ? starGift2 : null) != null) {
                    i16++;
                    TL_stars.StarGift starGift3 = starGift2 != null ? starGift2 : null;
                    TL_stars.starGiftAttributePattern stargiftattributepattern2 = (TL_stars.starGiftAttributePattern) m5.l(starGift3.attributes, TL_stars.starGiftAttributePattern.class);
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = (TL_stars.starGiftAttributeBackdrop) m5.l(starGift3.attributes, TL_stars.starGiftAttributeBackdrop.class);
                    hashMap3.put(Integer.valueOf(stargiftattributebackdrop2.backdrop_id), Integer.valueOf(((Integer) Map.-EL.getOrDefault(hashMap3, Integer.valueOf(stargiftattributebackdrop2.backdrop_id), 0)).intValue() + 1));
                    hashMap4.put(Long.valueOf(stargiftattributepattern2.document.id), Integer.valueOf(((Integer) Map.-EL.getOrDefault(hashMap4, Long.valueOf(stargiftattributepattern2.document.id), 0)).intValue() + 1));
                }
            }
            i15++;
        }
        boolean isEmpty = hashMap3.isEmpty();
        i2[] i2VarArr2 = this.x;
        if (isEmpty) {
            i2 i2Var = i2VarArr2[0];
            i2Var.a(null);
            i2Var.c(0.0f, true);
            arrayList.add(i2Var);
            int i17 = 1;
            for (int i18 = i10; i17 < i18; i18 = 4) {
                i2VarArr2[i17].setVisibility(8);
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
                    if (i21 >= r2VarArr.length) {
                        stargiftattributebackdrop = null;
                        break;
                    }
                    r2 r2Var2 = r2VarArr[i21];
                    if (r2Var2 != null) {
                        TL_stars.StarGift starGift4 = r2Var2.h;
                        if ((starGift4 != null ? starGift4 : null) != null) {
                            if (starGift4 == null) {
                                starGift4 = null;
                            }
                            stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) m5.l(starGift4.attributes, TL_stars.starGiftAttributeBackdrop.class);
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
                    i2 i2Var2 = i2VarArr2[i20];
                    i2Var2.a(stargiftattributebackdrop);
                    i11 = size;
                    int[] iArr4 = iArr3[Utilities.clamp(i16 - 1, iArr3.length - 1, 0)];
                    int i22 = intValue2 - 1;
                    hashMap2 = hashMap4;
                    i2Var2.c(iArr4[Utilities.clamp(i22, iArr4.length - 1, 0)] / 1000.0f, true);
                    arrayList.add(i2Var2);
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
                i2VarArr2[i23].setVisibility(8);
            }
        }
        boolean isEmpty2 = hashMap.isEmpty();
        i2[] i2VarArr3 = this.y;
        if (isEmpty2) {
            i2 i2Var3 = i2VarArr3[0];
            i2Var3.b(null);
            i2Var3.c(0.0f, true);
            arrayList.add(i2Var3);
            for (int i24 = 1; i24 < 4; i24++) {
                i2VarArr3[i24].setVisibility(8);
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
                    if (i27 >= r2VarArr.length) {
                        i2VarArr = i2VarArr3;
                        stargiftattributepattern = null;
                        break;
                    }
                    r2 r2Var3 = r2VarArr[i27];
                    if (r2Var3 != null) {
                        TL_stars.StarGift starGift5 = r2Var3.h;
                        if ((starGift5 != null ? starGift5 : null) != null) {
                            if (starGift5 == null) {
                                starGift5 = null;
                            }
                            TL_stars.starGiftAttributePattern stargiftattributepattern3 = (TL_stars.starGiftAttributePattern) m5.l(starGift5.attributes, TL_stars.starGiftAttributePattern.class);
                            if (stargiftattributepattern3 != null) {
                                i2VarArr = i2VarArr3;
                                if (stargiftattributepattern3.document.id == longValue) {
                                    stargiftattributepattern = stargiftattributepattern3;
                                    break;
                                } else {
                                    i27++;
                                    i2VarArr3 = i2VarArr;
                                }
                            }
                        }
                    }
                    i2VarArr = i2VarArr3;
                    i27++;
                    i2VarArr3 = i2VarArr;
                }
                if (stargiftattributepattern != null) {
                    int i28 = i25 + 1;
                    i2 i2Var4 = i2VarArr[i25];
                    i2Var4.b(stargiftattributepattern);
                    int[] iArr5 = iArr3[Utilities.clamp(i16 - 1, iArr3.length - 1, 0)];
                    i2Var4.c(iArr5[Utilities.clamp(intValue3 - 1, iArr5.length - 1, 0)] / 1000.0f, true);
                    arrayList.add(i2Var4);
                    i25 = i28;
                }
                i2VarArr3 = i2VarArr;
            }
            i2[] i2VarArr4 = i2VarArr3;
            z11 = true;
            while (i25 < 4) {
                i2VarArr4[i25].setVisibility(8);
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
            i2 i2Var5 = (i2) arrayList.get(i29);
            if (!this.s || i29 < arrayList.size() / 2.0f) {
                linearLayout = this.v;
            }
            if (i2Var5.getParent() != linearLayout) {
                ViewParent parent = i2Var5.getParent();
                if (parent instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) parent;
                    LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
                    boolean z13 = layoutTransition != null ? z11 : false;
                    if (z13) {
                        layoutTransition.disableTransitionType(3);
                    }
                    viewGroup.removeView(i2Var5);
                    if (z13) {
                        layoutTransition.enableTransitionType(3);
                    }
                    i2Var5.animate().cancel();
                    i2Var5.clearAnimation();
                    i2Var5.setTranslationX(0.0f);
                    i2Var5.setTranslationY(0.0f);
                    i2Var5.setTranslationZ(0.0f);
                    i2Var5.setAlpha(0.0f);
                    i2Var5.setScaleX(1.0f);
                    i2Var5.setScaleY(1.0f);
                    i2Var5.setRotation(0.0f);
                    i2Var5.setRotationX(0.0f);
                    i2Var5.setRotationY(0.0f);
                }
                linearLayout.addView(i2Var5, w7.x5.k(0.0f, 0.0f, 0.0f, 0.0f, 48, 54));
            }
            i2Var5.setVisibility(0);
            i29++;
        }
        linearLayout.animate().alpha(this.s ? 1.0f : 0.0f);
        this.E.animate().alpha(this.s ? 0.0f : this.d0 != null ? 1.0f : 0.25f);
        boolean z14 = z11;
        for (int i30 = 0; i30 < r2VarArr.length; i30++) {
            r2 r2Var4 = r2VarArr[i30];
            if (r2Var4 != null) {
                TL_stars.StarGift starGift6 = r2Var4.h;
                if (starGift6 == null) {
                    starGift6 = null;
                }
                if (starGift6 != null) {
                    if (z14) {
                        int i31 = i30 + 1;
                        while (true) {
                            if (i31 >= r2VarArr.length) {
                                break;
                            }
                            r2 r2Var5 = r2VarArr[i31];
                            if (r2Var5 != null) {
                                starGift = r2Var5.h;
                                if ((starGift != null ? starGift : null) != null) {
                                }
                            }
                            i31++;
                        }
                        starGift = null;
                        r2 r2Var6 = r2VarArr[i30];
                        boolean z15 = (starGift == null || TextUtils.isEmpty(starGift.gift_address)) ? false : z11;
                        ImageView imageView = r2Var6.f;
                        imageView.setScaleX(0.8f);
                        imageView.setScaleY(0.8f);
                        r2Var6.n = z15;
                        imageView.setImageResource(z15 ? R.drawable.mini_replace2 : R.drawable.msg_close);
                        z12 = false;
                    } else {
                        ImageView imageView2 = r2Var4.f;
                        imageView2.setScaleX(0.8f);
                        imageView2.setScaleY(0.8f);
                        z12 = false;
                        r2Var4.n = false;
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
            r2[] r2VarArr = this.n;
            if (i10 >= r2VarArr.length) {
                return null;
            }
            r2 r2Var = r2VarArr[i10];
            if (r2Var != null) {
                TL_stars.StarGift starGift = r2Var.h;
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
            r2[] r2VarArr = this.n;
            if (i10 >= r2VarArr.length) {
                return i11;
            }
            r2 r2Var = r2VarArr[i10];
            if (r2Var != null) {
                TL_stars.StarGift starGift = r2Var.h;
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
            r2[] r2VarArr = this.n;
            if (i10 >= r2VarArr.length) {
                return i11;
            }
            r2 r2Var = r2VarArr[i10];
            if (r2Var != null) {
                TL_stars.StarGift starGift = r2Var.h;
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
