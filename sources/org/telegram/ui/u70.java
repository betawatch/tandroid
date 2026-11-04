package org.telegram.ui;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u70 implements org.telegram.messenger.e9, org.telegram.messenger.xa, org.telegram.ui.ActionBar.p1, org.telegram.ui.Components.ya0, org.telegram.messenger.o10, org.telegram.ui.Components.tt0, org.telegram.ui.ActionBar.o6, org.telegram.ui.ActionBar.p6 {
    public final /* synthetic */ int a;

    public /* synthetic */ u70(int i3) {
        this.a = i3;
    }

    @Override // org.telegram.messenger.o10
    public Object d(Number number, Object obj) {
        return ((Integer) number).intValue() == 0 ? ci.wb.a1(false, org.telegram.messenger.bd.H(',', "Stars", ((Integer) obj).intValue()), 0.66f, null) : org.telegram.messenger.bd.E(r4.intValue(), ',');
    }

    @Override // org.telegram.ui.Components.ya0
    public String e(int i3) {
        return i3 == 0 ? org.telegram.messenger.bd.M0(2131753799, null) : i3 == 1 ? org.telegram.messenger.bd.a0("AutoLockInTime", null, 2131753798, org.telegram.messenger.bd.G(1, "Minutes", new Object[0])) : i3 == 2 ? org.telegram.messenger.bd.a0("AutoLockInTime", null, 2131753798, org.telegram.messenger.bd.G(5, "Minutes", new Object[0])) : i3 == 3 ? org.telegram.messenger.bd.a0("AutoLockInTime", null, 2131753798, org.telegram.messenger.bd.G(1, "Hours", new Object[0])) : i3 == 4 ? org.telegram.messenger.bd.a0("AutoLockInTime", null, 2131753798, org.telegram.messenger.bd.G(5, "Hours", new Object[0])) : "";
    }

    @Override // org.telegram.ui.ActionBar.p6
    public void f(int i3, View view) {
        org.telegram.ui.Wallet.u3 u3Var = (org.telegram.ui.Wallet.u3) view;
        ShapeDrawable shapeDrawable = u3Var.f0;
        if (shapeDrawable != null) {
            shapeDrawable.getPaint().setColor(i3);
            u3Var.f0.invalidateSelf();
        }
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.a) {
            case 2:
                s1Var.dismiss();
                break;
            case 4:
                Drawable[] drawableArr = PhotoViewer.V8;
                break;
            case 5:
                s1Var.dismiss();
                break;
            case 6:
                s1Var.dismiss();
                break;
            case 8:
                RectF rectF = ProfileActivity.T6;
                s1Var.dismiss();
                break;
            case 9:
                s1Var.dismiss();
                break;
            case 15:
                s1Var.dismiss();
                break;
            case 19:
                s1Var.dismiss();
                break;
            case 20:
                s1Var.dismiss();
                break;
            case 21:
                s1Var.dismiss();
                break;
            default:
                s1Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.o6
    public int h(View view) {
        ShapeDrawable shapeDrawable = ((org.telegram.ui.Wallet.u3) view).f0;
        if (shapeDrawable != null) {
            return shapeDrawable.getPaint().getColor();
        }
        return 0;
    }

    @Override // org.telegram.messenger.e9
    public Object k(Object obj) {
        String str = LaunchActivity.E1;
        return new ee0();
    }

    @Override // org.telegram.ui.Components.tt0
    public void l(int i3) {
        org.telegram.messenger.az.b1 = i3;
        org.telegram.messenger.az.y();
    }

    @Override // org.telegram.messenger.xa
    public void onClick() {
    }

    @Override // org.telegram.ui.Components.tt0
    public /* synthetic */ void p() {
    }
}
