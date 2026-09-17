package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x91 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ bb1 b;

    public /* synthetic */ x91(bb1 bb1Var, int i10) {
        this.a = i10;
        this.b = bb1Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                bb1.U(this.b, tLObject);
                break;
            default:
                bb1.V(this.b, tLObject);
                break;
        }
    }
}
