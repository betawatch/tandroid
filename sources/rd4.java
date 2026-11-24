// default package

import java.io.FileOutputStream;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class rd4 extends qx2 {
    public FileOutputStream a;
    public FileOutputStream b;
    public /* synthetic */ Object c;
    public final /* synthetic */ sd4 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rd4(sd4 sd4Var, qx2 qx2Var) {
        super(qx2Var);
        this.d = sd4Var;
    }

    @Override // og0
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= TLObject.FLAG_31;
        return this.d.b(null, this);
    }
}
