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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public abstract class xo4 {
    public static void a(Activity activity, int i, String str, TLObject tLObject, TL_fragment.TL_collectibleInfo tL_collectibleInfo, wjb wjbVar) {
        int i2;
        int i3;
        String e;
        String str2;
        String str3;
        fx0 fx0Var = new fx0(1, wjbVar, (Context) activity, false);
        fx0Var.M(bkb.g5);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(gl.L(16.0f), 0, gl.L(16.0f), 0);
        FrameLayout frameLayout = new FrameLayout(activity);
        int L = gl.L(80.0f);
        int i4 = bkb.Ei;
        ShapeDrawable K = bkb.K(L, bkb.v0(i4, wjbVar));
        vkb M = zkb.M(i4);
        frameLayout.setBackground(K);
        zkb.j(frameLayout, K, M, null, wjbVar);
        linearLayout.addView(frameLayout, nme.t(80, 80, 1, 0, 16, 0, 16));
        ry8 ry8Var = new ry8(activity);
        ry8Var.setScaleType(ImageView.ScaleType.CENTER);
        if (i == 0) {
            i2 = 70;
            i3 = R.raw.fragment_username;
        } else {
            i2 = 78;
            i3 = R.raw.fragment;
        }
        ry8Var.f(i3, i2, i2, null);
        ry8Var.d();
        ry8Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        if (i == 0) {
            ry8Var.setScaleX(0.86f);
            ry8Var.setScaleY(0.86f);
        } else {
            ry8Var.setTranslationY(gl.L(2.0f));
        }
        frameLayout.addView(ry8Var, nme.r(-1, -1, 17));
        String r = tLObject instanceof TLRPC.User ? l7c.r((TLRPC.User) tLObject) : tLObject instanceof TLRPC.Chat ? ((TLRPC.Chat) tLObject).title : "";
        String e2 = ci0.h().e(tL_collectibleInfo.amount, tL_collectibleInfo.currency);
        String str4 = r;
        String e3 = ci0.h().e(tL_collectibleInfo.crypto_amount, tL_collectibleInfo.crypto_currency);
        if (i == 0) {
            String a0 = k96.a0(null, null, 2131750496, b00.h("@", str));
            str2 = k96.a0(null, null, 2131750498, k96.Q(tL_collectibleInfo.purchase_date), e3, TextUtils.isEmpty(e2) ? "" : tb4.y("(", e2, ")"));
            e = ls6.o(na7.q1(y6c.t0).N2, "/", str, new StringBuilder());
            str3 = a0;
        } else {
            if (i != 1) {
                return;
            }
            String a02 = k96.a0(null, null, 2131750500, p38.f().e("+" + str));
            String a03 = k96.a0(null, null, 2131750501, k96.Q(tL_collectibleInfo.purchase_date), e3, TextUtils.isEmpty(e2) ? "" : tb4.y("(", e2, ")"));
            e = p38.f().e("+" + str);
            str2 = a03;
            str3 = a02;
        }
        rg rgVar = e != null ? new rg(e, i, fx0Var, wjbVar) : null;
        SpannableStringBuilder N2 = gl.N2(str3, -1, 0, rgVar, null);
        SpannableString spannableString = new SpannableString("TON");
        cm2 cm2Var = new cm2(R.drawable.mini_gram_16, 0);
        cm2Var.d = false;
        cm2Var.F = gl.L(13.0f);
        spannableString.setSpan(cm2Var, 0, spannableString.length(), 33);
        SpannableStringBuilder G2 = gl.G2(gl.S2(str2), spannableString, "TON");
        l46 l46Var = new l46(activity, null);
        l46Var.setTypeface(gl.o());
        l46Var.setGravity(17);
        int i5 = bkb.i5;
        zkb.X(l46Var, i5, wjbVar);
        zkb.G(l46Var, bkb.n6, wjbVar);
        l46Var.setTextSize(1, 16.0f);
        l46Var.setText(N2);
        linearLayout.addView(l46Var, nme.t(-1, -2, 1, 42, 0, 42, 0));
        FrameLayout frameLayout2 = new FrameLayout(activity);
        int L2 = gl.L(28.0f);
        int L3 = gl.L(28.0f);
        int i6 = bkb.Si;
        ShapeDrawable c0 = bkb.c0(L2, L3, bkb.v0(i6, wjbVar));
        vkb M2 = zkb.M(i6);
        frameLayout2.setBackground(c0);
        zkb.j(frameLayout2, c0, M2, null, wjbVar);
        be0 be0Var = new be0(activity);
        be0Var.setRoundRadius(gl.L(28.0f));
        pb0 pb0Var = new pb0((wjb) null);
        pb0Var.k(tLObject);
        be0Var.f(tLObject, pb0Var);
        frameLayout2.addView(be0Var, nme.e(28, 28, 51));
        TextView textView = new TextView(activity);
        zkb.X(textView, i5, wjbVar);
        textView.setTextSize(1, 13.0f);
        textView.setSingleLine();
        textView.setText(vu3.m(str4, textView.getPaint().getFontMetricsInt(), false, null, 0));
        frameLayout2.addView(textView, nme.d(-2, -2.0f, 19, 37.0f, 0.0f, 10.0f, 0.0f));
        linearLayout.addView(frameLayout2, nme.t(-2, 28, 1, 42, 10, 42, 18));
        TextView textView2 = new TextView(activity);
        textView2.setGravity(17);
        zkb.X(textView2, i5, wjbVar);
        textView2.setTextSize(1, 14.0f);
        textView2.setText(G2);
        linearLayout.addView(textView2, nme.t(-1, -2, 1, 32, 0, 32, 19));
        u41 u41Var = new u41(wjbVar, activity, true);
        u41Var.setRoundRadius(24);
        u41Var.i(k96.M0(2131750497, null), false, true);
        u41Var.setOnClickListener(new xf3((Object) activity, (Object) tL_collectibleInfo, (byte) 12));
        linearLayout.addView(u41Var, nme.k(6.0f, 0.0f, 6.0f, 0.0f, -1, 48));
        if (rgVar != null) {
            u41 u41Var2 = new u41(wjbVar, activity, true);
            u41Var2.setRoundRadius(24);
            u41Var2.e();
            u41Var2.i(k96.M0(i == 0 ? 2131750499 : 2131750502, null), false, true);
            u41Var2.setOnClickListener(new xf3((Object) rgVar, (Object) fx0Var, (byte) 13));
            linearLayout.addView(u41Var2, nme.k(6.0f, 6.0f, 6.0f, 0.0f, -1, 48));
        }
        fx0Var.O = linearLayout;
        fx0Var.show();
    }
}
