package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import android.widget.ViewSwitcher;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class yd0 implements ViewSwitcher.ViewFactory {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yd0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.widget.ViewSwitcher.ViewFactory
    public final View makeView() {
        int i7 = this.a;
        int i10 = 1;
        Object obj = this.b;
        switch (i7) {
            case 0:
                TextView textView = new TextView((Context) obj);
                textView.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f));
                textView.setTextSize(1, 16.0f);
                org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.G6, null);
                org.telegram.ui.ActionBar.q6.D(textView, org.telegram.ui.ActionBar.j6.H6, null);
                textView.setMaxLines(1);
                textView.setSingleLine(true);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 1);
                return textView;
            case 1:
                TextView textView2 = new TextView((Context) obj);
                org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.D6, null);
                textView2.setGravity(1);
                textView2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                textView2.setTextSize(1, 15.0f);
                return textView2;
            default:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.Z8;
                return new jq0(photoViewer.F, photoViewer.U1, photoViewer.R, new mn0(photoViewer, 0), new td0(photoViewer, i10));
        }
    }
}
