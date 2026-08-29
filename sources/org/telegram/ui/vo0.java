package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class vo0 {
    public boolean f;
    public boolean g;
    public boolean h;
    public Path i;
    public Paint j;
    public Drawable k;
    public final org.telegram.ui.Components.uc l;
    public boolean m;
    public final org.telegram.ui.Components.d6 n;
    public int o;
    public final /* synthetic */ wo0 r;
    public final Paint a = new Paint(1);
    public final Paint b = new Paint(1);
    public final Paint c = new Paint(1);
    public final Path d = new Path();
    public final Path e = new Path();
    public final RectF p = new RectF();
    public final RectF q = new RectF();

    public vo0(wo0 wo0Var) {
        this.r = wo0Var;
        this.l = new org.telegram.ui.Components.uc(wo0Var);
        this.n = new org.telegram.ui.Components.d6(wo0Var, 0L, 320L, org.telegram.ui.Components.jr.h);
    }

    public final void a(MessagesController.PeerColor peerColor) {
        wo0 wo0Var = this.r;
        org.telegram.ui.ActionBar.c6 c6Var = wo0Var.a;
        if (peerColor == null) {
            return;
        }
        boolean q6 = c6Var == null ? org.telegram.ui.ActionBar.g6.I.q() : c6Var.a();
        int i10 = wo0Var.c;
        Paint paint = this.b;
        Paint paint2 = this.a;
        if (i10 != 1) {
            paint2.setColor(peerColor.getColor(0, c6Var));
            paint.setColor(peerColor.hasColor6(q6) ? peerColor.getColor(1, c6Var) : peerColor.getColor(0, c6Var));
            this.f = peerColor.hasColor6(q6);
            this.g = false;
            return;
        }
        if (q6 && peerColor.hasColor2() && !peerColor.hasColor3()) {
            paint2.setColor(peerColor.getColor(1, c6Var));
            paint.setColor(peerColor.getColor(0, c6Var));
        } else {
            paint2.setColor(peerColor.getColor(0, c6Var));
            paint.setColor(peerColor.getColor(1, c6Var));
        }
        this.c.setColor(peerColor.getColor(2, c6Var));
        this.f = peerColor.hasColor2(q6);
        this.g = peerColor.hasColor3(q6);
    }
}
