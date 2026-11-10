package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qu implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ zw b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ HashSet f;

    public /* synthetic */ qu(zw zwVar, int i7, ArrayList arrayList, boolean z9, HashSet hashSet) {
        this.b = zwVar;
        this.c = i7;
        this.d = arrayList;
        this.e = z9;
        this.f = hashSet;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.D4(this.d, this.c, false, this.e, this.f);
                break;
            default:
                zw.r0(this.b, this.c, this.d, this.e, this.f);
                break;
        }
    }

    public /* synthetic */ qu(zw zwVar, ArrayList arrayList, int i7, boolean z9, HashSet hashSet) {
        this.b = zwVar;
        this.d = arrayList;
        this.c = i7;
        this.e = z9;
        this.f = hashSet;
    }
}
