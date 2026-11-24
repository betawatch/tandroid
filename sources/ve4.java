// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ve4 extends j39 {
    public final Context r;
    public final byte s;
    public final /* synthetic */ af4 w;

    /* JADX WARN: Multi-variable type inference failed */
    public ve4(af4 af4Var, Context context, int i) {
        this.w = af4Var;
        this.r = context;
        this.s = i;
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
    public final int P(int i, int i2) {
        if (i >= this.w.n.size()) {
            return 2;
        }
        if (i != 0 && i2 == 0) {
            return 0;
        }
        byte b = this.s;
        return (b == 2 || b == 4) ? 3 : 1;
    }

    @Override // j39
    public final int R() {
        af4 af4Var = this.w;
        ArrayList arrayList = af4Var.n;
        int i = 0;
        if (arrayList.isEmpty()) {
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
        return i == 0 || i2 != 0;
    }

    @Override // j39
    public final void W(int i, int i2, s49 s49Var) {
        boolean z;
        af4 af4Var = this.w;
        ArrayList arrayList = af4Var.n;
        int i3 = s49Var.f;
        View view = s49Var.a;
        if (i3 != 2) {
            ArrayList arrayList2 = (ArrayList) af4Var.r.get((String) arrayList.get(i));
            int i4 = s49Var.f;
            boolean z2 = false;
            if (i4 == 0) {
                ((l35) view).setText(k96.e0(((k27) arrayList2.get(0)).k.date, false));
                return;
            }
            if (i4 != 1) {
                if (i4 == 3) {
                    if (i != 0) {
                        i2--;
                    }
                    eba ebaVar = (eba) view;
                    k27 k27Var = (k27) arrayList2.get(i2);
                    boolean z3 = ebaVar.getMessage() != null && ebaVar.getMessage().e1() == k27Var.e1();
                    if (i2 != arrayList2.size() - 1 || (i == arrayList.size() - 1 && af4Var.N)) {
                        z2 = true;
                    }
                    ebaVar.f(k27Var, z2);
                    ebaVar.getViewTreeObserver().addOnPreDrawListener(new b32(this, ebaVar, k27Var, z3, (byte) 3));
                    return;
                }
                return;
            }
            if (i != 0) {
                i2--;
            }
            iba ibaVar = (iba) view;
            k27 k27Var2 = (k27) arrayList2.get(i2);
            if (ibaVar.getMessage() == null || ibaVar.getMessage().e1() != k27Var2.e1()) {
                z = false;
            } else {
                z = false;
                z2 = true;
            }
            if (i2 != arrayList2.size() - 1 || (i == arrayList.size() - 1 && af4Var.N)) {
                z = true;
            }
            ibaVar.c(k27Var2, z);
            ibaVar.getViewTreeObserver().addOnPreDrawListener(new b32(this, ibaVar, k27Var2, z2, (byte) 2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        FrameLayout l35Var;
        FrameLayout frameLayout;
        Context context = this.r;
        if (i == 0) {
            l35Var = new l35(context, null);
        } else {
            if (i != 1) {
                if (i != 2) {
                    frameLayout = new ue4(this, context);
                } else {
                    pi4 pi4Var = new pi4(context, null);
                    byte b = this.s;
                    if (b == 2 || b == 4) {
                        pi4Var.setViewType(4);
                    } else {
                        pi4Var.setViewType(3);
                    }
                    pi4Var.setIsSingleCell(true);
                    frameLayout = pi4Var;
                }
                return ls6.h(frameLayout, frameLayout, -1, -2);
            }
            l35Var = new iba(2, null, context);
        }
        frameLayout = l35Var;
        return ls6.h(frameLayout, frameLayout, -1, -2);
    }
}
