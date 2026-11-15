package org.telegram.ui;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public abstract class y4 {
    public final x4 a = new x4(this, 0);
    public final org.telegram.messenger.ns b = org.telegram.messenger.ns.f(org.telegram.messenger.m10.t0);
    public final Object c;
    public final int d;
    public final int e;
    public di.a7 f;
    public boolean g;

    public y4(int i7, int i10, TLObject tLObject) {
        this.c = tLObject;
        this.d = i7;
        this.e = i10;
    }

    public abstract void a();

    public abstract void b(Object... objArr);
}
