package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class xh0 extends s4.h0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ org.telegram.ui.ActionBar.u6 d;
    public final /* synthetic */ ni0 e;

    public xh0(ni0 ni0Var, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        this.e = ni0Var;
        this.c = context;
        this.d = u6Var;
    }

    @Override // s4.h0
    public final int h() {
        return this.e.M.size();
    }

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        ni0 ni0Var = this.e;
        ArrayList arrayList = ni0Var.M;
        MessageObject messageObject = (MessageObject) arrayList.get((h() - 1) - i10);
        org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) e1Var.a;
        MessageObject.GroupedMessages k10 = ni0Var.k(messageObject);
        int i11 = 0;
        s1Var.setInvalidatesParent(k10 != null);
        s1Var.Z3(messageObject, k10, false, false, false, false);
        if (!ni0Var.O.i() && arrayList.size() >= 10) {
            i11 = arrayList.size() % 10;
        }
        if (i10 != i11 || messageObject.needDrawForwarded()) {
            return;
        }
        ni0Var.P = s1Var;
        Point point = AndroidUtilities.displaySize;
        s1Var.b4(point.x, point.y);
        ni0Var.Q = messageObject.getId();
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        ni0 ni0Var = this.e;
        mi0 mi0Var = new mi0(ni0Var, this.c, ni0Var.c, this.d);
        mi0Var.setDelegate(new qb.a(16));
        return new org.telegram.ui.Components.vl0(mi0Var);
    }
}
