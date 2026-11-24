// default package

import java.io.Serializable;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class q73 extends gw2 {
    public Object a;
    public Object b;
    public Serializable c;
    public c59 d;
    public boolean e;
    public int f;
    public /* synthetic */ Object h;
    public final /* synthetic */ v73 n;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q73(v73 v73Var, gw2 gw2Var) {
        super(gw2Var);
        this.n = v73Var;
    }

    @Override // of0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.r |= TLObject.FLAG_31;
        return this.n.h(false, this);
    }
}
