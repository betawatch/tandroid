package ph;

import android.graphics.Rect;
import android.os.SystemClock;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class r5 extends j1.b {
    public final Rect o;
    public final /* synthetic */ s5 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5(s5 s5Var, s5 s5Var2) {
        super(s5Var2);
        this.p = s5Var;
        this.o = new Rect();
    }

    @Override // j1.b
    public final int g(float f10, float f11) {
        s5 s5Var = this.p;
        if (Math.abs(f10 - s5Var.h0) <= AndroidUtilities.dp(30.0f) && Math.abs(f11 - s5Var.g0) <= AndroidUtilities.dp(30.0f) && !s5Var.b() && !s5Var.r0) {
            return 0;
        }
        if (Math.abs(f10 - s5Var.i0) <= AndroidUtilities.dp(30.0f) && Math.abs(f11 - s5Var.g0) <= AndroidUtilities.dp(30.0f) && !s5Var.b() && !s5Var.r0) {
            return 2;
        }
        if (Math.abs(f10 - s5Var.f0) > AndroidUtilities.dp(60.0f) || Math.abs(f11 - s5Var.g0) > AndroidUtilities.dp(60.0f)) {
            return TLObject.FLAG_31;
        }
        return 1;
    }

    @Override // j1.b
    public final void h(ArrayList arrayList) {
        s5 s5Var = this.p;
        if (!s5Var.b() && !s5Var.r0) {
            arrayList.add(0);
        }
        arrayList.add(1);
        if (s5Var.b() || s5Var.r0) {
            return;
        }
        arrayList.add(2);
    }

    @Override // j1.b
    public final boolean k(int i10, int i11) {
        s5 s5Var = this.p;
        if (s5Var.a != null && !s5Var.r0 && i11 == 16) {
            if (i10 != 0) {
                if (i10 == 1) {
                    if (s5Var.b()) {
                        ((a9) s5Var.a).a();
                        return true;
                    }
                    if (s5Var.o0) {
                        s5Var.o0 = false;
                        s5Var.w0 = false;
                        s5Var.s0 = SystemClock.elapsedRealtime();
                        s5Var.r0 = true;
                        ((a9) s5Var.a).d(false);
                        s5Var.invalidate();
                        return true;
                    }
                    if (!s5Var.l0) {
                        ((a9) s5Var.a).c();
                        return true;
                    }
                    if (da.d(((a9) s5Var.a).a)) {
                        s5Var.O = 0L;
                        s5Var.N = System.currentTimeMillis();
                        s5Var.x0 = false;
                        ((a9) s5Var.a).e(new org.telegram.ui.web.q0(this, 21), false);
                        return true;
                    }
                    return true;
                }
                if (i10 == 2 && !s5Var.b()) {
                    s5Var.d(180.0f);
                    ((a9) s5Var.a).b();
                    return true;
                }
            } else if (!s5Var.b()) {
                if (!s5Var.o0 || !s5Var.x0) {
                    da daVar = ((a9) s5Var.a).a;
                    if (daVar.c0 == 0 && !daVar.M1 && !daVar.N1 && da.b(daVar)) {
                        daVar.f(true);
                    }
                    return true;
                }
                s5Var.w0 = false;
                s5Var.D0.d(1.0f, true);
                e3 e3Var = ((a9) s5Var.a).a.Q0;
                e3Var.a.q(LocaleController.getString(R.string.StoryHintPinchToZoom), true, true);
                e3Var.invalidate();
                s5Var.invalidate();
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
        s5 s5Var = this.p;
        if (i10 == 0) {
            int dp = AndroidUtilities.dp(22.0f);
            float f10 = s5Var.h0;
            float f11 = dp;
            float f12 = s5Var.g0;
            rect.set((int) (f10 - f11), (int) (f12 - f11), (int) (f10 + f11), (int) (f12 + f11));
            dVar.h(rect);
            dVar.j((s5Var.o0 && s5Var.x0) ? LocaleController.getString(R.string.AccDescrLockRecording) : LocaleController.getString(R.string.AccDescrCameraGallery));
            if (!s5Var.r0 && !s5Var.b()) {
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
            float f13 = s5Var.f0;
            float f14 = dp2;
            float f15 = s5Var.g0;
            rect.set((int) (f13 - f14), (int) (f15 - f14), (int) (f13 + f14), (int) (f15 + f14));
            dVar.h(rect);
            dVar.j(s5Var.b() ? LocaleController.getString(R.string.Send) : s5Var.o0 ? LocaleController.getString(R.string.AccDescrStopRecording) : s5Var.l0 ? LocaleController.getString(R.string.AccDescrStartRecording) : LocaleController.getString(R.string.AccDescrTakePhoto));
            accessibilityNodeInfo.setEnabled(!s5Var.r0);
            if (s5Var.r0) {
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
        float f16 = s5Var.i0;
        float f17 = dp3;
        float f18 = s5Var.g0;
        rect.set((int) (f16 - f17), (int) (f18 - f17), (int) (f16 + f17), (int) (f18 + f17));
        dVar.h(rect);
        dVar.j(LocaleController.getString(R.string.AccDescrSwitchCamera));
        if (!s5Var.r0 && !s5Var.b()) {
            z4 = true;
        }
        accessibilityNodeInfo.setEnabled(z4);
        if (z4) {
            dVar.b(s0.c.c);
        }
    }
}
