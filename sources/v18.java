// default package

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class v18 implements t22 {
    public final /* synthetic */ y28 a;

    public v18(y28 y28Var) {
        this.a = y28Var;
    }

    @Override // t22
    public final void k(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z, int i, long j, boolean z2, long j2) {
        j5 accountInstance;
        y28 y28Var = this.a;
        TL_stories.StoryItem storyItem = y28Var.E1.a;
        if (storyItem == null || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        accountInstance = y28Var.getAccountInstance();
        z3a.U(i, y28Var.r1, 0L, j2, 0L, accountInstance, null, null, null, null, null, null, null, null, str, null, arrayList, arrayList, null, null, null, null, storyItem, z, false);
        y28Var.a0(j2 <= 0);
    }

    @Override // t22
    public final void z() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            intent.setType("*/*");
            d dVar = this.a.z0.f;
            if (dVar.getParentActivity() == null) {
                return;
            }
            dVar.getParentActivity().startActivityForResult(intent, 21);
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // t22
    public final void S() {
    }

    @Override // t22
    public final void m(ArrayList arrayList, boolean z, int i, long j) {
    }
}
