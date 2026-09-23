package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class ye1 extends s4.c0 {
    public boolean I;
    public final /* synthetic */ wf1 J;

    public ye1(wf1 wf1Var) {
        this.J = wf1Var;
    }

    @Override // s4.c0, s4.o0
    public final void b0(of.e eVar, s4.z0 z0Var) {
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            try {
                super.b0(eVar, z0Var);
                return;
            } catch (IndexOutOfBoundsException unused) {
                throw new RuntimeException("Inconsistency detected. ");
            }
        }
        try {
            super.b0(eVar, z0Var);
        } catch (IndexOutOfBoundsException e) {
            FileLog.e(e);
            AndroidUtilities.runOnUIThread(new xz0(this, 18));
        }
    }

    @Override // s4.c0
    public final void b1(View view, View view2, int i10, int i11) {
        this.I = true;
        super.b1(view, view2, i10, i11);
        this.I = false;
    }

    @Override // s4.c0
    public final void h1(int i10, int i11) {
        if (this.I) {
            i11 -= this.J.N.getPaddingTop();
        }
        super.h1(i10, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ca  */
    @Override // s4.c0, s4.o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int o0(int i10, of.e eVar, s4.z0 z0Var) {
        int i11;
        hf1 hf1Var;
        xw xwVar;
        float f7;
        int i12;
        wf1 wf1Var = this.J;
        hf1 hf1Var2 = wf1Var.N;
        boolean z10 = false;
        if (hf1Var2.X1) {
            return 0;
        }
        boolean z11 = hf1Var2.getScrollState() == 1;
        int paddingTop = wf1Var.N.getPaddingTop();
        if (i10 < 0 && wf1Var.x > 0 && wf1Var.y == 2) {
            wf1Var.N.setOverScrollMode(0);
            int L0 = wf1Var.F.L0();
            if (L0 == 0) {
                View m10 = wf1Var.F.m(L0);
                if (m10 != null) {
                    m10.setTranslationX(0.0f);
                }
                if (m10 != null && m10.getBottom() - paddingTop <= AndroidUtilities.dp(1.0f)) {
                    L0 = 1;
                }
            }
            if (!z11) {
                View m11 = wf1Var.F.m(L0);
                if (m11 != null) {
                    int g10 = hg.c.g(L0, 1, AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 78.0f : 72.0f) + 1, -(m11.getTop() - paddingTop));
                    if (g10 < Math.abs(i10)) {
                        i11 = -g10;
                    }
                }
            } else if (L0 == 0) {
                View m12 = wf1Var.F.m(L0);
                float top = ((m12.getTop() - paddingTop) / m12.getMeasuredHeight()) + 1.0f;
                if (top > 1.0f) {
                    top = 1.0f;
                }
                wf1Var.N.setOverScrollMode(2);
                i11 = (int) ((0.45f - (top * 0.25f)) * i10);
                if (i11 > -1) {
                    i11 = -1;
                }
            }
            hf1Var = wf1Var.N;
            if (hf1Var.f3 != 0.0f && i10 > 0 && z11) {
                f7 = ((int) r15) - i10;
                if (f7 >= 0.0f) {
                    i12 = (int) f7;
                    f7 = 0.0f;
                } else {
                    i12 = 0;
                }
                hf1Var.setViewsOffset(f7);
                i11 = i12;
            }
            if (wf1Var.y != 0 || wf1Var.x <= 0) {
                return super.o0(i11, eVar, z0Var);
            }
            int o02 = super.o0(i11, eVar, z0Var);
            xw xwVar2 = wf1Var.w;
            if (xwVar2 != null) {
                xwVar2.a = o02;
            }
            int L02 = wf1Var.F.L0();
            View m13 = L02 == 0 ? wf1Var.F.m(L02) : null;
            if (m13 != null) {
                m13.setTranslationX(0.0f);
            }
            int i13 = i11;
            if (L02 != 0 || m13 == null || m13.getBottom() - paddingTop < AndroidUtilities.dp(4.0f)) {
                wf1Var.Y = 0L;
                wf1Var.Z = false;
                wf1Var.y = 2;
                xw xwVar3 = wf1Var.w;
                if (xwVar3 != null) {
                    ValueAnimator valueAnimator = xwVar3.z;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    org.telegram.ui.Cells.r2 r2Var = xwVar3.H;
                    if (r2Var != null) {
                        r2Var.removeCallbacks(xwVar3.d0);
                    }
                    xwVar3.x = 0.0f;
                    xwVar3.y = false;
                    xwVar3.e0 = false;
                    wf1Var.w.f(0.0f);
                    wf1Var.w.I = wf1Var.N;
                }
            } else {
                if (wf1Var.Y == 0) {
                    wf1Var.Y = System.currentTimeMillis();
                }
                if (wf1Var.y == 2 && (xwVar = wf1Var.w) != null) {
                    xwVar.h();
                }
                float top2 = ((m13.getTop() - paddingTop) / m13.getMeasuredHeight()) + 1.0f;
                if (top2 > 1.0f) {
                    top2 = 1.0f;
                }
                long currentTimeMillis = System.currentTimeMillis() - wf1Var.Y;
                if (top2 > 0.85f && currentTimeMillis > 220) {
                    z10 = true;
                }
                if (wf1Var.Z != z10) {
                    wf1Var.Z = z10;
                    if (wf1Var.y == 2) {
                        try {
                            wf1Var.N.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        xw xwVar4 = wf1Var.w;
                        if (xwVar4 != null) {
                            xwVar4.a(z10);
                        }
                    }
                }
                if (wf1Var.y == 2 && i13 - o02 != 0 && i10 < 0 && z11) {
                    float dp = 1.0f - (wf1Var.N.f3 / AndroidUtilities.dp(72.0f));
                    hf1 hf1Var3 = wf1Var.N;
                    hf1Var3.setViewsOffset(hf1Var3.f3 - ((i10 * 0.2f) * dp));
                }
                xw xwVar5 = wf1Var.w;
                if (xwVar5 != null) {
                    xwVar5.f(top2);
                    wf1Var.w.I = wf1Var.N;
                }
            }
            if (m13 != null) {
                m13.invalidate();
            }
            return o02;
        }
        i11 = i10;
        hf1Var = wf1Var.N;
        if (hf1Var.f3 != 0.0f) {
            f7 = ((int) r15) - i10;
            if (f7 >= 0.0f) {
            }
            hf1Var.setViewsOffset(f7);
            i11 = i12;
        }
        if (wf1Var.y != 0) {
        }
        return super.o0(i11, eVar, z0Var);
    }

    @Override // s4.c0, s4.o0
    public final void v0(RecyclerView recyclerView, s4.z0 z0Var, int i10) {
        if (this.J.x > 0 && i10 == 1) {
            super.v0(recyclerView, z0Var, i10);
            return;
        }
        ji.o oVar = new ji.o(recyclerView.getContext(), 0);
        oVar.a = i10;
        w0(oVar);
    }
}
