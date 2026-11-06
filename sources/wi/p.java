package wi;

import android.graphics.SurfaceTexture;
import android.util.Size;
import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t b;
    public final /* synthetic */ Size c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ RuntimeException[] f;
    public final /* synthetic */ CountDownLatch h;

    public /* synthetic */ p(t tVar, Size size, int i7, boolean z9, RuntimeException[] runtimeExceptionArr, CountDownLatch countDownLatch, int i10) {
        this.a = i10;
        this.b = tVar;
        this.c = size;
        this.d = i7;
        this.e = z9;
        this.f = runtimeExceptionArr;
        this.h = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CountDownLatch countDownLatch;
        switch (this.a) {
            case 0:
                Size size = this.c;
                int i7 = this.d;
                boolean z9 = this.e;
                RuntimeException[] runtimeExceptionArr = this.f;
                countDownLatch = this.h;
                t tVar = this.b;
                tVar.getClass();
                try {
                    try {
                        tVar.c = size;
                        tVar.l = i7;
                        tVar.o = z9;
                        SurfaceTexture surfaceTexture = tVar.x;
                        if (surfaceTexture != null) {
                            surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
                        }
                        int i10 = tVar.E;
                        if (i10 != 0) {
                            tVar.k(i10, i7);
                        }
                        n nVar = tVar.i;
                        StringBuilder sb2 = new StringBuilder("GL secondary input configured: input=");
                        sb2.append(size);
                        sb2.append(", crop=");
                        sb2.append(i7);
                        sb2.append(", filter=");
                        sb2.append(i7 == tVar.g ? "NEAREST" : "LINEAR");
                        sb2.append(", timestampRealtime=");
                        sb2.append(z9);
                        nVar.b(sb2.toString());
                    } catch (RuntimeException e10) {
                        runtimeExceptionArr[0] = e10;
                    }
                    countDownLatch.countDown();
                    return;
                } finally {
                }
            default:
                t tVar2 = this.b;
                Size size2 = this.c;
                int i11 = this.d;
                boolean z10 = this.e;
                RuntimeException[] runtimeExceptionArr2 = this.f;
                countDownLatch = this.h;
                try {
                    try {
                        tVar2.a = size2;
                        tVar2.b = size2;
                        tVar2.c = size2;
                        tVar2.j = i11;
                        tVar2.k = i11;
                        tVar2.l = i11;
                        tVar2.m = z10;
                        tVar2.n = z10;
                        tVar2.o = z10;
                        SurfaceTexture surfaceTexture2 = tVar2.v;
                        if (surfaceTexture2 != null) {
                            surfaceTexture2.setDefaultBufferSize(size2.getWidth(), size2.getHeight());
                        }
                        SurfaceTexture surfaceTexture3 = tVar2.x;
                        if (surfaceTexture3 != null) {
                            surfaceTexture3.setDefaultBufferSize(size2.getWidth(), size2.getHeight());
                        }
                        tVar2.k(tVar2.D, tVar2.k);
                        int i12 = tVar2.E;
                        if (i12 != 0) {
                            tVar2.k(i12, tVar2.l);
                        }
                        d0 d0Var = tVar2.N;
                        if (d0Var != null) {
                            d0Var.c = size2;
                            d0Var.d = i11;
                            d0Var.q = d0.j(size2, i11, false);
                            d0Var.r = d0.j(size2, i11, true);
                            d0Var.A = false;
                            d0Var.z = 0L;
                        }
                        n nVar2 = tVar2.i;
                        StringBuilder sb3 = new StringBuilder("GL input updated: input=");
                        sb3.append(size2);
                        sb3.append(", crop=");
                        sb3.append(i11);
                        sb3.append(", filter=");
                        sb3.append(tVar2.j == tVar2.g ? "NEAREST" : "LINEAR");
                        nVar2.b(sb3.toString());
                    } catch (RuntimeException e11) {
                        runtimeExceptionArr2[0] = e11;
                    }
                    countDownLatch.countDown();
                    return;
                } finally {
                }
        }
    }
}
