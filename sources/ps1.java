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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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

    /* JADX WARN: Removed duplicated region for block: B:104:0x01e9 A[Catch: all -> 0x026b, Exception -> 0x0274, TryCatch #16 {Exception -> 0x0274, all -> 0x026b, blocks: (B:99:0x01d4, B:101:0x01da, B:102:0x01e3, B:104:0x01e9, B:105:0x0201, B:107:0x0208, B:109:0x020c, B:111:0x0212, B:112:0x0219, B:114:0x0221, B:116:0x022b, B:117:0x0236, B:119:0x023c, B:121:0x024a), top: B:98:0x01d4 }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0212 A[Catch: all -> 0x026b, Exception -> 0x0274, TryCatch #16 {Exception -> 0x0274, all -> 0x026b, blocks: (B:99:0x01d4, B:101:0x01da, B:102:0x01e3, B:104:0x01e9, B:105:0x0201, B:107:0x0208, B:109:0x020c, B:111:0x0212, B:112:0x0219, B:114:0x0221, B:116:0x022b, B:117:0x0236, B:119:0x023c, B:121:0x024a), top: B:98:0x01d4 }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x023c A[Catch: all -> 0x026b, Exception -> 0x0274, TryCatch #16 {Exception -> 0x0274, all -> 0x026b, blocks: (B:99:0x01d4, B:101:0x01da, B:102:0x01e3, B:104:0x01e9, B:105:0x0201, B:107:0x0208, B:109:0x020c, B:111:0x0212, B:112:0x0219, B:114:0x0221, B:116:0x022b, B:117:0x0236, B:119:0x023c, B:121:0x024a), top: B:98:0x01d4 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0300  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        char c;
        int i;
        boolean z;
        SQLiteCursor sQLiteCursor;
        boolean z2;
        TLRPC.UserFull userFull;
        SQLiteCursor queryFinalized;
        TLRPC.UserFull userFull2;
        boolean z3;
        int i2;
        TLRPC.User user;
        ArrayList arrayList;
        TLRPC.PeerSettings peerSettings;
        long j;
        long j2;
        NativeByteBuffer byteBufferValue;
        switch (this.a) {
            case 0:
                qs1 qs1Var = (qs1) this.d;
                boolean z4 = this.c;
                ArrayList arrayList2 = (ArrayList) this.e;
                int i3 = this.b;
                zu1 zu1Var = qs1Var.b;
                if (!z4) {
                    if (zu1Var.x4) {
                        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                            zu1Var.getMessagesController().L3(zu1Var.e, zu1Var.f, ((Integer) arrayList2.get(i4)).intValue(), true, false, false);
                        }
                    } else {
                        uc7 messagesController = zu1Var.getMessagesController();
                        TLRPC.Chat chat = zu1Var.e;
                        TLRPC.User user2 = zu1Var.f;
                        messagesController.getClass();
                        if (chat != null || user2 != null) {
                            TLRPC.TL_messages_unpinAllMessages tL_messages_unpinAllMessages = new TLRPC.TL_messages_unpinAllMessages();
                            tL_messages_unpinAllMessages.peer = messagesController.j1(chat != null ? -chat.id : user2.id);
                            messagesController.getConnectionsManager().sendRequest(tL_messages_unpinAllMessages, new m65(messagesController, chat, user2, (byte) 21));
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
                boolean z5 = this.c;
                if (i5 == nk3Var.g0 && TextUtils.equals(tL_messages_searchGlobal.q, nk3Var.h0)) {
                    ConnectionsManager.getInstance(nk3Var.Q).sendRequest(tL_messages_searchGlobal, new jk3(nk3Var, i5, tL_messages_searchGlobal, z5, (byte) 0));
                    return;
                }
                return;
            case 3:
                pk3 pk3Var = (pk3) this.d;
                int i6 = this.b;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = (TLRPC.TL_messages_searchGlobal) this.e;
                boolean z6 = this.c;
                if (i6 == pk3Var.d0 && TextUtils.equals(tL_messages_searchGlobal2.q, pk3Var.e0)) {
                    ConnectionsManager.getInstance(pk3Var.Q).sendRequest(tL_messages_searchGlobal2, new jk3(pk3Var, i6, tL_messages_searchGlobal2, z6, (byte) 1));
                    return;
                }
                return;
            case 4:
                j95 j95Var = (j95) this.d;
                TLObject tLObject = (TLObject) this.e;
                int i7 = this.b;
                boolean z7 = this.c;
                boolean z8 = tLObject instanceof TL_phone.exportedGroupCallInvite;
                String[] strArr = j95Var.I4;
                if (z8) {
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
                if (z7 || !j95Var.H0() || j95Var.T2.b.join_muted) {
                    c = 0;
                } else {
                    c = 0;
                    strArr[0] = null;
                }
                if (strArr[c] != null || strArr[1] != null || !xc2.t0(j95Var.S2)) {
                    j95Var.p1(strArr[0], strArr[1], false, z7);
                    return;
                }
                j95Var.p1(null, uc7.s1(j95Var.n1.a).N2 + "/" + xc2.K(j95Var.S2, false), true, z7);
                return;
            case 5:
                sm5 sm5Var = (sm5) this.d;
                int i9 = this.b;
                String str2 = (String) this.e;
                boolean z9 = this.c;
                sm5Var.getClass();
                hl.c3(new rm5(i9, str2, z9));
                sm5Var.b.u.remove(str2);
                return;
            case 6:
                ob6 ob6Var = (ob6) this.d;
                Vector vector = (Vector) this.e;
                boolean z10 = this.c;
                int i10 = this.b;
                HashMap hashMap = ob6Var.N;
                ArrayList arrayList3 = ob6Var.J;
                HashMap hashMap2 = ob6Var.M;
                ob6Var.I = false;
                ArrayList arrayList4 = ob6Var.L;
                int size = arrayList4.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((mb6) arrayList4.get(i11)).k = ConnectionsManager.DEFAULT_DATACENTER_ID;
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
                        arrayList3.add(mb6Var);
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
                        arrayList4.add(mb6Var);
                        hashMap2.put(mb6Var.b(), mb6Var);
                    }
                }
                int i13 = 0;
                while (i13 < arrayList4.size()) {
                    mb6 mb6Var2 = (mb6) arrayList4.get(i13);
                    if (mb6Var2.k == Integer.MAX_VALUE && mb6Var2 != ob6Var.B) {
                        if (f11.a) {
                            cc4.b("remove lang " + mb6Var2.b());
                        }
                        arrayList4.remove(i13);
                        hashMap2.remove(mb6Var2.b());
                        arrayList3.remove(mb6Var2);
                        hashMap.remove(mb6Var2.b());
                        i13--;
                    }
                    i13++;
                }
                ob6Var.a1();
                jn7.e().k(jn7.B4, new Object[0]);
                if (z10) {
                    ob6Var.d(ob6Var.B, true, false, i10);
                    return;
                }
                return;
            case 7:
                ((ls6) this.d).c1(this.b, false, this.c, false, (pcc) this.e);
                return;
            case 8:
                kf7 kf7Var = (kf7) this.d;
                TLRPC.User user3 = (TLRPC.User) this.e;
                boolean z11 = this.c;
                int i14 = this.b;
                HashMap hashMap3 = new HashMap();
                ArrayList arrayList5 = new ArrayList();
                try {
                    queryFinalized = kf7Var.b.queryFinalized("SELECT info, pinned FROM user_settings WHERE uid = " + user3.id, new Object[0]);
                } catch (Exception e) {
                    e = e;
                    i = 0;
                    z = false;
                    z2 = true;
                    sQLiteCursor = null;
                } catch (Throwable th) {
                    th = th;
                    i = 0;
                    z = false;
                    sQLiteCursor = null;
                }
                try {
                    if (!queryFinalized.next() || (byteBufferValue = queryFinalized.byteBufferValue(0)) == null) {
                        userFull2 = null;
                    } else {
                        userFull2 = TLRPC.UserFull.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                        try {
                            userFull2.pinned_msg_id = queryFinalized.intValue(1);
                            byteBufferValue.reuse();
                        } catch (Exception e2) {
                            e = e2;
                            userFull = userFull2;
                            i = 0;
                            z = false;
                            sQLiteCursor = queryFinalized;
                            z2 = true;
                            try {
                                kf7Var.p(e, z2);
                                uc7 messagesController2 = kf7Var.getMessagesController();
                                messagesController2.getClass();
                                hl.c3(new u5a(messagesController2, user3, i14, z11, userFull, arrayList5, hashMap3, i, z));
                                if (sQLiteCursor == null) {
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                uc7 messagesController3 = kf7Var.getMessagesController();
                                messagesController3.getClass();
                                hl.c3(new u5a(messagesController3, user3, i14, z11, userFull, arrayList5, hashMap3, i, z));
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            userFull = userFull2;
                            i = 0;
                            z = false;
                            sQLiteCursor = queryFinalized;
                            uc7 messagesController32 = kf7Var.getMessagesController();
                            messagesController32.getClass();
                            hl.c3(new u5a(messagesController32, user3, i14, z11, userFull, arrayList5, hashMap3, i, z));
                            if (sQLiteCursor != null) {
                            }
                            throw th;
                        }
                    }
                    try {
                        queryFinalized.dispose();
                        try {
                            SQLiteDatabase sQLiteDatabase = kf7Var.getMessagesStorage().b;
                            Locale locale = Locale.US;
                            SQLiteCursor queryFinalized2 = sQLiteDatabase.queryFinalized("SELECT mid FROM chat_pinned_v2 WHERE uid = " + user3.id + " ORDER BY mid DESC", new Object[0]);
                            while (queryFinalized2.next()) {
                                int intValue = queryFinalized2.intValue(0);
                                arrayList5.add(Integer.valueOf(intValue));
                                hashMap3.put(Integer.valueOf(intValue), null);
                            }
                            queryFinalized2.dispose();
                            queryFinalized = kf7Var.b.queryFinalized("SELECT count, end FROM chat_pinned_count WHERE uid = " + user3.id, new Object[0]);
                            if (queryFinalized.next()) {
                                int intValue2 = queryFinalized.intValue(0);
                                try {
                                    i2 = intValue2;
                                    z3 = queryFinalized.intValue(1) != 0;
                                } catch (Exception e3) {
                                    e = e3;
                                    i = intValue2;
                                    userFull = userFull2;
                                    z = false;
                                    sQLiteCursor = queryFinalized;
                                    z2 = true;
                                    kf7Var.p(e, z2);
                                    uc7 messagesController22 = kf7Var.getMessagesController();
                                    messagesController22.getClass();
                                    hl.c3(new u5a(messagesController22, user3, i14, z11, userFull, arrayList5, hashMap3, i, z));
                                    if (sQLiteCursor == null) {
                                        sQLiteCursor.dispose();
                                        return;
                                    }
                                    return;
                                } catch (Throwable th4) {
                                    th = th4;
                                    i = intValue2;
                                    userFull = userFull2;
                                    z = false;
                                    sQLiteCursor = queryFinalized;
                                    uc7 messagesController322 = kf7Var.getMessagesController();
                                    messagesController322.getClass();
                                    hl.c3(new u5a(messagesController322, user3, i14, z11, userFull, arrayList5, hashMap3, i, z));
                                    if (sQLiteCursor != null) {
                                    }
                                    throw th;
                                }
                            } else {
                                z3 = false;
                                i2 = 0;
                            }
                            try {
                                queryFinalized.dispose();
                                if (userFull2 != null) {
                                    try {
                                        if (userFull2.pinned_msg_id != 0 && (arrayList5.isEmpty() || userFull2.pinned_msg_id > ((Integer) arrayList5.get(0)).intValue())) {
                                            arrayList5.clear();
                                            arrayList5.add(Integer.valueOf(userFull2.pinned_msg_id));
                                            hashMap3.put(Integer.valueOf(userFull2.pinned_msg_id), null);
                                        }
                                    } catch (Exception e4) {
                                        e = e4;
                                        z = z3;
                                        i = i2;
                                        userFull = userFull2;
                                        z2 = true;
                                        sQLiteCursor = null;
                                        kf7Var.p(e, z2);
                                        uc7 messagesController222 = kf7Var.getMessagesController();
                                        messagesController222.getClass();
                                        hl.c3(new u5a(messagesController222, user3, i14, z11, userFull, arrayList5, hashMap3, i, z));
                                        if (sQLiteCursor == null) {
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        z = z3;
                                        i = i2;
                                        userFull = userFull2;
                                        sQLiteCursor = null;
                                        uc7 messagesController3222 = kf7Var.getMessagesController();
                                        messagesController3222.getClass();
                                        hl.c3(new u5a(messagesController3222, user3, i14, z11, userFull, arrayList5, hashMap3, i, z));
                                        if (sQLiteCursor != null) {
                                        }
                                        throw th;
                                    }
                                }
                                if (!arrayList5.isEmpty()) {
                                    try {
                                        ArrayList R0 = kf7Var.getMediaDataController().R0(user3.id, 0L, arrayList5, true);
                                        arrayList5 = arrayList5;
                                        if (R0 != null) {
                                            int size3 = R0.size();
                                            for (int i15 = 0; i15 < size3; i15++) {
                                                r47 r47Var = (r47) R0.get(i15);
                                                hashMap3.put(Integer.valueOf(r47Var.e1()), r47Var);
                                            }
                                        }
                                    } catch (Exception e5) {
                                        e = e5;
                                        arrayList5 = arrayList5;
                                        z = z3;
                                        i = i2;
                                        userFull = userFull2;
                                        z2 = true;
                                        sQLiteCursor = null;
                                        kf7Var.p(e, z2);
                                        uc7 messagesController2222 = kf7Var.getMessagesController();
                                        messagesController2222.getClass();
                                        hl.c3(new u5a(messagesController2222, user3, i14, z11, userFull, arrayList5, hashMap3, i, z));
                                        if (sQLiteCursor == null) {
                                        }
                                    } catch (Throwable th6) {
                                        th = th6;
                                        arrayList5 = arrayList5;
                                        z = z3;
                                        i = i2;
                                        userFull = userFull2;
                                        sQLiteCursor = null;
                                        uc7 messagesController32222 = kf7Var.getMessagesController();
                                        messagesController32222.getClass();
                                        hl.c3(new u5a(messagesController32222, user3, i14, z11, userFull, arrayList5, hashMap3, i, z));
                                        if (sQLiteCursor != null) {
                                        }
                                        throw th;
                                    }
                                }
                                ArrayList arrayList6 = new ArrayList();
                                if (userFull2 != null) {
                                    if ((userFull2.flags2 & 64) != 0) {
                                        user = user3;
                                        try {
                                            long j3 = userFull2.personal_channel_id;
                                            if (j3 != 0) {
                                                arrayList6.add(Long.valueOf(j3));
                                            }
                                            if (!arrayList6.isEmpty()) {
                                                ArrayList arrayList7 = new ArrayList();
                                                kf7Var.R(TextUtils.join(",", arrayList6), arrayList7);
                                                hl.c3(new q41(kf7Var, arrayList7, (byte) 20));
                                            }
                                            arrayList = new ArrayList();
                                            if (userFull2 != null && (peerSettings = userFull2.settings) != null) {
                                                j = peerSettings.bot_inviter_id;
                                                if (j != 0) {
                                                    arrayList.add(Long.valueOf(j));
                                                }
                                                j2 = userFull2.settings.bot_owner_id;
                                                if (j2 != 0 && !arrayList.contains(Long.valueOf(j2))) {
                                                    arrayList.add(Long.valueOf(userFull2.settings.bot_owner_id));
                                                }
                                            }
                                            if (!arrayList.isEmpty()) {
                                                ArrayList arrayList8 = new ArrayList();
                                                kf7Var.m0(arrayList, arrayList8, false);
                                                if (!arrayList8.isEmpty()) {
                                                    hl.c3(new q41(kf7Var, arrayList8, (byte) 21));
                                                }
                                            }
                                            uc7 messagesController4 = kf7Var.getMessagesController();
                                            messagesController4.getClass();
                                            hl.c3(new u5a(messagesController4, user, i14, z11, userFull2, arrayList5, hashMap3, i2, z3));
                                            return;
                                        } catch (Exception e6) {
                                            e = e6;
                                            z = z3;
                                            i = i2;
                                            userFull = userFull2;
                                            user3 = user;
                                            z2 = true;
                                            sQLiteCursor = null;
                                            kf7Var.p(e, z2);
                                            uc7 messagesController22222 = kf7Var.getMessagesController();
                                            messagesController22222.getClass();
                                            hl.c3(new u5a(messagesController22222, user3, i14, z11, userFull, arrayList5, hashMap3, i, z));
                                            if (sQLiteCursor == null) {
                                            }
                                        } catch (Throwable th7) {
                                            th = th7;
                                            z = z3;
                                            i = i2;
                                            userFull = userFull2;
                                            user3 = user;
                                            sQLiteCursor = null;
                                            uc7 messagesController322222 = kf7Var.getMessagesController();
                                            messagesController322222.getClass();
                                            hl.c3(new u5a(messagesController322222, user3, i14, z11, userFull, arrayList5, hashMap3, i, z));
                                            if (sQLiteCursor != null) {
                                            }
                                            throw th;
                                        }
                                    }
                                }
                                user = user3;
                                if (!arrayList6.isEmpty()) {
                                }
                                arrayList = new ArrayList();
                                if (userFull2 != null) {
                                    j = peerSettings.bot_inviter_id;
                                    if (j != 0) {
                                    }
                                    j2 = userFull2.settings.bot_owner_id;
                                    if (j2 != 0) {
                                        arrayList.add(Long.valueOf(userFull2.settings.bot_owner_id));
                                    }
                                }
                                if (!arrayList.isEmpty()) {
                                }
                                uc7 messagesController42 = kf7Var.getMessagesController();
                                messagesController42.getClass();
                                hl.c3(new u5a(messagesController42, user, i14, z11, userFull2, arrayList5, hashMap3, i2, z3));
                                return;
                            } catch (Exception e7) {
                                e = e7;
                                z = z3;
                                i = i2;
                                userFull = userFull2;
                                sQLiteCursor = queryFinalized;
                                z2 = true;
                                kf7Var.p(e, z2);
                                uc7 messagesController222222 = kf7Var.getMessagesController();
                                messagesController222222.getClass();
                                hl.c3(new u5a(messagesController222222, user3, i14, z11, userFull, arrayList5, hashMap3, i, z));
                                if (sQLiteCursor == null) {
                                }
                            } catch (Throwable th8) {
                                th = th8;
                                z = z3;
                                i = i2;
                                userFull = userFull2;
                                sQLiteCursor = queryFinalized;
                                uc7 messagesController3222222 = kf7Var.getMessagesController();
                                messagesController3222222.getClass();
                                hl.c3(new u5a(messagesController3222222, user3, i14, z11, userFull, arrayList5, hashMap3, i, z));
                                if (sQLiteCursor != null) {
                                }
                                throw th;
                            }
                        } catch (Exception e8) {
                            e = e8;
                            userFull = userFull2;
                            i = 0;
                            z = false;
                        } catch (Throwable th9) {
                            th = th9;
                            userFull = userFull2;
                            i = 0;
                            z = false;
                        }
                    } catch (Exception e9) {
                        e = e9;
                        userFull = userFull2;
                        sQLiteCursor = queryFinalized;
                        i = 0;
                        z = false;
                        z2 = true;
                        kf7Var.p(e, z2);
                        uc7 messagesController2222222 = kf7Var.getMessagesController();
                        messagesController2222222.getClass();
                        hl.c3(new u5a(messagesController2222222, user3, i14, z11, userFull, arrayList5, hashMap3, i, z));
                        if (sQLiteCursor == null) {
                        }
                    } catch (Throwable th10) {
                        th = th10;
                        userFull = userFull2;
                        sQLiteCursor = queryFinalized;
                        i = 0;
                        z = false;
                    }
                } catch (Exception e10) {
                    e = e10;
                    sQLiteCursor = queryFinalized;
                    i = 0;
                    z = false;
                    z2 = true;
                    userFull = null;
                    kf7Var.p(e, z2);
                    uc7 messagesController22222222 = kf7Var.getMessagesController();
                    messagesController22222222.getClass();
                    hl.c3(new u5a(messagesController22222222, user3, i14, z11, userFull, arrayList5, hashMap3, i, z));
                    if (sQLiteCursor == null) {
                    }
                } catch (Throwable th11) {
                    th = th11;
                    sQLiteCursor = queryFinalized;
                    i = 0;
                    z = false;
                    userFull = null;
                    uc7 messagesController32222222 = kf7Var.getMessagesController();
                    messagesController32222222.getClass();
                    hl.c3(new u5a(messagesController32222222, user3, i14, z11, userFull, arrayList5, hashMap3, i, z));
                    if (sQLiteCursor != null) {
                    }
                    throw th;
                }
                break;
            case 9:
                lna lnaVar = (lna) this.d;
                boolean z12 = this.c;
                int i16 = this.b;
                wb2 wb2Var = (wb2) this.e;
                if (z12 && lnaVar.R == null && lnaVar.S == null && lnaVar.Q == null) {
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
