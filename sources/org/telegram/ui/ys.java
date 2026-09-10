package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class ys implements zg.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.vl0 b;

    public /* synthetic */ ys(org.telegram.ui.Components.vl0 vl0Var, int i10) {
        this.a = i10;
        this.b = vl0Var;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // zg.j
    public final boolean a(Canvas canvas, View view, long j3) {
        switch (this.a) {
        }
        return this.b.drawChild(canvas, view, j3);
    }
}
