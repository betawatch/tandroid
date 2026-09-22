package qg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import ci.c6;
import ci.c7;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.ia;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.xl0;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class b1 extends xl0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ ia d;
    public final /* synthetic */ c7 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ c6 h;

    public b1(c6 c6Var, Context context, ia iaVar, c7 c7Var, boolean z10) {
        this.h = c6Var;
        this.c = context;
        this.d = iaVar;
        this.e = c7Var;
        this.f = z10;
    }

    @Override // org.telegram.ui.Components.xl0
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
        c6 c6Var = this.h;
        ArrayList arrayList = c6Var.s0;
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
        MessageObject.GroupedMessages groupedMessages = c6Var.t0;
        if (groupedMessages == null || (position = groupedMessages.getPosition(messageObject)) == null) {
            z10 = false;
        } else {
            z10 = position.minY != 0;
        }
        MessageObject.GroupedMessages groupedMessages2 = c6Var.t0;
        u1Var.X3(messageObject, groupedMessages2, groupedMessages2 != null, z10, false, false);
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        com.google.firebase.messaging.n nVar = this.h.D0;
        Context context = this.c;
        if (i10 == 1) {
            return new il0(new z0(this, context, nVar));
        }
        a1 a1Var = new a1(this, context, UserConfig.selectedAccount, nVar);
        a1Var.N7 = true;
        return new il0(a1Var);
    }
}
