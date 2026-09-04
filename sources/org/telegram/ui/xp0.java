package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class xp0 {
    public boolean f;
    public boolean g;
    public boolean h;
    public Path i;
    public Paint j;
    public Drawable k;
    public final org.telegram.ui.Components.zc l;
    public boolean m;
    public final org.telegram.ui.Components.e6 n;
    public int o;
    public final /* synthetic */ yp0 r;
    public final Paint a = new Paint(1);
    public final Paint b = new Paint(1);
    public final Paint c = new Paint(1);
    public final Path d = new Path();
    public final Path e = new Path();
    public final RectF p = new RectF();
    public final RectF q = new RectF();

    public xp0(yp0 yp0Var) {
        this.r = yp0Var;
        this.l = new org.telegram.ui.Components.zc(yp0Var);
        this.n = new org.telegram.ui.Components.e6(yp0Var, 0L, 320L, org.telegram.ui.Components.pr.h);
    }

    public final void a(MessagesController.PeerColor peerColor) {
        yp0 yp0Var = this.r;
        org.telegram.ui.ActionBar.f6 f6Var = yp0Var.a;
        if (peerColor == null) {
            return;
        }
        boolean q6 = f6Var == null ? org.telegram.ui.ActionBar.j6.I.q() : f6Var.a();
        int i10 = yp0Var.c;
        Paint paint = this.b;
        Paint paint2 = this.a;
        if (i10 != 1) {
            paint2.setColor(peerColor.getColor(0, f6Var));
            paint.setColor(peerColor.hasColor6(q6) ? peerColor.getColor(1, f6Var) : peerColor.getColor(0, f6Var));
            this.f = peerColor.hasColor6(q6);
            this.g = false;
            return;
        }
        if (q6 && peerColor.hasColor2() && !peerColor.hasColor3()) {
            paint2.setColor(peerColor.getColor(1, f6Var));
            paint.setColor(peerColor.getColor(0, f6Var));
        } else {
            paint2.setColor(peerColor.getColor(0, f6Var));
            paint.setColor(peerColor.getColor(1, f6Var));
        }
        this.c.setColor(peerColor.getColor(2, f6Var));
        this.f = peerColor.hasColor2(q6);
        this.g = peerColor.hasColor3(q6);
    }
}
