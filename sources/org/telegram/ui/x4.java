package org.telegram.ui;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class x4 {
    public final w4 a = new w4(this, 0);
    public final org.telegram.messenger.zs b = org.telegram.messenger.zs.f(org.telegram.messenger.d20.s0);
    public final Object c;
    public final int d;
    public final int e;
    public mg.f0 f;
    public boolean g;

    public x4(int i10, int i11, TLObject tLObject) {
        this.c = tLObject;
        this.d = i10;
        this.e = i11;
    }

    public abstract void a();

    public abstract void b(Object... objArr);
}
