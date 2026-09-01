package uf;

import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.xn0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class s extends k1 {
    public final /* synthetic */ xn0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(xn0 xn0Var) {
        super(false);
        this.t = xn0Var;
    }

    @Override // uf.k1
    public final boolean d(TLObject tLObject) {
        return this.t.F(tLObject);
    }
}
