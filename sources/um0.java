// default package

import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class um0 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ um0(Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        byte b = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                sm0 sm0Var = (sm0) obj;
                if (sm0Var != null) {
                    sm0Var.d.add((wm0) obj2);
                    break;
                }
                break;
            case 1:
                uib uibVar = (uib) obj2;
                uibVar.k = gn.update(uibVar.l, (View) obj, uibVar.k, uibVar.b);
                break;
            default:
                mmc mmcVar = (mmc) obj2;
                lmc lmcVar = mmcVar.m;
                if (lmcVar != null) {
                    lmcVar.setPaused(!mmcVar.n);
                }
                mmcVar.a.isAttachedToWindow();
                int i = mmcVar.v0;
                if (-1 != i) {
                    if (i >= 0) {
                        nm7.f(i).n(mmcVar.x0, 68);
                    }
                    mmcVar.v0 = -1;
                    break;
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        byte b = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                wm0 wm0Var = (wm0) obj2;
                sm0 sm0Var = (sm0) obj;
                if (sm0Var != null) {
                    ArrayList arrayList = sm0Var.d;
                    arrayList.remove(wm0Var);
                    if (sm0Var.e.isEmpty() && arrayList.isEmpty()) {
                        sm0Var.n.a();
                    }
                }
                wm0Var.n = null;
                Paint paint = wm0Var.h;
                wm0Var.o = null;
                paint.setShader(null);
                break;
            case 1:
                gn.release((View) obj, ((uib) obj2).k);
                break;
            default:
                mmc mmcVar = (mmc) obj2;
                cm1 cm1Var = mmcVar.a;
                mmcVar.f();
                mmcVar.M = false;
                mmcVar.N = 0L;
                mmcVar.k();
                zna znaVar = mmcVar.Z;
                if (znaVar != null) {
                    znaVar.d();
                    mmcVar.Z = null;
                }
                mmcVar.a0 = 1.0f;
                cm1Var.invalidate();
                if (cm1Var.getParent() instanceof View) {
                    ((View) cm1Var.getParent()).invalidate();
                }
                mmcVar.l();
                uoc uocVar = mmcVar.k;
                WeakHashMap weakHashMap = uocVar.e;
                weakHashMap.remove((cm1) obj);
                if (weakHashMap.isEmpty()) {
                    uocVar.a();
                }
                cm1Var.isAttachedToWindow();
                int i = mmcVar.v0;
                if (-1 != i) {
                    if (i >= 0) {
                        nm7.f(i).n(mmcVar.x0, 68);
                    }
                    mmcVar.v0 = -1;
                }
                lmc lmcVar = mmcVar.m;
                if (lmcVar != null) {
                    lmcVar.setPaused(true);
                }
                mmcVar.l.stop();
                mmcVar.H = false;
                break;
        }
    }
}
