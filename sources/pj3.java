// default package

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_ephemeral;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class pj3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ pj3(int i, String str, boolean z, TLRPC.WallPaper wallPaper, w52 w52Var) {
        this.a = (byte) 7;
        this.b = i;
        this.f = str;
        this.d = z;
        this.c = wallPaper;
        this.e = w52Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x01d6, code lost:
    
        if (r2.isEmpty() != false) goto L83;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        String str;
        TLRPC.Document document;
        byte b = this.a;
        final byte b2 = 0;
        char c = 1;
        final boolean z = this.d;
        Object obj = this.e;
        Object obj2 = this.c;
        Object obj3 = this.f;
        final int i = this.b;
        switch (b) {
            case 0:
                vj3 vj3Var = (vj3) obj3;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = (TLRPC.TL_messages_searchGlobal) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList3 = vj3Var.W;
                int i2 = vj3Var.Q;
                if (i == vj3Var.g0 && TextUtils.equals(tL_messages_searchGlobal.q, vj3Var.h0)) {
                    vj3Var.c0 = false;
                    if (!z) {
                        arrayList3.clear();
                    }
                    if (tLObject instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        ad7.Y(i2).j1(messages_messages.users, messages_messages.chats, true, true);
                        na7.q1(i2).b4(messages_messages.users, false);
                        na7.q1(i2).V3(messages_messages.chats, false);
                        ArrayList<TLRPC.Message> arrayList4 = messages_messages.messages;
                        int size = arrayList4.size();
                        int i3 = 0;
                        while (i3 < size) {
                            TLRPC.Message message = arrayList4.get(i3);
                            i3++;
                            k27 k27Var = new k27(i2, message, false, true);
                            k27Var.J5(vj3Var.h0, true);
                            arrayList3.add(k27Var);
                        }
                        vj3Var.e0 = messages_messages instanceof TLRPC.TL_messages_messagesSlice;
                        arrayList3.size();
                        vj3Var.f0 = messages_messages.next_rate;
                    }
                    vj3Var.O(true);
                    break;
                }
                break;
            case 1:
                xj3 xj3Var = (xj3) obj3;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = (TLRPC.TL_messages_searchGlobal) obj2;
                TLObject tLObject2 = (TLObject) obj;
                ArrayList arrayList5 = xj3Var.S;
                int i4 = xj3Var.Q;
                if (i == xj3Var.d0 && TextUtils.equals(tL_messages_searchGlobal2.q, xj3Var.e0)) {
                    xj3Var.Z = false;
                    if (!z) {
                        arrayList5.clear();
                    }
                    if (tLObject2 instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject2;
                        ad7.Y(i4).j1(messages_messages2.users, messages_messages2.chats, true, true);
                        na7.q1(i4).b4(messages_messages2.users, false);
                        na7.q1(i4).V3(messages_messages2.chats, false);
                        ArrayList<TLRPC.Message> arrayList6 = messages_messages2.messages;
                        int size2 = arrayList6.size();
                        int i5 = 0;
                        while (i5 < size2) {
                            TLRPC.Message message2 = arrayList6.get(i5);
                            i5++;
                            k27 k27Var2 = new k27(i4, message2, false, true);
                            k27Var2.J5(xj3Var.e0, true);
                            arrayList5.add(k27Var2);
                        }
                        xj3Var.b0 = messages_messages2 instanceof TLRPC.TL_messages_messagesSlice;
                        arrayList5.size();
                        xj3Var.c0 = messages_messages2.next_rate;
                    }
                    xj3Var.O(true);
                    break;
                }
                break;
            case 2:
                final lw6 lw6Var = (lw6) obj3;
                final kw6 kw6Var = (kw6) obj;
                lw6Var.j0((mw6) obj2, new kw6() { // from class: dw6
                    @Override // kw6
                    public final void a(su6 su6Var) {
                        kw6 kw6Var2 = kw6Var;
                        lw6 lw6Var2 = lw6.this;
                        tv6 tv6Var = lw6Var2.j;
                        mv6 mv6Var = lw6Var2.g;
                        int i6 = i;
                        if (!mv6Var.X(su6Var, i6)) {
                            if (i6 == 1) {
                                tv6Var.t();
                                if (tv6Var.t.s()) {
                                    return;
                                }
                                lad.f("MediaSessionLegacyStub", "Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
                                return;
                            }
                            return;
                        }
                        cff cffVar = tv6Var.e;
                        tv6Var.q(su6Var);
                        cffVar.getClass();
                        try {
                            kw6Var2.a(su6Var);
                        } catch (RemoteException e) {
                            lad.g("MediaSessionLegacyStub", "Exception in " + su6Var, e);
                        }
                        if (z) {
                            jc8 jc8Var = new jc8();
                            jc8Var.a.b(i6);
                            jc8Var.b();
                            tv6Var.n(su6Var);
                        }
                    }
                });
                break;
            case 3:
                na7 na7Var = (na7) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                final sm1 sm1Var = (sm1) obj;
                LongSparseIntArray longSparseIntArray = na7Var.s0;
                vf6 vf6Var = na7Var.r0;
                ArrayList arrayList7 = (ArrayList) vf6Var.f(chat.id);
                vf6 vf6Var2 = na7Var.t0;
                ArrayList arrayList8 = (ArrayList) vf6Var2.f(chat.id);
                if (z) {
                    if (arrayList7 != null) {
                        arrayList7.remove(Integer.valueOf(i));
                        break;
                    }
                    vf6Var.e(chat.id);
                    if (chat.megagroup) {
                        if (arrayList8 != null) {
                            arrayList8.remove(Integer.valueOf(i));
                            if (!arrayList8.isEmpty()) {
                            }
                        }
                        vf6Var2.e(chat.id);
                        break;
                    }
                } else {
                    if (arrayList7 == null) {
                        arrayList7 = new ArrayList();
                        vf6Var.k(arrayList7, chat.id);
                    }
                    if (!arrayList7.contains(Integer.valueOf(i))) {
                        arrayList7.add(Integer.valueOf(i));
                    }
                    if (na7Var.q0.indexOfKey(chat.id) < 0) {
                        if (sm1Var != null) {
                            gl.c3(new Runnable() { // from class: i97
                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b3 = b2;
                                    sm1 sm1Var2 = sm1Var;
                                    switch (b3) {
                                        case 0:
                                            sm1Var2.accept(Boolean.TRUE);
                                            break;
                                        default:
                                            sm1Var2.accept(Boolean.FALSE);
                                            break;
                                    }
                                }
                            });
                        }
                        arrayList = arrayList8;
                        na7Var.H0(chat.id, 3, 0L, null);
                    } else {
                        arrayList = arrayList8;
                        if (sm1Var != null) {
                            final char c2 = c == true ? 1 : 0;
                            gl.c3(new Runnable() { // from class: i97
                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b3 = c2;
                                    sm1 sm1Var2 = sm1Var;
                                    switch (b3) {
                                        case 0:
                                            sm1Var2.accept(Boolean.TRUE);
                                            break;
                                        default:
                                            sm1Var2.accept(Boolean.FALSE);
                                            break;
                                    }
                                }
                            });
                        }
                    }
                    if (chat.megagroup && !chat.monoforum) {
                        if (arrayList == null) {
                            arrayList2 = new ArrayList();
                            vf6Var2.k(arrayList2, chat.id);
                        } else {
                            arrayList2 = arrayList;
                        }
                        if (!arrayList2.contains(Integer.valueOf(i))) {
                            arrayList2.add(Integer.valueOf(i));
                        }
                        if (longSparseIntArray.indexOfKey(chat.id) < 0) {
                            longSparseIntArray.put(chat.id, 0);
                            break;
                        }
                    }
                }
                break;
            case 4:
                gu7 gu7Var = (gu7) obj3;
                vn5 vn5Var = (vn5) obj;
                gu7Var.d((dy7) obj2, i, z ? gu7Var.h : null);
                if (z) {
                    gu7Var.h = null;
                }
                if (vn5Var != null) {
                    vn5Var.run();
                    break;
                }
                break;
            case 5:
                z3a z3aVar = (z3a) obj3;
                TLObject tLObject3 = (TLObject) obj;
                k3a k3aVar = (k3a) obj2;
                if (tLObject3 instanceof TLRPC.TL_messageMediaDocument) {
                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = (TLRPC.TL_messageMediaDocument) tLObject3;
                    TLRPC.TL_inputMediaUploadedPhoto tL_inputMediaUploadedPhoto = new TLRPC.TL_inputMediaUploadedPhoto();
                    tL_inputMediaUploadedPhoto.live_photo = true;
                    tL_inputMediaUploadedPhoto.file = k3aVar.j;
                    tL_inputMediaUploadedPhoto.spoiler = z;
                    if (i != 0) {
                        tL_inputMediaUploadedPhoto.ttl_seconds = i;
                        tL_inputMediaUploadedPhoto.flags |= 2;
                    }
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    tL_inputMediaUploadedPhoto.video = tL_inputDocument;
                    TLRPC.Document document2 = tL_messageMediaDocument.document;
                    tL_inputDocument.id = document2.id;
                    tL_inputDocument.access_hash = document2.access_hash;
                    tL_inputDocument.file_reference = document2.file_reference;
                    TLObject tLObject4 = k3aVar.c;
                    if (tLObject4 instanceof TLRPC.TL_messages_sendMedia) {
                        ((TLRPC.TL_messages_sendMedia) tLObject4).media = tL_inputMediaUploadedPhoto;
                    } else if (tLObject4 instanceof TL_ephemeral.TL_sendMessage) {
                        ((TL_ephemeral.TL_sendMessage) tLObject4).media = tL_inputMediaUploadedPhoto;
                    } else if (tLObject4 instanceof TLRPC.TL_messages_addPollAnswer) {
                        ((TLRPC.TL_messages_addPollAnswer) tLObject4).answer.input_media = tL_inputMediaUploadedPhoto;
                    } else {
                        ((TLRPC.TL_messages_editMessage) tLObject4).media = tL_inputMediaUploadedPhoto;
                    }
                    z3aVar.M(tLObject4, k3aVar.m, k3aVar.f, k3aVar, k3aVar.K, null, k3aVar.H);
                    break;
                } else {
                    k3aVar.c();
                    break;
                }
            case 6:
                String str2 = (String) obj3;
                ImageReceiver imageReceiver = (ImageReceiver) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (z) {
                    str = y6c.h(i).d0;
                    if (str == null) {
                        hq6.d0(i).E();
                        break;
                    }
                } else {
                    str = y6c.h(i).c0;
                    if (str == null) {
                        hq6.d0(i).B();
                        break;
                    }
                }
                TLRPC.TL_messages_stickerSet q0 = hq6.d0(i).q0(str);
                if (q0 == null) {
                    q0 = hq6.d0(i).o0(str);
                }
                if (q0 != null) {
                    int i6 = 0;
                    while (true) {
                        if (i6 < q0.packs.size()) {
                            TLRPC.TL_stickerPack tL_stickerPack = q0.packs.get(i6);
                            if (!TextUtils.equals(tL_stickerPack.emoticon, str2) || tL_stickerPack.documents.isEmpty()) {
                                i6++;
                            } else {
                                long longValue = tL_stickerPack.documents.get(0).longValue();
                                for (int i7 = 0; i7 < q0.documents.size(); i7++) {
                                    document = q0.documents.get(i7);
                                    if (document == null || document.id != longValue) {
                                    }
                                }
                            }
                        }
                    }
                    document = null;
                    if (document == null && !q0.documents.isEmpty()) {
                        document = q0.documents.get(0);
                    }
                } else {
                    document = null;
                }
                if (document != null) {
                    imageReceiver.v0 = true;
                    imageReceiver.h1 = new ln8((Object) zArr, (byte) 18);
                    kcb f = uo3.f(document, bkb.Z6, 0.3f, null);
                    TLRPC.PhotoSize w = ba4.w(document.thumbs, kk7.p2, true, null, true);
                    imageReceiver.M(0);
                    imageReceiver.Z(gl5.b(document), "160_160_nr", gl5.c(w, document), "160_160", f, document.size, "tgs", q0, 1);
                    break;
                } else {
                    hq6.d0(i).d1(str, false, q0 == null);
                    break;
                }
                break;
            default:
                String str3 = (String) obj3;
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) obj2;
                w52 w52Var = (w52) obj;
                xqc[] xqcVarArr = xqc.f;
                xqc xqcVar = xqcVarArr[i];
                if (xqcVar == null) {
                    xqcVar = new xqc(i);
                    xqcVarArr[i] = xqcVar;
                }
                xqcVar.d(str3, this.d, wallPaper.document, wallPaper, w52Var);
                break;
        }
    }

    public /* synthetic */ pj3(lw6 lw6Var, mw6 mw6Var, int i, kw6 kw6Var, boolean z) {
        this.a = (byte) 2;
        this.f = lw6Var;
        this.c = mw6Var;
        this.b = i;
        this.e = kw6Var;
        this.d = z;
    }

    public /* synthetic */ pj3(na7 na7Var, TLRPC.Chat chat, boolean z, int i, sm1 sm1Var) {
        this.a = (byte) 3;
        this.f = na7Var;
        this.c = chat;
        this.d = z;
        this.b = i;
        this.e = sm1Var;
    }

    public /* synthetic */ pj3(gu7 gu7Var, dy7 dy7Var, int i, boolean z, vn5 vn5Var) {
        this.a = (byte) 4;
        this.f = gu7Var;
        this.c = dy7Var;
        this.b = i;
        this.d = z;
        this.e = vn5Var;
    }

    public /* synthetic */ pj3(z3a z3aVar, TLObject tLObject, k3a k3aVar, boolean z, int i) {
        this.a = (byte) 5;
        this.f = z3aVar;
        this.e = tLObject;
        this.c = k3aVar;
        this.d = z;
        this.b = i;
    }

    public /* synthetic */ pj3(l5c l5cVar, int i, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z, TLObject tLObject, byte b) {
        this.a = b;
        this.f = l5cVar;
        this.b = i;
        this.c = tL_messages_searchGlobal;
        this.d = z;
        this.e = tLObject;
    }

    public /* synthetic */ pj3(boolean z, int i, String str, ImageReceiver imageReceiver, boolean[] zArr) {
        this.a = (byte) 6;
        this.d = z;
        this.b = i;
        this.f = str;
        this.c = imageReceiver;
        this.e = zArr;
    }
}
