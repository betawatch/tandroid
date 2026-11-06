package zd;

import java.util.Iterator;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class g extends kd.c {
    public Iterator a;
    public /* synthetic */ Object b;
    public int c;

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.c |= TLObject.FLAG_31;
        return b0.o(null, this);
    }
}
