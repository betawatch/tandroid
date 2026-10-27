package org.telegram.ui;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class w20 extends s4.n0 {
    public final /* synthetic */ x50 a;

    public w20(x50 x50Var) {
        this.a = x50Var;
    }

    @Override // s4.n0
    public final void d(Rect rect, View view, RecyclerView recyclerView, s4.b1 b1Var) {
        int R = RecyclerView.R(view);
        if (R >= 0) {
            rect.setEmpty();
            r50 r50Var = this.a.P;
            int i10 = r50Var.G;
            if (R < i10 || R >= r50Var.H) {
                return;
            }
            int i11 = R - i10;
            int i12 = x50.F3 ? 6 : 2;
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
