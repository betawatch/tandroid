package org.telegram.ui;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public abstract class y4 {
    public final x4 a = new x4(this, 0);
    public final org.telegram.messenger.ks b = org.telegram.messenger.ks.f(org.telegram.messenger.j10.t0);
    public final Object c;
    public final int d;
    public final int e;
    public di.d7 f;
    public boolean g;

    public y4(int i7, int i10, TLObject tLObject) {
        this.c = tLObject;
        this.d = i7;
        this.e = i10;
    }

    public abstract void a();

    public abstract void b(Object... objArr);
}
