package th;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class c3 implements r4 {
    public final /* synthetic */ s a;
    public final /* synthetic */ a b;
    public final /* synthetic */ p3 c;

    public c3(a aVar, s sVar, p3 p3Var) {
        this.c = p3Var;
        this.a = sVar;
        this.b = aVar;
    }

    @Override // th.r4
    public final void a(int i10, int i11) {
        if (i10 > 0 && i11 > 0) {
            s sVar = this.a;
            sVar.j = i10;
            sVar.k = i11;
        }
        View z12 = this.c.z1(this.b);
        if (z12 instanceof m4) {
            z12.requestLayout();
            z12.invalidate();
        }
    }

    @Override // th.r4
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
        TL_iv.PageBlock N3 = p3.N3(aVar, sVar);
        if (N3 instanceof TL_iv.pageBlockPhoto) {
            ((TL_iv.pageBlockPhoto) N3).photo_id = photo.id;
        }
        p3 p3Var = this.c;
        p3Var.V3.remove(sVar);
        p3Var.n4(aVar);
        p3Var.d3.onContentChanged();
    }

    @Override // th.r4
    public final void c(TLRPC.Document document) {
        s sVar = this.a;
        sVar.h = document;
        sVar.a = 2;
        a aVar = this.b;
        TL_iv.PageBlock N3 = p3.N3(aVar, sVar);
        if (N3 instanceof TL_iv.pageBlockVideo) {
            ((TL_iv.pageBlockVideo) N3).video_id = document.id;
        }
        p3 p3Var = this.c;
        p3Var.V3.remove(sVar);
        p3Var.n4(aVar);
        p3Var.d3.onContentChanged();
    }

    @Override // th.r4
    public final void f(float f9) {
        this.a.f = f9;
        a aVar = this.b;
        p3 p3Var = this.c;
        View z12 = p3Var.z1(aVar);
        if (z12 instanceof m4) {
            z12.requestLayout();
            z12.invalidate();
        }
        p3Var.d3.onContentChanged();
    }

    @Override // th.r4
    public final void onError() {
        s sVar = this.a;
        sVar.a = 3;
        p3 p3Var = this.c;
        p3Var.V3.remove(sVar);
        p3Var.q4(this.b, sVar);
        p3Var.d3.onContentChanged();
    }

    @Override // th.r4
    public final /* synthetic */ void d(TLRPC.Document document) {
    }

    @Override // th.r4
    public final /* synthetic */ void e(TLRPC.Document document) {
    }
}
