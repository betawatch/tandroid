// default package

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class uy5 implements Runnable {
    public final /* synthetic */ byte a = 2;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public /* synthetic */ uy5(hq6 hq6Var, pob pobVar, vf6 vf6Var, AtomicInteger atomicInteger, Runnable runnable, int i, qob qobVar, vf6 vf6Var2, vf6 vf6Var3, boolean z, long j) {
        this.e = hq6Var;
        this.f = pobVar;
        this.h = vf6Var;
        this.n = atomicInteger;
        this.r = runnable;
        this.b = i;
        this.s = qobVar;
        this.w = vf6Var2;
        this.x = vf6Var3;
        this.c = z;
        this.d = j;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0171 A[Catch: Exception -> 0x039d, TryCatch #1 {Exception -> 0x039d, blocks: (B:20:0x00a7, B:24:0x00ce, B:28:0x023b, B:36:0x01d4, B:37:0x0109, B:39:0x016b, B:41:0x0171, B:43:0x0177, B:45:0x01a8, B:46:0x01ad, B:48:0x01b5, B:50:0x01c4, B:54:0x01ce, B:56:0x013b, B:58:0x01e0, B:60:0x01f4, B:63:0x0206, B:68:0x0212, B:70:0x0218, B:72:0x0227, B:76:0x024d, B:78:0x025d, B:79:0x0265, B:81:0x026b, B:82:0x0276, B:84:0x0285, B:86:0x028f, B:88:0x0295, B:93:0x02d7, B:95:0x02dd, B:97:0x0386, B:109:0x02fb, B:114:0x0335, B:116:0x033b, B:122:0x0347, B:124:0x037f, B:127:0x038e, B:130:0x0399), top: B:19:0x00a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01ce A[Catch: Exception -> 0x039d, TryCatch #1 {Exception -> 0x039d, blocks: (B:20:0x00a7, B:24:0x00ce, B:28:0x023b, B:36:0x01d4, B:37:0x0109, B:39:0x016b, B:41:0x0171, B:43:0x0177, B:45:0x01a8, B:46:0x01ad, B:48:0x01b5, B:50:0x01c4, B:54:0x01ce, B:56:0x013b, B:58:0x01e0, B:60:0x01f4, B:63:0x0206, B:68:0x0212, B:70:0x0218, B:72:0x0227, B:76:0x024d, B:78:0x025d, B:79:0x0265, B:81:0x026b, B:82:0x0276, B:84:0x0285, B:86:0x028f, B:88:0x0295, B:93:0x02d7, B:95:0x02dd, B:97:0x0386, B:109:0x02fb, B:114:0x0335, B:116:0x033b, B:122:0x0347, B:124:0x037f, B:127:0x038e, B:130:0x0399), top: B:19:0x00a7 }] */
    /* JADX WARN: Type inference failed for: r0v78, types: [ad7] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r1v27, types: [org.telegram.SQLite.SQLiteCursor] */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r28v4, types: [hq6, pf0] */
    /* JADX WARN: Type inference failed for: r2v32, types: [org.telegram.tgnet.InputSerializedData, org.telegram.tgnet.NativeByteBuffer] */
    /* JADX WARN: Type inference failed for: r5v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r9v16, types: [java.lang.Object, org.telegram.tgnet.TLRPC$Message] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x01ca -> B:36:0x0139). Please report as a decompilation issue!!! */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        uy5 uy5Var;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        char c;
        Runnable runnable;
        int i;
        qob qobVar;
        int i2;
        vf6 vf6Var;
        int i3;
        qob qobVar2;
        int i4;
        int i5;
        int i6;
        ?? r5;
        ?? r1;
        qob qobVar3;
        qob qobVar4;
        uy5 uy5Var2 = this;
        byte b = uy5Var2.a;
        byte b2 = 11;
        Object obj = uy5Var2.x;
        Object obj2 = uy5Var2.w;
        Object obj3 = uy5Var2.s;
        Object obj4 = uy5Var2.r;
        Object obj5 = uy5Var2.n;
        Object obj6 = uy5Var2.h;
        Object obj7 = uy5Var2.f;
        Object obj8 = uy5Var2.e;
        switch (b) {
            case 0:
                LaunchActivity launchActivity = (LaunchActivity) obj8;
                String str = (String) obj7;
                TLRPC.TL_chatAdminRights tL_chatAdminRights3 = (TLRPC.TL_chatAdminRights) obj4;
                String str2 = (String) obj6;
                TLRPC.Chat chat = (TLRPC.Chat) obj3;
                cj3 cj3Var = (cj3) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                String str3 = (String) obj5;
                String str4 = LaunchActivity.C1;
                if (str != null) {
                    String[] split = str.split("\\+| ");
                    TLRPC.TL_chatAdminRights tL_chatAdminRights4 = new TLRPC.TL_chatAdminRights();
                    for (String str5 : split) {
                        str5.getClass();
                        char c2 = 65535;
                        switch (str5.hashCode()) {
                            case -2110462504:
                                if (str5.equals("ban_users")) {
                                    c2 = 0;
                                    break;
                                }
                                break;
                            case -2095811475:
                                if (str5.equals("anonymous")) {
                                    c2 = 1;
                                    break;
                                }
                                break;
                            case -1654794275:
                                if (str5.equals("change_info")) {
                                    c2 = 2;
                                    break;
                                }
                                break;
                            case -1593320096:
                                if (str5.equals("delete_messages")) {
                                    c = 3;
                                    c2 = c;
                                    break;
                                }
                                break;
                            case -939200543:
                                if (str5.equals("edit_messages")) {
                                    c = 4;
                                    c2 = c;
                                    break;
                                }
                                break;
                            case 22162680:
                                if (str5.equals("manage_call")) {
                                    c = 5;
                                    c2 = c;
                                    break;
                                }
                                break;
                            case 22169074:
                                if (str5.equals("manage_chat")) {
                                    c = 6;
                                    c2 = c;
                                    break;
                                }
                                break;
                            case 106069776:
                                if (str5.equals("other")) {
                                    c = 7;
                                    c2 = c;
                                    break;
                                }
                                break;
                            case 323243326:
                                if (str5.equals("manage_topics")) {
                                    c = '\b';
                                    c2 = c;
                                    break;
                                }
                                break;
                            case 449085338:
                                if (str5.equals("promote_members")) {
                                    c = '\t';
                                    c2 = c;
                                    break;
                                }
                                break;
                            case 632157522:
                                if (str5.equals("invite_users")) {
                                    c = '\n';
                                    c2 = c;
                                    break;
                                }
                                break;
                            case 703163861:
                                if (str5.equals("manage_topic")) {
                                    c2 = 11;
                                    break;
                                }
                                break;
                            case 758599179:
                                if (str5.equals("post_messages")) {
                                    c = '\f';
                                    c2 = c;
                                    break;
                                }
                                break;
                            case 1357805750:
                                if (str5.equals("pin_messages")) {
                                    c = '\r';
                                    c2 = c;
                                    break;
                                }
                                break;
                            case 1529816162:
                                if (str5.equals("add_admins")) {
                                    c = 14;
                                    c2 = c;
                                    break;
                                }
                                break;
                            case 1542893206:
                                if (str5.equals("restrict_members")) {
                                    c = 15;
                                    c2 = c;
                                    break;
                                }
                                break;
                            case 1641337725:
                                if (str5.equals("manage_video_chats")) {
                                    c = 16;
                                    c2 = c;
                                    break;
                                }
                                break;
                        }
                        switch (c2) {
                            case 0:
                            case 15:
                                tL_chatAdminRights4.ban_users = true;
                                break;
                            case 1:
                                tL_chatAdminRights4.anonymous = true;
                                break;
                            case 2:
                                tL_chatAdminRights4.change_info = true;
                                break;
                            case 3:
                                tL_chatAdminRights4.delete_messages = true;
                                break;
                            case 4:
                                tL_chatAdminRights4.edit_messages = true;
                                break;
                            case 5:
                            case 16:
                                tL_chatAdminRights4.manage_call = true;
                                break;
                            case 6:
                            case 7:
                                tL_chatAdminRights4.other = true;
                                break;
                            case '\b':
                            case 11:
                                tL_chatAdminRights4.manage_topics = true;
                                break;
                            case '\t':
                            case 14:
                                tL_chatAdminRights4.add_admins = true;
                                break;
                            case '\n':
                                tL_chatAdminRights4.invite_users = true;
                                break;
                            case '\f':
                                tL_chatAdminRights4.post_messages = true;
                                break;
                            case '\r':
                                tL_chatAdminRights4.pin_messages = true;
                                break;
                        }
                    }
                    tL_chatAdminRights = tL_chatAdminRights4;
                } else {
                    tL_chatAdminRights = null;
                }
                if (tL_chatAdminRights == null) {
                    if (tL_chatAdminRights3 == null) {
                        uy5Var = this;
                        tL_chatAdminRights2 = null;
                    }
                    uy5Var = this;
                    tL_chatAdminRights2 = tL_chatAdminRights3;
                } else if (tL_chatAdminRights3 == null) {
                    uy5Var = this;
                    tL_chatAdminRights2 = tL_chatAdminRights;
                } else {
                    tL_chatAdminRights3.change_info = tL_chatAdminRights.change_info || tL_chatAdminRights3.change_info;
                    tL_chatAdminRights3.post_messages = tL_chatAdminRights.post_messages || tL_chatAdminRights3.post_messages;
                    tL_chatAdminRights3.edit_messages = tL_chatAdminRights.edit_messages || tL_chatAdminRights3.edit_messages;
                    tL_chatAdminRights3.add_admins = tL_chatAdminRights.add_admins || tL_chatAdminRights3.add_admins;
                    tL_chatAdminRights3.delete_messages = tL_chatAdminRights.delete_messages || tL_chatAdminRights3.delete_messages;
                    tL_chatAdminRights3.ban_users = tL_chatAdminRights.ban_users || tL_chatAdminRights3.ban_users;
                    tL_chatAdminRights3.invite_users = tL_chatAdminRights.invite_users || tL_chatAdminRights3.invite_users;
                    tL_chatAdminRights3.pin_messages = tL_chatAdminRights.pin_messages || tL_chatAdminRights3.pin_messages;
                    tL_chatAdminRights3.manage_call = tL_chatAdminRights.manage_call || tL_chatAdminRights3.manage_call;
                    tL_chatAdminRights3.anonymous = tL_chatAdminRights.anonymous || tL_chatAdminRights3.anonymous;
                    tL_chatAdminRights3.other = tL_chatAdminRights.other || tL_chatAdminRights3.other;
                    uy5Var = this;
                    tL_chatAdminRights2 = tL_chatAdminRights3;
                }
                boolean z = uy5Var.c;
                int i7 = uy5Var.b;
                if (!z || tL_chatAdminRights != null || TextUtils.isEmpty(str2)) {
                    zc2 zc2Var = new zc2(user.id, -uy5Var.d, tL_chatAdminRights2, null, null, str3, 2, true, !z, str2);
                    zc2Var.Y0 = new pz5(cj3Var, i7);
                    ((ActionBarLayout) launchActivity.N()).T(zc2Var, false);
                    break;
                } else {
                    na7.q1(launchActivity.P).j(chat.id, user, 0, str2, cj3Var, true, new tn6((Object) launchActivity, i7, (Object) chat, (Object) cj3Var, (byte) 28), null, null);
                    break;
                }
                break;
            case 1:
                final ?? r28 = (hq6) obj8;
                vf6 vf6Var2 = (vf6) obj6;
                AtomicInteger atomicInteger = (AtomicInteger) obj5;
                ?? r10 = (Runnable) obj4;
                int i8 = uy5Var2.b;
                qob qobVar5 = (qob) obj3;
                vf6 vf6Var3 = (vf6) obj2;
                vf6 vf6Var4 = (vf6) obj;
                qob.a((pob) obj7);
                try {
                    r28.getMessagesController().M1().k.c(vf6Var2, new oh6(atomicInteger, (Object) r10, b2), i8, true, qobVar5);
                    int i9 = i8;
                    qob qobVar6 = qobVar5;
                    if (vf6Var3.i()) {
                        qob.c(qobVar6, "loadReplyMessagesForMessages: empty replyMessageOwners");
                        if (atomicInteger.decrementAndGet() == 0 && r10 != 0) {
                            gl.d3(r10);
                        }
                    } else {
                        pob d = qob.d(qobVar6, "loadReplyMessagesForMessages: getting reply messages");
                        ArrayList arrayList = new ArrayList();
                        runnable = r10;
                        try {
                            r10 = new ArrayList();
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = new ArrayList();
                            int m = vf6Var3.m();
                            int i10 = 0;
                            while (true) {
                                boolean z2 = uy5Var2.c;
                                vf6 vf6Var5 = vf6Var4;
                                long j = uy5Var2.d;
                                final AtomicInteger atomicInteger2 = atomicInteger;
                                if (i10 < m) {
                                    long j2 = vf6Var3.j(i10);
                                    int i11 = i10;
                                    ArrayList arrayList5 = (ArrayList) vf6Var5.f(-j2);
                                    if (arrayList5 == null) {
                                        i2 = i9;
                                        vf6Var = vf6Var3;
                                        i3 = m;
                                        qobVar2 = qobVar6;
                                    } else {
                                        int i12 = 0;
                                        int i13 = 2;
                                        while (i12 < i13) {
                                            vf6 vf6Var6 = vf6Var3;
                                            if (i12 != 1) {
                                                i4 = i12;
                                                i5 = i9;
                                                i6 = m;
                                                SQLiteDatabase sQLiteDatabase = r28.getMessagesStorage().b;
                                                Locale locale = Locale.US;
                                                r5 = 0;
                                                r1 = sQLiteDatabase.queryFinalized("SELECT data, mid, date, uid FROM messages_v2 WHERE mid IN(" + TextUtils.join(",", arrayList5) + ") AND uid = " + j, new Object[0]);
                                                if (r1.next()) {
                                                }
                                            } else if (z2) {
                                                SQLiteDatabase sQLiteDatabase2 = r28.getMessagesStorage().b;
                                                Locale locale2 = Locale.US;
                                                i4 = i12;
                                                String join = TextUtils.join(",", arrayList5);
                                                i6 = m;
                                                StringBuilder sb = new StringBuilder();
                                                i5 = i9;
                                                sb.append("SELECT data, mid, date, uid FROM scheduled_messages_v2 WHERE mid IN(");
                                                sb.append(join);
                                                sb.append(") AND uid = ");
                                                sb.append(j);
                                                SQLiteCursor sQLiteCursor = sQLiteDatabase2.queryFinalized(sb.toString(), new Object[0]);
                                                r5 = 0;
                                                r1 = sQLiteCursor;
                                                if (r1.next()) {
                                                    ?? byteBufferValue = r1.byteBufferValue(r5);
                                                    if (byteBufferValue != 0) {
                                                        ?? TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(r5), r5);
                                                        qobVar4 = qobVar6;
                                                        TLdeserialize.readAttachPath(byteBufferValue, r28.getUserConfig().n);
                                                        byteBufferValue.reuse();
                                                        TLdeserialize.id = r1.intValue(1);
                                                        TLdeserialize.date = r1.intValue(2);
                                                        TLdeserialize.dialog_id = j;
                                                        ad7.d(TLdeserialize, arrayList3, arrayList4, null);
                                                        arrayList.add(TLdeserialize);
                                                        TLRPC.Peer peer = TLdeserialize.peer_id;
                                                        long j3 = peer != null ? peer.channel_id : 0L;
                                                        ArrayList arrayList6 = (ArrayList) vf6Var5.f(j3);
                                                        if (arrayList6 != null) {
                                                            arrayList6.remove(Integer.valueOf(TLdeserialize.id));
                                                            if (arrayList6.isEmpty()) {
                                                                vf6Var5.l(j3);
                                                            }
                                                        }
                                                    } else {
                                                        qobVar4 = qobVar6;
                                                    }
                                                    qobVar6 = qobVar4;
                                                    sQLiteCursor = r1;
                                                    r5 = 0;
                                                    r1 = sQLiteCursor;
                                                    if (r1.next()) {
                                                    }
                                                } else {
                                                    qobVar3 = qobVar6;
                                                    i13 = 2;
                                                    r1.dispose();
                                                    i12 = i4 + 1;
                                                    m = i6;
                                                    i9 = i5;
                                                    vf6Var3 = vf6Var6;
                                                    qobVar6 = qobVar3;
                                                }
                                            } else {
                                                i4 = i12;
                                                i5 = i9;
                                                i6 = m;
                                                qobVar3 = qobVar6;
                                                i13 = 2;
                                                i12 = i4 + 1;
                                                m = i6;
                                                i9 = i5;
                                                vf6Var3 = vf6Var6;
                                                qobVar6 = qobVar3;
                                            }
                                        }
                                        i2 = i9;
                                        vf6Var = vf6Var3;
                                        i3 = m;
                                        qobVar2 = qobVar6;
                                        ArrayList arrayList7 = new ArrayList();
                                        int size = arrayList5.size();
                                        int i14 = 0;
                                        while (i14 < size) {
                                            Object obj9 = arrayList5.get(i14);
                                            i14++;
                                            int intValue = ((Integer) obj9).intValue();
                                            if (k27.f3(intValue)) {
                                                arrayList7.add(Integer.valueOf(k27.S(intValue)));
                                            }
                                        }
                                        if (!arrayList7.isEmpty()) {
                                            ArrayList W = r28.getMessagesStorage().W(arrayList7, j);
                                            int size2 = W.size();
                                            int i15 = 0;
                                            while (i15 < size2) {
                                                Object obj10 = W.get(i15);
                                                i15++;
                                                TLRPC.TL_message b3 = t34.b((TL_ephemeral.EphemeralMessage) obj10);
                                                ad7.d(b3, arrayList3, arrayList4, null);
                                                arrayList.add(b3);
                                            }
                                        }
                                    }
                                    vf6Var4 = vf6Var5;
                                    m = i3;
                                    i9 = i2;
                                    vf6Var3 = vf6Var;
                                    qobVar6 = qobVar2;
                                    atomicInteger = atomicInteger2;
                                    i10 = i11 + 1;
                                    uy5Var2 = this;
                                } else {
                                    int i16 = i9;
                                    final boolean z3 = z2;
                                    final vf6 vf6Var7 = vf6Var3;
                                    qob qobVar7 = qobVar6;
                                    if (!arrayList3.isEmpty()) {
                                        r28.getMessagesStorage().k0(arrayList3, r10, false);
                                    }
                                    if (!arrayList4.isEmpty()) {
                                        r28.getMessagesStorage().P(TextUtils.join(",", arrayList4), arrayList2);
                                    }
                                    long j4 = j;
                                    r28.n(arrayList, vf6Var7, r10, arrayList2, j4, true);
                                    if (vf6Var5.i()) {
                                        qob.a(d);
                                        if (atomicInteger2.decrementAndGet() == 0 && runnable != null) {
                                            gl.d3(runnable);
                                        }
                                    } else {
                                        qob.a(d);
                                        int m2 = vf6Var5.m();
                                        int i17 = 0;
                                        while (i17 < m2) {
                                            final long j5 = vf6Var5.j(i17);
                                            if (z3) {
                                                final qob qobVar8 = qobVar7;
                                                final pob d2 = qob.d(qobVar8, "loadReplyMessagesForMessages: load scheduled");
                                                final TLRPC.TL_messages_getScheduledMessages tL_messages_getScheduledMessages = new TLRPC.TL_messages_getScheduledMessages();
                                                tL_messages_getScheduledMessages.peer = r28.getMessagesController().h1(j4);
                                                tL_messages_getScheduledMessages.id = (ArrayList) vf6Var5.n(i17);
                                                ConnectionsManager connectionsManager = r28.getConnectionsManager();
                                                final Runnable runnable2 = runnable;
                                                final boolean z4 = z3;
                                                final vf6 vf6Var8 = vf6Var7;
                                                final long j6 = j4;
                                                try {
                                                    RequestDelegate requestDelegate = new RequestDelegate() { // from class: xp6
                                                        /* JADX WARN: Multi-variable type inference failed */
                                                        @Override // org.telegram.tgnet.RequestDelegate
                                                        public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
                                                            Runnable runnable3;
                                                            ArrayList<TLRPC.Message> arrayList8;
                                                            ArrayList<TLRPC.Message> arrayList9;
                                                            TLRPC.TL_messages_getMessages tL_messages_getMessages;
                                                            qob.a(d2);
                                                            if (tL_error == null) {
                                                                final TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                                                                int i18 = 0;
                                                                int i19 = 0;
                                                                while (true) {
                                                                    int size3 = messages_messages.messages.size();
                                                                    arrayList8 = messages_messages.messages;
                                                                    if (i19 >= size3) {
                                                                        break;
                                                                    }
                                                                    if (arrayList8.get(i19) instanceof TLRPC.TL_messageEmpty) {
                                                                        messages_messages.messages.remove(i19);
                                                                        i19--;
                                                                    }
                                                                    i19++;
                                                                }
                                                                int size4 = arrayList8.size();
                                                                TLRPC.TL_messages_getScheduledMessages tL_messages_getScheduledMessages2 = tL_messages_getScheduledMessages;
                                                                int size5 = tL_messages_getScheduledMessages2.id.size();
                                                                final hq6 hq6Var = hq6.this;
                                                                final long j7 = j5;
                                                                final long j8 = j6;
                                                                final vf6 vf6Var9 = vf6Var8;
                                                                final boolean z5 = z4;
                                                                if (size4 < size5) {
                                                                    if (j7 != 0) {
                                                                        TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
                                                                        tL_channels_getMessages.channel = hq6Var.getMessagesController().f1(j7);
                                                                        tL_channels_getMessages.id = tL_messages_getScheduledMessages2.id;
                                                                        tL_messages_getMessages = tL_channels_getMessages;
                                                                    } else {
                                                                        TLRPC.TL_messages_getMessages tL_messages_getMessages2 = new TLRPC.TL_messages_getMessages();
                                                                        tL_messages_getMessages2.id = tL_messages_getScheduledMessages2.id;
                                                                        tL_messages_getMessages = tL_messages_getMessages2;
                                                                    }
                                                                    hq6Var.getConnectionsManager().sendRequest(tL_messages_getMessages, new RequestDelegate() { // from class: ho6
                                                                        @Override // org.telegram.tgnet.RequestDelegate
                                                                        public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                                                                            if (tL_error != null) {
                                                                                return;
                                                                            }
                                                                            TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject2;
                                                                            TLRPC.messages_Messages messages_messages3 = messages_messages;
                                                                            messages_messages3.messages.addAll(messages_messages2.messages);
                                                                            messages_messages3.users.addAll(messages_messages2.users);
                                                                            messages_messages3.chats.addAll(messages_messages2.chats);
                                                                            int i20 = 0;
                                                                            while (true) {
                                                                                int size6 = messages_messages3.messages.size();
                                                                                ArrayList<TLRPC.Message> arrayList10 = messages_messages3.messages;
                                                                                long j9 = j8;
                                                                                if (i20 >= size6) {
                                                                                    k27.b0(arrayList10, j7);
                                                                                    fl5.S(messages_messages3.messages);
                                                                                    ArrayList<TLRPC.Message> arrayList11 = messages_messages3.messages;
                                                                                    ArrayList<TLRPC.User> arrayList12 = messages_messages3.users;
                                                                                    ArrayList<TLRPC.Chat> arrayList13 = messages_messages3.chats;
                                                                                    hq6 hq6Var2 = hq6.this;
                                                                                    vf6 vf6Var10 = vf6Var9;
                                                                                    hq6Var2.n(arrayList11, vf6Var10, arrayList12, arrayList13, j9, false);
                                                                                    hq6Var2.getMessagesStorage().j1(messages_messages3.users, messages_messages3.chats, true, true);
                                                                                    hq6Var2.W1(vf6Var10, messages_messages3.messages, z5);
                                                                                    return;
                                                                                }
                                                                                TLRPC.Message message = arrayList10.get(i20);
                                                                                if (message.dialog_id == 0) {
                                                                                    message.dialog_id = j9;
                                                                                }
                                                                                i20++;
                                                                            }
                                                                        }
                                                                    });
                                                                } else {
                                                                    while (true) {
                                                                        int size6 = messages_messages.messages.size();
                                                                        arrayList9 = messages_messages.messages;
                                                                        if (i18 >= size6) {
                                                                            break;
                                                                        }
                                                                        TLRPC.Message message = arrayList9.get(i18);
                                                                        if (message.dialog_id == 0) {
                                                                            message.dialog_id = j8;
                                                                        }
                                                                        i18++;
                                                                    }
                                                                    k27.b0(arrayList9, j7);
                                                                    fl5.S(messages_messages.messages);
                                                                    hq6Var.n(messages_messages.messages, vf6Var9, messages_messages.users, messages_messages.chats, j8, false);
                                                                    hq6Var.getMessagesStorage().j1(messages_messages.users, messages_messages.chats, true, true);
                                                                    hq6Var.W1(vf6Var9, messages_messages.messages, z5);
                                                                }
                                                            } else {
                                                                qob.c(qobVar8, "getScheduledMessages error: " + tL_error.code + " " + tL_error.text);
                                                            }
                                                            if (atomicInteger2.decrementAndGet() != 0 || (runnable3 = runnable2) == null) {
                                                                return;
                                                            }
                                                            gl.d3(runnable3);
                                                        }
                                                    };
                                                    j4 = j6;
                                                    vf6Var7 = vf6Var8;
                                                    z3 = z4;
                                                    qobVar = qobVar8;
                                                    runnable = runnable2;
                                                    int sendRequest = connectionsManager.sendRequest(tL_messages_getScheduledMessages, requestDelegate);
                                                    if (i16 != 0) {
                                                        i = i16;
                                                        r28.getConnectionsManager().bindRequestToGuid(sendRequest, i);
                                                    } else {
                                                        i = i16;
                                                    }
                                                } catch (Exception e) {
                                                    e = e;
                                                    runnable = runnable2;
                                                    if (runnable != null) {
                                                        gl.d3(runnable);
                                                    }
                                                    fa4.g(e, true);
                                                    return;
                                                }
                                            } else {
                                                i = i16;
                                                final qob qobVar9 = qobVar7;
                                                if (j5 != 0) {
                                                    final pob d3 = qob.d(qobVar9, "loadReplyMessagesForMessages: load channel messages");
                                                    TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
                                                    tL_channels_getMessages.channel = r28.getMessagesController().f1(j5);
                                                    tL_channels_getMessages.id = (ArrayList) vf6Var5.n(i17);
                                                    ConnectionsManager connectionsManager2 = r28.getConnectionsManager();
                                                    final long j7 = j4;
                                                    final AtomicInteger atomicInteger3 = atomicInteger2;
                                                    final Runnable runnable3 = runnable;
                                                    try {
                                                        RequestDelegate requestDelegate2 = new RequestDelegate() { // from class: yp6
                                                            @Override // org.telegram.tgnet.RequestDelegate
                                                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                                Runnable runnable4;
                                                                ArrayList<TLRPC.Message> arrayList8;
                                                                long j8;
                                                                qob.a(d3);
                                                                if (tL_error == null) {
                                                                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                                                                    int i18 = 0;
                                                                    while (true) {
                                                                        int size3 = messages_messages.messages.size();
                                                                        arrayList8 = messages_messages.messages;
                                                                        j8 = j7;
                                                                        if (i18 >= size3) {
                                                                            break;
                                                                        }
                                                                        TLRPC.Message message = arrayList8.get(i18);
                                                                        if (message.dialog_id == 0) {
                                                                            message.dialog_id = j8;
                                                                        }
                                                                        i18++;
                                                                    }
                                                                    k27.b0(arrayList8, j5);
                                                                    fl5.S(messages_messages.messages);
                                                                    ArrayList<TLRPC.Message> arrayList9 = messages_messages.messages;
                                                                    ArrayList<TLRPC.User> arrayList10 = messages_messages.users;
                                                                    ArrayList<TLRPC.Chat> arrayList11 = messages_messages.chats;
                                                                    hq6 hq6Var = hq6.this;
                                                                    vf6 vf6Var9 = vf6Var7;
                                                                    hq6Var.n(arrayList9, vf6Var9, arrayList10, arrayList11, j8, false);
                                                                    hq6Var.getMessagesStorage().j1(messages_messages.users, messages_messages.chats, true, true);
                                                                    hq6Var.W1(vf6Var9, messages_messages.messages, z3);
                                                                } else {
                                                                    qob.c(qobVar9, "channels.getMessages error: " + tL_error.code + " " + tL_error.text);
                                                                }
                                                                if (atomicInteger3.decrementAndGet() != 0 || (runnable4 = runnable3) == null) {
                                                                    return;
                                                                }
                                                                gl.d3(runnable4);
                                                            }
                                                        };
                                                        j4 = j7;
                                                        qobVar = qobVar9;
                                                        runnable = runnable3;
                                                        atomicInteger2 = atomicInteger3;
                                                        int sendRequest2 = connectionsManager2.sendRequest(tL_channels_getMessages, requestDelegate2);
                                                        if (i != 0) {
                                                            r28.getConnectionsManager().bindRequestToGuid(sendRequest2, i);
                                                        }
                                                    } catch (Exception e2) {
                                                        e = e2;
                                                        runnable = runnable3;
                                                        if (runnable != null) {
                                                        }
                                                        fa4.g(e, true);
                                                        return;
                                                    }
                                                } else {
                                                    pob d4 = qob.d(qobVar9, "loadReplyMessagesForMessages: load messages");
                                                    TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                                                    tL_messages_getMessages.id = (ArrayList) vf6Var5.n(i17);
                                                    ConnectionsManager connectionsManager3 = r28.getConnectionsManager();
                                                    long j8 = j4;
                                                    vf6 vf6Var9 = vf6Var7;
                                                    boolean z5 = z3;
                                                    AtomicInteger atomicInteger4 = atomicInteger2;
                                                    zp6 zp6Var = new zp6((hq6) r28, d4, j8, vf6Var9, z5, qobVar9, atomicInteger4, runnable);
                                                    j4 = j8;
                                                    qobVar = qobVar9;
                                                    atomicInteger2 = atomicInteger4;
                                                    vf6Var7 = vf6Var9;
                                                    z3 = z5;
                                                    int sendRequest3 = connectionsManager3.sendRequest(tL_messages_getMessages, zp6Var);
                                                    if (i != 0) {
                                                        r28.getConnectionsManager().bindRequestToGuid(sendRequest3, i);
                                                    }
                                                }
                                            }
                                            i17++;
                                            i16 = i;
                                            qobVar7 = qobVar;
                                        }
                                    }
                                }
                            }
                        } catch (Exception e3) {
                            e = e3;
                        }
                    }
                    break;
                } catch (Exception e4) {
                    e = e4;
                    runnable = r10;
                }
            default:
                cq7.d((Context) obj8, uy5Var2.b, (TL_stars.TL_starGiftUnique) obj7, uy5Var2.d, (TLRPC.TL_textWithEntities) obj6, uy5Var2.c, (wjb) obj5, (nu9) obj4, (u21) obj3, (t7a) obj2, (t7a) obj);
                break;
        }
    }

    public /* synthetic */ uy5(Context context, int i, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z, wjb wjbVar, nu9 nu9Var, u21 u21Var, t7a t7aVar, t7a t7aVar2) {
        this.e = context;
        this.b = i;
        this.f = tL_starGiftUnique;
        this.d = j;
        this.h = tL_textWithEntities;
        this.c = z;
        this.n = wjbVar;
        this.r = nu9Var;
        this.s = u21Var;
        this.w = t7aVar;
        this.x = t7aVar2;
    }

    public /* synthetic */ uy5(LaunchActivity launchActivity, String str, TLRPC.TL_chatAdminRights tL_chatAdminRights, boolean z, String str2, int i, TLRPC.Chat chat, cj3 cj3Var, TLRPC.User user, long j, String str3) {
        this.e = launchActivity;
        this.f = str;
        this.r = tL_chatAdminRights;
        this.c = z;
        this.h = str2;
        this.b = i;
        this.s = chat;
        this.w = cj3Var;
        this.x = user;
        this.d = j;
        this.n = str3;
    }
}
