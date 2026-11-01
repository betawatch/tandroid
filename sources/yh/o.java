package yh;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.i0;
import s4.s0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class o extends s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // s4.s0
    public void a(RecyclerView recyclerView, int i10) {
        switch (this.a) {
            case 2:
                x xVar = (x) this.b;
                if (i10 == 0) {
                    xVar.e = !xVar.d.canScrollVertically(-1);
                    xVar.d.canScrollVertically(1);
                    break;
                }
                break;
        }
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12 = this.a;
        Object obj = this.b;
        switch (i12) {
            case 0:
                p pVar = (p) obj;
                pVar.w.b(pVar.d);
                break;
            case 1:
                z zVar = (z) obj;
                if (zVar.x1.I1) {
                    i0.v1(zVar.v1.r);
                    break;
                }
                break;
            case 2:
                z zVar2 = ((x) obj).f;
                int i13 = z.M1;
                zVar2.b.invalidate();
                break;
            default:
                u uVar = (u) obj;
                uVar.n.D1.b(uVar.d);
                break;
        }
    }
}
