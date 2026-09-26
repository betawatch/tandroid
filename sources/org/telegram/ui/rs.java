package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rs implements ah.m {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.wl0 b;

    public /* synthetic */ rs(org.telegram.ui.Components.wl0 wl0Var, int i10) {
        this.a = i10;
        this.b = wl0Var;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // ah.m
    public final boolean a(Canvas canvas, View view, long j3) {
        switch (this.a) {
        }
        return this.b.drawChild(canvas, view, j3);
    }
}
