package qh;

import android.view.View;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class y2 implements q4 {
    public final /* synthetic */ s a;
    public final /* synthetic */ a b;
    public final /* synthetic */ String c;
    public final /* synthetic */ o3 d;

    public y2(o3 o3Var, s sVar, a aVar, String str) {
        this.d = o3Var;
        this.a = sVar;
        this.b = aVar;
        this.c = str;
    }

    @Override // qh.q4
    public final void d(TLRPC.Document document) {
        String str = this.c;
        document.localPath = str;
        o3 o3Var = this.d;
        FileLoader.getInstance(o3Var.b3).setLocalPathTo(document, str);
        s sVar = this.a;
        sVar.h = document;
        sVar.a = 2;
        TL_iv.PageBlock pageBlock = this.b.b;
        if (pageBlock instanceof TL_iv.pageBlockDocument) {
            ((TL_iv.pageBlockDocument) pageBlock).document_id = document.id;
        }
        o3Var.V3.remove(sVar);
        o3Var.U2.N(false);
        o3Var.d3.onContentChanged();
    }

    @Override // qh.q4
    public final void f(float f10) {
        this.a.f = f10;
        a aVar = this.b;
        o3 o3Var = this.d;
        View z12 = o3Var.z1(aVar);
        if (z12 instanceof w0) {
            w0 w0Var = (w0) z12;
            w0Var.h(w0Var.i());
            w0Var.k();
            w0Var.l(false);
            w0Var.requestLayout();
            w0Var.invalidate();
        }
        o3Var.d3.onContentChanged();
    }

    @Override // qh.q4
    public final void onError() {
        s sVar = this.a;
        sVar.a = 3;
        o3 o3Var = this.d;
        o3Var.V3.remove(sVar);
        o3Var.h3.remove(this.b);
        o3Var.U2.N(true);
        o3Var.d3.onContentChanged();
    }

    @Override // qh.q4
    public final /* synthetic */ void b(TLRPC.Photo photo) {
    }

    @Override // qh.q4
    public final /* synthetic */ void c(TLRPC.Document document) {
    }

    @Override // qh.q4
    public final /* synthetic */ void e(TLRPC.Document document) {
    }

    @Override // qh.q4
    public final /* synthetic */ void a(int i9, int i10) {
    }
}
