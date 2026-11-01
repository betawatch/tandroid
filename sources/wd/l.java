package wd;

import org.telegram.tgnet.TLObject;
import td.f1;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class l extends ed.c {
    public m a;
    public c b;
    public o c;
    public f1 d;
    public Object e;
    public /* synthetic */ Object f;
    public final /* synthetic */ m h;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, ed.c cVar) {
        super(cVar);
        this.h = mVar;
    }

    @Override // ed.a
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.n |= TLObject.FLAG_31;
        this.h.p(null, this);
        return dd.a.a;
    }
}
