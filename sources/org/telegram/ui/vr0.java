package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vr0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ bs0 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ vr0(bs0 bs0Var, boolean z10, int i10) {
        this.a = i10;
        this.b = bs0Var;
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
