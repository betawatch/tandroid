package sg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import fi.n6;
import fi.q5;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.la;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.wl0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class a1 extends mm0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ la d;
    public final /* synthetic */ n6 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ q5 h;

    public a1(q5 q5Var, Context context, la laVar, n6 n6Var, boolean z10) {
        this.h = q5Var;
        this.c = context;
        this.d = laVar;
        this.e = n6Var;
        this.f = z10;
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean D(s4.e1 e1Var) {
        return true;
    }

    @Override // s4.h0
    public final int h() {
        return this.h.s0.size();
    }

    @Override // s4.h0
    public final int j(int i10) {
        return ((MessageObject) this.h.s0.get((r0.size() - 1) - i10)).contentType;
    }

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        boolean z10;
        MessageObject.GroupedMessagePosition position;
        q5 q5Var = this.h;
        ArrayList arrayList = q5Var.s0;
        MessageObject messageObject = (MessageObject) arrayList.get((arrayList.size() - 1) - i10);
        View view = e1Var.a;
        if (!(view instanceof org.telegram.ui.Cells.s1)) {
            if (view instanceof org.telegram.ui.Cells.v0) {
                ((org.telegram.ui.Cells.v0) view).setMessageObject(messageObject);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
        MessageObject.GroupedMessages groupedMessages = q5Var.t0;
        if (groupedMessages == null || (position = groupedMessages.getPosition(messageObject)) == null) {
            z10 = false;
        } else {
            z10 = position.minY != 0;
        }
        MessageObject.GroupedMessages groupedMessages2 = q5Var.t0;
        s1Var.Z3(messageObject, groupedMessages2, groupedMessages2 != null, z10, false, false);
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        e1 e1Var = this.h.D0;
        Context context = this.c;
        if (i10 == 1) {
            return new wl0(new y0(this, context, e1Var));
        }
        z0 z0Var = new z0(this, context, UserConfig.selectedAccount, e1Var);
        z0Var.N7 = true;
        return new wl0(z0Var);
    }
}
