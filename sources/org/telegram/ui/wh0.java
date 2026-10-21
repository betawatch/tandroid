package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class wh0 extends s4.g0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ org.telegram.ui.ActionBar.d6 d;
    public final /* synthetic */ mi0 e;

    public wh0(mi0 mi0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        this.e = mi0Var;
        this.c = context;
        this.d = d6Var;
    }

    @Override // s4.g0
    public final int h() {
        return this.e.M.size();
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        mi0 mi0Var = this.e;
        ArrayList arrayList = mi0Var.M;
        MessageObject messageObject = (MessageObject) arrayList.get((h() - 1) - i10);
        org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) b1Var.a;
        MessageObject.GroupedMessages k10 = mi0Var.k(messageObject);
        int i11 = 0;
        u1Var.setInvalidatesParent(k10 != null);
        u1Var.X3(messageObject, k10, false, false, false, false);
        if (!mi0Var.O.i() && arrayList.size() >= 10) {
            i11 = arrayList.size() % 10;
        }
        if (i10 != i11 || messageObject.needDrawForwarded()) {
            return;
        }
        mi0Var.P = u1Var;
        Point point = AndroidUtilities.displaySize;
        u1Var.Z3(point.x, point.y);
        mi0Var.Q = messageObject.getId();
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        mi0 mi0Var = this.e;
        li0 li0Var = new li0(mi0Var, this.c, mi0Var.c, this.d);
        li0Var.setDelegate(new rb.b(17));
        return new org.telegram.ui.Components.tl0(li0Var);
    }
}
