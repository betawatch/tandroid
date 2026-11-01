package wd;

import org.telegram.tgnet.TLObject;
import r2.y;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class a extends ed.c {
    public xd.g a;
    public /* synthetic */ Object b;
    public final /* synthetic */ y c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(y yVar, ed.c cVar) {
        super(cVar);
        this.c = yVar;
    }

    @Override // ed.a
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= TLObject.FLAG_31;
        return this.c.p(null, this);
    }
}
