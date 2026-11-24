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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class p implements i8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ p(c cVar, eu0 eu0Var, String str, String str2) {
        this.a = (byte) 16;
        this.b = eu0Var;
        this.c = str;
        this.d = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0b15  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0256  */
    @Override // i8c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2) {
        String str;
        d S;
        r41 r41Var;
        long j;
        r41 r41Var2;
        String str2;
        String str3;
        byte b = 7;
        byte b2 = 19;
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
                c01 c01Var = (c01) this.c;
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) this.d;
                c01Var.c(false);
                ic O1 = na7.q1(a1Var.a).O1();
                O1.b.remove(tL_aiComposeTone);
                O1.d();
                O1.c();
                a1Var.v1();
                break;
            case 1:
                e0 e0Var = (e0) this.b;
                wjb wjbVar = (wjb) this.c;
                TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                e0Var.a2.setLoading(false);
                if (tL_error != null) {
                    boolean equalsIgnoreCase = "TONES_SAVED_TOO_MANY".equalsIgnoreCase(tL_error.text);
                    FrameLayout frameLayout = e0Var.Z1;
                    if (equalsIgnoreCase) {
                        a1.q1(new u21(frameLayout, wjbVar), e0Var.a);
                        break;
                    } else {
                        ug8.u(frameLayout, wjbVar, tL_error, false);
                        break;
                    }
                } else {
                    ic O12 = na7.q1(e0Var.a).O1();
                    ArrayList arrayList = O12.b;
                    if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
                        long j2 = ((TL_aicompose.TL_aiComposeTone) aiComposeTone).id;
                        for (int i2 = 0; i2 < arrayList.size(); i2++) {
                            if ((arrayList.get(i2) instanceof TL_aicompose.TL_aiComposeTone) && ((TL_aicompose.TL_aiComposeTone) arrayList.get(i2)).id == j2) {
                                e0Var.dismiss();
                                S = LaunchActivity.S();
                                if (S == null) {
                                    u21.b0(S).p(aiComposeTone.emoji_id, k96.M0(2131754958, null), k96.a0(null, null, 2131754959, aiComposeTone.title)).j();
                                    break;
                                }
                            }
                        }
                    }
                    arrayList.add(0, aiComposeTone);
                    O12.d();
                    O12.c();
                    e0Var.dismiss();
                    S = LaunchActivity.S();
                    if (S == null) {
                    }
                }
                break;
            case 2:
                r0 r0Var = (r0) this.b;
                c01 c01Var2 = (c01) this.c;
                hd hdVar = (hd) this.d;
                c01Var2.c(false);
                hdVar.dismiss();
                r0Var.dismiss();
                ic O13 = na7.q1(r0Var.a).O1();
                O13.b.remove(r0Var.e2);
                O13.d();
                O13.c();
                break;
            case 3:
                ez ezVar = (ez) this.b;
                je5[] je5VarArr = (je5[]) this.c;
                FrameLayout frameLayout2 = (FrameLayout) this.d;
                View view = (View) obj;
                CharSequence charSequence = (CharSequence) obj2;
                je5 je5Var = je5VarArr[0];
                if (je5Var != null) {
                    je5Var.f(true);
                }
                SpannableStringBuilder R2 = gl.R2(charSequence);
                float x = ((View) ((View) view.getParent()).getParent()).getX() + ((View) view.getParent()).getX() + view.getX();
                float y = ((View) ((View) view.getParent()).getParent()).getY() + ((View) view.getParent()).getY() + view.getY();
                if (view instanceof q41) {
                    Layout layout = ((q41) view).getLayout();
                    CharSequence text = layout.getText();
                    if (text instanceof Spanned) {
                        Spanned spanned = (Spanned) text;
                        r41[] r41VarArr = (r41[]) spanned.getSpans(0, text.length(), r41.class);
                        if (r41VarArr.length > 0 && (r41Var = r41VarArr[0]) != null) {
                            x += layout.getPrimaryHorizontal(spanned.getSpanStart(r41Var)) + (r41VarArr[0].a() / 2);
                            y += layout.getLineTop(layout.getLineForOffset(r13));
                        }
                    }
                }
                je5 je5Var2 = new je5(ezVar.getContext(), 3);
                je5VarArr[0] = je5Var2;
                je5Var2.p(true);
                je5Var2.m(11.0f, 8.0f, 11.0f, 7.0f);
                je5Var2.q(10.0f);
                je5Var2.t(R2);
                je5Var2.r0 = new hh(je5Var2, r2 ? (byte) 1 : (byte) 0);
                je5Var2.setTranslationY((-gl.L(100.0f)) + y);
                je5Var2.h = gl.L(300.0f);
                je5Var2.setPadding(gl.L(4.0f), gl.L(4.0f), gl.L(4.0f), gl.L(4.0f));
                je5Var2.o(0.0f, x - gl.L(4.0f));
                frameLayout2.addView(je5Var2, nme.e(-1, 100, 55));
                je5Var2.v();
                break;
            case 4:
                hv0 hv0Var = (hv0) this.b;
                ev0 ev0Var = (ev0) this.c;
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) this.d;
                String str4 = (String) obj;
                ArrayList arrayList2 = (ArrayList) obj2;
                if (TextUtils.isEmpty(str4)) {
                    hv0Var.u(ev0Var, "prepared_message_sent", null);
                    ku0 ku0Var = hv0Var.c;
                    if (ku0Var != null) {
                        ku0Var.c();
                    }
                    gl.d3(new z20(botWebViewContainer$BotWebViewProxy, arrayList2, b2), 500L);
                    break;
                } else {
                    hv0Var.u(ev0Var, "prepared_message_failed", hv0.x(str4, "error"));
                    break;
                }
            case 5:
                float[] fArr = (float[]) this.b;
                boolean[] zArr = (boolean[]) this.c;
                s67 s67Var = (s67) this.d;
                fArr[0] = ((Float) obj).floatValue();
                zArr[0] = ((Boolean) obj2).booleanValue();
                gl.r(s67Var);
                gl.c3(s67Var);
                break;
            case 6:
                mu1 mu1Var = (mu1) this.b;
                TL_account.getWebPagePreview getwebpagepreview = (TL_account.getWebPagePreview) this.c;
                wm1 wm1Var = (wm1) this.d;
                Boolean bool = (Boolean) obj;
                TLRPC.WebPage webPage = (TLRPC.WebPage) obj2;
                mu1Var.getClass();
                if (bool.booleanValue() && !(webPage instanceof TLRPC.TL_webPagePending)) {
                    Iterator it = mu1Var.Qb.keySet().iterator();
                    while (it.hasNext() && mu1Var.Qb.size() > 5) {
                        it.next();
                        it.remove();
                    }
                    mu1Var.Qb.put(getwebpagepreview.message, webPage);
                }
                wm1Var.a(bool, webPage);
                break;
            case 7:
                ((ConnectionsManager) this.b).lambda$sendRequestTypedAndProcessUpdates$5((Executor) this.c, (i8c) this.d, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                break;
            case 8:
                final cj3 cj3Var = (cj3) this.b;
                yh1 yh1Var = (yh1) this.c;
                hd hdVar2 = (hd) this.d;
                d dVar = (d) obj;
                final Long l = (Long) obj2;
                au0 au0Var = new au0((Object) cj3Var, (Object) l, (Object) yh1Var, (Object) dVar, (byte) 7);
                ht htVar = new ht(cj3Var, hdVar2, l, (byte) 14);
                final Object[] objArr6 = objArr == true ? 1 : 0;
                p8c p8cVar = new p8c() { // from class: ig3
                    @Override // p8c
                    public final void a(Object obj3) {
                        byte b3 = objArr6;
                        Long l2 = l;
                        switch (b3) {
                            case 0:
                                Runnable runnable = (Runnable) obj3;
                                cj3 cj3Var2 = cj3Var;
                                if (cj3Var2.H.bot_admin_rights == null) {
                                    runnable.run();
                                    break;
                                } else {
                                    TLRPC.User V1 = cj3Var2.getMessagesController().V1(Long.valueOf(cj3Var2.I));
                                    na7 messagesController = cj3Var2.getMessagesController();
                                    long longValue = l2.longValue();
                                    TLRPC.RequestPeerType requestPeerType = cj3Var2.H;
                                    TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                                    Boolean bool2 = requestPeerType.bot_participant;
                                    messagesController.V4(longValue, V1, tL_chatAdminRights, null, false, cj3Var2, bool2 == null || !bool2.booleanValue(), true, null, runnable, new ce(runnable, (byte) 10));
                                    break;
                                }
                            default:
                                Runnable runnable2 = (Runnable) obj3;
                                cj3 cj3Var3 = cj3Var;
                                if (cj3Var3.H.user_admin_rights == null) {
                                    runnable2.run();
                                    break;
                                } else {
                                    cj3Var3.getMessagesController().V4(l2.longValue(), y6c.h(cj3Var3.getAccountInstance().a).f(), zc2.o0(cj3Var3.getMessagesController().K0(l2).admin_rights, cj3Var3.H.user_admin_rights), null, true, cj3Var3, false, true, null, runnable2, new ce(runnable2, (byte) 9));
                                    break;
                                }
                        }
                    }
                };
                final byte b3 = r2 ? (byte) 1 : (byte) 0;
                Utilities.u(0, au0Var, htVar, p8cVar, new p8c() { // from class: ig3
                    @Override // p8c
                    public final void a(Object obj3) {
                        byte b32 = b3;
                        Long l2 = l;
                        switch (b32) {
                            case 0:
                                Runnable runnable = (Runnable) obj3;
                                cj3 cj3Var2 = cj3Var;
                                if (cj3Var2.H.bot_admin_rights == null) {
                                    runnable.run();
                                    break;
                                } else {
                                    TLRPC.User V1 = cj3Var2.getMessagesController().V1(Long.valueOf(cj3Var2.I));
                                    na7 messagesController = cj3Var2.getMessagesController();
                                    long longValue = l2.longValue();
                                    TLRPC.RequestPeerType requestPeerType = cj3Var2.H;
                                    TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                                    Boolean bool2 = requestPeerType.bot_participant;
                                    messagesController.V4(longValue, V1, tL_chatAdminRights, null, false, cj3Var2, bool2 == null || !bool2.booleanValue(), true, null, runnable, new ce(runnable, (byte) 10));
                                    break;
                                }
                            default:
                                Runnable runnable2 = (Runnable) obj3;
                                cj3 cj3Var3 = cj3Var;
                                if (cj3Var3.H.user_admin_rights == null) {
                                    runnable2.run();
                                    break;
                                } else {
                                    cj3Var3.getMessagesController().V4(l2.longValue(), y6c.h(cj3Var3.getAccountInstance().a).f(), zc2.o0(cj3Var3.getMessagesController().K0(l2).admin_rights, cj3Var3.H.user_admin_rights), null, true, cj3Var3, false, true, null, runnable2, new ce(runnable2, (byte) 9));
                                    break;
                                }
                        }
                    }
                }, new yt0(cj3Var, hdVar2, l, yh1Var, dVar, (byte) 5));
                break;
            case 9:
                kt4 kt4Var = (kt4) this.b;
                ht4 ht4Var = (ht4) this.c;
                jy jyVar = (jy) this.d;
                TLRPC.payments_PaymentResult payments_paymentresult = (TLRPC.payments_PaymentResult) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                ht4Var.f = false;
                if (payments_paymentresult instanceof TLRPC.TL_payments_paymentResult) {
                    Utilities.d.c(new ee2(kt4Var, (TLRPC.TL_payments_paymentResult) payments_paymentresult, (byte) 4));
                    jyVar.a(Boolean.TRUE, null);
                    break;
                } else {
                    Boolean bool2 = Boolean.FALSE;
                    if (tL_error2 != null) {
                        jyVar.a(bool2, tL_error2.text);
                        break;
                    } else {
                        jyVar.a(bool2, null);
                        break;
                    }
                }
            case 10:
                kt4 kt4Var2 = (kt4) this.b;
                p8c p8cVar2 = (p8c) this.c;
                ht4 ht4Var2 = (ht4) this.d;
                TL_payments.TL_StarGiftAuctionAcquiredGifts tL_StarGiftAuctionAcquiredGifts = (TL_payments.TL_StarGiftAuctionAcquiredGifts) obj;
                if (tL_StarGiftAuctionAcquiredGifts == null) {
                    p8cVar2.a(null);
                    break;
                } else {
                    kt4Var2.getMessagesController().b4(tL_StarGiftAuctionAcquiredGifts.users, false);
                    kt4Var2.getMessagesController().V3(tL_StarGiftAuctionAcquiredGifts.chats, false);
                    ArrayList<TL_stars.TL_StarGiftAuctionAcquiredGift> arrayList3 = tL_StarGiftAuctionAcquiredGifts.gifts;
                    ht4Var2.g = arrayList3;
                    p8cVar2.a(arrayList3);
                    break;
                }
            case 11:
                lu4 lu4Var = (lu4) this.b;
                c01 c01Var3 = (c01) this.c;
                hd hdVar3 = (hd) this.d;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                if (updates != null && tL_error3 == null) {
                    na7.q1(lu4Var.a).R3(updates, false);
                }
                gl.c3(new b87((Object) lu4Var, (Object) c01Var3, (Object) hdVar3, (Object) updates, (Object) tL_error3, (byte) 28));
                break;
            case 12:
                c cVar = (c) this.b;
                String str5 = (String) this.c;
                i8c i8cVar = (i8c) this.d;
                TL_wallet.userAddresses useraddresses = (TL_wallet.userAddresses) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                int i3 = cVar.a;
                if (useraddresses == null || useraddresses.addresses.size() <= 0) {
                    cVar.j0(new ht(cVar, i8cVar, str5, (byte) 18), str5);
                    break;
                } else {
                    na7.q1(i3).b4(useraddresses.users, false);
                    ad7.Y(i3).j1(useraddresses.users, null, true, true);
                    TL_wallet.walletUserAddress walletuseraddress = useraddresses.addresses.get(0);
                    long j3 = walletuseraddress.user_id;
                    if (j3 != 0) {
                        cVar.O.put(Long.valueOf(j3), walletuseraddress);
                    }
                    cVar.P.put(walletuseraddress.address, walletuseraddress);
                    i8cVar.a(walletuseraddress, tL_error4 != null ? tL_error4.text : null);
                    break;
                }
                break;
            case 13:
                c cVar2 = (c) this.b;
                i8c i8cVar2 = (i8c) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                TL_wallet.userAddresses useraddresses2 = (TL_wallet.userAddresses) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                if (useraddresses2 == null || useraddresses2.addresses.size() <= 0) {
                    i8cVar2.a(null, tL_error5 == null ? null : tL_error5.text);
                    break;
                } else {
                    na7.q1(cVar2.a).b4(useraddresses2.users, false);
                    TL_wallet.walletUserAddress walletuseraddress2 = useraddresses2.addresses.get(0);
                    long j4 = walletuseraddress2.user_id;
                    if (j4 != 0) {
                        long j5 = user.id;
                        if (j4 == j5) {
                            cVar2.O.put(Long.valueOf(j5), walletuseraddress2);
                            cVar2.P.put(walletuseraddress2.address, walletuseraddress2);
                            i8cVar2.a(walletuseraddress2, null);
                            break;
                        }
                    }
                    i8cVar2.a(null, tL_error5 == null ? null : tL_error5.text);
                    break;
                }
                break;
            case 14:
                c cVar3 = (c) this.b;
                p8c p8cVar3 = (p8c) this.c;
                TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) this.d;
                y05 y05Var = (y05) obj;
                String str6 = (String) obj2;
                if (str6 == null) {
                    if (y05Var != null) {
                        g15 g15Var = cVar3.c;
                        if (g15Var == null) {
                            p8cVar3.a("STORAGE_NULL");
                            break;
                        } else if (TextUtils.equals(g15Var.c, tL_walletState.address)) {
                            cVar3.c.q(y6c.h(cVar3.a).e(), tL_walletState.public_key, y05Var, new pz1((Object) y05Var.b(), (Object) p8cVar3, (byte) 24));
                            break;
                        } else {
                            p8cVar3.a("STORAGE_CHANGED");
                            break;
                        }
                    } else {
                        str6 = "LOCAL_STORAGE_ERROR";
                    }
                }
                p8cVar3.a(str6);
                break;
            case 15:
                c cVar4 = (c) this.b;
                f28 f28Var = (f28) this.c;
                String str7 = (String) this.d;
                TL_wallet.walletTransactions wallettransactions = (TL_wallet.walletTransactions) obj;
                if (wallettransactions != null && !wallettransactions.transactions.isEmpty()) {
                    TL_wallet.walletTransaction wallettransaction = wallettransactions.transactions.get(0);
                    cVar4.N.put(str7, wallettransaction);
                    f28Var.a(wallettransaction);
                    break;
                } else {
                    f28Var.a(null);
                    break;
                }
            case 16:
                eu0 eu0Var = (eu0) this.b;
                String str8 = (String) this.c;
                String str9 = (String) this.d;
                y05 y05Var2 = (y05) obj;
                String str10 = (String) obj2;
                if (y05Var2 == null) {
                    c.m("decrypting transaction comment, failed to get secret phrase");
                    if (str10 == null) {
                        str10 = "NULL_ERROR";
                    }
                    eu0Var.a(null, str10);
                    break;
                } else {
                    try {
                        eu0Var.a(WalletEngine2.decryptComment(y05Var2, str8, str9), null);
                        break;
                    } catch (Exception e) {
                        c.n("failed to decrypt comment", e);
                        eu0Var.a(null, e.getMessage() != null ? e.getMessage() : "NULL_ERROR");
                        return;
                    }
                }
            case 17:
                c cVar5 = (c) this.b;
                pz1 pz1Var = (pz1) this.c;
                TL_wallet.enableBackup enablebackup = (TL_wallet.enableBackup) this.d;
                WalletEngine2.ImportedWalletProof importedWalletProof = (WalletEngine2.ImportedWalletProof) obj;
                String str11 = (String) obj2;
                if (importedWalletProof == null) {
                    if (str11 == null) {
                        str11 = "NULL_ERROR";
                    }
                    pz1Var.a(str11);
                    break;
                } else {
                    TL_wallet.walletOwnershipProof walletownershipproof = new TL_wallet.walletOwnershipProof();
                    enablebackup.proof = walletownershipproof;
                    walletownershipproof.timestamp = importedWalletProof.timestamp;
                    walletownershipproof.signature = importedWalletProof.signature;
                    ConnectionsManager.getInstance(cVar5.a).sendRequestTyped(enablebackup, new hc(objArr2 == true ? 1 : 0), new ae2(cVar5, pz1Var, b2));
                    break;
                }
            case 18:
                c cVar6 = (c) this.b;
                qoc qocVar = (qoc) this.c;
                v05 v05Var = (v05) this.d;
                y05 y05Var3 = (y05) obj;
                String str12 = (String) obj2;
                int i4 = cVar6.a;
                if (y05Var3 == null) {
                    c.m("disable backup: no current phrase ".concat(str12 == null ? "NULL_ERROR" : str12));
                    if (str12 == null) {
                        str12 = "NULL_ERROR";
                    }
                    qocVar.a(str12);
                    break;
                } else {
                    c.O("disable backup: ready!");
                    if (cVar6.b == null) {
                        c.m("disable backup: no engine");
                        qocVar.a("NULL_ENGINE");
                        break;
                    } else {
                        String x2 = cVar6.x();
                        byte[] D = cVar6.D();
                        if (TextUtils.isEmpty(x2)) {
                            c.m("disable backup: empty address");
                            qocVar.a("NULL_ADDRESS");
                            break;
                        } else if (D == null || D.length <= 0) {
                            c.m("disable backup: no public key");
                            qocVar.a("NULL_PUBLIC_KEY");
                            break;
                        } else {
                            try {
                                y05 b4 = v05Var.b.b();
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
                                hn1 hn1Var = new hn1(cVar6, b4, wallettransaction2, G, (byte) 23);
                                TL_wallet.sendTransfer sendtransfer = v05Var.a;
                                wallettransaction2.gasless = sendtransfer.data_gasless != null;
                                wallettransaction2.random_id = sendtransfer.random_id;
                                wallettransaction2.gaslessMessageBodyHash = sendtransfer.gaslessMessageBodyHash;
                                wallettransaction2.normalMessageBodyHash = sendtransfer.normalMessageBodyHash;
                                cVar6.p.add(0, wallettransaction2);
                                G.k();
                                G.i();
                                cVar6.Z();
                                qocVar.a(null);
                                c.O("disable backup: prepared sendTransfer, sending");
                                ConnectionsManager.getInstance(i4).sendRequestTyped(v05Var.a, new hc(objArr3 == true ? 1 : 0), new jl1(cVar6, hn1Var, v05Var, b4, wallettransaction2, (byte) 3));
                                break;
                            } catch (IllegalStateException unused) {
                                qocVar.a("CANCELLED");
                                return;
                            }
                        }
                    }
                }
                break;
            case 19:
                gl.c3(new vz4(this.b, obj, this.c, this.d, obj2, (byte) 0));
                break;
            case 20:
                w25 w25Var = (w25) this.b;
                t25 t25Var = (t25) this.c;
                x15 x15Var = (x15) this.d;
                TLRPC.Bool bool3 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj2;
                w25Var.getClass();
                Arrays.fill(t25Var.b, (byte) 0);
                x15Var.a((tL_error6 == null && (bool3 instanceof TLRPC.TL_boolTrue)) ? null : w25.z(tL_error6, "submitConnectResult"));
                if (w25Var.e < 0) {
                    w25Var.e = w25Var.f.sendRequestTyped(new TL_wallet.tonConnectGetSessions(), new hc(objArr4 == true ? 1 : 0), new ur4(w25Var, b));
                    break;
                }
                break;
            case 21:
                w25 w25Var2 = (w25) this.b;
                s25 s25Var = (s25) this.c;
                s62 s62Var = (s62) this.d;
                TL_wallet.walletTransaction wallettransaction3 = (TL_wallet.walletTransaction) obj;
                Object obj3 = (String) obj2;
                w25Var2.getClass();
                s25Var.p = (s25Var.n || w25Var2.i(s25Var) || !w25Var2.A(s25Var) || wallettransaction3 == null || !wallettransaction3.traceSucceeded || wallettransaction3.traceIncomplete) ? false : true;
                s62Var.a(wallettransaction3, obj3);
                break;
            case 22:
                boolean[] zArr2 = (boolean[]) this.b;
                pc7 pc7Var = (pc7) this.c;
                qn7 qn7Var = (qn7) this.d;
                TL_wallet.walletTransaction wallettransaction4 = (TL_wallet.walletTransaction) obj;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    gl.r(pc7Var);
                    if (wallettransaction4 != null) {
                        long j6 = wallettransaction4.fee;
                        if (j6 > 0) {
                            j = j6;
                            qn7Var.a(Long.valueOf(j));
                            break;
                        }
                    }
                    j = 0;
                    qn7Var.a(Long.valueOf(j));
                }
                break;
            case 23:
                fx0 fx0Var = (fx0) this.b;
                TL_account.Passkey passkey = (TL_account.Passkey) this.c;
                String str13 = (String) this.d;
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj2;
                if (passkeys != null) {
                    fx0Var.dismiss();
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
                        gl.d3(new bj7(passkeysActivity, passkey, b2), 150L);
                        break;
                    }
                } else if (tL_error7 != null) {
                    new u21(fx0Var.F, fx0Var.J0).f0(str13, false);
                    break;
                }
                break;
            case 24:
                y99 y99Var = (y99) this.b;
                c01 c01Var4 = (c01) this.c;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.d;
                c01Var4.b();
                if (((Boolean) obj).booleanValue()) {
                    w52 w52Var = y99Var.a2;
                    if (w52Var != null) {
                        w52Var.a(tL_starGiftUnique);
                    }
                    y99Var.dismiss();
                    break;
                }
                break;
            case 25:
                vqa vqaVar = (vqa) this.b;
                je5[] je5VarArr2 = (je5[]) this.c;
                FrameLayout frameLayout3 = (FrameLayout) this.d;
                View view2 = (View) obj;
                CharSequence charSequence2 = (CharSequence) obj2;
                je5 je5Var3 = je5VarArr2[0];
                if (je5Var3 != null) {
                    je5Var3.f(true);
                }
                SpannableStringBuilder R22 = gl.R2(charSequence2);
                float x3 = ((View) ((View) view2.getParent()).getParent()).getX() + ((View) view2.getParent()).getX() + view2.getX();
                float y2 = ((View) ((View) view2.getParent()).getParent()).getY() + ((View) view2.getParent()).getY() + view2.getY();
                if (view2 instanceof q41) {
                    Layout layout2 = ((q41) view2).getLayout();
                    CharSequence text2 = layout2.getText();
                    if (text2 instanceof Spanned) {
                        Spanned spanned2 = (Spanned) text2;
                        r41[] r41VarArr2 = (r41[]) spanned2.getSpans(0, text2.length(), r41.class);
                        if (r41VarArr2.length > 0 && (r41Var2 = r41VarArr2[0]) != null) {
                            x3 += layout2.getPrimaryHorizontal(spanned2.getSpanStart(r41Var2)) + (r41VarArr2[0].a() / 2);
                            y2 += layout2.getLineTop(layout2.getLineForOffset(r4));
                        }
                    }
                }
                je5 je5Var4 = new je5(vqaVar.getContext(), 3);
                je5VarArr2[0] = je5Var4;
                je5Var4.p(true);
                je5Var4.m(11.0f, 8.0f, 11.0f, 7.0f);
                je5Var4.q(10.0f);
                je5Var4.t(R22);
                je5Var4.r0 = new hh(je5Var4, (byte) 9);
                je5Var4.setTranslationY((-gl.L(100.0f)) + y2);
                je5Var4.h = gl.L(300.0f);
                je5Var4.setPadding(gl.L(4.0f), gl.L(4.0f), gl.L(4.0f), gl.L(4.0f));
                je5Var4.o(0.0f, x3 - gl.L(4.0f));
                frameLayout3.addView(je5Var4, nme.e(-1, 100, 55));
                je5Var4.v();
                break;
            case 26:
                ukc ukcVar = (ukc) this.b;
                c cVar7 = (c) this.c;
                ConnectionsManager connectionsManager = (ConnectionsManager) this.d;
                Vector vector = (Vector) obj;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj2;
                if (vector == null) {
                    if (tL_error8 == null || (str2 = tL_error8.text) == null) {
                        str2 = "NULL_ERROR";
                    }
                    ukcVar.a(str2);
                    if (tL_error8 != null && (str3 = tL_error8.text) != null) {
                        str = str3;
                    }
                    u21.c0(str);
                    break;
                } else if (vector.objects.size() <= 0) {
                    ukcVar.a("NO_PROVIDERS");
                    u21.c0("NO_PROVIDERS");
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
                                ukcVar.a("NO_SUITABLE_PROVIDER");
                                u21.c0("NO_SUITABLE_PROVIDER");
                                break;
                            } else {
                                TL_toncenter.createOnrampSession createonrampsession = new TL_toncenter.createOnrampSession();
                                createonrampsession.address = cVar7.x();
                                createonrampsession.crypto_currency = "gram";
                                createonrampsession.base_currency = cVar7.h.g();
                                createonrampsession.provider = onrampproviderinfo.id;
                                connectionsManager.sendRequestTyped(createonrampsession, new hc(objArr5 == true ? 1 : 0), new n4b(ukcVar, (byte) 11));
                                break;
                            }
                        }
                    }
                    if (onrampproviderinfo != null) {
                    }
                }
                break;
            default:
                toc tocVar = (toc) this.b;
                hd hdVar4 = (hd) this.c;
                c cVar8 = (c) this.d;
                Long l2 = (Long) obj;
                String str14 = (String) obj2;
                hdVar4.dismiss();
                if (l2 == null) {
                    u21 b0 = u21.b0(tocVar);
                    if (str14 == null) {
                        str14 = "NULL_ERROR";
                    }
                    b0.f0(str14, false);
                    break;
                } else {
                    Activity parentActivity = tocVar.getParentActivity();
                    if (parentActivity != null) {
                        ag2 ag2Var = new ag2(1, tocVar.getResourceProvider(), parentActivity);
                        int i6 = bkb.h6;
                        ff0 f0 = bkb.f0(tocVar.getThemedColor(i6), 7, gl.L(12.0f));
                        vkb M = zkb.M(i6);
                        wjb resourceProvider = tocVar.getResourceProvider();
                        ag2Var.setBackground(f0);
                        zkb.j(ag2Var, f0, null, M, resourceProvider);
                        ag2Var.e(k96.M0(2131742706, null), "", false, false, false);
                        ag2Var.setMultiline(true);
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ag2Var.getCheckBoxView().getLayoutParams();
                        layoutParams.topMargin = 0;
                        layoutParams.gravity = (k96.a0 ? 5 : 3) | 16;
                        ag2Var.getCheckBoxView().setLayoutParams(layoutParams);
                        ag2Var.setPadding(k96.a0 ? gl.L(4.0f) : 0, gl.L(12.0f), k96.a0 ? 0 : gl.L(4.0f), gl.L(12.0f));
                        TextView textView = new TextView(parentActivity);
                        textView.setTextSize(1, 14.0f);
                        zkb.X(textView, bkb.i5, tocVar.getResourceProvider());
                        textView.setGravity(17);
                        int L = gl.L(10.0f);
                        int i7 = bkb.Z6;
                        ShapeDrawable b02 = bkb.b0(L, tocVar.getThemedColor(i7));
                        vkb M2 = zkb.M(i7);
                        wjb resourceProvider2 = tocVar.getResourceProvider();
                        textView.setBackground(b02);
                        zkb.j(textView, b02, M2, null, resourceProvider2);
                        textView.setPadding(gl.L(16.0f), gl.L(12.0f), gl.L(16.0f), gl.L(12.0f));
                        textView.setText(l2.longValue() > 0 ? k96.V(null, null, 2131742704, c.r(l2.longValue(), false), cVar8.q(l2.longValue(), true)) : k96.M0(2131742705, null));
                        textView.setVisibility(8);
                        ag2Var.setOnClickListener(new vzb(ag2Var, textView, (byte) 15));
                        LinearLayout m = ir2.m(parentActivity, 1);
                        m.addView(ag2Var, nme.t(-1, -2, 83, 8, 0, 8, 0));
                        m.addView(textView, nme.k(16.0f, 8.0f, 16.0f, 16.0f, -1, -2));
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, tocVar.getResourceProvider(), parentActivity);
                        alertDialog$Builder.a.S = k96.M0(2131742888, null);
                        String M0 = k96.M0(2131742889, null);
                        hd hdVar5 = alertDialog$Builder.a;
                        hdVar5.U = M0;
                        hdVar5.H = (byte) 6;
                        alertDialog$Builder.n(m);
                        alertDialog$Builder.a.a = gl.L(312.0f);
                        alertDialog$Builder.g(k96.M0(2131752577, null), null);
                        alertDialog$Builder.j(k96.M0(2131742893, null), new lt((Object) tocVar, (Object) ag2Var, (Object) cVar8, (Object) l2, (byte) 25));
                        hd hdVar6 = alertDialog$Builder.a;
                        tocVar.showDialog(hdVar6);
                        TextView textView2 = (TextView) hdVar6.c(-1);
                        if (textView2 != null) {
                            zkb.X(textView2, bkb.p7, hdVar6.j1);
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
