// default package

import java.io.Serializable;
import java.util.Iterator;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class p73 extends qx2 {
    public Serializable a;
    public Iterator b;
    public /* synthetic */ Object c;
    public final /* synthetic */ dhf d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p73(dhf dhfVar, qx2 qx2Var) {
        super(qx2Var);
        this.d = dhfVar;
    }

    @Override // og0
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= TLObject.FLAG_31;
        return this.d.P(null, null, this);
    }
}
