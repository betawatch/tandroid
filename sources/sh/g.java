package sh;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import c8.ed;
import java.util.ArrayList;
import org.telegram.messenger.fj;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.n0;
import org.telegram.messenger.n5;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public abstract class g {
    public static int a(fj fjVar) {
        if (fjVar.D == 17) {
            TLRPC.Message message = fjVar.k;
            int i7 = fjVar.K1;
            TLRPC.MessageMedia n1 = fj.n1(message);
            TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) (TLRPC.TL_messageMediaPoll.class.isInstance(n1) ? (TLRPC.MessageMedia) TLRPC.TL_messageMediaPoll.class.cast(n1) : null);
            if (tL_messageMediaPoll != null) {
                TLRPC.Poll poll = tL_messageMediaPoll.poll;
                int i10 = poll.closed ? 8 : 0;
                if (poll.subscribers_only) {
                    TLRPC.MessageFwdHeader messageFwdHeader = message.fwd_from;
                    TLRPC.Chat O0 = mp.u1(i7).O0(Long.valueOf(-(messageFwdHeader != null ? n5.o(messageFwdHeader.from_id) : fj.B0(fjVar.k))));
                    if (O0 != null) {
                        if (O0.left || O0.kicked) {
                            i10 |= 1;
                        }
                        TLRPC.MessageFwdHeader messageFwdHeader2 = message.fwd_from;
                        if ((messageFwdHeader2 != null ? messageFwdHeader2.date : message.date) - O0.date < 86400) {
                            i10 |= 2;
                        }
                    }
                }
                ArrayList<String> arrayList = tL_messageMediaPoll.poll.countries_iso2;
                if (arrayList != null && !arrayList.isEmpty()) {
                    if (!tL_messageMediaPoll.poll.countries_iso2.contains(((n0) mp.u1(i7).A7.T.b).c)) {
                        return i10 | 4;
                    }
                }
                return i10;
            }
        }
        return 0;
    }

    public static SpannableStringBuilder b(int i7, fj fjVar) {
        if (fjVar.D == 17) {
            TLRPC.Message message = fjVar.k;
            int i10 = fjVar.K1;
            TLRPC.MessageMedia n1 = fj.n1(message);
            TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) (TLRPC.TL_messageMediaPoll.class.isInstance(n1) ? (TLRPC.MessageMedia) TLRPC.TL_messageMediaPoll.class.cast(n1) : null);
            if (tL_messageMediaPoll != null) {
                if (ed.a(i7, 4)) {
                    ArrayList arrayList = new ArrayList(tL_messageMediaPoll.poll.countries_iso2.size());
                    ArrayList<String> arrayList2 = tL_messageMediaPoll.poll.countries_iso2;
                    int size = arrayList2.size();
                    int i11 = 0;
                    while (i11 < size) {
                        String str = arrayList2.get(i11);
                        i11++;
                        String str2 = str;
                        String i02 = gd.i0(2131750504, str2);
                        if (!TextUtils.isEmpty(i02)) {
                            str2 = i02;
                        }
                        arrayList.add(str2);
                    }
                    boolean z10 = tL_messageMediaPoll.poll.subscribers_only;
                    if (arrayList.size() == 1) {
                        return g0.W2(gd.a0(null, null, z10 ? 2131746923 : 2131746920, arrayList.get(0)));
                    }
                    StringBuffer stringBuffer = new StringBuffer();
                    for (int i12 = 0; i12 < arrayList.size() - 1; i12++) {
                        if (stringBuffer.length() > 0) {
                            stringBuffer.append(", ");
                        }
                        stringBuffer.append((String) arrayList.get(i12));
                    }
                    return g0.W2(gd.a0(null, null, z10 ? 2131746922 : 2131746919, stringBuffer, i5.c.h(1, arrayList)));
                }
                if (ed.a(i7, 1)) {
                    TLRPC.MessageFwdHeader messageFwdHeader = message.fwd_from;
                    return g0.W2(gd.a0(null, null, 2131746924, n5.u(mp.u1(i10).O0(Long.valueOf(-(messageFwdHeader != null ? n5.o(messageFwdHeader.from_id) : fj.B0(fjVar.k)))))));
                }
                if (ed.a(i7, 2)) {
                    return g0.W2(gd.N0(2131746921, null));
                }
            }
        }
        return null;
    }
}
