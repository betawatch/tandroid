package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ua implements Runnable {
    public final /* synthetic */ mb a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ View e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float h;

    public /* synthetic */ ua(mb mbVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f10, float f11) {
        this.a = mbVar;
        this.b = arrayList;
        this.c = arrayList2;
        this.d = arrayList3;
        this.e = view;
        this.f = f10;
        this.h = f11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mb.a0(this.a, this.b, this.c, this.d, this.e, this.f, this.h);
    }
}
