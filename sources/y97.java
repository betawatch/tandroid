// default package

import android.content.SharedPreferences;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import org.telegram.messenger.WearReplyReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class y97 implements Runnable {
    public final /* synthetic */ byte a = 2;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ y97(bu5 bu5Var, int i, long j, long j2, bu5 bu5Var2, yv1 yv1Var, ylb ylbVar) {
        this.e = bu5Var;
        this.b = i;
        this.c = j;
        this.d = j2;
        this.f = bu5Var2;
        this.h = yv1Var;
        this.n = ylbVar;
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
        oc7 oc7Var;
        boolean z;
        Integer num;
        boolean z2;
        ArrayList arrayList;
        k47 k47Var;
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
                oc7 oc7Var2 = (oc7) obj4;
                TLRPC.updates_ChannelDifference updates_channeldifference = (TLRPC.updates_ChannelDifference) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj3;
                vh6 vh6Var = (vh6) obj;
                ConcurrentHashMap concurrentHashMap = oc7Var2.Q;
                ConcurrentHashMap concurrentHashMap2 = oc7Var2.P;
                boolean z4 = updates_channeldifference instanceof TLRPC.TL_updates_channelDifference;
                long j6 = this.c;
                if (z4 || (updates_channeldifference instanceof TLRPC.TL_updates_channelDifferenceEmpty)) {
                    j = j6;
                    if (updates_channeldifference.new_messages.isEmpty()) {
                        j2 = j5;
                        b = 2;
                    } else {
                        vh6 vh6Var2 = new vh6();
                        fn5.S(updates_channeldifference.new_messages);
                        ArrayList arrayList3 = new ArrayList();
                        long j7 = -j;
                        Integer num2 = (Integer) concurrentHashMap2.get(Long.valueOf(j7));
                        if (num2 == null) {
                            num2 = Integer.valueOf(oc7Var2.getMessagesStorage().S(j7, false));
                            concurrentHashMap2.put(Long.valueOf(j7), num2);
                        }
                        Integer num3 = num2;
                        Integer num4 = (Integer) concurrentHashMap.get(Long.valueOf(j7));
                        if (num4 == null) {
                            num4 = Integer.valueOf(oc7Var2.getMessagesStorage().S(j7, true));
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
                                        boolean contains = oc7Var2.l0.contains(Long.valueOf(j7));
                                        arrayList = arrayList3;
                                        j3 = j5;
                                        i = i2;
                                        j4 = j7;
                                        k47Var = new k47(oc7Var2.currentAccount, message2, vh6Var, (vh6) null, contains, contains);
                                        message = k47Var.k;
                                        if ((message.out || message.from_scheduled) && k47Var.E4()) {
                                            arrayList.add(k47Var);
                                        }
                                        arrayList2 = (ArrayList) vh6Var2.f(j4);
                                        if (arrayList2 == null) {
                                            arrayList2 = td4.t(vh6Var2, j4);
                                        }
                                        arrayList2.add(k47Var);
                                    }
                                } else {
                                    num = num3;
                                }
                                z2 = false;
                                message2.unread = z2;
                                boolean contains2 = oc7Var2.l0.contains(Long.valueOf(j7));
                                arrayList = arrayList3;
                                j3 = j5;
                                i = i2;
                                j4 = j7;
                                k47Var = new k47(oc7Var2.currentAccount, message2, vh6Var, (vh6) null, contains2, contains2);
                                message = k47Var.k;
                                if (message.out) {
                                }
                                arrayList.add(k47Var);
                                arrayList2 = (ArrayList) vh6Var2.f(j4);
                                if (arrayList2 == null) {
                                }
                                arrayList2.add(k47Var);
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
                        gm.c3(new x87(oc7Var2, vh6Var2, b));
                        oc7Var2.getMessagesStorage().a.c(new fp6(oc7Var2, arrayList3, updates_channeldifference, (byte) 23));
                    }
                    if (updates_channeldifference.other_updates.isEmpty()) {
                        b2 = b;
                        oc7Var = oc7Var2;
                    } else {
                        b2 = b;
                        oc7Var = oc7Var2;
                        oc7Var.S3(updates_channeldifference.other_updates, updates_channeldifference.users, updates_channeldifference.chats, true, 0);
                    }
                    z = true;
                    oc7Var.K3(1, j);
                    cf7 messagesStorage = oc7Var.getMessagesStorage();
                    messagesStorage.a.c(new cd7(messagesStorage, updates_channeldifference.pts, j, (byte) 5));
                } else if (updates_channeldifference instanceof TLRPC.TL_updates_channelDifferenceTooLong) {
                    long j8 = -j6;
                    Integer num7 = (Integer) concurrentHashMap2.get(Long.valueOf(j8));
                    if (num7 == null) {
                        num7 = Integer.valueOf(oc7Var2.getMessagesStorage().S(j8, false));
                        concurrentHashMap2.put(Long.valueOf(j8), num7);
                    }
                    Integer num8 = (Integer) concurrentHashMap.get(Long.valueOf(j8));
                    if (num8 == null) {
                        num8 = Integer.valueOf(oc7Var2.getMessagesStorage().S(j8, true));
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
                    cf7 messagesStorage2 = oc7Var2.getMessagesStorage();
                    r77 r77Var = new r77(oc7Var2, j6, (byte) 17);
                    mp3 mp3Var = messagesStorage2.a;
                    wz wzVar = new wz((Object) messagesStorage2, j6, this.b, updates_channeldifference, (Object) r77Var, (byte) 7);
                    j = j6;
                    mp3Var.c(wzVar);
                    j2 = j5;
                    oc7Var = oc7Var2;
                    b2 = 2;
                    z = false;
                } else {
                    j2 = j5;
                    z = true;
                    oc7Var = oc7Var2;
                    j = j6;
                    b2 = 2;
                }
                oc7Var.Q0.e(j);
                oc7Var.P0.put(j, updates_channeldifference.pts);
                if ((updates_channeldifference.flags & b2) != 0) {
                    oc7Var.q0.put(j, ((int) (System.currentTimeMillis() / 1000)) + updates_channeldifference.timeout);
                }
                if (!updates_channeldifference.isFinal) {
                    oc7Var.H0(j);
                }
                if (e21.a) {
                    fc4.b("received channel difference with pts = " + updates_channeldifference.pts + " channelId = " + j);
                    fc4.b("new_messages = " + updates_channeldifference.new_messages.size() + " messages = " + updates_channeldifference.messages.size() + " users = " + updates_channeldifference.users.size() + " chats = " + updates_channeldifference.chats.size() + " other updates = " + updates_channeldifference.other_updates.size());
                }
                if (j2 != 0) {
                    oc7Var.getMessagesStorage().n1(j2);
                }
                if (z) {
                    gm.c3(new r77(oc7Var, j, (byte) 4));
                    break;
                }
                break;
            case 1:
                yv1 yv1Var = (yv1) obj3;
                ylb ylbVar = (ylb) obj;
                ((bu5) obj4).u();
                SharedPreferences sharedPreferences = oc7.r1(this.b).W3;
                StringBuilder sb = new StringBuilder("sound_enabled_");
                long j9 = this.c;
                sb.append(lo7.p(j9, j5, false));
                boolean z5 = sharedPreferences.getBoolean(sb.toString(), true);
                boolean z6 = !z5;
                sharedPreferences.edit().putBoolean("sound_enabled_" + lo7.p(j9, j5, false), z6).apply();
                ((bu5) obj2).u();
                if (c41.a(yv1Var)) {
                    c41.S(z5 ? 1 : 0, ylbVar, yv1Var).j();
                    break;
                }
                break;
            case 2:
                a6a a6aVar = (a6a) obj4;
                TLRPC.Message message4 = (TLRPC.Message) obj2;
                k47 k47Var2 = (k47) obj;
                cf7 messagesStorage3 = a6aVar.getMessagesStorage();
                int i4 = this.b;
                Integer valueOf = Integer.valueOf(i4);
                int i5 = message4.id;
                int i6 = message4.date;
                long j10 = this.c;
                long j11 = this.d;
                messagesStorage3.X1(j10, j11, valueOf, i5, i6, 0, 0);
                a6aVar.getMessagesStorage().g1((ArrayList) obj3, true, false, false, 0, false, 0, 0L);
                gm.c3(new wz(a6aVar, k47Var2, message4, j11, i4));
                break;
            case 3:
                j5 j5Var = (j5) obj4;
                int i7 = WearReplyReceiver.a;
                oc7.r1(j5Var.a).c4((TLRPC.User) obj2, true, false);
                WearReplyReceiver.a(j5Var, (CharSequence) obj3, this.c, this.d, this.b, (int[]) obj);
                break;
            default:
                j5 j5Var2 = (j5) obj4;
                int i8 = WearReplyReceiver.a;
                oc7.r1(j5Var2.a).V3((TLRPC.Chat) obj3, true);
                WearReplyReceiver.a(j5Var2, (CharSequence) obj2, this.c, this.d, this.b, (int[]) obj);
                break;
        }
    }

    public /* synthetic */ y97(oc7 oc7Var, TLRPC.updates_ChannelDifference updates_channeldifference, long j, TLRPC.Chat chat, vh6 vh6Var, int i, long j2) {
        this.e = oc7Var;
        this.f = updates_channeldifference;
        this.c = j;
        this.h = chat;
        this.n = vh6Var;
        this.b = i;
        this.d = j2;
    }

    public /* synthetic */ y97(a6a a6aVar, long j, long j2, int i, TLRPC.Message message, ArrayList arrayList, k47 k47Var) {
        this.e = a6aVar;
        this.c = j;
        this.d = j2;
        this.b = i;
        this.f = message;
        this.h = arrayList;
        this.n = k47Var;
    }

    public /* synthetic */ y97(WearReplyReceiver wearReplyReceiver, j5 j5Var, TLRPC.Chat chat, CharSequence charSequence, long j, long j2, int i, int[] iArr) {
        this.e = j5Var;
        this.h = chat;
        this.f = charSequence;
        this.c = j;
        this.d = j2;
        this.b = i;
        this.n = iArr;
    }

    public /* synthetic */ y97(WearReplyReceiver wearReplyReceiver, j5 j5Var, TLRPC.User user, CharSequence charSequence, long j, long j2, int i, int[] iArr) {
        this.e = j5Var;
        this.f = user;
        this.h = charSequence;
        this.c = j;
        this.d = j2;
        this.b = i;
        this.n = iArr;
    }
}
