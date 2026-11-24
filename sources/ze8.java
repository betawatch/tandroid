// default package

import java.util.Arrays;
import java.util.Comparator;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ze8 implements Comparator {
    public final /* synthetic */ gf8 a;

    public ze8(gf8 gf8Var) {
        this.a = gf8Var;
    }

    public final int a(ff8 ff8Var) {
        TLRPC.Poll poll = this.a.s1;
        int size = poll.answers.size();
        for (int i = 0; i < size; i++) {
            if (Arrays.equals(poll.answers.get(i).option, ff8Var.d)) {
                return i;
            }
        }
        return 0;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int a = a((ff8) obj);
        int a2 = a((ff8) obj2);
        if (a > a2) {
            return 1;
        }
        return a < a2 ? -1 : 0;
    }
}
