package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.zi;
import org.telegram.ui.uz;
import org.telegram.ui.wz;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class uz extends org.telegram.ui.Components.sj0 {
    public final Context c;
    public final /* synthetic */ wz d;

    public uz(wz wzVar, Context context) {
        this.d = wzVar;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        return false;
    }

    @Override // u4.h0
    public final int b() {
        wz wzVar = this.d;
        if (wzVar.f.isEmpty()) {
            return 0;
        }
        return ((int) Math.ceil(r1.size() / wzVar.s)) + (!wzVar.O ? 1 : 0);
    }

    @Override // u4.h0
    public final int d(int i3) {
        wz wzVar = this.d;
        return i3 < ((int) Math.ceil((double) (((float) wzVar.f.size()) / ((float) wzVar.s)))) ? 0 : 1;
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        wz wzVar = this.d;
        pz pzVar = wzVar.T;
        ArrayList arrayList = wzVar.f;
        int i10 = d1Var.f;
        View view = d1Var.a;
        if (i10 != 0) {
            if (i10 != 3) {
                if (i10 == 1) {
                    int ceil = (int) Math.ceil(arrayList.size() / wzVar.s);
                    int i11 = wzVar.s;
                    ((org.telegram.ui.Components.iz) view).w = i11 - ((ceil * i11) - arrayList.size());
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) view;
            t2Var.t2 = i3 != b() - 1;
            org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) arrayList.get(i3);
            boolean z10 = t2Var.getMessage() != null && t2Var.getMessage().f1() == ziVar.f1();
            t2Var.P = wzVar.q0;
            t2Var.d0(org.telegram.messenger.zi.B0(ziVar.k), ziVar, ziVar.k.date, false, false);
            if (!wzVar.p0.I()) {
                t2Var.c0(false, z10);
                return;
            }
            int f12 = ziVar.f1();
            pzVar.a = org.telegram.messenger.zi.B0(ziVar.k);
            pzVar.b = f12;
            t2Var.c0(wzVar.p0.n(pzVar), z10);
            return;
        }
        org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
        o7Var.setItemsCount(wzVar.s);
        o7Var.setIsFirst(i3 == 0);
        int i12 = 0;
        while (true) {
            int i13 = wzVar.s;
            if (i12 >= i13) {
                o7Var.requestLayout();
                return;
            }
            int i14 = (i13 * i3) + i12;
            if (i14 < arrayList.size()) {
                org.telegram.messenger.zi ziVar2 = (org.telegram.messenger.zi) arrayList.get(i14);
                o7Var.c(i12, arrayList.indexOf(ziVar2), ziVar2);
                if (wzVar.p0.I()) {
                    int f13 = ziVar2.f1();
                    pzVar.a = org.telegram.messenger.zi.B0(ziVar2.k);
                    pzVar.b = f13;
                    o7Var.b(i12, wzVar.p0.n(pzVar), true);
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
    /* JADX WARN: Type inference failed for: r6v10, types: [org.telegram.ui.Components.iz, org.telegram.ui.kz] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [android.view.View] */
    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        FrameLayout frameLayout;
        ?? r62;
        Context context = this.c;
        if (i3 == 0) {
            final org.telegram.ui.Cells.o7 o7Var = new org.telegram.ui.Cells.o7(context);
            Paint paint = new Paint();
            o7Var.n = paint;
            o7Var.s = org.telegram.messenger.h10.t0;
            o7Var.r = 1;
            paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.zi, false));
            o7Var.b = new org.telegram.messenger.zi[6];
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
                        zi ziVar = o7Var2.b[intValue];
                        org.telegram.ui.f fVar = (org.telegram.ui.f) m7Var;
                        wz wzVar = ((uz) fVar.b).d;
                        if (!wzVar.p0.I()) {
                            wz.a(wzVar, ziVar, o7Var2, intValue);
                            return true;
                        }
                        wz wzVar2 = ((uz) fVar.b).d;
                        SpannableStringBuilder[] spannableStringBuilderArr = wz.t0;
                        wzVar2.f(i11, o7Var2, ziVar, intValue);
                        return true;
                    }
                });
            }
            o7Var.setDelegate(new f(this, 16));
            frameLayout = o7Var;
        } else {
            if (i3 != 2) {
                r62 = new kz(1, context, this);
                r62.setIsSingleCell(true);
                r62.setViewType(2);
                return k2.p1.p(r62, r62, -1, -2);
            }
            FrameLayout x3Var = new org.telegram.ui.Cells.x3(context, null);
            x3Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.e7, false) & (-218103809));
            frameLayout = x3Var;
        }
        r62 = frameLayout;
        return k2.p1.p(r62, r62, -1, -2);
    }
}
