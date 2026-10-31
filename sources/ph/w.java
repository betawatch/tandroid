package ph;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableRow;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.m5;
import org.telegram.messenger.r9;
import org.telegram.messenger.t9;
import org.telegram.messenger.w9;
import org.telegram.messenger.x9;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.w6;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.ha;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.vy0;
import org.telegram.ui.Components.wy0;
import org.telegram.ui.st0;
import rh.h8;
import w7.b6;
import w7.e6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class w extends ha implements w9 {
    public static final ec[] h2 = new ec[1];
    public static final vy0[] i2 = new vy0[1];
    public final TL_stars.StarGift P1;
    public final long Q1;
    public final LinearLayout R1;
    public final FrameLayout S1;
    public final TextView T1;
    public final ec U1;
    public final ec V1;
    public final ec W1;
    public final ec X1;
    public final vy0 Y1;
    public final org.telegram.tgnet.e Z1;
    public final TableRow a2;
    public final vh.d b2;
    public final p80 c2;
    public final p80 d2;
    public t9 e2;
    public final CharSequence f2;
    public p51 g2;

    public w(Context context, p6 p6Var, long j10, TL_stars.StarGift starGift, Runnable runnable) {
        super(context, null, false, false, 1, p6Var);
        boolean z10;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState;
        ArrayList<TL_stars.StarGiftAuctionRound> arrayList;
        int i10;
        int i11;
        String a02;
        String G;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState2;
        this.P1 = starGift;
        long j11 = starGift.id;
        this.Q1 = j11;
        this.B1 = org.telegram.messenger.i0.L(6.0f);
        this.r1 = 0.2f;
        O();
        String str = starGift.title;
        String str2 = str == null ? "Gift" : str;
        LinearLayout linearLayout = new LinearLayout(context);
        this.R1 = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setClickable(true);
        org.telegram.ui.ActionBar.l lVar = new org.telegram.ui.ActionBar.l(context, p6Var);
        lVar.D(-1, false);
        lVar.setOccupyStatusBar(false);
        d1(lVar, context, p6Var, starGift);
        FrameLayout frameLayout = new FrameLayout(context);
        this.S1 = frameLayout;
        frameLayout.addView(lVar, b6.o(-1, -2));
        linearLayout.addView(frameLayout);
        s sVar = new s(this.a, context, p6Var);
        sVar.c0 = true;
        sVar.h(starGift, false, false, false, false, false);
        sVar.setImageSize(org.telegram.messenger.i0.L(100.0f));
        sVar.setImageLayer(7);
        sVar.J.setVisibility(8);
        frameLayout.addView(sVar, b6.d(zs.O1, 130.0f, 17, 0.0f, 18.0f, 0.0f, 14.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setGravity(17);
        textView.setText(str2);
        textView.setTextSize(1, 20.0f);
        int i12 = t6.G6;
        a7.V(textView, i12, p6Var);
        linearLayout.addView(textView, b6.t(-1, -2, 17, 20, 0, 20, 6));
        p80 p80Var = new p80(context, null);
        this.c2 = p80Var;
        p80Var.setGravity(17);
        p80Var.setText(TextUtils.concat(org.telegram.messenger.i0.W2(cd.G(starGift.gifts_per_round, "Gift2AuctionInfo2", str2)), " ", org.telegram.messenger.i0.H2(org.telegram.messenger.i0.T2(cd.L0(2131750366, null), new q(context, p6Var, starGift, 0)), true, org.telegram.messenger.i0.L(2.6666667f), org.telegram.messenger.i0.L(1.0f))));
        p80Var.setTextSize(1, 14.0f);
        a7.V(p80Var, i12, p6Var);
        int i13 = t6.J6;
        a7.H(p80Var, i13, p6Var);
        linearLayout.addView(p80Var, b6.t(-1, -2, 17, 20, 0, 20, 4));
        wy0 wy0Var = new wy0(context, p6Var);
        String L0 = cd.L0(2131750332, null);
        ec[] ecVarArr = h2;
        wy0Var.c(L0, "", null, ecVarArr);
        this.U1 = ecVarArr[0];
        wy0Var.c(cd.L0(2131750333, null), "", null, ecVarArr);
        this.V1 = ecVarArr[0];
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.setClipChildren(false);
        frameLayout2.setClipToPadding(false);
        frameLayout2.addView(wy0Var, b6.e(-1, -2, zs.E1));
        this.Z1 = new org.telegram.tgnet.e(this, new vh.p2[1], frameLayout2, 5);
        TableRow c10 = wy0Var.c(cd.L0(2131749597, null), "", null, ecVarArr);
        this.a2 = c10;
        final int i14 = 1;
        c10.setOnClickListener(new View.OnClickListener(this) { // from class: ph.r
            public final /* synthetic */ w b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        new kg.i1(40, this.b.getContext(), (p6) null).show();
                        break;
                    default:
                        this.b.f1();
                        break;
                }
            }
        });
        this.W1 = ecVarArr[0];
        vy0[] vy0VarArr = i2;
        wy0Var.c("", "", vy0VarArr, ecVarArr);
        this.X1 = ecVarArr[0];
        this.Y1 = vy0VarArr[0];
        linearLayout.addView(frameLayout2, b6.k(16.0f, 16.0f, 14.0f, 18.0f, -1, -2));
        p80 p80Var2 = new p80(context, p6Var);
        this.d2 = p80Var2;
        p80Var2.setGravity(17);
        p80Var2.setTextSize(1, 16.0f);
        a7.V(p80Var2, i13, p6Var);
        a7.H(p80Var2, i13, p6Var);
        p80Var2.setOnClickListener(new ag.i(this, new boolean[1], p6Var, 26));
        e6.b(p80Var2, 0.02f, 1.5f);
        if (starGift.sticker != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
            z10 = false;
            spannableStringBuilder.setSpan(new o5(starGift.sticker, p80Var2.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
            this.f2 = spannableStringBuilder;
        } else {
            z10 = false;
            this.f2 = "";
        }
        vh.d dVar = new vh.d(context, p6Var, true);
        this.b2 = dVar;
        dVar.f();
        final int i15 = z10;
        dVar.setOnClickListener(new n(this, j10, context, p6Var, runnable, 0));
        FrameLayout.LayoutParams d = b6.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i16 = d.leftMargin;
        int i17 = this.t0;
        d.leftMargin = i16 + i17;
        d.rightMargin += i17;
        this.b.addView(dVar, d);
        tk0 tk0Var = this.k1;
        int i18 = this.t0;
        tk0Var.setPadding(i18, i15, i18, org.telegram.messenger.i0.L(64.0f));
        this.g2.O(i15);
        t9 l4 = x9.c(this.a).l(j11, this);
        this.e2 = l4;
        if (l4 != null && (tL_starGiftAuctionState2 = l4.f) != null) {
            if (tL_starGiftAuctionState2.start_date > ConnectionsManager.getInstance(this.a).getCurrentTime()) {
                wy0Var.c(cd.L0(2131750340, null), cd.E(this.e2.f.total_rounds, ','), null, null);
            } else {
                String L02 = cd.L0(2131750341, null);
                String E = cd.E(this.e2.f.current_round, ',');
                String E2 = cd.E(this.e2.f.total_rounds, ',');
                Object[] objArr = new Object[2];
                objArr[i15] = E;
                objArr[1] = E2;
                wy0Var.c(L02, cd.a0(null, null, 2131747844, objArr), null, null);
            }
        }
        t9 t9Var = this.e2;
        if (t9Var != null && (tL_starGiftAuctionState = t9Var.f) != null && (arrayList = tL_starGiftAuctionState.rounds) != null) {
            int size = arrayList.size();
            for (int i19 = i15; i19 < size; i19++) {
                TL_stars.StarGiftAuctionRound starGiftAuctionRound = this.e2.f.rounds.get(i19);
                if (i19 < size - 1) {
                    i10 = 1;
                    i11 = this.e2.f.rounds.get(i19 + 1).num - 1;
                } else {
                    i10 = 1;
                    i11 = this.e2.f.total_rounds;
                }
                int i20 = starGiftAuctionRound.num;
                if (i20 == i11) {
                    Object[] objArr2 = new Object[i10];
                    objArr2[i15] = Integer.valueOf(i20);
                    a02 = cd.a0(null, null, 2131750339, objArr2);
                } else {
                    Integer valueOf = Integer.valueOf(i20);
                    Integer valueOf2 = Integer.valueOf(i11);
                    Object[] objArr3 = new Object[2];
                    objArr3[i15] = valueOf;
                    objArr3[i10] = valueOf2;
                    a02 = cd.a0(null, null, 2131750337, objArr3);
                }
                if (starGiftAuctionRound.num == i11) {
                    String c02 = cd.c0(starGiftAuctionRound.duration);
                    String c03 = cd.c0(starGiftAuctionRound.current_window);
                    Integer valueOf3 = Integer.valueOf(starGiftAuctionRound.extend_top);
                    Object[] objArr4 = new Object[3];
                    objArr4[i15] = c02;
                    objArr4[1] = c03;
                    objArr4[2] = valueOf3;
                    G = cd.a0(null, null, 2131750338, objArr4);
                } else {
                    G = cd.G(starGiftAuctionRound.duration / 60, "Gift2AuctionTableCurrentRoundsTwoDuration", new Object[i15]);
                }
                wy0Var.c(a02, G, null, null);
            }
        }
        t9 t9Var2 = this.e2;
        if (t9Var2 != null && t9Var2.h != null) {
            int i21 = 21;
            u uVar = new u(this, context, p6Var, new o(this, i15), new bh.c(i21), new bh.c(i21), new bh.c(i21), new bh.c(i21), new bh.c(i21), new bh.c(i21));
            uVar.d(new f4.d(1, 1));
            uVar.setPreviewingAttributes(this.e2.h);
            uVar.removeView(uVar.P);
            this.S1.addView(uVar, i15, b6.e(-1, zs.L4, 48));
            TextView textView2 = new TextView(context);
            this.T1 = textView2;
            textView2.setGravity(17);
            textView2.setTypeface(org.telegram.messenger.i0.o());
            textView2.setTextColor(-1);
            textView2.setTextSize(1, 12.0f);
            t9 t9Var3 = this.e2;
            if (t9Var3.g != null) {
                textView2.setText(cd.L0(2131750372, null));
            } else if (t9Var3.g(ConnectionsManager.getInstance(d20.s0).getCurrentTime())) {
                textView2.setText(cd.L0(2131750137, null));
            } else {
                textView2.setText(cd.L0(2131750138, null));
            }
            textView2.setBackground(t6.b0(i15, 285212671, 13, 13));
            textView2.setPadding(org.telegram.messenger.i0.L(12.0f), i15, org.telegram.messenger.i0.L(12.0f), i15);
            TextView l10 = org.telegram.ui.Cells.f1.l(this.S1, textView2, b6.d(-2, 26.0f, 81, 16.0f, 0.0f, 16.0f, 77.0f), context);
            l10.setTypeface(org.telegram.messenger.i0.o());
            l10.setTextSize(1, 21.0f);
            l10.setText(str2);
            l10.setGravity(17);
            l10.setTextColor(-1);
            TextView l11 = org.telegram.ui.Cells.f1.l(this.S1, l10, b6.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 40.0f), context);
            l11.setTextSize(1, 13.0f);
            l11.setText(org.telegram.messenger.i0.H2(cd.L0(2131750359, null), i15, org.telegram.messenger.i0.L(2.6666667f), org.telegram.messenger.i0.L(1.0f)));
            l11.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f));
            l11.setGravity(17);
            l11.setTextColor(-1342177281);
            l11.setOnClickListener(new View.OnClickListener(this) { // from class: ph.r
                public final /* synthetic */ w b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i15) {
                        case 0:
                            new kg.i1(40, this.b.getContext(), (p6) null).show();
                            break;
                        default:
                            this.b.f1();
                            break;
                    }
                }
            });
            e6.b(l11, 0.02f, 1.5f);
            this.S1.addView(l11, b6.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 12.0f));
            sVar.setVisibility(8);
            textView.setVisibility(8);
            this.c2.setVisibility(8);
            p80 p80Var3 = new p80(context, p6Var);
            p80Var3.setGravity(17);
            p80Var3.setTextSize(1, 16.0f);
            int i22 = t6.J6;
            a7.V(p80Var3, i22, p6Var);
            a7.H(p80Var3, i22, p6Var);
            p80Var3.setOnClickListener(new ag.i(this, context, p6Var, 25));
            e6.b(p80Var3, 0.02f, 1.5f);
            this.R1.addView(p80Var3, b6.k(16.0f, 0.0f, 14.0f, 18.0f, -1, -2));
            com.google.android.gms.common.api.internal.r rVar = new com.google.android.gms.common.api.internal.r(sf.d.c(TL_stars.starGiftAttributeModel.class, this.e2.h));
            long j12 = starGift.upgrade_variants;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            for (int i23 = i15; i23 < 3; i23++) {
                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) rVar.c();
                if (stargiftattributemodel != null) {
                    spannableStringBuilder2.append('*');
                    spannableStringBuilder2.setSpan(new o5(stargiftattributemodel.document, p80Var3.getPaint().getFontMetricsInt()), i23, i23 + 1, 33);
                }
            }
            String E3 = cd.E(j12, ',');
            Object[] objArr5 = new Object[2];
            objArr5[i15] = spannableStringBuilder2;
            objArr5[1] = E3;
            p80Var3.setText(org.telegram.messenger.i0.H2(cd.V(null, null, 2131750327, objArr5), true, org.telegram.messenger.i0.L(2.6666667f), org.telegram.messenger.i0.L(1.0f)));
        }
        this.R1.addView(this.d2, b6.k(16.0f, 0.0f, 14.0f, 18.0f, -1, -2));
        h1(i15);
    }

    public static void d1(org.telegram.ui.ActionBar.l lVar, Context context, p6 p6Var, TL_stars.StarGift starGift) {
        lVar.setActionBarMenuOnItemClick(new v(context, starGift, p6Var));
        org.telegram.ui.ActionBar.t0 a2 = lVar.p().a(0, R.drawable.ic_ab_other);
        a2.setContentDescription(cd.L0(2131754839, "AccDescrMoreOptions"));
        a2.e(4, R.drawable.msg_info, cd.L0(2131748346, null));
        a2.e(3, R.drawable.menu_feature_links, cd.L0(2131751762, null));
        a2.e(2, R.drawable.msg_share, cd.L0(2131745476, null));
    }

    public static void e1(Context context, p6 p6Var, int i10, long j10, long j11, n0 n0Var) {
        x9 c10 = x9.c(i10);
        org.telegram.ui.Components.s2 s2Var = new org.telegram.ui.Components.s2(context, p6Var, i10, j10, n0Var);
        t9 b10 = c10.b(j11);
        if (b10 != null) {
            s2Var.a(b10, null);
            return;
        }
        r9 r9Var = new r9(c10, s2Var, j11, 0);
        TL_stars.TL_inputStarGiftAuction tL_inputStarGiftAuction = new TL_stars.TL_inputStarGiftAuction();
        tL_inputStarGiftAuction.gift_id = j11;
        TL_payments.TL_getStarGiftAuctionState tL_getStarGiftAuctionState = new TL_payments.TL_getStarGiftAuctionState();
        tL_getStarGiftAuctionState.auction = tL_inputStarGiftAuction;
        tL_getStarGiftAuctionState.version = 0;
        c10.getConnectionsManager().sendRequestTyped(tL_getStarGiftAuctionState, new a3.b(1), new org.telegram.messenger.a4(1, c10, r9Var));
    }

    public static void g1(Context context, TL_stars.StarGift starGift, p6 p6Var) {
        if (context == null || starGift == null) {
            return;
        }
        org.telegram.ui.ActionBar.z2 k10 = m5.k(1, context, null, false);
        mg.l1 l1Var = k10.x0;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        ImageView imageView = new ImageView(context);
        imageView.setPadding(org.telegram.messenger.i0.L(17.0f), org.telegram.messenger.i0.L(17.0f), org.telegram.messenger.i0.L(17.0f), org.telegram.messenger.i0.L(17.0f));
        imageView.setImageResource(R.drawable.filled_gift_sell_24);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        Paint paint = shapeDrawable.getPaint();
        int i10 = t6.Ci;
        paint.setColor(t6.w0(i10, p6Var));
        w6 N = a7.N(i10);
        imageView.setBackground(shapeDrawable);
        a7.k(imageView, shapeDrawable, N, null, p6Var);
        linearLayout.addView(imageView, b6.t(80, 80, 17, 0, 21, 0, 16));
        TextView textView = new TextView(context);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setGravity(17);
        textView.setText(cd.L0(2131749827, null));
        textView.setTextSize(1, 20.0f);
        int i11 = t6.G6;
        a7.V(textView, i11, p6Var);
        linearLayout.addView(textView, b6.t(-1, -2, 17, 20, 0, 20, 6));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setText(cd.L0(2131749826, null));
        textView2.setTextSize(1, 14.0f);
        a7.V(textView2, i11, p6Var);
        linearLayout.addView(textView2, b6.t(-1, -2, 17, 20, 0, 20, 16));
        st0 st0Var = new st0(context, p6Var);
        int i12 = starGift.gifts_per_round;
        st0Var.a.l(cd.G(i12, "GiftAuctionInfo1Header", Integer.valueOf(i12)), false);
        int i13 = starGift.gifts_per_round;
        st0Var.b.setText(cd.G(i13, "GiftAuctionInfo1Text", Integer.valueOf(i13)));
        st0Var.d.setVisibility(8);
        ImageView imageView2 = st0Var.c;
        imageView2.setImageResource(R.drawable.menu_top_bidders_24);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        a7.t(imageView2, i11, p6Var, mode);
        linearLayout.addView(st0Var, b6.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
        st0 st0Var2 = new st0(context, p6Var);
        st0Var2.a.l(cd.L0(2131749833, null), false);
        st0Var2.b.setText(cd.G(starGift.gifts_per_round, "GiftAuctionInfo2Text", new Object[0]));
        st0Var2.d.setVisibility(8);
        ImageView imageView3 = st0Var2.c;
        imageView3.setImageResource(R.drawable.menu_carryover_24);
        a7.t(imageView3, i11, p6Var, mode);
        linearLayout.addView(st0Var2, b6.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
        st0 st0Var3 = new st0(context, p6Var);
        st0Var3.a.l(cd.L0(2131749829, null), false);
        st0Var3.b.setText(cd.L0(2131749828, null));
        st0Var3.d.setVisibility(8);
        ImageView imageView4 = st0Var3.c;
        imageView4.setImageResource(R.drawable.menu_bid_refund_24);
        a7.t(imageView4, i11, p6Var, mode);
        linearLayout.addView(st0Var3, b6.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
        vh.d dVar = new vh.d(context, p6Var, true);
        dVar.setOnClickListener(new og.u(1, l1Var));
        dVar.i(rh.e4.g2(cd.L0(2131743913, null)), false, true);
        linearLayout.addView(dVar, b6.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
        k10.N = linearLayout;
        k10.show();
    }

    @Override // org.telegram.ui.Components.ha
    public final sk0 L0(tk0 tk0Var) {
        p51 p51Var = new p51(this.k1, getContext(), this.a, 0, true, new ag.a(this, 23), this.I0);
        this.g2 = p51Var;
        p51Var.r = false;
        return p51Var;
    }

    @Override // org.telegram.ui.Components.ha
    public final CharSequence O0() {
        return "";
    }

    @Override // org.telegram.messenger.w9
    public final void c(t9 t9Var) {
        this.e2 = t9Var;
        h1(true);
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.g2
    public final void dismiss() {
        x9.c(this.a).n(this.Q1, this);
        super.dismiss();
    }

    public final void f1() {
        TL_stars.TL_starGiftAuctionStateFinished tL_starGiftAuctionStateFinished;
        t9 t9Var = this.e2;
        if (t9Var == null || (tL_starGiftAuctionStateFinished = t9Var.g) == null || t9Var.d.title == null) {
            return;
        }
        this.Z1.a(this.W1, cd.a0(null, null, 2131750298, Long.valueOf(tL_starGiftAuctionStateFinished.average_price), this.e2.d.title));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h1(boolean z10) {
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState;
        int i10;
        int i11;
        int i12;
        t9 t9Var;
        TableRow tableRow;
        TL_stars.TL_starGiftAuctionStateFinished tL_starGiftAuctionStateFinished;
        t9 t9Var2 = this.e2;
        ec ecVar = this.V1;
        ec ecVar2 = this.U1;
        vh.d dVar = this.b2;
        if (t9Var2 != null && (tL_starGiftAuctionStateFinished = t9Var2.g) != null) {
            ecVar2.setText(cd.x(tL_starGiftAuctionStateFinished.start_date, true));
            ecVar.setText(cd.x(this.e2.g.end_date, true));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(h8.Z0(false, i0.a.k(this.e2.g.average_price, ',', new StringBuilder("⭐️ ")), 0.8f, null));
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) fc.b("?", new o(this, 1), this.I0, null));
            this.W1.setText(spannableStringBuilder);
        } else if (t9Var2 != null && (tL_starGiftAuctionState = t9Var2.f) != null) {
            ecVar2.setText(cd.x(tL_starGiftAuctionState.start_date, true));
            ecVar.setText(cd.x(this.e2.f.end_date, true));
            int currentTime = ConnectionsManager.getInstance(this.a).getCurrentTime();
            if (this.e2.g(currentTime)) {
                dVar.g(cd.a0(null, null, 2131750344, cd.c0(this.e2.f.start_date - currentTime)), z10);
            } else {
                dVar.g(cd.a0(null, null, 2131750330, cd.c0(this.e2.f.end_date - currentTime)), z10);
            }
        }
        t9 t9Var3 = this.e2;
        TL_stars.StarGift starGift = this.P1;
        if (t9Var3 != null) {
            if (t9Var3.f()) {
                i10 = 0;
            } else {
                TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState2 = this.e2.f;
                if (tL_starGiftAuctionState2 != null) {
                    i10 = tL_starGiftAuctionState2.gifts_left;
                }
            }
            i11 = starGift.availability_total;
            ec ecVar3 = this.X1;
            vy0 vy0Var = this.Y1;
            if (i10 != i11) {
                vy0Var.setText(cd.L0(2131750342, null));
                ecVar3.setText(cd.E(i11, ','));
            } else {
                vy0Var.setText(cd.L0(2131750343, null));
                ecVar3.setText(cd.G(i10, "Gift2Availability4Value", cd.E(i11, ',')));
            }
            i12 = this.e2.e.acquired_count;
            p80 p80Var = this.d2;
            if (i12 <= 0) {
                p80Var.setVisibility(0);
                p80Var.setText(TextUtils.concat(org.telegram.messenger.i0.H2(cd.F("Gift2AuctionsItemsBought2", i12, this.f2), true, org.telegram.messenger.i0.L(2.6666667f), org.telegram.messenger.i0.L(1.0f))));
            } else {
                p80Var.setVisibility(8);
            }
            t9Var = this.e2;
            tableRow = this.a2;
            if ((t9Var != null || t9Var.g == null) && !starGift.sold_out) {
                tableRow.setVisibility(8);
                dVar.i(cd.L0(2131750360, null), z10, true);
            }
            String L0 = cd.L0(2131750373, null);
            p80 p80Var2 = this.c2;
            p80Var2.setText(L0);
            a7.V(p80Var2, t6.q7, this.I0);
            tableRow.setVisibility(0);
            dVar.i(cd.L0(2131747847, null), z10, true);
            dVar.g(null, z10);
            return;
        }
        i10 = starGift.availability_remains;
        i11 = starGift.availability_total;
        ec ecVar32 = this.X1;
        vy0 vy0Var2 = this.Y1;
        if (i10 != i11) {
        }
        i12 = this.e2.e.acquired_count;
        p80 p80Var3 = this.d2;
        if (i12 <= 0) {
        }
        t9Var = this.e2;
        tableRow = this.a2;
        if (t9Var != null) {
        }
        tableRow.setVisibility(8);
        dVar.i(cd.L0(2131750360, null), z10, true);
    }
}
