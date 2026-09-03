package org.telegram.ui;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class v30 extends f2.v0 {
    @Override // f2.v0
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.j1 j1Var) {
        recyclerView.getClass();
        RecyclerView.R(view);
        if (d60.C3) {
            rect.set(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
        } else {
            rect.set(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        }
    }
}
