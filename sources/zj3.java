// default package

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class zj3 implements ViewSwitcher.ViewFactory {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zj3(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.widget.ViewSwitcher.ViewFactory
    public final View makeView() {
        byte b = this.a;
        byte b2 = 1;
        Object obj = this.b;
        switch (b) {
            case 0:
                TextView textView = new TextView((Context) obj);
                zkb.X(textView, bkb.f9, null);
                textView.setTextSize(1, 14.0f);
                textView.setGravity(17);
                textView.setLineSpacing(gl.L(2.0f), 1.0f);
                return textView;
            case 1:
                TextView textView2 = new TextView((Context) obj);
                textView2.setPadding(gl.L(16.0f), gl.L(12.0f), gl.L(16.0f), gl.L(12.0f));
                textView2.setTextSize(1, 16.0f);
                zkb.X(textView2, bkb.F6, null);
                zkb.D(textView2, bkb.G6, null);
                textView2.setMaxLines(1);
                textView2.setSingleLine(true);
                textView2.setEllipsize(TextUtils.TruncateAt.END);
                textView2.setGravity((k96.a0 ? 5 : 3) | 1);
                return textView2;
            case 2:
                TextView textView3 = new TextView((Context) obj);
                zkb.X(textView3, bkb.C6, null);
                textView3.setGravity(1);
                textView3.setLineSpacing(gl.L(2.0f), 1.0f);
                textView3.setTextSize(1, 15.0f);
                return textView3;
            default:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.d9;
                return new f98(photoViewer.F, photoViewer.U1, photoViewer.R, new t68(photoViewer, (byte) 0), new ef6(photoViewer, b2));
        }
    }
}
