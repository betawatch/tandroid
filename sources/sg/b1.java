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
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.vl0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class b1 extends lm0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ la d;
    public final /* synthetic */ n6 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ q5 h;

    public b1(q5 q5Var, Context context, la laVar, n6 n6Var, boolean z10) {
        this.h = q5Var;
        this.c = context;
        this.d = laVar;
        this.e = n6Var;
        this.f = z10;
    }

    @Override // org.telegram.ui.Components.lm0
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
        f1 f1Var = this.h.D0;
        Context context = this.c;
        if (i10 == 1) {
            return new vl0(new z0(this, context, f1Var));
        }
        a1 a1Var = new a1(this, context, UserConfig.selectedAccount, f1Var);
        a1Var.N7 = true;
        return new vl0(a1Var);
    }
}
