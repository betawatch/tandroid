package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rv implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ dy b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ HashSet f;

    public /* synthetic */ rv(dy dyVar, int i9, ArrayList arrayList, boolean z10, HashSet hashSet) {
        this.b = dyVar;
        this.d = i9;
        this.c = arrayList;
        this.e = z10;
        this.f = hashSet;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                dy.n0(this.b, this.d, this.c, this.e, this.f);
                break;
            default:
                this.b.r4(this.c, this.d, false, this.e, this.f);
                break;
        }
    }

    public /* synthetic */ rv(dy dyVar, ArrayList arrayList, int i9, boolean z10, HashSet hashSet) {
        this.b = dyVar;
        this.c = arrayList;
        this.d = i9;
        this.e = z10;
        this.f = hashSet;
    }
}
