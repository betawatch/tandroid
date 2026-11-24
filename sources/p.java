// default package

import android.app.Activity;
import android.graphics.drawable.ShapeDrawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.Executor;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasskeysActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.Wallet.b;
import org.telegram.ui.Wallet.c;
import org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class p implements jac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ p(c cVar, nv0 nv0Var, String str, String str2) {
        this.a = (byte) 16;
        this.b = nv0Var;
        this.c = str;
        this.d = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0b22  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x025a  */
    @Override // jac
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2) {
        String str;
        d S;
        y51 y51Var;
        long j;
        y51 y51Var2;
        String str2;
        String str3;
        byte b = 7;
        str = "NULL_ERROR";
        TL_toncenter.onrampProviderInfo onrampproviderinfo = null;
        int i = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        switch (this.a) {
            case 0:
                a1 a1Var = (a1) this.b;
                k11 k11Var = (k11) this.c;
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) this.d;
                k11Var.c(false);
                id P1 = oc7.r1(a1Var.a).P1();
                P1.b.remove(tL_aiComposeTone);
                P1.d();
                P1.c();
                a1Var.v1();
                break;
            case 1:
                e0 e0Var = (e0) this.b;
                ylb ylbVar = (ylb) this.c;
                TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                e0Var.a2.setLoading(false);
                if (tL_error != null) {
                    boolean equalsIgnoreCase = "TONES_SAVED_TOO_MANY".equalsIgnoreCase(tL_error.text);
                    FrameLayout frameLayout = e0Var.Z1;
                    if (equalsIgnoreCase) {
                        a1.q1(new c41(frameLayout, ylbVar), e0Var.a);
                        break;
                    } else {
                        wi8.u(frameLayout, ylbVar, tL_error, false);
                        break;
                    }
                } else {
                    id P12 = oc7.r1(e0Var.a).P1();
                    ArrayList arrayList = P12.b;
                    if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
                        long j2 = ((TL_aicompose.TL_aiComposeTone) aiComposeTone).id;
                        for (int i2 = 0; i2 < arrayList.size(); i2++) {
                            if ((arrayList.get(i2) instanceof TL_aicompose.TL_aiComposeTone) && ((TL_aicompose.TL_aiComposeTone) arrayList.get(i2)).id == j2) {
                                e0Var.dismiss();
                                S = LaunchActivity.S();
                                if (S == null) {
                                    c41.b0(S).p(aiComposeTone.emoji_id, jb6.M0(2131754958, null), jb6.a0(null, null, 2131754959, aiComposeTone.title)).j();
                                    break;
                                }
                            }
                        }
                    }
                    arrayList.add(0, aiComposeTone);
                    P12.d();
                    P12.c();
                    e0Var.dismiss();
                    S = LaunchActivity.S();
                    if (S == null) {
                    }
                }
                break;
            case 2:
                r0 r0Var = (r0) this.b;
                k11 k11Var2 = (k11) this.c;
                he heVar = (he) this.d;
                k11Var2.c(false);
                heVar.dismiss();
                r0Var.dismiss();
                id P13 = oc7.r1(r0Var.a).P1();
                P13.b.remove(r0Var.e2);
                P13.d();
                P13.c();
                break;
            case 3:
                e00 e00Var = (e00) this.b;
                hg5[] hg5VarArr = (hg5[]) this.c;
                FrameLayout frameLayout2 = (FrameLayout) this.d;
                View view = (View) obj;
                CharSequence charSequence = (CharSequence) obj2;
                hg5 hg5Var = hg5VarArr[0];
                if (hg5Var != null) {
                    hg5Var.f(true);
                }
                SpannableStringBuilder R2 = gm.R2(charSequence);
                float x = ((View) ((View) view.getParent()).getParent()).getX() + ((View) view.getParent()).getX() + view.getX();
                float y = ((View) ((View) view.getParent()).getParent()).getY() + ((View) view.getParent()).getY() + view.getY();
                if (view instanceof x51) {
                    Layout layout = ((x51) view).getLayout();
                    CharSequence text = layout.getText();
                    if (text instanceof Spanned) {
                        Spanned spanned = (Spanned) text;
                        y51[] y51VarArr = (y51[]) spanned.getSpans(0, text.length(), y51.class);
                        if (y51VarArr.length > 0 && (y51Var = y51VarArr[0]) != null) {
                            x += layout.getPrimaryHorizontal(spanned.getSpanStart(y51Var)) + (y51VarArr[0].a() / 2);
                            y += layout.getLineTop(layout.getLineForOffset(r9));
                        }
                    }
                }
                hg5 hg5Var2 = new hg5(e00Var.getContext(), 3);
                hg5VarArr[0] = hg5Var2;
                hg5Var2.p(true);
                hg5Var2.m(11.0f, 8.0f, 11.0f, 7.0f);
                hg5Var2.q(10.0f);
                hg5Var2.t(R2);
                hg5Var2.r0 = new hi(hg5Var2, r14 ? (byte) 1 : (byte) 0);
                hg5Var2.setTranslationY((-gm.L(100.0f)) + y);
                hg5Var2.h = gm.L(300.0f);
                hg5Var2.setPadding(gm.L(4.0f), gm.L(4.0f), gm.L(4.0f), gm.L(4.0f));
                hg5Var2.o(0.0f, x - gm.L(4.0f));
                frameLayout2.addView(hg5Var2, qoe.e(-1, 100, 55));
                hg5Var2.v();
                break;
            case 4:
                qw0 qw0Var = (qw0) this.b;
                ow0 ow0Var = (ow0) this.c;
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) this.d;
                String str4 = (String) obj;
                ArrayList arrayList2 = (ArrayList) obj2;
                if (TextUtils.isEmpty(str4)) {
                    qw0Var.u(ow0Var, "prepared_message_sent", null);
                    uv0 uv0Var = qw0Var.c;
                    if (uv0Var != null) {
                        uv0Var.c();
                    }
                    gm.d3(new x30(botWebViewContainer$BotWebViewProxy, arrayList2, (byte) 20), 500L);
                    break;
                } else {
                    qw0Var.u(ow0Var, "prepared_message_failed", qw0.x(str4, "error"));
                    break;
                }
            case 5:
                float[] fArr = (float[]) this.b;
                boolean[] zArr = (boolean[]) this.c;
                l97 l97Var = (l97) this.d;
                fArr[0] = ((Float) obj).floatValue();
                zArr[0] = ((Boolean) obj2).booleanValue();
                gm.r(l97Var);
                gm.c3(l97Var);
                break;
            case 6:
                yv1 yv1Var = (yv1) this.b;
                TL_account.getWebPagePreview getwebpagepreview = (TL_account.getWebPagePreview) this.c;
                ro1 ro1Var = (ro1) this.d;
                Boolean bool = (Boolean) obj;
                TLRPC.WebPage webPage = (TLRPC.WebPage) obj2;
                yv1Var.getClass();
                if (bool.booleanValue() && !(webPage instanceof TLRPC.TL_webPagePending)) {
                    Iterator it = yv1Var.Yb.keySet().iterator();
                    while (it.hasNext() && yv1Var.Yb.size() > 5) {
                        it.next();
                        it.remove();
                    }
                    yv1Var.Yb.put(getwebpagepreview.message, webPage);
                }
                ro1Var.a(bool, webPage);
                break;
            case 7:
                ((ConnectionsManager) this.b).lambda$sendRequestTypedAndProcessUpdates$5((Executor) this.c, (jac) this.d, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                break;
            case 8:
                final nk3 nk3Var = (nk3) this.b;
                fj1 fj1Var = (fj1) this.c;
                he heVar2 = (he) this.d;
                d dVar = (d) obj;
                final Long l = (Long) obj2;
                jv0 jv0Var = new jv0((Object) nk3Var, (Object) l, (Object) fj1Var, (Object) dVar, (byte) 7);
                iu iuVar = new iu(nk3Var, heVar2, l, (byte) 14);
                final Object[] objArr6 = objArr == true ? 1 : 0;
                qac qacVar = new qac() { // from class: vh3
                    @Override // qac
                    public final void a(Object obj3) {
                        byte b2 = objArr6;
                        Long l2 = l;
                        switch (b2) {
                            case 0:
                                Runnable runnable = (Runnable) obj3;
                                nk3 nk3Var2 = nk3Var;
                                if (nk3Var2.H.bot_admin_rights == null) {
                                    runnable.run();
                                    break;
                                } else {
                                    TLRPC.User W1 = nk3Var2.getMessagesController().W1(Long.valueOf(nk3Var2.I));
                                    oc7 messagesController = nk3Var2.getMessagesController();
                                    long longValue = l2.longValue();
                                    TLRPC.RequestPeerType requestPeerType = nk3Var2.H;
                                    TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                                    Boolean bool2 = requestPeerType.bot_participant;
                                    messagesController.X4(longValue, W1, tL_chatAdminRights, null, false, nk3Var2, bool2 == null || !bool2.booleanValue(), true, null, runnable, new cf(runnable, (byte) 10));
                                    break;
                                }
                            default:
                                Runnable runnable2 = (Runnable) obj3;
                                nk3 nk3Var3 = nk3Var;
                                if (nk3Var3.H.user_admin_rights == null) {
                                    runnable2.run();
                                    break;
                                } else {
                                    nk3Var3.getMessagesController().X4(l2.longValue(), z8c.h(nk3Var3.getAccountInstance().a).f(), ke2.p0(nk3Var3.getMessagesController().L0(l2).admin_rights, nk3Var3.H.user_admin_rights), null, true, nk3Var3, false, true, null, runnable2, new cf(runnable2, (byte) 9));
                                    break;
                                }
                        }
                    }
                };
                final byte b2 = r14 ? (byte) 1 : (byte) 0;
                Utilities.u(0, jv0Var, iuVar, qacVar, new qac() { // from class: vh3
                    @Override // qac
                    public final void a(Object obj3) {
                        byte b22 = b2;
                        Long l2 = l;
                        switch (b22) {
                            case 0:
                                Runnable runnable = (Runnable) obj3;
                                nk3 nk3Var2 = nk3Var;
                                if (nk3Var2.H.bot_admin_rights == null) {
                                    runnable.run();
                                    break;
                                } else {
                                    TLRPC.User W1 = nk3Var2.getMessagesController().W1(Long.valueOf(nk3Var2.I));
                                    oc7 messagesController = nk3Var2.getMessagesController();
                                    long longValue = l2.longValue();
                                    TLRPC.RequestPeerType requestPeerType = nk3Var2.H;
                                    TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                                    Boolean bool2 = requestPeerType.bot_participant;
                                    messagesController.X4(longValue, W1, tL_chatAdminRights, null, false, nk3Var2, bool2 == null || !bool2.booleanValue(), true, null, runnable, new cf(runnable, (byte) 10));
                                    break;
                                }
                            default:
                                Runnable runnable2 = (Runnable) obj3;
                                nk3 nk3Var3 = nk3Var;
                                if (nk3Var3.H.user_admin_rights == null) {
                                    runnable2.run();
                                    break;
                                } else {
                                    nk3Var3.getMessagesController().X4(l2.longValue(), z8c.h(nk3Var3.getAccountInstance().a).f(), ke2.p0(nk3Var3.getMessagesController().L0(l2).admin_rights, nk3Var3.H.user_admin_rights), null, true, nk3Var3, false, true, null, runnable2, new cf(runnable2, (byte) 9));
                                    break;
                                }
                        }
                    }
                }, new hv0(nk3Var, heVar2, l, fj1Var, dVar, (byte) 5));
                break;
            case 9:
                lv4 lv4Var = (lv4) this.b;
                iv4 iv4Var = (iv4) this.c;
                jz jzVar = (jz) this.d;
                TLRPC.payments_PaymentResult payments_paymentresult = (TLRPC.payments_PaymentResult) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                iv4Var.f = false;
                if (payments_paymentresult instanceof TLRPC.TL_payments_paymentResult) {
                    Utilities.d.c(new pf2(lv4Var, (TLRPC.TL_payments_paymentResult) payments_paymentresult, (byte) 4));
                    jzVar.a(Boolean.TRUE, null);
                    break;
                } else {
                    Boolean bool2 = Boolean.FALSE;
                    if (tL_error2 != null) {
                        jzVar.a(bool2, tL_error2.text);
                        break;
                    } else {
                        jzVar.a(bool2, null);
                        break;
                    }
                }
            case 10:
                lv4 lv4Var2 = (lv4) this.b;
                qac qacVar2 = (qac) this.c;
                iv4 iv4Var2 = (iv4) this.d;
                TL_payments.TL_StarGiftAuctionAcquiredGifts tL_StarGiftAuctionAcquiredGifts = (TL_payments.TL_StarGiftAuctionAcquiredGifts) obj;
                if (tL_StarGiftAuctionAcquiredGifts == null) {
                    qacVar2.a(null);
                    break;
                } else {
                    lv4Var2.getMessagesController().d4(tL_StarGiftAuctionAcquiredGifts.users, false);
                    lv4Var2.getMessagesController().X3(tL_StarGiftAuctionAcquiredGifts.chats, false);
                    ArrayList<TL_stars.TL_StarGiftAuctionAcquiredGift> arrayList3 = tL_StarGiftAuctionAcquiredGifts.gifts;
                    iv4Var2.g = arrayList3;
                    qacVar2.a(arrayList3);
                    break;
                }
            case 11:
                mw4 mw4Var = (mw4) this.b;
                k11 k11Var3 = (k11) this.c;
                he heVar3 = (he) this.d;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                if (updates != null && tL_error3 == null) {
                    oc7.r1(mw4Var.a).T3(updates, false);
                }
                gm.c3(new da7((Object) mw4Var, (Object) k11Var3, (Object) heVar3, (Object) updates, (Object) tL_error3, (byte) 28));
                break;
            case 12:
                c cVar = (c) this.b;
                String str5 = (String) this.c;
                jac jacVar = (jac) this.d;
                TL_wallet.userAddresses useraddresses = (TL_wallet.userAddresses) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                int i3 = cVar.a;
                if (useraddresses == null || useraddresses.addresses.size() <= 0) {
                    cVar.j0(new iu(cVar, jacVar, str5, (byte) 18), str5);
                    break;
                } else {
                    oc7.r1(i3).d4(useraddresses.users, false);
                    cf7.Y(i3).j1(useraddresses.users, null, true, true);
                    TL_wallet.walletUserAddress walletuseraddress = useraddresses.addresses.get(0);
                    long j3 = walletuseraddress.user_id;
                    if (j3 != 0) {
                        cVar.O.put(Long.valueOf(j3), walletuseraddress);
                    }
                    cVar.P.put(walletuseraddress.address, walletuseraddress);
                    jacVar.a(walletuseraddress, tL_error4 != null ? tL_error4.text : null);
                    break;
                }
                break;
            case 13:
                c cVar2 = (c) this.b;
                jac jacVar2 = (jac) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                TL_wallet.userAddresses useraddresses2 = (TL_wallet.userAddresses) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                if (useraddresses2 == null || useraddresses2.addresses.size() <= 0) {
                    jacVar2.a(null, tL_error5 == null ? null : tL_error5.text);
                    break;
                } else {
                    oc7.r1(cVar2.a).d4(useraddresses2.users, false);
                    TL_wallet.walletUserAddress walletuseraddress2 = useraddresses2.addresses.get(0);
                    long j4 = walletuseraddress2.user_id;
                    if (j4 != 0) {
                        long j5 = user.id;
                        if (j4 == j5) {
                            cVar2.O.put(Long.valueOf(j5), walletuseraddress2);
                            cVar2.P.put(walletuseraddress2.address, walletuseraddress2);
                            jacVar2.a(walletuseraddress2, null);
                            break;
                        }
                    }
                    jacVar2.a(null, tL_error5 == null ? null : tL_error5.text);
                    break;
                }
                break;
            case 14:
                c cVar3 = (c) this.b;
                qac qacVar3 = (qac) this.c;
                TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) this.d;
                y25 y25Var = (y25) obj;
                String str6 = (String) obj2;
                if (str6 == null) {
                    if (y25Var != null) {
                        g35 g35Var = cVar3.c;
                        if (g35Var == null) {
                            qacVar3.a("STORAGE_NULL");
                            break;
                        } else if (TextUtils.equals(g35Var.c, tL_walletState.address)) {
                            cVar3.c.q(z8c.h(cVar3.a).e(), tL_walletState.public_key, y25Var, new qy1((Object) y25Var.b(), (Object) qacVar3, (byte) 25));
                            break;
                        } else {
                            qacVar3.a("STORAGE_CHANGED");
                            break;
                        }
                    } else {
                        str6 = "LOCAL_STORAGE_ERROR";
                    }
                }
                qacVar3.a(str6);
                break;
            case 15:
                c cVar4 = (c) this.b;
                i48 i48Var = (i48) this.c;
                String str7 = (String) this.d;
                TL_wallet.walletTransactions wallettransactions = (TL_wallet.walletTransactions) obj;
                if (wallettransactions != null && !wallettransactions.transactions.isEmpty()) {
                    TL_wallet.walletTransaction wallettransaction = wallettransactions.transactions.get(0);
                    cVar4.N.put(str7, wallettransaction);
                    i48Var.a(wallettransaction);
                    break;
                } else {
                    i48Var.a(null);
                    break;
                }
            case 16:
                nv0 nv0Var = (nv0) this.b;
                String str8 = (String) this.c;
                String str9 = (String) this.d;
                y25 y25Var2 = (y25) obj;
                String str10 = (String) obj2;
                if (y25Var2 == null) {
                    c.m("decrypting transaction comment, failed to get secret phrase");
                    if (str10 == null) {
                        str10 = "NULL_ERROR";
                    }
                    nv0Var.a(null, str10);
                    break;
                } else {
                    try {
                        nv0Var.a(WalletEngine2.decryptComment(y25Var2, str8, str9), null);
                        break;
                    } catch (Exception e) {
                        c.n("failed to decrypt comment", e);
                        nv0Var.a(null, e.getMessage() != null ? e.getMessage() : "NULL_ERROR");
                        return;
                    }
                }
            case 17:
                c cVar5 = (c) this.b;
                qy1 qy1Var = (qy1) this.c;
                TL_wallet.enableBackup enablebackup = (TL_wallet.enableBackup) this.d;
                WalletEngine2.ImportedWalletProof importedWalletProof = (WalletEngine2.ImportedWalletProof) obj;
                String str11 = (String) obj2;
                if (importedWalletProof == null) {
                    if (str11 == null) {
                        str11 = "NULL_ERROR";
                    }
                    qy1Var.a(str11);
                    break;
                } else {
                    TL_wallet.walletOwnershipProof walletownershipproof = new TL_wallet.walletOwnershipProof();
                    enablebackup.proof = walletownershipproof;
                    walletownershipproof.timestamp = importedWalletProof.timestamp;
                    walletownershipproof.signature = importedWalletProof.signature;
                    ConnectionsManager.getInstance(cVar5.a).sendRequestTyped(enablebackup, new kc(objArr2 == true ? 1 : 0), new lf2((Object) cVar5, (Object) qy1Var, (byte) 21));
                    break;
                }
            case 18:
                c cVar6 = (c) this.b;
                sqc sqcVar = (sqc) this.c;
                v25 v25Var = (v25) this.d;
                y25 y25Var3 = (y25) obj;
                String str12 = (String) obj2;
                int i4 = cVar6.a;
                if (y25Var3 == null) {
                    c.m("disable backup: no current phrase ".concat(str12 == null ? "NULL_ERROR" : str12));
                    if (str12 == null) {
                        str12 = "NULL_ERROR";
                    }
                    sqcVar.a(str12);
                    break;
                } else {
                    c.O("disable backup: ready!");
                    if (cVar6.b == null) {
                        c.m("disable backup: no engine");
                        sqcVar.a("NULL_ENGINE");
                        break;
                    } else {
                        String x2 = cVar6.x();
                        byte[] D = cVar6.D();
                        if (TextUtils.isEmpty(x2)) {
                            c.m("disable backup: empty address");
                            sqcVar.a("NULL_ADDRESS");
                            break;
                        } else if (D == null || D.length <= 0) {
                            c.m("disable backup: no public key");
                            sqcVar.a("NULL_PUBLIC_KEY");
                            break;
                        } else {
                            try {
                                y25 b3 = v25Var.b.b();
                                b G = cVar6.G();
                                TL_wallet.walletTransaction wallettransaction2 = new TL_wallet.walletTransaction();
                                wallettransaction2.key_change = true;
                                wallettransaction2.incoming = false;
                                wallettransaction2.pending = true;
                                wallettransaction2.comment = null;
                                wallettransaction2.comment_encrypted = false;
                                wallettransaction2.date = ConnectionsManager.getInstance(i4).getCurrentTime();
                                wallettransaction2.amount = 0L;
                                TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress = new TL_wallet.walletTransactionPeerAddress();
                                wallettransactionpeeraddress.address = x2;
                                wallettransaction2.peer = wallettransactionpeeraddress;
                                xo1 xo1Var = new xo1(cVar6, b3, wallettransaction2, G, (byte) 23);
                                TL_wallet.sendTransfer sendtransfer = v25Var.a;
                                wallettransaction2.gasless = sendtransfer.data_gasless != null;
                                wallettransaction2.random_id = sendtransfer.random_id;
                                wallettransaction2.gaslessMessageBodyHash = sendtransfer.gaslessMessageBodyHash;
                                wallettransaction2.normalMessageBodyHash = sendtransfer.normalMessageBodyHash;
                                cVar6.p.add(0, wallettransaction2);
                                G.k();
                                G.i();
                                cVar6.Z();
                                sqcVar.a(null);
                                c.O("disable backup: prepared sendTransfer, sending");
                                ConnectionsManager.getInstance(i4).sendRequestTyped(v25Var.a, new kc(objArr3 == true ? 1 : 0), new sm1(cVar6, xo1Var, v25Var, b3, wallettransaction2, (byte) 3));
                                break;
                            } catch (IllegalStateException unused) {
                                sqcVar.a("CANCELLED");
                                return;
                            }
                        }
                    }
                }
                break;
            case 19:
                gm.c3(new v15(this.b, obj, this.c, this.d, obj2, (byte) 0));
                break;
            case 20:
                w45 w45Var = (w45) this.b;
                t45 t45Var = (t45) this.c;
                u35 u35Var = (u35) this.d;
                TLRPC.Bool bool3 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj2;
                w45Var.getClass();
                Arrays.fill(t45Var.b, (byte) 0);
                u35Var.a((tL_error6 == null && (bool3 instanceof TLRPC.TL_boolTrue)) ? null : w45.z(tL_error6, "submitConnectResult"));
                if (w45Var.e < 0) {
                    w45Var.e = w45Var.f.sendRequestTyped(new TL_wallet.tonConnectGetSessions(), new kc(objArr4 == true ? 1 : 0), new vt4(w45Var, b));
                    break;
                }
                break;
            case 21:
                w45 w45Var2 = (w45) this.b;
                s45 s45Var = (s45) this.c;
                d82 d82Var = (d82) this.d;
                TL_wallet.walletTransaction wallettransaction3 = (TL_wallet.walletTransaction) obj;
                Object obj3 = (String) obj2;
                w45Var2.getClass();
                s45Var.p = (s45Var.n || w45Var2.i(s45Var) || !w45Var2.A(s45Var) || wallettransaction3 == null || !wallettransaction3.traceSucceeded || wallettransaction3.traceIncomplete) ? false : true;
                d82Var.a(wallettransaction3, obj3);
                break;
            case 22:
                boolean[] zArr2 = (boolean[]) this.b;
                ud7 ud7Var = (ud7) this.c;
                tp7 tp7Var = (tp7) this.d;
                TL_wallet.walletTransaction wallettransaction4 = (TL_wallet.walletTransaction) obj;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    gm.r(ud7Var);
                    if (wallettransaction4 != null) {
                        long j6 = wallettransaction4.fee;
                        if (j6 > 0) {
                            j = j6;
                            tp7Var.a(Long.valueOf(j));
                            break;
                        }
                    }
                    j = 0;
                    tp7Var.a(Long.valueOf(j));
                }
                break;
            case 23:
                my0 my0Var = (my0) this.b;
                TL_account.Passkey passkey = (TL_account.Passkey) this.c;
                String str13 = (String) this.d;
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj2;
                if (passkeys != null) {
                    my0Var.dismiss();
                    while (i < passkeys.passkeys.size()) {
                        if (TextUtils.equals(passkeys.passkeys.get(i).id, passkey.id)) {
                            passkeys.passkeys.remove(i);
                            i--;
                        }
                        i++;
                    }
                    d S2 = LaunchActivity.S();
                    if (S2 != null) {
                        PasskeysActivity passkeysActivity = new PasskeysActivity(passkeys.passkeys);
                        S2.presentFragment(passkeysActivity);
                        gm.d3(new bl7(passkeysActivity, passkey, (byte) 20), 150L);
                        break;
                    }
                } else if (tL_error7 != null) {
                    new c41(my0Var.F, my0Var.J0).f0(str13, false);
                    break;
                }
                break;
            case 24:
                yb9 yb9Var = (yb9) this.b;
                k11 k11Var4 = (k11) this.c;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.d;
                k11Var4.b();
                if (((Boolean) obj).booleanValue()) {
                    h72 h72Var = yb9Var.a2;
                    if (h72Var != null) {
                        h72Var.a(tL_starGiftUnique);
                    }
                    yb9Var.dismiss();
                    break;
                }
                break;
            case 25:
                wsa wsaVar = (wsa) this.b;
                hg5[] hg5VarArr2 = (hg5[]) this.c;
                FrameLayout frameLayout3 = (FrameLayout) this.d;
                View view2 = (View) obj;
                CharSequence charSequence2 = (CharSequence) obj2;
                hg5 hg5Var3 = hg5VarArr2[0];
                if (hg5Var3 != null) {
                    hg5Var3.f(true);
                }
                SpannableStringBuilder R22 = gm.R2(charSequence2);
                float x3 = ((View) ((View) view2.getParent()).getParent()).getX() + ((View) view2.getParent()).getX() + view2.getX();
                float y2 = ((View) ((View) view2.getParent()).getParent()).getY() + ((View) view2.getParent()).getY() + view2.getY();
                if (view2 instanceof x51) {
                    Layout layout2 = ((x51) view2).getLayout();
                    CharSequence text2 = layout2.getText();
                    if (text2 instanceof Spanned) {
                        Spanned spanned2 = (Spanned) text2;
                        y51[] y51VarArr2 = (y51[]) spanned2.getSpans(0, text2.length(), y51.class);
                        if (y51VarArr2.length > 0 && (y51Var2 = y51VarArr2[0]) != null) {
                            x3 = layout2.getPrimaryHorizontal(spanned2.getSpanStart(y51Var2)) + (y51VarArr2[0].a() / 2) + x3;
                            y2 += layout2.getLineTop(layout2.getLineForOffset(r13));
                        }
                    }
                }
                hg5 hg5Var4 = new hg5(wsaVar.getContext(), 3);
                hg5VarArr2[0] = hg5Var4;
                hg5Var4.p(true);
                hg5Var4.m(11.0f, 8.0f, 11.0f, 7.0f);
                hg5Var4.q(10.0f);
                hg5Var4.t(R22);
                hg5Var4.r0 = new hi(hg5Var4, (byte) 9);
                hg5Var4.setTranslationY((-gm.L(100.0f)) + y2);
                hg5Var4.h = gm.L(300.0f);
                hg5Var4.setPadding(gm.L(4.0f), gm.L(4.0f), gm.L(4.0f), gm.L(4.0f));
                hg5Var4.o(0.0f, x3 - gm.L(4.0f));
                frameLayout3.addView(hg5Var4, qoe.e(-1, 100, 55));
                hg5Var4.v();
                break;
            case 26:
                tmc tmcVar = (tmc) this.b;
                c cVar7 = (c) this.c;
                ConnectionsManager connectionsManager = (ConnectionsManager) this.d;
                Vector vector = (Vector) obj;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj2;
                if (vector == null) {
                    if (tL_error8 == null || (str2 = tL_error8.text) == null) {
                        str2 = "NULL_ERROR";
                    }
                    tmcVar.a(str2);
                    if (tL_error8 != null && (str3 = tL_error8.text) != null) {
                        str = str3;
                    }
                    c41.c0(str);
                    break;
                } else if (vector.objects.size() <= 0) {
                    tmcVar.a("NO_PROVIDERS");
                    c41.c0("NO_PROVIDERS");
                    break;
                } else {
                    ArrayList<T> arrayList4 = vector.objects;
                    int size = arrayList4.size();
                    int i5 = 0;
                    while (i5 < size) {
                        Object obj4 = arrayList4.get(i5);
                        i5++;
                        TL_toncenter.onrampProviderInfo onrampproviderinfo2 = (TL_toncenter.onrampProviderInfo) obj4;
                        if (onrampproviderinfo2.supports_base_currencies && (onrampproviderinfo2.crypto_currencies.contains("GRAM") || onrampproviderinfo2.crypto_currencies.contains("gram"))) {
                            onrampproviderinfo = onrampproviderinfo2;
                            if (onrampproviderinfo != null) {
                                tmcVar.a("NO_SUITABLE_PROVIDER");
                                c41.c0("NO_SUITABLE_PROVIDER");
                                break;
                            } else {
                                TL_toncenter.createOnrampSession createonrampsession = new TL_toncenter.createOnrampSession();
                                createonrampsession.address = cVar7.x();
                                createonrampsession.crypto_currency = "gram";
                                createonrampsession.base_currency = cVar7.h.g();
                                createonrampsession.provider = onrampproviderinfo.id;
                                connectionsManager.sendRequestTyped(createonrampsession, new kc(objArr5 == true ? 1 : 0), new o6b(tmcVar, (byte) 11));
                                break;
                            }
                        }
                    }
                    if (onrampproviderinfo != null) {
                    }
                }
                break;
            default:
                vqc vqcVar = (vqc) this.b;
                he heVar4 = (he) this.c;
                c cVar8 = (c) this.d;
                Long l2 = (Long) obj;
                String str14 = (String) obj2;
                heVar4.dismiss();
                if (l2 == null) {
                    c41 b0 = c41.b0(vqcVar);
                    if (str14 == null) {
                        str14 = "NULL_ERROR";
                    }
                    b0.f0(str14, false);
                    break;
                } else {
                    Activity parentActivity = vqcVar.getParentActivity();
                    if (parentActivity != null) {
                        oh2 oh2Var = new oh2(1, vqcVar.getResourceProvider(), parentActivity);
                        int i6 = cmb.h6;
                        fg0 f0 = cmb.f0(vqcVar.getThemedColor(i6), 7, gm.L(12.0f));
                        wmb M = anb.M(i6);
                        ylb resourceProvider = vqcVar.getResourceProvider();
                        oh2Var.setBackground(f0);
                        anb.j(oh2Var, f0, null, M, resourceProvider);
                        oh2Var.e(jb6.M0(2131742632, null), "", false, false, false);
                        oh2Var.setMultiline(true);
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) oh2Var.getCheckBoxView().getLayoutParams();
                        layoutParams.topMargin = 0;
                        byte b4 = 16;
                        layoutParams.gravity = (jb6.a0 ? 5 : 3) | 16;
                        oh2Var.getCheckBoxView().setLayoutParams(layoutParams);
                        oh2Var.setPadding(jb6.a0 ? gm.L(4.0f) : 0, gm.L(12.0f), jb6.a0 ? 0 : gm.L(4.0f), gm.L(12.0f));
                        TextView textView = new TextView(parentActivity);
                        textView.setTextSize(1, 14.0f);
                        anb.X(textView, cmb.i5, vqcVar.getResourceProvider());
                        textView.setGravity(17);
                        int L = gm.L(10.0f);
                        int i7 = cmb.Z6;
                        ShapeDrawable b02 = cmb.b0(L, vqcVar.getThemedColor(i7));
                        wmb M2 = anb.M(i7);
                        ylb resourceProvider2 = vqcVar.getResourceProvider();
                        textView.setBackground(b02);
                        anb.j(textView, b02, M2, null, resourceProvider2);
                        textView.setPadding(gm.L(16.0f), gm.L(12.0f), gm.L(16.0f), gm.L(12.0f));
                        textView.setText(l2.longValue() > 0 ? jb6.V(null, null, 2131742630, c.r(l2.longValue(), false), cVar8.q(l2.longValue(), true)) : jb6.M0(2131742631, null));
                        textView.setVisibility(8);
                        oh2Var.setOnClickListener(new fyb(oh2Var, textView, b4));
                        LinearLayout l3 = td4.l(parentActivity, 1);
                        l3.addView(oh2Var, qoe.t(-1, -2, 83, 8, 0, 8, 0));
                        l3.addView(textView, qoe.k(16.0f, 8.0f, 16.0f, 16.0f, -1, -2));
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vqcVar.getResourceProvider(), parentActivity);
                        alertDialog$Builder.a.S = jb6.M0(2131742814, null);
                        String M0 = jb6.M0(2131742815, null);
                        he heVar5 = alertDialog$Builder.a;
                        heVar5.U = M0;
                        heVar5.H = (byte) 6;
                        alertDialog$Builder.n(l3);
                        alertDialog$Builder.a.a = gm.L(312.0f);
                        alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                        alertDialog$Builder.j(jb6.M0(2131742819, null), new lu((Object) vqcVar, (Object) oh2Var, (Object) cVar8, (Object) l2, (byte) 25));
                        he heVar6 = alertDialog$Builder.a;
                        vqcVar.showDialog(heVar6);
                        TextView textView2 = (TextView) heVar6.c(-1);
                        if (textView2 != null) {
                            anb.X(textView2, cmb.p7, heVar6.j1);
                            break;
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ p(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
