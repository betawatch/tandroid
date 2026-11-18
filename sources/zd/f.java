package zd;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
