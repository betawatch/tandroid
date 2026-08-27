package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class xh0 extends f2.q0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ org.telegram.ui.ActionBar.c6 d;
    public final /* synthetic */ ni0 e;

    public xh0(ni0 ni0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        this.e = ni0Var;
        this.c = context;
        this.d = c6Var;
    }

    @Override // f2.q0
    public final int h() {
        return this.e.J.size();
    }

    @Override // f2.q0
    public final void v(f2.o1 o1Var, int i10) {
        ni0 ni0Var = this.e;
        ArrayList arrayList = ni0Var.J;
        MessageObject messageObject = (MessageObject) arrayList.get((h() - 1) - i10);
        org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) o1Var.a;
        MessageObject.GroupedMessages l10 = ni0Var.l(messageObject);
        int i11 = 0;
        s1Var.setInvalidatesParent(l10 != null);
        s1Var.W3(messageObject, l10, false, false, false, false);
        if (!ni0Var.L.i() && arrayList.size() >= 10) {
            i11 = arrayList.size() % 10;
        }
        if (i10 != i11 || messageObject.needDrawForwarded()) {
            return;
        }
        ni0Var.M = s1Var;
        Point point = AndroidUtilities.displaySize;
        s1Var.Y3(point.x, point.y);
        ni0Var.N = messageObject.getId();
    }

    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        ni0 ni0Var = this.e;
        mi0 mi0Var = new mi0(ni0Var, this.c, ni0Var.c, this.d);
        mi0Var.setDelegate(new ab.a(19));
        return new org.telegram.ui.Components.lk0(mi0Var);
    }
}
