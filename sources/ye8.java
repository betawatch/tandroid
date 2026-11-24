// default package

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public abstract class ye8 {
    public static int a(k27 k27Var) {
        if (k27Var.D == 17) {
            TLRPC.Message message = k27Var.k;
            int i = k27Var.K1;
            TLRPC.MessageMedia n1 = k27.n1(message);
            TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) (TLRPC.TL_messageMediaPoll.class.isInstance(n1) ? (TLRPC.MessageMedia) TLRPC.TL_messageMediaPoll.class.cast(n1) : null);
            if (tL_messageMediaPoll != null) {
                TLRPC.Poll poll = tL_messageMediaPoll.poll;
                int i2 = poll.closed ? 8 : 0;
                if (poll.subscribers_only) {
                    TLRPC.MessageFwdHeader messageFwdHeader = message.fwd_from;
                    TLRPC.Chat K0 = na7.q1(i).K0(Long.valueOf(-(messageFwdHeader != null ? cf3.n(messageFwdHeader.from_id) : k27.B0(k27Var.k))));
                    if (K0 != null) {
                        if (K0.left || K0.kicked) {
                            i2 |= 1;
                        }
                        TLRPC.MessageFwdHeader messageFwdHeader2 = message.fwd_from;
                        if ((messageFwdHeader2 != null ? messageFwdHeader2.date : message.date) - K0.date < 86400) {
                            i2 |= 2;
                        }
                    }
                }
                ArrayList<String> arrayList = tL_messageMediaPoll.poll.countries_iso2;
                if (arrayList == null || arrayList.isEmpty()) {
                    return i2;
                }
                return !tL_messageMediaPoll.poll.countries_iso2.contains(na7.q1(i).k4.S.f) ? i2 | 4 : i2;
            }
        }
        return 0;
    }

    public static SpannableStringBuilder b(int i, k27 k27Var) {
        if (k27Var.D == 17) {
            TLRPC.Message message = k27Var.k;
            int i2 = k27Var.K1;
            TLRPC.MessageMedia n1 = k27.n1(message);
            TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) (TLRPC.TL_messageMediaPoll.class.isInstance(n1) ? (TLRPC.MessageMedia) TLRPC.TL_messageMediaPoll.class.cast(n1) : null);
            if (tL_messageMediaPoll != null) {
                if (fod.a(i, 4)) {
                    ArrayList arrayList = new ArrayList(tL_messageMediaPoll.poll.countries_iso2.size());
                    ArrayList<String> arrayList2 = tL_messageMediaPoll.poll.countries_iso2;
                    int size = arrayList2.size();
                    int i3 = 0;
                    while (i3 < size) {
                        String str = arrayList2.get(i3);
                        i3++;
                        String str2 = str;
                        String i0 = k96.i0(2131750504, str2);
                        if (!TextUtils.isEmpty(i0)) {
                            str2 = i0;
                        }
                        arrayList.add(str2);
                    }
                    boolean z = tL_messageMediaPoll.poll.subscribers_only;
                    if (arrayList.size() == 1) {
                        return gl.S2(k96.a0(null, null, z ? 2131746924 : 2131746921, arrayList.get(0)));
                    }
                    StringBuffer stringBuffer = new StringBuffer();
                    for (int i4 = 0; i4 < arrayList.size() - 1; i4++) {
                        if (stringBuffer.length() > 0) {
                            stringBuffer.append(", ");
                        }
                        stringBuffer.append((String) arrayList.get(i4));
                    }
                    return gl.S2(k96.a0(null, null, z ? 2131746923 : 2131746920, stringBuffer, b00.f(1, arrayList)));
                }
                if (fod.a(i, 1)) {
                    TLRPC.MessageFwdHeader messageFwdHeader = message.fwd_from;
                    return gl.S2(k96.a0(null, null, 2131746925, cf3.t(na7.q1(i2).K0(Long.valueOf(-(messageFwdHeader != null ? cf3.n(messageFwdHeader.from_id) : k27.B0(k27Var.k)))))));
                }
                if (fod.a(i, 2)) {
                    return gl.S2(k96.M0(2131746922, null));
                }
            }
        }
        return null;
    }
}
