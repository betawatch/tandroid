package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class xd1 extends f2.m0 {
    public boolean I;
    public final /* synthetic */ we1 J;

    public xd1(we1 we1Var) {
        this.J = we1Var;
    }

    @Override // f2.m0, f2.z0
    public final void b0(f2.g1 g1Var, f2.n1 n1Var) {
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            try {
                super.b0(g1Var, n1Var);
                return;
            } catch (IndexOutOfBoundsException unused) {
                throw new RuntimeException("Inconsistency detected. ");
            }
        }
        try {
            super.b0(g1Var, n1Var);
        } catch (IndexOutOfBoundsException e10) {
            FileLog.e(e10);
            AndroidUtilities.runOnUIThread(new ky0(this, 20));
        }
    }

    @Override // f2.m0
    public final void b1(View view, View view2, int i9, int i10) {
        this.I = true;
        super.b1(view, view2, i9, i10);
        this.I = false;
    }

    @Override // f2.m0
    public final void h1(int i9, int i10) {
        if (this.I) {
            i10 -= this.J.J.getPaddingTop();
        }
        super.h1(i9, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ca  */
    @Override // f2.m0, f2.z0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int o0(int i9, f2.g1 g1Var, f2.n1 n1Var) {
        int i10;
        ge1 ge1Var;
        kw kwVar;
        float f10;
        int i11;
        we1 we1Var = this.J;
        ge1 ge1Var2 = we1Var.J;
        boolean z10 = false;
        if (ge1Var2.T1) {
            return 0;
        }
        boolean z11 = ge1Var2.getScrollState() == 1;
        int paddingTop = we1Var.J.getPaddingTop();
        if (i9 < 0 && we1Var.x > 0 && we1Var.y == 2) {
            we1Var.J.setOverScrollMode(0);
            int L0 = we1Var.B.L0();
            if (L0 == 0) {
                View m10 = we1Var.B.m(L0);
                if (m10 != null) {
                    m10.setTranslationX(0.0f);
                }
                if (m10 != null && m10.getBottom() - paddingTop <= AndroidUtilities.dp(1.0f)) {
                    L0 = 1;
                }
            }
            if (!z11) {
                View m11 = we1Var.B.m(L0);
                if (m11 != null) {
                    int e10 = e2.c.e(L0, 1, AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 78.0f : 72.0f) + 1, -(m11.getTop() - paddingTop));
                    if (e10 < Math.abs(i9)) {
                        i10 = -e10;
                    }
                }
            } else if (L0 == 0) {
                View m12 = we1Var.B.m(L0);
                float top = ((m12.getTop() - paddingTop) / m12.getMeasuredHeight()) + 1.0f;
                if (top > 1.0f) {
                    top = 1.0f;
                }
                we1Var.J.setOverScrollMode(2);
                i10 = (int) ((0.45f - (top * 0.25f)) * i9);
                if (i10 > -1) {
                    i10 = -1;
                }
            }
            ge1Var = we1Var.J;
            if (ge1Var.b3 != 0.0f && i9 > 0 && z11) {
                f10 = ((int) r15) - i9;
                if (f10 >= 0.0f) {
                    i11 = (int) f10;
                    f10 = 0.0f;
                } else {
                    i11 = 0;
                }
                ge1Var.setViewsOffset(f10);
                i10 = i11;
            }
            if (we1Var.y != 0 || we1Var.x <= 0) {
                return super.o0(i10, g1Var, n1Var);
            }
            int o02 = super.o0(i10, g1Var, n1Var);
            kw kwVar2 = we1Var.w;
            if (kwVar2 != null) {
                kwVar2.a = o02;
            }
            int L02 = we1Var.B.L0();
            View m13 = L02 == 0 ? we1Var.B.m(L02) : null;
            if (m13 != null) {
                m13.setTranslationX(0.0f);
            }
            int i12 = i10;
            if (L02 != 0 || m13 == null || m13.getBottom() - paddingTop < AndroidUtilities.dp(4.0f)) {
                we1Var.U = 0L;
                we1Var.V = false;
                we1Var.y = 2;
                kw kwVar3 = we1Var.w;
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
                    we1Var.w.f(0.0f);
                    we1Var.w.I = we1Var.J;
                }
            } else {
                if (we1Var.U == 0) {
                    we1Var.U = System.currentTimeMillis();
                }
                if (we1Var.y == 2 && (kwVar = we1Var.w) != null) {
                    kwVar.h();
                }
                float top2 = ((m13.getTop() - paddingTop) / m13.getMeasuredHeight()) + 1.0f;
                if (top2 > 1.0f) {
                    top2 = 1.0f;
                }
                long currentTimeMillis = System.currentTimeMillis() - we1Var.U;
                if (top2 > 0.85f && currentTimeMillis > 220) {
                    z10 = true;
                }
                if (we1Var.V != z10) {
                    we1Var.V = z10;
                    if (we1Var.y == 2) {
                        try {
                            we1Var.J.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        kw kwVar4 = we1Var.w;
                        if (kwVar4 != null) {
                            kwVar4.a(z10);
                        }
                    }
                }
                if (we1Var.y == 2 && i12 - o02 != 0 && i9 < 0 && z11) {
                    float dp = 1.0f - (we1Var.J.b3 / AndroidUtilities.dp(72.0f));
                    ge1 ge1Var3 = we1Var.J;
                    ge1Var3.setViewsOffset(ge1Var3.b3 - ((i9 * 0.2f) * dp));
                }
                kw kwVar5 = we1Var.w;
                if (kwVar5 != null) {
                    kwVar5.f(top2);
                    we1Var.w.I = we1Var.J;
                }
            }
            if (m13 != null) {
                m13.invalidate();
            }
            return o02;
        }
        i10 = i9;
        ge1Var = we1Var.J;
        if (ge1Var.b3 != 0.0f) {
            f10 = ((int) r15) - i9;
            if (f10 >= 0.0f) {
            }
            ge1Var.setViewsOffset(f10);
            i10 = i11;
        }
        if (we1Var.y != 0) {
        }
        return super.o0(i10, g1Var, n1Var);
    }

    @Override // f2.m0, f2.z0
    public final void v0(RecyclerView recyclerView, f2.n1 n1Var, int i9) {
        if (this.J.x > 0 && i9 == 1) {
            super.v0(recyclerView, n1Var, i9);
            return;
        }
        rh.n nVar = new rh.n(recyclerView.getContext(), 0);
        nVar.a = i9;
        w0(nVar);
    }
}
