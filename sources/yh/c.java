package yh;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.xv0;
import org.telegram.ui.Components.zv0;
import org.telegram.ui.zg1;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements le.d, xv0, zv0, org.telegram.ui.ActionBar.a2, Utilities.Callback5, Utilities.Callback5Return {
    public final /* synthetic */ h a;

    public /* synthetic */ c(h hVar) {
        this.a = hVar;
    }

    @Override // le.d
    public void a0(int i10, float f7, float f10, le.e eVar) {
        this.a.s0();
    }

    @Override // org.telegram.ui.Components.xv0
    public int b() {
        return this.a.n;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        h hVar = this.a;
        hVar.getClass();
        hVar.presentFragment(new zg1(6, null));
    }

    @Override // org.telegram.ui.Components.zv0
    public /* synthetic */ float h(RecyclerView recyclerView) {
        return org.telegram.ui.Cells.c1.c(recyclerView);
    }

    @Override // org.telegram.ui.Components.zv0
    public RecyclerView i(View view) {
        h hVar = this.a;
        if (hVar.a == 1) {
            return ((g) view).c;
        }
        hVar.K.getClass();
        return ((w7) view).a;
    }

    @Override // org.telegram.ui.Components.zv0
    public /* synthetic */ void n(RecyclerView recyclerView) {
        org.telegram.ui.Cells.c1.b(recyclerView);
    }

    @Override // org.telegram.messenger.Utilities.Callback5Return
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        this.a.getClass();
        return Boolean.FALSE;
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        h.T(this.a, (h61) obj);
    }

    @Override // le.d
    public /* synthetic */ void V(float f7, int i10) {
    }
}
