package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class vd1 extends s4.b0 {
    public boolean I;
    public final /* synthetic */ te1 J;

    public vd1(te1 te1Var) {
        this.J = te1Var;
    }

    @Override // s4.b0, s4.n0
    public final void b0(qf.e eVar, s4.y0 y0Var) {
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            try {
                super.b0(eVar, y0Var);
                return;
            } catch (IndexOutOfBoundsException unused) {
                throw new RuntimeException("Inconsistency detected. ");
            }
        }
        try {
            super.b0(eVar, y0Var);
        } catch (IndexOutOfBoundsException e) {
            FileLog.e(e);
            AndroidUtilities.runOnUIThread(new sy0(this, 19));
        }
    }

    @Override // s4.b0
    public final void b1(View view, View view2, int i10, int i11) {
        this.I = true;
        super.b1(view, view2, i10, i11);
        this.I = false;
    }

    @Override // s4.b0
    public final void h1(int i10, int i11) {
        if (this.I) {
            i11 -= this.J.N.getPaddingTop();
        }
        super.h1(i10, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c8  */
    @Override // s4.b0, s4.n0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int o0(int i10, qf.e eVar, s4.y0 y0Var) {
        int i11;
        ee1 ee1Var;
        kw kwVar;
        float f7;
        int i12;
        te1 te1Var = this.J;
        ee1 ee1Var2 = te1Var.N;
        boolean z10 = false;
        if (ee1Var2.V1) {
            return 0;
        }
        boolean z11 = ee1Var2.getScrollState() == 1;
        int paddingTop = te1Var.N.getPaddingTop();
        if (i10 < 0 && te1Var.x > 0 && te1Var.y == 2) {
            te1Var.N.setOverScrollMode(0);
            int L0 = te1Var.F.L0();
            if (L0 == 0) {
                View m10 = te1Var.F.m(L0);
                if (m10 != null) {
                    m10.setTranslationX(0.0f);
                }
                if (m10 != null && m10.getBottom() - paddingTop <= AndroidUtilities.dp(1.0f)) {
                    L0 = 1;
                }
            }
            if (!z11) {
                View m11 = te1Var.F.m(L0);
                if (m11 != null) {
                    int v = com.google.android.gms.internal.play_billing.k3.v(L0, 1, AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 78.0f : 72.0f) + 1, -(m11.getTop() - paddingTop));
                    if (v < Math.abs(i10)) {
                        i11 = -v;
                    }
                }
            } else if (L0 == 0) {
                View m12 = te1Var.F.m(L0);
                float top = ((m12.getTop() - paddingTop) / m12.getMeasuredHeight()) + 1.0f;
                if (top > 1.0f) {
                    top = 1.0f;
                }
                te1Var.N.setOverScrollMode(2);
                i11 = (int) com.google.android.gms.internal.play_billing.k3.B(top, 0.25f, 0.45f, i10);
                if (i11 > -1) {
                    i11 = -1;
                }
            }
            ee1Var = te1Var.N;
            if (ee1Var.d3 != 0.0f && i10 > 0 && z11) {
                f7 = ((int) r14) - i10;
                if (f7 >= 0.0f) {
                    i12 = (int) f7;
                    f7 = 0.0f;
                } else {
                    i12 = 0;
                }
                ee1Var.setViewsOffset(f7);
                i11 = i12;
            }
            if (te1Var.y != 0 || te1Var.x <= 0) {
                return super.o0(i11, eVar, y0Var);
            }
            int o02 = super.o0(i11, eVar, y0Var);
            kw kwVar2 = te1Var.w;
            if (kwVar2 != null) {
                kwVar2.a = o02;
            }
            int L02 = te1Var.F.L0();
            View m13 = L02 == 0 ? te1Var.F.m(L02) : null;
            if (m13 != null) {
                m13.setTranslationX(0.0f);
            }
            if (L02 != 0 || m13 == null || m13.getBottom() - paddingTop < AndroidUtilities.dp(4.0f)) {
                te1Var.Y = 0L;
                te1Var.Z = false;
                te1Var.y = 2;
                kw kwVar3 = te1Var.w;
                if (kwVar3 != null) {
                    ValueAnimator valueAnimator = kwVar3.z;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    org.telegram.ui.Cells.r2 r2Var = kwVar3.H;
                    if (r2Var != null) {
                        r2Var.removeCallbacks(kwVar3.d0);
                    }
                    kwVar3.x = 0.0f;
                    kwVar3.y = false;
                    kwVar3.e0 = false;
                    te1Var.w.f(0.0f);
                    te1Var.w.I = te1Var.N;
                }
            } else {
                if (te1Var.Y == 0) {
                    te1Var.Y = System.currentTimeMillis();
                }
                if (te1Var.y == 2 && (kwVar = te1Var.w) != null) {
                    kwVar.h();
                }
                float top2 = ((m13.getTop() - paddingTop) / m13.getMeasuredHeight()) + 1.0f;
                if (top2 > 1.0f) {
                    top2 = 1.0f;
                }
                long currentTimeMillis = System.currentTimeMillis() - te1Var.Y;
                if (top2 > 0.85f && currentTimeMillis > 220) {
                    z10 = true;
                }
                if (te1Var.Z != z10) {
                    te1Var.Z = z10;
                    if (te1Var.y == 2) {
                        try {
                            te1Var.N.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        kw kwVar4 = te1Var.w;
                        if (kwVar4 != null) {
                            kwVar4.a(z10);
                        }
                    }
                }
                if (te1Var.y == 2 && i11 - o02 != 0 && i10 < 0 && z11) {
                    float dp = 1.0f - (te1Var.N.d3 / AndroidUtilities.dp(72.0f));
                    ee1 ee1Var3 = te1Var.N;
                    ee1Var3.setViewsOffset(ee1Var3.d3 - ((i10 * 0.2f) * dp));
                }
                kw kwVar5 = te1Var.w;
                if (kwVar5 != null) {
                    kwVar5.f(top2);
                    te1Var.w.I = te1Var.N;
                }
            }
            if (m13 != null) {
                m13.invalidate();
            }
            return o02;
        }
        i11 = i10;
        ee1Var = te1Var.N;
        if (ee1Var.d3 != 0.0f) {
            f7 = ((int) r14) - i10;
            if (f7 >= 0.0f) {
            }
            ee1Var.setViewsOffset(f7);
            i11 = i12;
        }
        if (te1Var.y != 0) {
        }
        return super.o0(i11, eVar, y0Var);
    }

    @Override // s4.b0, s4.n0
    public final void v0(RecyclerView recyclerView, s4.y0 y0Var, int i10) {
        if (this.J.x > 0 && i10 == 1) {
            super.v0(recyclerView, y0Var, i10);
            return;
        }
        li.n nVar = new li.n(recyclerView.getContext(), 0);
        nVar.a = i10;
        w0(nVar);
    }
}
