package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class v81 extends org.telegram.ui.Components.mm0 {
    public int Y2;
    public final /* synthetic */ u91 Z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v81(u91 u91Var, Context context) {
        super(context, null);
        this.Z2 = u91Var;
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        z81 z81Var;
        super.onMeasure(i10, i11);
        if (this.Y2 != getMeasuredHeight() && (z81Var = this.Z2.X) != null) {
            z81Var.l();
        }
        this.Y2 = getMeasuredHeight();
    }
}
