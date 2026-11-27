// default package

import java.util.HashMap;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class y84 extends os9 {
    public final HashMap e = new HashMap();

    @Override // os9
    public final ls9 h(Object obj) {
        return (ls9) this.e.get(obj);
    }

    @Override // os9
    public final Object i(Object obj) {
        Object i = super.i(obj);
        this.e.remove(obj);
        return i;
    }
}
