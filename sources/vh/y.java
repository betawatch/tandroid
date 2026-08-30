package vh;

import android.content.Context;
import android.widget.FrameLayout;
import k7.i8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public abstract class y extends FrameLayout implements f4 {
    public a a;
    public final o4.h0 b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int h;

    public y(Context context) {
        super(context);
        o4.h0 h0Var = new o4.h0();
        h0Var.a = Long.MIN_VALUE;
        h0Var.b = -1;
        this.b = h0Var;
    }

    public final void c(a aVar) {
        this.b.a(aVar, new rh.e(this, 8));
    }

    public int d() {
        return 0;
    }

    public void f(int i10) {
        int i11;
        int d = i8.d(this.a);
        int i12 = 0;
        int d10 = (i10 > 0 || d > 0) ? d() : 0;
        a aVar = this.a;
        if (aVar == null || !aVar.n) {
            i11 = this.e;
        } else {
            i11 = aVar.l <= 0 ? 0 : AndroidUtilities.dp(e2.c.e(r3, 1, 16, 10));
        }
        a aVar2 = this.a;
        if (aVar2 == null || !aVar2.o) {
            i12 = this.h;
        } else {
            if (aVar2.m > 0) {
                i12 = AndroidUtilities.dp(e2.c.e(r7, 1, 16, 10));
            }
        }
        int i13 = i10 + d10;
        int i14 = d + d10;
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
