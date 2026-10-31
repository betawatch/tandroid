package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class qv implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ ay b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ HashSet f;

    public /* synthetic */ qv(ay ayVar, int i10, ArrayList arrayList, boolean z10, HashSet hashSet) {
        this.b = ayVar;
        this.c = i10;
        this.d = arrayList;
        this.e = z10;
        this.f = hashSet;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.C4(this.d, this.c, false, this.e, this.f);
                break;
            default:
                ay.q0(this.b, this.c, this.d, this.e, this.f);
                break;
        }
    }

    public /* synthetic */ qv(ay ayVar, ArrayList arrayList, int i10, boolean z10, HashSet hashSet) {
        this.b = ayVar;
        this.d = arrayList;
        this.c = i10;
        this.e = z10;
        this.f = hashSet;
    }
}
