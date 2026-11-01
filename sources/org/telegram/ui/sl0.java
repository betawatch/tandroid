package org.telegram.ui;

import android.content.Context;
import android.graphics.RectF;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sl0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sl0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01bc  */
    @Override // org.telegram.tgnet.RequestDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        String str;
        String str2;
        String str3;
        JSONException jSONException;
        long[] jArr;
        int i10 = this.a;
        int i11 = 4;
        int i12 = 19;
        int i13 = 3;
        int i14 = 1;
        int i15 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                qm0 qm0Var = (qm0) obj2;
                TLRPC.TL_payments_sendPaymentForm tL_payments_sendPaymentForm = (TLRPC.TL_payments_sendPaymentForm) obj;
                if (tLObject == null) {
                    j10 j10Var = qm0Var.e1;
                    if (j10Var == null || !((Boolean) j10Var.a(tL_error)).booleanValue()) {
                        org.telegram.messenger.i0.g3(new pd0(qm0Var, tL_error, tL_payments_sendPaymentForm, false, 18));
                        break;
                    }
                } else if (!(tLObject instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tLObject instanceof TLRPC.TL_payments_paymentVerificationNeeded) {
                        org.telegram.messenger.i0.g3(new nl0(qm0Var, tLObject, i14));
                        break;
                    }
                } else {
                    org.telegram.messenger.r20 r20Var = qm0Var.c1;
                    if (r20Var == null) {
                        TLRPC.Updates updates = ((TLRPC.TL_payments_paymentResult) tLObject).updates;
                        TLRPC.Message[] messageArr = new TLRPC.Message[1];
                        int size = updates.updates.size();
                        int i16 = 0;
                        while (true) {
                            if (i16 < size) {
                                TLRPC.Update update = updates.updates.get(i16);
                                if (update instanceof TL_update.TL_updateNewMessage) {
                                    messageArr[0] = ((TL_update.TL_updateNewMessage) update).message;
                                } else if (update instanceof TL_update.TL_updateNewChannelMessage) {
                                    messageArr[0] = ((TL_update.TL_updateNewChannelMessage) update).message;
                                } else {
                                    i16++;
                                }
                            }
                        }
                        qm0Var.getMessagesController().L3(updates, false);
                        org.telegram.messenger.i0.g3(new if0(i12, qm0Var, messageArr));
                        break;
                    } else {
                        r20Var.a((TLRPC.TL_payments_paymentResult) tLObject);
                        break;
                    }
                }
                break;
            case 1:
                org.telegram.messenger.i0.g3(new v50((qm0) obj2, tLObject, tL_error, (TL_account.getTmpPassword) obj, 16));
                break;
            case 2:
                org.telegram.messenger.i0.g3(new v50((qt0) obj2, tL_error, tLObject, (TL_stars.updatePaidMessagesPrice) obj, 21));
                break;
            case 3:
                org.telegram.messenger.i0.g3(new v50((PrivacyControlActivity) obj2, tL_error, tLObject, (boolean[]) obj, 22));
                break;
            case 4:
                org.telegram.messenger.i0.g3(new hr0(7, (PrivacySettingsActivity) obj2, (org.telegram.ui.Cells.t8) obj));
                break;
            case 5:
                RectF rectF = ProfileActivity.S6;
                org.telegram.messenger.i0.g3(new v50((ProfileActivity) obj2, tLObject, tL_error, (int[]) obj, 25));
                break;
            case 6:
                RectF rectF2 = ProfileActivity.S6;
                org.telegram.messenger.i0.g3(new v50((ProfileActivity) obj2, tL_error, tLObject, (String) obj, 28));
                break;
            case 7:
                RectF rectF3 = ProfileActivity.S6;
                org.telegram.messenger.i0.g3(new v50((ProfileActivity) obj2, tLObject, (TLRPC.TL_username) obj, tL_error, 27));
                break;
            case 8:
                org.telegram.messenger.i0.g3(new ox0((px0) obj2, tLObject, (TLRPC.TL_username) obj, tL_error, 0));
                break;
            case 9:
                org.telegram.messenger.i0.g3(new i41((j41) obj2, tL_error, (TLRPC.TL_authorization) obj, i15));
                break;
            case 10:
                org.telegram.messenger.i0.g3(new i41((k41) obj2, tL_error, (TLRPC.TL_authorization) obj, i14));
                break;
            case 11:
                org.telegram.messenger.i0.g3(new ox0(obj2, (Object) tLObject, tL_error, obj, 3));
                break;
            case 12:
                org.telegram.messenger.i0.g3(new y01(i13, (c51) obj2, (TLRPC.TL_attachMenuBot) obj));
                break;
            case 13:
                org.telegram.messenger.i0.g3(new ox0(obj2, tL_error, (Object) tLObject, obj, 4));
                break;
            case 14:
                e61 e61Var = (e61) obj2;
                org.telegram.messenger.j20 j20Var = (org.telegram.messenger.j20) obj;
                int i17 = e61Var.i;
                String str4 = null;
                if (tL_error == null) {
                    if (tLObject instanceof TL_stats.TL_statsGraph) {
                        try {
                            cg.b h02 = s61.h0(new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data), i17, e61Var.m);
                            try {
                                str4 = ((TL_stats.TL_statsGraph) tLObject).zoom_token;
                                if (i17 == 4 && (jArr = h02.a) != null && jArr.length > 0) {
                                    long j10 = jArr[jArr.length - 1];
                                    e61Var.e = new cg.e(h02, j10);
                                    e61Var.c = j10;
                                }
                                str3 = str4;
                                str4 = h02;
                            } catch (JSONException e) {
                                jSONException = e;
                                str3 = str4;
                                str4 = h02;
                                jSONException.printStackTrace();
                                if (tLObject instanceof TL_stats.TL_statsGraphError) {
                                }
                                str = str4;
                                str2 = str3;
                                org.telegram.messenger.i0.g3(new ox0(e61Var, str, str2, j20Var, 6));
                                return;
                            }
                        } catch (JSONException e7) {
                            jSONException = e7;
                            str3 = null;
                        }
                    } else {
                        str3 = null;
                    }
                    if (tLObject instanceof TL_stats.TL_statsGraphError) {
                        e61Var.l = false;
                        e61Var.a = true;
                        e61Var.b = ((TL_stats.TL_statsGraphError) tLObject).error;
                    }
                    str = str4;
                    str2 = str3;
                } else {
                    str = null;
                    str2 = null;
                }
                org.telegram.messenger.i0.g3(new ox0(e61Var, str, str2, j20Var, 6));
                break;
            case 15:
                org.telegram.messenger.i0.g3(new i41((n91) obj2, (String) obj, tL_error));
                break;
            case 16:
                n91 n91Var = (n91) obj2;
                TL_account.updateTheme updatetheme = (TL_account.updateTheme) obj;
                if (!(tLObject instanceof TLRPC.TL_theme)) {
                    org.telegram.messenger.i0.g3(new i41(n91Var, tL_error, updatetheme, i11));
                    break;
                } else {
                    org.telegram.messenger.i0.g3(new y01(10, n91Var, (TLRPC.TL_theme) tLObject));
                    break;
                }
            case 17:
                org.telegram.messenger.i0.g3(new i41((jb1) obj2, (String) obj, tLObject, 8));
                break;
            case 18:
                org.telegram.messenger.i0.g3(new ox0((rc1) obj2, tLObject, (String) obj, tL_error, 9));
                break;
            case 19:
                rc1 rc1Var = (rc1) obj2;
                byte[] bArr = (byte[]) obj;
                if (tL_error != null) {
                    org.telegram.messenger.i0.g3(new nc1(rc1Var, tL_error, i13));
                    break;
                } else {
                    org.telegram.messenger.i0.g3(new lc1(rc1Var, bArr, i14));
                    break;
                }
            case 20:
                org.telegram.messenger.i0.g3(new org.telegram.ui.Wallet.m2(i12, (ie1) obj2, (int[]) obj));
                break;
            case 21:
                org.telegram.messenger.i0.g3(new org.telegram.ui.Components.v41((org.telegram.ui.Components.wq0) obj2, tL_error, (org.telegram.ui.ActionBar.k2) obj, 13));
                break;
            case 22:
                org.telegram.messenger.i0.g3(new org.telegram.ui.Components.v41((ph.h3) obj2, tLObject, (TL_stars.getResaleStarGifts) obj, false, 16));
                break;
            case 23:
                org.telegram.messenger.i0.g3(new org.telegram.ui.Components.v41((rh.i) obj2, tLObject, (Context) obj, false, 19));
                break;
            case 24:
                org.telegram.messenger.i0.g3(new ox0((rh.h) obj2, tLObject, (String) obj, tL_error, 15));
                break;
            case 25:
                rh.e4 e4Var = (rh.e4) obj2;
                org.telegram.ui.ActionBar.x1 x1Var = (org.telegram.ui.ActionBar.x1) obj;
                if (tLObject instanceof TL_stars.TL_payments_uniqueStarGift) {
                    TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift = (TL_stars.TL_payments_uniqueStarGift) tLObject;
                    org.telegram.messenger.wp.r1(e4Var.a).V3(tL_payments_uniqueStarGift.users, false);
                    org.telegram.messenger.wp.r1(e4Var.a).P3(tL_payments_uniqueStarGift.chats, false);
                    if (tL_payments_uniqueStarGift.gift instanceof TL_stars.TL_starGiftUnique) {
                        org.telegram.messenger.i0.g3(new rh.n(2, e4Var, tL_payments_uniqueStarGift));
                        break;
                    }
                }
                org.telegram.messenger.i0.g3(new rh.n(i13, x1Var, tL_error));
                break;
            case 26:
                org.telegram.messenger.i0.g3(new ox0((rh.e4) obj2, tLObject, (org.telegram.ui.Components.v41) obj, tL_error, 19));
                break;
            case 27:
                rh.e4 e4Var2 = (rh.e4) obj2;
                TL_stars.InputSavedStarGift inputSavedStarGift = (TL_stars.InputSavedStarGift) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    TLRPC.Updates updates2 = (TLRPC.Updates) tLObject;
                    org.telegram.messenger.wp.r1(e4Var2.a).V3(updates2.users, false);
                    org.telegram.messenger.wp.r1(e4Var2.a).P3(updates2.chats, false);
                }
                org.telegram.messenger.i0.g3(new ox0((Object) e4Var2, tL_error, (Object) tLObject, (Object) inputSavedStarGift, 20));
                break;
            case 28:
                org.telegram.messenger.i0.g3(new org.telegram.ui.Components.v41(tLObject, (f0) obj2, (String) obj));
                break;
            default:
                org.telegram.messenger.i0.g3(new org.telegram.ui.Components.v41((rh.e6) obj2, tLObject, tL_error, (org.telegram.messenger.r20) obj));
                break;
        }
    }
}
