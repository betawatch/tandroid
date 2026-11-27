// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class yr9 extends ax2 {
    public u8a a;
    public wj7 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ u8a d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yr9(u8a u8aVar, ax2 ax2Var) {
        super(ax2Var);
        this.d = u8aVar;
    }

    @Override // qf0
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= TLObject.FLAG_31;
        return this.d.F(this);
    }
}
