package si;

import android.graphics.SurfaceTexture;
import android.util.Size;
import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u b;
    public final /* synthetic */ Size c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ RuntimeException[] f;
    public final /* synthetic */ CountDownLatch h;

    public /* synthetic */ r(u uVar, Size size, int i10, boolean z10, RuntimeException[] runtimeExceptionArr, CountDownLatch countDownLatch, int i11) {
        this.a = i11;
        this.b = uVar;
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
                u uVar = this.b;
                uVar.getClass();
                try {
                    try {
                        uVar.c = size;
                        uVar.l = i10;
                        uVar.o = z10;
                        SurfaceTexture surfaceTexture = uVar.x;
                        if (surfaceTexture != null) {
                            surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
                        }
                        int i11 = uVar.E;
                        if (i11 != 0) {
                            uVar.k(i11, i10);
                        }
                        o oVar = uVar.i;
                        StringBuilder sb2 = new StringBuilder("GL secondary input configured: input=");
                        sb2.append(size);
                        sb2.append(", crop=");
                        sb2.append(i10);
                        sb2.append(", filter=");
                        sb2.append(i10 == uVar.g ? "NEAREST" : "LINEAR");
                        sb2.append(", timestampRealtime=");
                        sb2.append(z10);
                        oVar.b(sb2.toString());
                    } catch (RuntimeException e) {
                        runtimeExceptionArr[0] = e;
                    }
                    countDownLatch.countDown();
                    return;
                } finally {
                }
            default:
                u uVar2 = this.b;
                Size size2 = this.c;
                int i12 = this.d;
                boolean z11 = this.e;
                RuntimeException[] runtimeExceptionArr2 = this.f;
                countDownLatch = this.h;
                try {
                    try {
                        uVar2.a = size2;
                        uVar2.b = size2;
                        uVar2.c = size2;
                        uVar2.j = i12;
                        uVar2.k = i12;
                        uVar2.l = i12;
                        uVar2.m = z11;
                        uVar2.n = z11;
                        uVar2.o = z11;
                        SurfaceTexture surfaceTexture2 = uVar2.v;
                        if (surfaceTexture2 != null) {
                            surfaceTexture2.setDefaultBufferSize(size2.getWidth(), size2.getHeight());
                        }
                        SurfaceTexture surfaceTexture3 = uVar2.x;
                        if (surfaceTexture3 != null) {
                            surfaceTexture3.setDefaultBufferSize(size2.getWidth(), size2.getHeight());
                        }
                        uVar2.k(uVar2.D, uVar2.k);
                        int i13 = uVar2.E;
                        if (i13 != 0) {
                            uVar2.k(i13, uVar2.l);
                        }
                        d0 d0Var = uVar2.N;
                        if (d0Var != null) {
                            d0Var.c = size2;
                            d0Var.d = i12;
                            d0Var.q = d0.j(size2, i12, false);
                            d0Var.r = d0.j(size2, i12, true);
                            d0Var.A = false;
                            d0Var.z = 0L;
                        }
                        o oVar2 = uVar2.i;
                        StringBuilder sb3 = new StringBuilder("GL input updated: input=");
                        sb3.append(size2);
                        sb3.append(", crop=");
                        sb3.append(i12);
                        sb3.append(", filter=");
                        sb3.append(uVar2.j == uVar2.g ? "NEAREST" : "LINEAR");
                        oVar2.b(sb3.toString());
                    } catch (RuntimeException e7) {
                        runtimeExceptionArr2[0] = e7;
                    }
                    countDownLatch.countDown();
                    return;
                } finally {
                }
        }
    }
}
