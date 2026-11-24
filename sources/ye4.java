// default package

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ye4 extends n39 {
    public final Context c;
    public final /* synthetic */ af4 d;

    public ye4(af4 af4Var, Context context) {
        this.d = af4Var;
        this.c = context;
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        return false;
    }

    @Override // w39
    public final int b() {
        af4 af4Var = this.d;
        if (af4Var.f.isEmpty()) {
            return 0;
        }
        return ((int) Math.ceil(r0.size() / af4Var.s)) + (!af4Var.O ? 1 : 0);
    }

    @Override // w39
    public final int d(int i) {
        af4 af4Var = this.d;
        return i < ((int) Math.ceil((double) (((float) af4Var.f.size()) / ((float) af4Var.s)))) ? 0 : 1;
    }

    @Override // w39
    public final void t(s49 s49Var, int i) {
        af4 af4Var = this.d;
        se4 se4Var = af4Var.T;
        ArrayList arrayList = af4Var.f;
        int i2 = s49Var.f;
        View view = s49Var.a;
        if (i2 != 0) {
            if (i2 != 3) {
                if (i2 == 1) {
                    int ceil = (int) Math.ceil(arrayList.size() / af4Var.s);
                    byte b = af4Var.s;
                    ((pi4) view).w = b - ((ceil * b) - arrayList.size());
                    return;
                }
                return;
            }
            ue3 ue3Var = (ue3) view;
            ue3Var.t2 = i != b() - 1;
            k27 k27Var = (k27) arrayList.get(i);
            boolean z = ue3Var.getMessage() != null && ue3Var.getMessage().e1() == k27Var.e1();
            ue3Var.P = af4Var.q0;
            ue3Var.f0(k27.B0(k27Var.k), k27Var, k27Var.k.date, false, false);
            if (!af4Var.p0.t()) {
                ue3Var.e0(false, z);
                return;
            }
            int e1 = k27Var.e1();
            se4Var.a = k27.B0(k27Var.k);
            se4Var.b = e1;
            ue3Var.e0(af4Var.p0.b(se4Var), z);
            return;
        }
        rfa rfaVar = (rfa) view;
        rfaVar.setItemsCount(af4Var.s);
        rfaVar.setIsFirst(i == 0);
        int i3 = 0;
        while (true) {
            byte b2 = af4Var.s;
            if (i3 >= b2) {
                rfaVar.requestLayout();
                return;
            }
            int i4 = (b2 * i) + i3;
            if (i4 < arrayList.size()) {
                k27 k27Var2 = (k27) arrayList.get(i4);
                rfaVar.c(i3, arrayList.indexOf(k27Var2), k27Var2);
                if (af4Var.p0.t()) {
                    int e12 = k27Var2.e1();
                    se4Var.a = k27.B0(k27Var2.k);
                    se4Var.b = e12;
                    rfaVar.b(i3, af4Var.p0.b(se4Var), true);
                } else {
                    rfaVar.b(i3, false, true);
                }
            } else {
                rfaVar.c(i3, i4, null);
            }
            i3++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [ne4, pi4] */
    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        FrameLayout frameLayout;
        Context context = this.c;
        if (i == 0) {
            rfa rfaVar = new rfa(context);
            Paint paint = new Paint();
            rfaVar.n = paint;
            rfaVar.s = y6c.t0;
            rfaVar.r = true;
            paint.setColor(bkb.w0(null, bkb.Bi, false));
            rfaVar.b = new k27[6];
            rfaVar.a = new ofa[6];
            rfaVar.c = new int[6];
            for (int i2 = 0; i2 < 6; i2++) {
                rfaVar.a[i2] = new ofa(rfaVar, context);
                rfaVar.addView(rfaVar.a[i2]);
                rfaVar.a[i2].setVisibility(4);
                rfaVar.a[i2].setTag(Integer.valueOf(i2));
                rfaVar.a[i2].setOnClickListener(new ik8(rfaVar, (byte) 27));
                rfaVar.a[i2].setOnLongClickListener(new zs(rfaVar, (byte) 17));
            }
            rfaVar.setDelegate(new gi3(this));
            frameLayout = rfaVar;
        } else if (i != 2) {
            ?? ne4Var = new ne4((byte) 1, context, this);
            ne4Var.setIsSingleCell(true);
            ne4Var.setViewType(2);
            frameLayout = ne4Var;
        } else {
            FrameLayout l35Var = new l35(context, null);
            l35Var.setBackgroundColor(bkb.w0(null, bkb.d7, false) & (-218103809));
            frameLayout = l35Var;
        }
        return ls6.h(frameLayout, frameLayout, -1, -2);
    }
}
