package ph;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.g61;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class m3 extends g61 {
    public final /* synthetic */ w8 c3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(w8 w8Var, Context context, int i10, l3 l3Var, lh.m5 m5Var, nh.b bVar) {
        super(context, i10, 0, false, l3Var, m5Var, null, bVar, -1, 0);
        this.c3 = w8Var;
    }

    @Override // org.telegram.ui.Components.g61
    public final void H1() {
        AndroidUtilities.forEachViews((RecyclerView) this.c3.b, (h5.d) new mg.i(this, 5));
    }

    @Override // org.telegram.ui.Components.sl0
    public final Integer W0(int i10) {
        return 0;
    }
}
