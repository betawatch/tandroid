package wd;

import bb.u;
import kotlin.jvm.internal.p;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class j extends ed.c {
    public p a;
    public u b;
    public /* synthetic */ Object c;
    public int d;

    @Override // ed.a
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.d |= TLObject.FLAG_31;
        return n.b(null, this);
    }
}
