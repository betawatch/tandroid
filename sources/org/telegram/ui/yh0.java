package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class yh0 extends s4.g0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ org.telegram.ui.ActionBar.d6 d;
    public final /* synthetic */ oi0 e;

    public yh0(oi0 oi0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        this.e = oi0Var;
        this.c = context;
        this.d = d6Var;
    }

    @Override // s4.g0
    public final int h() {
        return this.e.N.size();
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        oi0 oi0Var = this.e;
        ArrayList arrayList = oi0Var.N;
        MessageObject messageObject = (MessageObject) arrayList.get((h() - 1) - i10);
        org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) b1Var.a;
        MessageObject.GroupedMessages l4 = oi0Var.l(messageObject);
        int i11 = 0;
        u1Var.setInvalidatesParent(l4 != null);
        u1Var.X3(messageObject, l4, false, false, false, false);
        if (!oi0Var.P.i() && arrayList.size() >= 10) {
            i11 = arrayList.size() % 10;
        }
        if (i10 != i11 || messageObject.needDrawForwarded()) {
            return;
        }
        oi0Var.Q = u1Var;
        Point point = AndroidUtilities.displaySize;
        u1Var.Z3(point.x, point.y);
        oi0Var.R = messageObject.getId();
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        oi0 oi0Var = this.e;
        ni0 ni0Var = new ni0(oi0Var, this.c, oi0Var.c, this.d);
        ni0Var.setDelegate(new rb.b(17));
        return new org.telegram.ui.Components.sl0(ni0Var);
    }
}
