package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class sp0 {
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
    public final /* synthetic */ tp0 r;
    public final Paint a = new Paint(1);
    public final Paint b = new Paint(1);
    public final Paint c = new Paint(1);
    public final Path d = new Path();
    public final Path e = new Path();
    public final RectF p = new RectF();
    public final RectF q = new RectF();

    public sp0(tp0 tp0Var) {
        this.r = tp0Var;
        this.l = new org.telegram.ui.Components.zc(tp0Var);
        this.n = new org.telegram.ui.Components.e6(tp0Var, 0L, 320L, org.telegram.ui.Components.tr.h);
    }

    public final void a(MessagesController.PeerColor peerColor) {
        tp0 tp0Var = this.r;
        org.telegram.ui.ActionBar.d6 d6Var = tp0Var.a;
        if (peerColor == null) {
            return;
        }
        boolean q6 = d6Var == null ? org.telegram.ui.ActionBar.i6.I.q() : d6Var.a();
        int i10 = tp0Var.c;
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
