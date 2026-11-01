package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z5 implements org.telegram.ui.Components.ku0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;

    public /* synthetic */ z5(int i10, FrameLayout frameLayout) {
        this.a = i10;
        this.b = frameLayout;
    }

    @Override // org.telegram.ui.Components.ku0
    public final void a(Canvas canvas, RectF rectF, RecyclerView recyclerView) {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.uk0 uk0Var = (org.telegram.ui.Components.uk0) recyclerView;
                yg.d.a(uk0Var, canvas, rectF, uk0Var, this.b);
                break;
            default:
                org.telegram.ui.Components.uk0 uk0Var2 = (org.telegram.ui.Components.uk0) recyclerView;
                yg.d.a(uk0Var2, canvas, rectF, uk0Var2, this.b);
                break;
        }
    }
}
