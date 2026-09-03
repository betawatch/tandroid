package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class te1 extends f2.j0 {
    public boolean I;
    public final /* synthetic */ sf1 J;

    public te1(sf1 sf1Var) {
        this.J = sf1Var;
    }

    @Override // f2.j0, f2.w0
    public final void b0(bf.f fVar, f2.j1 j1Var) {
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            try {
                super.b0(fVar, j1Var);
                return;
            } catch (IndexOutOfBoundsException unused) {
                throw new RuntimeException("Inconsistency detected. ");
            }
        }
        try {
            super.b0(fVar, j1Var);
        } catch (IndexOutOfBoundsException e6) {
            FileLog.e(e6);
            AndroidUtilities.runOnUIThread(new sz0(this, 18));
        }
    }

    @Override // f2.j0
    public final void b1(View view, View view2, int i10, int i11) {
        this.I = true;
        super.b1(view, view2, i10, i11);
        this.I = false;
    }

    @Override // f2.j0
    public final void h1(int i10, int i11) {
        if (this.I) {
            i11 -= this.J.K.getPaddingTop();
        }
        super.h1(i10, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ca  */
    @Override // f2.j0, f2.w0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int o0(int i10, bf.f fVar, f2.j1 j1Var) {
        int i11;
        df1 df1Var;
        ww wwVar;
        float f10;
        int i12;
        sf1 sf1Var = this.J;
        df1 df1Var2 = sf1Var.K;
        boolean z4 = false;
        if (df1Var2.U1) {
            return 0;
        }
        boolean z10 = df1Var2.getScrollState() == 1;
        int paddingTop = sf1Var.K.getPaddingTop();
        if (i10 < 0 && sf1Var.x > 0 && sf1Var.y == 2) {
            sf1Var.K.setOverScrollMode(0);
            int L0 = sf1Var.C.L0();
            if (L0 == 0) {
                View m9 = sf1Var.C.m(L0);
                if (m9 != null) {
                    m9.setTranslationX(0.0f);
                }
                if (m9 != null && m9.getBottom() - paddingTop <= AndroidUtilities.dp(1.0f)) {
                    L0 = 1;
                }
            }
            if (!z10) {
                View m10 = sf1Var.C.m(L0);
                if (m10 != null) {
                    int e6 = e2.c.e(L0, 1, AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 78.0f : 72.0f) + 1, -(m10.getTop() - paddingTop));
                    if (e6 < Math.abs(i10)) {
                        i11 = -e6;
                    }
                }
            } else if (L0 == 0) {
                View m11 = sf1Var.C.m(L0);
                float top = ((m11.getTop() - paddingTop) / m11.getMeasuredHeight()) + 1.0f;
                if (top > 1.0f) {
                    top = 1.0f;
                }
                sf1Var.K.setOverScrollMode(2);
                i11 = (int) ((0.45f - (top * 0.25f)) * i10);
                if (i11 > -1) {
                    i11 = -1;
                }
            }
            df1Var = sf1Var.K;
            if (df1Var.c3 != 0.0f && i10 > 0 && z10) {
                f10 = ((int) r15) - i10;
                if (f10 >= 0.0f) {
                    i12 = (int) f10;
                    f10 = 0.0f;
                } else {
                    i12 = 0;
                }
                df1Var.setViewsOffset(f10);
                i11 = i12;
            }
            if (sf1Var.y != 0 || sf1Var.x <= 0) {
                return super.o0(i11, fVar, j1Var);
            }
            int o02 = super.o0(i11, fVar, j1Var);
            ww wwVar2 = sf1Var.w;
            if (wwVar2 != null) {
                wwVar2.a = o02;
            }
            int L02 = sf1Var.C.L0();
            View m12 = L02 == 0 ? sf1Var.C.m(L02) : null;
            if (m12 != null) {
                m12.setTranslationX(0.0f);
            }
            int i13 = i11;
            if (L02 != 0 || m12 == null || m12.getBottom() - paddingTop < AndroidUtilities.dp(4.0f)) {
                sf1Var.V = 0L;
                sf1Var.W = false;
                sf1Var.y = 2;
                ww wwVar3 = sf1Var.w;
                if (wwVar3 != null) {
                    ValueAnimator valueAnimator = wwVar3.z;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    org.telegram.ui.Cells.r2 r2Var = wwVar3.H;
                    if (r2Var != null) {
                        r2Var.removeCallbacks(wwVar3.d0);
                    }
                    wwVar3.x = 0.0f;
                    wwVar3.y = false;
                    wwVar3.e0 = false;
                    sf1Var.w.f(0.0f);
                    sf1Var.w.I = sf1Var.K;
                }
            } else {
                if (sf1Var.V == 0) {
                    sf1Var.V = System.currentTimeMillis();
                }
                if (sf1Var.y == 2 && (wwVar = sf1Var.w) != null) {
                    wwVar.h();
                }
                float top2 = ((m12.getTop() - paddingTop) / m12.getMeasuredHeight()) + 1.0f;
                if (top2 > 1.0f) {
                    top2 = 1.0f;
                }
                long currentTimeMillis = System.currentTimeMillis() - sf1Var.V;
                if (top2 > 0.85f && currentTimeMillis > 220) {
                    z4 = true;
                }
                if (sf1Var.W != z4) {
                    sf1Var.W = z4;
                    if (sf1Var.y == 2) {
                        try {
                            sf1Var.K.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        ww wwVar4 = sf1Var.w;
                        if (wwVar4 != null) {
                            wwVar4.a(z4);
                        }
                    }
                }
                if (sf1Var.y == 2 && i13 - o02 != 0 && i10 < 0 && z10) {
                    float dp = 1.0f - (sf1Var.K.c3 / AndroidUtilities.dp(72.0f));
                    df1 df1Var3 = sf1Var.K;
                    df1Var3.setViewsOffset(df1Var3.c3 - ((i10 * 0.2f) * dp));
                }
                ww wwVar5 = sf1Var.w;
                if (wwVar5 != null) {
                    wwVar5.f(top2);
                    sf1Var.w.I = sf1Var.K;
                }
            }
            if (m12 != null) {
                m12.invalidate();
            }
            return o02;
        }
        i11 = i10;
        df1Var = sf1Var.K;
        if (df1Var.c3 != 0.0f) {
            f10 = ((int) r15) - i10;
            if (f10 >= 0.0f) {
            }
            df1Var.setViewsOffset(f10);
            i11 = i12;
        }
        if (sf1Var.y != 0) {
        }
        return super.o0(i11, fVar, j1Var);
    }

    @Override // f2.j0, f2.w0
    public final void v0(RecyclerView recyclerView, f2.j1 j1Var, int i10) {
        if (this.J.x > 0 && i10 == 1) {
            super.v0(recyclerView, j1Var, i10);
            return;
        }
        xh.o oVar = new xh.o(recyclerView.getContext(), 0);
        oVar.a = i10;
        w0(oVar);
    }
}
