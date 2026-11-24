// default package

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import java.util.List;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class vo1 extends pr7 {
    public final /* synthetic */ int c;
    public final /* synthetic */ SparseArray d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ List f;
    public final /* synthetic */ k27 g;
    public final /* synthetic */ oz8 h;
    public final /* synthetic */ k27 i;
    public final /* synthetic */ SparseIntArray j;
    public final /* synthetic */ int k;
    public final /* synthetic */ gec l;
    public final /* synthetic */ ActionBarPopupWindow$ActionBarPopupWindowLayout m;
    public final /* synthetic */ int[] n;
    public final /* synthetic */ int o;
    public final /* synthetic */ mu1 p;

    public vo1(mu1 mu1Var, int i, SparseArray sparseArray, boolean z, List list, k27 k27Var, oz8 oz8Var, k27 k27Var2, SparseIntArray sparseIntArray, int i2, gec gecVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr, int i3) {
        this.p = mu1Var;
        this.c = i;
        this.d = sparseArray;
        this.e = z;
        this.f = list;
        this.g = k27Var;
        this.h = oz8Var;
        this.i = k27Var2;
        this.j = sparseIntArray;
        this.k = i2;
        this.l = gecVar;
        this.m = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.n = iArr;
        this.o = i3;
    }

    @Override // pr7
    public final void a(gec gecVar, Object obj) {
        gecVar.removeView((View) obj);
    }

    @Override // pr7
    public final int b() {
        return this.c;
    }

    @Override // pr7
    public final Object e(gec gecVar, int i) {
        int i2;
        SparseArray sparseArray = this.d;
        View view = (View) sparseArray.get(i);
        if (view != null) {
            gecVar.addView(view);
            return view;
        }
        int i3 = this.e ? i - 1 : i;
        TLRPC.ReactionCount reactionCount = i3 >= 0 ? (TLRPC.ReactionCount) this.f.get(i3) : null;
        Context context = gecVar.getContext();
        mu1 mu1Var = this.p;
        ku1 ku1Var = mu1Var.Ba;
        i2 = ((d) mu1Var).currentAccount;
        a09 a09Var = new a09(context, ku1Var, i2, this.g, reactionCount, true);
        oz8 oz8Var = this.h;
        a09Var.d(oz8Var.getSeenUsers());
        a09Var.H = new rh1(this, (byte) 5);
        a09Var.F = new q31(this, this.i, (byte) 15);
        a09Var.E = new pm0(this.j, i, this.k, this.l, this.m, this.n);
        if (i3 < 0) {
            a09Var.setPredictiveCount(this.o);
            oz8Var.setSeenCallback(new gw(a09Var, (byte) 3));
        }
        gecVar.addView(a09Var);
        sparseArray.put(i, a09Var);
        return a09Var;
    }

    @Override // pr7
    public final boolean f(View view, Object obj) {
        return view == obj;
    }
}
