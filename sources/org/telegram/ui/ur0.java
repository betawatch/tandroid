package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ur0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ as0 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ ur0(as0 as0Var, boolean z10, int i10) {
        this.a = i10;
        this.b = as0Var;
        this.c = z10;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.xc.F(this.b.b.e0, this.c).j();
                break;
            default:
                org.telegram.ui.Components.xc.F(this.b.b.e0, this.c).j();
                break;
        }
    }
}
