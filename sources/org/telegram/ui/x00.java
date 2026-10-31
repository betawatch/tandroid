package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.jj;
import org.telegram.ui.x00;
import org.telegram.ui.z00;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class x00 extends org.telegram.ui.Components.sk0 {
    public final Context c;
    public final /* synthetic */ z00 d;

    public x00(z00 z00Var, Context context) {
        this.d = z00Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override // s4.g0
    public final int b() {
        z00 z00Var = this.d;
        if (z00Var.f.isEmpty()) {
            return 0;
        }
        return ((int) Math.ceil(r1.size() / z00Var.s)) + (!z00Var.N ? 1 : 0);
    }

    @Override // s4.g0
    public final int d(int i10) {
        z00 z00Var = this.d;
        return i10 < ((int) Math.ceil((double) (((float) z00Var.f.size()) / ((float) z00Var.s)))) ? 0 : 1;
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        z00 z00Var = this.d;
        s00 s00Var = z00Var.S;
        ArrayList arrayList = z00Var.f;
        int i11 = c1Var.f;
        View view = c1Var.a;
        if (i11 != 0) {
            if (i11 != 3) {
                if (i11 == 1) {
                    int ceil = (int) Math.ceil(arrayList.size() / z00Var.s);
                    int i12 = z00Var.s;
                    ((org.telegram.ui.Components.zz) view).w = i12 - ((ceil * i12) - arrayList.size());
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.v2 v2Var = (org.telegram.ui.Cells.v2) view;
            v2Var.s2 = i10 != b() - 1;
            org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) arrayList.get(i10);
            boolean z10 = v2Var.getMessage() != null && v2Var.getMessage().f1() == jjVar.f1();
            v2Var.O = z00Var.p0;
            v2Var.d0(org.telegram.messenger.jj.B0(jjVar.k), jjVar, jjVar.k.date, false, false);
            if (!z00Var.o0.f()) {
                v2Var.c0(false, z10);
                return;
            }
            int f12 = jjVar.f1();
            s00Var.a = org.telegram.messenger.jj.B0(jjVar.k);
            s00Var.b = f12;
            v2Var.c0(z00Var.o0.b(s00Var), z10);
            return;
        }
        org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
        t7Var.setItemsCount(z00Var.s);
        t7Var.setIsFirst(i10 == 0);
        int i13 = 0;
        while (true) {
            int i14 = z00Var.s;
            if (i13 >= i14) {
                t7Var.requestLayout();
                return;
            }
            int i15 = (i14 * i10) + i13;
            if (i15 < arrayList.size()) {
                org.telegram.messenger.jj jjVar2 = (org.telegram.messenger.jj) arrayList.get(i15);
                t7Var.c(i13, arrayList.indexOf(jjVar2), jjVar2);
                if (z00Var.o0.f()) {
                    int f13 = jjVar2.f1();
                    s00Var.a = org.telegram.messenger.jj.B0(jjVar2.k);
                    s00Var.b = f13;
                    t7Var.b(i13, z00Var.o0.b(s00Var), true);
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
    /* JADX WARN: Type inference failed for: r6v10, types: [org.telegram.ui.Components.zz, org.telegram.ui.n00] */
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
            t7Var.s = org.telegram.messenger.d20.s0;
            t7Var.r = 1;
            paint.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.zi, false));
            t7Var.b = new org.telegram.messenger.jj[6];
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
                        jj jjVar = t7Var2.b[intValue];
                        org.telegram.ui.e eVar = (org.telegram.ui.e) r7Var;
                        z00 z00Var = ((x00) eVar.b).d;
                        if (!z00Var.o0.f()) {
                            z00.a(z00Var, jjVar, t7Var2, intValue);
                            return true;
                        }
                        z00 z00Var2 = ((x00) eVar.b).d;
                        SpannableStringBuilder[] spannableStringBuilderArr = z00.s0;
                        z00Var2.f(i12, t7Var2, jjVar, intValue);
                        return true;
                    }
                });
            }
            t7Var.setDelegate(new e(this, 16));
            frameLayout = t7Var;
        } else {
            if (i10 != 2) {
                r62 = new n00(this, context, 1);
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
