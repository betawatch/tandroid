package wi;

import android.graphics.SurfaceTexture;
import android.util.Size;
import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s b;
    public final /* synthetic */ Size c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ RuntimeException[] f;
    public final /* synthetic */ CountDownLatch h;

    public /* synthetic */ p(s sVar, Size size, int i3, boolean z10, RuntimeException[] runtimeExceptionArr, CountDownLatch countDownLatch, int i10) {
        this.a = i10;
        this.b = sVar;
        this.c = size;
        this.d = i3;
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
                int i3 = this.d;
                boolean z10 = this.e;
                RuntimeException[] runtimeExceptionArr = this.f;
                countDownLatch = this.h;
                s sVar = this.b;
                sVar.getClass();
                try {
                    try {
                        sVar.c = size;
                        sVar.l = i3;
                        sVar.o = z10;
                        SurfaceTexture surfaceTexture = sVar.x;
                        if (surfaceTexture != null) {
                            surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
                        }
                        int i10 = sVar.E;
                        if (i10 != 0) {
                            sVar.k(i10, i3);
                        }
                        n nVar = sVar.i;
                        StringBuilder sb2 = new StringBuilder("GL secondary input configured: input=");
                        sb2.append(size);
                        sb2.append(", crop=");
                        sb2.append(i3);
                        sb2.append(", filter=");
                        sb2.append(i3 == sVar.g ? "NEAREST" : "LINEAR");
                        sb2.append(", timestampRealtime=");
                        sb2.append(z10);
                        nVar.b(sb2.toString());
                    } catch (RuntimeException e10) {
                        runtimeExceptionArr[0] = e10;
                    }
                    countDownLatch.countDown();
                    return;
                } finally {
                }
            default:
                s sVar2 = this.b;
                Size size2 = this.c;
                int i11 = this.d;
                boolean z11 = this.e;
                RuntimeException[] runtimeExceptionArr2 = this.f;
                countDownLatch = this.h;
                try {
                    try {
                        sVar2.a = size2;
                        sVar2.b = size2;
                        sVar2.c = size2;
                        sVar2.j = i11;
                        sVar2.k = i11;
                        sVar2.l = i11;
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
                        int i12 = sVar2.E;
                        if (i12 != 0) {
                            sVar2.k(i12, sVar2.l);
                        }
                        c0 c0Var = sVar2.N;
                        if (c0Var != null) {
                            c0Var.c = size2;
                            c0Var.d = i11;
                            c0Var.q = c0.j(size2, i11, false);
                            c0Var.r = c0.j(size2, i11, true);
                            c0Var.A = false;
                            c0Var.z = 0L;
                        }
                        n nVar2 = sVar2.i;
                        StringBuilder sb3 = new StringBuilder("GL input updated: input=");
                        sb3.append(size2);
                        sb3.append(", crop=");
                        sb3.append(i11);
                        sb3.append(", filter=");
                        sb3.append(sVar2.j == sVar2.g ? "NEAREST" : "LINEAR");
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
