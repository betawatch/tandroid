package th;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.ef;
import org.telegram.messenger.qz;
import org.telegram.messenger.x20;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.s40;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class c2 implements s40 {
    public final /* synthetic */ z2 a;

    public c2(z2 z2Var) {
        this.a = z2Var;
    }

    @Override // org.telegram.ui.Components.s40
    public final long a() {
        return this.a.k1;
    }

    @Override // org.telegram.ui.Components.s40
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // org.telegram.ui.Components.s40
    public final int getClassGuid() {
        return this.a.i2;
    }

    @Override // org.telegram.ui.Components.s40
    public final View getFragmentView() {
        return this.a;
    }

    @Override // org.telegram.ui.Components.s40
    public final Activity getParentActivity() {
        return org.telegram.messenger.i0.W(this.a.getContext());
    }

    @Override // org.telegram.ui.Components.s40
    public final void t(ef efVar, x20 x20Var, boolean z10, int i10, int i11, boolean z11, long j10) {
        org.telegram.messenger.c accountInstance;
        org.telegram.messenger.c accountInstance2;
        org.telegram.messenger.c accountInstance3;
        org.telegram.messenger.c accountInstance4;
        z2 z2Var = this.a;
        TL_stories.StoryItem storyItem = z2Var.x1.a;
        if (storyItem == null || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        storyItem.dialogId = z2Var.k1;
        if (efVar.b) {
            if (x20Var != null) {
                accountInstance4 = z2Var.getAccountInstance();
                String str = efVar.I;
                qz.b0(efVar.x, i10, i11, z2Var.k1, 0L, j10, 0L, efVar.a, str, null, efVar.n, accountInstance4, null, null, null, null, null, x20Var, null, storyItem, null, z10, false, efVar.M);
            } else {
                accountInstance3 = z2Var.getAccountInstance();
                String str2 = efVar.I;
                qz.b0(efVar.x, i10, i11, z2Var.k1, 0L, j10, 0L, efVar.a, str2, null, efVar.n, accountInstance3, null, null, null, null, null, null, null, storyItem, null, z10, false, efVar.M);
            }
        } else if (efVar.h != null) {
            accountInstance2 = z2Var.getAccountInstance();
            qz.Z(accountInstance2, efVar.h, efVar.c, null, z2Var.k1, null, null, null, efVar.n, efVar.r, null, efVar.x, null, x20Var, z10, i10, false, efVar.a, null, 0L, j10, 0L, null);
        } else if (efVar.I != null) {
            accountInstance = z2Var.getAccountInstance();
            qz.Z(accountInstance, efVar.I, efVar.c, null, z2Var.k1, null, null, null, efVar.n, efVar.r, null, efVar.x, null, x20Var, z10, i10, false, efVar.a, null, 0L, j10, 0L, null);
        }
        z2Var.i0(j10 <= 0);
    }

    @Override // org.telegram.ui.Components.s40
    public final /* synthetic */ boolean z() {
        return false;
    }
}
