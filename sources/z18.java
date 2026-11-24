// default package

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class z18 implements vo5 {
    public final /* synthetic */ y28 a;

    public z18(y28 y28Var) {
        this.a = y28Var;
    }

    @Override // vo5
    public final void G(jm6 jm6Var, oac oacVar, boolean z, int i, boolean z2, long j) {
        j5 accountInstance;
        j5 accountInstance2;
        j5 accountInstance3;
        y28 y28Var = this.a;
        TL_stories.StoryItem storyItem = y28Var.E1.a;
        if (storyItem == null || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        storyItem.dialogId = y28Var.r1;
        if (jm6Var.b) {
            accountInstance3 = y28Var.getAccountInstance();
            String str = jm6Var.I;
            z3a.a0(jm6Var.x, i, y28Var.r1, 0L, j, 0L, accountInstance3, null, null, null, null, null, null, oacVar, jm6Var.a, str, null, jm6Var.n, null, storyItem, z, false, jm6Var.M);
        } else if (jm6Var.h != null) {
            accountInstance2 = y28Var.getAccountInstance();
            z3a.Y(accountInstance2, jm6Var.h, jm6Var.c, null, y28Var.r1, null, null, null, jm6Var.n, jm6Var.r, null, jm6Var.x, null, oacVar, z, i, false, jm6Var.a, null, 0L, j, 0L, null);
        } else if (jm6Var.I != null) {
            accountInstance = y28Var.getAccountInstance();
            z3a.Y(accountInstance, jm6Var.I, jm6Var.c, null, y28Var.r1, null, null, null, jm6Var.n, jm6Var.r, null, jm6Var.x, null, oacVar, z, i, false, jm6Var.a, null, 0L, j, 0L, null);
        }
        y28Var.a0(j <= 0);
    }

    @Override // vo5
    public final int getClassGuid() {
        return this.a.p2;
    }

    @Override // vo5
    public final View getFragmentView() {
        return this.a;
    }

    @Override // vo5
    public final Activity getParentActivity() {
        return gl.W(this.a.getContext());
    }

    @Override // vo5
    public final boolean y() {
        return false;
    }
}
