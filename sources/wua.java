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
import java.util.HashMap;
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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public class wua extends ny0 implements fn7 {
    public TL_stars.SavedStarGift A2;
    public bxa B2;
    public r47 C2;
    public String D2;
    public TL_stars.TL_starGiftUnique E2;
    public boolean F2;
    public boolean G2;
    public boolean H2;
    public boolean I2;
    public boolean J2;
    public iua K2;
    public boolean L2;
    public ita M2;
    public final int[] N2;
    public ox0 O2;
    public int P2;
    public String Q2;
    public ld9 R2;
    public final long S1;
    public wm2 S2;
    public final jo0 T1;
    public boolean T2;
    public final fta U1;
    public zsa U2;
    public final tj4 V1;
    public Float V2;
    public final View W1;
    public yta W2;
    public mx4 X1;
    public ValueAnimator X2;
    public mx4 Y1;
    public wm2 Y2;
    public final hta Z1;
    public boolean Z2;
    public final sua a2;
    public TL_wallet.nftItem a3;
    public final gta b2;
    public dqc b3;
    public final p66 c2;
    public eqc c3;
    public final hjb d2;
    public TL_wallet.walletTransaction d3;
    public final p66 e2;
    public final LinearLayout e3;
    public final c51 f2;
    public final TextView f3;
    public final FrameLayout g2;
    public final TextView g3;
    public final p66 h2;
    public View h3;
    public final FrameLayout i2;
    public qt8 i3;
    public final View j2;
    public boolean j3;
    public final FrameLayout k2;
    public Boolean k3;
    public uua l2;
    public boolean l3;
    public boolean m2;
    public ArrayList m3;
    public final gta n2;
    public ArrayList n3;
    public final bc[] o2;
    public ArrayList o3;
    public final View p2;
    public boolean p3;
    public final LinearLayout q2;
    public TLRPC.PaymentForm q3;
    public final og2 r2;
    public final wm2[] r3;
    public final TextView s2;
    public final jra s3;
    public final LinearLayout t2;
    public int t3;
    public final og2 u2;
    public Boolean u3;
    public boolean v2;
    public boolean v3;
    public final gta w2;
    public kg5 w3;
    public final TextView x2;
    public View x3;
    public final gta y2;
    public boolean z2;

    public wua(Context context, int i, long j, vnb vnbVar, View view) {
        super(context, null, false, false, vnbVar);
        this.m2 = false;
        this.N2 = new int[2];
        this.P2 = -1;
        this.Q2 = "";
        this.W2 = new yta(0, 0);
        this.Z2 = true;
        this.r3 = new wm2[1];
        this.s3 = new jra(this, (byte) 15);
        this.v3 = true;
        this.a = i;
        this.S1 = j;
        this.u1 = Math.max(0.05f, hl.L(82.0f) / (hl.q.y + hl.m));
        this.x = true;
        this.b = new d26((byte) 26, context, this);
        jo0 jo0Var = new jo0(this, context);
        this.T1 = jo0Var;
        fta ftaVar = new fta(this, context);
        this.U1 = ftaVar;
        ftaVar.setAdapter(new bn0((byte) 7, context, this));
        D2();
        View view2 = new View(context);
        this.W1 = view2;
        int i2 = aob.h5;
        yob.h(i2, vnbVar, view2);
        FrameLayout.LayoutParams e = tre.e(-1, 50, 80);
        int i3 = this.u0;
        e.rightMargin = i3;
        e.leftMargin = i3;
        this.b.addView(view2, e);
        this.b.addView(ftaVar, tre.e(-1, -1, jn7.D1));
        L(i2);
        hl.B2(this.n1);
        jo0Var.addView(this.n1, tre.e(-1, -1, jn7.D1));
        if (Build.VERSION.SDK_INT >= 26) {
            this.n1.setDefaultFocusHighlightEnabled(false);
        }
        gta gtaVar = new gta(this, context, (byte) 0);
        this.b2 = gtaVar;
        gtaVar.setOrientation(1);
        gtaVar.setPadding(hl.L(14.0f) + this.u0, hl.L(16.0f), hl.L(14.0f) + this.u0, hl.L(68.0f));
        jo0Var.addView(gtaVar, tre.e(-1, -1, 55));
        LinearLayout linearLayout = new LinearLayout(context);
        this.e3 = linearLayout;
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        this.f3 = textView;
        textView.setSingleLine(true);
        textView.setGravity(17);
        textView.setIncludeFontPadding(false);
        bs2.t(textView, 1, 40.0f);
        int i4 = aob.Fi;
        yob.X(textView, i4, vnbVar);
        linearLayout.addView(textView, tre.r(-1, 50, 1));
        TextView textView2 = new TextView(context);
        this.g3 = textView2;
        textView2.setGravity(17);
        textView2.setIncludeFontPadding(false);
        textView2.setTextSize(1, 14.0f);
        yob.X(textView2, aob.z6, vnbVar);
        linearLayout.addView(textView2, tre.t(-1, 20, 1, 0, 3, 0, 0));
        gtaVar.addView(linearLayout, tre.k(0.0f, 4.0f, 0.0f, 16.0f, -1, -2));
        linearLayout.setVisibility(8);
        p66 p66Var = new p66(context, vnbVar);
        this.c2 = p66Var;
        int i5 = aob.q5;
        yob.X(p66Var, i5, vnbVar);
        p66Var.setTextSize(1, 12.0f);
        p66Var.setGravity(17);
        p66Var.setLineSpacing(hl.L(2.0f), 1.0f);
        yob.G(p66Var, aob.Xc, vnbVar);
        p66Var.setDisablePaddingsOffsetY(true);
        gtaVar.addView(p66Var, tre.t(-2, -2, 1, 4, -2, 4, 16));
        p66Var.setVisibility(8);
        hjb hjbVar = new hjb(context, vnbVar);
        this.d2 = hjbVar;
        gtaVar.addView(hjbVar, tre.k(0.0f, 0.0f, 0.0f, 12.0f, -1, -2));
        p66 p66Var2 = new p66(context, vnbVar);
        this.e2 = p66Var2;
        yob.X(p66Var2, i5, vnbVar);
        p66Var2.setTextSize(1, 12.0f);
        p66Var2.setGravity(17);
        p66Var2.setLineSpacing(hl.L(2.0f), 1.0f);
        yob.G(p66Var2, i4, vnbVar);
        p66Var2.setDisablePaddingsOffsetY(true);
        p66Var2.setPadding(hl.L(5.0f), 0, hl.L(5.0f), 0);
        gtaVar.addView(p66Var2, tre.t(-2, -2, 1, 4, 2, 4, 8));
        p66Var2.setVisibility(8);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.t2 = linearLayout2;
        linearLayout2.setPadding(hl.L(12.0f), hl.L(8.0f), hl.L(12.0f), hl.L(8.0f));
        linearLayout2.setOrientation(0);
        int i6 = aob.i6;
        hf0 Y = aob.Y(aob.v0(i6, vnbVar), 21, 21);
        uob M = yob.M(i6);
        linearLayout2.setBackground(Y);
        yob.j(linearLayout2, Y, null, M, vnbVar);
        og2 og2Var = new og2(24, vnbVar, context);
        this.u2 = og2Var;
        int i7 = aob.h7;
        int i8 = aob.j7;
        int i9 = aob.k7;
        og2Var.b(i7, i8, i9);
        og2Var.setDrawUnchecked(true);
        og2Var.a(false, false);
        og2Var.setDrawBackgroundAsArc(10);
        linearLayout2.addView(og2Var, tre.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView3 = new TextView(context);
        int i10 = aob.j5;
        yob.X(textView3, i10, vnbVar);
        bs2.r(14.0f, 1, 2131750350, textView3, null);
        linearLayout2.addView(textView3, tre.t(-2, -2, 16, 9, 0, 0, 0));
        gtaVar.addView(linearLayout2, tre.t(-2, -2, 1, 0, -4, 0, 4));
        iye.b(linearLayout2, 0.025f, 1.5f);
        linearLayout2.setOnClickListener(new hra(this, (byte) 21));
        linearLayout2.setVisibility(8);
        gta gtaVar2 = new gta(this, context, (byte) 1);
        this.n2 = gtaVar2;
        gtaVar2.setOrientation(1);
        gtaVar2.setPadding(hl.L(4.0f) + this.u0, hl.L(24.0f), hl.L(4.0f) + this.u0, hl.L(66.0f));
        jo0Var.addView(gtaVar2, tre.e(-1, -1, 55));
        bc[] bcVarArr = {r7, r7, r7};
        this.o2 = bcVarArr;
        bc bcVar = new bc(vnbVar, context, false);
        bcVar.a(R.drawable.menu_feature_unique, ob6.M0(2131749811, null), ob6.M0(2131749346, null));
        gtaVar2.addView(bcVarArr[0], tre.o(-1, -2));
        bc bcVar2 = new bc(vnbVar, context, false);
        bcVar2.a(R.drawable.menu_feature_tradable, ob6.M0(2131749805, null), ob6.M0(2131749344, null));
        gtaVar2.addView(bcVarArr[1], tre.o(-1, -2));
        bc bcVar3 = new bc(vnbVar, context, false);
        bcVar3.a(R.drawable.menu_wear, ob6.M0(2131749341, null), ob6.M0(2131749342, null));
        gtaVar2.addView(bcVarArr[2], tre.o(-1, -2));
        View view3 = new View(context);
        this.p2 = view3;
        int i11 = aob.d7;
        yob.h(i11, vnbVar, view3);
        gtaVar2.addView(view3, tre.n(1.0f / hl.p, -2, 7, 17, -4, 17, 6));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.q2 = linearLayout3;
        linearLayout3.setPadding(hl.L(12.0f), hl.L(8.0f), hl.L(12.0f), hl.L(8.0f));
        linearLayout3.setOrientation(0);
        hf0 Y2 = aob.Y(aob.v0(i6, vnbVar), 6, 6);
        uob M2 = yob.M(i6);
        linearLayout3.setBackground(Y2);
        yob.j(linearLayout3, Y2, null, M2, vnbVar);
        og2 og2Var2 = new og2(24, vnbVar, context);
        this.r2 = og2Var2;
        og2Var2.b(i7, i8, i9);
        og2Var2.setDrawUnchecked(true);
        og2Var2.a(false, false);
        og2Var2.setDrawBackgroundAsArc(10);
        linearLayout3.addView(og2Var2, tre.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView4 = new TextView(context);
        this.s2 = textView4;
        yob.X(textView4, i10, vnbVar);
        bs2.r(14.0f, 1, 2131750358, textView4, null);
        linearLayout3.addView(textView4, tre.t(-2, -2, 16, 9, 0, 0, 0));
        gtaVar2.addView(linearLayout3, tre.t(-2, -2, 1, 0, 0, 0, 4));
        iye.b(linearLayout3, 0.025f, 1.5f);
        gta gtaVar3 = new gta(this, context, (byte) 2);
        this.w2 = gtaVar3;
        gtaVar3.setOrientation(1);
        gtaVar3.setPadding(hl.L(4.0f) + this.u0, hl.L(20.0f), hl.L(4.0f) + this.u0, hl.L(66.0f));
        jo0Var.addView(gtaVar3, tre.e(-1, -1, 55));
        TextView textView5 = new TextView(context);
        this.x2 = textView5;
        yob.X(textView5, i10, vnbVar);
        textView5.setTextSize(1, 20.0f);
        textView5.setGravity(17);
        textView5.setTypeface(hl.o());
        gtaVar3.addView(textView5, tre.t(-1, -2, 7, 20, 0, 20, 0));
        TextView textView6 = new TextView(context);
        yob.X(textView6, i10, vnbVar);
        textView6.setTextSize(1, 14.0f);
        uh9.q(textView6, 17, null, 2131749780);
        gtaVar3.addView(textView6, tre.t(-1, -2, 7, 20, 6, 20, 24));
        bc bcVar4 = new bc(vnbVar, context, false);
        bcVar4.a(R.drawable.menu_feature_unique, ob6.M0(2131749786, null), ob6.M0(2131749787, null));
        gtaVar3.addView(r6[0], tre.o(-1, -2));
        bc bcVar5 = new bc(vnbVar, context, false);
        bcVar5.a(R.drawable.menu_feature_cover, ob6.M0(2131749784, null), ob6.M0(2131749785, null));
        gtaVar3.addView(r6[1], tre.o(-1, -2));
        bc bcVar6 = new bc(vnbVar, context, false);
        bc[] bcVarArr2 = {bcVar4, bcVar5, bcVar6};
        bcVar6.a(R.drawable.menu_verification, ob6.M0(2131749782, null), ob6.M0(2131749783, null));
        gtaVar3.addView(bcVarArr2[2], tre.o(-1, -2));
        gta gtaVar4 = new gta(this, context, (byte) 3);
        this.y2 = gtaVar4;
        gtaVar4.setOrientation(1);
        gtaVar4.setPadding(hl.L(4.0f) + this.u0, hl.L(10.0f), hl.L(4.0f) + this.u0, hl.L(92.0f));
        jo0Var.addView(gtaVar4, tre.e(-1, -1, 55));
        bc bcVar7 = new bc(vnbVar, context, false);
        bcVar7.a(R.drawable.menu_feature_unique, ob6.M0(2131749731, null), ob6.M0(2131749732, null));
        gtaVar4.addView(r7[0], tre.o(-1, -2));
        bc bcVar8 = new bc(vnbVar, context, false);
        bcVar8.a(R.drawable.menu_random, ob6.M0(2131749729, null), ob6.M0(2131749730, null));
        gtaVar4.addView(r7[1], tre.o(-1, -2));
        bc bcVar9 = new bc(vnbVar, context, false);
        bc[] bcVarArr3 = {bcVar7, bcVar8, bcVar9};
        bcVar9.a(R.drawable.menu_feature_affect, ob6.M0(2131749727, null), ob6.M0(2131749728, null));
        gtaVar4.addView(bcVarArr3[2], tre.o(-1, -2));
        gtaVar.setAlpha(1.0f);
        gtaVar2.setAlpha(0.0f);
        gtaVar3.setAlpha(0.0f);
        gtaVar4.setAlpha(0.0f);
        sua suaVar = new sua(context, vnbVar, new jra(this, (byte) 16), new hra(this, (byte) 22), new hra(this, (byte) 23), new hra(this, (byte) 24), new hra(this, (byte) 25), new hra(this, (byte) 26), new hra(this, (byte) 27), new hra(this, (byte) 28));
        this.a2 = suaVar;
        suaVar.N.c.setOnClickListener(new hra(this, (byte) 19));
        int i12 = this.u0;
        suaVar.setPadding(i12, 0, i12, 0);
        jo0Var.addView(suaVar, tre.e(-1, -2, 55));
        as asVar = this.m1;
        this.J1 = true;
        asVar.j1(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.g2 = frameLayout;
        yob.h(i2, vnbVar, frameLayout);
        View view4 = new View(context);
        this.j2 = view4;
        yob.h(i11, vnbVar, view4);
        view4.setAlpha(0.0f);
        frameLayout.addView(view4, tre.a(-1.0f, 1.0f / hl.p, 55));
        c51 i13 = xnb.i(24, vnbVar, context, true);
        this.f2 = i13;
        i13.i(ob6.M0(2131747558, null), false, true);
        i13.g(null, false);
        FrameLayout.LayoutParams d = tre.d(-1, 48.0f, jn7.D1, 0.0f, 12.0f, 0.0f, 12.0f);
        d.leftMargin = hl.L(14.0f) + this.u0;
        d.rightMargin = hl.L(14.0f) + this.u0;
        frameLayout.addView(i13, d);
        jo0Var.addView(frameLayout, tre.e(-1, 72, 87));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.i2 = frameLayout2;
        yob.h(i2, vnbVar, frameLayout2);
        p66 p66Var3 = new p66(context, null);
        this.h2 = p66Var3;
        p66Var3.setTextSize(1, 12.0f);
        yob.X(p66Var3, i4, vnbVar);
        yob.G(p66Var3, i4, vnbVar);
        p66Var3.setGravity(17);
        frameLayout2.addView(p66Var3, tre.d(-1, -2.0f, 17, 16.0f, 8.0f, 16.0f, 14.0f));
        jo0Var.addView(frameLayout2, tre.e(-1, -2, 87));
        frameLayout2.setVisibility(8);
        this.n1.setOnScrollListener(new e98(this, (byte) 25));
        linearLayout3.setOnClickListener(new hra(this, (byte) 20));
        tj4 tj4Var = new tj4(context);
        this.V1 = tj4Var;
        jo0Var.addView(tj4Var, tre.c(-1.0f, -1));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.k2 = frameLayout3;
        frameLayout3.setPadding(hl.L(6.0f) + this.u0, 0, hl.L(6.0f) + this.u0, 0);
        jo0Var.addView(frameLayout3, tre.d(-1, 200.0f, 87, 0.0f, 0.0f, 0.0f, 60.0f));
        hl.B2(this.o1);
        jo0Var.addView(this.o1, tre.d(-1, -2.0f, 0, 6.0f, 0.0f, 6.0f, 0.0f));
        hta htaVar = new hta(context);
        this.Z1 = htaVar;
        jo0Var.addView(htaVar, tre.e(-1, -2, 55));
        ArrayList arrayList = new ArrayList();
        if (view != null) {
            arrayList.add(view);
        }
        hl.k2(new sh9(htaVar, (byte) 8), 12.0f, 12, arrayList);
    }

    public static String A1(TL_stars.StarGiftAttributeRarity starGiftAttributeRarity, Integer[] numArr) {
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityUncommon) {
            numArr[0] = -12539616;
            return ob6.M0(2131749408, null);
        }
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityRare) {
            numArr[0] = -15619394;
            return ob6.M0(2131749409, null);
        }
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityEpic) {
            numArr[0] = -6988581;
            return ob6.M0(2131749411, null);
        }
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityLegendary) {
            numArr[0] = -4229632;
            return ob6.M0(2131749410, null);
        }
        if (!(starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarity)) {
            return "";
        }
        int i = ((TL_stars.TL_starGiftAttributeRarity) starGiftAttributeRarity).permille;
        return i <= 0 ? "<0.1%" : cc.J0(i);
    }

    public static boolean E1(int i, TL_stars.StarGift starGift) {
        if (!it7.n(starGift)) {
            return false;
        }
        if (!uc7.s1(i).k4.v0.f) {
            return true;
        }
        if (((TL_stars.TL_starGiftUnique) starGift).fixed_sale) {
            return false;
        }
        return !r2.s.f;
    }

    public static boolean G1(int i, long j) {
        return j >= 0 ? yac.h(i).e() == j : xc2.w(5, uc7.s1(i).M0(Long.valueOf(-j)));
    }

    public static boolean H1(int i, long j) {
        if (j >= 0) {
            return yac.h(i).e() == j;
        }
        TLRPC.Chat M0 = uc7.s1(i).M0(Long.valueOf(-j));
        return M0 != null && M0.creator;
    }

    public static boolean J1(int i, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        if (tL_starGiftUnique == null) {
            return false;
        }
        TLRPC.Peer peer = tL_starGiftUnique.owner_id;
        if (peer == null) {
            peer = tL_starGiftUnique.host_id;
        }
        long n = wf3.n(peer);
        if (n == 0) {
            return false;
        }
        if (n > 0) {
            TLRPC.User X1 = uc7.s1(i).X1(Long.valueOf(n));
            if (X1 != null) {
                TLRPC.EmojiStatus emojiStatus = X1.emoji_status;
                return (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) && ((TLRPC.TL_emojiStatusCollectible) emojiStatus).collectible_id == tL_starGiftUnique.id;
            }
        } else {
            TLRPC.Chat M0 = uc7.s1(i).M0(Long.valueOf(-n));
            if (M0 != null) {
                TLRPC.EmojiStatus emojiStatus2 = M0.emoji_status;
                if ((emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) && ((TLRPC.TL_emojiStatusCollectible) emojiStatus2).collectible_id == tL_starGiftUnique.id) {
                    return true;
                }
            }
        }
        return false;
    }

    public static TableRow Z0(hjb hjbVar, String str, String str2, vnb vnbVar) {
        if (!WalletEngine2.isValidAddress(str2)) {
            return hjbVar.f(str, str2, null, null);
        }
        float L = hl.L(14.0f);
        TextView ctaVar = new cta(hjbVar.getContext(), L);
        ctaVar.setTypeface(hl.n1("fonts/rmono.ttf"));
        int i = 0;
        ctaVar.setTextSize(0, L);
        ctaVar.setLineSpacing(hl.L(2.0f), 1.0f);
        yob.X(ctaVar, aob.G6, vnbVar);
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
                spannableStringBuilder.setSpan(new ho4(aob.y6, vnbVar), length, spannableStringBuilder.length(), 33);
            }
            i2++;
            i = i5;
        }
        ctaVar.setText(spannableStringBuilder);
        return hjbVar.c(ctaVar, str);
    }

    public static void a1(hjb hjbVar, TL_stars.StarGiftAttribute starGiftAttribute) {
        String M0;
        if (starGiftAttribute instanceof TL_stars.starGiftAttributeModel) {
            M0 = ob6.M0(2131750348, null);
        } else if (starGiftAttribute instanceof TL_stars.starGiftAttributePattern) {
            M0 = ob6.M0(2131750341, null);
        } else if (!(starGiftAttribute instanceof TL_stars.starGiftAttributeBackdrop)) {
            return;
        } else {
            M0 = ob6.M0(2131750349, null);
        }
        String str = M0;
        Integer[] numArr = new Integer[1];
        hjbVar.e(str, starGiftAttribute.name, A1(starGiftAttribute.rarity, numArr), null, numArr[0]);
    }

    public static void h2(e eVar) {
        e S = LaunchActivity.S();
        if (S == null) {
            return;
        }
        bg0 bg0Var = new bg0();
        bg0Var.a = true;
        S.showAsSheet(eVar, bg0Var);
    }

    public static SpannableStringBuilder k2(String str) {
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
            spannableStringBuilder.setSpan(new f92((byte) 1), indexOf, i + indexOf, 0);
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder l2(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        SpannableString spannableString = new SpannableString("👌");
        spannableString.setSpan(new wm2(R.drawable.filled_understood, 0), 0, spannableString.length(), 33);
        SpannableString spannableString2 = new SpannableString("👍");
        spannableString2.setSpan(new wm2(R.drawable.filled_reactions, 0), 0, spannableString2.length(), 33);
        hl.I2(spannableStringBuilder, spannableString, "👌");
        hl.I2(spannableStringBuilder, spannableString2, "👍");
        return spannableStringBuilder;
    }

    public static boolean n1(TL_stars.SavedStarGift savedStarGift, TL_stars.SavedStarGift savedStarGift2) {
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

    public static boolean o1(TL_stars.TL_starGiftUnique tL_starGiftUnique, TL_stars.TL_starGiftUnique tL_starGiftUnique2) {
        if (tL_starGiftUnique == tL_starGiftUnique2) {
            return true;
        }
        if (tL_starGiftUnique != null) {
            return tL_starGiftUnique.id == tL_starGiftUnique2.id || TextUtils.equals(tL_starGiftUnique.slug, tL_starGiftUnique2.slug);
        }
        return false;
    }

    public static String p1(int i) {
        Date date = new Date(i * 1000);
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar.setTime(date);
        ob6 D0 = ob6.D0();
        return ob6.a0(null, null, 2131742414, (calendar.get(1) == calendar2.get(1) ? D0.p0() : D0.r0()).format(date), D0.o0().format(date));
    }

    public static String u1(TL_stars.StarGift starGift) {
        if (!(starGift instanceof TL_stars.TL_starGiftUnique)) {
            return (!(starGift instanceof TL_stars.TL_starGift) || TextUtils.isEmpty(starGift.title)) ? ob6.M0(2131750151, null) : starGift.title;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(((TL_stars.TL_starGiftUnique) starGift).title);
        sb.append(" #");
        return qu6.m(r3.num, ',', sb);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A2(int i, boolean z, q38 q38Var) {
        int i2;
        kg5 kg5Var;
        iua iuaVar;
        ValueAnimator valueAnimator = this.X2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.X2 = null;
        }
        sua suaVar = this.a2;
        if (i != 1) {
            hl.r(suaVar.p0);
        }
        if (!this.Z2) {
            this.V2 = Float.valueOf(this.T1.f());
        }
        yta ytaVar = this.W2;
        this.W2 = new yta(ytaVar == null ? (byte) 0 : ytaVar.b, i);
        ox0 ox0Var = this.O2;
        int finalHeight = suaVar.getFinalHeight();
        int q1 = q1();
        if (this.W2.d(1)) {
            FrameLayout frameLayout = this.i2;
            if (frameLayout.getVisibility() == 0) {
                i2 = frameLayout.getMeasuredHeight();
                ox0Var.H(finalHeight, q1 + i2);
                if (this.W2.b == 0 && (iuaVar = this.K2) != null) {
                    iuaVar.c();
                }
                yta ytaVar2 = this.W2;
                byte b = 3;
                gta gtaVar = this.y2;
                gta gtaVar2 = this.w2;
                gta gtaVar3 = this.n2;
                gta gtaVar4 = this.b2;
                if (z) {
                    ytaVar2.c = 1.0f;
                    P1();
                    gtaVar4.setVisibility(i == 0 ? 0 : 8);
                    gtaVar3.setVisibility(i == 1 ? 0 : 8);
                    gtaVar2.setVisibility(i == 2 ? 0 : 8);
                    gtaVar.setVisibility(i != 3 ? 8 : 0);
                    C2();
                    if (q38Var != null) {
                        q38Var.run();
                    }
                } else {
                    gtaVar4.setVisibility(ytaVar2.b(0) ? 0 : 8);
                    gtaVar3.setVisibility(this.W2.b(1) ? 0 : 8);
                    gtaVar2.setVisibility(this.W2.b(2) ? 0 : 8);
                    gtaVar.setVisibility(this.W2.b(3) ? 0 : 8);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.X2 = ofFloat;
                    ofFloat.addUpdateListener(new ija(this, b));
                    this.X2.addListener(new ata(this, i, q38Var));
                    this.X2.setInterpolator(k43.h);
                    this.X2.setDuration(320L);
                    this.X2.start();
                    yta ytaVar3 = this.W2;
                    de0[] de0VarArr = suaVar.d;
                    byte b2 = ytaVar3.a;
                    byte b3 = ytaVar3.b;
                    if (b2 != b3) {
                        b29 y = de0VarArr[b2].getImageReceiver().y();
                        b29 y2 = de0VarArr[b3].getImageReceiver().y();
                        if (y2 != null && y != null) {
                            y2.O(false, y.o());
                        }
                    }
                }
                kg5Var = this.w3;
                if (kg5Var == null) {
                    kg5Var.f(true);
                    this.w3 = null;
                    return;
                }
                return;
            }
        }
        i2 = 0;
        ox0Var.H(finalHeight, q1 + i2);
        if (this.W2.b == 0) {
            iuaVar.c();
        }
        yta ytaVar22 = this.W2;
        byte b4 = 3;
        gta gtaVar5 = this.y2;
        gta gtaVar22 = this.w2;
        gta gtaVar32 = this.n2;
        gta gtaVar42 = this.b2;
        if (z) {
        }
        kg5Var = this.w3;
        if (kg5Var == null) {
        }
    }

    public final TL_stars.TL_starGiftUnique B1() {
        TL_stars.StarGift s1 = s1();
        if (s1 instanceof TL_stars.TL_starGiftUnique) {
            return (TL_stars.TL_starGiftUnique) s1;
        }
        return null;
    }

    public final void B2(boolean z) {
        boolean z2;
        int i;
        int i2;
        TL_stars.TL_starGiftUnique B1 = B1();
        if (B1 == null) {
            return;
        }
        uc7.e1().edit().putInt("statusgiftpage", 3).apply();
        boolean J1 = J1(this.a, B1());
        boolean z3 = !J1;
        boolean J12 = J1(this.a, B1());
        c51 c51Var = this.f2;
        if (J12) {
            uc7.s1(this.a).u5(r1(), new TLRPC.TL_emojiStatusEmpty(), null);
            z2 = z3;
        } else {
            z2 = z3;
            long r1 = r1();
            if (r1 >= 0) {
                if (!yac.h(this.a).p()) {
                    v21 P = j().P(R.raw.star_premium_2, hl.N2(ob6.M0(2131750384, null), -1, 2, new jra(this, (byte) 6), null));
                    P.u = true;
                    P.j();
                    return;
                }
            } else if (!z) {
                uc7 s1 = uc7.s1(this.a);
                c51Var.setLoading(true);
                uc7.s1(this.a).G0().a(r1, new p4c((Object) this, (Object) s1, r1, (byte) 8));
                return;
            }
            TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible = new TLRPC.TL_inputEmojiStatusCollectible();
            tL_inputEmojiStatusCollectible.collectible_id = B1.id;
            uc7.s1(this.a).u5(r1(), tL_inputEmojiStatusCollectible, B1);
        }
        iy9 iy9Var = this.a2.J[1];
        if (J1) {
            i = R.drawable.filled_crown_on;
            i2 = 2131750386;
        } else {
            i = R.drawable.filled_crown_off;
            i2 = 2131750383;
        }
        iy9Var.a(i, ob6.M0(i2, null), true);
        if (this.v2) {
            dismiss();
            return;
        }
        q38 q38Var = new q38((byte) 18, (Object) this, z2);
        if (this.W2.c(0)) {
            q38Var.run();
        } else {
            A2(0, true, q38Var);
        }
        c51Var.i(ob6.M0(2131747558, null), !this.Z2, true);
        c51Var.g(null, !this.Z2);
        c51Var.setOnClickListener(new hra(this, (byte) 13));
    }

    public final boolean C1(boolean z) {
        return (y1(z) == null && z1(z) == null) ? false : true;
    }

    public final void C2() {
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

    @Override // ny0, nx0
    public final boolean D() {
        if (this.W2.c(4)) {
            boolean z = this.a2.N.i0;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void D1(byte[] bArr, TwoStepVerificationActivity twoStepVerificationActivity, boolean z, s45 s45Var) {
        TL_stars.getStarGiftWithdrawalUrl getstargiftwithdrawalurl;
        TL_stars.InputSavedStarGift v1 = v1();
        if (v1 == null) {
            if (s45Var != null) {
                s45Var.a(Boolean.FALSE);
                return;
            }
            return;
        }
        if (z) {
            TL_stars.withdrawStarGift withdrawstargift = new TL_stars.withdrawStarGift();
            withdrawstargift.keep_on_profile = this.v3;
            withdrawstargift.stargift = v1;
            withdrawstargift.tmp_password = bArr;
            getstargiftwithdrawalurl = withdrawstargift;
        } else {
            TL_stars.getStarGiftWithdrawalUrl getstargiftwithdrawalurl2 = new TL_stars.getStarGiftWithdrawalUrl();
            getstargiftwithdrawalurl2.stargift = v1;
            getstargiftwithdrawalurl2.tmp_password = bArr;
            getstargiftwithdrawalurl = getstargiftwithdrawalurl2;
        }
        ConnectionsManager.getInstance(this.a).sendRequest(getstargiftwithdrawalurl, new si1(this, s45Var, twoStepVerificationActivity, z));
    }

    public final void D2() {
        boolean C1 = C1(false);
        fta ftaVar = this.U1;
        ftaVar.setPosition(C1 ? 1 : 0);
        ftaVar.E(false);
        if (this.B2 == null || C1(true) || this.B2.e() >= this.B2.c()) {
            return;
        }
        this.B2.a();
    }

    @Override // nx0
    public final boolean E() {
        if (this.W2.c(4) && this.a2.N.i0) {
            return false;
        }
        return this.d0;
    }

    public final void E2() {
        TL_stars.TL_starGiftUnique B1 = B1();
        TL_wallet.nftItem nftitem = this.a3;
        LinearLayout linearLayout = this.t2;
        if (nftitem == null || B1 == null) {
            linearLayout.setVisibility(8);
            return;
        }
        this.c2.setVisibility(8);
        this.e2.setVisibility(8);
        linearLayout.setVisibility(0);
        this.u2.a(B1.host_id != null, linearLayout.isAttachedToWindow());
    }

    @Override // nx0
    public final boolean F(MotionEvent motionEvent) {
        if (this.W2.c(4)) {
            boolean z = this.a2.N.i0;
        }
        return false;
    }

    public final boolean F1(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        if (tL_starGiftUnique != null && !TextUtils.isEmpty(tL_starGiftUnique.owner_address)) {
            c C = c.C(this.a);
            String x = C.x();
            if (TextUtils.isEmpty(x)) {
                TLRPC.Peer peer = tL_starGiftUnique.host_id;
                return peer != null && wf3.n(peer) == yac.h(this.a).e();
            }
            if (c.b(tL_starGiftUnique.owner_address, x) || C.A().c(tL_starGiftUnique.gift_address)) {
                return true;
            }
        }
        return false;
    }

    public final TL_wallet.nftItem F2() {
        TL_wallet.nftItem nftitem = this.a3;
        if (nftitem != null) {
            return nftitem;
        }
        TL_stars.TL_starGiftUnique B1 = B1();
        if (!y2(B1)) {
            return null;
        }
        c C = c.C(this.a);
        if (B1 == null || TextUtils.isEmpty(B1.gift_address)) {
            return null;
        }
        ArrayList arrayList = C.A().b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            TL_wallet.nftItem nftitem2 = (TL_wallet.nftItem) obj;
            if (c.b(nftitem2.address, B1.gift_address)) {
                return nftitem2;
            }
        }
        TL_wallet.nftItem nftitem3 = new TL_wallet.nftItem();
        nftitem3.address = B1.gift_address;
        nftitem3.owner_address = C.x();
        nftitem3.index = "";
        nftitem3.name = B1.title + " #" + B1.num;
        nftitem3.gift = B1;
        return nftitem3;
    }

    @Override // ny0
    public final c79 H0(d79 d79Var) {
        ox0 ox0Var = new ox0(this, (byte) 10);
        this.O2 = ox0Var;
        return ox0Var;
    }

    public final boolean I1(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        if (!ik8.A(tL_starGiftUnique) || !it7.n(tL_starGiftUnique)) {
            return false;
        }
        if (tL_starGiftUnique.my_sale || this.a3 != null) {
            return true;
        }
        TLRPC.Peer peer = tL_starGiftUnique.host_id;
        if (peer == null || wf3.n(peer) != yac.h(this.a).e()) {
            return !TextUtils.isEmpty(tL_starGiftUnique.owner_address) && c.b(tL_starGiftUnique.owner_address, c.C(this.a).x());
        }
        return true;
    }

    @Override // ny0
    public final int J0() {
        return hl.L(12.0f);
    }

    @Override // ny0
    public final CharSequence K0() {
        return this.Q2;
    }

    public final void K1(TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift) {
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) tL_payments_uniqueStarGift.gift;
        this.E2 = tL_starGiftUnique;
        p2(tL_starGiftUnique, false, null, null);
        super.show();
    }

    public final void L1(id idVar, r47 r47Var) {
        idVar.dismiss();
        this.H2 = true;
        m2(r47Var, null);
        super.show();
    }

    public final void M1(id idVar, TL_stars.SavedStarGift savedStarGift) {
        if (savedStarGift != null) {
            idVar.dismiss();
            this.J2 = true;
            o2(savedStarGift, null);
            super.show();
            return;
        }
        idVar.dismiss();
        e S = LaunchActivity.S();
        if (S != null) {
            v21 Q = d31.b0(S).Q(R.raw.error, 36, ob6.M0(2131748306, null));
            Q.u = true;
            Q.j();
        }
    }

    public final void N1() {
        TL_stars.TL_starGiftUnique B1 = B1();
        c51 c51Var = this.f2;
        if (c51Var.R || B1 == null || E1(this.a, B1) || I1(B1)) {
            return;
        }
        boolean n = it7.n(B1);
        TL_stars.TL_starGiftUnique tL_starGiftUnique = this.E2;
        long j = this.S1;
        if (n) {
            if (tL_starGiftUnique == null || !this.F2 || j == 0) {
                j = yac.h(this.a).e();
            }
            long j2 = j;
            if (this.E2 == null || !this.F2 || j2 == yac.h(this.a).e()) {
                e1(B1, j2, null, true, null);
                return;
            }
            hw4 hw4Var = new hw4(getContext(), this.J0, B1, j2);
            hw4Var.E1 = new jn1((Object) this, (Object) hw4Var, (Object) B1, j2, (byte) 8);
            hw4Var.show();
            return;
        }
        if (tL_starGiftUnique == null || !this.F2 || j == 0) {
            j = yac.h(this.a).e();
        }
        long j3 = j;
        pj pjVar = B1.resale_ton_only ? pj.b : pj.a;
        if (this.E2 == null || !this.F2 || j3 == yac.h(this.a).e()) {
            c51Var.setLoading(true);
            jxa.u(this.a, pjVar).E(B1, j3, null, true, new pra(this, null, pjVar, B1, j3, null, true));
        } else {
            hw4 hw4Var2 = new hw4(getContext(), this.J0, B1, j3);
            hw4Var2.E1 = new oo1(this, hw4Var2, B1, j3, pjVar, (byte) 3);
            hw4Var2.show();
        }
    }

    public final void O1() {
        zsa zsaVar = this.U2;
        if (zsaVar != null && !zsaVar.J) {
            zsaVar.dismiss();
        }
        String w1 = w1();
        zsa zsaVar2 = new zsa(this, getContext(), w1, w1, this.J0);
        this.U2 = zsaVar2;
        zsaVar2.n2 = new pq8((Object) this, (byte) 17);
        zsaVar2.show();
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
    public final void P1() {
        TL_stars.TL_starGiftUnique B1;
        this.b2.setAlpha(this.W2.a(0));
        this.n2.setAlpha(this.W2.a(1));
        this.w2.setAlpha(this.W2.a(2));
        this.y2.setAlpha(this.W2.a(3));
        float a = 1.0f - this.W2.a(4);
        FrameLayout frameLayout = this.g2;
        frameLayout.setAlpha(a);
        yta ytaVar = this.W2;
        sua suaVar = this.a2;
        suaVar.d(ytaVar);
        ImageView imageView = suaVar.R;
        if (this.W2.c(0) && (B1 = B1()) != null && !B1.crafted && H1(this.a, wf3.n(B1.owner_id))) {
            r47 r47Var = this.C2;
            if (r47Var != null) {
                TLRPC.Message message = r47Var.k;
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
            jo0 jo0Var = this.T1;
            float f = jo0Var.f();
            this.Z1.setAlpha(this.W2.a(0) * Utilities.l(hl.x1(f - r6.getHeight(), 0.0f, hl.L(32.0f))));
            jo0Var.h();
            jo0Var.invalidate();
            frameLayout.setVisibility(this.W2.c(4) ? 8 : 0);
            C2();
        }
        int i = 8;
        imageView.setVisibility(i);
        jo0 jo0Var2 = this.T1;
        float f2 = jo0Var2.f();
        this.Z1.setAlpha(this.W2.a(0) * Utilities.l(hl.x1(f2 - r6.getHeight(), 0.0f, hl.L(32.0f))));
        jo0Var2.h();
        jo0Var2.invalidate();
        frameLayout.setVisibility(this.W2.c(4) ? 8 : 0);
        C2();
    }

    public final void Q1(TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, boolean z) {
        int i;
        if (getContext() == null) {
            return;
        }
        if (tL_error == null) {
            if (twoStepVerificationActivity != null) {
                twoStepVerificationActivity.s0();
            }
            d31.c0("NULL_ERROR");
            return;
        }
        byte b = 1;
        if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
            if ("SRP_ID_INVALID".equals(tL_error.text)) {
                ConnectionsManager.getInstance(this.a).sendRequest(new TL_account.getPassword(), new qsa(this, twoStepVerificationActivity, z, b), 8);
                return;
            }
            if (twoStepVerificationActivity != null) {
                twoStepVerificationActivity.s0();
                twoStepVerificationActivity.finishFragment();
            }
            if (z && ("WALLET_CREATING".equals(tL_error.text) || "WALLET_UNAVAILABLE".equals(tL_error.text))) {
                it7.t(getContext(), this.a, this.J0, null, tL_error.text, null);
                return;
            }
            String str = tL_error.text;
            if (str == null || !str.startsWith("FLOOD_WAIT")) {
                d31.e0(tL_error);
                return;
            } else {
                xnb.x(null, 2131750647, d31.Y(), null);
                return;
            }
        }
        if (twoStepVerificationActivity != null) {
            twoStepVerificationActivity.s0();
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        String M0 = ob6.M0(2131749846, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setPadding(hl.L(24.0f), hl.L(2.0f), hl.L(24.0f), 0);
        linearLayout.setOrientation(1);
        alertDialog$Builder.n(linearLayout);
        TextView textView = new TextView(getContext());
        int i2 = aob.j5;
        yob.X(textView, i2, null);
        textView.setTextSize(1, 16.0f);
        textView.setGravity((ob6.a0 ? 5 : 3) | 48);
        textView.setText(hl.S2(ob6.M0(2131749850, null)));
        linearLayout.addView(textView, tre.o(-1, -2));
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, tre.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.list_circle);
        imageView.setPadding(ob6.a0 ? hl.L(11.0f) : 0, hl.L(9.0f), ob6.a0 ? 0 : hl.L(11.0f), 0);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        yob.s(imageView, i2, null, mode);
        TextView textView2 = new TextView(getContext());
        yob.X(textView2, i2, null);
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity((ob6.a0 ? 5 : 3) | 48);
        textView2.setText(hl.S2(ob6.M0(2131749849, null)));
        if (ob6.a0) {
            linearLayout2.addView(textView2, tre.o(-1, -2));
            linearLayout2.addView(imageView, tre.r(-2, -2, 5));
        } else {
            linearLayout2.addView(imageView, tre.o(-2, -2));
            linearLayout2.addView(textView2, tre.o(-1, -2));
        }
        LinearLayout linearLayout3 = new LinearLayout(getContext());
        linearLayout3.setOrientation(0);
        linearLayout.addView(linearLayout3, tre.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setImageResource(R.drawable.list_circle);
        imageView2.setPadding(ob6.a0 ? hl.L(11.0f) : 0, hl.L(9.0f), ob6.a0 ? 0 : hl.L(11.0f), 0);
        yob.s(imageView2, i2, null, mode);
        TextView textView3 = new TextView(getContext());
        yob.X(textView3, i2, null);
        textView3.setTextSize(1, 16.0f);
        textView3.setGravity((ob6.a0 ? 5 : 3) | 48);
        textView3.setText(hl.S2(ob6.M0(2131749848, null)));
        if (ob6.a0) {
            linearLayout3.addView(textView3, tre.o(-1, -2));
            i = 5;
            linearLayout3.addView(imageView2, tre.r(-2, -2, 5));
        } else {
            i = 5;
            linearLayout3.addView(imageView2, tre.o(-2, -2));
            linearLayout3.addView(textView3, tre.o(-1, -2));
        }
        if ("PASSWORD_MISSING".equals(tL_error.text)) {
            alertDialog$Builder.j(ob6.M0(2131749845, null), new vr9(this, (byte) 26));
            alertDialog$Builder.g(ob6.M0(2131752570, null), null);
        } else {
            TextView textView4 = new TextView(getContext());
            yob.X(textView4, i2, null);
            textView4.setTextSize(1, 16.0f);
            uh9.q(textView4, (ob6.a0 ? i : 3) | 48, null, 2131749847);
            linearLayout.addView(textView4, tre.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            alertDialog$Builder.g(ob6.M0(2131747558, null), null);
        }
        if (twoStepVerificationActivity != null) {
            twoStepVerificationActivity.showDialog(idVar);
        } else {
            alertDialog$Builder.o();
        }
    }

    public final void R1() {
        TL_stars.TL_starGiftUnique B1 = B1();
        if (B1 == null) {
            return;
        }
        if (!it7.y(B1)) {
            nza.j1(getContext(), this.a, B1, new usa(this, B1, (byte) 2), this.J0);
        } else if (i1()) {
            W1();
        } else {
            it7.t(getContext(), this.a, this.J0, j(), "STARGIFT_ONCHAIN_SALE_DISABLED", Boolean.valueOf(B1.fixed_sale));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void S1() {
        int i;
        CharSequence V;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        long j;
        String str;
        ArrayList arrayList;
        String str2;
        String str3;
        long j2;
        String str4;
        TL_wallet.nftItem nftitem;
        String str5;
        dqc dqcVar = this.b3;
        if (dqcVar != null) {
            i = ((e) dqcVar.c).currentAccount;
            if (!wsc.F(i, dqcVar.a.slug)) {
                dqc dqcVar2 = this.b3;
                wsc wscVar = dqcVar2.c.k0;
                if (wscVar == null || (nftitem = dqcVar2.b) == null || (str5 = nftitem.address) == null || !str5.equals(wscVar.Q0)) {
                    Context context = getContext();
                    int i2 = this.a;
                    d31 j3 = j();
                    vnb vnbVar = this.J0;
                    TL_stars.TL_starGiftUnique B1 = B1();
                    ArrayList arrayList2 = new ArrayList(uc7.s1(i2).k4.y0.f);
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
                        String replaceAll = str6.replaceAll("[^\\p{L}\\p{N}]", "");
                        Locale locale = Locale.ROOT;
                        String lowerCase = replaceAll.toLowerCase(locale);
                        if (B1 == null || (str4 = B1.title) == null || !lowerCase.equals(str4.replaceAll("[^\\p{L}\\p{N}]", "").toLowerCase(locale))) {
                            jxa v = jxa.v(i2, z);
                            v.U();
                            ArrayList arrayList4 = v.H;
                            int size2 = arrayList4.size();
                            ArrayList arrayList5 = arrayList4;
                            int i5 = z;
                            while (i5 < size2) {
                                Object obj = arrayList5.get(i5);
                                int i6 = i5 + 1;
                                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                                tL_starGiftUnique = B1;
                                if (starGift == null || (str2 = starGift.title) == null) {
                                    arrayList = arrayList5;
                                } else {
                                    arrayList = arrayList5;
                                    if (lowerCase.equals(str2.replaceAll("[^\\p{L}\\p{N}]", "").toLowerCase(Locale.ROOT))) {
                                        str3 = starGift.title;
                                        j2 = starGift.id;
                                    }
                                }
                                B1 = tL_starGiftUnique;
                                arrayList5 = arrayList;
                                i5 = i6;
                            }
                            tL_starGiftUnique = B1;
                            j = 0;
                            str = null;
                            if (str != null) {
                                str = str6.replaceAll("(?<=[a-z0-9])(?=[A-Z])", " ");
                            }
                            String str7 = str;
                            SpannableString spannableString = new SpannableString(str7);
                            spannableString.setSpan(new bta(new boolean[1], i2, context, vnbVar, j, str7, str6), 0, spannableString.length(), 33);
                            arrayList3.add(spannableString);
                            z = 0;
                            i3 = i4;
                            B1 = tL_starGiftUnique;
                        } else {
                            str3 = B1.title;
                            j2 = B1.gift_id;
                            tL_starGiftUnique = B1;
                        }
                        str = str3;
                        j = j2;
                        if (str != null) {
                        }
                        String str72 = str;
                        SpannableString spannableString2 = new SpannableString(str72);
                        spannableString2.setSpan(new bta(new boolean[1], i2, context, vnbVar, j, str72, str6), 0, spannableString2.length(), 33);
                        arrayList3.add(spannableString2);
                        z = 0;
                        i3 = i4;
                        B1 = tL_starGiftUnique;
                    }
                    int i7 = z;
                    if (arrayList3.size() == 1) {
                        Object[] objArr = new Object[1];
                        objArr[i7] = arrayList3.get(i7);
                        V = ob6.V(null, null, 2131742757, objArr);
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
                        V = ob6.V(null, null, 2131742758, spannableStringBuilder, c00.g(1, arrayList3));
                    }
                    v21 M = j3.M(context.getResources().getDrawable(R.drawable.filled_card_color_28).mutate(), V);
                    z11 z11Var = M.e;
                    if (z11Var instanceof c21) {
                        TextView textView = ((c21) z11Var).b;
                        textView.setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
                        textView.setEllipsize(null);
                    }
                    M.j();
                    return;
                }
            }
            dqc dqcVar3 = this.b3;
            dismiss();
            Objects.requireNonNull(dqcVar3);
            hl.d3(new uoa((Object) dqcVar3, (byte) 2), 250L);
        }
    }

    public final void T1() {
        if (yac.h(this.a).p() && (J1(this.a, B1()) || this.T2)) {
            B2(false);
            return;
        }
        TL_stars.TL_starGiftUnique B1 = B1();
        if (B1 == null) {
            return;
        }
        TLRPC.Peer peer = B1.owner_id;
        if (peer == null) {
            peer = B1.host_id;
        }
        long n = wf3.n(peer);
        StringBuilder sb = new StringBuilder();
        sb.append(B1.title);
        sb.append(" #");
        this.x2.setText(ob6.a0(null, null, 2131749779, qu6.m(B1.num, ',', sb)));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ob6.M0(2131749781, null));
        if (!yac.h(this.a).p()) {
            spannableStringBuilder.append((CharSequence) " l");
            wm2 wm2Var = this.S2;
            if (wm2Var == null) {
                wm2Var = new wm2(R.drawable.msg_mini_lock3, 0);
                this.S2 = wm2Var;
            }
            spannableStringBuilder.setSpan(wm2Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        c51 c51Var = this.f2;
        c51Var.i(spannableStringBuilder, true, true);
        c51Var.g(null, true);
        c51Var.setOnClickListener(new hra(this, (byte) 8));
        this.a2.setWearPreview(uc7.s1(this.a).b2(n));
        A2(2, true, null);
    }

    public final void U1(boolean z) {
        int i;
        r47 r47Var = this.C2;
        int i2 = 0;
        if (r47Var != null) {
            TLRPC.Message message = r47Var.k;
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
            alertDialog$Builder.a.S = ob6.M0(2131749723, null);
            alertDialog$Builder.a.U = ob6.a0(null, null, 2131749724, ob6.x(i, true));
            c00.u(null, 2131747558, alertDialog$Builder, null);
            return;
        }
        TL_stars.TL_starGiftUnique B1 = B1();
        if (B1 == null) {
            return;
        }
        if (!TextUtils.isEmpty(B1.gift_address) && !uc7.s1(this.a).k4.y.f) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, this.J0, getContext());
            alertDialog$Builder2.a.S = ob6.M0(2131749738, null);
            alertDialog$Builder2.a.U = ob6.M0(2131749739, null);
            c00.u(null, 2131747558, alertDialog$Builder2, null);
            return;
        }
        if (z) {
            this.a2.N.a(this.a, B1.gift_id, B1.getDocument(), B1.title);
            if (g1()) {
                vta vtaVar = this.a2.N;
                TL_stars.TL_starGiftUnique B12 = B1();
                if (B12 == null) {
                    vtaVar.getClass();
                } else {
                    while (true) {
                        tta[] ttaVarArr = vtaVar.n;
                        if (i2 >= ttaVarArr.length) {
                            break;
                        }
                        tta ttaVar = ttaVarArr[i2];
                        TL_stars.StarGift starGift = ttaVar.h;
                        if (starGift == null) {
                            starGift = null;
                        }
                        if (starGift == null) {
                            ttaVar.a(B12, true);
                            break;
                        }
                        i2++;
                    }
                    vtaVar.d(true);
                }
            }
        }
        this.a2.N.setOnCraft(new ora(this, b));
        if (this.R2 == null) {
            ld9 ld9Var = new ld9(this.a, B1.gift_id);
            this.R2 = ld9Var;
            ld9Var.a();
        }
        this.a2.N.setOnAddGift(new usa(this, B1, b));
        this.a2.N.setOnClose(new ssa(this, b));
        A2(4, true, null);
    }

    @Override // ny0
    public final boolean V0() {
        return false;
    }

    public final void V1(long j) {
        byte b = 0;
        if (j <= 0 || !lbc.c(uc7.s1(this.a).Y1(j))) {
            new yx4(getContext(), this.a, j, null, new mra(this, b)).show();
        } else {
            j().Q(R.raw.error, 36, hl.S2(ob6.a0(null, null, 2131743397, wf3.s(j)))).k(false);
        }
    }

    public final void W1() {
        TL_stars.TL_starGiftUnique B1 = B1();
        byte b = 0;
        if (B1 == null || !B1.fixed_sale) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.J0, getContext());
            String M0 = ob6.M0(2131750223, null);
            id idVar = alertDialog$Builder.a;
            idVar.S = M0;
            idVar.U = ob6.M0(2131749612, null);
            alertDialog$Builder.j(ob6.M0(2131750393, null), new yra(this, b));
            alertDialog$Builder.g(ob6.M0(2131752570, null), null);
            alertDialog$Builder.o();
            return;
        }
        if (i1()) {
            pt7 pt7Var = new pt7(this.a, this.J0, new sra(this, r5, B1, (byte) 1), getContext());
            pt7[] pt7VarArr = {pt7Var};
            pj pjVar = pj.b;
            long j = B1.getResellAmount(pjVar).b;
            pt7Var.u1 = true;
            pt7Var.v1 = j;
            pt7Var.r1.setText(ob6.M0(2131750223, null));
            if (j > 0) {
                String b2 = oj.j(j, pjVar).b();
                EditTextBoldCursor editTextBoldCursor = pt7Var.n1;
                InputFilter[] filters = editTextBoldCursor.getFilters();
                editTextBoldCursor.setFilters(new InputFilter[0]);
                pt7Var.w1 = true;
                editTextBoldCursor.setText(b2);
                pt7Var.w1 = false;
                editTextBoldCursor.setFilters(filters);
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            }
            pt7Var.E0(pt7Var.s1);
            pt7VarArr[0].show();
        }
    }

    public final void X1() {
        TL_stars.TL_starGiftUnique B1 = B1();
        if (i1()) {
            pt7[] pt7VarArr = new pt7[1];
            pt7VarArr[0] = new pt7(this.a, this.J0, new sra(this, pt7VarArr, B1, (byte) 0), getContext());
            hr hrVar = uc7.s1(this.a).k4;
            pt7 pt7Var = pt7VarArr[0];
            boolean z = (B1 == null || !B1.onchain_sale) ? hrVar.t.f : B1.fixed_sale;
            pt7Var.x1 = z;
            if (!pt7Var.u1) {
                pt7Var.r1.setText(ob6.M0(z ? 2131749490 : 2131749477, null));
            }
            pt7Var.E0(pt7Var.s1);
            pt7VarArr[0].show();
        }
    }

    public final void Y1() {
        TL_stars.TL_starGiftUnique B1 = B1();
        if (i1()) {
            Context context = getContext();
            int i = this.a;
            vnb vnbVar = this.J0;
            c51 c51Var = this.f2;
            Objects.requireNonNull(c51Var);
            byte b = 7;
            ii7 ii7Var = new ii7(c51Var, b);
            d31 j = j();
            jra jraVar = new jra(this, b);
            HashMap hashMap = it7.a;
            if (B1 == null || TextUtils.isEmpty(B1.slug)) {
                return;
            }
            TL_stars.cancelStarGiftOnchainSale cancelstargiftonchainsale = new TL_stars.cancelStarGiftOnchainSale();
            cancelstargiftonchainsale.slug = B1.slug;
            it7.q(context, i, cancelstargiftonchainsale, Boolean.valueOf(B1.fixed_sale), vnbVar, ii7Var, j, new b55(B1, context, i, vnbVar, it7.i(B1), jraVar));
        }
    }

    public final void Z1(long j) {
        kg5 kg5Var = this.w3;
        if (kg5Var != null) {
            kg5Var.f(true);
            this.w3 = null;
        }
        dismiss();
        e S = LaunchActivity.S();
        if (S == null || lbc.C(j)) {
            return;
        }
        Bundle bundle = new Bundle();
        if (j > 0) {
            bundle.putLong("user_id", j);
            if (j == yac.h(this.a).e()) {
                bundle.putBoolean("my_profile", true);
            }
        } else {
            bundle.putLong("chat_id", -j);
        }
        bundle.putBoolean("open_gifts", true);
        S.presentFragment(new ProfileActivity(bundle, null));
    }

    public final void a2(boolean z, l01 l01Var, Runnable runnable) {
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        byte b = z ? (byte) 3 : (byte) 2;
        bh bhVar = new bh((Object) this, (Object) twoStepVerificationActivity, z, (byte) 13);
        twoStepVerificationActivity.a0 = b;
        twoStepVerificationActivity.c0 = bhVar;
        twoStepVerificationActivity.b0 = t1();
        twoStepVerificationActivity.x0(new jr9(this, runnable, l01Var, twoStepVerificationActivity));
    }

    public final void b1(TL_stars.StarGiftAttribute starGiftAttribute) {
        String M0;
        char c;
        iua iuaVar;
        wua wuaVar;
        TL_stars.StarGiftAttribute starGiftAttribute2;
        vp8 vp8Var;
        byte b = 0;
        if (starGiftAttribute instanceof TL_stars.starGiftAttributeModel) {
            M0 = ob6.M0(2131750348, null);
            c = 2;
        } else if (starGiftAttribute instanceof TL_stars.starGiftAttributePattern) {
            M0 = ob6.M0(2131750341, null);
            c = 1;
        } else {
            if (!(starGiftAttribute instanceof TL_stars.starGiftAttributeBackdrop)) {
                return;
            }
            M0 = ob6.M0(2131750349, null);
            c = 0;
        }
        if (!this.L2 && ((iuaVar = this.K2) == null || !iuaVar.o)) {
            boolean[] zArr = new boolean[1];
            y41[] y41VarArr = new y41[1];
            Integer[] numArr = new Integer[1];
            String A1 = A1(starGiftAttribute.rarity, numArr);
            if (starGiftAttribute.rarity instanceof TL_stars.TL_starGiftAttributeRarity) {
                wuaVar = this;
                starGiftAttribute2 = starGiftAttribute;
                vp8Var = new vp8((Object) wuaVar, (Object) zArr, (Object) starGiftAttribute2, (Object) y41VarArr, (byte) 25);
            } else {
                wuaVar = this;
                starGiftAttribute2 = starGiftAttribute;
                vp8Var = null;
            }
            y41VarArr[0] = (y41) ((ejb) wuaVar.d2.e(M0, starGiftAttribute2.name, A1, vp8Var, numArr[0]).getChildAt(1)).getChildAt(0);
            return;
        }
        nua nuaVar = new nua(getContext(), this.J0, new ora(this, b));
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        hjb hjbVar = this.d2;
        tableRow.addView(new gjb(hjbVar, M0), layoutParams);
        tableRow.addView(new ejb(hjbVar, nuaVar, true), new TableRow.LayoutParams(0, -1, 1.0f));
        hjbVar.addView(tableRow);
        iua iuaVar2 = this.K2;
        if (iuaVar2 != null) {
            if (c == 0) {
                iuaVar2.d = nuaVar;
            }
            if (c == 1) {
                iuaVar2.c = nuaVar;
            }
            if (c == 2) {
                iuaVar2.b = nuaVar;
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
    public final void b2() {
        int i;
        TLRPC.Message message;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        int i2;
        int i3;
        TLRPC.Message message2;
        TLRPC.Message message3;
        kg5 kg5Var = this.w3;
        if (kg5Var != null) {
            kg5Var.f(true);
            this.w3 = null;
        }
        if (x2()) {
            return;
        }
        r47 r47Var = this.C2;
        if (r47Var != null && (message3 = r47Var.k) != null) {
            TLRPC.MessageAction messageAction = message3.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                i = ((TLRPC.TL_messageActionStarGiftUnique) messageAction).can_transfer_at;
                if (i <= ConnectionsManager.getInstance(this.a).getCurrentTime()) {
                    Context context = getContext();
                    r47 r47Var2 = this.C2;
                    if (r47Var2 != null && (message2 = r47Var2.k) != null) {
                        TLRPC.MessageAction messageAction2 = message2.action;
                        if (messageAction2 instanceof TLRPC.TL_messageActionStarGiftUnique) {
                            i3 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction2).can_transfer_at;
                            w2(i3 - ConnectionsManager.getInstance(this.a).getCurrentTime(), context, false);
                            return;
                        }
                    }
                    TL_stars.SavedStarGift savedStarGift = this.A2;
                    i3 = savedStarGift != null ? savedStarGift.can_transfer_at : 0;
                    w2(i3 - ConnectionsManager.getInstance(this.a).getCurrentTime(), context, false);
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
                        zw4 zw4Var = new zw4();
                        zw4Var.a = ob6.M0(2131749860, null);
                        zw4Var.c = true;
                        zw4Var.d = max;
                        zw4Var.e = new jg(this, currentTime, i2, max, r8, tL_starGiftUnique2);
                        Context context2 = getContext();
                        int i4 = this.a;
                        bx4 bx4Var = new bx4(context2, i4, false, pj0.a(i4).b(), null, zw4Var, this.J0);
                        bx4[] bx4VarArr = {bx4Var};
                        bx4Var.show();
                        return;
                    }
                }
                r47 r47Var3 = this.C2;
                if (r47Var3 == null || (message = r47Var3.k) == null) {
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
                        zw4 zw4Var2 = new zw4();
                        zw4Var2.a = ob6.M0(2131749860, null);
                        zw4Var2.c = true;
                        zw4Var2.d = max;
                        zw4Var2.e = new jg(this, currentTime2, i2, max, bx4VarArr, tL_starGiftUnique22);
                        Context context22 = getContext();
                        int i42 = this.a;
                        bx4 bx4Var2 = new bx4(context22, i42, false, pj0.a(i42).b(), null, zw4Var2, this.J0);
                        bx4[] bx4VarArr2 = {bx4Var2};
                        bx4Var2.show();
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

    public final void c1(LinearLayout linearLayout, int i, int i2, int i3, String str, boolean z) {
        ImageView imageView = new ImageView(getContext());
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(i);
        vnb vnbVar = this.J0;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        yob.s(imageView, i3, vnbVar, mode);
        linearLayout.addView(imageView, tre.t(i2, i2, 16, i2 < 15 ? 1 : 0, 0, i2 < 15 ? 1 : 0, 0));
        TextView textView = new TextView(getContext());
        textView.setTextSize(1, 13.0f);
        int i4 = aob.r5;
        yob.X(textView, i4, this.J0);
        textView.setText(str);
        linearLayout.addView(textView, tre.t(-2, -2, 16, 4, 0, 0, 0));
        if (z) {
            ImageView imageView2 = new ImageView(getContext());
            imageView2.setScaleType(scaleType);
            imageView2.setImageResource(R.drawable.msg_mini_topicarrow);
            yob.s(imageView2, i4, this.J0, mode);
            linearLayout.addView(imageView2, tre.t(11, 11, 16, 5, 0, 2, 0));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c2(long j, long j2, SpannableStringBuilder spannableStringBuilder, boolean z, pcc pccVar) {
        String str;
        TLRPC.Chat chat;
        SpannableStringBuilder S2;
        TL_stars.TL_starGiftUnique B1 = B1();
        if (B1 == null) {
            return;
        }
        int i = this.a;
        if (j >= 0) {
            TLRPC.User X1 = uc7.s1(i).X1(Long.valueOf(j));
            str = lbc.l(X1);
            chat = X1;
        } else {
            TLRPC.Chat M0 = uc7.s1(i).M0(Long.valueOf(-j));
            if (M0 == null) {
                str = "";
                chat = M0;
            } else {
                str = M0.title;
                chat = M0;
            }
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.addView(new xta(getContext(), B1, chat), tre.t(-1, -2, 48, 0, -4, 0, 0));
        TextView textView = new TextView(getContext());
        yob.X(textView, aob.j5, this.J0);
        textView.setTextSize(1, 16.0f);
        byte b = 2;
        if (spannableStringBuilder != null) {
            S2 = spannableStringBuilder;
        } else {
            S2 = hl.S2(j2 > 0 ? ob6.K("Gift2TransferPriceText", (int) j2, ',', t1(), wf3.s(j)) : ob6.a0(null, null, 2131749859, t1(), str));
        }
        textView.setText(S2);
        linearLayout.addView(textView, tre.t(-1, -2, 48, 24, 4, 24, 4));
        hjb hjbVar = new hjb(getContext(), this.J0);
        a1(hjbVar, jxa.i(B1.attributes, TL_stars.starGiftAttributeModel.class));
        a1(hjbVar, jxa.i(B1.attributes, TL_stars.starGiftAttributeBackdrop.class));
        a1(hjbVar, jxa.i(B1.attributes, TL_stars.starGiftAttributePattern.class));
        if (!TextUtils.isEmpty(B1.slug) && (B1.flags & 256) != 0) {
            di0.h();
            hjbVar.f(ob6.M0(2131749362, null), c00.i("~", di0.f(B1.value_currency, di0.h().g(B1.value_currency), B1.value_amount, true)), null, null);
        }
        linearLayout.addView(hjbVar, tre.t(-1, -2, 48, 23, 16, 23, 4));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.J0, getContext());
        alertDialog$Builder.n(linearLayout);
        alertDialog$Builder.j(j2 > 0 ? nza.T0(ob6.a0(null, null, 2131749866, Integer.valueOf((int) j2))) : ob6.M0(2131749867, null), new f62(pccVar, b));
        alertDialog$Builder.g(ob6.M0(2131752570, null), null);
        id idVar = alertDialog$Builder.a;
        idVar.Y0 = z;
        idVar.show();
    }

    public final void d1(TL_stars.InputSavedStarGift inputSavedStarGift, TLRPC.Updates updates, Runnable runnable) {
        TLRPC.Message message;
        TL_stars.StarGift starGift;
        if (updates == null) {
            jxa.v(this.a, false).M(r1());
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
            jxa.v(this.a, false).M(r1());
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
                o2(savedStarGift2, this.B2);
                this.m3 = null;
                this.L2 = false;
                bxa bxaVar = this.B2;
                if (bxaVar != null) {
                    bxaVar.d();
                } else {
                    jxa.v(this.a, false).M(this.S1);
                }
                hl.c3(runnable);
                return;
            }
        }
        if (this.B2 == null) {
            jxa.v(this.a, false).M(r1());
        }
        this.L2 = true;
        this.A2 = null;
        this.z2 = false;
        r47 r47Var = new r47(this.a, message, false, false);
        r47Var.K5();
        m2(r47Var, this.B2);
        this.m3 = null;
        this.L2 = false;
        hl.c3(runnable);
    }

    public final void d2(long j, pcc pccVar) {
        TLRPC.Message message;
        long j2;
        TL_stars.SavedStarGift savedStarGift = this.A2;
        if (savedStarGift == null || !(savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
            r47 r47Var = this.C2;
            if (r47Var == null || (message = r47Var.k) == null) {
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
        c2(j, j2, null, true, pccVar);
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = jn7.I3;
        sua suaVar = this.a2;
        if (i != i3) {
            if (i == jn7.d4) {
                suaVar.setInWallet(this.d3 == null && this.a3 == null && y2(B1()));
                return;
            }
            return;
        }
        if (this.B2 == ((axa) objArr[1])) {
            vta vtaVar = suaVar.N;
            if (vtaVar == null || !vtaVar.i0) {
                D2();
            }
        }
    }

    @Override // nx0, android.app.Dialog, android.content.DialogInterface, ag0
    public final void dismiss() {
        if (this.W2.c(4) && this.a2.N.i0) {
            return;
        }
        ld9 ld9Var = this.R2;
        if (ld9Var != null) {
            ld9Var.b();
            this.R2 = null;
        }
        iua iuaVar = this.K2;
        if (iuaVar != null) {
            iuaVar.a();
        }
        super.dismiss();
    }

    public final void e1(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z, hw4 hw4Var) {
        d31 j2;
        bxa bxaVar = this.B2;
        if (hw4Var != null) {
            ex0 ex0Var = hw4Var.c;
            hl.t1(ex0Var.findFocus());
            j2 = new d31(ex0Var, this.J0);
        } else {
            j2 = j();
        }
        byte b = 0;
        it7.d(getContext(), this.a, tL_starGiftUnique, j, tL_textWithEntities, !z, this.J0, new vra(this, hw4Var, b), j2, new wra(this, hw4Var, b), new xra(bxaVar, tL_starGiftUnique, (byte) 0));
    }

    public final void e2() {
        TL_stars.InputSavedStarGift v1;
        long j;
        long j2;
        long j3;
        boolean z;
        boolean z2;
        boolean z3;
        String str;
        boolean z4;
        kg5 kg5Var = this.w3;
        if (kg5Var != null) {
            kg5Var.f(true);
            this.w3 = null;
        }
        if (this.X2 != null || (v1 = v1()) == null) {
            return;
        }
        r47 r47Var = this.C2;
        long j4 = this.S1;
        if (r47Var != null) {
            TLRPC.MessageAction messageAction = r47Var.k.action;
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
            z4 = tL_messageActionStarGift.prepaid_upgrade ? wf3.n(tL_messageActionStarGift.from_id) != this.C2.Z0() : tL_messageActionStarGift.upgrade_separate;
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
            textView.setText(ob6.M0(z3 ? 2131750359 : 2131750360, null));
        } else if (z2) {
            textView.setText(ob6.M0(2131750357, null));
        } else {
            textView.setText(ob6.M0(2131750358, null));
        }
        boolean z5 = (z || j3 <= j || z4) ? false : true;
        og2 og2Var = this.r2;
        og2Var.a(z5, false);
        if (this.m3 == null) {
            jxa.v(this.a, false).H(j2, new mra(this, (byte) 2));
        } else if (j3 > j || this.q3 != null) {
            f2();
            return;
        }
        if (j3 > j || this.q3 != null) {
            return;
        }
        this.p3 = true;
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        if (TextUtils.isEmpty(str)) {
            TLRPC.TL_inputInvoiceStarGiftUpgrade tL_inputInvoiceStarGiftUpgrade = new TLRPC.TL_inputInvoiceStarGiftUpgrade();
            tL_inputInvoiceStarGiftUpgrade.keep_original_details = og2Var.a.q;
            tL_inputInvoiceStarGiftUpgrade.stargift = v1;
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftUpgrade;
        } else {
            TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade tL_inputInvoiceStarGiftPrepaidUpgrade = new TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade();
            tL_inputInvoiceStarGiftPrepaidUpgrade.hash = str;
            tL_inputInvoiceStarGiftPrepaidUpgrade.peer = uc7.s1(this.a).j1(j4);
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftPrepaidUpgrade;
        }
        JSONObject u = xw0.u(this.J0, false);
        if (u != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = u.toString();
            tL_payments_getPaymentForm.flags |= 1;
        }
        ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getPaymentForm, new xsa(this, (byte) 0));
    }

    public final boolean f1() {
        TLRPC.Peer peer;
        if (v1() == null) {
            return false;
        }
        r47 r47Var = this.C2;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        if (r47Var != null) {
            TLRPC.MessageAction messageAction = r47Var.k.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                return ((!(tL_messageActionStarGift.peer != null) && (!r47Var.O3() || ((r47.B0(this.C2.k) > yac.h(this.a).e() ? 1 : (r47.B0(this.C2.k) == yac.h(this.a).e() ? 0 : -1)) == 0))) || ((peer = tL_messageActionStarGift.peer) != null && H1(this.a, wf3.n(peer)))) && !tL_messageActionStarGift.converted && tL_messageActionStarGift.convert_stars > 0 && ((int) uc7.s1(this.a).k4.D3.g(timeUnit)) - (ConnectionsManager.getInstance(this.a).getCurrentTime() - this.C2.k.date) > 0;
            }
        } else {
            TL_stars.SavedStarGift savedStarGift = this.A2;
            if (savedStarGift != null) {
                int g = ((int) uc7.s1(this.a).k4.D3.g(timeUnit)) - (ConnectionsManager.getInstance(this.a).getCurrentTime() - savedStarGift.date);
                int i = this.a;
                long j = this.S1;
                if (H1(i, j)) {
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
    public final void f2() {
        long j;
        boolean z;
        boolean z2;
        byte b;
        int i;
        String M0;
        String M02;
        TL_stars.StarGiftUpgradePrice starGiftUpgradePrice;
        r47 r47Var = this.C2;
        if (r47Var != null) {
            TLRPC.MessageAction messageAction = r47Var.k.action;
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
                iua iuaVar = this.K2;
                sua suaVar = this.a2;
                if (iuaVar == null) {
                    iuaVar = new iua(suaVar);
                    this.K2 = iuaVar;
                }
                ArrayList arrayList = this.m3;
                sua suaVar2 = iuaVar.a;
                ArrayList arrayList2 = iuaVar.g;
                ArrayList arrayList3 = iuaVar.f;
                ArrayList arrayList4 = iuaVar.e;
                int size = arrayList4.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList4.get(i3);
                    i3++;
                    ((gua) obj).a();
                }
                arrayList4.clear();
                arrayList3.clear();
                arrayList2.clear();
                ArrayList j3 = jxa.j(arrayList, TL_stars.starGiftAttributeModel.class);
                int size2 = j3.size();
                int i4 = 0;
                while (i4 < size2) {
                    Object obj2 = j3.get(i4);
                    i4++;
                    gua guaVar = new gua(suaVar2.c, (TL_stars.starGiftAttributeModel) obj2);
                    if (suaVar2.isAttachedToWindow() && guaVar.c) {
                        guaVar.d.I();
                    }
                    arrayList4.add(guaVar);
                }
                ArrayList j4 = jxa.j(arrayList, TL_stars.starGiftAttributeBackdrop.class);
                int size3 = j4.size();
                int i5 = 0;
                while (i5 < size3) {
                    Object obj3 = j4.get(i5);
                    i5++;
                    arrayList3.add(new fua((TL_stars.starGiftAttributeBackdrop) obj3));
                }
                ArrayList j5 = jxa.j(arrayList, TL_stars.starGiftAttributePattern.class);
                int size4 = j5.size();
                int i6 = 0;
                while (i6 < size4) {
                    Object obj4 = j5.get(i6);
                    i6++;
                    arrayList2.add(new hua((TL_stars.starGiftAttributePattern) obj4));
                }
                suaVar.setPreviewingAttributes(this.m3);
                long j6 = this.S1;
                if (z) {
                    z2 = true;
                    suaVar.i(1, ob6.M0(2131750020, null), ob6.a0(null, null, 2131750021, wf3.r(this.a, j6)), null);
                } else {
                    z2 = true;
                    suaVar.i(1, ob6.M0(2131749797, null), ob6.M0(2131749798, null), null);
                }
                c51 c51Var = this.f2;
                c51Var.setFilled(z2);
                c51Var.g(null, z2);
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
                        this.h2.setText(hl.E2(hl.N2("**" + ob6.M0(2131749816, null) + "**", -1, 0, new jra(this, (byte) 4), null), false, hl.L(0.6666667f), hl.L(0.66f)));
                    }
                    C2();
                    wm2[] wm2VarArr = this.r3;
                    if (z) {
                        c51Var.i(nza.U0(ob6.a0(null, null, 2131750025, Long.valueOf(j2)), 1.13f, wm2VarArr), true, true);
                    } else {
                        c51Var.i(nza.U0(ob6.a0(null, null, 2131749823, Long.valueOf(j2)), 1.13f, wm2VarArr), true, true);
                    }
                } else {
                    c51Var.i(ob6.M0(2131751782, null), true, true);
                }
                c51Var.setOnClickListener(new hra(this, (byte) 11));
                View view = this.p2;
                bc[] bcVarArr = this.o2;
                LinearLayout linearLayout = this.q2;
                if (z) {
                    linearLayout.setVisibility(8);
                    view.setVisibility(8);
                    bc bcVar = bcVarArr[0];
                    String M03 = ob6.M0(2131749811, null);
                    if (z) {
                        i = 1;
                        b = 2;
                        M0 = ob6.a0(null, null, 2131750024, wf3.r(this.a, j6));
                    } else {
                        i = 1;
                        b = 2;
                        M0 = ob6.M0(2131749813, null);
                    }
                    bcVar.a(R.drawable.menu_feature_unique, M03, M0);
                    bc bcVar2 = bcVarArr[i];
                    String M04 = ob6.M0(2131749808, null);
                    if (z) {
                        Object[] objArr = new Object[i];
                        objArr[0] = wf3.r(this.a, j6);
                        M02 = ob6.a0(null, null, 2131750023, objArr);
                    } else {
                        M02 = ob6.M0(2131749810, null);
                    }
                    bcVar2.a(R.drawable.menu_feature_transfer, M04, M02);
                    bcVarArr[b].a(R.drawable.menu_feature_tradable, ob6.M0(2131749805, null), z ? ob6.a0(null, null, 2131750022, wf3.r(this.a, j6)) : ob6.M0(2131749807, null));
                } else {
                    b = 2;
                    linearLayout.setVisibility(0);
                    view.setVisibility(0);
                    bcVarArr[0].a(R.drawable.menu_feature_unique, ob6.M0(2131749811, null), ob6.M0(2131749346, null));
                    bcVarArr[1].a(R.drawable.menu_feature_tradable, ob6.M0(2131749805, null), ob6.M0(2131749344, null));
                    bcVarArr[2].a(R.drawable.menu_wear, ob6.M0(2131749341, null), ob6.M0(2131749342, null));
                }
                hl.c3(new lra(this, j2, b));
            }
        }
    }

    public final boolean g1() {
        int i;
        TL_stars.TL_starGiftUnique B1 = B1();
        if (B1 == null || B1.crafted || it7.n(B1) || !H1(this.a, wf3.n(B1.owner_id))) {
            return false;
        }
        r47 r47Var = this.C2;
        if (r47Var == null) {
            TL_stars.SavedStarGift savedStarGift = this.A2;
            if (savedStarGift != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
                i = savedStarGift.can_craft_at;
            }
        }
        TLRPC.Message message = r47Var.k;
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

    public final void g2() {
        TL_stars.TL_starGiftUnique B1 = B1();
        if (x2() || F2() == null || B1 == null || TextUtils.isEmpty(B1.slug)) {
            return;
        }
        zw4 zw4Var = new zw4();
        zw4Var.a = ob6.M0(2131749860, null);
        zw4Var.b = true;
        zw4Var.e = new ku9(this, r1, (byte) 9);
        Context context = getContext();
        int i = this.a;
        bx4 bx4Var = new bx4(context, i, false, pj0.a(i).b(), null, zw4Var, this.J0);
        bx4[] bx4VarArr = {bx4Var};
        bx4Var.show();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0098 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h1() {
        if (this.a3 == null && v1() != null) {
            r47 r47Var = this.C2;
            if (r47Var != null) {
                TLRPC.Message message = r47Var.k;
                if (message != null) {
                    TLRPC.MessageAction messageAction = message.action;
                    if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                        TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                        TL_stars.StarGift starGift = tL_messageActionStarGift.gift;
                        if ((starGift instanceof TL_stars.TL_starGift) && !starGift.limited && starGift.availability_total <= 0 && !starGift.auction && !tL_messageActionStarGift.converted && !tL_messageActionStarGift.upgraded && !tL_messageActionStarGift.refunded && tL_messageActionStarGift.convert_stars > 0) {
                            boolean O3 = r47Var.O3();
                            boolean z = r47.B0(this.C2.k) == yac.h(this.a).e();
                            TLRPC.Peer peer = tL_messageActionStarGift.peer;
                            if (peer != null) {
                                return H1(this.a, wf3.n(peer));
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
                    if (!(starGift2 instanceof TL_stars.TL_starGift) || starGift2.limited || starGift2.availability_total > 0 || starGift2.auction || savedStarGift.refunded || !H1(this.a, this.S1)) {
                    }
                }
            }
        }
        return false;
    }

    public final boolean i1() {
        TL_stars.TL_starGiftUnique B1 = B1();
        if (B1 == null || TextUtils.isEmpty(B1.slug)) {
            return false;
        }
        if (this.a3 == null && !I1(B1) && !F1(B1) && (!it7.y(B1) || !G1(this.a, wf3.n(B1.owner_id)))) {
            return false;
        }
        hr hrVar = uc7.s1(this.a).k4;
        if (hrVar.v0.f) {
            return hrVar.s.f || hrVar.t.f || I1(B1);
        }
        return false;
    }

    public final SpannableStringBuilder i2(TLRPC.Peer peer) {
        if (peer != null) {
            String q = wf3.q(uc7.s1(this.a).b2(wf3.n(peer)));
            if (!TextUtils.isEmpty(q)) {
                return hl.N2(ob6.a0(null, null, 2131750001, c00.i("@", q)), -1, 0, new tra(this, q, (byte) 6), null);
            }
        }
        return null;
    }

    @Override // nx0, ag0
    public d31 j() {
        return new d31(this.k2, this.J0);
    }

    public final void j1() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.J0, getContext());
        String M0 = ob6.M0(2131750225, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        idVar.U = ob6.M0(2131750226, null);
        TL_stars.TL_starGiftUnique B1 = B1();
        if (B1 != null && !TextUtils.isEmpty(B1.slug)) {
            alertDialog$Builder.j(ob6.M0(2131747532, null), new tsa(this, B1, (byte) 1));
        }
        ik8.y(null, 2131752570, alertDialog$Builder, null);
    }

    public final SpannableStringBuilder j2(TL_stars.StarGift starGift) {
        if (starGift == null || (starGift instanceof TL_stars.TL_starGiftUnique)) {
            return null;
        }
        return i2(starGift.released_by);
    }

    public final void k1(long j, TL_stars.starGiftDepositPayload stargiftdepositpayload, long j2, l01 l01Var, bx4 bx4Var) {
        TL_wallet.nftItem F2 = F2();
        TL_stars.TL_starGiftUnique B1 = B1();
        if (F2 == null || B1 == null || TextUtils.isEmpty(B1.slug)) {
            return;
        }
        byte b = 0;
        boolean z = this.a3 != null;
        String t1 = t1();
        l01Var.d();
        hsa hsaVar = new hsa(this, j2, l01Var, j, B1, F2, bx4Var, z, t1);
        if (stargiftdepositpayload != null) {
            hsaVar.a(stargiftdepositpayload);
            return;
        }
        TL_stars.depositStarGift depositstargift = new TL_stars.depositStarGift();
        depositstargift.peer = uc7.s1(this.a).j1(j);
        depositstargift.slug = B1.slug;
        ConnectionsManager.getInstance(this.a).sendRequestTyped(depositstargift, new ic(b), new nu0((Object) this, (Object) l01Var, (Object) bx4Var, (Object) hsaVar, (byte) 15));
    }

    public final void l1(long j, pcc pccVar) {
        TLRPC.Message message;
        long n;
        long j2;
        TL_stars.InputSavedStarGift v1 = v1();
        if (v1 != null) {
            TL_stars.SavedStarGift savedStarGift = this.A2;
            if (savedStarGift == null || !(savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
                r47 r47Var = this.C2;
                if (r47Var == null || (message = r47Var.k) == null) {
                    return;
                }
                TLRPC.MessageAction messageAction = message.action;
                if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                    return;
                }
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                n = wf3.n(tL_messageActionStarGiftUnique.gift.owner_id);
                j2 = tL_messageActionStarGiftUnique.transfer_stars;
            } else {
                j2 = savedStarGift.transfer_stars;
                n = this.S1;
            }
            long j3 = n;
            if (j2 <= 0) {
                TL_stars.transferStarGift transferstargift = new TL_stars.transferStarGift();
                transferstargift.stargift = v1;
                transferstargift.to_id = uc7.s1(this.a).j1(j);
                ConnectionsManager.getInstance(this.a).sendRequest(transferstargift, new op6(this, pccVar, j, j3, (byte) 2));
                return;
            }
            jxa v = jxa.v(this.a, false);
            if (!v.e) {
                v.o(new y09((Object) this, (Object) v, j, (Object) pccVar, (byte) 3));
                return;
            }
            TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer = new TLRPC.TL_inputInvoiceStarGiftTransfer();
            tL_inputInvoiceStarGiftTransfer.stargift = v1;
            tL_inputInvoiceStarGiftTransfer.to_id = uc7.s1(this.a).j1(j);
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftTransfer;
            JSONObject u = xw0.u(this.J0, false);
            if (u != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = u.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getPaymentForm, new z95(this, tL_inputInvoiceStarGiftTransfer, j, j3, pccVar));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void m1() {
        TL_stars.InputSavedStarGift v1;
        long j;
        c51 c51Var = this.f2;
        if (c51Var.R || (v1 = v1()) == null) {
            return;
        }
        r47 r47Var = this.C2;
        String str = null;
        long j2 = 0;
        if (r47Var != null) {
            TLRPC.MessageAction messageAction = r47Var.k.action;
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
            c51Var.setLoading(true);
            int i = 0;
            Object[] objArr = 0;
            og2 og2Var = this.r2;
            if (j > 0) {
                TL_stars.upgradeStarGift upgradestargift = new TL_stars.upgradeStarGift();
                upgradestargift.keep_original_details = og2Var.a.q;
                upgradestargift.stargift = v1;
                ConnectionsManager.getInstance(this.a).sendRequest(upgradestargift, new isa(this, v1, objArr == true ? 1 : 0));
                return;
            }
            jxa v = jxa.v(this.a, false);
            if (!v.e) {
                v.o(new ida((Object) this, (Object) v, (byte) 12));
                return;
            }
            TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
            tL_payments_sendStarsForm.form_id = this.q3.form_id;
            if (TextUtils.isEmpty(str)) {
                TLRPC.TL_inputInvoiceStarGiftUpgrade tL_inputInvoiceStarGiftUpgrade = new TLRPC.TL_inputInvoiceStarGiftUpgrade();
                tL_inputInvoiceStarGiftUpgrade.keep_original_details = og2Var.a.q;
                tL_inputInvoiceStarGiftUpgrade.stargift = v1;
                tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftUpgrade;
            } else {
                TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade tL_inputInvoiceStarGiftPrepaidUpgrade = new TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade();
                tL_inputInvoiceStarGiftPrepaidUpgrade.hash = str;
                tL_inputInvoiceStarGiftPrepaidUpgrade.peer = uc7.s1(this.a).j1(this.S1);
                tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftPrepaidUpgrade;
            }
            ArrayList<TLRPC.TL_labeledPrice> arrayList = this.q3.invoice.prices;
            int size = arrayList.size();
            while (i < size) {
                TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i);
                i++;
                j2 += tL_labeledPrice.amount;
            }
            ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_sendStarsForm, new ft0((Object) this, (Object) str, (Object) v1, j2, (byte) 5));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:320:0x037e, code lost:
    
        if (H1(r57.a, wf3.n(r6)) != false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x038d, code lost:
    
        if (r4 > 0) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x03d7, code lost:
    
        if (r43 == false) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x03d9, code lost:
    
        if (r30 == false) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x03dd, code lost:
    
        if (r27 <= 0) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x03df, code lost:
    
        r7 = null;
        r4 = ob6.a0(null, null, 2131750124, r35);
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x03f1, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x03f5, code lost:
    
        if (r45 == false) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x03f7, code lost:
    
        if (r24 != false) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x03f9, code lost:
    
        r4 = ob6.a0(null, null, 2131750102, r35);
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x0405, code lost:
    
        if (r24 == false) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x0407, code lost:
    
        r4 = "Gift2InfoOutConverted";
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x040c, code lost:
    
        r4 = ob6.K(r4, (int) r8, ',', r35);
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x041a, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x040a, code lost:
    
        r4 = "Gift2InfoOut";
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x041c, code lost:
    
        if (r24 == false) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x041e, code lost:
    
        if (r39 == false) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x0420, code lost:
    
        r4 = "Gift2InfoChannelConverted";
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x042d, code lost:
    
        r4 = ob6.H(',', r4, (int) r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x0423, code lost:
    
        r4 = "Gift2InfoConverted";
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x0426, code lost:
    
        if (r39 == false) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x0428, code lost:
    
        r4 = "Gift2Info3Channel";
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x042b, code lost:
    
        r4 = "Gift2Info3";
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x03d5, code lost:
    
        if (r6 > 0) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00db, code lost:
    
        if (r5.id != r11.id) goto L57;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x07b9  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x05b5  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x079c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x07b6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x07bf  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x07d1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0893  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0965  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x08c8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x07ec  */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [gjb[], wm2[], y41[]] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2(r47 r47Var, bxa bxaVar) {
        boolean z;
        TL_stars.StarGift starGift;
        TLRPC.Peer peer;
        TLRPC.Peer peer2;
        long j;
        long j2;
        int i;
        boolean z2;
        boolean z3;
        TLRPC.Peer peer3;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        boolean z4;
        boolean z5;
        String str;
        boolean z6;
        boolean z7;
        boolean z8;
        TLRPC.TL_textWithEntities tL_textWithEntities2;
        String a0;
        TLRPC.TL_textWithEntities tL_textWithEntities3;
        boolean z9;
        TL_stars.StarGift starGift2;
        boolean z10;
        TL_stars.StarGift starGift3;
        String M0;
        String str2;
        String str3;
        char c;
        CharSequence charSequence;
        int i2;
        CharSequence concat;
        hjb hjbVar;
        TLRPC.TL_textWithEntities tL_textWithEntities4;
        String str4;
        boolean z11;
        int i3;
        boolean z12;
        TL_stars.StarGift starGift4;
        TLRPC.Document document;
        boolean z13;
        boolean z14;
        boolean z15;
        int i4;
        CharSequence charSequence2;
        String M02;
        ?? r14;
        CharSequence charSequence3;
        String str5;
        String M03;
        iua iuaVar;
        String str6;
        String str7;
        boolean z16;
        float f;
        String M04;
        p66 p66Var;
        int i5;
        int i6;
        TLObject b2;
        boolean z17;
        boolean z18;
        iua iuaVar2;
        TL_stars.InputSavedStarGift v1;
        if (r47Var == null || r47Var.k == null) {
            return;
        }
        boolean z19 = false;
        this.z2 = false;
        TLRPC.TL_textWithEntities tL_textWithEntities5 = null;
        this.A2 = null;
        this.C2 = r47Var;
        this.B2 = bxaVar;
        this.Z1.set(r47Var);
        long e = yac.h(this.a).e();
        boolean z20 = r47.B0(r47Var.k) == e;
        TLRPC.MessageAction messageAction = r47Var.k.action;
        boolean z21 = messageAction instanceof TLRPC.TL_messageActionStarGift;
        byte b = 3;
        sua suaVar = this.a2;
        c51 c51Var = this.f2;
        if (!z21) {
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                return;
            }
            if (!(((TLRPC.TL_messageActionStarGiftUnique) messageAction).gift instanceof TL_stars.TL_starGift)) {
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                if (tL_messageActionStarGiftUnique.gift instanceof TL_stars.TL_starGiftUnique) {
                    if (tL_messageActionStarGiftUnique.name_hidden) {
                        b2 = null;
                    } else {
                        uc7 s1 = uc7.s1(this.a);
                        TLRPC.Peer peer4 = tL_messageActionStarGiftUnique.from_id;
                        b2 = s1.b2(peer4 != null ? wf3.n(peer4) : r47Var.Z0());
                    }
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) tL_messageActionStarGiftUnique.gift;
                    boolean z22 = tL_messageActionStarGiftUnique.refunded;
                    p2(tL_starGiftUnique, z22, b2, tL_messageActionStarGiftUnique.message);
                    z15 = tL_messageActionStarGiftUnique.saved;
                    TL_stars.StarGift starGift5 = tL_messageActionStarGiftUnique.gift;
                    boolean z23 = (tL_messageActionStarGiftUnique.upgrade ^ true) == r47Var.O3();
                    if (r47.B0(r47Var.k) == e) {
                        z23 = false;
                    }
                    if (!this.I2 && !this.J2 && this.C2 != null && (v1 = v1()) != null) {
                        this.I2 = true;
                        jxa.v(this.a, false).J(v1, new mra(this, b));
                    }
                    if (this.L2 || (iuaVar2 = this.K2) == null || !iuaVar2.o || (r5 = iuaVar2.l) == null) {
                        z17 = z23;
                        z18 = z22;
                    } else {
                        z17 = z23;
                        if (starGift5 != null) {
                            z18 = z22;
                        } else {
                            z18 = z22;
                        }
                        iuaVar2.a();
                        this.K2 = null;
                        suaVar.b.setAlpha(1.0f);
                        suaVar.c.setAlpha(0.0f);
                    }
                    z3 = false;
                    peer3 = null;
                    z7 = z20;
                    starGift2 = starGift5;
                    z14 = z17;
                    z13 = z18;
                    z11 = true;
                    str4 = null;
                    if (this.j3) {
                        c51Var.setFilled(z11);
                        c51Var.i(ob6.M0(2131749740, str4), false, z11);
                        c51Var.setOnClickListener(new hra(this, (byte) 16));
                    }
                    if (starGift2 != null) {
                        str6 = null;
                        str7 = null;
                    } else {
                        str6 = starGift2.owner_address;
                        str7 = starGift2.gift_address;
                    }
                    z16 = starGift2 == null && starGift2.host_id != null;
                    p66 p66Var2 = this.c2;
                    if (z13) {
                        f = 0.66f;
                        if (z16 && !TextUtils.isEmpty(str6) && !TextUtils.isEmpty(str7)) {
                            p66Var2.setVisibility(0);
                            p66Var2.setText(hl.E2(hl.N2(ob6.M0(2131750140, null), -1, 0, new tra(this, str7, (byte) 2), null), true, hl.L(2.6666667f), hl.L(0.66f)));
                            yob.X(p66Var2, aob.q5, this.J0);
                        } else if (TextUtils.isEmpty(str6) && TextUtils.isEmpty(str7) && z19 && !z7) {
                            p66Var2.setVisibility(0);
                            if (z14) {
                                M04 = ob6.a0(null, null, (tL_textWithEntities5 == null || TextUtils.isEmpty(tL_textWithEntities5.text)) ? 2131750046 : 2131750045, wf3.s(r47.B0(r47Var.k)));
                            } else {
                                M04 = ob6.M0((tL_textWithEntities5 == null || TextUtils.isEmpty(tL_textWithEntities5.text)) ? 2131750139 : 2131750138, null);
                            }
                            p66Var2.setText(M04);
                            yob.X(p66Var2, aob.q5, this.J0);
                        } else {
                            p66Var2.setVisibility(8);
                        }
                    } else {
                        f = 0.66f;
                        p66Var2.setVisibility(0);
                        p66Var2.setText(ob6.M0(2131750003, null));
                        yob.X(p66Var2, aob.q7, this.J0);
                    }
                    p66Var = this.e2;
                    if (z16 && !TextUtils.isEmpty(str6) && !TextUtils.isEmpty(str7)) {
                        p66Var.setVisibility(0);
                        p66Var.setText(hl.E2(hl.N2(ob6.M0(2131750140, null), -1, 0, new tra(this, str7, (byte) 3), null), true, hl.L(2.6666667f), hl.L(f)));
                    } else if (z3 && !z13 && starGift2 != null && G1(this.a, r1()) && peer3 == null) {
                        p66Var.setVisibility(0);
                        byte b3 = 12;
                        if (r1() >= 0) {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            if (z15) {
                                i5 = 0;
                                i6 = 2131750013;
                            } else {
                                spannableStringBuilder.append((CharSequence) ". ");
                                i5 = 0;
                                spannableStringBuilder.setSpan(new wm2(R.drawable.mini_gift_hidden, 0), 0, 1, 33);
                                i6 = 2131750016;
                            }
                            spannableStringBuilder.append((CharSequence) hl.N2(ob6.M0(i6, null), -1, i5, new jra(this, b3), null));
                            p66Var.setText(hl.E2(spannableStringBuilder, true, hl.L(2.6666667f), hl.L(f)));
                        } else {
                            p66Var.setText(hl.E2(hl.N2(ob6.M0(z15 ? 2131750212 : 2131750213, null), -1, 0, new jra(this, b3), null), true, hl.L(2.6666667f), hl.L(f)));
                        }
                    } else {
                        p66Var.setVisibility(8);
                    }
                    if (this.Z2) {
                        A2(0, false, null);
                        this.m1.m0(1);
                        this.Z2 = false;
                    }
                    this.o1.setTitle(this.Q2);
                    D2();
                }
                return;
            }
        }
        byte b4 = 2;
        if (!this.L2 && (iuaVar = this.K2) != null && iuaVar.o && iuaVar.l != null) {
            iuaVar.a();
            this.K2 = null;
            suaVar.b.setVisibility(0);
            suaVar.c.setVisibility(4);
        }
        boolean O3 = r47Var.O3();
        if (z20) {
            O3 = false;
        }
        TLRPC.Message message = r47Var.k;
        int i7 = message.date;
        TLRPC.MessageAction messageAction2 = message.action;
        if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction2;
            boolean z24 = tL_messageActionStarGift.converted;
            boolean z25 = tL_messageActionStarGift.saved;
            boolean z26 = tL_messageActionStarGift.refunded;
            boolean z27 = tL_messageActionStarGift.name_hidden;
            TL_stars.StarGift starGift6 = tL_messageActionStarGift.gift;
            boolean z28 = tL_messageActionStarGift.can_upgrade;
            long j3 = tL_messageActionStarGift.convert_stars;
            j2 = tL_messageActionStarGift.upgrade_stars;
            TLRPC.TL_textWithEntities tL_textWithEntities6 = tL_messageActionStarGift.message;
            TLRPC.Peer peer5 = tL_messageActionStarGift.from_id;
            tL_textWithEntities = tL_textWithEntities6;
            TLRPC.Peer peer6 = tL_messageActionStarGift.peer;
            z5 = tL_messageActionStarGift.prepaid_upgrade;
            str = tL_messageActionStarGift.prepaid_upgrade_hash;
            TLRPC.Peer peer7 = tL_messageActionStarGift.auction_acquired ? tL_messageActionStarGift.to_id : null;
            peer2 = peer5;
            peer = peer6;
            z4 = z28;
            z3 = z24;
            starGift = starGift6;
            z2 = z27;
            z6 = z25;
            i = tL_messageActionStarGift.gift_num;
            peer3 = peer7;
            z = z26;
            j = j3;
        } else {
            TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique2 = (TLRPC.TL_messageActionStarGiftUnique) messageAction2;
            boolean z29 = tL_messageActionStarGiftUnique2.saved;
            boolean z30 = tL_messageActionStarGiftUnique2.refunded;
            TL_stars.StarGift starGift7 = tL_messageActionStarGiftUnique2.gift;
            TLRPC.Peer peer8 = tL_messageActionStarGiftUnique2.from_id;
            z = z30;
            starGift = starGift7;
            peer = tL_messageActionStarGiftUnique2.peer;
            peer2 = peer8;
            j = 0;
            j2 = 0;
            i = 0;
            z2 = false;
            z3 = false;
            peer3 = null;
            tL_textWithEntities = null;
            z4 = false;
            z5 = false;
            str = null;
            z6 = z29;
        }
        long j4 = this.S1;
        String s = wf3.s(j4);
        boolean v = lbc.v(uc7.s1(this.a).X1(Long.valueOf(j4)));
        boolean z31 = peer != null && wf3.n(peer) < 0;
        boolean J1 = J1(this.a, B1());
        w1();
        suaVar.f(starGift, false, false, J1);
        suaVar.setShowOptions(h1());
        if (z20) {
            if (i == 0 || starGift.title == null) {
                z7 = z20;
                z8 = O3;
                str5 = null;
                M03 = ob6.M0(2131749886, null);
            } else {
                StringBuilder sb = new StringBuilder();
                z7 = z20;
                sb.append(starGift.title);
                sb.append(" #");
                z8 = O3;
                M03 = qu6.m(i, ',', sb);
                str5 = null;
            }
            this.Q2 = M03;
            CharSequence charSequence4 = str5;
            if (!z) {
                if (z4) {
                    charSequence4 = hl.S2(ob6.M0(2131749943, str5));
                } else if (j > 0) {
                    charSequence4 = hl.S2(ob6.H(',', z3 ? "Gift2SelfInfoConverted" : "Gift2SelfInfoConvert", (int) j));
                } else {
                    charSequence4 = hl.S2(ob6.M0(2131749950, null));
                }
            }
            suaVar.i(0, M03, charSequence4, j2(starGift));
        } else {
            z7 = z20;
            z8 = O3;
            if (!z31 || this.z2) {
                if ((z8 || z4) && j2 > 0) {
                    String M05 = ob6.M0(z8 ? 2131749883 : 2131749887, null);
                    this.Q2 = M05;
                    if (z) {
                        a0 = null;
                    } else if (z8) {
                        tL_textWithEntities2 = tL_textWithEntities;
                        a0 = ob6.a0(null, null, 2131750108, s);
                        suaVar.i(0, M05, a0, j2(starGift));
                        tL_textWithEntities3 = tL_textWithEntities2;
                        z9 = z6;
                        starGift2 = starGift;
                    } else {
                        a0 = ob6.M0(2131750107, null);
                    }
                    tL_textWithEntities2 = tL_textWithEntities;
                    suaVar.i(0, M05, a0, j2(starGift));
                    tL_textWithEntities3 = tL_textWithEntities2;
                    z9 = z6;
                    starGift2 = starGift;
                } else {
                    TLRPC.TL_textWithEntities tL_textWithEntities7 = tL_textWithEntities;
                    if (i == 0 || starGift.title == null) {
                        z10 = z6;
                        starGift3 = starGift;
                        M0 = ob6.M0(z8 ? 2131749883 : 2131749887, null);
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(starGift.title);
                        sb2.append(" #");
                        z10 = z6;
                        starGift3 = starGift;
                        M0 = qu6.m(i, ',', sb2);
                    }
                    this.Q2 = M0;
                    if (z) {
                        z9 = z10;
                        tL_textWithEntities3 = tL_textWithEntities7;
                        starGift2 = starGift3;
                        concat = null;
                        i2 = 0;
                    } else {
                        if (!v && v1() != null) {
                            r47 r47Var2 = this.C2;
                            TimeUnit timeUnit = TimeUnit.SECONDS;
                            if (r47Var2 != null) {
                                TLRPC.MessageAction messageAction3 = r47Var2.k.action;
                                if (messageAction3 instanceof TLRPC.TL_messageActionStarGift) {
                                    TLRPC.TL_messageActionStarGift tL_messageActionStarGift2 = (TLRPC.TL_messageActionStarGift) messageAction3;
                                    boolean z32 = tL_messageActionStarGift2.peer != null;
                                    r47Var2.O3();
                                    r47.B0(this.C2.k);
                                    yac.h(this.a).e();
                                    z9 = z10;
                                    int g = ((int) uc7.s1(this.a).k4.D3.g(timeUnit)) - (ConnectionsManager.getInstance(this.a).getCurrentTime() - this.C2.k.date);
                                    if (z32) {
                                        TLRPC.Peer peer9 = tL_messageActionStarGift2.peer;
                                        if (peer9 != null) {
                                            tL_textWithEntities3 = tL_textWithEntities7;
                                        }
                                        tL_textWithEntities3 = tL_textWithEntities7;
                                        if (z8) {
                                            str2 = null;
                                            str3 = ob6.M0(!z9 ? z31 ? 2131750132 : 2131750137 : z31 ? 2131750131 : 2131750136, null);
                                            SpannableStringBuilder S2 = hl.S2(str3);
                                            if (v) {
                                            }
                                            starGift2 = starGift3;
                                            c = 1;
                                            charSequence = "";
                                            CharSequence[] charSequenceArr = new CharSequence[3];
                                            i2 = 0;
                                            charSequenceArr[0] = S2;
                                            charSequenceArr[c] = " ";
                                            charSequenceArr[2] = charSequence;
                                            concat = TextUtils.concat(charSequenceArr);
                                        } else {
                                            String str8 = null;
                                            str3 = ob6.a0(null, null, (!z4 || j2 <= 0) ? 2131750125 : 2131750124, s);
                                            str2 = str8;
                                            SpannableStringBuilder S22 = hl.S2(str3);
                                            if (v && f1()) {
                                                starGift2 = starGift3;
                                                c = 1;
                                                charSequence = hl.D2(hl.P2(ob6.M0(2131750069, str2).replace(' ', (char) 160), new jra(this, (byte) 8)), true);
                                            } else {
                                                starGift2 = starGift3;
                                                c = 1;
                                                charSequence = "";
                                            }
                                            CharSequence[] charSequenceArr2 = new CharSequence[3];
                                            i2 = 0;
                                            charSequenceArr2[0] = S22;
                                            charSequenceArr2[c] = " ";
                                            charSequenceArr2[2] = charSequence;
                                            concat = TextUtils.concat(charSequenceArr2);
                                        }
                                    } else {
                                        tL_textWithEntities3 = tL_textWithEntities7;
                                    }
                                    if (!tL_messageActionStarGift2.converted) {
                                        if (tL_messageActionStarGift2.convert_stars > 0) {
                                        }
                                    }
                                    if (z8) {
                                    }
                                }
                            } else {
                                z9 = z10;
                                tL_textWithEntities3 = tL_textWithEntities7;
                                TL_stars.SavedStarGift savedStarGift = this.A2;
                                if (savedStarGift != null) {
                                    int g2 = ((int) uc7.s1(this.a).k4.D3.g(timeUnit)) - (ConnectionsManager.getInstance(this.a).getCurrentTime() - savedStarGift.date);
                                    if (H1(this.a, j4)) {
                                        int i8 = this.A2.flags;
                                        if (((j4 < 0 ? 2048 : 8) & i8) != 0) {
                                            if ((i8 & 16) != 0) {
                                                if ((i8 & 2) != 0) {
                                                }
                                            }
                                        }
                                    }
                                }
                                if (z8) {
                                }
                            }
                        }
                        z9 = z10;
                        tL_textWithEntities3 = tL_textWithEntities7;
                        if (z8) {
                        }
                    }
                    suaVar.i(i2, M0, concat, j2(starGift2));
                }
                hjbVar = this.d2;
                hjbVar.removeAllViews();
                long n = peer2 == null ? wf3.n(peer2) : z8 ? e : j4;
                if (peer == null) {
                    j4 = wf3.n(peer);
                } else if (!z8) {
                    j4 = e;
                }
                TLRPC.User X1 = uc7.s1(this.a).X1(Long.valueOf(n));
                if (peer3 == null) {
                    long n2 = wf3.n(peer3);
                    this.d2.m(ob6.M0(2131749882, null), this.a, n2, new lra(this, n2, (byte) 4), null, z31 ? null : new lra(this, n2, (byte) 6));
                } else {
                    if (n != e || z5 || z31) {
                        this.d2.m(ob6.M0(2131750152, null), this.a, n, new lra(this, n, (byte) 7), (n == e || n == 2666000 || lbc.z(X1) || v || z31) ? null : ob6.M0(2131750243, null), z31 ? null : new lra(this, n, (byte) 8));
                    }
                    if (j4 != e || z31) {
                        this.d2.m(ob6.M0(2131749882, null), this.a, j4, new lra(this, j4, (byte) 9), null, z31 ? null : new lra(this, j4, (byte) 10));
                    }
                }
                hjbVar.g(i7, ob6.M0(2131744617, null));
                byte b5 = 14;
                if (starGift2.stars > 0) {
                    String M06 = ob6.M0(2131749793, null);
                    String concat2 = "⭐️ ".concat(ob6.E(starGift2.stars + j2, ','));
                    if (!f1() || z) {
                        r14 = 0;
                        charSequence3 = "";
                    } else {
                        r14 = 0;
                        charSequence3 = z41.b(ob6.H(',', "Gift2ButtonSell", (int) j), new jra(this, b5), this.J0, null);
                    }
                    hjbVar.f(M06, nza.b1(false, TextUtils.concat(concat2, " ", charSequence3), 0.8f, r14), r14, r14);
                }
                if (starGift2.limited && !z) {
                    nza.C0(hjbVar, this.a, starGift2, this.J0);
                }
                tL_textWithEntities4 = tL_textWithEntities3;
                if (tL_textWithEntities3 != null && !TextUtils.isEmpty(tL_textWithEntities4.text) && !z) {
                    hjbVar.b(tL_textWithEntities4.text, tL_textWithEntities4.entities);
                }
                if (z8 && z4 && !z) {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("^  ");
                    wm2 wm2Var = this.Y2;
                    if (wm2Var == null) {
                        i4 = 0;
                        wm2Var = new wm2(0, new tua(c51Var, aob.v0(aob.Fi, this.J0)));
                        this.Y2 = wm2Var;
                    } else {
                        i4 = 0;
                    }
                    spannableStringBuilder2.setSpan(wm2Var, i4, 1, 33);
                    if (j2 > 0) {
                        charSequence2 = null;
                        M02 = ob6.M0(2131749821, null);
                    } else {
                        charSequence2 = null;
                        M02 = ob6.M0(2131749820, null);
                    }
                    spannableStringBuilder2.append((CharSequence) M02);
                    c51Var.setFilled(true);
                    c51Var.i(spannableStringBuilder2, !this.Z2, true);
                    c51Var.g(charSequence2, !this.Z2);
                    c51Var.setOnClickListener(new hra(this, (byte) 18));
                } else {
                    if (this.m2 || this.U1 == null || this.B2 == null || x1() < 0 || this.B2.b(x1()) < 0) {
                        if ((starGift2 instanceof TL_stars.TL_starGift) || TextUtils.isEmpty(str)) {
                            str4 = null;
                            z11 = true;
                            c51Var.setFilled(true);
                            c51Var.i(ob6.M0(2131747558, null), !this.Z2, true);
                            c51Var.g(null, !this.Z2);
                            c51Var.setOnClickListener(new hra(this, (byte) 15));
                        } else {
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("^  ");
                            wm2 wm2Var2 = this.Y2;
                            if (wm2Var2 == null) {
                                i3 = 0;
                                wm2Var2 = new wm2(0, new tua(c51Var, aob.v0(aob.Fi, this.J0)));
                                this.Y2 = wm2Var2;
                            } else {
                                i3 = 0;
                            }
                            z11 = true;
                            spannableStringBuilder3.setSpan(wm2Var2, i3, 1, 33);
                            str4 = null;
                            spannableStringBuilder3.append((CharSequence) ob6.M0(2131750150, null));
                            c51Var.setFilled(true);
                            c51Var.i(spannableStringBuilder3, !this.Z2, true);
                            c51Var.g(null, !this.Z2);
                            c51Var.setOnClickListener(new hra(this, b5));
                        }
                        tL_textWithEntities5 = tL_textWithEntities4;
                        z19 = z2;
                        z13 = z;
                        z14 = z8;
                        z15 = z9;
                        if (this.j3) {
                        }
                        if (starGift2 != null) {
                        }
                        if (starGift2 == null) {
                        }
                        p66 p66Var22 = this.c2;
                        if (z13) {
                        }
                        p66Var = this.e2;
                        if (z16) {
                        }
                        if (z3) {
                        }
                        p66Var.setVisibility(8);
                        if (this.Z2) {
                        }
                        this.o1.setTitle(this.Q2);
                        D2();
                    }
                    c51Var.setFilled(false);
                    int b6 = this.B2.b(x1());
                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                    spannableStringBuilder4.append((CharSequence) ob6.M0(2131749801, null));
                    Object obj = this.B2.get(b6);
                    if (!(obj instanceof TL_stars.SavedStarGift) || (starGift4 = ((TL_stars.SavedStarGift) obj).gift) == null || (document = starGift4.getDocument()) == null) {
                        z12 = true;
                    } else {
                        spannableStringBuilder4.append((CharSequence) " e");
                        z12 = true;
                        spannableStringBuilder4.setSpan(new hm(document, c51Var.getTextPaint().getFontMetricsInt()), spannableStringBuilder4.length() - 1, spannableStringBuilder4.length(), 33);
                    }
                    c51Var.i(spannableStringBuilder4, this.Z2 ^ z12, z12);
                    c51Var.g(null, this.Z2 ^ z12);
                    c51Var.setOnClickListener(new ira(this, b6, b4));
                }
                str4 = null;
                z11 = true;
                tL_textWithEntities5 = tL_textWithEntities4;
                z19 = z2;
                z13 = z;
                z14 = z8;
                z15 = z9;
                if (this.j3) {
                }
                if (starGift2 != null) {
                }
                if (starGift2 == null) {
                }
                p66 p66Var222 = this.c2;
                if (z13) {
                }
                p66Var = this.e2;
                if (z16) {
                }
                if (z3) {
                }
                p66Var.setVisibility(8);
                if (this.Z2) {
                }
                this.o1.setTitle(this.Q2);
                D2();
            }
            suaVar.i(0, ob6.M0(2131749888, null), null, j2(starGift));
        }
        z9 = z6;
        starGift2 = starGift;
        tL_textWithEntities3 = tL_textWithEntities;
        hjbVar = this.d2;
        hjbVar.removeAllViews();
        if (peer2 == null) {
        }
        if (peer == null) {
        }
        TLRPC.User X12 = uc7.s1(this.a).X1(Long.valueOf(n));
        if (peer3 == null) {
        }
        hjbVar.g(i7, ob6.M0(2131744617, null));
        byte b52 = 14;
        if (starGift2.stars > 0) {
        }
        if (starGift2.limited) {
            nza.C0(hjbVar, this.a, starGift2, this.J0);
        }
        tL_textWithEntities4 = tL_textWithEntities3;
        if (tL_textWithEntities3 != null) {
            hjbVar.b(tL_textWithEntities4.text, tL_textWithEntities4.entities);
        }
        if (z8) {
        }
        if (this.m2) {
        }
        if (starGift2 instanceof TL_stars.TL_starGift) {
        }
        str4 = null;
        z11 = true;
        c51Var.setFilled(true);
        c51Var.i(ob6.M0(2131747558, null), !this.Z2, true);
        c51Var.g(null, !this.Z2);
        c51Var.setOnClickListener(new hra(this, (byte) 15));
        tL_textWithEntities5 = tL_textWithEntities4;
        z19 = z2;
        z13 = z;
        z14 = z8;
        z15 = z9;
        if (this.j3) {
        }
        if (starGift2 != null) {
        }
        if (starGift2 == null) {
        }
        p66 p66Var2222 = this.c2;
        if (z13) {
        }
        p66Var = this.e2;
        if (z16) {
        }
        if (z3) {
        }
        p66Var.setVisibility(8);
        if (this.Z2) {
        }
        this.o1.setTitle(this.Q2);
        D2();
    }

    public final void n2(String str, TL_stars.TL_starGiftUnique tL_starGiftUnique, bxa bxaVar) {
        float f;
        iua iuaVar;
        TL_stars.TL_starGiftUnique tL_starGiftUnique2;
        this.D2 = str;
        this.E2 = tL_starGiftUnique;
        this.B2 = bxaVar;
        byte b = 1;
        byte b2 = 0;
        this.F2 = (this.d3 != null || tL_starGiftUnique.resell_amount == null || G1(this.a, wf3.n(tL_starGiftUnique.owner_id)) || E1(this.a, tL_starGiftUnique) || I1(tL_starGiftUnique)) ? false : true;
        if (!this.L2 && (iuaVar = this.K2) != null && iuaVar.o && (tL_starGiftUnique2 = iuaVar.l) != null && tL_starGiftUnique2.id != tL_starGiftUnique.id) {
            iuaVar.a();
            this.K2 = null;
            sua suaVar = this.a2;
            suaVar.b.setAlpha(1.0f);
            suaVar.c.setAlpha(0.0f);
        }
        this.Z1.b(this.a, this.A2);
        p2(tL_starGiftUnique, false, null, null);
        String str2 = tL_starGiftUnique.owner_address;
        String str3 = tL_starGiftUnique.gift_address;
        boolean z = tL_starGiftUnique.host_id != null;
        TL_wallet.walletTransaction wallettransaction = this.d3;
        p66 p66Var = this.c2;
        if (wallettransaction != null || !z || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            f = 0.66f;
            p66Var.setVisibility(8);
        } else {
            f = 0.66f;
            p66Var.setText(hl.E2(hl.N2(ob6.M0(2131750140, null), -1, 0, new tra(this, str3, b2), null), true, hl.L(2.6666667f), hl.L(0.66f)));
            p66Var.setVisibility(0);
            yob.X(p66Var, aob.q5, this.J0);
        }
        TL_wallet.walletTransaction wallettransaction2 = this.d3;
        p66 p66Var2 = this.e2;
        if (wallettransaction2 != null || z || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            p66Var2.setVisibility(8);
        } else {
            p66Var2.setText(hl.E2(hl.N2(ob6.M0(2131750140, null), -1, 0, new tra(this, str3, b), null), true, hl.L(2.6666667f), hl.L(f)));
            p66Var2.setVisibility(0);
        }
        E2();
        if (this.F2) {
            q2(tL_starGiftUnique);
            this.f2.setOnClickListener(new hra(this, (byte) 12));
        }
        if (this.Z2) {
            A2(0, false, null);
            this.m1.m0(1);
            this.Z2 = false;
        }
        D2();
    }

    @Override // nx0
    public final void o0() {
        kg5 kg5Var = this.w3;
        if (kg5Var != null) {
            kg5Var.f(true);
            this.w3 = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02ef A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03af A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03ee A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x047a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0314  */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v26, types: [gjb[], wm2[], y41[]] */
    /* JADX WARN: Type inference failed for: r12v35 */
    /* JADX WARN: Type inference failed for: r13v47 */
    /* JADX WARN: Type inference failed for: r13v53, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v54 */
    /* JADX WARN: Type inference failed for: r13v56 */
    /* JADX WARN: Type inference failed for: r2v8, types: [android.view.ViewGroup, hjb] */
    /* JADX WARN: Type inference failed for: r33v0 */
    /* JADX WARN: Type inference failed for: r34v0, types: [nx0, ny0, wua] */
    /* JADX WARN: Type inference failed for: r6v15, types: [android.view.View, c51] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o2(TL_stars.SavedStarGift savedStarGift, bxa bxaVar) {
        long j;
        int i;
        String M0;
        int i2;
        CharSequence charSequence;
        String str;
        String a0;
        int i3;
        boolean z;
        byte b;
        SpannableStringBuilder spannableStringBuilder;
        TL_stars.StarGift starGift;
        ?? r12;
        SpannableString spannableString;
        TL_stars.StarGift starGift2;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        boolean z2;
        ?? r6;
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
        ?? r13;
        boolean z5;
        iua iuaVar;
        if (savedStarGift == null) {
            return;
        }
        int i6 = this.a;
        long j2 = this.S1;
        this.z2 = G1(i6, j2);
        this.A2 = savedStarGift;
        this.B2 = bxaVar;
        this.C2 = null;
        boolean z6 = this.L2;
        sua suaVar = this.a2;
        if (!z6 && (iuaVar = this.K2) != null && iuaVar.o && iuaVar.l != null) {
            iuaVar.a();
            this.K2 = null;
            suaVar.b.setVisibility(0);
            suaVar.c.setVisibility(4);
        }
        this.Z1.b(this.a, savedStarGift);
        String s = wf3.s(j2);
        long n = wf3.n(savedStarGift.from_id);
        boolean v = lbc.v(uc7.s1(this.a).X1(Long.valueOf(n)));
        int g = ((int) uc7.s1(this.a).k4.D3.g(TimeUnit.SECONDS)) - (ConnectionsManager.getInstance(this.a).getCurrentTime() - savedStarGift.date);
        long e = yac.h(this.a).e();
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
            p2((TL_stars.TL_starGiftUnique) starGift5, z8, !savedStarGift.name_hidden ? uc7.s1(this.a).b2(wf3.n(savedStarGift.from_id)) : null, savedStarGift.message);
            i = i7;
        } else {
            boolean z9 = this.z2 && e == n && i7 >= 0;
            boolean J1 = J1(this.a, B1());
            w1();
            suaVar.f(starGift5, false, false, J1);
            suaVar.setShowOptions(h1());
            ?? r2 = this.d2;
            r2.removeAllViews();
            ?? r33 = "";
            if (z9) {
                if (savedStarGift.gift_num == 0 || (starGift4 = savedStarGift.gift) == null || starGift4.title == null) {
                    j = e;
                    str4 = null;
                    M03 = ob6.M0(2131749886, null);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(savedStarGift.gift.title);
                    sb.append(" #");
                    j = e;
                    M03 = qu6.m(savedStarGift.gift_num, ',', sb);
                    str4 = null;
                }
                this.Q2 = M03;
                CharSequence charSequence3 = str4;
                if (!z8) {
                    if (savedStarGift.can_upgrade) {
                        charSequence3 = hl.S2(ob6.M0(2131749943, str4));
                    } else {
                        long j3 = savedStarGift.convert_stars;
                        charSequence3 = j3 > 0 ? hl.S2(ob6.H(',', "Gift2SelfInfoConvert", (int) j3)) : hl.S2(ob6.M0(2131749950, null));
                    }
                }
                suaVar.i(0, M03, charSequence3, j2(savedStarGift.gift));
            } else {
                j = e;
                if (!z7 || this.z2) {
                    boolean z10 = this.z2;
                    if (!z10 || savedStarGift.can_upgrade) {
                        i = i7;
                        if (savedStarGift.upgrade_stars > 0) {
                            String M04 = ob6.M0(z10 ? 2131749887 : 2131749888, null);
                            this.Q2 = M04;
                            suaVar.i(0, M04, z8 ? null : this.z2 ? ob6.M0(2131750107, null) : null, j2(savedStarGift.gift));
                            if (j == n || z7) {
                                this.d2.m(ob6.M0(2131750152, null), this.a, n, new lra(this, n, (byte) 11), (n != j || n == 2666000 || v || lbc.z(uc7.s1(this.a).X1(Long.valueOf(n))) || z7) ? null : ob6.M0(2131750243, null), new lra(this, n, (byte) 12));
                            }
                            r2.f(ob6.M0(2131744617, null), ob6.a0(null, null, 2131742414, ob6.D0().r0().format(new Date(savedStarGift.date * 1000)), ob6.D0().o0().format(new Date(savedStarGift.date * 1000))), null, null);
                            String M05 = ob6.M0(2131749793, null);
                            String concat = "⭐️ ".concat(ob6.E(savedStarGift.gift.stars + savedStarGift.upgrade_stars, ','));
                            if (f1() || z8) {
                                r12 = 0;
                                spannableString = r33;
                            } else {
                                r12 = 0;
                                spannableString = z41.b(ob6.H(',', "Gift2ButtonSell", (int) savedStarGift.convert_stars), new jra(this, (byte) 14), this.J0, null);
                            }
                            r2.f(M05, nza.b1(false, TextUtils.concat(concat, " ", spannableString), 0.8f, r12), r12, r12);
                            starGift2 = savedStarGift.gift;
                            if (starGift2.limited && !z8) {
                                nza.C0(r2, this.a, starGift2, this.J0);
                            }
                            tL_textWithEntities = savedStarGift.message;
                            if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text) && !z8) {
                                TLRPC.TL_textWithEntities tL_textWithEntities3 = savedStarGift.message;
                                r2.b(tL_textWithEntities3.text, tL_textWithEntities3.entities);
                            }
                            z2 = this.z2;
                            r6 = this.f2;
                            if (!z2 && savedStarGift.can_upgrade) {
                                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("^  ");
                                wm2 wm2Var = this.Y2;
                                if (wm2Var == null) {
                                    i5 = 0;
                                    wm2Var = new wm2(0, new tua(r6, aob.v0(aob.Fi, this.J0)));
                                    this.Y2 = wm2Var;
                                } else {
                                    i5 = 0;
                                }
                                spannableStringBuilder2.setSpan(wm2Var, i5, 1, 33);
                                if (savedStarGift.upgrade_stars > 0) {
                                    charSequence2 = null;
                                    M02 = ob6.M0(2131749821, null);
                                } else {
                                    charSequence2 = null;
                                    M02 = ob6.M0(2131749820, null);
                                }
                                spannableStringBuilder2.append((CharSequence) M02);
                                r6.setFilled(true);
                                r6.i(spannableStringBuilder2, !this.Z2, true);
                                r6.g(charSequence2, !this.Z2);
                                r6.setOnClickListener(new hra(this, (byte) 29));
                            } else if (!this.m2 && z2 && this.U1 != null && this.B2 != null && x1() >= 0 && this.B2.b(x1()) >= 0) {
                                r6.setFilled(false);
                                int b2 = this.B2.b(x1());
                                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                                spannableStringBuilder3.append((CharSequence) ob6.M0(2131749801, null));
                                Object obj = this.B2.get(b2);
                                if (!(obj instanceof TL_stars.SavedStarGift) || (starGift3 = ((TL_stars.SavedStarGift) obj).gift) == null || (document = starGift3.getDocument()) == null) {
                                    z3 = true;
                                } else {
                                    spannableStringBuilder3.append((CharSequence) " e");
                                    z3 = true;
                                    spannableStringBuilder3.setSpan(new hm(document, r6.getTextPaint().getFontMetricsInt()), spannableStringBuilder3.length() - 1, spannableStringBuilder3.length(), 33);
                                }
                                r6.i(spannableStringBuilder3, this.Z2 ^ z3, z3);
                                r6.g(null, this.Z2 ^ z3);
                                r6.setOnClickListener(new ira(this, b2, (byte) 3));
                            } else if ((savedStarGift.gift instanceof TL_stars.TL_starGift) || TextUtils.isEmpty(savedStarGift.prepaid_upgrade_hash)) {
                                r6.setFilled(true);
                                r6.i(ob6.M0(2131747558, null), !this.Z2, true);
                                r6.g(null, !this.Z2);
                                r6.setOnClickListener(new ysa(this, (byte) 1));
                            } else {
                                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder("^  ");
                                wm2 wm2Var2 = this.Y2;
                                if (wm2Var2 == null) {
                                    i4 = 0;
                                    wm2Var2 = new wm2(0, new tua(r6, aob.v0(aob.Fi, this.J0)));
                                    this.Y2 = wm2Var2;
                                } else {
                                    i4 = 0;
                                }
                                spannableStringBuilder4.setSpan(wm2Var2, i4, 1, 33);
                                spannableStringBuilder4.append((CharSequence) ob6.M0(2131750150, null));
                                r6.setFilled(true);
                                r6.i(spannableStringBuilder4, !this.Z2, true);
                                r6.g(null, !this.Z2);
                                r6.setOnClickListener(new ysa(this, (byte) 0));
                            }
                            str2 = null;
                            str3 = null;
                            z4 = false;
                        }
                    } else {
                        i = i7;
                    }
                    if (savedStarGift.gift_num == 0 || (starGift = savedStarGift.gift) == null || starGift.title == null) {
                        M0 = ob6.M0(z10 ? 2131749887 : 2131749888, null);
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(savedStarGift.gift.title);
                        sb2.append(" #");
                        M0 = qu6.m(savedStarGift.gift_num, ',', sb2);
                    }
                    this.Q2 = M0;
                    if (z8 || !this.z2) {
                        i2 = 0;
                        charSequence = null;
                    } else {
                        if (!v && f1()) {
                            if (this.z2) {
                                a0 = ob6.H(',', g <= 0 ? z7 ? "Gift2Info2ChannelExpired" : "Gift2Info2Expired" : z7 ? "Gift2Info3Channel" : "Gift2Info3", (int) savedStarGift.convert_stars);
                            } else {
                                a0 = ob6.K("Gift2Info2Out", (int) savedStarGift.convert_stars, ',', s);
                            }
                            str = null;
                        } else if (this.z2) {
                            if (savedStarGift.unsaved) {
                                i3 = z7 ? 2131750132 : 2131750137;
                                str = null;
                            } else {
                                str = null;
                                i3 = z7 ? 2131750131 : 2131750136;
                            }
                            a0 = ob6.M0(i3, str);
                        } else {
                            str = null;
                            a0 = ob6.a0(null, null, (!savedStarGift.can_upgrade || savedStarGift.upgrade_stars <= 0) ? 2131750125 : 2131750124, s);
                        }
                        SpannableStringBuilder S2 = hl.S2(a0);
                        if (v || !f1()) {
                            z = true;
                            b = 2;
                            spannableStringBuilder = r33;
                        } else {
                            b = 2;
                            z = true;
                            spannableStringBuilder = hl.D2(hl.P2(ob6.M0(2131750069, str).replace(' ', (char) 160), new ssa(this, b)), true);
                        }
                        boolean z11 = z;
                        byte b3 = b;
                        CharSequence[] charSequenceArr = new CharSequence[3];
                        i2 = 0;
                        charSequenceArr[0] = S2;
                        charSequenceArr[z11 ? 1 : 0] = " ";
                        charSequenceArr[b3] = spannableStringBuilder;
                        charSequence = TextUtils.concat(charSequenceArr);
                    }
                    suaVar.i(i2, M0, charSequence, j2(savedStarGift.gift));
                    if (j == n) {
                    }
                    this.d2.m(ob6.M0(2131750152, null), this.a, n, new lra(this, n, (byte) 11), (n != j || n == 2666000 || v || lbc.z(uc7.s1(this.a).X1(Long.valueOf(n))) || z7) ? null : ob6.M0(2131750243, null), new lra(this, n, (byte) 12));
                    r2.f(ob6.M0(2131744617, null), ob6.a0(null, null, 2131742414, ob6.D0().r0().format(new Date(savedStarGift.date * 1000)), ob6.D0().o0().format(new Date(savedStarGift.date * 1000))), null, null);
                    String M052 = ob6.M0(2131749793, null);
                    String concat2 = "⭐️ ".concat(ob6.E(savedStarGift.gift.stars + savedStarGift.upgrade_stars, ','));
                    if (f1()) {
                    }
                    r12 = 0;
                    spannableString = r33;
                    r2.f(M052, nza.b1(false, TextUtils.concat(concat2, " ", spannableString), 0.8f, r12), r12, r12);
                    starGift2 = savedStarGift.gift;
                    if (starGift2.limited) {
                        nza.C0(r2, this.a, starGift2, this.J0);
                    }
                    tL_textWithEntities = savedStarGift.message;
                    if (tL_textWithEntities != null) {
                        TLRPC.TL_textWithEntities tL_textWithEntities32 = savedStarGift.message;
                        r2.b(tL_textWithEntities32.text, tL_textWithEntities32.entities);
                    }
                    z2 = this.z2;
                    r6 = this.f2;
                    if (!z2) {
                    }
                    if (!this.m2) {
                    }
                    if (savedStarGift.gift instanceof TL_stars.TL_starGift) {
                    }
                    r6.setFilled(true);
                    r6.i(ob6.M0(2131747558, null), !this.Z2, true);
                    r6.g(null, !this.Z2);
                    r6.setOnClickListener(new ysa(this, (byte) 1));
                    str2 = null;
                    str3 = null;
                    z4 = false;
                } else {
                    String M06 = ob6.M0(2131749888, null);
                    this.Q2 = M06;
                    suaVar.i(0, M06, null, i2(savedStarGift.gift.released_by));
                }
            }
            i = i7;
            if (j == n) {
            }
            this.d2.m(ob6.M0(2131750152, null), this.a, n, new lra(this, n, (byte) 11), (n != j || n == 2666000 || v || lbc.z(uc7.s1(this.a).X1(Long.valueOf(n))) || z7) ? null : ob6.M0(2131750243, null), new lra(this, n, (byte) 12));
            r2.f(ob6.M0(2131744617, null), ob6.a0(null, null, 2131742414, ob6.D0().r0().format(new Date(savedStarGift.date * 1000)), ob6.D0().o0().format(new Date(savedStarGift.date * 1000))), null, null);
            String M0522 = ob6.M0(2131749793, null);
            String concat22 = "⭐️ ".concat(ob6.E(savedStarGift.gift.stars + savedStarGift.upgrade_stars, ','));
            if (f1()) {
            }
            r12 = 0;
            spannableString = r33;
            r2.f(M0522, nza.b1(false, TextUtils.concat(concat22, " ", spannableString), 0.8f, r12), r12, r12);
            starGift2 = savedStarGift.gift;
            if (starGift2.limited) {
            }
            tL_textWithEntities = savedStarGift.message;
            if (tL_textWithEntities != null) {
            }
            z2 = this.z2;
            r6 = this.f2;
            if (!z2) {
            }
            if (!this.m2) {
            }
            if (savedStarGift.gift instanceof TL_stars.TL_starGift) {
            }
            r6.setFilled(true);
            r6.i(ob6.M0(2131747558, null), !this.Z2, true);
            r6.g(null, !this.Z2);
            r6.setOnClickListener(new ysa(this, (byte) 1));
            str2 = null;
            str3 = null;
            z4 = false;
        }
        boolean z12 = savedStarGift.refunded;
        byte b4 = 8;
        p66 p66Var = this.c2;
        if (z12) {
            p66Var.setVisibility(0);
            p66Var.setText(ob6.M0(2131750003, null));
            f = 0.66f;
            yob.X(p66Var, aob.q7, this.J0);
            f2 = 2.6666667f;
        } else {
            f = 0.66f;
            if (!z4 || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
                f2 = 2.6666667f;
                if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3) && this.z2 && (savedStarGift.gift instanceof TL_stars.TL_starGift) && savedStarGift.name_hidden) {
                    p66Var.setVisibility(0);
                    p66Var.setText(ob6.M0((tL_textWithEntities2 == null || TextUtils.isEmpty(tL_textWithEntities2.text)) ? 2131750139 : 2131750138, null));
                    yob.X(p66Var, aob.q5, this.J0);
                } else {
                    p66Var.setVisibility(8);
                }
            } else {
                f2 = 2.6666667f;
                p66Var.setText(hl.E2(hl.N2(ob6.M0(2131750140, null), -1, 0, new tra(this, str3, (byte) 7), null), true, hl.L(2.6666667f), hl.L(0.66f)));
                p66Var.setVisibility(0);
                yob.X(p66Var, aob.q5, this.J0);
            }
        }
        p66 p66Var2 = this.e2;
        if (!z4 && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            r13 = 0;
            p66Var2.setText(hl.E2(hl.N2(ob6.M0(2131750140, null), -1, 0, new tra(this, str3, b4), null), true, hl.L(f2), hl.L(f)));
            p66Var2.setVisibility(0);
        } else if (this.z2 && G1(this.a, j2)) {
            if (i >= 0) {
                SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                if (savedStarGift.unsaved) {
                    spannableStringBuilder5.append((CharSequence) ". ");
                    spannableStringBuilder5.setSpan(new wm2(R.drawable.mini_gift_hidden, 0), 0, 1, 33);
                }
                spannableStringBuilder5.append((CharSequence) hl.N2(ob6.M0(!savedStarGift.unsaved ? 2131750013 : 2131750016, null), -1, 0, new jra(this, (byte) 12), null));
                p66Var2.setText(hl.E2(spannableStringBuilder5, true, hl.L(f2), hl.L(f)));
                z5 = false;
            } else {
                z5 = false;
                p66Var2.setText(hl.E2(hl.N2(ob6.M0(!savedStarGift.unsaved ? 2131750212 : 2131750213, null), -1, 0, new jra(this, (byte) 12), null), true, hl.L(f2), hl.L(f)));
            }
            p66Var2.setVisibility(z5 ? 1 : 0);
            r13 = z5;
        } else {
            r13 = 0;
            p66Var2.setVisibility(8);
        }
        if (this.Z2) {
            A2(r13, r13, null);
            this.m1.m0(1);
            this.Z2 = r13;
        }
        this.o1.setTitle(this.Q2);
        D2();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        jn7.f(this.a).b(this, jn7.I3);
        jn7.f(this.a).b(this, jn7.d4);
    }

    @Override // nx0, android.app.Dialog
    public final void onBackPressed() {
        sua suaVar;
        vta vtaVar;
        if (this.W2.c(4) && (suaVar = this.a2) != null && (vtaVar = suaVar.N) != null) {
            if (vtaVar.i0) {
                return;
            }
            if (vtaVar.j0) {
                super.onBackPressed();
                return;
            }
        }
        if (this.v2 || this.W2.b <= 0 || this.f2.R || this.l3) {
            super.onBackPressed();
            return;
        }
        r47 r47Var = this.C2;
        if (r47Var != null) {
            m2(r47Var, null);
        } else {
            TL_stars.SavedStarGift savedStarGift = this.A2;
            if (savedStarGift != null) {
                o2(savedStarGift, this.B2);
            } else {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = this.E2;
                if (tL_starGiftUnique != null) {
                    n2(this.D2, tL_starGiftUnique, this.B2);
                }
            }
        }
        A2(0, true, null);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jn7.f(this.a).n(this, jn7.I3);
        jn7.f(this.a).n(this, jn7.d4);
    }

    @Override // nx0
    public final void p0() {
        super.p0();
        try {
            L(aob.h5);
            sua suaVar = this.a2;
            if (suaVar != null) {
                suaVar.l();
            }
            wm2 wm2Var = this.Y2;
            if (wm2Var != null) {
                Drawable drawable = wm2Var.c;
                if (drawable instanceof tua) {
                    ((tua) drawable).d.setColor(aob.v0(aob.Fi, this.J0));
                    c51 c51Var = this.f2;
                    if (c51Var != null) {
                        c51Var.invalidate();
                    }
                }
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:369:0x05c8, code lost:
    
        if (((org.telegram.tgnet.TLRPC.TL_messageActionStarGiftUnique) r4).drop_original_details_stars >= 0) goto L202;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x05aa  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x06bf  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0a25  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0b62  */
    /* JADX WARN: Removed duplicated region for block: B:294:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0a35  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0a53  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0a17  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x06b9  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x021e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0274  */
    /* JADX WARN: Type inference failed for: r10v68 */
    /* JADX WARN: Type inference failed for: r10v69 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v72 */
    /* JADX WARN: Type inference failed for: r10v8, types: [gjb[], java.lang.String, y41[]] */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [gjb[], java.lang.String, y41[]] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23, types: [gjb[], java.lang.String, y41[]] */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v54, types: [gjb[], java.lang.String, y41[]] */
    /* JADX WARN: Type inference failed for: r11v56, types: [gjb[], java.lang.String, y41[]] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v33 */
    /* JADX WARN: Type inference failed for: r12v34 */
    /* JADX WARN: Type inference failed for: r12v36 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v34 */
    /* JADX WARN: Type inference failed for: r14v35 */
    /* JADX WARN: Type inference failed for: r14v36 */
    /* JADX WARN: Type inference failed for: r14v4, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p2(TL_stars.TL_starGiftUnique tL_starGiftUnique, boolean z, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        final byte b;
        CharSequence charSequence;
        CharSequence charSequence2;
        String M0;
        Spannable spannable;
        ?? r12;
        ?? r10;
        int i;
        ?? r14;
        TL_stars.starGiftAttributeOriginalDetails stargiftattributeoriginaldetails;
        float f;
        sua suaVar;
        Class cls;
        Class cls2;
        Class cls3;
        iua iuaVar;
        TL_stars.TL_starGiftUnique tL_starGiftUnique2;
        boolean z2;
        TL_stars.StarGift starGift;
        TLRPC.Document document;
        iua iuaVar2;
        boolean z3;
        ?? r11;
        int i2;
        ?? r112;
        int i3;
        Object obj;
        Object obj2;
        int i4;
        CharSequence V;
        TLRPC.Message message;
        r47 r47Var;
        byte b2;
        String str;
        final byte b3;
        int i5;
        TL_wallet.nftItem nftitem;
        String str2;
        TL_wallet.nftItem nftitem2;
        String str3;
        vsc vscVar;
        iua iuaVar3;
        TL_stars.TL_starGiftUnique tL_starGiftUnique3;
        long n = wf3.n(tL_starGiftUnique.owner_id);
        long n2 = wf3.n(tL_starGiftUnique.host_id);
        StringBuilder sb = new StringBuilder();
        sb.append(tL_starGiftUnique.title);
        sb.append(" #");
        this.Q2 = qu6.m(tL_starGiftUnique.num, ',', sb);
        boolean z4 = this.L2;
        sua suaVar2 = this.a2;
        if (!z4 && (iuaVar3 = this.K2) != null && iuaVar3.o && (tL_starGiftUnique3 = iuaVar3.l) != null && tL_starGiftUnique3.id != tL_starGiftUnique.id) {
            iuaVar3.a();
            this.K2 = null;
            suaVar2.b.setAlpha(1.0f);
            suaVar2.c.setAlpha(0.0f);
        } else if (z4 && this.K2 == null) {
            this.K2 = new iua(suaVar2);
        }
        boolean z5 = this.d3 == null;
        suaVar2.setInWallet(z5 && this.a3 == null && y2(tL_starGiftUnique));
        TextPaint textPaint = suaVar2.H;
        boolean z6 = z5 && H1(this.a, n);
        boolean z7 = z5 && H1(this.a, n2);
        boolean J1 = J1(this.a, B1());
        w1();
        suaVar2.f(tL_starGiftUnique, z6, z7, J1);
        suaVar2.setShowOptions(false);
        byte b4 = 5;
        byte b5 = 4;
        byte b6 = 6;
        byte b7 = 3;
        if (this.a3 != null) {
            if (this.c3 != null) {
                suaVar2.j(new ysa(this, (byte) 3), this.b3 == null ? null : new hra(this, b7), new hra(this, b5), true);
                eqc eqcVar = this.c3;
                wsc wscVar = eqcVar.b.k0;
                suaVar2.setWalletCard((wscVar == null || (nftitem2 = eqcVar.a) == null || (str3 = nftitem2.address) == null || (vscVar = (vsc) wscVar.f.get(str3)) == null || !vscVar.b()) ? false : true);
            } else {
                suaVar2.j(new hra(this, b4), this.b3 == null ? null : new hra(this, b6), new hra(this, (byte) 7), tL_starGiftUnique.host_id != null);
            }
            dqc dqcVar = this.b3;
            if (dqcVar != null) {
                i5 = ((e) dqcVar.c).currentAccount;
                boolean F = wsc.F(i5, dqcVar.a.slug);
                dqc dqcVar2 = this.b3;
                wsc wscVar2 = dqcVar2.c.k0;
                boolean z8 = (wscVar2 == null || (nftitem = dqcVar2.b) == null || (str2 = nftitem.address) == null || !str2.equals(wscVar2.Q0)) ? false : true;
                iy9 iy9Var = suaVar2.K;
                iy9Var.a(R.drawable.filled_card_color, ob6.M0(z8 ? 2131742753 : 2131742759, null), false);
                iy9Var.setAlpha((F || z8) ? 1.0f : 0.5f);
            }
        }
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) jxa.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) tL_starGiftUnique.title);
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) "#".concat(ob6.E(tL_starGiftUnique.num, ',')));
        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.85f), length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(new sk((byte) 2, jn7.T2, false), length, spannableStringBuilder.length(), 33);
        TL_wallet.walletTransaction wallettransaction = this.d3;
        if (wallettransaction == null || jt7.c(wallettransaction) == null) {
            TL_wallet.walletTransaction wallettransaction2 = this.d3;
            if (wallettransaction2 != null) {
                M0 = ob6.M0(wallettransaction2.incoming ? 2131742725 : 2131742724, null);
            } else {
                if (tLObject != null) {
                    b = 1;
                    charSequence2 = hl.S2(ob6.a0(null, null, 2131743537, wf3.t(tLObject)));
                } else {
                    b = 1;
                    if (tL_starGiftUnique.released_by != null || stargiftattributemodel == null) {
                        charSequence = null;
                        if (tL_textWithEntities != null || textPaint == null) {
                            spannable = null;
                        } else {
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(tL_textWithEntities.text);
                            r47.b(spannableStringBuilder2, tL_textWithEntities.entities, false, false, false, false, 0);
                            spannable = r47.A5(pv3.m(spannableStringBuilder2, textPaint.getFontMetricsInt(), false, null, 0), tL_textWithEntities.entities, textPaint.getFontMetricsInt(), false);
                        }
                        suaVar2.h(0, spannableStringBuilder, charSequence, i2(tL_starGiftUnique.released_by), null, tLObject, spannable);
                        this.h3 = null;
                        hjb hjbVar = this.d2;
                        hjbVar.removeAllViews();
                        if (z) {
                            r12 = b;
                            r10 = 0;
                            i = 33;
                            r14 = 0;
                        } else {
                            TLRPC.Peer peer = tL_starGiftUnique.host_id;
                            String str4 = tL_starGiftUnique.owner_address;
                            if (peer != null) {
                                if (TextUtils.isEmpty(str4)) {
                                    str = null;
                                    b3 = 0;
                                } else {
                                    final String str5 = tL_starGiftUnique.owner_address;
                                    str = null;
                                    b3 = 0;
                                    Z0(hjbVar, ob6.M0(2131750141, null), str5, this.J0).setOnClickListener(new View.OnClickListener(this) { // from class: kra
                                        public final /* synthetic */ wua b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            byte b8 = b3;
                                            String str6 = str5;
                                            wua wuaVar = this.b;
                                            switch (b8) {
                                                case 0:
                                                    hl.g(str6);
                                                    wuaVar.j().Q(R.raw.copy, 36, ob6.M0(2131742853, null)).k(false);
                                                    break;
                                                case 1:
                                                    hl.g(str6);
                                                    wuaVar.j().Q(R.raw.copy, 36, ob6.M0(2131742853, null)).k(false);
                                                    break;
                                                default:
                                                    hl.g(str6);
                                                    wuaVar.j().Q(R.raw.copy, 36, ob6.M0(2131742853, null)).k(false);
                                                    break;
                                            }
                                        }
                                    });
                                }
                                if (n2 != 0) {
                                    b2 = b3;
                                    this.h3 = ((ejb) this.d2.o(ob6.M0(2131750142, str), this.a, n2, new lra(this, n2, b3)).getChildAt(b)).getChildAt(b2);
                                    r14 = b2;
                                    r10 = str;
                                    r12 = b;
                                    i = 33;
                                } else {
                                    r12 = b;
                                    r14 = b3;
                                    i = 33;
                                    r10 = str;
                                }
                            } else {
                                b2 = 0;
                                str = null;
                                if (!TextUtils.isEmpty(str4)) {
                                    final String str6 = tL_starGiftUnique.owner_address;
                                    Z0(hjbVar, ob6.M0(2131750044, null), str6, this.J0).setOnClickListener(new View.OnClickListener(this) { // from class: kra
                                        public final /* synthetic */ wua b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            byte b8 = b;
                                            String str62 = str6;
                                            wua wuaVar = this.b;
                                            switch (b8) {
                                                case 0:
                                                    hl.g(str62);
                                                    wuaVar.j().Q(R.raw.copy, 36, ob6.M0(2131742853, null)).k(false);
                                                    break;
                                                case 1:
                                                    hl.g(str62);
                                                    wuaVar.j().Q(R.raw.copy, 36, ob6.M0(2131742853, null)).k(false);
                                                    break;
                                                default:
                                                    hl.g(str62);
                                                    wuaVar.j().Q(R.raw.copy, 36, ob6.M0(2131742853, null)).k(false);
                                                    break;
                                            }
                                        }
                                    });
                                } else if (n != 0) {
                                    r10 = 0;
                                    r14 = 0;
                                    i = 33;
                                    byte b8 = b;
                                    this.h3 = ((ejb) this.d2.o(ob6.M0(2131750044, null), this.a, n, new lra(this, n, b)).getChildAt(b8 == true ? 1 : 0)).getChildAt(0);
                                    r12 = b8;
                                } else if (tL_starGiftUnique.owner_name != null) {
                                    hjbVar.f(ob6.M0(2131750044, null), tL_starGiftUnique.owner_name, null, null);
                                }
                                r14 = b2;
                                r10 = str;
                                r12 = b;
                                i = 33;
                            }
                        }
                        b1(jxa.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class));
                        b1(jxa.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
                        b1(jxa.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
                        if (!z) {
                            if (this.C2 == null) {
                                ?? r113 = r10;
                                hjbVar.f(ob6.M0(2131750012, r113), ob6.H(',', "Gift2QuantityIssued1", tL_starGiftUnique.availability_issued).concat(ob6.H(',', "Gift2QuantityIssued2", tL_starGiftUnique.availability_total)), r113, r113);
                            } else if (this.H2) {
                                ?? r114 = r10;
                                hjbVar.f(ob6.M0(2131750012, r114), ob6.H(',', "Gift2QuantityIssued1", tL_starGiftUnique.availability_issued).concat(ob6.H(',', "Gift2QuantityIssued2", tL_starGiftUnique.availability_total)), r114, r114);
                            } else {
                                TextView textView = (TextView) ((ejb) hjbVar.f(ob6.M0(2131750012, r10), "", r10, r10).getChildAt(r12)).getChildAt(r14);
                                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("x ");
                                ya6 ya6Var = new ya6(textView, hl.L(90.0f), r14, this.J0);
                                int i6 = aob.G6;
                                ya6Var.a(aob.p1(0.21f, aob.v0(i6, this.J0)), aob.p1(0.08f, aob.v0(i6, this.J0)));
                                spannableStringBuilder3.setSpan(ya6Var, r14, r12, i);
                                textView.setText(spannableStringBuilder3, TextView.BufferType.SPANNABLE);
                                if (!this.G2 && !this.H2 && (r47Var = this.C2) != null) {
                                    this.G2 = r12;
                                    int e1 = r47Var.e1();
                                    TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                                    tL_messages_getMessages.id.add(Integer.valueOf(e1));
                                    ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_getMessages, new b22(this, e1, (byte) 5));
                                }
                            }
                            if (!TextUtils.isEmpty(tL_starGiftUnique.slug) && (tL_starGiftUnique.flags & 256) != 0) {
                                di0.h();
                                this.d2.e(ob6.M0(2131749362, null), c00.i("~", di0.f(tL_starGiftUnique.value_currency, di0.h().g(tL_starGiftUnique.value_currency), tL_starGiftUnique.value_amount, r12)), ob6.M0(2131749361, null), new jr9((Object) this, (Object) tL_starGiftUnique, (Object) di0.h().e(tL_starGiftUnique.value_amount, tL_starGiftUnique.value_currency), (byte) 27), null);
                            }
                        }
                        stargiftattributeoriginaldetails = (TL_stars.starGiftAttributeOriginalDetails) jxa.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeOriginalDetails.class);
                        if (stargiftattributeoriginaldetails != null) {
                            if ((stargiftattributeoriginaldetails.flags & r12) != 0) {
                                long n3 = wf3.n(stargiftattributeoriginaldetails.sender_id);
                                SpannableString spannableString = new SpannableString(wf3.k(yac.t0, n3));
                                spannableString.setSpan(new dta(this, n3), r14, spannableString.length(), i);
                                obj = spannableString;
                            } else {
                                obj = null;
                            }
                            long n4 = wf3.n(stargiftattributeoriginaldetails.recipient_id);
                            f = 14.0f;
                            SpannableString spannableString2 = new SpannableString(wf3.k(yac.t0, n4));
                            spannableString2.setSpan(new eta(this, n4), r14, spannableString2.length(), i);
                            if (stargiftattributeoriginaldetails.message != null) {
                                TextPaint textPaint2 = new TextPaint((int) r12);
                                textPaint2.setTextSize(hl.L(14.0f));
                                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(stargiftattributeoriginaldetails.message.text);
                                r47.b(spannableStringBuilder4, stargiftattributeoriginaldetails.message.entities, false, false, false, false, 0);
                                obj2 = r47.A5(pv3.m(spannableStringBuilder4, textPaint2.getFontMetricsInt(), r14, null, r14), stargiftattributeoriginaldetails.message.entities, textPaint2.getFontMetricsInt(), r14);
                            } else {
                                obj2 = null;
                            }
                            boolean z9 = r12;
                            Object replaceAll = ob6.D0().B0().format(stargiftattributeoriginaldetails.date * 1000).replaceAll("\\.", "/");
                            if (stargiftattributeoriginaldetails.sender_id != stargiftattributeoriginaldetails.recipient_id) {
                                if (obj == null) {
                                    i4 = r14;
                                    if (obj2 == null) {
                                        Object[] objArr = new Object[2];
                                        objArr[i4] = spannableString2;
                                        objArr[z9 ? 1 : 0] = replaceAll;
                                        V = ob6.V(null, null, 2131750345, objArr);
                                    } else {
                                        Object[] objArr2 = new Object[3];
                                        objArr2[i4] = spannableString2;
                                        objArr2[z9 ? 1 : 0] = replaceAll;
                                        objArr2[2] = obj2;
                                        V = ob6.V(null, null, 2131750344, objArr2);
                                    }
                                } else if (obj2 == null) {
                                    Object[] objArr3 = new Object[3];
                                    objArr3[r14] = obj;
                                    objArr3[z9 ? 1 : 0] = spannableString2;
                                    objArr3[2] = replaceAll;
                                    V = ob6.V(null, null, 2131750347, objArr3);
                                } else {
                                    i4 = r14;
                                    Object[] objArr4 = new Object[4];
                                    objArr4[i4] = obj;
                                    objArr4[z9 ? 1 : 0] = spannableString2;
                                    objArr4[2] = replaceAll;
                                    objArr4[3] = obj2;
                                    V = ob6.V(null, null, 2131750346, objArr4);
                                }
                                if (G1(this.a, wf3.n(tL_starGiftUnique.owner_id))) {
                                    TL_stars.SavedStarGift savedStarGift = this.A2;
                                    if (savedStarGift == null || savedStarGift.drop_original_details_stars < 0) {
                                        r47 r47Var2 = this.C2;
                                        if (r47Var2 != null && (message = r47Var2.k) != null) {
                                            TLRPC.MessageAction messageAction = message.action;
                                            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                                            }
                                        }
                                    }
                                    LinearLayout linearLayout = new LinearLayout(getContext());
                                    linearLayout.setPadding(hl.L(12.66f), hl.L(9.33f), hl.L(12.66f), hl.L(9.33f));
                                    linearLayout.setOrientation(i4);
                                    tpa tpaVar = new tpa(getContext());
                                    yob.X(tpaVar, aob.G6, this.J0);
                                    yob.G(tpaVar, aob.Xc, this.J0);
                                    tpaVar.setTextSize(z9 ? 1 : 0, 12.0f);
                                    tpaVar.setGravity(3);
                                    tpaVar.setText(V);
                                    linearLayout.addView(tpaVar, tre.p(-1, -2, 1.0f, 19));
                                    ImageView imageView = new ImageView(getContext());
                                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                                    int i7 = aob.Fi;
                                    hf0 Y = aob.Y(aob.p1(0.1f, aob.v0(i7, this.J0)), 6, 6);
                                    uob K = yob.K(0.1f, i7);
                                    vnb vnbVar = this.J0;
                                    imageView.setBackground(Y);
                                    yob.j(imageView, Y, null, K, vnbVar);
                                    imageView.setImageResource(R.drawable.menu_delete_old);
                                    yob.s(imageView, i7, this.J0, PorterDuff.Mode.SRC_IN);
                                    iye.a(imageView);
                                    imageView.setOnClickListener(new jy8(this, V, (byte) 18));
                                    linearLayout.addView(imageView, tre.q(32, 32, 0.0f, 21, 8, 0, 0, 0));
                                    TableRow tableRow = new TableRow(getContext());
                                    TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
                                    layoutParams.span = 2;
                                    tableRow.addView(new fjb(hjbVar, linearLayout, true), layoutParams);
                                    hjbVar.addView(tableRow);
                                }
                                fjb a = hjbVar.a(V);
                                a.setFilled(z9);
                                tpa tpaVar2 = (tpa) a.getChildAt(0);
                                tpaVar2.setTextSize(z9 ? 1 : 0, 12.0f);
                                tpaVar2.setGravity(17);
                            } else if (obj2 == null) {
                                Object[] objArr5 = new Object[2];
                                objArr5[r14] = obj;
                                objArr5[z9 ? 1 : 0] = replaceAll;
                                V = ob6.V(null, null, 2131750343, objArr5);
                            } else {
                                Object[] objArr6 = new Object[3];
                                objArr6[r14] = obj;
                                objArr6[z9 ? 1 : 0] = replaceAll;
                                objArr6[2] = obj2;
                                V = ob6.V(null, null, 2131750342, objArr6);
                            }
                            i4 = r14;
                            if (G1(this.a, wf3.n(tL_starGiftUnique.owner_id))) {
                            }
                            fjb a2 = hjbVar.a(V);
                            a2.setFilled(z9);
                            tpa tpaVar22 = (tpa) a2.getChildAt(0);
                            tpaVar22.setTextSize(z9 ? 1 : 0, 12.0f);
                            tpaVar22.setGravity(17);
                        } else {
                            f = 14.0f;
                        }
                        if (this.d3 != null) {
                            this.h3 = null;
                            hjbVar.removeAllViews();
                            jt7 c = jt7.c(this.d3);
                            int i8 = c != null ? 0 : 8;
                            LinearLayout linearLayout2 = this.e3;
                            linearLayout2.setVisibility(i8);
                            if (c != null) {
                                long j = c.e;
                                int i9 = c.j;
                                byte b9 = c.a;
                                long j2 = c.g;
                                long j3 = c.f;
                                long abs = Math.abs(j);
                                suaVar = suaVar2;
                                SpannableStringBuilder u = c.u(c.s(abs, false), 0.75f);
                                if (abs != 0) {
                                    cls2 = TL_stars.starGiftAttributeBackdrop.class;
                                    u.insert(0, (CharSequence) (j > 0 ? "+" : "–"));
                                } else {
                                    cls2 = TL_stars.starGiftAttributeBackdrop.class;
                                }
                                cls = TL_stars.starGiftAttributePattern.class;
                                cls3 = TL_stars.starGiftAttributeModel.class;
                                u.setSpan(new ForegroundColorSpan(aob.v0(j > 0 ? aob.lk : aob.G6, this.J0)), 0, u.length(), 33);
                                linearLayout2.setVisibility((abs == 0 || (b9 == 9 || b9 == 4)) ? 8 : 0);
                                SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(c.p("GramCapital", u, 2131749290));
                                int indexOf = TextUtils.indexOf(spannableStringBuilder5, u);
                                int length2 = u.length() + indexOf;
                                if (indexOf > 0) {
                                    i2 = 33;
                                    spannableStringBuilder5.setSpan(new RelativeSizeSpan(0.75f), 0, indexOf, 33);
                                } else {
                                    i2 = 33;
                                }
                                if (indexOf >= 0 && length2 < spannableStringBuilder5.length()) {
                                    spannableStringBuilder5.setSpan(new RelativeSizeSpan(0.75f), length2, spannableStringBuilder5.length(), i2);
                                }
                                this.f3.setText(spannableStringBuilder5);
                                this.g3.setText(c.C(this.a).q(abs, false));
                                boolean z10 = b9 == 0 || b9 == 1 || b9 == 2;
                                if (b9 == 0 && j3 > 0 && j2 > 0) {
                                    hjbVar.f(ob6.M0(2131749494, null), it7.j(j3), null, null);
                                } else if (z10 && j3 > 0) {
                                    hjbVar.f(ob6.M0(2131749496, null), it7.j(j3), null, null);
                                }
                                if (z10 && j2 > 0) {
                                    CharSequence j4 = it7.j(j2);
                                    if (j3 > 0) {
                                        double d = (j2 * 100.0d) / j3;
                                        SpannableString spannableString3 = new SpannableString(qd4.y("(", c00.k(new StringBuilder(), Math.abs(d - ((double) Math.round(d))) < 0.05d ? String.valueOf(Math.round(d)) : String.format(Locale.US, "%.1f", Double.valueOf(d)), "%"), ")"));
                                        spannableString3.setSpan(new ho4(aob.z6, this.J0), 0, spannableString3.length(), 33);
                                        j4 = TextUtils.concat(j4, " ", spannableString3);
                                    }
                                    hjbVar.f(ob6.M0(2131749536, null), j4, null, null);
                                }
                                long j5 = this.d3.fee;
                                if (j5 != 0) {
                                    long abs2 = Math.abs(j5);
                                    StringBuilder sb2 = new StringBuilder("⭐️ ");
                                    BigDecimal movePointLeft = new BigDecimal(abs2).movePointLeft(9);
                                    sb2.append((movePointLeft.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : movePointLeft.stripTrailingZeros()).toPlainString());
                                    SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder(nza.b1(true, sb2.toString(), 0.8f, null));
                                    CharSequence q = c.C(this.a).q(abs2, true);
                                    if (!TextUtils.isEmpty(q)) {
                                        int length3 = spannableStringBuilder6.length();
                                        spannableStringBuilder6.append((CharSequence) " ~").append(q);
                                        spannableStringBuilder6.setSpan(new ho4(aob.z6, this.J0), length3, spannableStringBuilder6.length(), 33);
                                    }
                                    hjbVar.f(ob6.M0(2131749499, null), spannableStringBuilder6, null, null);
                                }
                                boolean z11 = b9 == 9;
                                if ((b9 == 3 || z11) && j3 > 0) {
                                    r112 = 0;
                                    hjbVar.f(ob6.M0(z11 ? 2131749498 : 2131749496, null), it7.j(j3), null, null);
                                } else {
                                    r112 = 0;
                                }
                                if (z11 && c.i > 0) {
                                    hjbVar.f(ob6.M0(2131749497, r112), it7.k(c.i), r112, r112);
                                }
                                if (b9 == 5 && i9 > 0) {
                                    hjbVar.f(ob6.M0(2131749500, r112), p1(i9), r112, r112);
                                }
                                if (b9 == 6 && c.k) {
                                    hjbVar.f(ob6.M0(2131749502, r112), it7.j(c.h), r112, r112);
                                }
                                final String str7 = c.l;
                                if (str7 != null && (i3 = c.m) != 0) {
                                    final byte b10 = 2;
                                    Z0(hjbVar, ob6.M0(i3, r112), str7, this.J0).setOnClickListener(new View.OnClickListener(this) { // from class: kra
                                        public final /* synthetic */ wua b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            byte b82 = b10;
                                            String str62 = str7;
                                            wua wuaVar = this.b;
                                            switch (b82) {
                                                case 0:
                                                    hl.g(str62);
                                                    wuaVar.j().Q(R.raw.copy, 36, ob6.M0(2131742853, null)).k(false);
                                                    break;
                                                case 1:
                                                    hl.g(str62);
                                                    wuaVar.j().Q(R.raw.copy, 36, ob6.M0(2131742853, null)).k(false);
                                                    break;
                                                default:
                                                    hl.g(str62);
                                                    wuaVar.j().Q(R.raw.copy, 36, ob6.M0(2131742853, null)).k(false);
                                                    break;
                                            }
                                        }
                                    });
                                }
                                if (this.d3.date != 0) {
                                    hjbVar.f(ob6.M0(2131742795, null), p1(this.d3.date), null, null);
                                }
                            } else {
                                suaVar = suaVar2;
                                cls = TL_stars.starGiftAttributePattern.class;
                                cls2 = TL_stars.starGiftAttributeBackdrop.class;
                                cls3 = TL_stars.starGiftAttributeModel.class;
                                long e = yac.h(this.a).e();
                                this.d2.n(ob6.M0(this.d3.incoming ? 2131742646 : 2131742671, null), this.a, e, new lra(this, e, (byte) 3));
                                long abs3 = Math.abs(this.d3.fee);
                                if (abs3 > 0) {
                                    TextView textView2 = new TextView(getContext());
                                    textView2.setGravity(16);
                                    textView2.setIncludeFontPadding(false);
                                    textView2.setTextSize(1, f);
                                    yob.X(textView2, aob.G6, this.J0);
                                    textView2.setText(uqc.o0(this.a, abs3, this.J0));
                                    r11 = 0;
                                    hjbVar.c(textView2, ob6.M0(2131742771, null));
                                } else {
                                    r11 = 0;
                                }
                                if (this.d3.date != 0) {
                                    hjbVar.f(ob6.M0(2131742795, r11), ob6.Q(this.d3.date), r11, r11);
                                }
                            }
                        } else {
                            suaVar = suaVar2;
                            cls = TL_stars.starGiftAttributePattern.class;
                            cls2 = TL_stars.starGiftAttributeBackdrop.class;
                            cls3 = TL_stars.starGiftAttributeModel.class;
                        }
                        iuaVar = this.K2;
                        c51 c51Var = this.f2;
                        if (iuaVar != null || !iuaVar.o) {
                            if (this.d3 != null) {
                                c51Var.setFilled(true);
                                c51Var.i(ob6.M0(2131747558, null), !this.Z2, true);
                                c51Var.g(null, !this.Z2);
                                c51Var.setOnClickListener(new ysa(this, (byte) 4));
                            } else {
                                if (!I1(tL_starGiftUnique) || !i1()) {
                                    tL_starGiftUnique2 = tL_starGiftUnique;
                                    if (!G1(this.a, wf3.n(tL_starGiftUnique2.owner_id)) && tL_starGiftUnique2.resell_amount != null && !E1(this.a, tL_starGiftUnique2)) {
                                        c51Var.setFilled(true);
                                        q2(tL_starGiftUnique);
                                        c51Var.setOnClickListener(new hra(this, (byte) 0));
                                    } else if (!this.m2 || this.U1 == null || this.B2 == null || x1() < 0 || this.B2.b(x1()) < 0) {
                                        c51Var.setFilled(true);
                                        c51Var.i(ob6.M0(2131747558, null), !this.Z2, true);
                                        c51Var.g(null, !this.Z2);
                                        c51Var.setOnClickListener(new hra(this, (byte) 1));
                                    } else {
                                        c51Var.setFilled(false);
                                        int b11 = this.B2.b(x1());
                                        SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder();
                                        spannableStringBuilder7.append((CharSequence) ob6.M0(2131749801, null));
                                        Object obj3 = this.B2.get(b11);
                                        if (!(obj3 instanceof TL_stars.SavedStarGift) || (starGift = ((TL_stars.SavedStarGift) obj3).gift) == null || (document = starGift.getDocument()) == null) {
                                            z2 = true;
                                        } else {
                                            spannableStringBuilder7.append((CharSequence) " e");
                                            z2 = true;
                                            spannableStringBuilder7.setSpan(new hm(document, c51Var.getTextPaint().getFontMetricsInt()), spannableStringBuilder7.length() - 1, spannableStringBuilder7.length(), 33);
                                        }
                                        c51Var.i(spannableStringBuilder7, this.Z2 ^ z2, z2);
                                        c51Var.g(null, this.Z2 ^ z2);
                                        c51Var.setOnClickListener(new ira(this, b11, (byte) 0));
                                    }
                                    this.o1.setTitle(this.Q2);
                                    iuaVar2 = this.K2;
                                    if (iuaVar2 == null) {
                                        boolean z12 = this.L2;
                                        jra jraVar = new jra(this, (byte) 0);
                                        jra jraVar2 = new jra(this, (byte) 1);
                                        ArrayList arrayList = iuaVar2.f;
                                        sua suaVar3 = iuaVar2.a;
                                        TL_stars.TL_starGiftUnique tL_starGiftUnique4 = iuaVar2.l;
                                        if (tL_starGiftUnique4 != null && tL_starGiftUnique4.id == tL_starGiftUnique2.id) {
                                            z3 = iuaVar2.o;
                                        } else if (z12) {
                                            de0 upgradeImageView = suaVar3.getUpgradeImageView();
                                            lua luaVar = suaVar3.c;
                                            TL_stars.starGiftAttributeModel upgradeImageViewAttribute = suaVar3.getUpgradeImageViewAttribute();
                                            TL_stars.starGiftAttributePattern upgradePatternAttribute = suaVar3.getUpgradePatternAttribute();
                                            TL_stars.starGiftAttributeBackdrop upgradeBackdropAttribute = suaVar3.getUpgradeBackdropAttribute();
                                            TL_stars.starGiftAttributeModel stargiftattributemodel2 = (TL_stars.starGiftAttributeModel) jxa.i(tL_starGiftUnique2.attributes, cls3);
                                            TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) jxa.i(tL_starGiftUnique2.attributes, cls);
                                            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) jxa.i(tL_starGiftUnique2.attributes, cls2);
                                            iuaVar2.o = true;
                                            iuaVar2.l = tL_starGiftUnique2;
                                            iuaVar2.r = jraVar;
                                            iuaVar2.s = jraVar2;
                                            iuaVar2.t = (float) Math.random();
                                            iuaVar2.m = System.currentTimeMillis();
                                            iuaVar2.n = 0.0f;
                                            iuaVar2.p = false;
                                            iuaVar2.q = false;
                                            iuaVar2.o = true;
                                            eua euaVar = iuaVar2.h;
                                            if (euaVar != null) {
                                                euaVar.a();
                                            }
                                            gua guaVar = new gua(luaVar, stargiftattributemodel2);
                                            if (luaVar.isAttachedToWindow() && guaVar.c) {
                                                guaVar.d.I();
                                            }
                                            iuaVar2.h = new eua(new cua(iuaVar2, (byte) 0), iuaVar2.e, new gua(upgradeImageView, upgradeImageViewAttribute), guaVar, 0.9f, iuaVar2.t > 0.5f ? 3 : 2);
                                            eua euaVar2 = iuaVar2.i;
                                            if (euaVar2 != null) {
                                                euaVar2.a();
                                            }
                                            iuaVar2.i = new eua(new cua(iuaVar2, (byte) 0), iuaVar2.g, new hua(upgradePatternAttribute), new hua(stargiftattributepattern), 1.0f, iuaVar2.t > 0.5f ? 2 : 1);
                                            eua euaVar3 = iuaVar2.j;
                                            if (euaVar3 != null) {
                                                euaVar3.a();
                                            }
                                            iuaVar2.j = new eua(new cua(iuaVar2, (byte) 0), arrayList, new fua(upgradeBackdropAttribute), new fua(stargiftattributebackdrop), 0.5f, iuaVar2.t > 0.5f ? 2 : 1);
                                            eua euaVar4 = iuaVar2.k;
                                            if (euaVar4 != null) {
                                                euaVar4.a();
                                            }
                                            iuaVar2.k = new eua(new cua(iuaVar2, (byte) 0), arrayList, new fua(upgradeBackdropAttribute), new fua(stargiftattributebackdrop), 1.25f, iuaVar2.t > 0.5f ? 2 : 1);
                                            iuaVar2.b();
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        if (z3) {
                                            sua suaVar4 = suaVar;
                                            suaVar4.b.setAlpha(0.0f);
                                            suaVar4.c.setAlpha(1.0f);
                                            c51Var.i(ob6.M0(2131749396, null), true, true);
                                            c51Var.setFilled(true);
                                            byte b12 = 2;
                                            c51Var.setOnClickListener(new hra(this, b12));
                                            int length4 = ((wua) this.O2.d).N2.length - 1;
                                            d79 d79Var = this.n1;
                                            d79Var.x0(length4);
                                            d79Var.post(new jra(this, b12));
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                c51Var.setFilled(true);
                                c51Var.i(ob6.M0(2131750393, null), !this.Z2, true);
                                c51Var.g(null, !this.Z2);
                                c51Var.setOnClickListener(new ysa(this, (byte) 5));
                            }
                        }
                        tL_starGiftUnique2 = tL_starGiftUnique;
                        this.o1.setTitle(this.Q2);
                        iuaVar2 = this.K2;
                        if (iuaVar2 == null) {
                        }
                    } else {
                        charSequence2 = stargiftattributemodel.name;
                    }
                }
                charSequence = charSequence2;
                if (tL_textWithEntities != null) {
                }
                spannable = null;
                suaVar2.h(0, spannableStringBuilder, charSequence, i2(tL_starGiftUnique.released_by), null, tLObject, spannable);
                this.h3 = null;
                hjb hjbVar2 = this.d2;
                hjbVar2.removeAllViews();
                if (z) {
                }
                b1(jxa.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class));
                b1(jxa.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
                b1(jxa.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
                if (!z) {
                }
                stargiftattributeoriginaldetails = (TL_stars.starGiftAttributeOriginalDetails) jxa.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeOriginalDetails.class);
                if (stargiftattributeoriginaldetails != null) {
                }
                if (this.d3 != null) {
                }
                iuaVar = this.K2;
                c51 c51Var2 = this.f2;
                if (iuaVar != null) {
                }
                if (this.d3 != null) {
                }
                tL_starGiftUnique2 = tL_starGiftUnique;
                this.o1.setTitle(this.Q2);
                iuaVar2 = this.K2;
                if (iuaVar2 == null) {
                }
            }
        } else {
            M0 = jt7.c(this.d3).e();
        }
        charSequence = M0;
        b = 1;
        if (tL_textWithEntities != null) {
        }
        spannable = null;
        suaVar2.h(0, spannableStringBuilder, charSequence, i2(tL_starGiftUnique.released_by), null, tLObject, spannable);
        this.h3 = null;
        hjb hjbVar22 = this.d2;
        hjbVar22.removeAllViews();
        if (z) {
        }
        b1(jxa.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class));
        b1(jxa.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
        b1(jxa.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
        if (!z) {
        }
        stargiftattributeoriginaldetails = (TL_stars.starGiftAttributeOriginalDetails) jxa.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeOriginalDetails.class);
        if (stargiftattributeoriginaldetails != null) {
        }
        if (this.d3 != null) {
        }
        iuaVar = this.K2;
        c51 c51Var22 = this.f2;
        if (iuaVar != null) {
        }
        if (this.d3 != null) {
        }
        tL_starGiftUnique2 = tL_starGiftUnique;
        this.o1.setTitle(this.Q2);
        iuaVar2 = this.K2;
        if (iuaVar2 == null) {
        }
    }

    public final int q1() {
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

    public final void q2(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        oj resellAmount = tL_starGiftUnique.getResellAmount(pj.a);
        boolean z = tL_starGiftUnique.resale_ton_only;
        c51 c51Var = this.f2;
        if (z) {
            c51Var.i(nza.t1(nza.V0(ob6.a0(null, null, 2131745873, tL_starGiftUnique.getResellAmount(pj.b).d()), true), true), !this.Z2, true);
            c51Var.g(it7.n(tL_starGiftUnique) ? null : nza.T0(ob6.H(',', "ResellGiftBuyEq", (int) resellAmount.a())), !this.Z2);
        } else {
            c51Var.i(nza.T0(ob6.H(',', "ResellGiftBuy", (int) resellAmount.a())), !this.Z2, true);
            c51Var.g(null, !this.Z2);
        }
    }

    public final long r1() {
        TLRPC.Peer peer;
        r47 r47Var = this.C2;
        if (r47Var == null) {
            TL_stars.SavedStarGift savedStarGift = this.A2;
            if (savedStarGift != null) {
                TL_stars.StarGift starGift = savedStarGift.gift;
                return starGift instanceof TL_stars.TL_starGiftUnique ? wf3.n(((TL_stars.TL_starGiftUnique) starGift).owner_id) : this.S1;
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.E2;
            if (tL_starGiftUnique != null) {
                return wf3.n(tL_starGiftUnique.owner_id);
            }
            return 0L;
        }
        TLRPC.Message message = r47Var.k;
        if (message == null) {
            return 0L;
        }
        TLRPC.MessageAction messageAction = message.action;
        if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
            TLRPC.Peer peer2 = ((TLRPC.TL_messageActionStarGift) messageAction).peer;
            return peer2 != null ? wf3.n(peer2) : r47Var.O3() ? r47.B0(this.C2.k) : yac.h(this.a).e();
        }
        if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
            return 0L;
        }
        TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
        TL_stars.StarGift starGift2 = tL_messageActionStarGiftUnique.gift;
        if ((starGift2 instanceof TL_stars.TL_starGiftUnique) && (peer = starGift2.owner_id) != null) {
            return wf3.n(peer);
        }
        TLRPC.Peer peer3 = tL_messageActionStarGiftUnique.peer;
        if (peer3 != null) {
            return wf3.n(peer3);
        }
        return 0L;
    }

    public final void r2(TL_stars.TL_starGiftUnique tL_starGiftUnique, boolean z) {
        if (z) {
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_peerUser.user_id = yac.h(this.a).e();
            tL_starGiftUnique.host_id = tL_peerUser;
            tL_starGiftUnique.flags |= TLObject.FLAG_12;
        } else {
            tL_starGiftUnique.host_id = null;
            tL_starGiftUnique.flags &= -4097;
        }
        this.a2.setWalletDisplayed(z);
        E2();
    }

    public final TL_stars.StarGift s1() {
        r47 r47Var = this.C2;
        if (r47Var != null) {
            TLRPC.Message message = r47Var.k;
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

    public final void s2(boolean z) {
        int x1 = x1();
        if (x1 >= 0) {
            int i = (z ? 1 : -1) + x1;
            int i2 = this.P2;
            if (i2 >= 0 && (!z ? i2 < x1 : i2 > x1)) {
                i = i2;
            }
            bxa bxaVar = this.B2;
            Object obj = (bxaVar == null || i < 0 || i >= bxaVar.e()) ? null : this.B2.get(i);
            if (obj != null) {
                if ((z ? this.Y1 : this.X1) != null) {
                    if (obj instanceof TL_stars.SavedStarGift) {
                        if (n1((z ? this.Y1 : this.X1).A2, (TL_stars.SavedStarGift) obj)) {
                            return;
                        }
                    }
                    if (obj instanceof TL_stars.TL_starGiftUnique) {
                        if (o1((z ? this.Y1 : this.X1).E2, (TL_stars.TL_starGiftUnique) obj)) {
                            return;
                        }
                    }
                }
                mx4 mx4Var = new mx4(this, getContext(), this.a, this.S1, this.J0, this.T1.getRootView());
                if (obj instanceof TL_stars.SavedStarGift) {
                    mx4Var.o2((TL_stars.SavedStarGift) obj, this.B2);
                } else if (obj instanceof TL_stars.TL_starGiftUnique) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
                    mx4Var.n2(tL_starGiftUnique.slug, tL_starGiftUnique, this.B2);
                }
                hl.B2(mx4Var.b);
                if (z) {
                    this.Y1 = mx4Var;
                } else {
                    this.X1 = mx4Var;
                }
            }
        }
    }

    @Override // nx0, android.app.Dialog
    public final void show() {
        r47 r47Var;
        TLRPC.Message message;
        String str;
        if (uc7.s1(this.a).x2()) {
            i5.b(this.a);
            return;
        }
        TL_wallet.nftItem nftitem = this.a3;
        if (nftitem != null && (str = this.D2) != null && this.E2 != null) {
            TL_stars.getUniqueStarGift getuniquestargift = new TL_stars.getUniqueStarGift();
            getuniquestargift.slug = str;
            ConnectionsManager.getInstance(this.a).sendRequest(getuniquestargift, new qn8((Object) this, (Object) nftitem, (Object) str, (byte) 16));
        }
        if (this.D2 != null && this.E2 == null) {
            id idVar = new id(3, null, getContext());
            idVar.q(500L);
            TL_stars.getUniqueStarGift getuniquestargift2 = new TL_stars.getUniqueStarGift();
            getuniquestargift2.slug = this.D2;
            ConnectionsManager.getInstance(this.a).sendRequest(getuniquestargift2, new ol7(this, idVar, (byte) 28));
        } else if (this.A2 == null && (r47Var = this.C2) != null && (message = r47Var.k) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                if (tL_messageActionStarGift.upgraded) {
                    if (tL_messageActionStarGift.upgrade_msg_id != 0) {
                        id idVar2 = new id(3, null, getContext());
                        idVar2.q(500L);
                        TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                        tL_messages_getMessages.id.add(Integer.valueOf(tL_messageActionStarGift.upgrade_msg_id));
                        ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_getMessages, new qn8((Object) this, (Object) tL_messageActionStarGift, idVar2, (byte) 14));
                        return;
                    }
                    if (v1() != null) {
                        id idVar3 = new id(3, null, getContext());
                        idVar3.q(500L);
                        jxa.v(this.a, false).J(v1(), new ku9(this, idVar3, (byte) 7));
                        return;
                    }
                }
            }
        }
        super.show();
    }

    public final String t1() {
        TL_stars.StarGift s1 = s1();
        if (!(s1 instanceof TL_stars.TL_starGiftUnique)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(((TL_stars.TL_starGiftUnique) s1).title);
        sb.append(" #");
        return qu6.m(r3.num, ',', sb);
    }

    public final void t2() {
        TL_stars.TL_starGiftUnique B1 = B1();
        if (B1 == null) {
            return;
        }
        TLRPC.Peer peer = B1.owner_id;
        if (peer == null) {
            peer = B1.host_id;
        }
        long n = wf3.n(peer);
        StringBuilder sb = new StringBuilder();
        sb.append(B1.title);
        sb.append(" #");
        this.x2.setText(ob6.a0(null, null, 2131749779, qu6.m(B1.num, ',', sb)));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ob6.M0(2131749781, null));
        if (n == yac.h(this.a).e() && !yac.h(this.a).p()) {
            spannableStringBuilder.append((CharSequence) " l");
            wm2 wm2Var = this.S2;
            if (wm2Var == null) {
                wm2Var = new wm2(R.drawable.msg_mini_lock3, 0);
                this.S2 = wm2Var;
            }
            spannableStringBuilder.setSpan(wm2Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        c51 c51Var = this.f2;
        c51Var.i(spannableStringBuilder, true, true);
        c51Var.g(null, true);
        c51Var.setOnClickListener(new hra(this, (byte) 9));
        this.a2.setWearPreview(uc7.s1(this.a).b2(n));
        A2(2, false, null);
        this.v2 = true;
    }

    public final void u2(CharSequence charSequence) {
        TL_stars.TL_starGiftUnique B1 = B1();
        TL_stars.InputSavedStarGift v1 = v1();
        if (v1 == null || B1 == null) {
            return;
        }
        TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails = new TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails();
        tL_inputInvoiceStarGiftDropOriginalDetails.stargift = v1;
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftDropOriginalDetails;
        JSONObject u = xw0.u(this.J0, false);
        if (u != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = u.toString();
            tL_payments_getPaymentForm.flags |= 1;
        }
        ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getPaymentForm, new au0((Object) this, (Object) charSequence, (Object) B1, (Object) tL_inputInvoiceStarGiftDropOriginalDetails, (byte) 20));
    }

    public final TL_stars.InputSavedStarGift v1() {
        TLRPC.Message message;
        TLRPC.Message message2;
        TLRPC.Message message3;
        long j = this.S1;
        if (j < 0) {
            TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat = new TL_stars.TL_inputSavedStarGiftChat();
            tL_inputSavedStarGiftChat.peer = uc7.s1(this.a).j1(j);
            r47 r47Var = this.C2;
            if (r47Var == null || (message3 = r47Var.k) == null) {
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
        r47 r47Var2 = this.C2;
        if (r47Var2 != null && (message2 = r47Var2.k) != null) {
            TLRPC.MessageAction messageAction2 = message2.action;
            if ((messageAction2 instanceof TLRPC.TL_messageActionStarGift) && (messageAction2.flags & TLObject.FLAG_12) != 0) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift2 = (TLRPC.TL_messageActionStarGift) messageAction2;
                TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat2 = new TL_stars.TL_inputSavedStarGiftChat();
                uc7 s1 = uc7.s1(this.a);
                TLRPC.Peer peer = tL_messageActionStarGift2.peer;
                tL_inputSavedStarGiftChat2.peer = s1.j1(peer != null ? wf3.n(peer) : r47.B0(this.C2.k));
                tL_inputSavedStarGiftChat2.saved_id = tL_messageActionStarGift2.saved_id;
                return tL_inputSavedStarGiftChat2;
            }
        }
        if (r47Var2 != null && (message = r47Var2.k) != null) {
            TLRPC.MessageAction messageAction3 = message.action;
            if ((messageAction3 instanceof TLRPC.TL_messageActionStarGiftUnique) && (messageAction3.flags & 128) != 0) {
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique2 = (TLRPC.TL_messageActionStarGiftUnique) messageAction3;
                TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat3 = new TL_stars.TL_inputSavedStarGiftChat();
                uc7 s12 = uc7.s1(this.a);
                TLRPC.Peer peer2 = tL_messageActionStarGiftUnique2.peer;
                tL_inputSavedStarGiftChat3.peer = s12.j1(peer2 != null ? wf3.n(peer2) : r47.B0(this.C2.k));
                tL_inputSavedStarGiftChat3.saved_id = tL_messageActionStarGiftUnique2.saved_id;
                return tL_inputSavedStarGiftChat3;
            }
        }
        TL_stars.TL_inputSavedStarGiftUser tL_inputSavedStarGiftUser = new TL_stars.TL_inputSavedStarGiftUser();
        r47 r47Var3 = this.C2;
        if (r47Var3 != null) {
            TLRPC.Message message4 = r47Var3.k;
            if (message4 != null) {
                TLRPC.MessageAction messageAction4 = message4.action;
                if ((messageAction4 instanceof TLRPC.TL_messageActionStarGift) && (messageAction4.flags & 32768) != 0) {
                    tL_inputSavedStarGiftUser.msg_id = ((TLRPC.TL_messageActionStarGift) messageAction4).gift_msg_id;
                    return tL_inputSavedStarGiftUser;
                }
            }
            tL_inputSavedStarGiftUser.msg_id = r47Var3.e1();
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

    public final void v2(View view, CharSequence charSequence, boolean z) {
        Layout layout;
        float primaryHorizontal;
        kg5 kg5Var = this.w3;
        if ((kg5Var != null && kg5Var.W && this.x3 == view) || view == null) {
            return;
        }
        if (!z) {
            if (view instanceof TextView) {
                layout = ((TextView) view).getLayout();
            } else if (!(view instanceof ema)) {
                return;
            } else {
                layout = ((ema) view).getLayout();
            }
            if (layout == null) {
                return;
            }
            CharSequence text = layout.getText();
            if (!(text instanceof Spanned)) {
                return;
            }
            Spanned spanned = (Spanned) text;
            z41[] z41VarArr = (z41[]) spanned.getSpans(0, spanned.length(), z41.class);
            if (z41VarArr == null || z41VarArr.length <= 0) {
                return;
            }
            primaryHorizontal = layout.getPrimaryHorizontal(spanned.getSpanStart(z41VarArr[z41VarArr.length - 1])) + view.getPaddingLeft() + (r5.a() / 2.0f);
        } else {
            if (!(view instanceof ema)) {
                return;
            }
            ema emaVar = (ema) view;
            primaryHorizontal = (emaVar.getRightDrawableWidth() / 2.0f) + emaVar.getRightDrawableX();
        }
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr);
        jo0 jo0Var = this.T1;
        jo0Var.getLocationOnScreen(iArr2);
        iArr[0] = iArr[0] - iArr2[0];
        iArr[1] = iArr[1] - iArr2[1];
        kg5 kg5Var2 = this.w3;
        if (kg5Var2 != null) {
            kg5Var2.f(true);
            this.w3 = null;
        }
        kg5 kg5Var3 = new kg5(getContext(), 3);
        kg5Var3.p(!z);
        kg5Var3.t(charSequence);
        kg5Var3.o(0.0f, (iArr[0] + primaryHorizontal) - (hl.L(16.0f) + this.u0));
        kg5Var3.setTranslationY(((iArr[1] - hl.L(100.0f)) - (view.getHeight() / 2.0f)) + hl.L((z ? 18 : 0) + 4.33f));
        kg5Var3.d = 3000L;
        kg5Var3.setPadding(hl.L(16.0f) + this.u0, 0, hl.L(16.0f) + this.u0, 0);
        kg5Var3.r0 = new ug(kg5Var3, (byte) 8);
        kg5Var3.v();
        jo0Var.addView(kg5Var3, tre.c(100.0f, -1));
        this.w3 = kg5Var3;
        this.x3 = view;
    }

    public final String w1() {
        TL_stars.StarGift s1 = s1();
        if (!(s1 instanceof TL_stars.TL_starGiftUnique) || s1.slug == null) {
            return null;
        }
        return uc7.s1(this.a).N2 + "/nft/" + s1.slug;
    }

    public final void w2(int i, Context context, boolean z) {
        LinearLayout j = uh9.j(context, 1);
        FrameLayout frameLayout = new FrameLayout(context);
        int L = hl.L(64.0f);
        int i2 = aob.Fi;
        ShapeDrawable K = aob.K(L, aob.v0(i2, this.J0));
        uob M = yob.M(i2);
        vnb vnbVar = this.J0;
        frameLayout.setBackground(K);
        yob.j(frameLayout, K, M, null, vnbVar);
        j.addView(frameLayout, tre.t(64, 64, 49, 0, 6, 0, 0));
        e29 e29Var = new e29(context);
        e29Var.setScaleType(ImageView.ScaleType.CENTER);
        e29Var.f(R.raw.timer_3, 42, 42, null);
        frameLayout.addView(e29Var, tre.r(64, 64, 17));
        e29Var.d();
        TextView b = zze.b(context, 20.0f, aob.G6, true, null);
        b.setGravity(17);
        b.setText(ob6.M0(z ? 2131749951 : 2131749857, null));
        j.addView(b, tre.t(-1, -2, 48, 24, 14, 24, 0));
        TextView b2 = zze.b(context, 14.0f, aob.F6, false, null);
        b2.setGravity(17);
        b2.setText(ob6.a0(null, null, z ? 2131749952 : 2131749858, ob6.c0(Math.max(10, i))));
        j.addView(b2, tre.t(-1, -2, 48, 24, 6, 24, 6));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.J0, context);
        alertDialog$Builder.n(j);
        alertDialog$Builder.j(ob6.M0(2131747558, null), null);
        alertDialog$Builder.o();
    }

    public final int x1() {
        int indexOf;
        bxa bxaVar = this.B2;
        if (bxaVar == null) {
            return -1;
        }
        TL_stars.SavedStarGift savedStarGift = this.A2;
        if (savedStarGift != null) {
            indexOf = bxaVar.indexOf(savedStarGift);
        } else {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.E2;
            if (tL_starGiftUnique == null) {
                return -1;
            }
            indexOf = bxaVar.indexOf(tL_starGiftUnique);
        }
        if (indexOf >= 0) {
            return indexOf;
        }
        TL_stars.StarGift s1 = s1();
        for (int i = 0; i < this.B2.e(); i++) {
            Object obj = this.B2.get(i);
            if (obj instanceof TL_stars.SavedStarGift) {
                TL_stars.SavedStarGift savedStarGift2 = this.A2;
                if (savedStarGift2 != null) {
                    if (n1(savedStarGift2, (TL_stars.SavedStarGift) obj)) {
                        return i;
                    }
                }
                if (s1 != null) {
                    TL_stars.StarGift starGift = ((TL_stars.SavedStarGift) obj).gift;
                    if (s1 != starGift) {
                        if ((s1 instanceof TL_stars.TL_starGiftUnique) && (starGift instanceof TL_stars.TL_starGiftUnique) && s1.id == starGift.id) {
                        }
                    }
                    return i;
                }
                continue;
            } else {
                if ((obj instanceof TL_stars.TL_starGiftUnique) && o1(this.E2, (TL_stars.TL_starGiftUnique) obj)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public final boolean x2() {
        if (!it7.n(B1())) {
            return false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.J0, getContext());
        String M0 = ob6.M0(2131749864, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        idVar.U = ob6.M0(2131749476, null);
        if (i1()) {
            alertDialog$Builder.j(ob6.M0(2131750393, null), new yra(this, (byte) 2));
            alertDialog$Builder.g(ob6.M0(2131752570, null), null);
        } else {
            alertDialog$Builder.j(ob6.M0(2131747558, null), null);
        }
        alertDialog$Builder.o();
        return true;
    }

    @Override // nx0
    public final void y0(int i) {
        super.y0(i);
        hl.o3(this, 0, false, null);
    }

    public final TL_stars.SavedStarGift y1(boolean z) {
        int x1 = x1();
        if (x1 >= 0) {
            int i = (z ? 1 : -1) + x1;
            int i2 = this.P2;
            if (i2 >= 0 && (!z ? i2 < x1 : i2 > x1)) {
                i = i2;
            }
            bxa bxaVar = this.B2;
            Object obj = (bxaVar == null || i < 0 || i >= bxaVar.e()) ? null : this.B2.get(i);
            if (obj instanceof TL_stars.SavedStarGift) {
                return (TL_stars.SavedStarGift) obj;
            }
        }
        return null;
    }

    public final boolean y2(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        if (!ik8.A(tL_starGiftUnique) || TextUtils.isEmpty(tL_starGiftUnique.gift_address) || TextUtils.isEmpty(tL_starGiftUnique.owner_address) || it7.n(tL_starGiftUnique)) {
            return false;
        }
        c C = c.C(this.a);
        return c.b(tL_starGiftUnique.owner_address, C.x()) || C.A().c(tL_starGiftUnique.gift_address);
    }

    public final TL_stars.TL_starGiftUnique z1(boolean z) {
        int x1 = x1();
        if (x1 >= 0) {
            int i = (z ? 1 : -1) + x1;
            int i2 = this.P2;
            if (i2 >= 0 && (!z ? i2 < x1 : i2 > x1)) {
                i = i2;
            }
            bxa bxaVar = this.B2;
            Object obj = (bxaVar == null || i < 0 || i >= bxaVar.e()) ? null : this.B2.get(i);
            if (obj instanceof TL_stars.TL_starGiftUnique) {
                return (TL_stars.TL_starGiftUnique) obj;
            }
        }
        return null;
    }

    public final void z2(boolean z, id idVar, l01 l01Var, Runnable runnable) {
        l01Var.d();
        yac h = yac.h(this.a);
        TL_account.tmpPassword tmppassword = h.y;
        if (tmppassword != null && tmppassword.valid_until < ConnectionsManager.getInstance(this.a).getCurrentTime() + 60) {
            h.y = null;
            h.u(false);
        }
        TL_account.tmpPassword tmppassword2 = h.y;
        if (tmppassword2 == null) {
            a2(z, l01Var, runnable);
        } else {
            D1(tmppassword2.tmp_password, null, z, new s45(this, z, l01Var, runnable, idVar));
        }
    }
}
