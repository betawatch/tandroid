package qg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import ci.a7;
import ci.b6;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.ja;
import org.telegram.ui.Components.vl0;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class b1 extends vl0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ ja d;
    public final /* synthetic */ a7 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ b6 h;

    public b1(b6 b6Var, Context context, ja jaVar, a7 a7Var, boolean z10) {
        this.h = b6Var;
        this.c = context;
        this.d = jaVar;
        this.e = a7Var;
        this.f = z10;
    }

    @Override // org.telegram.ui.Components.vl0
    public final boolean D(s4.c1 c1Var) {
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
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        MessageObject.GroupedMessagePosition position;
        b6 b6Var = this.h;
        ArrayList arrayList = b6Var.s0;
        MessageObject messageObject = (MessageObject) arrayList.get((arrayList.size() - 1) - i10);
        View view = c1Var.a;
        if (!(view instanceof org.telegram.ui.Cells.u1)) {
            if (view instanceof org.telegram.ui.Cells.w0) {
                ((org.telegram.ui.Cells.w0) view).setMessageObject(messageObject);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
        MessageObject.GroupedMessages groupedMessages = b6Var.t0;
        if (groupedMessages == null || (position = groupedMessages.getPosition(messageObject)) == null) {
            z10 = false;
        } else {
            z10 = position.minY != 0;
        }
        MessageObject.GroupedMessages groupedMessages2 = b6Var.t0;
        u1Var.X3(messageObject, groupedMessages2, groupedMessages2 != null, z10, false, false);
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        com.google.firebase.messaging.n nVar = this.h.D0;
        Context context = this.c;
        if (i10 == 1) {
            return new gl0(new z0(this, context, nVar));
        }
        a1 a1Var = new a1(this, context, UserConfig.selectedAccount, nVar);
        a1Var.N7 = true;
        return new gl0(a1Var);
    }
}
