// default package

import java.util.HashMap;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
