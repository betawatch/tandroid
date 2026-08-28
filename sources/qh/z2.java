package qh;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class z2 implements q4 {
    public final /* synthetic */ s a;
    public final /* synthetic */ a b;
    public final /* synthetic */ o3 c;

    public z2(a aVar, s sVar, o3 o3Var) {
        this.c = o3Var;
        this.a = sVar;
        this.b = aVar;
    }

    @Override // qh.q4
    public final void e(TLRPC.Document document) {
        s sVar = this.a;
        sVar.h = document;
        sVar.i = document;
        sVar.a = 2;
        TL_iv.PageBlock pageBlock = this.b.b;
        if (pageBlock instanceof TL_iv.pageBlockAudio) {
            ((TL_iv.pageBlockAudio) pageBlock).audio_id = document.id;
        }
        o3 o3Var = this.c;
        o3Var.V3.remove(sVar);
        o3Var.U2.N(false);
        o3Var.d3.onContentChanged();
    }

    @Override // qh.q4
    public final void f(float f10) {
        this.a.f = f10;
        a aVar = this.b;
        o3 o3Var = this.c;
        View z12 = o3Var.z1(aVar);
        if (z12 instanceof x) {
            ((x) z12).m(false);
            z12.invalidate();
        }
        o3Var.d3.onContentChanged();
    }

    @Override // qh.q4
    public final void onError() {
        s sVar = this.a;
        sVar.a = 3;
        o3 o3Var = this.c;
        o3Var.V3.remove(sVar);
        int indexOf = o3Var.h3.indexOf(this.b);
        if (indexOf >= 0) {
            o3Var.h3.remove(indexOf);
            o3Var.U2.N(true);
        }
        o3Var.d3.onContentChanged();
    }

    @Override // qh.q4
    public final /* synthetic */ void b(TLRPC.Photo photo) {
    }

    @Override // qh.q4
    public final /* synthetic */ void c(TLRPC.Document document) {
    }

    @Override // qh.q4
    public final /* synthetic */ void d(TLRPC.Document document) {
    }

    @Override // qh.q4
    public final /* synthetic */ void a(int i9, int i10) {
    }
}
