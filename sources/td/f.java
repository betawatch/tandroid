package td;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class f extends ed.c {
    public Object[] a;
    public int b;
    public int c;
    public /* synthetic */ Object d;
    public int e;

    @Override // ed.a
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.e |= TLObject.FLAG_31;
        return e0.p(null, this);
    }
}
