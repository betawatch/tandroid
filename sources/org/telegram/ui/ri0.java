package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class ri0 extends s4.g0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ org.telegram.ui.ActionBar.c6 d;
    public final /* synthetic */ hj0 e;

    public ri0(hj0 hj0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        this.e = hj0Var;
        this.c = context;
        this.d = c6Var;
    }

    @Override // s4.g0
    public final int h() {
        return this.e.N.size();
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        hj0 hj0Var = this.e;
        ArrayList arrayList = hj0Var.N;
        MessageObject messageObject = (MessageObject) arrayList.get((h() - 1) - i10);
        org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) b1Var.a;
        MessageObject.GroupedMessages l4 = hj0Var.l(messageObject);
        int i11 = 0;
        u1Var.setInvalidatesParent(l4 != null);
        u1Var.X3(messageObject, l4, false, false, false, false);
        if (!hj0Var.P.i() && arrayList.size() >= 10) {
            i11 = arrayList.size() % 10;
        }
        if (i10 != i11 || messageObject.needDrawForwarded()) {
            return;
        }
        hj0Var.Q = u1Var;
        Point point = AndroidUtilities.displaySize;
        u1Var.Z3(point.x, point.y);
        hj0Var.R = messageObject.getId();
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        hj0 hj0Var = this.e;
        gj0 gj0Var = new gj0(hj0Var, this.c, hj0Var.c, this.d);
        gj0Var.setDelegate(new rb.b(17));
        return new org.telegram.ui.Components.wl0(gj0Var);
    }
}
