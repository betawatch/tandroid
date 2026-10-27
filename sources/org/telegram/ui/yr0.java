package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yr0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ hs0 b;

    public /* synthetic */ yr0(hs0 hs0Var, int i10) {
        this.a = i10;
        this.b = hs0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                new org.telegram.ui.Components.wc(this.b.b.e0, null).m(org.telegram.ui.Components.vc.r, 1, -115203550, -1, null).j();
                break;
            default:
                new org.telegram.ui.Components.wc(this.b.b.e0, null).m(org.telegram.ui.Components.vc.r, 1, -115203550, -1, null).j();
                break;
        }
    }
}
