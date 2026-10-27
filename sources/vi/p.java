package vi;

import android.graphics.SurfaceTexture;
import android.util.Size;
import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s b;
    public final /* synthetic */ Size c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ RuntimeException[] f;
    public final /* synthetic */ CountDownLatch h;

    public /* synthetic */ p(s sVar, Size size, int i10, boolean z10, RuntimeException[] runtimeExceptionArr, CountDownLatch countDownLatch, int i11) {
        this.a = i11;
        this.b = sVar;
        this.c = size;
        this.d = i10;
        this.e = z10;
        this.f = runtimeExceptionArr;
        this.h = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CountDownLatch countDownLatch;
        switch (this.a) {
            case 0:
                Size size = this.c;
                int i10 = this.d;
                boolean z10 = this.e;
                RuntimeException[] runtimeExceptionArr = this.f;
                countDownLatch = this.h;
                s sVar = this.b;
                sVar.getClass();
                try {
                    try {
                        sVar.c = size;
                        sVar.l = i10;
                        sVar.o = z10;
                        SurfaceTexture surfaceTexture = sVar.x;
                        if (surfaceTexture != null) {
                            surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
                        }
                        int i11 = sVar.E;
                        if (i11 != 0) {
                            sVar.k(i11, i10);
                        }
                        n nVar = sVar.i;
                        StringBuilder sb2 = new StringBuilder("GL secondary input configured: input=");
                        sb2.append(size);
                        sb2.append(", crop=");
                        sb2.append(i10);
                        sb2.append(", filter=");
                        sb2.append(i10 == sVar.g ? "NEAREST" : "LINEAR");
                        sb2.append(", timestampRealtime=");
                        sb2.append(z10);
                        nVar.b(sb2.toString());
                    } catch (RuntimeException e) {
                        runtimeExceptionArr[0] = e;
                    }
                    countDownLatch.countDown();
                    return;
                } finally {
                }
            default:
                s sVar2 = this.b;
                Size size2 = this.c;
                int i12 = this.d;
                boolean z11 = this.e;
                RuntimeException[] runtimeExceptionArr2 = this.f;
                countDownLatch = this.h;
                try {
                    try {
                        sVar2.a = size2;
                        sVar2.b = size2;
                        sVar2.c = size2;
                        sVar2.j = i12;
                        sVar2.k = i12;
                        sVar2.l = i12;
                        sVar2.m = z11;
                        sVar2.n = z11;
                        sVar2.o = z11;
                        SurfaceTexture surfaceTexture2 = sVar2.v;
                        if (surfaceTexture2 != null) {
                            surfaceTexture2.setDefaultBufferSize(size2.getWidth(), size2.getHeight());
                        }
                        SurfaceTexture surfaceTexture3 = sVar2.x;
                        if (surfaceTexture3 != null) {
                            surfaceTexture3.setDefaultBufferSize(size2.getWidth(), size2.getHeight());
                        }
                        sVar2.k(sVar2.D, sVar2.k);
                        int i13 = sVar2.E;
                        if (i13 != 0) {
                            sVar2.k(i13, sVar2.l);
                        }
                        d0 d0Var = sVar2.N;
                        if (d0Var != null) {
                            d0Var.c = size2;
                            d0Var.d = i12;
                            d0Var.q = d0.j(size2, i12, false);
                            d0Var.r = d0.j(size2, i12, true);
                            d0Var.A = false;
                            d0Var.z = 0L;
                        }
                        n nVar2 = sVar2.i;
                        StringBuilder sb3 = new StringBuilder("GL input updated: input=");
                        sb3.append(size2);
                        sb3.append(", crop=");
                        sb3.append(i12);
                        sb3.append(", filter=");
                        sb3.append(sVar2.j == sVar2.g ? "NEAREST" : "LINEAR");
                        nVar2.b(sb3.toString());
                    } catch (RuntimeException e10) {
                        runtimeExceptionArr2[0] = e10;
                    }
                    countDownLatch.countDown();
                    return;
                } finally {
                }
        }
    }
}
