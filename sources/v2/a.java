package v2;

import b2.s;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public abstract class a extends k {
    public final long v;
    public final long w;
    public m5.e x;
    public int[] y;

    public a(g2.h hVar, g2.m mVar, s sVar, int i10, Object obj, long j3, long j10, long j11, long j12, long j13) {
        super(hVar, mVar, sVar, i10, obj, j3, j10, j13);
        this.v = j11;
        this.w = j12;
    }

    public final int d(int i10) {
        int[] iArr = this.y;
        e2.d.h(iArr);
        return iArr[i10];
    }
}
