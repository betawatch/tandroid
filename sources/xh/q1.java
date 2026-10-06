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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.l01;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.nu;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.p90;
import org.telegram.ui.Components.q90;
import org.telegram.ui.Components.qz;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.dg;
import org.telegram.ui.ft;
import org.telegram.ui.n21;
import w7.b6;
import w7.z5;
import yh.c7;
import yh.l5;
import yh.m7;
import yh.u5;
import yh.z7;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes.dex */
public final class q1 extends cb implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int v0 = 0;
    public final int X;
    public w61 Y;
    public List Z;
    public final Utilities.Callback a0;
    public TLRPC.DisallowedGiftsSettings b0;
    public final long c0;
    public final boolean d0;
    public final String e0;
    public final m7 f0;
    public final v0 g0;
    public final FrameLayout h0;
    public final LinearLayout i0;
    public final qz j0;
    public final a1 k0;
    public final w0 l0;
    public final x0 m0;
    public final ArrayList n0;
    public final l5 o0;
    public int p0;
    public int q0;
    public int r0;
    public int s0;
    public boolean t0;
    public boolean u0;

    public q1(LaunchActivity launchActivity, int i10, long j3) {
        this(launchActivity, i10, j3, null, null);
    }

    public static void N(final q1 q1Var, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, o0 o0Var, final Utilities.Callback callback, TLRPC.TL_error tL_error) {
        b2Var.dismiss();
        if (tLObject instanceof TL_stars.checkCanSendGiftResultOk) {
            o0Var.run();
            return;
        }
        if (!(tLObject instanceof TL_stars.checkCanSendGiftResultFail)) {
            if (tL_error != null) {
                new yc(q1Var.container, q1Var.resourcesProvider).d0(tL_error, false);
                return;
            }
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(q1Var.getContext(), 0, q1Var.resourcesProvider);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.GiftLocked);
        alertDialog$Builder.a.T = MessageObject.formatTextWithEntities(((TL_stars.checkCanSendGiftResultFail) tLObject).reason, false);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        final org.telegram.ui.ActionBar.b2 o9 = alertDialog$Builder.o();
        final nu nuVar = o9.n;
        if (nuVar != null) {
            nuVar.setOnLinkPressListener(new p90() { // from class: xh.r0
                @Override // org.telegram.ui.Components.p90
                public final void a(ClickableSpan clickableSpan) {
                    q1 q1Var2 = q1.this;
                    q1Var2.getClass();
                    o9.dismiss();
                    Utilities.Callback callback2 = callback;
                    if (callback2 != null) {
                        callback2.run(Boolean.FALSE);
                    }
                    q1Var2.dismiss();
                    clickableSpan.onClick(nuVar);
                }
            });
        }
    }

    public static void O(q1 q1Var, Context context, int i10, Utilities.Callback callback, long j3, int i11) {
        TL_stars.SavedStarGift savedStarGift;
        h61 G = q1Var.Y.G(i11 - 1);
        if (G != null && G.H(h1.class)) {
            Object obj = G.G;
            int i12 = 0;
            if (obj instanceof rg.k) {
                new b1(q1Var, context, i10, (rg.k) obj, q1Var.c0, new m0(q1Var, callback, 0)).show();
                return;
            }
            if (obj instanceof TL_stars.StarGift) {
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                l5 l5Var = q1Var.o0;
                if (l5Var != null && q1Var.s0 == q1Var.q0) {
                    ArrayList arrayList = l5Var.l;
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
                    c1 c1Var = new c1(q1Var, q1Var.getContext(), i10, UserConfig.getInstance(i10).getClientUserId(), q1Var.resourcesProvider);
                    c1Var.j2(savedStarGift, null);
                    c1Var.Z1(j3, new ai.l(q1Var, c1Var, j3, callback, 9));
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
                    d1 d1Var = new d1(j3, starGift.title, starGift.id, q1Var.resourcesProvider, q1Var.container.getViewTreeObserver(), new n0());
                    d1Var.e = new ft(22, q1Var, callback);
                    U.showAsSheet(d1Var, l2Var);
                    return;
                }
                if (starGift.auction) {
                    GiftAuctionController.getInstance(i10).getOrRequestAuction(starGift.id, new org.telegram.ui.Components.z2(context, q1Var.resourcesProvider, i10, j3, new m0(q1Var, callback, 1)));
                    return;
                }
                if (!starGift.sold_out) {
                    if (starGift.limited_per_user && starGift.per_user_remains <= 0) {
                        new yc(q1Var.container, q1Var.resourcesProvider).R(starGift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2PerUserLimit", starGift.per_user_total))).j();
                        return;
                    }
                    o0 o0Var = new o0(q1Var, context, i10, starGift, callback, 0);
                    if (starGift.locked_until_date > ConnectionsManager.getInstance(i10).getCurrentTime()) {
                        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(q1Var.getContext(), 3, null);
                        b2Var.q(500L);
                        TL_stars.checkCanSendGift checkcansendgift = new TL_stars.checkCanSendGift();
                        checkcansendgift.gift_id = starGift.id;
                        ConnectionsManager.getInstance(i10).sendRequest(checkcansendgift, new ai.p3(q1Var, b2Var, o0Var, callback, 15));
                        return;
                    }
                    if (!starGift.require_premium || UserConfig.getInstance(i10).isPremium()) {
                        o0Var.run();
                        return;
                    }
                    org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                    if (U2 == null) {
                        return;
                    }
                    rg.m1 m1Var = new rg.m1(U2, i10, null, null, starGift, q1Var.resourcesProvider);
                    w9 w9Var = new w9(q1Var.getContext());
                    o5 o5Var = new o5(AndroidUtilities.dp(160.0f), 4, w9Var, false);
                    w9Var.setImageDrawable(o5Var);
                    w9Var.addOnAttachStateChangeListener(new u0(o5Var));
                    o5Var.i(starGift.getDocument(), false);
                    m1Var.B0 = w9Var;
                    m1Var.show();
                    o5Var.f();
                    return;
                }
                d6 d6Var = q1Var.resourcesProvider;
                if (context == null) {
                    return;
                }
                org.telegram.ui.ActionBar.f3 i13 = bi.i(1, context, d6Var, false);
                LinearLayout e7 = bi.e(context, 1);
                e7.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
                e7.setClipChildren(false);
                e7.setClipToPadding(false);
                w9 w9Var2 = new w9(context);
                z7.g1(w9Var2.getImageReceiver(), starGift, 160);
                e7.addView(w9Var2, z5.t(160, 160, 17, 0, -8, 0, 10));
                TextView textView = new TextView(context);
                org.telegram.ui.Cells.c1.p(i6.j5, d6Var, textView, 1, 20.0f);
                textView.setGravity(17);
                textView.setText(LocaleController.getString(R.string.Gift2SoldOutSheetTitle));
                TextView h = com.google.android.gms.internal.vision.e2.h(e7, textView, z5.t(-1, -2, 17, 20, 0, 20, 4), context);
                h.setTextSize(1, 14.0f);
                h.setTypeface(AndroidUtilities.bold());
                h.setGravity(17);
                h.setTextColor(i6.v0(i6.q7, d6Var));
                h.setText(LocaleController.getString(R.string.Gift2SoldOutSheetSubtitle));
                e7.addView(h, z5.t(-1, -2, 17, 20, 0, 20, 4));
                l01 l01Var = new l01(context, d6Var);
                if (starGift.first_sale_date != 0) {
                    l01Var.f(starGift.first_sale_date, LocaleController.getString(R.string.Gift2SoldOutSheetFirstSale));
                }
                if (starGift.last_sale_date != 0) {
                    l01Var.f(starGift.last_sale_date, LocaleController.getString(R.string.Gift2SoldOutSheetLastSale));
                }
                l01Var.c(LocaleController.getString(R.string.Gift2SoldOutSheetValue), z7.d1(false, org.telegram.messenger.q.h(starGift.stars, ',', new StringBuilder("⭐️ ")), 0.8f, null), null, null);
                if (starGift.limited) {
                    z7.K0(l01Var, i10, starGift, d6Var);
                }
                e7.addView(l01Var, z5.k(0.0f, 17.0f, 0.0f, 12.0f, -1, -2));
                ci.d dVar = new ci.d(context, d6Var, true);
                dVar.g(LocaleController.getString(R.string.OK), false, true);
                e7.addView(dVar, z5.n(-1, 48));
                i13.customView = e7;
                org.telegram.ui.ActionBar.f3[] f3VarArr = {i13};
                f3VarArr[0].useBackgroundTopPadding = false;
                dVar.setOnClickListener(new yh.d6(f3VarArr, 2));
                f3VarArr[0].fixNavigationBar();
                org.telegram.ui.ActionBar.n2 U3 = LaunchActivity.U();
                if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(U3)) {
                    f3VarArr[0].makeAttached(U3);
                }
                f3VarArr[0].show();
            }
        }
    }

    public final void S(ArrayList arrayList, w61 w61Var) {
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
        v0 v0Var = this.g0;
        long j10 = this.c0;
        long j11 = 0;
        int i12 = 0;
        boolean z12 = this.d0;
        if (z12 || j10 < 0 || ((disallowedGiftsSettings4 = this.b0) != null && disallowedGiftsSettings4.disallow_premium_gifts)) {
            j3 = 0;
            z10 = false;
        } else {
            arrayList.add(h61.k(v0Var));
            arrayList.add(h61.k(this.h0));
            ArrayList arrayList2 = this.n0;
            if (arrayList2 == null || arrayList2.isEmpty()) {
                j3 = 0;
                h61 q6 = h61.q(1, 34);
                q6.u = 1;
                arrayList.add(q6);
                h61 q10 = h61.q(2, 34);
                q10.u = 1;
                arrayList.add(q10);
                h61 q11 = h61.q(3, 34);
                q11.u = 1;
                arrayList.add(q11);
            } else {
                int size = arrayList2.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj = arrayList2.get(i13);
                    i13++;
                    int i14 = h1.a;
                    h61 K = h61.K(h1.class);
                    K.u = 1;
                    K.G = (rg.k) obj;
                    arrayList.add(K);
                    j11 = j11;
                }
                j3 = j11;
            }
            z10 = true;
        }
        int i15 = this.X;
        u5 y3 = u5.y(i15, false);
        ArrayList arrayList3 = this.t0 ? y3.J : y3.I;
        if (this.b0 != null) {
            arrayList3 = (ArrayList) Collection.-EL.stream(arrayList3).filter(new ei.r1(this, i11)).collect(Collectors.toCollection(new dg()));
        }
        if (j10 < j3) {
            arrayList3 = (ArrayList) Collection.-EL.stream(arrayList3).filter(new org.telegram.ui.cb(i10)).collect(Collectors.toCollection(new dg()));
        }
        long clientUserId = UserConfig.getInstance(i15).getClientUserId();
        l5 l5Var = this.o0;
        if (j10 != clientUserId && l5Var != null) {
            ArrayList arrayList4 = l5Var.l;
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
        if (MessagesController.getInstance(i15).stargiftsBlocked || (arrayList3.isEmpty() && ((disallowedGiftsSettings3 = this.b0) == null || disallowedGiftsSettings3.disallow_unique_stargifts || l5Var == null || l5Var.l.isEmpty()))) {
            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings5 = this.b0;
            if (disallowedGiftsSettings5 == null || disallowedGiftsSettings5.disallow_unique_stargifts || !arrayList3.isEmpty()) {
                return;
            }
            arrayList.add(h61.D(AndroidUtilities.dp(300.0f)));
            return;
        }
        if (z10) {
            arrayList.add(h61.D(AndroidUtilities.dp(16.0f)));
        } else {
            arrayList.add(h61.k(v0Var));
        }
        arrayList.add(h61.k(this.i0));
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
        q0 q0Var = new q0(this, i12);
        int i19 = o1.a;
        h61 K2 = h61.K(o1.class);
        K2.d = 1;
        K2.G = arrayList5;
        K2.z = i18;
        K2.H = q0Var;
        arrayList.add(K2);
        boolean z13 = this.s0 == this.r0 && !z12 && j10 >= j3;
        if (z13 != this.u0) {
            this.u0 = z13;
            ViewPropertyAnimator duration = this.l0.animate().alpha(!z13 ? 1.0f : 0.0f).scaleX(!z13 ? 1.0f : 0.85f).scaleY(!z13 ? 1.0f : 0.85f).setDuration(380L);
            tr trVar = tr.h;
            duration.setInterpolator(trVar).start();
            this.m0.animate().alpha(z13 ? 1.0f : 0.0f).scaleX(z13 ? 1.0f : 0.85f).scaleY(z13 ? 1.0f : 0.85f).setDuration(380L).setInterpolator(trVar).start();
        }
        if (l5Var != null && this.s0 == this.q0) {
            arrayList3 = new ArrayList();
            ArrayList arrayList6 = l5Var.l;
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
                    h61 a2 = h1.a(i23, starGift3, i23 == this.q0, starGift3.limited && (disallowedGiftsSettings2 = this.b0) != null && disallowedGiftsSettings2.disallow_limited_stargifts, false, false, false);
                    starGift = starGift3;
                    arrayList.add(a2);
                    i21++;
                }
                int i24 = this.s0;
                arrayList.add(h1.a(i24, starGift, i24 == this.q0, starGift.limited && (disallowedGiftsSettings = this.b0) != null && disallowedGiftsSettings.disallow_limited_stargifts, true, false, false));
                i21++;
            }
        }
        int i25 = this.s0;
        int i26 = this.q0;
        if (i25 == i26 && l5Var != null && !l5Var.j) {
            l5Var.a();
            h61 q12 = h61.q(4, 34);
            q12.u = 1;
            arrayList.add(q12);
            h61 q13 = h61.q(5, 34);
            q13.u = 1;
            arrayList.add(q13);
            h61 q14 = h61.q(6, 34);
            q14.u = 1;
            arrayList.add(q14);
        } else if (i25 != i26 && y3.C) {
            h61 q15 = h61.q(4, 34);
            q15.u = 1;
            arrayList.add(q15);
            h61 q16 = h61.q(5, 34);
            q16.u = 1;
            arrayList.add(q16);
            h61 q17 = h61.q(6, 34);
            q17.u = 1;
            arrayList.add(q17);
        }
        arrayList.add(h61.D(AndroidUtilities.dp(i21 < 9 ? 300.0f : 40.0f)));
    }

    public final void T(boolean z10) {
        this.t0 = z10;
        this.Y.N(false);
    }

    public final void U() {
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
                        aVar.b = "inapp";
                        aVar.a = kVar.h();
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
                BillingController.getInstance().queryProductDetails(arrayList2, new r2.s(this, 19));
            }
        }
        if (arrayList.isEmpty()) {
            tg.s.j(this.X, null, new q0(this, 1));
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        w61 w61Var;
        if (i10 == NotificationCenter.billingProductDetailsUpdated) {
            U();
            return;
        }
        if (i10 == NotificationCenter.starGiftsLoaded) {
            w61 w61Var2 = this.Y;
            if (w61Var2 != null) {
                w61Var2.N(true);
                return;
            }
            return;
        }
        if (i10 != NotificationCenter.userInfoDidLoad) {
            if (i10 != NotificationCenter.starGiftSoldOut) {
                if (i10 == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.o0 && (w61Var = this.Y) != null) {
                    w61Var.N(true);
                    return;
                }
                return;
            }
            if (isShown()) {
                TL_stars.StarGift starGift = (TL_stars.StarGift) objArr[0];
                new yc(this.container, this.resourcesProvider).s(starGift.sticker, LocaleController.getString(R.string.Gift2SoldOutTitle), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2SoldOutCount", starGift.availability_total))).j();
                w61 w61Var3 = this.Y;
                if (w61Var3 != null) {
                    w61Var3.N(true);
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
                        yc.a0(U).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(j3)))).j();
                        return;
                    }
                    return;
                }
                w61 w61Var4 = this.Y;
                if (w61Var4 != null) {
                    w61Var4.N(true);
                }
            }
            ArrayList arrayList = this.n0;
            if (arrayList == null || arrayList.isEmpty()) {
                U();
                w61 w61Var5 = this.Y;
                if (w61Var5 != null) {
                    w61Var5.N(true);
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
            yc.a0(U).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(this.c0)))).j();
        }
    }

    @Override // org.telegram.ui.Components.cb
    public final yl0 v(zl0 zl0Var) {
        w61 w61Var = new w61(this.d, getContext(), this.X, 0, true, new hi.a(this, 16), this.resourcesProvider);
        this.Y = w61Var;
        w61Var.r = false;
        return w61Var;
    }

    @Override // org.telegram.ui.Components.cb
    public final CharSequence y() {
        return this.d0 ? LocaleController.getString(R.string.Gift2TitleSelf1) : Emoji.replaceEmoji(LocaleController.formatString(R.string.Gift2User, this.e0), null, false);
    }

    public q1(final Context context, final int i10, final long j3, List list, final Utilities.Callback callback) {
        super(context, null, false, false, null);
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
        int i11 = i6.b6;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = null;
        setBackgroundColor(i6.w0(null, i11, false));
        fixNavigationBar(i6.w0(null, i11, false));
        this.o0 = u5.y(i10, false).G(UserConfig.getInstance(i10).getClientUserId(), true);
        u5.y(i10, false).V();
        w9 w9Var = new w9(context);
        w9Var.setImportantForAccessibility(2);
        h9 h9Var = new h9((d6) null);
        if (j3 > 0) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j3));
            this.e0 = UserObject.getForcedFirstName(user);
            h9Var.r(user);
            w9Var.e(user, h9Var);
            TLRPC.UserFull userFull = MessagesController.getInstance(i10).getUserFull(j3);
            if (j3 != UserConfig.getInstance(i10).getClientUserId() && userFull != null) {
                disallowedGiftsSettings = userFull.disallowed_stargifts;
            }
            this.b0 = disallowedGiftsSettings;
            if (userFull == null) {
                MessagesController.getInstance(i10).loadFullUser(user, 0, true);
            }
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3));
            this.e0 = chat == null ? "" : chat.title;
            h9Var.q(chat);
            w9Var.e(chat, h9Var);
        }
        this.v = 0.1f;
        m7 m7Var = new m7(context, i10, this.resourcesProvider);
        this.f0 = m7Var;
        b6.a(m7Var);
        m7Var.setOnClickListener(new org.telegram.ui.Components.voip.o(this, 17));
        FrameLayout frameLayout = new FrameLayout(context);
        this.h0 = frameLayout;
        v0 v0Var = new v0(context);
        this.g0 = v0Var;
        v0Var.setClipChildren(false);
        v0Var.setClipToPadding(false);
        v0Var.addView(new c7(context, 70, 0), z5.c(-1.0f, -1));
        w9Var.setRoundRadius(AndroidUtilities.dp(42.0f));
        v0Var.addView(w9Var, z5.d(84, 84.0f, 17, 0.0f, 15.0f, 0.0f, 17.0f));
        b6.a(w9Var);
        w9Var.setOnClickListener(new ai.a3(this, j3, 5));
        v0Var.addView(m7Var, z5.d(-2, -2.0f, 53, 0.0f, -3.0f, -10.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        frameLayout.addView(linearLayout, z5.e(-1, -2, 55));
        TextView f7 = org.telegram.messenger.q.f(context, 1, 20.0f);
        f7.setTypeface(AndroidUtilities.bold());
        int i12 = i6.j5;
        f7.setTextColor(i6.v0(i12, this.resourcesProvider));
        f7.setGravity(17);
        linearLayout.addView(f7, z5.t(-1, -2, 1, 4, 0, 4, 0));
        f7.setMaxWidth(ci.e4.a(f7.getText(), f7.getPaint()));
        q90 q90Var = new q90(context, this.resourcesProvider);
        int i13 = i6.gc;
        q90Var.setLinkTextColor(i6.v0(i13, this.resourcesProvider));
        q90Var.setTextSize(1, 14.0f);
        q90Var.setTextColor(i6.v0(i12, this.resourcesProvider));
        q90Var.setGravity(17);
        q90Var.setLineSpacing(AndroidUtilities.dp(2.33f), 1.0f);
        linearLayout.addView(q90Var, z5.t(-1, -2, 1, 4, 4, 4, 12));
        f7.setText(LocaleController.getString(R.string.Gift2Premium));
        q90Var.setText(TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2PremiumInfo, this.e0)), " ", AndroidUtilities.replaceArrows(AndroidUtilities.makeClickable(LocaleController.getString(R.string.Gift2PremiumInfoLink), new n21(17)), true)));
        q90Var.setMaxWidth(ci.e4.a(q90Var.getText(), q90Var.getPaint()));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.i0 = linearLayout2;
        linearLayout2.setOrientation(1);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextColor(i6.v0(i12, this.resourcesProvider));
        textView.setGravity(17);
        linearLayout2.addView(textView, z5.t(-1, -2, 1, 4, 0, 4, 0));
        w0 w0Var = new w0(context, this.resourcesProvider);
        this.l0 = w0Var;
        w0Var.setLinkTextColor(i6.v0(i13, this.resourcesProvider));
        w0Var.setTextSize(1, 14.0f);
        w0Var.setTextColor(i6.v0(i12, this.resourcesProvider));
        w0Var.setGravity(17);
        x0 x0Var = new x0(context, this.resourcesProvider);
        this.m0 = x0Var;
        x0Var.setLinkTextColor(i6.v0(i13, this.resourcesProvider));
        x0Var.setTextSize(1, 14.0f);
        x0Var.setTextColor(i6.v0(i12, this.resourcesProvider));
        x0Var.setGravity(17);
        x0Var.setAlpha(0.0f);
        x0Var.setScaleX(0.85f);
        x0Var.setScaleY(0.85f);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.addView(w0Var, z5.d(-1, -2.0f, 49, 26.0f, 0.0f, 26.0f, 0.0f));
        frameLayout2.addView(x0Var, z5.d(-1, -2.0f, 49, 26.0f, 0.0f, 26.0f, 0.0f));
        textView.setText(LocaleController.getString(j3 < 0 ? R.string.Gift2StarsChannel : z10 ? R.string.Gift2StarsSelf : R.string.Gift2Stars));
        if (z10) {
            linearLayout2.addView(frameLayout2, z5.t(-2, -2, 1, 0, 9, 0, 4));
            q90 q90Var2 = new q90(context, this.resourcesProvider);
            q90Var2.setLinkTextColor(i6.v0(i13, this.resourcesProvider));
            q90Var2.setTextSize(1, 14.0f);
            q90Var2.setTextColor(i6.v0(i12, this.resourcesProvider));
            q90Var2.setGravity(17);
            linearLayout2.addView(q90Var2, z5.t(-2, -2, 1, 26, 4, 26, 6));
            w0Var.setText(LocaleController.getString(R.string.Gift2StarsSelfInfo1));
            q90Var2.setText(LocaleController.getString(R.string.Gift2StarsSelfInfo2));
        } else if (j3 < 0) {
            linearLayout2.addView(frameLayout2, z5.t(-2, -2, 1, 0, 9, 0, 4));
            NotificationCenter.listenEmojiLoading(w0Var);
            w0Var.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2StarsChannelInfo, this.e0)), w0Var.getPaint().getFontMetricsInt(), false));
        } else {
            linearLayout2.addView(frameLayout2, z5.t(-1, -2, 1, 0, 9, 0, 6));
            l5 G = u5.y(i10, false).G(j3, true);
            org.telegram.messenger.voip.f fVar = new org.telegram.messenger.voip.f(this, G, j3, callback, context, 8);
            fVar.run();
            w0Var.addOnAttachStateChangeListener(new y0(fVar));
            if (G.l.size() < 3) {
                G.a();
            }
            NotificationCenter.getInstance(i10).listen(w0Var, NotificationCenter.starUserGiftsLoaded, new ft(23, G, fVar));
        }
        qz qzVar = new qz(3, false);
        this.j0 = qzVar;
        qzVar.O = new z0(this);
        this.d.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        this.d.setClipToPadding(false);
        this.d.setClipChildren(false);
        this.d.setLayoutManager(qzVar);
        this.d.setSelectorType(9);
        this.d.setSelectorDrawableColor(0);
        a1 a1Var = new a1();
        this.k0 = a1Var;
        a1Var.C = false;
        a1Var.m = false;
        a1Var.n(350L);
        a1Var.o(tr.h);
        a1Var.D = 40L;
        this.d.setItemAnimator(a1Var);
        this.d.setOnItemClickListener(new ml0() { // from class: xh.s0
            @Override // org.telegram.ui.Components.ml0
            public final void d(int i14, View view) {
                q1.O(q1.this, context, i10, callback, j3, i14);
            }
        });
        U();
        this.Y.N(false);
        L();
        if (BirthdayController.getInstance(i10).isToday(j3)) {
            T(true);
        }
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.billingProductDetailsUpdated);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starGiftsLoaded);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.userInfoDidLoad);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starGiftSoldOut);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        this.e.setTitle(y());
        NotificationCenter.listenEmojiLoading(this.e.getTitleTextView());
    }
}
