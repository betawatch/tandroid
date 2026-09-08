package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class xs implements bh.k {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.ll0 b;

    public /* synthetic */ xs(org.telegram.ui.Components.ll0 ll0Var, int i10) {
        this.a = i10;
        this.b = ll0Var;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // bh.k
    public final boolean a(Canvas canvas, View view, long j3) {
        switch (this.a) {
        }
        return this.b.drawChild(canvas, view, j3);
    }
}
