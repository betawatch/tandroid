package sh;

import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.tp;
import org.telegram.ui.Components.z5;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class s {
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
    public final tp o;
    public final org.telegram.ui.Components.voip.h p;

    public s(u uVar) {
        pr prVar = pr.h;
        this.b = new z5(uVar, 0L, 320L, prVar);
        this.c = new z5(uVar, 0L, 320L, prVar);
        this.d = new z5(uVar, 0L, 320L, prVar);
        this.e = new z5(uVar, 0L, 320L, prVar);
        this.f = new c5(uVar, 320L, prVar, 0);
        this.g = new c5(uVar, 320L, prVar, 0);
        this.h = new z5(uVar, 0L, 320L, prVar);
        this.i = new z5(uVar, 0L, 320L, prVar);
        this.j = new rc(uVar);
        this.k = new Paint(1);
        j6 j6Var = new j6(true, false, true, false);
        this.l = j6Var;
        org.telegram.ui.Cells.z Y = k6.Y(0, 9, 9);
        this.n = Y;
        tp tpVar = new tp(-1);
        this.o = tpVar;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.p = hVar;
        j6Var.b = 17;
        j6Var.t(AndroidUtilities.dp(14.0f));
        j6Var.u(AndroidUtilities.bold());
        j6Var.G = AndroidUtilities.displaySize.x * 4;
        j6Var.n(true);
        j6Var.setCallback(uVar);
        tpVar.setCallback(uVar);
        Y.setCallback(uVar);
        hVar.l = true;
        hVar.m = 2.0f;
    }
}
