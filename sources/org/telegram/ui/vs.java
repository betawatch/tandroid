package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vs implements ng.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.rl0 b;

    public /* synthetic */ vs(org.telegram.ui.Components.rl0 rl0Var, int i10) {
        this.a = i10;
        this.b = rl0Var;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // ng.j
    public final boolean a(Canvas canvas, View view, long j10) {
        switch (this.a) {
        }
        return this.b.drawChild(canvas, view, j10);
    }
}
