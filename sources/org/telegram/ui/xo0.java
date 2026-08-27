package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class xo0 {
    public boolean f;
    public boolean g;
    public boolean h;
    public Path i;
    public Paint j;
    public Drawable k;
    public final org.telegram.ui.Components.nc l;
    public boolean m;
    public final org.telegram.ui.Components.y5 n;
    public int o;
    public final /* synthetic */ yo0 r;
    public final Paint a = new Paint(1);
    public final Paint b = new Paint(1);
    public final Paint c = new Paint(1);
    public final Path d = new Path();
    public final Path e = new Path();
    public final RectF p = new RectF();
    public final RectF q = new RectF();

    public xo0(yo0 yo0Var) {
        this.r = yo0Var;
        this.l = new org.telegram.ui.Components.nc(yo0Var);
        this.n = new org.telegram.ui.Components.y5(yo0Var, 0L, 320L, org.telegram.ui.Components.er.h);
    }

    public final void a(MessagesController.PeerColor peerColor) {
        yo0 yo0Var = this.r;
        org.telegram.ui.ActionBar.c6 c6Var = yo0Var.a;
        if (peerColor == null) {
            return;
        }
        boolean q6 = c6Var == null ? org.telegram.ui.ActionBar.g6.I.q() : c6Var.a();
        int i10 = yo0Var.c;
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
