package ph;

import android.graphics.Rect;
import android.os.SystemClock;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class s5 extends j1.b {
    public final Rect o;
    public final /* synthetic */ t5 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s5(t5 t5Var, t5 t5Var2) {
        super(t5Var2);
        this.p = t5Var;
        this.o = new Rect();
    }

    @Override // j1.b
    public final int g(float f10, float f11) {
        t5 t5Var = this.p;
        if (Math.abs(f10 - t5Var.h0) <= AndroidUtilities.dp(30.0f) && Math.abs(f11 - t5Var.g0) <= AndroidUtilities.dp(30.0f) && !t5Var.b() && !t5Var.r0) {
            return 0;
        }
        if (Math.abs(f10 - t5Var.i0) <= AndroidUtilities.dp(30.0f) && Math.abs(f11 - t5Var.g0) <= AndroidUtilities.dp(30.0f) && !t5Var.b() && !t5Var.r0) {
            return 2;
        }
        if (Math.abs(f10 - t5Var.f0) > AndroidUtilities.dp(60.0f) || Math.abs(f11 - t5Var.g0) > AndroidUtilities.dp(60.0f)) {
            return TLObject.FLAG_31;
        }
        return 1;
    }

    @Override // j1.b
    public final void h(ArrayList arrayList) {
        t5 t5Var = this.p;
        if (!t5Var.b() && !t5Var.r0) {
            arrayList.add(0);
        }
        arrayList.add(1);
        if (t5Var.b() || t5Var.r0) {
            return;
        }
        arrayList.add(2);
    }

    @Override // j1.b
    public final boolean k(int i10, int i11) {
        t5 t5Var = this.p;
        if (t5Var.a != null && !t5Var.r0 && i11 == 16) {
            if (i10 != 0) {
                if (i10 == 1) {
                    if (t5Var.b()) {
                        ((a9) t5Var.a).a();
                        return true;
                    }
                    if (t5Var.o0) {
                        t5Var.o0 = false;
                        t5Var.w0 = false;
                        t5Var.s0 = SystemClock.elapsedRealtime();
                        t5Var.r0 = true;
                        ((a9) t5Var.a).d(false);
                        t5Var.invalidate();
                        return true;
                    }
                    if (!t5Var.l0) {
                        ((a9) t5Var.a).c();
                        return true;
                    }
                    if (da.d(((a9) t5Var.a).a)) {
                        t5Var.O = 0L;
                        t5Var.N = System.currentTimeMillis();
                        t5Var.x0 = false;
                        ((a9) t5Var.a).e(new org.telegram.ui.web.o0(this, 21), false);
                        return true;
                    }
                    return true;
                }
                if (i10 == 2 && !t5Var.b()) {
                    t5Var.d(180.0f);
                    ((a9) t5Var.a).b();
                    return true;
                }
            } else if (!t5Var.b()) {
                if (!t5Var.o0 || !t5Var.x0) {
                    da daVar = ((a9) t5Var.a).a;
                    if (daVar.c0 == 0 && !daVar.M1 && !daVar.N1 && da.b(daVar)) {
                        daVar.f(true);
                    }
                    return true;
                }
                t5Var.w0 = false;
                t5Var.D0.d(1.0f, true);
                e3 e3Var = ((a9) t5Var.a).a.Q0;
                e3Var.a.q(LocaleController.getString(R.string.StoryHintPinchToZoom), true, true);
                e3Var.invalidate();
                t5Var.invalidate();
                return true;
            }
        }
        return false;
    }

    @Override // j1.b
    public final void l(int i10, s0.e eVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = eVar.a;
        eVar.i("android.widget.Button");
        boolean z4 = false;
        Rect rect = this.o;
        t5 t5Var = this.p;
        if (i10 == 0) {
            int dp = AndroidUtilities.dp(22.0f);
            float f10 = t5Var.h0;
            float f11 = dp;
            float f12 = t5Var.g0;
            rect.set((int) (f10 - f11), (int) (f12 - f11), (int) (f10 + f11), (int) (f12 + f11));
            eVar.h(rect);
            eVar.j((t5Var.o0 && t5Var.x0) ? LocaleController.getString(R.string.AccDescrLockRecording) : LocaleController.getString(R.string.AccDescrCameraGallery));
            if (!t5Var.r0 && !t5Var.b()) {
                z4 = true;
            }
            accessibilityNodeInfo.setEnabled(z4);
            if (z4) {
                eVar.b(s0.c.c);
                return;
            }
            return;
        }
        if (i10 == 1) {
            int dp2 = AndroidUtilities.dp(40.0f);
            float f13 = t5Var.f0;
            float f14 = dp2;
            float f15 = t5Var.g0;
            rect.set((int) (f13 - f14), (int) (f15 - f14), (int) (f13 + f14), (int) (f15 + f14));
            eVar.h(rect);
            eVar.j(t5Var.b() ? LocaleController.getString(R.string.Send) : t5Var.o0 ? LocaleController.getString(R.string.AccDescrStopRecording) : t5Var.l0 ? LocaleController.getString(R.string.AccDescrStartRecording) : LocaleController.getString(R.string.AccDescrTakePhoto));
            accessibilityNodeInfo.setEnabled(!t5Var.r0);
            if (t5Var.r0) {
                return;
            }
            eVar.b(s0.c.c);
            return;
        }
        if (i10 != 2) {
            rect.set(0, 0, 1, 1);
            eVar.h(rect);
            eVar.p(false);
            eVar.j("");
            return;
        }
        int dp3 = AndroidUtilities.dp(22.0f);
        float f16 = t5Var.i0;
        float f17 = dp3;
        float f18 = t5Var.g0;
        rect.set((int) (f16 - f17), (int) (f18 - f17), (int) (f16 + f17), (int) (f18 + f17));
        eVar.h(rect);
        eVar.j(LocaleController.getString(R.string.AccDescrSwitchCamera));
        if (!t5Var.r0 && !t5Var.b()) {
            z4 = true;
        }
        accessibilityNodeInfo.setEnabled(z4);
        if (z4) {
            eVar.b(s0.c.c);
        }
    }
}
