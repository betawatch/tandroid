package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xr0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ ds0 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ xr0(ds0 ds0Var, boolean z4, int i10) {
        this.a = i10;
        this.b = ds0Var;
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
