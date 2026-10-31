package vh;

import android.graphics.SurfaceTexture;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.jj;
import org.telegram.ui.Components.gn0;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.s00;
import org.telegram.ui.y00;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class e0 implements eg.p, s61, y00, zf.l1 {
    public Object a;

    public /* synthetic */ e0(Object obj) {
        this.a = obj;
    }

    @Override // zf.l1
    public /* synthetic */ a0.h M() {
        return null;
    }

    @Override // zf.l1
    public /* synthetic */ boolean Y(int i10) {
        return true;
    }

    @Override // org.telegram.ui.y00
    public boolean b(s00 s00Var) {
        return false;
    }

    @Override // org.telegram.ui.y00
    public void c(jj jjVar) {
        yh.a0 a0Var = (yh.a0) this.a;
        a0Var.q1.presentFragment(gn0.M(a0Var.a, jjVar));
        a0Var.dismiss();
    }

    @Override // zf.l1
    public void c0(ArrayList arrayList) {
        zf.x0 x0Var = (zf.x0) this.a;
        String str = x0Var.Z;
        if (str != null) {
            x0Var.U(str, x0Var.c0, x0Var.d0, x0Var.b0, x0Var.a0);
        }
    }

    @Override // eg.p
    public void d() {
        ((g0) this.a).e.invalidate();
    }

    @Override // org.telegram.ui.y00
    public boolean f() {
        return false;
    }

    @Override // zf.l1
    public void i(int i10) {
        ((zf.x0) this.a).f();
    }

    @Override // org.telegram.ui.Components.s61
    public /* synthetic */ void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.s61
    public void onStateChanged(boolean z10, int i10) {
        k4 k4Var = (k4) this.a;
        i4 i4Var = k4Var.L;
        org.telegram.messenger.i0.r(i4Var);
        u61 u61Var = k4Var.D;
        if (u61Var == null || !u61Var.d0()) {
            return;
        }
        org.telegram.messenger.i0.g3(i4Var);
    }

    @Override // org.telegram.ui.Components.s61
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // org.telegram.ui.Components.s61
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        ((k4) this.a).i();
    }

    @Override // zf.l1
    public /* synthetic */ a0.h x() {
        return null;
    }

    @Override // org.telegram.ui.Components.s61
    public void onRenderedFirstFrame() {
    }

    @Override // eg.p
    public void g(boolean z10) {
    }

    @Override // eg.p
    public void l(boolean z10) {
    }

    @Override // org.telegram.ui.Components.s61
    public /* synthetic */ void onSeekFinished(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.s61
    public /* synthetic */ void onSeekStarted(j2.a aVar) {
    }

    @Override // org.telegram.ui.y00
    public void a() {
    }

    @Override // eg.p
    public void n() {
    }

    @Override // org.telegram.ui.Components.s61
    public void onError(u61 u61Var, Exception exc) {
    }

    @Override // org.telegram.ui.y00
    public void e(jj jjVar, View view, int i10) {
    }

    @Override // org.telegram.ui.Components.s61
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }
}
