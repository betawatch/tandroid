package org.telegram.ui;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.KeyEvent;
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
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
                org.telegram.messenger.g0.h3(new ai.b((la) obj3, (String) obj2, tL_error, tLObject, (TL_account.checkUsername) obj, 22));
                break;
            case 1:
                final la laVar = (la) obj3;
                final org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) obj2;
                TL_account.updateUsername updateusername = (TL_account.updateUsername) obj;
                if (tL_error != null) {
                    if (!"USERNAME_NOT_MODIFIED".equals(tL_error.text)) {
                        if (!"USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text) && !"USERNAME_INVALID".equals(tL_error.text)) {
                            org.telegram.messenger.g0.h3(new org.telegram.ui.ActionBar.m5(laVar, t1Var, tL_error, updateusername, 4));
                            break;
                        } else {
                            org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.aa
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
                        org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.aa
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i11) {
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
                    org.telegram.messenger.g0.h3(new o1(laVar, t1Var, (TLRPC.User) tLObject, 8));
                    break;
                }
            case 2:
                org.telegram.messenger.g0.h3(new ai.b((ad) obj3, (String) obj2, tL_error, tLObject, (TLRPC.TL_channels_checkUsername) obj, 25));
                break;
            case 3:
                org.telegram.messenger.g0.h3(new org.telegram.ui.ActionBar.m5((an) obj3, (vf.b) obj2, tLObject, (di.i2) obj, 6));
                break;
            case 4:
                an anVar = (an) obj3;
                long[] jArr = (long[]) obj;
                org.telegram.messenger.g0.r((org.telegram.ui.ActionBar.m5) obj2);
                anVar.u5.k.voiceTranscriptionRated = true;
                org.telegram.messenger.vr messagesStorage = anVar.getMessagesStorage();
                messagesStorage.a.c(new org.telegram.messenger.fk(messagesStorage, anVar.u5.e1(), org.telegram.messenger.gj.B0(anVar.u5.k), anVar.u5.k, 6));
                org.telegram.messenger.g0.i3(new uf(anVar, 20), jArr[0] > 0 ? Math.max(0L, 300 - (SystemClock.elapsedRealtime() - jArr[0])) : 0L);
                break;
            case 5:
                an anVar2 = (an) obj3;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) obj;
                org.telegram.messenger.g0.h3(new xf((org.telegram.ui.ActionBar.t1[]) obj2, i12));
                if (tL_error != null) {
                    org.telegram.messenger.g0.h3(new o1(anVar2, tL_error, tL_messages_editMessage, 22));
                    break;
                } else {
                    anVar2.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                    break;
                }
            case 6:
                org.telegram.messenger.g0.h3(new ai.b((ho) obj3, (String) obj2, tL_error, tLObject, (TLRPC.TL_channels_checkUsername) obj, 29));
                break;
            case 7:
                org.telegram.messenger.g0.h3(new hp((ns) obj3, tL_error, tLObject, (ArrayList) obj2, (TLRPC.TL_messages_getMyStickers) obj, 7));
                break;
            case 8:
                org.telegram.messenger.g0.h3(new hp(obj3, (Object) tLObject, obj2, obj, tL_error, 8));
                break;
            case 9:
                org.telegram.messenger.g0.h3(new fu((yw) obj3, (TLRPC.TL_attachMenuBot) obj2, (LaunchActivity) obj, i12));
                break;
            case 10:
                org.telegram.messenger.g0.h3(new tp((g00) obj3, (org.telegram.ui.ActionBar.t1) obj2, (org.telegram.messenger.so) obj, 9));
                break;
            case 11:
                c40 c40Var = (c40) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                if (tLObject == null) {
                    org.telegram.messenger.g0.h3(new org.telegram.ui.Components.voip.u(25, c40Var, tL_error));
                    break;
                } else {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    int i13 = 0;
                    while (true) {
                        if (i13 < updates.updates.size()) {
                            TLRPC.Update update = updates.updates.get(i13);
                            if (update instanceof TL_update.TL_updateGroupCall) {
                                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.ma0(c40Var, chat, inputPeer, (TL_update.TL_updateGroupCall) update, 9));
                            } else {
                                i13++;
                            }
                        }
                    }
                    org.telegram.messenger.np.s1(c40Var.o1.a).O3(updates, false);
                    break;
                }
            case 12:
                org.telegram.messenger.g0.h3(new hp(obj3, obj2, (Object) tLObject, obj, tL_error, 9));
                break;
            case 13:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.ma0(tLObject, (ArrayList) obj3, (ArrayList) obj2, (hp) obj, 11));
                break;
            case 14:
                k50 k50Var = (k50) obj3;
                String str = (String) obj;
                l50 l50Var = k50Var.r;
                if (Objects.equals(k50Var.h, (String) obj2) && (tLObject instanceof TLRPC.TL_messages_foundStickerSets)) {
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
                        if (!l50Var.O || stickerSet.emojis) {
                            arrayList.add(tL_messages_stickerSet);
                        }
                    }
                    String trim = str.toLowerCase(Locale.ROOT).trim();
                    ArrayList arrayList3 = new ArrayList();
                    i7 = ((org.telegram.ui.ActionBar.e2) l50Var).currentAccount;
                    ArrayList s02 = org.telegram.messenger.si.b0(i7).s0(l50Var.h0());
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
                    org.telegram.messenger.g0.h3(new org.telegram.ui.Components.ma0(k50Var, arrayList, arrayList3, str, 14));
                    break;
                }
                break;
            case 15:
                String str3 = LaunchActivity.C1;
                org.telegram.messenger.g0.h3(new hp(obj3, (Object) tLObject, obj, obj2, tL_error, 13));
                break;
            case 16:
                String str4 = LaunchActivity.C1;
                org.telegram.messenger.g0.h3(new hp(obj3, obj2, (Object) tLObject, obj, tL_error, 11));
                break;
            case 17:
                String str5 = LaunchActivity.C1;
                org.telegram.messenger.g0.h3(new hp(obj3, (Object) tLObject, obj2, obj, tL_error, 14));
                break;
            case 18:
                org.telegram.messenger.g0.h3(new hp((q90) obj3, tL_error, tLObject, (TLRPC.TL_inputInvoiceSlug) obj, (String) obj2, 15));
                break;
            case 19:
                org.telegram.messenger.g0.h3(new tp((pa0) obj3, (org.telegram.ui.ActionBar.t1[]) obj2, (TLRPC.TL_messageMediaVenue) obj, 24));
                break;
            case 20:
                org.telegram.messenger.g0.h3(new hp((KeyEvent.Callback) obj3, tLObject, obj2, tL_error, (TLObject) obj, 17));
                break;
            case 21:
                org.telegram.messenger.g0.h3(new hp((KeyEvent.Callback) obj3, tLObject, obj2, tL_error, (TLObject) obj, 19));
                break;
            case 22:
                org.telegram.messenger.g0.h3(new hp((KeyEvent.Callback) obj3, tLObject, obj2, tL_error, (TLObject) obj, 18));
                break;
            case 23:
                org.telegram.messenger.g0.h3(new hp(obj3, (Object) tLObject, obj2, obj, tL_error, 20));
                break;
            case 24:
                jg0 jg0Var = (jg0) obj3;
                String str6 = (String) obj2;
                TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = (TL_stats.TL_loadAsyncGraph) obj;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        bVar = z41.h0(new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data), 1, false);
                    } catch (JSONException e10) {
                        e10.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    org.telegram.messenger.g0.h3(new jd0(6, jg0Var, (TL_stats.TL_statsGraphError) tLObject));
                }
                org.telegram.messenger.g0.h3(new hp(jg0Var, tL_error, bVar, str6, tL_loadAsyncGraph, 21));
                break;
            case 25:
                gg0 gg0Var = (gg0) obj3;
                String str7 = (String) obj2;
                y41 y41Var = (y41) obj;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        bVar = z41.h0(new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data), gg0Var.r.i, false);
                    } catch (JSONException e11) {
                        e11.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(gg0Var.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.ma0(gg0Var, bVar, str7, y41Var, 26));
                break;
            case 26:
                org.telegram.messenger.g0.h3(new hp((KeyEvent.Callback) obj3, tLObject, obj2, tL_error, (TLObject) obj, 22));
                break;
            case 27:
                org.telegram.messenger.g0.h3(new hp((ak0) obj3, tL_error, (Bundle) obj2, tLObject, (TLRPC.TL_auth_resendCode) obj, 24));
                break;
            case 28:
                org.telegram.messenger.g0.h3(new hp((jl0) obj3, tL_error, tLObject, (String) obj2, (TL_account.getPassword) obj, 25));
                break;
            default:
                jl0 jl0Var = (jl0) obj3;
                jd0 jd0Var = (jd0) obj2;
                TLObject tLObject2 = (TLObject) obj;
                if (!(tLObject instanceof TLRPC.TL_payments_validatedRequestedInfo)) {
                    org.telegram.messenger.g0.h3(new nk0(jl0Var, tL_error, tLObject2, 2));
                    break;
                } else {
                    org.telegram.messenger.g0.h3(new lc0(jl0Var, (TLRPC.TL_payments_validatedRequestedInfo) tLObject, jd0Var, 18));
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
