// default package

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class x1f {
    public static int a(int i, int i2) {
        if (i2 < 0) {
            fi7.g("cannot store more than MAX_VALUE elements");
            return 0;
        }
        int i3 = i + (i >> 1) + 1;
        if (i3 < i2) {
            i3 = Integer.highestOneBit(i2 - 1) << 1;
        }
        return i3 < 0 ? ConnectionsManager.DEFAULT_DATACENTER_ID : i3;
    }
}
