package vh;

import android.view.View;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class b3 implements t4 {
    public final /* synthetic */ s a;
    public final /* synthetic */ a b;
    public final /* synthetic */ String c;
    public final /* synthetic */ r3 d;

    public b3(r3 r3Var, s sVar, a aVar, String str) {
        this.d = r3Var;
        this.a = sVar;
        this.b = aVar;
        this.c = str;
    }

    @Override // vh.t4
    public final void d(TLRPC.Document document) {
        String str = this.c;
        document.localPath = str;
        r3 r3Var = this.d;
        FileLoader.getInstance(r3Var.c3).setLocalPathTo(document, str);
        s sVar = this.a;
        sVar.h = document;
        sVar.a = 2;
        TL_iv.PageBlock pageBlock = this.b.b;
        if (pageBlock instanceof TL_iv.pageBlockDocument) {
            ((TL_iv.pageBlockDocument) pageBlock).document_id = document.id;
        }
        r3Var.W3.remove(sVar);
        r3Var.V2.N(false);
        r3Var.e3.onContentChanged();
    }

    @Override // vh.t4
    public final void f(float f10) {
        this.a.f = f10;
        a aVar = this.b;
        r3 r3Var = this.d;
        View z12 = r3Var.z1(aVar);
        if (z12 instanceof w0) {
            w0 w0Var = (w0) z12;
            w0Var.h(w0Var.i());
            w0Var.k();
            w0Var.l(false);
            w0Var.requestLayout();
            w0Var.invalidate();
        }
        r3Var.e3.onContentChanged();
    }

    @Override // vh.t4
    public final void onError() {
        s sVar = this.a;
        sVar.a = 3;
        r3 r3Var = this.d;
        r3Var.W3.remove(sVar);
        r3Var.i3.remove(this.b);
        r3Var.V2.N(true);
        r3Var.e3.onContentChanged();
    }

    @Override // vh.t4
    public final /* synthetic */ void b(TLRPC.Photo photo) {
    }

    @Override // vh.t4
    public final /* synthetic */ void c(TLRPC.Document document) {
    }

    @Override // vh.t4
    public final /* synthetic */ void e(TLRPC.Document document) {
    }

    @Override // vh.t4
    public final /* synthetic */ void a(int i10, int i11) {
    }
}
