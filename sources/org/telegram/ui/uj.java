package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class uj extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ bn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uj(bn bnVar, Context context, int i7) {
        super(context);
        this.a = i7;
        this.b = bnVar;
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(View view, int i7, int i10, int i11, int i12) {
        switch (this.a) {
            case 1:
                bn bnVar = this.b;
                if (view == bnVar.j3) {
                    ImageView imageView = bnVar.h3;
                    int i13 = (imageView == null || imageView.getVisibility() == 8) ? 18 : 66;
                    ImageView imageView2 = bnVar.i3;
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
                this.b.m1.invalidate();
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
                this.b.jd.h(2, i7 == 0, getMeasuredWidth() > 0);
                break;
            default:
                super.setVisibility(i7);
                break;
        }
    }
}
