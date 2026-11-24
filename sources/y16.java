// default package

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
