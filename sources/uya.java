// default package

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class uya extends eva {
    public Paint[] r;
    public final /* synthetic */ short s;
    public final /* synthetic */ byte w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public uya(Context context, int i, int i2) {
        super(context);
        this.s = i;
        this.w = i2;
        c();
    }

    @Override // eva
    public final void a() {
        int f;
        float f2;
        int i;
        int i2;
        dva dvaVar = new dva(this.s);
        this.a = dvaVar;
        dvaVar.N = jn7.p1;
        int i3 = 0;
        dvaVar.L = false;
        dvaVar.G = false;
        dvaVar.J = true;
        dvaVar.H = true;
        dvaVar.I = false;
        dvaVar.m = true;
        dvaVar.h = true;
        byte b = this.w;
        if (b == 1) {
            dvaVar.k = hl.L(24.0f);
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
                f = vm2.f(f2, i, i2);
            } else {
                f = vm2.f(i3 / (this.r.length - 1), -371690, -14281);
            }
            this.r[i3].setColorFilter(new PorterDuffColorFilter(f, PorterDuff.Mode.SRC_IN));
            i3++;
        }
        dva dvaVar2 = this.a;
        dvaVar2.l = new p12(this, (byte) 9);
        dvaVar2.r = (byte) 17;
        dvaVar2.s = (byte) 18;
        dvaVar2.t = (byte) 19;
        if (b == 2) {
            dvaVar2.M = true;
            dvaVar2.r = (byte) 9;
            dvaVar2.s = (byte) 11;
            dvaVar2.t = (byte) 13;
            dvaVar2.o = 1.6f;
            dvaVar2.x = (short) 1400;
            dvaVar2.y = (short) 1600;
            dvaVar2.K = true;
        }
        dvaVar2.P = aob.G6;
        dvaVar2.c();
    }

    @Override // eva
    public final int getStarsRectWidth() {
        return getMeasuredWidth();
    }
}
