package vh;

import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class u8 {
    public int a;
    public boolean b;
    public x8 c;
    public String d;
    public long e;
    public long f;
    public float g;
    public float h;
    public float i;
    public final RectF j = new RectF();
    public final org.telegram.ui.Components.t5 k;
    public final /* synthetic */ z8 l;

    public u8(z8 z8Var) {
        this.l = z8Var;
        this.k = new org.telegram.ui.Components.t5(z8Var, 360L, gr.h);
    }

    public static void a(u8 u8Var, boolean z10) {
        z8 z8Var = u8Var.l;
        if (z8Var.getMeasuredWidth() > 0) {
            x8 x8Var = u8Var.c;
            if (x8Var == null || z10) {
                if (x8Var != null) {
                    x8Var.b();
                    u8Var.c = null;
                }
                z8 z8Var2 = u8Var.l;
                boolean z11 = u8Var.b;
                String str = u8Var.d;
                int i10 = z8Var2.v1;
                int i11 = z8Var2.y1;
                int i12 = (i10 - i11) - i11;
                int L = org.telegram.messenger.i0.L(38.0f);
                long j10 = u8Var.e;
                u8Var.c = new x8(z8Var2, z11, str, i12, L, j10 > 2 ? Long.valueOf(j10) : null, z8Var.getMaxScrollDuration(), z8Var.Z0, z8Var.a1, new d0(u8Var, 21));
            }
        }
    }

    public static void b(u8 u8Var) {
        z8 z8Var = u8Var.l;
        int i10 = u8Var.a;
        if (i10 >= 0) {
            ArrayList arrayList = z8Var.r;
            if (i10 >= arrayList.size()) {
                return;
            }
            s8 s8Var = (s8) arrayList.get(u8Var.a);
            if (z8Var.getMeasuredWidth() <= 0 || s8Var != null) {
                return;
            }
            if (s8Var != null) {
                s8Var.a();
            }
            arrayList.set(u8Var.a, new s8(z8Var, u8Var.d, (z8Var.getMeasuredWidth() - z8Var.getPaddingLeft()) - z8Var.getPaddingRight()));
        }
    }
}
