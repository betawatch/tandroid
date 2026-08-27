package rh;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class a3 implements r4 {
    public final /* synthetic */ s a;
    public final /* synthetic */ a b;
    public final /* synthetic */ p3 c;

    public a3(a aVar, s sVar, p3 p3Var) {
        this.c = p3Var;
        this.a = sVar;
        this.b = aVar;
    }

    @Override // rh.r4
    public final void e(TLRPC.Document document) {
        s sVar = this.a;
        sVar.h = document;
        sVar.i = document;
        sVar.a = 2;
        TL_iv.PageBlock pageBlock = this.b.b;
        if (pageBlock instanceof TL_iv.pageBlockAudio) {
            ((TL_iv.pageBlockAudio) pageBlock).audio_id = document.id;
        }
        p3 p3Var = this.c;
        p3Var.V3.remove(sVar);
        p3Var.U2.N(false);
        p3Var.d3.onContentChanged();
    }

    @Override // rh.r4
    public final void f(float f10) {
        this.a.f = f10;
        a aVar = this.b;
        p3 p3Var = this.c;
        View z12 = p3Var.z1(aVar);
        if (z12 instanceof x) {
            ((x) z12).m(false);
            z12.invalidate();
        }
        p3Var.d3.onContentChanged();
    }

    @Override // rh.r4
    public final void onError() {
        s sVar = this.a;
        sVar.a = 3;
        p3 p3Var = this.c;
        p3Var.V3.remove(sVar);
        int indexOf = p3Var.h3.indexOf(this.b);
        if (indexOf >= 0) {
            p3Var.h3.remove(indexOf);
            p3Var.U2.N(true);
        }
        p3Var.d3.onContentChanged();
    }

    @Override // rh.r4
    public final /* synthetic */ void b(TLRPC.Photo photo) {
    }

    @Override // rh.r4
    public final /* synthetic */ void c(TLRPC.Document document) {
    }

    @Override // rh.r4
    public final /* synthetic */ void d(TLRPC.Document document) {
    }

    @Override // rh.r4
    public final /* synthetic */ void a(int i10, int i11) {
    }
}
