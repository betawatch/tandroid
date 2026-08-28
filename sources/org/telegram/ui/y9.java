package org.telegram.ui;

import android.os.Bundle;
import android.os.SystemClock;
import android.widget.Toast;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y9 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ y9(Object obj, Object obj2, Object obj3, int i9) {
        this.a = i9;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i9;
        int i10 = this.a;
        rf.b bVar = null;
        final int i11 = 0;
        final int i12 = 1;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new bg.o0(obj3, obj2, tL_error, tLObject, obj, 22));
                break;
            case 1:
                final ma maVar = (ma) obj3;
                final org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) obj2;
                TL_account.updateUsername updateusername = (TL_account.updateUsername) obj;
                if (tL_error != null) {
                    if (!"USERNAME_NOT_MODIFIED".equals(tL_error.text)) {
                        if (!"USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text) && !"USERNAME_INVALID".equals(tL_error.text)) {
                            AndroidUtilities.runOnUIThread(new k6(maVar, c2Var, tL_error, updateusername, 3));
                            break;
                        } else {
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.z9
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i12) {
                                        case 0:
                                            org.telegram.ui.ActionBar.c2 c2Var2 = c2Var;
                                            ma maVar2 = maVar;
                                            maVar2.getClass();
                                            try {
                                                c2Var2.dismiss();
                                            } catch (Exception e10) {
                                                FileLog.e(e10);
                                            }
                                            maVar2.finishFragment();
                                            break;
                                        default:
                                            org.telegram.ui.ActionBar.c2 c2Var3 = c2Var;
                                            ma maVar3 = maVar;
                                            maVar3.getClass();
                                            try {
                                                c2Var3.dismiss();
                                            } catch (Exception e11) {
                                                FileLog.e(e11);
                                            }
                                            maVar3.g0();
                                            break;
                                    }
                                }
                            });
                            break;
                        }
                    } else {
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.z9
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i11) {
                                    case 0:
                                        org.telegram.ui.ActionBar.c2 c2Var2 = c2Var;
                                        ma maVar2 = maVar;
                                        maVar2.getClass();
                                        try {
                                            c2Var2.dismiss();
                                        } catch (Exception e10) {
                                            FileLog.e(e10);
                                        }
                                        maVar2.finishFragment();
                                        break;
                                    default:
                                        org.telegram.ui.ActionBar.c2 c2Var3 = c2Var;
                                        ma maVar3 = maVar;
                                        maVar3.getClass();
                                        try {
                                            c2Var3.dismiss();
                                        } catch (Exception e11) {
                                            FileLog.e(e11);
                                        }
                                        maVar3.g0();
                                        break;
                                }
                            }
                        });
                        break;
                    }
                } else {
                    AndroidUtilities.runOnUIThread(new t1(maVar, c2Var, (TLRPC.User) tLObject, 8));
                    break;
                }
            case 2:
                AndroidUtilities.runOnUIThread(new bg.o0(obj3, obj2, tL_error, tLObject, obj, 25));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new k6((qn) obj3, (ve.d) obj2, tLObject, (gh.i2) obj, 5));
                break;
            case 4:
                qn qnVar = (qn) obj3;
                long[] jArr = (long[]) obj;
                AndroidUtilities.cancelRunOnUIThread((k6) obj2);
                qnVar.Z4.messageOwner.voiceTranscriptionRated = true;
                qnVar.getMessagesStorage().updateMessageVoiceTranscriptionOpen(qnVar.Z4.getDialogId(), qnVar.Z4.getId(), qnVar.Z4.messageOwner);
                AndroidUtilities.runOnUIThread(new jg(qnVar, 17), jArr[0] > 0 ? Math.max(0L, 300 - (SystemClock.elapsedRealtime() - jArr[0])) : 0L);
                break;
            case 5:
                qn qnVar2 = (qn) obj3;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) obj;
                AndroidUtilities.runOnUIThread(new mg((org.telegram.ui.ActionBar.c2[]) obj2, i12));
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new t1(qnVar2, tL_error, tL_messages_editMessage, 21));
                    break;
                } else {
                    qnVar2.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                    break;
                }
            case 6:
                AndroidUtilities.runOnUIThread(new bg.o0(obj3, obj2, tL_error, tLObject, obj, 28));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new hr((ht) obj3, tL_error, tLObject, (ArrayList) obj2, (TLRPC.TL_messages_getMyStickers) obj));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new hr((dy) obj3, tLObject, (TLRPC.UserFull) obj2, (TL_account.TL_birthday) obj, tL_error, 6));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new gv((dy) obj3, (TLRPC.TL_attachMenuBot) obj2, (LaunchActivity) obj, i12));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new jq((l10) obj3, (org.telegram.ui.ActionBar.c2) obj2, (MessagesController.DialogFilter) obj, 9));
                break;
            case 11:
                o50 o50Var = (o50) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                if (tLObject == null) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.p61(28, o50Var, tL_error));
                    break;
                } else {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    int i13 = 0;
                    while (true) {
                        if (i13 < updates.updates.size()) {
                            TLRPC.Update update = updates.updates.get(i13);
                            if (update instanceof TL_update.TL_updateGroupCall) {
                                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.no0(o50Var, chat, inputPeer, (TL_update.TL_updateGroupCall) update, 6));
                            } else {
                                i13++;
                            }
                        }
                    }
                    o50Var.d.getMessagesController().processUpdates(updates, false);
                    break;
                }
            case 12:
                AndroidUtilities.runOnUIThread(new hr((o50) obj3, (org.telegram.ui.ActionBar.c2) obj2, tLObject, (TL_phone.exportGroupCallInvite) obj, tL_error, 7));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.no0(tLObject, (ArrayList) obj3, (ArrayList) obj2, (hr) obj, 8));
                break;
            case 14:
                y60 y60Var = (y60) obj3;
                String str = (String) obj;
                z60 z60Var = y60Var.r;
                if (Objects.equals(y60Var.h, (String) obj2) && (tLObject instanceof TLRPC.TL_messages_foundStickerSets)) {
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
                        if (!z60Var.J || stickerSet.emojis) {
                            arrayList.add(tL_messages_stickerSet);
                        }
                    }
                    String trim = str.toLowerCase(Locale.ROOT).trim();
                    ArrayList arrayList3 = new ArrayList();
                    i9 = ((org.telegram.ui.ActionBar.o2) z60Var).currentAccount;
                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i9).getStickerSets(z60Var.b0());
                    int size2 = stickerSets.size();
                    while (i11 < size2) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickerSets.get(i11);
                        i11++;
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = tL_messages_stickerSet2;
                        String str2 = tL_messages_stickerSet3.set.short_name;
                        Locale locale = Locale.ROOT;
                        if (str2.toLowerCase(locale).contains(trim) || tL_messages_stickerSet3.set.title.toLowerCase(locale).contains(trim)) {
                            arrayList3.add(tL_messages_stickerSet3);
                        }
                    }
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.no0(y60Var, arrayList, arrayList3, str, 11));
                    break;
                }
                break;
            case 15:
                Pattern pattern = LaunchActivity.x1;
                AndroidUtilities.runOnUIThread(new hr((LaunchActivity) obj3, tLObject, (TLRPC.TL_messages_requestUrlAuth) obj, (String) obj2, tL_error, 11));
                break;
            case 16:
                Pattern pattern2 = LaunchActivity.x1;
                AndroidUtilities.runOnUIThread(new hr((LaunchActivity) obj3, (x20) obj2, tLObject, (TLRPC.TL_wallPaper) obj, tL_error, 9));
                break;
            case 17:
                Pattern pattern3 = LaunchActivity.x1;
                AndroidUtilities.runOnUIThread(new hr((LaunchActivity) obj3, tLObject, (org.telegram.ui.ActionBar.c2) obj2, (x20) obj, tL_error, 12));
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new hr((kb0) obj3, tL_error, tLObject, (TLRPC.TL_inputInvoiceSlug) obj, (String) obj2, 13));
                break;
            case 19:
                AndroidUtilities.runOnUIThread(new jq((pc0) obj3, (org.telegram.ui.ActionBar.c2[]) obj2, (TLRPC.TL_messageMediaVenue) obj, 23));
                break;
            case 20:
                AndroidUtilities.runOnUIThread(new hr((pd0) obj3, tLObject, (Bundle) obj2, tL_error, (TLRPC.TL_auth_resendCode) obj, 15));
                break;
            case 21:
                AndroidUtilities.runOnUIThread(new hr((ue0) obj3, tLObject, (Bundle) obj2, tL_error, (TL_account.verifyEmail) obj, 17));
                break;
            case 22:
                AndroidUtilities.runOnUIThread(new hr((ue0) obj3, tLObject, (Bundle) obj2, tL_error, (TL_account.sendVerifyEmailCode) obj, 16));
                break;
            case 23:
                AndroidUtilities.runOnUIThread(new hr((of0) obj3, tLObject, (TLRPC.TL_inputInvoicePremiumAuthCode) obj2, (TLRPC.TL_inputStorePaymentAuthCode) obj, tL_error, 18));
                break;
            case 24:
                ti0 ti0Var = (ti0) obj3;
                String str3 = (String) obj2;
                TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = (TL_stats.TL_loadAsyncGraph) obj;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        bVar = s91.d0(new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data), 1, false);
                    } catch (JSONException e10) {
                        e10.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    AndroidUtilities.runOnUIThread(new cf0(6, ti0Var, (TL_stats.TL_statsGraphError) tLObject));
                }
                AndroidUtilities.runOnUIThread(new hr(ti0Var, tL_error, bVar, str3, tL_loadAsyncGraph, 19));
                break;
            case 25:
                qi0 qi0Var = (qi0) obj3;
                String str4 = (String) obj2;
                r91 r91Var = (r91) obj;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        bVar = s91.d0(new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data), qi0Var.r.i, false);
                    } catch (JSONException e11) {
                        e11.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(qi0Var.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.no0(qi0Var, bVar, str4, r91Var, 23));
                break;
            case 26:
                AndroidUtilities.runOnUIThread(new hr((nj0) obj3, (TLRPC.TL_contacts_importedContacts) tLObject, (TLRPC.TL_inputPhoneContact) obj2, tL_error, (TLRPC.TL_contacts_importContacts) obj, 20));
                break;
            case 27:
                AndroidUtilities.runOnUIThread(new hr((sm0) obj3, tL_error, (Bundle) obj2, tLObject, (TLRPC.TL_auth_resendCode) obj, 22));
                break;
            case 28:
                AndroidUtilities.runOnUIThread(new hr((co0) obj3, tL_error, tLObject, (String) obj2, (TL_account.getPassword) obj, 23));
                break;
            default:
                co0 co0Var = (co0) obj3;
                cf0 cf0Var = (cf0) obj2;
                TLObject tLObject2 = (TLObject) obj;
                if (!(tLObject instanceof TLRPC.TL_payments_validatedRequestedInfo)) {
                    AndroidUtilities.runOnUIThread(new dn0(co0Var, tL_error, tLObject2, 2));
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(new ye0(co0Var, (TLRPC.TL_payments_validatedRequestedInfo) tLObject, cf0Var, 16));
                    break;
                }
        }
    }

    public /* synthetic */ y9(Object obj, TLObject tLObject, String str, int i9) {
        this.a = i9;
        this.b = obj;
        this.d = tLObject;
        this.c = str;
    }
}
