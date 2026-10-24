package yh;

import ai.a7;
import ai.h6;
import ai.l7;
import ai.nd;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.sl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.a6;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.n01;
import org.telegram.ui.Components.o01;
import org.telegram.ui.Components.t41;
import org.telegram.ui.Components.y90;
import org.telegram.ui.Components.zc;
import org.telegram.ui.cw0;
import w7.b6;
import w7.z5;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class v extends bb implements GiftAuctionController.OnAuctionUpdateListener {
    public static final zc[] p0 = new zc[1];
    public static final n01[] q0 = new n01[1];
    public final TL_stars.StarGift X;
    public final long Y;
    public final LinearLayout Z;
    public final FrameLayout a0;
    public final TextView b0;
    public final zc c0;
    public final zc d0;
    public final zc e0;
    public final zc f0;
    public final n01 g0;
    public final ai.s0 h0;
    public final TableRow i0;
    public final ei.d j0;
    public final y90 k0;
    public final y90 l0;
    public GiftAuctionController.Auction m0;
    public final CharSequence n0;
    public b71 o0;

    public v(Context context, g6 g6Var, long j10, TL_stars.StarGift starGift, Runnable runnable) {
        super(context, null, false, false, 1, g6Var);
        boolean z10;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState;
        ArrayList<TL_stars.StarGiftAuctionRound> arrayList;
        int i10;
        int i11;
        String formatString;
        String formatPluralString;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState2;
        this.X = starGift;
        long j11 = starGift.id;
        this.Y = j11;
        this.K = AndroidUtilities.dp(6.0f);
        this.v = 0.2f;
        fixNavigationBar();
        String str = starGift.title;
        String str2 = str == null ? "Gift" : str;
        LinearLayout linearLayout = new LinearLayout(context);
        this.Z = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setClickable(true);
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, g6Var);
        kVar.B(-1, false);
        kVar.setOccupyStatusBar(false);
        S(kVar, context, g6Var, starGift);
        FrameLayout frameLayout = new FrameLayout(context);
        this.a0 = frameLayout;
        frameLayout.addView(kVar, z5.n(-1, -2));
        linearLayout.addView(frameLayout);
        r rVar = new r(context, this.currentAccount, g6Var);
        rVar.c0 = true;
        rVar.h(starGift, false, false, false, false, false);
        rVar.setImageSize(AndroidUtilities.dp(100.0f));
        rVar.setImageLayer(7);
        rVar.J.setVisibility(8);
        frameLayout.addView(rVar, z5.d(130, 130.0f, 17, 0.0f, 18.0f, 0.0f, 14.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setText(str2);
        textView.setTextSize(1, 20.0f);
        int i12 = k6.G6;
        r6.W(textView, i12, g6Var);
        linearLayout.addView(textView, z5.t(-1, -2, 17, 20, 0, 20, 6));
        y90 y90Var = new y90(context, null);
        this.k0 = y90Var;
        y90Var.setGravity(17);
        y90Var.setText(TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.formatPluralString("Gift2AuctionInfo2", starGift.gifts_per_round, str2)), " ", AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2AuctionInfoLearnMore), new p(context, g6Var, starGift, 0)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f))));
        y90Var.setTextSize(1, 14.0f);
        r6.W(y90Var, i12, g6Var);
        int i13 = k6.J6;
        r6.I(y90Var, i13, g6Var);
        linearLayout.addView(y90Var, z5.t(-1, -2, 17, 20, 0, 20, 4));
        o01 o01Var = new o01(context, g6Var);
        String string = LocaleController.getString(R.string.Gift2AuctionTableStarted);
        zc[] zcVarArr = p0;
        o01Var.c(string, "", null, zcVarArr);
        this.c0 = zcVarArr[0];
        o01Var.c(LocaleController.getString(R.string.Gift2AuctionTableEnded), "", null, zcVarArr);
        this.d0 = zcVarArr[0];
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.setClipChildren(false);
        frameLayout2.setClipToPadding(false);
        frameLayout2.addView(o01Var, z5.e(-1, -2, 119));
        this.h0 = new ai.s0(this, new ei.x3[1], frameLayout2, 7);
        TableRow c10 = o01Var.c(LocaleController.getString(R.string.GiftValueAveragePrice), "", null, zcVarArr);
        this.i0 = c10;
        final int i14 = 1;
        c10.setOnClickListener(new View.OnClickListener(this) { // from class: yh.q
            public final /* synthetic */ v b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        new sg.y0(this.b.getContext(), 40, (g6) null).show();
                        break;
                    default:
                        this.b.T();
                        break;
                }
            }
        });
        this.e0 = zcVarArr[0];
        n01[] n01VarArr = q0;
        o01Var.c("", "", n01VarArr, zcVarArr);
        this.f0 = zcVarArr[0];
        this.g0 = n01VarArr[0];
        linearLayout.addView(frameLayout2, z5.k(16.0f, 16.0f, 14.0f, 18.0f, -1, -2));
        y90 y90Var2 = new y90(context, g6Var);
        this.l0 = y90Var2;
        y90Var2.setGravity(17);
        y90Var2.setTextSize(1, 16.0f);
        r6.W(y90Var2, i13, g6Var);
        r6.I(y90Var2, i13, g6Var);
        y90Var2.setOnClickListener(new t41(this, new boolean[1], g6Var, 7));
        b6.b(y90Var2, 0.02f, 1.5f);
        if (starGift.sticker != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
            z10 = false;
            spannableStringBuilder.setSpan(new a6(starGift.sticker, y90Var2.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
            this.n0 = spannableStringBuilder;
        } else {
            z10 = false;
            this.n0 = "";
        }
        ei.d dVar = new ei.d(context, g6Var, true);
        this.j0 = dVar;
        dVar.f();
        final int i15 = z10;
        dVar.setOnClickListener(new n(this, j10, context, g6Var, runnable, 0));
        FrameLayout.LayoutParams d = z5.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i16 = d.leftMargin;
        int i17 = this.backgroundPaddingLeft;
        d.leftMargin = i16 + i17;
        d.rightMargin += i17;
        this.containerView.addView(dVar, d);
        mm0 mm0Var = this.d;
        int i18 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i18, i15, i18, AndroidUtilities.dp(64.0f));
        this.o0.N(i15);
        GiftAuctionController.Auction subscribeToGiftAuction = GiftAuctionController.getInstance(this.currentAccount).subscribeToGiftAuction(j11, this);
        this.m0 = subscribeToGiftAuction;
        if (subscribeToGiftAuction != null && (tL_starGiftAuctionState2 = subscribeToGiftAuction.auctionStateActive) != null) {
            if (tL_starGiftAuctionState2.start_date > ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()) {
                o01Var.c(LocaleController.getString(R.string.Gift2AuctionTableCurrentRounds), LocaleController.formatNumber(this.m0.auctionStateActive.total_rounds, ','), null, null);
            } else {
                String string2 = LocaleController.getString(R.string.Gift2AuctionTableCurrentRound);
                int i19 = R.string.OfS;
                String formatNumber = LocaleController.formatNumber(this.m0.auctionStateActive.current_round, ',');
                String formatNumber2 = LocaleController.formatNumber(this.m0.auctionStateActive.total_rounds, ',');
                Object[] objArr = new Object[2];
                objArr[i15] = formatNumber;
                objArr[1] = formatNumber2;
                o01Var.c(string2, LocaleController.formatString(i19, objArr), null, null);
            }
        }
        GiftAuctionController.Auction auction = this.m0;
        if (auction != null && (tL_starGiftAuctionState = auction.auctionStateActive) != null && (arrayList = tL_starGiftAuctionState.rounds) != null) {
            int size = arrayList.size();
            for (int i20 = i15; i20 < size; i20++) {
                TL_stars.StarGiftAuctionRound starGiftAuctionRound = this.m0.auctionStateActive.rounds.get(i20);
                if (i20 < size - 1) {
                    i10 = 1;
                    i11 = this.m0.auctionStateActive.rounds.get(i20 + 1).num - 1;
                } else {
                    i10 = 1;
                    i11 = this.m0.auctionStateActive.total_rounds;
                }
                int i21 = starGiftAuctionRound.num;
                if (i21 == i11) {
                    int i22 = R.string.Gift2AuctionTableCurrentRoundsOne;
                    Object[] objArr2 = new Object[i10];
                    objArr2[i15] = Integer.valueOf(i21);
                    formatString = LocaleController.formatString(i22, objArr2);
                } else {
                    int i23 = R.string.Gift2AuctionTableCurrentRoundsTwo;
                    Integer valueOf = Integer.valueOf(i21);
                    Integer valueOf2 = Integer.valueOf(i11);
                    Object[] objArr3 = new Object[2];
                    objArr3[i15] = valueOf;
                    objArr3[i10] = valueOf2;
                    formatString = LocaleController.formatString(i23, objArr3);
                }
                if (starGiftAuctionRound.num == i11) {
                    int i24 = R.string.Gift2AuctionTableCurrentRoundsOneDuration;
                    String formatTTLString = LocaleController.formatTTLString(starGiftAuctionRound.duration);
                    String formatTTLString2 = LocaleController.formatTTLString(starGiftAuctionRound.current_window);
                    Integer valueOf3 = Integer.valueOf(starGiftAuctionRound.extend_top);
                    Object[] objArr4 = new Object[3];
                    objArr4[i15] = formatTTLString;
                    objArr4[1] = formatTTLString2;
                    objArr4[2] = valueOf3;
                    formatPluralString = LocaleController.formatString(i24, objArr4);
                } else {
                    formatPluralString = LocaleController.formatPluralString("Gift2AuctionTableCurrentRoundsTwoDuration", starGiftAuctionRound.duration / 60, new Object[i15]);
                }
                o01Var.c(formatString, formatPluralString, null, null);
            }
        }
        GiftAuctionController.Auction auction2 = this.m0;
        if (auction2 != null && auction2.previewAttributes != null) {
            int i25 = 28;
            t tVar = new t(this, context, g6Var, new o(this, i15), new ah.f(i25), new ah.f(i25), new ah.f(i25), new ah.f(i25), new ah.f(i25), new ah.f(i25));
            tVar.d(new h6(1, 1));
            tVar.setPreviewingAttributes(this.m0.previewAttributes);
            tVar.removeView(tVar.P);
            this.a0.addView(tVar, i15, z5.e(-1, 288, 48));
            TextView textView2 = new TextView(context);
            this.b0 = textView2;
            textView2.setGravity(17);
            textView2.setTypeface(AndroidUtilities.bold());
            textView2.setTextColor(-1);
            textView2.setTextSize(1, 12.0f);
            GiftAuctionController.Auction auction3 = this.m0;
            if (auction3.auctionStateFinished != null) {
                textView2.setText(LocaleController.getString(R.string.Gift2AuctionEndedNoDot));
            } else if (auction3.isUpcoming()) {
                textView2.setText(LocaleController.getString(R.string.Gift2LinkUpcomingAuction));
            } else {
                textView2.setText(LocaleController.getString(R.string.Gift2LinkGiftAuction));
            }
            textView2.setBackground(k6.a0(i15, 285212671, 13, 13));
            textView2.setPadding(AndroidUtilities.dp(12.0f), i15, AndroidUtilities.dp(12.0f), i15);
            TextView j12 = org.telegram.ui.Cells.b1.j(this.a0, textView2, z5.d(-2, 26.0f, 81, 16.0f, 0.0f, 16.0f, 77.0f), context);
            j12.setTypeface(AndroidUtilities.bold());
            j12.setTextSize(1, 21.0f);
            j12.setText(str2);
            j12.setGravity(17);
            j12.setTextColor(-1);
            TextView j13 = org.telegram.ui.Cells.b1.j(this.a0, j12, z5.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 40.0f), context);
            j13.setTextSize(1, 13.0f);
            j13.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.Gift2AuctionLearnMore2), i15, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
            j13.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            j13.setGravity(17);
            j13.setTextColor(-1342177281);
            j13.setOnClickListener(new View.OnClickListener(this) { // from class: yh.q
                public final /* synthetic */ v b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i15) {
                        case 0:
                            new sg.y0(this.b.getContext(), 40, (g6) null).show();
                            break;
                        default:
                            this.b.T();
                            break;
                    }
                }
            });
            b6.b(j13, 0.02f, 1.5f);
            this.a0.addView(j13, z5.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 12.0f));
            rVar.setVisibility(8);
            textView.setVisibility(8);
            this.k0.setVisibility(8);
            y90 y90Var3 = new y90(context, g6Var);
            y90Var3.setGravity(17);
            y90Var3.setTextSize(1, 16.0f);
            int i26 = k6.J6;
            r6.W(y90Var3, i26, g6Var);
            r6.I(y90Var3, i26, g6Var);
            y90Var3.setOnClickListener(new t41(this, context, g6Var, 6));
            b6.b(y90Var3, 0.02f, 1.5f);
            this.Z.addView(y90Var3, z5.k(16.0f, 0.0f, 14.0f, 18.0f, -1, -2));
            ai.a aVar = new ai.a(ag.d.c(this.m0.previewAttributes, TL_stars.starGiftAttributeModel.class));
            long j14 = starGift.upgrade_variants;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            for (int i27 = i15; i27 < 3; i27++) {
                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) aVar.c();
                if (stargiftattributemodel != null) {
                    spannableStringBuilder2.append('*');
                    spannableStringBuilder2.setSpan(new a6(stargiftattributemodel.document, y90Var3.getPaint().getFontMetricsInt()), i27, i27 + 1, 33);
                }
            }
            int i28 = R.string.Gift2AuctionVariants;
            String formatNumber3 = LocaleController.formatNumber(j14, ',');
            Object[] objArr5 = new Object[2];
            objArr5[i15] = spannableStringBuilder2;
            objArr5[1] = formatNumber3;
            y90Var3.setText(AndroidUtilities.replaceArrows(LocaleController.formatSpannable(i28, objArr5), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
        }
        this.Z.addView(this.l0, z5.k(16.0f, 0.0f, 14.0f, 18.0f, -1, -2));
        V(i15);
    }

    public static /* synthetic */ void P(v vVar, boolean[] zArr, g6 g6Var) {
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        GiftAuctionController.getInstance(vVar.currentAccount).getOrRequestAcquiredGifts(vVar.Y, new ai.a4(vVar, zArr, g6Var, 13));
    }

    public static void Q(v vVar, long j10, Context context, g6 g6Var, Runnable runnable) {
        GiftAuctionController.Auction auction;
        ArrayList<TL_stars.StarGiftAttribute> arrayList;
        GiftAuctionController.Auction auction2 = vVar.m0;
        if (auction2 != null && !auction2.isFinished()) {
            if ((j10 == 0 || j10 == UserConfig.getInstance(vVar.currentAccount).getClientUserId()) && (arrayList = (auction = vVar.m0).previewAttributes) != null) {
                new c0(context, g6Var, j10, auction.gift, arrayList, runnable, false).show();
            } else {
                new s(context, vVar.currentAccount, vVar.m0.gift, null, j10, runnable, false, false).show();
            }
        }
        vVar.dismiss();
    }

    public static /* synthetic */ void R(v vVar, Context context, g6 g6Var) {
        int i10 = vVar.currentAccount;
        GiftAuctionController.Auction auction = vVar.m0;
        new ai.a2(context, g6Var, i10, auction.gift.title, auction.previewAttributes, false).show();
        vVar.dismiss();
    }

    public static void S(org.telegram.ui.ActionBar.k kVar, Context context, g6 g6Var, TL_stars.StarGift starGift) {
        kVar.setActionBarMenuOnItemClick(new u(context, starGift, g6Var));
        org.telegram.ui.ActionBar.u0 a2 = kVar.m().a(0, R.drawable.ic_ab_other);
        a2.setContentDescription(LocaleController.getString("AccDescrMoreOptions", R.string.AccDescrMoreOptions));
        a2.e(4, R.drawable.msg_info, LocaleController.getString(R.string.MoreInfo));
        a2.e(3, R.drawable.menu_feature_links, LocaleController.getString(R.string.CopyLink));
        a2.e(2, R.drawable.msg_share, LocaleController.getString(R.string.ShareLink));
    }

    public static void U(Context context, TL_stars.StarGift starGift, g6 g6Var) {
        Runnable runnable;
        if (context == null || starGift == null) {
            return;
        }
        org.telegram.ui.ActionBar.h3 j10 = sl.j(1, context, null, false);
        runnable = j10.dismissRunnable;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        ImageView imageView = new ImageView(context);
        imageView.setPadding(AndroidUtilities.dp(17.0f), AndroidUtilities.dp(17.0f), AndroidUtilities.dp(17.0f), AndroidUtilities.dp(17.0f));
        imageView.setImageResource(R.drawable.filled_gift_sell_24);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        Paint paint = shapeDrawable.getPaint();
        int i10 = k6.Oh;
        paint.setColor(k6.w0(i10, g6Var));
        n6 O = r6.O(i10);
        imageView.setBackground(shapeDrawable);
        r6.k(imageView, shapeDrawable, O, null, g6Var);
        linearLayout.addView(imageView, z5.t(80, 80, 17, 0, 21, 0, 16));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        sl.n(R.string.GiftAuctionInfoHeader, textView, 1, 20.0f);
        int i11 = k6.G6;
        r6.W(textView, i11, g6Var);
        linearLayout.addView(textView, z5.t(-1, -2, 17, 20, 0, 20, 6));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        sl.n(R.string.GiftAuctionInfoText, textView2, 1, 14.0f);
        r6.W(textView2, i11, g6Var);
        linearLayout.addView(textView2, z5.t(-1, -2, 17, 20, 0, 20, 16));
        cw0 cw0Var = new cw0(context, g6Var);
        int i12 = starGift.gifts_per_round;
        cw0Var.a.l(LocaleController.formatPluralString("GiftAuctionInfo1Header", i12, Integer.valueOf(i12)), false);
        int i13 = starGift.gifts_per_round;
        cw0Var.b.setText(LocaleController.formatPluralString("GiftAuctionInfo1Text", i13, Integer.valueOf(i13)));
        cw0Var.d.setVisibility(8);
        int i14 = R.drawable.menu_top_bidders_24;
        ImageView imageView2 = cw0Var.c;
        imageView2.setImageResource(i14);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        r6.t(imageView2, i11, g6Var, mode);
        linearLayout.addView(cw0Var, z5.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
        cw0 cw0Var2 = new cw0(context, g6Var);
        cw0Var2.a.l(LocaleController.getString(R.string.GiftAuctionInfo2Header), false);
        cw0Var2.b.setText(LocaleController.formatPluralString("GiftAuctionInfo2Text", starGift.gifts_per_round, new Object[0]));
        cw0Var2.d.setVisibility(8);
        int i15 = R.drawable.menu_carryover_24;
        ImageView imageView3 = cw0Var2.c;
        imageView3.setImageResource(i15);
        r6.t(imageView3, i11, g6Var, mode);
        linearLayout.addView(cw0Var2, z5.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
        cw0 cw0Var3 = new cw0(context, g6Var);
        cw0Var3.a.l(LocaleController.getString(R.string.GiftAuctionInfo3Header), false);
        cw0Var3.b.setText(LocaleController.getString(R.string.GiftAuctionInfo3Text));
        cw0Var3.d.setVisibility(8);
        int i16 = R.drawable.menu_bid_refund_24;
        ImageView imageView4 = cw0Var3.c;
        imageView4.setImageResource(i16);
        r6.t(imageView4, i11, g6Var, mode);
        linearLayout.addView(cw0Var3, z5.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
        ei.d dVar = new ei.d(context, g6Var, true);
        dVar.setOnClickListener(new a7(6, runnable));
        dVar.i(l7.H2(LocaleController.getString(R.string.Understood)), false, true);
        linearLayout.addView(dVar, z5.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
        j10.customView = linearLayout;
        j10.show();
    }

    public final void T() {
        TL_stars.TL_starGiftAuctionStateFinished tL_starGiftAuctionStateFinished;
        GiftAuctionController.Auction auction = this.m0;
        if (auction == null || (tL_starGiftAuctionStateFinished = auction.auctionStateFinished) == null || auction.gift.title == null) {
            return;
        }
        this.h0.run(this.e0, LocaleController.formatString(R.string.Gift2AveragePriceHint, Long.valueOf(tL_starGiftAuctionStateFinished.average_price), this.m0.gift.title));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void V(boolean z10) {
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState;
        int i10;
        int i11;
        int i12;
        GiftAuctionController.Auction auction;
        TableRow tableRow;
        TL_stars.TL_starGiftAuctionStateFinished tL_starGiftAuctionStateFinished;
        GiftAuctionController.Auction auction2 = this.m0;
        zc zcVar = this.d0;
        zc zcVar2 = this.c0;
        ei.d dVar = this.j0;
        int i13 = 1;
        if (auction2 != null && (tL_starGiftAuctionStateFinished = auction2.auctionStateFinished) != null) {
            zcVar2.setText(LocaleController.formatDateTime(tL_starGiftAuctionStateFinished.start_date, true));
            zcVar.setText(LocaleController.formatDateTime(this.m0.auctionStateFinished.end_date, true));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(nd.Y0(false, i2.o1.m(this.m0.auctionStateFinished.average_price, ',', new StringBuilder("⭐️ ")), 0.8f, null));
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) ad.b("?", new o(this, i13), this.resourcesProvider, null));
            this.e0.setText(spannableStringBuilder);
        } else if (auction2 != null && (tL_starGiftAuctionState = auction2.auctionStateActive) != null) {
            zcVar2.setText(LocaleController.formatDateTime(tL_starGiftAuctionState.start_date, true));
            zcVar.setText(LocaleController.formatDateTime(this.m0.auctionStateActive.end_date, true));
            int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
            if (this.m0.isUpcoming(currentTime)) {
                dVar.g(LocaleController.formatString(R.string.Gift2AuctionStartsIn, LocaleController.formatTTLString(this.m0.auctionStateActive.start_date - currentTime)), z10);
            } else {
                dVar.g(LocaleController.formatString(R.string.Gift2AuctionTimeLeft, LocaleController.formatTTLString(this.m0.auctionStateActive.end_date - currentTime)), z10);
            }
        }
        GiftAuctionController.Auction auction3 = this.m0;
        TL_stars.StarGift starGift = this.X;
        if (auction3 != null) {
            if (auction3.isFinished()) {
                i10 = 0;
            } else {
                TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState2 = this.m0.auctionStateActive;
                if (tL_starGiftAuctionState2 != null) {
                    i10 = tL_starGiftAuctionState2.gifts_left;
                }
            }
            i11 = starGift.availability_total;
            zc zcVar3 = this.f0;
            n01 n01Var = this.g0;
            if (i10 != i11) {
                n01Var.setText(LocaleController.getString(R.string.Gift2AuctionTableCurrentQuantity));
                zcVar3.setText(LocaleController.formatNumber(i11, ','));
            } else {
                n01Var.setText(LocaleController.getString(R.string.Gift2AuctionTableCurrentAvailability));
                zcVar3.setText(LocaleController.formatPluralString("Gift2Availability4Value", i10, LocaleController.formatNumber(i11, ',')));
            }
            i12 = this.m0.auctionUserState.acquired_count;
            y90 y90Var = this.l0;
            if (i12 <= 0) {
                y90Var.setVisibility(0);
                y90Var.setText(TextUtils.concat(AndroidUtilities.replaceArrows(LocaleController.formatPluralSpannable("Gift2AuctionsItemsBought2", i12, this.n0), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f))));
            } else {
                y90Var.setVisibility(8);
            }
            auction = this.m0;
            tableRow = this.i0;
            if ((auction != null || auction.auctionStateFinished == null) && !starGift.sold_out) {
                tableRow.setVisibility(8);
                dVar.i(LocaleController.getString(R.string.Gift2AuctionJoin), z10, true);
            }
            String string = LocaleController.getString(R.string.Gift2AuctionEnded);
            y90 y90Var2 = this.k0;
            y90Var2.setText(string);
            r6.W(y90Var2, k6.q7, this.resourcesProvider);
            tableRow.setVisibility(0);
            dVar.i(LocaleController.getString(R.string.OK), z10, true);
            dVar.g(null, z10);
            return;
        }
        i10 = starGift.availability_remains;
        i11 = starGift.availability_total;
        zc zcVar32 = this.f0;
        n01 n01Var2 = this.g0;
        if (i10 != i11) {
        }
        i12 = this.m0.auctionUserState.acquired_count;
        y90 y90Var3 = this.l0;
        if (i12 <= 0) {
        }
        auction = this.m0;
        tableRow = this.i0;
        if (auction != null) {
        }
        tableRow.setVisibility(8);
        dVar.i(LocaleController.getString(R.string.Gift2AuctionJoin), z10, true);
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        GiftAuctionController.getInstance(this.currentAccount).unsubscribeFromGiftAuction(this.Y, this);
        super.dismiss();
    }

    @Override // org.telegram.messenger.GiftAuctionController.OnAuctionUpdateListener
    public final void onUpdate(GiftAuctionController.Auction auction) {
        this.m0 = auction;
        V(true);
    }

    @Override // org.telegram.ui.Components.bb
    public final lm0 w(mm0 mm0Var) {
        b71 b71Var = new b71(this.d, getContext(), this.currentAccount, 0, true, new hg.o(this, 25), this.resourcesProvider);
        this.o0 = b71Var;
        b71Var.r = false;
        return b71Var;
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence z() {
        return "";
    }
}
