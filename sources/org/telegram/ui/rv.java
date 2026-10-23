package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rv implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ ey b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ HashSet f;

    public /* synthetic */ rv(ey eyVar, int i10, ArrayList arrayList, boolean z10, HashSet hashSet) {
        this.b = eyVar;
        this.d = i10;
        this.c = arrayList;
        this.e = z10;
        this.f = hashSet;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ey.n0(this.b, this.d, this.c, this.e, this.f);
                break;
            default:
                this.b.p4(this.c, this.d, false, this.e, this.f);
                break;
        }
    }

    public /* synthetic */ rv(ey eyVar, ArrayList arrayList, int i10, boolean z10, HashSet hashSet) {
        this.b = eyVar;
        this.c = arrayList;
        this.d = i10;
        this.e = z10;
        this.f = hashSet;
    }
}
