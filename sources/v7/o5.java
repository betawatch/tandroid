package v7;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public abstract class o5 {
    public static int a(int i10, int i11) {
        if (i11 < 0) {
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
        int i12 = i10 + (i10 >> 1) + 1;
        if (i12 < i11) {
            int highestOneBit = Integer.highestOneBit(i11 - 1);
            i12 = highestOneBit + highestOneBit;
        }
        return i12 < 0 ? ConnectionsManager.DEFAULT_DATACENTER_ID : i12;
    }
}
