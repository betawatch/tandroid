package zh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.ca;
import bi.dd;
import bi.ec;
import bi.rc;
import bi.sa;
import bi.t9;
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
import org.telegram.messenger.FileLog;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.vh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.r5;
import org.telegram.ui.Components.su;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.vz;
import org.telegram.ui.Components.w01;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.y9;
import org.telegram.ui.Components.y90;
import org.telegram.ui.Components.z90;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cb;
import org.telegram.ui.fi1;
import org.telegram.ui.u90;
import org.telegram.ui.xf;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class p1 extends bb implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int z0 = 0;
    public final int X;
    public j71 Y;
    public List Z;
    public final Utilities.Callback a0;
    public TLRPC.DisallowedGiftsSettings b0;
    public final long c0;
    public final boolean d0;
    public final String e0;
    public final rc f0;
    public final t0 g0;
    public final FrameLayout h0;
    public final LinearLayout i0;
    public final vz j0;
    public final y0 k0;
    public final u0 l0;
    public final v0 m0;
    public final ArrayList n0;
    public final t9 o0;
    public int p0;
    public int q0;
    public int r0;
    public int s0;
    public boolean t0;
    public boolean u0;
    public boolean v0;
    public ec w0;
    public final z90 x0;
    public boolean y0;

    public p1(LaunchActivity launchActivity, int i10, long j10) {
        this(launchActivity, i10, j10, null, null);
    }

    public static void P(final p1 p1Var, org.telegram.ui.ActionBar.e2 e2Var, TLObject tLObject, fi1 fi1Var, final Utilities.Callback callback, TLRPC.TL_error tL_error) {
        e2Var.dismiss();
        if (tLObject instanceof TL_stars.checkCanSendGiftResultOk) {
            fi1Var.run();
            return;
        }
        if (!(tLObject instanceof TL_stars.checkCanSendGiftResultFail)) {
            if (tL_error != null) {
                new wc(p1Var.container, p1Var.resourcesProvider).g0(tL_error, false);
                return;
            }
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p1Var.getContext(), 0, p1Var.resourcesProvider);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.GiftLocked);
        alertDialog$Builder.a.T = MessageObject.formatTextWithEntities(((TL_stars.checkCanSendGiftResultFail) tLObject).reason, false);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        final org.telegram.ui.ActionBar.e2 p10 = alertDialog$Builder.p();
        final su suVar = p10.n;
        if (suVar != null) {
            suVar.setOnLinkPressListener(new y90() { // from class: zh.o0
                @Override // org.telegram.ui.Components.y90
                public final void a(ClickableSpan clickableSpan) {
                    p1 p1Var2 = p1.this;
                    p1Var2.getClass();
                    p10.dismiss();
                    Utilities.Callback callback2 = callback;
                    if (callback2 != null) {
                        callback2.run(Boolean.FALSE);
                    }
                    p1Var2.dismiss();
                    clickableSpan.onClick(suVar);
                }
            });
        }
    }

    public static void Q(p1 p1Var, Context context, int i10, Utilities.Callback callback, long j10, int i11) {
        TL_stars.SavedStarGift savedStarGift;
        t61 G = p1Var.Y.G(i11 - 1);
        if (G != null && G.H(f1.class)) {
            Object obj = G.G;
            int i12 = 0;
            if (obj instanceof tg.k) {
                new z0(p1Var, context, i10, (tg.k) obj, p1Var.c0, new l0(p1Var, callback, 0)).show();
                return;
            }
            if (obj instanceof TL_stars.StarGift) {
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                t9 t9Var = p1Var.o0;
                if (t9Var != null && p1Var.s0 == p1Var.q0) {
                    ArrayList arrayList = t9Var.l;
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
                    a1 a1Var = new a1(p1Var, p1Var.getContext(), i10, UserConfig.getInstance(i10).getClientUserId(), p1Var.resourcesProvider);
                    a1Var.L2(savedStarGift, null);
                    a1Var.y2(j10, new bi.t2(p1Var, a1Var, j10, callback, 7));
                    return;
                }
                int i13 = 17;
                if (G.q && starGift.availability_resale > 0) {
                    org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                    if (U == null) {
                        return;
                    }
                    org.telegram.ui.ActionBar.p2 p2Var = new org.telegram.ui.ActionBar.p2();
                    p2Var.a = true;
                    p2Var.e = true;
                    b1 b1Var = new b1(j10, starGift.title, starGift.id, p1Var.resourcesProvider, p1Var.container.getViewTreeObserver(), new m0());
                    b1Var.e = new org.telegram.ui.Wallet.s(i13, p1Var, callback);
                    U.showAsSheet(b1Var, p2Var);
                    return;
                }
                if (starGift.auction) {
                    GiftAuctionController.getInstance(i10).getOrRequestAuction(starGift.id, new ai.c1(context, p1Var.resourcesProvider, i10, j10, new l0(p1Var, callback, 1)));
                    return;
                }
                if (!starGift.sold_out) {
                    if (starGift.limited_per_user && starGift.per_user_remains <= 0) {
                        new wc(p1Var.container, p1Var.resourcesProvider).S(starGift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2PerUserLimit", starGift.per_user_total))).j();
                        return;
                    }
                    fi1 fi1Var = new fi1(p1Var, context, i10, starGift, callback);
                    if (starGift.locked_until_date > ConnectionsManager.getInstance(i10).getCurrentTime()) {
                        org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(p1Var.getContext(), 3, null);
                        e2Var.r(500L);
                        TL_stars.checkCanSendGift checkcansendgift = new TL_stars.checkCanSendGift();
                        checkcansendgift.gift_id = starGift.id;
                        ConnectionsManager.getInstance(i10).sendRequest(checkcansendgift, new bi.i2(p1Var, e2Var, fi1Var, callback, 20));
                        return;
                    }
                    if (!starGift.require_premium || UserConfig.getInstance(i10).isPremium()) {
                        fi1Var.run();
                        return;
                    }
                    org.telegram.ui.ActionBar.r2 U2 = LaunchActivity.U();
                    if (U2 == null) {
                        return;
                    }
                    tg.m1 m1Var = new tg.m1(U2, i10, null, null, starGift, p1Var.resourcesProvider);
                    y9 y9Var = new y9(p1Var.getContext());
                    r5 r5Var = new r5(AndroidUtilities.dp(160.0f), 4, y9Var, false);
                    y9Var.setImageDrawable(r5Var);
                    y9Var.addOnAttachStateChangeListener(new s0(r5Var));
                    r5Var.i(starGift.getDocument(), false);
                    m1Var.B0 = y9Var;
                    m1Var.show();
                    r5Var.f();
                    return;
                }
                u6 u6Var = p1Var.resourcesProvider;
                if (context == null) {
                    return;
                }
                org.telegram.ui.ActionBar.k3 i14 = vh.i(1, context, u6Var, false);
                LinearLayout d = vh.d(context, 1);
                d.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
                d.setClipChildren(false);
                d.setClipToPadding(false);
                y9 y9Var2 = new y9(context);
                dd.Z0(y9Var2.getImageReceiver(), starGift, 160);
                d.addView(y9Var2, gb1.x(160, 160, 17, 0, -8, 0, 10));
                TextView textView = new TextView(context);
                org.telegram.messenger.t.r(textView, y6.j5, u6Var, 1, 20.0f);
                textView.setGravity(17);
                textView.setText(LocaleController.getString(R.string.Gift2SoldOutSheetTitle));
                TextView e = vh.e(d, textView, gb1.x(-1, -2, 17, 20, 0, 20, 4), context);
                e.setTextSize(1, 14.0f);
                e.setTypeface(AndroidUtilities.bold());
                e.setGravity(17);
                f7.V(e, y6.q7, u6Var);
                e.setText(LocaleController.getString(R.string.Gift2SoldOutSheetSubtitle));
                d.addView(e, gb1.x(-1, -2, 17, 20, 0, 20, 4));
                w01 w01Var = new w01(context, u6Var);
                if (starGift.first_sale_date != 0) {
                    w01Var.g(starGift.first_sale_date, LocaleController.getString(R.string.Gift2SoldOutSheetFirstSale));
                }
                if (starGift.last_sale_date != 0) {
                    w01Var.g(starGift.last_sale_date, LocaleController.getString(R.string.Gift2SoldOutSheetLastSale));
                }
                w01Var.c(LocaleController.getString(R.string.Gift2SoldOutSheetValue), dd.W0(false, org.telegram.messenger.t.i(starGift.stars, ',', new StringBuilder("⭐️ ")), 0.8f, null), null, null);
                if (starGift.limited) {
                    dd.D0(w01Var, i10, starGift, u6Var);
                }
                d.addView(w01Var, gb1.o(0.0f, 17.0f, 0.0f, 12.0f, -1, -2));
                fi.d dVar = new fi.d(context, u6Var, true);
                dVar.i(LocaleController.getString(R.string.OK), false, true);
                d.addView(dVar, gb1.r(-1, 48));
                i14.customView = d;
                org.telegram.ui.ActionBar.k3[] k3VarArr = {i14};
                k3VarArr[0].useBackgroundTopPadding = false;
                dVar.setOnClickListener(new sa(k3VarArr, 2));
                k3VarArr[0].fixNavigationBar();
                org.telegram.ui.ActionBar.r2 U3 = LaunchActivity.U();
                if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(U3)) {
                    k3VarArr[0].makeAttached(U3);
                }
                k3VarArr[0].show();
            }
        }
    }

    public final void U(ArrayList arrayList, j71 j71Var) {
        long j10;
        boolean z10;
        boolean z11;
        TL_stars.StarGift starGift;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings3;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings4;
        int i10 = 3;
        int i11 = 2;
        t0 t0Var = this.g0;
        long j11 = this.c0;
        long j12 = 0;
        int i12 = 0;
        boolean z12 = this.d0;
        if (z12 || j11 < 0 || ((disallowedGiftsSettings4 = this.b0) != null && disallowedGiftsSettings4.disallow_premium_gifts)) {
            j10 = 0;
            z10 = false;
        } else {
            arrayList.add(t61.k(t0Var));
            arrayList.add(t61.k(this.h0));
            ArrayList arrayList2 = this.n0;
            if (arrayList2 == null || arrayList2.isEmpty()) {
                j10 = 0;
                t61 q5 = t61.q(1, 34);
                q5.u = 1;
                arrayList.add(q5);
                t61 q9 = t61.q(2, 34);
                q9.u = 1;
                arrayList.add(q9);
                t61 q10 = t61.q(3, 34);
                q10.u = 1;
                arrayList.add(q10);
            } else {
                int size = arrayList2.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj = arrayList2.get(i13);
                    i13++;
                    int i14 = f1.a;
                    t61 K = t61.K(f1.class);
                    K.u = 1;
                    K.G = (tg.k) obj;
                    arrayList.add(K);
                    j12 = j12;
                }
                j10 = j12;
            }
            z10 = true;
        }
        int i15 = this.X;
        ca y3 = ca.y(i15, false);
        ArrayList arrayList3 = this.t0 ? y3.J : y3.I;
        if (this.b0 != null) {
            arrayList3 = (ArrayList) Collection.-EL.stream(arrayList3).filter(new hi.t1(this, i11)).collect(Collectors.toCollection(new xf()));
        }
        if (j11 < j10) {
            arrayList3 = (ArrayList) Collection.-EL.stream(arrayList3).filter(new cb(i10)).collect(Collectors.toCollection(new xf()));
        }
        long clientUserId = UserConfig.getInstance(i15).getClientUserId();
        t9 t9Var = this.o0;
        if (j11 != clientUserId && t9Var != null) {
            ArrayList arrayList4 = t9Var.l;
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
        if (MessagesController.getInstance(i15).stargiftsBlocked || (arrayList3.isEmpty() && ((disallowedGiftsSettings3 = this.b0) == null || disallowedGiftsSettings3.disallow_unique_stargifts || t9Var == null || t9Var.l.isEmpty()))) {
            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings5 = this.b0;
            if (disallowedGiftsSettings5 == null || disallowedGiftsSettings5.disallow_unique_stargifts || !arrayList3.isEmpty()) {
                return;
            }
            arrayList.add(t61.D(AndroidUtilities.dp(300.0f)));
            return;
        }
        if (z10) {
            arrayList.add(t61.D(AndroidUtilities.dp(16.0f)));
        } else {
            arrayList.add(t61.k(t0Var));
        }
        arrayList.add(t61.k(this.i0));
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
        if (this.u0 && !this.v0) {
            this.v0 = true;
            this.s0 = this.r0;
        }
        int i18 = this.s0;
        n0 n0Var = new n0(this, i12);
        int i19 = n1.a;
        t61 K2 = t61.K(n1.class);
        K2.d = 1;
        K2.G = arrayList5;
        K2.z = i18;
        K2.H = n0Var;
        arrayList.add(K2);
        boolean z13 = this.s0 == this.r0 && !z12 && j11 >= j10;
        if (z13 != this.y0) {
            this.y0 = z13;
            ViewPropertyAnimator duration = this.l0.animate().alpha(!z13 ? 1.0f : 0.0f).scaleX(!z13 ? 1.0f : 0.85f).scaleY(!z13 ? 1.0f : 0.85f).setDuration(380L);
            ds dsVar = ds.h;
            duration.setInterpolator(dsVar).start();
            this.m0.animate().alpha(z13 ? 1.0f : 0.0f).scaleX(z13 ? 1.0f : 0.85f).scaleY(z13 ? 1.0f : 0.85f).setDuration(380L).setInterpolator(dsVar).start();
        }
        if (t9Var != null && this.s0 == this.q0) {
            arrayList3 = new ArrayList();
            ArrayList arrayList6 = t9Var.l;
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
            if (i23 == this.p0 || i23 == this.q0 || (i23 == this.r0 && (starGift3.availability_resale > j10 || starGift3.require_premium || starGift3.locked_until_date != 0))) {
                if (starGift3.sold_out || starGift3.availability_resale <= j10 || i23 == this.r0) {
                    starGift = starGift3;
                } else {
                    t61 a2 = f1.a(i23, starGift3, i23 == this.q0, starGift3.limited && (disallowedGiftsSettings2 = this.b0) != null && disallowedGiftsSettings2.disallow_limited_stargifts, false, false, false);
                    starGift = starGift3;
                    arrayList.add(a2);
                    i21++;
                }
                int i24 = this.s0;
                arrayList.add(f1.a(i24, starGift, i24 == this.q0, starGift.limited && (disallowedGiftsSettings = this.b0) != null && disallowedGiftsSettings.disallow_limited_stargifts, true, false, false));
                i21++;
            }
        }
        int i25 = this.s0;
        int i26 = this.q0;
        if (i25 == i26 && t9Var != null && !t9Var.j) {
            t9Var.b();
            t61 q11 = t61.q(4, 34);
            q11.u = 1;
            arrayList.add(q11);
            t61 q12 = t61.q(5, 34);
            q12.u = 1;
            arrayList.add(q12);
            t61 q13 = t61.q(6, 34);
            q13.u = 1;
            arrayList.add(q13);
        } else if (i25 != i26 && y3.C) {
            t61 q14 = t61.q(4, 34);
            q14.u = 1;
            arrayList.add(q14);
            t61 q15 = t61.q(5, 34);
            q15.u = 1;
            arrayList.add(q15);
            t61 q16 = t61.q(6, 34);
            q16.u = 1;
            arrayList.add(q16);
        }
        arrayList.add(t61.D(AndroidUtilities.dp(i21 < 9 ? 300.0f : 40.0f)));
    }

    public final void V(boolean z10) {
        this.t0 = z10;
        this.Y.O(false);
    }

    public final void W() {
        List list;
        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption;
        ArrayList arrayList = this.n0;
        arrayList.clear();
        if (arrayList.isEmpty() && (list = this.Z) != null && !list.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            long j10 = 0;
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
                    tg.k kVar = new tg.k(tL_premiumGiftCodeOption2, tL_premiumGiftCodeOption);
                    arrayList.add(kVar);
                    if (BuildVars.useInvoiceBilling()) {
                        if (kVar.f() > j10) {
                            j10 = kVar.f();
                        }
                    } else if (kVar.h() != null && BillingController.getInstance().isReady()) {
                        d5.a aVar = new d5.a();
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
                    ((tg.k) obj).g = j10;
                }
            } else if (!arrayList2.isEmpty()) {
                System.currentTimeMillis();
                BillingController.getInstance().queryProductDetails(arrayList2, new x2.e(this, 7));
            }
        }
        if (arrayList.isEmpty()) {
            vg.s.j(this.X, null, new n0(this, 1));
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        j71 j71Var;
        if (i10 == NotificationCenter.billingProductDetailsUpdated) {
            W();
            return;
        }
        if (i10 == NotificationCenter.starGiftsLoaded) {
            j71 j71Var2 = this.Y;
            if (j71Var2 != null) {
                j71Var2.O(true);
                return;
            }
            return;
        }
        if (i10 != NotificationCenter.userInfoDidLoad) {
            if (i10 != NotificationCenter.starGiftSoldOut) {
                if (i10 == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.o0 && (j71Var = this.Y) != null) {
                    j71Var.O(true);
                    return;
                }
                return;
            }
            if (isShown()) {
                TL_stars.StarGift starGift = (TL_stars.StarGift) objArr[0];
                new wc(this.container, this.resourcesProvider).s(starGift.sticker, LocaleController.getString(R.string.Gift2SoldOutTitle), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2SoldOutCount", starGift.availability_total))).j();
                j71 j71Var3 = this.Y;
                if (j71Var3 != null) {
                    j71Var3.O(true);
                    return;
                }
                return;
            }
            return;
        }
        if (isShown()) {
            long longValue = ((Long) objArr[0]).longValue();
            long j10 = this.c0;
            if (longValue == j10 && j10 > 0) {
                int i12 = this.X;
                TLRPC.UserFull userFull = MessagesController.getInstance(i12).getUserFull(j10);
                TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = (j10 == UserConfig.getInstance(i12).getClientUserId() || userFull == null) ? null : userFull.disallowed_stargifts;
                this.b0 = disallowedGiftsSettings;
                if (disallowedGiftsSettings != null && disallowedGiftsSettings.disallow_premium_gifts && disallowedGiftsSettings.disallow_unique_stargifts && disallowedGiftsSettings.disallow_limited_stargifts && disallowedGiftsSettings.disallow_unlimited_stargifts) {
                    dismiss();
                    org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                    if (U != null) {
                        wc.b0(U).R(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(j10)))).j();
                        return;
                    }
                    return;
                }
                j71 j71Var4 = this.Y;
                if (j71Var4 != null) {
                    j71Var4.O(true);
                }
            }
            ArrayList arrayList = this.n0;
            if (arrayList == null || arrayList.isEmpty()) {
                W();
                j71 j71Var5 = this.Y;
                if (j71Var5 != null) {
                    j71Var5.O(true);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.n2
    public final void dismiss() {
        super.dismiss();
        int i10 = this.X;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.billingProductDetailsUpdated);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starGiftsLoaded);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.userInfoDidLoad);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starGiftSoldOut);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.k3, android.app.Dialog
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
        org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
        if (U != null) {
            wc.b0(U).R(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(this.c0)))).j();
        }
    }

    @Override // org.telegram.ui.Components.bb
    public final lm0 v(mm0 mm0Var) {
        j71 j71Var = new j71(this.d, getContext(), this.X, 0, true, new q0(this, 0), this.resourcesProvider);
        this.Y = j71Var;
        j71Var.r = false;
        return j71Var;
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence y() {
        return this.d0 ? LocaleController.getString(R.string.Gift2TitleSelf1) : Emoji.replaceEmoji(LocaleController.formatString(R.string.Gift2User, this.e0), null, false);
    }

    public p1(final Context context, final int i10, final long j10, List list, final Utilities.Callback callback) {
        super(context, null, false, false, null);
        char c10;
        this.n0 = new ArrayList();
        this.p0 = -1;
        this.q0 = -1;
        this.r0 = -1;
        new ArrayList();
        this.X = i10;
        this.c0 = j10;
        boolean z10 = UserConfig.getInstance(i10).getClientUserId() == j10;
        this.d0 = z10;
        this.Z = list;
        this.a0 = callback;
        int i11 = y6.b6;
        setBackgroundColorKey(i11);
        fixNavigationBarKey(i11);
        this.o0 = ca.y(i10, false).G(UserConfig.getInstance(i10).getClientUserId(), true);
        ca.y(i10, false).V();
        y9 y9Var = new y9(context);
        y9Var.setImportantForAccessibility(2);
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = null;
        j9 j9Var = new j9((u6) null);
        if (j10 > 0) {
            c10 = 2;
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
            this.e0 = UserObject.getForcedFirstName(user);
            j9Var.r(user);
            y9Var.f(user, j9Var);
            TLRPC.UserFull userFull = MessagesController.getInstance(i10).getUserFull(j10);
            if (j10 != UserConfig.getInstance(i10).getClientUserId() && userFull != null) {
                disallowedGiftsSettings = userFull.disallowed_stargifts;
            }
            this.b0 = disallowedGiftsSettings;
            if (userFull == null) {
                MessagesController.getInstance(i10).loadFullUser(user, 0, true);
            }
        } else {
            c10 = 2;
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
            this.e0 = chat == null ? "" : chat.title;
            j9Var.q(chat);
            y9Var.f(chat, j9Var);
        }
        this.v = 0.1f;
        rc rcVar = new rc(context, i10, this.resourcesProvider);
        this.f0 = rcVar;
        gb1.b(rcVar);
        rcVar.setOnClickListener(new ig.d0(this, 29));
        FrameLayout frameLayout = new FrameLayout(context);
        this.h0 = frameLayout;
        t0 t0Var = new t0(context);
        this.g0 = t0Var;
        t0Var.setClipChildren(false);
        t0Var.setClipToPadding(false);
        ec ecVar = new ec(context, 70, 0);
        this.w0 = ecVar;
        t0Var.addView(ecVar, gb1.g(-1.0f, -1));
        y9Var.setRoundRadius(AndroidUtilities.dp(42.0f));
        t0Var.addView(y9Var, gb1.h(84, 84.0f, 17, 0.0f, 15.0f, 0.0f, 17.0f));
        gb1.b(y9Var);
        y9Var.setOnClickListener(new di.a2(this, j10, 5));
        t0Var.addView(rcVar, gb1.h(-2, -2.0f, 53, 0.0f, -3.0f, -10.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        frameLayout.addView(linearLayout, gb1.i(-1, -2, 55));
        TextView g7 = org.telegram.messenger.t.g(context, 1, 20.0f);
        g7.setTypeface(AndroidUtilities.bold());
        int i12 = y6.j5;
        f7.V(g7, i12, this.resourcesProvider);
        g7.setGravity(17);
        linearLayout.addView(g7, gb1.x(-1, -2, 1, 4, 0, 4, 0));
        g7.setMaxWidth(fi.v3.a(g7.getText(), g7.getPaint()));
        z90 z90Var = new z90(context, this.resourcesProvider);
        int i13 = y6.gc;
        f7.H(z90Var, i13, this.resourcesProvider);
        z90Var.setTextSize(1, 14.0f);
        f7.V(z90Var, i12, this.resourcesProvider);
        z90Var.setGravity(17);
        z90Var.setLineSpacing(AndroidUtilities.dp(2.33f), 1.0f);
        linearLayout.addView(z90Var, gb1.x(-1, -2, 1, 4, 4, 4, 12));
        g7.setText(LocaleController.getString(R.string.Gift2Premium));
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2PremiumInfo, this.e0));
        CharSequence replaceArrows = AndroidUtilities.replaceArrows(AndroidUtilities.makeClickable(LocaleController.getString(R.string.Gift2PremiumInfoLink), new u90(26)), true);
        CharSequence[] charSequenceArr = new CharSequence[3];
        charSequenceArr[0] = replaceTags;
        charSequenceArr[1] = " ";
        charSequenceArr[c10] = replaceArrows;
        z90Var.setText(TextUtils.concat(charSequenceArr));
        z90Var.setMaxWidth(fi.v3.a(z90Var.getText(), z90Var.getPaint()));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.i0 = linearLayout2;
        linearLayout2.setOrientation(1);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        f7.V(textView, i12, this.resourcesProvider);
        textView.setGravity(17);
        linearLayout2.addView(textView, gb1.x(-1, -2, 1, 4, 0, 4, 0));
        u0 u0Var = new u0(context, this.resourcesProvider);
        this.l0 = u0Var;
        f7.H(u0Var, i13, this.resourcesProvider);
        u0Var.setTextSize(1, 14.0f);
        f7.V(u0Var, i12, this.resourcesProvider);
        u0Var.setGravity(17);
        v0 v0Var = new v0(context, this.resourcesProvider);
        this.m0 = v0Var;
        f7.H(v0Var, i13, this.resourcesProvider);
        v0Var.setTextSize(1, 14.0f);
        f7.V(v0Var, i12, this.resourcesProvider);
        v0Var.setGravity(17);
        v0Var.setAlpha(0.0f);
        v0Var.setScaleX(0.85f);
        v0Var.setScaleY(0.85f);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.addView(u0Var, gb1.h(-1, -2.0f, 49, 26.0f, 0.0f, 26.0f, 0.0f));
        frameLayout2.addView(v0Var, gb1.h(-1, -2.0f, 49, 26.0f, 0.0f, 26.0f, 0.0f));
        textView.setText(LocaleController.getString(j10 < 0 ? R.string.Gift2StarsChannel : z10 ? R.string.Gift2StarsSelf : R.string.Gift2Stars));
        if (z10) {
            linearLayout2.addView(frameLayout2, gb1.x(-2, -2, 1, 0, 9, 0, 4));
            z90 z90Var2 = new z90(context, this.resourcesProvider);
            f7.H(z90Var2, i13, this.resourcesProvider);
            z90Var2.setTextSize(1, 14.0f);
            f7.V(z90Var2, i12, this.resourcesProvider);
            z90Var2.setGravity(17);
            linearLayout2.addView(z90Var2, gb1.x(-2, -2, 1, 26, 4, 26, 6));
            u0Var.setText(LocaleController.getString(R.string.Gift2StarsSelfInfo1));
            z90Var2.setText(LocaleController.getString(R.string.Gift2StarsSelfInfo2));
            this.x0 = z90Var2;
        } else if (j10 < 0) {
            linearLayout2.addView(frameLayout2, gb1.x(-2, -2, 1, 0, 9, 0, 4));
            NotificationCenter.listenEmojiLoading(u0Var);
            u0Var.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2StarsChannelInfo, this.e0)), u0Var.getPaint().getFontMetricsInt(), false));
        } else {
            linearLayout2.addView(frameLayout2, gb1.x(-1, -2, 1, 0, 9, 0, 6));
            t9 G = ca.y(i10, false).G(j10, true);
            bi.a0 a0Var = new bi.a0(this, G, j10, callback, context);
            a0Var.run();
            u0Var.addOnAttachStateChangeListener(new w0(a0Var));
            if (G.l.size() < 3) {
                G.b();
            }
            NotificationCenter.getInstance(i10).listen(u0Var, NotificationCenter.starUserGiftsLoaded, new org.telegram.ui.Wallet.s(18, G, a0Var));
        }
        vz vzVar = new vz(3, false);
        this.j0 = vzVar;
        vzVar.O = new x0(this);
        this.d.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        this.d.setClipToPadding(false);
        this.d.setClipChildren(false);
        this.d.setLayoutManager(vzVar);
        this.d.setSelectorType(9);
        this.d.setSelectorDrawableColor(0);
        y0 y0Var = new y0();
        this.k0 = y0Var;
        y0Var.C = false;
        y0Var.m = false;
        y0Var.n(350L);
        y0Var.o(ds.h);
        y0Var.D = 40L;
        this.d.setItemAnimator(y0Var);
        this.d.setOnItemClickListener(new zl0() { // from class: zh.p0
            @Override // org.telegram.ui.Components.zl0
            public final void c(int i14, View view) {
                p1.Q(p1.this, context, i10, callback, j10, i14);
            }
        });
        W();
        this.Y.O(false);
        N();
        if (BirthdayController.getInstance(i10).isToday(j10)) {
            V(true);
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
