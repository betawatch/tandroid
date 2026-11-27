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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasskeysActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.Wallet.b;
import org.telegram.ui.Wallet.c;
import org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class p implements icc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ p(c cVar, nu0 nu0Var, String str, String str2) {
        this.a = (byte) 16;
        this.b = nu0Var;
        this.c = str;
        this.d = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0b7a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0254  */
    @Override // icc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2) {
        String str;
        e S;
        z41 z41Var;
        long j;
        a35 a35Var;
        byte[] bArr;
        z41 z41Var2;
        String str2;
        String str3;
        byte b = 7;
        byte b2 = 18;
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
                b1 b1Var = (b1) this.b;
                l01 l01Var = (l01) this.c;
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) this.d;
                l01Var.c(false);
                jc Q1 = uc7.s1(b1Var.a).Q1();
                Q1.b.remove(tL_aiComposeTone);
                Q1.d();
                Q1.c();
                b1Var.w1();
                break;
            case 1:
                f0 f0Var = (f0) this.b;
                vnb vnbVar = (vnb) this.c;
                TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                f0Var.a2.setLoading(false);
                if (tL_error != null) {
                    boolean equalsIgnoreCase = "TONES_SAVED_TOO_MANY".equalsIgnoreCase(tL_error.text);
                    FrameLayout frameLayout = f0Var.Z1;
                    if (equalsIgnoreCase) {
                        b1.s1(new d31(frameLayout, vnbVar), f0Var.a);
                        break;
                    } else {
                        ik8.u(frameLayout, vnbVar, tL_error, false);
                        break;
                    }
                } else {
                    jc Q12 = uc7.s1(f0Var.a).Q1();
                    ArrayList arrayList = Q12.b;
                    if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
                        long j2 = ((TL_aicompose.TL_aiComposeTone) aiComposeTone).id;
                        for (int i2 = 0; i2 < arrayList.size(); i2++) {
                            if ((arrayList.get(i2) instanceof TL_aicompose.TL_aiComposeTone) && ((TL_aicompose.TL_aiComposeTone) arrayList.get(i2)).id == j2) {
                                f0Var.dismiss();
                                S = LaunchActivity.S();
                                if (S == null) {
                                    d31.b0(S).p(aiComposeTone.emoji_id, ob6.M0(2131754955, null), ob6.a0(null, null, 2131754956, aiComposeTone.title)).j();
                                    break;
                                }
                            }
                        }
                    }
                    arrayList.add(0, aiComposeTone);
                    Q12.d();
                    Q12.c();
                    f0Var.dismiss();
                    S = LaunchActivity.S();
                    if (S == null) {
                    }
                }
                break;
            case 2:
                s0 s0Var = (s0) this.b;
                l01 l01Var2 = (l01) this.c;
                id idVar = (id) this.d;
                l01Var2.c(false);
                idVar.dismiss();
                s0Var.dismiss();
                jc Q13 = uc7.s1(s0Var.a).Q1();
                Q13.b.remove(s0Var.e2);
                Q13.d();
                Q13.c();
                break;
            case 3:
                fz fzVar = (fz) this.b;
                kg5[] kg5VarArr = (kg5[]) this.c;
                FrameLayout frameLayout2 = (FrameLayout) this.d;
                View view = (View) obj;
                CharSequence charSequence = (CharSequence) obj2;
                kg5 kg5Var = kg5VarArr[0];
                if (kg5Var != null) {
                    kg5Var.f(true);
                }
                SpannableStringBuilder R2 = hl.R2(charSequence);
                float x = ((View) ((View) view.getParent()).getParent()).getX() + ((View) view.getParent()).getX() + view.getX();
                float y = ((View) ((View) view.getParent()).getParent()).getY() + ((View) view.getParent()).getY() + view.getY();
                if (view instanceof y41) {
                    Layout layout = ((y41) view).getLayout();
                    CharSequence text = layout.getText();
                    if (text instanceof Spanned) {
                        Spanned spanned = (Spanned) text;
                        z41[] z41VarArr = (z41[]) spanned.getSpans(0, text.length(), z41.class);
                        if (z41VarArr.length > 0 && (z41Var = z41VarArr[0]) != null) {
                            x += layout.getPrimaryHorizontal(spanned.getSpanStart(z41Var)) + (z41VarArr[0].a() / 2);
                            y += layout.getLineTop(layout.getLineForOffset(r13));
                        }
                    }
                }
                kg5 kg5Var2 = new kg5(fzVar.getContext(), 3);
                kg5VarArr[0] = kg5Var2;
                kg5Var2.p(true);
                kg5Var2.m(11.0f, 8.0f, 11.0f, 7.0f);
                kg5Var2.q(10.0f);
                kg5Var2.t(R2);
                kg5Var2.r0 = new ug(kg5Var2, r2 ? (byte) 1 : (byte) 0);
                kg5Var2.setTranslationY((-hl.L(100.0f)) + y);
                kg5Var2.h = hl.L(300.0f);
                kg5Var2.setPadding(hl.L(4.0f), hl.L(4.0f), hl.L(4.0f), hl.L(4.0f));
                kg5Var2.o(0.0f, x - hl.L(4.0f));
                frameLayout2.addView(kg5Var2, tre.e(-1, 100, 55));
                kg5Var2.v();
                break;
            case 4:
                rv0 rv0Var = (rv0) this.b;
                pv0 pv0Var = (pv0) this.c;
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) this.d;
                String str4 = (String) obj;
                ArrayList arrayList2 = (ArrayList) obj2;
                if (TextUtils.isEmpty(str4)) {
                    rv0Var.u(pv0Var, "prepared_message_sent", null);
                    uu0 uu0Var = rv0Var.c;
                    if (uu0Var != null) {
                        uu0Var.c();
                    }
                    hl.d3(new a30(botWebViewContainer$BotWebViewProxy, arrayList2, (byte) 19), 500L);
                    break;
                } else {
                    rv0Var.u(pv0Var, "prepared_message_failed", rv0.x(str4, "error"));
                    break;
                }
            case 5:
                float[] fArr = (float[]) this.b;
                boolean[] zArr = (boolean[]) this.c;
                o97 o97Var = (o97) this.d;
                fArr[0] = ((Float) obj).floatValue();
                zArr[0] = ((Boolean) obj2).booleanValue();
                hl.r(o97Var);
                hl.c3(o97Var);
                break;
            case 6:
                zu1 zu1Var = (zu1) this.b;
                TL_account.getWebPagePreview getwebpagepreview = (TL_account.getWebPagePreview) this.c;
                pn1 pn1Var = (pn1) this.d;
                Boolean bool = (Boolean) obj;
                TLRPC.WebPage webPage = (TLRPC.WebPage) obj2;
                zu1Var.getClass();
                if (bool.booleanValue() && !(webPage instanceof TLRPC.TL_webPagePending)) {
                    Iterator it = zu1Var.bc.keySet().iterator();
                    while (it.hasNext() && zu1Var.bc.size() > 5) {
                        it.next();
                        it.remove();
                    }
                    zu1Var.bc.put(getwebpagepreview.message, webPage);
                }
                pn1Var.a(bool, webPage);
                break;
            case 7:
                ((ConnectionsManager) this.b).lambda$sendRequestTypedAndProcessUpdates$5((Executor) this.c, (icc) this.d, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                break;
            case 8:
                final uj3 uj3Var = (uj3) this.b;
                gi1 gi1Var = (gi1) this.c;
                id idVar2 = (id) this.d;
                e eVar = (e) obj;
                final Long l = (Long) obj2;
                ku0 ku0Var = new ku0((Object) uj3Var, (Object) l, (Object) gi1Var, (Object) eVar, (byte) 7);
                gt gtVar = new gt(uj3Var, idVar2, l, (byte) 14);
                final Object[] objArr6 = objArr == true ? 1 : 0;
                pcc pccVar = new pcc() { // from class: jh3
                    @Override // pcc
                    public final void a(Object obj3) {
                        byte b3 = objArr6;
                        Long l2 = l;
                        switch (b3) {
                            case 0:
                                Runnable runnable = (Runnable) obj3;
                                uj3 uj3Var2 = uj3Var;
                                if (uj3Var2.H.bot_admin_rights == null) {
                                    runnable.run();
                                    break;
                                } else {
                                    TLRPC.User X1 = uj3Var2.getMessagesController().X1(Long.valueOf(uj3Var2.I));
                                    uc7 messagesController = uj3Var2.getMessagesController();
                                    long longValue = l2.longValue();
                                    TLRPC.RequestPeerType requestPeerType = uj3Var2.H;
                                    TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                                    Boolean bool2 = requestPeerType.bot_participant;
                                    messagesController.d5(longValue, X1, tL_chatAdminRights, null, false, uj3Var2, bool2 == null || !bool2.booleanValue(), true, null, runnable, new td(runnable, (byte) 10));
                                    break;
                                }
                            default:
                                Runnable runnable2 = (Runnable) obj3;
                                uj3 uj3Var3 = uj3Var;
                                if (uj3Var3.H.user_admin_rights == null) {
                                    runnable2.run();
                                    break;
                                } else {
                                    uj3Var3.getMessagesController().d5(l2.longValue(), yac.h(uj3Var3.getAccountInstance().a).f(), pd2.o0(uj3Var3.getMessagesController().M0(l2).admin_rights, uj3Var3.H.user_admin_rights), null, true, uj3Var3, false, true, null, runnable2, new td(runnable2, (byte) 9));
                                    break;
                                }
                        }
                    }
                };
                final byte b3 = r2 ? (byte) 1 : (byte) 0;
                Utilities.u(0, ku0Var, gtVar, pccVar, new pcc() { // from class: jh3
                    @Override // pcc
                    public final void a(Object obj3) {
                        byte b32 = b3;
                        Long l2 = l;
                        switch (b32) {
                            case 0:
                                Runnable runnable = (Runnable) obj3;
                                uj3 uj3Var2 = uj3Var;
                                if (uj3Var2.H.bot_admin_rights == null) {
                                    runnable.run();
                                    break;
                                } else {
                                    TLRPC.User X1 = uj3Var2.getMessagesController().X1(Long.valueOf(uj3Var2.I));
                                    uc7 messagesController = uj3Var2.getMessagesController();
                                    long longValue = l2.longValue();
                                    TLRPC.RequestPeerType requestPeerType = uj3Var2.H;
                                    TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                                    Boolean bool2 = requestPeerType.bot_participant;
                                    messagesController.d5(longValue, X1, tL_chatAdminRights, null, false, uj3Var2, bool2 == null || !bool2.booleanValue(), true, null, runnable, new td(runnable, (byte) 10));
                                    break;
                                }
                            default:
                                Runnable runnable2 = (Runnable) obj3;
                                uj3 uj3Var3 = uj3Var;
                                if (uj3Var3.H.user_admin_rights == null) {
                                    runnable2.run();
                                    break;
                                } else {
                                    uj3Var3.getMessagesController().d5(l2.longValue(), yac.h(uj3Var3.getAccountInstance().a).f(), pd2.o0(uj3Var3.getMessagesController().M0(l2).admin_rights, uj3Var3.H.user_admin_rights), null, true, uj3Var3, false, true, null, runnable2, new td(runnable2, (byte) 9));
                                    break;
                                }
                        }
                    }
                }, new hu0(uj3Var, idVar2, l, gi1Var, eVar, (byte) 5));
                break;
            case 9:
                ov4 ov4Var = (ov4) this.b;
                pcc pccVar2 = (pcc) this.c;
                lv4 lv4Var = (lv4) this.d;
                TL_payments.TL_StarGiftAuctionAcquiredGifts tL_StarGiftAuctionAcquiredGifts = (TL_payments.TL_StarGiftAuctionAcquiredGifts) obj;
                if (tL_StarGiftAuctionAcquiredGifts == null) {
                    pccVar2.a(null);
                    break;
                } else {
                    ov4Var.getMessagesController().j4(tL_StarGiftAuctionAcquiredGifts.users, false);
                    ov4Var.getMessagesController().c4(tL_StarGiftAuctionAcquiredGifts.chats, false);
                    ArrayList<TL_stars.TL_StarGiftAuctionAcquiredGift> arrayList3 = tL_StarGiftAuctionAcquiredGifts.gifts;
                    lv4Var.g = arrayList3;
                    pccVar2.a(arrayList3);
                    break;
                }
            case 10:
                ov4 ov4Var2 = (ov4) this.b;
                lv4 lv4Var2 = (lv4) this.c;
                ky kyVar = (ky) this.d;
                TLRPC.payments_PaymentResult payments_paymentresult = (TLRPC.payments_PaymentResult) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                lv4Var2.f = false;
                if (payments_paymentresult instanceof TLRPC.TL_payments_paymentResult) {
                    Utilities.d.c(new ve2(ov4Var2, (TLRPC.TL_payments_paymentResult) payments_paymentresult, (byte) 4));
                    kyVar.a(Boolean.TRUE, null);
                    break;
                } else {
                    Boolean bool2 = Boolean.FALSE;
                    if (tL_error2 != null) {
                        kyVar.a(bool2, tL_error2.text);
                        break;
                    } else {
                        kyVar.a(bool2, null);
                        break;
                    }
                }
            case 11:
                ow4 ow4Var = (ow4) this.b;
                l01 l01Var3 = (l01) this.c;
                id idVar3 = (id) this.d;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                if (updates != null && tL_error3 == null) {
                    uc7.s1(ow4Var.a).Y3(updates, false);
                }
                hl.c3(new la7((Object) ow4Var, (Object) l01Var3, (Object) idVar3, (Object) updates, (Object) tL_error3, (byte) 29));
                break;
            case 12:
                c cVar = (c) this.b;
                String str5 = (String) this.c;
                icc iccVar = (icc) this.d;
                TL_wallet.userAddresses useraddresses = (TL_wallet.userAddresses) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                int i3 = cVar.a;
                if (useraddresses == null || useraddresses.addresses.size() <= 0) {
                    cVar.l0(new gt(cVar, iccVar, str5, b2), str5);
                    break;
                } else {
                    uc7.s1(i3).j4(useraddresses.users, false);
                    kf7.a0(i3).n1(useraddresses.users, null, true, true);
                    TL_wallet.walletUserAddress walletuseraddress = useraddresses.addresses.get(0);
                    long j3 = walletuseraddress.user_id;
                    if (j3 != 0) {
                        cVar.O.put(Long.valueOf(j3), walletuseraddress);
                    }
                    cVar.P.put(walletuseraddress.address, walletuseraddress);
                    iccVar.a(walletuseraddress, tL_error4 != null ? tL_error4.text : null);
                    break;
                }
                break;
            case 13:
                c cVar2 = (c) this.b;
                icc iccVar2 = (icc) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                TL_wallet.userAddresses useraddresses2 = (TL_wallet.userAddresses) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                if (useraddresses2 == null || useraddresses2.addresses.size() <= 0) {
                    iccVar2.a(null, tL_error5 == null ? null : tL_error5.text);
                    break;
                } else {
                    uc7.s1(cVar2.a).j4(useraddresses2.users, false);
                    TL_wallet.walletUserAddress walletuseraddress2 = useraddresses2.addresses.get(0);
                    long j4 = walletuseraddress2.user_id;
                    if (j4 != 0) {
                        long j5 = user.id;
                        if (j4 == j5) {
                            cVar2.O.put(Long.valueOf(j5), walletuseraddress2);
                            cVar2.P.put(walletuseraddress2.address, walletuseraddress2);
                            iccVar2.a(walletuseraddress2, null);
                            break;
                        }
                    }
                    iccVar2.a(null, tL_error5 == null ? null : tL_error5.text);
                    break;
                }
            case 14:
                c cVar3 = (c) this.b;
                pcc pccVar3 = (pcc) this.c;
                TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) this.d;
                c35 c35Var = (c35) obj;
                String str6 = (String) obj2;
                if (str6 == null) {
                    if (c35Var != null) {
                        k35 k35Var = cVar3.c;
                        if (k35Var == null) {
                            pccVar3.a("STORAGE_NULL");
                            break;
                        } else if (TextUtils.equals(k35Var.c, tL_walletState.address)) {
                            cVar3.c.q(yac.h(cVar3.a).e(), tL_walletState.public_key, c35Var, new rx1((Object) c35Var.b(), (Object) pccVar3, (byte) 25));
                            break;
                        } else {
                            pccVar3.a("STORAGE_CHANGED");
                            break;
                        }
                    } else {
                        str6 = "LOCAL_STORAGE_ERROR";
                    }
                }
                pccVar3.a(str6);
                break;
            case 15:
                c cVar4 = (c) this.b;
                w58 w58Var = (w58) this.c;
                String str7 = (String) this.d;
                TL_wallet.walletTransactions wallettransactions = (TL_wallet.walletTransactions) obj;
                if (wallettransactions != null && !wallettransactions.transactions.isEmpty()) {
                    TL_wallet.walletTransaction wallettransaction = wallettransactions.transactions.get(0);
                    cVar4.N.put(str7, wallettransaction);
                    w58Var.a(wallettransaction);
                    break;
                } else {
                    w58Var.a(null);
                    break;
                }
                break;
            case 16:
                nu0 nu0Var = (nu0) this.b;
                String str8 = (String) this.c;
                String str9 = (String) this.d;
                c35 c35Var2 = (c35) obj;
                String str10 = (String) obj2;
                if (c35Var2 == null) {
                    c.m("decrypting transaction comment, failed to get secret phrase");
                    if (str10 == null) {
                        str10 = "NULL_ERROR";
                    }
                    nu0Var.a(null, str10);
                    break;
                } else {
                    try {
                        nu0Var.a(WalletEngine2.decryptComment(c35Var2, str8, str9), null);
                        break;
                    } catch (Exception e) {
                        c.n("failed to decrypt comment", e);
                        nu0Var.a(null, e.getMessage() != null ? e.getMessage() : "NULL_ERROR");
                        return;
                    }
                }
            case 17:
                c cVar5 = (c) this.b;
                rx1 rx1Var = (rx1) this.c;
                TL_wallet.enableBackup enablebackup = (TL_wallet.enableBackup) this.d;
                WalletEngine2.ImportedWalletProof importedWalletProof = (WalletEngine2.ImportedWalletProof) obj;
                String str11 = (String) obj2;
                if (importedWalletProof == null) {
                    if (str11 == null) {
                        str11 = "NULL_ERROR";
                    }
                    rx1Var.a(str11);
                    break;
                } else {
                    TL_wallet.walletOwnershipProof walletownershipproof = new TL_wallet.walletOwnershipProof();
                    enablebackup.proof = walletownershipproof;
                    walletownershipproof.timestamp = importedWalletProof.timestamp;
                    walletownershipproof.signature = importedWalletProof.signature;
                    ConnectionsManager.getInstance(cVar5.a).sendRequestTyped(enablebackup, new ic(objArr2 == true ? 1 : 0), new qe2((Object) cVar5, (Object) rx1Var, (byte) 19));
                    break;
                }
            case 18:
                c cVar6 = (c) this.b;
                dtc dtcVar = (dtc) this.c;
                z25 z25Var = (z25) this.d;
                c35 c35Var3 = (c35) obj;
                String str12 = (String) obj2;
                int i4 = cVar6.a;
                if (c35Var3 == null) {
                    c.m("disable backup: no current phrase ".concat(str12 == null ? "NULL_ERROR" : str12));
                    if (str12 == null) {
                        str12 = "NULL_ERROR";
                    }
                    dtcVar.a(str12);
                    break;
                } else {
                    c.P("disable backup: ready!");
                    if (cVar6.b == null) {
                        c.m("disable backup: no engine");
                        dtcVar.a("NULL_ENGINE");
                        break;
                    } else {
                        String x2 = cVar6.x();
                        byte[] D = cVar6.D();
                        if (TextUtils.isEmpty(x2)) {
                            c.m("disable backup: empty address");
                            dtcVar.a("NULL_ADDRESS");
                            break;
                        } else if (D == null || D.length <= 0) {
                            c.m("disable backup: no public key");
                            dtcVar.a("NULL_PUBLIC_KEY");
                            break;
                        } else {
                            try {
                                c35 b4 = z25Var.b.b();
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
                                ao1 ao1Var = new ao1(cVar6, b4, wallettransaction2, G, (byte) 23);
                                TL_wallet.sendTransfer sendtransfer = z25Var.a;
                                wallettransaction2.gasless = sendtransfer.data_gasless != null;
                                wallettransaction2.random_id = sendtransfer.random_id;
                                wallettransaction2.gaslessMessageBodyHash = sendtransfer.gaslessMessageBodyHash;
                                wallettransaction2.normalMessageBodyHash = sendtransfer.normalMessageBodyHash;
                                cVar6.p.add(0, wallettransaction2);
                                G.k();
                                G.i();
                                cVar6.a0();
                                dtcVar.a(null);
                                c.P("disable backup: prepared sendTransfer, sending");
                                ConnectionsManager.getInstance(i4).sendRequestTyped(z25Var.a, new ic(objArr3 == true ? 1 : 0), new pm1(cVar6, ao1Var, z25Var, b4, wallettransaction2, (byte) 3));
                                break;
                            } catch (IllegalStateException unused) {
                                dtcVar.a("CANCELLED");
                                return;
                            }
                        }
                    }
                }
                break;
            case 19:
                hl.c3(new tw4(this.b, obj, this.c, this.d, obj2, (byte) 1));
                break;
            case 20:
                a55 a55Var = (a55) this.b;
                x45 x45Var = (x45) this.c;
                v35 v35Var = (v35) this.d;
                TLRPC.Bool bool3 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj2;
                a55Var.getClass();
                Arrays.fill(x45Var.b, (byte) 0);
                v35Var.a((tL_error6 == null && (bool3 instanceof TLRPC.TL_boolTrue)) ? null : a55.z(tL_error6, "submitConnectResult"));
                if (a55Var.e < 0) {
                    a55Var.e = a55Var.f.sendRequestTyped(new TL_wallet.tonConnectGetSessions(), new ic(objArr4 == true ? 1 : 0), new yt4(a55Var, b));
                    break;
                }
                break;
            case 21:
                a55 a55Var2 = (a55) this.b;
                w45 w45Var = (w45) this.c;
                j72 j72Var = (j72) this.d;
                TL_wallet.walletTransaction wallettransaction3 = (TL_wallet.walletTransaction) obj;
                Object obj3 = (String) obj2;
                a55Var2.getClass();
                w45Var.p = (w45Var.n || a55Var2.i(w45Var) || !a55Var2.A(w45Var) || wallettransaction3 == null || !wallettransaction3.traceSucceeded || wallettransaction3.traceIncomplete) ? false : true;
                j72Var.a(wallettransaction3, obj3);
                break;
            case 22:
                boolean[] zArr2 = (boolean[]) this.b;
                gd7 gd7Var = (gd7) this.c;
                pq7 pq7Var = (pq7) this.d;
                TL_wallet.walletTransaction wallettransaction4 = (TL_wallet.walletTransaction) obj;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    hl.r(gd7Var);
                    if (wallettransaction4 != null) {
                        long j6 = wallettransaction4.fee;
                        if (j6 > 0) {
                            j = j6;
                            pq7Var.a(Long.valueOf(j));
                            break;
                        }
                    }
                    j = 0;
                    pq7Var.a(Long.valueOf(j));
                }
                break;
            case 23:
                vra vraVar = (vra) this.b;
                icc iccVar3 = (icc) this.c;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.d;
                TL_stars.StarGiftOnchainSalePayload starGiftOnchainSalePayload = (TL_stars.StarGiftOnchainSalePayload) obj;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj2;
                if (vraVar != null) {
                    vraVar.a(Boolean.FALSE);
                }
                if (starGiftOnchainSalePayload instanceof TL_stars.TL_payments_starGiftOnchainSalePayload) {
                    TL_stars.TL_payments_starGiftOnchainSalePayload tL_payments_starGiftOnchainSalePayload = (TL_stars.TL_payments_starGiftOnchainSalePayload) starGiftOnchainSalePayload;
                    if (!TextUtils.isEmpty(tL_payments_starGiftOnchainSalePayload.nft_address)) {
                        long j7 = tL_payments_starGiftOnchainSalePayload.amount;
                        if (j7 > 0 && (bArr = tL_payments_starGiftOnchainSalePayload.payload) != null && bArr.length > 0 && !tL_payments_starGiftOnchainSalePayload.gasless_available) {
                            a35Var = new a35(tL_payments_starGiftOnchainSalePayload.nft_address, j7, bArr, null, 3);
                            if (a35Var != null) {
                                if (tL_error7 == null) {
                                    tL_error7 = new TLRPC.TL_error();
                                    tL_error7.text = "WALLET_UNSUPPORTED_SEND_MODE";
                                }
                                iccVar3.a(null, tL_error7);
                                break;
                            } else {
                                a35Var.h = new TL_wallet.walletOnchainGiftActionBuy();
                                a35Var.i = tL_starGiftUnique;
                                a35Var.j = true;
                                iccVar3.a(a35Var, null);
                                break;
                            }
                        }
                    }
                }
                a35Var = null;
                if (a35Var != null) {
                }
                break;
            case 24:
                nx0 nx0Var = (nx0) this.b;
                TL_account.Passkey passkey = (TL_account.Passkey) this.c;
                String str13 = (String) this.d;
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj2;
                if (passkeys != null) {
                    nx0Var.dismiss();
                    while (i < passkeys.passkeys.size()) {
                        if (TextUtils.equals(passkeys.passkeys.get(i).id, passkey.id)) {
                            passkeys.passkeys.remove(i);
                            i--;
                        }
                        i++;
                    }
                    e S2 = LaunchActivity.S();
                    if (S2 != null) {
                        PasskeysActivity passkeysActivity = new PasskeysActivity(passkeys.passkeys);
                        S2.presentFragment(passkeysActivity);
                        hl.d3(new ql7(passkeysActivity, passkey, b2), 150L);
                        break;
                    }
                } else if (tL_error8 != null) {
                    new d31(nx0Var.F, nx0Var.J0).f0(str13, false);
                    break;
                }
                break;
            case 25:
                md9 md9Var = (md9) this.b;
                l01 l01Var4 = (l01) this.c;
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) this.d;
                l01Var4.b();
                if (((Boolean) obj).booleanValue()) {
                    m62 m62Var = md9Var.a2;
                    if (m62Var != null) {
                        m62Var.a(tL_starGiftUnique2);
                    }
                    md9Var.dismiss();
                    break;
                }
                break;
            case 26:
                wua wuaVar = (wua) this.b;
                kg5[] kg5VarArr2 = (kg5[]) this.c;
                FrameLayout frameLayout3 = (FrameLayout) this.d;
                View view2 = (View) obj;
                CharSequence charSequence2 = (CharSequence) obj2;
                kg5 kg5Var3 = kg5VarArr2[0];
                if (kg5Var3 != null) {
                    kg5Var3.f(true);
                }
                SpannableStringBuilder R22 = hl.R2(charSequence2);
                float x3 = ((View) ((View) view2.getParent()).getParent()).getX() + ((View) view2.getParent()).getX() + view2.getX();
                float y2 = ((View) ((View) view2.getParent()).getParent()).getY() + ((View) view2.getParent()).getY() + view2.getY();
                if (view2 instanceof y41) {
                    Layout layout2 = ((y41) view2).getLayout();
                    CharSequence text2 = layout2.getText();
                    if (text2 instanceof Spanned) {
                        Spanned spanned2 = (Spanned) text2;
                        z41[] z41VarArr2 = (z41[]) spanned2.getSpans(0, text2.length(), z41.class);
                        if (z41VarArr2.length > 0 && (z41Var2 = z41VarArr2[0]) != null) {
                            x3 += layout2.getPrimaryHorizontal(spanned2.getSpanStart(z41Var2)) + (z41VarArr2[0].a() / 2);
                            y2 += layout2.getLineTop(layout2.getLineForOffset(r4));
                        }
                    }
                }
                kg5 kg5Var4 = new kg5(wuaVar.getContext(), 3);
                kg5VarArr2[0] = kg5Var4;
                kg5Var4.p(true);
                kg5Var4.m(11.0f, 8.0f, 11.0f, 7.0f);
                kg5Var4.q(10.0f);
                kg5Var4.t(R22);
                kg5Var4.r0 = new ug(kg5Var4, (byte) 9);
                kg5Var4.setTranslationY((-hl.L(100.0f)) + y2);
                kg5Var4.h = hl.L(300.0f);
                kg5Var4.setPadding(hl.L(4.0f), hl.L(4.0f), hl.L(4.0f), hl.L(4.0f));
                kg5Var4.o(0.0f, x3 - hl.L(4.0f));
                frameLayout3.addView(kg5Var4, tre.e(-1, 100, 55));
                kg5Var4.v();
                break;
            case 27:
                gpc gpcVar = (gpc) this.b;
                c cVar7 = (c) this.c;
                ConnectionsManager connectionsManager = (ConnectionsManager) this.d;
                Vector vector = (Vector) obj;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) obj2;
                if (vector == null) {
                    if (tL_error9 == null || (str2 = tL_error9.text) == null) {
                        str2 = "NULL_ERROR";
                    }
                    gpcVar.a(str2);
                    if (tL_error9 != null && (str3 = tL_error9.text) != null) {
                        str = str3;
                    }
                    d31.c0(str);
                    break;
                } else if (vector.objects.size() <= 0) {
                    gpcVar.a("NO_PROVIDERS");
                    d31.c0("NO_PROVIDERS");
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
                                gpcVar.a("NO_SUITABLE_PROVIDER");
                                d31.c0("NO_SUITABLE_PROVIDER");
                                break;
                            } else {
                                TL_toncenter.createOnrampSession createonrampsession = new TL_toncenter.createOnrampSession();
                                createonrampsession.address = cVar7.x();
                                createonrampsession.crypto_currency = "gram";
                                createonrampsession.base_currency = cVar7.h.g();
                                createonrampsession.provider = onrampproviderinfo.id;
                                connectionsManager.sendRequestTyped(createonrampsession, new ic(objArr5 == true ? 1 : 0), new l8b(gpcVar, (byte) 11));
                                break;
                            }
                        }
                    }
                    if (onrampproviderinfo != null) {
                    }
                }
                break;
            default:
                gtc gtcVar = (gtc) this.b;
                id idVar4 = (id) this.c;
                c cVar8 = (c) this.d;
                Long l2 = (Long) obj;
                String str14 = (String) obj2;
                idVar4.dismiss();
                if (l2 == null) {
                    d31 b0 = d31.b0(gtcVar);
                    if (str14 == null) {
                        str14 = "NULL_ERROR";
                    }
                    b0.f0(str14, false);
                    break;
                } else {
                    Activity parentActivity = gtcVar.getParentActivity();
                    if (parentActivity != null) {
                        sg2 sg2Var = new sg2(1, gtcVar.getResourceProvider(), parentActivity);
                        int i6 = aob.i6;
                        hf0 f0 = aob.f0(gtcVar.getThemedColor(i6), 7, hl.L(12.0f));
                        uob M = yob.M(i6);
                        vnb resourceProvider = gtcVar.getResourceProvider();
                        sg2Var.setBackground(f0);
                        yob.j(sg2Var, f0, null, M, resourceProvider);
                        sg2Var.e(ob6.M0(2131742600, null), "", false, false, false);
                        sg2Var.setMultiline(true);
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) sg2Var.getCheckBoxView().getLayoutParams();
                        layoutParams.topMargin = 0;
                        layoutParams.gravity = (ob6.a0 ? 5 : 3) | 16;
                        sg2Var.getCheckBoxView().setLayoutParams(layoutParams);
                        sg2Var.setPadding(ob6.a0 ? hl.L(4.0f) : 0, hl.L(12.0f), ob6.a0 ? 0 : hl.L(4.0f), hl.L(12.0f));
                        TextView textView = new TextView(parentActivity);
                        textView.setTextSize(1, 14.0f);
                        yob.X(textView, aob.j5, gtcVar.getResourceProvider());
                        textView.setGravity(17);
                        int L = hl.L(10.0f);
                        int i7 = aob.a7;
                        ShapeDrawable b02 = aob.b0(L, gtcVar.getThemedColor(i7));
                        uob M2 = yob.M(i7);
                        vnb resourceProvider2 = gtcVar.getResourceProvider();
                        textView.setBackground(b02);
                        yob.j(textView, b02, M2, null, resourceProvider2);
                        textView.setPadding(hl.L(16.0f), hl.L(12.0f), hl.L(16.0f), hl.L(12.0f));
                        textView.setText(l2.longValue() > 0 ? ob6.V(null, null, 2131742598, c.r(l2.longValue(), false), cVar8.q(l2.longValue(), true)) : ob6.M0(2131742599, null));
                        textView.setVisibility(8);
                        sg2Var.setOnClickListener(new jjb(sg2Var, textView, b2));
                        LinearLayout m = bs2.m(parentActivity, 1);
                        m.addView(sg2Var, tre.t(-1, -2, 83, 8, 0, 8, 0));
                        m.addView(textView, tre.k(16.0f, 8.0f, 16.0f, 16.0f, -1, -2));
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, gtcVar.getResourceProvider(), parentActivity);
                        alertDialog$Builder.a.S = ob6.M0(2131742782, null);
                        String M0 = ob6.M0(2131742783, null);
                        id idVar5 = alertDialog$Builder.a;
                        idVar5.U = M0;
                        idVar5.H = (byte) 6;
                        alertDialog$Builder.n(m);
                        alertDialog$Builder.a.a = hl.L(312.0f);
                        alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                        alertDialog$Builder.j(ob6.M0(2131742787, null), new pt((Object) gtcVar, (Object) sg2Var, (Object) cVar8, (Object) l2, (byte) 27));
                        id idVar6 = alertDialog$Builder.a;
                        gtcVar.showDialog(idVar6);
                        TextView textView2 = (TextView) idVar6.c(-1);
                        if (textView2 != null) {
                            yob.X(textView2, aob.q7, idVar6.j1);
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
