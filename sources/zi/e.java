package zi;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.widget.FrameLayout;
import java.util.concurrent.CountDownLatch;
import ki.j2;
import org.telegram.messenger.a8;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.q40;
import org.telegram.ui.pk;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                l lVar = (l) this.b;
                HandlerThread handlerThread = (HandlerThread) this.c;
                lVar.j();
                o oVar = lVar.w;
                if (oVar != null) {
                    long p10 = oVar.p();
                    u uVar = lVar.v;
                    if (uVar != null && p10 != Long.MAX_VALUE) {
                        uVar.q = Math.max(0L, p10) * 1000;
                        Handler handler = uVar.u;
                        if (handler != null) {
                            handler.removeCallbacks(uVar.y0);
                        }
                    }
                }
                lVar.n();
                o oVar2 = lVar.w;
                if (oVar2 != null) {
                    oVar2.u();
                    lVar.w = null;
                }
                if (lVar.w0 <= 0) {
                    handlerThread.quitSafely();
                    return;
                }
                lVar.j.b("release waits for camera open results: pending=" + lVar.w0);
                lVar.x0 = handlerThread;
                return;
            case 1:
                u uVar2 = (u) this.b;
                CountDownLatch countDownLatch = (CountDownLatch) this.c;
                uVar2.getClass();
                try {
                    try {
                        uVar2.f();
                        uVar2.r0 = true;
                    } catch (RuntimeException e10) {
                        uVar2.x0 = e10;
                        uVar2.i();
                    }
                    return;
                } finally {
                    countDownLatch.countDown();
                }
            default:
                u7.i iVar = (u7.i) this.b;
                n0 n0Var = (n0) this.c;
                v0 v0Var = (v0) iVar.a;
                v0Var.R++;
                v0Var.y = true;
                v0Var.m.b("camera switch started: target=" + n0Var);
                q40 q40Var = (q40) v0Var.d.b;
                FrameLayout frameLayout = q40Var.x;
                q40Var.u0++;
                ValueAnimator valueAnimator = q40Var.d0;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    q40Var.d0.cancel();
                    q40Var.d0 = null;
                }
                q40Var.p0 = true;
                q40Var.q0 = false;
                q40Var.r0 = false;
                q40Var.s0 = false;
                q40Var.t0 = SystemClock.elapsedRealtime();
                pk pkVar = q40Var.E;
                q40Var.A(false);
                Bitmap bitmap = q40Var.v0;
                if (bitmap != null) {
                    pkVar.setImageBitmap(bitmap);
                    q40Var.o0 = true;
                    pkVar.animate().cancel();
                    pkVar.setAlpha(1.0f);
                }
                frameLayout.animate().cancel();
                frameLayout.setRotationY(0.0f);
                frameLayout.setCameraDistance(frameLayout.getMeasuredHeight() * 8.0f);
                int i7 = q40Var.u0;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                q40Var.d0 = ofFloat;
                ofFloat.setDuration(580L);
                q40Var.d0.setInterpolator(er.h);
                q40Var.d0.addUpdateListener(new h2(q40Var, i7, 4));
                q40Var.d0.addListener(new j2(q40Var, i7, 10));
                q40Var.d0.start();
                a8.b("RoundVideo camera flip started: facing=" + n0Var + ", minimumDurationMs=580");
                q40Var.D();
                v0Var.o();
                return;
        }
    }
}
