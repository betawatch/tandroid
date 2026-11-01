package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.kj;
import org.telegram.ui.w00;
import org.telegram.ui.y00;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class w00 extends org.telegram.ui.Components.tk0 {
    public final Context c;
    public final /* synthetic */ y00 d;

    public w00(y00 y00Var, Context context) {
        this.d = y00Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.tk0
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override // s4.g0
    public final int b() {
        y00 y00Var = this.d;
        if (y00Var.f.isEmpty()) {
            return 0;
        }
        return ((int) Math.ceil(r1.size() / y00Var.s)) + (!y00Var.N ? 1 : 0);
    }

    @Override // s4.g0
    public final int d(int i10) {
        y00 y00Var = this.d;
        return i10 < ((int) Math.ceil((double) (((float) y00Var.f.size()) / ((float) y00Var.s)))) ? 0 : 1;
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        y00 y00Var = this.d;
        r00 r00Var = y00Var.S;
        ArrayList arrayList = y00Var.f;
        int i11 = c1Var.f;
        View view = c1Var.a;
        if (i11 != 0) {
            if (i11 != 3) {
                if (i11 == 1) {
                    int ceil = (int) Math.ceil(arrayList.size() / y00Var.s);
                    int i12 = y00Var.s;
                    ((org.telegram.ui.Components.zz) view).w = i12 - ((ceil * i12) - arrayList.size());
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.v2 v2Var = (org.telegram.ui.Cells.v2) view;
            v2Var.s2 = i10 != b() - 1;
            org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) arrayList.get(i10);
            boolean z10 = v2Var.getMessage() != null && v2Var.getMessage().f1() == kjVar.f1();
            v2Var.O = y00Var.p0;
            v2Var.d0(org.telegram.messenger.kj.B0(kjVar.k), kjVar, kjVar.k.date, false, false);
            if (!y00Var.o0.f()) {
                v2Var.c0(false, z10);
                return;
            }
            int f12 = kjVar.f1();
            r00Var.a = org.telegram.messenger.kj.B0(kjVar.k);
            r00Var.b = f12;
            v2Var.c0(y00Var.o0.b(r00Var), z10);
            return;
        }
        org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
        t7Var.setItemsCount(y00Var.s);
        t7Var.setIsFirst(i10 == 0);
        int i13 = 0;
        while (true) {
            int i14 = y00Var.s;
            if (i13 >= i14) {
                t7Var.requestLayout();
                return;
            }
            int i15 = (i14 * i10) + i13;
            if (i15 < arrayList.size()) {
                org.telegram.messenger.kj kjVar2 = (org.telegram.messenger.kj) arrayList.get(i15);
                t7Var.c(i13, arrayList.indexOf(kjVar2), kjVar2);
                if (y00Var.o0.f()) {
                    int f13 = kjVar2.f1();
                    r00Var.a = org.telegram.messenger.kj.B0(kjVar2.k);
                    r00Var.b = f13;
                    t7Var.b(i13, y00Var.o0.b(r00Var), true);
                } else {
                    t7Var.b(i13, false, true);
                }
            } else {
                t7Var.c(i13, i15, null);
            }
            i13++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [org.telegram.ui.Components.zz, org.telegram.ui.m00] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [android.view.View] */
    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        ?? r62;
        Context context = this.c;
        if (i10 == 0) {
            final org.telegram.ui.Cells.t7 t7Var = new org.telegram.ui.Cells.t7(context);
            Paint paint = new Paint();
            t7Var.n = paint;
            t7Var.s = org.telegram.messenger.e20.s0;
            t7Var.r = 1;
            paint.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.zi, false));
            t7Var.b = new org.telegram.messenger.kj[6];
            t7Var.a = new org.telegram.ui.Cells.q7[6];
            t7Var.c = new int[6];
            for (int i11 = 0; i11 < 6; i11++) {
                t7Var.a[i11] = new org.telegram.ui.Cells.q7(t7Var, context);
                t7Var.addView(t7Var.a[i11]);
                t7Var.a[i11].setVisibility(4);
                t7Var.a[i11].setTag(Integer.valueOf(i11));
                t7Var.a[i11].setOnClickListener(new org.telegram.ui.Cells.a(t7Var, 10));
                t7Var.a[i11].setOnLongClickListener(new View.OnLongClickListener() { // from class: org.telegram.ui.Cells.p7
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        t7 t7Var2 = t7.this;
                        if (t7Var2.d == null) {
                            return false;
                        }
                        int intValue = ((Integer) view.getTag()).intValue();
                        r7 r7Var = t7Var2.d;
                        int i12 = t7Var2.c[intValue];
                        kj kjVar = t7Var2.b[intValue];
                        org.telegram.ui.e eVar = (org.telegram.ui.e) r7Var;
                        y00 y00Var = ((w00) eVar.b).d;
                        if (!y00Var.o0.f()) {
                            y00.a(y00Var, kjVar, t7Var2, intValue);
                            return true;
                        }
                        y00 y00Var2 = ((w00) eVar.b).d;
                        SpannableStringBuilder[] spannableStringBuilderArr = y00.s0;
                        y00Var2.f(i12, t7Var2, kjVar, intValue);
                        return true;
                    }
                });
            }
            t7Var.setDelegate(new e(this, 16));
            frameLayout = t7Var;
        } else {
            if (i10 != 2) {
                r62 = new m00(this, context, 1);
                r62.setIsSingleCell(true);
                r62.setViewType(2);
                return sc.e.o(r62, r62, -1, -2);
            }
            FrameLayout z3Var = new org.telegram.ui.Cells.z3(context, null);
            z3Var.setBackgroundColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.e7, false) & (-218103809));
            frameLayout = z3Var;
        }
        r62 = frameLayout;
        return sc.e.o(r62, r62, -1, -2);
    }
}
