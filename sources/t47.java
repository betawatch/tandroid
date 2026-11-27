// default package

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class t47 {
    public final Boolean a;
    public final byte b;
    public final long c;
    public final ArrayList e;
    public final SparseBooleanArray g;
    public final boolean i;
    public final boolean j;
    public final /* synthetic */ v47 k;
    public final LongSparseArray d = new LongSparseArray();
    public final ArrayList f = new ArrayList();
    public final ArrayList h = new ArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public t47(v47 v47Var, Boolean bool, int i, ArrayList arrayList, long j, SparseBooleanArray sparseBooleanArray) {
        LongSparseArray longSparseArray;
        int i2;
        long j2;
        TLRPC.MessageFwdHeader messageFwdHeader;
        r47 r47Var;
        this.k = v47Var;
        this.g = new SparseBooleanArray();
        this.a = bool;
        this.b = i;
        this.c = j;
        this.e = arrayList;
        if (sparseBooleanArray != null) {
            this.g = sparseBooleanArray;
        }
        int i3 = 0;
        while (i3 < arrayList.size()) {
            r47 r47Var2 = (r47) arrayList.get(i3);
            if (i == 0 && sparseBooleanArray == null) {
                this.g.put(r47Var2.e1(), true);
            }
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            if (i != 1) {
                tL_message.date = ConnectionsManager.getInstance(r47Var2.K1).getCurrentTime();
            } else {
                tL_message.date = r47Var2.k.date;
            }
            TLRPC.Message message = r47Var2.k;
            int i4 = r47Var2.K1;
            tL_message.id = message.id;
            int i5 = i3;
            tL_message.grouped_id = message.grouped_id;
            tL_message.peer_id = message.peer_id;
            tL_message.from_id = message.from_id;
            tL_message.message = message.message;
            tL_message.rich_message = message.rich_message;
            tL_message.media = message.media;
            tL_message.action = message.action;
            tL_message.edit_date = 0;
            ArrayList<TLRPC.MessageEntity> arrayList2 = message.entities;
            if (arrayList2 != null) {
                tL_message.entities.addAll(arrayList2);
            }
            boolean booleanValue = bool == null ? r47Var2.k.out : bool.booleanValue();
            tL_message.out = booleanValue;
            if (booleanValue) {
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_message.from_id = tL_peerUser;
                tL_peerUser.user_id = yac.h(i4).e();
            }
            tL_message.unread = false;
            TLRPC.Message message2 = r47Var2.k;
            tL_message.via_bot_id = message2.via_bot_id;
            tL_message.reply_markup = message2.reply_markup;
            tL_message.post = message2.post;
            tL_message.legacy = message2.legacy;
            tL_message.restriction_reason = message2.restriction_reason;
            TLRPC.Message message3 = message2.replyMessage;
            tL_message.replyMessage = message3;
            if (message3 == null && (r47Var = r47Var2.C) != null) {
                tL_message.replyMessage = r47Var.k;
            }
            tL_message.reply_to = message2.reply_to;
            tL_message.invert_media = message2.invert_media;
            if (i == 0) {
                long e = yac.h(i4).e();
                j2 = 0;
                if (v47Var.i) {
                    i2 = i4;
                } else {
                    TLRPC.Message message4 = r47Var2.k;
                    messageFwdHeader = message4.fwd_from;
                    if (messageFwdHeader != null) {
                        if (r47Var2.T2()) {
                            v47Var.m = true;
                        } else {
                            v47Var.h = true;
                        }
                        i2 = i4;
                    } else {
                        i2 = i4;
                        long j3 = message4.from_id.user_id;
                        if (j3 == 0 || message4.dialog_id != e || j3 != e) {
                            messageFwdHeader = new TLRPC.TL_messageFwdHeader();
                            messageFwdHeader.from_id = r47Var2.k.from_id;
                            if (r47Var2.T2()) {
                                v47Var.m = true;
                            } else {
                                v47Var.h = true;
                            }
                        }
                    }
                    if (messageFwdHeader != null) {
                        tL_message.fwd_from = messageFwdHeader;
                        tL_message.flags |= 4;
                    }
                    if (r47Var2.a5()) {
                        tL_message.id = r47Var2.P0();
                        TLRPC.MessageFwdHeader messageFwdHeader2 = tL_message.fwd_from;
                        if (messageFwdHeader2 != null && messageFwdHeader2.from_id != null) {
                            messageFwdHeader2.from_id = (TLRPC.Peer) TLObject.deepCopy(r47Var2.k.peer_id, new hz6((byte) 11));
                            long n = wf3.n(r47Var2.k.from_id);
                            if (n > 0) {
                                tL_message.via_bot_id = n;
                            }
                        }
                    }
                }
                messageFwdHeader = null;
                if (messageFwdHeader != null) {
                }
                if (r47Var2.a5()) {
                }
            } else {
                i2 = i4;
                j2 = 0;
            }
            s47 s47Var = new s47(v47Var, i2, tL_message, i);
            s47Var.u1 = i == 0;
            s47Var.t1 = true;
            if (!this.i) {
                ArrayList<TLRPC.MessageEntity> arrayList3 = s47Var.k.entities;
                int size = arrayList3.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size) {
                        break;
                    }
                    TLRPC.MessageEntity messageEntity = arrayList3.get(i6);
                    i6++;
                    if (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) {
                        this.i = true;
                        break;
                    }
                }
            }
            s47Var.k.dialog_id = j;
            if (s47Var.c1() != j2) {
                m47 m47Var = (m47) this.d.get(s47Var.c1(), null);
                if (m47Var == null) {
                    m47Var = new m47();
                    this.d.put(s47Var.c1(), m47Var);
                }
                m47Var.d.add(s47Var);
            }
            this.f.add(0, s47Var);
            if (r47Var2.S3()) {
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) r47Var2.k.media;
                u47 u47Var = new u47();
                u47Var.poll = tL_messageMediaPoll.poll;
                u47Var.provider = tL_messageMediaPoll.provider;
                TLRPC.TL_pollResults tL_pollResults = new TLRPC.TL_pollResults();
                u47Var.results = tL_pollResults;
                int i7 = tL_messageMediaPoll.results.total_voters;
                tL_pollResults.total_voters = i7;
                u47Var.a = i7;
                s47Var.k.media = u47Var;
                if (r47Var2.C()) {
                    int size2 = tL_messageMediaPoll.results.results.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        TLRPC.PollAnswerVoters pollAnswerVoters = tL_messageMediaPoll.results.results.get(i8);
                        if (pollAnswerVoters.chosen) {
                            TLRPC.PollAnswerVoters pollAnswerVoters2 = new TLRPC.PollAnswerVoters();
                            pollAnswerVoters2.chosen = pollAnswerVoters.chosen;
                            pollAnswerVoters2.correct = pollAnswerVoters.correct;
                            pollAnswerVoters2.flags = pollAnswerVoters.flags;
                            pollAnswerVoters2.option = pollAnswerVoters.option;
                            pollAnswerVoters2.voters = pollAnswerVoters.voters;
                            this.h.add(pollAnswerVoters2);
                            u47Var.results.results.add(pollAnswerVoters2);
                        } else {
                            u47Var.results.results.add(pollAnswerVoters);
                        }
                    }
                }
            }
            i3 = i5 + 1;
        }
        r47 r47Var3 = null;
        int i9 = 0;
        while (true) {
            int size3 = this.d.size();
            longSparseArray = this.d;
            if (i9 >= size3) {
                break;
            }
            ((m47) longSparseArray.valueAt(i9)).a();
            i9++;
        }
        if (longSparseArray == null || longSparseArray.size() <= 0) {
            if (arrayList.size() == 1) {
                int i10 = ((r47) arrayList.get(0)).D;
                if (i10 == 0 || i10 == 19) {
                    this.j = !TextUtils.isEmpty(r1.v);
                    return;
                } else {
                    this.j = !TextUtils.isEmpty(r1.z);
                    return;
                }
            }
            return;
        }
        m47 m47Var2 = (m47) this.d.valueAt(0);
        ArrayList arrayList4 = m47Var2.d;
        if (!arrayList4.isEmpty() && m47Var2.f.isEmpty()) {
            m47Var2.a();
        }
        r47 r47Var4 = null;
        int i11 = 0;
        while (true) {
            if (i11 >= arrayList4.size()) {
                r47Var3 = r47Var4;
                break;
            }
            r47 r47Var5 = (r47) arrayList4.get(i11);
            if (!TextUtils.isEmpty(r47Var5.z)) {
                if (r47Var4 != null) {
                    break;
                } else {
                    r47Var4 = r47Var5;
                }
            }
            i11++;
        }
        this.j = r47Var3 != null;
    }

    public final t47 a(ArrayList arrayList) {
        ArrayList arrayList2 = this.e;
        if (arrayList2 == null || arrayList2.size() > 1 || arrayList == null) {
            return null;
        }
        boolean z = false;
        for (int i = 0; i < arrayList2.size(); i++) {
            r47 r47Var = (r47) arrayList2.get(i);
            if (r47Var != null) {
                int i2 = 0;
                while (true) {
                    if (i2 >= arrayList.size()) {
                        break;
                    }
                    r47 r47Var2 = (r47) arrayList.get(i2);
                    if (r47Var2 != null && r47Var.e1() == r47Var2.e1() && r47.B0(r47Var.k) == r47.B0(r47Var2.k)) {
                        arrayList2.set(i, r47Var2);
                        z = true;
                        break;
                    }
                    i2++;
                }
            }
        }
        if (!z) {
            return null;
        }
        return new t47(this.k, this.a, this.b, arrayList2, this.c, null);
    }

    public final void b(ArrayList arrayList) {
        arrayList.clear();
        int i = 0;
        while (true) {
            ArrayList arrayList2 = this.e;
            if (i >= arrayList2.size()) {
                return;
            }
            r47 r47Var = (r47) arrayList2.get(i);
            if (this.g.get(r47Var.e1(), false)) {
                arrayList.add(r47Var);
            }
            i++;
        }
    }
}
