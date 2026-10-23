package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class z21 extends org.telegram.ui.Components.im0 {
    public final Context c;

    public z21(Context context) {
        this.c = context;
    }

    @Override // org.telegram.ui.Components.im0
    public final boolean D(s4.b1 b1Var) {
        int b10 = b1Var.b();
        if (b10 != 1) {
            ti.a aVar = ti.e.d;
            aVar.a();
            if (!aVar.d) {
                return false;
            }
            if (b10 != 2 && b10 != 3 && b10 != 4 && b10 != 5 && b10 != 8) {
                return false;
            }
        }
        return true;
    }

    @Override // s4.g0
    public final int h() {
        return 7;
    }

    @Override // s4.g0
    public final int j(int i10) {
        if (i10 == 0 || i10 == 7) {
            return 0;
        }
        if (i10 == 1 || i10 == 8) {
            return 1;
        }
        return (i10 == 6 || i10 == 9) ? 3 : 2;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        ti.a aVar = ti.e.d;
        aVar.a();
        boolean z10 = aVar.d;
        int i11 = b1Var.f;
        if (i11 == 0) {
            ((org.telegram.ui.Cells.l4) b1Var.a).setText(i10 == 0 ? LocaleController.getString(R.string.RoundVideoGeneral) : LocaleController.getString(R.string.RoundVideoComposition));
            return;
        }
        if (i11 == 1) {
            org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) b1Var.a;
            v8Var.setEnabled(i10 == 1 || z10);
            if (i10 == 1) {
                v8Var.f(LocaleController.getString(R.string.RoundVideoUseNewRecorder), z10, false);
                return;
            }
            String string = LocaleController.getString(R.string.RoundVideoCompositionEnabled);
            ti.a aVar2 = ti.e.i;
            aVar2.a();
            v8Var.f(string, aVar2.d, false);
            return;
        }
        if (i11 != 2) {
            ((org.telegram.ui.Cells.d9) b1Var.a).setText(i10 == 6 ? LocaleController.getString(R.string.RoundVideoGeneralInfo) : LocaleController.getString(R.string.RoundVideoCompositionInfo));
            return;
        }
        org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) b1Var.a;
        baVar.setEnabled(z10);
        if (i10 == 2) {
            baVar.c(LocaleController.getString(R.string.RoundVideoOutputResolution), a1.g.n(((si.q0) ti.e.e.a()).a, "p", new StringBuilder()), false, true);
            return;
        }
        if (i10 == 3) {
            String string2 = LocaleController.getString(R.string.RoundVideoCameraResolution);
            si.m0 m0Var = (si.m0) ti.e.f.a();
            baVar.c(string2, m0Var == si.m0.a ? LocaleController.getString(R.string.RoundVideoCameraResolutionHigh) : m0Var == si.m0.b ? LocaleController.getString(R.string.RoundVideoCameraResolutionMedium) : LocaleController.getString(R.string.RoundVideoCameraResolutionLow), false, true);
        } else if (i10 == 4) {
            baVar.c(LocaleController.getString(R.string.RoundVideoFrameRate), a1.g.n(((si.n0) ti.e.g.a()).a, " FPS", new StringBuilder()), false, true);
        } else {
            baVar.c(LocaleController.getString(R.string.RoundVideoBitrate), a31.U(ti.e.h.a()), false, false);
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        Context context = this.c;
        if (i10 == 0) {
            frameLayout = new org.telegram.ui.Cells.l4(context);
        } else if (i10 == 1) {
            frameLayout = new org.telegram.ui.Cells.v8(context);
        } else if (i10 == 2) {
            org.telegram.ui.Cells.ba baVar = new org.telegram.ui.Cells.ba(context);
            baVar.setCanDisable(true);
            frameLayout = baVar;
        } else {
            frameLayout = new org.telegram.ui.Cells.d9(context);
        }
        frameLayout.setLayoutParams(new s4.o0(-1, -2));
        return new org.telegram.ui.Components.tl0(frameLayout);
    }
}
