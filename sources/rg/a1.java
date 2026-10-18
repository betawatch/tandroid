package rg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import ei.q6;
import ei.r5;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.ja;
import org.telegram.ui.Components.sl0;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class a1 extends hm0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ ja d;
    public final /* synthetic */ q6 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ r5 h;

    public a1(r5 r5Var, Context context, ja jaVar, q6 q6Var, boolean z10) {
        this.h = r5Var;
        this.c = context;
        this.d = jaVar;
        this.e = q6Var;
        this.f = z10;
    }

    @Override // org.telegram.ui.Components.hm0
    public final boolean D(s4.b1 b1Var) {
        return true;
    }

    @Override // s4.g0
    public final int h() {
        return this.h.s0.size();
    }

    @Override // s4.g0
    public final int j(int i10) {
        return ((MessageObject) this.h.s0.get((r0.size() - 1) - i10)).contentType;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        boolean z10;
        MessageObject.GroupedMessagePosition position;
        r5 r5Var = this.h;
        ArrayList arrayList = r5Var.s0;
        MessageObject messageObject = (MessageObject) arrayList.get((arrayList.size() - 1) - i10);
        View view = b1Var.a;
        if (!(view instanceof org.telegram.ui.Cells.u1)) {
            if (view instanceof org.telegram.ui.Cells.w0) {
                ((org.telegram.ui.Cells.w0) view).setMessageObject(messageObject);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
        MessageObject.GroupedMessages groupedMessages = r5Var.t0;
        if (groupedMessages == null || (position = groupedMessages.getPosition(messageObject)) == null) {
            z10 = false;
        } else {
            z10 = position.minY != 0;
        }
        MessageObject.GroupedMessages groupedMessages2 = r5Var.t0;
        u1Var.X3(messageObject, groupedMessages2, groupedMessages2 != null, z10, false, false);
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        com.google.firebase.messaging.l lVar = this.h.D0;
        Context context = this.c;
        if (i10 == 1) {
            return new sl0(new y0(this, context, lVar));
        }
        z0 z0Var = new z0(this, context, UserConfig.selectedAccount, lVar);
        z0Var.N7 = true;
        return new sl0(z0Var);
    }
}
