package rh;

import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.qp;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.z5;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
    public final qp o;
    public final org.telegram.ui.Components.voip.h p;

    public s(u uVar) {
        mr mrVar = mr.h;
        this.b = new z5(uVar, 0L, 320L, mrVar);
        this.c = new z5(uVar, 0L, 320L, mrVar);
        this.d = new z5(uVar, 0L, 320L, mrVar);
        this.e = new z5(uVar, 0L, 320L, mrVar);
        this.f = new c5(uVar, 320L, mrVar, 0);
        this.g = new c5(uVar, 320L, mrVar, 0);
        this.h = new z5(uVar, 0L, 320L, mrVar);
        this.i = new z5(uVar, 0L, 320L, mrVar);
        this.j = new rc(uVar);
        this.k = new Paint(1);
        j6 j6Var = new j6(true, false, true, false);
        this.l = j6Var;
        org.telegram.ui.Cells.z Y = org.telegram.ui.ActionBar.j6.Y(0, 9, 9);
        this.n = Y;
        qp qpVar = new qp(-1);
        this.o = qpVar;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.p = hVar;
        j6Var.b = 17;
        j6Var.t(AndroidUtilities.dp(14.0f));
        j6Var.u(AndroidUtilities.bold());
        j6Var.G = AndroidUtilities.displaySize.x * 4;
        j6Var.n(true);
        j6Var.setCallback(uVar);
        qpVar.setCallback(uVar);
        Y.setCallback(uVar);
        hVar.l = true;
        hVar.m = 2.0f;
    }
}
