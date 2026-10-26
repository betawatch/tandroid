package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zr0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ fs0 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ zr0(fs0 fs0Var, boolean z10, int i10) {
        this.a = i10;
        this.b = fs0Var;
        this.c = z10;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.wc.F(this.b.b.e0, this.c).j();
                break;
            default:
                org.telegram.ui.Components.wc.F(this.b.b.e0, this.c).j();
                break;
        }
    }
}
