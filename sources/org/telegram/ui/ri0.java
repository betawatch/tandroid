package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ri0 extends org.telegram.ui.Cells.t1 {
    public int Ce;
    public int De;
    public int Ee;
    public final /* synthetic */ si0 Fe;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ri0(si0 si0Var, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, true, null, f6Var);
        this.Fe = si0Var;
        this.Ce = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.De = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.Ee = -1;
    }

    @Override // android.view.View
    public final boolean isPressed() {
        return false;
    }

    @Override // org.telegram.ui.Cells.t1, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        if (!this.Wc.w0 || i11 == 0 || this.Ce == Integer.MAX_VALUE || i13 == 0 || this.De == Integer.MAX_VALUE) {
            return;
        }
        if (this.Ee == (getMessageObject() == null ? 0 : getMessageObject().getId())) {
            if (!this.Fe.t0) {
                setTranslationY(-(i11 - this.Ce));
                animate().translationY(0.0f).setDuration(320L).setInterpolator(org.telegram.ui.Components.nr.h).start();
            }
            this.Ce = getTop();
            this.De = getBottom();
            this.Ee = getMessageObject() != null ? getMessageObject().getId() : 0;
        }
    }

    @Override // org.telegram.ui.Cells.t1
    public final ih.j w3() {
        return ih.j.d(1, this, this.Fe.C);
    }
}
