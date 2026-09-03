package uf;

import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.wn0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class s extends k1 {
    public final /* synthetic */ wn0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(wn0 wn0Var) {
        super(false);
        this.t = wn0Var;
    }

    @Override // uf.k1
    public final boolean d(TLObject tLObject) {
        return this.t.F(tLObject);
    }
}
