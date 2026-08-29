package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class vq extends f2.j0 {
    public final /* synthetic */ int I;
    public final /* synthetic */ Object J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vq(ViewGroup viewGroup, int i10) {
        super(0, false);
        this.I = i10;
        this.J = viewGroup;
    }

    @Override // f2.w0
    public void S(f2.d1 d1Var, f2.k1 k1Var, s0.c cVar) {
        switch (this.I) {
            case 5:
                super.S(d1Var, k1Var, cVar);
                if (((org.telegram.ui.Components.y71) this.J).R) {
                    cVar.p(false);
                    break;
                }
                break;
            case 6:
            default:
                super.S(d1Var, k1Var, cVar);
                break;
            case 7:
                super.S(d1Var, k1Var, cVar);
                if (!((rf.h0) this.J).isEnabled()) {
                    cVar.p(false);
                    break;
                }
                break;
        }
    }

    @Override // f2.j0
    public int W0(f2.k1 k1Var) {
        switch (this.I) {
            case 4:
                if (!((org.telegram.ui.Components.a21) this.J).W2) {
                    break;
                } else {
                    break;
                }
        }
        return super.W0(k1Var);
    }

    @Override // f2.j0
    public void k1(boolean z10) {
        switch (this.I) {
            case 2:
                super.k1(z10);
                ((org.telegram.ui.Components.ka0) this.J).b.setTranslationY(AndroidUtilities.dp(6.0f) * (z10 ? -1 : 1));
                break;
            default:
                super.k1(z10);
                break;
        }
    }

    @Override // f2.j0, f2.w0
    public int m0(int i10, f2.d1 d1Var, f2.k1 k1Var) {
        switch (this.I) {
            case 1:
                org.telegram.ui.Components.j70 j70Var = ((fw) ((org.telegram.ui.Components.f00) this.J).F).b.H0;
                if (j70Var != null && j70Var.D()) {
                    i10 = 0;
                }
                return super.m0(i10, d1Var, k1Var);
            case 2:
            default:
                return super.m0(i10, d1Var, k1Var);
            case 3:
                org.telegram.ui.Components.fk0 fk0Var = (org.telegram.ui.Components.fk0) this.J;
                jh.e1 e1Var = fk0Var.b;
                if (i10 < 0 && fk0Var.x0 != 0.0f) {
                    float pullingLeftProgress = fk0Var.getPullingLeftProgress();
                    fk0Var.x0 += i10;
                    if ((pullingLeftProgress > 1.0f) != (fk0Var.getPullingLeftProgress() > 1.0f)) {
                        try {
                            e1Var.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    float f9 = fk0Var.x0;
                    if (f9 < 0.0f) {
                        i10 = (int) f9;
                        fk0Var.x0 = 0.0f;
                    } else {
                        i10 = 0;
                    }
                    bg.d1 d1Var2 = fk0Var.O;
                    if (d1Var2 != null) {
                        d1Var2.invalidate();
                    }
                    e1Var.invalidate();
                }
                int m0 = super.m0(i10, d1Var, k1Var);
                if (i10 > 0 && m0 == 0 && e1Var.getScrollState() == 1 && fk0Var.q()) {
                    ValueAnimator valueAnimator = fk0Var.u0;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        fk0Var.u0.cancel();
                    }
                    float pullingLeftProgress2 = fk0Var.getPullingLeftProgress();
                    fk0Var.x0 = (i10 * (pullingLeftProgress2 > 1.0f ? 0.05f : 0.6f)) + fk0Var.x0;
                    if ((pullingLeftProgress2 > 1.0f) != (fk0Var.getPullingLeftProgress() > 1.0f)) {
                        try {
                            e1Var.performHapticFeedback(3);
                        } catch (Exception unused2) {
                        }
                    }
                    bg.d1 d1Var3 = fk0Var.O;
                    if (d1Var3 != null) {
                        d1Var3.invalidate();
                    }
                    e1Var.invalidate();
                }
                return m0;
        }
    }

    @Override // f2.j0, f2.w0
    public int o0(int i10, f2.d1 d1Var, f2.k1 k1Var) {
        switch (this.I) {
            case 0:
                jr jrVar = (jr) this.J;
                if (jrVar.N || jrVar.K != 0 || jrVar.B.size() != 0) {
                    break;
                }
                break;
        }
        return super.o0(i10, d1Var, k1Var);
    }

    @Override // f2.j0, f2.w0
    public void v0(RecyclerView recyclerView, f2.k1 k1Var, int i10) {
        switch (this.I) {
            case 1:
                org.telegram.ui.Components.yz yzVar = new org.telegram.ui.Components.yz(this, recyclerView.getContext());
                yzVar.a = i10;
                w0(yzVar);
                break;
            case 5:
                org.telegram.ui.Components.s71 s71Var = new org.telegram.ui.Components.s71(this, recyclerView.getContext());
                s71Var.a = i10;
                w0(s71Var);
                break;
            default:
                super.v0(recyclerView, k1Var, i10);
                break;
        }
    }

    @Override // f2.j0, f2.w0
    public boolean y0() {
        switch (this.I) {
            case 1:
                return true;
            case 2:
                return false;
            case 3:
            case 4:
            case 5:
            default:
                return super.y0();
            case 6:
                return false;
            case 7:
                return false;
        }
    }

    @Override // f2.j0
    public void z0(f2.k1 k1Var, int[] iArr) {
        switch (this.I) {
            case 6:
                iArr[1] = ((StickersActivity) this.J).a.getHeight();
                break;
            default:
                super.z0(k1Var, iArr);
                break;
        }
    }

    public /* synthetic */ vq(Object obj, int i10) {
        this.I = i10;
        this.J = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vq(jr jrVar) {
        super(1, false);
        this.I = 0;
        this.J = jrVar;
    }
}
