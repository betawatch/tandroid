package org.telegram.ui;

import android.graphics.RectF;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class yl implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Cells.q1 b;
    public final /* synthetic */ RectF c;

    public /* synthetic */ yl(org.telegram.ui.Cells.q1 q1Var, RectF rectF, int i7) {
        this.a = i7;
        this.b = q1Var;
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
                org.telegram.ui.Cells.q1 q1Var = this.b;
                if (q1Var.getScrimBlockBounds() == rectF) {
                    q1Var.setScrimBlockBounds(null);
                    break;
                }
                break;
        }
    }
}
