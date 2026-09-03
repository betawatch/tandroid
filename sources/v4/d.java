package v4;

import com.google.android.gms.common.api.internal.v;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
                b();
                arrayDeque.addFirst(this);
                break;
            default:
                ((e) this.n).j(this);
                break;
        }
    }
}
