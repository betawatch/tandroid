package zd;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class f extends kd.c {
    public Object[] a;
    public int b;
    public int c;
    public /* synthetic */ Object d;
    public int e;

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.e |= TLObject.FLAG_31;
        return b0.p(null, this);
    }
}
