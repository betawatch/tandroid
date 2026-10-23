package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class td1 extends s4.b0 {
    public boolean I;
    public final /* synthetic */ re1 J;

    public td1(re1 re1Var) {
        this.J = re1Var;
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
            AndroidUtilities.runOnUIThread(new qy0(this, 19));
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
        ce1 ce1Var;
        iw iwVar;
        float f7;
        int i12;
        re1 re1Var = this.J;
        ce1 ce1Var2 = re1Var.N;
        boolean z10 = false;
        if (ce1Var2.V1) {
            return 0;
        }
        boolean z11 = ce1Var2.getScrollState() == 1;
        int paddingTop = re1Var.N.getPaddingTop();
        if (i10 < 0 && re1Var.x > 0 && re1Var.y == 2) {
            re1Var.N.setOverScrollMode(0);
            int L0 = re1Var.F.L0();
            if (L0 == 0) {
                View m10 = re1Var.F.m(L0);
                if (m10 != null) {
                    m10.setTranslationX(0.0f);
                }
                if (m10 != null && m10.getBottom() - paddingTop <= AndroidUtilities.dp(1.0f)) {
                    L0 = 1;
                }
            }
            if (!z11) {
                View m11 = re1Var.F.m(L0);
                if (m11 != null) {
                    int v = com.google.android.gms.internal.play_billing.k3.v(L0, 1, AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 78.0f : 72.0f) + 1, -(m11.getTop() - paddingTop));
                    if (v < Math.abs(i10)) {
                        i11 = -v;
                    }
                }
            } else if (L0 == 0) {
                View m12 = re1Var.F.m(L0);
                float top = ((m12.getTop() - paddingTop) / m12.getMeasuredHeight()) + 1.0f;
                if (top > 1.0f) {
                    top = 1.0f;
                }
                re1Var.N.setOverScrollMode(2);
                i11 = (int) com.google.android.gms.internal.play_billing.k3.B(top, 0.25f, 0.45f, i10);
                if (i11 > -1) {
                    i11 = -1;
                }
            }
            ce1Var = re1Var.N;
            if (ce1Var.d3 != 0.0f && i10 > 0 && z11) {
                f7 = ((int) r14) - i10;
                if (f7 >= 0.0f) {
                    i12 = (int) f7;
                    f7 = 0.0f;
                } else {
                    i12 = 0;
                }
                ce1Var.setViewsOffset(f7);
                i11 = i12;
            }
            if (re1Var.y != 0 || re1Var.x <= 0) {
                return super.o0(i11, eVar, y0Var);
            }
            int o02 = super.o0(i11, eVar, y0Var);
            iw iwVar2 = re1Var.w;
            if (iwVar2 != null) {
                iwVar2.a = o02;
            }
            int L02 = re1Var.F.L0();
            View m13 = L02 == 0 ? re1Var.F.m(L02) : null;
            if (m13 != null) {
                m13.setTranslationX(0.0f);
            }
            if (L02 != 0 || m13 == null || m13.getBottom() - paddingTop < AndroidUtilities.dp(4.0f)) {
                re1Var.Y = 0L;
                re1Var.Z = false;
                re1Var.y = 2;
                iw iwVar3 = re1Var.w;
                if (iwVar3 != null) {
                    ValueAnimator valueAnimator = iwVar3.z;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    org.telegram.ui.Cells.r2 r2Var = iwVar3.H;
                    if (r2Var != null) {
                        r2Var.removeCallbacks(iwVar3.d0);
                    }
                    iwVar3.x = 0.0f;
                    iwVar3.y = false;
                    iwVar3.e0 = false;
                    re1Var.w.f(0.0f);
                    re1Var.w.I = re1Var.N;
                }
            } else {
                if (re1Var.Y == 0) {
                    re1Var.Y = System.currentTimeMillis();
                }
                if (re1Var.y == 2 && (iwVar = re1Var.w) != null) {
                    iwVar.h();
                }
                float top2 = ((m13.getTop() - paddingTop) / m13.getMeasuredHeight()) + 1.0f;
                if (top2 > 1.0f) {
                    top2 = 1.0f;
                }
                long currentTimeMillis = System.currentTimeMillis() - re1Var.Y;
                if (top2 > 0.85f && currentTimeMillis > 220) {
                    z10 = true;
                }
                if (re1Var.Z != z10) {
                    re1Var.Z = z10;
                    if (re1Var.y == 2) {
                        try {
                            re1Var.N.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        iw iwVar4 = re1Var.w;
                        if (iwVar4 != null) {
                            iwVar4.a(z10);
                        }
                    }
                }
                if (re1Var.y == 2 && i11 - o02 != 0 && i10 < 0 && z11) {
                    float dp = 1.0f - (re1Var.N.d3 / AndroidUtilities.dp(72.0f));
                    ce1 ce1Var3 = re1Var.N;
                    ce1Var3.setViewsOffset(ce1Var3.d3 - ((i10 * 0.2f) * dp));
                }
                iw iwVar5 = re1Var.w;
                if (iwVar5 != null) {
                    iwVar5.f(top2);
                    re1Var.w.I = re1Var.N;
                }
            }
            if (m13 != null) {
                m13.invalidate();
            }
            return o02;
        }
        i11 = i10;
        ce1Var = re1Var.N;
        if (ce1Var.d3 != 0.0f) {
            f7 = ((int) r14) - i10;
            if (f7 >= 0.0f) {
            }
            ce1Var.setViewsOffset(f7);
            i11 = i12;
        }
        if (re1Var.y != 0) {
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
