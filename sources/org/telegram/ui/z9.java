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

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
        mg.b bVar = null;
        final int i11 = 0;
        final int i12 = 1;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i10) {
            case 0:
                org.telegram.messenger.g0.h3(new bi.u0(obj3, obj2, tL_error, tLObject, obj, 20));
                break;
            case 1:
                final la laVar = (la) obj3;
                final org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) obj2;
                TL_account.updateUsername updateusername = (TL_account.updateUsername) obj;
                if (tL_error != null) {
                    if (!"USERNAME_NOT_MODIFIED".equals(tL_error.text)) {
                        if (!"USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text) && !"USERNAME_INVALID".equals(tL_error.text)) {
                            org.telegram.messenger.g0.h3(new m6(laVar, u1Var, tL_error, updateusername, 3));
                            break;
                        } else {
                            org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.aa
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i12) {
                                        case 0:
                                            try {
                                                u1Var.dismiss();
                                            } catch (Exception e10) {
                                                org.telegram.messenger.a8.g(e10, true);
                                            }
                                            laVar.finishFragment();
                                            break;
                                        default:
                                            try {
                                                u1Var.dismiss();
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
                        org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.aa
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i11) {
                                    case 0:
                                        try {
                                            u1Var.dismiss();
                                        } catch (Exception e10) {
                                            org.telegram.messenger.a8.g(e10, true);
                                        }
                                        laVar.finishFragment();
                                        break;
                                    default:
                                        try {
                                            u1Var.dismiss();
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
                    org.telegram.messenger.g0.h3(new o1(laVar, u1Var, (TLRPC.User) tLObject, 8));
                    break;
                }
                break;
            case 2:
                org.telegram.messenger.g0.h3(new bi.u0(obj3, obj2, tL_error, tLObject, obj, 23));
                break;
            case 3:
                org.telegram.messenger.g0.h3(new m6((an) obj3, (vf.b) obj2, tLObject, (bi.z2) obj, 5));
                break;
            case 4:
                an anVar = (an) obj3;
                long[] jArr = (long[]) obj;
                org.telegram.messenger.g0.r((m6) obj2);
                anVar.t5.k.voiceTranscriptionRated = true;
                org.telegram.messenger.yr messagesStorage = anVar.getMessagesStorage();
                messagesStorage.a.c(new org.telegram.messenger.ik(messagesStorage, anVar.t5.f1(), org.telegram.messenger.ij.B0(anVar.t5.k), anVar.t5.k, 6));
                org.telegram.messenger.g0.i3(new xf(anVar, 15), jArr[0] > 0 ? Math.max(0L, 300 - (SystemClock.elapsedRealtime() - jArr[0])) : 0L);
                break;
            case 5:
                an anVar2 = (an) obj3;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) obj;
                org.telegram.messenger.g0.h3(new cg((org.telegram.ui.ActionBar.u1[]) obj2, i12));
                if (tL_error != null) {
                    org.telegram.messenger.g0.h3(new o1(anVar2, tL_error, tL_messages_editMessage, 22));
                    break;
                } else {
                    anVar2.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                    break;
                }
            case 6:
                org.telegram.messenger.g0.h3(new bi.u0(obj3, obj2, tL_error, tLObject, obj, 26));
                break;
            case 7:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.jv0(obj3, tL_error, (Object) tLObject, (Serializable) obj2, (TLObject) obj, 3));
                break;
            case 8:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.jv0(obj3, obj2, tL_error, tLObject, obj, 4));
                break;
            case 9:
                org.telegram.messenger.g0.h3(new du((ww) obj3, (TLRPC.TL_attachMenuBot) obj2, (LaunchActivity) obj, i12));
                break;
            case 10:
                org.telegram.messenger.g0.h3(new rp((e00) obj3, (org.telegram.ui.ActionBar.u1) obj2, (org.telegram.messenger.vo) obj, 9));
                break;
            case 11:
                c40 c40Var = (c40) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                if (tLObject == null) {
                    org.telegram.messenger.g0.h3(new org.telegram.ui.Components.l51(29, c40Var, tL_error));
                    break;
                } else {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    int i13 = 0;
                    while (true) {
                        if (i13 < updates.updates.size()) {
                            TLRPC.Update update = updates.updates.get(i13);
                            if (update instanceof TL_update.TL_updateGroupCall) {
                                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.kn0(c40Var, chat, inputPeer, (TL_update.TL_updateGroupCall) update, 6));
                            } else {
                                i13++;
                            }
                        }
                    }
                    org.telegram.messenger.qp.s1(c40Var.k1.a).O3(updates, false);
                    break;
                }
            case 12:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.jv0(obj3, obj2, tLObject, (TLObject) obj, tL_error, 5));
                break;
            case 13:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.kn0(tLObject, (ArrayList) obj3, (ArrayList) obj2, (org.telegram.ui.Components.jv0) obj, 8));
                break;
            case 14:
                l50 l50Var = (l50) obj3;
                String str = (String) obj;
                m50 m50Var = l50Var.r;
                if (Objects.equals(l50Var.h, (String) obj2) && (tLObject instanceof TLRPC.TL_messages_foundStickerSets)) {
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
                        if (!m50Var.N || stickerSet.emojis) {
                            arrayList.add(tL_messages_stickerSet);
                        }
                    }
                    String trim = str.toLowerCase(Locale.ROOT).trim();
                    ArrayList arrayList3 = new ArrayList();
                    i7 = ((org.telegram.ui.ActionBar.f2) m50Var).currentAccount;
                    ArrayList s02 = org.telegram.messenger.ui.b0(i7).s0(m50Var.h0());
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
                    org.telegram.messenger.g0.h3(new org.telegram.ui.Components.kn0(l50Var, arrayList, arrayList3, str, 11));
                    break;
                }
                break;
            case 15:
                String str3 = LaunchActivity.B1;
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.jv0((LaunchActivity) obj3, tLObject, (TLRPC.TL_messages_requestUrlAuth) obj, (String) obj2, tL_error));
                break;
            case 16:
                String str4 = LaunchActivity.B1;
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.jv0(obj3, obj2, tLObject, (TLObject) obj, tL_error, 7));
                break;
            case 17:
                String str5 = LaunchActivity.B1;
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.jv0(obj3, obj2, tL_error, tLObject, obj, 10));
                break;
            case 18:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.jv0(obj3, (Object) tL_error, (Object) tLObject, obj, (String) obj2, 11));
                break;
            case 19:
                org.telegram.messenger.g0.h3(new rp((pa0) obj3, (org.telegram.ui.ActionBar.u1[]) obj2, (TLRPC.TL_messageMediaVenue) obj, 24));
                break;
            case 20:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.jv0((org.telegram.ui.Components.wt0) obj3, tLObject, (Bundle) obj2, tL_error, (TLObject) obj, 13));
                break;
            case 21:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.jv0((org.telegram.ui.Components.wt0) obj3, tLObject, (Bundle) obj2, tL_error, (TLObject) obj, 15));
                break;
            case 22:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.jv0((org.telegram.ui.Components.wt0) obj3, tLObject, (Bundle) obj2, tL_error, (TLObject) obj, 14));
                break;
            case 23:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.jv0(obj3, obj2, tL_error, tLObject, obj, 16));
                break;
            case 24:
                jg0 jg0Var = (jg0) obj3;
                String str6 = (String) obj2;
                TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = (TL_stats.TL_loadAsyncGraph) obj;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        bVar = c51.h0(new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data), 1, false);
                    } catch (JSONException e10) {
                        e10.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    org.telegram.messenger.g0.h3(new zc0(10, jg0Var, (TL_stats.TL_statsGraphError) tLObject));
                }
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.jv0((Object) jg0Var, tL_error, (Object) bVar, (Serializable) str6, (TLObject) tL_loadAsyncGraph, 17));
                break;
            case 25:
                gg0 gg0Var = (gg0) obj3;
                String str7 = (String) obj2;
                b51 b51Var = (b51) obj;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        bVar = c51.h0(new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data), gg0Var.r.i, false);
                    } catch (JSONException e11) {
                        e11.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(gg0Var.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.kn0(gg0Var, bVar, str7, b51Var, 23));
                break;
            case 26:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.jv0((ah0) obj3, (TLRPC.TL_contacts_importedContacts) tLObject, (TLRPC.TL_inputPhoneContact) obj2, tL_error, (TLRPC.TL_contacts_importContacts) obj));
                break;
            case 27:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.jv0(obj3, tL_error, obj2, (Object) tLObject, obj, 20));
                break;
            case 28:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.jv0(obj3, tL_error, (Object) tLObject, (Serializable) obj2, (TLObject) obj, 21));
                break;
            default:
                hl0 hl0Var = (hl0) obj3;
                zc0 zc0Var = (zc0) obj2;
                TLObject tLObject2 = (TLObject) obj;
                if (!(tLObject instanceof TLRPC.TL_payments_validatedRequestedInfo)) {
                    org.telegram.messenger.g0.h3(new kk0(hl0Var, tL_error, tLObject2, 2));
                    break;
                } else {
                    org.telegram.messenger.g0.h3(new mc0(hl0Var, (TLRPC.TL_payments_validatedRequestedInfo) tLObject, zc0Var, 18));
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
