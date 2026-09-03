package wh;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class c3 implements t4 {
    public final /* synthetic */ t a;
    public final /* synthetic */ a b;
    public final /* synthetic */ r3 c;

    public c3(a aVar, t tVar, r3 r3Var) {
        this.c = r3Var;
        this.a = tVar;
        this.b = aVar;
    }

    @Override // wh.t4
    public final void e(TLRPC.Document document) {
        t tVar = this.a;
        tVar.h = document;
        tVar.i = document;
        tVar.a = 2;
        TL_iv.PageBlock pageBlock = this.b.b;
        if (pageBlock instanceof TL_iv.pageBlockAudio) {
            ((TL_iv.pageBlockAudio) pageBlock).audio_id = document.id;
        }
        r3 r3Var = this.c;
        r3Var.W3.remove(tVar);
        r3Var.V2.N(false);
        r3Var.e3.onContentChanged();
    }

    @Override // wh.t4
    public final void f(float f10) {
        this.a.f = f10;
        a aVar = this.b;
        r3 r3Var = this.c;
        View y12 = r3Var.y1(aVar);
        if (y12 instanceof y) {
            ((y) y12).m(false);
            y12.invalidate();
        }
        r3Var.e3.onContentChanged();
    }

    @Override // wh.t4
    public final void onError() {
        t tVar = this.a;
        tVar.a = 3;
        r3 r3Var = this.c;
        r3Var.W3.remove(tVar);
        int indexOf = r3Var.i3.indexOf(this.b);
        if (indexOf >= 0) {
            r3Var.i3.remove(indexOf);
            r3Var.V2.N(true);
        }
        r3Var.e3.onContentChanged();
    }

    @Override // wh.t4
    public final /* synthetic */ void b(TLRPC.Photo photo) {
    }

    @Override // wh.t4
    public final /* synthetic */ void c(TLRPC.Document document) {
    }

    @Override // wh.t4
    public final /* synthetic */ void d(TLRPC.Document document) {
    }

    @Override // wh.t4
    public final /* synthetic */ void a(int i10, int i11) {
    }
}
