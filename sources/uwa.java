// default package

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class uwa extends dta {
    public Paint[] r;
    public final /* synthetic */ short s;
    public final /* synthetic */ byte w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public uwa(Context context, int i, int i2) {
        super(context);
        this.s = i;
        this.w = i2;
        c();
    }

    @Override // dta
    public final void a() {
        int f;
        float f2;
        int i;
        int i2;
        cta ctaVar = new cta(this.s);
        this.a = ctaVar;
        ctaVar.N = nm7.p1;
        int i3 = 0;
        ctaVar.L = false;
        ctaVar.G = false;
        ctaVar.J = true;
        ctaVar.H = true;
        ctaVar.I = false;
        ctaVar.m = true;
        ctaVar.h = true;
        byte b = this.w;
        if (b == 1) {
            ctaVar.k = gm.L(24.0f);
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
                f = on2.f(f2, i, i2);
            } else {
                f = on2.f(i3 / (this.r.length - 1), -371690, -14281);
            }
            this.r[i3].setColorFilter(new PorterDuffColorFilter(f, PorterDuff.Mode.SRC_IN));
            i3++;
        }
        cta ctaVar2 = this.a;
        ctaVar2.l = new k22(this, (byte) 9);
        ctaVar2.r = (byte) 17;
        ctaVar2.s = (byte) 18;
        ctaVar2.t = (byte) 19;
        if (b == 2) {
            ctaVar2.M = true;
            ctaVar2.r = (byte) 9;
            ctaVar2.s = (byte) 11;
            ctaVar2.t = (byte) 13;
            ctaVar2.o = 1.6f;
            ctaVar2.x = (short) 1400;
            ctaVar2.y = (short) 1600;
            ctaVar2.K = true;
        }
        ctaVar2.P = cmb.F6;
        ctaVar2.c();
    }

    @Override // dta
    public final int getStarsRectWidth() {
        return getMeasuredWidth();
    }
}
