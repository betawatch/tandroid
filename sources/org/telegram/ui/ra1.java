package org.telegram.ui;

import android.graphics.drawable.ShapeDrawable;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ra1 implements org.telegram.ui.ActionBar.u1, org.telegram.ui.ActionBar.x6, org.telegram.ui.ActionBar.y6 {
    public final /* synthetic */ int a;

    public /* synthetic */ ra1(int i10) {
        this.a = i10;
    }

    @Override // org.telegram.ui.ActionBar.y6
    public void d(int i10, View view) {
        org.telegram.ui.Wallet.w3 w3Var = (org.telegram.ui.Wallet.w3) view;
        ShapeDrawable shapeDrawable = w3Var.e0;
        if (shapeDrawable != null) {
            shapeDrawable.getPaint().setColor(i10);
            w3Var.e0.invalidateSelf();
        }
    }

    @Override // org.telegram.ui.ActionBar.x6
    public int f(View view) {
        ShapeDrawable shapeDrawable = ((org.telegram.ui.Wallet.w3) view).e0;
        if (shapeDrawable != null) {
            return shapeDrawable.getPaint().getColor();
        }
        return 0;
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.a) {
            case 0:
                x1Var.dismiss();
                break;
            case 1:
            case 2:
            case 3:
            default:
                x1Var.dismiss();
                break;
            case 4:
                x1Var.dismiss();
                break;
            case 5:
                x1Var.dismiss();
                break;
            case 6:
                x1Var.dismiss();
                break;
        }
    }
}
