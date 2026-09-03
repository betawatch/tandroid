package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class te1 extends f2.i0 {
    public boolean I;
    public final /* synthetic */ sf1 J;

    public te1(sf1 sf1Var) {
        this.J = sf1Var;
    }

    @Override // f2.i0, f2.v0
    public final void b0(af.h hVar, f2.i1 i1Var) {
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            try {
                super.b0(hVar, i1Var);
                return;
            } catch (IndexOutOfBoundsException unused) {
                throw new RuntimeException("Inconsistency detected. ");
            }
        }
        try {
            super.b0(hVar, i1Var);
        } catch (IndexOutOfBoundsException e) {
            FileLog.e(e);
            AndroidUtilities.runOnUIThread(new sz0(this, 18));
        }
    }

    @Override // f2.i0
    public final void b1(View view, View view2, int i10, int i11) {
        this.I = true;
        super.b1(view, view2, i10, i11);
        this.I = false;
    }

    @Override // f2.i0
    public final void h1(int i10, int i11) {
        if (this.I) {
            i11 -= this.J.K.getPaddingTop();
        }
        super.h1(i10, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ca  */
    @Override // f2.i0, f2.v0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int o0(int i10, af.h hVar, f2.i1 i1Var) {
        int i11;
        df1 df1Var;
        xw xwVar;
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
                    int e = e2.c.e(L0, 1, AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 78.0f : 72.0f) + 1, -(m10.getTop() - paddingTop));
                    if (e < Math.abs(i10)) {
                        i11 = -e;
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
                return super.o0(i11, hVar, i1Var);
            }
            int o02 = super.o0(i11, hVar, i1Var);
            xw xwVar2 = sf1Var.w;
            if (xwVar2 != null) {
                xwVar2.a = o02;
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
                xw xwVar3 = sf1Var.w;
                if (xwVar3 != null) {
                    ValueAnimator valueAnimator = xwVar3.z;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    org.telegram.ui.Cells.q2 q2Var = xwVar3.H;
                    if (q2Var != null) {
                        q2Var.removeCallbacks(xwVar3.d0);
                    }
                    xwVar3.x = 0.0f;
                    xwVar3.y = false;
                    xwVar3.e0 = false;
                    sf1Var.w.f(0.0f);
                    sf1Var.w.I = sf1Var.K;
                }
            } else {
                if (sf1Var.V == 0) {
                    sf1Var.V = System.currentTimeMillis();
                }
                if (sf1Var.y == 2 && (xwVar = sf1Var.w) != null) {
                    xwVar.h();
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
                        xw xwVar4 = sf1Var.w;
                        if (xwVar4 != null) {
                            xwVar4.a(z4);
                        }
                    }
                }
                if (sf1Var.y == 2 && i13 - o02 != 0 && i10 < 0 && z10) {
                    float dp = 1.0f - (sf1Var.K.c3 / AndroidUtilities.dp(72.0f));
                    df1 df1Var3 = sf1Var.K;
                    df1Var3.setViewsOffset(df1Var3.c3 - ((i10 * 0.2f) * dp));
                }
                xw xwVar5 = sf1Var.w;
                if (xwVar5 != null) {
                    xwVar5.f(top2);
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
        return super.o0(i11, hVar, i1Var);
    }

    @Override // f2.i0, f2.v0
    public final void v0(RecyclerView recyclerView, f2.i1 i1Var, int i10) {
        if (this.J.x > 0 && i10 == 1) {
            super.v0(recyclerView, i1Var, i10);
            return;
        }
        wh.o oVar = new wh.o(recyclerView.getContext(), 0);
        oVar.a = i10;
        w0(oVar);
    }
}
