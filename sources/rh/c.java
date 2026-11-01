package rh;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;
import org.telegram.messenger.p20;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.hu0;
import org.telegram.ui.Components.ju0;
import org.telegram.ui.rc1;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements fe.e, hu0, ju0, org.telegram.ui.ActionBar.u1, p20 {
    public final /* synthetic */ i a;

    public /* synthetic */ c(i iVar) {
        this.a = iVar;
    }

    @Override // org.telegram.ui.Components.hu0
    public int c() {
        return this.a.n;
    }

    @Override // org.telegram.ui.Components.ju0
    public /* synthetic */ float f(RecyclerView recyclerView) {
        return org.telegram.ui.Cells.f1.c(recyclerView);
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        i iVar = this.a;
        iVar.getClass();
        iVar.presentFragment(new rc1(6, null));
    }

    @Override // org.telegram.ui.Components.ju0
    public RecyclerView j(View view) {
        i iVar = this.a;
        if (iVar.a == 1) {
            return ((h) view).c;
        }
        iVar.K.getClass();
        return ((e8) view).a;
    }

    @Override // org.telegram.messenger.p20
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        i.a0(this.a, (b51) obj);
    }

    @Override // org.telegram.ui.Components.ju0
    public /* synthetic */ void q(RecyclerView recyclerView) {
        org.telegram.ui.Cells.f1.b(recyclerView);
    }

    @Override // fe.e
    public void v(int i10, float f7, float f10, fe.f fVar) {
        this.a.x0();
    }

    @Override // fe.e
    public /* synthetic */ void E(float f7, int i10) {
    }
}
