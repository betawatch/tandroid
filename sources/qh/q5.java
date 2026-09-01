package qh;

import android.graphics.Rect;
import android.os.SystemClock;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class q5 extends j1.b {
    public final Rect o;
    public final /* synthetic */ r5 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q5(r5 r5Var, r5 r5Var2) {
        super(r5Var2);
        this.p = r5Var;
        this.o = new Rect();
    }

    @Override // j1.b
    public final int g(float f10, float f11) {
        r5 r5Var = this.p;
        if (Math.abs(f10 - r5Var.h0) <= AndroidUtilities.dp(30.0f) && Math.abs(f11 - r5Var.g0) <= AndroidUtilities.dp(30.0f) && !r5Var.b() && !r5Var.r0) {
            return 0;
        }
        if (Math.abs(f10 - r5Var.i0) <= AndroidUtilities.dp(30.0f) && Math.abs(f11 - r5Var.g0) <= AndroidUtilities.dp(30.0f) && !r5Var.b() && !r5Var.r0) {
            return 2;
        }
        if (Math.abs(f10 - r5Var.f0) > AndroidUtilities.dp(60.0f) || Math.abs(f11 - r5Var.g0) > AndroidUtilities.dp(60.0f)) {
            return TLObject.FLAG_31;
        }
        return 1;
    }

    @Override // j1.b
    public final void h(ArrayList arrayList) {
        r5 r5Var = this.p;
        if (!r5Var.b() && !r5Var.r0) {
            arrayList.add(0);
        }
        arrayList.add(1);
        if (r5Var.b() || r5Var.r0) {
            return;
        }
        arrayList.add(2);
    }

    @Override // j1.b
    public final boolean k(int i10, int i11) {
        r5 r5Var = this.p;
        if (r5Var.a != null && !r5Var.r0 && i11 == 16) {
            if (i10 != 0) {
                if (i10 == 1) {
                    if (r5Var.b()) {
                        ((y8) r5Var.a).a();
                        return true;
                    }
                    if (r5Var.o0) {
                        r5Var.o0 = false;
                        r5Var.w0 = false;
                        r5Var.s0 = SystemClock.elapsedRealtime();
                        r5Var.r0 = true;
                        ((y8) r5Var.a).d(false);
                        r5Var.invalidate();
                        return true;
                    }
                    if (!r5Var.l0) {
                        ((y8) r5Var.a).c();
                        return true;
                    }
                    if (ca.d(((y8) r5Var.a).a)) {
                        r5Var.O = 0L;
                        r5Var.N = System.currentTimeMillis();
                        r5Var.x0 = false;
                        ((y8) r5Var.a).e(new org.telegram.ui.web.s0(this, 22), false);
                        return true;
                    }
                    return true;
                }
                if (i10 == 2 && !r5Var.b()) {
                    r5Var.d(180.0f);
                    ((y8) r5Var.a).b();
                    return true;
                }
            } else if (!r5Var.b()) {
                if (!r5Var.o0 || !r5Var.x0) {
                    ca caVar = ((y8) r5Var.a).a;
                    if (caVar.c0 == 0 && !caVar.M1 && !caVar.N1 && ca.b(caVar)) {
                        caVar.f(true);
                    }
                    return true;
                }
                r5Var.w0 = false;
                r5Var.D0.d(1.0f, true);
                e3 e3Var = ((y8) r5Var.a).a.Q0;
                e3Var.a.q(LocaleController.getString(R.string.StoryHintPinchToZoom), true, true);
                e3Var.invalidate();
                r5Var.invalidate();
                return true;
            }
        }
        return false;
    }

    @Override // j1.b
    public final void l(int i10, s0.d dVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.a;
        dVar.i("android.widget.Button");
        boolean z4 = false;
        Rect rect = this.o;
        r5 r5Var = this.p;
        if (i10 == 0) {
            int dp = AndroidUtilities.dp(22.0f);
            float f10 = r5Var.h0;
            float f11 = dp;
            float f12 = r5Var.g0;
            rect.set((int) (f10 - f11), (int) (f12 - f11), (int) (f10 + f11), (int) (f12 + f11));
            dVar.h(rect);
            dVar.j((r5Var.o0 && r5Var.x0) ? LocaleController.getString(R.string.AccDescrLockRecording) : LocaleController.getString(R.string.AccDescrCameraGallery));
            if (!r5Var.r0 && !r5Var.b()) {
                z4 = true;
            }
            accessibilityNodeInfo.setEnabled(z4);
            if (z4) {
                dVar.b(s0.c.c);
                return;
            }
            return;
        }
        if (i10 == 1) {
            int dp2 = AndroidUtilities.dp(40.0f);
            float f13 = r5Var.f0;
            float f14 = dp2;
            float f15 = r5Var.g0;
            rect.set((int) (f13 - f14), (int) (f15 - f14), (int) (f13 + f14), (int) (f15 + f14));
            dVar.h(rect);
            dVar.j(r5Var.b() ? LocaleController.getString(R.string.Send) : r5Var.o0 ? LocaleController.getString(R.string.AccDescrStopRecording) : r5Var.l0 ? LocaleController.getString(R.string.AccDescrStartRecording) : LocaleController.getString(R.string.AccDescrTakePhoto));
            accessibilityNodeInfo.setEnabled(!r5Var.r0);
            if (r5Var.r0) {
                return;
            }
            dVar.b(s0.c.c);
            return;
        }
        if (i10 != 2) {
            rect.set(0, 0, 1, 1);
            dVar.h(rect);
            dVar.p(false);
            dVar.j("");
            return;
        }
        int dp3 = AndroidUtilities.dp(22.0f);
        float f16 = r5Var.i0;
        float f17 = dp3;
        float f18 = r5Var.g0;
        rect.set((int) (f16 - f17), (int) (f18 - f17), (int) (f16 + f17), (int) (f18 + f17));
        dVar.h(rect);
        dVar.j(LocaleController.getString(R.string.AccDescrSwitchCamera));
        if (!r5Var.r0 && !r5Var.b()) {
            z4 = true;
        }
        accessibilityNodeInfo.setEnabled(z4);
        if (z4) {
            dVar.b(s0.c.c);
        }
    }
}
