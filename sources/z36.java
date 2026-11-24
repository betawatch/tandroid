// default package

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class z36 implements View.OnClickListener {
    public final /* synthetic */ a46 a;

    public z36(a46 a46Var) {
        this.a = a46Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        jb jbVar = (jb) view.getParent();
        ArrayList arrayList = new ArrayList();
        arrayList.add(jbVar.getCurrentChannel());
        i46 i46Var = this.a.c;
        int i = i46.R2;
        i46Var.o1(arrayList);
    }
}
