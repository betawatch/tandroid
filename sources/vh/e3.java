package vh;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class e3 implements t4 {
    public final /* synthetic */ s a;
    public final /* synthetic */ a b;
    public final /* synthetic */ r3 c;

    public e3(a aVar, s sVar, r3 r3Var) {
        this.c = r3Var;
        this.a = sVar;
        this.b = aVar;
    }

    @Override // vh.t4
    public final void a(int i10, int i11) {
        if (i10 > 0 && i11 > 0) {
            s sVar = this.a;
            sVar.j = i10;
            sVar.k = i11;
        }
        View z12 = this.c.z1(this.b);
        if (z12 instanceof o4) {
            z12.requestLayout();
            z12.invalidate();
        }
    }

    @Override // vh.t4
    public final void b(TLRPC.Photo photo) {
        int i10;
        int i11;
        s sVar = this.a;
        sVar.g = photo;
        sVar.a = 2;
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
        if (closestPhotoSizeWithSize != null && (i10 = closestPhotoSizeWithSize.w) > 0 && (i11 = closestPhotoSizeWithSize.h) > 0) {
            sVar.j = i10;
            sVar.k = i11;
        }
        a aVar = this.b;
        TL_iv.PageBlock N3 = r3.N3(aVar, sVar);
        if (N3 instanceof TL_iv.pageBlockPhoto) {
            ((TL_iv.pageBlockPhoto) N3).photo_id = photo.id;
        }
        r3 r3Var = this.c;
        r3Var.W3.remove(sVar);
        r3Var.n4(aVar);
        r3Var.e3.onContentChanged();
    }

    @Override // vh.t4
    public final void c(TLRPC.Document document) {
        s sVar = this.a;
        sVar.h = document;
        sVar.a = 2;
        a aVar = this.b;
        TL_iv.PageBlock N3 = r3.N3(aVar, sVar);
        if (N3 instanceof TL_iv.pageBlockVideo) {
            ((TL_iv.pageBlockVideo) N3).video_id = document.id;
        }
        r3 r3Var = this.c;
        r3Var.W3.remove(sVar);
        r3Var.n4(aVar);
        r3Var.e3.onContentChanged();
    }

    @Override // vh.t4
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

    @Override // vh.t4
    public final void onError() {
        s sVar = this.a;
        sVar.a = 3;
        r3 r3Var = this.c;
        r3Var.W3.remove(sVar);
        r3Var.q4(this.b, sVar);
        r3Var.e3.onContentChanged();
    }

    @Override // vh.t4
    public final /* synthetic */ void d(TLRPC.Document document) {
    }

    @Override // vh.t4
    public final /* synthetic */ void e(TLRPC.Document document) {
    }
}
