// default package

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class p58 implements yq5 {
    public final /* synthetic */ o68 a;

    public p58(o68 o68Var) {
        this.a = o68Var;
    }

    @Override // yq5
    public final void G(no6 no6Var, oec oecVar, boolean z, int i, boolean z2, long j) {
        k5 accountInstance;
        k5 accountInstance2;
        k5 accountInstance3;
        o68 o68Var = this.a;
        TL_stories.StoryItem storyItem = o68Var.y1.a;
        if (storyItem == null || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        storyItem.dialogId = o68Var.l1;
        if (no6Var.b) {
            accountInstance3 = o68Var.getAccountInstance();
            String str = no6Var.I;
            r7a.a0(no6Var.x, i, o68Var.l1, 0L, j, 0L, accountInstance3, null, null, null, null, null, null, oecVar, no6Var.a, str, null, no6Var.n, null, storyItem, z, false, no6Var.M);
        } else if (no6Var.h != null) {
            accountInstance2 = o68Var.getAccountInstance();
            r7a.Y(accountInstance2, no6Var.h, no6Var.c, null, o68Var.l1, null, null, null, no6Var.n, no6Var.r, null, no6Var.x, null, oecVar, z, i, false, no6Var.a, null, 0L, j, 0L, null);
        } else if (no6Var.I != null) {
            accountInstance = o68Var.getAccountInstance();
            r7a.Y(accountInstance, no6Var.I, no6Var.c, null, o68Var.l1, null, null, null, no6Var.n, no6Var.r, null, no6Var.x, null, oecVar, z, i, false, no6Var.a, null, 0L, j, 0L, null);
        }
        o68Var.a0(j <= 0);
    }

    @Override // yq5
    public final int getClassGuid() {
        return this.a.j2;
    }

    @Override // yq5
    public final View getFragmentView() {
        return this.a;
    }

    @Override // yq5
    public final Activity getParentActivity() {
        return hl.W(this.a.getContext());
    }

    @Override // yq5
    public final boolean y() {
        return false;
    }
}
