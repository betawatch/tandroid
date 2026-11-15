package org.telegram.ui;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class t70 implements org.telegram.messenger.i9, org.telegram.messenger.j9, org.telegram.messenger.db, org.telegram.ui.ActionBar.q1, org.telegram.ui.Components.eb0, org.telegram.messenger.t10, org.telegram.ui.Components.vt0, org.telegram.ui.ActionBar.n6, org.telegram.ui.ActionBar.o6 {
    public final /* synthetic */ int a;

    public /* synthetic */ t70(int i7) {
        this.a = i7;
    }

    @Override // org.telegram.messenger.t10
    public Object d(Number number, Object obj) {
        return ((Integer) number).intValue() == 0 ? di.mb.a1(false, org.telegram.messenger.hd.H(',', "Stars", ((Integer) obj).intValue()), 0.66f, null) : org.telegram.messenger.hd.E(r4.intValue(), ',');
    }

    @Override // org.telegram.ui.Components.eb0
    public String e(int i7) {
        return i7 == 0 ? org.telegram.messenger.hd.M0(2131753799, null) : i7 == 1 ? org.telegram.messenger.hd.a0("AutoLockInTime", null, 2131753798, org.telegram.messenger.hd.G(1, "Minutes", new Object[0])) : i7 == 2 ? org.telegram.messenger.hd.a0("AutoLockInTime", null, 2131753798, org.telegram.messenger.hd.G(5, "Minutes", new Object[0])) : i7 == 3 ? org.telegram.messenger.hd.a0("AutoLockInTime", null, 2131753798, org.telegram.messenger.hd.G(1, "Hours", new Object[0])) : i7 == 4 ? org.telegram.messenger.hd.a0("AutoLockInTime", null, 2131753798, org.telegram.messenger.hd.G(5, "Hours", new Object[0])) : "";
    }

    @Override // org.telegram.ui.ActionBar.o6
    public void f(int i7, View view) {
        org.telegram.ui.Wallet.v3 v3Var = (org.telegram.ui.Wallet.v3) view;
        ShapeDrawable shapeDrawable = v3Var.f0;
        if (shapeDrawable != null) {
            shapeDrawable.getPaint().setColor(i7);
            v3Var.f0.invalidateSelf();
        }
    }

    @Override // org.telegram.ui.ActionBar.n6
    public int g(View view) {
        ShapeDrawable shapeDrawable = ((org.telegram.ui.Wallet.v3) view).f0;
        if (shapeDrawable != null) {
            return shapeDrawable.getPaint().getColor();
        }
        return 0;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 3:
                t1Var.dismiss();
                break;
            case 4:
            case 8:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 17:
            case 18:
            default:
                t1Var.dismiss();
                break;
            case 5:
                Drawable[] drawableArr = PhotoViewer.Z8;
                break;
            case 6:
                t1Var.dismiss();
                break;
            case 7:
                t1Var.dismiss();
                break;
            case 9:
                RectF rectF = ProfileActivity.X6;
                t1Var.dismiss();
                break;
            case 10:
                t1Var.dismiss();
                break;
            case 16:
                t1Var.dismiss();
                break;
            case 19:
                t1Var.dismiss();
                break;
            case 20:
                t1Var.dismiss();
                break;
            case 21:
                t1Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.vt0
    public void l(int i7) {
        org.telegram.messenger.gz.b1 = i7;
        org.telegram.messenger.gz.y();
    }

    @Override // org.telegram.messenger.j9
    public Object o(Object obj) {
        String str = LaunchActivity.C1;
        return new je0();
    }

    @Override // org.telegram.messenger.i9
    public boolean run() {
        String str = LaunchActivity.C1;
        return org.telegram.messenger.gz.s.length() > 0 && !org.telegram.messenger.gz.A;
    }

    @Override // org.telegram.messenger.db
    public void onClick() {
    }

    @Override // org.telegram.ui.Components.vt0
    public /* synthetic */ void p() {
    }
}
