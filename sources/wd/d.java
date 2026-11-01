package wd;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
