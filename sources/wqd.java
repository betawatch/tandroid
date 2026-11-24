// default package

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class wqd {
    public static q01 a(int i, o01 o01Var, int i2) {
        int i3 = i2 & 2;
        o01 o01Var2 = o01.a;
        if (i3 != 0) {
            o01Var = o01Var2;
        }
        if (i == -2) {
            if (o01Var != o01Var2) {
                return new wr2(1, o01Var);
            }
            oe1.p.getClass();
            return new q01(ne1.b);
        }
        if (i != -1) {
            return i != 0 ? i != Integer.MAX_VALUE ? o01Var == o01Var2 ? new q01(i) : new wr2(i, o01Var) : new q01(ConnectionsManager.DEFAULT_DATACENTER_ID) : o01Var == o01Var2 ? new q01(0) : new wr2(1, o01Var);
        }
        if (o01Var == o01Var2) {
            return new wr2(1, o01.b);
        }
        w26.j("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        return null;
    }
}
