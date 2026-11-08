package org.telegram.ui;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public abstract class y4 {
    public final x4 a = new x4(this, 0);
    public final org.telegram.messenger.qs b = org.telegram.messenger.qs.f(org.telegram.messenger.p10.s0);
    public final Object c;
    public final int d;
    public final int e;
    public bi.h8 f;
    public boolean g;

    public y4(int i7, int i10, TLObject tLObject) {
        this.c = tLObject;
        this.d = i7;
        this.e = i10;
    }

    public abstract void a();

    public abstract void b(Object... objArr);
}
