// default package

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class qk3 implements ViewSwitcher.ViewFactory {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qk3(Object obj, byte b) {
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
                yob.X(textView, aob.g9, null);
                textView.setTextSize(1, 14.0f);
                textView.setGravity(17);
                textView.setLineSpacing(hl.L(2.0f), 1.0f);
                return textView;
            case 1:
                TextView textView2 = new TextView((Context) obj);
                textView2.setPadding(hl.L(16.0f), hl.L(12.0f), hl.L(16.0f), hl.L(12.0f));
                textView2.setTextSize(1, 16.0f);
                yob.X(textView2, aob.G6, null);
                yob.D(textView2, aob.H6, null);
                textView2.setMaxLines(1);
                textView2.setSingleLine(true);
                textView2.setEllipsize(TextUtils.TruncateAt.END);
                textView2.setGravity((ob6.a0 ? 5 : 3) | 1);
                return textView2;
            case 2:
                TextView textView3 = new TextView((Context) obj);
                yob.X(textView3, aob.D6, null);
                textView3.setGravity(1);
                textView3.setLineSpacing(hl.L(2.0f), 1.0f);
                textView3.setTextSize(1, 15.0f);
                return textView3;
            default:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.d9;
                return new vc8(photoViewer.F, photoViewer.U1, photoViewer.R, new ga8(photoViewer, (byte) 0), new ih6(photoViewer, b2));
        }
    }
}
