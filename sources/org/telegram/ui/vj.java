package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class vj extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ cn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vj(cn cnVar, Context context, int i7) {
        super(context);
        this.a = i7;
        this.b = cnVar;
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(View view, int i7, int i10, int i11, int i12) {
        switch (this.a) {
            case 1:
                cn cnVar = this.b;
                if (view == cnVar.i3) {
                    ImageView imageView = cnVar.g3;
                    int i13 = (imageView == null || imageView.getVisibility() == 8) ? 18 : 66;
                    ImageView imageView2 = cnVar.h3;
                    if (imageView2 != null && imageView2.getVisibility() != 8) {
                        i13 += 48;
                    }
                    ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(i13);
                }
                super.measureChildWithMargins(view, i7, i10, i11, i12);
                break;
            default:
                super.measureChildWithMargins(view, i7, i10, i11, i12);
                break;
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        switch (this.a) {
            case 2:
                super.setTranslationY(f10);
                this.b.l1.invalidate();
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        switch (this.a) {
            case 0:
                super.setVisibility(i7);
                this.b.hd.h(2, i7 == 0, getMeasuredWidth() > 0);
                break;
            default:
                super.setVisibility(i7);
                break;
        }
    }
}
