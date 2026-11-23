package zi;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.widget.FrameLayout;
import bi.p6;
import ki.e2;
import org.telegram.messenger.a8;
import org.telegram.ui.ActionBar.j2;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.y40;
import org.telegram.ui.qk;
import y7.h7;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class k0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k0(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i7) {
            case 0:
                n0 n0Var = (n0) obj;
                u0 u0Var = (u0) ((h7) obj2).a;
                u0Var.R++;
                u0Var.y = true;
                u0Var.m.b("camera switch started: target=" + n0Var);
                y40 y40Var = (y40) u0Var.d.b;
                FrameLayout frameLayout = y40Var.x;
                y40Var.u0++;
                ValueAnimator valueAnimator = y40Var.d0;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    y40Var.d0.cancel();
                    y40Var.d0 = null;
                }
                y40Var.p0 = true;
                y40Var.q0 = false;
                y40Var.r0 = false;
                y40Var.s0 = false;
                y40Var.t0 = SystemClock.elapsedRealtime();
                qk qkVar = y40Var.E;
                y40Var.A(false);
                Bitmap bitmap = y40Var.v0;
                if (bitmap != null) {
                    qkVar.setImageBitmap(bitmap);
                    y40Var.o0 = true;
                    qkVar.animate().cancel();
                    qkVar.setAlpha(1.0f);
                }
                frameLayout.animate().cancel();
                frameLayout.setRotationY(0.0f);
                frameLayout.setCameraDistance(frameLayout.getMeasuredHeight() * 8.0f);
                int i10 = y40Var.u0;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                y40Var.d0 = ofFloat;
                ofFloat.setDuration(580L);
                y40Var.d0.setInterpolator(kr.h);
                y40Var.d0.addUpdateListener(new j2(y40Var, i10, 4));
                y40Var.d0.addListener(new e2(y40Var, i10, 10));
                y40Var.d0.start();
                a8.b("RoundVideo camera flip started: facing=" + n0Var + ", minimumDurationMs=580");
                y40Var.D();
                u0Var.o();
                break;
            default:
                org.telegram.messenger.g0.g((String) obj);
                kc.b0(((p6) obj2).a.a).k(false).j();
                break;
        }
    }
}
