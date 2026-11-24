// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class zg4 extends m59 {
    public final Context r;
    public final yg4 s = new yg4(this);
    public final /* synthetic */ ch4 w;

    public zg4(ch4 ch4Var, Context context) {
        this.w = ch4Var;
        this.r = context;
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
    public final Object O(int i, int i2) {
        return null;
    }

    @Override // m59
    public final int P(int i, int i2) {
        if (i < this.w.n.size()) {
            return (i == 0 || i2 != 0) ? 1 : 0;
        }
        return 2;
    }

    @Override // m59
    public final int R() {
        ch4 ch4Var = this.w;
        ArrayList arrayList = ch4Var.n;
        int i = 0;
        if (ch4Var.f.isEmpty() || (arrayList.isEmpty() && ch4Var.N)) {
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
        return true;
    }

    @Override // m59
    public final void W(int i, int i2, u69 u69Var) {
        ch4 ch4Var = this.w;
        ArrayList arrayList = ch4Var.n;
        int i3 = u69Var.f;
        View view = u69Var.a;
        if (i3 != 2) {
            ArrayList arrayList2 = (ArrayList) ch4Var.r.get((String) arrayList.get(i));
            int i4 = u69Var.f;
            boolean z = false;
            if (i4 == 0) {
                ((l55) view).setText(jb6.e0(((k47) arrayList2.get(0)).k.date, false));
                return;
            }
            if (i4 == 1) {
                if (i != 0) {
                    i2--;
                }
                lda ldaVar = (lda) view;
                k47 k47Var = (k47) arrayList2.get(i2);
                boolean z2 = ldaVar.getMessage() != null && ldaVar.getMessage().e1() == k47Var.e1();
                if (i2 != arrayList2.size() - 1 || (i == arrayList.size() - 1 && ch4Var.N)) {
                    z = true;
                }
                ldaVar.E = z;
                ldaVar.e();
                ldaVar.c0 = k47Var;
                ldaVar.requestLayout();
                ldaVar.getViewTreeObserver().addOnPreDrawListener(new n42(this, ldaVar, k47Var, z2, (byte) 4));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        l55 l55Var;
        Context context = this.r;
        if (i == 0) {
            l55Var = new l55(context, null);
        } else if (i != 1) {
            tk4 tk4Var = new tk4(context, null);
            tk4Var.setViewType(5);
            tk4Var.setIsSingleCell(true);
            l55Var = tk4Var;
        } else {
            lda ldaVar = new lda(1, null, context);
            ldaVar.setDelegate(this.s);
            l55Var = ldaVar;
        }
        return kt6.h(l55Var, l55Var, -1, -2);
    }
}
