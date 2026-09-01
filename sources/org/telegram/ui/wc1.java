package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class wc1 extends org.telegram.ui.Components.sl0 {
    public final Context c;
    public final ArrayList d;

    public wc1(Context context) {
        this.c = context;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        org.telegram.ui.Cells.m2 m2Var = new org.telegram.ui.Cells.m2();
        m2Var.a = LocaleController.getString(R.string.ThemePreviewDialog1);
        m2Var.b = LocaleController.getString(R.string.ThemePreviewDialogMessage1);
        m2Var.c = 0;
        m2Var.d = 0;
        m2Var.e = true;
        m2Var.f = false;
        m2Var.g = 0;
        m2Var.h = currentTimeMillis;
        m2Var.i = false;
        m2Var.j = false;
        m2Var.k = 2;
        arrayList.add(m2Var);
        org.telegram.ui.Cells.m2 m2Var2 = new org.telegram.ui.Cells.m2();
        m2Var2.a = LocaleController.getString(R.string.ThemePreviewDialog2);
        m2Var2.b = LocaleController.getString(R.string.ThemePreviewDialogMessage2);
        m2Var2.c = 1;
        m2Var2.d = 2;
        m2Var2.e = false;
        m2Var2.f = false;
        m2Var2.g = 0;
        m2Var2.h = currentTimeMillis - 3600;
        m2Var2.i = false;
        m2Var2.j = false;
        m2Var2.k = -1;
        arrayList.add(m2Var2);
        org.telegram.ui.Cells.m2 m2Var3 = new org.telegram.ui.Cells.m2();
        m2Var3.a = LocaleController.getString(R.string.ThemePreviewDialog3);
        m2Var3.b = LocaleController.getString(R.string.ThemePreviewDialogMessage3);
        m2Var3.c = 2;
        m2Var3.d = 3;
        m2Var3.e = false;
        m2Var3.f = true;
        m2Var3.g = 0;
        m2Var3.h = currentTimeMillis - 7200;
        m2Var3.i = false;
        m2Var3.j = true;
        m2Var3.k = -1;
        arrayList.add(m2Var3);
        org.telegram.ui.Cells.m2 m2Var4 = new org.telegram.ui.Cells.m2();
        m2Var4.a = LocaleController.getString(R.string.ThemePreviewDialog4);
        m2Var4.b = LocaleController.getString(R.string.ThemePreviewDialogMessage4);
        m2Var4.c = 3;
        m2Var4.d = 0;
        m2Var4.e = false;
        m2Var4.f = false;
        m2Var4.g = 2;
        m2Var4.h = currentTimeMillis - 10800;
        m2Var4.i = false;
        m2Var4.j = false;
        m2Var4.k = -1;
        arrayList.add(m2Var4);
        org.telegram.ui.Cells.m2 m2Var5 = new org.telegram.ui.Cells.m2();
        m2Var5.a = LocaleController.getString(R.string.ThemePreviewDialog5);
        m2Var5.b = LocaleController.getString(R.string.ThemePreviewDialogMessage5);
        m2Var5.c = 4;
        m2Var5.d = 0;
        m2Var5.e = false;
        m2Var5.f = false;
        m2Var5.g = 1;
        m2Var5.h = currentTimeMillis - 14400;
        m2Var5.i = false;
        m2Var5.j = false;
        m2Var5.k = 2;
        arrayList.add(m2Var5);
        org.telegram.ui.Cells.m2 m2Var6 = new org.telegram.ui.Cells.m2();
        m2Var6.a = LocaleController.getString(R.string.ThemePreviewDialog6);
        m2Var6.b = LocaleController.getString(R.string.ThemePreviewDialogMessage6);
        m2Var6.c = 5;
        m2Var6.d = 0;
        m2Var6.e = false;
        m2Var6.f = false;
        m2Var6.g = 0;
        m2Var6.h = currentTimeMillis - 18000;
        m2Var6.i = false;
        m2Var6.j = false;
        m2Var6.k = -1;
        arrayList.add(m2Var6);
        org.telegram.ui.Cells.m2 m2Var7 = new org.telegram.ui.Cells.m2();
        m2Var7.a = LocaleController.getString(R.string.ThemePreviewDialog7);
        m2Var7.b = LocaleController.getString(R.string.ThemePreviewDialogMessage7);
        m2Var7.c = 6;
        m2Var7.d = 0;
        m2Var7.e = false;
        m2Var7.f = false;
        m2Var7.g = 0;
        m2Var7.h = currentTimeMillis - 21600;
        m2Var7.i = true;
        m2Var7.j = false;
        m2Var7.k = -1;
        arrayList.add(m2Var7);
        org.telegram.ui.Cells.m2 m2Var8 = new org.telegram.ui.Cells.m2();
        m2Var8.a = LocaleController.getString(R.string.ThemePreviewDialog8);
        m2Var8.b = LocaleController.getString(R.string.ThemePreviewDialogMessage8);
        m2Var8.c = 0;
        m2Var8.d = 0;
        m2Var8.e = false;
        m2Var8.f = false;
        m2Var8.g = 0;
        m2Var8.h = currentTimeMillis - 25200;
        m2Var8.i = true;
        m2Var8.j = false;
        m2Var8.k = -1;
        arrayList.add(m2Var8);
    }

    @Override // org.telegram.ui.Components.sl0
    public final boolean D(f2.m1 m1Var) {
        return m1Var.f != 1;
    }

    @Override // f2.p0
    public final int h() {
        return this.d.size();
    }

    @Override // f2.p0
    public final int j(int i10) {
        return i10 == this.d.size() ? 1 : 0;
    }

    @Override // f2.p0
    public final void v(f2.m1 m1Var, int i10) {
        if (m1Var.f == 0) {
            org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) m1Var.a;
            ArrayList arrayList = this.d;
            r2Var.p2 = i10 != arrayList.size() - 1;
            r2Var.setDialog((org.telegram.ui.Cells.m2) arrayList.get(i10));
        }
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        Context context = this.c;
        View r2Var = i10 == 0 ? new org.telegram.ui.Cells.r2(context, false) : new org.telegram.ui.Cells.s4(context);
        r2Var.setLayoutParams(new f2.x0(-1, -2));
        return new org.telegram.ui.Components.fl0(r2Var);
    }
}
