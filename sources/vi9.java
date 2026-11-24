// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class vi9 extends qi9 {
    public static Paint c0;
    public final boolean X;
    public final ArrayList Y;
    public final int[] Z;
    public final int a0;
    public ki9 b0;

    public vi9(uj9 uj9Var, Rect rect, int i, TL_iv.pageBlockCollage pageblockcollage, boolean z) {
        super(uj9Var, rect, i);
        float f;
        int round;
        float f2;
        int i2;
        this.Y = new ArrayList();
        this.X = z;
        int i3 = 0;
        for (int i4 = 0; i4 < pageblockcollage.items.size(); i4++) {
            TL_iv.PageBlock pageBlock = pageblockcollage.items.get(i4);
            ki9 ki9Var = pageBlock instanceof TL_iv.pageBlockPhoto ? new ki9(uj9Var, (TL_iv.pageBlockPhoto) pageBlock) : pageBlock instanceof TL_iv.pageBlockVideo ? new ki9(uj9Var, (TL_iv.pageBlockVideo) pageBlock) : null;
            if (ki9Var != null) {
                this.Y.add(ki9Var);
            }
        }
        int i5 = this.c;
        ArrayList arrayList = this.Y;
        this.Z = new int[arrayList.size()];
        if (arrayList.isEmpty()) {
            this.a0 = 0;
            return;
        }
        int i6 = 1;
        if (arrayList.size() == 1) {
            ki9 ki9Var2 = (ki9) arrayList.get(0);
            float f3 = ki9Var2.F;
            f3 = f3 <= 0.0f ? 1.0f : f3;
            int i7 = (int) (i5 / f3);
            Point point = gm.q;
            int max = (int) (Math.max(point.x, point.y) * 0.55f);
            if (i7 > max) {
                i5 = (int) (max * f3);
                i7 = max;
            }
            ki9Var2.m(0, 0, i5, i7);
            this.Z[0] = 15;
            this.a0 = i7;
            return;
        }
        float[] fArr = new float[arrayList.size()];
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            fArr[i8] = ((ki9) arrayList.get(i8)).F;
        }
        c47[] e = uj9.e(fArr);
        int i9 = 0;
        for (c47 c47Var : e) {
            i9 = Math.max(i9, (int) c47Var.d);
        }
        int i10 = i9 + 1;
        float[] fArr2 = new float[i10];
        for (c47 c47Var2 : e) {
            byte b = c47Var2.c;
            if (b == c47Var2.d) {
                fArr2[b] = Math.max(fArr2[b], c47Var2.f);
            }
        }
        int length = e.length;
        int i11 = 0;
        while (i11 < length) {
            c47 c47Var3 = e[i11];
            int i12 = c47Var3.c;
            byte b2 = c47Var3.d;
            if (i12 != b2) {
                int i13 = (b2 - i12) + i6;
                float[] fArr3 = c47Var3.m;
                if (fArr3 == null || fArr3.length != i13) {
                    i2 = i6;
                    float f4 = c47Var3.f / i13;
                    while (i12 <= c47Var3.d) {
                        fArr2[i12] = Math.max(fArr2[i12], f4);
                        i12++;
                    }
                    i11++;
                    i6 = i2;
                } else {
                    int i14 = 0;
                    while (i14 < i13) {
                        int i15 = c47Var3.c + i14;
                        fArr2[i15] = Math.max(fArr2[i15], c47Var3.m[i14]);
                        i14++;
                        i6 = i6;
                    }
                }
            }
            i2 = i6;
            i11++;
            i6 = i2;
        }
        Point point2 = gm.q;
        float max2 = Math.max(point2.x, point2.y) * 0.5f;
        int[] iArr = new int[i9 + 2];
        float f5 = 0.0f;
        for (int i16 = 0; i16 <= i9; i16++) {
            iArr[i16] = Math.round(f5 * max2);
            f5 += fArr2[i16];
        }
        iArr[i10] = Math.round(f5 * max2);
        int L = gm.L(this.a.C() ? 3.0f : 2.0f);
        int i17 = 0;
        while (i17 < e.length) {
            c47 c47Var4 = e[i17];
            int i18 = iArr[c47Var4.c];
            int i19 = iArr[c47Var4.d + 1] - i18;
            float f6 = 1000.0f;
            if (c47Var4.j > 0) {
                round = Math.round((r12 * i5) / 1000.0f);
                f = 1000.0f;
            } else {
                int i20 = i3;
                int i21 = i20;
                while (i20 < e.length) {
                    if (i20 == i17) {
                        f2 = f6;
                    } else {
                        c47 c47Var5 = e[i20];
                        f2 = f6;
                        byte b3 = c47Var5.c;
                        byte b4 = c47Var4.c;
                        if (b3 <= b4 && c47Var5.d >= b4 && c47Var5.a < c47Var4.a) {
                            i21 += c47Var5.e;
                        }
                    }
                    i20++;
                    f6 = f2;
                }
                f = f6;
                round = Math.round((i21 * i5) / f);
            }
            int round2 = (c47Var4.l & 2) != 0 ? i5 - round : Math.round((c47Var4.e * i5) / f) - L;
            if ((c47Var4.l & 8) == 0) {
                i19 -= L;
            }
            ((ki9) arrayList.get(i17)).m(round, i18, Math.max(0, round2), Math.max(0, i19));
            this.Z[i17] = c47Var4.l;
            i17++;
            i3 = 0;
        }
        this.a0 = iArr[i10];
    }

    @Override // qi9
    public final int B() {
        return this.Y.size();
    }

    @Override // qi9
    public final CharSequence D(int i) {
        if (i < 0) {
            return null;
        }
        ArrayList arrayList = this.Y;
        if (i < arrayList.size()) {
            return ((ki9) arrayList.get(i)).f();
        }
        return null;
    }

    @Override // qi9
    public final int H() {
        return this.a0;
    }

    @Override // qi9
    public final int I() {
        return J();
    }

    @Override // qi9
    public final int J() {
        Rect rect = this.b;
        return rect.left + this.c + rect.right;
    }

    @Override // qi9
    public final void S() {
        ArrayList arrayList = this.Y;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ki9 ki9Var = (ki9) obj;
            View view = this.W;
            ki9Var.T = view;
            ImageReceiver imageReceiver = ki9Var.c;
            imageReceiver.p0(view);
            imageReceiver.I();
            ImageReceiver imageReceiver2 = ki9Var.d;
            imageReceiver2.p0(view);
            imageReceiver2.I();
            ki9Var.d(view);
            ki9Var.n(view, false);
        }
    }

    @Override // qi9
    public final boolean T(int i, View view) {
        if (i < 0) {
            return false;
        }
        ArrayList arrayList = this.Y;
        if (i < arrayList.size()) {
            return ((ki9) arrayList.get(i)).j(view);
        }
        return false;
    }

    @Override // qi9
    public final void U() {
        ArrayList arrayList = this.Y;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ki9 ki9Var = (ki9) obj;
            ki9Var.c.K();
            ki9Var.d.K();
            ki9Var.e = null;
            er3.q(ki9Var.a.a).v(ki9Var);
        }
    }

    @Override // qi9
    public final void V(Canvas canvas) {
        float f;
        vi9 vi9Var = this;
        boolean z = true;
        if (c0 == null) {
            Paint paint = new Paint(1);
            c0 = paint;
            paint.setColor(251658240);
        }
        boolean Q = vi9Var.Q();
        int L = gm.L(2.0f);
        uj9 uj9Var = vi9Var.a;
        int i = (Q || uj9Var.C()) ? 0 : uj9Var.S - L;
        int i2 = (Q || uj9Var.C()) ? 0 : uj9Var.T - L;
        int i3 = vi9Var.c;
        float f2 = (i3 <= 0 || (i <= 0 && i2 <= 0)) ? 1.0f : ((i3 + i) + i2) / i3;
        int i4 = 0;
        while (true) {
            ArrayList arrayList = vi9Var.Y;
            if (i4 >= arrayList.size()) {
                return;
            }
            ki9 ki9Var = (ki9) arrayList.get(i4);
            int i5 = ki9Var.G;
            ImageReceiver imageReceiver = ki9Var.c;
            int round = Math.round(i5 * f2) - i;
            int round2 = Math.round(ki9Var.I * f2);
            int[] iArr = vi9Var.Z;
            int i6 = (iArr == null || i4 >= iArr.length) ? 0 : iArr[i4];
            boolean z2 = (i6 & 4) != 0 ? z : false;
            boolean z3 = (i6 & 8) != 0 ? z : false;
            boolean z4 = (i6 & 1) != 0 ? z : false;
            boolean z5 = (i6 & 2) != 0 ? z : false;
            if (Q) {
                int L2 = gm.L(8.0f);
                imageReceiver.r0((z2 && z4) ? L2 : 0, (z2 && z5) ? L2 : 0, (z3 && z5) ? L2 : 0, (z3 && z4) ? L2 : 0);
                f = 1.0f;
            } else {
                int i7 = gda.U0;
                f = 1.0f;
                int L3 = i7 > 2 ? gm.L(i7 - 2) : gm.L(i7);
                int min = Math.min(gm.L(3.0f), L3);
                if (uj9Var.C()) {
                    imageReceiver.q0(gm.L(12.0f));
                } else {
                    boolean z6 = vi9Var.X;
                    int i8 = (z2 && z4) ? (!z6 || uj9Var.A() || (!uj9Var.D() && uj9Var.F())) ? min : L3 : 0;
                    if (!z2 || !z5) {
                        L3 = 0;
                    } else if (!z6 || uj9Var.A() || (uj9Var.D() && uj9Var.F())) {
                        L3 = min;
                    }
                    int i9 = (z3 && z5) ? min : 0;
                    if (!z3 || !z4) {
                        min = 0;
                    }
                    imageReceiver.r0(i8, L3, i9, min);
                }
            }
            float f3 = round;
            imageReceiver.i0(f3, ki9Var.H, round2, ki9Var.J);
            if (!imageReceiver.B() || imageReceiver.i1 != f) {
                canvas.drawRect(f3, ki9Var.H, round + round2, r2 + ki9Var.J, c0);
            }
            ki9Var.c(canvas);
            i4++;
            z = true;
            vi9Var = this;
        }
    }

    @Override // qi9
    public final boolean X(MotionEvent motionEvent) {
        ArrayList arrayList = this.Y;
        int actionMasked = motionEvent.getActionMasked();
        Rect rect = this.b;
        motionEvent.offsetLocation(-rect.left, -rect.top);
        try {
            if (actionMasked == 0) {
                this.b0 = null;
                for (int i = 0; i < arrayList.size(); i++) {
                    ki9 ki9Var = (ki9) arrayList.get(i);
                    if (ki9Var.g(motionEvent.getX(), motionEvent.getY()) && ki9Var.k(this.W, motionEvent)) {
                        this.b0 = ki9Var;
                        return true;
                    }
                }
            } else {
                ki9 ki9Var2 = this.b0;
                if (ki9Var2 != null) {
                    boolean k = ki9Var2.k(this.W, motionEvent);
                    if (actionMasked == 1 || actionMasked == 3) {
                        this.b0 = null;
                    }
                    return k;
                }
            }
            return false;
        } finally {
            motionEvent.offsetLocation(rect.left, rect.top);
        }
    }

    @Override // qi9
    public final void z(int i, Rect rect) {
        if (i >= 0) {
            ArrayList arrayList = this.Y;
            if (i < arrayList.size()) {
                ki9 ki9Var = (ki9) arrayList.get(i);
                Rect rect2 = this.b;
                int i2 = rect2.left + ki9Var.G;
                int i3 = ((int) this.N) + rect2.top + ki9Var.H;
                rect.set(i2, i3, ki9Var.I + i2, ki9Var.J + i3);
            }
        }
    }
}
