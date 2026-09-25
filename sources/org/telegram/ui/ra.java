package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ra implements Runnable {
    public final /* synthetic */ ub a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ View e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float h;

    public /* synthetic */ ra(ub ubVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f7, float f10) {
        this.a = ubVar;
        this.b = arrayList;
        this.c = arrayList2;
        this.d = arrayList3;
        this.e = view;
        this.f = f7;
        this.h = f10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ub.V(this.a, this.b, this.c, this.d, this.e, this.f, this.h);
    }
}
