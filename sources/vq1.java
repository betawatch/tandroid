// default package

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class vq1 extends wec {
    public final /* synthetic */ byte W;
    public final /* synthetic */ Object a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vq1(byte b, Context context, Object obj) {
        super(context, null);
        this.W = b;
        this.a0 = obj;
    }

    @Override // wec
    public final void A(int i) {
        switch (this.W) {
            case 0:
                if (i == 0) {
                    mu1 mu1Var = (mu1) this.a0;
                    if (mu1Var.H1) {
                        mu1Var.H1 = false;
                        mu1Var.F1.h.clear();
                        break;
                    }
                }
                break;
        }
    }

    @Override // wec
    public final int H() {
        switch (this.W) {
            case 9:
                return 12;
            default:
                return super.H();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    @Override // wec
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g(MotionEvent motionEvent) {
        byte b;
        View E;
        int R;
        byte b2 = this.W;
        Object obj = this.a0;
        switch (b2) {
            case 0:
                xq1 xq1Var = ((mu1) obj).E1;
                return xq1Var != null && xq1Var.b > 0.5f;
            case 7:
                y5b y5bVar = (y5b) obj;
                View currentView = y5bVar.l1.getCurrentView();
                if (currentView instanceof t5b) {
                    if (getCurrentPosition() > 0) {
                        y5bVar.F0();
                    } else {
                        t5b t5bVar = (t5b) currentView;
                        ArrayList arrayList = t5bVar.M;
                        o39 o39Var = t5bVar.f;
                        if (t5bVar.a == 0 && motionEvent != null && (E = o39Var.E(motionEvent.getX(), motionEvent.getY() - t5bVar.e.getPaddingTop())) != null && (R = RecyclerView.R(E)) >= 0 && R < arrayList.size()) {
                            j5b j5bVar = (j5b) arrayList.get(R);
                            if (j5bVar.a == 3 && !j5bVar.n) {
                                boolean z = k96.a0;
                                float x = motionEvent.getX();
                                if (!z ? x > gl.L(100.0f) : x < t5bVar.getWidth() - gl.L(100.0f)) {
                                    b = j5bVar.i;
                                    if (b != -1) {
                                        y5bVar.G1 = b;
                                        if (b == 3) {
                                            if (!y5bVar.r1.isEmpty() && !y5bVar.s1.isEmpty()) {
                                                y5bVar.H1 = b;
                                            }
                                        } else if (b != 4) {
                                            y5bVar.H1 = b;
                                        } else if (!y5bVar.n1.isEmpty() && !y5bVar.o1.isEmpty()) {
                                            y5bVar.H1 = b;
                                        }
                                        t5bVar.g(true);
                                        t5bVar.f(true);
                                    }
                                    if (b != -1) {
                                        return false;
                                    }
                                    y5bVar.F0();
                                }
                            }
                        }
                        b = -1;
                        if (b != -1) {
                        }
                        if (b != -1) {
                        }
                    }
                }
                return true;
            default:
                return super.g(motionEvent);
        }
    }

    @Override // wec
    public final boolean h(MotionEvent motionEvent) {
        switch (this.W) {
            case 1:
                return getCurrentPosition() != 2;
            default:
                return super.h(motionEvent);
        }
    }

    @Override // wec
    public final boolean i(MotionEvent motionEvent) {
        switch (this.W) {
            case 1:
            case 6:
                return false;
            default:
                return super.i(motionEvent);
        }
    }

    @Override // wec, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.W) {
            case 0:
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // wec
    public final void s(View view, View view2, int i, int i2) {
        switch (this.W) {
            case 7:
                y5b y5bVar = (y5b) this.a0;
                if (y5bVar.d) {
                    y5bVar.F0();
                    break;
                }
                break;
        }
    }

    @Override // wec
    public final void u() {
        switch (this.W) {
            case 1:
                if (getCurrentPosition() == 1) {
                    ((eo2) this.a0).u1.d.g3.O(false);
                    break;
                }
                break;
        }
    }

    @Override // wec
    public final void v() {
        z79 z79Var;
        switch (this.W) {
            case 6:
                if ((getCurrentView() instanceof a89) && (z79Var = ((a89) getCurrentView()).n) != null) {
                    gl.t1(z79Var);
                    break;
                }
                break;
        }
    }

    @Override // wec
    public final void w(boolean z) {
        byte b = this.W;
        Object obj = this.a0;
        switch (b) {
            case 0:
                mu1 mu1Var = (mu1) obj;
                mu1Var.m1.getClass();
                mu1Var.m1.getClass();
                mu1Var.q5();
                break;
            case 1:
                ((eo2) obj).b.invalidate();
                break;
            case 2:
                ew3 ew3Var = (ew3) obj;
                vq1 vq1Var = ew3Var.p1;
                dw3 dw3Var = ew3Var.q1;
                if (dw3Var != null) {
                    dw3Var.G = vq1Var.getPositionAnimated();
                    dw3Var.invalidate();
                }
                ew3Var.b.invalidate();
                invalidate();
                ew3.C1 = vq1Var.getCurrentPosition();
                break;
            case 3:
                ((ki7) obj).b.invalidate();
                break;
            case 4:
                a18 a18Var = (a18) obj;
                float positionAnimated = a18Var.J.getPositionAnimated();
                a18Var.N.setSelected(positionAnimated);
                a18Var.e.setProgressToGradient(1.0f - moe.a((positionAnimated - 0.333333f) / 0.333333f, 0.0f, 1.0f));
                a18Var.J0();
                t08 E0 = a18Var.E0();
                u41 u41Var = a18Var.R;
                if (u41Var != null && E0 != null && E0 != a18Var.S) {
                    a18Var.S = E0;
                    sk4 sk4Var = E0.e;
                    u41Var.i((CharSequence) sk4Var.b, true, true);
                    a18Var.R.g((SpannableStringBuilder) sk4Var.c, true);
                    break;
                }
                break;
            case 5:
                ((ve8) obj).e();
                break;
            case 6:
                ((b89) obj).b.invalidate();
                break;
            case 7:
                ((y5b) obj).b.invalidate();
                break;
            case 8:
                ((jpb) obj).e();
                break;
            default:
                hmc hmcVar = (hmc) obj;
                hmcVar.f1();
                koc kocVar = hmcVar.k0;
                if (kocVar != null && kocVar.i1) {
                    kocVar.f0();
                    break;
                }
                break;
        }
    }

    @Override // wec
    public final void y(int i) {
        zoc zocVar;
        switch (this.W) {
            case 9:
                hmc hmcVar = (hmc) this.a0;
                hmcVar.f0 = i;
                if (i != 1 && (zocVar = hmcVar.j0) != null) {
                    zocVar.b(false);
                }
                if (i == 1) {
                    hmcVar.s0.post(new qkc(hmcVar, (byte) 13));
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vq1(d dVar, Context context, wjb wjbVar, byte b) {
        super(context, wjbVar);
        this.W = b;
        this.a0 = dVar;
    }
}
