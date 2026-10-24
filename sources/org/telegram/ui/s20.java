package org.telegram.ui;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class s20 extends s4.m0 {
    public final /* synthetic */ u50 a;

    public s20(u50 u50Var) {
        this.a = u50Var;
    }

    @Override // s4.m0
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.y0 y0Var) {
        recyclerView.getClass();
        int R = RecyclerView.R(view);
        if (R >= 0) {
            rect.setEmpty();
            o50 o50Var = this.a.P;
            int i10 = o50Var.G;
            if (R < i10 || R >= o50Var.H) {
                return;
            }
            int i11 = R - i10;
            int i12 = u50.F3 ? 6 : 2;
            int i13 = i11 % i12;
            if (i13 == 0) {
                rect.right = AndroidUtilities.dp(2.0f);
            } else if (i13 == i12 - 1) {
                rect.left = AndroidUtilities.dp(2.0f);
            } else {
                rect.left = AndroidUtilities.dp(1.0f);
            }
        }
    }
}
