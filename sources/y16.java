// default package

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class y16 implements View.OnClickListener {
    public final /* synthetic */ z16 a;

    public y16(z16 z16Var) {
        this.a = z16Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        jb jbVar = (jb) view.getParent();
        ArrayList arrayList = new ArrayList();
        arrayList.add(jbVar.getCurrentChannel());
        h26 h26Var = this.a.c;
        int i = h26.R2;
        h26Var.o1(arrayList);
    }
}
