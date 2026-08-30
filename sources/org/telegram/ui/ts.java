package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ts implements ng.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.sl0 b;

    public /* synthetic */ ts(org.telegram.ui.Components.sl0 sl0Var, int i10) {
        this.a = i10;
        this.b = sl0Var;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // ng.j
    public final boolean a(Canvas canvas, View view, long j10) {
        switch (this.a) {
        }
        return this.b.drawChild(canvas, view, j10);
    }
}
