package s4;

import android.os.Build;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;
import org.telegram.ui.Cells.l2;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class b1 implements Runnable {
    public int a;
    public int b;
    public OverScroller c;
    public Interpolator d;
    public boolean e;
    public boolean f;
    public final /* synthetic */ RecyclerView h;

    public b1(RecyclerView recyclerView) {
        this.h = recyclerView;
        l2 l2Var = RecyclerView.T0;
        this.d = l2Var;
        this.e = false;
        this.f = false;
        this.c = new OverScroller(recyclerView.getContext(), l2Var);
    }

    public final void a() {
        if (this.e) {
            this.f = true;
            return;
        }
        RecyclerView recyclerView = this.h;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = r0.i0.a;
        recyclerView.postOnAnimation(this);
    }

    public final void b(int i10, int i11, int i12, Interpolator interpolator) {
        int i13;
        RecyclerView recyclerView = this.h;
        if (i12 == Integer.MIN_VALUE) {
            int abs = Math.abs(i10);
            int abs2 = Math.abs(i11);
            boolean z10 = abs > abs2;
            int sqrt = (int) Math.sqrt(0);
            int sqrt2 = (int) Math.sqrt((i11 * i11) + (i10 * i10));
            int width = z10 ? recyclerView.getWidth() : recyclerView.getHeight();
            int i14 = width / 2;
            float f7 = width;
            float f10 = i14;
            float sin = (((float) Math.sin((Math.min(1.0f, (sqrt2 * 1.0f) / f7) - 0.5f) * 0.47123894f)) * f10) + f10;
            if (sqrt > 0) {
                i13 = Math.round(Math.abs(sin / sqrt) * 1000.0f) * 4;
            } else {
                if (!z10) {
                    abs = abs2;
                }
                i13 = (int) (((abs / f7) + 1.0f) * 300.0f);
            }
            i12 = Math.min(i13, 2000);
        }
        int i15 = i12;
        if (interpolator == null) {
            interpolator = RecyclerView.T0;
        }
        if (this.d != interpolator) {
            this.d = interpolator;
            this.c = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.b = 0;
        this.a = 0;
        recyclerView.setScrollState(2);
        this.c.startScroll(0, 0, i10, i11, i15);
        if (Build.VERSION.SDK_INT < 23) {
            this.c.computeScrollOffset();
        }
        a();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13;
        boolean awakenScrollBars;
        RecyclerView recyclerView = this.h;
        int[] iArr = recyclerView.I0;
        if (recyclerView.x == null) {
            recyclerView.N0 = true;
            recyclerView.removeCallbacks(this);
            this.c.abortAnimation();
            return;
        }
        this.f = false;
        this.e = true;
        recyclerView.p();
        OverScroller overScroller = this.c;
        recyclerView.O0 = true;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i14 = currX - this.a;
            int i15 = currY - this.b;
            this.a = currX;
            this.b = currY;
            int[] iArr2 = recyclerView.I0;
            iArr2[0] = 0;
            iArr2[1] = 0;
            if (recyclerView.v(i14, i15, 1, iArr2, null)) {
                i10 = i14 - iArr[0];
                i11 = i15 - iArr[1];
            } else {
                i10 = i14;
                i11 = i15;
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.o(i10, i11);
            }
            if (recyclerView.w != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                recyclerView.t0(i10, i11, iArr);
                i12 = iArr[0];
                i13 = iArr[1];
                i10 -= i12;
                i11 -= i13;
                y0 y0Var = recyclerView.x.e;
                if (y0Var != null && !y0Var.d && y0Var.e) {
                    int b10 = recyclerView.t0.b();
                    if (b10 == 0) {
                        y0Var.h();
                    } else if (y0Var.a >= b10) {
                        y0Var.a = b10 - 1;
                        y0Var.c(i12, i13);
                    } else {
                        y0Var.c(i12, i13);
                    }
                }
            } else {
                i12 = 0;
                i13 = 0;
            }
            if (!recyclerView.y.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.I0;
            iArr3[0] = 0;
            iArr3[1] = 0;
            recyclerView.w(i12, i13, i10, i11, null, 1, iArr3);
            int i16 = i10 - iArr[0];
            int i17 = i11 - iArr[1];
            if (i12 != 0 || i13 != 0) {
                recyclerView.x(i12, i13);
            }
            awakenScrollBars = recyclerView.awakenScrollBars();
            if (!awakenScrollBars) {
                recyclerView.invalidate();
            }
            boolean z10 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i16 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i17 != 0));
            y0 y0Var2 = recyclerView.x.e;
            if ((y0Var2 == null || !y0Var2.d) && z10) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int i18 = i16 < 0 ? -currVelocity : i16 > 0 ? currVelocity : 0;
                    if (i17 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i17 <= 0) {
                        currVelocity = 0;
                    }
                    if (i18 < 0) {
                        recyclerView.z();
                        if (recyclerView.V.isFinished()) {
                            recyclerView.V.onAbsorb(-i18);
                        }
                    } else if (i18 > 0) {
                        recyclerView.A();
                        if (recyclerView.a0.isFinished()) {
                            recyclerView.a0.onAbsorb(i18);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.B();
                        if (recyclerView.W.isFinished()) {
                            recyclerView.W.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.y();
                        if (recyclerView.b0.isFinished()) {
                            recyclerView.b0.onAbsorb(currVelocity);
                        }
                    }
                    if (i18 != 0 || currVelocity != 0) {
                        WeakHashMap weakHashMap = r0.i0.a;
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                if (RecyclerView.S0) {
                    a0.h hVar = recyclerView.s0;
                    int[] iArr4 = (int[]) hVar.c;
                    if (iArr4 != null) {
                        Arrays.fill(iArr4, -1);
                    }
                    hVar.d = 0;
                }
            } else {
                a();
                q qVar = recyclerView.r0;
                if (qVar != null) {
                    qVar.a(recyclerView, i12, i13);
                }
            }
        }
        recyclerView.O0 = false;
        y0 y0Var3 = recyclerView.x.e;
        if (y0Var3 != null && y0Var3.d) {
            y0Var3.c(0, 0);
        }
        this.e = false;
        if (!this.f) {
            recyclerView.setScrollState(0);
            recyclerView.A0(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap2 = r0.i0.a;
            recyclerView.postOnAnimation(this);
        }
    }
}
