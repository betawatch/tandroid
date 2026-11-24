// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class xe4 extends j39 {
    public final Context r;
    public final we4 s = new we4(this);
    public final /* synthetic */ af4 w;

    public xe4(af4 af4Var, Context context) {
        this.w = af4Var;
        this.r = context;
    }

    @Override // w29
    public final String F(int i) {
        return null;
    }

    @Override // w29
    public final void G(o39 o39Var, float f, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // j39
    public final int M(int i) {
        af4 af4Var = this.w;
        ArrayList arrayList = af4Var.n;
        if (i < arrayList.size()) {
            return ((ArrayList) af4Var.r.get(arrayList.get(i))).size() + (i == 0 ? 0 : 1);
        }
        return 1;
    }

    @Override // j39
    public final Object O(int i, int i2) {
        return null;
    }

    @Override // j39
    public final int P(int i, int i2) {
        if (i < this.w.n.size()) {
            return (i == 0 || i2 != 0) ? 1 : 0;
        }
        return 2;
    }

    @Override // j39
    public final int R() {
        af4 af4Var = this.w;
        ArrayList arrayList = af4Var.n;
        int i = 0;
        if (af4Var.f.isEmpty() || (arrayList.isEmpty() && af4Var.N)) {
            return 0;
        }
        int size = arrayList.size();
        if (!arrayList.isEmpty() && !af4Var.O) {
            i = 1;
        }
        return size + i;
    }

    @Override // j39
    public final View T(int i, View view) {
        ArrayList arrayList = this.w.n;
        if (view == null) {
            view = new l35(this.r, null);
            view.setBackgroundColor(bkb.w0(null, bkb.d7, false) & (-218103809));
        }
        if (i == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        if (i < arrayList.size()) {
            view.setAlpha(1.0f);
            ((l35) view).setText(k96.e0(((k27) ((ArrayList) r0.r.get((String) arrayList.get(i))).get(0)).k.date, false));
        }
        return view;
    }

    @Override // j39
    public final boolean V(int i, int i2, s49 s49Var) {
        return true;
    }

    @Override // j39
    public final void W(int i, int i2, s49 s49Var) {
        af4 af4Var = this.w;
        ArrayList arrayList = af4Var.n;
        int i3 = s49Var.f;
        View view = s49Var.a;
        if (i3 != 2) {
            ArrayList arrayList2 = (ArrayList) af4Var.r.get((String) arrayList.get(i));
            int i4 = s49Var.f;
            boolean z = false;
            if (i4 == 0) {
                ((l35) view).setText(k96.e0(((k27) arrayList2.get(0)).k.date, false));
                return;
            }
            if (i4 == 1) {
                if (i != 0) {
                    i2--;
                }
                lba lbaVar = (lba) view;
                k27 k27Var = (k27) arrayList2.get(i2);
                boolean z2 = lbaVar.getMessage() != null && lbaVar.getMessage().e1() == k27Var.e1();
                if (i2 != arrayList2.size() - 1 || (i == arrayList.size() - 1 && af4Var.N)) {
                    z = true;
                }
                lbaVar.E = z;
                lbaVar.e();
                lbaVar.c0 = k27Var;
                lbaVar.requestLayout();
                lbaVar.getViewTreeObserver().addOnPreDrawListener(new b32(this, lbaVar, k27Var, z2, (byte) 4));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        l35 l35Var;
        Context context = this.r;
        if (i == 0) {
            l35Var = new l35(context, null);
        } else if (i != 1) {
            pi4 pi4Var = new pi4(context, null);
            pi4Var.setViewType(5);
            pi4Var.setIsSingleCell(true);
            l35Var = pi4Var;
        } else {
            lba lbaVar = new lba(1, null, context);
            lbaVar.setDelegate(this.s);
            l35Var = lbaVar;
        }
        return ls6.h(l35Var, l35Var, -1, -2);
    }
}
