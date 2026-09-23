package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class ts implements ah.m {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.ml0 b;

    public /* synthetic */ ts(org.telegram.ui.Components.ml0 ml0Var, int i10) {
        this.a = i10;
        this.b = ml0Var;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // ah.m
    public final boolean a(Canvas canvas, View view, long j3) {
        switch (this.a) {
        }
        return this.b.drawChild(canvas, view, j3);
    }
}
