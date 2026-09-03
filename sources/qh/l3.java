package qh;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.h61;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class l3 extends h61 {
    public final /* synthetic */ t8 c3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(t8 t8Var, Context context, int i10, k3 k3Var, mh.m5 m5Var, oh.b bVar) {
        super(context, i10, 0, false, k3Var, m5Var, null, bVar, -1, 0);
        this.c3 = t8Var;
    }

    @Override // org.telegram.ui.Components.h61
    public final void G1() {
        AndroidUtilities.forEachViews((RecyclerView) this.c3.b, (h5.d) new ng.i(this, 5));
    }

    @Override // org.telegram.ui.Components.sl0
    public final Integer V0(int i10) {
        return 0;
    }
}
