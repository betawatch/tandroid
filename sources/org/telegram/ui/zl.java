package org.telegram.ui;

import android.graphics.RectF;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zl implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Cells.q1 b;
    public final /* synthetic */ RectF c;

    public /* synthetic */ zl(org.telegram.ui.Cells.q1 q1Var, RectF rectF, int i7) {
        this.a = i7;
        this.b = q1Var;
        this.c = rectF;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.i3(new zl(this.b, this.c, 1), 400L);
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
