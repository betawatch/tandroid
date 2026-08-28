package qh;

import android.content.Context;
import android.widget.FrameLayout;
import g7.v6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public abstract class y extends FrameLayout implements c4 {
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
        this.b.a(aVar, new kh.p(this, 20));
    }

    public int e() {
        return 0;
    }

    public void f(int i9) {
        int i10;
        int d = v6.d(this.a);
        int i11 = 0;
        int e10 = (i9 > 0 || d > 0) ? e() : 0;
        a aVar = this.a;
        if (aVar == null || !aVar.n) {
            i10 = this.e;
        } else {
            i10 = aVar.l <= 0 ? 0 : AndroidUtilities.dp(e2.c.e(r3, 1, 16, 10));
        }
        a aVar2 = this.a;
        if (aVar2 == null || !aVar2.o) {
            i11 = this.h;
        } else {
            if (aVar2.m > 0) {
                i11 = AndroidUtilities.dp(e2.c.e(r7, 1, 16, 10));
            }
        }
        int i12 = i9 + e10;
        int i13 = d + e10;
        int i14 = this.d;
        int i15 = this.f;
        if (LocaleController.isRTL) {
            setPadding(i14 + i13, i10, i15 + i12, i11);
        } else {
            setPadding(i14 + i12, i10, i15 + i13, i11);
        }
    }

    public final void g(int i9, int i10, int i11, int i12) {
        this.d = i9;
        this.e = i10;
        this.f = i11;
        this.h = i12;
        int i13 = this.c;
        if (LocaleController.isRTL) {
            setPadding(i9, i10, i11 + i13, i12);
        } else {
            setPadding(i9 + i13, i10, i11, i12);
        }
    }
}
