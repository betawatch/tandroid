package u4;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class c1 implements Runnable {
    public int a;
    public int b;
    public OverScroller c;
    public Interpolator d;
    public boolean e;
    public boolean f;
    public final /* synthetic */ RecyclerView h;

    public c1(RecyclerView recyclerView) {
        this.h = recyclerView;
        b5.c cVar = RecyclerView.S0;
        this.d = cVar;
        this.e = false;
        this.f = false;
        this.c = new OverScroller(recyclerView.getContext(), cVar);
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

    public final void b(int i3, int i10, int i11, Interpolator interpolator) {
        int i12;
        RecyclerView recyclerView = this.h;
        if (i11 == Integer.MIN_VALUE) {
            int abs = Math.abs(i3);
            int abs2 = Math.abs(i10);
            boolean z10 = abs > abs2;
            int sqrt = (int) Math.sqrt(0);
            int sqrt2 = (int) Math.sqrt((i10 * i10) + (i3 * i3));
            int width = z10 ? recyclerView.getWidth() : recyclerView.getHeight();
            int i13 = width / 2;
            float f10 = width;
            float f11 = i13;
            float sin = (((float) Math.sin((Math.min(1.0f, (sqrt2 * 1.0f) / f10) - 0.5f) * 0.47123894f)) * f11) + f11;
            if (sqrt > 0) {
                i12 = Math.round(Math.abs(sin / sqrt) * 1000.0f) * 4;
            } else {
                if (!z10) {
                    abs = abs2;
                }
                i12 = (int) (((abs / f10) + 1.0f) * 300.0f);
            }
            i11 = Math.min(i12, 2000);
        }
        int i14 = i11;
        if (interpolator == null) {
            interpolator = RecyclerView.S0;
        }
        if (this.d != interpolator) {
            this.d = interpolator;
            this.c = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.b = 0;
        this.a = 0;
        recyclerView.setScrollState(2);
        this.c.startScroll(0, 0, i3, i10, i14);
        a();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3;
        int i10;
        int i11;
        int i12;
        boolean awakenScrollBars;
        RecyclerView recyclerView = this.h;
        int[] iArr = recyclerView.K0;
        if (recyclerView.y == null) {
            recyclerView.P0 = true;
            recyclerView.removeCallbacks(this);
            this.c.abortAnimation();
            return;
        }
        this.f = false;
        this.e = true;
        recyclerView.p();
        OverScroller overScroller = this.c;
        recyclerView.Q0 = true;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i13 = currX - this.a;
            int i14 = currY - this.b;
            this.a = currX;
            this.b = currY;
            int[] iArr2 = recyclerView.K0;
            iArr2[0] = 0;
            iArr2[1] = 0;
            if (recyclerView.v(i13, i14, 1, iArr2, null)) {
                i3 = i13 - iArr[0];
                i10 = i14 - iArr[1];
            } else {
                i3 = i13;
                i10 = i14;
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.o(i3, i10);
            }
            if (recyclerView.x != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                recyclerView.u0(i3, i10, iArr);
                i11 = iArr[0];
                i12 = iArr[1];
                i3 -= i11;
                i10 -= i12;
                z0 z0Var = recyclerView.y.e;
                if (z0Var != null && !z0Var.d && z0Var.e) {
                    int b10 = recyclerView.v0.b();
                    if (b10 == 0) {
                        z0Var.h();
                    } else if (z0Var.a >= b10) {
                        z0Var.a = b10 - 1;
                        z0Var.c(i11, i12);
                    } else {
                        z0Var.c(i11, i12);
                    }
                }
            } else {
                i11 = 0;
                i12 = 0;
            }
            if (!recyclerView.E.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.K0;
            iArr3[0] = 0;
            iArr3[1] = 0;
            recyclerView.w(i11, i12, i3, i10, null, 1, iArr3);
            int i15 = i3 - iArr[0];
            int i16 = i10 - iArr[1];
            if (i11 != 0 || i12 != 0) {
                recyclerView.x(i11, i12);
            }
            awakenScrollBars = recyclerView.awakenScrollBars();
            if (!awakenScrollBars) {
                recyclerView.invalidate();
            }
            boolean z10 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i15 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i16 != 0));
            z0 z0Var2 = recyclerView.y.e;
            if ((z0Var2 == null || !z0Var2.d) && z10) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int i17 = i15 < 0 ? -currVelocity : i15 > 0 ? currVelocity : 0;
                    if (i16 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i16 <= 0) {
                        currVelocity = 0;
                    }
                    Integer num = recyclerView.J0;
                    if (num == null || num.intValue() != 0) {
                        if (i17 < 0) {
                            recyclerView.z();
                            if (recyclerView.W.isFinished()) {
                                recyclerView.W.onAbsorb(-i17);
                            }
                        } else if (i17 > 0) {
                            recyclerView.A();
                            if (recyclerView.b0.isFinished()) {
                                recyclerView.b0.onAbsorb(i17);
                            }
                        }
                        if (currVelocity < 0) {
                            recyclerView.B();
                            if (recyclerView.a0.isFinished()) {
                                recyclerView.a0.onAbsorb(-currVelocity);
                            }
                        } else if (currVelocity > 0) {
                            recyclerView.y();
                            if (recyclerView.c0.isFinished()) {
                                recyclerView.c0.onAbsorb(currVelocity);
                            }
                        }
                        if (i17 != 0 || currVelocity != 0) {
                            WeakHashMap weakHashMap = r0.i0.a;
                            recyclerView.postInvalidateOnAnimation();
                        }
                    }
                }
                g2.g gVar = recyclerView.u0;
                int[] iArr4 = gVar.d;
                if (iArr4 != null) {
                    Arrays.fill(iArr4, -1);
                }
                gVar.c = 0;
            } else {
                a();
                q qVar = recyclerView.t0;
                if (qVar != null) {
                    qVar.a(recyclerView, i11, i12);
                }
            }
        }
        recyclerView.Q0 = false;
        z0 z0Var3 = recyclerView.y.e;
        if (z0Var3 != null && z0Var3.d) {
            z0Var3.c(0, 0);
        }
        this.e = false;
        if (!this.f) {
            recyclerView.setScrollState(0);
            recyclerView.B0(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap2 = r0.i0.a;
            recyclerView.postOnAnimation(this);
        }
    }
}
