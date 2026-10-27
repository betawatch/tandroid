package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class zh0 extends s4.h0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ org.telegram.ui.ActionBar.u6 d;
    public final /* synthetic */ pi0 e;

    public zh0(pi0 pi0Var, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        this.e = pi0Var;
        this.c = context;
        this.d = u6Var;
    }

    @Override // s4.h0
    public final int h() {
        return this.e.M.size();
    }

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        pi0 pi0Var = this.e;
        ArrayList arrayList = pi0Var.M;
        MessageObject messageObject = (MessageObject) arrayList.get((h() - 1) - i10);
        org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) e1Var.a;
        MessageObject.GroupedMessages k10 = pi0Var.k(messageObject);
        int i11 = 0;
        s1Var.setInvalidatesParent(k10 != null);
        s1Var.Z3(messageObject, k10, false, false, false, false);
        if (!pi0Var.O.i() && arrayList.size() >= 10) {
            i11 = arrayList.size() % 10;
        }
        if (i10 != i11 || messageObject.needDrawForwarded()) {
            return;
        }
        pi0Var.P = s1Var;
        Point point = AndroidUtilities.displaySize;
        s1Var.b4(point.x, point.y);
        pi0Var.Q = messageObject.getId();
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        pi0 pi0Var = this.e;
        oi0 oi0Var = new oi0(pi0Var, this.c, pi0Var.c, this.d);
        oi0Var.setDelegate(new qb.a(16));
        return new org.telegram.ui.Components.wl0(oi0Var);
    }
}
