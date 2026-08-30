package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qr0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ wr0 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ qr0(wr0 wr0Var, boolean z4, int i10) {
        this.a = i10;
        this.b = wr0Var;
        this.c = z4;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.qc.F(this.b.b.b0, this.c).j();
                break;
            default:
                org.telegram.ui.Components.qc.F(this.b.b.b0, this.c).j();
                break;
        }
    }
}
