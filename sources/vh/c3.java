package vh;

import android.view.View;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class c3 implements u4 {
    public final /* synthetic */ t a;
    public final /* synthetic */ a b;
    public final /* synthetic */ String c;
    public final /* synthetic */ s3 d;

    public c3(s3 s3Var, t tVar, a aVar, String str) {
        this.d = s3Var;
        this.a = tVar;
        this.b = aVar;
        this.c = str;
    }

    @Override // vh.u4
    public final void d(TLRPC.Document document) {
        String str = this.c;
        document.localPath = str;
        s3 s3Var = this.d;
        FileLoader.getInstance(s3Var.c3).setLocalPathTo(document, str);
        t tVar = this.a;
        tVar.h = document;
        tVar.a = 2;
        TL_iv.PageBlock pageBlock = this.b.b;
        if (pageBlock instanceof TL_iv.pageBlockDocument) {
            ((TL_iv.pageBlockDocument) pageBlock).document_id = document.id;
        }
        s3Var.W3.remove(tVar);
        s3Var.V2.N(false);
        s3Var.e3.onContentChanged();
    }

    @Override // vh.u4
    public final void f(float f10) {
        this.a.f = f10;
        a aVar = this.b;
        s3 s3Var = this.d;
        View y12 = s3Var.y1(aVar);
        if (y12 instanceof x0) {
            x0 x0Var = (x0) y12;
            x0Var.h(x0Var.i());
            x0Var.k();
            x0Var.l(false);
            x0Var.requestLayout();
            x0Var.invalidate();
        }
        s3Var.e3.onContentChanged();
    }

    @Override // vh.u4
    public final void onError() {
        t tVar = this.a;
        tVar.a = 3;
        s3 s3Var = this.d;
        s3Var.W3.remove(tVar);
        s3Var.i3.remove(this.b);
        s3Var.V2.N(true);
        s3Var.e3.onContentChanged();
    }

    @Override // vh.u4
    public final /* synthetic */ void b(TLRPC.Photo photo) {
    }

    @Override // vh.u4
    public final /* synthetic */ void c(TLRPC.Document document) {
    }

    @Override // vh.u4
    public final /* synthetic */ void e(TLRPC.Document document) {
    }

    @Override // vh.u4
    public final /* synthetic */ void a(int i10, int i11) {
    }
}
