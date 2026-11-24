// default package

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class qua extends cra {
    public Paint[] r;
    public final /* synthetic */ short s;
    public final /* synthetic */ byte w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public qua(Context context, int i, int i2) {
        super(context);
        this.s = i;
        this.w = i2;
        c();
    }

    @Override // cra
    public final void a() {
        int f;
        float f2;
        int i;
        int i2;
        bra braVar = new bra(this.s);
        this.a = braVar;
        braVar.N = kk7.p1;
        int i3 = 0;
        braVar.L = false;
        braVar.G = false;
        braVar.J = true;
        braVar.H = true;
        braVar.I = false;
        braVar.m = true;
        braVar.h = true;
        byte b = this.w;
        if (b == 1) {
            braVar.k = gl.L(24.0f);
        }
        this.r = new Paint[b == 2 ? 40 : 20];
        while (true) {
            Paint[] paintArr = this.r;
            if (i3 >= paintArr.length) {
                break;
            }
            paintArr[i3] = new Paint(1);
            if (b == 2) {
                if (i3 >= 20) {
                    f2 = (i3 - 20) / 19.0f;
                    i = -1005568;
                    i2 = -2062336;
                } else if (i3 % 5 == 0) {
                    f = -2340;
                } else {
                    f2 = i3 / 19.0f;
                    i = -10645;
                    i2 = -20165;
                }
                f = bm2.f(f2, i, i2);
            } else {
                f = bm2.f(i3 / (this.r.length - 1), -371690, -14281);
            }
            this.r[i3].setColorFilter(new PorterDuffColorFilter(f, PorterDuff.Mode.SRC_IN));
            i3++;
        }
        bra braVar2 = this.a;
        braVar2.l = new z02(this, (byte) 9);
        braVar2.r = (byte) 17;
        braVar2.s = (byte) 18;
        braVar2.t = (byte) 19;
        if (b == 2) {
            braVar2.M = true;
            braVar2.r = (byte) 9;
            braVar2.s = (byte) 11;
            braVar2.t = (byte) 13;
            braVar2.o = 1.6f;
            braVar2.x = (short) 1400;
            braVar2.y = (short) 1600;
            braVar2.K = true;
        }
        braVar2.P = bkb.F6;
        braVar2.c();
    }

    @Override // cra
    public final int getStarsRectWidth() {
        return getMeasuredWidth();
    }
}
