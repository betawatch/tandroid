package zd;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
