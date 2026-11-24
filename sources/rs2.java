// default package

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class rs2 implements n4a {
    public final AtomicReference a;

    public rs2(t4a t4aVar) {
        this.a = new AtomicReference(t4aVar);
    }

    @Override // n4a
    public final Iterator iterator() {
        n4a n4aVar = (n4a) this.a.getAndSet(null);
        if (n4aVar != null) {
            return n4aVar.iterator();
        }
        sc8.j("This sequence can be consumed only once.");
        return null;
    }
}
