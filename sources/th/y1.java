package th;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.f8;
import org.telegram.messenger.rz;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.nj;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class y1 implements nj {
    public final /* synthetic */ z2 a;

    public y1(z2 z2Var) {
        this.a = z2Var;
    }

    @Override // org.telegram.ui.Components.nj
    public final void B() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            intent.setType("*/*");
            org.telegram.ui.ActionBar.k2 k2Var = this.a.s0.f;
            if (k2Var.getParentActivity() == null) {
                return;
            }
            k2Var.getParentActivity().startActivityForResult(intent, 21);
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.Components.nj
    public final void n(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j10, boolean z11, long j11) {
        org.telegram.messenger.c accountInstance;
        z2 z2Var = this.a;
        TL_stories.StoryItem storyItem = z2Var.x1.a;
        if (storyItem == null || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        accountInstance = z2Var.getAccountInstance();
        rz.V(i10, z2Var.k1, 0L, j11, 0L, null, str, null, arrayList, arrayList, null, null, null, null, null, accountInstance, null, null, null, null, null, storyItem, null, z10, false);
        z2Var.i0(j11 <= 0);
    }

    @Override // org.telegram.ui.Components.nj
    public final /* synthetic */ void T() {
    }

    @Override // org.telegram.ui.Components.nj
    public final /* synthetic */ void p(ArrayList arrayList, boolean z10, int i10, long j10) {
    }
}
