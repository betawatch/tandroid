// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class vg4 extends y69 {
    public final Context r;
    public final ug4 s = new ug4(this);
    public final /* synthetic */ yg4 w;

    public vg4(yg4 yg4Var, Context context) {
        this.w = yg4Var;
        this.r = context;
    }

    @Override // l69
    public final String F(int i) {
        return null;
    }

    @Override // l69
    public final void G(d79 d79Var, float f, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // y69
    public final int M(int i) {
        yg4 yg4Var = this.w;
        ArrayList arrayList = yg4Var.n;
        if (i < arrayList.size()) {
            return ((ArrayList) yg4Var.r.get(arrayList.get(i))).size() + (i == 0 ? 0 : 1);
        }
        return 1;
    }

    @Override // y69
    public final Object O(int i, int i2) {
        return null;
    }

    @Override // y69
    public final int P(int i, int i2) {
        if (i < this.w.n.size()) {
            return (i == 0 || i2 != 0) ? 1 : 0;
        }
        return 2;
    }

    @Override // y69
    public final int R() {
        yg4 yg4Var = this.w;
        ArrayList arrayList = yg4Var.n;
        int i = 0;
        if (yg4Var.f.isEmpty() || (arrayList.isEmpty() && yg4Var.N)) {
            return 0;
        }
        int size = arrayList.size();
        if (!arrayList.isEmpty() && !yg4Var.O) {
            i = 1;
        }
        return size + i;
    }

    @Override // y69
    public final View T(int i, View view) {
        ArrayList arrayList = this.w.n;
        if (view == null) {
            view = new p55(this.r, null);
            view.setBackgroundColor(aob.w0(null, aob.e7, false) & (-218103809));
        }
        if (i == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        if (i < arrayList.size()) {
            view.setAlpha(1.0f);
            ((p55) view).setText(ob6.e0(((r47) ((ArrayList) r0.r.get((String) arrayList.get(i))).get(0)).k.date, false));
        }
        return view;
    }

    @Override // y69
    public final boolean V(int i, int i2, f89 f89Var) {
        return true;
    }

    @Override // y69
    public final void W(int i, int i2, f89 f89Var) {
        yg4 yg4Var = this.w;
        ArrayList arrayList = yg4Var.n;
        int i3 = f89Var.f;
        View view = f89Var.a;
        if (i3 != 2) {
            ArrayList arrayList2 = (ArrayList) yg4Var.r.get((String) arrayList.get(i));
            int i4 = f89Var.f;
            boolean z = false;
            if (i4 == 0) {
                ((p55) view).setText(ob6.e0(((r47) arrayList2.get(0)).k.date, false));
                return;
            }
            if (i4 == 1) {
                if (i != 0) {
                    i2--;
                }
                cfa cfaVar = (cfa) view;
                r47 r47Var = (r47) arrayList2.get(i2);
                boolean z2 = cfaVar.getMessage() != null && cfaVar.getMessage().e1() == r47Var.e1();
                if (i2 != arrayList2.size() - 1 || (i == arrayList.size() - 1 && yg4Var.N)) {
                    z = true;
                }
                cfaVar.E = z;
                cfaVar.e();
                cfaVar.c0 = r47Var;
                cfaVar.requestLayout();
                cfaVar.getViewTreeObserver().addOnPreDrawListener(new s32(this, cfaVar, r47Var, z2, (byte) 4));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        p55 p55Var;
        Context context = this.r;
        if (i == 0) {
            p55Var = new p55(context, null);
        } else if (i != 1) {
            tk4 tk4Var = new tk4(context, null);
            tk4Var.setViewType(5);
            tk4Var.setIsSingleCell(true);
            p55Var = tk4Var;
        } else {
            cfa cfaVar = new cfa(1, null, context);
            cfaVar.setDelegate(this.s);
            p55Var = cfaVar;
        }
        return qu6.h(p55Var, p55Var, -1, -2);
    }
}
