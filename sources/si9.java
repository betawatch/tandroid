// default package

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class si9 extends qi9 {
    public final ri9[] X;
    public final int Y;
    public int Z;
    public ri9 a0;
    public ri9 b0;
    public final vj2 c0;

    public si9(uj9 uj9Var, Rect rect, int i, TL_iv.pageBlockButtonRow pageblockbuttonrow) {
        super(uj9Var, rect, i);
        this.Z = -1;
        this.c0 = new vj2(new oo8(this, (byte) 8));
        this.X = new ri9[pageblockbuttonrow.buttons.size()];
        int size = pageblockbuttonrow.buttons.size();
        int i2 = 0;
        while (true) {
            byte b = 2;
            if (i2 >= size) {
                break;
            }
            ri9[] ri9VarArr = this.X;
            TL_keyboard.PageButton pageButton = pageblockbuttonrow.buttons.get(i2);
            ri9VarArr[i2] = new ri9(uj9Var, i, uj9Var.l(pageButton.text, uj9.Q(16, 13)), pageButton, pageButton.type, pageButton.style, kfb.c(pageButton, TL_keyboard.TL_inlineButtonTypeDisabled.class), false, false, false, false, null, new kf9(this, b));
            i2++;
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
        j0(i0());
    }

    @Override // qi9
    public final int H() {
        ri9[] ri9VarArr = this.X;
        int L = ri9VarArr.length == 0 ? gm.L(this.a.M + 18) : ri9VarArr[0].d();
        Rect rect = this.b;
        return gm.L(4.333f) + rect.top + L + rect.bottom;
    }

    @Override // qi9
    public final int J() {
        Rect rect = this.b;
        return i0() + rect.left + rect.right;
    }

    @Override // qi9
    public final boolean P() {
        return this.b0 != null;
    }

    @Override // qi9
    public final void S() {
        for (ri9 ri9Var : this.X) {
            ri9Var.a(this.W);
        }
    }

    @Override // qi9
    public final void U() {
        for (ri9 ri9Var : this.X) {
            ri9Var.a.f(this.W);
        }
    }

    @Override // qi9
    public final boolean X(MotionEvent motionEvent) {
        View view = this.W;
        if (view == null) {
            return false;
        }
        return this.c0.a(view, motionEvent);
    }

    public final ri9 h0(float f, float f2) {
        l0();
        ri9[] ri9VarArr = this.X;
        int L = ri9VarArr.length == 0 ? gm.L(this.a.M + 18) : ri9VarArr[0].d();
        float H = (H() - L) / 2.0f;
        if (f2 < H || f2 > H + L) {
            return null;
        }
        for (ri9 ri9Var : ri9VarArr) {
            if (f >= ri9Var.d && f <= r1 + ri9Var.e) {
                return ri9Var;
            }
        }
        return null;
    }

    public final int i0() {
        ri9[] ri9VarArr = this.X;
        int length = ri9VarArr.length;
        if (length == 0) {
            return 0;
        }
        int L = (length - 1) * gm.L(7.0f);
        for (ri9 ri9Var : ri9VarArr) {
            L += ri9Var.i();
        }
        return Math.min(this.c, L);
    }

    public final void j0(int i) {
        boolean z;
        int i2;
        int i3;
        int i4;
        this.Z = i;
        ri9[] ri9VarArr = this.X;
        int length = ri9VarArr.length;
        if (length != 0) {
            int L = gm.L(7.0f);
            int i5 = (length - 1) * L;
            int max = Math.max(0, i - i5);
            int i6 = 0;
            for (ri9 ri9Var : ri9VarArr) {
                int i7 = ri9Var.i();
                ri9Var.e = i7;
                i6 += i7;
            }
            int i8 = this.Y;
            if (i6 > max) {
                int i9 = 0;
                for (ri9 ri9Var2 : ri9VarArr) {
                    i9 += ri9Var2.e - ri9Var2.f();
                }
                if (i9 <= 0) {
                    for (ri9 ri9Var3 : ri9VarArr) {
                        ri9Var3.e = ri9Var3.f();
                    }
                } else {
                    int min = Math.min(i6 - max, i9);
                    int i10 = 0;
                    int i11 = 0;
                    while (i10 < ri9VarArr.length) {
                        ri9 ri9Var4 = ri9VarArr[i10];
                        int f = ri9Var4.e - ri9Var4.f();
                        if (i10 == ri9VarArr.length - 1) {
                            i4 = min - i11;
                            i3 = i10;
                        } else {
                            i3 = i10;
                            i4 = (int) ((min * f) / i9);
                        }
                        int min2 = Math.min(i4, f);
                        ri9Var4.e -= min2;
                        i11 += min2;
                        i10 = i3 + 1;
                    }
                }
            } else if (i8 == 4) {
                boolean[] zArr = new boolean[ri9VarArr.length];
                int length2 = ri9VarArr.length;
                for (boolean z2 = true; z2 && length2 > 0; z2 = z) {
                    int i12 = max / length2;
                    z = false;
                    for (int i13 = 0; i13 < ri9VarArr.length; i13++) {
                        if (!zArr[i13] && (i2 = ri9VarArr[i13].e) > i12) {
                            zArr[i13] = true;
                            max -= i2;
                            length2--;
                            z = true;
                        }
                    }
                }
                if (length2 > 0) {
                    int i14 = max / length2;
                    int i15 = max - (length2 * i14);
                    for (int i16 = 0; i16 < ri9VarArr.length; i16++) {
                        if (!zArr[i16]) {
                            int i17 = i15 - 1;
                            ri9VarArr[i16].e = (i15 > 0 ? 1 : 0) + i14;
                            i15 = i17;
                        }
                    }
                }
            }
            for (ri9 ri9Var5 : ri9VarArr) {
                i5 += ri9Var5.e;
            }
            int F = wi8.F(i8);
            int i18 = F != 1 ? F != 2 ? 0 : (i - i5) / 2 : i - i5;
            for (ri9 ri9Var6 : ri9VarArr) {
                ri9Var6.d = i18;
                i18 += ri9Var6.e + L;
            }
        }
    }

    public final void k0(ri9 ri9Var) {
        ri9 ri9Var2 = this.a0;
        if (ri9Var2 != ri9Var) {
            if (ri9Var2 != null) {
                ri9Var2.n(false);
            }
            this.a0 = ri9Var;
            if (ri9Var != null) {
                ri9Var.n(true);
            }
        }
    }

    public final void l0() {
        uj9 uj9Var = this.a;
        int i = uj9Var.C;
        int i2 = uj9Var.S;
        int i3 = ((i + i2) + uj9Var.T) - (i2 << 1);
        Rect rect = this.b;
        int max = Math.max(0, (i3 - rect.left) - rect.right);
        if (this.Z != max) {
            j0(max);
        }
    }

    @Override // qi9
    public final void p(Canvas canvas) {
        l0();
        for (ri9 ri9Var : this.X) {
            canvas.save();
            canvas.translate(ri9Var.d, Math.round((H() - ri9Var.d()) / 2.0f));
            ri9Var.b(canvas);
            canvas.restore();
        }
    }
}
