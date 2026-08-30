package rh;

import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.rp;
import org.telegram.ui.Components.z5;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class t {
    public final RectF a = new RectF();
    public final z5 b;
    public final z5 c;
    public final z5 d;
    public final z5 e;
    public final c5 f;
    public final c5 g;
    public final z5 h;
    public final z5 i;
    public final rc j;
    public final Paint k;
    public final j6 l;
    public int m;
    public final org.telegram.ui.Cells.z n;
    public final rp o;
    public final org.telegram.ui.Components.voip.h p;

    public t(v vVar) {
        nr nrVar = nr.h;
        this.b = new z5(vVar, 0L, 320L, nrVar);
        this.c = new z5(vVar, 0L, 320L, nrVar);
        this.d = new z5(vVar, 0L, 320L, nrVar);
        this.e = new z5(vVar, 0L, 320L, nrVar);
        this.f = new c5(vVar, 320L, nrVar, 0);
        this.g = new c5(vVar, 320L, nrVar, 0);
        this.h = new z5(vVar, 0L, 320L, nrVar);
        this.i = new z5(vVar, 0L, 320L, nrVar);
        this.j = new rc(vVar);
        this.k = new Paint(1);
        j6 j6Var = new j6(true, false, true, false);
        this.l = j6Var;
        org.telegram.ui.Cells.z Y = org.telegram.ui.ActionBar.j6.Y(0, 9, 9);
        this.n = Y;
        rp rpVar = new rp(-1);
        this.o = rpVar;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.p = hVar;
        j6Var.b = 17;
        j6Var.t(AndroidUtilities.dp(14.0f));
        j6Var.u(AndroidUtilities.bold());
        j6Var.G = AndroidUtilities.displaySize.x * 4;
        j6Var.n(true);
        j6Var.setCallback(vVar);
        rpVar.setCallback(vVar);
        Y.setCallback(vVar);
        hVar.l = true;
        hVar.m = 2.0f;
    }
}
