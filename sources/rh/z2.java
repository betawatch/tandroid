package rh;

import android.view.View;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class z2 implements r4 {
    public final /* synthetic */ s a;
    public final /* synthetic */ a b;
    public final /* synthetic */ String c;
    public final /* synthetic */ p3 d;

    public z2(p3 p3Var, s sVar, a aVar, String str) {
        this.d = p3Var;
        this.a = sVar;
        this.b = aVar;
        this.c = str;
    }

    @Override // rh.r4
    public final void d(TLRPC.Document document) {
        String str = this.c;
        document.localPath = str;
        p3 p3Var = this.d;
        FileLoader.getInstance(p3Var.b3).setLocalPathTo(document, str);
        s sVar = this.a;
        sVar.h = document;
        sVar.a = 2;
        TL_iv.PageBlock pageBlock = this.b.b;
        if (pageBlock instanceof TL_iv.pageBlockDocument) {
            ((TL_iv.pageBlockDocument) pageBlock).document_id = document.id;
        }
        p3Var.V3.remove(sVar);
        p3Var.U2.N(false);
        p3Var.d3.onContentChanged();
    }

    @Override // rh.r4
    public final void f(float f10) {
        this.a.f = f10;
        a aVar = this.b;
        p3 p3Var = this.d;
        View z12 = p3Var.z1(aVar);
        if (z12 instanceof w0) {
            w0 w0Var = (w0) z12;
            w0Var.h(w0Var.i());
            w0Var.k();
            w0Var.l(false);
            w0Var.requestLayout();
            w0Var.invalidate();
        }
        p3Var.d3.onContentChanged();
    }

    @Override // rh.r4
    public final void onError() {
        s sVar = this.a;
        sVar.a = 3;
        p3 p3Var = this.d;
        p3Var.V3.remove(sVar);
        p3Var.h3.remove(this.b);
        p3Var.U2.N(true);
        p3Var.d3.onContentChanged();
    }

    @Override // rh.r4
    public final /* synthetic */ void b(TLRPC.Photo photo) {
    }

    @Override // rh.r4
    public final /* synthetic */ void c(TLRPC.Document document) {
    }

    @Override // rh.r4
    public final /* synthetic */ void e(TLRPC.Document document) {
    }

    @Override // rh.r4
    public final /* synthetic */ void a(int i10, int i11) {
    }
}
