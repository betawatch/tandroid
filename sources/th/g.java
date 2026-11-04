package th;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import k2.p1;
import org.telegram.messenger.bd;
import org.telegram.messenger.g0;
import org.telegram.messenger.hp;
import org.telegram.messenger.m5;
import org.telegram.messenger.n0;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import x7.u;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class g {
    public static int a(zi ziVar) {
        if (ziVar.D == 17) {
            TLRPC.Message message = ziVar.k;
            int i3 = ziVar.I1;
            TLRPC.MessageMedia o12 = zi.o1(message);
            TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) (TLRPC.TL_messageMediaPoll.class.isInstance(o12) ? (TLRPC.MessageMedia) TLRPC.TL_messageMediaPoll.class.cast(o12) : null);
            if (tL_messageMediaPoll != null) {
                TLRPC.Poll poll = tL_messageMediaPoll.poll;
                int i10 = poll.closed ? 8 : 0;
                if (poll.subscribers_only) {
                    TLRPC.MessageFwdHeader messageFwdHeader = message.fwd_from;
                    TLRPC.Chat M0 = hp.s1(i3).M0(Long.valueOf(-(messageFwdHeader != null ? m5.o(messageFwdHeader.from_id) : zi.B0(ziVar.k))));
                    if (M0 != null) {
                        if (M0.left || M0.kicked) {
                            i10 |= 1;
                        }
                        TLRPC.MessageFwdHeader messageFwdHeader2 = message.fwd_from;
                        if ((messageFwdHeader2 != null ? messageFwdHeader2.date : message.date) - M0.date < 86400) {
                            i10 |= 2;
                        }
                    }
                }
                ArrayList<String> arrayList = tL_messageMediaPoll.poll.countries_iso2;
                if (arrayList != null && !arrayList.isEmpty()) {
                    if (!tL_messageMediaPoll.poll.countries_iso2.contains(((n0) hp.s1(i3).x7.O.b).c)) {
                        return i10 | 4;
                    }
                }
                return i10;
            }
        }
        return 0;
    }

    public static SpannableStringBuilder b(int i3, zi ziVar) {
        if (ziVar.D == 17) {
            TLRPC.Message message = ziVar.k;
            int i10 = ziVar.I1;
            TLRPC.MessageMedia o12 = zi.o1(message);
            TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) (TLRPC.TL_messageMediaPoll.class.isInstance(o12) ? (TLRPC.MessageMedia) TLRPC.TL_messageMediaPoll.class.cast(o12) : null);
            if (tL_messageMediaPoll != null) {
                if (u.a(i3, 4)) {
                    ArrayList arrayList = new ArrayList(tL_messageMediaPoll.poll.countries_iso2.size());
                    ArrayList<String> arrayList2 = tL_messageMediaPoll.poll.countries_iso2;
                    int size = arrayList2.size();
                    int i11 = 0;
                    while (i11 < size) {
                        String str = arrayList2.get(i11);
                        i11++;
                        String str2 = str;
                        String i02 = bd.i0(2131750529, str2);
                        if (!TextUtils.isEmpty(i02)) {
                            str2 = i02;
                        }
                        arrayList.add(str2);
                    }
                    boolean z10 = tL_messageMediaPoll.poll.subscribers_only;
                    if (arrayList.size() == 1) {
                        return g0.X2(bd.a0(null, null, z10 ? 2131747125 : 2131747122, arrayList.get(0)));
                    }
                    StringBuffer stringBuffer = new StringBuffer();
                    for (int i12 = 0; i12 < arrayList.size() - 1; i12++) {
                        if (stringBuffer.length() > 0) {
                            stringBuffer.append(", ");
                        }
                        stringBuffer.append((String) arrayList.get(i12));
                    }
                    return g0.X2(bd.a0(null, null, z10 ? 2131747124 : 2131747121, stringBuffer, p1.h(1, arrayList)));
                }
                if (u.a(i3, 1)) {
                    TLRPC.MessageFwdHeader messageFwdHeader = message.fwd_from;
                    return g0.X2(bd.a0(null, null, 2131747126, m5.u(hp.s1(i10).M0(Long.valueOf(-(messageFwdHeader != null ? m5.o(messageFwdHeader.from_id) : zi.B0(ziVar.k)))))));
                }
                if (u.a(i3, 2)) {
                    return g0.X2(bd.M0(2131747123, null));
                }
            }
        }
        return null;
    }
}
