package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class us implements og.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.tl0 b;

    public /* synthetic */ us(org.telegram.ui.Components.tl0 tl0Var, int i10) {
        this.a = i10;
        this.b = tl0Var;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // og.j
    public final boolean a(Canvas canvas, View view, long j10) {
        switch (this.a) {
        }
        return this.b.drawChild(canvas, view, j10);
    }
}
