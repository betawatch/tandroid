package org.telegram.ui;

import android.os.Bundle;
import android.os.SystemClock;
import android.widget.Toast;
import j$.util.Objects;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z9 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ z9(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7;
        int i10 = this.a;
        int i11 = 22;
        mg.b bVar = null;
        final int i12 = 1;
        final int i13 = 0;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i10) {
            case 0:
                org.telegram.messenger.g0.g3(new ai.b((la) obj3, (String) obj2, tL_error, tLObject, (TL_account.checkUsername) obj, 23));
                break;
            case 1:
                final la laVar = (la) obj3;
                final org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) obj2;
                TL_account.updateUsername updateusername = (TL_account.updateUsername) obj;
                if (tL_error != null) {
                    if (!"USERNAME_NOT_MODIFIED".equals(tL_error.text)) {
                        if (!"USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text) && !"USERNAME_INVALID".equals(tL_error.text)) {
                            org.telegram.messenger.g0.g3(new org.telegram.messenger.camera.i(laVar, t1Var, tL_error, updateusername, 8));
                            break;
                        } else {
                            org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.aa
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i12) {
                                        case 0:
                                            try {
                                                t1Var.dismiss();
                                            } catch (Exception e10) {
                                                org.telegram.messenger.a8.g(e10, true);
                                            }
                                            laVar.finishFragment();
                                            break;
                                        default:
                                            try {
                                                t1Var.dismiss();
                                            } catch (Exception e11) {
                                                org.telegram.messenger.a8.g(e11, true);
                                            }
                                            laVar.m0();
                                            break;
                                    }
                                }
                            });
                            break;
                        }
                    } else {
                        org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.aa
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i13) {
                                    case 0:
                                        try {
                                            t1Var.dismiss();
                                        } catch (Exception e10) {
                                            org.telegram.messenger.a8.g(e10, true);
                                        }
                                        laVar.finishFragment();
                                        break;
                                    default:
                                        try {
                                            t1Var.dismiss();
                                        } catch (Exception e11) {
                                            org.telegram.messenger.a8.g(e11, true);
                                        }
                                        laVar.m0();
                                        break;
                                }
                            }
                        });
                        break;
                    }
                } else {
                    org.telegram.messenger.g0.g3(new o1(laVar, t1Var, (TLRPC.User) tLObject, 8));
                    break;
                }
            case 2:
                org.telegram.messenger.g0.g3(new ai.b((ad) obj3, (String) obj2, tL_error, tLObject, (TLRPC.TL_channels_checkUsername) obj, 26));
                break;
            case 3:
                org.telegram.messenger.g0.g3(new org.telegram.messenger.camera.i((bn) obj3, (vf.b) obj2, tLObject, (di.n2) obj, 10));
                break;
            case 4:
                bn bnVar = (bn) obj3;
                long[] jArr = (long[]) obj;
                org.telegram.messenger.g0.r((org.telegram.messenger.camera.i) obj2);
                bnVar.v5.k.voiceTranscriptionRated = true;
                org.telegram.messenger.tr messagesStorage = bnVar.getMessagesStorage();
                messagesStorage.a.c(new org.telegram.messenger.ek(messagesStorage, bnVar.v5.e1(), org.telegram.messenger.fj.B0(bnVar.v5.k), bnVar.v5.k, 6));
                org.telegram.messenger.g0.h3(new vf(bnVar, 19), jArr[0] > 0 ? Math.max(0L, 300 - (SystemClock.elapsedRealtime() - jArr[0])) : 0L);
                break;
            case 5:
                bn bnVar2 = (bn) obj3;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) obj;
                org.telegram.messenger.g0.g3(new zf((org.telegram.ui.ActionBar.t1[]) obj2, i12));
                if (tL_error != null) {
                    org.telegram.messenger.g0.g3(new o1(bnVar2, tL_error, tL_messages_editMessage, i11));
                    break;
                } else {
                    bnVar2.getMessagesController().V3((TLRPC.Updates) tLObject, false);
                    break;
                }
            case 6:
                org.telegram.messenger.g0.g3(new wn((jo) obj3, (String) obj2, tL_error, tLObject, (TLRPC.TL_channels_checkUsername) obj, 0));
                break;
            case 7:
                org.telegram.messenger.g0.g3(new wn(obj3, tL_error, (Object) tLObject, (Serializable) obj2, (TLObject) obj, 8));
                break;
            case 8:
                org.telegram.messenger.g0.g3(new wn(obj3, tLObject, obj2, obj, tL_error, 9));
                break;
            case 9:
                org.telegram.messenger.g0.g3(new vu((cx) obj3, (TLRPC.TL_attachMenuBot) obj2, (LaunchActivity) obj, i13));
                break;
            case 10:
                org.telegram.messenger.g0.g3(new up((j00) obj3, (org.telegram.ui.ActionBar.t1) obj2, (org.telegram.messenger.ro) obj, 9));
                break;
            case 11:
                f40 f40Var = (f40) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                if (tLObject == null) {
                    org.telegram.messenger.g0.g3(new ss(i11, f40Var, tL_error));
                    break;
                } else {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    int i14 = 0;
                    while (true) {
                        if (i14 < updates.updates.size()) {
                            TLRPC.Update update = updates.updates.get(i14);
                            if (update instanceof TL_update.TL_updateGroupCall) {
                                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.q20(f40Var, chat, inputPeer, (TL_update.TL_updateGroupCall) update, 13));
                            } else {
                                i14++;
                            }
                        }
                    }
                    org.telegram.messenger.mp.u1(f40Var.o1.a).V3(updates, false);
                    break;
                }
            case 12:
                org.telegram.messenger.g0.g3(new wn(obj3, obj2, tLObject, (TLObject) obj, tL_error, 10));
                break;
            case 13:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.q20(tLObject, (ArrayList) obj3, (ArrayList) obj2, (wn) obj));
                break;
            case 14:
                m50 m50Var = (m50) obj3;
                String str = (String) obj;
                n50 n50Var = m50Var.r;
                if (Objects.equals(m50Var.h, (String) obj2) && (tLObject instanceof TLRPC.TL_messages_foundStickerSets)) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList<TLRPC.StickerSetCovered> arrayList2 = ((TLRPC.TL_messages_foundStickerSets) tLObject).sets;
                    int size = arrayList2.size();
                    int i15 = 0;
                    while (i15 < size) {
                        TLRPC.StickerSetCovered stickerSetCovered = arrayList2.get(i15);
                        i15++;
                        TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = new TLRPC.TL_messages_stickerSet();
                        TLRPC.StickerSet stickerSet = stickerSetCovered2.set;
                        tL_messages_stickerSet.set = stickerSet;
                        tL_messages_stickerSet.documents = stickerSetCovered2.covers;
                        if (!n50Var.O || stickerSet.emojis) {
                            arrayList.add(tL_messages_stickerSet);
                        }
                    }
                    String trim = str.toLowerCase(Locale.ROOT).trim();
                    ArrayList arrayList3 = new ArrayList();
                    i7 = ((org.telegram.ui.ActionBar.g2) n50Var).currentAccount;
                    ArrayList u02 = org.telegram.messenger.ri.d0(i7).u0(n50Var.h0());
                    int size2 = u02.size();
                    while (i13 < size2) {
                        Object obj4 = u02.get(i13);
                        i13++;
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj4;
                        String str2 = tL_messages_stickerSet2.set.short_name;
                        Locale locale = Locale.ROOT;
                        if (str2.toLowerCase(locale).contains(trim) || tL_messages_stickerSet2.set.title.toLowerCase(locale).contains(trim)) {
                            arrayList3.add(tL_messages_stickerSet2);
                        }
                    }
                    org.telegram.messenger.g0.g3(new org.telegram.ui.Components.q20(m50Var, arrayList, arrayList3, str, 18));
                    break;
                }
                break;
            case 15:
                String str3 = LaunchActivity.C1;
                org.telegram.messenger.g0.g3(new wn((LaunchActivity) obj3, tLObject, (TLRPC.TL_messages_requestUrlAuth) obj, (String) obj2, tL_error));
                break;
            case 16:
                String str4 = LaunchActivity.C1;
                org.telegram.messenger.g0.g3(new wn(obj3, obj2, tLObject, (TLObject) obj, tL_error, 12));
                break;
            case 17:
                String str5 = LaunchActivity.C1;
                org.telegram.messenger.g0.g3(new wn(obj3, tLObject, obj2, obj, tL_error, 15));
                break;
            case 18:
                org.telegram.messenger.g0.g3(new wn(obj3, (Object) tL_error, (Object) tLObject, obj, (String) obj2, 16));
                break;
            case 19:
                org.telegram.messenger.g0.g3(new up((qa0) obj3, (org.telegram.ui.ActionBar.t1[]) obj2, (TLRPC.TL_messageMediaVenue) obj, 25));
                break;
            case 20:
                org.telegram.messenger.g0.g3(new wn((org.telegram.ui.Components.iu0) obj3, tLObject, (Bundle) obj2, tL_error, (TLObject) obj, 18));
                break;
            case 21:
                org.telegram.messenger.g0.g3(new wn((org.telegram.ui.Components.iu0) obj3, tLObject, (Bundle) obj2, tL_error, (TLObject) obj, 20));
                break;
            case 22:
                org.telegram.messenger.g0.g3(new wn((org.telegram.ui.Components.iu0) obj3, tLObject, (Bundle) obj2, tL_error, (TLObject) obj, 19));
                break;
            case 23:
                org.telegram.messenger.g0.g3(new wn(obj3, tLObject, obj2, obj, tL_error, 21));
                break;
            case 24:
                og0 og0Var = (og0) obj3;
                String str6 = (String) obj2;
                TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = (TL_stats.TL_loadAsyncGraph) obj;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        bVar = c51.h0(new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data), 1, false);
                    } catch (JSONException e10) {
                        e10.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    org.telegram.messenger.g0.g3(new fe0(3, og0Var, (TL_stats.TL_statsGraphError) tLObject));
                }
                org.telegram.messenger.g0.g3(new wn((Object) og0Var, tL_error, (Object) bVar, (Serializable) str6, (TLObject) tL_loadAsyncGraph, 22));
                break;
            case 25:
                lg0 lg0Var = (lg0) obj3;
                String str7 = (String) obj2;
                b51 b51Var = (b51) obj;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        bVar = c51.h0(new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data), lg0Var.r.i, false);
                    } catch (JSONException e11) {
                        e11.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(lg0Var.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                org.telegram.messenger.g0.g3(new kg0(lg0Var, bVar, str7, b51Var, 0));
                break;
            case 26:
                org.telegram.messenger.g0.g3(new wn((fh0) obj3, (TLRPC.TL_contacts_importedContacts) tLObject, (TLRPC.TL_inputPhoneContact) obj2, tL_error, (TLRPC.TL_contacts_importContacts) obj));
                break;
            case 27:
                org.telegram.messenger.g0.g3(new wn(obj3, tL_error, obj2, (Object) tLObject, obj, 25));
                break;
            case 28:
                org.telegram.messenger.g0.g3(new wn(obj3, tL_error, (Object) tLObject, (Serializable) obj2, (TLObject) obj, 26));
                break;
            default:
                ml0 ml0Var = (ml0) obj3;
                fe0 fe0Var = (fe0) obj2;
                TLObject tLObject2 = (TLObject) obj;
                if (!(tLObject instanceof TLRPC.TL_payments_validatedRequestedInfo)) {
                    org.telegram.messenger.g0.g3(new qk0(ml0Var, tL_error, tLObject2, 2));
                    break;
                } else {
                    org.telegram.messenger.g0.g3(new mc0(ml0Var, (TLRPC.TL_payments_validatedRequestedInfo) tLObject, fe0Var, 18));
                    break;
                }
        }
    }

    public /* synthetic */ z9(Object obj, TLObject tLObject, String str, int i7) {
        this.a = i7;
        this.b = obj;
        this.d = tLObject;
        this.c = str;
    }
}
