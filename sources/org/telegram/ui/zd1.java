package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class zd1 extends s4.b0 {
    public boolean I;
    public final /* synthetic */ ye1 J;

    public zd1(ye1 ye1Var) {
        this.J = ye1Var;
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
            AndroidUtilities.runOnUIThread(new my0(this, 20));
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
        ie1 ie1Var;
        kw kwVar;
        float f7;
        int i12;
        ye1 ye1Var = this.J;
        ie1 ie1Var2 = ye1Var.N;
        boolean z10 = false;
        if (ie1Var2.V1) {
            return 0;
        }
        boolean z11 = ie1Var2.getScrollState() == 1;
        int paddingTop = ye1Var.N.getPaddingTop();
        if (i10 < 0 && ye1Var.x > 0 && ye1Var.y == 2) {
            ye1Var.N.setOverScrollMode(0);
            int L0 = ye1Var.F.L0();
            if (L0 == 0) {
                View m10 = ye1Var.F.m(L0);
                if (m10 != null) {
                    m10.setTranslationX(0.0f);
                }
                if (m10 != null && m10.getBottom() - paddingTop <= AndroidUtilities.dp(1.0f)) {
                    L0 = 1;
                }
            }
            if (!z11) {
                View m11 = ye1Var.F.m(L0);
                if (m11 != null) {
                    int v = com.google.android.gms.internal.play_billing.k3.v(L0, 1, AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 78.0f : 72.0f) + 1, -(m11.getTop() - paddingTop));
                    if (v < Math.abs(i10)) {
                        i11 = -v;
                    }
                }
            } else if (L0 == 0) {
                View m12 = ye1Var.F.m(L0);
                float top = ((m12.getTop() - paddingTop) / m12.getMeasuredHeight()) + 1.0f;
                if (top > 1.0f) {
                    top = 1.0f;
                }
                ye1Var.N.setOverScrollMode(2);
                i11 = (int) com.google.android.gms.internal.play_billing.k3.B(top, 0.25f, 0.45f, i10);
                if (i11 > -1) {
                    i11 = -1;
                }
            }
            ie1Var = ye1Var.N;
            if (ie1Var.g3 != 0.0f && i10 > 0 && z11) {
                f7 = ((int) r14) - i10;
                if (f7 >= 0.0f) {
                    i12 = (int) f7;
                    f7 = 0.0f;
                } else {
                    i12 = 0;
                }
                ie1Var.setViewsOffset(f7);
                i11 = i12;
            }
            if (ye1Var.y != 0 || ye1Var.x <= 0) {
                return super.o0(i11, eVar, y0Var);
            }
            int o02 = super.o0(i11, eVar, y0Var);
            kw kwVar2 = ye1Var.w;
            if (kwVar2 != null) {
                kwVar2.a = o02;
            }
            int L02 = ye1Var.F.L0();
            View m13 = L02 == 0 ? ye1Var.F.m(L02) : null;
            if (m13 != null) {
                m13.setTranslationX(0.0f);
            }
            if (L02 != 0 || m13 == null || m13.getBottom() - paddingTop < AndroidUtilities.dp(4.0f)) {
                ye1Var.Y = 0L;
                ye1Var.Z = false;
                ye1Var.y = 2;
                kw kwVar3 = ye1Var.w;
                if (kwVar3 != null) {
                    ValueAnimator valueAnimator = kwVar3.z;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    org.telegram.ui.Cells.q2 q2Var = kwVar3.H;
                    if (q2Var != null) {
                        q2Var.removeCallbacks(kwVar3.d0);
                    }
                    kwVar3.x = 0.0f;
                    kwVar3.y = false;
                    kwVar3.e0 = false;
                    ye1Var.w.f(0.0f);
                    ye1Var.w.I = ye1Var.N;
                }
            } else {
                if (ye1Var.Y == 0) {
                    ye1Var.Y = System.currentTimeMillis();
                }
                if (ye1Var.y == 2 && (kwVar = ye1Var.w) != null) {
                    kwVar.h();
                }
                float top2 = ((m13.getTop() - paddingTop) / m13.getMeasuredHeight()) + 1.0f;
                if (top2 > 1.0f) {
                    top2 = 1.0f;
                }
                long currentTimeMillis = System.currentTimeMillis() - ye1Var.Y;
                if (top2 > 0.85f && currentTimeMillis > 220) {
                    z10 = true;
                }
                if (ye1Var.Z != z10) {
                    ye1Var.Z = z10;
                    if (ye1Var.y == 2) {
                        try {
                            ye1Var.N.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        kw kwVar4 = ye1Var.w;
                        if (kwVar4 != null) {
                            kwVar4.a(z10);
                        }
                    }
                }
                if (ye1Var.y == 2 && i11 - o02 != 0 && i10 < 0 && z11) {
                    float dp = 1.0f - (ye1Var.N.g3 / AndroidUtilities.dp(72.0f));
                    ie1 ie1Var3 = ye1Var.N;
                    ie1Var3.setViewsOffset(ie1Var3.g3 - ((i10 * 0.2f) * dp));
                }
                kw kwVar5 = ye1Var.w;
                if (kwVar5 != null) {
                    kwVar5.f(top2);
                    ye1Var.w.I = ye1Var.N;
                }
            }
            if (m13 != null) {
                m13.invalidate();
            }
            return o02;
        }
        i11 = i10;
        ie1Var = ye1Var.N;
        if (ie1Var.g3 != 0.0f) {
            f7 = ((int) r14) - i10;
            if (f7 >= 0.0f) {
            }
            ie1Var.setViewsOffset(f7);
            i11 = i12;
        }
        if (ye1Var.y != 0) {
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
