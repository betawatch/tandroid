package wd;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class d extends ed.c {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ u9.b c;
    public u9.b d;
    public c e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(u9.b bVar, ed.c cVar) {
        super(cVar);
        this.c = bVar;
    }

    @Override // ed.a
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= TLObject.FLAG_31;
        return this.c.p(null, this);
    }
}
