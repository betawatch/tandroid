package org.telegram.ui;

import android.graphics.RectF;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class yl implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Cells.r1 b;
    public final /* synthetic */ RectF c;

    public /* synthetic */ yl(org.telegram.ui.Cells.r1 r1Var, RectF rectF, int i7) {
        this.a = i7;
        this.b = r1Var;
        this.c = rectF;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new yl(this.b, this.c, 1), 400L);
                break;
            default:
                RectF rectF = this.c;
                org.telegram.ui.Cells.r1 r1Var = this.b;
                if (r1Var.getScrimBlockBounds() == rectF) {
                    r1Var.setScrimBlockBounds(null);
                    break;
                }
                break;
        }
    }
}
