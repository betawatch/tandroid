package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xs implements ah.n {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.wl0 b;

    public /* synthetic */ xs(org.telegram.ui.Components.wl0 wl0Var, int i10) {
        this.a = i10;
        this.b = wl0Var;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // ah.n
    public final boolean a(Canvas canvas, View view, long j3) {
        switch (this.a) {
        }
        return this.b.drawChild(canvas, view, j3);
    }
}
