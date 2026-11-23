package org.telegram.ui;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public abstract class y4 {
    public final x4 a = new x4(this, 0);
    public final org.telegram.messenger.ls b = org.telegram.messenger.ls.f(org.telegram.messenger.k10.t0);
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
