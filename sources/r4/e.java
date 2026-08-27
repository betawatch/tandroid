package r4;

import com.google.android.gms.common.api.internal.v;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class e extends l {
    public final /* synthetic */ int c;
    public final /* synthetic */ h d;

    public /* synthetic */ e(h hVar, int i10) {
        this.c = i10;
        this.d = hVar;
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
                ((f) this.d).releaseOutputBuffer(this);
                break;
        }
    }
}
