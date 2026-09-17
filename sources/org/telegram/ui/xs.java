package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
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
