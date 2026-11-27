// default package

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class rhb extends eva {
    public Paint[] r;
    public final /* synthetic */ byte s;
    public final /* synthetic */ boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public rhb(Context context, int i, int i2) {
        super(context);
        this.s = i;
        this.w = i2;
        c();
    }

    @Override // eva
    public final void a() {
        dva dvaVar = new dva(this.s);
        this.a = dvaVar;
        dvaVar.N = jn7.q1;
        int i = 0;
        dvaVar.L = false;
        dvaVar.G = false;
        dvaVar.J = true;
        dvaVar.H = true;
        dvaVar.I = false;
        dvaVar.m = true;
        dvaVar.h = true;
        if (this.w) {
            dvaVar.k = hl.L(24.0f);
        }
        this.r = new Paint[20];
        while (true) {
            Paint[] paintArr = this.r;
            if (i >= paintArr.length) {
                dva dvaVar2 = this.a;
                dvaVar2.l = new p12(this, (byte) 10);
                dvaVar2.r = (byte) 17;
                dvaVar2.s = (byte) 18;
                dvaVar2.t = (byte) 19;
                dvaVar2.P = aob.G6;
                dvaVar2.c();
                return;
            }
            paintArr[i] = new Paint(1);
            this.r[i].setColorFilter(new PorterDuffColorFilter(vm2.f(i / (this.r.length - 1), -13729319, -14238726), PorterDuff.Mode.SRC_IN));
            i++;
        }
    }

    @Override // eva
    public final int getStarsRectWidth() {
        return getMeasuredWidth();
    }
}
