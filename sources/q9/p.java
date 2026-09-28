package q9;

import org.telegram.ui.ds0;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes.dex */
public final class p implements pa.b {
    public static final org.webrtc.audio.b c = new org.webrtc.audio.b(11);
    public static final f d = new f(1);
    public pa.a a;
    public volatile pa.b b;

    public p(org.webrtc.audio.b bVar, pa.b bVar2) {
        this.a = bVar;
        this.b = bVar2;
    }

    public final void a(pa.a aVar) {
        pa.b bVar;
        pa.b bVar2;
        pa.b bVar3 = this.b;
        f fVar = d;
        if (bVar3 != fVar) {
            aVar.g(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.b;
            if (bVar != fVar) {
                bVar2 = bVar;
            } else {
                this.a = new ds0(25, this.a, aVar);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.g(bVar);
        }
    }

    @Override // pa.b
    public final Object get() {
        return this.b.get();
    }
}
