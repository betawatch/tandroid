// default package

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_fragment;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class yq4 {
    public static void a(Activity activity, int i, String str, TLObject tLObject, TL_fragment.TL_collectibleInfo tL_collectibleInfo, ylb ylbVar) {
        int i2;
        int i3;
        String e;
        String str2;
        String str3;
        my0 my0Var = new my0(1, ylbVar, (Context) activity, false);
        my0Var.L(cmb.g5);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(gm.L(16.0f), 0, gm.L(16.0f), 0);
        FrameLayout frameLayout = new FrameLayout(activity);
        int L = gm.L(80.0f);
        int i4 = cmb.Ei;
        ShapeDrawable K = cmb.K(L, cmb.v0(i4, ylbVar));
        wmb M = anb.M(i4);
        frameLayout.setBackground(K);
        anb.j(frameLayout, K, M, null, ylbVar);
        linearLayout.addView(frameLayout, qoe.t(80, 80, 1, 0, 16, 0, 16));
        s09 s09Var = new s09(activity);
        s09Var.setScaleType(ImageView.ScaleType.CENTER);
        if (i == 0) {
            i2 = 70;
            i3 = R.raw.fragment_username;
        } else {
            i2 = 78;
            i3 = R.raw.fragment;
        }
        s09Var.f(i3, i2, i2, null);
        s09Var.d();
        s09Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        if (i == 0) {
            s09Var.setScaleX(0.86f);
            s09Var.setScaleY(0.86f);
        } else {
            s09Var.setTranslationY(gm.L(2.0f));
        }
        frameLayout.addView(s09Var, qoe.r(-1, -1, 17));
        String r = tLObject instanceof TLRPC.User ? m9c.r((TLRPC.User) tLObject) : tLObject instanceof TLRPC.Chat ? ((TLRPC.Chat) tLObject).title : "";
        String e2 = cj0.h().e(tL_collectibleInfo.amount, tL_collectibleInfo.currency);
        String str4 = r;
        String e3 = cj0.h().e(tL_collectibleInfo.crypto_amount, tL_collectibleInfo.crypto_currency);
        if (i == 0) {
            String a0 = jb6.a0(null, null, 2131750445, b10.h("@", str));
            str2 = jb6.a0(null, null, 2131750447, jb6.Q(tL_collectibleInfo.purchase_date), e3, TextUtils.isEmpty(e2) ? "" : kt6.o("(", e2, ")"));
            e = kt6.p(oc7.r1(z8c.t0).N2, "/", str, new StringBuilder());
            str3 = a0;
        } else {
            if (i != 1) {
                return;
            }
            String a02 = jb6.a0(null, null, 2131750449, r58.f().e("+" + str));
            String a03 = jb6.a0(null, null, 2131750450, jb6.Q(tL_collectibleInfo.purchase_date), e3, TextUtils.isEmpty(e2) ? "" : kt6.o("(", e2, ")"));
            e = r58.f().e("+" + str);
            str2 = a03;
            str3 = a02;
        }
        rh rhVar = e != null ? new rh(e, i, my0Var, ylbVar) : null;
        SpannableStringBuilder N2 = gm.N2(str3, -1, 0, rhVar, null);
        SpannableString spannableString = new SpannableString("TON");
        pn2 pn2Var = new pn2(R.drawable.mini_gram_16, 0);
        pn2Var.d = false;
        pn2Var.F = gm.L(13.0f);
        spannableString.setSpan(pn2Var, 0, spannableString.length(), 33);
        SpannableStringBuilder G2 = gm.G2(gm.S2(str2), spannableString, "TON");
        l66 l66Var = new l66(activity, null);
        l66Var.setTypeface(gm.o());
        l66Var.setGravity(17);
        int i5 = cmb.i5;
        anb.X(l66Var, i5, ylbVar);
        anb.G(l66Var, cmb.n6, ylbVar);
        l66Var.setTextSize(1, 16.0f);
        l66Var.setText(N2);
        linearLayout.addView(l66Var, qoe.t(-1, -2, 1, 42, 0, 42, 0));
        FrameLayout frameLayout2 = new FrameLayout(activity);
        int L2 = gm.L(28.0f);
        int L3 = gm.L(28.0f);
        int i6 = cmb.Si;
        ShapeDrawable c0 = cmb.c0(L2, L3, cmb.v0(i6, ylbVar));
        wmb M2 = anb.M(i6);
        frameLayout2.setBackground(c0);
        anb.j(frameLayout2, c0, M2, null, ylbVar);
        bf0 bf0Var = new bf0(activity);
        bf0Var.setRoundRadius(gm.L(28.0f));
        pc0 pc0Var = new pc0((ylb) null);
        pc0Var.k(tLObject);
        bf0Var.f(tLObject, pc0Var);
        frameLayout2.addView(bf0Var, qoe.e(28, 28, 51));
        TextView textView = new TextView(activity);
        anb.X(textView, i5, ylbVar);
        textView.setTextSize(1, 13.0f);
        textView.setSingleLine();
        textView.setText(gw3.m(str4, textView.getPaint().getFontMetricsInt(), false, null, 0));
        frameLayout2.addView(textView, qoe.d(-2, -2.0f, 19, 37.0f, 0.0f, 10.0f, 0.0f));
        linearLayout.addView(frameLayout2, qoe.t(-2, 28, 1, 42, 10, 42, 18));
        TextView textView2 = new TextView(activity);
        textView2.setGravity(17);
        anb.X(textView2, i5, ylbVar);
        textView2.setTextSize(1, 14.0f);
        textView2.setText(G2);
        linearLayout.addView(textView2, qoe.t(-1, -2, 1, 32, 0, 32, 19));
        b61 b61Var = new b61(ylbVar, activity, true);
        b61Var.setRoundRadius(24);
        b61Var.i(jb6.M0(2131750446, null), false, true);
        b61Var.setOnClickListener(new tf3(activity, tL_collectibleInfo, (byte) 13));
        linearLayout.addView(b61Var, qoe.k(6.0f, 0.0f, 6.0f, 0.0f, -1, 48));
        if (rhVar != null) {
            b61 b61Var2 = new b61(ylbVar, activity, true);
            b61Var2.setRoundRadius(24);
            b61Var2.e();
            b61Var2.i(jb6.M0(i == 0 ? 2131750448 : 2131750451, null), false, true);
            b61Var2.setOnClickListener(new tf3(rhVar, my0Var, (byte) 14));
            linearLayout.addView(b61Var2, qoe.k(6.0f, 6.0f, 6.0f, 0.0f, -1, 48));
        }
        my0Var.O = linearLayout;
        my0Var.show();
    }
}
