package wd;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class f extends ed.c {
    public g a;
    public /* synthetic */ Object b;
    public final /* synthetic */ g c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, ed.c cVar) {
        super(cVar);
        this.c = gVar;
    }

    @Override // ed.a
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= TLObject.FLAG_31;
        return this.c.b(null, this);
    }
}
