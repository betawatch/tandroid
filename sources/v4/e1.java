package v4;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class e1 implements Runnable {
    public int a;
    public int b;
    public OverScroller c;
    public Interpolator d;
    public boolean e;
    public boolean f;
    public final /* synthetic */ RecyclerView h;

    public e1(RecyclerView recyclerView) {
        this.h = recyclerView;
        c5.c cVar = RecyclerView.S0;
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

    public final void b(int i7, int i10, int i11, Interpolator interpolator) {
        int i12;
        RecyclerView recyclerView = this.h;
        if (i11 == Integer.MIN_VALUE) {
            int abs = Math.abs(i7);
            int abs2 = Math.abs(i10);
            boolean z10 = abs > abs2;
            int sqrt = (int) Math.sqrt(0);
            int sqrt2 = (int) Math.sqrt((i10 * i10) + (i7 * i7));
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
        this.c.startScroll(0, 0, i7, i10, i14);
        a();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7;
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
                i7 = i13 - iArr[0];
                i10 = i14 - iArr[1];
            } else {
                i7 = i13;
                i10 = i14;
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.o(i7, i10);
            }
            if (recyclerView.x != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                recyclerView.u0(i7, i10, iArr);
                i11 = iArr[0];
                i12 = iArr[1];
                i7 -= i11;
                i10 -= i12;
                b1 b1Var = recyclerView.y.e;
                if (b1Var != null && !b1Var.d && b1Var.e) {
                    int b10 = recyclerView.v0.b();
                    if (b10 == 0) {
                        b1Var.h();
                    } else if (b1Var.a >= b10) {
                        b1Var.a = b10 - 1;
                        b1Var.c(i11, i12);
                    } else {
                        b1Var.c(i11, i12);
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
            recyclerView.w(i11, i12, i7, i10, null, 1, iArr3);
            int i15 = i7 - iArr[0];
            int i16 = i10 - iArr[1];
            if (i11 != 0 || i12 != 0) {
                recyclerView.x(i11, i12);
            }
            awakenScrollBars = recyclerView.awakenScrollBars();
            if (!awakenScrollBars) {
                recyclerView.invalidate();
            }
            boolean z10 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i15 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i16 != 0));
            b1 b1Var2 = recyclerView.y.e;
            if ((b1Var2 == null || !b1Var2.d) && z10) {
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
                h2.f fVar = recyclerView.u0;
                int[] iArr4 = fVar.d;
                if (iArr4 != null) {
                    Arrays.fill(iArr4, -1);
                }
                fVar.c = 0;
            } else {
                a();
                r rVar = recyclerView.t0;
                if (rVar != null) {
                    rVar.a(recyclerView, i11, i12);
                }
            }
        }
        recyclerView.Q0 = false;
        b1 b1Var3 = recyclerView.y.e;
        if (b1Var3 != null && b1Var3.d) {
            b1Var3.c(0, 0);
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
