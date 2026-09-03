package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class us implements og.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.sl0 b;

    public /* synthetic */ us(org.telegram.ui.Components.sl0 sl0Var, int i10) {
        this.a = i10;
        this.b = sl0Var;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // og.j
    public final boolean a(Canvas canvas, View view, long j10) {
        switch (this.a) {
        }
        return this.b.drawChild(canvas, view, j10);
    }
}
