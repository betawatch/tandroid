package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.ij;
import org.telegram.ui.wz;
import org.telegram.ui.yz;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class wz extends org.telegram.ui.Components.oj0 {
    public final Context c;
    public final /* synthetic */ yz d;

    public wz(yz yzVar, Context context) {
        this.d = yzVar;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        return false;
    }

    @Override // v4.g0
    public final int b() {
        yz yzVar = this.d;
        if (yzVar.f.isEmpty()) {
            return 0;
        }
        return ((int) Math.ceil(r1.size() / yzVar.s)) + (!yzVar.N ? 1 : 0);
    }

    @Override // v4.g0
    public final int d(int i7) {
        yz yzVar = this.d;
        return i7 < ((int) Math.ceil((double) (((float) yzVar.f.size()) / ((float) yzVar.s)))) ? 0 : 1;
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        yz yzVar = this.d;
        rz rzVar = yzVar.S;
        ArrayList arrayList = yzVar.f;
        int i10 = d1Var.f;
        View view = d1Var.a;
        if (i10 != 0) {
            if (i10 != 3) {
                if (i10 == 1) {
                    int ceil = (int) Math.ceil(arrayList.size() / yzVar.s);
                    int i11 = yzVar.s;
                    ((org.telegram.ui.Components.mz) view).w = i11 - ((ceil * i11) - arrayList.size());
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) view;
            t2Var.s2 = i7 != b() - 1;
            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList.get(i7);
            boolean z9 = t2Var.getMessage() != null && t2Var.getMessage().f1() == ijVar.f1();
            t2Var.O = yzVar.p0;
            t2Var.d0(org.telegram.messenger.ij.B0(ijVar.k), ijVar, ijVar.k.date, false, false);
            if (!yzVar.o0.i()) {
                t2Var.c0(false, z9);
                return;
            }
            int f12 = ijVar.f1();
            rzVar.a = org.telegram.messenger.ij.B0(ijVar.k);
            rzVar.b = f12;
            t2Var.c0(yzVar.o0.f(rzVar), z9);
            return;
        }
        org.telegram.ui.Cells.p7 p7Var = (org.telegram.ui.Cells.p7) view;
        p7Var.setItemsCount(yzVar.s);
        p7Var.setIsFirst(i7 == 0);
        int i12 = 0;
        while (true) {
            int i13 = yzVar.s;
            if (i12 >= i13) {
                p7Var.requestLayout();
                return;
            }
            int i14 = (i13 * i7) + i12;
            if (i14 < arrayList.size()) {
                org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) arrayList.get(i14);
                p7Var.c(i12, arrayList.indexOf(ijVar2), ijVar2);
                if (yzVar.o0.i()) {
                    int f13 = ijVar2.f1();
                    rzVar.a = org.telegram.messenger.ij.B0(ijVar2.k);
                    rzVar.b = f13;
                    p7Var.b(i12, yzVar.o0.f(rzVar), true);
                } else {
                    p7Var.b(i12, false, true);
                }
            } else {
                p7Var.c(i12, i14, null);
            }
            i12++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [org.telegram.ui.Components.mz, org.telegram.ui.mz] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [android.view.View] */
    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        FrameLayout frameLayout;
        ?? r62;
        Context context = this.c;
        if (i7 == 0) {
            final org.telegram.ui.Cells.p7 p7Var = new org.telegram.ui.Cells.p7(context);
            Paint paint = new Paint();
            p7Var.n = paint;
            p7Var.s = org.telegram.messenger.p10.s0;
            p7Var.r = 1;
            paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.zi, false));
            p7Var.b = new org.telegram.messenger.ij[6];
            p7Var.a = new org.telegram.ui.Cells.m7[6];
            p7Var.c = new int[6];
            for (int i10 = 0; i10 < 6; i10++) {
                p7Var.a[i10] = new org.telegram.ui.Cells.m7(p7Var, context);
                p7Var.addView(p7Var.a[i10]);
                p7Var.a[i10].setVisibility(4);
                p7Var.a[i10].setTag(Integer.valueOf(i10));
                p7Var.a[i10].setOnClickListener(new org.telegram.ui.Cells.a(p7Var, 10));
                p7Var.a[i10].setOnLongClickListener(new View.OnLongClickListener() { // from class: org.telegram.ui.Cells.l7
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        p7 p7Var2 = p7.this;
                        if (p7Var2.d == null) {
                            return false;
                        }
                        int intValue = ((Integer) view.getTag()).intValue();
                        n7 n7Var = p7Var2.d;
                        int i11 = p7Var2.c[intValue];
                        ij ijVar = p7Var2.b[intValue];
                        org.telegram.ui.f fVar = (org.telegram.ui.f) n7Var;
                        yz yzVar = ((wz) fVar.b).d;
                        if (!yzVar.o0.i()) {
                            yz.a(yzVar, ijVar, p7Var2, intValue);
                            return true;
                        }
                        yz yzVar2 = ((wz) fVar.b).d;
                        SpannableStringBuilder[] spannableStringBuilderArr = yz.s0;
                        yzVar2.f(i11, p7Var2, ijVar, intValue);
                        return true;
                    }
                });
            }
            p7Var.setDelegate(new f(this, 16));
            frameLayout = p7Var;
        } else {
            if (i7 != 2) {
                r62 = new mz(1, context, this);
                r62.setIsSingleCell(true);
                r62.setViewType(2);
                return jg.g.r(r62, r62, -1, -2);
            }
            FrameLayout x3Var = new org.telegram.ui.Cells.x3(context, null);
            x3Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.e7, false) & (-218103809));
            frameLayout = x3Var;
        }
        r62 = frameLayout;
        return jg.g.r(r62, r62, -1, -2);
    }
}
