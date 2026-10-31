package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.text.style.ClickableSpan;
import android.widget.TextView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class xo0 implements org.telegram.messenger.j20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ xo0(PhotoViewer photoViewer, int i10) {
        this.a = i10;
        this.b = photoViewer;
    }

    @Override // org.telegram.messenger.j20
    public final void a(Object obj, Object obj2) {
        int i10 = this.a;
        PhotoViewer photoViewer = this.b;
        switch (i10) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.a2((ClickableSpan) obj, (TextView) obj2);
                break;
            default:
                Drawable[] drawableArr2 = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.E0(((Boolean) obj2).booleanValue(), false, (((Float) obj).floatValue() * 2.8f) + 0.2f);
                break;
        }
    }
}
