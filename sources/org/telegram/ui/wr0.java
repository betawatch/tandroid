package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wr0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ fs0 b;

    public /* synthetic */ wr0(fs0 fs0Var, int i10) {
        this.a = i10;
        this.b = fs0Var;
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
