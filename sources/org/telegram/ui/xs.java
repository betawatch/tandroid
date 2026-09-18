package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class xs implements ah.n {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.wl0 b;

    public /* synthetic */ xs(org.telegram.ui.Components.wl0 wl0Var, int i10) {
        this.a = i10;
        this.b = wl0Var;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // ah.n
    public final boolean a(Canvas canvas, View view, long j3) {
        switch (this.a) {
        }
        return this.b.drawChild(canvas, view, j3);
    }
}
