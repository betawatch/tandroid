package r4;

import com.google.android.gms.common.api.internal.v;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class d extends k {
    public final /* synthetic */ int c;
    public final /* synthetic */ g d;

    public /* synthetic */ d(g gVar, int i9) {
        this.c = i9;
        this.d = gVar;
    }

    @Override // k3.k
    public final void release() {
        switch (this.c) {
            case 0:
                ArrayDeque arrayDeque = (ArrayDeque) ((v) this.d).d;
                d5.a.i(arrayDeque.size() < 2);
                d5.a.f(!arrayDeque.contains(this));
                clear();
                arrayDeque.addFirst(this);
                break;
            default:
                ((e) this.d).releaseOutputBuffer(this);
                break;
        }
    }
}
