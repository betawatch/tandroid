package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.fj;
import org.telegram.ui.b00;
import org.telegram.ui.zz;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class zz extends org.telegram.ui.Components.dk0 {
    public final Context c;
    public final /* synthetic */ b00 d;

    public zz(b00 b00Var, Context context) {
        this.d = b00Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        return false;
    }

    @Override // v4.i0
    public final int b() {
        b00 b00Var = this.d;
        if (b00Var.f.isEmpty()) {
            return 0;
        }
        return ((int) Math.ceil(r1.size() / b00Var.s)) + (!b00Var.O ? 1 : 0);
    }

    @Override // v4.i0
    public final int d(int i7) {
        b00 b00Var = this.d;
        return i7 < ((int) Math.ceil((double) (((float) b00Var.f.size()) / ((float) b00Var.s)))) ? 0 : 1;
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        b00 b00Var = this.d;
        uz uzVar = b00Var.T;
        ArrayList arrayList = b00Var.f;
        int i10 = f1Var.f;
        View view = f1Var.a;
        if (i10 != 0) {
            if (i10 != 3) {
                if (i10 == 1) {
                    int ceil = (int) Math.ceil(arrayList.size() / b00Var.s);
                    int i11 = b00Var.s;
                    ((org.telegram.ui.Components.vz) view).w = i11 - ((ceil * i11) - arrayList.size());
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.u2 u2Var = (org.telegram.ui.Cells.u2) view;
            u2Var.t2 = i7 != b() - 1;
            org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) arrayList.get(i7);
            boolean z10 = u2Var.getMessage() != null && u2Var.getMessage().e1() == fjVar.e1();
            u2Var.P = b00Var.q0;
            u2Var.f0(org.telegram.messenger.fj.B0(fjVar.k), fjVar, fjVar.k.date, false, false);
            if (!b00Var.p0.i0()) {
                u2Var.e0(false, z10);
                return;
            }
            int e12 = fjVar.e1();
            uzVar.a = org.telegram.messenger.fj.B0(fjVar.k);
            uzVar.b = e12;
            u2Var.e0(b00Var.p0.j(uzVar), z10);
            return;
        }
        org.telegram.ui.Cells.p7 p7Var = (org.telegram.ui.Cells.p7) view;
        p7Var.setItemsCount(b00Var.s);
        p7Var.setIsFirst(i7 == 0);
        int i12 = 0;
        while (true) {
            int i13 = b00Var.s;
            if (i12 >= i13) {
                p7Var.requestLayout();
                return;
            }
            int i14 = (i13 * i7) + i12;
            if (i14 < arrayList.size()) {
                org.telegram.messenger.fj fjVar2 = (org.telegram.messenger.fj) arrayList.get(i14);
                p7Var.c(i12, arrayList.indexOf(fjVar2), fjVar2);
                if (b00Var.p0.i0()) {
                    int e13 = fjVar2.e1();
                    uzVar.a = org.telegram.messenger.fj.B0(fjVar2.k);
                    uzVar.b = e13;
                    p7Var.b(i12, b00Var.p0.j(uzVar), true);
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
    /* JADX WARN: Type inference failed for: r6v10, types: [org.telegram.ui.Components.vz, org.telegram.ui.pz] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [android.view.View] */
    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        FrameLayout frameLayout;
        ?? r62;
        Context context = this.c;
        if (i7 == 0) {
            final org.telegram.ui.Cells.p7 p7Var = new org.telegram.ui.Cells.p7(context);
            Paint paint = new Paint();
            p7Var.n = paint;
            p7Var.s = org.telegram.messenger.i10.t0;
            p7Var.r = 1;
            paint.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Ci, false));
            p7Var.b = new org.telegram.messenger.fj[6];
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
                        fj fjVar = p7Var2.b[intValue];
                        org.telegram.ui.f fVar = (org.telegram.ui.f) n7Var;
                        b00 b00Var = ((zz) fVar.b).d;
                        if (!b00Var.p0.i0()) {
                            b00.a(b00Var, fjVar, p7Var2, intValue);
                            return true;
                        }
                        b00 b00Var2 = ((zz) fVar.b).d;
                        SpannableStringBuilder[] spannableStringBuilderArr = b00.t0;
                        b00Var2.f(i11, p7Var2, fjVar, intValue);
                        return true;
                    }
                });
            }
            p7Var.setDelegate(new f(this, 16));
            frameLayout = p7Var;
        } else {
            if (i7 != 2) {
                r62 = new pz(1, context, this);
                r62.setIsSingleCell(true);
                r62.setViewType(2);
                return i5.c.q(r62, r62, -1, -2);
            }
            FrameLayout y3Var = new org.telegram.ui.Cells.y3(context, null);
            y3Var.setBackgroundColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.e7, false) & (-218103809));
            frameLayout = y3Var;
        }
        r62 = frameLayout;
        return i5.c.q(r62, r62, -1, -2);
    }
}
