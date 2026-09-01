package qh;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.i61;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class m3 extends i61 {
    public final /* synthetic */ u8 c3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(u8 u8Var, Context context, int i10, l3 l3Var, mh.m5 m5Var, oh.b bVar) {
        super(context, i10, 0, false, l3Var, m5Var, null, bVar, -1, 0);
        this.c3 = u8Var;
    }

    @Override // org.telegram.ui.Components.i61
    public final void H1() {
        AndroidUtilities.forEachViews((RecyclerView) this.c3.b, (h5.d) new ng.i(this, 5));
    }

    @Override // org.telegram.ui.Components.tl0
    public final Integer W0(int i10) {
        return 0;
    }
}
