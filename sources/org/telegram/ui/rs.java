package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rs implements ah.m {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.yl0 b;

    public /* synthetic */ rs(org.telegram.ui.Components.yl0 yl0Var, int i10) {
        this.a = i10;
        this.b = yl0Var;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // ah.m
    public final boolean a(Canvas canvas, View view, long j3) {
        switch (this.a) {
        }
        return this.b.drawChild(canvas, view, j3);
    }
}
