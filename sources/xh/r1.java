package xh;

import android.content.Context;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.av;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.d00;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.ea0;
import org.telegram.ui.Components.eb;
import org.telegram.ui.Components.em0;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.pm0;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.r01;
import org.telegram.ui.Components.y9;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.z6;
import org.telegram.ui.bb;
import org.telegram.ui.eg;
import org.telegram.ui.t21;
import w7.x5;
import w7.z5;
import yh.d7;
import yh.e5;
import yh.m5;
import yh.p7;
import yh.r6;
import yh.u5;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class r1 extends eb implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int v0 = 0;
    public final int X;
    public c71 Y;
    public List Z;
    public final Utilities.Callback a0;
    public TLRPC.DisallowedGiftsSettings b0;
    public final long c0;
    public final boolean d0;
    public final String e0;
    public final d7 f0;
    public final w0 g0;
    public final FrameLayout h0;
    public final LinearLayout i0;
    public final d00 j0;
    public final b1 k0;
    public final x0 l0;
    public final y0 m0;
    public final ArrayList n0;
    public final e5 o0;
    public int p0;
    public int q0;
    public int r0;
    public int s0;
    public boolean t0;
    public boolean u0;

    public r1(LaunchActivity launchActivity, int i10, long j3) {
        this(launchActivity, i10, j3, null, null);
    }

    public static void Q(final r1 r1Var, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, qg.f2 f2Var, final Utilities.Callback callback, TLRPC.TL_error tL_error) {
        b2Var.dismiss();
        if (tLObject instanceof TL_stars.checkCanSendGiftResultOk) {
            f2Var.run();
            return;
        }
        if (!(tLObject instanceof TL_stars.checkCanSendGiftResultFail)) {
            if (tL_error != null) {
                new ad(r1Var.container, r1Var.resourcesProvider).f0(tL_error, false);
                return;
            }
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(r1Var.getContext(), 0, r1Var.resourcesProvider);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.GiftLocked);
        alertDialog$Builder.a.T = MessageObject.formatTextWithEntities(((TL_stars.checkCanSendGiftResultFail) tLObject).reason, false);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        final org.telegram.ui.ActionBar.b2 o9 = alertDialog$Builder.o();
        final av avVar = o9.n;
        if (avVar != null) {
            avVar.setOnLinkPressListener(new da0() { // from class: xh.s0
                @Override // org.telegram.ui.Components.da0
                public final void a(ClickableSpan clickableSpan) {
                    r1 r1Var2 = r1.this;
                    r1Var2.getClass();
                    o9.dismiss();
                    Utilities.Callback callback2 = callback;
                    if (callback2 != null) {
                        callback2.run(Boolean.FALSE);
                    }
                    r1Var2.dismiss();
                    clickableSpan.onClick(avVar);
                }
            });
        }
    }

    public static void R(r1 r1Var, Context context, int i10, Utilities.Callback callback, long j3, int i11) {
        TL_stars.SavedStarGift savedStarGift;
        p61 G = r1Var.Y.G(i11 - 1);
        if (G != null && G.G(i1.class)) {
            Object obj = G.G;
            int i12 = 0;
            if (obj instanceof rg.k) {
                new c1(r1Var, context, i10, (rg.k) obj, r1Var.c0, new o0(r1Var, callback, 0)).show();
                return;
            }
            if (obj instanceof TL_stars.StarGift) {
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                e5 e5Var = r1Var.o0;
                if (e5Var != null && r1Var.s0 == r1Var.q0) {
                    ArrayList arrayList = e5Var.l;
                    int size = arrayList.size();
                    while (true) {
                        if (i12 >= size) {
                            savedStarGift = null;
                            break;
                        }
                        Object obj2 = arrayList.get(i12);
                        i12++;
                        TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj2;
                        if (savedStarGift2.gift.id == starGift.id) {
                            savedStarGift = savedStarGift2;
                            break;
                        }
                    }
                    if (savedStarGift == null) {
                        return;
                    }
                    d1 d1Var = new d1(r1Var, r1Var.getContext(), i10, UserConfig.getInstance(i10).getClientUserId(), r1Var.resourcesProvider);
                    d1Var.l2(savedStarGift, null);
                    d1Var.a2(j3, new ai.l(r1Var, d1Var, j3, callback, 9));
                    return;
                }
                if (G.q && starGift.availability_resale > 0) {
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    if (U == null) {
                        return;
                    }
                    org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
                    l2Var.a = true;
                    l2Var.e = true;
                    e1 e1Var = new e1(j3, starGift.title, starGift.id, r1Var.resourcesProvider, r1Var.container.getViewTreeObserver(), new p0());
                    e1Var.e = new z6(8, r1Var, callback);
                    U.showAsSheet(e1Var, l2Var);
                    return;
                }
                if (starGift.auction) {
                    GiftAuctionController.getInstance(i10).getOrRequestAuction(starGift.id, new org.telegram.ui.Components.b3(context, r1Var.resourcesProvider, i10, j3, new o0(r1Var, callback, 1)));
                    return;
                }
                if (!starGift.sold_out) {
                    if (starGift.limited_per_user && starGift.per_user_remains <= 0) {
                        new ad(r1Var.container, r1Var.resourcesProvider).R(starGift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2PerUserLimit", starGift.per_user_total))).j();
                        return;
                    }
                    qg.f2 f2Var = new qg.f2(r1Var, context, i10, starGift, callback, 1);
                    if (starGift.locked_until_date > ConnectionsManager.getInstance(i10).getCurrentTime()) {
                        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(r1Var.getContext(), 3, null);
                        b2Var.q(500L);
                        TL_stars.checkCanSendGift checkcansendgift = new TL_stars.checkCanSendGift();
                        checkcansendgift.gift_id = starGift.id;
                        ConnectionsManager.getInstance(i10).sendRequest(checkcansendgift, new ai.q3(r1Var, b2Var, f2Var, callback, 15));
                        return;
                    }
                    if (!starGift.require_premium || UserConfig.getInstance(i10).isPremium()) {
                        f2Var.run();
                        return;
                    }
                    org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                    if (U2 == null) {
                        return;
                    }
                    rg.l1 l1Var = new rg.l1(U2, i10, null, null, starGift, r1Var.resourcesProvider);
                    y9 y9Var = new y9(r1Var.getContext());
                    q5 q5Var = new q5(AndroidUtilities.dp(160.0f), 4, y9Var, false);
                    y9Var.setImageDrawable(q5Var);
                    y9Var.addOnAttachStateChangeListener(new v0(q5Var));
                    q5Var.i(starGift.getDocument(), false);
                    l1Var.B0 = y9Var;
                    l1Var.show();
                    q5Var.f();
                    return;
                }
                e6 e6Var = r1Var.resourcesProvider;
                if (context == null) {
                    return;
                }
                org.telegram.ui.ActionBar.f3 i13 = bi.i(1, context, e6Var, false);
                LinearLayout e7 = bi.e(context, 1);
                e7.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
                e7.setClipChildren(false);
                e7.setClipToPadding(false);
                y9 y9Var2 = new y9(context);
                p7.b1(y9Var2.getImageReceiver(), starGift, 160);
                e7.addView(y9Var2, x5.t(160, 160, 17, 0, -8, 0, 10));
                TextView textView = new TextView(context);
                org.telegram.ui.Cells.c1.n(i6.j5, e6Var, textView, 1, 20.0f);
                textView.setGravity(17);
                textView.setText(LocaleController.getString(R.string.Gift2SoldOutSheetTitle));
                TextView h = com.google.android.gms.internal.vision.e2.h(e7, textView, x5.t(-1, -2, 17, 20, 0, 20, 4), context);
                h.setTextSize(1, 14.0f);
                h.setTypeface(AndroidUtilities.bold());
                h.setGravity(17);
                h.setTextColor(i6.w0(i6.q7, e6Var));
                h.setText(LocaleController.getString(R.string.Gift2SoldOutSheetSubtitle));
                e7.addView(h, x5.t(-1, -2, 17, 20, 0, 20, 4));
                r01 r01Var = new r01(context, e6Var);
                if (starGift.first_sale_date != 0) {
                    r01Var.f(starGift.first_sale_date, LocaleController.getString(R.string.Gift2SoldOutSheetFirstSale));
                }
                if (starGift.last_sale_date != 0) {
                    r01Var.f(starGift.last_sale_date, LocaleController.getString(R.string.Gift2SoldOutSheetLastSale));
                }
                r01Var.c(LocaleController.getString(R.string.Gift2SoldOutSheetValue), p7.Y0(false, org.telegram.messenger.q.h(starGift.stars, ',', new StringBuilder("⭐️ ")), 0.8f, null), null, null);
                if (starGift.limited) {
                    p7.G0(r01Var, i10, starGift, e6Var);
                }
                e7.addView(r01Var, x5.k(0.0f, 17.0f, 0.0f, 12.0f, -1, -2));
                ci.d dVar = new ci.d(context, e6Var, true);
                dVar.g(LocaleController.getString(R.string.OK), false, true);
                e7.addView(dVar, x5.n(-1, 48));
                i13.customView = e7;
                org.telegram.ui.ActionBar.f3[] f3VarArr = {i13};
                f3VarArr[0].useBackgroundTopPadding = false;
                dVar.setOnClickListener(new u5(f3VarArr, 2));
                f3VarArr[0].fixNavigationBar();
                org.telegram.ui.ActionBar.n2 U3 = LaunchActivity.U();
                if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(U3)) {
                    f3VarArr[0].makeAttached(U3);
                }
                f3VarArr[0].show();
            }
        }
    }

    @Override // org.telegram.ui.Components.eb
    public final CharSequence B() {
        return this.d0 ? LocaleController.getString(R.string.Gift2TitleSelf1) : Emoji.replaceEmoji(LocaleController.formatString(R.string.Gift2User, this.e0), null, false);
    }

    public final void V(ArrayList arrayList, c71 c71Var) {
        long j3;
        boolean z10;
        boolean z11;
        TL_stars.StarGift starGift;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings3;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings4;
        int i10 = 3;
        int i11 = 2;
        w0 w0Var = this.g0;
        long j10 = this.c0;
        long j11 = 0;
        int i12 = 0;
        boolean z12 = this.d0;
        if (z12 || j10 < 0 || ((disallowedGiftsSettings4 = this.b0) != null && disallowedGiftsSettings4.disallow_premium_gifts)) {
            j3 = 0;
            z10 = false;
        } else {
            arrayList.add(p61.k(w0Var));
            arrayList.add(p61.k(this.h0));
            ArrayList arrayList2 = this.n0;
            if (arrayList2 == null || arrayList2.isEmpty()) {
                j3 = 0;
                p61 o9 = p61.o(1, 34);
                o9.u = 1;
                arrayList.add(o9);
                p61 o10 = p61.o(2, 34);
                o10.u = 1;
                arrayList.add(o10);
                p61 o11 = p61.o(3, 34);
                o11.u = 1;
                arrayList.add(o11);
            } else {
                int size = arrayList2.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj = arrayList2.get(i13);
                    i13++;
                    int i14 = i1.a;
                    p61 J = p61.J(i1.class);
                    J.u = 1;
                    J.G = (rg.k) obj;
                    arrayList.add(J);
                    j11 = j11;
                }
                j3 = j11;
            }
            z10 = true;
        }
        int i15 = this.X;
        m5 y3 = m5.y(i15, false);
        ArrayList arrayList3 = this.t0 ? y3.J : y3.I;
        if (this.b0 != null) {
            arrayList3 = (ArrayList) Collection.-EL.stream(arrayList3).filter(new ei.q1(this, i11)).collect(Collectors.toCollection(new eg()));
        }
        if (j10 < j3) {
            arrayList3 = (ArrayList) Collection.-EL.stream(arrayList3).filter(new bb(i10)).collect(Collectors.toCollection(new eg()));
        }
        long clientUserId = UserConfig.getInstance(i15).getClientUserId();
        e5 e5Var = this.o0;
        if (j10 != clientUserId && e5Var != null) {
            ArrayList arrayList4 = e5Var.l;
            int size2 = arrayList4.size();
            int i16 = 0;
            while (i16 < size2) {
                Object obj2 = arrayList4.get(i16);
                i16++;
                if (((TL_stars.SavedStarGift) obj2).gift instanceof TL_stars.TL_starGiftUnique) {
                    z11 = true;
                    break;
                }
            }
        }
        z11 = false;
        if (MessagesController.getInstance(i15).stargiftsBlocked || (arrayList3.isEmpty() && ((disallowedGiftsSettings3 = this.b0) == null || disallowedGiftsSettings3.disallow_unique_stargifts || e5Var == null || e5Var.l.isEmpty()))) {
            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings5 = this.b0;
            if (disallowedGiftsSettings5 == null || disallowedGiftsSettings5.disallow_unique_stargifts || !arrayList3.isEmpty()) {
                return;
            }
            arrayList.add(p61.C(AndroidUtilities.dp(300.0f)));
            return;
        }
        if (z10) {
            arrayList.add(p61.C(AndroidUtilities.dp(16.0f)));
        } else {
            arrayList.add(p61.k(w0Var));
        }
        arrayList.add(p61.k(this.i0));
        TreeSet treeSet = new TreeSet();
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings6 = this.b0;
        if (disallowedGiftsSettings6 == null || !disallowedGiftsSettings6.disallow_unique_stargifts) {
            for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                treeSet.add(Long.valueOf(((TL_stars.StarGift) arrayList3.get(i17)).stars));
            }
        }
        ArrayList arrayList5 = new ArrayList();
        this.q0 = -1;
        this.p0 = -1;
        if (!arrayList3.isEmpty()) {
            this.p0 = arrayList5.size();
            arrayList5.add(LocaleController.getString(R.string.Gift2TabAll));
        }
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings7 = this.b0;
        if ((disallowedGiftsSettings7 == null || !disallowedGiftsSettings7.disallow_unique_stargifts) && z11) {
            this.q0 = arrayList5.size();
            arrayList5.add(LocaleController.getString(R.string.Gift2TabMine));
        }
        this.r0 = arrayList5.size();
        arrayList5.add(LocaleController.getString(R.string.Gift2TabCollectibles));
        int i18 = this.s0;
        r0 r0Var = new r0(this, i12);
        int i19 = p1.a;
        p61 J2 = p61.J(p1.class);
        J2.d = 1;
        J2.G = arrayList5;
        J2.z = i18;
        J2.H = r0Var;
        arrayList.add(J2);
        boolean z13 = this.s0 == this.r0 && !z12 && j10 >= j3;
        if (z13 != this.u0) {
            this.u0 = z13;
            ViewPropertyAnimator duration = this.l0.animate().alpha(!z13 ? 1.0f : 0.0f).scaleX(!z13 ? 1.0f : 0.85f).scaleY(!z13 ? 1.0f : 0.85f).setDuration(380L);
            hs hsVar = hs.h;
            duration.setInterpolator(hsVar).start();
            this.m0.animate().alpha(z13 ? 1.0f : 0.0f).scaleX(z13 ? 1.0f : 0.85f).scaleY(z13 ? 1.0f : 0.85f).setDuration(380L).setInterpolator(hsVar).start();
        }
        if (e5Var != null && this.s0 == this.q0) {
            arrayList3 = new ArrayList();
            ArrayList arrayList6 = e5Var.l;
            int size3 = arrayList6.size();
            int i20 = 0;
            while (i20 < size3) {
                Object obj3 = arrayList6.get(i20);
                i20++;
                TL_stars.StarGift starGift2 = ((TL_stars.SavedStarGift) obj3).gift;
                if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                    arrayList3.add(starGift2);
                }
            }
        }
        int i21 = 0;
        for (int i22 = 0; i22 < arrayList3.size(); i22++) {
            TL_stars.StarGift starGift3 = (TL_stars.StarGift) arrayList3.get(i22);
            int i23 = this.s0;
            if (i23 == this.p0 || i23 == this.q0 || (i23 == this.r0 && (starGift3.availability_resale > j3 || starGift3.require_premium || starGift3.locked_until_date != 0))) {
                if (starGift3.sold_out || starGift3.availability_resale <= j3 || i23 == this.r0) {
                    starGift = starGift3;
                } else {
                    p61 a2 = i1.a(i23, starGift3, i23 == this.q0, starGift3.limited && (disallowedGiftsSettings2 = this.b0) != null && disallowedGiftsSettings2.disallow_limited_stargifts, false, false, false);
                    starGift = starGift3;
                    arrayList.add(a2);
                    i21++;
                }
                int i24 = this.s0;
                arrayList.add(i1.a(i24, starGift, i24 == this.q0, starGift.limited && (disallowedGiftsSettings = this.b0) != null && disallowedGiftsSettings.disallow_limited_stargifts, true, false, false));
                i21++;
            }
        }
        int i25 = this.s0;
        int i26 = this.q0;
        if (i25 == i26 && e5Var != null && !e5Var.j) {
            e5Var.a();
            p61 o12 = p61.o(4, 34);
            o12.u = 1;
            arrayList.add(o12);
            p61 o13 = p61.o(5, 34);
            o13.u = 1;
            arrayList.add(o13);
            p61 o14 = p61.o(6, 34);
            o14.u = 1;
            arrayList.add(o14);
        } else if (i25 != i26 && y3.C) {
            p61 o15 = p61.o(4, 34);
            o15.u = 1;
            arrayList.add(o15);
            p61 o16 = p61.o(5, 34);
            o16.u = 1;
            arrayList.add(o16);
            p61 o17 = p61.o(6, 34);
            o17.u = 1;
            arrayList.add(o17);
        }
        arrayList.add(p61.C(AndroidUtilities.dp(i21 < 9 ? 300.0f : 40.0f)));
    }

    public final void W(boolean z10) {
        this.t0 = z10;
        this.Y.N(false);
    }

    public final void X() {
        List list;
        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption;
        ArrayList arrayList = this.n0;
        arrayList.clear();
        if (arrayList.isEmpty() && (list = this.Z) != null && !list.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            long j3 = 0;
            for (int size = this.Z.size() - 1; size >= 0; size--) {
                TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption2 = (TLRPC.TL_premiumGiftCodeOption) this.Z.get(size);
                if (!"XTR".equalsIgnoreCase(tL_premiumGiftCodeOption2.currency)) {
                    Iterator it = this.Z.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            tL_premiumGiftCodeOption = null;
                            break;
                        }
                        tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) it.next();
                        if (tL_premiumGiftCodeOption != tL_premiumGiftCodeOption2 && "XTR".equalsIgnoreCase(tL_premiumGiftCodeOption.currency) && tL_premiumGiftCodeOption.months == tL_premiumGiftCodeOption2.months) {
                            break;
                        }
                    }
                    rg.k kVar = new rg.k(tL_premiumGiftCodeOption2, tL_premiumGiftCodeOption);
                    arrayList.add(kVar);
                    if (BuildVars.useInvoiceBilling()) {
                        if (kVar.f() > j3) {
                            j3 = kVar.f();
                        }
                    } else if (kVar.h() != null && BillingController.getInstance().isReady()) {
                        c5.a aVar = new c5.a();
                        aVar.c = "inapp";
                        aVar.b = kVar.h();
                        arrayList2.add(aVar.a());
                    }
                }
            }
            if (BuildVars.useInvoiceBilling()) {
                int size2 = arrayList.size();
                int i10 = 0;
                while (i10 < size2) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((rg.k) obj).g = j3;
                }
            } else if (!arrayList2.isEmpty()) {
                System.currentTimeMillis();
                BillingController.getInstance().queryProductDetails(arrayList2, new r5.d(this, 17));
            }
        }
        if (arrayList.isEmpty()) {
            tg.s.j(this.X, null, new r0(this, 1));
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        c71 c71Var;
        if (i10 == NotificationCenter.billingProductDetailsUpdated) {
            X();
            return;
        }
        if (i10 == NotificationCenter.starGiftsLoaded) {
            c71 c71Var2 = this.Y;
            if (c71Var2 != null) {
                c71Var2.N(true);
                return;
            }
            return;
        }
        if (i10 != NotificationCenter.userInfoDidLoad) {
            if (i10 != NotificationCenter.starGiftSoldOut) {
                if (i10 == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.o0 && (c71Var = this.Y) != null) {
                    c71Var.N(true);
                    return;
                }
                return;
            }
            if (isShown()) {
                TL_stars.StarGift starGift = (TL_stars.StarGift) objArr[0];
                new ad(this.container, this.resourcesProvider).s(starGift.sticker, LocaleController.getString(R.string.Gift2SoldOutTitle), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2SoldOutCount", starGift.availability_total))).j();
                c71 c71Var3 = this.Y;
                if (c71Var3 != null) {
                    c71Var3.N(true);
                    return;
                }
                return;
            }
            return;
        }
        if (isShown()) {
            long longValue = ((Long) objArr[0]).longValue();
            long j3 = this.c0;
            if (longValue == j3 && j3 > 0) {
                int i12 = this.X;
                TLRPC.UserFull userFull = MessagesController.getInstance(i12).getUserFull(j3);
                TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = (j3 == UserConfig.getInstance(i12).getClientUserId() || userFull == null) ? null : userFull.disallowed_stargifts;
                this.b0 = disallowedGiftsSettings;
                if (disallowedGiftsSettings != null && disallowedGiftsSettings.disallow_premium_gifts && disallowedGiftsSettings.disallow_unique_stargifts && disallowedGiftsSettings.disallow_limited_stargifts && disallowedGiftsSettings.disallow_unlimited_stargifts) {
                    dismiss();
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    if (U != null) {
                        ad.a0(U).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(j3)))).j();
                        return;
                    }
                    return;
                }
                c71 c71Var4 = this.Y;
                if (c71Var4 != null) {
                    c71Var4.N(true);
                }
            }
            ArrayList arrayList = this.n0;
            if (arrayList == null || arrayList.isEmpty()) {
                X();
                c71 c71Var5 = this.Y;
                if (c71Var5 != null) {
                    c71Var5.N(true);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        super.dismiss();
        int i10 = this.X;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.billingProductDetailsUpdated);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starGiftsLoaded);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.userInfoDidLoad);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starGiftSoldOut);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void show() {
        int i10 = this.X;
        if (MessagesController.getInstance(i10).isFrozen()) {
            org.telegram.ui.b.b(i10);
            return;
        }
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = this.b0;
        if (disallowedGiftsSettings == null || !disallowedGiftsSettings.disallow_premium_gifts || !disallowedGiftsSettings.disallow_unique_stargifts || !disallowedGiftsSettings.disallow_limited_stargifts || !disallowedGiftsSettings.disallow_unlimited_stargifts) {
            super.show();
            return;
        }
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        if (U != null) {
            ad.a0(U).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(this.c0)))).j();
        }
    }

    @Override // org.telegram.ui.Components.eb
    public final pm0 x(qm0 qm0Var) {
        c71 c71Var = new c71(this.d, getContext(), this.X, 0, true, new hi.a(this, 16), this.resourcesProvider);
        this.Y = c71Var;
        c71Var.r = false;
        return c71Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x047a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public r1(final Context context, final int i10, final long j3, List list, final Utilities.Callback callback) {
        super(context, null, false, false, null);
        int i11;
        this.n0 = new ArrayList();
        this.p0 = -1;
        this.q0 = -1;
        this.r0 = -1;
        new ArrayList();
        this.X = i10;
        this.c0 = j3;
        boolean z10 = UserConfig.getInstance(i10).getClientUserId() == j3;
        this.d0 = z10;
        this.Z = list;
        this.a0 = callback;
        int i12 = i6.b6;
        setBackgroundColor(i6.x0(null, i12, false));
        fixNavigationBar(i6.x0(null, i12, false));
        this.o0 = m5.y(i10, false).G(UserConfig.getInstance(i10).getClientUserId(), true);
        m5.y(i10, false).V();
        y9 y9Var = new y9(context);
        y9Var.setImportantForAccessibility(2);
        j9 j9Var = new j9((e6) null);
        if (j3 > 0) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j3));
            this.e0 = UserObject.getForcedFirstName(user);
            j9Var.r(user);
            y9Var.e(user, j9Var);
            TLRPC.UserFull userFull = MessagesController.getInstance(i10).getUserFull(j3);
            this.b0 = (j3 == UserConfig.getInstance(i10).getClientUserId() || userFull == null) ? null : userFull.disallowed_stargifts;
            if (userFull == null) {
                MessagesController.getInstance(i10).loadFullUser(user, 0, true);
            }
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3));
            this.e0 = chat == null ? "" : chat.title;
            j9Var.q(chat);
            y9Var.e(chat, j9Var);
        }
        this.v = 0.1f;
        d7 d7Var = new d7(context, i10, this.resourcesProvider);
        this.f0 = d7Var;
        z5.a(d7Var);
        d7Var.setOnClickListener(new org.telegram.ui.Components.voip.o(this, 17));
        FrameLayout frameLayout = new FrameLayout(context);
        this.h0 = frameLayout;
        w0 w0Var = new w0(context);
        this.g0 = w0Var;
        w0Var.setClipChildren(false);
        w0Var.setClipToPadding(false);
        w0Var.addView(new r6(context, 70, 0), x5.d(-1.0f, -1));
        y9Var.setRoundRadius(AndroidUtilities.dp(42.0f));
        w0Var.addView(y9Var, x5.a(84.0f, 0.0f, 15.0f, 0.0f, 17.0f, 84, 17));
        z5.a(y9Var);
        y9Var.setOnClickListener(new ai.b3(this, j3, 5));
        w0Var.addView(d7Var, x5.a(-2.0f, 0.0f, -3.0f, -10.0f, 0.0f, -2, 53));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        frameLayout.addView(linearLayout, x5.e(-1, -2, 55));
        TextView f7 = org.telegram.messenger.q.f(context, 1, 20.0f);
        f7.setTypeface(AndroidUtilities.bold());
        int i13 = i6.j5;
        f7.setTextColor(i6.w0(i13, this.resourcesProvider));
        f7.setGravity(17);
        linearLayout.addView(f7, x5.t(-1, -2, 1, 4, 0, 4, 0));
        f7.setMaxWidth(ci.d4.a(f7.getText(), f7.getPaint()));
        ea0 ea0Var = new ea0(context, this.resourcesProvider);
        int i14 = i6.gc;
        ea0Var.setLinkTextColor(i6.w0(i14, this.resourcesProvider));
        ea0Var.setTextSize(1, 14.0f);
        ea0Var.setTextColor(i6.w0(i13, this.resourcesProvider));
        ea0Var.setGravity(17);
        ea0Var.setLineSpacing(AndroidUtilities.dp(2.33f), 1.0f);
        linearLayout.addView(ea0Var, x5.t(-1, -2, 1, 4, 4, 4, 12));
        f7.setText(LocaleController.getString(R.string.Gift2Premium));
        ea0Var.setText(TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2PremiumInfo, this.e0)), " ", AndroidUtilities.replaceArrows(AndroidUtilities.makeClickable(LocaleController.getString(R.string.Gift2PremiumInfoLink), new t21(19)), true)));
        ea0Var.setMaxWidth(ci.d4.a(ea0Var.getText(), ea0Var.getPaint()));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.i0 = linearLayout2;
        linearLayout2.setOrientation(1);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextColor(i6.w0(i13, this.resourcesProvider));
        textView.setGravity(17);
        linearLayout2.addView(textView, x5.t(-1, -2, 1, 4, 0, 4, 0));
        x0 x0Var = new x0(context, this.resourcesProvider);
        this.l0 = x0Var;
        x0Var.setLinkTextColor(i6.w0(i14, this.resourcesProvider));
        x0Var.setTextSize(1, 14.0f);
        x0Var.setTextColor(i6.w0(i13, this.resourcesProvider));
        x0Var.setGravity(17);
        y0 y0Var = new y0(context, this.resourcesProvider);
        this.m0 = y0Var;
        y0Var.setLinkTextColor(i6.w0(i14, this.resourcesProvider));
        y0Var.setTextSize(1, 14.0f);
        y0Var.setTextColor(i6.w0(i13, this.resourcesProvider));
        y0Var.setGravity(17);
        y0Var.setAlpha(0.0f);
        y0Var.setScaleX(0.85f);
        y0Var.setScaleY(0.85f);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.addView(x0Var, x5.a(-2.0f, 26.0f, 0.0f, 26.0f, 0.0f, -1, 49));
        frameLayout2.addView(y0Var, x5.a(-2.0f, 26.0f, 0.0f, 26.0f, 0.0f, -1, 49));
        textView.setText(LocaleController.getString(j3 < 0 ? R.string.Gift2StarsChannel : z10 ? R.string.Gift2StarsSelf : R.string.Gift2Stars));
        int i15 = 9;
        if (z10) {
            linearLayout2.addView(frameLayout2, x5.t(-2, -2, 1, 0, 9, 0, 4));
            ea0 ea0Var2 = new ea0(context, this.resourcesProvider);
            ea0Var2.setLinkTextColor(i6.w0(i14, this.resourcesProvider));
            ea0Var2.setTextSize(1, 14.0f);
            ea0Var2.setTextColor(i6.w0(i13, this.resourcesProvider));
            ea0Var2.setGravity(17);
            linearLayout2.addView(ea0Var2, x5.t(-2, -2, 1, 26, 4, 26, 6));
            x0Var.setText(LocaleController.getString(R.string.Gift2StarsSelfInfo1));
            ea0Var2.setText(LocaleController.getString(R.string.Gift2StarsSelfInfo2));
        } else {
            if (j3 >= 0) {
                linearLayout2.addView(frameLayout2, x5.t(-1, -2, 1, 0, 9, 0, 6));
                e5 G = m5.y(i10, false).G(j3, true);
                org.telegram.messenger.voip.f fVar = new org.telegram.messenger.voip.f(this, G, j3, callback, context, 8);
                fVar.run();
                x0Var.addOnAttachStateChangeListener(new z0(fVar));
                i11 = 3;
                if (G.l.size() < 3) {
                    G.a();
                }
                NotificationCenter.getInstance(i10).listen(x0Var, NotificationCenter.starUserGiftsLoaded, new z6(i15, G, fVar));
                d00 d00Var = new d00(i11, false);
                this.j0 = d00Var;
                d00Var.O = new a1(this);
                this.d.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
                this.d.setClipToPadding(false);
                this.d.setClipChildren(false);
                this.d.setLayoutManager(d00Var);
                this.d.setSelectorType(9);
                this.d.setSelectorDrawableColor(0);
                b1 b1Var = new b1();
                this.k0 = b1Var;
                b1Var.C = false;
                b1Var.m = false;
                b1Var.n(350L);
                b1Var.o(hs.h);
                b1Var.D = 40L;
                this.d.setItemAnimator(b1Var);
                this.d.setOnItemClickListener(new em0() { // from class: xh.t0
                    @Override // org.telegram.ui.Components.em0
                    public final void d(int i16, View view) {
                        r1.R(r1.this, context, i10, callback, j3, i16);
                    }
                });
                X();
                this.Y.N(false);
                O();
                if (BirthdayController.getInstance(i10).isToday(j3)) {
                    W(true);
                }
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.billingProductDetailsUpdated);
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starGiftsLoaded);
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.userInfoDidLoad);
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starGiftSoldOut);
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starUserGiftsLoaded);
                this.e.setTitle(B());
                NotificationCenter.listenEmojiLoading(this.e.getTitleTextView());
            }
            linearLayout2.addView(frameLayout2, x5.t(-2, -2, 1, 0, 9, 0, 4));
            NotificationCenter.listenEmojiLoading(x0Var);
            x0Var.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2StarsChannelInfo, this.e0)), x0Var.getPaint().getFontMetricsInt(), false));
        }
        i11 = 3;
        d00 d00Var2 = new d00(i11, false);
        this.j0 = d00Var2;
        d00Var2.O = new a1(this);
        this.d.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        this.d.setClipToPadding(false);
        this.d.setClipChildren(false);
        this.d.setLayoutManager(d00Var2);
        this.d.setSelectorType(9);
        this.d.setSelectorDrawableColor(0);
        b1 b1Var2 = new b1();
        this.k0 = b1Var2;
        b1Var2.C = false;
        b1Var2.m = false;
        b1Var2.n(350L);
        b1Var2.o(hs.h);
        b1Var2.D = 40L;
        this.d.setItemAnimator(b1Var2);
        this.d.setOnItemClickListener(new em0() { // from class: xh.t0
            @Override // org.telegram.ui.Components.em0
            public final void d(int i16, View view) {
                r1.R(r1.this, context, i10, callback, j3, i16);
            }
        });
        X();
        this.Y.N(false);
        O();
        if (BirthdayController.getInstance(i10).isToday(j3)) {
        }
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.billingProductDetailsUpdated);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starGiftsLoaded);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.userInfoDidLoad);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starGiftSoldOut);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        this.e.setTitle(B());
        NotificationCenter.listenEmojiLoading(this.e.getTitleTextView());
    }
}
