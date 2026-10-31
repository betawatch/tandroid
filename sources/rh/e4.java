package rh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableRow;
import android.widget.TextView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.h20;
import org.telegram.messenger.jj;
import org.telegram.messenger.q20;
import org.telegram.messenger.rl;
import org.telegram.messenger.us;
import org.telegram.messenger.vp;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.bu0;
import org.telegram.ui.Components.c70;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.da;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.eb;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.ei0;
import org.telegram.ui.Components.ep;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.ha;
import org.telegram.ui.Components.jh;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.ty0;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.u80;
import org.telegram.ui.Components.uy0;
import org.telegram.ui.Components.vy0;
import org.telegram.ui.Components.wb;
import org.telegram.ui.Components.wy0;
import org.telegram.ui.Components.xz;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.au;
import org.telegram.ui.cj0;
import org.telegram.ui.f11;
import org.telegram.ui.lh;
import org.telegram.ui.mb;
import org.telegram.ui.no;
import org.telegram.ui.px0;
import org.telegram.ui.ul0;
import org.telegram.ui.yv0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class e4 extends ha implements us {
    public static final /* synthetic */ int s3 = 0;
    public String A2;
    public TL_stars.TL_starGiftUnique B2;
    public boolean C2;
    public boolean D2;
    public boolean E2;
    public boolean F2;
    public boolean G2;
    public n3 H2;
    public boolean I2;
    public o2 J2;
    public final int[] K2;
    public kg.f L2;
    public int M2;
    public String N2;
    public ph.p3 O2;
    public final long P1;
    public dq P2;
    public final jg.b1 Q1;
    public boolean Q2;
    public final l2 R1;
    public h2 R2;
    public final xz S1;
    public Float S2;
    public final View T1;
    public f4.d T2;
    public ph.w0 U1;
    public ValueAnimator U2;
    public ph.w0 V1;
    public dq V2;
    public final n2 W1;
    public boolean W2;
    public final y3 X1;
    public TL_wallet.nftItem X2;
    public final m2 Y1;
    public org.telegram.ui.Wallet.i5 Y2;
    public final p80 Z1;
    public org.telegram.ui.Wallet.j5 Z2;
    public final wy0 a2;
    public TL_wallet.walletTransaction a3;
    public final p80 b2;
    public View b3;
    public final vh.d c2;
    public ph.u1 c3;
    public final FrameLayout d2;
    public boolean d3;
    public final p80 e2;
    public Boolean e3;
    public final FrameLayout f2;
    public boolean f3;
    public final View g2;
    public ArrayList g3;
    public final FrameLayout h2;
    public ArrayList h3;
    public a4 i2;
    public ArrayList i3;
    public boolean j2;
    public boolean j3;
    public final m2 k2;
    public TLRPC.PaymentForm k3;
    public final xh.h[] l2;
    public final dq[] l3;
    public final View m2;
    public final w0 m3;
    public final LinearLayout n2;
    public int n3;
    public final ep o2;
    public Boolean o3;
    public final TextView p2;
    public boolean p3;
    public final LinearLayout q2;
    public vh.p2 q3;
    public final ep r2;
    public View r3;
    public boolean s2;
    public final m2 t2;
    public final TextView u2;
    public final m2 v2;
    public boolean w2;
    public TL_stars.SavedStarGift x2;
    public w5 y2;
    public jj z2;

    public e4(Context context, int i10, long j10, org.telegram.ui.ActionBar.p6 p6Var, View view) {
        super(context, null, false, false, p6Var);
        this.j2 = false;
        this.K2 = new int[2];
        this.M2 = -1;
        this.N2 = "";
        this.T2 = new f4.d(0, 0);
        this.W2 = true;
        this.l3 = new dq[1];
        this.m3 = new w0(this, 11);
        this.p3 = true;
        this.a = i10;
        this.P1 = j10;
        this.r1 = Math.max(0.05f, org.telegram.messenger.i0.L(82.0f) / (org.telegram.messenger.i0.q.y + org.telegram.messenger.i0.m));
        this.x = true;
        this.b = new org.telegram.ui.Components.voip.i0(this, context, 5);
        jg.b1 b1Var = new jg.b1(this, context);
        this.Q1 = b1Var;
        l2 l2Var = new l2(this, context);
        this.R1 = l2Var;
        l2Var.setAdapter(new mg.s(this, context, 9));
        v2();
        View view2 = new View(context);
        this.T1 = view2;
        int i11 = org.telegram.ui.ActionBar.t6.h5;
        org.telegram.ui.ActionBar.a7.i(i11, view2, p6Var);
        FrameLayout.LayoutParams e = w7.b6.e(-1, 50, 80);
        int i12 = this.t0;
        e.rightMargin = i12;
        e.leftMargin = i12;
        this.b.addView(view2, e);
        this.b.addView(l2Var, w7.b6.e(-1, -1, zs.E1));
        Q(i11);
        org.telegram.messenger.i0.E2(this.k1);
        b1Var.addView(this.k1, w7.b6.e(-1, -1, zs.E1));
        m2 m2Var = new m2(this, context, 0);
        this.Y1 = m2Var;
        m2Var.setOrientation(1);
        m2Var.setPadding(org.telegram.messenger.i0.L(14.0f) + this.t0, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(14.0f) + this.t0, org.telegram.messenger.i0.L(68.0f));
        b1Var.addView(m2Var, w7.b6.e(-1, -1, 55));
        p80 p80Var = new p80(context, p6Var);
        this.Z1 = p80Var;
        int i13 = org.telegram.ui.ActionBar.t6.q5;
        org.telegram.ui.ActionBar.a7.V(p80Var, i13, p6Var);
        p80Var.setTextSize(1, 12.0f);
        p80Var.setGravity(17);
        p80Var.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
        org.telegram.ui.ActionBar.a7.H(p80Var, org.telegram.ui.ActionBar.t6.Uc, p6Var);
        p80Var.setDisablePaddingsOffsetY(true);
        m2Var.addView(p80Var, w7.b6.t(-2, -2, 1, 4, -2, 4, 16));
        p80Var.setVisibility(8);
        wy0 wy0Var = new wy0(context, p6Var);
        this.a2 = wy0Var;
        m2Var.addView(wy0Var, w7.b6.k(0.0f, 0.0f, 0.0f, 12.0f, -1, -2));
        p80 p80Var2 = new p80(context, p6Var);
        this.b2 = p80Var2;
        org.telegram.ui.ActionBar.a7.V(p80Var2, i13, p6Var);
        p80Var2.setTextSize(1, 12.0f);
        p80Var2.setGravity(17);
        p80Var2.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
        int i14 = org.telegram.ui.ActionBar.t6.Ci;
        org.telegram.ui.ActionBar.a7.H(p80Var2, i14, p6Var);
        p80Var2.setDisablePaddingsOffsetY(true);
        p80Var2.setPadding(org.telegram.messenger.i0.L(5.0f), 0, org.telegram.messenger.i0.L(5.0f), 0);
        m2Var.addView(p80Var2, w7.b6.t(-2, -2, 1, 4, 2, 4, 8));
        p80Var2.setVisibility(8);
        LinearLayout linearLayout = new LinearLayout(context);
        this.q2 = linearLayout;
        linearLayout.setPadding(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(8.0f));
        linearLayout.setOrientation(0);
        int i15 = org.telegram.ui.ActionBar.t6.i6;
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.t6.a0(org.telegram.ui.ActionBar.t6.w0(i15, p6Var), 21, 21);
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i15);
        linearLayout.setBackground(a02);
        org.telegram.ui.ActionBar.a7.k(linearLayout, a02, null, N, p6Var);
        ep epVar = new ep(24, context, p6Var);
        this.r2 = epVar;
        int i16 = org.telegram.ui.ActionBar.t6.h7;
        int i17 = org.telegram.ui.ActionBar.t6.j7;
        int i18 = org.telegram.ui.ActionBar.t6.k7;
        epVar.b(i16, i17, i18);
        epVar.setDrawUnchecked(true);
        epVar.a(false, false);
        epVar.setDrawBackgroundAsArc(10);
        linearLayout.addView(epVar, w7.b6.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        int i19 = org.telegram.ui.ActionBar.t6.j5;
        org.telegram.ui.ActionBar.a7.V(textView, i19, p6Var);
        sc.e.u(textView, 1, 14.0f, null, 2131750398);
        linearLayout.addView(textView, w7.b6.t(-2, -2, 16, 9, 0, 0, 0));
        m2Var.addView(linearLayout, w7.b6.t(-2, -2, 1, 0, -4, 0, 4));
        w7.e6.b(linearLayout, 0.025f, 1.5f);
        linearLayout.setOnClickListener(new v0(this, 19));
        linearLayout.setVisibility(8);
        m2 m2Var2 = new m2(this, context, 1);
        this.k2 = m2Var2;
        m2Var2.setOrientation(1);
        m2Var2.setPadding(org.telegram.messenger.i0.L(4.0f) + this.t0, org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(4.0f) + this.t0, org.telegram.messenger.i0.L(66.0f));
        b1Var.addView(m2Var2, w7.b6.e(-1, -1, 55));
        xh.h[] hVarArr = {r9, r6, r6};
        this.l2 = hVarArr;
        xh.h hVar = new xh.h(context, p6Var, false);
        hVar.a(R.drawable.menu_feature_unique, cd.L0(2131749874, null), cd.L0(2131749584, null));
        m2Var2.addView(hVarArr[0], w7.b6.o(-1, -2));
        xh.h hVar2 = new xh.h(context, p6Var, false);
        hVar2.a(R.drawable.menu_feature_tradable, cd.L0(2131749868, null), cd.L0(2131749582, null));
        m2Var2.addView(hVarArr[1], w7.b6.o(-1, -2));
        xh.h hVar3 = new xh.h(context, p6Var, false);
        hVar3.a(R.drawable.menu_wear, cd.L0(2131749579, null), cd.L0(2131749580, null));
        m2Var2.addView(hVarArr[2], w7.b6.o(-1, -2));
        View view3 = new View(context);
        this.m2 = view3;
        int i20 = org.telegram.ui.ActionBar.t6.d7;
        org.telegram.ui.ActionBar.a7.i(i20, view3, p6Var);
        m2Var2.addView(view3, w7.b6.n(1.0f / org.telegram.messenger.i0.p, -2, 7, 17, -4, 17, 6));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.n2 = linearLayout2;
        linearLayout2.setPadding(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(8.0f));
        linearLayout2.setOrientation(0);
        org.telegram.ui.Cells.y a03 = org.telegram.ui.ActionBar.t6.a0(org.telegram.ui.ActionBar.t6.w0(i15, p6Var), 6, 6);
        org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i15);
        linearLayout2.setBackground(a03);
        org.telegram.ui.ActionBar.a7.k(linearLayout2, a03, null, N2, p6Var);
        ep epVar2 = new ep(24, context, p6Var);
        this.o2 = epVar2;
        epVar2.b(i16, i17, i18);
        epVar2.setDrawUnchecked(true);
        epVar2.a(false, false);
        epVar2.setDrawBackgroundAsArc(10);
        linearLayout2.addView(epVar2, w7.b6.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView2 = new TextView(context);
        this.p2 = textView2;
        org.telegram.ui.ActionBar.a7.V(textView2, i19, p6Var);
        sc.e.u(textView2, 1, 14.0f, null, 2131750406);
        linearLayout2.addView(textView2, w7.b6.t(-2, -2, 16, 9, 0, 0, 0));
        m2Var2.addView(linearLayout2, w7.b6.t(-2, -2, 1, 0, 0, 0, 4));
        w7.e6.b(linearLayout2, 0.025f, 1.5f);
        m2 m2Var3 = new m2(this, context, 2);
        this.t2 = m2Var3;
        m2Var3.setOrientation(1);
        m2Var3.setPadding(org.telegram.messenger.i0.L(4.0f) + this.t0, org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(4.0f) + this.t0, org.telegram.messenger.i0.L(66.0f));
        b1Var.addView(m2Var3, w7.b6.e(-1, -1, 55));
        TextView textView3 = new TextView(context);
        this.u2 = textView3;
        org.telegram.ui.ActionBar.a7.V(textView3, i19, p6Var);
        textView3.setTextSize(1, 20.0f);
        textView3.setGravity(17);
        textView3.setTypeface(org.telegram.messenger.i0.o());
        m2Var3.addView(textView3, w7.b6.t(-1, -2, 7, 20, 0, 20, 0));
        TextView textView4 = new TextView(context);
        org.telegram.ui.ActionBar.a7.V(textView4, i19, p6Var);
        textView4.setTextSize(1, 14.0f);
        org.telegram.messenger.m5.l(textView4, 17, null, 2131749843);
        m2Var3.addView(textView4, w7.b6.t(-1, -2, 7, 20, 6, 20, 24));
        xh.h hVar4 = new xh.h(context, p6Var, false);
        hVar4.a(R.drawable.menu_feature_unique, cd.L0(2131749849, null), cd.L0(2131749850, null));
        m2Var3.addView(r6[0], w7.b6.o(-1, -2));
        xh.h hVar5 = new xh.h(context, p6Var, false);
        hVar5.a(R.drawable.menu_feature_cover, cd.L0(2131749847, null), cd.L0(2131749848, null));
        m2Var3.addView(r6[1], w7.b6.o(-1, -2));
        xh.h hVar6 = new xh.h(context, p6Var, false);
        xh.h[] hVarArr2 = {hVar4, hVar5, hVar6};
        hVar6.a(R.drawable.menu_verification, cd.L0(2131749845, null), cd.L0(2131749846, null));
        m2Var3.addView(hVarArr2[2], w7.b6.o(-1, -2));
        m2 m2Var4 = new m2(this, context, 3);
        this.v2 = m2Var4;
        m2Var4.setOrientation(1);
        m2Var4.setPadding(org.telegram.messenger.i0.L(4.0f) + this.t0, org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(4.0f) + this.t0, org.telegram.messenger.i0.L(92.0f));
        b1Var.addView(m2Var4, w7.b6.e(-1, -1, 55));
        xh.h hVar7 = new xh.h(context, p6Var, false);
        hVar7.a(R.drawable.menu_feature_unique, cd.L0(2131749794, null), cd.L0(2131749795, null));
        m2Var4.addView(r8[0], w7.b6.o(-1, -2));
        xh.h hVar8 = new xh.h(context, p6Var, false);
        hVar8.a(R.drawable.menu_random, cd.L0(2131749792, null), cd.L0(2131749793, null));
        m2Var4.addView(r8[1], w7.b6.o(-1, -2));
        xh.h hVar9 = new xh.h(context, p6Var, false);
        xh.h[] hVarArr3 = {hVar7, hVar8, hVar9};
        hVar9.a(R.drawable.menu_feature_affect, cd.L0(2131749790, null), cd.L0(2131749791, null));
        m2Var4.addView(hVarArr3[2], w7.b6.o(-1, -2));
        m2Var.setAlpha(1.0f);
        m2Var2.setAlpha(0.0f);
        m2Var3.setAlpha(0.0f);
        m2Var4.setAlpha(0.0f);
        y3 y3Var = new y3(context, p6Var, new w0(this, 12), new v0(this, 20), new v0(this, 21), new v0(this, 22), new v0(this, 23), new v0(this, 24), new v0(this, 25), new v0(this, 26));
        this.X1 = y3Var;
        y3Var.M.c.setOnClickListener(new v0(this, 17));
        int i21 = this.t0;
        y3Var.setPadding(i21, 0, i21, 0);
        b1Var.addView(y3Var, w7.b6.e(-1, -2, 55));
        dh.f fVar = this.j1;
        this.G1 = true;
        fVar.k1(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d2 = frameLayout;
        org.telegram.ui.ActionBar.a7.i(i11, frameLayout, p6Var);
        View view4 = new View(context);
        this.g2 = view4;
        org.telegram.ui.ActionBar.a7.i(i20, view4, p6Var);
        view4.setAlpha(0.0f);
        frameLayout.addView(view4, w7.b6.a(-1.0f, 1.0f / org.telegram.messenger.i0.p, 55));
        vh.d i22 = z20.i(24, context, p6Var, true);
        this.c2 = i22;
        i22.i(cd.L0(2131747847, null), false, true);
        i22.g(null, false);
        FrameLayout.LayoutParams d = w7.b6.d(-1, 48.0f, zs.E1, 0.0f, 12.0f, 0.0f, 12.0f);
        d.leftMargin = org.telegram.messenger.i0.L(14.0f) + this.t0;
        d.rightMargin = org.telegram.messenger.i0.L(14.0f) + this.t0;
        frameLayout.addView(i22, d);
        b1Var.addView(frameLayout, w7.b6.e(-1, 72, 87));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f2 = frameLayout2;
        org.telegram.ui.ActionBar.a7.i(i11, frameLayout2, p6Var);
        p80 p80Var3 = new p80(context, null);
        this.e2 = p80Var3;
        p80Var3.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.a7.V(p80Var3, i14, p6Var);
        org.telegram.ui.ActionBar.a7.H(p80Var3, i14, p6Var);
        p80Var3.setGravity(17);
        frameLayout2.addView(p80Var3, w7.b6.d(-1, -2.0f, 17, 16.0f, 8.0f, 16.0f, 14.0f));
        b1Var.addView(frameLayout2, w7.b6.e(-1, -2, 87));
        frameLayout2.setVisibility(8);
        int i23 = 18;
        this.k1.setOnScrollListener(new bu0(this, i23));
        linearLayout2.setOnClickListener(new v0(this, i23));
        xz xzVar = new xz(context);
        this.S1 = xzVar;
        b1Var.addView(xzVar, w7.b6.c(-1.0f, -1));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.h2 = frameLayout3;
        frameLayout3.setPadding(org.telegram.messenger.i0.L(6.0f) + this.t0, 0, org.telegram.messenger.i0.L(6.0f) + this.t0, 0);
        b1Var.addView(frameLayout3, w7.b6.d(-1, 200.0f, 87, 0.0f, 0.0f, 0.0f, 60.0f));
        org.telegram.messenger.i0.E2(this.l1);
        b1Var.addView(this.l1, w7.b6.d(-1, -2.0f, 0, 6.0f, 0.0f, 6.0f, 0.0f));
        n2 n2Var = new n2(context);
        this.W1 = n2Var;
        b1Var.addView(n2Var, w7.b6.e(-1, -2, 55));
        ArrayList arrayList = new ArrayList();
        if (view != null) {
            arrayList.add(view);
        }
        org.telegram.messenger.i0.m2(new ph.h1(n2Var, 10), 12.0f, 12, arrayList);
    }

    public static String A1(TL_stars.StarGift starGift) {
        if (!(starGift instanceof TL_stars.TL_starGiftUnique)) {
            return (!(starGift instanceof TL_stars.TL_starGift) || TextUtils.isEmpty(starGift.title)) ? cd.L0(2131750201, null) : starGift.title;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(((TL_stars.TL_starGiftUnique) starGift).title);
        sb2.append(" #");
        return i0.a.k(r3.num, ',', sb2);
    }

    public static String G1(TL_stars.StarGiftAttributeRarity starGiftAttributeRarity, Integer[] numArr) {
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityUncommon) {
            numArr[0] = -12539616;
            return cd.L0(2131749628, null);
        }
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityRare) {
            numArr[0] = -15619394;
            return cd.L0(2131749629, null);
        }
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityEpic) {
            numArr[0] = -6988581;
            return cd.L0(2131749631, null);
        }
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityLegendary) {
            numArr[0] = -4229632;
            return cd.L0(2131749630, null);
        }
        if (!(starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarity)) {
            return "";
        }
        int i10 = ((TL_stars.TL_starGiftAttributeRarity) starGiftAttributeRarity).permille;
        return i10 <= 0 ? "<0.1%" : xh.i.I0(i10);
    }

    public static boolean K1(int i10, long j10) {
        return j10 >= 0 ? d20.i(i10).e() == j10 : org.telegram.messenger.w3.w(5, vp.r1(i10).L0(Long.valueOf(-j10)));
    }

    public static boolean L1(int i10, long j10) {
        if (j10 >= 0) {
            return d20.i(i10).e() == j10;
        }
        TLRPC.Chat L0 = vp.r1(i10).L0(Long.valueOf(-j10));
        return L0 != null && L0.creator;
    }

    public static boolean M1(int i10, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        if (tL_starGiftUnique == null) {
            return false;
        }
        TLRPC.Peer peer = tL_starGiftUnique.owner_id;
        if (peer == null) {
            peer = tL_starGiftUnique.host_id;
        }
        long o10 = org.telegram.messenger.o5.o(peer);
        if (o10 == 0) {
            return false;
        }
        if (o10 > 0) {
            TLRPC.User Z1 = vp.r1(i10).Z1(Long.valueOf(o10));
            if (Z1 != null) {
                TLRPC.EmojiStatus emojiStatus = Z1.emoji_status;
                return (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) && ((TLRPC.TL_emojiStatusCollectible) emojiStatus).collectible_id == tL_starGiftUnique.id;
            }
        } else {
            TLRPC.Chat L0 = vp.r1(i10).L0(Long.valueOf(-o10));
            if (L0 != null) {
                TLRPC.EmojiStatus emojiStatus2 = L0.emoji_status;
                if ((emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) && ((TLRPC.TL_emojiStatusCollectible) emojiStatus2).collectible_id == tL_starGiftUnique.id) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void c2(org.telegram.ui.ActionBar.k2 k2Var) {
        org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
        if (T == null) {
            return;
        }
        org.telegram.ui.ActionBar.i2 i2Var = new org.telegram.ui.ActionBar.i2();
        i2Var.a = true;
        T.showAsSheet(k2Var, i2Var);
    }

    public static void d1(e4 e4Var) {
        boolean z10;
        TLRPC.Document document;
        boolean z11;
        u5 F;
        TLRPC.Message message;
        vh.d dVar = e4Var.c2;
        if (dVar.Q) {
            return;
        }
        TL_stars.InputSavedStarGift B1 = e4Var.B1();
        jj jjVar = e4Var.z2;
        if (jjVar == null || (message = jjVar.k) == null) {
            TL_stars.SavedStarGift savedStarGift = e4Var.x2;
            if (savedStarGift == null) {
                return;
            }
            z10 = !savedStarGift.unsaved;
            document = savedStarGift.gift.getDocument();
        } else {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                z10 = tL_messageActionStarGift.saved;
                document = tL_messageActionStarGift.gift.getDocument();
            } else {
                if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                    return;
                }
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                z10 = tL_messageActionStarGiftUnique.saved;
                document = tL_messageActionStarGiftUnique.gift.getDocument();
            }
        }
        TLRPC.Document document2 = document;
        boolean z12 = z10;
        dVar.setLoading(true);
        TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
        savestargift.unsave = z12;
        savestargift.stargift = B1;
        if (e4Var.x2 == null || (F = e6.y(e4Var.a, false).F(e4Var.P1, false)) == null) {
            z11 = false;
        } else {
            F.m(e4Var.x2, savestargift.unsave);
            z11 = true;
        }
        ConnectionsManager.getInstance(e4Var.a).sendRequest(savestargift, new oh.g(e4Var, z11, document2, z12, savestargift));
    }

    public static void e1(final e4 e4Var) {
        int i10;
        long o10;
        long j10;
        long j11;
        final long e = d20.i(e4Var.a).e();
        final TL_stars.InputSavedStarGift B1 = e4Var.B1();
        if (B1 == null) {
            return;
        }
        jj jjVar = e4Var.z2;
        if (jjVar != null) {
            i10 = jjVar.k.date;
            boolean P3 = jjVar.P3();
            TLRPC.Message message = e4Var.z2.k;
            if (message == null) {
                return;
            }
            TLRPC.MessageAction messageAction = message.action;
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGift)) {
                return;
            }
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
            TLRPC.Peer peer = tL_messageActionStarGift.peer;
            j11 = peer != null ? org.telegram.messenger.o5.o(peer) : P3 ? jj.B0(message) : e;
            TLRPC.Peer peer2 = tL_messageActionStarGift.from_id;
            o10 = peer2 != null ? org.telegram.messenger.o5.o(peer2) : P3 ? e : jj.B0(e4Var.z2.k);
            j10 = tL_messageActionStarGift.convert_stars;
        } else {
            TL_stars.SavedStarGift savedStarGift = e4Var.x2;
            if (savedStarGift == null) {
                return;
            }
            i10 = savedStarGift.date;
            o10 = ((savedStarGift.flags & 2) == 0 || savedStarGift.name_hidden) ? 2666000L : org.telegram.messenger.o5.o(savedStarGift.from_id);
            j10 = e4Var.x2.convert_stars;
            j11 = e4Var.P1;
        }
        int max = Math.max(1, (vp.r1(e4Var.a).F6 - (ConnectionsManager.getInstance(e4Var.a).getCurrentTime() - i10)) / 86400);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, e4Var.getContext(), e4Var.I0);
        String L0 = cd.L0(2131750235, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        x1Var.R = L0;
        x1Var.T = org.telegram.messenger.i0.W2(cd.G(max, "Gift2ConvertText2", (h20.A(o10) || o10 == 2666000) ? cd.L0(2131744967, null) : org.telegram.messenger.o5.t(o10), cd.H(',', "Gift2ConvertStars", (int) j10)));
        final long j12 = j10;
        final long j13 = j11;
        alertDialog$Builder.k(cd.L0(2131750242, null), new org.telegram.ui.ActionBar.u1() { // from class: rh.e2
            @Override // org.telegram.ui.ActionBar.u1
            public final void h(org.telegram.ui.ActionBar.x1 x1Var2, int i11) {
                e4 e4Var2 = e4.this;
                TL_stars.InputSavedStarGift inputSavedStarGift = B1;
                long j14 = j13;
                long j15 = e;
                long j16 = j12;
                org.telegram.ui.ActionBar.x1 x1Var3 = new org.telegram.ui.ActionBar.x1(3, org.telegram.messenger.w0.b, null);
                x1Var3.r(500L);
                TL_stars.convertStarGift convertstargift = new TL_stars.convertStarGift();
                convertstargift.stargift = inputSavedStarGift;
                ConnectionsManager.getInstance(e4Var2.a).sendRequest(convertstargift, new h1(e4Var2, x1Var3, j14, j15, j16));
            }
        });
        i0.a.s(null, 2131752589, alertDialog$Builder, null);
    }

    public static void f1(e4 e4Var, org.telegram.ui.ActionBar.x1 x1Var, TL_stars.SavedStarGift savedStarGift) {
        if (savedStarGift != null) {
            x1Var.dismiss();
            e4Var.G2 = true;
            e4Var.j2(savedStarGift, null);
            super.show();
            return;
        }
        x1Var.dismiss();
        org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
        if (T != null) {
            wb Q = cc.a0(T).Q(R.raw.error, 36, cd.L0(2131748567, null));
            Q.t = true;
            Q.j();
        }
    }

    public static SpannableStringBuilder f2(String str) {
        int i10;
        int i11;
        int indexOf = str.indexOf("**");
        int indexOf2 = str.indexOf("**", indexOf + 1);
        String replace = str.replace("**", "");
        if (indexOf < 0 || indexOf2 < 0 || (i11 = indexOf2 - indexOf) <= 2) {
            indexOf = -1;
            i10 = 0;
        } else {
            i10 = i11 - 2;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(replace);
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new no(1), indexOf, i10 + indexOf, 0);
        }
        return spannableStringBuilder;
    }

    public static void g1(e4 e4Var, TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift) {
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) tL_payments_uniqueStarGift.gift;
        e4Var.B2 = tL_starGiftUnique;
        e4Var.k2(tL_starGiftUnique, false, null, null);
        super.show();
    }

    public static SpannableStringBuilder g2(String str) {
        if (str == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        SpannableString spannableString = new SpannableString("👌");
        spannableString.setSpan(new dq(R.drawable.filled_understood, 0), 0, spannableString.length(), 33);
        SpannableString spannableString2 = new SpannableString("👍");
        spannableString2.setSpan(new dq(R.drawable.filled_reactions, 0), 0, spannableString2.length(), 33);
        org.telegram.messenger.i0.L2(spannableStringBuilder, spannableString, "👌");
        org.telegram.messenger.i0.L2(spannableStringBuilder, spannableString2, "👍");
        return spannableStringBuilder;
    }

    public static void h1(e4 e4Var, org.telegram.ui.ActionBar.x1 x1Var, jj jjVar) {
        x1Var.dismiss();
        e4Var.E2 = true;
        e4Var.i2(jjVar, null);
        super.show();
    }

    public static void i1(e4 e4Var, boolean z10) {
        int D1 = e4Var.D1();
        if (D1 < 0) {
            return;
        }
        int i10 = (z10 ? 1 : -1) + D1;
        int i11 = e4Var.M2;
        if (i11 >= 0 && (!z10 ? i11 < D1 : i11 > D1)) {
            i10 = i11;
        }
        w5 w5Var = e4Var.y2;
        Object obj = (w5Var == null || i10 < 0 || i10 >= w5Var.e()) ? null : e4Var.y2.get(i10);
        if (obj == null) {
            return;
        }
        if ((z10 ? e4Var.V1 : e4Var.U1) != null) {
            if (obj instanceof TL_stars.SavedStarGift) {
                if (u1((z10 ? e4Var.V1 : e4Var.U1).x2, (TL_stars.SavedStarGift) obj)) {
                    return;
                }
            }
            if (obj instanceof TL_stars.TL_starGiftUnique) {
                if (v1((z10 ? e4Var.V1 : e4Var.U1).B2, (TL_stars.TL_starGiftUnique) obj)) {
                    return;
                }
            }
        }
        ph.w0 w0Var = new ph.w0(e4Var, e4Var.getContext(), e4Var.a, e4Var.P1, e4Var.I0, e4Var.Q1.getRootView());
        if (obj instanceof TL_stars.SavedStarGift) {
            w0Var.j2((TL_stars.SavedStarGift) obj, e4Var.y2);
        } else if (obj instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
            w0Var.h2(tL_starGiftUnique.slug, tL_starGiftUnique, e4Var.y2);
        }
        org.telegram.messenger.i0.E2(w0Var.b);
        if (z10) {
            e4Var.V1 = w0Var;
        } else {
            e4Var.U1 = w0Var;
        }
    }

    public static void k1(wy0 wy0Var, TL_stars.StarGiftAttribute starGiftAttribute) {
        String L0;
        if (starGiftAttribute instanceof TL_stars.starGiftAttributeModel) {
            L0 = cd.L0(2131750396, null);
        } else if (starGiftAttribute instanceof TL_stars.starGiftAttributePattern) {
            L0 = cd.L0(2131750389, null);
        } else if (!(starGiftAttribute instanceof TL_stars.starGiftAttributeBackdrop)) {
            return;
        } else {
            L0 = cd.L0(2131750397, null);
        }
        String str = L0;
        Integer[] numArr = new Integer[1];
        wy0Var.e(str, starGiftAttribute.name, G1(starGiftAttribute.rarity, numArr), null, numArr[0]);
    }

    public static boolean u1(TL_stars.SavedStarGift savedStarGift, TL_stars.SavedStarGift savedStarGift2) {
        if (savedStarGift == savedStarGift2) {
            return true;
        }
        if (savedStarGift == null) {
            return false;
        }
        TL_stars.StarGift starGift = savedStarGift.gift;
        TL_stars.StarGift starGift2 = savedStarGift2.gift;
        if (starGift == starGift2) {
            return true;
        }
        return ((starGift instanceof TL_stars.TL_starGiftUnique) && (starGift2 instanceof TL_stars.TL_starGiftUnique)) ? starGift.id == starGift2.id : (starGift instanceof TL_stars.TL_starGift) && (starGift2 instanceof TL_stars.TL_starGift) && starGift.id == starGift2.id && savedStarGift.date == savedStarGift2.date;
    }

    public static boolean v1(TL_stars.TL_starGiftUnique tL_starGiftUnique, TL_stars.TL_starGiftUnique tL_starGiftUnique2) {
        if (tL_starGiftUnique == tL_starGiftUnique2) {
            return true;
        }
        if (tL_starGiftUnique != null) {
            return tL_starGiftUnique.id == tL_starGiftUnique2.id || TextUtils.equals(tL_starGiftUnique.slug, tL_starGiftUnique2.slug);
        }
        return false;
    }

    public final TL_stars.InputSavedStarGift B1() {
        TLRPC.Message message;
        TLRPC.Message message2;
        TLRPC.Message message3;
        long j10 = this.P1;
        if (j10 < 0) {
            TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat = new TL_stars.TL_inputSavedStarGiftChat();
            tL_inputSavedStarGiftChat.peer = vp.r1(this.a).i1(j10);
            jj jjVar = this.z2;
            if (jjVar == null || (message3 = jjVar.k) == null) {
                TL_stars.SavedStarGift savedStarGift = this.x2;
                if (savedStarGift != null) {
                    if ((savedStarGift.flags & 2048) == 0) {
                        return null;
                    }
                    tL_inputSavedStarGiftChat.saved_id = savedStarGift.saved_id;
                    return tL_inputSavedStarGiftChat;
                }
                if (this.B2 == null || TextUtils.isEmpty(this.A2)) {
                    return tL_inputSavedStarGiftChat;
                }
                TL_stars.TL_inputSavedStarGiftSlug tL_inputSavedStarGiftSlug = new TL_stars.TL_inputSavedStarGiftSlug();
                tL_inputSavedStarGiftSlug.slug = this.A2;
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
        jj jjVar2 = this.z2;
        if (jjVar2 != null && (message2 = jjVar2.k) != null) {
            TLRPC.MessageAction messageAction2 = message2.action;
            if ((messageAction2 instanceof TLRPC.TL_messageActionStarGift) && (messageAction2.flags & TLObject.FLAG_12) != 0) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift2 = (TLRPC.TL_messageActionStarGift) messageAction2;
                TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat2 = new TL_stars.TL_inputSavedStarGiftChat();
                vp r12 = vp.r1(this.a);
                TLRPC.Peer peer = tL_messageActionStarGift2.peer;
                tL_inputSavedStarGiftChat2.peer = r12.i1(peer != null ? org.telegram.messenger.o5.o(peer) : jj.B0(this.z2.k));
                tL_inputSavedStarGiftChat2.saved_id = tL_messageActionStarGift2.saved_id;
                return tL_inputSavedStarGiftChat2;
            }
        }
        if (jjVar2 != null && (message = jjVar2.k) != null) {
            TLRPC.MessageAction messageAction3 = message.action;
            if ((messageAction3 instanceof TLRPC.TL_messageActionStarGiftUnique) && (messageAction3.flags & 128) != 0) {
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique2 = (TLRPC.TL_messageActionStarGiftUnique) messageAction3;
                TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat3 = new TL_stars.TL_inputSavedStarGiftChat();
                vp r13 = vp.r1(this.a);
                TLRPC.Peer peer2 = tL_messageActionStarGiftUnique2.peer;
                tL_inputSavedStarGiftChat3.peer = r13.i1(peer2 != null ? org.telegram.messenger.o5.o(peer2) : jj.B0(this.z2.k));
                tL_inputSavedStarGiftChat3.saved_id = tL_messageActionStarGiftUnique2.saved_id;
                return tL_inputSavedStarGiftChat3;
            }
        }
        TL_stars.TL_inputSavedStarGiftUser tL_inputSavedStarGiftUser = new TL_stars.TL_inputSavedStarGiftUser();
        jj jjVar3 = this.z2;
        if (jjVar3 != null) {
            TLRPC.Message message4 = jjVar3.k;
            if (message4 != null) {
                TLRPC.MessageAction messageAction4 = message4.action;
                if ((messageAction4 instanceof TLRPC.TL_messageActionStarGift) && (messageAction4.flags & 32768) != 0) {
                    tL_inputSavedStarGiftUser.msg_id = ((TLRPC.TL_messageActionStarGift) messageAction4).gift_msg_id;
                    return tL_inputSavedStarGiftUser;
                }
            }
            tL_inputSavedStarGiftUser.msg_id = jjVar3.f1();
            return tL_inputSavedStarGiftUser;
        }
        TL_stars.SavedStarGift savedStarGift2 = this.x2;
        if (savedStarGift2 != null) {
            tL_inputSavedStarGiftUser.msg_id = savedStarGift2.msg_id;
            return tL_inputSavedStarGiftUser;
        }
        if (this.B2 == null || TextUtils.isEmpty(this.A2)) {
            return tL_inputSavedStarGiftUser;
        }
        TL_stars.TL_inputSavedStarGiftSlug tL_inputSavedStarGiftSlug2 = new TL_stars.TL_inputSavedStarGiftSlug();
        tL_inputSavedStarGiftSlug2.slug = this.A2;
        return tL_inputSavedStarGiftSlug2;
    }

    public final String C1() {
        TL_stars.StarGift y12 = y1();
        if (!(y12 instanceof TL_stars.TL_starGiftUnique) || y12.slug == null) {
            return null;
        }
        return vp.r1(this.a).U2 + "/nft/" + y12.slug;
    }

    public final int D1() {
        int indexOf;
        w5 w5Var = this.y2;
        if (w5Var == null) {
            return -1;
        }
        TL_stars.SavedStarGift savedStarGift = this.x2;
        if (savedStarGift != null) {
            indexOf = w5Var.indexOf(savedStarGift);
        } else {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.B2;
            if (tL_starGiftUnique == null) {
                return -1;
            }
            indexOf = w5Var.indexOf(tL_starGiftUnique);
        }
        if (indexOf >= 0) {
            return indexOf;
        }
        TL_stars.StarGift y12 = y1();
        for (int i10 = 0; i10 < this.y2.e(); i10++) {
            Object obj = this.y2.get(i10);
            if (obj instanceof TL_stars.SavedStarGift) {
                TL_stars.SavedStarGift savedStarGift2 = this.x2;
                if (savedStarGift2 != null) {
                    if (u1(savedStarGift2, (TL_stars.SavedStarGift) obj)) {
                        return i10;
                    }
                }
                if (y12 != null) {
                    TL_stars.StarGift starGift = ((TL_stars.SavedStarGift) obj).gift;
                    if (y12 != starGift) {
                        if ((y12 instanceof TL_stars.TL_starGiftUnique) && (starGift instanceof TL_stars.TL_starGiftUnique) && y12.id == starGift.id) {
                        }
                    }
                    return i10;
                }
                continue;
            } else {
                if ((obj instanceof TL_stars.TL_starGiftUnique) && v1(this.B2, (TL_stars.TL_starGiftUnique) obj)) {
                    return i10;
                }
            }
        }
        return -1;
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void E0(int i10) {
        super.E0(i10);
        org.telegram.messenger.i0.t3(this, 0, false, null);
    }

    public final TL_stars.SavedStarGift E1(boolean z10) {
        int D1 = D1();
        if (D1 < 0) {
            return null;
        }
        int i10 = (z10 ? 1 : -1) + D1;
        int i11 = this.M2;
        if (i11 >= 0 && (!z10 ? i11 < D1 : i11 > D1)) {
            i10 = i11;
        }
        w5 w5Var = this.y2;
        Object obj = (w5Var == null || i10 < 0 || i10 >= w5Var.e()) ? null : this.y2.get(i10);
        if (obj instanceof TL_stars.SavedStarGift) {
            return (TL_stars.SavedStarGift) obj;
        }
        return null;
    }

    public final TL_stars.TL_starGiftUnique F1(boolean z10) {
        int D1 = D1();
        if (D1 < 0) {
            return null;
        }
        int i10 = (z10 ? 1 : -1) + D1;
        int i11 = this.M2;
        if (i11 >= 0 && (!z10 ? i11 < D1 : i11 > D1)) {
            i10 = i11;
        }
        w5 w5Var = this.y2;
        Object obj = (w5Var == null || i10 < 0 || i10 >= w5Var.e()) ? null : this.y2.get(i10);
        if (obj instanceof TL_stars.TL_starGiftUnique) {
            return (TL_stars.TL_starGiftUnique) obj;
        }
        return null;
    }

    @Override // org.telegram.ui.Components.ha, org.telegram.ui.ActionBar.z2
    public final boolean H() {
        if (this.T2.c(4)) {
            boolean z10 = this.X1.M.h0;
        }
        return false;
    }

    public final TL_stars.TL_starGiftUnique H1() {
        TL_stars.StarGift y12 = y1();
        if (y12 instanceof TL_stars.TL_starGiftUnique) {
            return (TL_stars.TL_starGiftUnique) y12;
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final boolean I() {
        if (this.T2.c(4) && this.X1.M.h0) {
            return false;
        }
        return this.c0;
    }

    public final boolean I1(boolean z10) {
        return (E1(z10) == null && F1(z10) == null) ? false : true;
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final boolean J(MotionEvent motionEvent) {
        if (this.T2.c(4)) {
            boolean z10 = this.X1.M.h0;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void J1(byte[] bArr, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, org.telegram.ui.Wallet.u1 u1Var) {
        TL_stars.getStarGiftWithdrawalUrl getstargiftwithdrawalurl;
        TL_stars.InputSavedStarGift B1 = B1();
        if (B1 == null) {
            if (u1Var != null) {
                u1Var.a(Boolean.FALSE);
                return;
            }
            return;
        }
        if (z10) {
            TL_stars.withdrawStarGift withdrawstargift = new TL_stars.withdrawStarGift();
            withdrawstargift.keep_on_profile = this.p3;
            withdrawstargift.stargift = B1;
            withdrawstargift.tmp_password = bArr;
            getstargiftwithdrawalurl = withdrawstargift;
        } else {
            TL_stars.getStarGiftWithdrawalUrl getstargiftwithdrawalurl2 = new TL_stars.getStarGiftWithdrawalUrl();
            getstargiftwithdrawalurl2.stargift = B1;
            getstargiftwithdrawalurl2.tmp_password = bArr;
            getstargiftwithdrawalurl = getstargiftwithdrawalurl2;
        }
        ConnectionsManager.getInstance(this.a).sendRequest(getstargiftwithdrawalurl, new org.telegram.messenger.s6(this, u1Var, twoStepVerificationActivity, z10, 6));
    }

    @Override // org.telegram.ui.Components.ha
    public final sk0 L0(tk0 tk0Var) {
        kg.f fVar = new kg.f(this, 9);
        this.L2 = fVar;
        return fVar;
    }

    @Override // org.telegram.ui.Components.ha
    public final int N0() {
        return org.telegram.messenger.i0.L(12.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        if (r4 != 0) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N1() {
        long e;
        TL_stars.TL_starGiftUnique H1 = H1();
        vh.d dVar = this.c2;
        if (dVar.Q || H1 == null) {
            return;
        }
        if (this.B2 != null && this.C2) {
            e = this.P1;
        }
        e = d20.i(this.a).e();
        sf.b bVar = H1.resale_ton_only ? sf.b.b : sf.b.a;
        if (this.B2 == null || !this.C2) {
            dVar.setLoading(true);
            long j10 = e;
            e6.x(this.a, bVar).H(H1, j10, null, true, new c1(this, null, bVar, H1, j10, null, true));
        } else {
            ph.k0 k0Var = new ph.k0(getContext(), this.I0, H1, e);
            k0Var.B1 = new lh(this, k0Var, H1, e, bVar, 3);
            k0Var.show();
        }
    }

    @Override // org.telegram.ui.Components.ha
    public final CharSequence O0() {
        return this.N2;
    }

    public final void O1() {
        h2 h2Var = this.R2;
        if (h2Var != null && !h2Var.I) {
            h2Var.dismiss();
        }
        String C1 = C1();
        h2 h2Var2 = new h2(this, getContext(), C1, C1, this.I0);
        this.R2 = h2Var2;
        h2Var2.k2 = new r2.y(this, 2);
        h2Var2.show();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x007f, code lost:
    
        if (((org.telegram.tgnet.TLRPC.TL_messageActionStarGiftUnique) r4).can_craft_at > 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0090, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008e, code lost:
    
        if (r4.can_craft_at > 0) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void P1() {
        TL_stars.TL_starGiftUnique H1;
        this.Y1.setAlpha(this.T2.a(0));
        this.k2.setAlpha(this.T2.a(1));
        this.t2.setAlpha(this.T2.a(2));
        this.v2.setAlpha(this.T2.a(3));
        float a2 = 1.0f - this.T2.a(4);
        FrameLayout frameLayout = this.d2;
        frameLayout.setAlpha(a2);
        f4.d dVar = this.T2;
        y3 y3Var = this.X1;
        y3Var.d(dVar);
        ImageView imageView = y3Var.Q;
        if (this.T2.c(0) && (H1 = H1()) != null && !H1.crafted && L1(this.a, org.telegram.messenger.o5.o(H1.owner_id))) {
            jj jjVar = this.z2;
            if (jjVar != null) {
                TLRPC.Message message = jjVar.k;
                if (message != null) {
                    TLRPC.MessageAction messageAction = message.action;
                    if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                    }
                }
            } else {
                TL_stars.SavedStarGift savedStarGift = this.x2;
                if (savedStarGift != null) {
                    if (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique) {
                    }
                }
            }
            imageView.setVisibility(r4);
            jg.b1 b1Var = this.Q1;
            float f7 = b1Var.f();
            this.W1.setAlpha(this.T2.a(0) * Utilities.l(org.telegram.messenger.i0.z1(f7 - r6.getHeight(), 0.0f, org.telegram.messenger.i0.L(32.0f))));
            b1Var.g();
            b1Var.invalidate();
            frameLayout.setVisibility(this.T2.c(4) ? 8 : 0);
            u2();
        }
        int i10 = 8;
        imageView.setVisibility(i10);
        jg.b1 b1Var2 = this.Q1;
        float f72 = b1Var2.f();
        this.W1.setAlpha(this.T2.a(0) * Utilities.l(org.telegram.messenger.i0.z1(f72 - r6.getHeight(), 0.0f, org.telegram.messenger.i0.L(32.0f))));
        b1Var2.g();
        b1Var2.invalidate();
        frameLayout.setVisibility(this.T2.c(4) ? 8 : 0);
        u2();
    }

    public final void Q1(TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10) {
        int i10;
        if (getContext() == null) {
            return;
        }
        if (tL_error == null) {
            if (twoStepVerificationActivity != null) {
                twoStepVerificationActivity.s0();
            }
            cc.b0("NULL_ERROR");
            return;
        }
        int i11 = 1;
        if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
            if ("SRP_ID_INVALID".equals(tL_error.text)) {
                ConnectionsManager.getInstance(this.a).sendRequest(new TL_account.getPassword(), new a2(this, twoStepVerificationActivity, z10, i11), 8);
                return;
            }
            if (twoStepVerificationActivity != null) {
                twoStepVerificationActivity.s0();
                twoStepVerificationActivity.finishFragment();
            }
            cc.d0(tL_error);
            return;
        }
        if (twoStepVerificationActivity != null) {
            twoStepVerificationActivity.s0();
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        String L0 = cd.L0(2131749909, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        x1Var.R = L0;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setPadding(org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(24.0f), 0);
        linearLayout.setOrientation(1);
        alertDialog$Builder.o(linearLayout);
        TextView textView = new TextView(getContext());
        int i12 = org.telegram.ui.ActionBar.t6.j5;
        org.telegram.ui.ActionBar.a7.V(textView, i12, null);
        textView.setTextSize(1, 16.0f);
        textView.setGravity((cd.X ? 5 : 3) | 48);
        textView.setText(org.telegram.messenger.i0.W2(cd.L0(2131749913, null)));
        linearLayout.addView(textView, w7.b6.o(-1, -2));
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, w7.b6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.list_circle);
        imageView.setPadding(cd.X ? org.telegram.messenger.i0.L(11.0f) : 0, org.telegram.messenger.i0.L(9.0f), cd.X ? 0 : org.telegram.messenger.i0.L(11.0f), 0);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.a7.t(imageView, i12, null, mode);
        TextView textView2 = new TextView(getContext());
        org.telegram.ui.ActionBar.a7.V(textView2, i12, null);
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity((cd.X ? 5 : 3) | 48);
        textView2.setText(org.telegram.messenger.i0.W2(cd.L0(2131749912, null)));
        if (cd.X) {
            linearLayout2.addView(textView2, w7.b6.o(-1, -2));
            linearLayout2.addView(imageView, w7.b6.r(-2, -2, 5));
        } else {
            linearLayout2.addView(imageView, w7.b6.o(-2, -2));
            linearLayout2.addView(textView2, w7.b6.o(-1, -2));
        }
        LinearLayout linearLayout3 = new LinearLayout(getContext());
        linearLayout3.setOrientation(0);
        linearLayout.addView(linearLayout3, w7.b6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setImageResource(R.drawable.list_circle);
        imageView2.setPadding(cd.X ? org.telegram.messenger.i0.L(11.0f) : 0, org.telegram.messenger.i0.L(9.0f), cd.X ? 0 : org.telegram.messenger.i0.L(11.0f), 0);
        org.telegram.ui.ActionBar.a7.t(imageView2, i12, null, mode);
        TextView textView3 = new TextView(getContext());
        org.telegram.ui.ActionBar.a7.V(textView3, i12, null);
        textView3.setTextSize(1, 16.0f);
        textView3.setGravity((cd.X ? 5 : 3) | 48);
        textView3.setText(org.telegram.messenger.i0.W2(cd.L0(2131749911, null)));
        if (cd.X) {
            linearLayout3.addView(textView3, w7.b6.o(-1, -2));
            i10 = 5;
            linearLayout3.addView(imageView2, w7.b6.r(-2, -2, 5));
        } else {
            i10 = 5;
            linearLayout3.addView(imageView2, w7.b6.o(-2, -2));
            linearLayout3.addView(textView3, w7.b6.o(-1, -2));
        }
        if ("PASSWORD_MISSING".equals(tL_error.text)) {
            alertDialog$Builder.k(cd.L0(2131749908, null), new org.telegram.utils.twidget.t(this, 27));
            alertDialog$Builder.h(cd.L0(2131752589, null), null);
        } else {
            TextView textView4 = new TextView(getContext());
            org.telegram.ui.ActionBar.a7.V(textView4, i12, null);
            textView4.setTextSize(1, 16.0f);
            org.telegram.messenger.m5.l(textView4, (cd.X ? i10 : 3) | 48, null, 2131749910);
            linearLayout.addView(textView4, w7.b6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            alertDialog$Builder.h(cd.L0(2131747847, null), null);
        }
        if (twoStepVerificationActivity != null) {
            twoStepVerificationActivity.showDialog(x1Var);
        } else {
            alertDialog$Builder.p();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f6 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R1() {
        int i10;
        CharSequence V;
        int i11;
        long j10;
        String str;
        String str2;
        String str3;
        long j11;
        String str4;
        TL_wallet.nftItem nftitem;
        String str5;
        org.telegram.ui.Wallet.i5 i5Var = this.Y2;
        if (i5Var == null) {
            return;
        }
        i10 = ((org.telegram.ui.ActionBar.k2) i5Var.c).currentAccount;
        if (!org.telegram.ui.Wallet.h8.F(i10, i5Var.a.slug)) {
            org.telegram.ui.Wallet.i5 i5Var2 = this.Y2;
            org.telegram.ui.Wallet.h8 h8Var = i5Var2.c.j0;
            if (h8Var == null || (nftitem = i5Var2.b) == null || (str5 = nftitem.address) == null || !str5.equals(h8Var.P0)) {
                Context context = getContext();
                int i12 = this.a;
                cc k10 = k();
                org.telegram.ui.ActionBar.p6 p6Var = this.I0;
                TL_stars.TL_starGiftUnique H1 = H1();
                ArrayList arrayList = new ArrayList(((org.telegram.messenger.r0) vp.r1(i12).y7.m0.a).c);
                if (arrayList.isEmpty()) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                boolean z10 = 0;
                int i13 = 0;
                while (i13 < size) {
                    int i14 = i13 + 1;
                    String str6 = (String) arrayList.get(i13);
                    String str7 = "[^\\p{L}\\p{N}]";
                    String replaceAll = str6.replaceAll("[^\\p{L}\\p{N}]", "");
                    Locale locale = Locale.ROOT;
                    String lowerCase = replaceAll.toLowerCase(locale);
                    if (H1 == null || (str4 = H1.title) == null || !lowerCase.equals(str4.replaceAll("[^\\p{L}\\p{N}]", "").toLowerCase(locale))) {
                        e6 y3 = e6.y(i12, z10);
                        y3.U();
                        ArrayList arrayList3 = y3.H;
                        int size2 = arrayList3.size();
                        ArrayList arrayList4 = arrayList3;
                        int i15 = z10;
                        while (i15 < size2) {
                            Object obj = arrayList4.get(i15);
                            int i16 = i15 + 1;
                            ArrayList arrayList5 = arrayList4;
                            TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                            if (starGift != null) {
                                i11 = i12;
                                String str8 = starGift.title;
                                if (str8 != null) {
                                    str2 = str7;
                                    if (lowerCase.equals(str8.replaceAll(str7, "").toLowerCase(Locale.ROOT))) {
                                        str3 = starGift.title;
                                        j11 = starGift.id;
                                    }
                                } else {
                                    str2 = str7;
                                }
                            } else {
                                str2 = str7;
                                i11 = i12;
                            }
                            i12 = i11;
                            arrayList4 = arrayList5;
                            str7 = str2;
                            i15 = i16;
                        }
                        i11 = i12;
                        j10 = 0;
                        str = null;
                        if (str != null) {
                            str = str6.replaceAll("(?<=[a-z0-9])(?=[A-Z])", " ");
                        }
                        String str9 = str;
                        SpannableString spannableString = new SpannableString(str9);
                        i12 = i11;
                        spannableString.setSpan(new i2(new boolean[1], i12, context, p6Var, j10, str9, str6), 0, spannableString.length(), 33);
                        arrayList2.add(spannableString);
                        z10 = 0;
                        i13 = i14;
                    } else {
                        str3 = H1.title;
                        j11 = H1.gift_id;
                        i11 = i12;
                    }
                    str = str3;
                    j10 = j11;
                    if (str != null) {
                    }
                    String str92 = str;
                    SpannableString spannableString2 = new SpannableString(str92);
                    i12 = i11;
                    spannableString2.setSpan(new i2(new boolean[1], i12, context, p6Var, j10, str92, str6), 0, spannableString2.length(), 33);
                    arrayList2.add(spannableString2);
                    z10 = 0;
                    i13 = i14;
                }
                int i17 = z10;
                if (arrayList2.size() == 1) {
                    Object[] objArr = new Object[1];
                    objArr[i17] = arrayList2.get(i17);
                    V = cd.V(null, null, 2131743133, objArr);
                } else {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    int i18 = 0;
                    for (int i19 = 1; i18 < arrayList2.size() - i19; i19 = 1) {
                        if (i18 > 0) {
                            spannableStringBuilder.append((CharSequence) ", ");
                        }
                        spannableStringBuilder.append((CharSequence) arrayList2.get(i18));
                        i18++;
                    }
                    V = cd.V(null, null, 2131743134, spannableStringBuilder, i0.a.g(1, arrayList2));
                }
                wb M = k10.M(context.getResources().getDrawable(R.drawable.filled_card_color_28).mutate(), V);
                bb bbVar = M.e;
                if (bbVar instanceof eb) {
                    TextView textView = ((eb) bbVar).b;
                    textView.setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
                    textView.setEllipsize(null);
                }
                M.j();
                return;
            }
        }
        org.telegram.ui.Wallet.i5 i5Var3 = this.Y2;
        dismiss();
        Objects.requireNonNull(i5Var3);
        org.telegram.messenger.i0.h3(new ph.x1(i5Var3, 14), 250L);
    }

    public final void S1() {
        if (d20.i(this.a).q() && (M1(this.a, H1()) || this.Q2)) {
            t2(false);
            return;
        }
        TL_stars.TL_starGiftUnique H1 = H1();
        if (H1 == null) {
            return;
        }
        TLRPC.Peer peer = H1.owner_id;
        if (peer == null) {
            peer = H1.host_id;
        }
        long o10 = org.telegram.messenger.o5.o(peer);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(H1.title);
        sb2.append(" #");
        this.u2.setText(cd.a0(null, null, 2131749842, i0.a.k(H1.num, ',', sb2)));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(cd.L0(2131749844, null));
        if (!d20.i(this.a).q()) {
            spannableStringBuilder.append((CharSequence) " l");
            if (this.P2 == null) {
                this.P2 = new dq(R.drawable.msg_mini_lock3, 0);
            }
            spannableStringBuilder.setSpan(this.P2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        vh.d dVar = this.c2;
        dVar.i(spannableStringBuilder, true, true);
        dVar.g(null, true);
        dVar.setOnClickListener(new v0(this, 4));
        this.X1.setWearPreview(vp.r1(this.a).d2(o10));
        s2(2, true, null);
    }

    public final void T1(boolean z10) {
        int i10;
        jj jjVar = this.z2;
        int i11 = 0;
        if (jjVar != null) {
            TLRPC.Message message = jjVar.k;
            if (message != null) {
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                    i10 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction).can_craft_at;
                }
            }
            i10 = 0;
        } else {
            TL_stars.SavedStarGift savedStarGift = this.x2;
            if (savedStarGift != null) {
                i10 = savedStarGift.can_craft_at;
            }
            i10 = 0;
        }
        int i12 = 1;
        if (i10 > ConnectionsManager.getInstance(this.a).getCurrentTime()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.I0);
            String L0 = cd.L0(2131749786, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
            x1Var.R = L0;
            x1Var.T = cd.a0(null, null, 2131749787, cd.x(i10, true));
            i0.a.w(null, 2131747847, alertDialog$Builder, null);
            return;
        }
        TL_stars.TL_starGiftUnique H1 = H1();
        if (H1 == null) {
            return;
        }
        if (!TextUtils.isEmpty(H1.gift_address)) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, getContext(), this.I0);
            String L02 = cd.L0(2131749801, null);
            org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.a;
            x1Var2.R = L02;
            x1Var2.T = cd.L0(2131749802, null);
            i0.a.w(null, 2131747847, alertDialog$Builder2, null);
            return;
        }
        y3 y3Var = this.X1;
        if (z10) {
            y3Var.M.a(this.a, H1.gift_id, H1.getDocument(), H1.title);
            if (o1()) {
                a3 a3Var = y3Var.M;
                TL_stars.TL_starGiftUnique H12 = H1();
                if (H12 == null) {
                    a3Var.getClass();
                } else {
                    while (true) {
                        y2[] y2VarArr = a3Var.n;
                        if (i11 >= y2VarArr.length) {
                            break;
                        }
                        y2 y2Var = y2VarArr[i11];
                        TL_stars.StarGift starGift = y2Var.h;
                        if (starGift == null) {
                            starGift = null;
                        }
                        if (starGift == null) {
                            y2Var.a(H12, true);
                            break;
                        }
                        i11++;
                    }
                    a3Var.d(true);
                }
            }
        }
        a3 a3Var2 = y3Var.M;
        a3 a3Var3 = y3Var.M;
        a3Var2.setOnCraft(new b1(this, i12));
        if (this.O2 == null) {
            ph.p3 p3Var = new ph.p3(this.a, H1.gift_id);
            this.O2 = p3Var;
            p3Var.a();
        }
        a3Var3.setOnAddGift(new d2(this, H1, i12));
        a3Var3.setOnClose(new w0(this, 23));
        s2(4, true, null);
    }

    public final void U1(long j10) {
        vh.p2 p2Var = this.q3;
        if (p2Var != null) {
            p2Var.e(true);
            this.q3 = null;
        }
        dismiss();
        org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
        if (T == null || h20.A(j10)) {
            return;
        }
        Bundle bundle = new Bundle();
        if (j10 > 0) {
            bundle.putLong("user_id", j10);
            if (j10 == d20.i(this.a).e()) {
                bundle.putBoolean("my_profile", true);
            }
        } else {
            bundle.putLong("chat_id", -j10);
        }
        bundle.putBoolean("open_gifts", true);
        T.presentFragment(new ProfileActivity(bundle, null));
    }

    public final void V1(boolean z10, gf.e eVar, Runnable runnable) {
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        int i10 = z10 ? 3 : 2;
        ag.v0 v0Var = new ag.v0(this, twoStepVerificationActivity, z10, 11);
        twoStepVerificationActivity.Z = i10;
        twoStepVerificationActivity.b0 = v0Var;
        twoStepVerificationActivity.a0 = z1();
        twoStepVerificationActivity.w0(new u41(this, runnable, eVar, twoStepVerificationActivity));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W1() {
        int i10;
        TLRPC.Message message;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        int i11;
        da daVar;
        mg.e2 e2Var;
        int i12;
        TLRPC.Message message2;
        TLRPC.Message message3;
        vh.p2 p2Var = this.q3;
        if (p2Var != null) {
            p2Var.e(true);
            this.q3 = null;
        }
        jj jjVar = this.z2;
        if (jjVar != null && (message3 = jjVar.k) != null) {
            TLRPC.MessageAction messageAction = message3.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                i10 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction).can_transfer_at;
                if (i10 <= ConnectionsManager.getInstance(this.a).getCurrentTime()) {
                    Context context = getContext();
                    jj jjVar2 = this.z2;
                    if (jjVar2 != null && (message2 = jjVar2.k) != null) {
                        TLRPC.MessageAction messageAction2 = message2.action;
                        if (messageAction2 instanceof TLRPC.TL_messageActionStarGiftUnique) {
                            i12 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction2).can_transfer_at;
                            q2(i12 - ConnectionsManager.getInstance(this.a).getCurrentTime(), context, false);
                            return;
                        }
                    }
                    TL_stars.SavedStarGift savedStarGift = this.x2;
                    i12 = savedStarGift != null ? savedStarGift.can_transfer_at : 0;
                    q2(i12 - ConnectionsManager.getInstance(this.a).getCurrentTime(), context, false);
                    return;
                }
                TL_stars.SavedStarGift savedStarGift2 = this.x2;
                if (savedStarGift2 != null) {
                    TL_stars.StarGift starGift = savedStarGift2.gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                        i11 = savedStarGift2.can_export_at;
                        TL_stars.TL_starGiftUnique tL_starGiftUnique2 = tL_starGiftUnique;
                        int currentTime = ConnectionsManager.getInstance(this.a).getCurrentTime();
                        Context context2 = getContext();
                        int i13 = this.a;
                        mg.i2[] i2VarArr = {new mg.i2(context2, i13, org.telegram.messenger.y1.a(i13).b(), 3, this.I0)};
                        mg.i2 i2Var = i2VarArr[0];
                        i2Var.r2 = cd.L0(2131749923, null);
                        daVar = i2Var.l1;
                        if (daVar != null) {
                            daVar.setTitle(i2Var.O0());
                        }
                        e2Var = i2Var.T1;
                        if (e2Var != null) {
                            e2Var.setText(i2Var.O0());
                        }
                        int max = currentTime <= i11 ? 0 : Math.max(1, Math.round(Math.max(0, i11 - currentTime) / 86400.0f));
                        mg.i2 i2Var2 = i2VarArr[0];
                        i2Var2.z2 = true;
                        i2Var2.A2 = max;
                        i2Var2.o1(false, true);
                        mg.i2 i2Var3 = i2VarArr[0];
                        i2Var3.t2 = new org.telegram.ui.Components.h2(this, currentTime, i11, max, i2VarArr, tL_starGiftUnique2);
                        i2Var3.show();
                        return;
                    }
                }
                jj jjVar3 = this.z2;
                if (jjVar3 == null || (message = jjVar3.k) == null) {
                    return;
                }
                TLRPC.MessageAction messageAction3 = message.action;
                if (messageAction3 instanceof TLRPC.TL_messageActionStarGiftUnique) {
                    TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction3;
                    TL_stars.StarGift starGift2 = tL_messageActionStarGiftUnique.gift;
                    if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                        tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift2;
                        i11 = tL_messageActionStarGiftUnique.can_export_at;
                        TL_stars.TL_starGiftUnique tL_starGiftUnique22 = tL_starGiftUnique;
                        int currentTime2 = ConnectionsManager.getInstance(this.a).getCurrentTime();
                        Context context22 = getContext();
                        int i132 = this.a;
                        mg.i2[] i2VarArr2 = {new mg.i2(context22, i132, org.telegram.messenger.y1.a(i132).b(), 3, this.I0)};
                        mg.i2 i2Var4 = i2VarArr2[0];
                        i2Var4.r2 = cd.L0(2131749923, null);
                        daVar = i2Var4.l1;
                        if (daVar != null) {
                        }
                        e2Var = i2Var4.T1;
                        if (e2Var != null) {
                        }
                        if (currentTime2 <= i11) {
                        }
                        mg.i2 i2Var22 = i2VarArr2[0];
                        i2Var22.z2 = true;
                        i2Var22.A2 = max;
                        i2Var22.o1(false, true);
                        mg.i2 i2Var32 = i2VarArr2[0];
                        i2Var32.t2 = new org.telegram.ui.Components.h2(this, currentTime2, i11, max, i2VarArr2, tL_starGiftUnique22);
                        i2Var32.show();
                        return;
                    }
                    return;
                }
                return;
            }
        }
        TL_stars.SavedStarGift savedStarGift3 = this.x2;
        i10 = savedStarGift3 != null ? savedStarGift3.can_transfer_at : 0;
        if (i10 <= ConnectionsManager.getInstance(this.a).getCurrentTime()) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void X1(long j10, long j11, boolean z10, q20 q20Var) {
        String str;
        TLRPC.Chat chat;
        TL_stars.TL_starGiftUnique H1 = H1();
        if (H1 == null) {
            return;
        }
        if (j10 >= 0) {
            TLRPC.User Z1 = vp.r1(this.a).Z1(Long.valueOf(j10));
            str = h20.k(Z1);
            chat = Z1;
        } else {
            TLRPC.Chat L0 = vp.r1(this.a).L0(Long.valueOf(-j10));
            if (L0 == null) {
                str = "";
                chat = L0;
            } else {
                str = L0.title;
                chat = L0;
            }
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        int i10 = 1;
        linearLayout.setOrientation(1);
        linearLayout.addView(new c3(getContext(), H1, chat), w7.b6.t(-1, -2, 48, 0, -4, 0, 0));
        TextView textView = new TextView(getContext());
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.j5, this.I0);
        textView.setTextSize(1, 16.0f);
        textView.setText(org.telegram.messenger.i0.W2(j11 > 0 ? cd.K("Gift2TransferPriceText", (int) j11, ',', z1(), org.telegram.messenger.o5.t(j10)) : cd.a0(null, null, 2131749922, z1(), str)));
        linearLayout.addView(textView, w7.b6.t(-1, -2, 48, 24, 4, 24, 4));
        wy0 wy0Var = new wy0(getContext(), this.I0);
        k1(wy0Var, e6.l(H1.attributes, TL_stars.starGiftAttributeModel.class));
        k1(wy0Var, e6.l(H1.attributes, TL_stars.starGiftAttributeBackdrop.class));
        k1(wy0Var, e6.l(H1.attributes, TL_stars.starGiftAttributePattern.class));
        if (!TextUtils.isEmpty(H1.slug) && (H1.flags & 256) != 0) {
            org.telegram.messenger.u1 i11 = org.telegram.messenger.u1.i();
            long j12 = H1.value_amount;
            String str2 = H1.value_currency;
            int h = org.telegram.messenger.u1.i().h(H1.value_currency);
            i11.getClass();
            wy0Var.c(cd.L0(2131749600, null), sc.e.h("~", org.telegram.messenger.u1.g(str2, h, j12, true)), null, null);
        }
        linearLayout.addView(wy0Var, w7.b6.t(-1, -2, 48, 23, 16, 23, 4));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.I0);
        alertDialog$Builder.o(linearLayout);
        alertDialog$Builder.k(j11 > 0 ? h8.S0(cd.a0(null, null, 2131749929, Integer.valueOf((int) j11))) : cd.L0(2131749930, null), new d0(q20Var, i10));
        alertDialog$Builder.h(cd.L0(2131752589, null), null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        x1Var.Z0 = z10;
        x1Var.show();
    }

    public final void Y1(long j10, q20 q20Var) {
        TLRPC.Message message;
        long j11;
        TL_stars.SavedStarGift savedStarGift = this.x2;
        if (savedStarGift == null || !(savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
            jj jjVar = this.z2;
            if (jjVar == null || (message = jjVar.k) == null) {
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
                j11 = tL_messageActionStarGiftUnique.transfer_stars;
            }
        } else {
            j11 = savedStarGift.transfer_stars;
        }
        X1(j10, j11, true, q20Var);
    }

    @Override // org.telegram.ui.Components.ha
    public final boolean Z0() {
        return false;
    }

    public final void Z1() {
        TL_stars.InputSavedStarGift B1;
        long j10;
        long j11;
        long j12;
        boolean z10;
        boolean z11;
        boolean z12;
        String str;
        boolean z13;
        vh.p2 p2Var = this.q3;
        if (p2Var != null) {
            p2Var.e(true);
            this.q3 = null;
        }
        if (this.U2 == null && (B1 = B1()) != null) {
            jj jjVar = this.z2;
            long j13 = this.P1;
            if (jjVar != null) {
                TLRPC.MessageAction messageAction = jjVar.k.action;
                if (!(messageAction instanceof TLRPC.TL_messageActionStarGift)) {
                    return;
                }
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                j11 = tL_messageActionStarGift.gift.id;
                j12 = tL_messageActionStarGift.upgrade_stars;
                z10 = tL_messageActionStarGift.name_hidden;
                TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageActionStarGift.message;
                z11 = (tL_textWithEntities == null || TextUtils.isEmpty(tL_textWithEntities.text)) ? false : true;
                j10 = 0;
                z12 = tL_messageActionStarGift.peer instanceof TLRPC.TL_peerChannel;
                str = tL_messageActionStarGift.prepaid_upgrade_hash;
                z13 = tL_messageActionStarGift.prepaid_upgrade ? org.telegram.messenger.o5.o(tL_messageActionStarGift.from_id) != this.z2.Z0() : tL_messageActionStarGift.upgrade_separate;
            } else {
                j10 = 0;
                TL_stars.SavedStarGift savedStarGift = this.x2;
                if (savedStarGift == null) {
                    return;
                }
                TL_stars.StarGift starGift = savedStarGift.gift;
                j11 = starGift.id;
                j12 = savedStarGift.upgrade_stars;
                z10 = (starGift instanceof TL_stars.TL_starGift) && savedStarGift.name_hidden;
                TLRPC.TL_textWithEntities tL_textWithEntities2 = savedStarGift.message;
                z11 = (tL_textWithEntities2 == null || TextUtils.isEmpty(tL_textWithEntities2.text)) ? false : true;
                z12 = j13 < 0;
                TL_stars.SavedStarGift savedStarGift2 = this.x2;
                str = savedStarGift2.prepaid_upgrade_hash;
                z13 = savedStarGift2.upgrade_separate;
            }
            TextView textView = this.p2;
            if (z10) {
                textView.setText(cd.L0(z12 ? 2131750407 : 2131750408, null));
            } else if (z11) {
                textView.setText(cd.L0(2131750405, null));
            } else {
                textView.setText(cd.L0(2131750406, null));
            }
            boolean z14 = (z10 || j12 <= j10 || z13) ? false : true;
            ep epVar = this.o2;
            epVar.a(z14, false);
            ArrayList arrayList = this.g3;
            if (arrayList != null && (j12 > j10 || this.k3 != null)) {
                a2();
                return;
            }
            if (arrayList == null) {
                e6.y(this.a, false).K(j11, new w1(this, 2));
            }
            if (j12 > j10 || this.k3 != null) {
                return;
            }
            this.j3 = true;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            if (TextUtils.isEmpty(str)) {
                TLRPC.TL_inputInvoiceStarGiftUpgrade tL_inputInvoiceStarGiftUpgrade = new TLRPC.TL_inputInvoiceStarGiftUpgrade();
                tL_inputInvoiceStarGiftUpgrade.keep_original_details = epVar.a.q;
                tL_inputInvoiceStarGiftUpgrade.stargift = B1;
                tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftUpgrade;
            } else {
                TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade tL_inputInvoiceStarGiftPrepaidUpgrade = new TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade();
                tL_inputInvoiceStarGiftPrepaidUpgrade.hash = str;
                tL_inputInvoiceStarGiftPrepaidUpgrade.peer = vp.r1(this.a).i1(j13);
                tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftPrepaidUpgrade;
            }
            JSONObject u10 = xh.m2.u(this.I0, false);
            if (u10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = u10.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getPaymentForm, new f2(this, 0));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x0034, code lost:
    
        if (android.text.TextUtils.isEmpty(r1.prepaid_upgrade_hash) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (android.text.TextUtils.isEmpty(r1.prepaid_upgrade_hash) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
    
        r1 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a2() {
        long j10;
        boolean z10;
        boolean z11;
        char c10;
        int i10;
        int i11;
        String L0;
        String L02;
        TL_stars.StarGiftUpgradePrice starGiftUpgradePrice;
        jj jjVar = this.z2;
        if (jjVar != null) {
            TLRPC.MessageAction messageAction = jjVar.k.action;
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGift)) {
                return;
            }
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
            j10 = tL_messageActionStarGift.upgrade_stars;
            if (j10 <= 0) {
            }
            z10 = false;
        } else {
            TL_stars.SavedStarGift savedStarGift = this.x2;
            if (savedStarGift == null) {
                return;
            }
            j10 = savedStarGift.upgrade_stars;
            if (j10 <= 0) {
            }
            z10 = false;
        }
        if (this.g3 != null) {
            if (j10 > 0 || this.k3 != null) {
                long j11 = 0;
                if (this.k3 != null) {
                    for (int i12 = 0; i12 < this.k3.invoice.prices.size(); i12++) {
                        j11 += this.k3.invoice.prices.get(i12).amount;
                    }
                }
                n3 n3Var = this.H2;
                y3 y3Var = this.X1;
                if (n3Var == null) {
                    this.H2 = new n3(y3Var);
                }
                n3 n3Var2 = this.H2;
                ArrayList arrayList = this.g3;
                y3 y3Var2 = n3Var2.a;
                ArrayList arrayList2 = n3Var2.g;
                ArrayList arrayList3 = n3Var2.f;
                ArrayList arrayList4 = n3Var2.e;
                int size = arrayList4.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj = arrayList4.get(i13);
                    i13++;
                    ((l3) obj).a();
                }
                arrayList4.clear();
                arrayList3.clear();
                arrayList2.clear();
                ArrayList m10 = e6.m(arrayList, TL_stars.starGiftAttributeModel.class);
                int size2 = m10.size();
                int i14 = 0;
                while (i14 < size2) {
                    Object obj2 = m10.get(i14);
                    i14++;
                    l3 l3Var = new l3(y3Var2.c, (TL_stars.starGiftAttributeModel) obj2);
                    if (y3Var2.isAttachedToWindow() && l3Var.c) {
                        l3Var.d.P();
                    }
                    arrayList4.add(l3Var);
                }
                ArrayList m11 = e6.m(arrayList, TL_stars.starGiftAttributeBackdrop.class);
                int size3 = m11.size();
                int i15 = 0;
                while (i15 < size3) {
                    Object obj3 = m11.get(i15);
                    i15++;
                    arrayList3.add(new k3((TL_stars.starGiftAttributeBackdrop) obj3));
                }
                ArrayList m12 = e6.m(arrayList, TL_stars.starGiftAttributePattern.class);
                int size4 = m12.size();
                int i16 = 0;
                while (i16 < size4) {
                    Object obj4 = m12.get(i16);
                    i16++;
                    arrayList2.add(new m3((TL_stars.starGiftAttributePattern) obj4));
                }
                y3Var.setPreviewingAttributes(this.g3);
                long j12 = this.P1;
                if (z10) {
                    z11 = true;
                    y3Var.i(1, cd.L0(2131750071, null), cd.a0(null, null, 2131750072, org.telegram.messenger.o5.s(this.a, j12)), null);
                } else {
                    z11 = true;
                    y3Var.i(1, cd.L0(2131749860, null), cd.L0(2131749861, null), null);
                }
                vh.d dVar = this.c2;
                dVar.setFilled(z11);
                dVar.g(null, z11);
                if (j11 > 0) {
                    int currentTime = ConnectionsManager.getInstance(this.a).getCurrentTime();
                    if (this.i3 != null) {
                        for (int i17 = 0; i17 < this.i3.size(); i17++) {
                            starGiftUpgradePrice = (TL_stars.StarGiftUpgradePrice) this.i3.get(i17);
                            if (starGiftUpgradePrice.date >= currentTime) {
                                break;
                            }
                        }
                    }
                    starGiftUpgradePrice = null;
                    ArrayList arrayList5 = this.h3;
                    FrameLayout frameLayout = this.f2;
                    if (arrayList5 == null || starGiftUpgradePrice == null || arrayList5.isEmpty()) {
                        frameLayout.setVisibility(8);
                    } else {
                        frameLayout.setVisibility(0);
                        this.e2.setText(org.telegram.messenger.i0.H2(org.telegram.messenger.i0.T2("**" + cd.L0(2131749879, null) + "**", new w0(this, 3)), false, org.telegram.messenger.i0.L(0.6666667f), org.telegram.messenger.i0.L(0.66f)));
                    }
                    u2();
                    dq[] dqVarArr = this.l3;
                    if (z10) {
                        dVar.i(h8.T0(cd.a0(null, null, 2131750076, Long.valueOf(j11)), 1.13f, dqVarArr), true, true);
                    } else {
                        dVar.i(h8.T0(cd.a0(null, null, 2131749886, Long.valueOf(j11)), 1.13f, dqVarArr), true, true);
                    }
                } else {
                    dVar.i(cd.L0(2131751817, null), true, true);
                }
                dVar.setOnClickListener(new v0(this, 6));
                View view = this.m2;
                LinearLayout linearLayout = this.n2;
                if (z10) {
                    linearLayout.setVisibility(8);
                    view.setVisibility(8);
                    c10 = 0;
                } else {
                    c10 = 0;
                    linearLayout.setVisibility(0);
                    view.setVisibility(0);
                }
                xh.h[] hVarArr = this.l2;
                if (z10) {
                    xh.h hVar = hVarArr[c10];
                    String L03 = cd.L0(2131749874, null);
                    if (z10) {
                        char c11 = c10;
                        i11 = 1;
                        i10 = 2;
                        Object[] objArr = new Object[1];
                        objArr[c11] = org.telegram.messenger.o5.s(this.a, j12);
                        L0 = cd.a0(null, null, 2131750075, objArr);
                    } else {
                        i11 = 1;
                        i10 = 2;
                        L0 = cd.L0(2131749876, null);
                    }
                    hVar.a(R.drawable.menu_feature_unique, L03, L0);
                    xh.h hVar2 = hVarArr[i11];
                    String L04 = cd.L0(2131749871, null);
                    if (z10) {
                        Object[] objArr2 = new Object[i11];
                        objArr2[0] = org.telegram.messenger.o5.s(this.a, j12);
                        L02 = cd.a0(null, null, 2131750074, objArr2);
                    } else {
                        L02 = cd.L0(2131749873, null);
                    }
                    hVar2.a(R.drawable.menu_feature_transfer, L04, L02);
                    hVarArr[i10].a(R.drawable.menu_feature_tradable, cd.L0(2131749868, null), z10 ? cd.a0(null, null, 2131750073, org.telegram.messenger.o5.s(this.a, j12)) : cd.L0(2131749870, null));
                } else {
                    i10 = 2;
                    hVarArr[c10].a(R.drawable.menu_feature_unique, cd.L0(2131749874, null), cd.L0(2131749584, null));
                    hVarArr[1].a(R.drawable.menu_feature_tradable, cd.L0(2131749868, null), cd.L0(2131749582, null));
                    hVarArr[2].a(R.drawable.menu_wear, cd.L0(2131749579, null), cd.L0(2131749580, null));
                }
                org.telegram.messenger.i0.g3(new x0(this, j11, i10));
            }
        }
    }

    public final void b2() {
        TL_stars.TL_starGiftUnique H1 = H1();
        if (this.X2 == null || H1 == null || TextUtils.isEmpty(H1.slug)) {
            return;
        }
        Context context = getContext();
        int i10 = this.a;
        mg.i2[] i2VarArr = {new mg.i2(context, i10, org.telegram.messenger.y1.a(i10).b(), 3, this.I0)};
        mg.i2 i2Var = i2VarArr[0];
        i2Var.r2 = cd.L0(2131749923, null);
        da daVar = i2Var.l1;
        if (daVar != null) {
            daVar.setTitle(i2Var.O0());
        }
        mg.e2 e2Var = i2Var.T1;
        if (e2Var != null) {
            e2Var.setText(i2Var.O0());
        }
        mg.i2 i2Var2 = i2VarArr[0];
        i2Var2.y2 = true;
        i2Var2.o1(false, true);
        mg.i2 i2Var3 = i2VarArr[0];
        i2Var3.t2 = new f11(26, this, i2VarArr);
        i2Var3.show();
    }

    public final SpannableStringBuilder d2(TLRPC.Peer peer) {
        if (peer != null) {
            String r10 = org.telegram.messenger.o5.r(vp.r1(this.a).d2(org.telegram.messenger.o5.o(peer)));
            if (!TextUtils.isEmpty(r10)) {
                return org.telegram.messenger.i0.T2(cd.a0(null, null, 2131750052, sc.e.h("@", r10)), new x1(this, r10, 8));
            }
        }
        return null;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == zs.G3) {
            if (this.y2 == ((v5) objArr[1])) {
                a3 a3Var = this.X1.M;
                if (a3Var == null || !a3Var.h0) {
                    v2();
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.g2
    public final void dismiss() {
        if (this.T2.c(4) && this.X1.M.h0) {
            return;
        }
        ph.p3 p3Var = this.O2;
        if (p3Var != null) {
            p3Var.b();
            this.O2 = null;
        }
        n3 n3Var = this.H2;
        if (n3Var != null) {
            n3Var.a();
        }
        super.dismiss();
    }

    public final SpannableStringBuilder e2(TL_stars.StarGift starGift) {
        if (starGift == null || (starGift instanceof TL_stars.TL_starGiftUnique)) {
            return null;
        }
        return d2(starGift.released_by);
    }

    public final void h2(String str, TL_stars.TL_starGiftUnique tL_starGiftUnique, w5 w5Var) {
        n3 n3Var;
        TL_stars.TL_starGiftUnique tL_starGiftUnique2;
        this.A2 = str;
        this.B2 = tL_starGiftUnique;
        this.y2 = w5Var;
        this.C2 = (tL_starGiftUnique.resell_amount == null || K1(this.a, org.telegram.messenger.o5.o(tL_starGiftUnique.owner_id))) ? false : true;
        if (!this.I2 && (n3Var = this.H2) != null && n3Var.o && (tL_starGiftUnique2 = n3Var.l) != null && tL_starGiftUnique2.id != tL_starGiftUnique.id) {
            n3Var.a();
            this.H2 = null;
            y3 y3Var = this.X1;
            y3Var.b.setAlpha(1.0f);
            y3Var.c.setAlpha(0.0f);
        }
        this.W1.b(this.a, this.x2);
        k2(tL_starGiftUnique, false, null, null);
        String str2 = tL_starGiftUnique.owner_address;
        String str3 = tL_starGiftUnique.gift_address;
        boolean z10 = tL_starGiftUnique.host_id != null;
        TL_wallet.walletTransaction wallettransaction = this.a3;
        p80 p80Var = this.Z1;
        if (wallettransaction != null || !z10 || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            p80Var.setVisibility(8);
        } else {
            p80Var.setText(org.telegram.messenger.i0.H2(org.telegram.messenger.i0.T2(cd.L0(2131750190, null), new x1(this, str3, 3)), true, org.telegram.messenger.i0.L(2.6666667f), org.telegram.messenger.i0.L(0.66f)));
            p80Var.setVisibility(0);
            org.telegram.ui.ActionBar.a7.V(p80Var, org.telegram.ui.ActionBar.t6.q5, this.I0);
        }
        TL_wallet.walletTransaction wallettransaction2 = this.a3;
        p80 p80Var2 = this.b2;
        if (wallettransaction2 != null || z10 || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            p80Var2.setVisibility(8);
        } else {
            p80Var2.setText(org.telegram.messenger.i0.H2(org.telegram.messenger.i0.T2(cd.L0(2131750190, null), new x1(this, str3, 4)), true, org.telegram.messenger.i0.L(2.6666667f), org.telegram.messenger.i0.L(0.66f)));
            p80Var2.setVisibility(0);
        }
        w2();
        if (this.C2) {
            l2(tL_starGiftUnique);
            this.c2.setOnClickListener(new v0(this, 12));
        }
        if (this.W2) {
            s2(0, false, null);
            this.j1.n0(1);
            this.W2 = false;
        }
        v2();
    }

    /* JADX WARN: Code restructure failed: missing block: B:322:0x0367, code lost:
    
        if (L1(r58.a, org.telegram.messenger.o5.o(r8)) != false) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x037a, code lost:
    
        if (r44 > 0) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x03bd, code lost:
    
        if (r36 == false) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x03bf, code lost:
    
        if (r46 == false) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x03c3, code lost:
    
        if (r26 <= 0) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x03c5, code lost:
    
        r14 = null;
        r7 = org.telegram.messenger.cd.a0(null, null, 2131750174, r34);
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x03d6, code lost:
    
        r14 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x03da, code lost:
    
        if (r29 == false) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x03dc, code lost:
    
        if (r24 != false) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x03de, code lost:
    
        r7 = org.telegram.messenger.cd.a0(null, null, 2131750152, r34);
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x03eb, code lost:
    
        if (r24 == false) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x03ed, code lost:
    
        r7 = "Gift2InfoOutConverted";
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x03f2, code lost:
    
        r7 = org.telegram.messenger.cd.K(r7, (int) r9, ',', r34);
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x0400, code lost:
    
        r14 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x03f0, code lost:
    
        r7 = "Gift2InfoOut";
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x0402, code lost:
    
        if (r24 == false) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x0404, code lost:
    
        if (r38 == false) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x0406, code lost:
    
        r7 = "Gift2InfoChannelConverted";
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x0413, code lost:
    
        r7 = org.telegram.messenger.cd.H(',', r7, (int) r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x0409, code lost:
    
        r7 = "Gift2InfoConverted";
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x040c, code lost:
    
        if (r38 == false) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x040e, code lost:
    
        r7 = "Gift2Info3Channel";
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x0411, code lost:
    
        r7 = "Gift2Info3";
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x03bb, code lost:
    
        if (r8 > 0) goto L188;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:177:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x059a  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x043d  */
    /* JADX WARN: Type inference failed for: r14v29 */
    /* JADX WARN: Type inference failed for: r14v30, types: [org.telegram.ui.Components.dq[], org.telegram.ui.Components.ec[], org.telegram.ui.Components.vy0[]] */
    /* JADX WARN: Type inference failed for: r14v31 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i2(jj jjVar, w5 w5Var) {
        long j10;
        TLRPC.Peer peer;
        boolean z10;
        boolean z11;
        TL_stars.StarGift starGift;
        TLRPC.Peer peer2;
        long j11;
        long j12;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        int i10;
        boolean z12;
        boolean z13;
        boolean z14;
        TLRPC.Peer peer3;
        boolean z15;
        String str;
        boolean z16;
        boolean z17;
        String L0;
        vh.d dVar;
        boolean z18;
        String str2;
        String str3;
        char c10;
        CharSequence charSequence;
        int i11;
        CharSequence concat;
        int i12;
        wy0 wy0Var;
        vh.d dVar2;
        boolean z19;
        String str4;
        int i13;
        boolean z20;
        TL_stars.StarGift starGift2;
        TLRPC.Document document;
        boolean z21;
        boolean z22;
        int i14;
        CharSequence charSequence2;
        String L02;
        ?? r14;
        String str5;
        String L03;
        CharSequence W2;
        CharSequence charSequence3;
        n3 n3Var;
        String L04;
        boolean z23;
        TLObject d22;
        boolean z24;
        n3 n3Var2;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        TL_stars.InputSavedStarGift B1;
        if (jjVar == null || jjVar.k == null) {
            return;
        }
        this.w2 = false;
        this.x2 = null;
        this.z2 = jjVar;
        this.y2 = w5Var;
        this.W1.set(jjVar);
        long e = d20.i(this.a).e();
        boolean z25 = jj.B0(jjVar.k) == e;
        TLRPC.MessageAction messageAction = jjVar.k.action;
        boolean z26 = messageAction instanceof TLRPC.TL_messageActionStarGift;
        int i15 = 3;
        y3 y3Var = this.X1;
        vh.d dVar3 = this.c2;
        if (z26 || (((z23 = messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) && (((TLRPC.TL_messageActionStarGiftUnique) messageAction).gift instanceof TL_stars.TL_starGift))) {
            if (!this.I2 && (n3Var = this.H2) != null && n3Var.o && n3Var.l != null) {
                n3Var.a();
                this.H2 = null;
                y3Var.b.setVisibility(0);
                y3Var.c.setVisibility(4);
            }
            boolean P3 = z25 ? false : jjVar.P3();
            TLRPC.Message message = jjVar.k;
            int i16 = message.date;
            TLRPC.MessageAction messageAction2 = message.action;
            if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction2;
                boolean z27 = tL_messageActionStarGift.converted;
                boolean z28 = tL_messageActionStarGift.saved;
                boolean z29 = tL_messageActionStarGift.refunded;
                boolean z30 = tL_messageActionStarGift.name_hidden;
                TL_stars.StarGift starGift3 = tL_messageActionStarGift.gift;
                boolean z31 = tL_messageActionStarGift.can_upgrade;
                j10 = e;
                long j13 = tL_messageActionStarGift.convert_stars;
                j12 = tL_messageActionStarGift.upgrade_stars;
                TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_messageActionStarGift.message;
                TLRPC.Peer peer4 = tL_messageActionStarGift.from_id;
                TLRPC.Peer peer5 = tL_messageActionStarGift.peer;
                z15 = tL_messageActionStarGift.prepaid_upgrade;
                str = tL_messageActionStarGift.prepaid_upgrade_hash;
                TLRPC.Peer peer6 = tL_messageActionStarGift.auction_acquired ? tL_messageActionStarGift.to_id : null;
                peer2 = peer4;
                peer = peer5;
                z10 = z28;
                i10 = tL_messageActionStarGift.gift_num;
                tL_textWithEntities = tL_textWithEntities2;
                peer3 = peer6;
                z13 = z27;
                z14 = z30;
                z11 = z29;
                starGift = starGift3;
                z12 = z31;
                j11 = j13;
            } else {
                j10 = e;
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction2;
                boolean z32 = tL_messageActionStarGiftUnique.saved;
                boolean z33 = tL_messageActionStarGiftUnique.refunded;
                TL_stars.StarGift starGift4 = tL_messageActionStarGiftUnique.gift;
                TLRPC.Peer peer7 = tL_messageActionStarGiftUnique.from_id;
                peer = tL_messageActionStarGiftUnique.peer;
                z10 = z32;
                z11 = z33;
                starGift = starGift4;
                peer2 = peer7;
                j11 = 0;
                j12 = 0;
                tL_textWithEntities = null;
                i10 = 0;
                z12 = false;
                z13 = false;
                z14 = false;
                peer3 = null;
                z15 = false;
                str = null;
            }
            long j14 = this.P1;
            String t10 = org.telegram.messenger.o5.t(j14);
            z16 = z25;
            boolean z34 = P3;
            boolean t11 = h20.t(vp.r1(this.a).Z1(Long.valueOf(j14)));
            boolean z35 = peer != null && org.telegram.messenger.o5.o(peer) < 0;
            boolean M1 = M1(this.a, H1());
            C1();
            y3Var.f(starGift, false, false, M1);
            y3Var.setShowOptions(p1());
            CharSequence charSequence4 = "";
            int i17 = 2;
            if (z16) {
                if (i10 == 0 || starGift.title == null) {
                    z17 = z11;
                    str5 = null;
                    L03 = cd.L0(2131749949, null);
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    z17 = z11;
                    sb2.append(starGift.title);
                    sb2.append(" #");
                    L03 = i0.a.k(i10, ',', sb2);
                    str5 = null;
                }
                this.N2 = L03;
                if (z17) {
                    W2 = str5;
                } else {
                    if (z12) {
                        charSequence3 = org.telegram.messenger.i0.W2(cd.L0(2131750006, str5));
                    } else if (j11 > 0) {
                        charSequence3 = org.telegram.messenger.i0.W2(cd.H(',', z13 ? "Gift2SelfInfoConverted" : "Gift2SelfInfoConvert", (int) j11));
                    } else {
                        W2 = org.telegram.messenger.i0.W2(cd.L0(2131750013, null));
                    }
                    W2 = charSequence3;
                }
                y3Var.i(0, L03, W2, e2(starGift));
            } else {
                z17 = z11;
                if (z35 && !this.w2) {
                    y3Var.i(0, cd.L0(2131749951, null), null, e2(starGift));
                } else if ((z34 || z12) && j12 > 0) {
                    String L05 = cd.L0(z34 ? 2131749946 : 2131749950, null);
                    this.N2 = L05;
                    y3Var.i(0, L05, z17 ? null : !z34 ? cd.L0(2131750157, null) : cd.a0(null, null, 2131750158, t10), e2(starGift));
                } else {
                    if (i10 == 0 || starGift.title == null) {
                        L0 = cd.L0(z34 ? 2131749946 : 2131749950, null);
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(starGift.title);
                        sb3.append(" #");
                        L0 = i0.a.k(i10, ',', sb3);
                    }
                    this.N2 = L0;
                    if (z17) {
                        dVar = dVar3;
                        z18 = z12;
                        concat = null;
                        i11 = 0;
                    } else {
                        if (!t11 && B1() != null) {
                            jj jjVar2 = this.z2;
                            if (jjVar2 != null) {
                                TLRPC.MessageAction messageAction3 = jjVar2.k.action;
                                if (messageAction3 instanceof TLRPC.TL_messageActionStarGift) {
                                    TLRPC.TL_messageActionStarGift tL_messageActionStarGift2 = (TLRPC.TL_messageActionStarGift) messageAction3;
                                    boolean z36 = tL_messageActionStarGift2.peer != null;
                                    jjVar2.P3();
                                    jj.B0(this.z2.k);
                                    d20.i(this.a).e();
                                    boolean z37 = z36;
                                    int currentTime = vp.r1(this.a).F6 - (ConnectionsManager.getInstance(this.a).getCurrentTime() - this.z2.k.date);
                                    if (z37) {
                                        TLRPC.Peer peer8 = tL_messageActionStarGift2.peer;
                                        if (peer8 != null) {
                                            i12 = currentTime;
                                            dVar = dVar3;
                                            z18 = z12;
                                        }
                                    } else {
                                        i12 = currentTime;
                                        dVar = dVar3;
                                        z18 = z12;
                                    }
                                    if (!tL_messageActionStarGift2.converted) {
                                        if (tL_messageActionStarGift2.convert_stars > 0) {
                                        }
                                    }
                                    if (z34) {
                                        str2 = null;
                                        str3 = cd.a0(null, null, (!z18 || j12 <= 0) ? 2131750175 : 2131750174, t10);
                                    } else {
                                        str2 = null;
                                        str3 = cd.L0(!z10 ? z35 ? 2131750182 : 2131750187 : z35 ? 2131750181 : 2131750186, null);
                                    }
                                }
                            } else {
                                dVar = dVar3;
                                z18 = z12;
                                TL_stars.SavedStarGift savedStarGift = this.x2;
                                if (savedStarGift != null) {
                                    int currentTime2 = vp.r1(this.a).F6 - (ConnectionsManager.getInstance(this.a).getCurrentTime() - savedStarGift.date);
                                    if (L1(this.a, j14)) {
                                        int i18 = this.x2.flags;
                                        if (((j14 < 0 ? 2048 : 8) & i18) != 0) {
                                            if ((i18 & 16) != 0) {
                                                if ((i18 & 2) != 0) {
                                                }
                                            }
                                        }
                                    }
                                }
                                if (z34) {
                                }
                            }
                            SpannableStringBuilder W22 = org.telegram.messenger.i0.W2(str3);
                            if (t11 && n1()) {
                                c10 = 1;
                                charSequence = org.telegram.messenger.i0.G2(org.telegram.messenger.i0.T2(cd.L0(2131750119, str2).replace(' ', (char) 160), new w0(this, 10)), true);
                            } else {
                                c10 = 1;
                                charSequence = "";
                            }
                            CharSequence[] charSequenceArr = new CharSequence[3];
                            i11 = 0;
                            charSequenceArr[0] = W22;
                            charSequenceArr[c10] = " ";
                            charSequenceArr[2] = charSequence;
                            concat = TextUtils.concat(charSequenceArr);
                        }
                        dVar = dVar3;
                        z18 = z12;
                        if (z34) {
                        }
                        SpannableStringBuilder W222 = org.telegram.messenger.i0.W2(str3);
                        if (t11) {
                        }
                        c10 = 1;
                        charSequence = "";
                        CharSequence[] charSequenceArr2 = new CharSequence[3];
                        i11 = 0;
                        charSequenceArr2[0] = W222;
                        charSequenceArr2[c10] = " ";
                        charSequenceArr2[2] = charSequence;
                        concat = TextUtils.concat(charSequenceArr2);
                    }
                    y3Var.i(i11, L0, concat, e2(starGift));
                    wy0Var = this.a2;
                    wy0Var.removeAllViews();
                    long o10 = peer2 == null ? org.telegram.messenger.o5.o(peer2) : z34 ? j10 : j14;
                    if (peer == null) {
                        j14 = org.telegram.messenger.o5.o(peer);
                    } else if (!z34) {
                        j14 = j10;
                    }
                    TLRPC.User Z1 = vp.r1(this.a).Z1(Long.valueOf(o10));
                    int i19 = 7;
                    if (peer3 == null) {
                        long o11 = org.telegram.messenger.o5.o(peer3);
                        this.a2.m(cd.L0(2131749945, null), this.a, o11, new x0(this, o11, i19), null, z35 ? null : new x0(this, o11, 8));
                    } else {
                        if (o10 != j10 || z15 || z35) {
                            this.a2.m(cd.L0(2131750202, null), this.a, o10, new x0(this, o10, 9), (o10 == j10 || o10 == 2666000 || h20.x(Z1) || t11 || z35) ? null : cd.L0(2131750293, null), z35 ? null : new x0(this, o10, 10));
                        }
                        if (j14 != j10 || z35) {
                            this.a2.m(cd.L0(2131749945, null), this.a, j14, new x0(this, j14, 11), null, z35 ? null : new x0(this, j14, 12));
                        }
                    }
                    wy0Var.g(i16, cd.L0(2131744978, null));
                    if (starGift.stars > 0) {
                        String L06 = cd.L0(2131749856, null);
                        String k10 = i0.a.k(starGift.stars + j12, ',', new StringBuilder("⭐️ "));
                        if (!n1() || z17) {
                            r14 = 0;
                        } else {
                            r14 = 0;
                            charSequence4 = fc.b(cd.H(',', "Gift2ButtonSell", (int) j11), new w0(this, 7), this.I0, null);
                        }
                        wy0Var.c(L06, h8.Z0(false, TextUtils.concat(k10, " ", charSequence4), 0.8f, r14), r14, r14);
                    }
                    if (starGift.limited && !z17) {
                        h8.G0(wy0Var, this.a, starGift, this.I0);
                    }
                    if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text) && !z17) {
                        wy0Var.b(tL_textWithEntities.text, tL_textWithEntities.entities);
                    }
                    if (z34 && z18 && !z17) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("^  ");
                        if (this.V2 == null) {
                            dVar2 = dVar;
                            i14 = 0;
                            this.V2 = new dq(0, new z3(dVar2, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, this.I0)));
                        } else {
                            dVar2 = dVar;
                            i14 = 0;
                        }
                        spannableStringBuilder.setSpan(this.V2, i14, 1, 33);
                        if (j12 > 0) {
                            charSequence2 = null;
                            L02 = cd.L0(2131749884, null);
                        } else {
                            charSequence2 = null;
                            L02 = cd.L0(2131749883, null);
                        }
                        spannableStringBuilder.append((CharSequence) L02);
                        dVar2.setFilled(true);
                        dVar2.i(spannableStringBuilder, !this.W2, true);
                        dVar2.g(charSequence2, !this.W2);
                        dVar2.setOnClickListener(new v0(this, 16));
                    } else {
                        dVar2 = dVar;
                        if (this.j2 || this.R1 == null || this.y2 == null || D1() < 0 || this.y2.a(D1()) < 0) {
                            if ((starGift instanceof TL_stars.TL_starGift) || TextUtils.isEmpty(str)) {
                                z19 = true;
                                str4 = null;
                                dVar2.setFilled(true);
                                dVar2.i(cd.L0(2131747847, null), !this.W2, true);
                                dVar2.g(null, !this.W2);
                                dVar2.setOnClickListener(new v0(this, 14));
                            } else {
                                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("^  ");
                                if (this.V2 == null) {
                                    i13 = 0;
                                    this.V2 = new dq(0, new z3(dVar2, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, this.I0)));
                                } else {
                                    i13 = 0;
                                }
                                z19 = true;
                                spannableStringBuilder2.setSpan(this.V2, i13, 1, 33);
                                str4 = null;
                                spannableStringBuilder2.append((CharSequence) cd.L0(2131750200, null));
                                dVar2.setFilled(true);
                                dVar2.i(spannableStringBuilder2, !this.W2, true);
                                dVar2.g(null, !this.W2);
                                dVar2.setOnClickListener(new v0(this, 13));
                            }
                            z21 = z10;
                            z22 = z34;
                        } else {
                            dVar2.setFilled(false);
                            int a2 = this.y2.a(D1());
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                            spannableStringBuilder3.append((CharSequence) cd.L0(2131749864, null));
                            Object obj = this.y2.get(a2);
                            if (!(obj instanceof TL_stars.SavedStarGift) || (starGift2 = ((TL_stars.SavedStarGift) obj).gift) == null || (document = starGift2.getDocument()) == null) {
                                z20 = true;
                            } else {
                                spannableStringBuilder3.append((CharSequence) " e");
                                z20 = true;
                                spannableStringBuilder3.setSpan(new org.telegram.ui.Components.o5(document, dVar2.getTextPaint().getFontMetricsInt()), spannableStringBuilder3.length() - 1, spannableStringBuilder3.length(), 33);
                            }
                            dVar2.i(spannableStringBuilder3, this.W2 ^ z20, z20);
                            dVar2.g(null, this.W2 ^ z20);
                            dVar2.setOnClickListener(new i1(this, a2, i17));
                        }
                    }
                    z19 = true;
                    str4 = null;
                    z21 = z10;
                    z22 = z34;
                }
            }
            dVar = dVar3;
            z18 = z12;
            wy0Var = this.a2;
            wy0Var.removeAllViews();
            if (peer2 == null) {
            }
            if (peer == null) {
            }
            TLRPC.User Z12 = vp.r1(this.a).Z1(Long.valueOf(o10));
            int i192 = 7;
            if (peer3 == null) {
            }
            wy0Var.g(i16, cd.L0(2131744978, null));
            if (starGift.stars > 0) {
            }
            if (starGift.limited) {
                h8.G0(wy0Var, this.a, starGift, this.I0);
            }
            if (tL_textWithEntities != null) {
                wy0Var.b(tL_textWithEntities.text, tL_textWithEntities.entities);
            }
            if (z34) {
            }
            dVar2 = dVar;
            if (this.j2) {
            }
            if (starGift instanceof TL_stars.TL_starGift) {
            }
            z19 = true;
            str4 = null;
            dVar2.setFilled(true);
            dVar2.i(cd.L0(2131747847, null), !this.W2, true);
            dVar2.g(null, !this.W2);
            dVar2.setOnClickListener(new v0(this, 14));
            z21 = z10;
            z22 = z34;
        } else {
            if (!z23) {
                return;
            }
            TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique2 = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
            if (!(tL_messageActionStarGiftUnique2.gift instanceof TL_stars.TL_starGiftUnique)) {
                return;
            }
            if (tL_messageActionStarGiftUnique2.name_hidden) {
                d22 = null;
            } else {
                vp r12 = vp.r1(this.a);
                TLRPC.Peer peer9 = tL_messageActionStarGiftUnique2.from_id;
                d22 = r12.d2(peer9 != null ? org.telegram.messenger.o5.o(peer9) : jjVar.Z0());
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) tL_messageActionStarGiftUnique2.gift;
            boolean z38 = tL_messageActionStarGiftUnique2.refunded;
            k2(tL_starGiftUnique2, z38, d22, tL_messageActionStarGiftUnique2.message);
            z21 = tL_messageActionStarGiftUnique2.saved;
            starGift = tL_messageActionStarGiftUnique2.gift;
            boolean z39 = (tL_messageActionStarGiftUnique2.upgrade ^ true) == jjVar.P3();
            if (jj.B0(jjVar.k) == e) {
                z39 = false;
            }
            if (!this.F2 && !this.G2 && this.z2 != null && (B1 = B1()) != null) {
                this.F2 = true;
                e6.y(this.a, false).M(B1, new w1(this, i15));
            }
            if (this.I2 || (n3Var2 = this.H2) == null || !n3Var2.o || (tL_starGiftUnique = n3Var2.l) == null) {
                z24 = z39;
            } else {
                z24 = z39;
                if (starGift == null || tL_starGiftUnique.id != starGift.id) {
                    n3Var2.a();
                    this.H2 = null;
                    y3Var.b.setAlpha(1.0f);
                    y3Var.c.setAlpha(0.0f);
                }
            }
            z16 = z25;
            z17 = z38;
            dVar2 = dVar3;
            z22 = z24;
            tL_textWithEntities = null;
            z19 = true;
            str4 = null;
            z13 = false;
            z14 = false;
            peer3 = null;
        }
        if (this.d3) {
            dVar2.setFilled(z19);
            dVar2.i(cd.L0(2131749803, str4), false, z19);
            dVar2.setOnClickListener(new v0(this, 15));
        }
        String str6 = starGift == null ? null : starGift.owner_address;
        String str7 = starGift == null ? null : starGift.gift_address;
        boolean z40 = (starGift == null || starGift.host_id == null) ? false : true;
        p80 p80Var = this.Z1;
        if (z17) {
            p80Var.setVisibility(0);
            p80Var.setText(cd.L0(2131750054, null));
            org.telegram.ui.ActionBar.a7.V(p80Var, org.telegram.ui.ActionBar.t6.q7, this.I0);
        } else if (z40 && !TextUtils.isEmpty(str6) && !TextUtils.isEmpty(str7)) {
            p80Var.setVisibility(0);
            p80Var.setText(org.telegram.messenger.i0.H2(org.telegram.messenger.i0.T2(cd.L0(2131750190, null), new x1(this, str7, 5)), true, org.telegram.messenger.i0.L(2.6666667f), org.telegram.messenger.i0.L(0.66f)));
            org.telegram.ui.ActionBar.a7.V(p80Var, org.telegram.ui.ActionBar.t6.q5, this.I0);
        } else if (TextUtils.isEmpty(str6) && TextUtils.isEmpty(str7) && z14 && !z16) {
            p80Var.setVisibility(0);
            if (z22) {
                L04 = cd.a0(null, null, (tL_textWithEntities == null || TextUtils.isEmpty(tL_textWithEntities.text)) ? 2131750097 : 2131750096, org.telegram.messenger.o5.t(jj.B0(jjVar.k)));
            } else {
                L04 = cd.L0((tL_textWithEntities == null || TextUtils.isEmpty(tL_textWithEntities.text)) ? 2131750189 : 2131750188, null);
            }
            p80Var.setText(L04);
            org.telegram.ui.ActionBar.a7.V(p80Var, org.telegram.ui.ActionBar.t6.q5, this.I0);
        } else {
            p80Var.setVisibility(8);
        }
        int i20 = 6;
        p80 p80Var2 = this.b2;
        if (!z40 && !TextUtils.isEmpty(str6) && !TextUtils.isEmpty(str7)) {
            p80Var2.setVisibility(0);
            p80Var2.setText(org.telegram.messenger.i0.H2(org.telegram.messenger.i0.T2(cd.L0(2131750190, null), new x1(this, str7, i20)), true, org.telegram.messenger.i0.L(2.6666667f), org.telegram.messenger.i0.L(0.66f)));
        } else if (z13 || z17 || starGift == null || !K1(this.a, x1()) || peer3 != null) {
            p80Var2.setVisibility(8);
        } else {
            p80Var2.setVisibility(0);
            if (x1() >= 0) {
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                if (!z21) {
                    spannableStringBuilder4.append((CharSequence) ". ");
                    spannableStringBuilder4.setSpan(new dq(R.drawable.mini_gift_hidden, 0), 0, 1, 33);
                }
                spannableStringBuilder4.append((CharSequence) org.telegram.messenger.i0.T2(cd.L0(z21 ? 2131750064 : 2131750067, null), new w0(this, i20)));
                p80Var2.setText(org.telegram.messenger.i0.H2(spannableStringBuilder4, true, org.telegram.messenger.i0.L(2.6666667f), org.telegram.messenger.i0.L(0.66f)));
            } else {
                p80Var2.setText(org.telegram.messenger.i0.H2(org.telegram.messenger.i0.T2(cd.L0(z21 ? 2131750262 : 2131750263, null), new w0(this, i20)), true, org.telegram.messenger.i0.L(2.6666667f), org.telegram.messenger.i0.L(0.66f)));
            }
        }
        if (this.W2) {
            s2(0, false, null);
            this.j1.n0(1);
            this.W2 = false;
        }
        this.l1.setTitle(this.N2);
        v2();
    }

    public final void j1(TL_stars.StarGiftAttribute starGiftAttribute) {
        String L0;
        char c10;
        n3 n3Var;
        TL_stars.StarGiftAttribute starGiftAttribute2;
        e4 e4Var;
        px0 px0Var;
        int i10 = 0;
        if (starGiftAttribute instanceof TL_stars.starGiftAttributeModel) {
            L0 = cd.L0(2131750396, null);
            c10 = 2;
        } else if (starGiftAttribute instanceof TL_stars.starGiftAttributePattern) {
            L0 = cd.L0(2131750389, null);
            c10 = 1;
        } else {
            if (!(starGiftAttribute instanceof TL_stars.starGiftAttributeBackdrop)) {
                return;
            }
            L0 = cd.L0(2131750397, null);
            c10 = 0;
        }
        if (!this.I2 && ((n3Var = this.H2) == null || !n3Var.o)) {
            boolean[] zArr = new boolean[1];
            ec[] ecVarArr = new ec[1];
            Integer[] numArr = new Integer[1];
            String G1 = G1(starGiftAttribute.rarity, numArr);
            if (starGiftAttribute.rarity instanceof TL_stars.TL_starGiftAttributeRarity) {
                starGiftAttribute2 = starGiftAttribute;
                e4Var = this;
                px0Var = new px0(this, zArr, starGiftAttribute2, ecVarArr, 17);
            } else {
                starGiftAttribute2 = starGiftAttribute;
                e4Var = this;
                px0Var = null;
            }
            ecVarArr[0] = (ec) ((ty0) e4Var.a2.e(L0, starGiftAttribute2.name, G1, px0Var, numArr[0]).getChildAt(1)).getChildAt(0);
            return;
        }
        s3 s3Var = new s3(getContext(), this.I0, new b1(this, i10));
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        wy0 wy0Var = this.a2;
        tableRow.addView(new vy0(wy0Var, L0), layoutParams);
        tableRow.addView(new ty0(wy0Var, s3Var, true), new TableRow.LayoutParams(0, -1, 1.0f));
        wy0Var.addView(tableRow);
        n3 n3Var2 = this.H2;
        if (n3Var2 != null) {
            if (c10 == 0) {
                n3Var2.d = s3Var;
            }
            if (c10 == 1) {
                n3Var2.c = s3Var;
            }
            if (c10 == 2) {
                n3Var2.b = s3Var;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02ee A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03ae A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03eb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0478 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0312  */
    /* JADX WARN: Type inference failed for: r12v32 */
    /* JADX WARN: Type inference failed for: r12v33, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v34 */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v27, types: [org.telegram.ui.Components.dq[], org.telegram.ui.Components.ec[], org.telegram.ui.Components.vy0[]] */
    /* JADX WARN: Type inference failed for: r13v37 */
    /* JADX WARN: Type inference failed for: r14v43 */
    /* JADX WARN: Type inference failed for: r14v44 */
    /* JADX WARN: Type inference failed for: r14v46, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v47 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j2(TL_stars.SavedStarGift savedStarGift, w5 w5Var) {
        long j10;
        int i10;
        String L0;
        int i11;
        CharSequence charSequence;
        String str;
        String a02;
        int i12;
        boolean z10;
        CharSequence charSequence2;
        TL_stars.StarGift starGift;
        ?? r13;
        TL_stars.StarGift starGift2;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        boolean z11;
        vh.d dVar;
        int i13;
        ?? r12;
        TL_stars.StarGift starGift3;
        TLRPC.Document document;
        String str2;
        String str3;
        boolean z12;
        int i14;
        CharSequence charSequence3;
        String L02;
        String str4;
        String L03;
        CharSequence W2;
        CharSequence charSequence4;
        TL_stars.StarGift starGift4;
        ?? r14;
        n3 n3Var;
        if (savedStarGift == null) {
            return;
        }
        int i15 = this.a;
        long j11 = this.P1;
        this.w2 = K1(i15, j11);
        this.x2 = savedStarGift;
        this.y2 = w5Var;
        this.z2 = null;
        boolean z13 = this.I2;
        y3 y3Var = this.X1;
        if (!z13 && (n3Var = this.H2) != null && n3Var.o && n3Var.l != null) {
            n3Var.a();
            this.H2 = null;
            y3Var.b.setVisibility(0);
            y3Var.c.setVisibility(4);
        }
        this.W1.b(this.a, savedStarGift);
        String t10 = org.telegram.messenger.o5.t(j11);
        long o10 = org.telegram.messenger.o5.o(savedStarGift.from_id);
        boolean t11 = h20.t(vp.r1(this.a).Z1(Long.valueOf(o10)));
        int currentTime = vp.r1(this.a).F6 - (ConnectionsManager.getInstance(this.a).getCurrentTime() - savedStarGift.date);
        long e = d20.i(this.a).e();
        if ((savedStarGift.flags & 2) == 0) {
            o10 = 2666000;
        }
        int i16 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
        boolean z14 = i16 < 0;
        TLRPC.TL_textWithEntities tL_textWithEntities2 = savedStarGift.message;
        boolean z15 = savedStarGift.refunded;
        TL_stars.StarGift starGift5 = savedStarGift.gift;
        if (starGift5 instanceof TL_stars.TL_starGiftUnique) {
            str2 = starGift5.owner_address;
            str3 = starGift5.gift_address;
            z12 = starGift5.host_id != null;
            k2((TL_stars.TL_starGiftUnique) starGift5, z15, !savedStarGift.name_hidden ? vp.r1(this.a).d2(org.telegram.messenger.o5.o(savedStarGift.from_id)) : null, savedStarGift.message);
            i10 = i16;
        } else {
            boolean z16 = this.w2 && e == o10 && i16 >= 0;
            boolean M1 = M1(this.a, H1());
            C1();
            y3Var.f(starGift5, false, false, M1);
            y3Var.setShowOptions(p1());
            wy0 wy0Var = this.a2;
            wy0Var.removeAllViews();
            CharSequence charSequence5 = "";
            if (z16) {
                if (savedStarGift.gift_num == 0 || (starGift4 = savedStarGift.gift) == null || starGift4.title == null) {
                    j10 = e;
                    str4 = null;
                    L03 = cd.L0(2131749949, null);
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(savedStarGift.gift.title);
                    sb2.append(" #");
                    j10 = e;
                    L03 = i0.a.k(savedStarGift.gift_num, ',', sb2);
                    str4 = null;
                }
                this.N2 = L03;
                if (z15) {
                    W2 = str4;
                } else {
                    if (savedStarGift.can_upgrade) {
                        charSequence4 = org.telegram.messenger.i0.W2(cd.L0(2131750006, str4));
                    } else {
                        long j12 = savedStarGift.convert_stars;
                        if (j12 > 0) {
                            charSequence4 = org.telegram.messenger.i0.W2(cd.H(',', "Gift2SelfInfoConvert", (int) j12));
                        } else {
                            W2 = org.telegram.messenger.i0.W2(cd.L0(2131750013, null));
                        }
                    }
                    W2 = charSequence4;
                }
                y3Var.i(0, L03, W2, e2(savedStarGift.gift));
            } else {
                j10 = e;
                if (!z14 || this.w2) {
                    boolean z17 = this.w2;
                    if (!z17 || savedStarGift.can_upgrade) {
                        i10 = i16;
                        if (savedStarGift.upgrade_stars > 0) {
                            String L04 = cd.L0(z17 ? 2131749950 : 2131749951, null);
                            this.N2 = L04;
                            y3Var.i(0, L04, z15 ? null : this.w2 ? cd.L0(2131750157, null) : null, e2(savedStarGift.gift));
                            if (j10 == o10 || z14) {
                                this.a2.m(cd.L0(2131750202, null), this.a, o10, new x0(this, o10, 4), (o10 != j10 || o10 == 2666000 || t11 || h20.x(vp.r1(this.a).Z1(Long.valueOf(o10))) || z14) ? null : cd.L0(2131750293, null), new x0(this, o10, 5));
                            }
                            wy0Var.c(cd.L0(2131744978, null), cd.a0(null, null, 2131742808, cd.D0().r0().format(new Date(savedStarGift.date * 1000)), cd.D0().o0().format(new Date(savedStarGift.date * 1000))), null, null);
                            String L05 = cd.L0(2131749856, null);
                            String k10 = i0.a.k(savedStarGift.gift.stars + savedStarGift.upgrade_stars, ',', new StringBuilder("⭐️ "));
                            if (n1() || z15) {
                                r13 = 0;
                            } else {
                                r13 = 0;
                                charSequence5 = fc.b(cd.H(',', "Gift2ButtonSell", (int) savedStarGift.convert_stars), new w0(this, 7), this.I0, null);
                            }
                            wy0Var.c(L05, h8.Z0(false, TextUtils.concat(k10, " ", charSequence5), 0.8f, r13), r13, r13);
                            starGift2 = savedStarGift.gift;
                            if (starGift2.limited && !z15) {
                                h8.G0(wy0Var, this.a, starGift2, this.I0);
                            }
                            tL_textWithEntities = savedStarGift.message;
                            if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text) && !z15) {
                                TLRPC.TL_textWithEntities tL_textWithEntities3 = savedStarGift.message;
                                wy0Var.b(tL_textWithEntities3.text, tL_textWithEntities3.entities);
                            }
                            z11 = this.w2;
                            dVar = this.c2;
                            if (!z11 && savedStarGift.can_upgrade) {
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("^  ");
                                if (this.V2 == null) {
                                    i14 = 0;
                                    this.V2 = new dq(0, new z3(dVar, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, this.I0)));
                                } else {
                                    i14 = 0;
                                }
                                spannableStringBuilder.setSpan(this.V2, i14, 1, 33);
                                if (savedStarGift.upgrade_stars > 0) {
                                    charSequence3 = null;
                                    L02 = cd.L0(2131749884, null);
                                } else {
                                    charSequence3 = null;
                                    L02 = cd.L0(2131749883, null);
                                }
                                spannableStringBuilder.append((CharSequence) L02);
                                dVar.setFilled(true);
                                dVar.i(spannableStringBuilder, !this.W2, true);
                                dVar.g(charSequence3, !this.W2);
                                dVar.setOnClickListener(new v0(this, 8));
                            } else if (!this.j2 && z11 && this.R1 != null && this.y2 != null && D1() >= 0 && this.y2.a(D1()) >= 0) {
                                dVar.setFilled(false);
                                int a2 = this.y2.a(D1());
                                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                                spannableStringBuilder2.append((CharSequence) cd.L0(2131749864, null));
                                Object obj = this.y2.get(a2);
                                if (!(obj instanceof TL_stars.SavedStarGift) || (starGift3 = ((TL_stars.SavedStarGift) obj).gift) == null || (document = starGift3.getDocument()) == null) {
                                    r12 = 1;
                                } else {
                                    spannableStringBuilder2.append((CharSequence) " e");
                                    r12 = 1;
                                    spannableStringBuilder2.setSpan(new org.telegram.ui.Components.o5(document, dVar.getTextPaint().getFontMetricsInt()), spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 33);
                                }
                                dVar.i(spannableStringBuilder2, (this.W2 ? 1 : 0) ^ r12, r12);
                                dVar.g(null, (this.W2 ? 1 : 0) ^ r12);
                                dVar.setOnClickListener(new i1(this, a2, r12));
                            } else if ((savedStarGift.gift instanceof TL_stars.TL_starGift) || TextUtils.isEmpty(savedStarGift.prepaid_upgrade_hash)) {
                                dVar.setFilled(true);
                                dVar.i(cd.L0(2131747847, null), !this.W2, true);
                                dVar.g(null, !this.W2);
                                dVar.setOnClickListener(new v0(this, 11));
                            } else {
                                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("^  ");
                                if (this.V2 == null) {
                                    i13 = 0;
                                    this.V2 = new dq(0, new z3(dVar, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, this.I0)));
                                } else {
                                    i13 = 0;
                                }
                                spannableStringBuilder3.setSpan(this.V2, i13, 1, 33);
                                spannableStringBuilder3.append((CharSequence) cd.L0(2131750200, null));
                                dVar.setFilled(true);
                                dVar.i(spannableStringBuilder3, !this.W2, true);
                                dVar.g(null, !this.W2);
                                dVar.setOnClickListener(new v0(this, 10));
                            }
                            str2 = null;
                            str3 = null;
                            z12 = false;
                        }
                    } else {
                        i10 = i16;
                    }
                    if (savedStarGift.gift_num == 0 || (starGift = savedStarGift.gift) == null || starGift.title == null) {
                        L0 = cd.L0(z17 ? 2131749950 : 2131749951, null);
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(savedStarGift.gift.title);
                        sb3.append(" #");
                        L0 = i0.a.k(savedStarGift.gift_num, ',', sb3);
                    }
                    this.N2 = L0;
                    if (z15 || !this.w2) {
                        i11 = 0;
                        charSequence = null;
                    } else {
                        if (!t11 && n1()) {
                            if (this.w2) {
                                a02 = cd.H(',', currentTime <= 0 ? z14 ? "Gift2Info2ChannelExpired" : "Gift2Info2Expired" : z14 ? "Gift2Info3Channel" : "Gift2Info3", (int) savedStarGift.convert_stars);
                            } else {
                                a02 = cd.K("Gift2Info2Out", (int) savedStarGift.convert_stars, ',', t10);
                            }
                            str = null;
                        } else if (this.w2) {
                            if (savedStarGift.unsaved) {
                                i12 = z14 ? 2131750182 : 2131750187;
                                str = null;
                            } else {
                                str = null;
                                i12 = z14 ? 2131750181 : 2131750186;
                            }
                            a02 = cd.L0(i12, str);
                        } else {
                            str = null;
                            a02 = cd.a0(null, null, (!savedStarGift.can_upgrade || savedStarGift.upgrade_stars <= 0) ? 2131750175 : 2131750174, t10);
                        }
                        SpannableStringBuilder W22 = org.telegram.messenger.i0.W2(a02);
                        if (t11 || !n1()) {
                            z10 = true;
                            charSequence2 = "";
                        } else {
                            z10 = true;
                            charSequence2 = org.telegram.messenger.i0.G2(org.telegram.messenger.i0.T2(cd.L0(2131750119, str).replace(' ', (char) 160), new w0(this, 5)), true);
                        }
                        boolean z18 = z10;
                        CharSequence[] charSequenceArr = new CharSequence[3];
                        i11 = 0;
                        charSequenceArr[0] = W22;
                        charSequenceArr[z18 ? 1 : 0] = " ";
                        charSequenceArr[2] = charSequence2;
                        charSequence = TextUtils.concat(charSequenceArr);
                    }
                    y3Var.i(i11, L0, charSequence, e2(savedStarGift.gift));
                    if (j10 == o10) {
                    }
                    this.a2.m(cd.L0(2131750202, null), this.a, o10, new x0(this, o10, 4), (o10 != j10 || o10 == 2666000 || t11 || h20.x(vp.r1(this.a).Z1(Long.valueOf(o10))) || z14) ? null : cd.L0(2131750293, null), new x0(this, o10, 5));
                    wy0Var.c(cd.L0(2131744978, null), cd.a0(null, null, 2131742808, cd.D0().r0().format(new Date(savedStarGift.date * 1000)), cd.D0().o0().format(new Date(savedStarGift.date * 1000))), null, null);
                    String L052 = cd.L0(2131749856, null);
                    String k102 = i0.a.k(savedStarGift.gift.stars + savedStarGift.upgrade_stars, ',', new StringBuilder("⭐️ "));
                    if (n1()) {
                    }
                    r13 = 0;
                    wy0Var.c(L052, h8.Z0(false, TextUtils.concat(k102, " ", charSequence5), 0.8f, r13), r13, r13);
                    starGift2 = savedStarGift.gift;
                    if (starGift2.limited) {
                        h8.G0(wy0Var, this.a, starGift2, this.I0);
                    }
                    tL_textWithEntities = savedStarGift.message;
                    if (tL_textWithEntities != null) {
                        TLRPC.TL_textWithEntities tL_textWithEntities32 = savedStarGift.message;
                        wy0Var.b(tL_textWithEntities32.text, tL_textWithEntities32.entities);
                    }
                    z11 = this.w2;
                    dVar = this.c2;
                    if (!z11) {
                    }
                    if (!this.j2) {
                    }
                    if (savedStarGift.gift instanceof TL_stars.TL_starGift) {
                    }
                    dVar.setFilled(true);
                    dVar.i(cd.L0(2131747847, null), !this.W2, true);
                    dVar.g(null, !this.W2);
                    dVar.setOnClickListener(new v0(this, 11));
                    str2 = null;
                    str3 = null;
                    z12 = false;
                } else {
                    String L06 = cd.L0(2131749951, null);
                    this.N2 = L06;
                    y3Var.i(0, L06, null, d2(savedStarGift.gift.released_by));
                }
            }
            i10 = i16;
            if (j10 == o10) {
            }
            this.a2.m(cd.L0(2131750202, null), this.a, o10, new x0(this, o10, 4), (o10 != j10 || o10 == 2666000 || t11 || h20.x(vp.r1(this.a).Z1(Long.valueOf(o10))) || z14) ? null : cd.L0(2131750293, null), new x0(this, o10, 5));
            wy0Var.c(cd.L0(2131744978, null), cd.a0(null, null, 2131742808, cd.D0().r0().format(new Date(savedStarGift.date * 1000)), cd.D0().o0().format(new Date(savedStarGift.date * 1000))), null, null);
            String L0522 = cd.L0(2131749856, null);
            String k1022 = i0.a.k(savedStarGift.gift.stars + savedStarGift.upgrade_stars, ',', new StringBuilder("⭐️ "));
            if (n1()) {
            }
            r13 = 0;
            wy0Var.c(L0522, h8.Z0(false, TextUtils.concat(k1022, " ", charSequence5), 0.8f, r13), r13, r13);
            starGift2 = savedStarGift.gift;
            if (starGift2.limited) {
            }
            tL_textWithEntities = savedStarGift.message;
            if (tL_textWithEntities != null) {
            }
            z11 = this.w2;
            dVar = this.c2;
            if (!z11) {
            }
            if (!this.j2) {
            }
            if (savedStarGift.gift instanceof TL_stars.TL_starGift) {
            }
            dVar.setFilled(true);
            dVar.i(cd.L0(2131747847, null), !this.W2, true);
            dVar.g(null, !this.W2);
            dVar.setOnClickListener(new v0(this, 11));
            str2 = null;
            str3 = null;
            z12 = false;
        }
        boolean z19 = savedStarGift.refunded;
        p80 p80Var = this.Z1;
        if (z19) {
            p80Var.setVisibility(0);
            p80Var.setText(cd.L0(2131750054, null));
            org.telegram.ui.ActionBar.a7.V(p80Var, org.telegram.ui.ActionBar.t6.q7, this.I0);
        } else if (z12 && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            p80Var.setText(org.telegram.messenger.i0.H2(org.telegram.messenger.i0.T2(cd.L0(2131750190, null), new x1(this, str3, 1)), true, org.telegram.messenger.i0.L(2.6666667f), org.telegram.messenger.i0.L(0.66f)));
            p80Var.setVisibility(0);
            org.telegram.ui.ActionBar.a7.V(p80Var, org.telegram.ui.ActionBar.t6.q5, this.I0);
        } else if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3) && this.w2 && (savedStarGift.gift instanceof TL_stars.TL_starGift) && savedStarGift.name_hidden) {
            p80Var.setVisibility(0);
            p80Var.setText(cd.L0((tL_textWithEntities2 == null || TextUtils.isEmpty(tL_textWithEntities2.text)) ? 2131750189 : 2131750188, null));
            org.telegram.ui.ActionBar.a7.V(p80Var, org.telegram.ui.ActionBar.t6.q5, this.I0);
        } else {
            p80Var.setVisibility(8);
        }
        p80 p80Var2 = this.b2;
        if (!z12 && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            p80Var2.setText(org.telegram.messenger.i0.H2(org.telegram.messenger.i0.T2(cd.L0(2131750190, null), new x1(this, str3, 2)), true, org.telegram.messenger.i0.L(2.6666667f), org.telegram.messenger.i0.L(0.66f)));
            r14 = 0;
            p80Var2.setVisibility(0);
        } else if (this.w2 && K1(this.a, j11)) {
            int i17 = 6;
            if (i10 >= 0) {
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                if (savedStarGift.unsaved) {
                    spannableStringBuilder4.append((CharSequence) ". ");
                    spannableStringBuilder4.setSpan(new dq(R.drawable.mini_gift_hidden, 0), 0, 1, 33);
                }
                spannableStringBuilder4.append((CharSequence) org.telegram.messenger.i0.T2(cd.L0(!savedStarGift.unsaved ? 2131750064 : 2131750067, null), new w0(this, i17)));
                p80Var2.setText(org.telegram.messenger.i0.H2(spannableStringBuilder4, true, org.telegram.messenger.i0.L(2.6666667f), org.telegram.messenger.i0.L(0.66f)));
            } else {
                p80Var2.setText(org.telegram.messenger.i0.H2(org.telegram.messenger.i0.T2(cd.L0(!savedStarGift.unsaved ? 2131750262 : 2131750263, null), new w0(this, i17)), true, org.telegram.messenger.i0.L(2.6666667f), org.telegram.messenger.i0.L(0.66f)));
            }
            r14 = 0;
            p80Var2.setVisibility(0);
        } else {
            r14 = 0;
            p80Var2.setVisibility(8);
        }
        if (this.W2) {
            s2(r14, r14, null);
            this.j1.n0(1);
            this.W2 = r14;
        }
        this.l1.setTitle(this.N2);
        v2();
    }

    @Override // org.telegram.ui.ActionBar.z2, org.telegram.ui.ActionBar.g2
    public cc k() {
        return new cc(this.h2, this.I0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:236:0x05ce, code lost:
    
        if (((org.telegram.tgnet.TLRPC.TL_messageActionStarGiftUnique) r8).drop_original_details_stars >= r38) goto L193;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x05b0  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x06be  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0751  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x084d  */
    /* JADX WARN: Removed duplicated region for block: B:201:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0760  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x077d  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x06b8  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0342  */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v39 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7, types: [android.view.View, int[], java.lang.CharSequence, java.lang.String, org.telegram.ui.ActionBar.w6, org.telegram.ui.Components.ec[], org.telegram.ui.Components.vy0[]] */
    /* JADX WARN: Type inference failed for: r13v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v30 */
    /* JADX WARN: Type inference failed for: r13v31 */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v29 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k2(TL_stars.TL_starGiftUnique tL_starGiftUnique, boolean z10, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        int i10;
        CharSequence charSequence;
        CharSequence charSequence2;
        Spannable spannable;
        long j10;
        int i11;
        final ?? r15;
        ?? r13;
        TL_stars.starGiftAttributeOriginalDetails stargiftattributeoriginaldetails;
        float f7;
        n3 n3Var;
        TL_stars.StarGift starGift;
        TLRPC.Document document;
        n3 n3Var2;
        boolean z11;
        Object obj;
        Object obj2;
        CharSequence V;
        CharSequence V2;
        TLRPC.Message message;
        jj jjVar;
        int i12;
        int i13;
        Object obj3;
        int i14;
        int i15;
        TL_wallet.nftItem nftitem;
        String str;
        TL_wallet.nftItem nftitem2;
        String str2;
        org.telegram.ui.Wallet.g8 g8Var;
        n3 n3Var3;
        TL_stars.TL_starGiftUnique tL_starGiftUnique2;
        long o10 = org.telegram.messenger.o5.o(tL_starGiftUnique.owner_id);
        long o11 = org.telegram.messenger.o5.o(tL_starGiftUnique.host_id);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        this.N2 = i0.a.k(tL_starGiftUnique.num, ',', sb2);
        boolean z12 = this.I2;
        y3 y3Var = this.X1;
        if (!z12 && (n3Var3 = this.H2) != null && n3Var3.o && (tL_starGiftUnique2 = n3Var3.l) != null && tL_starGiftUnique2.id != tL_starGiftUnique.id) {
            n3Var3.a();
            this.H2 = null;
            y3Var.b.setAlpha(1.0f);
            y3Var.c.setAlpha(0.0f);
        } else if (z12 && this.H2 == null) {
            this.H2 = new n3(y3Var);
        }
        int i16 = 0;
        int i17 = 1;
        boolean z13 = this.a3 == null;
        boolean z14 = z13 && L1(this.a, o10);
        boolean z15 = z13 && L1(this.a, o11);
        boolean M1 = M1(this.a, H1());
        C1();
        y3Var.f(tL_starGiftUnique, z14, z15, M1);
        y3Var.setShowOptions(false);
        TextPaint textPaint = y3Var.G;
        final int i18 = 4;
        int i19 = 2;
        int i20 = 3;
        if (this.X2 != null) {
            if (this.Z2 != null) {
                y3Var.j(new v0(this, 29), this.Y2 == null ? null : new View.OnClickListener(this) { // from class: rh.g2
                    public final /* synthetic */ e4 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i18) {
                            case 0:
                                this.b.onBackPressed();
                                break;
                            case 1:
                                this.b.N1();
                                break;
                            case 2:
                                this.b.onBackPressed();
                                break;
                            case 3:
                                n3 n3Var4 = this.b.H2;
                                n3Var4.h.e();
                                n3Var4.i.e();
                                n3Var4.j.e();
                                n3Var4.k.e();
                                break;
                            default:
                                this.b.R1();
                                break;
                        }
                    }
                }, new v0(this, i16), true);
                org.telegram.ui.Wallet.j5 j5Var = this.Z2;
                org.telegram.ui.Wallet.h8 h8Var = j5Var.b.j0;
                y3Var.setWalletCard((h8Var == null || (nftitem2 = j5Var.a) == null || (str2 = nftitem2.address) == null || (g8Var = (org.telegram.ui.Wallet.g8) h8Var.f.get(str2)) == null || !g8Var.b()) ? false : true);
            } else {
                y3Var.j(new v0(this, i17), this.Y2 == null ? null : new v0(this, i19), new v0(this, i20), tL_starGiftUnique.host_id != null);
            }
            org.telegram.ui.Wallet.i5 i5Var = this.Y2;
            if (i5Var != null) {
                i15 = ((org.telegram.ui.ActionBar.k2) i5Var.c).currentAccount;
                boolean F = org.telegram.ui.Wallet.h8.F(i15, i5Var.a.slug);
                org.telegram.ui.Wallet.i5 i5Var2 = this.Y2;
                org.telegram.ui.Wallet.h8 h8Var2 = i5Var2.c.j0;
                boolean z16 = (h8Var2 == null || (nftitem = i5Var2.b) == null || (str = nftitem.address) == null || !str.equals(h8Var2.P0)) ? false : true;
                ph.k kVar = y3Var.J;
                kVar.b(R.drawable.filled_card_color, cd.L0(z16 ? 2131743129 : 2131743135, null), false);
                kVar.setAlpha((F || z16) ? 1.0f : 0.5f);
            }
        }
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) e6.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) tL_starGiftUnique.title);
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) ("#" + cd.E(tL_starGiftUnique.num, ',')));
        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.85f), length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(new org.telegram.messenger.u(zs.U2, 2, false), length, spannableStringBuilder.length(), 33);
        TL_wallet.walletTransaction wallettransaction = this.a3;
        if (wallettransaction != null) {
            charSequence = cd.L0(wallettransaction.incoming ? 2131743101 : 2131743100, null);
            i10 = 1;
        } else {
            if (tLObject != null) {
                i10 = 1;
                charSequence2 = org.telegram.messenger.i0.W2(cd.a0(null, null, 2131743907, org.telegram.messenger.o5.u(tLObject)));
            } else {
                i10 = 1;
                if (tL_starGiftUnique.released_by != null || stargiftattributemodel == null) {
                    charSequence = null;
                } else {
                    charSequence2 = stargiftattributemodel.name;
                }
            }
            charSequence = charSequence2;
        }
        if (tL_textWithEntities == null || textPaint == null) {
            spannable = null;
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(tL_textWithEntities.text);
            jj.b(spannableStringBuilder2, tL_textWithEntities.entities, false, false, false, false, 0);
            spannable = jj.A5(org.telegram.messenger.k6.m(spannableStringBuilder2, textPaint.getFontMetricsInt(), false, null, 0), tL_textWithEntities.entities, textPaint.getFontMetricsInt(), false);
        }
        y3Var.h(0, spannableStringBuilder, charSequence, d2(tL_starGiftUnique.released_by), null, tLObject, spannable);
        ?? r11 = 0;
        this.b3 = null;
        wy0 wy0Var = this.a2;
        wy0Var.removeAllViews();
        if (z10) {
            j10 = 0;
            i11 = 0;
        } else {
            if (tL_starGiftUnique.host_id != null) {
                if (TextUtils.isEmpty(tL_starGiftUnique.owner_address)) {
                    i14 = 0;
                } else {
                    i14 = 0;
                    wy0Var.p(cd.L0(2131750191, null), tL_starGiftUnique.owner_address, new w0(this, i14));
                }
                if (o11 != 0) {
                    int i21 = i14;
                    i12 = i10;
                    this.b3 = ((ty0) this.a2.o(cd.L0(2131750192, null), this.a, o11, new x0(this, o11, i14)).getChildAt(i12)).getChildAt(i21);
                    i13 = i21;
                    obj3 = null;
                } else {
                    i11 = i14;
                    j10 = 0;
                }
            } else {
                i12 = i10;
                if (!TextUtils.isEmpty(tL_starGiftUnique.owner_address)) {
                    wy0Var.p(cd.L0(2131750095, null), tL_starGiftUnique.owner_address, new w0(this, i12));
                } else if (o10 == 0 && tL_starGiftUnique.owner_name != null) {
                    wy0Var.c(cd.L0(2131750095, null), tL_starGiftUnique.owner_name, null, null);
                } else if (o10 != 0) {
                    r11 = 0;
                    j10 = 0;
                    r13 = 0;
                    int i22 = i12;
                    this.b3 = ((ty0) this.a2.o(cd.L0(2131750095, null), this.a, o10, new x0(this, o10, i12)).getChildAt(i22 == true ? 1 : 0)).getChildAt(0);
                    r15 = i22;
                    j1(e6.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class));
                    j1(e6.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
                    j1(e6.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
                    if (!z10) {
                        if (this.z2 == null) {
                            wy0Var.c(cd.L0(2131750063, r11), cd.H(',', "Gift2QuantityIssued1", tL_starGiftUnique.availability_issued) + cd.H(',', "Gift2QuantityIssued2", tL_starGiftUnique.availability_total), r11, r11);
                        } else if (this.E2) {
                            wy0Var.c(cd.L0(2131750063, r11), cd.H(',', "Gift2QuantityIssued1", tL_starGiftUnique.availability_issued) + cd.H(',', "Gift2QuantityIssued2", tL_starGiftUnique.availability_total), r11, r11);
                        } else {
                            TextView textView = (TextView) ((ty0) wy0Var.c(cd.L0(2131750063, r11), "", r11, r11).getChildAt(r15)).getChildAt(r13);
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("x ");
                            u80 u80Var = new u80(textView, org.telegram.messenger.i0.L(90.0f), r13, this.I0);
                            int i23 = org.telegram.ui.ActionBar.t6.G6;
                            u80Var.a(org.telegram.ui.ActionBar.t6.r1(0.21f, org.telegram.ui.ActionBar.t6.w0(i23, this.I0)), org.telegram.ui.ActionBar.t6.r1(0.08f, org.telegram.ui.ActionBar.t6.w0(i23, this.I0)));
                            spannableStringBuilder3.setSpan(u80Var, r13, r15, 33);
                            textView.setText(spannableStringBuilder3, TextView.BufferType.SPANNABLE);
                            if (!this.D2 && !this.E2 && (jjVar = this.z2) != null) {
                                this.D2 = r15;
                                int f12 = jjVar.f1();
                                TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                                tL_messages_getMessages.id.add(Integer.valueOf(f12));
                                ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_getMessages, new org.telegram.messenger.voip.g0(this, f12, 5));
                            }
                        }
                        if (!TextUtils.isEmpty(tL_starGiftUnique.slug) && (tL_starGiftUnique.flags & 256) != 0) {
                            org.telegram.messenger.u1 i24 = org.telegram.messenger.u1.i();
                            long j11 = tL_starGiftUnique.value_amount;
                            String str3 = tL_starGiftUnique.value_currency;
                            int h = org.telegram.messenger.u1.i().h(tL_starGiftUnique.value_currency);
                            i24.getClass();
                            this.a2.e(cd.L0(2131749600, r11), sc.e.h("~", org.telegram.messenger.u1.g(str3, h, j11, r15)), cd.L0(2131749599, r11), new u41(this, tL_starGiftUnique, org.telegram.messenger.u1.i().f(tL_starGiftUnique.value_amount, tL_starGiftUnique.value_currency), 27), null);
                        }
                    }
                    stargiftattributeoriginaldetails = (TL_stars.starGiftAttributeOriginalDetails) e6.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeOriginalDetails.class);
                    if (stargiftattributeoriginaldetails != null) {
                        if ((stargiftattributeoriginaldetails.flags & r15) != 0) {
                            long o12 = org.telegram.messenger.o5.o(stargiftattributeoriginaldetails.sender_id);
                            SpannableString spannableString = new SpannableString(org.telegram.messenger.o5.l(d20.s0, o12));
                            spannableString.setSpan(new j2(this, o12), r13, spannableString.length(), 33);
                            obj = spannableString;
                        } else {
                            obj = r11;
                        }
                        Object obj4 = obj;
                        f7 = 14.0f;
                        long o13 = org.telegram.messenger.o5.o(stargiftattributeoriginaldetails.recipient_id);
                        SpannableString spannableString2 = new SpannableString(org.telegram.messenger.o5.l(d20.s0, o13));
                        spannableString2.setSpan(new k2(this, o13), r13, spannableString2.length(), 33);
                        if (stargiftattributeoriginaldetails.message != null) {
                            TextPaint textPaint2 = new TextPaint((int) r15);
                            textPaint2.setTextSize(org.telegram.messenger.i0.L(14.0f));
                            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(stargiftattributeoriginaldetails.message.text);
                            jj.b(spannableStringBuilder4, stargiftattributeoriginaldetails.message.entities, false, false, false, false, 0);
                            obj2 = jj.A5(org.telegram.messenger.k6.m(spannableStringBuilder4, textPaint2.getFontMetricsInt(), r13, r11, r13), stargiftattributeoriginaldetails.message.entities, textPaint2.getFontMetricsInt(), r13);
                        } else {
                            obj2 = r11;
                        }
                        int i25 = r13;
                        Object replaceAll = cd.D0().B0().format(stargiftattributeoriginaldetails.date * 1000).replaceAll("\\.", "/");
                        if (stargiftattributeoriginaldetails.sender_id != stargiftattributeoriginaldetails.recipient_id) {
                            if (obj4 != null) {
                                if (obj2 == null) {
                                    Object[] objArr = new Object[3];
                                    objArr[i25] = obj4;
                                    objArr[r15] = spannableString2;
                                    objArr[2] = replaceAll;
                                    V2 = cd.V(r11, r11, 2131750395, objArr);
                                } else {
                                    Object[] objArr2 = new Object[4];
                                    objArr2[i25] = obj4;
                                    objArr2[r15] = spannableString2;
                                    objArr2[2] = replaceAll;
                                    objArr2[3] = obj2;
                                    V2 = cd.V(r11, r11, 2131750394, objArr2);
                                }
                            } else if (obj2 == null) {
                                Object[] objArr3 = new Object[2];
                                objArr3[i25] = spannableString2;
                                objArr3[r15] = replaceAll;
                                V2 = cd.V(r11, r11, 2131750393, objArr3);
                            } else {
                                Object[] objArr4 = new Object[3];
                                objArr4[i25] = spannableString2;
                                objArr4[r15] = replaceAll;
                                objArr4[2] = obj2;
                                V = cd.V(r11, r11, 2131750392, objArr4);
                                if (K1(this.a, org.telegram.messenger.o5.o(tL_starGiftUnique.owner_id))) {
                                }
                                uy0 a2 = wy0Var.a(V);
                                a2.setFilled(r15);
                                nh.p pVar = (nh.p) a2.getChildAt(0);
                                pVar.setTextSize(r15, 12.0f);
                                pVar.setGravity(17);
                            }
                            V = V2;
                            if (K1(this.a, org.telegram.messenger.o5.o(tL_starGiftUnique.owner_id))) {
                            }
                            uy0 a22 = wy0Var.a(V);
                            a22.setFilled(r15);
                            nh.p pVar2 = (nh.p) a22.getChildAt(0);
                            pVar2.setTextSize(r15, 12.0f);
                            pVar2.setGravity(17);
                        } else if (obj2 == null) {
                            Object[] objArr5 = new Object[2];
                            objArr5[i25] = obj4;
                            objArr5[r15] = replaceAll;
                            V = cd.V(r11, r11, 2131750391, objArr5);
                            if (K1(this.a, org.telegram.messenger.o5.o(tL_starGiftUnique.owner_id))) {
                                TL_stars.SavedStarGift savedStarGift = this.x2;
                                if (savedStarGift == null || savedStarGift.drop_original_details_stars < j10) {
                                    jj jjVar2 = this.z2;
                                    if (jjVar2 != null && (message = jjVar2.k) != null) {
                                        TLRPC.MessageAction messageAction = message.action;
                                        if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                                        }
                                    }
                                }
                                LinearLayout linearLayout = new LinearLayout(getContext());
                                linearLayout.setPadding(org.telegram.messenger.i0.L(12.66f), org.telegram.messenger.i0.L(9.33f), org.telegram.messenger.i0.L(12.66f), org.telegram.messenger.i0.L(9.33f));
                                linearLayout.setOrientation(i25);
                                nh.p pVar3 = new nh.p(getContext());
                                org.telegram.ui.ActionBar.a7.V(pVar3, org.telegram.ui.ActionBar.t6.G6, this.I0);
                                org.telegram.ui.ActionBar.a7.H(pVar3, org.telegram.ui.ActionBar.t6.Uc, this.I0);
                                pVar3.setTextSize(r15, 12.0f);
                                pVar3.setGravity(3);
                                pVar3.setText(V);
                                linearLayout.addView(pVar3, w7.b6.p(-1, -2, 1.0f, 19));
                                ImageView imageView = new ImageView(getContext());
                                imageView.setScaleType(ImageView.ScaleType.CENTER);
                                int i26 = org.telegram.ui.ActionBar.t6.Ci;
                                org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.t6.a0(org.telegram.ui.ActionBar.t6.r1(0.1f, org.telegram.ui.ActionBar.t6.w0(i26, this.I0)), 6, 6);
                                org.telegram.ui.ActionBar.w6 L = org.telegram.ui.ActionBar.a7.L(0.1f, i26);
                                org.telegram.ui.ActionBar.p6 p6Var = this.I0;
                                imageView.setBackground(a02);
                                org.telegram.ui.ActionBar.a7.k(imageView, a02, r11, L, p6Var);
                                imageView.setImageResource(R.drawable.menu_delete_old);
                                org.telegram.ui.ActionBar.a7.t(imageView, i26, this.I0, PorterDuff.Mode.SRC_IN);
                                w7.e6.a(imageView);
                                imageView.setOnClickListener(new u1(r15, this, V));
                                linearLayout.addView(imageView, w7.b6.q(32, 32, 0.0f, 21, 8, 0, 0, 0));
                                TableRow tableRow = new TableRow(getContext());
                                TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
                                layoutParams.span = 2;
                                tableRow.addView(new uy0(wy0Var, linearLayout, r15), layoutParams);
                                wy0Var.addView(tableRow);
                            }
                            uy0 a222 = wy0Var.a(V);
                            a222.setFilled(r15);
                            nh.p pVar22 = (nh.p) a222.getChildAt(0);
                            pVar22.setTextSize(r15, 12.0f);
                            pVar22.setGravity(17);
                        } else {
                            Object[] objArr6 = new Object[3];
                            objArr6[i25] = obj4;
                            objArr6[r15] = replaceAll;
                            objArr6[2] = obj2;
                            V2 = cd.V(r11, r11, 2131750390, objArr6);
                            V = V2;
                            if (K1(this.a, org.telegram.messenger.o5.o(tL_starGiftUnique.owner_id))) {
                            }
                            uy0 a2222 = wy0Var.a(V);
                            a2222.setFilled(r15);
                            nh.p pVar222 = (nh.p) a2222.getChildAt(0);
                            pVar222.setTextSize(r15, 12.0f);
                            pVar222.setGravity(17);
                        }
                    } else {
                        f7 = 14.0f;
                    }
                    if (this.a3 != null) {
                        this.b3 = r11;
                        wy0Var.removeAllViews();
                        long e = d20.i(this.a).e();
                        this.a2.n(cd.L0(this.a3.incoming ? 2131743041 : 2131743066, r11), this.a, e, new x0(this, e, 3));
                        long abs = Math.abs(this.a3.fee);
                        if (abs > j10) {
                            TextView textView2 = new TextView(getContext());
                            textView2.setGravity(16);
                            textView2.setIncludeFontPadding(false);
                            textView2.setTextSize(r15, f7);
                            org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.G6, this.I0);
                            textView2.setText(org.telegram.ui.Wallet.b6.v0(this.a, abs, this.I0));
                            wy0Var.f(textView2, cd.L0(2131743147, r11));
                        }
                        if (this.a3.date != 0) {
                            wy0Var.c(cd.L0(2131743170, r11), cd.Q(this.a3.date), r11, r11);
                        }
                    }
                    n3Var = this.H2;
                    vh.d dVar = this.c2;
                    if (n3Var != null || !n3Var.o) {
                        if (this.a3 != null) {
                            dVar.setFilled(r15);
                            dVar.i(cd.L0(2131747847, r11), (this.W2 ? 1 : 0) ^ r15, r15);
                            dVar.g(r11, (this.W2 ? 1 : 0) ^ r15);
                            final int i27 = 0;
                            dVar.setOnClickListener(new View.OnClickListener(this) { // from class: rh.g2
                                public final /* synthetic */ e4 b;

                                {
                                    this.b = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i27) {
                                        case 0:
                                            this.b.onBackPressed();
                                            break;
                                        case 1:
                                            this.b.N1();
                                            break;
                                        case 2:
                                            this.b.onBackPressed();
                                            break;
                                        case 3:
                                            n3 n3Var4 = this.b.H2;
                                            n3Var4.h.e();
                                            n3Var4.i.e();
                                            n3Var4.j.e();
                                            n3Var4.k.e();
                                            break;
                                        default:
                                            this.b.R1();
                                            break;
                                    }
                                }
                            });
                        } else if (!K1(this.a, org.telegram.messenger.o5.o(tL_starGiftUnique.owner_id)) && tL_starGiftUnique.resell_amount != null) {
                            dVar.setFilled(r15);
                            l2(tL_starGiftUnique);
                            dVar.setOnClickListener(new View.OnClickListener(this) { // from class: rh.g2
                                public final /* synthetic */ e4 b;

                                {
                                    this.b = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (r15) {
                                        case 0:
                                            this.b.onBackPressed();
                                            break;
                                        case 1:
                                            this.b.N1();
                                            break;
                                        case 2:
                                            this.b.onBackPressed();
                                            break;
                                        case 3:
                                            n3 n3Var4 = this.b.H2;
                                            n3Var4.h.e();
                                            n3Var4.i.e();
                                            n3Var4.j.e();
                                            n3Var4.k.e();
                                            break;
                                        default:
                                            this.b.R1();
                                            break;
                                    }
                                }
                            });
                        } else {
                            if (!this.j2 || this.R1 == null || this.y2 == null || D1() < 0 || this.y2.a(D1()) < 0) {
                                dVar.setFilled(r15);
                                dVar.i(cd.L0(2131747847, r11), (this.W2 ? 1 : 0) ^ r15, r15);
                                dVar.g(r11, (this.W2 ? 1 : 0) ^ r15);
                                final int i28 = 2;
                                dVar.setOnClickListener(new View.OnClickListener(this) { // from class: rh.g2
                                    public final /* synthetic */ e4 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        switch (i28) {
                                            case 0:
                                                this.b.onBackPressed();
                                                break;
                                            case 1:
                                                this.b.N1();
                                                break;
                                            case 2:
                                                this.b.onBackPressed();
                                                break;
                                            case 3:
                                                n3 n3Var4 = this.b.H2;
                                                n3Var4.h.e();
                                                n3Var4.i.e();
                                                n3Var4.j.e();
                                                n3Var4.k.e();
                                                break;
                                            default:
                                                this.b.R1();
                                                break;
                                        }
                                    }
                                });
                                this.l1.setTitle(this.N2);
                                n3Var2 = this.H2;
                                if (n3Var2 == null) {
                                    boolean z17 = this.I2;
                                    w0 w0Var = new w0(this, 24);
                                    w0 w0Var2 = new w0(this, 25);
                                    ArrayList arrayList = n3Var2.f;
                                    y3 y3Var2 = n3Var2.a;
                                    TL_stars.TL_starGiftUnique tL_starGiftUnique3 = n3Var2.l;
                                    if (tL_starGiftUnique3 != null && tL_starGiftUnique3.id == tL_starGiftUnique.id) {
                                        z11 = n3Var2.o;
                                    } else if (z17) {
                                        g9 upgradeImageView = y3Var2.getUpgradeImageView();
                                        q3 q3Var = y3Var2.c;
                                        TL_stars.starGiftAttributeModel upgradeImageViewAttribute = y3Var2.getUpgradeImageViewAttribute();
                                        TL_stars.starGiftAttributePattern upgradePatternAttribute = y3Var2.getUpgradePatternAttribute();
                                        TL_stars.starGiftAttributeBackdrop upgradeBackdropAttribute = y3Var2.getUpgradeBackdropAttribute();
                                        TL_stars.starGiftAttributeModel stargiftattributemodel2 = (TL_stars.starGiftAttributeModel) e6.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
                                        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) e6.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
                                        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) e6.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
                                        n3Var2.o = true;
                                        n3Var2.l = tL_starGiftUnique;
                                        n3Var2.r = w0Var;
                                        n3Var2.s = w0Var2;
                                        n3Var2.t = (float) Math.random();
                                        n3Var2.m = System.currentTimeMillis();
                                        n3Var2.n = 0.0f;
                                        n3Var2.p = false;
                                        n3Var2.q = false;
                                        n3Var2.o = true;
                                        j3 j3Var = n3Var2.h;
                                        if (j3Var != null) {
                                            j3Var.a();
                                        }
                                        l3 l3Var = new l3(q3Var, stargiftattributemodel2);
                                        if (q3Var.isAttachedToWindow() && l3Var.c) {
                                            l3Var.d.P();
                                        }
                                        n3Var2.h = new j3(new h3(n3Var2, 0), n3Var2.e, new l3(upgradeImageView, upgradeImageViewAttribute), l3Var, 0.9f, n3Var2.t > 0.5f ? 3 : 2);
                                        j3 j3Var2 = n3Var2.i;
                                        if (j3Var2 != null) {
                                            j3Var2.a();
                                        }
                                        n3Var2.i = new j3(new h3(n3Var2, 0), n3Var2.g, new m3(upgradePatternAttribute), new m3(stargiftattributepattern), 1.0f, n3Var2.t > 0.5f ? 2 : 1);
                                        j3 j3Var3 = n3Var2.j;
                                        if (j3Var3 != null) {
                                            j3Var3.a();
                                        }
                                        n3Var2.j = new j3(new h3(n3Var2, 0), arrayList, new k3(upgradeBackdropAttribute), new k3(stargiftattributebackdrop), 0.5f, n3Var2.t > 0.5f ? 2 : 1);
                                        j3 j3Var4 = n3Var2.k;
                                        if (j3Var4 != null) {
                                            j3Var4.a();
                                        }
                                        n3Var2.k = new j3(new h3(n3Var2, 0), arrayList, new k3(upgradeBackdropAttribute), new k3(stargiftattributebackdrop), 1.25f, n3Var2.t > 0.5f ? 2 : 1);
                                        n3Var2.b();
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    if (z11) {
                                        y3Var.b.setAlpha(0.0f);
                                        y3Var.c.setAlpha(1.0f);
                                        dVar.i(cd.L0(2131749619, null), true, true);
                                        dVar.setFilled(true);
                                        final int i29 = 3;
                                        dVar.setOnClickListener(new View.OnClickListener(this) { // from class: rh.g2
                                            public final /* synthetic */ e4 b;

                                            {
                                                this.b = this;
                                            }

                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                switch (i29) {
                                                    case 0:
                                                        this.b.onBackPressed();
                                                        break;
                                                    case 1:
                                                        this.b.N1();
                                                        break;
                                                    case 2:
                                                        this.b.onBackPressed();
                                                        break;
                                                    case 3:
                                                        n3 n3Var4 = this.b.H2;
                                                        n3Var4.h.e();
                                                        n3Var4.i.e();
                                                        n3Var4.j.e();
                                                        n3Var4.k.e();
                                                        break;
                                                    default:
                                                        this.b.R1();
                                                        break;
                                                }
                                            }
                                        });
                                        int length2 = ((e4) this.L2.d).K2.length - 1;
                                        tk0 tk0Var = this.k1;
                                        tk0Var.v0(length2);
                                        tk0Var.post(new w0(this, 26));
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            dVar.setFilled(false);
                            int a10 = this.y2.a(D1());
                            SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                            spannableStringBuilder5.append((CharSequence) cd.L0(2131749864, r11));
                            Object obj5 = this.y2.get(a10);
                            if ((obj5 instanceof TL_stars.SavedStarGift) && (starGift = ((TL_stars.SavedStarGift) obj5).gift) != null && (document = starGift.getDocument()) != null) {
                                spannableStringBuilder5.append((CharSequence) " e");
                                spannableStringBuilder5.setSpan(new org.telegram.ui.Components.o5(document, dVar.getTextPaint().getFontMetricsInt()), spannableStringBuilder5.length() - r15, spannableStringBuilder5.length(), 33);
                            }
                            dVar.i(spannableStringBuilder5, (this.W2 ? 1 : 0) ^ r15, r15);
                            dVar.g(r11, (this.W2 ? 1 : 0) ^ r15);
                            dVar.setOnClickListener(new i1(this, a10, 3));
                        }
                    }
                    this.l1.setTitle(this.N2);
                    n3Var2 = this.H2;
                    if (n3Var2 == null) {
                    }
                }
                i13 = 0;
                obj3 = null;
            }
            j10 = 0;
            r15 = i12;
            r11 = obj3;
            r13 = i13;
            j1(e6.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class));
            j1(e6.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
            j1(e6.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
            if (!z10) {
            }
            stargiftattributeoriginaldetails = (TL_stars.starGiftAttributeOriginalDetails) e6.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeOriginalDetails.class);
            if (stargiftattributeoriginaldetails != null) {
            }
            if (this.a3 != null) {
            }
            n3Var = this.H2;
            vh.d dVar2 = this.c2;
            if (n3Var != null) {
            }
            if (this.a3 != null) {
            }
            this.l1.setTitle(this.N2);
            n3Var2 = this.H2;
            if (n3Var2 == null) {
            }
        }
        r15 = i10;
        r13 = i11;
        j1(e6.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class));
        j1(e6.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
        j1(e6.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
        if (!z10) {
        }
        stargiftattributeoriginaldetails = (TL_stars.starGiftAttributeOriginalDetails) e6.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeOriginalDetails.class);
        if (stargiftattributeoriginaldetails != null) {
        }
        if (this.a3 != null) {
        }
        n3Var = this.H2;
        vh.d dVar22 = this.c2;
        if (n3Var != null) {
        }
        if (this.a3 != null) {
        }
        this.l1.setTitle(this.N2);
        n3Var2 = this.H2;
        if (n3Var2 == null) {
        }
    }

    public final void l1(LinearLayout linearLayout, int i10, int i11, int i12, String str, boolean z10) {
        ImageView imageView = new ImageView(getContext());
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(i10);
        org.telegram.ui.ActionBar.p6 p6Var = this.I0;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.a7.t(imageView, i12, p6Var, mode);
        linearLayout.addView(imageView, w7.b6.t(i11, i11, 16, i11 < 15 ? 1 : 0, 0, i11 < 15 ? 1 : 0, 0));
        TextView textView = new TextView(getContext());
        textView.setTextSize(1, 13.0f);
        int i13 = org.telegram.ui.ActionBar.t6.r5;
        org.telegram.ui.ActionBar.a7.V(textView, i13, this.I0);
        textView.setText(str);
        linearLayout.addView(textView, w7.b6.t(-2, -2, 16, 4, 0, 0, 0));
        if (z10) {
            ImageView imageView2 = new ImageView(getContext());
            imageView2.setScaleType(scaleType);
            imageView2.setImageResource(R.drawable.msg_mini_topicarrow);
            org.telegram.ui.ActionBar.a7.t(imageView2, i13, this.I0, mode);
            linearLayout.addView(imageView2, w7.b6.t(11, 11, 16, 5, 0, 2, 0));
        }
    }

    public final void l2(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        sf.a resellAmount = tL_starGiftUnique.getResellAmount(sf.b.a);
        boolean z10 = tL_starGiftUnique.resale_ton_only;
        vh.d dVar = this.c2;
        if (z10) {
            dVar.i(h8.r1(h8.U0(cd.a0(null, null, 2131746163, tL_starGiftUnique.getResellAmount(sf.b.b).d()), true), true), !this.W2, true);
            dVar.g(h8.S0(cd.H(',', "ResellGiftBuyEq", (int) resellAmount.a())), !this.W2);
        } else {
            dVar.i(h8.S0(cd.H(',', "ResellGiftBuy", (int) resellAmount.a())), !this.W2, true);
            dVar.g(null, !this.W2);
        }
    }

    public final void m1(TL_stars.InputSavedStarGift inputSavedStarGift, TLRPC.Updates updates, Runnable runnable) {
        TLRPC.Message message;
        TL_stars.StarGift starGift;
        if (updates == null) {
            e6.y(this.a, false).P(x1());
            dismiss();
            return;
        }
        TLRPC.Update update = updates.update;
        if (update instanceof TL_update.TL_updateNewMessage) {
            message = ((TL_update.TL_updateNewMessage) update).message;
        } else {
            if (updates.updates != null) {
                for (int i10 = 0; i10 < updates.updates.size(); i10++) {
                    TLRPC.Update update2 = updates.updates.get(i10);
                    if (update2 instanceof TL_update.TL_updateNewMessage) {
                        message = ((TL_update.TL_updateNewMessage) update2).message;
                        break;
                    }
                }
            }
            message = null;
        }
        if (message == null) {
            e6.y(this.a, false).P(x1());
            dismiss();
            return;
        }
        TL_stars.SavedStarGift savedStarGift = this.x2;
        if (savedStarGift != null && (!(inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftUser) ? !(!(inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftChat) ? !(inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftSlug) || (starGift = savedStarGift.gift) == null || !TextUtils.equals(starGift.slug, ((TL_stars.TL_inputSavedStarGiftSlug) inputSavedStarGift).slug) : savedStarGift.saved_id != ((TL_stars.TL_inputSavedStarGiftChat) inputSavedStarGift).saved_id) : savedStarGift.msg_id == ((TL_stars.TL_inputSavedStarGiftUser) inputSavedStarGift).msg_id)) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                this.I2 = true;
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                TL_stars.SavedStarGift savedStarGift2 = this.x2;
                savedStarGift2.gift = tL_messageActionStarGiftUnique.gift;
                int i11 = savedStarGift2.flags | 8;
                savedStarGift2.msg_id = message.id;
                savedStarGift2.flags = i11 & (-2049);
                savedStarGift2.saved_id = 0L;
                savedStarGift2.unsaved = !tL_messageActionStarGiftUnique.saved;
                savedStarGift2.refunded = tL_messageActionStarGiftUnique.refunded;
                savedStarGift2.can_upgrade = false;
                savedStarGift2.can_resell_at = tL_messageActionStarGiftUnique.can_resell_at;
                savedStarGift2.can_transfer_at = tL_messageActionStarGiftUnique.can_transfer_at;
                savedStarGift2.can_export_at = tL_messageActionStarGiftUnique.can_export_at;
                j2(savedStarGift2, this.y2);
                this.g3 = null;
                this.I2 = false;
                w5 w5Var = this.y2;
                if (w5Var != null) {
                    w5Var.d();
                } else {
                    e6.y(this.a, false).P(this.P1);
                }
                org.telegram.messenger.i0.g3(runnable);
                return;
            }
        }
        if (this.y2 == null) {
            e6.y(this.a, false).P(x1());
        }
        this.I2 = true;
        this.x2 = null;
        this.w2 = false;
        jj jjVar = new jj(this.a, message, false, false);
        jjVar.K5();
        i2(jjVar, this.y2);
        this.g3 = null;
        this.I2 = false;
        org.telegram.messenger.i0.g3(runnable);
    }

    public final void m2(TL_stars.TL_starGiftUnique tL_starGiftUnique, boolean z10) {
        if (z10) {
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_peerUser.user_id = d20.i(this.a).e();
            tL_starGiftUnique.host_id = tL_peerUser;
            tL_starGiftUnique.flags |= TLObject.FLAG_12;
        } else {
            tL_starGiftUnique.host_id = null;
            tL_starGiftUnique.flags &= -4097;
        }
        this.X1.setWalletDisplayed(z10);
        w2();
    }

    public final boolean n1() {
        TLRPC.Peer peer;
        if (B1() == null) {
            return false;
        }
        jj jjVar = this.z2;
        if (jjVar != null) {
            TLRPC.MessageAction messageAction = jjVar.k.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                return ((!(tL_messageActionStarGift.peer != null) && (!jjVar.P3() || ((jj.B0(this.z2.k) > d20.i(this.a).e() ? 1 : (jj.B0(this.z2.k) == d20.i(this.a).e() ? 0 : -1)) == 0))) || ((peer = tL_messageActionStarGift.peer) != null && L1(this.a, org.telegram.messenger.o5.o(peer)))) && !tL_messageActionStarGift.converted && tL_messageActionStarGift.convert_stars > 0 && vp.r1(this.a).F6 - (ConnectionsManager.getInstance(this.a).getCurrentTime() - this.z2.k.date) > 0;
            }
        } else {
            TL_stars.SavedStarGift savedStarGift = this.x2;
            if (savedStarGift != null) {
                int currentTime = vp.r1(this.a).F6 - (ConnectionsManager.getInstance(this.a).getCurrentTime() - savedStarGift.date);
                int i10 = this.a;
                long j10 = this.P1;
                if (L1(i10, j10)) {
                    int i11 = this.x2.flags;
                    if (((j10 < 0 ? 2048 : 8) & i11) != 0 && (i11 & 16) != 0 && (i11 & 2) != 0 && currentTime > 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void n2() {
        TL_stars.TL_starGiftUnique H1 = H1();
        if (H1 == null) {
            return;
        }
        TLRPC.Peer peer = H1.owner_id;
        if (peer == null) {
            peer = H1.host_id;
        }
        long o10 = org.telegram.messenger.o5.o(peer);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(H1.title);
        sb2.append(" #");
        this.u2.setText(cd.a0(null, null, 2131749842, i0.a.k(H1.num, ',', sb2)));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(cd.L0(2131749844, null));
        if (o10 == d20.i(this.a).e() && !d20.i(this.a).q()) {
            spannableStringBuilder.append((CharSequence) " l");
            if (this.P2 == null) {
                this.P2 = new dq(R.drawable.msg_mini_lock3, 0);
            }
            spannableStringBuilder.setSpan(this.P2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        vh.d dVar = this.c2;
        dVar.i(spannableStringBuilder, true, true);
        dVar.g(null, true);
        dVar.setOnClickListener(new v0(this, 27));
        this.X1.setWearPreview(vp.r1(this.a).d2(o10));
        s2(2, false, null);
        this.s2 = true;
    }

    public final boolean o1() {
        int i10;
        TL_stars.TL_starGiftUnique H1 = H1();
        if (H1 == null || H1.crafted || !L1(this.a, org.telegram.messenger.o5.o(H1.owner_id))) {
            return false;
        }
        jj jjVar = this.z2;
        if (jjVar == null) {
            TL_stars.SavedStarGift savedStarGift = this.x2;
            if (savedStarGift != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
                i10 = savedStarGift.can_craft_at;
            }
        }
        TLRPC.Message message = jjVar.k;
        if (message == null) {
            return false;
        }
        TLRPC.MessageAction messageAction = message.action;
        if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
            return false;
        }
        i10 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction).can_craft_at;
        return i10 > 0 && ConnectionsManager.getInstance(this.a).getCurrentTime() >= i10;
    }

    public final void o2(CharSequence charSequence) {
        TL_stars.TL_starGiftUnique H1 = H1();
        TL_stars.InputSavedStarGift B1 = B1();
        if (B1 == null || H1 == null) {
            return;
        }
        TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails = new TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails();
        tL_inputInvoiceStarGiftDropOriginalDetails.stargift = B1;
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftDropOriginalDetails;
        JSONObject u10 = xh.m2.u(this.I0, false);
        if (u10 != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = u10.toString();
            tL_payments_getPaymentForm.flags |= 1;
        }
        ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getPaymentForm, new mb(this, charSequence, H1, tL_inputInvoiceStarGiftDropOriginalDetails, 13));
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        zs.f(this.a).c(this, zs.G3);
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog
    public final void onBackPressed() {
        y3 y3Var;
        a3 a3Var;
        if (this.T2.c(4) && (y3Var = this.X1) != null && (a3Var = y3Var.M) != null) {
            if (a3Var.h0) {
                return;
            }
            if (a3Var.i0) {
                super.onBackPressed();
                return;
            }
        }
        if (this.s2 || this.T2.b <= 0 || this.c2.Q || this.f3) {
            super.onBackPressed();
            return;
        }
        jj jjVar = this.z2;
        if (jjVar != null) {
            i2(jjVar, null);
        } else {
            TL_stars.SavedStarGift savedStarGift = this.x2;
            if (savedStarGift != null) {
                j2(savedStarGift, this.y2);
            } else {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = this.B2;
                if (tL_starGiftUnique != null) {
                    h2(this.A2, tL_starGiftUnique, this.y2);
                }
            }
        }
        s2(0, true, null);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        zs.f(this.a).n(this, zs.G3);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean p1() {
        if (this.X2 == null && B1() != null) {
            jj jjVar = this.z2;
            if (jjVar != null) {
                TLRPC.Message message = jjVar.k;
                if (message != null) {
                    TLRPC.MessageAction messageAction = message.action;
                    if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                        TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                        TL_stars.StarGift starGift = tL_messageActionStarGift.gift;
                        if ((starGift instanceof TL_stars.TL_starGift) && !starGift.limited && starGift.availability_total <= 0 && !starGift.auction && !tL_messageActionStarGift.converted && !tL_messageActionStarGift.upgraded && !tL_messageActionStarGift.refunded && tL_messageActionStarGift.convert_stars > 0) {
                            boolean P3 = jjVar.P3();
                            boolean z10 = jj.B0(this.z2.k) == d20.i(this.a).e();
                            TLRPC.Peer peer = tL_messageActionStarGift.peer;
                            if (peer != null) {
                                return L1(this.a, org.telegram.messenger.o5.o(peer));
                            }
                            if (!P3 || z10) {
                                return true;
                            }
                        }
                    }
                }
            } else {
                TL_stars.SavedStarGift savedStarGift = this.x2;
                if (savedStarGift != null) {
                    TL_stars.StarGift starGift2 = savedStarGift.gift;
                    if (!(starGift2 instanceof TL_stars.TL_starGift) || starGift2.limited || starGift2.availability_total > 0 || starGift2.auction || savedStarGift.refunded || !L1(this.a, this.P1)) {
                    }
                }
            }
        }
        return false;
    }

    public final void p2(View view, CharSequence charSequence, boolean z10) {
        Layout layout;
        float primaryHorizontal;
        vh.p2 p2Var = this.q3;
        if ((p2Var != null && p2Var.V && this.r3 == view) || view == null) {
            return;
        }
        if (!z10) {
            if (view instanceof TextView) {
                layout = ((TextView) view).getLayout();
            } else if (!(view instanceof org.telegram.ui.ActionBar.u5)) {
                return;
            } else {
                layout = ((org.telegram.ui.ActionBar.u5) view).getLayout();
            }
            if (layout == null) {
                return;
            }
            CharSequence text = layout.getText();
            if (!(text instanceof Spanned)) {
                return;
            }
            Spanned spanned = (Spanned) text;
            fc[] fcVarArr = (fc[]) spanned.getSpans(0, spanned.length(), fc.class);
            if (fcVarArr == null || fcVarArr.length <= 0) {
                return;
            }
            primaryHorizontal = layout.getPrimaryHorizontal(spanned.getSpanStart(fcVarArr[fcVarArr.length - 1])) + view.getPaddingLeft() + (r5.a() / 2.0f);
        } else {
            if (!(view instanceof org.telegram.ui.ActionBar.u5)) {
                return;
            }
            org.telegram.ui.ActionBar.u5 u5Var = (org.telegram.ui.ActionBar.u5) view;
            primaryHorizontal = (u5Var.getRightDrawableWidth() / 2.0f) + u5Var.getRightDrawableX();
        }
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr);
        jg.b1 b1Var = this.Q1;
        b1Var.getLocationOnScreen(iArr2);
        iArr[0] = iArr[0] - iArr2[0];
        iArr[1] = iArr[1] - iArr2[1];
        vh.p2 p2Var2 = this.q3;
        if (p2Var2 != null) {
            p2Var2.e(true);
            this.q3 = null;
        }
        vh.p2 p2Var3 = new vh.p2(getContext(), 3);
        p2Var3.p(!z10);
        p2Var3.s(charSequence);
        p2Var3.m(0.0f, (iArr[0] + primaryHorizontal) - (org.telegram.messenger.i0.L(16.0f) + this.t0));
        p2Var3.setTranslationY(((iArr[1] - org.telegram.messenger.i0.L(100.0f)) - (view.getHeight() / 2.0f)) + org.telegram.messenger.i0.L((z10 ? 18 : 0) + 4.33f));
        p2Var3.d = 3000L;
        p2Var3.setPadding(org.telegram.messenger.i0.L(16.0f) + this.t0, 0, org.telegram.messenger.i0.L(16.0f) + this.t0, 0);
        p2Var3.l0 = new ph.p(p2Var3, 1);
        p2Var3.u();
        b1Var.addView(p2Var3, w7.b6.c(100.0f, -1));
        this.q3 = p2Var3;
        this.r3 = view;
    }

    public final void q1() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.I0);
        String L0 = cd.L0(2131750275, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        x1Var.R = L0;
        x1Var.T = cd.L0(2131750276, null);
        TL_stars.TL_starGiftUnique H1 = H1();
        if (H1 != null && !TextUtils.isEmpty(H1.slug)) {
            alertDialog$Builder.k(cd.L0(2131747821, null), new c2(this, H1, 1));
        }
        i0.a.s(null, 2131752589, alertDialog$Builder, null);
    }

    public final void q2(int i10, Context context, boolean z10) {
        LinearLayout f7 = org.telegram.messenger.m5.f(context, 1);
        FrameLayout frameLayout = new FrameLayout(context);
        int L = org.telegram.messenger.i0.L(64.0f);
        int i11 = org.telegram.ui.ActionBar.t6.Ci;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.t6.L(L, org.telegram.ui.ActionBar.t6.w0(i11, this.I0));
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i11);
        org.telegram.ui.ActionBar.p6 p6Var = this.I0;
        frameLayout.setBackground(L2);
        org.telegram.ui.ActionBar.a7.k(frameLayout, L2, N, null, p6Var);
        f7.addView(frameLayout, w7.b6.t(64, 64, 49, 0, 6, 0, 0));
        ei0 ei0Var = new ei0(context);
        ei0Var.setScaleType(ImageView.ScaleType.CENTER);
        ei0Var.f(R.raw.timer_3, 42, 42, null);
        frameLayout.addView(ei0Var, w7.b6.r(64, 64, 17));
        ei0Var.d();
        TextView b10 = w7.g6.b(context, 20.0f, org.telegram.ui.ActionBar.t6.G6, true, null);
        b10.setGravity(17);
        b10.setText(cd.L0(z10 ? 2131750014 : 2131749920, null));
        f7.addView(b10, w7.b6.t(-1, -2, 48, 24, 14, 24, 0));
        TextView b11 = w7.g6.b(context, 14.0f, org.telegram.ui.ActionBar.t6.F6, false, null);
        b11.setGravity(17);
        b11.setText(cd.a0(null, null, z10 ? 2131750015 : 2131749921, cd.c0(Math.max(10, i10))));
        f7.addView(b11, w7.b6.t(-1, -2, 48, 24, 6, 24, 6));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, this.I0);
        alertDialog$Builder.o(f7);
        alertDialog$Builder.k(cd.L0(2131747847, null), null);
        alertDialog$Builder.p();
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void r0() {
        vh.p2 p2Var = this.q3;
        if (p2Var != null) {
            p2Var.e(true);
            this.q3 = null;
        }
    }

    public final void r1(long j10, TL_stars.starGiftDepositPayload stargiftdepositpayload, gf.e eVar, mg.i2 i2Var) {
        TL_wallet.nftItem nftitem = this.X2;
        TL_stars.TL_starGiftUnique H1 = H1();
        if (nftitem == null || H1 == null || TextUtils.isEmpty(H1.slug)) {
            return;
        }
        eVar.d();
        rl rlVar = new rl(this, eVar, i2Var, j10, H1, nftitem, 2);
        if (stargiftdepositpayload != null) {
            rlVar.a(stargiftdepositpayload);
            return;
        }
        TL_stars.depositStarGift depositstargift = new TL_stars.depositStarGift();
        depositstargift.peer = vp.r1(this.a).i1(j10);
        depositstargift.slug = H1.slug;
        ConnectionsManager.getInstance(this.a).sendRequestTyped(depositstargift, new a3.b(1), new cj0(this, eVar, i2Var, rlVar, 3));
    }

    public final void r2(boolean z10, org.telegram.ui.ActionBar.x1 x1Var, gf.e eVar, Runnable runnable) {
        eVar.d();
        d20 i10 = d20.i(this.a);
        TL_account.tmpPassword tmppassword = i10.y;
        if (tmppassword != null && tmppassword.valid_until < ConnectionsManager.getInstance(this.a).getCurrentTime() + 60) {
            i10.y = null;
            i10.v(false);
        }
        TL_account.tmpPassword tmppassword2 = i10.y;
        if (tmppassword2 == null) {
            V1(z10, eVar, runnable);
        } else {
            J1(tmppassword2.tmp_password, null, z10, new org.telegram.ui.Wallet.u1(this, z10, eVar, runnable, x1Var));
        }
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void s0() {
        super.s0();
        try {
            Q(org.telegram.ui.ActionBar.t6.h5);
            y3 y3Var = this.X1;
            if (y3Var != null) {
                y3Var.l();
            }
            dq dqVar = this.V2;
            if (dqVar != null) {
                Drawable drawable = dqVar.c;
                if (drawable instanceof z3) {
                    ((z3) drawable).d.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, this.I0));
                    vh.d dVar = this.c2;
                    if (dVar != null) {
                        dVar.invalidate();
                    }
                }
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public final void s1(final long j10, final q20 q20Var) {
        TLRPC.Message message;
        long o10;
        long j11;
        TL_stars.InputSavedStarGift B1 = B1();
        if (B1 == null) {
            return;
        }
        TL_stars.SavedStarGift savedStarGift = this.x2;
        if (savedStarGift == null || !(savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
            jj jjVar = this.z2;
            if (jjVar == null || (message = jjVar.k) == null) {
                return;
            }
            TLRPC.MessageAction messageAction = message.action;
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                return;
            }
            TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
            o10 = org.telegram.messenger.o5.o(tL_messageActionStarGiftUnique.gift.owner_id);
            j11 = tL_messageActionStarGiftUnique.transfer_stars;
        } else {
            j11 = savedStarGift.transfer_stars;
            o10 = this.P1;
        }
        if (j11 <= 0) {
            TL_stars.transferStarGift transferstargift = new TL_stars.transferStarGift();
            transferstargift.stargift = B1;
            transferstargift.to_id = vp.r1(this.a).i1(j10);
            final long j12 = o10;
            ConnectionsManager.getInstance(this.a).sendRequest(transferstargift, new RequestDelegate() { // from class: rh.j1
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    boolean z10 = tLObject instanceof TLRPC.Updates;
                    e4 e4Var = e4.this;
                    if (z10) {
                        vp.r1(e4Var.a).L3((TLRPC.Updates) tLObject, false);
                    }
                    org.telegram.messenger.i0.g3(new org.telegram.ui.Wallet.n0(e4Var, q20Var, tL_error, tLObject, j10, j12));
                }
            });
            return;
        }
        final long j13 = o10;
        e6 y3 = e6.y(this.a, false);
        if (!y3.e) {
            y3.r(new ag.a3(this, y3, j10, q20Var, 15));
            return;
        }
        final TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer = new TLRPC.TL_inputInvoiceStarGiftTransfer();
        tL_inputInvoiceStarGiftTransfer.stargift = B1;
        tL_inputInvoiceStarGiftTransfer.to_id = vp.r1(this.a).i1(j10);
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftTransfer;
        JSONObject u10 = xh.m2.u(this.I0, false);
        if (u10 != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = u10.toString();
            tL_payments_getPaymentForm.flags |= 1;
        }
        ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() { // from class: rh.k1
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                final e4 e4Var = e4.this;
                final TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer2 = tL_inputInvoiceStarGiftTransfer;
                final long j14 = j10;
                final long j15 = j13;
                final q20 q20Var2 = q20Var;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: rh.q1
                    @Override // java.lang.Runnable
                    public final void run() {
                        TLObject tLObject2 = tLObject;
                        boolean z10 = tLObject2 instanceof TLRPC.PaymentForm;
                        e4 e4Var2 = e4.this;
                        q20 q20Var3 = q20Var2;
                        if (!z10) {
                            TLRPC.TL_error tL_error2 = tL_error;
                            q20Var3.a(tL_error2);
                            wb Y = e4Var2.k().Y(tL_error2);
                            Y.t = true;
                            Y.j();
                            return;
                        }
                        TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject2;
                        int i10 = 0;
                        vp.r1(e4Var2.a).V3(paymentForm.users, false);
                        TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
                        tL_payments_sendStarsForm.form_id = paymentForm.form_id;
                        tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftTransfer2;
                        ArrayList<TLRPC.TL_labeledPrice> arrayList = paymentForm.invoice.prices;
                        int size = arrayList.size();
                        long j16 = 0;
                        while (i10 < size) {
                            TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i10);
                            i10++;
                            j16 += tL_labeledPrice.amount;
                        }
                        ConnectionsManager.getInstance(e4Var2.a).sendRequest(tL_payments_sendStarsForm, new h1(e4Var2, j14, j15, q20Var3, j16));
                    }
                });
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s2(int i10, boolean z10, yv0 yv0Var) {
        int i11;
        vh.p2 p2Var;
        n3 n3Var;
        ValueAnimator valueAnimator = this.U2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.U2 = null;
        }
        y3 y3Var = this.X1;
        int i12 = 1;
        if (i10 != 1) {
            org.telegram.messenger.i0.r(y3Var.l0);
        }
        if (!this.W2) {
            this.S2 = Float.valueOf(this.Q1.f());
        }
        f4.d dVar = this.T2;
        this.T2 = new f4.d(dVar == null ? 0 : dVar.b, i10);
        kg.f fVar = this.L2;
        int finalHeight = y3Var.getFinalHeight();
        int w12 = w1();
        if (this.T2.d(1)) {
            FrameLayout frameLayout = this.f2;
            if (frameLayout.getVisibility() == 0) {
                i11 = frameLayout.getMeasuredHeight();
                fVar.H(finalHeight, w12 + i11);
                if (this.T2.b == 0 && (n3Var = this.H2) != null) {
                    n3Var.c();
                }
                m2 m2Var = this.v2;
                int i13 = 2;
                m2 m2Var2 = this.t2;
                m2 m2Var3 = this.k2;
                m2 m2Var4 = this.Y1;
                if (z10) {
                    this.T2.c = 1.0f;
                    P1();
                    m2Var4.setVisibility(i10 == 0 ? 0 : 8);
                    m2Var3.setVisibility(i10 == 1 ? 0 : 8);
                    m2Var2.setVisibility(i10 == 2 ? 0 : 8);
                    m2Var.setVisibility(i10 != 3 ? 8 : 0);
                    u2();
                    if (yv0Var != null) {
                        yv0Var.run();
                    }
                } else {
                    m2Var4.setVisibility(this.T2.b(0) ? 0 : 8);
                    m2Var3.setVisibility(this.T2.b(1) ? 0 : 8);
                    m2Var2.setVisibility(this.T2.b(2) ? 0 : 8);
                    m2Var.setVisibility(this.T2.b(3) ? 0 : 8);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.U2 = ofFloat;
                    ofFloat.addUpdateListener(new qh.e0(this, i12));
                    this.U2.addListener(new jh(this, i10, yv0Var, i13));
                    this.U2.setInterpolator(gr.h);
                    this.U2.setDuration(320L);
                    this.U2.start();
                    f4.d dVar2 = this.T2;
                    g9[] g9VarArr = y3Var.d;
                    int i14 = dVar2.a;
                    int i15 = dVar2.b;
                    if (i14 != i15) {
                        bi0 B = g9VarArr[i14].getImageReceiver().B();
                        bi0 B2 = g9VarArr[i15].getImageReceiver().B();
                        if (B2 != null && B != null) {
                            B2.T(false, B.t());
                        }
                    }
                }
                p2Var = this.q3;
                if (p2Var == null) {
                    p2Var.e(true);
                    this.q3 = null;
                    return;
                }
                return;
            }
        }
        i11 = 0;
        fVar.H(finalHeight, w12 + i11);
        if (this.T2.b == 0) {
            n3Var.c();
        }
        m2 m2Var5 = this.v2;
        int i132 = 2;
        m2 m2Var22 = this.t2;
        m2 m2Var32 = this.k2;
        m2 m2Var42 = this.Y1;
        if (z10) {
        }
        p2Var = this.q3;
        if (p2Var == null) {
        }
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog
    public final void show() {
        jj jjVar;
        TLRPC.Message message;
        if (vp.r1(this.a).u2()) {
            org.telegram.ui.b.b(this.a);
            return;
        }
        if (this.A2 != null && this.B2 == null) {
            org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, getContext(), null);
            x1Var.r(500L);
            TL_stars.getUniqueStarGift getuniquestargift = new TL_stars.getUniqueStarGift();
            getuniquestargift.slug = this.A2;
            ConnectionsManager.getInstance(this.a).sendRequest(getuniquestargift, new ul0(25, this, x1Var));
        } else if (this.x2 == null && (jjVar = this.z2) != null && (message = jjVar.k) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                if (tL_messageActionStarGift.upgraded) {
                    if (tL_messageActionStarGift.upgrade_msg_id != 0) {
                        org.telegram.ui.ActionBar.x1 x1Var2 = new org.telegram.ui.ActionBar.x1(3, getContext(), null);
                        x1Var2.r(500L);
                        TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                        tL_messages_getMessages.id.add(Integer.valueOf(tL_messageActionStarGift.upgrade_msg_id));
                        ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_getMessages, new ag.p0(this, tL_messageActionStarGift, x1Var2, 18));
                        return;
                    }
                    if (B1() != null) {
                        org.telegram.ui.ActionBar.x1 x1Var3 = new org.telegram.ui.ActionBar.x1(3, getContext(), null);
                        x1Var3.r(500L);
                        e6.y(this.a, false).M(B1(), new f11(27, this, x1Var3));
                        return;
                    }
                }
            }
        }
        super.show();
    }

    public final void t1() {
        TL_stars.InputSavedStarGift B1;
        long j10;
        vh.d dVar = this.c2;
        if (dVar.Q || (B1 = B1()) == null) {
            return;
        }
        jj jjVar = this.z2;
        String str = null;
        long j11 = 0;
        if (jjVar != null) {
            TLRPC.MessageAction messageAction = jjVar.k.action;
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGift)) {
                return;
            }
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
            j10 = tL_messageActionStarGift.upgrade_stars;
            if (j10 <= 0) {
                str = tL_messageActionStarGift.prepaid_upgrade_hash;
            }
        } else {
            TL_stars.SavedStarGift savedStarGift = this.x2;
            if (savedStarGift == null) {
                return;
            }
            j10 = savedStarGift.upgrade_stars;
            if (j10 <= 0) {
                str = savedStarGift.prepaid_upgrade_hash;
            }
        }
        if (j10 > 0 || this.k3 != null) {
            dVar.setLoading(true);
            ep epVar = this.o2;
            if (j10 > 0) {
                TL_stars.upgradeStarGift upgradestargift = new TL_stars.upgradeStarGift();
                upgradestargift.keep_original_details = epVar.a.q;
                upgradestargift.stargift = B1;
                ConnectionsManager.getInstance(this.a).sendRequest(upgradestargift, new ul0(27, this, B1));
                return;
            }
            int i10 = 0;
            e6 y3 = e6.y(this.a, false);
            if (!y3.e) {
                y3.r(new o(4, this, y3));
                return;
            }
            TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
            tL_payments_sendStarsForm.form_id = this.k3.form_id;
            if (TextUtils.isEmpty(str)) {
                TLRPC.TL_inputInvoiceStarGiftUpgrade tL_inputInvoiceStarGiftUpgrade = new TLRPC.TL_inputInvoiceStarGiftUpgrade();
                tL_inputInvoiceStarGiftUpgrade.keep_original_details = epVar.a.q;
                tL_inputInvoiceStarGiftUpgrade.stargift = B1;
                tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftUpgrade;
            } else {
                TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade tL_inputInvoiceStarGiftPrepaidUpgrade = new TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade();
                tL_inputInvoiceStarGiftPrepaidUpgrade.hash = str;
                tL_inputInvoiceStarGiftPrepaidUpgrade.peer = vp.r1(this.a).i1(this.P1);
                tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftPrepaidUpgrade;
            }
            ArrayList<TLRPC.TL_labeledPrice> arrayList = this.k3.invoice.prices;
            int size = arrayList.size();
            while (i10 < size) {
                TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i10);
                i10++;
                j11 += tL_labeledPrice.amount;
            }
            ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_sendStarsForm, new c70(this, str, B1, j11, 3));
        }
    }

    public final void t2(boolean z10) {
        boolean z11;
        TL_stars.TL_starGiftUnique H1 = H1();
        if (H1 == null) {
            return;
        }
        vp.d1().edit().putInt("statusgiftpage", 3).apply();
        boolean M1 = M1(this.a, H1());
        boolean z12 = !M1;
        boolean M12 = M1(this.a, H1());
        vh.d dVar = this.c2;
        if (M12) {
            vp.r1(this.a).d5(x1(), new TLRPC.TL_emojiStatusEmpty(), null);
            z11 = z12;
        } else {
            z11 = z12;
            long x12 = x1();
            if (x12 >= 0) {
                if (!d20.i(this.a).q()) {
                    wb P = k().P(R.raw.star_premium_2, org.telegram.messenger.i0.x2(cd.L0(2131750432, null), new w0(this, 2)));
                    P.t = true;
                    P.j();
                    return;
                }
            } else if (!z10) {
                vp r12 = vp.r1(this.a);
                dVar.setLoading(true);
                vp.r1(this.a).G0().a(x12, new au(this, r12, x12, 3));
                return;
            }
            TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible = new TLRPC.TL_inputEmojiStatusCollectible();
            tL_inputEmojiStatusCollectible.collectible_id = H1.id;
            vp.r1(this.a).d5(x1(), tL_inputEmojiStatusCollectible, H1);
        }
        this.X1.I[1].b(!M1 ? R.drawable.filled_crown_off : R.drawable.filled_crown_on, cd.L0(!M1 ? 2131750431 : 2131750434, null), true);
        if (this.s2) {
            dismiss();
            return;
        }
        yv0 yv0Var = new yv0(6, this, z11);
        if (this.T2.c(0)) {
            yv0Var.run();
        } else {
            s2(0, true, yv0Var);
        }
        dVar.i(cd.L0(2131747847, null), !this.W2, true);
        dVar.g(null, !this.W2);
        dVar.setOnClickListener(new v0(this, 5));
    }

    public final void u2() {
        FrameLayout frameLayout = this.f2;
        int visibility = frameLayout.getVisibility();
        FrameLayout frameLayout2 = this.h2;
        FrameLayout frameLayout3 = this.d2;
        if (visibility != 0) {
            frameLayout3.setTranslationY(0.0f);
            frameLayout.setTranslationY(0.0f);
            frameLayout2.setTranslationY(0.0f);
        } else {
            frameLayout3.setTranslationY(this.T2.a(1) * (-frameLayout.getMeasuredHeight()));
            frameLayout.setTranslationY((1.0f - this.T2.a(1)) * frameLayout.getMeasuredHeight());
            frameLayout2.setTranslationY(this.T2.a(1) * (-frameLayout.getMeasuredHeight()));
        }
    }

    public final void v2() {
        boolean I1 = I1(false);
        l2 l2Var = this.R1;
        l2Var.setPosition(I1 ? 1 : 0);
        l2Var.D(false);
        if (this.y2 == null || I1(true) || this.y2.e() >= this.y2.c()) {
            return;
        }
        this.y2.b();
    }

    public final int w1() {
        if (this.T2.d(1)) {
            return this.k2.getMeasuredHeight();
        }
        if (this.T2.d(2)) {
            return this.t2.getMeasuredHeight();
        }
        if (this.T2.d(3)) {
            return this.v2.getMeasuredHeight();
        }
        if (this.T2.d(4)) {
            return 0;
        }
        return this.Y1.getMeasuredHeight();
    }

    public final void w2() {
        TL_stars.TL_starGiftUnique H1 = H1();
        TL_wallet.nftItem nftitem = this.X2;
        LinearLayout linearLayout = this.q2;
        if (nftitem == null || H1 == null) {
            linearLayout.setVisibility(8);
            return;
        }
        this.Z1.setVisibility(8);
        this.b2.setVisibility(8);
        linearLayout.setVisibility(0);
        this.r2.a(H1.host_id != null, linearLayout.isAttachedToWindow());
    }

    public final long x1() {
        TLRPC.Peer peer;
        jj jjVar = this.z2;
        if (jjVar == null) {
            TL_stars.SavedStarGift savedStarGift = this.x2;
            if (savedStarGift != null) {
                TL_stars.StarGift starGift = savedStarGift.gift;
                return starGift instanceof TL_stars.TL_starGiftUnique ? org.telegram.messenger.o5.o(((TL_stars.TL_starGiftUnique) starGift).owner_id) : this.P1;
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.B2;
            if (tL_starGiftUnique != null) {
                return org.telegram.messenger.o5.o(tL_starGiftUnique.owner_id);
            }
            return 0L;
        }
        TLRPC.Message message = jjVar.k;
        if (message == null) {
            return 0L;
        }
        TLRPC.MessageAction messageAction = message.action;
        if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
            TLRPC.Peer peer2 = ((TLRPC.TL_messageActionStarGift) messageAction).peer;
            return peer2 != null ? org.telegram.messenger.o5.o(peer2) : jjVar.P3() ? jj.B0(this.z2.k) : d20.i(this.a).e();
        }
        if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
            return 0L;
        }
        TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
        TL_stars.StarGift starGift2 = tL_messageActionStarGiftUnique.gift;
        if ((starGift2 instanceof TL_stars.TL_starGiftUnique) && (peer = starGift2.owner_id) != null) {
            return org.telegram.messenger.o5.o(peer);
        }
        TLRPC.Peer peer3 = tL_messageActionStarGiftUnique.peer;
        if (peer3 != null) {
            return org.telegram.messenger.o5.o(peer3);
        }
        return 0L;
    }

    public final TL_stars.StarGift y1() {
        jj jjVar = this.z2;
        if (jjVar != null) {
            TLRPC.Message message = jjVar.k;
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
            TL_stars.SavedStarGift savedStarGift = this.x2;
            if (savedStarGift != null) {
                return savedStarGift.gift;
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.B2;
            if (tL_starGiftUnique != null) {
                return tL_starGiftUnique;
            }
        }
        return null;
    }

    public final String z1() {
        TL_stars.StarGift y12 = y1();
        if (!(y12 instanceof TL_stars.TL_starGiftUnique)) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(((TL_stars.TL_starGiftUnique) y12).title);
        sb2.append(" #");
        return i0.a.k(r0.num, ',', sb2);
    }
}
