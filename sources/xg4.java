// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class xg4 extends m59 {
    public final Context r;
    public final byte s;
    public final /* synthetic */ ch4 w;

    /* JADX WARN: Multi-variable type inference failed */
    public xg4(ch4 ch4Var, Context context, int i) {
        this.w = ch4Var;
        this.r = context;
        this.s = i;
    }

    @Override // z49
    public final String F(int i) {
        return null;
    }

    @Override // z49
    public final void G(r59 r59Var, float f, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // m59
    public final int M(int i) {
        ch4 ch4Var = this.w;
        ArrayList arrayList = ch4Var.n;
        if (i < arrayList.size()) {
            return ((ArrayList) ch4Var.r.get(arrayList.get(i))).size() + (i == 0 ? 0 : 1);
        }
        return 1;
    }

    @Override // m59
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

    @Override // m59
    public final int R() {
        ch4 ch4Var = this.w;
        ArrayList arrayList = ch4Var.n;
        int i = 0;
        if (arrayList.isEmpty()) {
            return 0;
        }
        int size = arrayList.size();
        if (!arrayList.isEmpty() && !ch4Var.O) {
            i = 1;
        }
        return size + i;
    }

    @Override // m59
    public final View T(int i, View view) {
        ArrayList arrayList = this.w.n;
        if (view == null) {
            view = new l55(this.r, null);
            view.setBackgroundColor(cmb.w0(null, cmb.d7, false) & (-218103809));
        }
        if (i == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        if (i < arrayList.size()) {
            view.setAlpha(1.0f);
            ((l55) view).setText(jb6.e0(((k47) ((ArrayList) r0.r.get((String) arrayList.get(i))).get(0)).k.date, false));
        }
        return view;
    }

    @Override // m59
    public final boolean V(int i, int i2, u69 u69Var) {
        return i == 0 || i2 != 0;
    }

    @Override // m59
    public final void W(int i, int i2, u69 u69Var) {
        boolean z;
        ch4 ch4Var = this.w;
        ArrayList arrayList = ch4Var.n;
        int i3 = u69Var.f;
        View view = u69Var.a;
        if (i3 != 2) {
            ArrayList arrayList2 = (ArrayList) ch4Var.r.get((String) arrayList.get(i));
            int i4 = u69Var.f;
            boolean z2 = false;
            if (i4 == 0) {
                ((l55) view).setText(jb6.e0(((k47) arrayList2.get(0)).k.date, false));
                return;
            }
            if (i4 != 1) {
                if (i4 == 3) {
                    if (i != 0) {
                        i2--;
                    }
                    eda edaVar = (eda) view;
                    k47 k47Var = (k47) arrayList2.get(i2);
                    boolean z3 = edaVar.getMessage() != null && edaVar.getMessage().e1() == k47Var.e1();
                    if (i2 != arrayList2.size() - 1 || (i == arrayList.size() - 1 && ch4Var.N)) {
                        z2 = true;
                    }
                    edaVar.f(k47Var, z2);
                    edaVar.getViewTreeObserver().addOnPreDrawListener(new n42(this, edaVar, k47Var, z3, (byte) 3));
                    return;
                }
                return;
            }
            if (i != 0) {
                i2--;
            }
            ida idaVar = (ida) view;
            k47 k47Var2 = (k47) arrayList2.get(i2);
            if (idaVar.getMessage() == null || idaVar.getMessage().e1() != k47Var2.e1()) {
                z = false;
            } else {
                z = false;
                z2 = true;
            }
            if (i2 != arrayList2.size() - 1 || (i == arrayList.size() - 1 && ch4Var.N)) {
                z = true;
            }
            idaVar.c(k47Var2, z);
            idaVar.getViewTreeObserver().addOnPreDrawListener(new n42(this, idaVar, k47Var2, z2, (byte) 2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        FrameLayout l55Var;
        FrameLayout frameLayout;
        Context context = this.r;
        if (i == 0) {
            l55Var = new l55(context, null);
        } else {
            if (i != 1) {
                if (i != 2) {
                    frameLayout = new wg4(this, context);
                } else {
                    tk4 tk4Var = new tk4(context, null);
                    byte b = this.s;
                    if (b == 2 || b == 4) {
                        tk4Var.setViewType(4);
                    } else {
                        tk4Var.setViewType(3);
                    }
                    tk4Var.setIsSingleCell(true);
                    frameLayout = tk4Var;
                }
                return kt6.h(frameLayout, frameLayout, -1, -2);
            }
            l55Var = new ida(2, null, context);
        }
        frameLayout = l55Var;
        return kt6.h(frameLayout, frameLayout, -1, -2);
    }
}
