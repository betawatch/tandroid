package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class yl0 {
    public boolean f;
    public boolean g;
    public boolean h;
    public Path i;
    public Paint j;
    public Drawable k;
    public final org.telegram.ui.Components.gc l;
    public boolean m;
    public final org.telegram.ui.Components.u5 n;
    public int o;
    public final /* synthetic */ zl0 r;
    public final Paint a = new Paint(1);
    public final Paint b = new Paint(1);
    public final Paint c = new Paint(1);
    public final Path d = new Path();
    public final Path e = new Path();
    public final RectF p = new RectF();
    public final RectF q = new RectF();

    public yl0(zl0 zl0Var) {
        this.r = zl0Var;
        this.l = new org.telegram.ui.Components.gc(zl0Var);
        this.n = new org.telegram.ui.Components.u5(zl0Var, 0L, 320L, org.telegram.ui.Components.xq.h);
    }

    public final void a(org.telegram.messenger.wo woVar) {
        zl0 zl0Var = this.r;
        org.telegram.ui.ActionBar.e6 e6Var = zl0Var.a;
        if (woVar == null) {
            return;
        }
        int[] iArr = woVar.g;
        int[] iArr2 = woVar.h;
        boolean q10 = e6Var == null ? org.telegram.ui.ActionBar.k6.I.q() : e6Var.a();
        int i3 = zl0Var.c;
        Paint paint = this.b;
        Paint paint2 = this.a;
        if (i3 != 1) {
            paint2.setColor(woVar.e(0, e6Var));
            paint.setColor(woVar.o(q10) ? woVar.e(1, e6Var) : woVar.e(0, e6Var));
            this.f = woVar.o(q10);
            this.g = false;
            return;
        }
        if (q10 && woVar.g() != woVar.f() && woVar.i() == woVar.f()) {
            paint2.setColor(woVar.e(1, e6Var));
            paint.setColor(woVar.e(0, e6Var));
        } else {
            paint2.setColor(woVar.e(0, e6Var));
            paint.setColor(woVar.e(1, e6Var));
        }
        this.c.setColor(woVar.e(2, e6Var));
        this.f = woVar.h(q10) != (q10 ? iArr2 : iArr)[0];
        int j10 = woVar.j(q10);
        if (q10) {
            iArr = iArr2;
        }
        this.g = j10 != iArr[0];
    }
}
