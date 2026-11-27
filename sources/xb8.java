// default package

import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class xb8 extends wk4 {
    public final /* synthetic */ kj4 e;
    public final /* synthetic */ PhotoViewer f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xb8(PhotoViewer photoViewer, kj4 kj4Var) {
        super(false);
        this.f = photoViewer;
        this.e = kj4Var;
    }

    @Override // sy9
    public final CharSequence d() {
        PhotoViewer photoViewer = this.f;
        int[] iArr = photoViewer.m3;
        String str = ob6.G(iArr[0], "Minutes", new Object[0]) + ' ' + ob6.G(iArr[1], "Seconds", new Object[0]);
        int[] iArr2 = photoViewer.n3;
        return ob6.a0("AccDescrPlayerDuration", null, 2131754801, str, ob6.G(iArr2[0], "Minutes", new Object[0]) + ' ' + ob6.G(iArr2[1], "Seconds", new Object[0]));
    }

    @Override // wk4
    public final float k() {
        return this.f.q3.c();
    }

    @Override // wk4
    public final void l(float f) {
        this.e.g(f);
        PhotoViewer photoViewer = this.f;
        photoViewer.q3.h(false, f);
        photoViewer.r3.invalidate();
    }
}
