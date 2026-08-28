package qh;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class b3 implements q4 {
    public final /* synthetic */ s a;
    public final /* synthetic */ a b;
    public final /* synthetic */ o3 c;

    public b3(a aVar, s sVar, o3 o3Var) {
        this.c = o3Var;
        this.a = sVar;
        this.b = aVar;
    }

    @Override // qh.q4
    public final void a(int i9, int i10) {
        if (i9 > 0 && i10 > 0) {
            s sVar = this.a;
            sVar.j = i9;
            sVar.k = i10;
        }
        View z12 = this.c.z1(this.b);
        if (z12 instanceof l4) {
            z12.requestLayout();
            z12.invalidate();
        }
    }

    @Override // qh.q4
    public final void b(TLRPC.Photo photo) {
        int i9;
        int i10;
        s sVar = this.a;
        sVar.g = photo;
        sVar.a = 2;
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
        if (closestPhotoSizeWithSize != null && (i9 = closestPhotoSizeWithSize.w) > 0 && (i10 = closestPhotoSizeWithSize.h) > 0) {
            sVar.j = i9;
            sVar.k = i10;
        }
        a aVar = this.b;
        TL_iv.PageBlock N3 = o3.N3(aVar, sVar);
        if (N3 instanceof TL_iv.pageBlockPhoto) {
            ((TL_iv.pageBlockPhoto) N3).photo_id = photo.id;
        }
        o3 o3Var = this.c;
        o3Var.V3.remove(sVar);
        o3Var.n4(aVar);
        o3Var.d3.onContentChanged();
    }

    @Override // qh.q4
    public final void c(TLRPC.Document document) {
        s sVar = this.a;
        sVar.h = document;
        sVar.a = 2;
        a aVar = this.b;
        TL_iv.PageBlock N3 = o3.N3(aVar, sVar);
        if (N3 instanceof TL_iv.pageBlockVideo) {
            ((TL_iv.pageBlockVideo) N3).video_id = document.id;
        }
        o3 o3Var = this.c;
        o3Var.V3.remove(sVar);
        o3Var.n4(aVar);
        o3Var.d3.onContentChanged();
    }

    @Override // qh.q4
    public final void f(float f10) {
        this.a.f = f10;
        a aVar = this.b;
        o3 o3Var = this.c;
        View z12 = o3Var.z1(aVar);
        if (z12 instanceof l4) {
            z12.requestLayout();
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
        o3Var.q4(this.b, sVar);
        o3Var.d3.onContentChanged();
    }

    @Override // qh.q4
    public final /* synthetic */ void d(TLRPC.Document document) {
    }

    @Override // qh.q4
    public final /* synthetic */ void e(TLRPC.Document document) {
    }
}
