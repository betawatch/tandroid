package ph;

import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.uc;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class s {
    public final RectF a = new RectF();
    public final d6 b;
    public final d6 c;
    public final d6 d;
    public final d6 e;
    public final f5 f;
    public final f5 g;
    public final d6 h;
    public final d6 i;
    public final uc j;
    public final Paint k;
    public final n6 l;
    public int m;
    public final org.telegram.ui.Cells.z n;
    public final np o;
    public final org.telegram.ui.Components.voip.h p;

    public s(u uVar) {
        jr jrVar = jr.h;
        this.b = new d6(uVar, 0L, 320L, jrVar);
        this.c = new d6(uVar, 0L, 320L, jrVar);
        this.d = new d6(uVar, 0L, 320L, jrVar);
        this.e = new d6(uVar, 0L, 320L, jrVar);
        this.f = new f5(uVar, 320L, jrVar, 0);
        this.g = new f5(uVar, 320L, jrVar, 0);
        this.h = new d6(uVar, 0L, 320L, jrVar);
        this.i = new d6(uVar, 0L, 320L, jrVar);
        this.j = new uc(uVar);
        this.k = new Paint(1);
        n6 n6Var = new n6(true, false, true, false);
        this.l = n6Var;
        org.telegram.ui.Cells.z Y = g6.Y(0, 9, 9);
        this.n = Y;
        np npVar = new np(-1);
        this.o = npVar;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.p = hVar;
        n6Var.b = 17;
        n6Var.t(AndroidUtilities.dp(14.0f));
        n6Var.u(AndroidUtilities.bold());
        n6Var.G = AndroidUtilities.displaySize.x * 4;
        n6Var.n(true);
        n6Var.setCallback(uVar);
        npVar.setCallback(uVar);
        Y.setCallback(uVar);
        hVar.l = true;
        hVar.m = 2.0f;
    }
}
