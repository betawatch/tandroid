package org.telegram.utils.twidget;

import android.os.SystemClock;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class t0 implements p0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x0 b;
    public final /* synthetic */ byte[] c;
    public final /* synthetic */ int d;

    public /* synthetic */ t0(int i7, int i10, x0 x0Var, byte[] bArr) {
        this.a = i10;
        this.b = x0Var;
        this.c = bArr;
        this.d = i7;
    }

    @Override // org.telegram.utils.twidget.p0
    public final Object run() {
        switch (this.a) {
            case 0:
                x0 x0Var = this.b;
                byte[] bArr = this.c;
                int i7 = this.d;
                byte[] i12 = x0Var.i1(bArr);
                if (i12.length > 1048576) {
                    throw new IllegalArgumentException("Signal too long");
                }
                synchronized (x0Var) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    double min = Math.min(2000.0d, ((elapsedRealtime - x0Var.i) * 1.0d) + x0Var.f);
                    x0Var.f = min;
                    x0Var.i = elapsedRealtime;
                    if (min < 1.0d) {
                        throw new IllegalStateException("Widget engine: too many signals");
                    }
                    x0Var.f = min - 1.0d;
                    x0Var.b.signal(i7, i12);
                    return null;
                }
            default:
                x0 x0Var2 = this.b;
                byte[] bArr2 = this.c;
                int i10 = this.d;
                x0Var2.getClass();
                if (bArr2 == null || bArr2.length > 262144) {
                    throw new IllegalArgumentException("Text too long");
                }
                return Float.valueOf(x0Var2.b.textWidth(i10, bArr2));
        }
    }
}
