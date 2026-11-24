// default package

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class pg9 extends mg9 {
    public final og9[] X;
    public final int Y;
    public int Z;
    public og9 a0;
    public og9 b0;
    public final hi2 c0;

    public pg9(rh9 rh9Var, Rect rect, int i, TL_iv.pageBlockButtonRow pageblockbuttonrow) {
        super(rh9Var, rect, i);
        this.Z = -1;
        this.c0 = new hi2(new v39(this, (byte) 4));
        this.X = new og9[pageblockbuttonrow.buttons.size()];
        int size = pageblockbuttonrow.buttons.size();
        for (int i2 = 0; i2 < size; i2++) {
            og9[] og9VarArr = this.X;
            TL_keyboard.PageButton pageButton = pageblockbuttonrow.buttons.get(i2);
            og9VarArr[i2] = new og9(rh9Var, i, rh9Var.l(pageButton.text, rh9.Q(16, 13)), pageButton, pageButton.type, pageButton.style, jdb.c(pageButton, TL_keyboard.TL_inlineButtonTypeDisabled.class), false, false, false, false, null, new sr8(this, (byte) 24));
        }
        if (pageblockbuttonrow.align_left) {
            this.Y = 1;
        } else if (pageblockbuttonrow.align_center) {
            this.Y = 3;
        } else if (pageblockbuttonrow.align_right) {
            this.Y = 2;
        } else {
            this.Y = 4;
        }
        k0(j0());
    }

    @Override // mg9
    public final int I() {
        og9[] og9VarArr = this.X;
        int L = og9VarArr.length == 0 ? gl.L(this.a.M + 18) : og9VarArr[0].c();
        Rect rect = this.b;
        return gl.L(4.333f) + rect.top + L + rect.bottom;
    }

    @Override // mg9
    public final int K() {
        Rect rect = this.b;
        return j0() + rect.left + rect.right;
    }

    @Override // mg9
    public final boolean Q() {
        return this.b0 != null;
    }

    @Override // mg9
    public final void T() {
        for (og9 og9Var : this.X) {
            og9Var.a.i(this.W);
        }
    }

    @Override // mg9
    public final void V() {
        for (og9 og9Var : this.X) {
            og9Var.a.f(this.W);
        }
    }

    @Override // mg9
    public final boolean Y(MotionEvent motionEvent) {
        View view = this.W;
        if (view == null) {
            return false;
        }
        return this.c0.a(view, motionEvent);
    }

    public final og9 i0(float f, float f2) {
        m0();
        og9[] og9VarArr = this.X;
        int L = og9VarArr.length == 0 ? gl.L(this.a.M + 18) : og9VarArr[0].c();
        float I = (I() - L) / 2.0f;
        if (f2 < I || f2 > I + L) {
            return null;
        }
        for (og9 og9Var : og9VarArr) {
            if (f >= og9Var.d && f <= r1 + og9Var.e) {
                return og9Var;
            }
        }
        return null;
    }

    public final int j0() {
        og9[] og9VarArr = this.X;
        int length = og9VarArr.length;
        if (length == 0) {
            return 0;
        }
        int L = (length - 1) * gl.L(7.0f);
        for (og9 og9Var : og9VarArr) {
            L += og9Var.h();
        }
        return Math.min(this.c, L);
    }

    public final void k0(int i) {
        boolean z;
        int i2;
        int i3;
        int i4;
        this.Z = i;
        og9[] og9VarArr = this.X;
        int length = og9VarArr.length;
        if (length != 0) {
            int L = gl.L(7.0f);
            int i5 = (length - 1) * L;
            int max = Math.max(0, i - i5);
            int i6 = 0;
            for (og9 og9Var : og9VarArr) {
                int h = og9Var.h();
                og9Var.e = h;
                i6 += h;
            }
            int i7 = this.Y;
            if (i6 > max) {
                int i8 = 0;
                for (og9 og9Var2 : og9VarArr) {
                    i8 += og9Var2.e - og9Var2.e();
                }
                if (i8 <= 0) {
                    for (og9 og9Var3 : og9VarArr) {
                        og9Var3.e = og9Var3.e();
                    }
                } else {
                    int min = Math.min(i6 - max, i8);
                    int i9 = 0;
                    int i10 = 0;
                    while (i9 < og9VarArr.length) {
                        og9 og9Var4 = og9VarArr[i9];
                        int e = og9Var4.e - og9Var4.e();
                        if (i9 == og9VarArr.length - 1) {
                            i4 = min - i10;
                            i3 = i9;
                        } else {
                            i3 = i9;
                            i4 = (int) ((min * e) / i8);
                        }
                        int min2 = Math.min(i4, e);
                        og9Var4.e -= min2;
                        i10 += min2;
                        i9 = i3 + 1;
                    }
                }
            } else if (i7 == 4) {
                boolean[] zArr = new boolean[og9VarArr.length];
                int length2 = og9VarArr.length;
                for (boolean z2 = true; z2 && length2 > 0; z2 = z) {
                    int i11 = max / length2;
                    z = false;
                    for (int i12 = 0; i12 < og9VarArr.length; i12++) {
                        if (!zArr[i12] && (i2 = og9VarArr[i12].e) > i11) {
                            zArr[i12] = true;
                            max -= i2;
                            length2--;
                            z = true;
                        }
                    }
                }
                if (length2 > 0) {
                    int i13 = max / length2;
                    int i14 = max - (length2 * i13);
                    for (int i15 = 0; i15 < og9VarArr.length; i15++) {
                        if (!zArr[i15]) {
                            int i16 = i14 - 1;
                            og9VarArr[i15].e = (i14 > 0 ? 1 : 0) + i13;
                            i14 = i16;
                        }
                    }
                }
            }
            for (og9 og9Var5 : og9VarArr) {
                i5 += og9Var5.e;
            }
            int F = ug8.F(i7);
            int i17 = F != 1 ? F != 2 ? 0 : (i - i5) / 2 : i - i5;
            for (og9 og9Var6 : og9VarArr) {
                og9Var6.d = i17;
                i17 += og9Var6.e + L;
            }
        }
    }

    public final void l0(og9 og9Var) {
        og9 og9Var2 = this.a0;
        if (og9Var2 != og9Var) {
            if (og9Var2 != null) {
                og9Var2.m(false);
            }
            this.a0 = og9Var;
            if (og9Var != null) {
                og9Var.m(true);
            }
        }
    }

    public final void m0() {
        rh9 rh9Var = this.a;
        int i = rh9Var.C;
        int i2 = rh9Var.S;
        int i3 = ((i + i2) + rh9Var.T) - (i2 << 1);
        Rect rect = this.b;
        int max = Math.max(0, (i3 - rect.left) - rect.right);
        if (this.Z != max) {
            k0(max);
        }
    }

    @Override // mg9
    public final void q(Canvas canvas) {
        m0();
        for (og9 og9Var : this.X) {
            canvas.save();
            canvas.translate(og9Var.d, Math.round((I() - og9Var.c()) / 2.0f));
            og9Var.a(canvas);
            canvas.restore();
        }
    }
}
