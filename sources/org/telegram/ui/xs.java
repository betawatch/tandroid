package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class xs implements ah.n {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.yl0 b;

    public /* synthetic */ xs(org.telegram.ui.Components.yl0 yl0Var, int i10) {
        this.a = i10;
        this.b = yl0Var;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // ah.n
    public final boolean a(Canvas canvas, View view, long j3) {
        switch (this.a) {
        }
        return this.b.drawChild(canvas, view, j3);
    }
}
