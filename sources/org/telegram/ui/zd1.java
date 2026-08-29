package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class zd1 extends f2.j0 {
    public boolean I;
    public final /* synthetic */ ze1 J;

    public zd1(ze1 ze1Var) {
        this.J = ze1Var;
    }

    @Override // f2.j0, f2.w0
    public final void b0(f2.d1 d1Var, f2.k1 k1Var) {
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            try {
                super.b0(d1Var, k1Var);
                return;
            } catch (IndexOutOfBoundsException unused) {
                throw new RuntimeException("Inconsistency detected. ");
            }
        }
        try {
            super.b0(d1Var, k1Var);
        } catch (IndexOutOfBoundsException e10) {
            FileLog.e(e10);
            AndroidUtilities.runOnUIThread(new ky0(this, 20));
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
            i11 -= this.J.J.getPaddingTop();
        }
        super.h1(i10, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ca  */
    @Override // f2.j0, f2.w0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int o0(int i10, f2.d1 d1Var, f2.k1 k1Var) {
        int i11;
        je1 je1Var;
        mw mwVar;
        float f9;
        int i12;
        ze1 ze1Var = this.J;
        je1 je1Var2 = ze1Var.J;
        boolean z10 = false;
        if (je1Var2.T1) {
            return 0;
        }
        boolean z11 = je1Var2.getScrollState() == 1;
        int paddingTop = ze1Var.J.getPaddingTop();
        if (i10 < 0 && ze1Var.x > 0 && ze1Var.y == 2) {
            ze1Var.J.setOverScrollMode(0);
            int L0 = ze1Var.B.L0();
            if (L0 == 0) {
                View m10 = ze1Var.B.m(L0);
                if (m10 != null) {
                    m10.setTranslationX(0.0f);
                }
                if (m10 != null && m10.getBottom() - paddingTop <= AndroidUtilities.dp(1.0f)) {
                    L0 = 1;
                }
            }
            if (!z11) {
                View m11 = ze1Var.B.m(L0);
                if (m11 != null) {
                    int f10 = com.google.android.recaptcha.internal.a.f(L0, 1, AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 78.0f : 72.0f) + 1, -(m11.getTop() - paddingTop));
                    if (f10 < Math.abs(i10)) {
                        i11 = -f10;
                    }
                }
            } else if (L0 == 0) {
                View m12 = ze1Var.B.m(L0);
                float top = ((m12.getTop() - paddingTop) / m12.getMeasuredHeight()) + 1.0f;
                if (top > 1.0f) {
                    top = 1.0f;
                }
                ze1Var.J.setOverScrollMode(2);
                i11 = (int) ((0.45f - (top * 0.25f)) * i10);
                if (i11 > -1) {
                    i11 = -1;
                }
            }
            je1Var = ze1Var.J;
            if (je1Var.b3 != 0.0f && i10 > 0 && z11) {
                f9 = ((int) r15) - i10;
                if (f9 >= 0.0f) {
                    i12 = (int) f9;
                    f9 = 0.0f;
                } else {
                    i12 = 0;
                }
                je1Var.setViewsOffset(f9);
                i11 = i12;
            }
            if (ze1Var.y != 0 || ze1Var.x <= 0) {
                return super.o0(i11, d1Var, k1Var);
            }
            int o02 = super.o0(i11, d1Var, k1Var);
            mw mwVar2 = ze1Var.w;
            if (mwVar2 != null) {
                mwVar2.a = o02;
            }
            int L02 = ze1Var.B.L0();
            View m13 = L02 == 0 ? ze1Var.B.m(L02) : null;
            if (m13 != null) {
                m13.setTranslationX(0.0f);
            }
            int i13 = i11;
            if (L02 != 0 || m13 == null || m13.getBottom() - paddingTop < AndroidUtilities.dp(4.0f)) {
                ze1Var.U = 0L;
                ze1Var.V = false;
                ze1Var.y = 2;
                mw mwVar3 = ze1Var.w;
                if (mwVar3 != null) {
                    ValueAnimator valueAnimator = mwVar3.z;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    org.telegram.ui.Cells.p2 p2Var = mwVar3.H;
                    if (p2Var != null) {
                        p2Var.removeCallbacks(mwVar3.d0);
                    }
                    mwVar3.x = 0.0f;
                    mwVar3.y = false;
                    mwVar3.e0 = false;
                    ze1Var.w.f(0.0f);
                    ze1Var.w.I = ze1Var.J;
                }
            } else {
                if (ze1Var.U == 0) {
                    ze1Var.U = System.currentTimeMillis();
                }
                if (ze1Var.y == 2 && (mwVar = ze1Var.w) != null) {
                    mwVar.h();
                }
                float top2 = ((m13.getTop() - paddingTop) / m13.getMeasuredHeight()) + 1.0f;
                if (top2 > 1.0f) {
                    top2 = 1.0f;
                }
                long currentTimeMillis = System.currentTimeMillis() - ze1Var.U;
                if (top2 > 0.85f && currentTimeMillis > 220) {
                    z10 = true;
                }
                if (ze1Var.V != z10) {
                    ze1Var.V = z10;
                    if (ze1Var.y == 2) {
                        try {
                            ze1Var.J.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        mw mwVar4 = ze1Var.w;
                        if (mwVar4 != null) {
                            mwVar4.a(z10);
                        }
                    }
                }
                if (ze1Var.y == 2 && i13 - o02 != 0 && i10 < 0 && z11) {
                    float dp = 1.0f - (ze1Var.J.b3 / AndroidUtilities.dp(72.0f));
                    je1 je1Var3 = ze1Var.J;
                    je1Var3.setViewsOffset(je1Var3.b3 - ((i10 * 0.2f) * dp));
                }
                mw mwVar5 = ze1Var.w;
                if (mwVar5 != null) {
                    mwVar5.f(top2);
                    ze1Var.w.I = ze1Var.J;
                }
            }
            if (m13 != null) {
                m13.invalidate();
            }
            return o02;
        }
        i11 = i10;
        je1Var = ze1Var.J;
        if (je1Var.b3 != 0.0f) {
            f9 = ((int) r15) - i10;
            if (f9 >= 0.0f) {
            }
            je1Var.setViewsOffset(f9);
            i11 = i12;
        }
        if (ze1Var.y != 0) {
        }
        return super.o0(i11, d1Var, k1Var);
    }

    @Override // f2.j0, f2.w0
    public final void v0(RecyclerView recyclerView, f2.k1 k1Var, int i10) {
        if (this.J.x > 0 && i10 == 1) {
            super.v0(recyclerView, k1Var, i10);
            return;
        }
        uh.n nVar = new uh.n(recyclerView.getContext(), 0);
        nVar.a = i10;
        w0(nVar);
    }
}
