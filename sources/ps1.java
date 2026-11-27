// default package

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class ps1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ps1(lna lnaVar, boolean z, int i, wb2 wb2Var) {
        this.a = (byte) 9;
        this.d = lnaVar;
        this.c = z;
        this.b = i;
        this.e = wb2Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:24|25|(2:26|27)|(19:(3:221|222|(36:224|225|226|227|30|31|32|33|34|35|36|(7:41|42|43|44|45|38|39)|71|72|73|74|75|(6:77|78|79|80|(1:82)(1:191)|83)(1:200)|84|85|(3:173|174|(1:180))|87|88|(9:145|146|147|148|149|150|151|152|(3:154|(1:156)|157))(1:90)|91|92|(4:126|127|128|(12:130|131|132|(1:134)|95|(1:97)|98|(4:102|(1:104)|105|(1:109))|110|(2:112|(1:114))|124|125))|94|95|(0)|98|(5:100|102|(0)|105|(2:107|109))|110|(0)|124|125))|84|85|(0)|87|88|(0)(0)|91|92|(0)|94|95|(0)|98|(0)|110|(0)|124|125)|29|30|31|32|33|34|35|36|(2:38|39)|71|72|73|74|75|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x02eb, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x02ec, code lost:
    
        r13 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x02e0, code lost:
    
        r12 = r4;
        r2 = true;
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x02e7, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x02e8, code lost:
    
        r13 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x02da, code lost:
    
        r12 = r4;
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x02f1, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x02ef, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x02f5, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x02f3, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x031b, code lost:
    
        r4.dispose();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x031e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:?, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0245 A[Catch: all -> 0x02a6, Exception -> 0x02a9, TryCatch #35 {Exception -> 0x02a9, all -> 0x02a6, blocks: (B:132:0x0207, B:134:0x020d, B:95:0x0220, B:97:0x0226, B:98:0x023e, B:100:0x0245, B:102:0x0249, B:104:0x024f, B:105:0x0256, B:107:0x025e, B:109:0x0268, B:110:0x0273, B:112:0x0279, B:114:0x0288), top: B:131:0x0207 }] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x024f A[Catch: all -> 0x02a6, Exception -> 0x02a9, TryCatch #35 {Exception -> 0x02a9, all -> 0x02a6, blocks: (B:132:0x0207, B:134:0x020d, B:95:0x0220, B:97:0x0226, B:98:0x023e, B:100:0x0245, B:102:0x0249, B:104:0x024f, B:105:0x0256, B:107:0x025e, B:109:0x0268, B:110:0x0273, B:112:0x0279, B:114:0x0288), top: B:131:0x0207 }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0279 A[Catch: all -> 0x02a6, Exception -> 0x02a9, TryCatch #35 {Exception -> 0x02a9, all -> 0x02a6, blocks: (B:132:0x0207, B:134:0x020d, B:95:0x0220, B:97:0x0226, B:98:0x023e, B:100:0x0245, B:102:0x0249, B:104:0x024f, B:105:0x0256, B:107:0x025e, B:109:0x0268, B:110:0x0273, B:112:0x0279, B:114:0x0288), top: B:131:0x0207 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0200 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0165 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ea A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0142 A[Catch: all -> 0x02f3, Exception -> 0x02f5, TRY_LEAVE, TryCatch #33 {Exception -> 0x02f5, all -> 0x02f3, blocks: (B:31:0x00be, B:73:0x011d, B:75:0x013c, B:77:0x0142), top: B:30:0x00be }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0226 A[Catch: all -> 0x02a6, Exception -> 0x02a9, TryCatch #35 {Exception -> 0x02a9, all -> 0x02a6, blocks: (B:132:0x0207, B:134:0x020d, B:95:0x0220, B:97:0x0226, B:98:0x023e, B:100:0x0245, B:102:0x0249, B:104:0x024f, B:105:0x0256, B:107:0x025e, B:109:0x0268, B:110:0x0273, B:112:0x0279, B:114:0x0288), top: B:131:0x0207 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        char c;
        SQLiteCursor sQLiteCursor;
        boolean z;
        TLRPC.UserFull userFull;
        int i;
        boolean z2;
        TLRPC.UserFull TLdeserialize;
        int i2;
        boolean z3;
        boolean z4;
        ArrayList arrayList;
        ArrayList arrayList2;
        TLRPC.PeerSettings peerSettings;
        long j;
        long j2;
        switch (this.a) {
            case 0:
                qs1 qs1Var = (qs1) this.d;
                boolean z5 = this.c;
                ArrayList arrayList3 = (ArrayList) this.e;
                int i3 = this.b;
                zu1 zu1Var = qs1Var.b;
                if (!z5) {
                    if (zu1Var.x4) {
                        for (int i4 = 0; i4 < arrayList3.size(); i4++) {
                            zu1Var.getMessagesController().L3(zu1Var.e, zu1Var.f, ((Integer) arrayList3.get(i4)).intValue(), true, false, false);
                        }
                    } else {
                        uc7 messagesController = zu1Var.getMessagesController();
                        TLRPC.Chat chat = zu1Var.e;
                        TLRPC.User user = zu1Var.f;
                        messagesController.getClass();
                        if (chat != null || user != null) {
                            TLRPC.TL_messages_unpinAllMessages tL_messages_unpinAllMessages = new TLRPC.TL_messages_unpinAllMessages();
                            tL_messages_unpinAllMessages.peer = messagesController.j1(chat != null ? -chat.id : user.id);
                            messagesController.getConnectionsManager().sendRequest(tL_messages_unpinAllMessages, new m65(messagesController, chat, user, (byte) 21));
                        }
                    }
                }
                if (i3 == zu1Var.R3) {
                    zu1Var.P3 = null;
                    return;
                }
                return;
            case 1:
                ((ConnectionsManager) this.d).lambda$cancelRequest$10((Runnable) this.e, this.b, this.c);
                return;
            case 2:
                nk3 nk3Var = (nk3) this.d;
                int i5 = this.b;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = (TLRPC.TL_messages_searchGlobal) this.e;
                boolean z6 = this.c;
                if (i5 == nk3Var.g0 && TextUtils.equals(tL_messages_searchGlobal.q, nk3Var.h0)) {
                    ConnectionsManager.getInstance(nk3Var.Q).sendRequest(tL_messages_searchGlobal, new jk3(nk3Var, i5, tL_messages_searchGlobal, z6, (byte) 0));
                    return;
                }
                return;
            case 3:
                pk3 pk3Var = (pk3) this.d;
                int i6 = this.b;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = (TLRPC.TL_messages_searchGlobal) this.e;
                boolean z7 = this.c;
                if (i6 == pk3Var.d0 && TextUtils.equals(tL_messages_searchGlobal2.q, pk3Var.e0)) {
                    ConnectionsManager.getInstance(pk3Var.Q).sendRequest(tL_messages_searchGlobal2, new jk3(pk3Var, i6, tL_messages_searchGlobal2, z7, (byte) 1));
                    return;
                }
                return;
            case 4:
                j95 j95Var = (j95) this.d;
                TLObject tLObject = (TLObject) this.e;
                int i7 = this.b;
                boolean z8 = this.c;
                boolean z9 = tLObject instanceof TL_phone.exportedGroupCallInvite;
                String[] strArr = j95Var.I4;
                if (z9) {
                    strArr[i7] = ((TL_phone.exportedGroupCallInvite) tLObject).link;
                } else {
                    strArr[i7] = "";
                }
                for (int i8 = 0; i8 < 2; i8++) {
                    String str = strArr[i8];
                    if (str == null) {
                        return;
                    }
                    if (str.length() == 0) {
                        strArr[i8] = null;
                    }
                }
                if (z8 || !j95Var.H0() || j95Var.T2.b.join_muted) {
                    c = 0;
                } else {
                    c = 0;
                    strArr[0] = null;
                }
                if (strArr[c] != null || strArr[1] != null || !xc2.t0(j95Var.S2)) {
                    j95Var.p1(strArr[0], strArr[1], false, z8);
                    return;
                }
                j95Var.p1(null, uc7.s1(j95Var.n1.a).N2 + "/" + xc2.K(j95Var.S2, false), true, z8);
                return;
            case 5:
                sm5 sm5Var = (sm5) this.d;
                int i9 = this.b;
                String str2 = (String) this.e;
                boolean z10 = this.c;
                sm5Var.getClass();
                hl.c3(new rm5(i9, str2, z10));
                sm5Var.b.u.remove(str2);
                return;
            case 6:
                ob6 ob6Var = (ob6) this.d;
                Vector vector = (Vector) this.e;
                boolean z11 = this.c;
                int i10 = this.b;
                HashMap hashMap = ob6Var.N;
                ArrayList arrayList4 = ob6Var.J;
                HashMap hashMap2 = ob6Var.M;
                ob6Var.I = false;
                ArrayList arrayList5 = ob6Var.L;
                int size = arrayList5.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((mb6) arrayList5.get(i11)).k = ConnectionsManager.DEFAULT_DATACENTER_ID;
                }
                int size2 = vector.objects.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    TLRPC.TL_langPackLanguage tL_langPackLanguage = (TLRPC.TL_langPackLanguage) vector.objects.get(i12);
                    if (f11.a) {
                        uh9.s(tL_langPackLanguage.name, new StringBuilder("loaded lang "));
                    }
                    mb6 mb6Var = new mb6();
                    mb6Var.b = tL_langPackLanguage.name;
                    mb6Var.a = tL_langPackLanguage.native_name;
                    mb6Var.c = tL_langPackLanguage.lang_code.replace('-', '_').toLowerCase();
                    String str3 = tL_langPackLanguage.base_lang_code;
                    if (str3 != null) {
                        mb6Var.e = str3.replace('-', '_').toLowerCase();
                    } else {
                        mb6Var.e = "";
                    }
                    mb6Var.f = tL_langPackLanguage.plural_code.replace('-', '_').toLowerCase();
                    mb6Var.g = tL_langPackLanguage.rtl;
                    mb6Var.d = "remote";
                    mb6Var.k = i12;
                    mb6 F0 = ob6Var.F0(mb6Var.b());
                    if (F0 == null) {
                        arrayList4.add(mb6Var);
                        hashMap.put(mb6Var.b(), mb6Var);
                    } else {
                        F0.b = mb6Var.b;
                        F0.a = mb6Var.a;
                        F0.e = mb6Var.e;
                        F0.f = mb6Var.f;
                        F0.d = mb6Var.d;
                        F0.k = mb6Var.k;
                        mb6Var = F0;
                    }
                    if (!hashMap2.containsKey(mb6Var.b())) {
                        arrayList5.add(mb6Var);
                        hashMap2.put(mb6Var.b(), mb6Var);
                    }
                }
                int i13 = 0;
                while (i13 < arrayList5.size()) {
                    mb6 mb6Var2 = (mb6) arrayList5.get(i13);
                    if (mb6Var2.k == Integer.MAX_VALUE && mb6Var2 != ob6Var.B) {
                        if (f11.a) {
                            cc4.b("remove lang " + mb6Var2.b());
                        }
                        arrayList5.remove(i13);
                        hashMap2.remove(mb6Var2.b());
                        arrayList4.remove(mb6Var2);
                        hashMap.remove(mb6Var2.b());
                        i13--;
                    }
                    i13++;
                }
                ob6Var.a1();
                jn7.e().k(jn7.B4, new Object[0]);
                if (z11) {
                    ob6Var.d(ob6Var.B, true, false, i10);
                    return;
                }
                return;
            case 7:
                ((ls6) this.d).c1(this.b, false, this.c, false, (pcc) this.e);
                return;
            case 8:
                jf7 jf7Var = (jf7) this.d;
                TLRPC.User user2 = (TLRPC.User) this.e;
                boolean z12 = this.c;
                int i14 = this.b;
                HashMap hashMap3 = new HashMap();
                ArrayList arrayList6 = new ArrayList();
                try {
                    SQLiteCursor queryFinalized = jf7Var.b.queryFinalized("SELECT info, pinned FROM user_settings WHERE uid = " + user2.id, new Object[0]);
                    try {
                    } catch (Exception e) {
                        e = e;
                        sQLiteCursor = queryFinalized;
                        z = true;
                        userFull = null;
                        i = 0;
                        z2 = false;
                        try {
                            jf7Var.n(e, z);
                            uc7 messagesController2 = jf7Var.getMessagesController();
                            messagesController2.getClass();
                            hl.c3(new u5a(messagesController2, user2, i14, z12, userFull, arrayList6, hashMap3, i, z2));
                            if (sQLiteCursor == null) {
                            }
                        } catch (Throwable th) {
                            th = th;
                            uc7 messagesController3 = jf7Var.getMessagesController();
                            messagesController3.getClass();
                            hl.c3(new u5a(messagesController3, user2, i14, z12, userFull, arrayList6, hashMap3, i, z2));
                            if (sQLiteCursor != null) {
                                sQLiteCursor.dispose();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        sQLiteCursor = queryFinalized;
                        userFull = null;
                        i = 0;
                        z2 = false;
                        uc7 messagesController32 = jf7Var.getMessagesController();
                        messagesController32.getClass();
                        hl.c3(new u5a(messagesController32, user2, i14, z12, userFull, arrayList6, hashMap3, i, z2));
                        if (sQLiteCursor != null) {
                        }
                        throw th;
                    }
                    try {
                        try {
                            if (queryFinalized.next()) {
                                try {
                                    NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                                    if (byteBufferValue != null) {
                                        TLdeserialize = TLRPC.UserFull.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                        try {
                                            TLdeserialize.pinned_msg_id = queryFinalized.intValue(1);
                                            byteBufferValue.reuse();
                                            queryFinalized.dispose();
                                            SQLiteDatabase sQLiteDatabase = jf7Var.getMessagesStorage().b;
                                            Locale locale = Locale.US;
                                            ArrayList arrayList7 = arrayList6;
                                            queryFinalized = sQLiteDatabase.queryFinalized("SELECT mid FROM chat_pinned_v2 WHERE uid = " + user2.id + " ORDER BY mid DESC", new Object[0]);
                                            while (queryFinalized.next()) {
                                                try {
                                                    try {
                                                        int intValue = queryFinalized.intValue(0);
                                                        arrayList6 = arrayList7;
                                                        arrayList6.add(Integer.valueOf(intValue));
                                                        hashMap3.put(Integer.valueOf(intValue), null);
                                                        arrayList7 = arrayList6;
                                                    } catch (Exception e2) {
                                                        e = e2;
                                                        arrayList6 = arrayList7;
                                                        userFull = TLdeserialize;
                                                        i = 0;
                                                        z2 = false;
                                                        sQLiteCursor = queryFinalized;
                                                        z = true;
                                                        jf7Var.n(e, z);
                                                        uc7 messagesController22 = jf7Var.getMessagesController();
                                                        messagesController22.getClass();
                                                        hl.c3(new u5a(messagesController22, user2, i14, z12, userFull, arrayList6, hashMap3, i, z2));
                                                        if (sQLiteCursor == null) {
                                                        }
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        arrayList6 = arrayList7;
                                                        userFull = TLdeserialize;
                                                        i = 0;
                                                        z2 = false;
                                                        sQLiteCursor = queryFinalized;
                                                        uc7 messagesController322 = jf7Var.getMessagesController();
                                                        messagesController322.getClass();
                                                        hl.c3(new u5a(messagesController322, user2, i14, z12, userFull, arrayList6, hashMap3, i, z2));
                                                        if (sQLiteCursor != null) {
                                                        }
                                                        throw th;
                                                    }
                                                } catch (Exception e3) {
                                                    e = e3;
                                                    arrayList6 = arrayList7;
                                                    userFull = TLdeserialize;
                                                    i = 0;
                                                    z2 = false;
                                                    sQLiteCursor = queryFinalized;
                                                    z = true;
                                                    jf7Var.n(e, z);
                                                    uc7 messagesController222 = jf7Var.getMessagesController();
                                                    messagesController222.getClass();
                                                    hl.c3(new u5a(messagesController222, user2, i14, z12, userFull, arrayList6, hashMap3, i, z2));
                                                    if (sQLiteCursor == null) {
                                                    }
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    arrayList6 = arrayList7;
                                                    userFull = TLdeserialize;
                                                    i = 0;
                                                    z2 = false;
                                                    sQLiteCursor = queryFinalized;
                                                    uc7 messagesController3222 = jf7Var.getMessagesController();
                                                    messagesController3222.getClass();
                                                    hl.c3(new u5a(messagesController3222, user2, i14, z12, userFull, arrayList6, hashMap3, i, z2));
                                                    if (sQLiteCursor != null) {
                                                    }
                                                    throw th;
                                                }
                                            }
                                            arrayList6 = arrayList7;
                                            queryFinalized.dispose();
                                            queryFinalized = jf7Var.b.queryFinalized("SELECT count, end FROM chat_pinned_count WHERE uid = " + user2.id, new Object[0]);
                                            if (queryFinalized.next()) {
                                                i2 = 0;
                                                z3 = false;
                                            } else {
                                                i2 = queryFinalized.intValue(0);
                                                try {
                                                    z3 = queryFinalized.intValue(1) != 0;
                                                } catch (Exception e4) {
                                                    e = e4;
                                                    i = i2;
                                                    userFull = TLdeserialize;
                                                    z2 = false;
                                                    sQLiteCursor = queryFinalized;
                                                    z = true;
                                                    jf7Var.n(e, z);
                                                    uc7 messagesController2222 = jf7Var.getMessagesController();
                                                    messagesController2222.getClass();
                                                    hl.c3(new u5a(messagesController2222, user2, i14, z12, userFull, arrayList6, hashMap3, i, z2));
                                                    if (sQLiteCursor == null) {
                                                    }
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                    i = i2;
                                                    userFull = TLdeserialize;
                                                    z2 = false;
                                                    sQLiteCursor = queryFinalized;
                                                    uc7 messagesController32222 = jf7Var.getMessagesController();
                                                    messagesController32222.getClass();
                                                    hl.c3(new u5a(messagesController32222, user2, i14, z12, userFull, arrayList6, hashMap3, i, z2));
                                                    if (sQLiteCursor != null) {
                                                    }
                                                    throw th;
                                                }
                                            }
                                            queryFinalized.dispose();
                                            if (TLdeserialize != null) {
                                                try {
                                                    if (TLdeserialize.pinned_msg_id != 0 && (arrayList6.isEmpty() || TLdeserialize.pinned_msg_id > ((Integer) arrayList6.get(0)).intValue())) {
                                                        arrayList6.clear();
                                                        arrayList6.add(Integer.valueOf(TLdeserialize.pinned_msg_id));
                                                        hashMap3.put(Integer.valueOf(TLdeserialize.pinned_msg_id), null);
                                                    }
                                                } catch (Exception e5) {
                                                    e = e5;
                                                    i = i2;
                                                    userFull = TLdeserialize;
                                                    z2 = z3;
                                                    z = true;
                                                    sQLiteCursor = null;
                                                    jf7Var.n(e, z);
                                                    uc7 messagesController22222 = jf7Var.getMessagesController();
                                                    messagesController22222.getClass();
                                                    hl.c3(new u5a(messagesController22222, user2, i14, z12, userFull, arrayList6, hashMap3, i, z2));
                                                    if (sQLiteCursor == null) {
                                                    }
                                                } catch (Throwable th6) {
                                                    th = th6;
                                                    i = i2;
                                                    userFull = TLdeserialize;
                                                    z2 = z3;
                                                    sQLiteCursor = null;
                                                    uc7 messagesController322222 = jf7Var.getMessagesController();
                                                    messagesController322222.getClass();
                                                    hl.c3(new u5a(messagesController322222, user2, i14, z12, userFull, arrayList6, hashMap3, i, z2));
                                                    if (sQLiteCursor != null) {
                                                    }
                                                    throw th;
                                                }
                                            }
                                            if (arrayList6.isEmpty()) {
                                                try {
                                                    z4 = z3;
                                                    try {
                                                    } catch (Exception e6) {
                                                        e = e6;
                                                    } catch (Throwable th7) {
                                                        th = th7;
                                                    }
                                                } catch (Exception e7) {
                                                    e = e7;
                                                    z4 = z3;
                                                } catch (Throwable th8) {
                                                    th = th8;
                                                    z4 = z3;
                                                }
                                                try {
                                                    ArrayList R0 = jf7Var.getMediaDataController().R0(user2.id, 0L, arrayList6, true);
                                                    if (R0 != null) {
                                                        int size3 = R0.size();
                                                        for (int i15 = 0; i15 < size3; i15++) {
                                                            r47 r47Var = (r47) R0.get(i15);
                                                            hashMap3.put(Integer.valueOf(r47Var.e1()), r47Var);
                                                        }
                                                    }
                                                } catch (Exception e8) {
                                                    e = e8;
                                                    arrayList6 = arrayList6;
                                                    z2 = z4;
                                                    i = i2;
                                                    userFull = TLdeserialize;
                                                    z = true;
                                                    sQLiteCursor = null;
                                                    jf7Var.n(e, z);
                                                    uc7 messagesController222222 = jf7Var.getMessagesController();
                                                    messagesController222222.getClass();
                                                    hl.c3(new u5a(messagesController222222, user2, i14, z12, userFull, arrayList6, hashMap3, i, z2));
                                                    if (sQLiteCursor == null) {
                                                    }
                                                } catch (Throwable th9) {
                                                    th = th9;
                                                    arrayList6 = arrayList6;
                                                    z2 = z4;
                                                    i = i2;
                                                    userFull = TLdeserialize;
                                                    sQLiteCursor = null;
                                                    uc7 messagesController3222222 = jf7Var.getMessagesController();
                                                    messagesController3222222.getClass();
                                                    hl.c3(new u5a(messagesController3222222, user2, i14, z12, userFull, arrayList6, hashMap3, i, z2));
                                                    if (sQLiteCursor != null) {
                                                    }
                                                    throw th;
                                                }
                                            } else {
                                                z4 = z3;
                                            }
                                            arrayList = new ArrayList();
                                            if (TLdeserialize != null) {
                                                try {
                                                    if ((TLdeserialize.flags2 & 64) != 0) {
                                                        i = i2;
                                                        try {
                                                            long j3 = TLdeserialize.personal_channel_id;
                                                            if (j3 != 0) {
                                                                arrayList.add(Long.valueOf(j3));
                                                            }
                                                            if (!arrayList.isEmpty()) {
                                                                ArrayList arrayList8 = new ArrayList();
                                                                jf7Var.P(TextUtils.join(",", arrayList), arrayList8);
                                                                hl.c3(new q41(jf7Var, arrayList8, (byte) 19));
                                                            }
                                                            arrayList2 = new ArrayList();
                                                            if (TLdeserialize != null && (peerSettings = TLdeserialize.settings) != null) {
                                                                j = peerSettings.bot_inviter_id;
                                                                if (j != 0) {
                                                                    arrayList2.add(Long.valueOf(j));
                                                                }
                                                                j2 = TLdeserialize.settings.bot_owner_id;
                                                                if (j2 != 0 && !arrayList2.contains(Long.valueOf(j2))) {
                                                                    arrayList2.add(Long.valueOf(TLdeserialize.settings.bot_owner_id));
                                                                }
                                                            }
                                                            if (!arrayList2.isEmpty()) {
                                                                ArrayList arrayList9 = new ArrayList();
                                                                jf7Var.k0(arrayList2, arrayList9, false);
                                                                if (!arrayList9.isEmpty()) {
                                                                    hl.c3(new q41(jf7Var, arrayList9, (byte) 20));
                                                                }
                                                            }
                                                            uc7 messagesController4 = jf7Var.getMessagesController();
                                                            messagesController4.getClass();
                                                            hl.c3(new u5a(messagesController4, user2, i14, z12, TLdeserialize, arrayList6, hashMap3, i, z4));
                                                            return;
                                                        } catch (Exception e9) {
                                                            e = e9;
                                                            z2 = z4;
                                                            userFull = TLdeserialize;
                                                            z = true;
                                                            sQLiteCursor = null;
                                                            jf7Var.n(e, z);
                                                            uc7 messagesController2222222 = jf7Var.getMessagesController();
                                                            messagesController2222222.getClass();
                                                            hl.c3(new u5a(messagesController2222222, user2, i14, z12, userFull, arrayList6, hashMap3, i, z2));
                                                            if (sQLiteCursor == null) {
                                                            }
                                                        } catch (Throwable th10) {
                                                            th = th10;
                                                            z2 = z4;
                                                            userFull = TLdeserialize;
                                                            sQLiteCursor = null;
                                                            uc7 messagesController32222222 = jf7Var.getMessagesController();
                                                            messagesController32222222.getClass();
                                                            hl.c3(new u5a(messagesController32222222, user2, i14, z12, userFull, arrayList6, hashMap3, i, z2));
                                                            if (sQLiteCursor != null) {
                                                            }
                                                            throw th;
                                                        }
                                                    }
                                                } catch (Exception e10) {
                                                    e = e10;
                                                    i = i2;
                                                    z2 = z4;
                                                    userFull = TLdeserialize;
                                                    z = true;
                                                    sQLiteCursor = null;
                                                    jf7Var.n(e, z);
                                                    uc7 messagesController22222222 = jf7Var.getMessagesController();
                                                    messagesController22222222.getClass();
                                                    hl.c3(new u5a(messagesController22222222, user2, i14, z12, userFull, arrayList6, hashMap3, i, z2));
                                                    if (sQLiteCursor == null) {
                                                    }
                                                } catch (Throwable th11) {
                                                    th = th11;
                                                    i = i2;
                                                    z2 = z4;
                                                    userFull = TLdeserialize;
                                                    sQLiteCursor = null;
                                                    uc7 messagesController322222222 = jf7Var.getMessagesController();
                                                    messagesController322222222.getClass();
                                                    hl.c3(new u5a(messagesController322222222, user2, i14, z12, userFull, arrayList6, hashMap3, i, z2));
                                                    if (sQLiteCursor != null) {
                                                    }
                                                    throw th;
                                                }
                                            }
                                            i = i2;
                                            if (!arrayList.isEmpty()) {
                                            }
                                            arrayList2 = new ArrayList();
                                            if (TLdeserialize != null) {
                                                j = peerSettings.bot_inviter_id;
                                                if (j != 0) {
                                                }
                                                j2 = TLdeserialize.settings.bot_owner_id;
                                                if (j2 != 0) {
                                                    arrayList2.add(Long.valueOf(TLdeserialize.settings.bot_owner_id));
                                                }
                                            }
                                            if (!arrayList2.isEmpty()) {
                                            }
                                            uc7 messagesController42 = jf7Var.getMessagesController();
                                            messagesController42.getClass();
                                            hl.c3(new u5a(messagesController42, user2, i14, z12, TLdeserialize, arrayList6, hashMap3, i, z4));
                                            return;
                                        } catch (Exception e11) {
                                            e = e11;
                                            userFull = TLdeserialize;
                                            i = 0;
                                            z2 = false;
                                            sQLiteCursor = queryFinalized;
                                            z = true;
                                            jf7Var.n(e, z);
                                            uc7 messagesController222222222 = jf7Var.getMessagesController();
                                            messagesController222222222.getClass();
                                            hl.c3(new u5a(messagesController222222222, user2, i14, z12, userFull, arrayList6, hashMap3, i, z2));
                                            if (sQLiteCursor == null) {
                                            }
                                        } catch (Throwable th12) {
                                            th = th12;
                                            userFull = TLdeserialize;
                                            i = 0;
                                            z2 = false;
                                            sQLiteCursor = queryFinalized;
                                            uc7 messagesController3222222222 = jf7Var.getMessagesController();
                                            messagesController3222222222.getClass();
                                            hl.c3(new u5a(messagesController3222222222, user2, i14, z12, userFull, arrayList6, hashMap3, i, z2));
                                            if (sQLiteCursor != null) {
                                            }
                                            throw th;
                                        }
                                    }
                                } catch (Exception e12) {
                                    e = e12;
                                    sQLiteCursor = queryFinalized;
                                    i = 0;
                                    z2 = false;
                                    z = true;
                                    userFull = null;
                                    jf7Var.n(e, z);
                                    uc7 messagesController2222222222 = jf7Var.getMessagesController();
                                    messagesController2222222222.getClass();
                                    hl.c3(new u5a(messagesController2222222222, user2, i14, z12, userFull, arrayList6, hashMap3, i, z2));
                                    if (sQLiteCursor == null) {
                                    }
                                } catch (Throwable th13) {
                                    th = th13;
                                    sQLiteCursor = queryFinalized;
                                    i = 0;
                                    z2 = false;
                                    userFull = null;
                                    uc7 messagesController32222222222 = jf7Var.getMessagesController();
                                    messagesController32222222222.getClass();
                                    hl.c3(new u5a(messagesController32222222222, user2, i14, z12, userFull, arrayList6, hashMap3, i, z2));
                                    if (sQLiteCursor != null) {
                                    }
                                    throw th;
                                }
                            }
                            if (arrayList6.isEmpty()) {
                            }
                            arrayList = new ArrayList();
                            if (TLdeserialize != null) {
                            }
                            i = i2;
                            if (!arrayList.isEmpty()) {
                            }
                            arrayList2 = new ArrayList();
                            if (TLdeserialize != null) {
                            }
                            if (!arrayList2.isEmpty()) {
                            }
                            uc7 messagesController422 = jf7Var.getMessagesController();
                            messagesController422.getClass();
                            hl.c3(new u5a(messagesController422, user2, i14, z12, TLdeserialize, arrayList6, hashMap3, i, z4));
                            return;
                        } catch (Exception e13) {
                            e = e13;
                            i = i2;
                            z2 = z3;
                        } catch (Throwable th14) {
                            th = th14;
                            i = i2;
                            z2 = z3;
                        }
                        queryFinalized.dispose();
                        if (TLdeserialize != null) {
                        }
                    } catch (Exception e14) {
                        e = e14;
                        i = i2;
                        z2 = z3;
                        userFull = TLdeserialize;
                        sQLiteCursor = queryFinalized;
                        z = true;
                        jf7Var.n(e, z);
                        uc7 messagesController22222222222 = jf7Var.getMessagesController();
                        messagesController22222222222.getClass();
                        hl.c3(new u5a(messagesController22222222222, user2, i14, z12, userFull, arrayList6, hashMap3, i, z2));
                        if (sQLiteCursor == null) {
                        }
                    } catch (Throwable th15) {
                        th = th15;
                        i = i2;
                        z2 = z3;
                        userFull = TLdeserialize;
                        sQLiteCursor = queryFinalized;
                        uc7 messagesController322222222222 = jf7Var.getMessagesController();
                        messagesController322222222222.getClass();
                        hl.c3(new u5a(messagesController322222222222, user2, i14, z12, userFull, arrayList6, hashMap3, i, z2));
                        if (sQLiteCursor != null) {
                        }
                        throw th;
                    }
                    TLdeserialize = null;
                    queryFinalized.dispose();
                    SQLiteDatabase sQLiteDatabase2 = jf7Var.getMessagesStorage().b;
                    Locale locale2 = Locale.US;
                    ArrayList arrayList72 = arrayList6;
                    queryFinalized = sQLiteDatabase2.queryFinalized("SELECT mid FROM chat_pinned_v2 WHERE uid = " + user2.id + " ORDER BY mid DESC", new Object[0]);
                    while (queryFinalized.next()) {
                    }
                    arrayList6 = arrayList72;
                    queryFinalized.dispose();
                    queryFinalized = jf7Var.b.queryFinalized("SELECT count, end FROM chat_pinned_count WHERE uid = " + user2.id, new Object[0]);
                    if (queryFinalized.next()) {
                    }
                } catch (Exception e15) {
                    e = e15;
                    z = true;
                    sQLiteCursor = null;
                } catch (Throwable th16) {
                    th = th16;
                    sQLiteCursor = null;
                }
                break;
            case 9:
                lna lnaVar = (lna) this.d;
                boolean z13 = this.c;
                int i16 = this.b;
                wb2 wb2Var = (wb2) this.e;
                if (z13 && lnaVar.R == null && lnaVar.S == null && lnaVar.Q == null) {
                    lnaVar.K = (byte) 2;
                    lnaVar.Y0 = true;
                }
                lnaVar.W0 = false;
                if (!lnaVar.Z0 && lnaVar.X0) {
                    lnaVar.x(true);
                    return;
                }
                lnaVar.V0 = lnaVar.j1[0];
                lq3.q(i16).v(wb2Var);
                lnaVar.D();
                lnaVar.s();
                return;
            default:
                ((VoIPService) this.d).lambda$startConferenceGroupCall$58((String) this.e, this.b, this.c);
                return;
        }
    }

    public /* synthetic */ ps1(ls6 ls6Var, int i, boolean z, pcc pccVar) {
        this.a = (byte) 7;
        this.d = ls6Var;
        this.b = i;
        this.c = z;
        this.e = pccVar;
    }

    public /* synthetic */ ps1(qs1 qs1Var, boolean z, ArrayList arrayList, int i) {
        this.a = (byte) 0;
        this.d = qs1Var;
        this.c = z;
        this.e = arrayList;
        this.b = i;
    }

    public /* synthetic */ ps1(Object obj, int i, Object obj2, boolean z, byte b) {
        this.a = b;
        this.d = obj;
        this.b = i;
        this.e = obj2;
        this.c = z;
    }

    public /* synthetic */ ps1(Object obj, Object obj2, int i, boolean z, byte b) {
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.b = i;
        this.c = z;
    }

    public /* synthetic */ ps1(Object obj, TLObject tLObject, boolean z, int i, byte b) {
        this.a = b;
        this.d = obj;
        this.e = tLObject;
        this.c = z;
        this.b = i;
    }
}
