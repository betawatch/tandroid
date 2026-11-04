package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class uf0 extends org.telegram.ui.Cells.q1 {
    public int kd;
    public int ld;
    public int md;
    public final /* synthetic */ vf0 nd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uf0(vf0 vf0Var, Context context, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, i3, true, null, e6Var);
        this.nd = vf0Var;
        this.kd = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.ld = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.md = -1;
    }

    @Override // org.telegram.ui.Cells.q1
    public final yh.e U2() {
        return yh.e.d(1, this, this.nd.F);
    }

    @Override // android.view.View
    public final boolean isPressed() {
        return false;
    }

    @Override // org.telegram.ui.Cells.q1, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        if (!this.hb.x0 || i10 == 0 || this.kd == Integer.MAX_VALUE || i12 == 0 || this.ld == Integer.MAX_VALUE) {
            return;
        }
        if (this.md == (getMessageObject() == null ? 0 : getMessageObject().f1())) {
            if (!this.nd.w0) {
                setTranslationY(-(i10 - this.kd));
                animate().translationY(0.0f).setDuration(320L).setInterpolator(org.telegram.ui.Components.xq.h).start();
            }
            this.kd = getTop();
            this.ld = getBottom();
            this.md = getMessageObject() != null ? getMessageObject().f1() : 0;
        }
    }
}
