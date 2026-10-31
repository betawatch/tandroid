package rh;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.zs;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class o7 extends kg.g2 {
    public final /* synthetic */ int r;
    public Paint[] s;
    public final /* synthetic */ int w;
    public final /* synthetic */ int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o7(Context context, int i10, int i11, int i12) {
        super(context);
        this.r = i12;
        switch (i12) {
            case 1:
                this.w = i10;
                this.x = i11;
                super(context);
                c();
                break;
            default:
                this.w = i10;
                this.x = i11;
                c();
                break;
        }
    }

    @Override // kg.g2
    public final void a() {
        int f7;
        float f10;
        int i10;
        int i11;
        switch (this.r) {
            case 0:
                kg.f2 f2Var = new kg.f2(this.w);
                this.a = f2Var;
                f2Var.O = zs.q1;
                int i12 = 0;
                f2Var.M = false;
                f2Var.G = false;
                f2Var.K = true;
                f2Var.H = true;
                f2Var.J = false;
                f2Var.m = true;
                f2Var.h = true;
                int i13 = this.x;
                if (i13 == 1) {
                    f2Var.k = org.telegram.messenger.i0.L(24.0f);
                }
                this.s = new Paint[i13 == 2 ? 40 : 20];
                while (true) {
                    Paint[] paintArr = this.s;
                    if (i12 >= paintArr.length) {
                        kg.f2 f2Var2 = this.a;
                        f2Var2.l = new jg.v(this, 3);
                        f2Var2.r = 17;
                        f2Var2.s = 18;
                        f2Var2.t = 19;
                        if (i13 == 2) {
                            f2Var2.N = true;
                            f2Var2.r = 9;
                            f2Var2.s = 11;
                            f2Var2.t = 13;
                            f2Var2.o = 1.6f;
                            f2Var2.x = 1400L;
                            f2Var2.y = 1600;
                            f2Var2.L = true;
                        }
                        f2Var2.Q = org.telegram.ui.ActionBar.t6.G6;
                        f2Var2.c();
                        break;
                    } else {
                        paintArr[i12] = new Paint(1);
                        if (i13 == 2) {
                            if (i12 >= 20) {
                                f10 = (i12 - 20) / 19.0f;
                                i10 = -1005568;
                                i11 = -2062336;
                            } else if (i12 % 5 == 0) {
                                f7 = -2340;
                            } else {
                                f10 = i12 / 19.0f;
                                i10 = -10645;
                                i11 = -20165;
                            }
                            f7 = i0.b.f(f10, i10, i11);
                        } else {
                            f7 = i0.b.f(i12 / (this.s.length - 1), -371690, -14281);
                        }
                        this.s[i12].setColorFilter(new PorterDuffColorFilter(f7, PorterDuff.Mode.SRC_IN));
                        i12++;
                    }
                }
            default:
                kg.f2 f2Var3 = new kg.f2(this.w);
                this.a = f2Var3;
                f2Var3.O = zs.r1;
                int i14 = 0;
                f2Var3.M = false;
                f2Var3.G = false;
                f2Var3.K = true;
                f2Var3.H = true;
                f2Var3.J = false;
                f2Var3.m = true;
                f2Var3.h = true;
                if (this.x == 1) {
                    f2Var3.k = org.telegram.messenger.i0.L(24.0f);
                }
                this.s = new Paint[20];
                while (true) {
                    Paint[] paintArr2 = this.s;
                    if (i14 >= paintArr2.length) {
                        kg.f2 f2Var4 = this.a;
                        f2Var4.l = new jg.v(this, 5);
                        f2Var4.r = 17;
                        f2Var4.s = 18;
                        f2Var4.t = 19;
                        f2Var4.Q = org.telegram.ui.ActionBar.t6.G6;
                        f2Var4.c();
                        break;
                    } else {
                        paintArr2[i14] = new Paint(1);
                        this.s[i14].setColorFilter(new PorterDuffColorFilter(i0.b.f(i14 / (this.s.length - 1), -13729319, -14238726), PorterDuff.Mode.SRC_IN));
                        i14++;
                    }
                }
        }
    }

    @Override // kg.g2
    public final int getStarsRectWidth() {
        switch (this.r) {
        }
        return getMeasuredWidth();
    }
}
