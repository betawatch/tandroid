package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class ua implements Runnable {
    public final /* synthetic */ lb a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ View e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float h;

    public /* synthetic */ ua(lb lbVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f10, float f11) {
        this.a = lbVar;
        this.b = arrayList;
        this.c = arrayList2;
        this.d = arrayList3;
        this.e = view;
        this.f = f10;
        this.h = f11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lb.a0(this.a, this.b, this.c, this.d, this.e, this.f, this.h);
    }
}
