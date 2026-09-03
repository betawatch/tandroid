package vh;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class d3 implements u4 {
    public final /* synthetic */ t a;
    public final /* synthetic */ a b;
    public final /* synthetic */ s3 c;

    public d3(a aVar, t tVar, s3 s3Var) {
        this.c = s3Var;
        this.a = tVar;
        this.b = aVar;
    }

    @Override // vh.u4
    public final void e(TLRPC.Document document) {
        t tVar = this.a;
        tVar.h = document;
        tVar.i = document;
        tVar.a = 2;
        TL_iv.PageBlock pageBlock = this.b.b;
        if (pageBlock instanceof TL_iv.pageBlockAudio) {
            ((TL_iv.pageBlockAudio) pageBlock).audio_id = document.id;
        }
        s3 s3Var = this.c;
        s3Var.W3.remove(tVar);
        s3Var.V2.N(false);
        s3Var.e3.onContentChanged();
    }

    @Override // vh.u4
    public final void f(float f10) {
        this.a.f = f10;
        a aVar = this.b;
        s3 s3Var = this.c;
        View y12 = s3Var.y1(aVar);
        if (y12 instanceof y) {
            ((y) y12).m(false);
            y12.invalidate();
        }
        s3Var.e3.onContentChanged();
    }

    @Override // vh.u4
    public final void onError() {
        t tVar = this.a;
        tVar.a = 3;
        s3 s3Var = this.c;
        s3Var.W3.remove(tVar);
        int indexOf = s3Var.i3.indexOf(this.b);
        if (indexOf >= 0) {
            s3Var.i3.remove(indexOf);
            s3Var.V2.N(true);
        }
        s3Var.e3.onContentChanged();
    }

    @Override // vh.u4
    public final /* synthetic */ void b(TLRPC.Photo photo) {
    }

    @Override // vh.u4
    public final /* synthetic */ void c(TLRPC.Document document) {
    }

    @Override // vh.u4
    public final /* synthetic */ void d(TLRPC.Document document) {
    }

    @Override // vh.u4
    public final /* synthetic */ void a(int i10, int i11) {
    }
}
