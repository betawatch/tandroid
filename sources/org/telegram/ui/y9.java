package org.telegram.ui;

import android.os.Bundle;
import android.os.SystemClock;
import android.widget.Toast;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y9 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ y9(Object obj, Object obj2, Object obj3, int i3) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i3;
        int i10 = this.a;
        ng.b bVar = null;
        final int i11 = 0;
        final int i12 = 1;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i10) {
            case 0:
                org.telegram.messenger.g0.h3(new ai.t6((org.telegram.ui.ActionBar.d2) obj3, (String) obj2, tL_error, tLObject, (TLObject) obj, 22));
                break;
            case 1:
                final ka kaVar = (ka) obj3;
                final org.telegram.ui.ActionBar.s1 s1Var = (org.telegram.ui.ActionBar.s1) obj2;
                TL_account.updateUsername updateusername = (TL_account.updateUsername) obj;
                if (tL_error != null) {
                    if (!"USERNAME_NOT_MODIFIED".equals(tL_error.text)) {
                        if (!"USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text) && !"USERNAME_INVALID".equals(tL_error.text)) {
                            org.telegram.messenger.g0.h3(new o4.b1(kaVar, s1Var, tL_error, updateusername, 9));
                            break;
                        } else {
                            org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.z9
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i12) {
                                        case 0:
                                            try {
                                                s1Var.dismiss();
                                            } catch (Exception e10) {
                                                org.telegram.messenger.a8.g(e10, true);
                                            }
                                            kaVar.finishFragment();
                                            break;
                                        default:
                                            try {
                                                s1Var.dismiss();
                                            } catch (Exception e11) {
                                                org.telegram.messenger.a8.g(e11, true);
                                            }
                                            kaVar.m0();
                                            break;
                                    }
                                }
                            });
                            break;
                        }
                    } else {
                        org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.z9
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i11) {
                                    case 0:
                                        try {
                                            s1Var.dismiss();
                                        } catch (Exception e10) {
                                            org.telegram.messenger.a8.g(e10, true);
                                        }
                                        kaVar.finishFragment();
                                        break;
                                    default:
                                        try {
                                            s1Var.dismiss();
                                        } catch (Exception e11) {
                                            org.telegram.messenger.a8.g(e11, true);
                                        }
                                        kaVar.m0();
                                        break;
                                }
                            }
                        });
                        break;
                    }
                } else {
                    org.telegram.messenger.g0.h3(new p1(kaVar, s1Var, (TLRPC.User) tLObject, 8));
                    break;
                }
            case 2:
                org.telegram.messenger.g0.h3(new ai.t6((org.telegram.ui.ActionBar.d2) obj3, (String) obj2, tL_error, tLObject, (TLObject) obj, 25));
                break;
            case 3:
                org.telegram.messenger.g0.h3(new o4.b1((wm) obj3, (sf.b) obj2, tLObject, (ci.o2) obj, 11));
                break;
            case 4:
                wm wmVar = (wm) obj3;
                long[] jArr = (long[]) obj;
                org.telegram.messenger.g0.r((o4.b1) obj2);
                wmVar.u5.k.voiceTranscriptionRated = true;
                org.telegram.messenger.qr messagesStorage = wmVar.getMessagesStorage();
                messagesStorage.a.c(new org.telegram.messenger.yj(messagesStorage, wmVar.u5.f1(), org.telegram.messenger.zi.B0(wmVar.u5.k), wmVar.u5.k, 6));
                org.telegram.messenger.g0.i3(new tf(wmVar, 15), jArr[0] > 0 ? Math.max(0L, 300 - (SystemClock.elapsedRealtime() - jArr[0])) : 0L);
                break;
            case 5:
                wm wmVar2 = (wm) obj3;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) obj;
                org.telegram.messenger.g0.h3(new yf((org.telegram.ui.ActionBar.s1[]) obj2, i12));
                if (tL_error != null) {
                    org.telegram.messenger.g0.h3(new p1(wmVar2, tL_error, tL_messages_editMessage, 22));
                    break;
                } else {
                    wmVar2.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                    break;
                }
            case 6:
                org.telegram.messenger.g0.h3(new ai.t6((org.telegram.ui.ActionBar.d2) obj3, (String) obj2, tL_error, tLObject, (TLObject) obj, 28));
                break;
            case 7:
                org.telegram.messenger.g0.h3(new lq((is) obj3, tL_error, tLObject, (ArrayList) obj2, (TLRPC.TL_messages_getMyStickers) obj));
                break;
            case 8:
                org.telegram.messenger.g0.h3(new lq((uw) obj3, tLObject, (TLRPC.UserFull) obj2, (TL_account.TL_birthday) obj, tL_error, 6));
                break;
            case 9:
                org.telegram.messenger.g0.h3(new bu((uw) obj3, (TLRPC.TL_attachMenuBot) obj2, (LaunchActivity) obj, i12));
                break;
            case 10:
                org.telegram.messenger.g0.h3(new pp((c00) obj3, (org.telegram.ui.ActionBar.s1) obj2, (org.telegram.messenger.mo) obj, 9));
                break;
            case 11:
                x30 x30Var = (x30) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                if (tLObject == null) {
                    org.telegram.messenger.g0.h3(new ly(4, x30Var, tL_error));
                    break;
                } else {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    int i13 = 0;
                    while (true) {
                        if (i13 < updates.updates.size()) {
                            TLRPC.Update update = updates.updates.get(i13);
                            if (update instanceof TL_update.TL_updateGroupCall) {
                                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.v60(x30Var, chat, inputPeer, (TL_update.TL_updateGroupCall) update, 12));
                            } else {
                                i13++;
                            }
                        }
                    }
                    org.telegram.messenger.hp.s1(x30Var.l1.a).O3(updates, false);
                    break;
                }
            case 12:
                org.telegram.messenger.g0.h3(new lq((x30) obj3, (org.telegram.ui.ActionBar.s1) obj2, tLObject, (TL_phone.exportGroupCallInvite) obj, tL_error, 7));
                break;
            case 13:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.v60(tLObject, (ArrayList) obj3, (ArrayList) obj2, (lq) obj, 14));
                break;
            case 14:
                f50 f50Var = (f50) obj3;
                String str = (String) obj;
                g50 g50Var = f50Var.r;
                if (Objects.equals(f50Var.h, (String) obj2) && (tLObject instanceof TLRPC.TL_messages_foundStickerSets)) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList<TLRPC.StickerSetCovered> arrayList2 = ((TLRPC.TL_messages_foundStickerSets) tLObject).sets;
                    int size = arrayList2.size();
                    int i14 = 0;
                    while (i14 < size) {
                        TLRPC.StickerSetCovered stickerSetCovered = arrayList2.get(i14);
                        i14++;
                        TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = new TLRPC.TL_messages_stickerSet();
                        TLRPC.StickerSet stickerSet = stickerSetCovered2.set;
                        tL_messages_stickerSet.set = stickerSet;
                        tL_messages_stickerSet.documents = stickerSetCovered2.covers;
                        if (!g50Var.O || stickerSet.emojis) {
                            arrayList.add(tL_messages_stickerSet);
                        }
                    }
                    String trim = str.toLowerCase(Locale.ROOT).trim();
                    ArrayList arrayList3 = new ArrayList();
                    i3 = ((org.telegram.ui.ActionBar.d2) g50Var).currentAccount;
                    ArrayList s02 = org.telegram.messenger.li.b0(i3).s0(g50Var.h0());
                    int size2 = s02.size();
                    while (i11 < size2) {
                        Object obj4 = s02.get(i11);
                        i11++;
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj4;
                        String str2 = tL_messages_stickerSet2.set.short_name;
                        Locale locale = Locale.ROOT;
                        if (str2.toLowerCase(locale).contains(trim) || tL_messages_stickerSet2.set.title.toLowerCase(locale).contains(trim)) {
                            arrayList3.add(tL_messages_stickerSet2);
                        }
                    }
                    org.telegram.messenger.g0.h3(new org.telegram.ui.Components.v60(f50Var, arrayList, arrayList3, str, 17));
                    break;
                }
                break;
            case 15:
                String str3 = LaunchActivity.E1;
                org.telegram.messenger.g0.h3(new lq((LaunchActivity) obj3, tLObject, (TLRPC.TL_messages_requestUrlAuth) obj, (String) obj2, tL_error, 11));
                break;
            case 16:
                String str4 = LaunchActivity.E1;
                org.telegram.messenger.g0.h3(new lq((LaunchActivity) obj3, (ly) obj2, tLObject, (TLRPC.TL_wallPaper) obj, tL_error, 9));
                break;
            case 17:
                String str5 = LaunchActivity.E1;
                org.telegram.messenger.g0.h3(new lq((LaunchActivity) obj3, tLObject, (org.telegram.ui.ActionBar.s1) obj2, (ly) obj, tL_error, 12));
                break;
            case 18:
                org.telegram.messenger.g0.h3(new lq((m90) obj3, tL_error, tLObject, (TLRPC.TL_inputInvoiceSlug) obj, (String) obj2, 13));
                break;
            case 19:
                org.telegram.messenger.g0.h3(new pp((la0) obj3, (org.telegram.ui.ActionBar.s1[]) obj2, (TLRPC.TL_messageMediaVenue) obj, 24));
                break;
            case 20:
                org.telegram.messenger.g0.h3(new lq((lb0) obj3, tLObject, (Bundle) obj2, tL_error, (TLRPC.TL_auth_resendCode) obj, 15));
                break;
            case 21:
                org.telegram.messenger.g0.h3(new lq((qc0) obj3, tLObject, (Bundle) obj2, tL_error, (TL_account.verifyEmail) obj, 17));
                break;
            case 22:
                org.telegram.messenger.g0.h3(new lq((qc0) obj3, tLObject, (Bundle) obj2, tL_error, (TL_account.sendVerifyEmailCode) obj, 16));
                break;
            case 23:
                org.telegram.messenger.g0.h3(new lq((id0) obj3, tLObject, (TLRPC.TL_inputInvoicePremiumAuthCode) obj2, (TLRPC.TL_inputStorePaymentAuthCode) obj, tL_error, 18));
                break;
            case 24:
                dg0 dg0Var = (dg0) obj3;
                String str6 = (String) obj2;
                TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = (TL_stats.TL_loadAsyncGraph) obj;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        bVar = r41.h0(new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data), 1, false);
                    } catch (JSONException e10) {
                        e10.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    org.telegram.messenger.g0.h3(new tb0(14, dg0Var, (TL_stats.TL_statsGraphError) tLObject));
                }
                org.telegram.messenger.g0.h3(new lq(dg0Var, tL_error, bVar, str6, tL_loadAsyncGraph, 19));
                break;
            case 25:
                ag0 ag0Var = (ag0) obj3;
                String str7 = (String) obj2;
                q41 q41Var = (q41) obj;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        bVar = r41.h0(new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data), ag0Var.r.i, false);
                    } catch (JSONException e11) {
                        e11.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(ag0Var.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.v60(ag0Var, bVar, str7, q41Var, 29));
                break;
            case 26:
                org.telegram.messenger.g0.h3(new lq((vg0) obj3, (TLRPC.TL_contacts_importedContacts) tLObject, (TLRPC.TL_inputPhoneContact) obj2, tL_error, (TLRPC.TL_contacts_importContacts) obj, 20));
                break;
            case 27:
                org.telegram.messenger.g0.h3(new lq((uj0) obj3, tL_error, (Bundle) obj2, tLObject, (TLRPC.TL_auth_resendCode) obj, 22));
                break;
            case 28:
                org.telegram.messenger.g0.h3(new lq((dl0) obj3, tL_error, tLObject, (String) obj2, (TL_account.getPassword) obj, 23));
                break;
            default:
                dl0 dl0Var = (dl0) obj3;
                tb0 tb0Var = (tb0) obj2;
                TLObject tLObject2 = (TLObject) obj;
                if (!(tLObject instanceof TLRPC.TL_payments_validatedRequestedInfo)) {
                    org.telegram.messenger.g0.h3(new gk0(dl0Var, tL_error, tLObject2, 2));
                    break;
                } else {
                    org.telegram.messenger.g0.h3(new hc0(dl0Var, (TLRPC.TL_payments_validatedRequestedInfo) tLObject, tb0Var, 19));
                    break;
                }
        }
    }

    public /* synthetic */ y9(Object obj, TLObject tLObject, String str, int i3) {
        this.a = i3;
        this.b = obj;
        this.d = tLObject;
        this.c = str;
    }
}
