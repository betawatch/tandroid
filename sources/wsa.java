// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableRow;
import android.widget.TextView;
import j$.util.Objects;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class wsa extends mz0 implements jm7 {
    public TL_stars.SavedStarGift A2;
    public bva B2;
    public k47 C2;
    public String D2;
    public TL_stars.TL_starGiftUnique E2;
    public boolean F2;
    public boolean G2;
    public boolean H2;
    public boolean I2;
    public boolean J2;
    public hsa K2;
    public boolean L2;
    public ira M2;
    public final int[] N2;
    public ny0 O2;
    public int P2;
    public String Q2;
    public xb9 R2;
    public final long S1;
    public pn2 S2;
    public final jp0 T1;
    public boolean T2;
    public final fra U1;
    public yqa U2;
    public final uj4 V1;
    public Float V2;
    public final View W1;
    public xra W2;
    public ix4 X1;
    public ValueAnimator X2;
    public ix4 Y1;
    public pn2 Y2;
    public final hra Z1;
    public boolean Z2;
    public final ssa a2;
    public TL_wallet.nftItem a3;
    public final gra b2;
    public pnc b3;
    public final l66 c2;
    public qnc c3;
    public final mhb d2;
    public TL_wallet.walletTransaction d3;
    public final l66 e2;
    public final LinearLayout e3;
    public final b61 f2;
    public final TextView f3;
    public final FrameLayout g2;
    public final TextView g3;
    public final l66 h2;
    public View h3;
    public final FrameLayout i2;
    public hs8 i3;
    public final View j2;
    public boolean j3;
    public final FrameLayout k2;
    public Boolean k3;
    public usa l2;
    public boolean l3;
    public boolean m2;
    public ArrayList m3;
    public final gra n2;
    public ArrayList n3;
    public final ac[] o2;
    public ArrayList o3;
    public final View p2;
    public boolean p3;
    public final LinearLayout q2;
    public TLRPC.PaymentForm q3;
    public final jh2 r2;
    public final pn2[] r3;
    public final TextView s2;
    public final npa s3;
    public final LinearLayout t2;
    public int t3;
    public final jh2 u2;
    public Boolean u3;
    public boolean v2;
    public boolean v3;
    public final gra w2;
    public hg5 w3;
    public final TextView x2;
    public View x3;
    public final gra y2;
    public boolean z2;

    public wsa(Context context, int i, long j, ylb ylbVar, View view) {
        super(context, null, false, false, ylbVar);
        this.m2 = false;
        this.N2 = new int[2];
        this.P2 = -1;
        this.Q2 = "";
        this.W2 = new xra(0, 0);
        this.Z2 = true;
        this.r3 = new pn2[1];
        this.s3 = new npa(this, (byte) 16);
        this.v3 = true;
        this.a = i;
        this.S1 = j;
        this.u1 = Math.max(0.05f, gm.L(82.0f) / (gm.q.y + gm.m));
        this.x = true;
        this.b = new ne6((byte) 24, context, this);
        jp0 jp0Var = new jp0(this, context);
        this.T1 = jp0Var;
        fra fraVar = new fra(this, context);
        this.U1 = fraVar;
        fraVar.setAdapter(new bo0((byte) 6, context, this));
        C2();
        View view2 = new View(context);
        this.W1 = view2;
        int i2 = cmb.g5;
        anb.h(i2, ylbVar, view2);
        FrameLayout.LayoutParams e = qoe.e(-1, 50, 80);
        int i3 = this.u0;
        e.rightMargin = i3;
        e.leftMargin = i3;
        this.b.addView(view2, e);
        this.b.addView(fraVar, qoe.e(-1, -1, nm7.D1));
        L(i2);
        gm.B2(this.n1);
        jp0Var.addView(this.n1, qoe.e(-1, -1, nm7.D1));
        if (Build.VERSION.SDK_INT >= 26) {
            this.n1.setDefaultFocusHighlightEnabled(false);
        }
        gra graVar = new gra(this, context, (byte) 0);
        this.b2 = graVar;
        graVar.setOrientation(1);
        graVar.setPadding(gm.L(14.0f) + this.u0, gm.L(16.0f), gm.L(14.0f) + this.u0, gm.L(68.0f));
        jp0Var.addView(graVar, qoe.e(-1, -1, 55));
        LinearLayout linearLayout = new LinearLayout(context);
        this.e3 = linearLayout;
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        this.f3 = textView;
        textView.setSingleLine(true);
        textView.setGravity(17);
        textView.setIncludeFontPadding(false);
        ts2.s(textView, 1, 40.0f);
        int i4 = cmb.Ei;
        anb.X(textView, i4, ylbVar);
        linearLayout.addView(textView, qoe.r(-1, 50, 1));
        TextView textView2 = new TextView(context);
        this.g3 = textView2;
        textView2.setGravity(17);
        textView2.setIncludeFontPadding(false);
        textView2.setTextSize(1, 14.0f);
        anb.X(textView2, cmb.y6, ylbVar);
        linearLayout.addView(textView2, qoe.t(-1, 20, 1, 0, 3, 0, 0));
        graVar.addView(linearLayout, qoe.k(0.0f, 4.0f, 0.0f, 16.0f, -1, -2));
        linearLayout.setVisibility(8);
        l66 l66Var = new l66(context, ylbVar);
        this.c2 = l66Var;
        int i5 = cmb.p5;
        anb.X(l66Var, i5, ylbVar);
        l66Var.setTextSize(1, 12.0f);
        l66Var.setGravity(17);
        l66Var.setLineSpacing(gm.L(2.0f), 1.0f);
        anb.G(l66Var, cmb.Wc, ylbVar);
        l66Var.setDisablePaddingsOffsetY(true);
        graVar.addView(l66Var, qoe.t(-2, -2, 1, 4, -2, 4, 16));
        l66Var.setVisibility(8);
        mhb mhbVar = new mhb(context, ylbVar);
        this.d2 = mhbVar;
        graVar.addView(mhbVar, qoe.k(0.0f, 0.0f, 0.0f, 12.0f, -1, -2));
        l66 l66Var2 = new l66(context, ylbVar);
        this.e2 = l66Var2;
        anb.X(l66Var2, i5, ylbVar);
        l66Var2.setTextSize(1, 12.0f);
        l66Var2.setGravity(17);
        l66Var2.setLineSpacing(gm.L(2.0f), 1.0f);
        anb.G(l66Var2, i4, ylbVar);
        l66Var2.setDisablePaddingsOffsetY(true);
        l66Var2.setPadding(gm.L(5.0f), 0, gm.L(5.0f), 0);
        graVar.addView(l66Var2, qoe.t(-2, -2, 1, 4, 2, 4, 8));
        l66Var2.setVisibility(8);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.t2 = linearLayout2;
        linearLayout2.setPadding(gm.L(12.0f), gm.L(8.0f), gm.L(12.0f), gm.L(8.0f));
        linearLayout2.setOrientation(0);
        int i6 = cmb.h6;
        fg0 Y = cmb.Y(cmb.v0(i6, ylbVar), 21, 21);
        wmb M = anb.M(i6);
        linearLayout2.setBackground(Y);
        anb.j(linearLayout2, Y, null, M, ylbVar);
        jh2 jh2Var = new jh2(24, ylbVar, context);
        this.u2 = jh2Var;
        int i7 = cmb.g7;
        int i8 = cmb.i7;
        int i9 = cmb.j7;
        jh2Var.b(i7, i8, i9);
        jh2Var.setDrawUnchecked(true);
        jh2Var.a(false, false);
        jh2Var.setDrawBackgroundAsArc(10);
        linearLayout2.addView(jh2Var, qoe.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView3 = new TextView(context);
        int i10 = cmb.i5;
        anb.X(textView3, i10, ylbVar);
        ts2.q(14.0f, 1, 2131750322, textView3, null);
        linearLayout2.addView(textView3, qoe.t(-2, -2, 16, 9, 0, 0, 0));
        graVar.addView(linearLayout2, qoe.t(-2, -2, 1, 0, -4, 0, 4));
        rve.b(linearLayout2, 0.025f, 1.5f);
        linearLayout2.setOnClickListener(new lpa(this, (byte) 24));
        linearLayout2.setVisibility(8);
        gra graVar2 = new gra(this, context, (byte) 1);
        this.n2 = graVar2;
        graVar2.setOrientation(1);
        graVar2.setPadding(gm.L(4.0f) + this.u0, gm.L(24.0f), gm.L(4.0f) + this.u0, gm.L(66.0f));
        jp0Var.addView(graVar2, qoe.e(-1, -1, 55));
        ac[] acVarArr = {r8, r8, r8};
        this.o2 = acVarArr;
        ac acVar = new ac(ylbVar, context, false);
        acVar.a(R.drawable.menu_feature_unique, jb6.M0(2131749798, null), jb6.M0(2131749349, null));
        graVar2.addView(acVarArr[0], qoe.o(-1, -2));
        ac acVar2 = new ac(ylbVar, context, false);
        acVar2.a(R.drawable.menu_feature_tradable, jb6.M0(2131749792, null), jb6.M0(2131749347, null));
        graVar2.addView(acVarArr[1], qoe.o(-1, -2));
        ac acVar3 = new ac(ylbVar, context, false);
        acVar3.a(R.drawable.menu_wear, jb6.M0(2131749344, null), jb6.M0(2131749345, null));
        graVar2.addView(acVarArr[2], qoe.o(-1, -2));
        View view3 = new View(context);
        this.p2 = view3;
        int i11 = cmb.c7;
        anb.h(i11, ylbVar, view3);
        graVar2.addView(view3, qoe.n(1.0f / gm.p, -2, 7, 17, -4, 17, 6));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.q2 = linearLayout3;
        linearLayout3.setPadding(gm.L(12.0f), gm.L(8.0f), gm.L(12.0f), gm.L(8.0f));
        linearLayout3.setOrientation(0);
        fg0 Y2 = cmb.Y(cmb.v0(i6, ylbVar), 6, 6);
        wmb M2 = anb.M(i6);
        linearLayout3.setBackground(Y2);
        anb.j(linearLayout3, Y2, null, M2, ylbVar);
        jh2 jh2Var2 = new jh2(24, ylbVar, context);
        this.r2 = jh2Var2;
        jh2Var2.b(i7, i8, i9);
        jh2Var2.setDrawUnchecked(true);
        jh2Var2.a(false, false);
        jh2Var2.setDrawBackgroundAsArc(10);
        linearLayout3.addView(jh2Var2, qoe.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView4 = new TextView(context);
        this.s2 = textView4;
        anb.X(textView4, i10, ylbVar);
        ts2.q(14.0f, 1, 2131750330, textView4, null);
        linearLayout3.addView(textView4, qoe.t(-2, -2, 16, 9, 0, 0, 0));
        graVar2.addView(linearLayout3, qoe.t(-2, -2, 1, 0, 0, 0, 4));
        rve.b(linearLayout3, 0.025f, 1.5f);
        gra graVar3 = new gra(this, context, (byte) 2);
        this.w2 = graVar3;
        graVar3.setOrientation(1);
        graVar3.setPadding(gm.L(4.0f) + this.u0, gm.L(20.0f), gm.L(4.0f) + this.u0, gm.L(66.0f));
        jp0Var.addView(graVar3, qoe.e(-1, -1, 55));
        TextView textView5 = new TextView(context);
        this.x2 = textView5;
        anb.X(textView5, i10, ylbVar);
        textView5.setTextSize(1, 20.0f);
        textView5.setGravity(17);
        textView5.setTypeface(gm.o());
        graVar3.addView(textView5, qoe.t(-1, -2, 7, 20, 0, 20, 0));
        TextView textView6 = new TextView(context);
        anb.X(textView6, i10, ylbVar);
        textView6.setTextSize(1, 14.0f);
        hg9.p(textView6, 17, null, 2131749767);
        graVar3.addView(textView6, qoe.t(-1, -2, 7, 20, 6, 20, 24));
        ac acVar4 = new ac(ylbVar, context, false);
        acVar4.a(R.drawable.menu_feature_unique, jb6.M0(2131749773, null), jb6.M0(2131749774, null));
        graVar3.addView(r6[0], qoe.o(-1, -2));
        ac acVar5 = new ac(ylbVar, context, false);
        acVar5.a(R.drawable.menu_feature_cover, jb6.M0(2131749771, null), jb6.M0(2131749772, null));
        graVar3.addView(r6[1], qoe.o(-1, -2));
        ac acVar6 = new ac(ylbVar, context, false);
        ac[] acVarArr2 = {acVar4, acVar5, acVar6};
        acVar6.a(R.drawable.menu_verification, jb6.M0(2131749769, null), jb6.M0(2131749770, null));
        graVar3.addView(acVarArr2[2], qoe.o(-1, -2));
        gra graVar4 = new gra(this, context, (byte) 3);
        this.y2 = graVar4;
        graVar4.setOrientation(1);
        graVar4.setPadding(gm.L(4.0f) + this.u0, gm.L(10.0f), gm.L(4.0f) + this.u0, gm.L(92.0f));
        jp0Var.addView(graVar4, qoe.e(-1, -1, 55));
        ac acVar7 = new ac(ylbVar, context, false);
        acVar7.a(R.drawable.menu_feature_unique, jb6.M0(2131749718, null), jb6.M0(2131749719, null));
        graVar4.addView(r7[0], qoe.o(-1, -2));
        ac acVar8 = new ac(ylbVar, context, false);
        acVar8.a(R.drawable.menu_random, jb6.M0(2131749716, null), jb6.M0(2131749717, null));
        graVar4.addView(r7[1], qoe.o(-1, -2));
        ac acVar9 = new ac(ylbVar, context, false);
        ac[] acVarArr3 = {acVar7, acVar8, acVar9};
        acVar9.a(R.drawable.menu_feature_affect, jb6.M0(2131749714, null), jb6.M0(2131749715, null));
        graVar4.addView(acVarArr3[2], qoe.o(-1, -2));
        graVar.setAlpha(1.0f);
        graVar2.setAlpha(0.0f);
        graVar3.setAlpha(0.0f);
        graVar4.setAlpha(0.0f);
        ssa ssaVar = new ssa(context, ylbVar, new npa(this, (byte) 17), new lpa(this, (byte) 25), new lpa(this, (byte) 26), new lpa(this, (byte) 27), new lpa(this, (byte) 28), new lpa(this, (byte) 29), new rqa(this, (byte) 0), new rqa(this, (byte) 1));
        this.a2 = ssaVar;
        ssaVar.N.c.setOnClickListener(new lpa(this, (byte) 22));
        int i12 = this.u0;
        ssaVar.setPadding(i12, 0, i12, 0);
        jp0Var.addView(ssaVar, qoe.e(-1, -2, 55));
        zs zsVar = this.m1;
        this.J1 = true;
        zsVar.j1(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.g2 = frameLayout;
        anb.h(i2, ylbVar, frameLayout);
        View view4 = new View(context);
        this.j2 = view4;
        anb.h(i11, ylbVar, view4);
        view4.setAlpha(0.0f);
        frameLayout.addView(view4, qoe.a(-1.0f, 1.0f / gm.p, 55));
        b61 i13 = mlb.i(24, ylbVar, context, true);
        this.f2 = i13;
        i13.i(jb6.M0(2131747564, null), false, true);
        i13.g(null, false);
        FrameLayout.LayoutParams d = qoe.d(-1, 48.0f, nm7.D1, 0.0f, 12.0f, 0.0f, 12.0f);
        d.leftMargin = gm.L(14.0f) + this.u0;
        d.rightMargin = gm.L(14.0f) + this.u0;
        frameLayout.addView(i13, d);
        jp0Var.addView(frameLayout, qoe.e(-1, 72, 87));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.i2 = frameLayout2;
        anb.h(i2, ylbVar, frameLayout2);
        l66 l66Var3 = new l66(context, null);
        this.h2 = l66Var3;
        l66Var3.setTextSize(1, 12.0f);
        anb.X(l66Var3, i4, ylbVar);
        anb.G(l66Var3, i4, ylbVar);
        l66Var3.setGravity(17);
        frameLayout2.addView(l66Var3, qoe.d(-1, -2.0f, 17, 16.0f, 8.0f, 16.0f, 14.0f));
        jp0Var.addView(frameLayout2, qoe.e(-1, -2, 87));
        frameLayout2.setVisibility(8);
        this.n1.setOnScrollListener(new so7(this, (byte) 26));
        linearLayout3.setOnClickListener(new lpa(this, (byte) 23));
        uj4 uj4Var = new uj4(context);
        this.V1 = uj4Var;
        jp0Var.addView(uj4Var, qoe.c(-1.0f, -1));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.k2 = frameLayout3;
        frameLayout3.setPadding(gm.L(6.0f) + this.u0, 0, gm.L(6.0f) + this.u0, 0);
        jp0Var.addView(frameLayout3, qoe.d(-1, 200.0f, 87, 0.0f, 0.0f, 0.0f, 60.0f));
        gm.B2(this.o1);
        jp0Var.addView(this.o1, qoe.d(-1, -2.0f, 0, 6.0f, 0.0f, 6.0f, 0.0f));
        hra hraVar = new hra(context);
        this.Z1 = hraVar;
        jp0Var.addView(hraVar, qoe.e(-1, -2, 55));
        ArrayList arrayList = new ArrayList();
        if (view != null) {
            arrayList.add(view);
        }
        gm.k2(new eg9(hraVar, (byte) 8), 12.0f, 12, arrayList);
    }

    public static boolean D1(int i, TL_stars.StarGift starGift) {
        if (!fs7.m(starGift)) {
            return false;
        }
        if (!oc7.r1(i).l4.n0.f) {
            return true;
        }
        if (((TL_stars.TL_starGiftUnique) starGift).fixed_sale) {
            return false;
        }
        return !r2.s.f;
    }

    public static boolean F1(int i, long j) {
        return j >= 0 ? z8c.h(i).e() == j : sd2.w(5, oc7.r1(i).L0(Long.valueOf(-j)));
    }

    public static boolean G1(int i, long j) {
        if (j >= 0) {
            return z8c.h(i).e() == j;
        }
        TLRPC.Chat L0 = oc7.r1(i).L0(Long.valueOf(-j));
        return L0 != null && L0.creator;
    }

    public static boolean I1(int i, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        if (tL_starGiftUnique == null) {
            return false;
        }
        TLRPC.Peer peer = tL_starGiftUnique.owner_id;
        if (peer == null) {
            peer = tL_starGiftUnique.host_id;
        }
        long n = pg3.n(peer);
        if (n == 0) {
            return false;
        }
        if (n > 0) {
            TLRPC.User W1 = oc7.r1(i).W1(Long.valueOf(n));
            if (W1 != null) {
                TLRPC.EmojiStatus emojiStatus = W1.emoji_status;
                return (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) && ((TLRPC.TL_emojiStatusCollectible) emojiStatus).collectible_id == tL_starGiftUnique.id;
            }
        } else {
            TLRPC.Chat L0 = oc7.r1(i).L0(Long.valueOf(-n));
            if (L0 != null) {
                TLRPC.EmojiStatus emojiStatus2 = L0.emoji_status;
                if ((emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) && ((TLRPC.TL_emojiStatusCollectible) emojiStatus2).collectible_id == tL_starGiftUnique.id) {
                    return true;
                }
            }
        }
        return false;
    }

    public static TableRow Y0(mhb mhbVar, String str, String str2, ylb ylbVar) {
        if (!WalletEngine2.isValidAddress(str2)) {
            return mhbVar.f(str, str2, null, null);
        }
        float L = gm.L(14.0f);
        TextView craVar = new cra(mhbVar.getContext(), L);
        craVar.setTypeface(gm.n1("fonts/rmono.ttf"));
        int i = 0;
        craVar.setTextSize(0, L);
        craVar.setLineSpacing(gm.L(2.0f), 1.0f);
        anb.X(craVar, cmb.F6, ylbVar);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i2 = 0;
        while (i < str2.length()) {
            int i3 = i2 / 4;
            int i4 = i2 % 4;
            if (i2 > 0) {
                spannableStringBuilder.append((CharSequence) (i4 == 0 ? "\n" : " "));
            }
            int length = spannableStringBuilder.length();
            int i5 = i + 4;
            spannableStringBuilder.append((CharSequence) str2, i, Math.min(str2.length(), i5));
            if (((i3 + i4) & 1) == 1) {
                spannableStringBuilder.setSpan(new do4(cmb.x6, ylbVar), length, spannableStringBuilder.length(), 33);
            }
            i2++;
            i = i5;
        }
        craVar.setText(spannableStringBuilder);
        return mhbVar.c(craVar, str);
    }

    public static void Z0(mhb mhbVar, TL_stars.StarGiftAttribute starGiftAttribute) {
        String M0;
        if (starGiftAttribute instanceof TL_stars.starGiftAttributeModel) {
            M0 = jb6.M0(2131750320, null);
        } else if (starGiftAttribute instanceof TL_stars.starGiftAttributePattern) {
            M0 = jb6.M0(2131750313, null);
        } else if (!(starGiftAttribute instanceof TL_stars.starGiftAttributeBackdrop)) {
            return;
        } else {
            M0 = jb6.M0(2131750321, null);
        }
        String str = M0;
        Integer[] numArr = new Integer[1];
        mhbVar.e(str, starGiftAttribute.name, z1(starGiftAttribute.rarity, numArr), null, numArr[0]);
    }

    public static void g2(d dVar) {
        d S = LaunchActivity.S();
        if (S == null) {
            return;
        }
        bh0 bh0Var = new bh0();
        bh0Var.a = true;
        S.showAsSheet(dVar, bh0Var);
    }

    public static SpannableStringBuilder j2(String str) {
        int i;
        int i2;
        int indexOf = str.indexOf("**");
        int indexOf2 = str.indexOf("**", indexOf + 1);
        String replace = str.replace("**", "");
        if (indexOf < 0 || indexOf2 < 0 || (i2 = indexOf2 - indexOf) <= 2) {
            indexOf = -1;
            i = 0;
        } else {
            i = i2 - 2;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(replace);
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new aa2((byte) 1), indexOf, i + indexOf, 0);
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder k2(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        SpannableString spannableString = new SpannableString("👌");
        spannableString.setSpan(new pn2(R.drawable.filled_understood, 0), 0, spannableString.length(), 33);
        SpannableString spannableString2 = new SpannableString("👍");
        spannableString2.setSpan(new pn2(R.drawable.filled_reactions, 0), 0, spannableString2.length(), 33);
        gm.I2(spannableStringBuilder, spannableString, "👌");
        gm.I2(spannableStringBuilder, spannableString2, "👍");
        return spannableStringBuilder;
    }

    public static boolean m1(TL_stars.SavedStarGift savedStarGift, TL_stars.SavedStarGift savedStarGift2) {
        if (savedStarGift == savedStarGift2) {
            return true;
        }
        if (savedStarGift == null) {
            return false;
        }
        TL_stars.StarGift starGift = savedStarGift.gift;
        TL_stars.StarGift starGift2 = savedStarGift2.gift;
        if (starGift != starGift2) {
            return ((starGift instanceof TL_stars.TL_starGiftUnique) && (starGift2 instanceof TL_stars.TL_starGiftUnique)) ? starGift.id == starGift2.id : (starGift instanceof TL_stars.TL_starGift) && (starGift2 instanceof TL_stars.TL_starGift) && starGift.id == starGift2.id && savedStarGift.date == savedStarGift2.date;
        }
        return true;
    }

    public static boolean n1(TL_stars.TL_starGiftUnique tL_starGiftUnique, TL_stars.TL_starGiftUnique tL_starGiftUnique2) {
        if (tL_starGiftUnique == tL_starGiftUnique2) {
            return true;
        }
        if (tL_starGiftUnique != null) {
            return tL_starGiftUnique.id == tL_starGiftUnique2.id || TextUtils.equals(tL_starGiftUnique.slug, tL_starGiftUnique2.slug);
        }
        return false;
    }

    public static String o1(int i) {
        Date date = new Date(i * 1000);
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar.setTime(date);
        jb6 D0 = jb6.D0();
        return jb6.a0(null, null, 2131742446, (calendar.get(1) == calendar2.get(1) ? D0.p0() : D0.r0()).format(date), D0.o0().format(date));
    }

    public static String t1(TL_stars.StarGift starGift) {
        if (!(starGift instanceof TL_stars.TL_starGiftUnique)) {
            return (!(starGift instanceof TL_stars.TL_starGift) || TextUtils.isEmpty(starGift.title)) ? jb6.M0(2131750125, null) : starGift.title;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(((TL_stars.TL_starGiftUnique) starGift).title);
        sb.append(" #");
        return kt6.m(r3.num, ',', sb);
    }

    public static String z1(TL_stars.StarGiftAttributeRarity starGiftAttributeRarity, Integer[] numArr) {
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityUncommon) {
            numArr[0] = -12539616;
            return jb6.M0(2131749396, null);
        }
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityRare) {
            numArr[0] = -15619394;
            return jb6.M0(2131749397, null);
        }
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityEpic) {
            numArr[0] = -6988581;
            return jb6.M0(2131749399, null);
        }
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityLegendary) {
            numArr[0] = -4229632;
            return jb6.M0(2131749398, null);
        }
        if (!(starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarity)) {
            return "";
        }
        int i = ((TL_stars.TL_starGiftAttributeRarity) starGiftAttributeRarity).permille;
        return i <= 0 ? "<0.1%" : bc.J0(i);
    }

    public final TL_stars.TL_starGiftUnique A1() {
        TL_stars.StarGift r1 = r1();
        if (r1 instanceof TL_stars.TL_starGiftUnique) {
            return (TL_stars.TL_starGiftUnique) r1;
        }
        return null;
    }

    public final void A2(boolean z) {
        wsa wsaVar;
        int i;
        int i2;
        TL_stars.TL_starGiftUnique A1 = A1();
        if (A1 == null) {
            return;
        }
        byte b = 3;
        oc7.d1().edit().putInt("statusgiftpage", 3).apply();
        boolean I1 = I1(this.a, A1());
        boolean z2 = !I1;
        boolean I12 = I1(this.a, A1());
        b61 b61Var = this.f2;
        if (I12) {
            oc7.r1(this.a).o5(q1(), new TLRPC.TL_emojiStatusEmpty(), null);
            wsaVar = this;
        } else {
            long q1 = q1();
            if (q1 >= 0) {
                if (!z8c.h(this.a).p()) {
                    u31 P = j().P(R.raw.star_premium_2, gm.N2(jb6.M0(2131750356, null), -1, 2, new npa(this, b), null));
                    P.u = true;
                    P.j();
                    return;
                }
            } else if (!z) {
                oc7 r1 = oc7.r1(this.a);
                b61Var.setLoading(true);
                oc7.r1(this.a).F0().a(q1, new p2c((Object) this, (Object) r1, q1, (byte) 8));
                return;
            }
            wsaVar = this;
            TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible = new TLRPC.TL_inputEmojiStatusCollectible();
            tL_inputEmojiStatusCollectible.collectible_id = A1.id;
            oc7.r1(wsaVar.a).o5(wsaVar.q1(), tL_inputEmojiStatusCollectible, A1);
        }
        qw9 qw9Var = wsaVar.a2.J[1];
        if (I1) {
            i = R.drawable.filled_crown_on;
            i2 = 2131750358;
        } else {
            i = R.drawable.filled_crown_off;
            i2 = 2131750355;
        }
        qw9Var.a(i, jb6.M0(i2, null), true);
        if (wsaVar.v2) {
            wsaVar.dismiss();
            return;
        }
        n28 n28Var = new n28((byte) 18, (Object) wsaVar, z2);
        if (wsaVar.W2.c(0)) {
            n28Var.run();
        } else {
            wsaVar.z2(0, true, n28Var);
        }
        b61Var.i(jb6.M0(2131747564, null), !wsaVar.Z2, true);
        b61Var.g(null, !wsaVar.Z2);
        b61Var.setOnClickListener(new lpa(wsaVar, (byte) 10));
    }

    public final boolean B1(boolean z) {
        return (x1(z) == null && y1(z) == null) ? false : true;
    }

    public final void B2() {
        FrameLayout frameLayout = this.i2;
        int visibility = frameLayout.getVisibility();
        FrameLayout frameLayout2 = this.k2;
        FrameLayout frameLayout3 = this.g2;
        if (visibility != 0) {
            frameLayout3.setTranslationY(0.0f);
            frameLayout.setTranslationY(0.0f);
            frameLayout2.setTranslationY(0.0f);
        } else {
            frameLayout3.setTranslationY(this.W2.a(1) * (-frameLayout.getMeasuredHeight()));
            frameLayout.setTranslationY((1.0f - this.W2.a(1)) * frameLayout.getMeasuredHeight());
            frameLayout2.setTranslationY(this.W2.a(1) * (-frameLayout.getMeasuredHeight()));
        }
    }

    @Override // mz0, my0
    public final boolean C() {
        if (this.W2.c(4)) {
            boolean z = this.a2.N.i0;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void C1(byte[] bArr, TwoStepVerificationActivity twoStepVerificationActivity, boolean z, m45 m45Var) {
        TL_stars.getStarGiftWithdrawalUrl getstargiftwithdrawalurl;
        TL_stars.InputSavedStarGift u1 = u1();
        if (u1 == null) {
            if (m45Var != null) {
                m45Var.a(Boolean.FALSE);
                return;
            }
            return;
        }
        if (z) {
            TL_stars.withdrawStarGift withdrawstargift = new TL_stars.withdrawStarGift();
            withdrawstargift.keep_on_profile = this.v3;
            withdrawstargift.stargift = u1;
            withdrawstargift.tmp_password = bArr;
            getstargiftwithdrawalurl = withdrawstargift;
        } else {
            TL_stars.getStarGiftWithdrawalUrl getstargiftwithdrawalurl2 = new TL_stars.getStarGiftWithdrawalUrl();
            getstargiftwithdrawalurl2.stargift = u1;
            getstargiftwithdrawalurl2.tmp_password = bArr;
            getstargiftwithdrawalurl = getstargiftwithdrawalurl2;
        }
        ConnectionsManager.getInstance(this.a).sendRequest(getstargiftwithdrawalurl, new rj1(this, m45Var, twoStepVerificationActivity, z));
    }

    public final void C2() {
        boolean B1 = B1(false);
        fra fraVar = this.U1;
        fraVar.setPosition(B1 ? 1 : 0);
        fraVar.D(false);
        if (this.B2 == null || B1(true) || this.B2.e() >= this.B2.c()) {
            return;
        }
        this.B2.a();
    }

    public final void D2() {
        TL_stars.TL_starGiftUnique A1 = A1();
        TL_wallet.nftItem nftitem = this.a3;
        LinearLayout linearLayout = this.t2;
        if (nftitem == null || A1 == null) {
            linearLayout.setVisibility(8);
            return;
        }
        this.c2.setVisibility(8);
        this.e2.setVisibility(8);
        linearLayout.setVisibility(0);
        this.u2.a(A1.host_id != null, linearLayout.isAttachedToWindow());
    }

    @Override // my0
    public final boolean E() {
        if (this.W2.c(4) && this.a2.N.i0) {
            return false;
        }
        return this.d0;
    }

    public final boolean E1(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        if (tL_starGiftUnique != null && !TextUtils.isEmpty(tL_starGiftUnique.owner_address)) {
            c C = c.C(this.a);
            String x = C.x();
            if (TextUtils.isEmpty(x)) {
                TLRPC.Peer peer = tL_starGiftUnique.host_id;
                return peer != null && pg3.n(peer) == z8c.h(this.a).e();
            }
            if (c.b(tL_starGiftUnique.owner_address, x) || C.A().c(tL_starGiftUnique.gift_address)) {
                return true;
            }
        }
        return false;
    }

    public final TL_wallet.nftItem E2() {
        TL_wallet.nftItem nftitem = this.a3;
        if (nftitem != null) {
            return nftitem;
        }
        TL_stars.TL_starGiftUnique A1 = A1();
        if (!x2(A1)) {
            return null;
        }
        c C = c.C(this.a);
        if (A1 == null || TextUtils.isEmpty(A1.gift_address)) {
            return null;
        }
        ArrayList arrayList = C.A().b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            TL_wallet.nftItem nftitem2 = (TL_wallet.nftItem) obj;
            if (c.b(nftitem2.address, A1.gift_address)) {
                return nftitem2;
            }
        }
        TL_wallet.nftItem nftitem3 = new TL_wallet.nftItem();
        nftitem3.address = A1.gift_address;
        nftitem3.owner_address = C.x();
        nftitem3.index = "";
        nftitem3.name = A1.title + " #" + A1.num;
        nftitem3.gift = A1;
        return nftitem3;
    }

    @Override // my0
    public final boolean F(MotionEvent motionEvent) {
        if (this.W2.c(4)) {
            boolean z = this.a2.N.i0;
        }
        return false;
    }

    @Override // mz0
    public final q59 G0(r59 r59Var) {
        ny0 ny0Var = new ny0(this, (byte) 10);
        this.O2 = ny0Var;
        return ny0Var;
    }

    public final boolean H1(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        if (!wi8.A(tL_starGiftUnique) || !fs7.m(tL_starGiftUnique)) {
            return false;
        }
        if (tL_starGiftUnique.my_sale || this.a3 != null) {
            return true;
        }
        TLRPC.Peer peer = tL_starGiftUnique.host_id;
        if (peer == null || pg3.n(peer) != z8c.h(this.a).e()) {
            return !TextUtils.isEmpty(tL_starGiftUnique.owner_address) && c.b(tL_starGiftUnique.owner_address, c.C(this.a).x());
        }
        return true;
    }

    @Override // mz0
    public final int I0() {
        return gm.L(12.0f);
    }

    @Override // mz0
    public final CharSequence J0() {
        return this.Q2;
    }

    public final void J1(TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift) {
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) tL_payments_uniqueStarGift.gift;
        this.E2 = tL_starGiftUnique;
        o2(tL_starGiftUnique, false, null, null);
        super.show();
    }

    public final void K1(he heVar, k47 k47Var) {
        heVar.dismiss();
        this.H2 = true;
        l2(k47Var, null);
        super.show();
    }

    public final void L1(he heVar, TL_stars.SavedStarGift savedStarGift) {
        if (savedStarGift != null) {
            heVar.dismiss();
            this.J2 = true;
            n2(savedStarGift, null);
            super.show();
            return;
        }
        heVar.dismiss();
        d S = LaunchActivity.S();
        if (S != null) {
            u31 Q = c41.b0(S).Q(R.raw.error, 36, jb6.M0(2131748309, null));
            Q.u = true;
            Q.j();
        }
    }

    public final void M1() {
        TL_stars.TL_starGiftUnique A1 = A1();
        b61 b61Var = this.f2;
        if (b61Var.R || A1 == null || D1(this.a, A1) || H1(A1)) {
            return;
        }
        boolean m = fs7.m(A1);
        TL_stars.TL_starGiftUnique tL_starGiftUnique = this.E2;
        long j = this.S1;
        if (m) {
            if (tL_starGiftUnique == null || !this.F2 || j == 0) {
                j = z8c.h(this.a).e();
            }
            long j2 = j;
            if (this.E2 == null || !this.F2 || j2 == z8c.h(this.a).e()) {
                d1(A1, j2, null, true, null);
                return;
            }
            fw4 fw4Var = new fw4(getContext(), this.J0, A1, j2);
            fw4Var.E1 = new zn1((Object) this, (Object) fw4Var, (Object) A1, j2, (byte) 8);
            fw4Var.show();
            return;
        }
        if (tL_starGiftUnique == null || !this.F2 || j == 0) {
            j = z8c.h(this.a).e();
        }
        long j3 = j;
        ok okVar = A1.resale_ton_only ? ok.b : ok.a;
        if (this.E2 == null || !this.F2 || j3 == z8c.h(this.a).e()) {
            b61Var.setLoading(true);
            jva.u(this.a, okVar).E(A1, j3, null, true, new tpa(this, null, okVar, A1, j3, null, true));
        } else {
            fw4 fw4Var2 = new fw4(getContext(), this.J0, A1, j3);
            fw4Var2.E1 = new jp1(this, fw4Var2, A1, j3, okVar, (byte) 3);
            fw4Var2.show();
        }
    }

    public final void N1() {
        yqa yqaVar = this.U2;
        if (yqaVar != null && !yqaVar.J) {
            yqaVar.dismiss();
        }
        String v1 = v1();
        yqa yqaVar2 = new yqa(this, getContext(), v1, v1, this.J0);
        this.U2 = yqaVar2;
        yqaVar2.n2 = new et8((Object) this, (byte) 14);
        yqaVar2.show();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x007c, code lost:
    
        if (((org.telegram.tgnet.TLRPC.TL_messageActionStarGiftUnique) r4).can_craft_at > 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x008d, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008b, code lost:
    
        if (r4.can_craft_at > 0) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void O1() {
        TL_stars.TL_starGiftUnique A1;
        this.b2.setAlpha(this.W2.a(0));
        this.n2.setAlpha(this.W2.a(1));
        this.w2.setAlpha(this.W2.a(2));
        this.y2.setAlpha(this.W2.a(3));
        float a = 1.0f - this.W2.a(4);
        FrameLayout frameLayout = this.g2;
        frameLayout.setAlpha(a);
        xra xraVar = this.W2;
        ssa ssaVar = this.a2;
        ssaVar.d(xraVar);
        ImageView imageView = ssaVar.R;
        if (this.W2.c(0) && (A1 = A1()) != null && !A1.crafted && G1(this.a, pg3.n(A1.owner_id))) {
            k47 k47Var = this.C2;
            if (k47Var != null) {
                TLRPC.Message message = k47Var.k;
                if (message != null) {
                    TLRPC.MessageAction messageAction = message.action;
                    if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                    }
                }
            } else {
                TL_stars.SavedStarGift savedStarGift = this.A2;
                if (savedStarGift != null) {
                    if (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique) {
                    }
                }
            }
            imageView.setVisibility(r4);
            jp0 jp0Var = this.T1;
            float f = jp0Var.f();
            this.Z1.setAlpha(this.W2.a(0) * Utilities.l(gm.x1(f - r6.getHeight(), 0.0f, gm.L(32.0f))));
            jp0Var.h();
            jp0Var.invalidate();
            frameLayout.setVisibility(this.W2.c(4) ? 8 : 0);
            B2();
        }
        int i = 8;
        imageView.setVisibility(i);
        jp0 jp0Var2 = this.T1;
        float f2 = jp0Var2.f();
        this.Z1.setAlpha(this.W2.a(0) * Utilities.l(gm.x1(f2 - r6.getHeight(), 0.0f, gm.L(32.0f))));
        jp0Var2.h();
        jp0Var2.invalidate();
        frameLayout.setVisibility(this.W2.c(4) ? 8 : 0);
        B2();
    }

    public final void P1(TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, boolean z) {
        int i;
        if (getContext() == null) {
            return;
        }
        if (tL_error == null) {
            if (twoStepVerificationActivity != null) {
                twoStepVerificationActivity.t0();
            }
            c41.c0("NULL_ERROR");
            return;
        }
        byte b = 1;
        if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
            if ("SRP_ID_INVALID".equals(tL_error.text)) {
                ConnectionsManager.getInstance(this.a).sendRequest(new TL_account.getPassword(), new pqa(this, twoStepVerificationActivity, z, b), 8);
                return;
            }
            if (twoStepVerificationActivity != null) {
                twoStepVerificationActivity.t0();
                twoStepVerificationActivity.finishFragment();
            }
            if (z && ("WALLET_CREATING".equals(tL_error.text) || "WALLET_UNAVAILABLE".equals(tL_error.text))) {
                fs7.q(getContext(), this.a, this.J0, null, tL_error.text, null);
                return;
            }
            String str = tL_error.text;
            if (str == null || !str.startsWith("FLOOD_WAIT")) {
                c41.e0(tL_error);
                return;
            } else {
                mlb.y(null, 2131750619, c41.Y(), null);
                return;
            }
        }
        if (twoStepVerificationActivity != null) {
            twoStepVerificationActivity.t0();
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        String M0 = jb6.M0(2131749833, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setPadding(gm.L(24.0f), gm.L(2.0f), gm.L(24.0f), 0);
        linearLayout.setOrientation(1);
        alertDialog$Builder.n(linearLayout);
        TextView textView = new TextView(getContext());
        int i2 = cmb.i5;
        anb.X(textView, i2, null);
        textView.setTextSize(1, 16.0f);
        textView.setGravity((jb6.a0 ? 5 : 3) | 48);
        textView.setText(gm.S2(jb6.M0(2131749837, null)));
        linearLayout.addView(textView, qoe.o(-1, -2));
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, qoe.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.list_circle);
        imageView.setPadding(jb6.a0 ? gm.L(11.0f) : 0, gm.L(9.0f), jb6.a0 ? 0 : gm.L(11.0f), 0);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        anb.s(imageView, i2, null, mode);
        TextView textView2 = new TextView(getContext());
        anb.X(textView2, i2, null);
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity((jb6.a0 ? 5 : 3) | 48);
        textView2.setText(gm.S2(jb6.M0(2131749836, null)));
        if (jb6.a0) {
            linearLayout2.addView(textView2, qoe.o(-1, -2));
            linearLayout2.addView(imageView, qoe.r(-2, -2, 5));
        } else {
            linearLayout2.addView(imageView, qoe.o(-2, -2));
            linearLayout2.addView(textView2, qoe.o(-1, -2));
        }
        LinearLayout linearLayout3 = new LinearLayout(getContext());
        linearLayout3.setOrientation(0);
        linearLayout.addView(linearLayout3, qoe.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setImageResource(R.drawable.list_circle);
        imageView2.setPadding(jb6.a0 ? gm.L(11.0f) : 0, gm.L(9.0f), jb6.a0 ? 0 : gm.L(11.0f), 0);
        anb.s(imageView2, i2, null, mode);
        TextView textView3 = new TextView(getContext());
        anb.X(textView3, i2, null);
        textView3.setTextSize(1, 16.0f);
        textView3.setGravity((jb6.a0 ? 5 : 3) | 48);
        textView3.setText(gm.S2(jb6.M0(2131749835, null)));
        if (jb6.a0) {
            linearLayout3.addView(textView3, qoe.o(-1, -2));
            i = 5;
            linearLayout3.addView(imageView2, qoe.r(-2, -2, 5));
        } else {
            i = 5;
            linearLayout3.addView(imageView2, qoe.o(-2, -2));
            linearLayout3.addView(textView3, qoe.o(-1, -2));
        }
        if ("PASSWORD_MISSING".equals(tL_error.text)) {
            alertDialog$Builder.j(jb6.M0(2131749832, null), new dq9(this, (byte) 24));
            alertDialog$Builder.g(jb6.M0(2131752542, null), null);
        } else {
            TextView textView4 = new TextView(getContext());
            anb.X(textView4, i2, null);
            textView4.setTextSize(1, 16.0f);
            hg9.p(textView4, (jb6.a0 ? i : 3) | 48, null, 2131749834);
            linearLayout.addView(textView4, qoe.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            alertDialog$Builder.g(jb6.M0(2131747564, null), null);
        }
        if (twoStepVerificationActivity != null) {
            twoStepVerificationActivity.showDialog(heVar);
        } else {
            alertDialog$Builder.o();
        }
    }

    public final void Q1() {
        TL_stars.TL_starGiftUnique A1 = A1();
        if (A1 == null) {
            return;
        }
        if (!fs7.u(A1)) {
            nxa.j1(getContext(), this.a, A1, new vqa(this, A1, (byte) 2), this.J0);
        } else if (h1()) {
            V1();
        } else {
            fs7.q(getContext(), this.a, this.J0, j(), "STARGIFT_ONCHAIN_SALE_DISABLED", Boolean.valueOf(A1.fixed_sale));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ed A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R1() {
        int i;
        CharSequence V;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        long j;
        String str;
        String str2;
        ArrayList arrayList;
        String str3;
        long j2;
        String str4;
        TL_wallet.nftItem nftitem;
        String str5;
        pnc pncVar = this.b3;
        if (pncVar != null) {
            i = ((d) pncVar.c).currentAccount;
            if (!mqc.F(i, pncVar.a.slug)) {
                pnc pncVar2 = this.b3;
                mqc mqcVar = pncVar2.c.k0;
                if (mqcVar == null || (nftitem = pncVar2.b) == null || (str5 = nftitem.address) == null || !str5.equals(mqcVar.Q0)) {
                    Context context = getContext();
                    int i2 = this.a;
                    c41 j3 = j();
                    ylb ylbVar = this.J0;
                    TL_stars.TL_starGiftUnique A1 = A1();
                    ArrayList arrayList2 = new ArrayList(oc7.r1(i2).l4.q0.f);
                    if (arrayList2.isEmpty()) {
                        return;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    int size = arrayList2.size();
                    boolean z = 0;
                    int i3 = 0;
                    while (i3 < size) {
                        int i4 = i3 + 1;
                        String str6 = (String) arrayList2.get(i3);
                        String str7 = "[^\\p{L}\\p{N}]";
                        String replaceAll = str6.replaceAll("[^\\p{L}\\p{N}]", "");
                        Locale locale = Locale.ROOT;
                        String lowerCase = replaceAll.toLowerCase(locale);
                        if (A1 == null || (str4 = A1.title) == null || !lowerCase.equals(str4.replaceAll("[^\\p{L}\\p{N}]", "").toLowerCase(locale))) {
                            jva v = jva.v(i2, z);
                            v.T();
                            ArrayList arrayList4 = v.H;
                            int size2 = arrayList4.size();
                            ArrayList arrayList5 = arrayList4;
                            int i5 = z;
                            while (i5 < size2) {
                                Object obj = arrayList5.get(i5);
                                int i6 = i5 + 1;
                                tL_starGiftUnique = A1;
                                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                                if (starGift != null) {
                                    arrayList = arrayList5;
                                    String str8 = starGift.title;
                                    if (str8 != null) {
                                        str2 = str7;
                                        if (lowerCase.equals(str8.replaceAll(str7, "").toLowerCase(Locale.ROOT))) {
                                            str3 = starGift.title;
                                            j2 = starGift.id;
                                        }
                                    } else {
                                        str2 = str7;
                                    }
                                } else {
                                    str2 = str7;
                                    arrayList = arrayList5;
                                }
                                arrayList5 = arrayList;
                                A1 = tL_starGiftUnique;
                                str7 = str2;
                                i5 = i6;
                            }
                            tL_starGiftUnique = A1;
                            j = 0;
                            str = null;
                            if (str != null) {
                                str = str6.replaceAll("(?<=[a-z0-9])(?=[A-Z])", " ");
                            }
                            String str9 = str;
                            SpannableString spannableString = new SpannableString(str9);
                            spannableString.setSpan(new bra(new boolean[1], i2, context, ylbVar, j, str9, str6), 0, spannableString.length(), 33);
                            arrayList3.add(spannableString);
                            z = 0;
                            i3 = i4;
                            A1 = tL_starGiftUnique;
                        } else {
                            str3 = A1.title;
                            j2 = A1.gift_id;
                            tL_starGiftUnique = A1;
                        }
                        str = str3;
                        j = j2;
                        if (str != null) {
                        }
                        String str92 = str;
                        SpannableString spannableString2 = new SpannableString(str92);
                        spannableString2.setSpan(new bra(new boolean[1], i2, context, ylbVar, j, str92, str6), 0, spannableString2.length(), 33);
                        arrayList3.add(spannableString2);
                        z = 0;
                        i3 = i4;
                        A1 = tL_starGiftUnique;
                    }
                    int i7 = z;
                    if (arrayList3.size() == 1) {
                        Object[] objArr = new Object[1];
                        objArr[i7] = arrayList3.get(i7);
                        V = jb6.V(null, null, 2131742789, objArr);
                    } else {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        int i8 = 0;
                        for (int i9 = 1; i8 < arrayList3.size() - i9; i9 = 1) {
                            if (i8 > 0) {
                                spannableStringBuilder.append((CharSequence) ", ");
                            }
                            spannableStringBuilder.append((CharSequence) arrayList3.get(i8));
                            i8++;
                        }
                        V = jb6.V(null, null, 2131742790, spannableStringBuilder, b10.f(1, arrayList3));
                    }
                    u31 M = j3.M(context.getResources().getDrawable(R.drawable.filled_card_color_28).mutate(), V);
                    y21 y21Var = M.e;
                    if (y21Var instanceof b31) {
                        TextView textView = ((b31) y21Var).b;
                        textView.setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
                        textView.setEllipsize(null);
                    }
                    M.j();
                    return;
                }
            }
            pnc pncVar3 = this.b3;
            dismiss();
            Objects.requireNonNull(pncVar3);
            gm.d3(new c0a(pncVar3, (byte) 23), 250L);
        }
    }

    public final void S1() {
        if (z8c.h(this.a).p() && (I1(this.a, A1()) || this.T2)) {
            A2(false);
            return;
        }
        TL_stars.TL_starGiftUnique A1 = A1();
        if (A1 == null) {
            return;
        }
        TLRPC.Peer peer = A1.owner_id;
        if (peer == null) {
            peer = A1.host_id;
        }
        long n = pg3.n(peer);
        StringBuilder sb = new StringBuilder();
        sb.append(A1.title);
        sb.append(" #");
        this.x2.setText(jb6.a0(null, null, 2131749766, kt6.m(A1.num, ',', sb)));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(jb6.M0(2131749768, null));
        if (!z8c.h(this.a).p()) {
            spannableStringBuilder.append((CharSequence) " l");
            pn2 pn2Var = this.S2;
            if (pn2Var == null) {
                pn2Var = new pn2(R.drawable.msg_mini_lock3, 0);
                this.S2 = pn2Var;
            }
            spannableStringBuilder.setSpan(pn2Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        b61 b61Var = this.f2;
        b61Var.i(spannableStringBuilder, true, true);
        b61Var.g(null, true);
        b61Var.setOnClickListener(new lpa(this, (byte) 9));
        this.a2.setWearPreview(oc7.r1(this.a).a2(n));
        z2(2, true, null);
    }

    public final void T1(boolean z) {
        int i;
        k47 k47Var = this.C2;
        int i2 = 0;
        if (k47Var != null) {
            TLRPC.Message message = k47Var.k;
            if (message != null) {
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                    i = ((TLRPC.TL_messageActionStarGiftUnique) messageAction).can_craft_at;
                }
            }
            i = 0;
        } else {
            TL_stars.SavedStarGift savedStarGift = this.A2;
            if (savedStarGift != null) {
                i = savedStarGift.can_craft_at;
            }
            i = 0;
        }
        byte b = 1;
        if (i > ConnectionsManager.getInstance(this.a).getCurrentTime()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.J0, getContext());
            alertDialog$Builder.a.S = jb6.M0(2131749710, null);
            alertDialog$Builder.a.U = jb6.a0(null, null, 2131749711, jb6.x(i, true));
            b10.t(null, 2131747564, alertDialog$Builder, null);
            return;
        }
        TL_stars.TL_starGiftUnique A1 = A1();
        if (A1 == null) {
            return;
        }
        if (!TextUtils.isEmpty(A1.gift_address) && !oc7.r1(this.a).l4.w.f) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, this.J0, getContext());
            alertDialog$Builder2.a.S = jb6.M0(2131749725, null);
            alertDialog$Builder2.a.U = jb6.M0(2131749726, null);
            b10.t(null, 2131747564, alertDialog$Builder2, null);
            return;
        }
        if (z) {
            this.a2.N.a(this.a, A1.gift_id, A1.getDocument(), A1.title);
            if (f1()) {
                ura uraVar = this.a2.N;
                TL_stars.TL_starGiftUnique A12 = A1();
                if (A12 == null) {
                    uraVar.getClass();
                } else {
                    while (true) {
                        sra[] sraVarArr = uraVar.n;
                        if (i2 >= sraVarArr.length) {
                            break;
                        }
                        sra sraVar = sraVarArr[i2];
                        TL_stars.StarGift starGift = sraVar.h;
                        if (starGift == null) {
                            starGift = null;
                        }
                        if (starGift == null) {
                            sraVar.a(A12, true);
                            break;
                        }
                        i2++;
                    }
                    uraVar.d(true);
                }
            }
        }
        this.a2.N.setOnCraft(new spa(this, b));
        if (this.R2 == null) {
            xb9 xb9Var = new xb9(this.a, A1.gift_id);
            this.R2 = xb9Var;
            xb9Var.a();
        }
        this.a2.N.setOnAddGift(new vqa(this, A1, b));
        this.a2.N.setOnClose(new tqa(this, (byte) 2));
        z2(4, true, null);
    }

    @Override // mz0
    public final boolean U0() {
        return false;
    }

    public final void U1(long j) {
        byte b = 0;
        if (j <= 0 || !m9c.c(oc7.r1(this.a).X1(j))) {
            new ux4(getContext(), this.a, j, null, new qpa(this, b)).show();
        } else {
            j().Q(R.raw.error, 36, gm.S2(jb6.a0(null, null, 2131743429, pg3.s(j)))).k(false);
        }
    }

    public final void V1() {
        TL_stars.TL_starGiftUnique A1 = A1();
        byte b = 0;
        if (A1 == null || !A1.fixed_sale) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.J0, getContext());
            String M0 = jb6.M0(2131750197, null);
            he heVar = alertDialog$Builder.a;
            heVar.S = M0;
            heVar.U = jb6.M0(2131749599, null);
            alertDialog$Builder.j(jb6.M0(2131750365, null), new ypa(this, b));
            alertDialog$Builder.g(jb6.M0(2131752542, null), null);
            alertDialog$Builder.o();
            return;
        }
        if (h1()) {
            ms7 ms7Var = new ms7(this.a, this.J0, new wpa(this, r5, A1, (byte) 1), getContext());
            ms7[] ms7VarArr = {ms7Var};
            ok okVar = ok.b;
            long j = A1.getResellAmount(okVar).b;
            ms7Var.u1 = true;
            ms7Var.v1 = j;
            ms7Var.r1.setText(jb6.M0(2131750197, null));
            if (j > 0) {
                String b2 = nk.j(j, okVar).b();
                EditTextBoldCursor editTextBoldCursor = ms7Var.n1;
                InputFilter[] filters = editTextBoldCursor.getFilters();
                editTextBoldCursor.setFilters(new InputFilter[0]);
                ms7Var.w1 = true;
                editTextBoldCursor.setText(b2);
                ms7Var.w1 = false;
                editTextBoldCursor.setFilters(filters);
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            }
            ms7Var.D0(ms7Var.s1);
            ms7VarArr[0].show();
        }
    }

    public final void W1() {
        TL_stars.TL_starGiftUnique A1 = A1();
        if (h1()) {
            ms7[] ms7VarArr = new ms7[1];
            ms7VarArr[0] = new ms7(this.a, this.J0, new wpa(this, ms7VarArr, A1, (byte) 0), getContext());
            gs gsVar = oc7.r1(this.a).l4;
            ms7 ms7Var = ms7VarArr[0];
            boolean z = (A1 == null || !A1.onchain_sale) ? gsVar.t.f : A1.fixed_sale;
            ms7Var.x1 = z;
            if (!ms7Var.u1) {
                ms7Var.r1.setText(jb6.M0(z ? 2131749478 : 2131749465, null));
            }
            ms7Var.D0(ms7Var.s1);
            ms7VarArr[0].show();
        }
    }

    public final void X1() {
        TL_stars.TL_starGiftUnique A1 = A1();
        if (h1()) {
            Context context = getContext();
            int i = this.a;
            ylb ylbVar = this.J0;
            b61 b61Var = this.f2;
            Objects.requireNonNull(b61Var);
            ci7 ci7Var = new ci7(b61Var, (byte) 6);
            c41 j = j();
            npa npaVar = new npa(this, (byte) 9);
            if (A1 == null || TextUtils.isEmpty(A1.slug)) {
                return;
            }
            TL_stars.cancelStarGiftOnchainSale cancelstargiftonchainsale = new TL_stars.cancelStarGiftOnchainSale();
            cancelstargiftonchainsale.slug = A1.slug;
            fs7.o(context, i, cancelstargiftonchainsale, Boolean.valueOf(A1.fixed_sale), ylbVar, ci7Var, j, new e55(A1, context, i, ylbVar, fs7.h(A1), npaVar));
        }
    }

    public final void Y1(long j) {
        hg5 hg5Var = this.w3;
        if (hg5Var != null) {
            hg5Var.f(true);
            this.w3 = null;
        }
        dismiss();
        d S = LaunchActivity.S();
        if (S == null || m9c.C(j)) {
            return;
        }
        Bundle bundle = new Bundle();
        if (j > 0) {
            bundle.putLong("user_id", j);
            if (j == z8c.h(this.a).e()) {
                bundle.putBoolean("my_profile", true);
            }
        } else {
            bundle.putLong("chat_id", -j);
        }
        bundle.putBoolean("open_gifts", true);
        S.presentFragment(new ProfileActivity(bundle, null));
    }

    public final void Z1(boolean z, k11 k11Var, Runnable runnable) {
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        byte b = z ? (byte) 3 : (byte) 2;
        ci ciVar = new ci((Object) this, (Object) twoStepVerificationActivity, z, (byte) 12);
        twoStepVerificationActivity.a0 = b;
        twoStepVerificationActivity.c0 = ciVar;
        twoStepVerificationActivity.b0 = s1();
        twoStepVerificationActivity.x0(new hw9(this, runnable, k11Var, twoStepVerificationActivity));
    }

    public final void a1(TL_stars.StarGiftAttribute starGiftAttribute) {
        String M0;
        char c;
        hsa hsaVar;
        wsa wsaVar;
        TL_stars.StarGiftAttribute starGiftAttribute2;
        no8 no8Var;
        byte b = 0;
        if (starGiftAttribute instanceof TL_stars.starGiftAttributeModel) {
            M0 = jb6.M0(2131750320, null);
            c = 2;
        } else if (starGiftAttribute instanceof TL_stars.starGiftAttributePattern) {
            M0 = jb6.M0(2131750313, null);
            c = 1;
        } else {
            if (!(starGiftAttribute instanceof TL_stars.starGiftAttributeBackdrop)) {
                return;
            }
            M0 = jb6.M0(2131750321, null);
            c = 0;
        }
        if (!this.L2 && ((hsaVar = this.K2) == null || !hsaVar.o)) {
            boolean[] zArr = new boolean[1];
            x51[] x51VarArr = new x51[1];
            Integer[] numArr = new Integer[1];
            String z1 = z1(starGiftAttribute.rarity, numArr);
            if (starGiftAttribute.rarity instanceof TL_stars.TL_starGiftAttributeRarity) {
                wsaVar = this;
                starGiftAttribute2 = starGiftAttribute;
                no8Var = new no8((Object) wsaVar, (Object) zArr, (Object) starGiftAttribute2, (Object) x51VarArr, (byte) 24);
            } else {
                wsaVar = this;
                starGiftAttribute2 = starGiftAttribute;
                no8Var = null;
            }
            x51VarArr[0] = (x51) ((jhb) wsaVar.d2.e(M0, starGiftAttribute2.name, z1, no8Var, numArr[0]).getChildAt(1)).getChildAt(0);
            return;
        }
        msa msaVar = new msa(getContext(), this.J0, new spa(this, b));
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        mhb mhbVar = this.d2;
        tableRow.addView(new lhb(mhbVar, M0), layoutParams);
        tableRow.addView(new jhb(mhbVar, msaVar, true), new TableRow.LayoutParams(0, -1, 1.0f));
        mhbVar.addView(tableRow);
        hsa hsaVar2 = this.K2;
        if (hsaVar2 != null) {
            if (c == 0) {
                hsaVar2.d = msaVar;
            }
            if (c == 1) {
                hsaVar2.c = msaVar;
            }
            if (c == 2) {
                hsaVar2.b = msaVar;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a2() {
        int i;
        TLRPC.Message message;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        int i2;
        int i3;
        TLRPC.Message message2;
        TLRPC.Message message3;
        hg5 hg5Var = this.w3;
        if (hg5Var != null) {
            hg5Var.f(true);
            this.w3 = null;
        }
        if (w2()) {
            return;
        }
        k47 k47Var = this.C2;
        if (k47Var != null && (message3 = k47Var.k) != null) {
            TLRPC.MessageAction messageAction = message3.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                i = ((TLRPC.TL_messageActionStarGiftUnique) messageAction).can_transfer_at;
                if (i <= ConnectionsManager.getInstance(this.a).getCurrentTime()) {
                    Context context = getContext();
                    k47 k47Var2 = this.C2;
                    if (k47Var2 != null && (message2 = k47Var2.k) != null) {
                        TLRPC.MessageAction messageAction2 = message2.action;
                        if (messageAction2 instanceof TLRPC.TL_messageActionStarGiftUnique) {
                            i3 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction2).can_transfer_at;
                            v2(i3 - ConnectionsManager.getInstance(this.a).getCurrentTime(), context, false);
                            return;
                        }
                    }
                    TL_stars.SavedStarGift savedStarGift = this.A2;
                    i3 = savedStarGift != null ? savedStarGift.can_transfer_at : 0;
                    v2(i3 - ConnectionsManager.getInstance(this.a).getCurrentTime(), context, false);
                    return;
                }
                TL_stars.SavedStarGift savedStarGift2 = this.A2;
                if (savedStarGift2 != null) {
                    TL_stars.StarGift starGift = savedStarGift2.gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                        i2 = savedStarGift2.can_export_at;
                        TL_stars.TL_starGiftUnique tL_starGiftUnique2 = tL_starGiftUnique;
                        int currentTime = ConnectionsManager.getInstance(this.a).getCurrentTime();
                        int max = currentTime <= i2 ? 0 : Math.max(1, Math.round(Math.max(0, i2 - currentTime) / 86400.0f));
                        ww4 ww4Var = new ww4();
                        ww4Var.a = jb6.M0(2131749847, null);
                        ww4Var.c = true;
                        ww4Var.d = max;
                        ww4Var.e = new kh(this, currentTime, i2, max, r8, tL_starGiftUnique2);
                        Context context2 = getContext();
                        int i4 = this.a;
                        yw4 yw4Var = new yw4(context2, i4, false, ok0.a(i4).b(), null, ww4Var, this.J0);
                        yw4[] yw4VarArr = {yw4Var};
                        yw4Var.show();
                        return;
                    }
                }
                k47 k47Var3 = this.C2;
                if (k47Var3 == null || (message = k47Var3.k) == null) {
                    return;
                }
                TLRPC.MessageAction messageAction3 = message.action;
                if (messageAction3 instanceof TLRPC.TL_messageActionStarGiftUnique) {
                    TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction3;
                    TL_stars.StarGift starGift2 = tL_messageActionStarGiftUnique.gift;
                    if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                        tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift2;
                        i2 = tL_messageActionStarGiftUnique.can_export_at;
                        TL_stars.TL_starGiftUnique tL_starGiftUnique22 = tL_starGiftUnique;
                        int currentTime2 = ConnectionsManager.getInstance(this.a).getCurrentTime();
                        if (currentTime2 <= i2) {
                        }
                        ww4 ww4Var2 = new ww4();
                        ww4Var2.a = jb6.M0(2131749847, null);
                        ww4Var2.c = true;
                        ww4Var2.d = max;
                        ww4Var2.e = new kh(this, currentTime2, i2, max, yw4VarArr, tL_starGiftUnique22);
                        Context context22 = getContext();
                        int i42 = this.a;
                        yw4 yw4Var2 = new yw4(context22, i42, false, ok0.a(i42).b(), null, ww4Var2, this.J0);
                        yw4[] yw4VarArr2 = {yw4Var2};
                        yw4Var2.show();
                        return;
                    }
                    return;
                }
                return;
            }
        }
        TL_stars.SavedStarGift savedStarGift3 = this.A2;
        i = savedStarGift3 != null ? savedStarGift3.can_transfer_at : 0;
        if (i <= ConnectionsManager.getInstance(this.a).getCurrentTime()) {
        }
    }

    public final void b1(LinearLayout linearLayout, int i, int i2, int i3, String str, boolean z) {
        ImageView imageView = new ImageView(getContext());
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(i);
        ylb ylbVar = this.J0;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        anb.s(imageView, i3, ylbVar, mode);
        linearLayout.addView(imageView, qoe.t(i2, i2, 16, i2 < 15 ? 1 : 0, 0, i2 < 15 ? 1 : 0, 0));
        TextView textView = new TextView(getContext());
        textView.setTextSize(1, 13.0f);
        int i4 = cmb.q5;
        anb.X(textView, i4, this.J0);
        textView.setText(str);
        linearLayout.addView(textView, qoe.t(-2, -2, 16, 4, 0, 0, 0));
        if (z) {
            ImageView imageView2 = new ImageView(getContext());
            imageView2.setScaleType(scaleType);
            imageView2.setImageResource(R.drawable.msg_mini_topicarrow);
            anb.s(imageView2, i4, this.J0, mode);
            linearLayout.addView(imageView2, qoe.t(11, 11, 16, 5, 0, 2, 0));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b2(long j, long j2, SpannableStringBuilder spannableStringBuilder, boolean z, qac qacVar) {
        String str;
        TLRPC.Chat chat;
        SpannableStringBuilder S2;
        TL_stars.TL_starGiftUnique A1 = A1();
        if (A1 == null) {
            return;
        }
        int i = this.a;
        if (j >= 0) {
            TLRPC.User W1 = oc7.r1(i).W1(Long.valueOf(j));
            str = m9c.l(W1);
            chat = W1;
        } else {
            TLRPC.Chat L0 = oc7.r1(i).L0(Long.valueOf(-j));
            if (L0 == null) {
                str = "";
                chat = L0;
            } else {
                str = L0.title;
                chat = L0;
            }
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.addView(new wra(getContext(), A1, chat), qoe.t(-1, -2, 48, 0, -4, 0, 0));
        TextView textView = new TextView(getContext());
        anb.X(textView, cmb.i5, this.J0);
        textView.setTextSize(1, 16.0f);
        byte b = 2;
        if (spannableStringBuilder != null) {
            S2 = spannableStringBuilder;
        } else {
            S2 = gm.S2(j2 > 0 ? jb6.K("Gift2TransferPriceText", (int) j2, ',', s1(), pg3.s(j)) : jb6.a0(null, null, 2131749846, s1(), str));
        }
        textView.setText(S2);
        linearLayout.addView(textView, qoe.t(-1, -2, 48, 24, 4, 24, 4));
        mhb mhbVar = new mhb(getContext(), this.J0);
        Z0(mhbVar, jva.i(A1.attributes, TL_stars.starGiftAttributeModel.class));
        Z0(mhbVar, jva.i(A1.attributes, TL_stars.starGiftAttributeBackdrop.class));
        Z0(mhbVar, jva.i(A1.attributes, TL_stars.starGiftAttributePattern.class));
        if (!TextUtils.isEmpty(A1.slug) && (A1.flags & 256) != 0) {
            cj0.h();
            mhbVar.f(jb6.M0(2131749365, null), b10.h("~", cj0.f(A1.value_currency, cj0.h().g(A1.value_currency), A1.value_amount, true)), null, null);
        }
        linearLayout.addView(mhbVar, qoe.t(-1, -2, 48, 23, 16, 23, 4));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.J0, getContext());
        alertDialog$Builder.n(linearLayout);
        alertDialog$Builder.j(j2 > 0 ? nxa.T0(jb6.a0(null, null, 2131749853, Integer.valueOf((int) j2))) : jb6.M0(2131749854, null), new a72(qacVar, b));
        alertDialog$Builder.g(jb6.M0(2131752542, null), null);
        he heVar = alertDialog$Builder.a;
        heVar.Y0 = z;
        heVar.show();
    }

    public final void c1(TL_stars.InputSavedStarGift inputSavedStarGift, TLRPC.Updates updates, Runnable runnable) {
        TLRPC.Message message;
        TL_stars.StarGift starGift;
        if (updates == null) {
            jva.v(this.a, false).M(q1());
            dismiss();
            return;
        }
        TLRPC.Update update = updates.update;
        if (update instanceof TL_update.TL_updateNewMessage) {
            message = ((TL_update.TL_updateNewMessage) update).message;
        } else {
            if (updates.updates != null) {
                for (int i = 0; i < updates.updates.size(); i++) {
                    TLRPC.Update update2 = updates.updates.get(i);
                    if (update2 instanceof TL_update.TL_updateNewMessage) {
                        message = ((TL_update.TL_updateNewMessage) update2).message;
                        break;
                    }
                }
            }
            message = null;
        }
        if (message == null) {
            jva.v(this.a, false).M(q1());
            dismiss();
            return;
        }
        TL_stars.SavedStarGift savedStarGift = this.A2;
        if (savedStarGift != null && (!(inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftUser) ? !(!(inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftChat) ? !(inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftSlug) || (starGift = savedStarGift.gift) == null || !TextUtils.equals(starGift.slug, ((TL_stars.TL_inputSavedStarGiftSlug) inputSavedStarGift).slug) : savedStarGift.saved_id != ((TL_stars.TL_inputSavedStarGiftChat) inputSavedStarGift).saved_id) : savedStarGift.msg_id == ((TL_stars.TL_inputSavedStarGiftUser) inputSavedStarGift).msg_id)) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                this.L2 = true;
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                TL_stars.SavedStarGift savedStarGift2 = this.A2;
                savedStarGift2.gift = tL_messageActionStarGiftUnique.gift;
                int i2 = savedStarGift2.flags | 8;
                savedStarGift2.msg_id = message.id;
                savedStarGift2.flags = i2 & (-2049);
                savedStarGift2.saved_id = 0L;
                savedStarGift2.unsaved = !tL_messageActionStarGiftUnique.saved;
                savedStarGift2.refunded = tL_messageActionStarGiftUnique.refunded;
                savedStarGift2.can_upgrade = false;
                savedStarGift2.can_resell_at = tL_messageActionStarGiftUnique.can_resell_at;
                savedStarGift2.can_transfer_at = tL_messageActionStarGiftUnique.can_transfer_at;
                savedStarGift2.can_export_at = tL_messageActionStarGiftUnique.can_export_at;
                n2(savedStarGift2, this.B2);
                this.m3 = null;
                this.L2 = false;
                bva bvaVar = this.B2;
                if (bvaVar != null) {
                    bvaVar.d();
                } else {
                    jva.v(this.a, false).M(this.S1);
                }
                gm.c3(runnable);
                return;
            }
        }
        if (this.B2 == null) {
            jva.v(this.a, false).M(q1());
        }
        this.L2 = true;
        this.A2 = null;
        this.z2 = false;
        k47 k47Var = new k47(this.a, message, false, false);
        k47Var.K5();
        l2(k47Var, this.B2);
        this.m3 = null;
        this.L2 = false;
        gm.c3(runnable);
    }

    public final void c2(long j, qac qacVar) {
        TLRPC.Message message;
        long j2;
        TL_stars.SavedStarGift savedStarGift = this.A2;
        if (savedStarGift == null || !(savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
            k47 k47Var = this.C2;
            if (k47Var == null || (message = k47Var.k) == null) {
                return;
            }
            TLRPC.MessageAction messageAction = message.action;
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                return;
            }
            TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
            if (!(tL_messageActionStarGiftUnique.gift instanceof TL_stars.TL_starGiftUnique)) {
                return;
            } else {
                j2 = tL_messageActionStarGiftUnique.transfer_stars;
            }
        } else {
            j2 = savedStarGift.transfer_stars;
        }
        b2(j, j2, null, true, qacVar);
    }

    public final void d1(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z, fw4 fw4Var) {
        c41 j2;
        bva bvaVar = this.B2;
        if (fw4Var != null) {
            dy0 dy0Var = fw4Var.c;
            gm.t1(dy0Var.findFocus());
            j2 = new c41(dy0Var, this.J0);
        } else {
            j2 = j();
        }
        fs7.d(getContext(), this.a, tL_starGiftUnique, j, tL_textWithEntities, !z, this.J0, new ts9(this, fw4Var, (byte) 8), j2, new e6a((Object) this, (Object) fw4Var, (byte) 14), new e6a((Object) bvaVar, (Object) tL_starGiftUnique, (byte) 15));
    }

    public final void d2() {
        TL_stars.InputSavedStarGift u1;
        long j;
        long j2;
        long j3;
        boolean z;
        boolean z2;
        boolean z3;
        String str;
        boolean z4;
        hg5 hg5Var = this.w3;
        if (hg5Var != null) {
            hg5Var.f(true);
            this.w3 = null;
        }
        if (this.X2 != null || (u1 = u1()) == null) {
            return;
        }
        k47 k47Var = this.C2;
        long j4 = this.S1;
        if (k47Var != null) {
            TLRPC.MessageAction messageAction = k47Var.k.action;
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGift)) {
                return;
            }
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
            j2 = tL_messageActionStarGift.gift.id;
            j3 = tL_messageActionStarGift.upgrade_stars;
            z = tL_messageActionStarGift.name_hidden;
            TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageActionStarGift.message;
            z2 = (tL_textWithEntities == null || TextUtils.isEmpty(tL_textWithEntities.text)) ? false : true;
            j = 0;
            z3 = tL_messageActionStarGift.peer instanceof TLRPC.TL_peerChannel;
            str = tL_messageActionStarGift.prepaid_upgrade_hash;
            z4 = tL_messageActionStarGift.prepaid_upgrade ? pg3.n(tL_messageActionStarGift.from_id) != this.C2.Z0() : tL_messageActionStarGift.upgrade_separate;
        } else {
            j = 0;
            TL_stars.SavedStarGift savedStarGift = this.A2;
            if (savedStarGift == null) {
                return;
            }
            TL_stars.StarGift starGift = savedStarGift.gift;
            j2 = starGift.id;
            j3 = savedStarGift.upgrade_stars;
            z = (starGift instanceof TL_stars.TL_starGift) && savedStarGift.name_hidden;
            TLRPC.TL_textWithEntities tL_textWithEntities2 = savedStarGift.message;
            z2 = (tL_textWithEntities2 == null || TextUtils.isEmpty(tL_textWithEntities2.text)) ? false : true;
            z3 = j4 < 0;
            TL_stars.SavedStarGift savedStarGift2 = this.A2;
            str = savedStarGift2.prepaid_upgrade_hash;
            z4 = savedStarGift2.upgrade_separate;
        }
        TextView textView = this.s2;
        if (z) {
            textView.setText(jb6.M0(z3 ? 2131750331 : 2131750332, null));
        } else if (z2) {
            textView.setText(jb6.M0(2131750329, null));
        } else {
            textView.setText(jb6.M0(2131750330, null));
        }
        boolean z5 = (z || j3 <= j || z4) ? false : true;
        jh2 jh2Var = this.r2;
        jh2Var.a(z5, false);
        if (this.m3 == null) {
            jva.v(this.a, false).H(j2, new qpa(this, (byte) 2));
        } else if (j3 > j || this.q3 != null) {
            e2();
            return;
        }
        if (j3 > j || this.q3 != null) {
            return;
        }
        this.p3 = true;
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        if (TextUtils.isEmpty(str)) {
            TLRPC.TL_inputInvoiceStarGiftUpgrade tL_inputInvoiceStarGiftUpgrade = new TLRPC.TL_inputInvoiceStarGiftUpgrade();
            tL_inputInvoiceStarGiftUpgrade.keep_original_details = jh2Var.a.q;
            tL_inputInvoiceStarGiftUpgrade.stargift = u1;
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftUpgrade;
        } else {
            TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade tL_inputInvoiceStarGiftPrepaidUpgrade = new TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade();
            tL_inputInvoiceStarGiftPrepaidUpgrade.hash = str;
            tL_inputInvoiceStarGiftPrepaidUpgrade.peer = oc7.r1(this.a).i1(j4);
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftPrepaidUpgrade;
        }
        JSONObject u = wx0.u(this.J0, false);
        if (u != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = u.toString();
            tL_payments_getPaymentForm.flags |= 1;
        }
        ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getPaymentForm, new xqa(this, (byte) 0));
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = nm7.I3;
        ssa ssaVar = this.a2;
        if (i != i3) {
            if (i == nm7.e4) {
                ssaVar.setInWallet(this.d3 == null && this.a3 == null && x2(A1()));
                return;
            }
            return;
        }
        if (this.B2 == ((ava) objArr[1])) {
            ura uraVar = ssaVar.N;
            if (uraVar == null || !uraVar.i0) {
                C2();
            }
        }
    }

    @Override // my0, android.app.Dialog, android.content.DialogInterface, ah0
    public final void dismiss() {
        if (this.W2.c(4) && this.a2.N.i0) {
            return;
        }
        xb9 xb9Var = this.R2;
        if (xb9Var != null) {
            xb9Var.b();
            this.R2 = null;
        }
        hsa hsaVar = this.K2;
        if (hsaVar != null) {
            hsaVar.a();
        }
        super.dismiss();
    }

    public final boolean e1() {
        TLRPC.Peer peer;
        if (u1() == null) {
            return false;
        }
        k47 k47Var = this.C2;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        if (k47Var != null) {
            TLRPC.MessageAction messageAction = k47Var.k.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                return ((!(tL_messageActionStarGift.peer != null) && (!k47Var.O3() || ((k47.B0(this.C2.k) > z8c.h(this.a).e() ? 1 : (k47.B0(this.C2.k) == z8c.h(this.a).e() ? 0 : -1)) == 0))) || ((peer = tL_messageActionStarGift.peer) != null && G1(this.a, pg3.n(peer)))) && !tL_messageActionStarGift.converted && tL_messageActionStarGift.convert_stars > 0 && ((int) oc7.r1(this.a).l4.v3.g(timeUnit)) - (ConnectionsManager.getInstance(this.a).getCurrentTime() - this.C2.k.date) > 0;
            }
        } else {
            TL_stars.SavedStarGift savedStarGift = this.A2;
            if (savedStarGift != null) {
                int g = ((int) oc7.r1(this.a).l4.v3.g(timeUnit)) - (ConnectionsManager.getInstance(this.a).getCurrentTime() - savedStarGift.date);
                int i = this.a;
                long j = this.S1;
                if (G1(i, j)) {
                    int i2 = this.A2.flags;
                    if (((j < 0 ? 2048 : 8) & i2) != 0 && (i2 & 16) != 0 && (i2 & 2) != 0 && g > 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0031, code lost:
    
        if (android.text.TextUtils.isEmpty(r1.prepaid_upgrade_hash) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (android.text.TextUtils.isEmpty(r1.prepaid_upgrade_hash) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0033, code lost:
    
        r1 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e2() {
        long j;
        boolean z;
        boolean z2;
        byte b;
        int i;
        String M0;
        String M02;
        TL_stars.StarGiftUpgradePrice starGiftUpgradePrice;
        k47 k47Var = this.C2;
        if (k47Var != null) {
            TLRPC.MessageAction messageAction = k47Var.k.action;
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGift)) {
                return;
            }
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
            j = tL_messageActionStarGift.upgrade_stars;
            if (j <= 0) {
            }
            z = false;
        } else {
            TL_stars.SavedStarGift savedStarGift = this.A2;
            if (savedStarGift == null) {
                return;
            }
            j = savedStarGift.upgrade_stars;
            if (j <= 0) {
            }
            z = false;
        }
        if (this.m3 != null) {
            if (j > 0 || this.q3 != null) {
                long j2 = 0;
                if (this.q3 != null) {
                    for (int i2 = 0; i2 < this.q3.invoice.prices.size(); i2++) {
                        j2 += this.q3.invoice.prices.get(i2).amount;
                    }
                }
                hsa hsaVar = this.K2;
                ssa ssaVar = this.a2;
                if (hsaVar == null) {
                    hsaVar = new hsa(ssaVar);
                    this.K2 = hsaVar;
                }
                ArrayList arrayList = this.m3;
                ssa ssaVar2 = hsaVar.a;
                ArrayList arrayList2 = hsaVar.g;
                ArrayList arrayList3 = hsaVar.f;
                ArrayList arrayList4 = hsaVar.e;
                int size = arrayList4.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList4.get(i3);
                    i3++;
                    ((fsa) obj).a();
                }
                arrayList4.clear();
                arrayList3.clear();
                arrayList2.clear();
                ArrayList j3 = jva.j(arrayList, TL_stars.starGiftAttributeModel.class);
                int size2 = j3.size();
                int i4 = 0;
                while (i4 < size2) {
                    Object obj2 = j3.get(i4);
                    i4++;
                    fsa fsaVar = new fsa(ssaVar2.c, (TL_stars.starGiftAttributeModel) obj2);
                    if (ssaVar2.isAttachedToWindow() && fsaVar.c) {
                        fsaVar.d.I();
                    }
                    arrayList4.add(fsaVar);
                }
                ArrayList j4 = jva.j(arrayList, TL_stars.starGiftAttributeBackdrop.class);
                int size3 = j4.size();
                int i5 = 0;
                while (i5 < size3) {
                    Object obj3 = j4.get(i5);
                    i5++;
                    arrayList3.add(new esa((TL_stars.starGiftAttributeBackdrop) obj3));
                }
                ArrayList j5 = jva.j(arrayList, TL_stars.starGiftAttributePattern.class);
                int size4 = j5.size();
                int i6 = 0;
                while (i6 < size4) {
                    Object obj4 = j5.get(i6);
                    i6++;
                    arrayList2.add(new gsa((TL_stars.starGiftAttributePattern) obj4));
                }
                ssaVar.setPreviewingAttributes(this.m3);
                long j6 = this.S1;
                if (z) {
                    z2 = true;
                    ssaVar.i(1, jb6.M0(2131749995, null), jb6.a0(null, null, 2131749996, pg3.r(this.a, j6)), null);
                } else {
                    z2 = true;
                    ssaVar.i(1, jb6.M0(2131749784, null), jb6.M0(2131749785, null), null);
                }
                b61 b61Var = this.f2;
                b61Var.setFilled(z2);
                b61Var.g(null, z2);
                if (j2 > 0) {
                    int currentTime = ConnectionsManager.getInstance(this.a).getCurrentTime();
                    if (this.o3 != null) {
                        for (int i7 = 0; i7 < this.o3.size(); i7++) {
                            starGiftUpgradePrice = (TL_stars.StarGiftUpgradePrice) this.o3.get(i7);
                            if (starGiftUpgradePrice.date >= currentTime) {
                                break;
                            }
                        }
                    }
                    starGiftUpgradePrice = null;
                    ArrayList arrayList5 = this.n3;
                    FrameLayout frameLayout = this.i2;
                    if (arrayList5 == null || starGiftUpgradePrice == null || arrayList5.isEmpty()) {
                        frameLayout.setVisibility(8);
                    } else {
                        frameLayout.setVisibility(0);
                        this.h2.setText(gm.E2(gm.N2("**" + jb6.M0(2131749803, null) + "**", -1, 0, new npa(this, (byte) 5), null), false, gm.L(0.6666667f), gm.L(0.66f)));
                    }
                    B2();
                    pn2[] pn2VarArr = this.r3;
                    if (z) {
                        b61Var.i(nxa.U0(jb6.a0(null, null, 2131750000, Long.valueOf(j2)), 1.13f, pn2VarArr), true, true);
                    } else {
                        b61Var.i(nxa.U0(jb6.a0(null, null, 2131749810, Long.valueOf(j2)), 1.13f, pn2VarArr), true, true);
                    }
                } else {
                    b61Var.i(jb6.M0(2131751754, null), true, true);
                }
                b61Var.setOnClickListener(new lpa(this, (byte) 12));
                View view = this.p2;
                ac[] acVarArr = this.o2;
                LinearLayout linearLayout = this.q2;
                if (z) {
                    linearLayout.setVisibility(8);
                    view.setVisibility(8);
                    ac acVar = acVarArr[0];
                    String M03 = jb6.M0(2131749798, null);
                    if (z) {
                        i = 1;
                        b = 2;
                        M0 = jb6.a0(null, null, 2131749999, pg3.r(this.a, j6));
                    } else {
                        i = 1;
                        b = 2;
                        M0 = jb6.M0(2131749800, null);
                    }
                    acVar.a(R.drawable.menu_feature_unique, M03, M0);
                    ac acVar2 = acVarArr[i];
                    String M04 = jb6.M0(2131749795, null);
                    if (z) {
                        Object[] objArr = new Object[i];
                        objArr[0] = pg3.r(this.a, j6);
                        M02 = jb6.a0(null, null, 2131749998, objArr);
                    } else {
                        M02 = jb6.M0(2131749797, null);
                    }
                    acVar2.a(R.drawable.menu_feature_transfer, M04, M02);
                    acVarArr[b].a(R.drawable.menu_feature_tradable, jb6.M0(2131749792, null), z ? jb6.a0(null, null, 2131749997, pg3.r(this.a, j6)) : jb6.M0(2131749794, null));
                } else {
                    b = 2;
                    linearLayout.setVisibility(0);
                    view.setVisibility(0);
                    acVarArr[0].a(R.drawable.menu_feature_unique, jb6.M0(2131749798, null), jb6.M0(2131749349, null));
                    acVarArr[1].a(R.drawable.menu_feature_tradable, jb6.M0(2131749792, null), jb6.M0(2131749347, null));
                    acVarArr[2].a(R.drawable.menu_wear, jb6.M0(2131749344, null), jb6.M0(2131749345, null));
                }
                gm.c3(new ppa(this, j2, b));
            }
        }
    }

    public final boolean f1() {
        int i;
        TL_stars.TL_starGiftUnique A1 = A1();
        if (A1 == null || A1.crafted || fs7.m(A1) || !G1(this.a, pg3.n(A1.owner_id))) {
            return false;
        }
        k47 k47Var = this.C2;
        if (k47Var == null) {
            TL_stars.SavedStarGift savedStarGift = this.A2;
            if (savedStarGift != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
                i = savedStarGift.can_craft_at;
            }
        }
        TLRPC.Message message = k47Var.k;
        if (message == null) {
            return false;
        }
        TLRPC.MessageAction messageAction = message.action;
        if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
            return false;
        }
        i = ((TLRPC.TL_messageActionStarGiftUnique) messageAction).can_craft_at;
        return i > 0 && ConnectionsManager.getInstance(this.a).getCurrentTime() >= i;
    }

    public final void f2() {
        TL_stars.TL_starGiftUnique A1 = A1();
        if (w2() || E2() == null || A1 == null || TextUtils.isEmpty(A1.slug)) {
            return;
        }
        ww4 ww4Var = new ww4();
        ww4Var.a = jb6.M0(2131749847, null);
        ww4Var.b = true;
        ww4Var.e = new ts9(this, r1, (byte) 10);
        Context context = getContext();
        int i = this.a;
        yw4 yw4Var = new yw4(context, i, false, ok0.a(i).b(), null, ww4Var, this.J0);
        yw4[] yw4VarArr = {yw4Var};
        yw4Var.show();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0098 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g1() {
        if (this.a3 == null && u1() != null) {
            k47 k47Var = this.C2;
            if (k47Var != null) {
                TLRPC.Message message = k47Var.k;
                if (message != null) {
                    TLRPC.MessageAction messageAction = message.action;
                    if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                        TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                        TL_stars.StarGift starGift = tL_messageActionStarGift.gift;
                        if ((starGift instanceof TL_stars.TL_starGift) && !starGift.limited && starGift.availability_total <= 0 && !starGift.auction && !tL_messageActionStarGift.converted && !tL_messageActionStarGift.upgraded && !tL_messageActionStarGift.refunded && tL_messageActionStarGift.convert_stars > 0) {
                            boolean O3 = k47Var.O3();
                            boolean z = k47.B0(this.C2.k) == z8c.h(this.a).e();
                            TLRPC.Peer peer = tL_messageActionStarGift.peer;
                            if (peer != null) {
                                return G1(this.a, pg3.n(peer));
                            }
                            if (!O3 || z) {
                                return true;
                            }
                        }
                    }
                }
            } else {
                TL_stars.SavedStarGift savedStarGift = this.A2;
                if (savedStarGift != null) {
                    TL_stars.StarGift starGift2 = savedStarGift.gift;
                    if (!(starGift2 instanceof TL_stars.TL_starGift) || starGift2.limited || starGift2.availability_total > 0 || starGift2.auction || savedStarGift.refunded || !G1(this.a, this.S1)) {
                    }
                }
            }
        }
        return false;
    }

    public final boolean h1() {
        TL_stars.TL_starGiftUnique A1 = A1();
        if (A1 == null || TextUtils.isEmpty(A1.slug)) {
            return false;
        }
        if (this.a3 == null && !H1(A1) && !E1(A1) && (!fs7.u(A1) || !F1(this.a, pg3.n(A1.owner_id)))) {
            return false;
        }
        gs gsVar = oc7.r1(this.a).l4;
        if (gsVar.n0.f) {
            return gsVar.s.f || gsVar.t.f || H1(A1);
        }
        return false;
    }

    public final SpannableStringBuilder h2(TLRPC.Peer peer) {
        if (peer != null) {
            String q = pg3.q(oc7.r1(this.a).a2(pg3.n(peer)));
            if (!TextUtils.isEmpty(q)) {
                return gm.N2(jb6.a0(null, null, 2131749976, b10.h("@", q)), -1, 0, new nqa(this, q, (byte) 8), null);
            }
        }
        return null;
    }

    public final void i1() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.J0, getContext());
        String M0 = jb6.M0(2131750199, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        heVar.U = jb6.M0(2131750200, null);
        TL_stars.TL_starGiftUnique A1 = A1();
        if (A1 != null && !TextUtils.isEmpty(A1.slug)) {
            alertDialog$Builder.j(jb6.M0(2131747538, null), new uqa(this, A1, (byte) 1));
        }
        wi8.y(null, 2131752542, alertDialog$Builder, null);
    }

    public final SpannableStringBuilder i2(TL_stars.StarGift starGift) {
        if (starGift == null || (starGift instanceof TL_stars.TL_starGiftUnique)) {
            return null;
        }
        return h2(starGift.released_by);
    }

    @Override // my0, ah0
    public c41 j() {
        return new c41(this.k2, this.J0);
    }

    public final void j1(long j, TL_stars.starGiftDepositPayload stargiftdepositpayload, long j2, k11 k11Var, yw4 yw4Var) {
        TL_wallet.nftItem E2 = E2();
        TL_stars.TL_starGiftUnique A1 = A1();
        if (E2 == null || A1 == null || TextUtils.isEmpty(A1.slug)) {
            return;
        }
        byte b = 0;
        boolean z = this.a3 != null;
        String s1 = s1();
        k11Var.d();
        hqa hqaVar = new hqa(this, j2, k11Var, j, A1, E2, yw4Var, z, s1);
        if (stargiftdepositpayload != null) {
            hqaVar.a(stargiftdepositpayload);
            return;
        }
        TL_stars.depositStarGift depositstargift = new TL_stars.depositStarGift();
        depositstargift.peer = oc7.r1(this.a).i1(j);
        depositstargift.slug = A1.slug;
        ConnectionsManager.getInstance(this.a).sendRequestTyped(depositstargift, new kc(b), new nv0((Object) this, (Object) k11Var, (Object) yw4Var, (Object) hqaVar, (byte) 15));
    }

    public final void k1(long j, qac qacVar) {
        TLRPC.Message message;
        long n;
        long j2;
        TL_stars.InputSavedStarGift u1 = u1();
        if (u1 != null) {
            TL_stars.SavedStarGift savedStarGift = this.A2;
            if (savedStarGift == null || !(savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
                k47 k47Var = this.C2;
                if (k47Var == null || (message = k47Var.k) == null) {
                    return;
                }
                TLRPC.MessageAction messageAction = message.action;
                if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                    return;
                }
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                n = pg3.n(tL_messageActionStarGiftUnique.gift.owner_id);
                j2 = tL_messageActionStarGiftUnique.transfer_stars;
            } else {
                j2 = savedStarGift.transfer_stars;
                n = this.S1;
            }
            long j3 = n;
            if (j2 <= 0) {
                TL_stars.transferStarGift transferstargift = new TL_stars.transferStarGift();
                transferstargift.stargift = u1;
                transferstargift.to_id = oc7.r1(this.a).i1(j);
                ConnectionsManager.getInstance(this.a).sendRequest(transferstargift, new qp6(this, qacVar, j, j3, (byte) 2));
                return;
            }
            jva v = jva.v(this.a, false);
            if (!v.e) {
                v.o(new nz8((Object) this, (Object) v, j, (Object) qacVar, (byte) 3));
                return;
            }
            TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer = new TLRPC.TL_inputInvoiceStarGiftTransfer();
            tL_inputInvoiceStarGiftTransfer.stargift = u1;
            tL_inputInvoiceStarGiftTransfer.to_id = oc7.r1(this.a).i1(j);
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftTransfer;
            JSONObject u = wx0.u(this.J0, false);
            if (u != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = u.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getPaymentForm, new w95(this, tL_inputInvoiceStarGiftTransfer, j, j3, qacVar));
        }
    }

    public final void l1() {
        TL_stars.InputSavedStarGift u1;
        long j;
        b61 b61Var = this.f2;
        if (b61Var.R || (u1 = u1()) == null) {
            return;
        }
        k47 k47Var = this.C2;
        String str = null;
        long j2 = 0;
        if (k47Var != null) {
            TLRPC.MessageAction messageAction = k47Var.k.action;
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGift)) {
                return;
            }
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
            j = tL_messageActionStarGift.upgrade_stars;
            if (j <= 0) {
                str = tL_messageActionStarGift.prepaid_upgrade_hash;
            }
        } else {
            TL_stars.SavedStarGift savedStarGift = this.A2;
            if (savedStarGift == null) {
                return;
            }
            j = savedStarGift.upgrade_stars;
            if (j <= 0) {
                str = savedStarGift.prepaid_upgrade_hash;
            }
        }
        if (j > 0 || this.q3 != null) {
            b61Var.setLoading(true);
            jh2 jh2Var = this.r2;
            if (j > 0) {
                TL_stars.upgradeStarGift upgradestargift = new TL_stars.upgradeStarGift();
                upgradestargift.keep_original_details = jh2Var.a.q;
                upgradestargift.stargift = u1;
                ConnectionsManager.getInstance(this.a).sendRequest(upgradestargift, new jl7(this, u1, (byte) 29));
                return;
            }
            int i = 0;
            jva v = jva.v(this.a, false);
            if (!v.e) {
                v.o(new e6a((Object) this, (Object) v, (byte) 17));
                return;
            }
            TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
            tL_payments_sendStarsForm.form_id = this.q3.form_id;
            if (TextUtils.isEmpty(str)) {
                TLRPC.TL_inputInvoiceStarGiftUpgrade tL_inputInvoiceStarGiftUpgrade = new TLRPC.TL_inputInvoiceStarGiftUpgrade();
                tL_inputInvoiceStarGiftUpgrade.keep_original_details = jh2Var.a.q;
                tL_inputInvoiceStarGiftUpgrade.stargift = u1;
                tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftUpgrade;
            } else {
                TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade tL_inputInvoiceStarGiftPrepaidUpgrade = new TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade();
                tL_inputInvoiceStarGiftPrepaidUpgrade.hash = str;
                tL_inputInvoiceStarGiftPrepaidUpgrade.peer = oc7.r1(this.a).i1(this.S1);
                tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftPrepaidUpgrade;
            }
            ArrayList<TLRPC.TL_labeledPrice> arrayList = this.q3.invoice.prices;
            int size = arrayList.size();
            while (i < size) {
                TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i);
                i++;
                j2 += tL_labeledPrice.amount;
            }
            ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_sendStarsForm, new eu0((Object) this, (Object) str, (Object) u1, j2, (byte) 5));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:318:0x0366, code lost:
    
        if (G1(r60.a, pg3.n(r12)) != false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x0379, code lost:
    
        if (r8 > 0) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x03c5, code lost:
    
        if (r37 == false) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x03c7, code lost:
    
        if (r48 == false) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x03cb, code lost:
    
        if (r27 <= 0) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x03cd, code lost:
    
        r7 = null;
        r1 = jb6.a0(null, null, 2131750098, r35);
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x03de, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x03e2, code lost:
    
        if (r30 == false) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x03e4, code lost:
    
        if (r25 != false) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x03e6, code lost:
    
        r1 = jb6.a0(null, null, 2131750076, r35);
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x03f3, code lost:
    
        if (r25 == false) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x03f5, code lost:
    
        r1 = "Gift2InfoOutConverted";
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x03fa, code lost:
    
        r1 = jb6.K(r1, (int) r9, ',', r35);
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x0408, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x03f8, code lost:
    
        r1 = "Gift2InfoOut";
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x040b, code lost:
    
        if (r25 == false) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x040d, code lost:
    
        if (r39 == false) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x040f, code lost:
    
        r1 = "Gift2InfoChannelConverted";
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x041c, code lost:
    
        r1 = jb6.H(',', r1, (int) r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x0412, code lost:
    
        r1 = "Gift2InfoConverted";
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x0415, code lost:
    
        if (r39 == false) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x0417, code lost:
    
        r1 = "Gift2Info3Channel";
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x041a, code lost:
    
        r1 = "Gift2Info3";
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x03c3, code lost:
    
        if (r2 > 0) goto L179;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x07ab  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x078e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x07a8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x07b1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x07c0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0892  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0964  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x08c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x07de  */
    /* JADX WARN: Type inference failed for: r7v59 */
    /* JADX WARN: Type inference failed for: r7v60, types: [lhb[], pn2[], x51[]] */
    /* JADX WARN: Type inference failed for: r7v61 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l2(k47 k47Var, bva bvaVar) {
        long j;
        TLRPC.Peer peer;
        boolean z;
        boolean z2;
        TL_stars.StarGift starGift;
        TLRPC.Peer peer2;
        long j2;
        long j3;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        int i;
        boolean z3;
        boolean z4;
        boolean z5;
        TLRPC.Peer peer3;
        boolean z6;
        String str;
        boolean z7;
        boolean z8;
        String M0;
        TLRPC.TL_textWithEntities tL_textWithEntities2;
        b61 b61Var;
        boolean z9;
        String str2;
        String str3;
        char c;
        CharSequence charSequence;
        int i2;
        CharSequence concat;
        mhb mhbVar;
        TLRPC.TL_textWithEntities tL_textWithEntities3;
        b61 b61Var2;
        boolean z10;
        String str4;
        int i3;
        boolean z11;
        TL_stars.StarGift starGift2;
        TLRPC.Document document;
        boolean z12;
        boolean z13;
        boolean z14;
        int i4;
        CharSequence charSequence2;
        String M02;
        ?? r7;
        CharSequence charSequence3;
        String str5;
        String M03;
        hsa hsaVar;
        String str6;
        String str7;
        boolean z15;
        float f;
        float f2;
        String M04;
        l66 l66Var;
        int i5;
        TLObject a2;
        boolean z16;
        hsa hsaVar2;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        TL_stars.InputSavedStarGift u1;
        if (k47Var == null || k47Var.k == null) {
            return;
        }
        this.z2 = false;
        this.A2 = null;
        this.C2 = k47Var;
        this.B2 = bvaVar;
        this.Z1.set(k47Var);
        long e = z8c.h(this.a).e();
        boolean z17 = k47.B0(k47Var.k) == e;
        TLRPC.MessageAction messageAction = k47Var.k.action;
        boolean z18 = messageAction instanceof TLRPC.TL_messageActionStarGift;
        byte b = 3;
        ssa ssaVar = this.a2;
        b61 b61Var3 = this.f2;
        if (!z18) {
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                return;
            }
            if (!(((TLRPC.TL_messageActionStarGiftUnique) messageAction).gift instanceof TL_stars.TL_starGift)) {
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                if (tL_messageActionStarGiftUnique.gift instanceof TL_stars.TL_starGiftUnique) {
                    if (tL_messageActionStarGiftUnique.name_hidden) {
                        a2 = null;
                    } else {
                        oc7 r1 = oc7.r1(this.a);
                        TLRPC.Peer peer4 = tL_messageActionStarGiftUnique.from_id;
                        a2 = r1.a2(peer4 != null ? pg3.n(peer4) : k47Var.Z0());
                    }
                    TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) tL_messageActionStarGiftUnique.gift;
                    z14 = tL_messageActionStarGiftUnique.refunded;
                    o2(tL_starGiftUnique2, z14, a2, tL_messageActionStarGiftUnique.message);
                    z12 = tL_messageActionStarGiftUnique.saved;
                    starGift = tL_messageActionStarGiftUnique.gift;
                    boolean z19 = (tL_messageActionStarGiftUnique.upgrade ^ true) == k47Var.O3();
                    if (k47.B0(k47Var.k) == e) {
                        z19 = false;
                    }
                    if (!this.I2 && !this.J2 && this.C2 != null && (u1 = u1()) != null) {
                        this.I2 = true;
                        jva.v(this.a, false).J(u1, new qpa(this, b));
                    }
                    if (this.L2 || (hsaVar2 = this.K2) == null || !hsaVar2.o || (tL_starGiftUnique = hsaVar2.l) == null) {
                        z16 = z19;
                    } else {
                        z16 = z19;
                        if (starGift == null || tL_starGiftUnique.id != starGift.id) {
                            hsaVar2.a();
                            this.K2 = null;
                            ssaVar.b.setAlpha(1.0f);
                            ssaVar.c.setAlpha(0.0f);
                        }
                    }
                    z7 = z17;
                    b61Var2 = b61Var3;
                    z13 = z16;
                    tL_textWithEntities3 = null;
                    z10 = true;
                    str4 = null;
                    z4 = false;
                    z5 = false;
                    peer3 = null;
                    if (this.j3) {
                        b61Var2.setFilled(z10);
                        b61Var2.i(jb6.M0(2131749727, str4), false, z10);
                        b61Var2.setOnClickListener(new lpa(this, (byte) 20));
                    }
                    if (starGift != null) {
                        str6 = null;
                        str7 = null;
                    } else {
                        str6 = starGift.owner_address;
                        str7 = starGift.gift_address;
                    }
                    z15 = starGift == null && starGift.host_id != null;
                    l66 l66Var2 = this.c2;
                    if (!z14) {
                        l66Var2.setVisibility(0);
                        l66Var2.setText(jb6.M0(2131749978, null));
                        anb.X(l66Var2, cmb.p7, this.J0);
                        f = 0.66f;
                        f2 = 2.6666667f;
                    } else if (!z15 || TextUtils.isEmpty(str6) || TextUtils.isEmpty(str7)) {
                        f = 0.66f;
                        f2 = 2.6666667f;
                        if (TextUtils.isEmpty(str6) && TextUtils.isEmpty(str7) && z5 && !z7) {
                            l66Var2.setVisibility(0);
                            if (z13) {
                                M04 = jb6.a0(null, null, (tL_textWithEntities3 == null || TextUtils.isEmpty(tL_textWithEntities3.text)) ? 2131750021 : 2131750020, pg3.s(k47.B0(k47Var.k)));
                            } else {
                                M04 = jb6.M0((tL_textWithEntities3 == null || TextUtils.isEmpty(tL_textWithEntities3.text)) ? 2131750113 : 2131750112, null);
                            }
                            l66Var2.setText(M04);
                            anb.X(l66Var2, cmb.p5, this.J0);
                        } else {
                            l66Var2.setVisibility(8);
                        }
                    } else {
                        l66Var2.setVisibility(0);
                        f = 0.66f;
                        f2 = 2.6666667f;
                        l66Var2.setText(gm.E2(gm.N2(jb6.M0(2131750114, null), -1, 0, new nqa(this, str7, (byte) 5), null), true, gm.L(2.6666667f), gm.L(0.66f)));
                        anb.X(l66Var2, cmb.p5, this.J0);
                    }
                    l66Var = this.e2;
                    if (z15 && !TextUtils.isEmpty(str6) && !TextUtils.isEmpty(str7)) {
                        l66Var.setVisibility(0);
                        l66Var.setText(gm.E2(gm.N2(jb6.M0(2131750114, null), -1, 0, new nqa(this, str7, (byte) 6), null), true, gm.L(f2), gm.L(f)));
                    } else if (z4 && !z14 && starGift != null && F1(this.a, q1()) && peer3 == null) {
                        l66Var.setVisibility(0);
                        if (q1() >= 0) {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            if (z12) {
                                i5 = 2131749988;
                            } else {
                                spannableStringBuilder.append((CharSequence) ". ");
                                spannableStringBuilder.setSpan(new pn2(R.drawable.mini_gift_hidden, 0), 0, 1, 33);
                                i5 = 2131749991;
                            }
                            spannableStringBuilder.append((CharSequence) gm.N2(jb6.M0(i5, null), -1, 0, new npa(this, (byte) 8), null));
                            l66Var.setText(gm.E2(spannableStringBuilder, true, gm.L(f2), gm.L(f)));
                        } else {
                            l66Var.setText(gm.E2(gm.N2(jb6.M0(z12 ? 2131750186 : 2131750187, null), -1, 0, new npa(this, (byte) 8), null), true, gm.L(f2), gm.L(f)));
                        }
                    } else {
                        l66Var.setVisibility(8);
                    }
                    if (this.Z2) {
                        z2(0, false, null);
                        this.m1.m0(1);
                        this.Z2 = false;
                    }
                    this.o1.setTitle(this.Q2);
                    C2();
                }
                return;
            }
        }
        if (!this.L2 && (hsaVar = this.K2) != null && hsaVar.o && hsaVar.l != null) {
            hsaVar.a();
            this.K2 = null;
            ssaVar.b.setVisibility(0);
            ssaVar.c.setVisibility(4);
        }
        boolean O3 = z17 ? false : k47Var.O3();
        TLRPC.Message message = k47Var.k;
        int i6 = message.date;
        TLRPC.MessageAction messageAction2 = message.action;
        if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction2;
            boolean z20 = tL_messageActionStarGift.converted;
            boolean z21 = tL_messageActionStarGift.saved;
            boolean z22 = tL_messageActionStarGift.refunded;
            boolean z23 = tL_messageActionStarGift.name_hidden;
            TL_stars.StarGift starGift3 = tL_messageActionStarGift.gift;
            boolean z24 = tL_messageActionStarGift.can_upgrade;
            j = e;
            long j4 = tL_messageActionStarGift.convert_stars;
            j3 = tL_messageActionStarGift.upgrade_stars;
            TLRPC.TL_textWithEntities tL_textWithEntities4 = tL_messageActionStarGift.message;
            TLRPC.Peer peer5 = tL_messageActionStarGift.from_id;
            TLRPC.Peer peer6 = tL_messageActionStarGift.peer;
            z6 = tL_messageActionStarGift.prepaid_upgrade;
            str = tL_messageActionStarGift.prepaid_upgrade_hash;
            TLRPC.Peer peer7 = tL_messageActionStarGift.auction_acquired ? tL_messageActionStarGift.to_id : null;
            peer2 = peer5;
            peer = peer6;
            z = z21;
            i = tL_messageActionStarGift.gift_num;
            tL_textWithEntities = tL_textWithEntities4;
            peer3 = peer7;
            z4 = z20;
            z5 = z23;
            z2 = z22;
            starGift = starGift3;
            z3 = z24;
            j2 = j4;
        } else {
            j = e;
            TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique2 = (TLRPC.TL_messageActionStarGiftUnique) messageAction2;
            boolean z25 = tL_messageActionStarGiftUnique2.saved;
            boolean z26 = tL_messageActionStarGiftUnique2.refunded;
            TL_stars.StarGift starGift4 = tL_messageActionStarGiftUnique2.gift;
            TLRPC.Peer peer8 = tL_messageActionStarGiftUnique2.from_id;
            peer = tL_messageActionStarGiftUnique2.peer;
            z = z25;
            z2 = z26;
            starGift = starGift4;
            peer2 = peer8;
            j2 = 0;
            j3 = 0;
            tL_textWithEntities = null;
            i = 0;
            z3 = false;
            z4 = false;
            z5 = false;
            peer3 = null;
            z6 = false;
            str = null;
        }
        long j5 = this.S1;
        String s = pg3.s(j5);
        z7 = z17;
        boolean z27 = O3;
        boolean v = m9c.v(oc7.r1(this.a).W1(Long.valueOf(j5)));
        boolean z28 = peer != null && pg3.n(peer) < 0;
        boolean I1 = I1(this.a, A1());
        v1();
        ssaVar.f(starGift, false, false, I1);
        ssaVar.setShowOptions(g1());
        if (z7) {
            if (i == 0 || starGift.title == null) {
                z8 = z2;
                str5 = null;
                M03 = jb6.M0(2131749873, null);
            } else {
                StringBuilder sb = new StringBuilder();
                z8 = z2;
                sb.append(starGift.title);
                sb.append(" #");
                M03 = kt6.m(i, ',', sb);
                str5 = null;
            }
            this.Q2 = M03;
            CharSequence charSequence4 = str5;
            if (!z8) {
                if (z3) {
                    charSequence4 = gm.S2(jb6.M0(2131749930, str5));
                } else if (j2 > 0) {
                    charSequence4 = gm.S2(jb6.H(',', z4 ? "Gift2SelfInfoConverted" : "Gift2SelfInfoConvert", (int) j2));
                } else {
                    charSequence4 = gm.S2(jb6.M0(2131749937, null));
                }
            }
            ssaVar.i(0, M03, charSequence4, i2(starGift));
        } else {
            z8 = z2;
            if (z28 && !this.z2) {
                ssaVar.i(0, jb6.M0(2131749875, null), null, i2(starGift));
            } else {
                if ((!z27 && !z3) || j3 <= 0) {
                    if (i == 0 || starGift.title == null) {
                        M0 = jb6.M0(z27 ? 2131749870 : 2131749874, null);
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(starGift.title);
                        sb2.append(" #");
                        M0 = kt6.m(i, ',', sb2);
                    }
                    this.Q2 = M0;
                    if (z8) {
                        tL_textWithEntities2 = tL_textWithEntities;
                        b61Var = b61Var3;
                        z9 = z3;
                        concat = null;
                        i2 = 0;
                    } else {
                        if (!v && u1() != null) {
                            k47 k47Var2 = this.C2;
                            TimeUnit timeUnit = TimeUnit.SECONDS;
                            if (k47Var2 != null) {
                                TLRPC.MessageAction messageAction3 = k47Var2.k.action;
                                if (messageAction3 instanceof TLRPC.TL_messageActionStarGift) {
                                    TLRPC.TL_messageActionStarGift tL_messageActionStarGift2 = (TLRPC.TL_messageActionStarGift) messageAction3;
                                    boolean z29 = tL_messageActionStarGift2.peer != null;
                                    k47Var2.O3();
                                    boolean z30 = z29;
                                    k47.B0(this.C2.k);
                                    z8c.h(this.a).e();
                                    b61Var = b61Var3;
                                    z9 = z3;
                                    int g = ((int) oc7.r1(this.a).l4.v3.g(timeUnit)) - (ConnectionsManager.getInstance(this.a).getCurrentTime() - this.C2.k.date);
                                    if (z30) {
                                        TLRPC.Peer peer9 = tL_messageActionStarGift2.peer;
                                        if (peer9 != null) {
                                            tL_textWithEntities2 = tL_textWithEntities;
                                        } else {
                                            tL_textWithEntities2 = tL_textWithEntities;
                                        }
                                        if (z27) {
                                            str2 = null;
                                            str3 = jb6.M0(!z ? z28 ? 2131750106 : 2131750111 : z28 ? 2131750105 : 2131750110, null);
                                        } else {
                                            str3 = jb6.a0(null, null, (!z9 || j3 <= 0) ? 2131750099 : 2131750098, s);
                                            str2 = null;
                                        }
                                    } else {
                                        tL_textWithEntities2 = tL_textWithEntities;
                                    }
                                    if (!tL_messageActionStarGift2.converted) {
                                        if (tL_messageActionStarGift2.convert_stars > 0) {
                                        }
                                    }
                                    if (z27) {
                                    }
                                }
                            } else {
                                tL_textWithEntities2 = tL_textWithEntities;
                                b61Var = b61Var3;
                                z9 = z3;
                                TL_stars.SavedStarGift savedStarGift = this.A2;
                                if (savedStarGift != null) {
                                    int g2 = ((int) oc7.r1(this.a).l4.v3.g(timeUnit)) - (ConnectionsManager.getInstance(this.a).getCurrentTime() - savedStarGift.date);
                                    if (G1(this.a, j5)) {
                                        int i7 = this.A2.flags;
                                        if (((j5 < 0 ? 2048 : 8) & i7) != 0) {
                                            if ((i7 & 16) != 0) {
                                                if ((i7 & 2) != 0) {
                                                }
                                            }
                                        }
                                    }
                                }
                                if (z27) {
                                }
                            }
                            SpannableStringBuilder S2 = gm.S2(str3);
                            if (v && e1()) {
                                c = 1;
                                charSequence = gm.D2(gm.P2(jb6.M0(2131750043, str2).replace(' ', (char) 160), new npa(this, (byte) 15)), true);
                            } else {
                                c = 1;
                                charSequence = "";
                            }
                            CharSequence[] charSequenceArr = new CharSequence[3];
                            i2 = 0;
                            charSequenceArr[0] = S2;
                            charSequenceArr[c] = " ";
                            charSequenceArr[2] = charSequence;
                            concat = TextUtils.concat(charSequenceArr);
                        }
                        tL_textWithEntities2 = tL_textWithEntities;
                        b61Var = b61Var3;
                        z9 = z3;
                        if (z27) {
                        }
                        SpannableStringBuilder S22 = gm.S2(str3);
                        if (v) {
                        }
                        c = 1;
                        charSequence = "";
                        CharSequence[] charSequenceArr2 = new CharSequence[3];
                        i2 = 0;
                        charSequenceArr2[0] = S22;
                        charSequenceArr2[c] = " ";
                        charSequenceArr2[2] = charSequence;
                        concat = TextUtils.concat(charSequenceArr2);
                    }
                    ssaVar.i(i2, M0, concat, i2(starGift));
                    mhbVar = this.d2;
                    mhbVar.removeAllViews();
                    long n = peer2 == null ? pg3.n(peer2) : z27 ? j : j5;
                    if (peer == null) {
                        j5 = pg3.n(peer);
                    } else if (!z27) {
                        j5 = j;
                    }
                    TLRPC.User W1 = oc7.r1(this.a).W1(Long.valueOf(n));
                    byte b2 = 10;
                    if (peer3 == null) {
                        long n2 = pg3.n(peer3);
                        this.d2.m(jb6.M0(2131749869, null), this.a, n2, new ppa(this, n2, (byte) 7), null, z28 ? null : new ppa(this, n2, (byte) 8));
                    } else {
                        if (n != j || z6 || z28) {
                            this.d2.m(jb6.M0(2131750126, null), this.a, n, new ppa(this, n, (byte) 9), (n == j || n == 2666000 || m9c.z(W1) || v || z28) ? null : jb6.M0(2131750217, null), z28 ? null : new ppa(this, n, b2));
                        }
                        if (j5 != j || z28) {
                            this.d2.m(jb6.M0(2131749869, null), this.a, j5, new ppa(this, j5, (byte) 11), null, z28 ? null : new ppa(this, j5, (byte) 12));
                        }
                    }
                    mhbVar.g(i6, jb6.M0(2131744649, null));
                    if (starGift.stars > 0) {
                        String M05 = jb6.M0(2131749780, null);
                        String concat2 = "⭐️ ".concat(jb6.E(starGift.stars + j3, ','));
                        if (!e1() || z8) {
                            r7 = 0;
                            charSequence3 = "";
                        } else {
                            r7 = 0;
                            charSequence3 = y51.b(jb6.H(',', "Gift2ButtonSell", (int) j2), new npa(this, b2), this.J0, null);
                        }
                        mhbVar.f(M05, nxa.b1(false, TextUtils.concat(concat2, " ", charSequence3), 0.8f, r7), r7, r7);
                    }
                    if (starGift.limited && !z8) {
                        nxa.C0(mhbVar, this.a, starGift, this.J0);
                    }
                    tL_textWithEntities3 = tL_textWithEntities2;
                    if (tL_textWithEntities2 != null && !TextUtils.isEmpty(tL_textWithEntities3.text) && !z8) {
                        mhbVar.b(tL_textWithEntities3.text, tL_textWithEntities3.entities);
                    }
                    if (z27 && z9 && !z8) {
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("^  ");
                        pn2 pn2Var = this.Y2;
                        if (pn2Var == null) {
                            b61Var2 = b61Var;
                            i4 = 0;
                            pn2Var = new pn2(0, new tsa(b61Var2, cmb.v0(cmb.Ei, this.J0)));
                            this.Y2 = pn2Var;
                        } else {
                            b61Var2 = b61Var;
                            i4 = 0;
                        }
                        spannableStringBuilder2.setSpan(pn2Var, i4, 1, 33);
                        if (j3 > 0) {
                            charSequence2 = null;
                            M02 = jb6.M0(2131749808, null);
                        } else {
                            charSequence2 = null;
                            M02 = jb6.M0(2131749807, null);
                        }
                        spannableStringBuilder2.append((CharSequence) M02);
                        b61Var2.setFilled(true);
                        b61Var2.i(spannableStringBuilder2, !this.Z2, true);
                        b61Var2.g(charSequence2, !this.Z2);
                        b61Var2.setOnClickListener(new lpa(this, (byte) 21));
                    } else {
                        b61Var2 = b61Var;
                        if (this.m2 || this.U1 == null || this.B2 == null || w1() < 0 || this.B2.b(w1()) < 0) {
                            if ((starGift instanceof TL_stars.TL_starGift) || TextUtils.isEmpty(str)) {
                                z10 = true;
                                str4 = null;
                                b61Var2.setFilled(true);
                                b61Var2.i(jb6.M0(2131747564, null), !this.Z2, true);
                                b61Var2.g(null, !this.Z2);
                                b61Var2.setOnClickListener(new lpa(this, (byte) 19));
                            } else {
                                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("^  ");
                                pn2 pn2Var2 = this.Y2;
                                if (pn2Var2 == null) {
                                    i3 = 0;
                                    pn2Var2 = new pn2(0, new tsa(b61Var2, cmb.v0(cmb.Ei, this.J0)));
                                    this.Y2 = pn2Var2;
                                } else {
                                    i3 = 0;
                                }
                                z10 = true;
                                spannableStringBuilder3.setSpan(pn2Var2, i3, 1, 33);
                                str4 = null;
                                spannableStringBuilder3.append((CharSequence) jb6.M0(2131750124, null));
                                b61Var2.setFilled(true);
                                b61Var2.i(spannableStringBuilder3, !this.Z2, true);
                                b61Var2.g(null, !this.Z2);
                                b61Var2.setOnClickListener(new lpa(this, (byte) 18));
                            }
                            z12 = z;
                            z13 = z27;
                            z14 = z8;
                            if (this.j3) {
                            }
                            if (starGift != null) {
                            }
                            if (starGift == null) {
                            }
                            l66 l66Var22 = this.c2;
                            if (!z14) {
                            }
                            l66Var = this.e2;
                            if (z15) {
                            }
                            if (z4) {
                            }
                            l66Var.setVisibility(8);
                            if (this.Z2) {
                            }
                            this.o1.setTitle(this.Q2);
                            C2();
                        }
                        b61Var2.setFilled(false);
                        int b3 = this.B2.b(w1());
                        SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                        spannableStringBuilder4.append((CharSequence) jb6.M0(2131749788, null));
                        Object obj = this.B2.get(b3);
                        if (!(obj instanceof TL_stars.SavedStarGift) || (starGift2 = ((TL_stars.SavedStarGift) obj).gift) == null || (document = starGift2.getDocument()) == null) {
                            z11 = true;
                        } else {
                            spannableStringBuilder4.append((CharSequence) " e");
                            z11 = true;
                            spannableStringBuilder4.setSpan(new gn(document, b61Var2.getTextPaint().getFontMetricsInt()), spannableStringBuilder4.length() - 1, spannableStringBuilder4.length(), 33);
                        }
                        b61Var2.i(spannableStringBuilder4, this.Z2 ^ z11, z11);
                        b61Var2.g(null, this.Z2 ^ z11);
                        b61Var2.setOnClickListener(new mpa(this, b3, (byte) 3));
                    }
                    z10 = true;
                    str4 = null;
                    z12 = z;
                    z13 = z27;
                    z14 = z8;
                    if (this.j3) {
                    }
                    if (starGift != null) {
                    }
                    if (starGift == null) {
                    }
                    l66 l66Var222 = this.c2;
                    if (!z14) {
                    }
                    l66Var = this.e2;
                    if (z15) {
                    }
                    if (z4) {
                    }
                    l66Var.setVisibility(8);
                    if (this.Z2) {
                    }
                    this.o1.setTitle(this.Q2);
                    C2();
                }
                String M06 = jb6.M0(z27 ? 2131749870 : 2131749874, null);
                this.Q2 = M06;
                ssaVar.i(0, M06, z8 ? null : !z27 ? jb6.M0(2131750081, null) : jb6.a0(null, null, 2131750082, s), i2(starGift));
            }
        }
        tL_textWithEntities2 = tL_textWithEntities;
        b61Var = b61Var3;
        z9 = z3;
        mhbVar = this.d2;
        mhbVar.removeAllViews();
        if (peer2 == null) {
        }
        if (peer == null) {
        }
        TLRPC.User W12 = oc7.r1(this.a).W1(Long.valueOf(n));
        byte b22 = 10;
        if (peer3 == null) {
        }
        mhbVar.g(i6, jb6.M0(2131744649, null));
        if (starGift.stars > 0) {
        }
        if (starGift.limited) {
            nxa.C0(mhbVar, this.a, starGift, this.J0);
        }
        tL_textWithEntities3 = tL_textWithEntities2;
        if (tL_textWithEntities2 != null) {
            mhbVar.b(tL_textWithEntities3.text, tL_textWithEntities3.entities);
        }
        if (z27) {
        }
        b61Var2 = b61Var;
        if (this.m2) {
        }
        if (starGift instanceof TL_stars.TL_starGift) {
        }
        z10 = true;
        str4 = null;
        b61Var2.setFilled(true);
        b61Var2.i(jb6.M0(2131747564, null), !this.Z2, true);
        b61Var2.g(null, !this.Z2);
        b61Var2.setOnClickListener(new lpa(this, (byte) 19));
        z12 = z;
        z13 = z27;
        z14 = z8;
        if (this.j3) {
        }
        if (starGift != null) {
        }
        if (starGift == null) {
        }
        l66 l66Var2222 = this.c2;
        if (!z14) {
        }
        l66Var = this.e2;
        if (z15) {
        }
        if (z4) {
        }
        l66Var.setVisibility(8);
        if (this.Z2) {
        }
        this.o1.setTitle(this.Q2);
        C2();
    }

    public final void m2(String str, TL_stars.TL_starGiftUnique tL_starGiftUnique, bva bvaVar) {
        float f;
        hsa hsaVar;
        TL_stars.TL_starGiftUnique tL_starGiftUnique2;
        this.D2 = str;
        this.E2 = tL_starGiftUnique;
        this.B2 = bvaVar;
        this.F2 = (this.d3 != null || tL_starGiftUnique.resell_amount == null || F1(this.a, pg3.n(tL_starGiftUnique.owner_id)) || D1(this.a, tL_starGiftUnique) || H1(tL_starGiftUnique)) ? false : true;
        if (!this.L2 && (hsaVar = this.K2) != null && hsaVar.o && (tL_starGiftUnique2 = hsaVar.l) != null && tL_starGiftUnique2.id != tL_starGiftUnique.id) {
            hsaVar.a();
            this.K2 = null;
            ssa ssaVar = this.a2;
            ssaVar.b.setAlpha(1.0f);
            ssaVar.c.setAlpha(0.0f);
        }
        this.Z1.b(this.a, this.A2);
        o2(tL_starGiftUnique, false, null, null);
        String str2 = tL_starGiftUnique.owner_address;
        String str3 = tL_starGiftUnique.gift_address;
        boolean z = tL_starGiftUnique.host_id != null;
        TL_wallet.walletTransaction wallettransaction = this.d3;
        l66 l66Var = this.c2;
        if (wallettransaction != null || !z || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            f = 0.66f;
            l66Var.setVisibility(8);
        } else {
            f = 0.66f;
            l66Var.setText(gm.E2(gm.N2(jb6.M0(2131750114, null), -1, 0, new nqa(this, str3, (byte) 3), null), true, gm.L(2.6666667f), gm.L(0.66f)));
            l66Var.setVisibility(0);
            anb.X(l66Var, cmb.p5, this.J0);
        }
        TL_wallet.walletTransaction wallettransaction2 = this.d3;
        l66 l66Var2 = this.e2;
        if (wallettransaction2 != null || z || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            l66Var2.setVisibility(8);
        } else {
            l66Var2.setText(gm.E2(gm.N2(jb6.M0(2131750114, null), -1, 0, new nqa(this, str3, (byte) 4), null), true, gm.L(2.6666667f), gm.L(f)));
            l66Var2.setVisibility(0);
        }
        D2();
        if (this.F2) {
            p2(tL_starGiftUnique);
            this.f2.setOnClickListener(new lpa(this, (byte) 17));
        }
        if (this.Z2) {
            z2(0, false, null);
            this.m1.m0(1);
            this.Z2 = false;
        }
        C2();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02ed A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03ec A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0478 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0311  */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r13v28, types: [lhb[], pn2[], x51[]] */
    /* JADX WARN: Type inference failed for: r13v38 */
    /* JADX WARN: Type inference failed for: r14v40 */
    /* JADX WARN: Type inference failed for: r14v46, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v47 */
    /* JADX WARN: Type inference failed for: r14v49 */
    /* JADX WARN: Type inference failed for: r2v8, types: [android.view.ViewGroup, mhb] */
    /* JADX WARN: Type inference failed for: r34v0 */
    /* JADX WARN: Type inference failed for: r35v0, types: [my0, mz0, wsa] */
    /* JADX WARN: Type inference failed for: r7v15, types: [android.view.View, b61] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n2(TL_stars.SavedStarGift savedStarGift, bva bvaVar) {
        long j;
        int i;
        String M0;
        int i2;
        CharSequence charSequence;
        String str;
        String a0;
        int i3;
        boolean z;
        SpannableStringBuilder spannableStringBuilder;
        TL_stars.StarGift starGift;
        ?? r13;
        SpannableString spannableString;
        TL_stars.StarGift starGift2;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        boolean z2;
        ?? r7;
        int i4;
        boolean z3;
        TL_stars.StarGift starGift3;
        TLRPC.Document document;
        String str2;
        String str3;
        boolean z4;
        int i5;
        CharSequence charSequence2;
        String M02;
        String str4;
        String M03;
        TL_stars.StarGift starGift4;
        float f;
        float f2;
        ?? r14;
        boolean z5;
        hsa hsaVar;
        if (savedStarGift == null) {
            return;
        }
        int i6 = this.a;
        long j2 = this.S1;
        this.z2 = F1(i6, j2);
        this.A2 = savedStarGift;
        this.B2 = bvaVar;
        this.C2 = null;
        boolean z6 = this.L2;
        ssa ssaVar = this.a2;
        if (!z6 && (hsaVar = this.K2) != null && hsaVar.o && hsaVar.l != null) {
            hsaVar.a();
            this.K2 = null;
            ssaVar.b.setVisibility(0);
            ssaVar.c.setVisibility(4);
        }
        this.Z1.b(this.a, savedStarGift);
        String s = pg3.s(j2);
        long n = pg3.n(savedStarGift.from_id);
        boolean v = m9c.v(oc7.r1(this.a).W1(Long.valueOf(n)));
        int g = ((int) oc7.r1(this.a).l4.v3.g(TimeUnit.SECONDS)) - (ConnectionsManager.getInstance(this.a).getCurrentTime() - savedStarGift.date);
        long e = z8c.h(this.a).e();
        if ((savedStarGift.flags & 2) == 0) {
            n = 2666000;
        }
        int i7 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        boolean z7 = i7 < 0;
        TLRPC.TL_textWithEntities tL_textWithEntities2 = savedStarGift.message;
        boolean z8 = savedStarGift.refunded;
        TL_stars.StarGift starGift5 = savedStarGift.gift;
        if (starGift5 instanceof TL_stars.TL_starGiftUnique) {
            str2 = starGift5.owner_address;
            str3 = starGift5.gift_address;
            z4 = starGift5.host_id != null;
            o2((TL_stars.TL_starGiftUnique) starGift5, z8, !savedStarGift.name_hidden ? oc7.r1(this.a).a2(pg3.n(savedStarGift.from_id)) : null, savedStarGift.message);
            i = i7;
        } else {
            boolean z9 = this.z2 && e == n && i7 >= 0;
            boolean I1 = I1(this.a, A1());
            v1();
            ssaVar.f(starGift5, false, false, I1);
            ssaVar.setShowOptions(g1());
            ?? r2 = this.d2;
            r2.removeAllViews();
            ?? r34 = "";
            if (z9) {
                if (savedStarGift.gift_num == 0 || (starGift4 = savedStarGift.gift) == null || starGift4.title == null) {
                    j = e;
                    str4 = null;
                    M03 = jb6.M0(2131749873, null);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(savedStarGift.gift.title);
                    sb.append(" #");
                    j = e;
                    M03 = kt6.m(savedStarGift.gift_num, ',', sb);
                    str4 = null;
                }
                this.Q2 = M03;
                CharSequence charSequence3 = str4;
                if (!z8) {
                    if (savedStarGift.can_upgrade) {
                        charSequence3 = gm.S2(jb6.M0(2131749930, str4));
                    } else {
                        long j3 = savedStarGift.convert_stars;
                        charSequence3 = j3 > 0 ? gm.S2(jb6.H(',', "Gift2SelfInfoConvert", (int) j3)) : gm.S2(jb6.M0(2131749937, null));
                    }
                }
                ssaVar.i(0, M03, charSequence3, i2(savedStarGift.gift));
            } else {
                j = e;
                if (!z7 || this.z2) {
                    boolean z10 = this.z2;
                    if (!z10 || savedStarGift.can_upgrade) {
                        i = i7;
                        if (savedStarGift.upgrade_stars > 0) {
                            String M04 = jb6.M0(z10 ? 2131749874 : 2131749875, null);
                            this.Q2 = M04;
                            ssaVar.i(0, M04, z8 ? null : this.z2 ? jb6.M0(2131750081, null) : null, i2(savedStarGift.gift));
                            if (j == n || z7) {
                                this.d2.m(jb6.M0(2131750126, null), this.a, n, new ppa(this, n, (byte) 4), (n != j || n == 2666000 || v || m9c.z(oc7.r1(this.a).W1(Long.valueOf(n))) || z7) ? null : jb6.M0(2131750217, null), new ppa(this, n, (byte) 5));
                            }
                            r2.f(jb6.M0(2131744649, null), jb6.a0(null, null, 2131742446, jb6.D0().r0().format(new Date(savedStarGift.date * 1000)), jb6.D0().o0().format(new Date(savedStarGift.date * 1000))), null, null);
                            String M05 = jb6.M0(2131749780, null);
                            String concat = "⭐️ ".concat(jb6.E(savedStarGift.gift.stars + savedStarGift.upgrade_stars, ','));
                            if (e1() || z8) {
                                r13 = 0;
                                spannableString = r34;
                            } else {
                                r13 = 0;
                                spannableString = y51.b(jb6.H(',', "Gift2ButtonSell", (int) savedStarGift.convert_stars), new npa(this, (byte) 10), this.J0, null);
                            }
                            r2.f(M05, nxa.b1(false, TextUtils.concat(concat, " ", spannableString), 0.8f, r13), r13, r13);
                            starGift2 = savedStarGift.gift;
                            if (starGift2.limited && !z8) {
                                nxa.C0(r2, this.a, starGift2, this.J0);
                            }
                            tL_textWithEntities = savedStarGift.message;
                            if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text) && !z8) {
                                TLRPC.TL_textWithEntities tL_textWithEntities3 = savedStarGift.message;
                                r2.b(tL_textWithEntities3.text, tL_textWithEntities3.entities);
                            }
                            z2 = this.z2;
                            r7 = this.f2;
                            if (!z2 && savedStarGift.can_upgrade) {
                                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("^  ");
                                pn2 pn2Var = this.Y2;
                                if (pn2Var == null) {
                                    i5 = 0;
                                    pn2Var = new pn2(0, new tsa(r7, cmb.v0(cmb.Ei, this.J0)));
                                    this.Y2 = pn2Var;
                                } else {
                                    i5 = 0;
                                }
                                spannableStringBuilder2.setSpan(pn2Var, i5, 1, 33);
                                if (savedStarGift.upgrade_stars > 0) {
                                    charSequence2 = null;
                                    M02 = jb6.M0(2131749808, null);
                                } else {
                                    charSequence2 = null;
                                    M02 = jb6.M0(2131749807, null);
                                }
                                spannableStringBuilder2.append((CharSequence) M02);
                                r7.setFilled(true);
                                r7.i(spannableStringBuilder2, !this.Z2, true);
                                r7.g(charSequence2, !this.Z2);
                                r7.setOnClickListener(new lpa(this, (byte) 13));
                            } else if (!this.m2 && z2 && this.U1 != null && this.B2 != null && w1() >= 0 && this.B2.b(w1()) >= 0) {
                                r7.setFilled(false);
                                int b = this.B2.b(w1());
                                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                                spannableStringBuilder3.append((CharSequence) jb6.M0(2131749788, null));
                                Object obj = this.B2.get(b);
                                if (!(obj instanceof TL_stars.SavedStarGift) || (starGift3 = ((TL_stars.SavedStarGift) obj).gift) == null || (document = starGift3.getDocument()) == null) {
                                    z3 = true;
                                } else {
                                    spannableStringBuilder3.append((CharSequence) " e");
                                    z3 = true;
                                    spannableStringBuilder3.setSpan(new gn(document, r7.getTextPaint().getFontMetricsInt()), spannableStringBuilder3.length() - 1, spannableStringBuilder3.length(), 33);
                                }
                                r7.i(spannableStringBuilder3, this.Z2 ^ z3, z3);
                                r7.g(null, this.Z2 ^ z3);
                                r7.setOnClickListener(new mpa(this, b, (byte) 2));
                            } else if ((savedStarGift.gift instanceof TL_stars.TL_starGift) || TextUtils.isEmpty(savedStarGift.prepaid_upgrade_hash)) {
                                r7.setFilled(true);
                                r7.i(jb6.M0(2131747564, null), !this.Z2, true);
                                r7.g(null, !this.Z2);
                                r7.setOnClickListener(new lpa(this, (byte) 15));
                            } else {
                                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder("^  ");
                                pn2 pn2Var2 = this.Y2;
                                if (pn2Var2 == null) {
                                    i4 = 0;
                                    pn2Var2 = new pn2(0, new tsa(r7, cmb.v0(cmb.Ei, this.J0)));
                                    this.Y2 = pn2Var2;
                                } else {
                                    i4 = 0;
                                }
                                spannableStringBuilder4.setSpan(pn2Var2, i4, 1, 33);
                                spannableStringBuilder4.append((CharSequence) jb6.M0(2131750124, null));
                                r7.setFilled(true);
                                r7.i(spannableStringBuilder4, !this.Z2, true);
                                r7.g(null, !this.Z2);
                                r7.setOnClickListener(new lpa(this, (byte) 14));
                            }
                            str2 = null;
                            str3 = null;
                            z4 = false;
                        }
                    } else {
                        i = i7;
                    }
                    if (savedStarGift.gift_num == 0 || (starGift = savedStarGift.gift) == null || starGift.title == null) {
                        M0 = jb6.M0(z10 ? 2131749874 : 2131749875, null);
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(savedStarGift.gift.title);
                        sb2.append(" #");
                        M0 = kt6.m(savedStarGift.gift_num, ',', sb2);
                    }
                    this.Q2 = M0;
                    if (z8 || !this.z2) {
                        i2 = 0;
                        charSequence = null;
                    } else {
                        if (!v && e1()) {
                            if (this.z2) {
                                a0 = jb6.H(',', g <= 0 ? z7 ? "Gift2Info2ChannelExpired" : "Gift2Info2Expired" : z7 ? "Gift2Info3Channel" : "Gift2Info3", (int) savedStarGift.convert_stars);
                            } else {
                                a0 = jb6.K("Gift2Info2Out", (int) savedStarGift.convert_stars, ',', s);
                            }
                            str = null;
                        } else if (this.z2) {
                            if (savedStarGift.unsaved) {
                                i3 = z7 ? 2131750106 : 2131750111;
                                str = null;
                            } else {
                                str = null;
                                i3 = z7 ? 2131750105 : 2131750110;
                            }
                            a0 = jb6.M0(i3, str);
                        } else {
                            str = null;
                            a0 = jb6.a0(null, null, (!savedStarGift.can_upgrade || savedStarGift.upgrade_stars <= 0) ? 2131750099 : 2131750098, s);
                        }
                        SpannableStringBuilder S2 = gm.S2(a0);
                        if (v || !e1()) {
                            z = true;
                            spannableStringBuilder = r34;
                        } else {
                            z = true;
                            spannableStringBuilder = gm.D2(gm.P2(jb6.M0(2131750043, str).replace(' ', (char) 160), new npa(this, (byte) 6)), true);
                        }
                        boolean z11 = z;
                        CharSequence[] charSequenceArr = new CharSequence[3];
                        i2 = 0;
                        charSequenceArr[0] = S2;
                        charSequenceArr[z11 ? 1 : 0] = " ";
                        charSequenceArr[2] = spannableStringBuilder;
                        charSequence = TextUtils.concat(charSequenceArr);
                    }
                    ssaVar.i(i2, M0, charSequence, i2(savedStarGift.gift));
                    if (j == n) {
                    }
                    this.d2.m(jb6.M0(2131750126, null), this.a, n, new ppa(this, n, (byte) 4), (n != j || n == 2666000 || v || m9c.z(oc7.r1(this.a).W1(Long.valueOf(n))) || z7) ? null : jb6.M0(2131750217, null), new ppa(this, n, (byte) 5));
                    r2.f(jb6.M0(2131744649, null), jb6.a0(null, null, 2131742446, jb6.D0().r0().format(new Date(savedStarGift.date * 1000)), jb6.D0().o0().format(new Date(savedStarGift.date * 1000))), null, null);
                    String M052 = jb6.M0(2131749780, null);
                    String concat2 = "⭐️ ".concat(jb6.E(savedStarGift.gift.stars + savedStarGift.upgrade_stars, ','));
                    if (e1()) {
                    }
                    r13 = 0;
                    spannableString = r34;
                    r2.f(M052, nxa.b1(false, TextUtils.concat(concat2, " ", spannableString), 0.8f, r13), r13, r13);
                    starGift2 = savedStarGift.gift;
                    if (starGift2.limited) {
                        nxa.C0(r2, this.a, starGift2, this.J0);
                    }
                    tL_textWithEntities = savedStarGift.message;
                    if (tL_textWithEntities != null) {
                        TLRPC.TL_textWithEntities tL_textWithEntities32 = savedStarGift.message;
                        r2.b(tL_textWithEntities32.text, tL_textWithEntities32.entities);
                    }
                    z2 = this.z2;
                    r7 = this.f2;
                    if (!z2) {
                    }
                    if (!this.m2) {
                    }
                    if (savedStarGift.gift instanceof TL_stars.TL_starGift) {
                    }
                    r7.setFilled(true);
                    r7.i(jb6.M0(2131747564, null), !this.Z2, true);
                    r7.g(null, !this.Z2);
                    r7.setOnClickListener(new lpa(this, (byte) 15));
                    str2 = null;
                    str3 = null;
                    z4 = false;
                } else {
                    String M06 = jb6.M0(2131749875, null);
                    this.Q2 = M06;
                    ssaVar.i(0, M06, null, h2(savedStarGift.gift.released_by));
                }
            }
            i = i7;
            if (j == n) {
            }
            this.d2.m(jb6.M0(2131750126, null), this.a, n, new ppa(this, n, (byte) 4), (n != j || n == 2666000 || v || m9c.z(oc7.r1(this.a).W1(Long.valueOf(n))) || z7) ? null : jb6.M0(2131750217, null), new ppa(this, n, (byte) 5));
            r2.f(jb6.M0(2131744649, null), jb6.a0(null, null, 2131742446, jb6.D0().r0().format(new Date(savedStarGift.date * 1000)), jb6.D0().o0().format(new Date(savedStarGift.date * 1000))), null, null);
            String M0522 = jb6.M0(2131749780, null);
            String concat22 = "⭐️ ".concat(jb6.E(savedStarGift.gift.stars + savedStarGift.upgrade_stars, ','));
            if (e1()) {
            }
            r13 = 0;
            spannableString = r34;
            r2.f(M0522, nxa.b1(false, TextUtils.concat(concat22, " ", spannableString), 0.8f, r13), r13, r13);
            starGift2 = savedStarGift.gift;
            if (starGift2.limited) {
            }
            tL_textWithEntities = savedStarGift.message;
            if (tL_textWithEntities != null) {
            }
            z2 = this.z2;
            r7 = this.f2;
            if (!z2) {
            }
            if (!this.m2) {
            }
            if (savedStarGift.gift instanceof TL_stars.TL_starGift) {
            }
            r7.setFilled(true);
            r7.i(jb6.M0(2131747564, null), !this.Z2, true);
            r7.g(null, !this.Z2);
            r7.setOnClickListener(new lpa(this, (byte) 15));
            str2 = null;
            str3 = null;
            z4 = false;
        }
        boolean z12 = savedStarGift.refunded;
        byte b2 = 8;
        l66 l66Var = this.c2;
        if (z12) {
            l66Var.setVisibility(0);
            l66Var.setText(jb6.M0(2131749978, null));
            anb.X(l66Var, cmb.p7, this.J0);
            f = 0.66f;
            f2 = 2.6666667f;
        } else if (!z4 || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            f = 0.66f;
            f2 = 2.6666667f;
            if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3) && this.z2 && (savedStarGift.gift instanceof TL_stars.TL_starGift) && savedStarGift.name_hidden) {
                l66Var.setVisibility(0);
                l66Var.setText(jb6.M0((tL_textWithEntities2 == null || TextUtils.isEmpty(tL_textWithEntities2.text)) ? 2131750113 : 2131750112, null));
                anb.X(l66Var, cmb.p5, this.J0);
            } else {
                l66Var.setVisibility(8);
            }
        } else {
            f = 0.66f;
            f2 = 2.6666667f;
            l66Var.setText(gm.E2(gm.N2(jb6.M0(2131750114, null), -1, 0, new nqa(this, str3, (byte) 0), null), true, gm.L(2.6666667f), gm.L(0.66f)));
            l66Var.setVisibility(0);
            anb.X(l66Var, cmb.p5, this.J0);
        }
        l66 l66Var2 = this.e2;
        if (!z4 && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            r14 = 0;
            l66Var2.setText(gm.E2(gm.N2(jb6.M0(2131750114, null), -1, 0, new nqa(this, str3, (byte) 2), null), true, gm.L(f2), gm.L(f)));
            l66Var2.setVisibility(0);
        } else if (this.z2 && F1(this.a, j2)) {
            if (i >= 0) {
                SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                if (savedStarGift.unsaved) {
                    spannableStringBuilder5.append((CharSequence) ". ");
                    spannableStringBuilder5.setSpan(new pn2(R.drawable.mini_gift_hidden, 0), 0, 1, 33);
                }
                spannableStringBuilder5.append((CharSequence) gm.N2(jb6.M0(!savedStarGift.unsaved ? 2131749988 : 2131749991, null), -1, 0, new npa(this, b2), null));
                l66Var2.setText(gm.E2(spannableStringBuilder5, true, gm.L(f2), gm.L(f)));
                z5 = false;
            } else {
                z5 = false;
                l66Var2.setText(gm.E2(gm.N2(jb6.M0(!savedStarGift.unsaved ? 2131750186 : 2131750187, null), -1, 0, new npa(this, b2), null), true, gm.L(f2), gm.L(f)));
            }
            l66Var2.setVisibility(z5 ? 1 : 0);
            r14 = z5;
        } else {
            r14 = 0;
            l66Var2.setVisibility(8);
        }
        if (this.Z2) {
            z2(r14, r14, null);
            this.m1.m0(1);
            this.Z2 = r14;
        }
        this.o1.setTitle(this.Q2);
        C2();
    }

    @Override // my0
    public final void o0() {
        hg5 hg5Var = this.w3;
        if (hg5Var != null) {
            hg5Var.f(true);
            this.w3 = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:369:0x05d1, code lost:
    
        if (((org.telegram.tgnet.TLRPC.TL_messageActionStarGiftUnique) r4).drop_original_details_stars >= 0) goto L203;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x06c8  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0a27  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0b65  */
    /* JADX WARN: Removed duplicated region for block: B:294:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0a36  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0a55  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0a19  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0220 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0276  */
    /* JADX WARN: Type inference failed for: r10v63 */
    /* JADX WARN: Type inference failed for: r10v67 */
    /* JADX WARN: Type inference failed for: r10v72 */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.lang.String, lhb[], x51[]] */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [java.lang.String, lhb[], x51[]] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22, types: [java.lang.String, lhb[], x51[]] */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v53, types: [java.lang.String, lhb[], x51[]] */
    /* JADX WARN: Type inference failed for: r11v55, types: [java.lang.String, lhb[], x51[]] */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r13v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v37 */
    /* JADX WARN: Type inference failed for: r13v39 */
    /* JADX WARN: Type inference failed for: r13v40 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o2(TL_stars.TL_starGiftUnique tL_starGiftUnique, boolean z, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        final byte b;
        CharSequence charSequence;
        CharSequence charSequence2;
        String M0;
        Spannable spannable;
        byte b2;
        String str;
        byte b3;
        int i;
        int i2;
        ?? r13;
        ?? r12;
        ?? r10;
        TL_stars.starGiftAttributeOriginalDetails stargiftattributeoriginaldetails;
        float f;
        ssa ssaVar;
        Class cls;
        Class cls2;
        Class cls3;
        hsa hsaVar;
        TL_stars.TL_starGiftUnique tL_starGiftUnique2;
        boolean z2;
        TL_stars.StarGift starGift;
        TLRPC.Document document;
        hsa hsaVar2;
        boolean z3;
        ?? r11;
        int i3;
        ?? r112;
        int i4;
        Object obj;
        Object obj2;
        int i5;
        CharSequence V;
        TLRPC.Message message;
        k47 k47Var;
        byte b4;
        String str2;
        final byte b5;
        int i6;
        TL_wallet.nftItem nftitem;
        String str3;
        TL_wallet.nftItem nftitem2;
        String str4;
        lqc lqcVar;
        hsa hsaVar3;
        TL_stars.TL_starGiftUnique tL_starGiftUnique3;
        long n = pg3.n(tL_starGiftUnique.owner_id);
        long n2 = pg3.n(tL_starGiftUnique.host_id);
        StringBuilder sb = new StringBuilder();
        sb.append(tL_starGiftUnique.title);
        sb.append(" #");
        this.Q2 = kt6.m(tL_starGiftUnique.num, ',', sb);
        boolean z4 = this.L2;
        ssa ssaVar2 = this.a2;
        if (!z4 && (hsaVar3 = this.K2) != null && hsaVar3.o && (tL_starGiftUnique3 = hsaVar3.l) != null && tL_starGiftUnique3.id != tL_starGiftUnique.id) {
            hsaVar3.a();
            this.K2 = null;
            ssaVar2.b.setAlpha(1.0f);
            ssaVar2.c.setAlpha(0.0f);
        } else if (z4 && this.K2 == null) {
            this.K2 = new hsa(ssaVar2);
        }
        boolean z5 = this.d3 == null;
        ssaVar2.setInWallet(z5 && this.a3 == null && x2(tL_starGiftUnique));
        TextPaint textPaint = ssaVar2.H;
        boolean z6 = z5 && G1(this.a, n);
        boolean z7 = z5 && G1(this.a, n2);
        boolean I1 = I1(this.a, A1());
        v1();
        ssaVar2.f(tL_starGiftUnique, z6, z7, I1);
        ssaVar2.setShowOptions(false);
        byte b6 = 8;
        byte b7 = 5;
        byte b8 = 4;
        byte b9 = 6;
        if (this.a3 != null) {
            if (this.c3 != null) {
                ssaVar2.j(new rqa(this, b8), this.b3 == null ? null : new lpa(this, b8), new lpa(this, b7), true);
                qnc qncVar = this.c3;
                mqc mqcVar = qncVar.b.k0;
                ssaVar2.setWalletCard((mqcVar == null || (nftitem2 = qncVar.a) == null || (str4 = nftitem2.address) == null || (lqcVar = (lqc) mqcVar.f.get(str4)) == null || !lqcVar.b()) ? false : true);
            } else {
                ssaVar2.j(new lpa(this, b9), this.b3 == null ? null : new lpa(this, (byte) 7), new lpa(this, b6), tL_starGiftUnique.host_id != null);
            }
            pnc pncVar = this.b3;
            if (pncVar != null) {
                i6 = ((d) pncVar.c).currentAccount;
                boolean F = mqc.F(i6, pncVar.a.slug);
                pnc pncVar2 = this.b3;
                mqc mqcVar2 = pncVar2.c.k0;
                boolean z8 = (mqcVar2 == null || (nftitem = pncVar2.b) == null || (str3 = nftitem.address) == null || !str3.equals(mqcVar2.Q0)) ? false : true;
                qw9 qw9Var = ssaVar2.K;
                qw9Var.a(R.drawable.filled_card_color, jb6.M0(z8 ? 2131742785 : 2131742791, null), false);
                qw9Var.setAlpha((F || z8) ? 1.0f : 0.5f);
            }
        }
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) jva.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) tL_starGiftUnique.title);
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) "#".concat(jb6.E(tL_starGiftUnique.num, ',')));
        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.85f), length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(new rl((byte) 2, nm7.T2, false), length, spannableStringBuilder.length(), 33);
        TL_wallet.walletTransaction wallettransaction = this.d3;
        if (wallettransaction == null || gs7.c(wallettransaction) == null) {
            TL_wallet.walletTransaction wallettransaction2 = this.d3;
            if (wallettransaction2 != null) {
                M0 = jb6.M0(wallettransaction2.incoming ? 2131742757 : 2131742756, null);
            } else {
                if (tLObject != null) {
                    b = 1;
                    charSequence2 = gm.S2(jb6.a0(null, null, 2131743569, pg3.t(tLObject)));
                } else {
                    b = 1;
                    if (tL_starGiftUnique.released_by != null || stargiftattributemodel == null) {
                        charSequence = null;
                        if (tL_textWithEntities != null || textPaint == null) {
                            spannable = null;
                        } else {
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(tL_textWithEntities.text);
                            k47.b(spannableStringBuilder2, tL_textWithEntities.entities, false, false, false, false, 0);
                            spannable = k47.A5(gw3.m(spannableStringBuilder2, textPaint.getFontMetricsInt(), false, null, 0), tL_textWithEntities.entities, textPaint.getFontMetricsInt(), false);
                        }
                        ssaVar2.h(0, spannableStringBuilder, charSequence, h2(tL_starGiftUnique.released_by), null, tLObject, spannable);
                        this.h3 = null;
                        mhb mhbVar = this.d2;
                        mhbVar.removeAllViews();
                        if (z) {
                            b2 = b;
                            str = null;
                            b3 = 0;
                        } else {
                            TLRPC.Peer peer = tL_starGiftUnique.host_id;
                            String str5 = tL_starGiftUnique.owner_address;
                            if (peer != null) {
                                if (TextUtils.isEmpty(str5)) {
                                    str2 = null;
                                    b5 = 0;
                                } else {
                                    final String str6 = tL_starGiftUnique.owner_address;
                                    str2 = null;
                                    b5 = 0;
                                    Y0(mhbVar, jb6.M0(2131750115, null), str6, this.J0).setOnClickListener(new View.OnClickListener(this) { // from class: opa
                                        public final /* synthetic */ wsa b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            byte b10 = b5;
                                            String str7 = str6;
                                            wsa wsaVar = this.b;
                                            switch (b10) {
                                                case 0:
                                                    gm.g(str7);
                                                    wsaVar.j().Q(R.raw.copy, 36, jb6.M0(2131742885, null)).k(false);
                                                    break;
                                                case 1:
                                                    gm.g(str7);
                                                    wsaVar.j().Q(R.raw.copy, 36, jb6.M0(2131742885, null)).k(false);
                                                    break;
                                                default:
                                                    gm.g(str7);
                                                    wsaVar.j().Q(R.raw.copy, 36, jb6.M0(2131742885, null)).k(false);
                                                    break;
                                            }
                                        }
                                    });
                                }
                                if (n2 != 0) {
                                    b4 = b5;
                                    this.h3 = ((jhb) this.d2.o(jb6.M0(2131750116, str2), this.a, n2, new ppa(this, n2, b5)).getChildAt(b)).getChildAt(b4);
                                    b3 = b4;
                                    str = str2;
                                    b2 = b;
                                } else {
                                    r13 = b;
                                    r12 = b5;
                                    i2 = 33;
                                    i = 8;
                                    r10 = str2;
                                    a1(jva.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class));
                                    a1(jva.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
                                    a1(jva.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
                                    if (!z) {
                                        if (this.C2 == null) {
                                            ?? r113 = r10;
                                            mhbVar.f(jb6.M0(2131749987, r113), jb6.H(',', "Gift2QuantityIssued1", tL_starGiftUnique.availability_issued).concat(jb6.H(',', "Gift2QuantityIssued2", tL_starGiftUnique.availability_total)), r113, r113);
                                        } else if (this.H2) {
                                            ?? r114 = r10;
                                            mhbVar.f(jb6.M0(2131749987, r114), jb6.H(',', "Gift2QuantityIssued1", tL_starGiftUnique.availability_issued).concat(jb6.H(',', "Gift2QuantityIssued2", tL_starGiftUnique.availability_total)), r114, r114);
                                        } else {
                                            TextView textView = (TextView) ((jhb) mhbVar.f(jb6.M0(2131749987, r10), "", r10, r10).getChildAt(r13)).getChildAt(r12);
                                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("x ");
                                            ta6 ta6Var = new ta6(textView, gm.L(90.0f), r12, this.J0);
                                            int i7 = cmb.F6;
                                            ta6Var.a(cmb.p1(0.21f, cmb.v0(i7, this.J0)), cmb.p1(0.08f, cmb.v0(i7, this.J0)));
                                            spannableStringBuilder3.setSpan(ta6Var, r12, r13, i2);
                                            textView.setText(spannableStringBuilder3, TextView.BufferType.SPANNABLE);
                                            if (!this.G2 && !this.H2 && (k47Var = this.C2) != null) {
                                                this.G2 = r13;
                                                int e1 = k47Var.e1();
                                                TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                                                tL_messages_getMessages.id.add(Integer.valueOf(e1));
                                                ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_getMessages, new w22(this, e1, (byte) 5));
                                            }
                                        }
                                        if (!TextUtils.isEmpty(tL_starGiftUnique.slug) && (tL_starGiftUnique.flags & 256) != 0) {
                                            cj0.h();
                                            this.d2.e(jb6.M0(2131749365, null), b10.h("~", cj0.f(tL_starGiftUnique.value_currency, cj0.h().g(tL_starGiftUnique.value_currency), tL_starGiftUnique.value_amount, r13)), jb6.M0(2131749364, null), new hw9((Object) this, (Object) tL_starGiftUnique, (Object) cj0.h().e(tL_starGiftUnique.value_amount, tL_starGiftUnique.value_currency), (byte) 21), null);
                                        }
                                    }
                                    stargiftattributeoriginaldetails = (TL_stars.starGiftAttributeOriginalDetails) jva.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeOriginalDetails.class);
                                    if (stargiftattributeoriginaldetails != null) {
                                        if ((stargiftattributeoriginaldetails.flags & r13) != 0) {
                                            long n3 = pg3.n(stargiftattributeoriginaldetails.sender_id);
                                            f = 14.0f;
                                            SpannableString spannableString = new SpannableString(pg3.k(z8c.t0, n3));
                                            spannableString.setSpan(new dra(this, n3), r12, spannableString.length(), i2);
                                            obj = spannableString;
                                        } else {
                                            f = 14.0f;
                                            obj = null;
                                        }
                                        long n4 = pg3.n(stargiftattributeoriginaldetails.recipient_id);
                                        SpannableString spannableString2 = new SpannableString(pg3.k(z8c.t0, n4));
                                        spannableString2.setSpan(new era(this, n4), r12, spannableString2.length(), i2);
                                        if (stargiftattributeoriginaldetails.message != null) {
                                            TextPaint textPaint2 = new TextPaint((int) r13);
                                            textPaint2.setTextSize(gm.L(f));
                                            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(stargiftattributeoriginaldetails.message.text);
                                            k47.b(spannableStringBuilder4, stargiftattributeoriginaldetails.message.entities, false, false, false, false, 0);
                                            obj2 = k47.A5(gw3.m(spannableStringBuilder4, textPaint2.getFontMetricsInt(), r12, null, r12), stargiftattributeoriginaldetails.message.entities, textPaint2.getFontMetricsInt(), r12);
                                        } else {
                                            obj2 = null;
                                        }
                                        boolean z9 = r13;
                                        Object replaceAll = jb6.D0().B0().format(stargiftattributeoriginaldetails.date * 1000).replaceAll("\\.", "/");
                                        if (stargiftattributeoriginaldetails.sender_id != stargiftattributeoriginaldetails.recipient_id) {
                                            if (obj == null) {
                                                i5 = r12;
                                                if (obj2 == null) {
                                                    Object[] objArr = new Object[2];
                                                    objArr[i5] = spannableString2;
                                                    objArr[z9 ? 1 : 0] = replaceAll;
                                                    V = jb6.V(null, null, 2131750317, objArr);
                                                } else {
                                                    Object[] objArr2 = new Object[3];
                                                    objArr2[i5] = spannableString2;
                                                    objArr2[z9 ? 1 : 0] = replaceAll;
                                                    objArr2[2] = obj2;
                                                    V = jb6.V(null, null, 2131750316, objArr2);
                                                }
                                            } else if (obj2 == null) {
                                                Object[] objArr3 = new Object[3];
                                                objArr3[r12] = obj;
                                                objArr3[z9 ? 1 : 0] = spannableString2;
                                                objArr3[2] = replaceAll;
                                                V = jb6.V(null, null, 2131750319, objArr3);
                                            } else {
                                                i5 = r12;
                                                Object[] objArr4 = new Object[4];
                                                objArr4[i5] = obj;
                                                objArr4[z9 ? 1 : 0] = spannableString2;
                                                objArr4[2] = replaceAll;
                                                objArr4[3] = obj2;
                                                V = jb6.V(null, null, 2131750318, objArr4);
                                            }
                                            if (F1(this.a, pg3.n(tL_starGiftUnique.owner_id))) {
                                                TL_stars.SavedStarGift savedStarGift = this.A2;
                                                if (savedStarGift == null || savedStarGift.drop_original_details_stars < 0) {
                                                    k47 k47Var2 = this.C2;
                                                    if (k47Var2 != null && (message = k47Var2.k) != null) {
                                                        TLRPC.MessageAction messageAction = message.action;
                                                        if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                                                        }
                                                    }
                                                }
                                                LinearLayout linearLayout = new LinearLayout(getContext());
                                                linearLayout.setPadding(gm.L(12.66f), gm.L(9.33f), gm.L(12.66f), gm.L(9.33f));
                                                linearLayout.setOrientation(i5);
                                                xna xnaVar = new xna(getContext());
                                                anb.X(xnaVar, cmb.F6, this.J0);
                                                anb.G(xnaVar, cmb.Wc, this.J0);
                                                xnaVar.setTextSize(z9 ? 1 : 0, 12.0f);
                                                xnaVar.setGravity(3);
                                                xnaVar.setText(V);
                                                linearLayout.addView(xnaVar, qoe.p(-1, -2, 1.0f, 19));
                                                ImageView imageView = new ImageView(getContext());
                                                imageView.setScaleType(ImageView.ScaleType.CENTER);
                                                int i8 = cmb.Ei;
                                                fg0 Y = cmb.Y(cmb.p1(0.1f, cmb.v0(i8, this.J0)), 6, 6);
                                                wmb K = anb.K(0.1f, i8);
                                                ylb ylbVar = this.J0;
                                                imageView.setBackground(Y);
                                                anb.j(imageView, Y, null, K, ylbVar);
                                                imageView.setImageResource(R.drawable.menu_delete_old);
                                                anb.s(imageView, i8, this.J0, PorterDuff.Mode.SRC_IN);
                                                rve.a(imageView);
                                                imageView.setOnClickListener(new r39(this, V, (byte) 16));
                                                linearLayout.addView(imageView, qoe.q(32, 32, 0.0f, 21, 8, 0, 0, 0));
                                                TableRow tableRow = new TableRow(getContext());
                                                TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
                                                layoutParams.span = 2;
                                                tableRow.addView(new khb(mhbVar, linearLayout, true), layoutParams);
                                                mhbVar.addView(tableRow);
                                            }
                                            khb a = mhbVar.a(V);
                                            a.setFilled(z9);
                                            xna xnaVar2 = (xna) a.getChildAt(0);
                                            xnaVar2.setTextSize(z9 ? 1 : 0, 12.0f);
                                            xnaVar2.setGravity(17);
                                        } else if (obj2 == null) {
                                            Object[] objArr5 = new Object[2];
                                            objArr5[r12] = obj;
                                            objArr5[z9 ? 1 : 0] = replaceAll;
                                            V = jb6.V(null, null, 2131750315, objArr5);
                                        } else {
                                            Object[] objArr6 = new Object[3];
                                            objArr6[r12] = obj;
                                            objArr6[z9 ? 1 : 0] = replaceAll;
                                            objArr6[2] = obj2;
                                            V = jb6.V(null, null, 2131750314, objArr6);
                                        }
                                        i5 = r12;
                                        if (F1(this.a, pg3.n(tL_starGiftUnique.owner_id))) {
                                        }
                                        khb a2 = mhbVar.a(V);
                                        a2.setFilled(z9);
                                        xna xnaVar22 = (xna) a2.getChildAt(0);
                                        xnaVar22.setTextSize(z9 ? 1 : 0, 12.0f);
                                        xnaVar22.setGravity(17);
                                    } else {
                                        f = 14.0f;
                                    }
                                    if (this.d3 != null) {
                                        this.h3 = null;
                                        mhbVar.removeAllViews();
                                        gs7 c = gs7.c(this.d3);
                                        int i9 = c != null ? 0 : i;
                                        LinearLayout linearLayout2 = this.e3;
                                        linearLayout2.setVisibility(i9);
                                        if (c != null) {
                                            long j = c.e;
                                            int i10 = c.j;
                                            byte b10 = c.a;
                                            long j2 = c.g;
                                            long j3 = c.f;
                                            long abs = Math.abs(j);
                                            ssaVar = ssaVar2;
                                            cls2 = TL_stars.starGiftAttributeBackdrop.class;
                                            SpannableStringBuilder u = c.u(c.s(abs, false), 0.75f);
                                            if (abs != 0) {
                                                cls = TL_stars.starGiftAttributePattern.class;
                                                u.insert(0, (CharSequence) (j > 0 ? "+" : "–"));
                                            } else {
                                                cls = TL_stars.starGiftAttributePattern.class;
                                            }
                                            cls3 = TL_stars.starGiftAttributeModel.class;
                                            u.setSpan(new ForegroundColorSpan(cmb.v0(j > 0 ? cmb.kk : cmb.F6, this.J0)), 0, u.length(), 33);
                                            linearLayout2.setVisibility((abs == 0 || (b10 == 9 || b10 == 4)) ? i : 0);
                                            SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(c.p("GramCapital", u, 2131749293));
                                            int indexOf = TextUtils.indexOf(spannableStringBuilder5, u);
                                            int length2 = u.length() + indexOf;
                                            if (indexOf > 0) {
                                                i3 = 33;
                                                spannableStringBuilder5.setSpan(new RelativeSizeSpan(0.75f), 0, indexOf, 33);
                                            } else {
                                                i3 = 33;
                                            }
                                            if (indexOf >= 0 && length2 < spannableStringBuilder5.length()) {
                                                spannableStringBuilder5.setSpan(new RelativeSizeSpan(0.75f), length2, spannableStringBuilder5.length(), i3);
                                            }
                                            this.f3.setText(spannableStringBuilder5);
                                            this.g3.setText(c.C(this.a).q(abs, false));
                                            boolean z10 = b10 == 0 || b10 == 1 || b10 == 2;
                                            if (b10 == 0 && j3 > 0 && j2 > 0) {
                                                mhbVar.f(jb6.M0(2131749482, null), fs7.i(j3), null, null);
                                            } else if (z10 && j3 > 0) {
                                                mhbVar.f(jb6.M0(2131749484, null), fs7.i(j3), null, null);
                                            }
                                            if (z10 && j2 > 0) {
                                                CharSequence i11 = fs7.i(j2);
                                                if (j3 > 0) {
                                                    double d = (j2 * 100.0d) / j3;
                                                    SpannableString spannableString3 = new SpannableString(kt6.o("(", b10.j(new StringBuilder(), Math.abs(d - ((double) Math.round(d))) < 0.05d ? String.valueOf(Math.round(d)) : String.format(Locale.US, "%.1f", Double.valueOf(d)), "%"), ")"));
                                                    spannableString3.setSpan(new do4(cmb.y6, this.J0), 0, spannableString3.length(), 33);
                                                    i11 = TextUtils.concat(i11, " ", spannableString3);
                                                }
                                                mhbVar.f(jb6.M0(2131749524, null), i11, null, null);
                                            }
                                            long j4 = this.d3.fee;
                                            if (j4 != 0) {
                                                long abs2 = Math.abs(j4);
                                                StringBuilder sb2 = new StringBuilder("⭐️ ");
                                                BigDecimal movePointLeft = new BigDecimal(abs2).movePointLeft(9);
                                                sb2.append((movePointLeft.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : movePointLeft.stripTrailingZeros()).toPlainString());
                                                SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder(nxa.b1(true, sb2.toString(), 0.8f, null));
                                                CharSequence q = c.C(this.a).q(abs2, true);
                                                if (!TextUtils.isEmpty(q)) {
                                                    int length3 = spannableStringBuilder6.length();
                                                    spannableStringBuilder6.append((CharSequence) " ~").append(q);
                                                    spannableStringBuilder6.setSpan(new do4(cmb.y6, this.J0), length3, spannableStringBuilder6.length(), 33);
                                                }
                                                mhbVar.f(jb6.M0(2131749487, null), spannableStringBuilder6, null, null);
                                            }
                                            boolean z11 = b10 == 9;
                                            if ((b10 == 3 || z11) && j3 > 0) {
                                                r112 = 0;
                                                mhbVar.f(jb6.M0(z11 ? 2131749486 : 2131749484, null), fs7.i(j3), null, null);
                                            } else {
                                                r112 = 0;
                                            }
                                            if (z11 && c.i > 0) {
                                                mhbVar.f(jb6.M0(2131749485, r112), fs7.j(c.i), r112, r112);
                                            }
                                            if (b10 == 5 && i10 > 0) {
                                                mhbVar.f(jb6.M0(2131749488, r112), o1(i10), r112, r112);
                                            }
                                            if (b10 == 6 && c.k) {
                                                mhbVar.f(jb6.M0(2131749490, r112), fs7.i(c.h), r112, r112);
                                            }
                                            final String str7 = c.l;
                                            if (str7 != null && (i4 = c.m) != 0) {
                                                final byte b11 = 2;
                                                Y0(mhbVar, jb6.M0(i4, r112), str7, this.J0).setOnClickListener(new View.OnClickListener(this) { // from class: opa
                                                    public final /* synthetic */ wsa b;

                                                    {
                                                        this.b = this;
                                                    }

                                                    @Override // android.view.View.OnClickListener
                                                    public final void onClick(View view) {
                                                        byte b102 = b11;
                                                        String str72 = str7;
                                                        wsa wsaVar = this.b;
                                                        switch (b102) {
                                                            case 0:
                                                                gm.g(str72);
                                                                wsaVar.j().Q(R.raw.copy, 36, jb6.M0(2131742885, null)).k(false);
                                                                break;
                                                            case 1:
                                                                gm.g(str72);
                                                                wsaVar.j().Q(R.raw.copy, 36, jb6.M0(2131742885, null)).k(false);
                                                                break;
                                                            default:
                                                                gm.g(str72);
                                                                wsaVar.j().Q(R.raw.copy, 36, jb6.M0(2131742885, null)).k(false);
                                                                break;
                                                        }
                                                    }
                                                });
                                            }
                                            if (this.d3.date != 0) {
                                                mhbVar.f(jb6.M0(2131742827, null), o1(this.d3.date), null, null);
                                            }
                                        } else {
                                            ssaVar = ssaVar2;
                                            cls = TL_stars.starGiftAttributePattern.class;
                                            cls2 = TL_stars.starGiftAttributeBackdrop.class;
                                            cls3 = TL_stars.starGiftAttributeModel.class;
                                            long e = z8c.h(this.a).e();
                                            this.d2.n(jb6.M0(this.d3.incoming ? 2131742678 : 2131742703, null), this.a, e, new ppa(this, e, (byte) 3));
                                            long abs3 = Math.abs(this.d3.fee);
                                            if (abs3 > 0) {
                                                TextView textView2 = new TextView(getContext());
                                                textView2.setGravity(16);
                                                textView2.setIncludeFontPadding(false);
                                                textView2.setTextSize(1, f);
                                                anb.X(textView2, cmb.F6, this.J0);
                                                textView2.setText(goc.p0(this.a, abs3, this.J0));
                                                r11 = 0;
                                                mhbVar.c(textView2, jb6.M0(2131742803, null));
                                            } else {
                                                r11 = 0;
                                            }
                                            if (this.d3.date != 0) {
                                                mhbVar.f(jb6.M0(2131742827, r11), jb6.Q(this.d3.date), r11, r11);
                                            }
                                        }
                                    } else {
                                        ssaVar = ssaVar2;
                                        cls = TL_stars.starGiftAttributePattern.class;
                                        cls2 = TL_stars.starGiftAttributeBackdrop.class;
                                        cls3 = TL_stars.starGiftAttributeModel.class;
                                    }
                                    hsaVar = this.K2;
                                    b61 b61Var = this.f2;
                                    if (hsaVar != null || !hsaVar.o) {
                                        if (this.d3 != null) {
                                            b61Var.setFilled(true);
                                            b61Var.i(jb6.M0(2131747564, null), !this.Z2, true);
                                            b61Var.g(null, !this.Z2);
                                            b61Var.setOnClickListener(new rqa(this, (byte) 5));
                                        } else {
                                            if (!H1(tL_starGiftUnique) || !h1()) {
                                                tL_starGiftUnique2 = tL_starGiftUnique;
                                                if (!F1(this.a, pg3.n(tL_starGiftUnique2.owner_id)) && tL_starGiftUnique2.resell_amount != null && !D1(this.a, tL_starGiftUnique2)) {
                                                    b61Var.setFilled(true);
                                                    p2(tL_starGiftUnique);
                                                    b61Var.setOnClickListener(new lpa(this, (byte) 1));
                                                } else if (!this.m2 || this.U1 == null || this.B2 == null || w1() < 0 || this.B2.b(w1()) < 0) {
                                                    b61Var.setFilled(true);
                                                    b61Var.i(jb6.M0(2131747564, null), !this.Z2, true);
                                                    b61Var.g(null, !this.Z2);
                                                    b61Var.setOnClickListener(new lpa(this, (byte) 2));
                                                } else {
                                                    b61Var.setFilled(false);
                                                    int b12 = this.B2.b(w1());
                                                    SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder();
                                                    spannableStringBuilder7.append((CharSequence) jb6.M0(2131749788, null));
                                                    Object obj3 = this.B2.get(b12);
                                                    if (!(obj3 instanceof TL_stars.SavedStarGift) || (starGift = ((TL_stars.SavedStarGift) obj3).gift) == null || (document = starGift.getDocument()) == null) {
                                                        z2 = true;
                                                    } else {
                                                        spannableStringBuilder7.append((CharSequence) " e");
                                                        z2 = true;
                                                        spannableStringBuilder7.setSpan(new gn(document, b61Var.getTextPaint().getFontMetricsInt()), spannableStringBuilder7.length() - 1, spannableStringBuilder7.length(), 33);
                                                    }
                                                    b61Var.i(spannableStringBuilder7, this.Z2 ^ z2, z2);
                                                    b61Var.g(null, this.Z2 ^ z2);
                                                    b61Var.setOnClickListener(new mpa(this, b12, (byte) 0));
                                                }
                                                this.o1.setTitle(this.Q2);
                                                hsaVar2 = this.K2;
                                                if (hsaVar2 == null) {
                                                    boolean z12 = this.L2;
                                                    npa npaVar = new npa(this, (byte) 0);
                                                    npa npaVar2 = new npa(this, (byte) 1);
                                                    ArrayList arrayList = hsaVar2.f;
                                                    ssa ssaVar3 = hsaVar2.a;
                                                    TL_stars.TL_starGiftUnique tL_starGiftUnique4 = hsaVar2.l;
                                                    if (tL_starGiftUnique4 != null && tL_starGiftUnique4.id == tL_starGiftUnique2.id) {
                                                        z3 = hsaVar2.o;
                                                    } else if (z12) {
                                                        bf0 upgradeImageView = ssaVar3.getUpgradeImageView();
                                                        ksa ksaVar = ssaVar3.c;
                                                        TL_stars.starGiftAttributeModel upgradeImageViewAttribute = ssaVar3.getUpgradeImageViewAttribute();
                                                        TL_stars.starGiftAttributePattern upgradePatternAttribute = ssaVar3.getUpgradePatternAttribute();
                                                        TL_stars.starGiftAttributeBackdrop upgradeBackdropAttribute = ssaVar3.getUpgradeBackdropAttribute();
                                                        TL_stars.starGiftAttributeModel stargiftattributemodel2 = (TL_stars.starGiftAttributeModel) jva.i(tL_starGiftUnique2.attributes, cls3);
                                                        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) jva.i(tL_starGiftUnique2.attributes, cls);
                                                        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) jva.i(tL_starGiftUnique2.attributes, cls2);
                                                        hsaVar2.o = true;
                                                        hsaVar2.l = tL_starGiftUnique2;
                                                        hsaVar2.r = npaVar;
                                                        hsaVar2.s = npaVar2;
                                                        hsaVar2.t = (float) Math.random();
                                                        hsaVar2.m = System.currentTimeMillis();
                                                        hsaVar2.n = 0.0f;
                                                        hsaVar2.p = false;
                                                        hsaVar2.q = false;
                                                        hsaVar2.o = true;
                                                        dsa dsaVar = hsaVar2.h;
                                                        if (dsaVar != null) {
                                                            dsaVar.a();
                                                        }
                                                        fsa fsaVar = new fsa(ksaVar, stargiftattributemodel2);
                                                        if (ksaVar.isAttachedToWindow() && fsaVar.c) {
                                                            fsaVar.d.I();
                                                        }
                                                        hsaVar2.h = new dsa(new bsa(hsaVar2, (byte) 0), hsaVar2.e, new fsa(upgradeImageView, upgradeImageViewAttribute), fsaVar, 0.9f, hsaVar2.t > 0.5f ? 3 : 2);
                                                        dsa dsaVar2 = hsaVar2.i;
                                                        if (dsaVar2 != null) {
                                                            dsaVar2.a();
                                                        }
                                                        hsaVar2.i = new dsa(new bsa(hsaVar2, (byte) 0), hsaVar2.g, new gsa(upgradePatternAttribute), new gsa(stargiftattributepattern), 1.0f, hsaVar2.t > 0.5f ? 2 : 1);
                                                        dsa dsaVar3 = hsaVar2.j;
                                                        if (dsaVar3 != null) {
                                                            dsaVar3.a();
                                                        }
                                                        hsaVar2.j = new dsa(new bsa(hsaVar2, (byte) 0), arrayList, new esa(upgradeBackdropAttribute), new esa(stargiftattributebackdrop), 0.5f, hsaVar2.t > 0.5f ? 2 : 1);
                                                        dsa dsaVar4 = hsaVar2.k;
                                                        if (dsaVar4 != null) {
                                                            dsaVar4.a();
                                                        }
                                                        hsaVar2.k = new dsa(new bsa(hsaVar2, (byte) 0), arrayList, new esa(upgradeBackdropAttribute), new esa(stargiftattributebackdrop), 1.25f, hsaVar2.t > 0.5f ? 2 : 1);
                                                        hsaVar2.b();
                                                        z3 = true;
                                                    } else {
                                                        z3 = false;
                                                    }
                                                    if (z3) {
                                                        ssa ssaVar4 = ssaVar;
                                                        ssaVar4.b.setAlpha(0.0f);
                                                        ssaVar4.c.setAlpha(1.0f);
                                                        b61Var.i(jb6.M0(2131749384, null), true, true);
                                                        b61Var.setFilled(true);
                                                        b61Var.setOnClickListener(new lpa(this, (byte) 3));
                                                        int length4 = ((wsa) this.O2.d).N2.length - 1;
                                                        r59 r59Var = this.n1;
                                                        r59Var.w0(length4);
                                                        r59Var.post(new npa(this, (byte) 2));
                                                        return;
                                                    }
                                                    return;
                                                }
                                                return;
                                            }
                                            b61Var.setFilled(true);
                                            b61Var.i(jb6.M0(2131750365, null), !this.Z2, true);
                                            b61Var.g(null, !this.Z2);
                                            b61Var.setOnClickListener(new lpa(this, (byte) 0));
                                        }
                                    }
                                    tL_starGiftUnique2 = tL_starGiftUnique;
                                    this.o1.setTitle(this.Q2);
                                    hsaVar2 = this.K2;
                                    if (hsaVar2 == null) {
                                    }
                                }
                            } else {
                                b4 = 0;
                                str2 = null;
                                if (!TextUtils.isEmpty(str5)) {
                                    final String str8 = tL_starGiftUnique.owner_address;
                                    Y0(mhbVar, jb6.M0(2131750019, null), str8, this.J0).setOnClickListener(new View.OnClickListener(this) { // from class: opa
                                        public final /* synthetic */ wsa b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            byte b102 = b;
                                            String str72 = str8;
                                            wsa wsaVar = this.b;
                                            switch (b102) {
                                                case 0:
                                                    gm.g(str72);
                                                    wsaVar.j().Q(R.raw.copy, 36, jb6.M0(2131742885, null)).k(false);
                                                    break;
                                                case 1:
                                                    gm.g(str72);
                                                    wsaVar.j().Q(R.raw.copy, 36, jb6.M0(2131742885, null)).k(false);
                                                    break;
                                                default:
                                                    gm.g(str72);
                                                    wsaVar.j().Q(R.raw.copy, 36, jb6.M0(2131742885, null)).k(false);
                                                    break;
                                            }
                                        }
                                    });
                                } else if (n != 0) {
                                    byte b13 = b;
                                    r10 = 0;
                                    r12 = 0;
                                    i2 = 33;
                                    i = 8;
                                    this.h3 = ((jhb) this.d2.o(jb6.M0(2131750019, null), this.a, n, new ppa(this, n, b)).getChildAt(b13 == true ? 1 : 0)).getChildAt(0);
                                    r13 = b13;
                                    a1(jva.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class));
                                    a1(jva.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
                                    a1(jva.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
                                    if (!z) {
                                    }
                                    stargiftattributeoriginaldetails = (TL_stars.starGiftAttributeOriginalDetails) jva.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeOriginalDetails.class);
                                    if (stargiftattributeoriginaldetails != null) {
                                    }
                                    if (this.d3 != null) {
                                    }
                                    hsaVar = this.K2;
                                    b61 b61Var2 = this.f2;
                                    if (hsaVar != null) {
                                    }
                                    if (this.d3 != null) {
                                    }
                                    tL_starGiftUnique2 = tL_starGiftUnique;
                                    this.o1.setTitle(this.Q2);
                                    hsaVar2 = this.K2;
                                    if (hsaVar2 == null) {
                                    }
                                } else if (tL_starGiftUnique.owner_name != null) {
                                    mhbVar.f(jb6.M0(2131750019, null), tL_starGiftUnique.owner_name, null, null);
                                }
                                b3 = b4;
                                str = str2;
                                b2 = b;
                            }
                        }
                        i2 = 33;
                        i = 8;
                        r10 = str;
                        r12 = b3;
                        r13 = b2;
                        a1(jva.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class));
                        a1(jva.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
                        a1(jva.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
                        if (!z) {
                        }
                        stargiftattributeoriginaldetails = (TL_stars.starGiftAttributeOriginalDetails) jva.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeOriginalDetails.class);
                        if (stargiftattributeoriginaldetails != null) {
                        }
                        if (this.d3 != null) {
                        }
                        hsaVar = this.K2;
                        b61 b61Var22 = this.f2;
                        if (hsaVar != null) {
                        }
                        if (this.d3 != null) {
                        }
                        tL_starGiftUnique2 = tL_starGiftUnique;
                        this.o1.setTitle(this.Q2);
                        hsaVar2 = this.K2;
                        if (hsaVar2 == null) {
                        }
                    } else {
                        charSequence2 = stargiftattributemodel.name;
                    }
                }
                charSequence = charSequence2;
                if (tL_textWithEntities != null) {
                }
                spannable = null;
                ssaVar2.h(0, spannableStringBuilder, charSequence, h2(tL_starGiftUnique.released_by), null, tLObject, spannable);
                this.h3 = null;
                mhb mhbVar2 = this.d2;
                mhbVar2.removeAllViews();
                if (z) {
                }
                i2 = 33;
                i = 8;
                r10 = str;
                r12 = b3;
                r13 = b2;
                a1(jva.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class));
                a1(jva.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
                a1(jva.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
                if (!z) {
                }
                stargiftattributeoriginaldetails = (TL_stars.starGiftAttributeOriginalDetails) jva.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeOriginalDetails.class);
                if (stargiftattributeoriginaldetails != null) {
                }
                if (this.d3 != null) {
                }
                hsaVar = this.K2;
                b61 b61Var222 = this.f2;
                if (hsaVar != null) {
                }
                if (this.d3 != null) {
                }
                tL_starGiftUnique2 = tL_starGiftUnique;
                this.o1.setTitle(this.Q2);
                hsaVar2 = this.K2;
                if (hsaVar2 == null) {
                }
            }
        } else {
            M0 = gs7.c(this.d3).e();
        }
        charSequence = M0;
        b = 1;
        if (tL_textWithEntities != null) {
        }
        spannable = null;
        ssaVar2.h(0, spannableStringBuilder, charSequence, h2(tL_starGiftUnique.released_by), null, tLObject, spannable);
        this.h3 = null;
        mhb mhbVar22 = this.d2;
        mhbVar22.removeAllViews();
        if (z) {
        }
        i2 = 33;
        i = 8;
        r10 = str;
        r12 = b3;
        r13 = b2;
        a1(jva.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class));
        a1(jva.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
        a1(jva.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
        if (!z) {
        }
        stargiftattributeoriginaldetails = (TL_stars.starGiftAttributeOriginalDetails) jva.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeOriginalDetails.class);
        if (stargiftattributeoriginaldetails != null) {
        }
        if (this.d3 != null) {
        }
        hsaVar = this.K2;
        b61 b61Var2222 = this.f2;
        if (hsaVar != null) {
        }
        if (this.d3 != null) {
        }
        tL_starGiftUnique2 = tL_starGiftUnique;
        this.o1.setTitle(this.Q2);
        hsaVar2 = this.K2;
        if (hsaVar2 == null) {
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        nm7.f(this.a).b(this, nm7.I3);
        nm7.f(this.a).b(this, nm7.e4);
    }

    @Override // my0, android.app.Dialog
    public final void onBackPressed() {
        ssa ssaVar;
        ura uraVar;
        if (this.W2.c(4) && (ssaVar = this.a2) != null && (uraVar = ssaVar.N) != null) {
            if (uraVar.i0) {
                return;
            }
            if (uraVar.j0) {
                super.onBackPressed();
                return;
            }
        }
        if (this.v2 || this.W2.b <= 0 || this.f2.R || this.l3) {
            super.onBackPressed();
            return;
        }
        k47 k47Var = this.C2;
        if (k47Var != null) {
            l2(k47Var, null);
        } else {
            TL_stars.SavedStarGift savedStarGift = this.A2;
            if (savedStarGift != null) {
                n2(savedStarGift, this.B2);
            } else {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = this.E2;
                if (tL_starGiftUnique != null) {
                    m2(this.D2, tL_starGiftUnique, this.B2);
                }
            }
        }
        z2(0, true, null);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        nm7.f(this.a).n(this, nm7.I3);
        nm7.f(this.a).n(this, nm7.e4);
    }

    @Override // my0
    public final void p0() {
        super.p0();
        try {
            L(cmb.g5);
            ssa ssaVar = this.a2;
            if (ssaVar != null) {
                ssaVar.l();
            }
            pn2 pn2Var = this.Y2;
            if (pn2Var != null) {
                Drawable drawable = pn2Var.c;
                if (drawable instanceof tsa) {
                    ((tsa) drawable).d.setColor(cmb.v0(cmb.Ei, this.J0));
                    b61 b61Var = this.f2;
                    if (b61Var != null) {
                        b61Var.invalidate();
                    }
                }
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public final int p1() {
        if (this.W2.d(1)) {
            return this.n2.getMeasuredHeight();
        }
        if (this.W2.d(2)) {
            return this.w2.getMeasuredHeight();
        }
        if (this.W2.d(3)) {
            return this.y2.getMeasuredHeight();
        }
        if (this.W2.d(4)) {
            return 0;
        }
        return this.b2.getMeasuredHeight();
    }

    public final void p2(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        nk resellAmount = tL_starGiftUnique.getResellAmount(ok.a);
        boolean z = tL_starGiftUnique.resale_ton_only;
        b61 b61Var = this.f2;
        if (z) {
            b61Var.i(nxa.t1(nxa.V0(jb6.a0(null, null, 2131745879, tL_starGiftUnique.getResellAmount(ok.b).d()), true), true), !this.Z2, true);
            b61Var.g(fs7.m(tL_starGiftUnique) ? null : nxa.T0(jb6.H(',', "ResellGiftBuyEq", (int) resellAmount.a())), !this.Z2);
        } else {
            b61Var.i(nxa.T0(jb6.H(',', "ResellGiftBuy", (int) resellAmount.a())), !this.Z2, true);
            b61Var.g(null, !this.Z2);
        }
    }

    public final long q1() {
        TLRPC.Peer peer;
        k47 k47Var = this.C2;
        if (k47Var == null) {
            TL_stars.SavedStarGift savedStarGift = this.A2;
            if (savedStarGift != null) {
                TL_stars.StarGift starGift = savedStarGift.gift;
                return starGift instanceof TL_stars.TL_starGiftUnique ? pg3.n(((TL_stars.TL_starGiftUnique) starGift).owner_id) : this.S1;
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.E2;
            if (tL_starGiftUnique != null) {
                return pg3.n(tL_starGiftUnique.owner_id);
            }
            return 0L;
        }
        TLRPC.Message message = k47Var.k;
        if (message == null) {
            return 0L;
        }
        TLRPC.MessageAction messageAction = message.action;
        if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
            TLRPC.Peer peer2 = ((TLRPC.TL_messageActionStarGift) messageAction).peer;
            return peer2 != null ? pg3.n(peer2) : k47Var.O3() ? k47.B0(this.C2.k) : z8c.h(this.a).e();
        }
        if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
            return 0L;
        }
        TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
        TL_stars.StarGift starGift2 = tL_messageActionStarGiftUnique.gift;
        if ((starGift2 instanceof TL_stars.TL_starGiftUnique) && (peer = starGift2.owner_id) != null) {
            return pg3.n(peer);
        }
        TLRPC.Peer peer3 = tL_messageActionStarGiftUnique.peer;
        if (peer3 != null) {
            return pg3.n(peer3);
        }
        return 0L;
    }

    public final void q2(TL_stars.TL_starGiftUnique tL_starGiftUnique, boolean z) {
        if (z) {
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_peerUser.user_id = z8c.h(this.a).e();
            tL_starGiftUnique.host_id = tL_peerUser;
            tL_starGiftUnique.flags |= TLObject.FLAG_12;
        } else {
            tL_starGiftUnique.host_id = null;
            tL_starGiftUnique.flags &= -4097;
        }
        this.a2.setWalletDisplayed(z);
        D2();
    }

    public final TL_stars.StarGift r1() {
        k47 k47Var = this.C2;
        if (k47Var != null) {
            TLRPC.Message message = k47Var.k;
            if (message == null) {
                return null;
            }
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                return ((TLRPC.TL_messageActionStarGift) messageAction).gift;
            }
            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                return ((TLRPC.TL_messageActionStarGiftUnique) messageAction).gift;
            }
        } else {
            TL_stars.SavedStarGift savedStarGift = this.A2;
            if (savedStarGift != null) {
                return savedStarGift.gift;
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.E2;
            if (tL_starGiftUnique != null) {
                return tL_starGiftUnique;
            }
        }
        return null;
    }

    public final void r2(boolean z) {
        int w1 = w1();
        if (w1 >= 0) {
            int i = (z ? 1 : -1) + w1;
            int i2 = this.P2;
            if (i2 >= 0 && (!z ? i2 < w1 : i2 > w1)) {
                i = i2;
            }
            bva bvaVar = this.B2;
            Object obj = (bvaVar == null || i < 0 || i >= bvaVar.e()) ? null : this.B2.get(i);
            if (obj != null) {
                if ((z ? this.Y1 : this.X1) != null) {
                    if (obj instanceof TL_stars.SavedStarGift) {
                        if (m1((z ? this.Y1 : this.X1).A2, (TL_stars.SavedStarGift) obj)) {
                            return;
                        }
                    }
                    if (obj instanceof TL_stars.TL_starGiftUnique) {
                        if (n1((z ? this.Y1 : this.X1).E2, (TL_stars.TL_starGiftUnique) obj)) {
                            return;
                        }
                    }
                }
                ix4 ix4Var = new ix4(this, getContext(), this.a, this.S1, this.J0, this.T1.getRootView());
                if (obj instanceof TL_stars.SavedStarGift) {
                    ix4Var.n2((TL_stars.SavedStarGift) obj, this.B2);
                } else if (obj instanceof TL_stars.TL_starGiftUnique) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
                    ix4Var.m2(tL_starGiftUnique.slug, tL_starGiftUnique, this.B2);
                }
                gm.B2(ix4Var.b);
                if (z) {
                    this.Y1 = ix4Var;
                } else {
                    this.X1 = ix4Var;
                }
            }
        }
    }

    public final String s1() {
        TL_stars.StarGift r1 = r1();
        if (!(r1 instanceof TL_stars.TL_starGiftUnique)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(((TL_stars.TL_starGiftUnique) r1).title);
        sb.append(" #");
        return kt6.m(r3.num, ',', sb);
    }

    public final void s2() {
        TL_stars.TL_starGiftUnique A1 = A1();
        if (A1 == null) {
            return;
        }
        TLRPC.Peer peer = A1.owner_id;
        if (peer == null) {
            peer = A1.host_id;
        }
        long n = pg3.n(peer);
        StringBuilder sb = new StringBuilder();
        sb.append(A1.title);
        sb.append(" #");
        this.x2.setText(jb6.a0(null, null, 2131749766, kt6.m(A1.num, ',', sb)));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(jb6.M0(2131749768, null));
        if (n == z8c.h(this.a).e() && !z8c.h(this.a).p()) {
            spannableStringBuilder.append((CharSequence) " l");
            pn2 pn2Var = this.S2;
            if (pn2Var == null) {
                pn2Var = new pn2(R.drawable.msg_mini_lock3, 0);
                this.S2 = pn2Var;
            }
            spannableStringBuilder.setSpan(pn2Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        b61 b61Var = this.f2;
        b61Var.i(spannableStringBuilder, true, true);
        b61Var.g(null, true);
        b61Var.setOnClickListener(new rqa(this, (byte) 2));
        this.a2.setWearPreview(oc7.r1(this.a).a2(n));
        z2(2, false, null);
        this.v2 = true;
    }

    @Override // my0, android.app.Dialog
    public final void show() {
        k47 k47Var;
        TLRPC.Message message;
        String str;
        if (oc7.r1(this.a).u2()) {
            h5.b(this.a);
            return;
        }
        TL_wallet.nftItem nftitem = this.a3;
        if (nftitem != null && (str = this.D2) != null && this.E2 != null) {
            TL_stars.getUniqueStarGift getuniquestargift = new TL_stars.getUniqueStarGift();
            getuniquestargift.slug = str;
            ConnectionsManager.getInstance(this.a).sendRequest(getuniquestargift, new fm8((Object) this, (Object) nftitem, (Object) str, (byte) 16));
        }
        if (this.D2 != null && this.E2 == null) {
            he heVar = new he(3, null, getContext());
            heVar.q(500L);
            TL_stars.getUniqueStarGift getuniquestargift2 = new TL_stars.getUniqueStarGift();
            getuniquestargift2.slug = this.D2;
            ConnectionsManager.getInstance(this.a).sendRequest(getuniquestargift2, new jl7(this, heVar, (byte) 27));
        } else if (this.A2 == null && (k47Var = this.C2) != null && (message = k47Var.k) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                if (tL_messageActionStarGift.upgraded) {
                    if (tL_messageActionStarGift.upgrade_msg_id != 0) {
                        he heVar2 = new he(3, null, getContext());
                        heVar2.q(500L);
                        TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                        tL_messages_getMessages.id.add(Integer.valueOf(tL_messageActionStarGift.upgrade_msg_id));
                        ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_getMessages, new fm8((Object) this, (Object) tL_messageActionStarGift, heVar2, (byte) 14));
                        return;
                    }
                    if (u1() != null) {
                        he heVar3 = new he(3, null, getContext());
                        heVar3.q(500L);
                        jva.v(this.a, false).J(u1(), new ts9(this, heVar3, (byte) 7));
                        return;
                    }
                }
            }
        }
        super.show();
    }

    public final void t2(CharSequence charSequence) {
        TL_stars.TL_starGiftUnique A1 = A1();
        TL_stars.InputSavedStarGift u1 = u1();
        if (u1 == null || A1 == null) {
            return;
        }
        TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails = new TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails();
        tL_inputInvoiceStarGiftDropOriginalDetails.stargift = u1;
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftDropOriginalDetails;
        JSONObject u = wx0.u(this.J0, false);
        if (u != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = u.toString();
            tL_payments_getPaymentForm.flags |= 1;
        }
        ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getPaymentForm, new av0((Object) this, (Object) charSequence, (Object) A1, (Object) tL_inputInvoiceStarGiftDropOriginalDetails, (byte) 20));
    }

    public final TL_stars.InputSavedStarGift u1() {
        TLRPC.Message message;
        TLRPC.Message message2;
        TLRPC.Message message3;
        long j = this.S1;
        if (j < 0) {
            TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat = new TL_stars.TL_inputSavedStarGiftChat();
            tL_inputSavedStarGiftChat.peer = oc7.r1(this.a).i1(j);
            k47 k47Var = this.C2;
            if (k47Var == null || (message3 = k47Var.k) == null) {
                TL_stars.SavedStarGift savedStarGift = this.A2;
                if (savedStarGift != null) {
                    if ((savedStarGift.flags & 2048) == 0) {
                        return null;
                    }
                    tL_inputSavedStarGiftChat.saved_id = savedStarGift.saved_id;
                    return tL_inputSavedStarGiftChat;
                }
                if (this.E2 == null || TextUtils.isEmpty(this.D2)) {
                    return tL_inputSavedStarGiftChat;
                }
                TL_stars.TL_inputSavedStarGiftSlug tL_inputSavedStarGiftSlug = new TL_stars.TL_inputSavedStarGiftSlug();
                tL_inputSavedStarGiftSlug.slug = this.D2;
                return tL_inputSavedStarGiftSlug;
            }
            TLRPC.MessageAction messageAction = message3.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                if ((tL_messageActionStarGift.flags & TLObject.FLAG_12) == 0) {
                    return null;
                }
                tL_inputSavedStarGiftChat.saved_id = tL_messageActionStarGift.saved_id;
                return tL_inputSavedStarGiftChat;
            }
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                return null;
            }
            TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
            if ((tL_messageActionStarGiftUnique.flags & 128) == 0) {
                return null;
            }
            tL_inputSavedStarGiftChat.saved_id = tL_messageActionStarGiftUnique.saved_id;
            return tL_inputSavedStarGiftChat;
        }
        k47 k47Var2 = this.C2;
        if (k47Var2 != null && (message2 = k47Var2.k) != null) {
            TLRPC.MessageAction messageAction2 = message2.action;
            if ((messageAction2 instanceof TLRPC.TL_messageActionStarGift) && (messageAction2.flags & TLObject.FLAG_12) != 0) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift2 = (TLRPC.TL_messageActionStarGift) messageAction2;
                TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat2 = new TL_stars.TL_inputSavedStarGiftChat();
                oc7 r1 = oc7.r1(this.a);
                TLRPC.Peer peer = tL_messageActionStarGift2.peer;
                tL_inputSavedStarGiftChat2.peer = r1.i1(peer != null ? pg3.n(peer) : k47.B0(this.C2.k));
                tL_inputSavedStarGiftChat2.saved_id = tL_messageActionStarGift2.saved_id;
                return tL_inputSavedStarGiftChat2;
            }
        }
        if (k47Var2 != null && (message = k47Var2.k) != null) {
            TLRPC.MessageAction messageAction3 = message.action;
            if ((messageAction3 instanceof TLRPC.TL_messageActionStarGiftUnique) && (messageAction3.flags & 128) != 0) {
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique2 = (TLRPC.TL_messageActionStarGiftUnique) messageAction3;
                TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat3 = new TL_stars.TL_inputSavedStarGiftChat();
                oc7 r12 = oc7.r1(this.a);
                TLRPC.Peer peer2 = tL_messageActionStarGiftUnique2.peer;
                tL_inputSavedStarGiftChat3.peer = r12.i1(peer2 != null ? pg3.n(peer2) : k47.B0(this.C2.k));
                tL_inputSavedStarGiftChat3.saved_id = tL_messageActionStarGiftUnique2.saved_id;
                return tL_inputSavedStarGiftChat3;
            }
        }
        TL_stars.TL_inputSavedStarGiftUser tL_inputSavedStarGiftUser = new TL_stars.TL_inputSavedStarGiftUser();
        k47 k47Var3 = this.C2;
        if (k47Var3 != null) {
            TLRPC.Message message4 = k47Var3.k;
            if (message4 != null) {
                TLRPC.MessageAction messageAction4 = message4.action;
                if ((messageAction4 instanceof TLRPC.TL_messageActionStarGift) && (messageAction4.flags & 32768) != 0) {
                    tL_inputSavedStarGiftUser.msg_id = ((TLRPC.TL_messageActionStarGift) messageAction4).gift_msg_id;
                    return tL_inputSavedStarGiftUser;
                }
            }
            tL_inputSavedStarGiftUser.msg_id = k47Var3.e1();
            return tL_inputSavedStarGiftUser;
        }
        TL_stars.SavedStarGift savedStarGift2 = this.A2;
        if (savedStarGift2 != null) {
            tL_inputSavedStarGiftUser.msg_id = savedStarGift2.msg_id;
            return tL_inputSavedStarGiftUser;
        }
        if (this.E2 == null || TextUtils.isEmpty(this.D2)) {
            return tL_inputSavedStarGiftUser;
        }
        TL_stars.TL_inputSavedStarGiftSlug tL_inputSavedStarGiftSlug2 = new TL_stars.TL_inputSavedStarGiftSlug();
        tL_inputSavedStarGiftSlug2.slug = this.D2;
        return tL_inputSavedStarGiftSlug2;
    }

    public final void u2(View view, CharSequence charSequence, boolean z) {
        Layout layout;
        float primaryHorizontal;
        hg5 hg5Var = this.w3;
        if ((hg5Var != null && hg5Var.W && this.x3 == view) || view == null) {
            return;
        }
        if (!z) {
            if (view instanceof TextView) {
                layout = ((TextView) view).getLayout();
            } else if (!(view instanceof lka)) {
                return;
            } else {
                layout = ((lka) view).getLayout();
            }
            if (layout == null) {
                return;
            }
            CharSequence text = layout.getText();
            if (!(text instanceof Spanned)) {
                return;
            }
            Spanned spanned = (Spanned) text;
            y51[] y51VarArr = (y51[]) spanned.getSpans(0, spanned.length(), y51.class);
            if (y51VarArr == null || y51VarArr.length <= 0) {
                return;
            }
            primaryHorizontal = layout.getPrimaryHorizontal(spanned.getSpanStart(y51VarArr[y51VarArr.length - 1])) + view.getPaddingLeft() + (r5.a() / 2.0f);
        } else {
            if (!(view instanceof lka)) {
                return;
            }
            lka lkaVar = (lka) view;
            primaryHorizontal = (lkaVar.getRightDrawableWidth() / 2.0f) + lkaVar.getRightDrawableX();
        }
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr);
        jp0 jp0Var = this.T1;
        jp0Var.getLocationOnScreen(iArr2);
        iArr[0] = iArr[0] - iArr2[0];
        iArr[1] = iArr[1] - iArr2[1];
        hg5 hg5Var2 = this.w3;
        if (hg5Var2 != null) {
            hg5Var2.f(true);
            this.w3 = null;
        }
        hg5 hg5Var3 = new hg5(getContext(), 3);
        hg5Var3.p(!z);
        hg5Var3.t(charSequence);
        hg5Var3.o(0.0f, (iArr[0] + primaryHorizontal) - (gm.L(16.0f) + this.u0));
        hg5Var3.setTranslationY(((iArr[1] - gm.L(100.0f)) - (view.getHeight() / 2.0f)) + gm.L((z ? 18 : 0) + 4.33f));
        hg5Var3.d = 3000L;
        hg5Var3.setPadding(gm.L(16.0f) + this.u0, 0, gm.L(16.0f) + this.u0, 0);
        hg5Var3.r0 = new hi(hg5Var3, (byte) 8);
        hg5Var3.v();
        jp0Var.addView(hg5Var3, qoe.c(100.0f, -1));
        this.w3 = hg5Var3;
        this.x3 = view;
    }

    public final String v1() {
        TL_stars.StarGift r1 = r1();
        if (!(r1 instanceof TL_stars.TL_starGiftUnique) || r1.slug == null) {
            return null;
        }
        return oc7.r1(this.a).N2 + "/nft/" + r1.slug;
    }

    public final void v2(int i, Context context, boolean z) {
        LinearLayout i2 = hg9.i(context, 1);
        FrameLayout frameLayout = new FrameLayout(context);
        int L = gm.L(64.0f);
        int i3 = cmb.Ei;
        ShapeDrawable K = cmb.K(L, cmb.v0(i3, this.J0));
        wmb M = anb.M(i3);
        ylb ylbVar = this.J0;
        frameLayout.setBackground(K);
        anb.j(frameLayout, K, M, null, ylbVar);
        i2.addView(frameLayout, qoe.t(64, 64, 49, 0, 6, 0, 0));
        s09 s09Var = new s09(context);
        s09Var.setScaleType(ImageView.ScaleType.CENTER);
        s09Var.f(R.raw.timer_3, 42, 42, null);
        frameLayout.addView(s09Var, qoe.r(64, 64, 17));
        s09Var.d();
        TextView b = jxe.b(context, 20.0f, cmb.F6, true, null);
        b.setGravity(17);
        b.setText(jb6.M0(z ? 2131749938 : 2131749844, null));
        i2.addView(b, qoe.t(-1, -2, 48, 24, 14, 24, 0));
        TextView b2 = jxe.b(context, 14.0f, cmb.E6, false, null);
        b2.setGravity(17);
        b2.setText(jb6.a0(null, null, z ? 2131749939 : 2131749845, jb6.c0(Math.max(10, i))));
        i2.addView(b2, qoe.t(-1, -2, 48, 24, 6, 24, 6));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.J0, context);
        alertDialog$Builder.n(i2);
        alertDialog$Builder.j(jb6.M0(2131747564, null), null);
        alertDialog$Builder.o();
    }

    public final int w1() {
        int indexOf;
        bva bvaVar = this.B2;
        if (bvaVar == null) {
            return -1;
        }
        TL_stars.SavedStarGift savedStarGift = this.A2;
        if (savedStarGift != null) {
            indexOf = bvaVar.indexOf(savedStarGift);
        } else {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.E2;
            if (tL_starGiftUnique == null) {
                return -1;
            }
            indexOf = bvaVar.indexOf(tL_starGiftUnique);
        }
        if (indexOf >= 0) {
            return indexOf;
        }
        TL_stars.StarGift r1 = r1();
        for (int i = 0; i < this.B2.e(); i++) {
            Object obj = this.B2.get(i);
            if (obj instanceof TL_stars.SavedStarGift) {
                TL_stars.SavedStarGift savedStarGift2 = this.A2;
                if (savedStarGift2 != null) {
                    if (m1(savedStarGift2, (TL_stars.SavedStarGift) obj)) {
                        return i;
                    }
                }
                if (r1 != null) {
                    TL_stars.StarGift starGift = ((TL_stars.SavedStarGift) obj).gift;
                    if (r1 != starGift) {
                        if ((r1 instanceof TL_stars.TL_starGiftUnique) && (starGift instanceof TL_stars.TL_starGiftUnique) && r1.id == starGift.id) {
                        }
                    }
                    return i;
                }
                continue;
            } else {
                if ((obj instanceof TL_stars.TL_starGiftUnique) && n1(this.E2, (TL_stars.TL_starGiftUnique) obj)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public final boolean w2() {
        if (!fs7.m(A1())) {
            return false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.J0, getContext());
        String M0 = jb6.M0(2131749851, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        heVar.U = jb6.M0(2131749464, null);
        if (h1()) {
            alertDialog$Builder.j(jb6.M0(2131750365, null), new ypa(this, (byte) 2));
            alertDialog$Builder.g(jb6.M0(2131752542, null), null);
        } else {
            alertDialog$Builder.j(jb6.M0(2131747564, null), null);
        }
        alertDialog$Builder.o();
        return true;
    }

    @Override // my0
    public final void x0(int i) {
        super.x0(i);
        gm.o3(this, 0, false, null);
    }

    public final TL_stars.SavedStarGift x1(boolean z) {
        int w1 = w1();
        if (w1 >= 0) {
            int i = (z ? 1 : -1) + w1;
            int i2 = this.P2;
            if (i2 >= 0 && (!z ? i2 < w1 : i2 > w1)) {
                i = i2;
            }
            bva bvaVar = this.B2;
            Object obj = (bvaVar == null || i < 0 || i >= bvaVar.e()) ? null : this.B2.get(i);
            if (obj instanceof TL_stars.SavedStarGift) {
                return (TL_stars.SavedStarGift) obj;
            }
        }
        return null;
    }

    public final boolean x2(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        if (!wi8.A(tL_starGiftUnique) || TextUtils.isEmpty(tL_starGiftUnique.gift_address) || TextUtils.isEmpty(tL_starGiftUnique.owner_address) || fs7.m(tL_starGiftUnique)) {
            return false;
        }
        c C = c.C(this.a);
        return c.b(tL_starGiftUnique.owner_address, C.x()) || C.A().c(tL_starGiftUnique.gift_address);
    }

    public final TL_stars.TL_starGiftUnique y1(boolean z) {
        int w1 = w1();
        if (w1 >= 0) {
            int i = (z ? 1 : -1) + w1;
            int i2 = this.P2;
            if (i2 >= 0 && (!z ? i2 < w1 : i2 > w1)) {
                i = i2;
            }
            bva bvaVar = this.B2;
            Object obj = (bvaVar == null || i < 0 || i >= bvaVar.e()) ? null : this.B2.get(i);
            if (obj instanceof TL_stars.TL_starGiftUnique) {
                return (TL_stars.TL_starGiftUnique) obj;
            }
        }
        return null;
    }

    public final void y2(boolean z, he heVar, k11 k11Var, Runnable runnable) {
        k11Var.d();
        z8c h = z8c.h(this.a);
        TL_account.tmpPassword tmppassword = h.y;
        if (tmppassword != null && tmppassword.valid_until < ConnectionsManager.getInstance(this.a).getCurrentTime() + 60) {
            h.y = null;
            h.u(false);
        }
        TL_account.tmpPassword tmppassword2 = h.y;
        if (tmppassword2 == null) {
            Z1(z, k11Var, runnable);
        } else {
            C1(tmppassword2.tmp_password, null, z, new m45(this, z, k11Var, runnable, heVar));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z2(int i, boolean z, n28 n28Var) {
        int i2;
        hg5 hg5Var;
        hsa hsaVar;
        ValueAnimator valueAnimator = this.X2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.X2 = null;
        }
        ssa ssaVar = this.a2;
        if (i != 1) {
            gm.r(ssaVar.p0);
        }
        if (!this.Z2) {
            this.V2 = Float.valueOf(this.T1.f());
        }
        xra xraVar = this.W2;
        this.W2 = new xra(xraVar == null ? (byte) 0 : xraVar.b, i);
        ny0 ny0Var = this.O2;
        int finalHeight = ssaVar.getFinalHeight();
        int p1 = p1();
        if (this.W2.d(1)) {
            FrameLayout frameLayout = this.i2;
            if (frameLayout.getVisibility() == 0) {
                i2 = frameLayout.getMeasuredHeight();
                ny0Var.H(finalHeight, p1 + i2);
                if (this.W2.b == 0 && (hsaVar = this.K2) != null) {
                    hsaVar.c();
                }
                xra xraVar2 = this.W2;
                byte b = 3;
                gra graVar = this.y2;
                gra graVar2 = this.w2;
                gra graVar3 = this.n2;
                gra graVar4 = this.b2;
                if (z) {
                    xraVar2.c = 1.0f;
                    O1();
                    graVar4.setVisibility(i == 0 ? 0 : 8);
                    graVar3.setVisibility(i == 1 ? 0 : 8);
                    graVar2.setVisibility(i == 2 ? 0 : 8);
                    graVar.setVisibility(i != 3 ? 8 : 0);
                    B2();
                    if (n28Var != null) {
                        n28Var.run();
                    }
                } else {
                    graVar4.setVisibility(xraVar2.b(0) ? 0 : 8);
                    graVar3.setVisibility(this.W2.b(1) ? 0 : 8);
                    graVar2.setVisibility(this.W2.b(2) ? 0 : 8);
                    graVar.setVisibility(this.W2.b(3) ? 0 : 8);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.X2 = ofFloat;
                    ofFloat.addUpdateListener(new rha(this, b));
                    this.X2.addListener(new zqa(this, i, n28Var));
                    this.X2.setInterpolator(d53.h);
                    this.X2.setDuration(320L);
                    this.X2.start();
                    xra xraVar3 = this.W2;
                    bf0[] bf0VarArr = ssaVar.d;
                    byte b2 = xraVar3.a;
                    byte b3 = xraVar3.b;
                    if (b2 != b3) {
                        p09 y = bf0VarArr[b2].getImageReceiver().y();
                        p09 y2 = bf0VarArr[b3].getImageReceiver().y();
                        if (y2 != null && y != null) {
                            y2.O(false, y.o());
                        }
                    }
                }
                hg5Var = this.w3;
                if (hg5Var == null) {
                    hg5Var.f(true);
                    this.w3 = null;
                    return;
                }
                return;
            }
        }
        i2 = 0;
        ny0Var.H(finalHeight, p1 + i2);
        if (this.W2.b == 0) {
            hsaVar.c();
        }
        xra xraVar22 = this.W2;
        byte b4 = 3;
        gra graVar5 = this.y2;
        gra graVar22 = this.w2;
        gra graVar32 = this.n2;
        gra graVar42 = this.b2;
        if (z) {
        }
        hg5Var = this.w3;
        if (hg5Var == null) {
        }
    }
}
