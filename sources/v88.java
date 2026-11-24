// default package

import android.graphics.drawable.Drawable;
import android.text.style.ClickableSpan;
import android.widget.TextView;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class v88 implements jac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ v88(PhotoViewer photoViewer, byte b) {
        this.a = b;
        this.b = photoViewer;
    }

    @Override // jac
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        PhotoViewer photoViewer = this.b;
        switch (b) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.d9;
                photoViewer.b1((ClickableSpan) obj, (TextView) obj2);
                break;
            default:
                Drawable[] drawableArr2 = PhotoViewer.d9;
                photoViewer.w(((Boolean) obj2).booleanValue(), false, (((Float) obj).floatValue() * 2.8f) + 0.2f);
                break;
        }
    }
}
