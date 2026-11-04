package org.telegram.ui;

import android.graphics.RectF;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tl implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Cells.q1 b;
    public final /* synthetic */ RectF c;

    public /* synthetic */ tl(org.telegram.ui.Cells.q1 q1Var, RectF rectF, int i3) {
        this.a = i3;
        this.b = q1Var;
        this.c = rectF;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.i3(new tl(this.b, this.c, 1), 400L);
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
