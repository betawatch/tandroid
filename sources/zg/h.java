package zg;

import android.graphics.RenderNode;
import g.z;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class h {
    public final RenderNode a;
    public final g b;
    public final z c = new z();
    public long d = 0;
    public int e;
    public int f;

    public h(RenderNode renderNode, g gVar) {
        this.a = renderNode;
        this.b = gVar;
    }

    public final void a() {
        int width = this.a.getWidth();
        int height = this.a.getHeight();
        z zVar = this.c;
        zVar.a = 0L;
        zVar.b = false;
        g gVar = this.b;
        gVar.u(zVar);
        long j3 = zVar.b ? -1L : zVar.a;
        boolean z10 = (this.a.hasDisplayList() && width == this.e && height == this.f && j3 == this.d && j3 != -1) ? false : true;
        this.e = width;
        this.f = height;
        this.d = j3;
        if (z10) {
            gVar.d(this.a.beginRecording());
            this.a.endRecording();
        }
    }
}
