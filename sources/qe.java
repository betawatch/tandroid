// default package

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class qe implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ qe(int i, long j, fx0 fx0Var, wjb wjbVar, Context context, TL_payments.connectedBotStarRef connectedbotstarref) {
        this.a = (byte) 1;
        this.b = i;
        this.e = context;
        this.c = j;
        this.f = connectedbotstarref;
        this.d = fx0Var;
        this.h = wjbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Integer num;
        Integer num2;
        long j;
        long j2 = 0;
        TLRPC.GroupCall groupCall = null;
        switch (this.a) {
            case 0:
                TLObject tLObject = (TLObject) this.e;
                int i = this.b;
                u41 u41Var = (u41) this.f;
                fx0 fx0Var = (fx0) this.d;
                long j3 = this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.h;
                if (tLObject instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    na7.q1(i).a4(updates.users, false);
                    na7.q1(i).U3(updates.chats, false);
                    ArrayList w0 = na7.w0(updates, TL_update.TL_updateGroupCall.class);
                    int size = w0.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj = w0.get(i2);
                        i2++;
                        groupCall = ((TL_update.TL_updateGroupCall) obj).call;
                    }
                    Utilities.d.c(new af(i, updates, (byte) 0));
                    if (groupCall != null && LaunchActivity.H1 != null) {
                        fx0Var.dismiss();
                        z3a.B(i).q0(x3a.a(j3, groupCall.invite_link));
                        d S = LaunchActivity.S();
                        if (S != null) {
                            if (S instanceof mu1) {
                                mu1 mu1Var = (mu1) S;
                                if (mu1Var.a() == j3 && mu1Var.g4 == 0) {
                                }
                            }
                            S.presentFragment(mu1.U9(j3));
                            break;
                        }
                    } else {
                        u41Var.setLoading(false);
                        break;
                    }
                } else if (tLObject instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
                    na7.q1(i).a4(groupcall.users, false);
                    na7.q1(i).U3(groupcall.chats, false);
                    if (LaunchActivity.H1 == null) {
                        u41Var.setLoading(false);
                        break;
                    } else {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                        TLRPC.GroupCall groupCall2 = groupcall.call;
                        tL_inputGroupCall.id = groupCall2.id;
                        tL_inputGroupCall.access_hash = groupCall2.access_hash;
                        fx0Var.dismiss();
                        rgc.g(LaunchActivity.H1, i, tL_inputGroupCall, false, groupcall.call, null);
                        z3a.B(i).q0(x3a.a(j3, groupcall.call.invite_link));
                        break;
                    }
                } else if (tL_error != null) {
                    ug8.u(fx0Var.F, null, tL_error, false);
                    break;
                }
                break;
            case 1:
                int i3 = this.b;
                Context context = (Context) this.e;
                long j4 = this.c;
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.f;
                ct0.g(i3).f(context, j4, connectedbotstarref.bot_id, new sf1(i3, j4, (fx0) this.d, (wjb) this.h, context, connectedbotstarref));
                break;
            case 2:
                final t37 t37Var = (t37) this.f;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.h;
                TLObject tLObject2 = (TLObject) this.e;
                long j5 = this.c;
                final int i4 = this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                Integer num3 = 0;
                if (tL_error2 != null || !(tLObject2 instanceof Vector)) {
                    t37Var.b();
                    break;
                } else {
                    Vector vector = (Vector) tLObject2;
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    long j6 = j5;
                    final HashMap hashMap = new HashMap();
                    final ArrayList arrayList3 = new ArrayList();
                    int size2 = vector.objects.size();
                    int i5 = 0;
                    while (i5 < size2) {
                        long j7 = j2;
                        Object obj2 = vector.objects.get(i5);
                        if (obj2 instanceof TLRPC.TL_readParticipantDate) {
                            TLRPC.TL_readParticipantDate tL_readParticipantDate = (TLRPC.TL_readParticipantDate) obj2;
                            int i6 = tL_readParticipantDate.date;
                            num = num3;
                            long j8 = tL_readParticipantDate.user_id;
                            Long valueOf = Long.valueOf(j8);
                            if (j6 != j8) {
                                na7.q1(i4).V1(valueOf);
                                arrayList3.add(new Pair(valueOf, Integer.valueOf(i6)));
                                arrayList.add(valueOf);
                            }
                        } else {
                            num = num3;
                            if (obj2 instanceof Long) {
                                Long l = (Long) obj2;
                                if (j6 != l.longValue()) {
                                    if (l.longValue() > j7) {
                                        na7.q1(i4).V1(l);
                                        num2 = num;
                                        arrayList3.add(new Pair(l, num2));
                                        arrayList.add(l);
                                        j = j6;
                                        i5++;
                                        num3 = num2;
                                        j2 = j7;
                                        j6 = j;
                                    } else {
                                        num2 = num;
                                        j = j6;
                                        na7.q1(i4).K0(Long.valueOf(-l.longValue()));
                                        arrayList3.add(new Pair(l, num2));
                                        arrayList2.add(l);
                                        i5++;
                                        num3 = num2;
                                        j2 = j7;
                                        j6 = j;
                                    }
                                }
                            }
                        }
                        num2 = num;
                        j = j6;
                        i5++;
                        num3 = num2;
                        j2 = j7;
                        j6 = j;
                    }
                    if (arrayList.isEmpty()) {
                        for (int i7 = 0; i7 < arrayList3.size(); i7++) {
                            Pair pair = (Pair) arrayList3.get(i7);
                            t37Var.a.add((Long) pair.first);
                            t37Var.b.add((Integer) pair.second);
                            t37Var.c.add((TLObject) hashMap.get(pair.first));
                        }
                        t37Var.b();
                        break;
                    } else if (hc2.T(chat)) {
                        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                        tL_channels_getParticipants.limit = na7.q1(i4).k4.N0.f();
                        tL_channels_getParticipants.offset = 0;
                        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
                        tL_channels_getParticipants.channel = na7.q1(i4).f1(chat.id);
                        final byte b = 0;
                        ConnectionsManager.getInstance(i4).sendRequest(tL_channels_getParticipants, new RequestDelegate() { // from class: q37
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(final TLObject tLObject3, TLRPC.TL_error tL_error3) {
                                switch (b) {
                                    case 0:
                                        final byte b2 = 0;
                                        final t37 t37Var2 = t37Var;
                                        final int i8 = i4;
                                        final HashMap hashMap2 = hashMap;
                                        final ArrayList arrayList4 = arrayList3;
                                        gl.d3(new Runnable() { // from class: r37
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                byte b3 = b2;
                                                int i9 = 0;
                                                ArrayList arrayList5 = arrayList4;
                                                HashMap hashMap3 = hashMap2;
                                                int i10 = i8;
                                                TLObject tLObject4 = tLObject3;
                                                t37 t37Var3 = t37Var2;
                                                switch (b3) {
                                                    case 0:
                                                        if (tLObject4 != null) {
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject4;
                                                            for (int i11 = 0; i11 < tL_channels_channelParticipants.users.size(); i11++) {
                                                                TLRPC.User user = tL_channels_channelParticipants.users.get(i11);
                                                                na7.q1(i10).Z3(user, false, false);
                                                                hashMap3.put(Long.valueOf(user.id), user);
                                                            }
                                                            while (i9 < arrayList5.size()) {
                                                                Pair pair2 = (Pair) arrayList5.get(i9);
                                                                t37Var3.a.add((Long) pair2.first);
                                                                t37Var3.b.add((Integer) pair2.second);
                                                                t37Var3.c.add((TLObject) hashMap3.get(pair2.first));
                                                                i9++;
                                                            }
                                                        }
                                                        t37Var3.b();
                                                        break;
                                                    default:
                                                        if (tLObject4 != null) {
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject4;
                                                            for (int i12 = 0; i12 < tL_messages_chatFull.users.size(); i12++) {
                                                                TLRPC.User user2 = tL_messages_chatFull.users.get(i12);
                                                                na7.q1(i10).Z3(user2, false, false);
                                                                hashMap3.put(Long.valueOf(user2.id), user2);
                                                            }
                                                            while (i9 < arrayList5.size()) {
                                                                Pair pair3 = (Pair) arrayList5.get(i9);
                                                                t37Var3.a.add((Long) pair3.first);
                                                                t37Var3.b.add((Integer) pair3.second);
                                                                t37Var3.c.add((TLObject) hashMap3.get(pair3.first));
                                                                i9++;
                                                            }
                                                        }
                                                        t37Var3.b();
                                                        break;
                                                }
                                            }
                                        });
                                        break;
                                    default:
                                        final byte b3 = 1;
                                        final t37 t37Var3 = t37Var;
                                        final int i9 = i4;
                                        final HashMap hashMap3 = hashMap;
                                        final ArrayList arrayList5 = arrayList3;
                                        gl.d3(new Runnable() { // from class: r37
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                byte b32 = b3;
                                                int i92 = 0;
                                                ArrayList arrayList52 = arrayList5;
                                                HashMap hashMap32 = hashMap3;
                                                int i10 = i9;
                                                TLObject tLObject4 = tLObject3;
                                                t37 t37Var32 = t37Var3;
                                                switch (b32) {
                                                    case 0:
                                                        if (tLObject4 != null) {
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject4;
                                                            for (int i11 = 0; i11 < tL_channels_channelParticipants.users.size(); i11++) {
                                                                TLRPC.User user = tL_channels_channelParticipants.users.get(i11);
                                                                na7.q1(i10).Z3(user, false, false);
                                                                hashMap32.put(Long.valueOf(user.id), user);
                                                            }
                                                            while (i92 < arrayList52.size()) {
                                                                Pair pair2 = (Pair) arrayList52.get(i92);
                                                                t37Var32.a.add((Long) pair2.first);
                                                                t37Var32.b.add((Integer) pair2.second);
                                                                t37Var32.c.add((TLObject) hashMap32.get(pair2.first));
                                                                i92++;
                                                            }
                                                        }
                                                        t37Var32.b();
                                                        break;
                                                    default:
                                                        if (tLObject4 != null) {
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject4;
                                                            for (int i12 = 0; i12 < tL_messages_chatFull.users.size(); i12++) {
                                                                TLRPC.User user2 = tL_messages_chatFull.users.get(i12);
                                                                na7.q1(i10).Z3(user2, false, false);
                                                                hashMap32.put(Long.valueOf(user2.id), user2);
                                                            }
                                                            while (i92 < arrayList52.size()) {
                                                                Pair pair3 = (Pair) arrayList52.get(i92);
                                                                t37Var32.a.add((Long) pair3.first);
                                                                t37Var32.b.add((Integer) pair3.second);
                                                                t37Var32.c.add((TLObject) hashMap32.get(pair3.first));
                                                                i92++;
                                                            }
                                                        }
                                                        t37Var32.b();
                                                        break;
                                                }
                                            }
                                        });
                                        break;
                                }
                            }
                        });
                        break;
                    } else {
                        TLRPC.TL_messages_getFullChat tL_messages_getFullChat = new TLRPC.TL_messages_getFullChat();
                        tL_messages_getFullChat.chat_id = chat.id;
                        final byte b2 = 1;
                        ConnectionsManager.getInstance(i4).sendRequest(tL_messages_getFullChat, new RequestDelegate() { // from class: q37
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(final TLObject tLObject3, TLRPC.TL_error tL_error3) {
                                switch (b2) {
                                    case 0:
                                        final byte b22 = 0;
                                        final t37 t37Var2 = t37Var;
                                        final int i8 = i4;
                                        final HashMap hashMap2 = hashMap;
                                        final ArrayList arrayList4 = arrayList3;
                                        gl.d3(new Runnable() { // from class: r37
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                byte b32 = b22;
                                                int i92 = 0;
                                                ArrayList arrayList52 = arrayList4;
                                                HashMap hashMap32 = hashMap2;
                                                int i10 = i8;
                                                TLObject tLObject4 = tLObject3;
                                                t37 t37Var32 = t37Var2;
                                                switch (b32) {
                                                    case 0:
                                                        if (tLObject4 != null) {
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject4;
                                                            for (int i11 = 0; i11 < tL_channels_channelParticipants.users.size(); i11++) {
                                                                TLRPC.User user = tL_channels_channelParticipants.users.get(i11);
                                                                na7.q1(i10).Z3(user, false, false);
                                                                hashMap32.put(Long.valueOf(user.id), user);
                                                            }
                                                            while (i92 < arrayList52.size()) {
                                                                Pair pair2 = (Pair) arrayList52.get(i92);
                                                                t37Var32.a.add((Long) pair2.first);
                                                                t37Var32.b.add((Integer) pair2.second);
                                                                t37Var32.c.add((TLObject) hashMap32.get(pair2.first));
                                                                i92++;
                                                            }
                                                        }
                                                        t37Var32.b();
                                                        break;
                                                    default:
                                                        if (tLObject4 != null) {
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject4;
                                                            for (int i12 = 0; i12 < tL_messages_chatFull.users.size(); i12++) {
                                                                TLRPC.User user2 = tL_messages_chatFull.users.get(i12);
                                                                na7.q1(i10).Z3(user2, false, false);
                                                                hashMap32.put(Long.valueOf(user2.id), user2);
                                                            }
                                                            while (i92 < arrayList52.size()) {
                                                                Pair pair3 = (Pair) arrayList52.get(i92);
                                                                t37Var32.a.add((Long) pair3.first);
                                                                t37Var32.b.add((Integer) pair3.second);
                                                                t37Var32.c.add((TLObject) hashMap32.get(pair3.first));
                                                                i92++;
                                                            }
                                                        }
                                                        t37Var32.b();
                                                        break;
                                                }
                                            }
                                        });
                                        break;
                                    default:
                                        final byte b3 = 1;
                                        final t37 t37Var3 = t37Var;
                                        final int i9 = i4;
                                        final HashMap hashMap3 = hashMap;
                                        final ArrayList arrayList5 = arrayList3;
                                        gl.d3(new Runnable() { // from class: r37
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                byte b32 = b3;
                                                int i92 = 0;
                                                ArrayList arrayList52 = arrayList5;
                                                HashMap hashMap32 = hashMap3;
                                                int i10 = i9;
                                                TLObject tLObject4 = tLObject3;
                                                t37 t37Var32 = t37Var3;
                                                switch (b32) {
                                                    case 0:
                                                        if (tLObject4 != null) {
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject4;
                                                            for (int i11 = 0; i11 < tL_channels_channelParticipants.users.size(); i11++) {
                                                                TLRPC.User user = tL_channels_channelParticipants.users.get(i11);
                                                                na7.q1(i10).Z3(user, false, false);
                                                                hashMap32.put(Long.valueOf(user.id), user);
                                                            }
                                                            while (i92 < arrayList52.size()) {
                                                                Pair pair2 = (Pair) arrayList52.get(i92);
                                                                t37Var32.a.add((Long) pair2.first);
                                                                t37Var32.b.add((Integer) pair2.second);
                                                                t37Var32.c.add((TLObject) hashMap32.get(pair2.first));
                                                                i92++;
                                                            }
                                                        }
                                                        t37Var32.b();
                                                        break;
                                                    default:
                                                        if (tLObject4 != null) {
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject4;
                                                            for (int i12 = 0; i12 < tL_messages_chatFull.users.size(); i12++) {
                                                                TLRPC.User user2 = tL_messages_chatFull.users.get(i12);
                                                                na7.q1(i10).Z3(user2, false, false);
                                                                hashMap32.put(Long.valueOf(user2.id), user2);
                                                            }
                                                            while (i92 < arrayList52.size()) {
                                                                Pair pair3 = (Pair) arrayList52.get(i92);
                                                                t37Var32.a.add((Long) pair3.first);
                                                                t37Var32.b.add((Integer) pair3.second);
                                                                t37Var32.c.add((TLObject) hashMap32.get(pair3.first));
                                                                i92++;
                                                            }
                                                        }
                                                        t37Var32.b();
                                                        break;
                                                }
                                            }
                                        });
                                        break;
                                }
                            }
                        });
                        break;
                    }
                }
                break;
            case 3:
                nna nnaVar = (nna) this.e;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.f;
                Boolean bool = (Boolean) this.d;
                String str = (String) this.h;
                int i8 = this.b;
                long j9 = this.c;
                nnaVar.run();
                cq7.s(tL_starGiftUnique, k96.a0(null, null, bool.booleanValue() ? 2131749518 : 2131749519, str));
                String str2 = tL_starGiftUnique.slug;
                if (!TextUtils.isEmpty(str2)) {
                    gl.e3(new iv1(i8, 0, j9, str2, true), cq7.a[0]);
                    break;
                }
                break;
            case 4:
                ((hp8) this.f).c((TLObject) this.e, (ad7) this.d, this.c, this.b, (ArrayList) this.h);
                break;
            case 5:
                ((wh9) this.e).j((ArrayList) this.f, Integer.valueOf(this.b), Long.valueOf(this.c), (ArrayList) this.d, (ArrayList) this.h);
                break;
            default:
                k27 k27Var = (k27) this.e;
                TLRPC.Message message = (TLRPC.Message) this.f;
                String str3 = (String) this.d;
                int[] iArr = (int[]) this.h;
                int i9 = this.b;
                long j10 = this.c;
                HashMap hashMap2 = uyb.P;
                if (hashMap2 != null) {
                    hashMap2.remove(Integer.valueOf(uyb.r(k27Var)));
                }
                message.voiceTranscription = str3;
                if (iArr.length <= 0) {
                    iArr = null;
                }
                message.voiceTranscriptionWords = iArr;
                message.voiceTranscriptionLocal = true;
                message.voiceTranscriptionFinal = true;
                message.voiceTranscriptionOpen = true;
                message.voiceTranscriptionId = 0L;
                uyb.q(k27Var);
                ad7 Y = ad7.Y(i9);
                Y.a.c(new wy((Object) Y, k27Var.e1(), j10, (Object) message, (Object) str3, (byte) 6));
                kk7 f = kk7.f(i9);
                Boolean bool2 = Boolean.TRUE;
                f.k(kk7.z1, k27Var, null, null, bool2, bool2);
                break;
        }
    }

    public /* synthetic */ qe(t37 t37Var, TLRPC.TL_error tL_error, TLObject tLObject, long j, int i, TLRPC.Chat chat) {
        this.a = (byte) 2;
        this.f = t37Var;
        this.h = tL_error;
        this.e = tLObject;
        this.c = j;
        this.b = i;
        this.d = chat;
    }

    public /* synthetic */ qe(hp8 hp8Var, TLObject tLObject, ad7 ad7Var, long j, int i, ArrayList arrayList) {
        this.a = (byte) 4;
        this.f = hp8Var;
        this.e = tLObject;
        this.d = ad7Var;
        this.c = j;
        this.b = i;
        this.h = arrayList;
    }

    public /* synthetic */ qe(wh9 wh9Var, ArrayList arrayList, int i, long j, ArrayList arrayList2, ArrayList arrayList3) {
        this.a = (byte) 5;
        this.e = wh9Var;
        this.f = arrayList;
        this.b = i;
        this.c = j;
        this.d = arrayList2;
        this.h = arrayList3;
    }

    public /* synthetic */ qe(Object obj, TLObject tLObject, Object obj2, Serializable serializable, int i, long j, byte b) {
        this.a = b;
        this.e = obj;
        this.f = tLObject;
        this.d = obj2;
        this.h = serializable;
        this.b = i;
        this.c = j;
    }

    public /* synthetic */ qe(TLObject tLObject, int i, u41 u41Var, fx0 fx0Var, long j, TLRPC.TL_error tL_error) {
        this.a = (byte) 0;
        this.e = tLObject;
        this.b = i;
        this.f = u41Var;
        this.d = fx0Var;
        this.c = j;
        this.h = tL_error;
    }
}
