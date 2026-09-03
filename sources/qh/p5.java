package qh;

import android.graphics.Rect;
import android.os.SystemClock;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class p5 extends j1.b {
    public final Rect o;
    public final /* synthetic */ q5 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5(q5 q5Var, q5 q5Var2) {
        super(q5Var2);
        this.p = q5Var;
        this.o = new Rect();
    }

    @Override // j1.b
    public final int g(float f10, float f11) {
        q5 q5Var = this.p;
        if (Math.abs(f10 - q5Var.h0) <= AndroidUtilities.dp(30.0f) && Math.abs(f11 - q5Var.g0) <= AndroidUtilities.dp(30.0f) && !q5Var.b() && !q5Var.r0) {
            return 0;
        }
        if (Math.abs(f10 - q5Var.i0) <= AndroidUtilities.dp(30.0f) && Math.abs(f11 - q5Var.g0) <= AndroidUtilities.dp(30.0f) && !q5Var.b() && !q5Var.r0) {
            return 2;
        }
        if (Math.abs(f10 - q5Var.f0) > AndroidUtilities.dp(60.0f) || Math.abs(f11 - q5Var.g0) > AndroidUtilities.dp(60.0f)) {
            return TLObject.FLAG_31;
        }
        return 1;
    }

    @Override // j1.b
    public final void h(ArrayList arrayList) {
        q5 q5Var = this.p;
        if (!q5Var.b() && !q5Var.r0) {
            arrayList.add(0);
        }
        arrayList.add(1);
        if (q5Var.b() || q5Var.r0) {
            return;
        }
        arrayList.add(2);
    }

    @Override // j1.b
    public final boolean k(int i10, int i11) {
        q5 q5Var = this.p;
        if (q5Var.a != null && !q5Var.r0 && i11 == 16) {
            if (i10 != 0) {
                if (i10 == 1) {
                    if (q5Var.b()) {
                        ((x8) q5Var.a).a();
                        return true;
                    }
                    if (q5Var.o0) {
                        q5Var.o0 = false;
                        q5Var.w0 = false;
                        q5Var.s0 = SystemClock.elapsedRealtime();
                        q5Var.r0 = true;
                        ((x8) q5Var.a).d(false);
                        q5Var.invalidate();
                        return true;
                    }
                    if (!q5Var.l0) {
                        ((x8) q5Var.a).c();
                        return true;
                    }
                    if (ba.d(((x8) q5Var.a).a)) {
                        q5Var.O = 0L;
                        q5Var.N = System.currentTimeMillis();
                        q5Var.x0 = false;
                        ((x8) q5Var.a).e(new org.telegram.ui.web.s0(this, 22), false);
                        return true;
                    }
                    return true;
                }
                if (i10 == 2 && !q5Var.b()) {
                    q5Var.d(180.0f);
                    ((x8) q5Var.a).b();
                    return true;
                }
            } else if (!q5Var.b()) {
                if (!q5Var.o0 || !q5Var.x0) {
                    ba baVar = ((x8) q5Var.a).a;
                    if (baVar.c0 == 0 && !baVar.M1 && !baVar.N1 && ba.b(baVar)) {
                        baVar.f(true);
                    }
                    return true;
                }
                q5Var.w0 = false;
                q5Var.D0.d(1.0f, true);
                d3 d3Var = ((x8) q5Var.a).a.Q0;
                d3Var.a.q(LocaleController.getString(R.string.StoryHintPinchToZoom), true, true);
                d3Var.invalidate();
                q5Var.invalidate();
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
        q5 q5Var = this.p;
        if (i10 == 0) {
            int dp = AndroidUtilities.dp(22.0f);
            float f10 = q5Var.h0;
            float f11 = dp;
            float f12 = q5Var.g0;
            rect.set((int) (f10 - f11), (int) (f12 - f11), (int) (f10 + f11), (int) (f12 + f11));
            dVar.h(rect);
            dVar.j((q5Var.o0 && q5Var.x0) ? LocaleController.getString(R.string.AccDescrLockRecording) : LocaleController.getString(R.string.AccDescrCameraGallery));
            if (!q5Var.r0 && !q5Var.b()) {
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
            float f13 = q5Var.f0;
            float f14 = dp2;
            float f15 = q5Var.g0;
            rect.set((int) (f13 - f14), (int) (f15 - f14), (int) (f13 + f14), (int) (f15 + f14));
            dVar.h(rect);
            dVar.j(q5Var.b() ? LocaleController.getString(R.string.Send) : q5Var.o0 ? LocaleController.getString(R.string.AccDescrStopRecording) : q5Var.l0 ? LocaleController.getString(R.string.AccDescrStartRecording) : LocaleController.getString(R.string.AccDescrTakePhoto));
            accessibilityNodeInfo.setEnabled(!q5Var.r0);
            if (q5Var.r0) {
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
        float f16 = q5Var.i0;
        float f17 = dp3;
        float f18 = q5Var.g0;
        rect.set((int) (f16 - f17), (int) (f18 - f17), (int) (f16 + f17), (int) (f18 + f17));
        dVar.h(rect);
        dVar.j(LocaleController.getString(R.string.AccDescrSwitchCamera));
        if (!q5Var.r0 && !q5Var.b()) {
            z4 = true;
        }
        accessibilityNodeInfo.setEnabled(z4);
        if (z4) {
            dVar.b(s0.c.c);
        }
    }
}
