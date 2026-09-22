package qg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import ci.c6;
import ci.c7;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.ha;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.vk0;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class d1 extends kl0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ ha d;
    public final /* synthetic */ c7 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ c6 h;

    public d1(c6 c6Var, Context context, ha haVar, c7 c7Var, boolean z10) {
        this.h = c6Var;
        this.c = context;
        this.d = haVar;
        this.e = c7Var;
        this.f = z10;
    }

    @Override // org.telegram.ui.Components.kl0
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
        if (!(view instanceof org.telegram.ui.Cells.t1)) {
            if (view instanceof org.telegram.ui.Cells.w0) {
                ((org.telegram.ui.Cells.w0) view).setMessageObject(messageObject);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
        MessageObject.GroupedMessages groupedMessages = c6Var.t0;
        if (groupedMessages == null || (position = groupedMessages.getPosition(messageObject)) == null) {
            z10 = false;
        } else {
            z10 = position.minY != 0;
        }
        MessageObject.GroupedMessages groupedMessages2 = c6Var.t0;
        t1Var.X3(messageObject, groupedMessages2, groupedMessages2 != null, z10, false, false);
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        com.google.firebase.messaging.n nVar = this.h.D0;
        Context context = this.c;
        if (i10 == 1) {
            return new vk0(new b1(this, context, nVar));
        }
        c1 c1Var = new c1(this, context, UserConfig.selectedAccount, nVar);
        c1Var.N7 = true;
        return new vk0(c1Var);
    }
}
