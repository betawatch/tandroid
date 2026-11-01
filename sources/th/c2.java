package th;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.ff;
import org.telegram.messenger.rz;
import org.telegram.messenger.y20;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.s40;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class c2 implements s40 {
    public final /* synthetic */ z2 a;

    public c2(z2 z2Var) {
        this.a = z2Var;
    }

    @Override // org.telegram.ui.Components.s40
    public final /* synthetic */ boolean A() {
        return false;
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
    public final void u(ff ffVar, y20 y20Var, boolean z10, int i10, int i11, boolean z11, long j10) {
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
        if (ffVar.b) {
            if (y20Var != null) {
                accountInstance4 = z2Var.getAccountInstance();
                String str = ffVar.I;
                rz.b0(ffVar.x, i10, i11, z2Var.k1, 0L, j10, 0L, ffVar.a, str, null, ffVar.n, accountInstance4, null, null, null, null, null, y20Var, null, storyItem, null, z10, false, ffVar.M);
            } else {
                accountInstance3 = z2Var.getAccountInstance();
                String str2 = ffVar.I;
                rz.b0(ffVar.x, i10, i11, z2Var.k1, 0L, j10, 0L, ffVar.a, str2, null, ffVar.n, accountInstance3, null, null, null, null, null, null, null, storyItem, null, z10, false, ffVar.M);
            }
        } else if (ffVar.h != null) {
            accountInstance2 = z2Var.getAccountInstance();
            rz.Z(accountInstance2, ffVar.h, ffVar.c, null, z2Var.k1, null, null, null, ffVar.n, ffVar.r, null, ffVar.x, null, y20Var, z10, i10, false, ffVar.a, null, 0L, j10, 0L, null);
        } else if (ffVar.I != null) {
            accountInstance = z2Var.getAccountInstance();
            rz.Z(accountInstance, ffVar.I, ffVar.c, null, z2Var.k1, null, null, null, ffVar.n, ffVar.r, null, ffVar.x, null, y20Var, z10, i10, false, ffVar.a, null, 0L, j10, 0L, null);
        }
        z2Var.i0(j10 <= 0);
    }
}
