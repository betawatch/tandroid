package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ti0 extends org.telegram.ui.Cells.s1 {
    public int Ce;
    public int De;
    public int Ee;
    public final /* synthetic */ ui0 Fe;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ti0(ui0 ui0Var, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, true, null, f6Var);
        this.Fe = ui0Var;
        this.Ce = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.De = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.Ee = -1;
    }

    @Override // android.view.View
    public final boolean isPressed() {
        return false;
    }

    @Override // org.telegram.ui.Cells.s1, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        if (!this.Wc.w0 || i11 == 0 || this.Ce == Integer.MAX_VALUE || i13 == 0 || this.De == Integer.MAX_VALUE) {
            return;
        }
        if (this.Ee == (getMessageObject() == null ? 0 : getMessageObject().getId())) {
            if (!this.Fe.t0) {
                setTranslationY(-(i11 - this.Ce));
                animate().translationY(0.0f).setDuration(320L).setInterpolator(org.telegram.ui.Components.mr.h).start();
            }
            this.Ce = getTop();
            this.De = getBottom();
            this.Ee = getMessageObject() != null ? getMessageObject().getId() : 0;
        }
    }

    @Override // org.telegram.ui.Cells.s1
    public final ih.j w3() {
        return ih.j.d(1, this, this.Fe.C);
    }
}
