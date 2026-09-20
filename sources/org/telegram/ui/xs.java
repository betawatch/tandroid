package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class xs implements ah.n {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.vl0 b;

    public /* synthetic */ xs(org.telegram.ui.Components.vl0 vl0Var, int i10) {
        this.a = i10;
        this.b = vl0Var;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // ah.n
    public final boolean a(Canvas canvas, View view, long j3) {
        switch (this.a) {
        }
        return this.b.drawChild(canvas, view, j3);
    }
}
