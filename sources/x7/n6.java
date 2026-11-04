package x7;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class n6 {
    public static yd.c a(int i3, yd.a aVar, int i10) {
        if ((i10 & 2) != 0) {
            aVar = yd.a.a;
        }
        if (i3 == -2) {
            if (aVar != yd.a.a) {
                return new yd.m(1, aVar);
            }
            yd.g.D.getClass();
            return new yd.c(yd.f.b);
        }
        if (i3 != -1) {
            return i3 != 0 ? i3 != Integer.MAX_VALUE ? aVar == yd.a.a ? new yd.c(i3) : new yd.m(i3, aVar) : new yd.c(ConnectionsManager.DEFAULT_DATACENTER_ID) : aVar == yd.a.a ? new yd.c(0) : new yd.m(1, aVar);
        }
        if (aVar == yd.a.a) {
            return new yd.m(1, yd.a.b);
        }
        throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
    }
}
