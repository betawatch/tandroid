package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class uh0 extends f2.p0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ org.telegram.ui.ActionBar.c6 d;
    public final /* synthetic */ ki0 e;

    public uh0(ki0 ki0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        this.e = ki0Var;
        this.c = context;
        this.d = c6Var;
    }

    @Override // f2.p0
    public final int h() {
        return this.e.J.size();
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        ki0 ki0Var = this.e;
        ArrayList arrayList = ki0Var.J;
        MessageObject messageObject = (MessageObject) arrayList.get((h() - 1) - i10);
        org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) n1Var.a;
        MessageObject.GroupedMessages l10 = ki0Var.l(messageObject);
        int i11 = 0;
        s1Var.setInvalidatesParent(l10 != null);
        s1Var.X3(messageObject, l10, false, false, false, false);
        if (!ki0Var.L.i() && arrayList.size() >= 10) {
            i11 = arrayList.size() % 10;
        }
        if (i10 != i11 || messageObject.needDrawForwarded()) {
            return;
        }
        ki0Var.M = s1Var;
        Point point = AndroidUtilities.displaySize;
        s1Var.Z3(point.x, point.y);
        ki0Var.N = messageObject.getId();
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        ki0 ki0Var = this.e;
        ji0 ji0Var = new ji0(ki0Var, this.c, ki0Var.c, this.d);
        ji0Var.setDelegate(new x9.d(17));
        return new org.telegram.ui.Components.vk0(ji0Var);
    }
}
