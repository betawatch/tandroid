package rg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import ei.q6;
import ei.r5;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.ja;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.wl0;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class a1 extends lm0 {
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

    @Override // org.telegram.ui.Components.lm0
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
        if (!(view instanceof org.telegram.ui.Cells.t1)) {
            if (view instanceof org.telegram.ui.Cells.v0) {
                ((org.telegram.ui.Cells.v0) view).setMessageObject(messageObject);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
        MessageObject.GroupedMessages groupedMessages = r5Var.t0;
        if (groupedMessages == null || (position = groupedMessages.getPosition(messageObject)) == null) {
            z10 = false;
        } else {
            z10 = position.minY != 0;
        }
        MessageObject.GroupedMessages groupedMessages2 = r5Var.t0;
        t1Var.W3(messageObject, groupedMessages2, groupedMessages2 != null, z10, false, false);
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
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
