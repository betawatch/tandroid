package zd;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class d extends hd.c {
    public c a;
    public yd.q b;
    public yd.b c;
    public boolean d;
    public /* synthetic */ Object e;
    public int f;

    @Override // hd.a
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.f |= TLObject.FLAG_31;
        return v.c(null, null, false, this);
    }
}
