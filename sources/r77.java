// default package

import android.content.SharedPreferences;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import org.telegram.messenger.WearReplyReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class r77 implements Runnable {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ r77(cs5 cs5Var, int i, long j, long j2, cs5 cs5Var2, mu1 mu1Var, wjb wjbVar) {
        this.e = cs5Var;
        this.b = i;
        this.c = j;
        this.d = j2;
        this.f = cs5Var2;
        this.h = mu1Var;
        this.n = wjbVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:92:0x0299  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        long j;
        long j2;
        byte b;
        byte b2;
        na7 na7Var;
        boolean z;
        Integer num;
        boolean z2;
        ArrayList arrayList;
        k27 k27Var;
        long j3;
        int i;
        long j4;
        TLRPC.Message message;
        ArrayList arrayList2;
        boolean z3;
        byte b3 = this.a;
        long j5 = this.d;
        Object obj = this.n;
        Object obj2 = this.f;
        Object obj3 = this.h;
        Object obj4 = this.e;
        switch (b3) {
            case 0:
                na7 na7Var2 = (na7) obj4;
                TLRPC.updates_ChannelDifference updates_channeldifference = (TLRPC.updates_ChannelDifference) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj3;
                vf6 vf6Var = (vf6) obj;
                ConcurrentHashMap concurrentHashMap = na7Var2.Q;
                ConcurrentHashMap concurrentHashMap2 = na7Var2.P;
                boolean z4 = updates_channeldifference instanceof TLRPC.TL_updates_channelDifference;
                long j6 = this.c;
                if (z4 || (updates_channeldifference instanceof TLRPC.TL_updates_channelDifferenceEmpty)) {
                    j = j6;
                    if (updates_channeldifference.new_messages.isEmpty()) {
                        j2 = j5;
                        b = 2;
                    } else {
                        vf6 vf6Var2 = new vf6();
                        fl5.S(updates_channeldifference.new_messages);
                        ArrayList arrayList3 = new ArrayList();
                        long j7 = -j;
                        Integer num2 = (Integer) concurrentHashMap2.get(Long.valueOf(j7));
                        if (num2 == null) {
                            num2 = Integer.valueOf(na7Var2.getMessagesStorage().S(j7, false));
                            concurrentHashMap2.put(Long.valueOf(j7), num2);
                        }
                        Integer num3 = num2;
                        Integer num4 = (Integer) concurrentHashMap.get(Long.valueOf(j7));
                        if (num4 == null) {
                            num4 = Integer.valueOf(na7Var2.getMessagesStorage().S(j7, true));
                            concurrentHashMap.put(Long.valueOf(j7), num4);
                        }
                        Integer num5 = num4;
                        int i2 = 0;
                        while (i2 < updates_channeldifference.new_messages.size()) {
                            TLRPC.Message message2 = updates_channeldifference.new_messages.get(i2);
                            Integer num6 = num5;
                            if (message2 instanceof TLRPC.TL_messageEmpty) {
                                j3 = j5;
                                num = num3;
                                arrayList = arrayList3;
                                j4 = j7;
                                i = i2;
                            } else {
                                if (chat == null || !chat.left) {
                                    num = num3;
                                    if ((message2.out ? num6 : num3).intValue() < message2.id && !(message2.action instanceof TLRPC.TL_messageActionChannelCreate)) {
                                        z2 = true;
                                        message2.unread = z2;
                                        boolean contains = na7Var2.l0.contains(Long.valueOf(j7));
                                        arrayList = arrayList3;
                                        j3 = j5;
                                        i = i2;
                                        j4 = j7;
                                        k27Var = new k27(na7Var2.currentAccount, message2, vf6Var, (vf6) null, contains, contains);
                                        message = k27Var.k;
                                        if ((message.out || message.from_scheduled) && k27Var.E4()) {
                                            arrayList.add(k27Var);
                                        }
                                        arrayList2 = (ArrayList) vf6Var2.f(j4);
                                        if (arrayList2 == null) {
                                            arrayList2 = tb4.s(vf6Var2, j4);
                                        }
                                        arrayList2.add(k27Var);
                                    }
                                } else {
                                    num = num3;
                                }
                                z2 = false;
                                message2.unread = z2;
                                boolean contains2 = na7Var2.l0.contains(Long.valueOf(j7));
                                arrayList = arrayList3;
                                j3 = j5;
                                i = i2;
                                j4 = j7;
                                k27Var = new k27(na7Var2.currentAccount, message2, vf6Var, (vf6) null, contains2, contains2);
                                message = k27Var.k;
                                if (message.out) {
                                }
                                arrayList.add(k27Var);
                                arrayList2 = (ArrayList) vf6Var2.f(j4);
                                if (arrayList2 == null) {
                                }
                                arrayList2.add(k27Var);
                            }
                            i2 = i + 1;
                            num5 = num6;
                            j7 = j4;
                            arrayList3 = arrayList;
                            num3 = num;
                            j5 = j3;
                        }
                        j2 = j5;
                        b = 2;
                        gl.c3(new u67(na7Var2, vf6Var2, b));
                        na7Var2.getMessagesStorage().a.c(new lo6(na7Var2, arrayList3, updates_channeldifference, (byte) 21));
                    }
                    if (updates_channeldifference.other_updates.isEmpty()) {
                        b2 = b;
                        na7Var = na7Var2;
                    } else {
                        b2 = b;
                        na7Var = na7Var2;
                        na7Var.Q3(updates_channeldifference.other_updates, updates_channeldifference.users, updates_channeldifference.chats, true, 0);
                    }
                    z = true;
                    na7Var.I3(1, j);
                    ad7 messagesStorage = na7Var.getMessagesStorage();
                    messagesStorage.a.c(new bb7(messagesStorage, updates_channeldifference.pts, j, (byte) 5));
                } else if (updates_channeldifference instanceof TLRPC.TL_updates_channelDifferenceTooLong) {
                    long j8 = -j6;
                    Integer num7 = (Integer) concurrentHashMap2.get(Long.valueOf(j8));
                    if (num7 == null) {
                        num7 = Integer.valueOf(na7Var2.getMessagesStorage().S(j8, false));
                        concurrentHashMap2.put(Long.valueOf(j8), num7);
                    }
                    Integer num8 = (Integer) concurrentHashMap.get(Long.valueOf(j8));
                    if (num8 == null) {
                        num8 = Integer.valueOf(na7Var2.getMessagesStorage().S(j8, true));
                        concurrentHashMap.put(Long.valueOf(j8), num8);
                    }
                    for (int i3 = 0; i3 < updates_channeldifference.messages.size(); i3++) {
                        TLRPC.Message message3 = updates_channeldifference.messages.get(i3);
                        message3.dialog_id = j8;
                        if (!(message3.action instanceof TLRPC.TL_messageActionChannelCreate) && (chat == null || !chat.left)) {
                            if ((message3.out ? num8 : num7).intValue() < message3.id) {
                                z3 = true;
                                message3.unread = z3;
                            }
                        }
                        z3 = false;
                        message3.unread = z3;
                    }
                    ad7 messagesStorage2 = na7Var2.getMessagesStorage();
                    r57 r57Var = new r57(na7Var2, j6, (byte) 17);
                    co3 co3Var = messagesStorage2.a;
                    wy wyVar = new wy((Object) messagesStorage2, j6, this.b, updates_channeldifference, (Object) r57Var, (byte) 7);
                    j = j6;
                    co3Var.c(wyVar);
                    j2 = j5;
                    na7Var = na7Var2;
                    b2 = 2;
                    z = false;
                } else {
                    j2 = j5;
                    z = true;
                    na7Var = na7Var2;
                    j = j6;
                    b2 = 2;
                }
                na7Var.Q0.e(j);
                na7Var.P0.put(j, updates_channeldifference.pts);
                if ((updates_channeldifference.flags & b2) != 0) {
                    na7Var.q0.put(j, ((int) (System.currentTimeMillis() / 1000)) + updates_channeldifference.timeout);
                }
                if (!updates_channeldifference.isFinal) {
                    na7Var.G0(j);
                }
                if (w01.a) {
                    fa4.b("received channel difference with pts = " + updates_channeldifference.pts + " channelId = " + j);
                    fa4.b("new_messages = " + updates_channeldifference.new_messages.size() + " messages = " + updates_channeldifference.messages.size() + " users = " + updates_channeldifference.users.size() + " chats = " + updates_channeldifference.chats.size() + " other updates = " + updates_channeldifference.other_updates.size());
                }
                if (j2 != 0) {
                    na7Var.getMessagesStorage().n1(j2);
                }
                if (z) {
                    gl.c3(new r57(na7Var, j, (byte) 4));
                    break;
                }
                break;
            case 1:
                mu1 mu1Var = (mu1) obj3;
                wjb wjbVar = (wjb) obj;
                ((cs5) obj4).u();
                SharedPreferences sharedPreferences = na7.q1(this.b).W3;
                StringBuilder sb = new StringBuilder("sound_enabled_");
                long j9 = this.c;
                sb.append(im7.p(j9, j5, false));
                boolean z5 = sharedPreferences.getBoolean(sb.toString(), true);
                boolean z6 = !z5;
                sharedPreferences.edit().putBoolean("sound_enabled_" + im7.p(j9, j5, false), z6).apply();
                ((cs5) obj2).u();
                if (u21.a(mu1Var)) {
                    u21.S(z5 ? 1 : 0, wjbVar, mu1Var).j();
                    break;
                }
                break;
            case 2:
                z3a z3aVar = (z3a) obj4;
                TLRPC.Message message4 = (TLRPC.Message) obj2;
                k27 k27Var2 = (k27) obj;
                ad7 messagesStorage3 = z3aVar.getMessagesStorage();
                int i4 = this.b;
                Integer valueOf = Integer.valueOf(i4);
                int i5 = message4.id;
                int i6 = message4.date;
                long j10 = this.c;
                long j11 = this.d;
                messagesStorage3.X1(j10, j11, valueOf, i5, i6, 0, 0);
                z3aVar.getMessagesStorage().g1((ArrayList) obj3, true, false, false, 0, false, 0, 0L);
                gl.c3(new wy(z3aVar, k27Var2, message4, j11, i4));
                break;
            case 3:
                j5 j5Var = (j5) obj4;
                int i7 = WearReplyReceiver.a;
                na7.q1(j5Var.a).a4((TLRPC.User) obj2, true, false);
                WearReplyReceiver.a(j5Var, (CharSequence) obj3, this.c, this.d, this.b, (int[]) obj);
                break;
            default:
                j5 j5Var2 = (j5) obj4;
                int i8 = WearReplyReceiver.a;
                na7.q1(j5Var2.a).T3((TLRPC.Chat) obj3, true);
                WearReplyReceiver.a(j5Var2, (CharSequence) obj2, this.c, this.d, this.b, (int[]) obj);
                break;
        }
    }

    public /* synthetic */ r77(na7 na7Var, TLRPC.updates_ChannelDifference updates_channeldifference, long j, TLRPC.Chat chat, vf6 vf6Var, int i, long j2) {
        this.e = na7Var;
        this.f = updates_channeldifference;
        this.c = j;
        this.h = chat;
        this.n = vf6Var;
        this.b = i;
        this.d = j2;
    }

    public /* synthetic */ r77(z3a z3aVar, long j, long j2, int i, TLRPC.Message message, ArrayList arrayList, k27 k27Var) {
        this.e = z3aVar;
        this.c = j;
        this.d = j2;
        this.b = i;
        this.f = message;
        this.h = arrayList;
        this.n = k27Var;
    }

    public /* synthetic */ r77(WearReplyReceiver wearReplyReceiver, j5 j5Var, TLRPC.Chat chat, CharSequence charSequence, long j, long j2, int i, int[] iArr) {
        this.e = j5Var;
        this.h = chat;
        this.f = charSequence;
        this.c = j;
        this.d = j2;
        this.b = i;
        this.n = iArr;
    }

    public /* synthetic */ r77(WearReplyReceiver wearReplyReceiver, j5 j5Var, TLRPC.User user, CharSequence charSequence, long j, long j2, int i, int[] iArr) {
        this.e = j5Var;
        this.f = user;
        this.h = charSequence;
        this.c = j;
        this.d = j2;
        this.b = i;
        this.n = iArr;
    }
}
