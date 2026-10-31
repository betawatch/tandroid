package rh;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;
import org.telegram.messenger.o20;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.gu0;
import org.telegram.ui.Components.iu0;
import org.telegram.ui.tc1;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements fe.e, gu0, iu0, org.telegram.ui.ActionBar.u1, o20 {
    public final /* synthetic */ i a;

    public /* synthetic */ c(i iVar) {
        this.a = iVar;
    }

    @Override // org.telegram.ui.Components.gu0
    public int c() {
        return this.a.n;
    }

    @Override // org.telegram.ui.Components.iu0
    public /* synthetic */ float f(RecyclerView recyclerView) {
        return org.telegram.ui.Cells.f1.c(recyclerView);
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        i iVar = this.a;
        iVar.getClass();
        iVar.presentFragment(new tc1(6, null));
    }

    @Override // org.telegram.ui.Components.iu0
    public RecyclerView j(View view) {
        i iVar = this.a;
        if (iVar.a == 1) {
            return ((h) view).c;
        }
        iVar.K.getClass();
        return ((e8) view).a;
    }

    @Override // org.telegram.messenger.o20
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        i.Z(this.a, (a51) obj);
    }

    @Override // org.telegram.ui.Components.iu0
    public /* synthetic */ void p(RecyclerView recyclerView) {
        org.telegram.ui.Cells.f1.b(recyclerView);
    }

    @Override // fe.e
    public void v(int i10, float f7, float f10, fe.f fVar) {
        this.a.w0();
    }

    @Override // fe.e
    public /* synthetic */ void E(float f7, int i10) {
    }
}
