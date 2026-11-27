// default package

import android.graphics.drawable.Drawable;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class ua8 implements j88 {
    public final /* synthetic */ PhotoViewer a;

    public /* synthetic */ ua8(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    public final void a() {
        r7b r7bVar;
        Drawable[] drawableArr = PhotoViewer.d9;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.o7 == null) {
            return;
        }
        lfc lfcVar = photoViewer.k7;
        boolean z = false;
        boolean z2 = (lfcVar == null || (r7bVar = lfcVar.b) == null || r7bVar.f == null) ? false : true;
        if (z2 && lfcVar.d) {
            z = true;
        }
        photoViewer.p0.Q(jn7.J1, z2);
        photoViewer.p7.a(z, true);
        photoViewer.o7.setSubtext(ob6.M0(z ? 2131743241 : 2131743242, null));
    }

    public final void b(boolean z) {
        boolean z2 = !z;
        Drawable[] drawableArr = PhotoViewer.d9;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.W0.isClickable() != z2) {
            photoViewer.W0.setClickable(z2);
            photoViewer.W0.setVisibility(0);
            photoViewer.W0.clearAnimation();
            photoViewer.W0.animate().alpha(!z ? 1.0f : 0.0f).setInterpolator(k43.f).setDuration(150L).withEndAction(new q38((byte) 1, (Object) photoViewer, z2));
        }
    }

    public final void c() {
        PhotoViewer photoViewer = this.a;
        kfc kfcVar = photoViewer.G2;
        if (kfcVar == null) {
            return;
        }
        kfcVar.o0((long) (kfcVar.U() * photoViewer.B8));
        photoViewer.G2.f0();
        photoViewer.X7.setProgress(photoViewer.B8);
        photoViewer.m();
        x38 x38Var = new x38(this, (byte) 14);
        photoViewer.I2 = x38Var;
        hl.d3(x38Var, 860L);
    }
}
