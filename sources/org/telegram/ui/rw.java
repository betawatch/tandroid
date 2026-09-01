package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class rw extends org.telegram.ui.Components.at {
    public final /* synthetic */ oy E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rw(ly lyVar, oy oyVar) {
        super(lyVar);
        this.E = oyVar;
    }

    @Override // f2.p1
    public final void y() {
        oy oyVar = this.E;
        if (oyVar.c.L0() == 0) {
            View m9 = oyVar.c.m(0);
            if (m9 != null) {
                m9.invalidate();
            }
            if (oyVar.v == 2) {
                oyVar.v = 1;
            }
            ww wwVar = oyVar.n;
            if (wwVar != null) {
                wwVar.b();
            }
        }
    }
}
