package v4;

import com.google.android.gms.common.api.internal.v;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class d extends k {
    public final /* synthetic */ int h;
    public final /* synthetic */ g n;

    public /* synthetic */ d(g gVar, int i10) {
        this.h = i10;
        this.n = gVar;
    }

    @Override // n3.j
    public final void j() {
        switch (this.h) {
            case 0:
                ArrayDeque arrayDeque = (ArrayDeque) ((v) this.n).d;
                h5.a.i(arrayDeque.size() < 2);
                h5.a.f(!arrayDeque.contains(this));
                c();
                arrayDeque.addFirst(this);
                break;
            default:
                ((e) this.n).j(this);
                break;
        }
    }
}
