package zd;

import java.util.Iterator;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class g extends kd.c {
    public Iterator a;
    public /* synthetic */ Object b;
    public int c;

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.c |= TLObject.FLAG_31;
        return e0.o(null, this);
    }
}
