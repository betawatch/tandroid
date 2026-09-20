package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class qf1 extends dg1 {
    public final /* synthetic */ fg1 i3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qf1(fg1 fg1Var, Context context) {
        super(fg1Var, context);
        this.i3 = fg1Var;
    }

    @Override // org.telegram.ui.Components.vl0
    public final boolean T0() {
        ArrayList arrayList = this.i3.b;
        return (getAdapter() == null || this.X1 || (arrayList == null || arrayList.size() != 1 || arrayList.get(0) == null || ((wf1) arrayList.get(0)).c == null || ((wf1) arrayList.get(0)).c.id != 1 ? getAdapter().h() > 1 : getAdapter().h() > 2)) ? false : true;
    }

    @Override // org.telegram.ui.dg1, org.telegram.ui.Components.vl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.i3.y0();
    }
}
