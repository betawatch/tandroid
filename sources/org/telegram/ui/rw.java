package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
