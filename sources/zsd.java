// default package

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class zsd {
    public static y11 a(int i, w11 w11Var, int i2) {
        int i3 = i2 & 2;
        w11 w11Var2 = w11.a;
        if (i3 != 0) {
            w11Var = w11Var2;
        }
        if (i == -2) {
            if (w11Var != w11Var2) {
                return new ht2(1, w11Var);
            }
            wf1.p.getClass();
            return new y11(vf1.b);
        }
        if (i != -1) {
            return i != 0 ? i != Integer.MAX_VALUE ? w11Var == w11Var2 ? new y11(i) : new ht2(i, w11Var) : new y11(ConnectionsManager.DEFAULT_DATACENTER_ID) : w11Var == w11Var2 ? new y11(0) : new ht2(1, w11Var);
        }
        if (w11Var == w11Var2) {
            return new ht2(1, w11.b);
        }
        u36.j("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        return null;
    }
}
