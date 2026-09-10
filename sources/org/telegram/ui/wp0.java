package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class wp0 {
    public boolean f;
    public boolean g;
    public boolean h;
    public Path i;
    public Paint j;
    public Drawable k;
    public final org.telegram.ui.Components.xc l;
    public boolean m;
    public final org.telegram.ui.Components.d6 n;
    public int o;
    public final /* synthetic */ xp0 r;
    public final Paint a = new Paint(1);
    public final Paint b = new Paint(1);
    public final Paint c = new Paint(1);
    public final Path d = new Path();
    public final Path e = new Path();
    public final RectF p = new RectF();
    public final RectF q = new RectF();

    public wp0(xp0 xp0Var) {
        this.r = xp0Var;
        this.l = new org.telegram.ui.Components.xc(xp0Var);
        this.n = new org.telegram.ui.Components.d6(xp0Var, 0L, 320L, org.telegram.ui.Components.wr.h);
    }

    public final void a(MessagesController.PeerColor peerColor) {
        xp0 xp0Var = this.r;
        org.telegram.ui.ActionBar.f6 f6Var = xp0Var.a;
        if (peerColor == null) {
            return;
        }
        boolean q6 = f6Var == null ? org.telegram.ui.ActionBar.j6.I.q() : f6Var.a();
        int i10 = xp0Var.c;
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
