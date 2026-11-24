// default package

import java.io.FileOutputStream;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class pi7 extends qx2 {
    public FileOutputStream a;
    public long b;
    public /* synthetic */ Object c;
    public final /* synthetic */ f8e d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pi7(f8e f8eVar, px2 px2Var) {
        super(px2Var);
        this.d = f8eVar;
    }

    @Override // og0
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= TLObject.FLAG_31;
        return this.d.h(null, this);
    }
}
