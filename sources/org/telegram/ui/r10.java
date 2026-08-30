package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.r10;
import org.telegram.ui.t10;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class r10 extends org.telegram.ui.Components.rl0 {
    public final Context c;
    public final /* synthetic */ t10 d;

    public r10(t10 t10Var, Context context) {
        this.d = t10Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.l1 l1Var) {
        return false;
    }

    @Override // f2.o0
    public final int h() {
        t10 t10Var = this.d;
        if (t10Var.f.isEmpty()) {
            return 0;
        }
        return ((int) Math.ceil(r1.size() / t10Var.s)) + (!t10Var.K ? 1 : 0);
    }

    @Override // f2.o0
    public final int j(int i10) {
        t10 t10Var = this.d;
        return i10 < ((int) Math.ceil((double) (((float) t10Var.f.size()) / ((float) t10Var.s)))) ? 0 : 1;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        t10 t10Var = this.d;
        l10 l10Var = t10Var.P;
        ArrayList arrayList = t10Var.f;
        int i11 = l1Var.f;
        View view = l1Var.a;
        if (i11 != 0) {
            if (i11 != 3) {
                if (i11 == 1) {
                    int ceil = (int) Math.ceil(arrayList.size() / t10Var.s);
                    int i12 = t10Var.s;
                    ((org.telegram.ui.Components.t00) view).v = i12 - ((ceil * i12) - arrayList.size());
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view;
            r2Var.p2 = i10 != h() - 1;
            MessageObject messageObject = (MessageObject) arrayList.get(i10);
            boolean z4 = r2Var.getMessage() != null && r2Var.getMessage().getId() == messageObject.getId();
            r2Var.L = t10Var.m0;
            r2Var.W(messageObject.getDialogId(), messageObject, messageObject.messageOwner.date, false, false);
            if (!t10Var.l0.f()) {
                r2Var.V(false, z4);
                return;
            }
            int id2 = messageObject.getId();
            l10Var.a = messageObject.getDialogId();
            l10Var.b = id2;
            r2Var.V(t10Var.l0.b(l10Var), z4);
            return;
        }
        org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) view;
        s7Var.setItemsCount(t10Var.s);
        s7Var.setIsFirst(i10 == 0);
        int i13 = 0;
        while (true) {
            int i14 = t10Var.s;
            if (i13 >= i14) {
                s7Var.requestLayout();
                return;
            }
            int i15 = (i14 * i10) + i13;
            if (i15 < arrayList.size()) {
                MessageObject messageObject2 = (MessageObject) arrayList.get(i15);
                s7Var.c(i13, arrayList.indexOf(messageObject2), messageObject2);
                if (t10Var.l0.f()) {
                    int id3 = messageObject2.getId();
                    l10Var.a = messageObject2.getDialogId();
                    l10Var.b = id3;
                    s7Var.b(i13, t10Var.l0.b(l10Var));
                } else {
                    s7Var.b(i13, false);
                }
            } else {
                s7Var.c(i13, i15, null);
            }
            i13++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [org.telegram.ui.Components.t00, org.telegram.ui.h10] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [android.view.View] */
    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        ?? r62;
        Context context = this.c;
        if (i10 == 0) {
            final org.telegram.ui.Cells.s7 s7Var = new org.telegram.ui.Cells.s7(context);
            Paint paint = new Paint();
            s7Var.n = paint;
            s7Var.s = UserConfig.selectedAccount;
            s7Var.r = 1;
            paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Lh, false));
            s7Var.b = new MessageObject[6];
            s7Var.a = new org.telegram.ui.Cells.o7[6];
            s7Var.c = new int[6];
            for (int i11 = 0; i11 < 6; i11++) {
                s7Var.a[i11] = new org.telegram.ui.Cells.o7(s7Var, context);
                s7Var.addView(s7Var.a[i11]);
                s7Var.a[i11].setVisibility(4);
                s7Var.a[i11].setTag(Integer.valueOf(i11));
                s7Var.a[i11].setOnClickListener(new org.telegram.ui.Cells.a(s7Var, 10));
                s7Var.a[i11].setOnLongClickListener(new View.OnLongClickListener() { // from class: org.telegram.ui.Cells.n7
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        s7 s7Var2 = s7.this;
                        if (s7Var2.d == null) {
                            return false;
                        }
                        int intValue = ((Integer) view.getTag()).intValue();
                        p7 p7Var = s7Var2.d;
                        int i12 = s7Var2.c[intValue];
                        MessageObject messageObject = s7Var2.b[intValue];
                        org.telegram.ui.h hVar = (org.telegram.ui.h) p7Var;
                        t10 t10Var = ((r10) hVar.b).d;
                        if (!t10Var.l0.f()) {
                            t10.a(t10Var, messageObject, s7Var2, intValue);
                            return true;
                        }
                        t10 t10Var2 = ((r10) hVar.b).d;
                        SpannableStringBuilder[] spannableStringBuilderArr = t10.p0;
                        t10Var2.f(i12, s7Var2, messageObject, intValue);
                        return true;
                    }
                });
            }
            s7Var.setDelegate(new h(this, 17));
            frameLayout = s7Var;
        } else {
            if (i10 != 2) {
                r62 = new h10(this, context, 1);
                r62.setIsSingleCell(true);
                r62.setViewType(2);
                return yh.o(r62, r62, -1, -2);
            }
            FrameLayout u3Var = new org.telegram.ui.Cells.u3(context, null);
            u3Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.e7, false) & (-218103809));
            frameLayout = u3Var;
        }
        r62 = frameLayout;
        return yh.o(r62, r62, -1, -2);
    }
}
