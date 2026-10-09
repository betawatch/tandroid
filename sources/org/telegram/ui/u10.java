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
import org.telegram.ui.u10;
import org.telegram.ui.w10;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class u10 extends org.telegram.ui.Components.pm0 {
    public final Context c;
    public final /* synthetic */ w10 d;

    public u10(w10 w10Var, Context context) {
        this.d = w10Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.pm0
    public final boolean D(s4.d1 d1Var) {
        return false;
    }

    @Override // s4.i0
    public final int h() {
        w10 w10Var = this.d;
        if (w10Var.f.isEmpty()) {
            return 0;
        }
        return ((int) Math.ceil(r1.size() / w10Var.s)) + (!w10Var.N ? 1 : 0);
    }

    @Override // s4.i0
    public final int j(int i10) {
        w10 w10Var = this.d;
        return i10 < ((int) Math.ceil((double) (((float) w10Var.f.size()) / ((float) w10Var.s)))) ? 0 : 1;
    }

    @Override // s4.i0
    public final void v(s4.d1 d1Var, int i10) {
        w10 w10Var = this.d;
        o10 o10Var = w10Var.S;
        ArrayList arrayList = w10Var.f;
        int i11 = d1Var.f;
        View view = d1Var.a;
        if (i11 != 0) {
            if (i11 != 3) {
                if (i11 == 1) {
                    int ceil = (int) Math.ceil(arrayList.size() / w10Var.s);
                    int i12 = w10Var.s;
                    ((org.telegram.ui.Components.j10) view).v = i12 - ((ceil * i12) - arrayList.size());
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) view;
            s2Var.s2 = i10 != h() - 1;
            MessageObject messageObject = (MessageObject) arrayList.get(i10);
            boolean z10 = s2Var.getMessage() != null && s2Var.getMessage().getId() == messageObject.getId();
            s2Var.O = w10Var.p0;
            s2Var.W(messageObject.getDialogId(), messageObject, messageObject.messageOwner.date, false, false);
            if (!w10Var.o0.g()) {
                s2Var.V(false, z10);
                return;
            }
            int id2 = messageObject.getId();
            o10Var.a = messageObject.getDialogId();
            o10Var.b = id2;
            s2Var.V(w10Var.o0.c(o10Var), z10);
            return;
        }
        org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) view;
        u7Var.setItemsCount(w10Var.s);
        u7Var.setIsFirst(i10 == 0);
        int i13 = 0;
        while (true) {
            int i14 = w10Var.s;
            if (i13 >= i14) {
                u7Var.requestLayout();
                return;
            }
            int i15 = (i14 * i10) + i13;
            if (i15 < arrayList.size()) {
                MessageObject messageObject2 = (MessageObject) arrayList.get(i15);
                u7Var.c(i13, arrayList.indexOf(messageObject2), messageObject2);
                if (w10Var.o0.g()) {
                    int id3 = messageObject2.getId();
                    o10Var.a = messageObject2.getDialogId();
                    o10Var.b = id3;
                    u7Var.b(i13, w10Var.o0.c(o10Var));
                } else {
                    u7Var.b(i13, false);
                }
            } else {
                u7Var.c(i13, i15, null);
            }
            i13++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [org.telegram.ui.Components.j10, org.telegram.ui.k10] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [android.view.View] */
    @Override // s4.i0
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        ?? r62;
        Context context = this.c;
        if (i10 == 0) {
            final org.telegram.ui.Cells.u7 u7Var = new org.telegram.ui.Cells.u7(context);
            Paint paint = new Paint();
            u7Var.n = paint;
            u7Var.s = UserConfig.selectedAccount;
            u7Var.r = 1;
            paint.setColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Lh, false));
            u7Var.b = new MessageObject[6];
            u7Var.a = new org.telegram.ui.Cells.q7[6];
            u7Var.c = new int[6];
            for (int i11 = 0; i11 < 6; i11++) {
                u7Var.a[i11] = new org.telegram.ui.Cells.q7(u7Var, context);
                u7Var.addView(u7Var.a[i11]);
                u7Var.a[i11].setVisibility(4);
                u7Var.a[i11].setTag(Integer.valueOf(i11));
                u7Var.a[i11].setOnClickListener(new org.telegram.ui.Cells.a(u7Var, 10));
                u7Var.a[i11].setOnLongClickListener(new View.OnLongClickListener() { // from class: org.telegram.ui.Cells.p7
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        u7 u7Var2 = u7.this;
                        if (u7Var2.d == null) {
                            return false;
                        }
                        int intValue = ((Integer) view.getTag()).intValue();
                        r7 r7Var = u7Var2.d;
                        int i12 = u7Var2.c[intValue];
                        MessageObject messageObject = u7Var2.b[intValue];
                        org.telegram.ui.g gVar = (org.telegram.ui.g) r7Var;
                        w10 w10Var = ((u10) gVar.b).d;
                        if (!w10Var.o0.g()) {
                            w10.a(w10Var, messageObject, u7Var2, intValue);
                            return true;
                        }
                        w10 w10Var2 = ((u10) gVar.b).d;
                        SpannableStringBuilder[] spannableStringBuilderArr = w10.s0;
                        w10Var2.f(i12, u7Var2, messageObject, intValue);
                        return true;
                    }
                });
            }
            u7Var.setDelegate(new g(this, 17));
            frameLayout = u7Var;
        } else {
            if (i10 != 2) {
                r62 = new k10(this, context, 1);
                r62.setIsSingleCell(true);
                r62.setViewType(2);
                return com.google.android.gms.internal.vision.e2.k(r62, r62, -1, -2);
            }
            FrameLayout v3Var = new org.telegram.ui.Cells.v3(context, null);
            v3Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.e7, false) & (-218103809));
            frameLayout = v3Var;
        }
        r62 = frameLayout;
        return com.google.android.gms.internal.vision.e2.k(r62, r62, -1, -2);
    }
}
