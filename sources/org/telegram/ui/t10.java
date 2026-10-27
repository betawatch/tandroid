package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class t10 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public org.telegram.ui.ActionBar.b6 a;
    public ImageView b;
    public org.telegram.ui.Components.ar c;
    public int d;
    public int e;

    @Override // org.telegram.ui.ActionBar.p6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.N6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.k7));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int dp;
        ImageView imageView = this.b;
        int i14 = i12 - i10;
        org.telegram.ui.ActionBar.b6 b6Var = this.a;
        int textHeight = ((i13 - i11) - b6Var.getTextHeight()) / 2;
        if (LocaleController.isRTL) {
            dp = (getMeasuredWidth() - b6Var.getMeasuredWidth()) - AndroidUtilities.dp(imageView.getVisibility() == 0 ? 64.0f : 23.0f);
        } else {
            dp = AndroidUtilities.dp(imageView.getVisibility() == 0 ? 64.0f : 23.0f);
        }
        b6Var.layout(dp, textHeight, b6Var.getMeasuredWidth() + dp, b6Var.getMeasuredHeight() + textHeight);
        int dp2 = !LocaleController.isRTL ? AndroidUtilities.dp(20.0f) : (i14 - imageView.getMeasuredWidth()) - AndroidUtilities.dp(20.0f);
        imageView.layout(dp2, 0, imageView.getMeasuredWidth() + dp2, imageView.getMeasuredHeight());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        AndroidUtilities.dp(48.0f);
        this.a.measure(org.telegram.messenger.wh.x(94.0f, size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_30));
        this.b.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), TLObject.FLAG_30));
        setMeasuredDimension(size, AndroidUtilities.dp(50.0f));
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        ImageView imageView = this.b;
        if (imageView != null) {
            try {
                if (imageView.getDrawable() instanceof org.telegram.ui.Components.ar) {
                    org.telegram.ui.Components.ar arVar = (org.telegram.ui.Components.ar) imageView.getDrawable();
                    int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.N6, false);
                    int x03 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.k7, false);
                    if (arVar == this.c && x02 == this.d && x03 == this.e) {
                        return;
                    }
                    this.c = arVar;
                    this.d = x02;
                    this.e = x03;
                    Drawable drawable = arVar.a;
                    if (drawable != null) {
                        drawable.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY));
                    }
                    Drawable drawable2 = arVar.b;
                    if (drawable2 != null) {
                        drawable2.setColorFilter(new PorterDuffColorFilter(x03, PorterDuff.Mode.MULTIPLY));
                    }
                    imageView.invalidate();
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }
}
