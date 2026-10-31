package th;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.f8;
import org.telegram.messenger.qz;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.nj;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class y1 implements nj {
    public final /* synthetic */ z2 a;

    public y1(z2 z2Var) {
        this.a = z2Var;
    }

    @Override // org.telegram.ui.Components.nj
    public final void A() {
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
    public final void m(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j10, boolean z11, long j11) {
        org.telegram.messenger.c accountInstance;
        z2 z2Var = this.a;
        TL_stories.StoryItem storyItem = z2Var.x1.a;
        if (storyItem == null || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        accountInstance = z2Var.getAccountInstance();
        qz.V(i10, z2Var.k1, 0L, j11, 0L, null, str, null, arrayList, arrayList, null, null, null, null, null, accountInstance, null, null, null, null, null, storyItem, null, z10, false);
        z2Var.i0(j11 <= 0);
    }

    @Override // org.telegram.ui.Components.nj
    public final /* synthetic */ void S() {
    }

    @Override // org.telegram.ui.Components.nj
    public final /* synthetic */ void o(ArrayList arrayList, boolean z10, int i10, long j10) {
    }
}
