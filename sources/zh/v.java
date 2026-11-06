package zh;

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
import bi.dd;
import bi.g6;
import bi.k7;
import bi.z6;
import c8.ha;
import c8.ka;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.k5;
import org.telegram.messenger.p10;
import org.telegram.messenger.q9;
import org.telegram.messenger.qs;
import org.telegram.messenger.s9;
import org.telegram.messenger.v9;
import org.telegram.messenger.w9;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.jc;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.na;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.r5;
import org.telegram.ui.Components.sx0;
import org.telegram.ui.Components.td0;
import org.telegram.ui.Components.tx0;
import org.telegram.ui.Components.w70;
import org.telegram.ui.is0;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class v extends na implements v9 {
    public static final jc[] h2 = new jc[1];
    public static final sx0[] i2 = new sx0[1];
    public final TL_stars.StarGift P1;
    public final long Q1;
    public final LinearLayout R1;
    public final FrameLayout S1;
    public final TextView T1;
    public final jc U1;
    public final jc V1;
    public final jc W1;
    public final jc X1;
    public final sx0 Y1;
    public final bi.t0 Z1;
    public final TableRow a2;
    public final fi.d b2;
    public final w70 c2;
    public final w70 d2;
    public s9 e2;
    public final CharSequence f2;
    public l41 g2;

    public v(Context context, f6 f6Var, long j3, TL_stars.StarGift starGift, Runnable runnable) {
        super(context, null, false, false, 1, f6Var);
        boolean z9;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState;
        ArrayList<TL_stars.StarGiftAuctionRound> arrayList;
        int i7;
        int i10;
        String a02;
        String G;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState2;
        this.P1 = starGift;
        long j10 = starGift.id;
        this.Q1 = j10;
        this.B1 = org.telegram.messenger.g0.L(6.0f);
        this.r1 = 0.2f;
        N();
        String str = starGift.title;
        String str2 = str == null ? "Gift" : str;
        LinearLayout linearLayout = new LinearLayout(context);
        this.R1 = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setClickable(true);
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, f6Var);
        kVar.D(-1, false);
        kVar.setOccupyStatusBar(false);
        d1(kVar, context, f6Var, starGift);
        FrameLayout frameLayout = new FrameLayout(context);
        this.S1 = frameLayout;
        frameLayout.addView(kVar, ha.o(-1, -2));
        linearLayout.addView(frameLayout);
        r rVar = new r(this.a, context, f6Var);
        rVar.c0 = true;
        rVar.h(starGift, false, false, false, false, false);
        rVar.setImageSize(org.telegram.messenger.g0.L(100.0f));
        rVar.setImageLayer(7);
        rVar.J.setVisibility(8);
        frameLayout.addView(rVar, ha.d(qs.O1, 130.0f, 17, 0.0f, 18.0f, 0.0f, 14.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        textView.setText(str2);
        textView.setTextSize(1, 20.0f);
        int i11 = k6.G6;
        r6.V(textView, i11, f6Var);
        linearLayout.addView(textView, ha.t(-1, -2, 17, 20, 0, 20, 6));
        w70 w70Var = new w70(context, null);
        this.c2 = w70Var;
        w70Var.setGravity(17);
        w70Var.setText(TextUtils.concat(org.telegram.messenger.g0.X2(hd.G(starGift.gifts_per_round, "Gift2AuctionInfo2", str2)), " ", org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2(hd.M0(2131750356, null), new p(context, f6Var, starGift, 0)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f))));
        w70Var.setTextSize(1, 14.0f);
        r6.V(w70Var, i11, f6Var);
        int i12 = k6.J6;
        r6.H(w70Var, i12, f6Var);
        linearLayout.addView(w70Var, ha.t(-1, -2, 17, 20, 0, 20, 4));
        tx0 tx0Var = new tx0(context, f6Var);
        String M0 = hd.M0(2131750322, null);
        jc[] jcVarArr = h2;
        tx0Var.c(M0, "", null, jcVarArr);
        this.U1 = jcVarArr[0];
        tx0Var.c(hd.M0(2131750323, null), "", null, jcVarArr);
        this.V1 = jcVarArr[0];
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.setClipChildren(false);
        frameLayout2.setClipToPadding(false);
        frameLayout2.addView(tx0Var, ha.e(-1, -2, qs.E1));
        this.Z1 = new bi.t0(this, new fi.m3[1], frameLayout2, 7);
        TableRow c10 = tx0Var.c(hd.M0(2131749587, null), "", null, jcVarArr);
        this.a2 = c10;
        final int i13 = 1;
        c10.setOnClickListener(new View.OnClickListener(this) { // from class: zh.q
            public final /* synthetic */ v b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        new ug.w0(40, this.b.getContext(), (f6) null).show();
                        break;
                    default:
                        this.b.f1();
                        break;
                }
            }
        });
        this.W1 = jcVarArr[0];
        sx0[] sx0VarArr = i2;
        tx0Var.c("", "", sx0VarArr, jcVarArr);
        this.X1 = jcVarArr[0];
        this.Y1 = sx0VarArr[0];
        linearLayout.addView(frameLayout2, ha.k(16.0f, 16.0f, 14.0f, 18.0f, -1, -2));
        w70 w70Var2 = new w70(context, f6Var);
        this.d2 = w70Var2;
        w70Var2.setGravity(17);
        w70Var2.setTextSize(1, 16.0f);
        r6.V(w70Var2, i12, f6Var);
        r6.H(w70Var2, i12, f6Var);
        w70Var2.setOnClickListener(new td0(this, new boolean[1], f6Var, 7));
        ka.b(w70Var2, 0.02f, 1.5f);
        if (starGift.sticker != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
            z9 = false;
            spannableStringBuilder.setSpan(new r5(starGift.sticker, w70Var2.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
            this.f2 = spannableStringBuilder;
        } else {
            z9 = false;
            this.f2 = "";
        }
        fi.d dVar = new fi.d(context, f6Var, true);
        this.b2 = dVar;
        dVar.f();
        final int i14 = z9;
        dVar.setOnClickListener(new n(this, j3, context, f6Var, runnable, 0));
        FrameLayout.LayoutParams d = ha.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i15 = d.leftMargin;
        int i16 = this.t0;
        d.leftMargin = i15 + i16;
        d.rightMargin += i16;
        this.b.addView(dVar, d);
        pj0 pj0Var = this.k1;
        int i17 = this.t0;
        pj0Var.setPadding(i17, i14, i17, org.telegram.messenger.g0.L(64.0f));
        this.g2.O(i14);
        s9 l10 = w9.c(this.a).l(j10, this);
        this.e2 = l10;
        if (l10 != null && (tL_starGiftAuctionState2 = l10.f) != null) {
            if (tL_starGiftAuctionState2.start_date > ConnectionsManager.getInstance(this.a).getCurrentTime()) {
                tx0Var.c(hd.M0(2131750330, null), hd.E(this.e2.f.total_rounds, ','), null, null);
            } else {
                String M02 = hd.M0(2131750331, null);
                String E = hd.E(this.e2.f.current_round, ',');
                String E2 = hd.E(this.e2.f.total_rounds, ',');
                Object[] objArr = new Object[2];
                objArr[i14] = E;
                objArr[1] = E2;
                tx0Var.c(M02, hd.a0(null, null, 2131747827, objArr), null, null);
            }
        }
        s9 s9Var = this.e2;
        if (s9Var != null && (tL_starGiftAuctionState = s9Var.f) != null && (arrayList = tL_starGiftAuctionState.rounds) != null) {
            int size = arrayList.size();
            for (int i18 = i14; i18 < size; i18++) {
                TL_stars.StarGiftAuctionRound starGiftAuctionRound = this.e2.f.rounds.get(i18);
                if (i18 < size - 1) {
                    i7 = 1;
                    i10 = this.e2.f.rounds.get(i18 + 1).num - 1;
                } else {
                    i7 = 1;
                    i10 = this.e2.f.total_rounds;
                }
                int i19 = starGiftAuctionRound.num;
                if (i19 == i10) {
                    Object[] objArr2 = new Object[i7];
                    objArr2[i14] = Integer.valueOf(i19);
                    a02 = hd.a0(null, null, 2131750329, objArr2);
                } else {
                    Integer valueOf = Integer.valueOf(i19);
                    Integer valueOf2 = Integer.valueOf(i10);
                    Object[] objArr3 = new Object[2];
                    objArr3[i14] = valueOf;
                    objArr3[i7] = valueOf2;
                    a02 = hd.a0(null, null, 2131750327, objArr3);
                }
                if (starGiftAuctionRound.num == i10) {
                    String c02 = hd.c0(starGiftAuctionRound.duration);
                    String c03 = hd.c0(starGiftAuctionRound.current_window);
                    Integer valueOf3 = Integer.valueOf(starGiftAuctionRound.extend_top);
                    Object[] objArr4 = new Object[3];
                    objArr4[i14] = c02;
                    objArr4[1] = c03;
                    objArr4[2] = valueOf3;
                    G = hd.a0(null, null, 2131750328, objArr4);
                } else {
                    G = hd.G(starGiftAuctionRound.duration / 60, "Gift2AuctionTableCurrentRoundsTwoDuration", new Object[i14]);
                }
                tx0Var.c(a02, G, null, null);
            }
        }
        s9 s9Var2 = this.e2;
        if (s9Var2 != null && s9Var2.h != null) {
            int i20 = 24;
            t tVar = new t(this, context, f6Var, new o(this, i14), new bi.l1(i20), new bi.l1(i20), new bi.l1(i20), new bi.l1(i20), new bi.l1(i20), new bi.l1(i20));
            tVar.d(new g6(1, 1));
            tVar.setPreviewingAttributes(this.e2.h);
            tVar.removeView(tVar.P);
            this.S1.addView(tVar, i14, ha.e(-1, qs.L4, 48));
            TextView textView2 = new TextView(context);
            this.T1 = textView2;
            textView2.setGravity(17);
            textView2.setTypeface(org.telegram.messenger.g0.o());
            textView2.setTextColor(-1);
            textView2.setTextSize(1, 12.0f);
            s9 s9Var3 = this.e2;
            if (s9Var3.g != null) {
                textView2.setText(hd.M0(2131750362, null));
            } else if (s9Var3.g(ConnectionsManager.getInstance(p10.s0).getCurrentTime())) {
                textView2.setText(hd.M0(2131750127, null));
            } else {
                textView2.setText(hd.M0(2131750128, null));
            }
            textView2.setBackground(k6.b0(i14, 285212671, 13, 13));
            textView2.setPadding(org.telegram.messenger.g0.L(12.0f), i14, org.telegram.messenger.g0.L(12.0f), i14);
            TextView i21 = org.telegram.ui.Cells.f1.i(this.S1, textView2, ha.d(-2, 26.0f, 81, 16.0f, 0.0f, 16.0f, 77.0f), context);
            i21.setTypeface(org.telegram.messenger.g0.o());
            i21.setTextSize(1, 21.0f);
            i21.setText(str2);
            i21.setGravity(17);
            i21.setTextColor(-1);
            TextView i22 = org.telegram.ui.Cells.f1.i(this.S1, i21, ha.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 40.0f), context);
            i22.setTextSize(1, 13.0f);
            i22.setText(org.telegram.messenger.g0.I2(hd.M0(2131750349, null), i14, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f)));
            i22.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
            i22.setGravity(17);
            i22.setTextColor(-1342177281);
            i22.setOnClickListener(new View.OnClickListener(this) { // from class: zh.q
                public final /* synthetic */ v b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i14) {
                        case 0:
                            new ug.w0(40, this.b.getContext(), (f6) null).show();
                            break;
                        default:
                            this.b.f1();
                            break;
                    }
                }
            });
            ka.b(i22, 0.02f, 1.5f);
            this.S1.addView(i22, ha.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 12.0f));
            rVar.setVisibility(8);
            textView.setVisibility(8);
            this.c2.setVisibility(8);
            w70 w70Var3 = new w70(context, f6Var);
            w70Var3.setGravity(17);
            w70Var3.setTextSize(1, 16.0f);
            int i23 = k6.J6;
            r6.V(w70Var3, i23, f6Var);
            r6.H(w70Var3, i23, f6Var);
            w70Var3.setOnClickListener(new td0(this, context, f6Var, 6));
            ka.b(w70Var3, 0.02f, 1.5f);
            this.R1.addView(w70Var3, ha.k(16.0f, 0.0f, 14.0f, 18.0f, -1, -2));
            bi.a aVar = new bi.a(cg.d.c(TL_stars.starGiftAttributeModel.class, this.e2.h));
            long j11 = starGift.upgrade_variants;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            for (int i24 = i14; i24 < 3; i24++) {
                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) aVar.c();
                if (stargiftattributemodel != null) {
                    spannableStringBuilder2.append('*');
                    spannableStringBuilder2.setSpan(new r5(stargiftattributemodel.document, w70Var3.getPaint().getFontMetricsInt()), i24, i24 + 1, 33);
                }
            }
            String E3 = hd.E(j11, ',');
            Object[] objArr5 = new Object[2];
            objArr5[i14] = spannableStringBuilder2;
            objArr5[1] = E3;
            w70Var3.setText(org.telegram.messenger.g0.I2(hd.V(null, null, 2131750317, objArr5), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f)));
        }
        this.R1.addView(this.d2, ha.k(16.0f, 0.0f, 14.0f, 18.0f, -1, -2));
        h1(i14);
    }

    public static void d1(org.telegram.ui.ActionBar.k kVar, Context context, f6 f6Var, TL_stars.StarGift starGift) {
        kVar.setActionBarMenuOnItemClick(new u(context, starGift, f6Var));
        org.telegram.ui.ActionBar.r0 a10 = kVar.q().a(0, R.drawable.ic_ab_other);
        a10.setContentDescription(hd.M0(2131754839, "AccDescrMoreOptions"));
        a10.e(4, R.drawable.msg_info, hd.M0(2131748330, null));
        a10.e(3, R.drawable.menu_feature_links, hd.M0(2131751762, null));
        a10.e(2, R.drawable.msg_share, hd.M0(2131745459, null));
    }

    public static void e1(Context context, f6 f6Var, int i7, long j3, long j10, l0 l0Var) {
        w9 c10 = w9.c(i7);
        ai.v0 v0Var = new ai.v0(context, f6Var, i7, j3, l0Var);
        s9 b10 = c10.b(j10);
        if (b10 != null) {
            v0Var.a(b10, null);
            return;
        }
        q9 q9Var = new q9(c10, v0Var, j10, 0);
        TL_stars.TL_inputStarGiftAuction tL_inputStarGiftAuction = new TL_stars.TL_inputStarGiftAuction();
        tL_inputStarGiftAuction.gift_id = j10;
        TL_payments.TL_getStarGiftAuctionState tL_getStarGiftAuctionState = new TL_payments.TL_getStarGiftAuctionState();
        tL_getStarGiftAuctionState.auction = tL_inputStarGiftAuction;
        tL_getStarGiftAuctionState.version = 0;
        c10.getConnectionsManager().sendRequestTyped(tL_getStarGiftAuctionState, new d3.b(1), new org.telegram.messenger.x3(2, c10, q9Var));
    }

    public static void g1(Context context, TL_stars.StarGift starGift, f6 f6Var) {
        if (context == null || starGift == null) {
            return;
        }
        org.telegram.ui.ActionBar.v2 l10 = k5.l(1, context, null, false);
        org.telegram.ui.ActionBar.g2 g2Var = l10.x0;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        ImageView imageView = new ImageView(context);
        imageView.setPadding(org.telegram.messenger.g0.L(17.0f), org.telegram.messenger.g0.L(17.0f), org.telegram.messenger.g0.L(17.0f), org.telegram.messenger.g0.L(17.0f));
        imageView.setImageResource(R.drawable.filled_gift_sell_24);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        Paint paint = shapeDrawable.getPaint();
        int i7 = k6.Ci;
        paint.setColor(k6.w0(i7, f6Var));
        n6 N = r6.N(i7);
        imageView.setBackground(shapeDrawable);
        r6.k(imageView, shapeDrawable, N, null, f6Var);
        linearLayout.addView(imageView, ha.t(80, 80, 17, 0, 21, 0, 16));
        TextView textView = new TextView(context);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        textView.setText(hd.M0(2131749817, null));
        textView.setTextSize(1, 20.0f);
        int i10 = k6.G6;
        r6.V(textView, i10, f6Var);
        linearLayout.addView(textView, ha.t(-1, -2, 17, 20, 0, 20, 6));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setText(hd.M0(2131749816, null));
        textView2.setTextSize(1, 14.0f);
        r6.V(textView2, i10, f6Var);
        linearLayout.addView(textView2, ha.t(-1, -2, 17, 20, 0, 20, 16));
        is0 is0Var = new is0(context, f6Var);
        int i11 = starGift.gifts_per_round;
        is0Var.a.l(hd.G(i11, "GiftAuctionInfo1Header", Integer.valueOf(i11)), false);
        int i12 = starGift.gifts_per_round;
        is0Var.b.setText(hd.G(i12, "GiftAuctionInfo1Text", Integer.valueOf(i12)));
        is0Var.d.setVisibility(8);
        ImageView imageView2 = is0Var.c;
        imageView2.setImageResource(R.drawable.menu_top_bidders_24);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        r6.t(imageView2, i10, f6Var, mode);
        linearLayout.addView(is0Var, ha.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
        is0 is0Var2 = new is0(context, f6Var);
        is0Var2.a.l(hd.M0(2131749823, null), false);
        is0Var2.b.setText(hd.G(starGift.gifts_per_round, "GiftAuctionInfo2Text", new Object[0]));
        is0Var2.d.setVisibility(8);
        ImageView imageView3 = is0Var2.c;
        imageView3.setImageResource(R.drawable.menu_carryover_24);
        r6.t(imageView3, i10, f6Var, mode);
        linearLayout.addView(is0Var2, ha.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
        is0 is0Var3 = new is0(context, f6Var);
        is0Var3.a.l(hd.M0(2131749819, null), false);
        is0Var3.b.setText(hd.M0(2131749818, null));
        is0Var3.d.setVisibility(8);
        ImageView imageView4 = is0Var3.c;
        imageView4.setImageResource(R.drawable.menu_bid_refund_24);
        r6.t(imageView4, i10, f6Var, mode);
        linearLayout.addView(is0Var3, ha.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
        fi.d dVar = new fi.d(context, f6Var, true);
        dVar.setOnClickListener(new z6(6, g2Var));
        dVar.i(k7.g2(hd.M0(2131743889, null)), false, true);
        linearLayout.addView(dVar, ha.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
        l10.N = linearLayout;
        l10.show();
    }

    @Override // org.telegram.ui.Components.na
    public final oj0 L0(pj0 pj0Var) {
        l41 l41Var = new l41(this.k1, getContext(), this.a, 0, true, new hi.u1(this, 28), this.I0);
        this.g2 = l41Var;
        l41Var.r = false;
        return l41Var;
    }

    @Override // org.telegram.ui.Components.na
    public final CharSequence O0() {
        return "";
    }

    @Override // org.telegram.messenger.v9
    public final void c(s9 s9Var) {
        this.e2 = s9Var;
        h1(true);
    }

    @Override // org.telegram.ui.ActionBar.v2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.b2
    public final void dismiss() {
        w9.c(this.a).n(this.Q1, this);
        super.dismiss();
    }

    public final void f1() {
        TL_stars.TL_starGiftAuctionStateFinished tL_starGiftAuctionStateFinished;
        s9 s9Var = this.e2;
        if (s9Var == null || (tL_starGiftAuctionStateFinished = s9Var.g) == null || s9Var.d.title == null) {
            return;
        }
        this.Z1.a(this.W1, hd.a0(null, null, 2131750288, Long.valueOf(tL_starGiftAuctionStateFinished.average_price), this.e2.d.title));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h1(boolean z9) {
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState;
        int i7;
        int i10;
        int i11;
        s9 s9Var;
        TableRow tableRow;
        TL_stars.TL_starGiftAuctionStateFinished tL_starGiftAuctionStateFinished;
        s9 s9Var2 = this.e2;
        jc jcVar = this.V1;
        jc jcVar2 = this.U1;
        fi.d dVar = this.b2;
        if (s9Var2 != null && (tL_starGiftAuctionStateFinished = s9Var2.g) != null) {
            jcVar2.setText(hd.x(tL_starGiftAuctionStateFinished.start_date, true));
            jcVar.setText(hd.x(this.e2.g.end_date, true));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(dd.a1(false, jg.g.m(this.e2.g.average_price, ',', new StringBuilder("⭐️ ")), 0.8f, null));
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) kc.b("?", new o(this, 1), this.I0, null));
            this.W1.setText(spannableStringBuilder);
        } else if (s9Var2 != null && (tL_starGiftAuctionState = s9Var2.f) != null) {
            jcVar2.setText(hd.x(tL_starGiftAuctionState.start_date, true));
            jcVar.setText(hd.x(this.e2.f.end_date, true));
            int currentTime = ConnectionsManager.getInstance(this.a).getCurrentTime();
            if (this.e2.g(currentTime)) {
                dVar.g(hd.a0(null, null, 2131750334, hd.c0(this.e2.f.start_date - currentTime)), z9);
            } else {
                dVar.g(hd.a0(null, null, 2131750320, hd.c0(this.e2.f.end_date - currentTime)), z9);
            }
        }
        s9 s9Var3 = this.e2;
        TL_stars.StarGift starGift = this.P1;
        if (s9Var3 != null) {
            if (s9Var3.f()) {
                i7 = 0;
            } else {
                TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState2 = this.e2.f;
                if (tL_starGiftAuctionState2 != null) {
                    i7 = tL_starGiftAuctionState2.gifts_left;
                }
            }
            i10 = starGift.availability_total;
            jc jcVar3 = this.X1;
            sx0 sx0Var = this.Y1;
            if (i7 != i10) {
                sx0Var.setText(hd.M0(2131750332, null));
                jcVar3.setText(hd.E(i10, ','));
            } else {
                sx0Var.setText(hd.M0(2131750333, null));
                jcVar3.setText(hd.G(i7, "Gift2Availability4Value", hd.E(i10, ',')));
            }
            i11 = this.e2.e.acquired_count;
            w70 w70Var = this.d2;
            if (i11 <= 0) {
                w70Var.setVisibility(0);
                w70Var.setText(TextUtils.concat(org.telegram.messenger.g0.I2(hd.F("Gift2AuctionsItemsBought2", i11, this.f2), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f))));
            } else {
                w70Var.setVisibility(8);
            }
            s9Var = this.e2;
            tableRow = this.a2;
            if ((s9Var != null || s9Var.g == null) && !starGift.sold_out) {
                tableRow.setVisibility(8);
                dVar.i(hd.M0(2131750350, null), z9, true);
            }
            String M0 = hd.M0(2131750363, null);
            w70 w70Var2 = this.c2;
            w70Var2.setText(M0);
            r6.V(w70Var2, k6.q7, this.I0);
            tableRow.setVisibility(0);
            dVar.i(hd.M0(2131747830, null), z9, true);
            dVar.g(null, z9);
            return;
        }
        i7 = starGift.availability_remains;
        i10 = starGift.availability_total;
        jc jcVar32 = this.X1;
        sx0 sx0Var2 = this.Y1;
        if (i7 != i10) {
        }
        i11 = this.e2.e.acquired_count;
        w70 w70Var3 = this.d2;
        if (i11 <= 0) {
        }
        s9Var = this.e2;
        tableRow = this.a2;
        if (s9Var != null) {
        }
        tableRow.setVisibility(8);
        dVar.i(hd.M0(2131750350, null), z9, true);
    }
}
