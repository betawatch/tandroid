package pg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import bi.b7;
import bi.d8;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.ia;
import org.telegram.ui.Components.ul0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class a1 extends ul0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ ia d;
    public final /* synthetic */ d8 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ b7 h;

    public a1(b7 b7Var, Context context, ia iaVar, d8 d8Var, boolean z10) {
        this.h = b7Var;
        this.c = context;
        this.d = iaVar;
        this.e = d8Var;
        this.f = z10;
    }

    @Override // org.telegram.ui.Components.ul0
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
        b7 b7Var = this.h;
        ArrayList arrayList = b7Var.s0;
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
        MessageObject.GroupedMessages groupedMessages = b7Var.t0;
        if (groupedMessages == null || (position = groupedMessages.getPosition(messageObject)) == null) {
            z10 = false;
        } else {
            z10 = position.minY != 0;
        }
        MessageObject.GroupedMessages groupedMessages2 = b7Var.t0;
        t1Var.X3(messageObject, groupedMessages2, groupedMessages2 != null, z10, false, false);
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        com.google.firebase.messaging.n nVar = this.h.D0;
        Context context = this.c;
        if (i10 == 1) {
            return new fl0(new y0(this, context, nVar));
        }
        z0 z0Var = new z0(this, context, UserConfig.selectedAccount, nVar);
        z0Var.N7 = true;
        return new fl0(z0Var);
    }
}
