package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ur0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ ds0 b;

    public /* synthetic */ ur0(ds0 ds0Var, int i10) {
        this.a = i10;
        this.b = ds0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                new org.telegram.ui.Components.qc(this.b.b.b0, null).m(org.telegram.ui.Components.pc.r, 1, -115203550, -1, null).j();
                break;
            default:
                new org.telegram.ui.Components.qc(this.b.b.b0, null).m(org.telegram.ui.Components.pc.r, 1, -115203550, -1, null).j();
                break;
        }
    }
}
