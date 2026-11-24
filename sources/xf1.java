// default package

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class xf1 implements Runnable {
    public final /* synthetic */ vg1 a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ View e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float h;

    public /* synthetic */ xf1(vg1 vg1Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f, float f2) {
        this.a = vg1Var;
        this.b = arrayList;
        this.c = arrayList2;
        this.d = arrayList3;
        this.e = view;
        this.f = f;
        this.h = f2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.T0(this.b, this.c, this.d, this.e, this.f, this.h);
    }
}
