package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zs implements ah.n {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.ml0 b;

    public /* synthetic */ zs(org.telegram.ui.Components.ml0 ml0Var, int i10) {
        this.a = i10;
        this.b = ml0Var;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // ah.n
    public final boolean a(Canvas canvas, View view, long j3) {
        switch (this.a) {
        }
        return this.b.drawChild(canvas, view, j3);
    }
}
