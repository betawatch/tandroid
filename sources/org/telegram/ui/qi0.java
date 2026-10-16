package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class qi0 extends s4.g0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ org.telegram.ui.ActionBar.c6 d;
    public final /* synthetic */ gj0 e;

    public qi0(gj0 gj0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        this.e = gj0Var;
        this.c = context;
        this.d = c6Var;
    }

    @Override // s4.g0
    public final int h() {
        return this.e.N.size();
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        gj0 gj0Var = this.e;
        ArrayList arrayList = gj0Var.N;
        MessageObject messageObject = (MessageObject) arrayList.get((h() - 1) - i10);
        org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) b1Var.a;
        MessageObject.GroupedMessages l4 = gj0Var.l(messageObject);
        int i11 = 0;
        u1Var.setInvalidatesParent(l4 != null);
        u1Var.X3(messageObject, l4, false, false, false, false);
        if (!gj0Var.P.i() && arrayList.size() >= 10) {
            i11 = arrayList.size() % 10;
        }
        if (i10 != i11 || messageObject.needDrawForwarded()) {
            return;
        }
        gj0Var.Q = u1Var;
        Point point = AndroidUtilities.displaySize;
        u1Var.Z3(point.x, point.y);
        gj0Var.R = messageObject.getId();
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        gj0 gj0Var = this.e;
        fj0 fj0Var = new fj0(gj0Var, this.c, gj0Var.c, this.d);
        fj0Var.setDelegate(new rb.b(17));
        return new org.telegram.ui.Components.wl0(fj0Var);
    }
}
