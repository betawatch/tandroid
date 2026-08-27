package rh;

import android.content.Context;
import android.widget.FrameLayout;
import h7.z6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public abstract class y extends FrameLayout implements d4 {
    public a a;
    public final j4.x0 b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int h;

    public y(Context context) {
        super(context);
        j4.x0 x0Var = new j4.x0();
        x0Var.a = Long.MIN_VALUE;
        x0Var.b = -1;
        this.b = x0Var;
    }

    public final void c(a aVar) {
        this.b.a(aVar, new lh.p(this, 20));
    }

    public int e() {
        return 0;
    }

    public void f(int i10) {
        int i11;
        int d = z6.d(this.a);
        int i12 = 0;
        int e9 = (i10 > 0 || d > 0) ? e() : 0;
        a aVar = this.a;
        if (aVar == null || !aVar.n) {
            i11 = this.e;
        } else {
            i11 = aVar.l <= 0 ? 0 : AndroidUtilities.dp(i0.a.e(r3, 1, 16, 10));
        }
        a aVar2 = this.a;
        if (aVar2 == null || !aVar2.o) {
            i12 = this.h;
        } else {
            if (aVar2.m > 0) {
                i12 = AndroidUtilities.dp(i0.a.e(r7, 1, 16, 10));
            }
        }
        int i13 = i10 + e9;
        int i14 = d + e9;
        int i15 = this.d;
        int i16 = this.f;
        if (LocaleController.isRTL) {
            setPadding(i15 + i14, i11, i16 + i13, i12);
        } else {
            setPadding(i15 + i13, i11, i16 + i14, i12);
        }
    }

    public final void g(int i10, int i11, int i12, int i13) {
        this.d = i10;
        this.e = i11;
        this.f = i12;
        this.h = i13;
        int i14 = this.c;
        if (LocaleController.isRTL) {
            setPadding(i10, i11, i12 + i14, i13);
        } else {
            setPadding(i10 + i14, i11, i12, i13);
        }
    }
}
