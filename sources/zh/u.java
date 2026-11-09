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
import bi.k7;
import bi.z6;
import c8.ha;
import c8.ka;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.id;
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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.o6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.Components.jc;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.na;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.r5;
import org.telegram.ui.Components.tx0;
import org.telegram.ui.Components.ud0;
import org.telegram.ui.Components.ux0;
import org.telegram.ui.Components.x70;
import org.telegram.ui.ks0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class u extends na implements v9 {
    public static final jc[] h2 = new jc[1];
    public static final tx0[] i2 = new tx0[1];
    public final TL_stars.StarGift P1;
    public final long Q1;
    public final LinearLayout R1;
    public final FrameLayout S1;
    public final TextView T1;
    public final jc U1;
    public final jc V1;
    public final jc W1;
    public final jc X1;
    public final tx0 Y1;
    public final bi.t0 Z1;
    public final TableRow a2;
    public final fi.d b2;
    public final x70 c2;
    public final x70 d2;
    public s9 e2;
    public final CharSequence f2;
    public m41 g2;

    public u(Context context, g6 g6Var, long j3, TL_stars.StarGift starGift, Runnable runnable) {
        super(context, null, false, false, 1, g6Var);
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
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, g6Var);
        kVar.E(-1, false);
        kVar.setOccupyStatusBar(false);
        d1(kVar, context, g6Var, starGift);
        FrameLayout frameLayout = new FrameLayout(context);
        this.S1 = frameLayout;
        frameLayout.addView(kVar, ha.o(-1, -2));
        linearLayout.addView(frameLayout);
        q qVar = new q(this.a, context, g6Var);
        qVar.c0 = true;
        qVar.h(starGift, false, false, false, false, false);
        qVar.setImageSize(org.telegram.messenger.g0.L(100.0f));
        qVar.setImageLayer(7);
        qVar.J.setVisibility(8);
        frameLayout.addView(qVar, ha.d(qs.O1, 130.0f, 17, 0.0f, 18.0f, 0.0f, 14.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        textView.setText(str2);
        textView.setTextSize(1, 20.0f);
        int i11 = l6.G6;
        s6.U(textView, i11, g6Var);
        linearLayout.addView(textView, ha.t(-1, -2, 17, 20, 0, 20, 6));
        x70 x70Var = new x70(context, null);
        this.c2 = x70Var;
        x70Var.setGravity(17);
        x70Var.setText(TextUtils.concat(org.telegram.messenger.g0.X2(id.G(starGift.gifts_per_round, "Gift2AuctionInfo2", str2)), " ", org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2(id.M0(2131750357, null), new o(context, g6Var, starGift, 0)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f))));
        x70Var.setTextSize(1, 14.0f);
        s6.U(x70Var, i11, g6Var);
        int i12 = l6.J6;
        s6.G(x70Var, i12, g6Var);
        linearLayout.addView(x70Var, ha.t(-1, -2, 17, 20, 0, 20, 4));
        ux0 ux0Var = new ux0(context, g6Var);
        String M0 = id.M0(2131750323, null);
        jc[] jcVarArr = h2;
        ux0Var.c(M0, "", null, jcVarArr);
        this.U1 = jcVarArr[0];
        ux0Var.c(id.M0(2131750324, null), "", null, jcVarArr);
        this.V1 = jcVarArr[0];
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.setClipChildren(false);
        frameLayout2.setClipToPadding(false);
        frameLayout2.addView(ux0Var, ha.e(-1, -2, qs.E1));
        this.Z1 = new bi.t0(this, new fi.m3[1], frameLayout2, 7);
        TableRow c10 = ux0Var.c(id.M0(2131749588, null), "", null, jcVarArr);
        this.a2 = c10;
        final int i13 = 1;
        c10.setOnClickListener(new View.OnClickListener(this) { // from class: zh.p
            public final /* synthetic */ u b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        new ug.w0(40, this.b.getContext(), (g6) null).show();
                        break;
                    default:
                        this.b.f1();
                        break;
                }
            }
        });
        this.W1 = jcVarArr[0];
        tx0[] tx0VarArr = i2;
        ux0Var.c("", "", tx0VarArr, jcVarArr);
        this.X1 = jcVarArr[0];
        this.Y1 = tx0VarArr[0];
        linearLayout.addView(frameLayout2, ha.k(16.0f, 16.0f, 14.0f, 18.0f, -1, -2));
        x70 x70Var2 = new x70(context, g6Var);
        this.d2 = x70Var2;
        x70Var2.setGravity(17);
        x70Var2.setTextSize(1, 16.0f);
        s6.U(x70Var2, i12, g6Var);
        s6.G(x70Var2, i12, g6Var);
        x70Var2.setOnClickListener(new ud0(this, new boolean[1], g6Var, 7));
        ka.b(x70Var2, 0.02f, 1.5f);
        if (starGift.sticker != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
            z9 = false;
            spannableStringBuilder.setSpan(new r5(starGift.sticker, x70Var2.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
            this.f2 = spannableStringBuilder;
        } else {
            z9 = false;
            this.f2 = "";
        }
        fi.d dVar = new fi.d(context, g6Var, true);
        this.b2 = dVar;
        dVar.f();
        final int i14 = z9;
        dVar.setOnClickListener(new m(this, j3, context, g6Var, runnable, 0));
        FrameLayout.LayoutParams d = ha.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i15 = d.leftMargin;
        int i16 = this.t0;
        d.leftMargin = i15 + i16;
        d.rightMargin += i16;
        this.b.addView(dVar, d);
        qj0 qj0Var = this.k1;
        int i17 = this.t0;
        qj0Var.setPadding(i17, i14, i17, org.telegram.messenger.g0.L(64.0f));
        this.g2.O(i14);
        s9 l10 = w9.c(this.a).l(j10, this);
        this.e2 = l10;
        if (l10 != null && (tL_starGiftAuctionState2 = l10.f) != null) {
            if (tL_starGiftAuctionState2.start_date > ConnectionsManager.getInstance(this.a).getCurrentTime()) {
                ux0Var.c(id.M0(2131750331, null), id.E(this.e2.f.total_rounds, ','), null, null);
            } else {
                String M02 = id.M0(2131750332, null);
                String E = id.E(this.e2.f.current_round, ',');
                String E2 = id.E(this.e2.f.total_rounds, ',');
                Object[] objArr = new Object[2];
                objArr[i14] = E;
                objArr[1] = E2;
                ux0Var.c(M02, id.a0(null, null, 2131747828, objArr), null, null);
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
                    a02 = id.a0(null, null, 2131750330, objArr2);
                } else {
                    Integer valueOf = Integer.valueOf(i19);
                    Integer valueOf2 = Integer.valueOf(i10);
                    Object[] objArr3 = new Object[2];
                    objArr3[i14] = valueOf;
                    objArr3[i7] = valueOf2;
                    a02 = id.a0(null, null, 2131750328, objArr3);
                }
                if (starGiftAuctionRound.num == i10) {
                    String c02 = id.c0(starGiftAuctionRound.duration);
                    String c03 = id.c0(starGiftAuctionRound.current_window);
                    Integer valueOf3 = Integer.valueOf(starGiftAuctionRound.extend_top);
                    Object[] objArr4 = new Object[3];
                    objArr4[i14] = c02;
                    objArr4[1] = c03;
                    objArr4[2] = valueOf3;
                    G = id.a0(null, null, 2131750329, objArr4);
                } else {
                    G = id.G(starGiftAuctionRound.duration / 60, "Gift2AuctionTableCurrentRoundsTwoDuration", new Object[i14]);
                }
                ux0Var.c(a02, G, null, null);
            }
        }
        s9 s9Var2 = this.e2;
        if (s9Var2 != null && s9Var2.h != null) {
            int i20 = 24;
            s sVar = new s(this, context, g6Var, new n(this, i14), new bi.l1(i20), new bi.l1(i20), new bi.l1(i20), new bi.l1(i20), new bi.l1(i20), new bi.l1(i20));
            sVar.d(new bi.g6(1, 1));
            sVar.setPreviewingAttributes(this.e2.h);
            sVar.removeView(sVar.P);
            this.S1.addView(sVar, i14, ha.e(-1, qs.L4, 48));
            TextView textView2 = new TextView(context);
            this.T1 = textView2;
            textView2.setGravity(17);
            textView2.setTypeface(org.telegram.messenger.g0.o());
            textView2.setTextColor(-1);
            textView2.setTextSize(1, 12.0f);
            s9 s9Var3 = this.e2;
            if (s9Var3.g != null) {
                textView2.setText(id.M0(2131750363, null));
            } else if (s9Var3.g(ConnectionsManager.getInstance(p10.s0).getCurrentTime())) {
                textView2.setText(id.M0(2131750128, null));
            } else {
                textView2.setText(id.M0(2131750129, null));
            }
            textView2.setBackground(l6.b0(i14, 285212671, 13, 13));
            textView2.setPadding(org.telegram.messenger.g0.L(12.0f), i14, org.telegram.messenger.g0.L(12.0f), i14);
            TextView i21 = org.telegram.ui.Cells.f1.i(this.S1, textView2, ha.d(-2, 26.0f, 81, 16.0f, 0.0f, 16.0f, 77.0f), context);
            i21.setTypeface(org.telegram.messenger.g0.o());
            i21.setTextSize(1, 21.0f);
            i21.setText(str2);
            i21.setGravity(17);
            i21.setTextColor(-1);
            TextView i22 = org.telegram.ui.Cells.f1.i(this.S1, i21, ha.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 40.0f), context);
            i22.setTextSize(1, 13.0f);
            i22.setText(org.telegram.messenger.g0.I2(id.M0(2131750350, null), i14, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f)));
            i22.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
            i22.setGravity(17);
            i22.setTextColor(-1342177281);
            i22.setOnClickListener(new View.OnClickListener(this) { // from class: zh.p
                public final /* synthetic */ u b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i14) {
                        case 0:
                            new ug.w0(40, this.b.getContext(), (g6) null).show();
                            break;
                        default:
                            this.b.f1();
                            break;
                    }
                }
            });
            ka.b(i22, 0.02f, 1.5f);
            this.S1.addView(i22, ha.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 12.0f));
            qVar.setVisibility(8);
            textView.setVisibility(8);
            this.c2.setVisibility(8);
            x70 x70Var3 = new x70(context, g6Var);
            x70Var3.setGravity(17);
            x70Var3.setTextSize(1, 16.0f);
            int i23 = l6.J6;
            s6.U(x70Var3, i23, g6Var);
            s6.G(x70Var3, i23, g6Var);
            x70Var3.setOnClickListener(new ud0(this, context, g6Var, 6));
            ka.b(x70Var3, 0.02f, 1.5f);
            this.R1.addView(x70Var3, ha.k(16.0f, 0.0f, 14.0f, 18.0f, -1, -2));
            bi.a aVar = new bi.a(cg.d.c(TL_stars.starGiftAttributeModel.class, this.e2.h));
            long j11 = starGift.upgrade_variants;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            for (int i24 = i14; i24 < 3; i24++) {
                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) aVar.c();
                if (stargiftattributemodel != null) {
                    spannableStringBuilder2.append('*');
                    spannableStringBuilder2.setSpan(new r5(stargiftattributemodel.document, x70Var3.getPaint().getFontMetricsInt()), i24, i24 + 1, 33);
                }
            }
            String E3 = id.E(j11, ',');
            Object[] objArr5 = new Object[2];
            objArr5[i14] = spannableStringBuilder2;
            objArr5[1] = E3;
            x70Var3.setText(org.telegram.messenger.g0.I2(id.V(null, null, 2131750318, objArr5), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f)));
        }
        this.R1.addView(this.d2, ha.k(16.0f, 0.0f, 14.0f, 18.0f, -1, -2));
        h1(i14);
    }

    public static void d1(org.telegram.ui.ActionBar.k kVar, Context context, g6 g6Var, TL_stars.StarGift starGift) {
        kVar.setActionBarMenuOnItemClick(new t(context, starGift, g6Var));
        org.telegram.ui.ActionBar.r0 a10 = kVar.r().a(0, R.drawable.ic_ab_other);
        a10.setContentDescription(id.M0(2131754839, "AccDescrMoreOptions"));
        a10.e(4, R.drawable.msg_info, id.M0(2131748331, null));
        a10.e(3, R.drawable.menu_feature_links, id.M0(2131751762, null));
        a10.e(2, R.drawable.msg_share, id.M0(2131745458, null));
    }

    public static void e1(Context context, g6 g6Var, int i7, long j3, long j10, l0 l0Var) {
        w9 c10 = w9.c(i7);
        ai.v0 v0Var = new ai.v0(context, g6Var, i7, j3, l0Var);
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

    public static void g1(Context context, TL_stars.StarGift starGift, g6 g6Var) {
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
        int i7 = l6.Ci;
        paint.setColor(l6.w0(i7, g6Var));
        o6 M = s6.M(i7);
        imageView.setBackground(shapeDrawable);
        s6.j(imageView, shapeDrawable, M, null, g6Var);
        linearLayout.addView(imageView, ha.t(80, 80, 17, 0, 21, 0, 16));
        TextView textView = new TextView(context);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        textView.setText(id.M0(2131749818, null));
        textView.setTextSize(1, 20.0f);
        int i10 = l6.G6;
        s6.U(textView, i10, g6Var);
        linearLayout.addView(textView, ha.t(-1, -2, 17, 20, 0, 20, 6));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setText(id.M0(2131749817, null));
        textView2.setTextSize(1, 14.0f);
        s6.U(textView2, i10, g6Var);
        linearLayout.addView(textView2, ha.t(-1, -2, 17, 20, 0, 20, 16));
        ks0 ks0Var = new ks0(context, g6Var);
        int i11 = starGift.gifts_per_round;
        ks0Var.a.l(id.G(i11, "GiftAuctionInfo1Header", Integer.valueOf(i11)), false);
        int i12 = starGift.gifts_per_round;
        ks0Var.b.setText(id.G(i12, "GiftAuctionInfo1Text", Integer.valueOf(i12)));
        ks0Var.d.setVisibility(8);
        ImageView imageView2 = ks0Var.c;
        imageView2.setImageResource(R.drawable.menu_top_bidders_24);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        s6.s(imageView2, i10, g6Var, mode);
        linearLayout.addView(ks0Var, ha.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
        ks0 ks0Var2 = new ks0(context, g6Var);
        ks0Var2.a.l(id.M0(2131749824, null), false);
        ks0Var2.b.setText(id.G(starGift.gifts_per_round, "GiftAuctionInfo2Text", new Object[0]));
        ks0Var2.d.setVisibility(8);
        ImageView imageView3 = ks0Var2.c;
        imageView3.setImageResource(R.drawable.menu_carryover_24);
        s6.s(imageView3, i10, g6Var, mode);
        linearLayout.addView(ks0Var2, ha.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
        ks0 ks0Var3 = new ks0(context, g6Var);
        ks0Var3.a.l(id.M0(2131749820, null), false);
        ks0Var3.b.setText(id.M0(2131749819, null));
        ks0Var3.d.setVisibility(8);
        ImageView imageView4 = ks0Var3.c;
        imageView4.setImageResource(R.drawable.menu_bid_refund_24);
        s6.s(imageView4, i10, g6Var, mode);
        linearLayout.addView(ks0Var3, ha.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
        fi.d dVar = new fi.d(context, g6Var, true);
        dVar.setOnClickListener(new z6(6, g2Var));
        dVar.i(k7.f2(id.M0(2131743888, null)), false, true);
        linearLayout.addView(dVar, ha.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
        l10.N = linearLayout;
        l10.show();
    }

    @Override // org.telegram.ui.Components.na
    public final pj0 L0(qj0 qj0Var) {
        m41 m41Var = new m41(this.k1, getContext(), this.a, 0, true, new hi.u1(this, 28), this.I0);
        this.g2 = m41Var;
        m41Var.r = false;
        return m41Var;
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
        this.Z1.a(this.W1, id.a0(null, null, 2131750289, Long.valueOf(tL_starGiftAuctionStateFinished.average_price), this.e2.d.title));
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
            jcVar2.setText(id.x(tL_starGiftAuctionStateFinished.start_date, true));
            jcVar.setText(id.x(this.e2.g.end_date, true));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(dd.a1(false, jg.g.m(this.e2.g.average_price, ',', new StringBuilder("⭐️ ")), 0.8f, null));
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) kc.b("?", new n(this, 1), this.I0, null));
            this.W1.setText(spannableStringBuilder);
        } else if (s9Var2 != null && (tL_starGiftAuctionState = s9Var2.f) != null) {
            jcVar2.setText(id.x(tL_starGiftAuctionState.start_date, true));
            jcVar.setText(id.x(this.e2.f.end_date, true));
            int currentTime = ConnectionsManager.getInstance(this.a).getCurrentTime();
            if (this.e2.g(currentTime)) {
                dVar.g(id.a0(null, null, 2131750335, id.c0(this.e2.f.start_date - currentTime)), z9);
            } else {
                dVar.g(id.a0(null, null, 2131750321, id.c0(this.e2.f.end_date - currentTime)), z9);
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
            tx0 tx0Var = this.Y1;
            if (i7 != i10) {
                tx0Var.setText(id.M0(2131750333, null));
                jcVar3.setText(id.E(i10, ','));
            } else {
                tx0Var.setText(id.M0(2131750334, null));
                jcVar3.setText(id.G(i7, "Gift2Availability4Value", id.E(i10, ',')));
            }
            i11 = this.e2.e.acquired_count;
            x70 x70Var = this.d2;
            if (i11 <= 0) {
                x70Var.setVisibility(0);
                x70Var.setText(TextUtils.concat(org.telegram.messenger.g0.I2(id.F("Gift2AuctionsItemsBought2", i11, this.f2), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f))));
            } else {
                x70Var.setVisibility(8);
            }
            s9Var = this.e2;
            tableRow = this.a2;
            if ((s9Var != null || s9Var.g == null) && !starGift.sold_out) {
                tableRow.setVisibility(8);
                dVar.i(id.M0(2131750351, null), z9, true);
            }
            String M0 = id.M0(2131750364, null);
            x70 x70Var2 = this.c2;
            x70Var2.setText(M0);
            s6.U(x70Var2, l6.q7, this.I0);
            tableRow.setVisibility(0);
            dVar.i(id.M0(2131747831, null), z9, true);
            dVar.g(null, z9);
            return;
        }
        i7 = starGift.availability_remains;
        i10 = starGift.availability_total;
        jc jcVar32 = this.X1;
        tx0 tx0Var2 = this.Y1;
        if (i7 != i10) {
        }
        i11 = this.e2.e.acquired_count;
        x70 x70Var3 = this.d2;
        if (i11 <= 0) {
        }
        s9Var = this.e2;
        tableRow = this.a2;
        if (s9Var != null) {
        }
        tableRow.setVisibility(8);
        dVar.i(id.M0(2131750351, null), z9, true);
    }
}
