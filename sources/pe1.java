// default package

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class pe1 implements Runnable {
    public final /* synthetic */ nf1 a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ View e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float h;

    public /* synthetic */ pe1(nf1 nf1Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f, float f2) {
        this.a = nf1Var;
        this.b = arrayList;
        this.c = arrayList2;
        this.d = arrayList3;
        this.e = view;
        this.f = f;
        this.h = f2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.S0(this.b, this.c, this.d, this.e, this.f, this.h);
    }
}
