package t4;

import com.google.android.gms.common.api.internal.v;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class d extends k {
    public final /* synthetic */ int c;
    public final /* synthetic */ g d;

    public /* synthetic */ d(g gVar, int i10) {
        this.c = i10;
        this.d = gVar;
    }

    @Override // m3.k
    public final void release() {
        switch (this.c) {
            case 0:
                ArrayDeque arrayDeque = (ArrayDeque) ((v) this.d).d;
                f5.a.i(arrayDeque.size() < 2);
                f5.a.f(!arrayDeque.contains(this));
                clear();
                arrayDeque.addFirst(this);
                break;
            default:
                ((e) this.d).releaseOutputBuffer(this);
                break;
        }
    }
}
