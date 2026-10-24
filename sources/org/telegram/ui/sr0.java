package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sr0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ bs0 b;

    public /* synthetic */ sr0(bs0 bs0Var, int i10) {
        this.a = i10;
        this.b = bs0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                new org.telegram.ui.Components.xc(this.b.b.e0, null).m(org.telegram.ui.Components.wc.r, 1, -115203550, -1, null).j();
                break;
            default:
                new org.telegram.ui.Components.xc(this.b.b.e0, null).m(org.telegram.ui.Components.wc.r, 1, -115203550, -1, null).j();
                break;
        }
    }
}
