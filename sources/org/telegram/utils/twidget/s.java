package org.telegram.utils.twidget;

import android.os.SystemClock;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class s implements xvc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ w b;
    public final /* synthetic */ byte[] c;
    public final /* synthetic */ int d;

    public /* synthetic */ s(w wVar, byte[] bArr, int i, byte b) {
        this.a = b;
        this.b = wVar;
        this.c = bArr;
        this.d = i;
    }

    @Override // xvc
    public final Object run() {
        switch (this.a) {
            case 0:
                w wVar = this.b;
                byte[] bArr = this.c;
                int i = this.d;
                byte[] b = wVar.b(bArr);
                if (b.length <= 1048576) {
                    synchronized (wVar) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        double min = Math.min(2000.0d, ((elapsedRealtime - wVar.i) * 1.0d) + wVar.f);
                        wVar.f = min;
                        wVar.i = elapsedRealtime;
                        if (min >= 1.0d) {
                            wVar.f = min - 1.0d;
                            wVar.b.signal(i, b);
                        } else {
                            sc8.j("Widget engine: too many signals");
                        }
                    }
                } else {
                    w26.j("Signal too long");
                }
                return null;
            default:
                w wVar2 = this.b;
                byte[] bArr2 = this.c;
                int i2 = this.d;
                if (bArr2 != null && bArr2.length <= 262144) {
                    return Float.valueOf(wVar2.b.textWidth(i2, bArr2));
                }
                w26.j("Text too long");
                return null;
        }
    }
}
