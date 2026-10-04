package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class sc1 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ Rect b;
    public final /* synthetic */ rd1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sc1(rd1 rd1Var, Context context, int i10, Rect rect) {
        super(context);
        this.c = rd1Var;
        this.a = i10;
        this.b = rect;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10 = this.a;
        Rect rect = this.b;
        rd1 rd1Var = this.c;
        if (i10 == 0) {
            rd1Var.r.setBounds(rd1Var.V.getLeft() - rect.left, 0, rd1Var.V.getRight() + rect.right, getMeasuredHeight());
        } else {
            rd1Var.r.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
        }
        rd1Var.r.draw(canvas);
    }
}
