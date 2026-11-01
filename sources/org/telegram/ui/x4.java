package org.telegram.ui;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public abstract class x4 {
    public final w4 a = new w4(this, 0);
    public final org.telegram.messenger.at b = org.telegram.messenger.at.f(org.telegram.messenger.e20.s0);
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
