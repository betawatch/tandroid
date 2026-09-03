package ph;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.g61;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class m3 extends g61 {
    public final /* synthetic */ v8 c3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(v8 v8Var, Context context, int i10, l3 l3Var, lh.m5 m5Var, nh.b bVar) {
        super(context, i10, 0, false, l3Var, m5Var, null, bVar, -1, 0);
        this.c3 = v8Var;
    }

    @Override // org.telegram.ui.Components.g61
    public final void G1() {
        AndroidUtilities.forEachViews((RecyclerView) this.c3.b, (h5.d) new mg.i(this, 5));
    }

    @Override // org.telegram.ui.Components.rl0
    public final Integer V0(int i10) {
        return 0;
    }
}
