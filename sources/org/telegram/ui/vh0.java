package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class vh0 extends f2.r0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ org.telegram.ui.ActionBar.b6 d;
    public final /* synthetic */ li0 e;

    public vh0(li0 li0Var, Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        this.e = li0Var;
        this.c = context;
        this.d = b6Var;
    }

    @Override // f2.r0
    public final int h() {
        return this.e.J.size();
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        li0 li0Var = this.e;
        ArrayList arrayList = li0Var.J;
        MessageObject messageObject = (MessageObject) arrayList.get((h() - 1) - i9);
        org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) q1Var.a;
        MessageObject.GroupedMessages l10 = li0Var.l(messageObject);
        int i10 = 0;
        t1Var.setInvalidatesParent(l10 != null);
        t1Var.X3(messageObject, l10, false, false, false, false);
        if (!li0Var.L.i() && arrayList.size() >= 10) {
            i10 = arrayList.size() % 10;
        }
        if (i9 != i10 || messageObject.needDrawForwarded()) {
            return;
        }
        li0Var.M = t1Var;
        Point point = AndroidUtilities.displaySize;
        t1Var.Z3(point.x, point.y);
        li0Var.N = messageObject.getId();
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        li0 li0Var = this.e;
        ki0 ki0Var = new ki0(li0Var, this.c, li0Var.c, this.d);
        ki0Var.setDelegate(new za.a(18));
        return new org.telegram.ui.Components.ik0(ki0Var);
    }
}
