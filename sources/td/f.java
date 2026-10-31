package td;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
