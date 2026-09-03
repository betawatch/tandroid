package wh;

import android.view.View;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class b3 implements t4 {
    public final /* synthetic */ t a;
    public final /* synthetic */ a b;
    public final /* synthetic */ String c;
    public final /* synthetic */ r3 d;

    public b3(r3 r3Var, t tVar, a aVar, String str) {
        this.d = r3Var;
        this.a = tVar;
        this.b = aVar;
        this.c = str;
    }

    @Override // wh.t4
    public final void d(TLRPC.Document document) {
        String str = this.c;
        document.localPath = str;
        r3 r3Var = this.d;
        FileLoader.getInstance(r3Var.c3).setLocalPathTo(document, str);
        t tVar = this.a;
        tVar.h = document;
        tVar.a = 2;
        TL_iv.PageBlock pageBlock = this.b.b;
        if (pageBlock instanceof TL_iv.pageBlockDocument) {
            ((TL_iv.pageBlockDocument) pageBlock).document_id = document.id;
        }
        r3Var.W3.remove(tVar);
        r3Var.V2.N(false);
        r3Var.e3.onContentChanged();
    }

    @Override // wh.t4
    public final void f(float f10) {
        this.a.f = f10;
        a aVar = this.b;
        r3 r3Var = this.d;
        View y12 = r3Var.y1(aVar);
        if (y12 instanceof x0) {
            x0 x0Var = (x0) y12;
            x0Var.h(x0Var.i());
            x0Var.k();
            x0Var.l(false);
            x0Var.requestLayout();
            x0Var.invalidate();
        }
        r3Var.e3.onContentChanged();
    }

    @Override // wh.t4
    public final void onError() {
        t tVar = this.a;
        tVar.a = 3;
        r3 r3Var = this.d;
        r3Var.W3.remove(tVar);
        r3Var.i3.remove(this.b);
        r3Var.V2.N(true);
        r3Var.e3.onContentChanged();
    }

    @Override // wh.t4
    public final /* synthetic */ void b(TLRPC.Photo photo) {
    }

    @Override // wh.t4
    public final /* synthetic */ void c(TLRPC.Document document) {
    }

    @Override // wh.t4
    public final /* synthetic */ void e(TLRPC.Document document) {
    }

    @Override // wh.t4
    public final /* synthetic */ void a(int i10, int i11) {
    }
}
