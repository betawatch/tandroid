// default package

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class wdb extends cra {
    public Paint[] r;
    public final /* synthetic */ byte s;
    public final /* synthetic */ boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public wdb(Context context, int i, int i2) {
        super(context);
        this.s = i;
        this.w = i2;
        c();
    }

    @Override // cra
    public final void a() {
        bra braVar = new bra(this.s);
        this.a = braVar;
        braVar.N = kk7.q1;
        int i = 0;
        braVar.L = false;
        braVar.G = false;
        braVar.J = true;
        braVar.H = true;
        braVar.I = false;
        braVar.m = true;
        braVar.h = true;
        if (this.w) {
            braVar.k = gl.L(24.0f);
        }
        this.r = new Paint[20];
        while (true) {
            Paint[] paintArr = this.r;
            if (i >= paintArr.length) {
                bra braVar2 = this.a;
                braVar2.l = new z02(this, (byte) 10);
                braVar2.r = (byte) 17;
                braVar2.s = (byte) 18;
                braVar2.t = (byte) 19;
                braVar2.P = bkb.F6;
                braVar2.c();
                return;
            }
            paintArr[i] = new Paint(1);
            this.r[i].setColorFilter(new PorterDuffColorFilter(bm2.f(i / (this.r.length - 1), -13729319, -14238726), PorterDuff.Mode.SRC_IN));
            i++;
        }
    }

    @Override // cra
    public final int getStarsRectWidth() {
        return getMeasuredWidth();
    }
}
