package v4;

import com.google.android.gms.common.api.internal.v;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class d extends k {
    public final /* synthetic */ int h;
    public final /* synthetic */ g n;

    public /* synthetic */ d(g gVar, int i10) {
        this.h = i10;
        this.n = gVar;
    }

    @Override // n3.j
    public final void i() {
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
