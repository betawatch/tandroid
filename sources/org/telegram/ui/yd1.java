package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class yd1 extends f2.k0 {
    public boolean I;
    public final /* synthetic */ we1 J;

    public yd1(we1 we1Var) {
        this.J = we1Var;
    }

    @Override // f2.k0, f2.x0
    public final void b0(f2.e1 e1Var, f2.l1 l1Var) {
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            try {
                super.b0(e1Var, l1Var);
                return;
            } catch (IndexOutOfBoundsException unused) {
                throw new RuntimeException("Inconsistency detected. ");
            }
        }
        try {
            super.b0(e1Var, l1Var);
        } catch (IndexOutOfBoundsException e9) {
            FileLog.e(e9);
            AndroidUtilities.runOnUIThread(new ky0(this, 20));
        }
    }

    @Override // f2.k0
    public final void b1(View view, View view2, int i10, int i11) {
        this.I = true;
        super.b1(view, view2, i10, i11);
        this.I = false;
    }

    @Override // f2.k0
    public final void h1(int i10, int i11) {
        if (this.I) {
            i11 -= this.J.J.getPaddingTop();
        }
        super.h1(i10, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ca  */
    @Override // f2.k0, f2.x0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int o0(int i10, f2.e1 e1Var, f2.l1 l1Var) {
        int i11;
        he1 he1Var;
        nw nwVar;
        float f10;
        int i12;
        we1 we1Var = this.J;
        he1 he1Var2 = we1Var.J;
        boolean z10 = false;
        if (he1Var2.T1) {
            return 0;
        }
        boolean z11 = he1Var2.getScrollState() == 1;
        int paddingTop = we1Var.J.getPaddingTop();
        if (i10 < 0 && we1Var.x > 0 && we1Var.y == 2) {
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
                    int e9 = i0.a.e(L0, 1, AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 78.0f : 72.0f) + 1, -(m11.getTop() - paddingTop));
                    if (e9 < Math.abs(i10)) {
                        i11 = -e9;
                    }
                }
            } else if (L0 == 0) {
                View m12 = we1Var.B.m(L0);
                float top = ((m12.getTop() - paddingTop) / m12.getMeasuredHeight()) + 1.0f;
                if (top > 1.0f) {
                    top = 1.0f;
                }
                we1Var.J.setOverScrollMode(2);
                i11 = (int) ((0.45f - (top * 0.25f)) * i10);
                if (i11 > -1) {
                    i11 = -1;
                }
            }
            he1Var = we1Var.J;
            if (he1Var.b3 != 0.0f && i10 > 0 && z11) {
                f10 = ((int) r15) - i10;
                if (f10 >= 0.0f) {
                    i12 = (int) f10;
                    f10 = 0.0f;
                } else {
                    i12 = 0;
                }
                he1Var.setViewsOffset(f10);
                i11 = i12;
            }
            if (we1Var.y != 0 || we1Var.x <= 0) {
                return super.o0(i11, e1Var, l1Var);
            }
            int o02 = super.o0(i11, e1Var, l1Var);
            nw nwVar2 = we1Var.w;
            if (nwVar2 != null) {
                nwVar2.a = o02;
            }
            int L02 = we1Var.B.L0();
            View m13 = L02 == 0 ? we1Var.B.m(L02) : null;
            if (m13 != null) {
                m13.setTranslationX(0.0f);
            }
            int i13 = i11;
            if (L02 != 0 || m13 == null || m13.getBottom() - paddingTop < AndroidUtilities.dp(4.0f)) {
                we1Var.U = 0L;
                we1Var.V = false;
                we1Var.y = 2;
                nw nwVar3 = we1Var.w;
                if (nwVar3 != null) {
                    ValueAnimator valueAnimator = nwVar3.z;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    org.telegram.ui.Cells.p2 p2Var = nwVar3.H;
                    if (p2Var != null) {
                        p2Var.removeCallbacks(nwVar3.d0);
                    }
                    nwVar3.x = 0.0f;
                    nwVar3.y = false;
                    nwVar3.e0 = false;
                    we1Var.w.f(0.0f);
                    we1Var.w.I = we1Var.J;
                }
            } else {
                if (we1Var.U == 0) {
                    we1Var.U = System.currentTimeMillis();
                }
                if (we1Var.y == 2 && (nwVar = we1Var.w) != null) {
                    nwVar.h();
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
                        nw nwVar4 = we1Var.w;
                        if (nwVar4 != null) {
                            nwVar4.a(z10);
                        }
                    }
                }
                if (we1Var.y == 2 && i13 - o02 != 0 && i10 < 0 && z11) {
                    float dp = 1.0f - (we1Var.J.b3 / AndroidUtilities.dp(72.0f));
                    he1 he1Var3 = we1Var.J;
                    he1Var3.setViewsOffset(he1Var3.b3 - ((i10 * 0.2f) * dp));
                }
                nw nwVar5 = we1Var.w;
                if (nwVar5 != null) {
                    nwVar5.f(top2);
                    we1Var.w.I = we1Var.J;
                }
            }
            if (m13 != null) {
                m13.invalidate();
            }
            return o02;
        }
        i11 = i10;
        he1Var = we1Var.J;
        if (he1Var.b3 != 0.0f) {
            f10 = ((int) r15) - i10;
            if (f10 >= 0.0f) {
            }
            he1Var.setViewsOffset(f10);
            i11 = i12;
        }
        if (we1Var.y != 0) {
        }
        return super.o0(i11, e1Var, l1Var);
    }

    @Override // f2.k0, f2.x0
    public final void v0(RecyclerView recyclerView, f2.l1 l1Var, int i10) {
        if (this.J.x > 0 && i10 == 1) {
            super.v0(recyclerView, l1Var, i10);
            return;
        }
        sh.n nVar = new sh.n(recyclerView.getContext(), 0);
        nVar.a = i10;
        w0(nVar);
    }
}
