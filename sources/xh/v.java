package xh;

import ai.d5;
import android.content.Context;
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
import org.telegram.messenger.vl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.c90;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.oz0;
import org.telegram.ui.Components.pz0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.za;
import org.telegram.ui.uw0;
import w7.x5;
import w7.z5;
import yh.x7;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class v extends za implements GiftAuctionController.OnAuctionUpdateListener {
    public static final xc[] p0 = new xc[1];
    public static final oz0[] q0 = new oz0[1];
    public final TL_stars.StarGift X;
    public final long Y;
    public final LinearLayout Z;
    public final FrameLayout a0;
    public final TextView b0;
    public final xc c0;
    public final xc d0;
    public final xc e0;
    public final xc f0;
    public final oz0 g0;
    public final org.telegram.tgnet.e h0;
    public final TableRow i0;
    public final ci.d j0;
    public final c90 k0;
    public final c90 l0;
    public GiftAuctionController.Auction m0;
    public final CharSequence n0;
    public w51 o0;

    public v(Context context, e6 e6Var, long j3, TL_stars.StarGift starGift, Runnable runnable) {
        super(context, null, false, false, 1, e6Var);
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState;
        ArrayList<TL_stars.StarGiftAuctionRound> arrayList;
        int i10;
        int i11;
        String formatString;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState2;
        this.X = starGift;
        long j10 = starGift.id;
        this.Y = j10;
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
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, e6Var);
        kVar.B(-1, false);
        kVar.setOccupyStatusBar(false);
        S(kVar, context, e6Var, starGift);
        FrameLayout frameLayout = new FrameLayout(context);
        this.a0 = frameLayout;
        frameLayout.addView(kVar, x5.n(-1, -2));
        linearLayout.addView(frameLayout);
        r rVar = new r(context, this.currentAccount, e6Var);
        rVar.a0 = true;
        rVar.g(starGift, false, false, false, false, false);
        rVar.setImageSize(AndroidUtilities.dp(100.0f));
        rVar.setImageLayer(7);
        rVar.J.setVisibility(8);
        frameLayout.addView(rVar, x5.d(130, 130.0f, 17, 0.0f, 18.0f, 0.0f, 14.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setText(str2);
        textView.setTextSize(1, 20.0f);
        int i12 = i6.G6;
        textView.setTextColor(i6.v0(i12, e6Var));
        linearLayout.addView(textView, x5.t(-1, -2, 17, 20, 0, 20, 6));
        c90 c90Var = new c90(context, null);
        this.k0 = c90Var;
        c90Var.setGravity(17);
        c90Var.setText(TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.formatPluralString("Gift2AuctionInfo2", starGift.gifts_per_round, str2)), " ", AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2AuctionInfoLearnMore), new p(context, e6Var, starGift, 0)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f))));
        c90Var.setTextSize(1, 14.0f);
        c90Var.setTextColor(i6.v0(i12, e6Var));
        int i13 = i6.J6;
        c90Var.setLinkTextColor(i6.v0(i13, e6Var));
        linearLayout.addView(c90Var, x5.t(-1, -2, 17, 20, 0, 20, 4));
        pz0 pz0Var = new pz0(context, e6Var);
        String string = LocaleController.getString(R.string.Gift2AuctionTableStarted);
        xc[] xcVarArr = p0;
        pz0Var.c(string, "", null, xcVarArr);
        this.c0 = xcVarArr[0];
        pz0Var.c(LocaleController.getString(R.string.Gift2AuctionTableEnded), "", null, xcVarArr);
        this.d0 = xcVarArr[0];
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.setClipChildren(false);
        frameLayout2.setClipToPadding(false);
        frameLayout2.addView(pz0Var, x5.e(-1, -2, 119));
        this.h0 = new org.telegram.tgnet.e(this, new ci.f4[1], frameLayout2, 5);
        TableRow c10 = pz0Var.c(LocaleController.getString(R.string.GiftValueAveragePrice), "", null, xcVarArr);
        this.i0 = c10;
        final int i14 = 1;
        c10.setOnClickListener(new View.OnClickListener(this) { // from class: xh.q
            public final /* synthetic */ v b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        new rg.x0(this.b.getContext(), 40, (e6) null).show();
                        break;
                    default:
                        this.b.T();
                        break;
                }
            }
        });
        this.e0 = xcVarArr[0];
        oz0[] oz0VarArr = q0;
        pz0Var.c("", "", oz0VarArr, xcVarArr);
        this.f0 = xcVarArr[0];
        this.g0 = oz0VarArr[0];
        linearLayout.addView(frameLayout2, x5.k(16.0f, 16.0f, 14.0f, 18.0f, -1, -2));
        c90 c90Var2 = new c90(context, e6Var);
        this.l0 = c90Var2;
        c90Var2.setGravity(17);
        c90Var2.setTextSize(1, 16.0f);
        c90Var2.setTextColor(i6.v0(i13, e6Var));
        c90Var2.setLinkTextColor(i6.v0(i13, e6Var));
        c90Var2.setOnClickListener(new xg.e(this, new boolean[1], e6Var, 4));
        z5.b(c90Var2, 0.02f, 1.5f);
        if (starGift.sticker != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.x5(starGift.sticker, c90Var2.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
            this.n0 = spannableStringBuilder;
        } else {
            this.n0 = "";
        }
        ci.d dVar = new ci.d(context, e6Var, true);
        this.j0 = dVar;
        dVar.e();
        final int i15 = 0;
        dVar.setOnClickListener(new n(this, j3, context, e6Var, runnable, 0));
        FrameLayout.LayoutParams d = x5.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i16 = d.leftMargin;
        int i17 = this.backgroundPaddingLeft;
        d.leftMargin = i16 + i17;
        d.rightMargin += i17;
        this.containerView.addView(dVar, d);
        ll0 ll0Var = this.d;
        int i18 = this.backgroundPaddingLeft;
        ll0Var.setPadding(i18, 0, i18, AndroidUtilities.dp(64.0f));
        this.o0.N(false);
        GiftAuctionController.Auction subscribeToGiftAuction = GiftAuctionController.getInstance(this.currentAccount).subscribeToGiftAuction(j10, this);
        this.m0 = subscribeToGiftAuction;
        if (subscribeToGiftAuction != null && (tL_starGiftAuctionState2 = subscribeToGiftAuction.auctionStateActive) != null) {
            if (tL_starGiftAuctionState2.start_date > ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()) {
                pz0Var.c(LocaleController.getString(R.string.Gift2AuctionTableCurrentRounds), LocaleController.formatNumber(this.m0.auctionStateActive.total_rounds, ','), null, null);
            } else {
                pz0Var.c(LocaleController.getString(R.string.Gift2AuctionTableCurrentRound), LocaleController.formatString(R.string.OfS, LocaleController.formatNumber(this.m0.auctionStateActive.current_round, ','), LocaleController.formatNumber(this.m0.auctionStateActive.total_rounds, ',')), null, null);
            }
        }
        GiftAuctionController.Auction auction = this.m0;
        if (auction != null && (tL_starGiftAuctionState = auction.auctionStateActive) != null && (arrayList = tL_starGiftAuctionState.rounds) != null) {
            int size = arrayList.size();
            for (int i19 = 0; i19 < size; i19++) {
                TL_stars.StarGiftAuctionRound starGiftAuctionRound = this.m0.auctionStateActive.rounds.get(i19);
                if (i19 < size - 1) {
                    i10 = 1;
                    i11 = this.m0.auctionStateActive.rounds.get(i19 + 1).num - 1;
                } else {
                    i10 = 1;
                    i11 = this.m0.auctionStateActive.total_rounds;
                }
                int i20 = starGiftAuctionRound.num;
                if (i20 == i11) {
                    int i21 = R.string.Gift2AuctionTableCurrentRoundsOne;
                    Object[] objArr = new Object[i10];
                    objArr[0] = Integer.valueOf(i20);
                    formatString = LocaleController.formatString(i21, objArr);
                } else {
                    int i22 = R.string.Gift2AuctionTableCurrentRoundsTwo;
                    Integer valueOf = Integer.valueOf(i20);
                    Integer valueOf2 = Integer.valueOf(i11);
                    Object[] objArr2 = new Object[2];
                    objArr2[0] = valueOf;
                    objArr2[i10] = valueOf2;
                    formatString = LocaleController.formatString(i22, objArr2);
                }
                pz0Var.c(formatString, starGiftAuctionRound.num == i11 ? LocaleController.formatString(R.string.Gift2AuctionTableCurrentRoundsOneDuration, LocaleController.formatTTLString(starGiftAuctionRound.duration), LocaleController.formatTTLString(starGiftAuctionRound.current_window), Integer.valueOf(starGiftAuctionRound.extend_top)) : LocaleController.formatPluralString("Gift2AuctionTableCurrentRoundsTwoDuration", starGiftAuctionRound.duration / 60, new Object[0]), null, null);
            }
        }
        GiftAuctionController.Auction auction2 = this.m0;
        if (auction2 != null && auction2.previewAttributes != null) {
            int i23 = 25;
            t tVar = new t(this, context, e6Var, new o(this, i15), new ai.e2(i23), new ai.e2(i23), new ai.e2(i23), new ai.e2(i23), new ai.e2(i23), new ai.e2(i23));
            tVar.d(new f4.d(1, 1));
            tVar.setPreviewingAttributes(this.m0.previewAttributes);
            tVar.removeView(tVar.O);
            this.a0.addView(tVar, 0, x5.e(-1, 288, 48));
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
            textView2.setBackground(i6.Z(0, 285212671, 13, 13));
            textView2.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
            TextView f7 = org.telegram.ui.Cells.q3.f(this.a0, textView2, x5.d(-2, 26.0f, 81, 16.0f, 0.0f, 16.0f, 77.0f), context);
            f7.setTypeface(AndroidUtilities.bold());
            f7.setTextSize(1, 21.0f);
            f7.setText(str2);
            f7.setGravity(17);
            f7.setTextColor(-1);
            TextView f10 = org.telegram.ui.Cells.q3.f(this.a0, f7, x5.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 40.0f), context);
            f10.setTextSize(1, 13.0f);
            f10.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.Gift2AuctionLearnMore2), false, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
            f10.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            f10.setGravity(17);
            f10.setTextColor(-1342177281);
            f10.setOnClickListener(new View.OnClickListener(this) { // from class: xh.q
                public final /* synthetic */ v b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i15) {
                        case 0:
                            new rg.x0(this.b.getContext(), 40, (e6) null).show();
                            break;
                        default:
                            this.b.T();
                            break;
                    }
                }
            });
            z5.b(f10, 0.02f, 1.5f);
            this.a0.addView(f10, x5.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 12.0f));
            rVar.setVisibility(8);
            textView.setVisibility(8);
            this.k0.setVisibility(8);
            c90 c90Var3 = new c90(context, e6Var);
            c90Var3.setGravity(17);
            c90Var3.setTextSize(1, 16.0f);
            int i24 = i6.J6;
            c90Var3.setTextColor(i6.v0(i24, e6Var));
            c90Var3.setLinkTextColor(i6.v0(i24, e6Var));
            c90Var3.setOnClickListener(new xg.e(this, context, e6Var, 3));
            z5.b(c90Var3, 0.02f, 1.5f);
            this.Z.addView(c90Var3, x5.k(16.0f, 0.0f, 14.0f, 18.0f, -1, -2));
            com.google.android.gms.common.api.internal.r rVar2 = new com.google.android.gms.common.api.internal.r(zf.d.c(this.m0.previewAttributes, TL_stars.starGiftAttributeModel.class));
            long j11 = starGift.upgrade_variants;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            for (int i25 = 0; i25 < 3; i25++) {
                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) rVar2.c();
                if (stargiftattributemodel != null) {
                    spannableStringBuilder2.append('*');
                    spannableStringBuilder2.setSpan(new org.telegram.ui.Components.x5(stargiftattributemodel.document, c90Var3.getPaint().getFontMetricsInt()), i25, i25 + 1, 33);
                }
            }
            c90Var3.setText(AndroidUtilities.replaceArrows(LocaleController.formatSpannable(R.string.Gift2AuctionVariants, spannableStringBuilder2, LocaleController.formatNumber(j11, ',')), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
        }
        this.Z.addView(this.l0, x5.k(16.0f, 0.0f, 14.0f, 18.0f, -1, -2));
        V(false);
    }

    public static /* synthetic */ void P(v vVar, boolean[] zArr, e6 e6Var) {
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        GiftAuctionController.getInstance(vVar.currentAccount).getOrRequestAcquiredGifts(vVar.Y, new d5(vVar, zArr, e6Var, 9));
    }

    public static void Q(v vVar, long j3, Context context, e6 e6Var, Runnable runnable) {
        GiftAuctionController.Auction auction;
        ArrayList<TL_stars.StarGiftAttribute> arrayList;
        GiftAuctionController.Auction auction2 = vVar.m0;
        if (auction2 != null && !auction2.isFinished()) {
            if ((j3 == 0 || j3 == UserConfig.getInstance(vVar.currentAccount).getClientUserId()) && (arrayList = (auction = vVar.m0).previewAttributes) != null) {
                new c0(context, e6Var, j3, auction.gift, arrayList, runnable, false).show();
            } else {
                new s(context, vVar.currentAccount, vVar.m0.gift, null, j3, runnable, false, false).show();
            }
        }
        vVar.dismiss();
    }

    public static /* synthetic */ void R(v vVar, Context context, e6 e6Var) {
        int i10 = vVar.currentAccount;
        GiftAuctionController.Auction auction = vVar.m0;
        new yh.s0(context, e6Var, i10, auction.gift.title, auction.previewAttributes, false).show();
        vVar.dismiss();
    }

    public static void S(org.telegram.ui.ActionBar.k kVar, Context context, e6 e6Var, TL_stars.StarGift starGift) {
        kVar.setActionBarMenuOnItemClick(new u(context, starGift, e6Var));
        org.telegram.ui.ActionBar.v0 a2 = kVar.n().a(0, R.drawable.ic_ab_other);
        a2.setContentDescription(LocaleController.getString("AccDescrMoreOptions", R.string.AccDescrMoreOptions));
        a2.e(4, R.drawable.msg_info, LocaleController.getString(R.string.MoreInfo));
        a2.e(3, R.drawable.menu_feature_links, LocaleController.getString(R.string.CopyLink));
        a2.e(2, R.drawable.msg_share, LocaleController.getString(R.string.ShareLink));
    }

    public static void U(Context context, TL_stars.StarGift starGift, e6 e6Var) {
        Runnable runnable;
        if (context == null || starGift == null) {
            return;
        }
        org.telegram.ui.ActionBar.f3 j3 = vl.j(1, context, null, false);
        runnable = j3.dismissRunnable;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        ImageView imageView = new ImageView(context);
        imageView.setPadding(AndroidUtilities.dp(17.0f), AndroidUtilities.dp(17.0f), AndroidUtilities.dp(17.0f), AndroidUtilities.dp(17.0f));
        imageView.setImageResource(R.drawable.filled_gift_sell_24);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(i6.v0(i6.Oh, e6Var));
        imageView.setBackground(shapeDrawable);
        linearLayout.addView(imageView, x5.t(80, 80, 17, 0, 21, 0, 16));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setText(LocaleController.getString(R.string.GiftAuctionInfoHeader));
        textView.setTextSize(1, 20.0f);
        int i10 = i6.G6;
        textView.setTextColor(i6.v0(i10, e6Var));
        linearLayout.addView(textView, x5.t(-1, -2, 17, 20, 0, 20, 6));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.GiftAuctionInfoText));
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(i6.v0(i10, e6Var));
        linearLayout.addView(textView2, x5.t(-1, -2, 17, 20, 0, 20, 16));
        uw0 uw0Var = new uw0(context, e6Var);
        int i11 = starGift.gifts_per_round;
        uw0Var.a.l(LocaleController.formatPluralString("GiftAuctionInfo1Header", i11, Integer.valueOf(i11)), false);
        int i12 = starGift.gifts_per_round;
        uw0Var.b.setText(LocaleController.formatPluralString("GiftAuctionInfo1Text", i12, Integer.valueOf(i12)));
        uw0Var.d.setVisibility(8);
        int i13 = R.drawable.menu_top_bidders_24;
        ImageView imageView2 = uw0Var.c;
        imageView2.setImageResource(i13);
        imageView2.setColorFilter(i6.v0(i10, e6Var));
        linearLayout.addView(uw0Var, x5.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
        uw0 uw0Var2 = new uw0(context, e6Var);
        uw0Var2.a.l(LocaleController.getString(R.string.GiftAuctionInfo2Header), false);
        uw0Var2.b.setText(LocaleController.formatPluralString("GiftAuctionInfo2Text", starGift.gifts_per_round, new Object[0]));
        uw0Var2.d.setVisibility(8);
        int i14 = R.drawable.menu_carryover_24;
        ImageView imageView3 = uw0Var2.c;
        imageView3.setImageResource(i14);
        imageView3.setColorFilter(i6.v0(i10, e6Var));
        linearLayout.addView(uw0Var2, x5.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
        uw0 uw0Var3 = new uw0(context, e6Var);
        uw0Var3.a.l(LocaleController.getString(R.string.GiftAuctionInfo3Header), false);
        uw0Var3.b.setText(LocaleController.getString(R.string.GiftAuctionInfo3Text));
        uw0Var3.d.setVisibility(8);
        int i15 = R.drawable.menu_bid_refund_24;
        ImageView imageView4 = uw0Var3.c;
        imageView4.setImageResource(i15);
        imageView4.setColorFilter(i6.v0(i10, e6Var));
        linearLayout.addView(uw0Var3, x5.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
        ci.d dVar = new ci.d(context, e6Var, true);
        dVar.setOnClickListener(new bi.p(5, runnable));
        dVar.g(yh.z3.g2(LocaleController.getString(R.string.Understood)), false, true);
        linearLayout.addView(dVar, x5.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
        j3.customView = linearLayout;
        j3.show();
    }

    public final void T() {
        TL_stars.TL_starGiftAuctionStateFinished tL_starGiftAuctionStateFinished;
        GiftAuctionController.Auction auction = this.m0;
        if (auction == null || (tL_starGiftAuctionStateFinished = auction.auctionStateFinished) == null || auction.gift.title == null) {
            return;
        }
        this.h0.run(this.e0, LocaleController.formatString(R.string.Gift2AveragePriceHint, Long.valueOf(tL_starGiftAuctionStateFinished.average_price), this.m0.gift.title));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f9  */
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
        xc xcVar = this.d0;
        xc xcVar2 = this.c0;
        ci.d dVar = this.j0;
        int i13 = 1;
        if (auction2 != null && (tL_starGiftAuctionStateFinished = auction2.auctionStateFinished) != null) {
            xcVar2.setText(LocaleController.formatDateTime(tL_starGiftAuctionStateFinished.start_date, true));
            xcVar.setText(LocaleController.formatDateTime(this.m0.auctionStateFinished.end_date, true));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(x7.X0(false, hg.c.k(this.m0.auctionStateFinished.average_price, ',', new StringBuilder("⭐️ ")), 0.8f, null));
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) yc.b("?", new o(this, i13), this.resourcesProvider, null));
            this.e0.setText(spannableStringBuilder);
        } else if (auction2 != null && (tL_starGiftAuctionState = auction2.auctionStateActive) != null) {
            xcVar2.setText(LocaleController.formatDateTime(tL_starGiftAuctionState.start_date, true));
            xcVar.setText(LocaleController.formatDateTime(this.m0.auctionStateActive.end_date, true));
            int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
            if (this.m0.isUpcoming(currentTime)) {
                dVar.f(LocaleController.formatString(R.string.Gift2AuctionStartsIn, LocaleController.formatTTLString(this.m0.auctionStateActive.start_date - currentTime)), z10);
            } else {
                dVar.f(LocaleController.formatString(R.string.Gift2AuctionTimeLeft, LocaleController.formatTTLString(this.m0.auctionStateActive.end_date - currentTime)), z10);
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
            xc xcVar3 = this.f0;
            oz0 oz0Var = this.g0;
            if (i10 != i11) {
                oz0Var.setText(LocaleController.getString(R.string.Gift2AuctionTableCurrentQuantity));
                xcVar3.setText(LocaleController.formatNumber(i11, ','));
            } else {
                oz0Var.setText(LocaleController.getString(R.string.Gift2AuctionTableCurrentAvailability));
                xcVar3.setText(LocaleController.formatPluralString("Gift2Availability4Value", i10, LocaleController.formatNumber(i11, ',')));
            }
            i12 = this.m0.auctionUserState.acquired_count;
            c90 c90Var = this.l0;
            if (i12 <= 0) {
                c90Var.setVisibility(0);
                c90Var.setText(TextUtils.concat(AndroidUtilities.replaceArrows(LocaleController.formatPluralSpannable("Gift2AuctionsItemsBought2", i12, this.n0), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f))));
            } else {
                c90Var.setVisibility(8);
            }
            auction = this.m0;
            tableRow = this.i0;
            if ((auction != null || auction.auctionStateFinished == null) && !starGift.sold_out) {
                tableRow.setVisibility(8);
                dVar.g(LocaleController.getString(R.string.Gift2AuctionJoin), z10, true);
            }
            String string = LocaleController.getString(R.string.Gift2AuctionEnded);
            c90 c90Var2 = this.k0;
            c90Var2.setText(string);
            c90Var2.setTextColor(i6.v0(i6.q7, this.resourcesProvider));
            tableRow.setVisibility(0);
            dVar.g(LocaleController.getString(R.string.OK), z10, true);
            dVar.f(null, z10);
            return;
        }
        i10 = starGift.availability_remains;
        i11 = starGift.availability_total;
        xc xcVar32 = this.f0;
        oz0 oz0Var2 = this.g0;
        if (i10 != i11) {
        }
        i12 = this.m0.auctionUserState.acquired_count;
        c90 c90Var3 = this.l0;
        if (i12 <= 0) {
        }
        auction = this.m0;
        tableRow = this.i0;
        if (auction != null) {
        }
        tableRow.setVisibility(8);
        dVar.g(LocaleController.getString(R.string.Gift2AuctionJoin), z10, true);
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        GiftAuctionController.getInstance(this.currentAccount).unsubscribeFromGiftAuction(this.Y, this);
        super.dismiss();
    }

    @Override // org.telegram.messenger.GiftAuctionController.OnAuctionUpdateListener
    public final void onUpdate(GiftAuctionController.Auction auction) {
        this.m0 = auction;
        V(true);
    }

    @Override // org.telegram.ui.Components.za
    public final kl0 v(ll0 ll0Var) {
        w51 w51Var = new w51(this.d, getContext(), this.currentAccount, 0, true, new hi.a(this, 14), this.resourcesProvider);
        this.o0 = w51Var;
        w51Var.r = false;
        return w51Var;
    }

    @Override // org.telegram.ui.Components.za
    public final CharSequence y() {
        return "";
    }
}
