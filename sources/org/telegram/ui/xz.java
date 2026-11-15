package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.gj;
import org.telegram.ui.xz;
import org.telegram.ui.zz;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class xz extends org.telegram.ui.Components.tj0 {
    public final Context c;
    public final /* synthetic */ zz d;

    public xz(zz zzVar, Context context) {
        this.d = zzVar;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        return false;
    }

    @Override // v4.h0
    public final int b() {
        zz zzVar = this.d;
        if (zzVar.f.isEmpty()) {
            return 0;
        }
        return ((int) Math.ceil(r1.size() / zzVar.s)) + (!zzVar.O ? 1 : 0);
    }

    @Override // v4.h0
    public final int d(int i7) {
        zz zzVar = this.d;
        return i7 < ((int) Math.ceil((double) (((float) zzVar.f.size()) / ((float) zzVar.s)))) ? 0 : 1;
    }

    @Override // v4.h0
    public final void t(v4.e1 e1Var, int i7) {
        zz zzVar = this.d;
        sz szVar = zzVar.T;
        ArrayList arrayList = zzVar.f;
        int i10 = e1Var.f;
        View view = e1Var.a;
        if (i10 != 0) {
            if (i10 != 3) {
                if (i10 == 1) {
                    int ceil = (int) Math.ceil(arrayList.size() / zzVar.s);
                    int i11 = zzVar.s;
                    ((org.telegram.ui.Components.pz) view).w = i11 - ((ceil * i11) - arrayList.size());
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) view;
            t2Var.t2 = i7 != b() - 1;
            org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) arrayList.get(i7);
            boolean z10 = t2Var.getMessage() != null && t2Var.getMessage().e1() == gjVar.e1();
            t2Var.P = zzVar.q0;
            t2Var.f0(org.telegram.messenger.gj.B0(gjVar.k), gjVar, gjVar.k.date, false, false);
            if (!zzVar.p0.g0()) {
                t2Var.e0(false, z10);
                return;
            }
            int e12 = gjVar.e1();
            szVar.a = org.telegram.messenger.gj.B0(gjVar.k);
            szVar.b = e12;
            t2Var.e0(zzVar.p0.l(szVar), z10);
            return;
        }
        org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
        o7Var.setItemsCount(zzVar.s);
        o7Var.setIsFirst(i7 == 0);
        int i12 = 0;
        while (true) {
            int i13 = zzVar.s;
            if (i12 >= i13) {
                o7Var.requestLayout();
                return;
            }
            int i14 = (i13 * i7) + i12;
            if (i14 < arrayList.size()) {
                org.telegram.messenger.gj gjVar2 = (org.telegram.messenger.gj) arrayList.get(i14);
                o7Var.c(i12, arrayList.indexOf(gjVar2), gjVar2);
                if (zzVar.p0.g0()) {
                    int e13 = gjVar2.e1();
                    szVar.a = org.telegram.messenger.gj.B0(gjVar2.k);
                    szVar.b = e13;
                    o7Var.b(i12, zzVar.p0.l(szVar), true);
                } else {
                    o7Var.b(i12, false, true);
                }
            } else {
                o7Var.c(i12, i14, null);
            }
            i12++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [org.telegram.ui.Components.pz, org.telegram.ui.nz] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [android.view.View] */
    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        FrameLayout frameLayout;
        ?? r62;
        Context context = this.c;
        if (i7 == 0) {
            final org.telegram.ui.Cells.o7 o7Var = new org.telegram.ui.Cells.o7(context);
            Paint paint = new Paint();
            o7Var.n = paint;
            o7Var.s = org.telegram.messenger.m10.t0;
            o7Var.r = 1;
            paint.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Ci, false));
            o7Var.b = new org.telegram.messenger.gj[6];
            o7Var.a = new org.telegram.ui.Cells.l7[6];
            o7Var.c = new int[6];
            for (int i10 = 0; i10 < 6; i10++) {
                o7Var.a[i10] = new org.telegram.ui.Cells.l7(o7Var, context);
                o7Var.addView(o7Var.a[i10]);
                o7Var.a[i10].setVisibility(4);
                o7Var.a[i10].setTag(Integer.valueOf(i10));
                o7Var.a[i10].setOnClickListener(new org.telegram.ui.Cells.a(o7Var, 10));
                o7Var.a[i10].setOnLongClickListener(new View.OnLongClickListener() { // from class: org.telegram.ui.Cells.k7
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        o7 o7Var2 = o7.this;
                        if (o7Var2.d == null) {
                            return false;
                        }
                        int intValue = ((Integer) view.getTag()).intValue();
                        m7 m7Var = o7Var2.d;
                        int i11 = o7Var2.c[intValue];
                        gj gjVar = o7Var2.b[intValue];
                        org.telegram.ui.f fVar = (org.telegram.ui.f) m7Var;
                        zz zzVar = ((xz) fVar.b).d;
                        if (!zzVar.p0.g0()) {
                            zz.a(zzVar, gjVar, o7Var2, intValue);
                            return true;
                        }
                        zz zzVar2 = ((xz) fVar.b).d;
                        SpannableStringBuilder[] spannableStringBuilderArr = zz.t0;
                        zzVar2.f(i11, o7Var2, gjVar, intValue);
                        return true;
                    }
                });
            }
            o7Var.setDelegate(new f(this, 16));
            frameLayout = o7Var;
        } else {
            if (i7 != 2) {
                r62 = new nz(1, context, this);
                r62.setIsSingleCell(true);
                r62.setViewType(2);
                return i5.c.q(r62, r62, -1, -2);
            }
            FrameLayout x3Var = new org.telegram.ui.Cells.x3(context, null);
            x3Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.e7, false) & (-218103809));
            frameLayout = x3Var;
        }
        r62 = frameLayout;
        return i5.c.q(r62, r62, -1, -2);
    }
}
