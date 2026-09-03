package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ra implements Runnable {
    public final /* synthetic */ sb a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ View e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float h;

    public /* synthetic */ ra(sb sbVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f10, float f11) {
        this.a = sbVar;
        this.b = arrayList;
        this.c = arrayList2;
        this.d = arrayList3;
        this.e = view;
        this.f = f10;
        this.h = f11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sb.V(this.a, this.b, this.c, this.d, this.e, this.f, this.h);
    }
}
