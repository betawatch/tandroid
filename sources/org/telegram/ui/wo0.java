package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class wo0 {
    public boolean f;
    public boolean g;
    public boolean h;
    public Path i;
    public Paint j;
    public Drawable k;
    public final org.telegram.ui.Components.pc l;
    public boolean m;
    public final org.telegram.ui.Components.y5 n;
    public int o;
    public final /* synthetic */ xo0 r;
    public final Paint a = new Paint(1);
    public final Paint b = new Paint(1);
    public final Paint c = new Paint(1);
    public final Path d = new Path();
    public final Path e = new Path();
    public final RectF p = new RectF();
    public final RectF q = new RectF();

    public wo0(xo0 xo0Var) {
        this.r = xo0Var;
        this.l = new org.telegram.ui.Components.pc(xo0Var);
        this.n = new org.telegram.ui.Components.y5(xo0Var, 0L, 320L, org.telegram.ui.Components.gr.h);
    }

    public final void a(MessagesController.PeerColor peerColor) {
        xo0 xo0Var = this.r;
        org.telegram.ui.ActionBar.b6 b6Var = xo0Var.a;
        if (peerColor == null) {
            return;
        }
        boolean q10 = b6Var == null ? org.telegram.ui.ActionBar.f6.I.q() : b6Var.a();
        int i9 = xo0Var.c;
        Paint paint = this.b;
        Paint paint2 = this.a;
        if (i9 != 1) {
            paint2.setColor(peerColor.getColor(0, b6Var));
            paint.setColor(peerColor.hasColor6(q10) ? peerColor.getColor(1, b6Var) : peerColor.getColor(0, b6Var));
            this.f = peerColor.hasColor6(q10);
            this.g = false;
            return;
        }
        if (q10 && peerColor.hasColor2() && !peerColor.hasColor3()) {
            paint2.setColor(peerColor.getColor(1, b6Var));
            paint.setColor(peerColor.getColor(0, b6Var));
        } else {
            paint2.setColor(peerColor.getColor(0, b6Var));
            paint.setColor(peerColor.getColor(1, b6Var));
        }
        this.c.setColor(peerColor.getColor(2, b6Var));
        this.f = peerColor.hasColor2(q10);
        this.g = peerColor.hasColor3(q10);
    }
}
