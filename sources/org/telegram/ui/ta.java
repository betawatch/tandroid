package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ta implements Runnable {
    public final /* synthetic */ wb a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ View e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float h;

    public /* synthetic */ ta(wb wbVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f7, float f10) {
        this.a = wbVar;
        this.b = arrayList;
        this.c = arrayList2;
        this.d = arrayList3;
        this.e = view;
        this.f = f7;
        this.h = f10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wb.T(this.a, this.b, this.c, this.d, this.e, this.f, this.h);
    }
}
