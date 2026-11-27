// default package

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class wga extends vea {
    public final /* synthetic */ eja m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wga(eja ejaVar, Context context) {
        super(context);
        this.m0 = ejaVar;
    }

    @Override // vea
    public final boolean d(r47 r47Var) {
        long playlistTopicId;
        eja ejaVar = this.m0;
        tia[] tiaVarArr = ejaVar.w1;
        if (r47.Q4(r47Var.k) || r47Var.g4()) {
            boolean V = MediaController.z().V(r47Var);
            MediaController.z().u0(V ? tiaVarArr[4].a : null, false);
            return V;
        }
        if (!r47Var.I3()) {
            return false;
        }
        MediaController z = MediaController.z();
        ArrayList arrayList = tiaVarArr[4].a;
        long j = ejaVar.f1;
        playlistTopicId = ejaVar.getPlaylistTopicId();
        return z.q0(arrayList, r47Var, j, true, null, playlistTopicId);
    }
}
