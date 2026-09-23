package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class qp0 {
    public boolean f;
    public boolean g;
    public boolean h;
    public Path i;
    public Paint j;
    public Drawable k;
    public final org.telegram.ui.Components.yc l;
    public boolean m;
    public final org.telegram.ui.Components.e6 n;
    public int o;
    public final /* synthetic */ rp0 r;
    public final Paint a = new Paint(1);
    public final Paint b = new Paint(1);
    public final Paint c = new Paint(1);
    public final Path d = new Path();
    public final Path e = new Path();
    public final RectF p = new RectF();
    public final RectF q = new RectF();

    public qp0(rp0 rp0Var) {
        this.r = rp0Var;
        this.l = new org.telegram.ui.Components.yc(rp0Var);
        this.n = new org.telegram.ui.Components.e6(rp0Var, 0L, 320L, org.telegram.ui.Components.rr.h);
    }

    public final void a(MessagesController.PeerColor peerColor) {
        rp0 rp0Var = this.r;
        org.telegram.ui.ActionBar.d6 d6Var = rp0Var.a;
        if (peerColor == null) {
            return;
        }
        boolean q6 = d6Var == null ? org.telegram.ui.ActionBar.h6.I.q() : d6Var.a();
        int i10 = rp0Var.c;
        Paint paint = this.b;
        Paint paint2 = this.a;
        if (i10 != 1) {
            paint2.setColor(peerColor.getColor(0, d6Var));
            paint.setColor(peerColor.hasColor6(q6) ? peerColor.getColor(1, d6Var) : peerColor.getColor(0, d6Var));
            this.f = peerColor.hasColor6(q6);
            this.g = false;
            return;
        }
        if (q6 && peerColor.hasColor2() && !peerColor.hasColor3()) {
            paint2.setColor(peerColor.getColor(1, d6Var));
            paint.setColor(peerColor.getColor(0, d6Var));
        } else {
            paint2.setColor(peerColor.getColor(0, d6Var));
            paint.setColor(peerColor.getColor(1, d6Var));
        }
        this.c.setColor(peerColor.getColor(2, d6Var));
        this.f = peerColor.hasColor2(q6);
        this.g = peerColor.hasColor3(q6);
    }
}
