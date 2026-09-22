package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xs implements ah.m {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.ll0 b;

    public /* synthetic */ xs(org.telegram.ui.Components.ll0 ll0Var, int i10) {
        this.a = i10;
        this.b = ll0Var;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // ah.m
    public final boolean a(Canvas canvas, View view, long j3) {
        switch (this.a) {
        }
        return this.b.drawChild(canvas, view, j3);
    }
}
