package zd;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class q extends hd.c {
    public kotlin.jvm.internal.r a;
    public p b;
    public /* synthetic */ Object c;
    public int d;

    @Override // hd.a
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.d |= TLObject.FLAG_31;
        return v.d(null, this);
    }
}
