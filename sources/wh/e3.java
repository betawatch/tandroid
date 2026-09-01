package wh;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class e3 implements t4 {
    public final /* synthetic */ t a;
    public final /* synthetic */ a b;
    public final /* synthetic */ r3 c;

    public e3(a aVar, t tVar, r3 r3Var) {
        this.c = r3Var;
        this.a = tVar;
        this.b = aVar;
    }

    @Override // wh.t4
    public final void a(int i10, int i11) {
        if (i10 > 0 && i11 > 0) {
            t tVar = this.a;
            tVar.j = i10;
            tVar.k = i11;
        }
        View z12 = this.c.z1(this.b);
        if (z12 instanceof o4) {
            z12.requestLayout();
            z12.invalidate();
        }
    }

    @Override // wh.t4
    public final void b(TLRPC.Photo photo) {
        int i10;
        int i11;
        t tVar = this.a;
        tVar.g = photo;
        tVar.a = 2;
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
        if (closestPhotoSizeWithSize != null && (i10 = closestPhotoSizeWithSize.w) > 0 && (i11 = closestPhotoSizeWithSize.h) > 0) {
            tVar.j = i10;
            tVar.k = i11;
        }
        a aVar = this.b;
        TL_iv.PageBlock N3 = r3.N3(aVar, tVar);
        if (N3 instanceof TL_iv.pageBlockPhoto) {
            ((TL_iv.pageBlockPhoto) N3).photo_id = photo.id;
        }
        r3 r3Var = this.c;
        r3Var.W3.remove(tVar);
        r3Var.n4(aVar);
        r3Var.e3.onContentChanged();
    }

    @Override // wh.t4
    public final void c(TLRPC.Document document) {
        t tVar = this.a;
        tVar.h = document;
        tVar.a = 2;
        a aVar = this.b;
        TL_iv.PageBlock N3 = r3.N3(aVar, tVar);
        if (N3 instanceof TL_iv.pageBlockVideo) {
            ((TL_iv.pageBlockVideo) N3).video_id = document.id;
        }
        r3 r3Var = this.c;
        r3Var.W3.remove(tVar);
        r3Var.n4(aVar);
        r3Var.e3.onContentChanged();
    }

    @Override // wh.t4
    public final void f(float f10) {
        this.a.f = f10;
        a aVar = this.b;
        r3 r3Var = this.c;
        View z12 = r3Var.z1(aVar);
        if (z12 instanceof o4) {
            z12.requestLayout();
            z12.invalidate();
        }
        r3Var.e3.onContentChanged();
    }

    @Override // wh.t4
    public final void onError() {
        t tVar = this.a;
        tVar.a = 3;
        r3 r3Var = this.c;
        r3Var.W3.remove(tVar);
        r3Var.q4(this.b, tVar);
        r3Var.e3.onContentChanged();
    }

    @Override // wh.t4
    public final /* synthetic */ void d(TLRPC.Document document) {
    }

    @Override // wh.t4
    public final /* synthetic */ void e(TLRPC.Document document) {
    }
}
