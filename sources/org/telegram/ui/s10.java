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
import org.telegram.ui.s10;
import org.telegram.ui.u10;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class s10 extends org.telegram.ui.Components.ll0 {
    public final Context c;
    public final /* synthetic */ u10 d;

    public s10(u10 u10Var, Context context) {
        this.d = u10Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.ll0
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override // s4.h0
    public final int h() {
        u10 u10Var = this.d;
        if (u10Var.f.isEmpty()) {
            return 0;
        }
        return ((int) Math.ceil(r1.size() / u10Var.s)) + (!u10Var.N ? 1 : 0);
    }

    @Override // s4.h0
    public final int j(int i10) {
        u10 u10Var = this.d;
        return i10 < ((int) Math.ceil((double) (((float) u10Var.f.size()) / ((float) u10Var.s)))) ? 0 : 1;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        u10 u10Var = this.d;
        m10 m10Var = u10Var.S;
        ArrayList arrayList = u10Var.f;
        int i11 = c1Var.f;
        View view = c1Var.a;
        if (i11 != 0) {
            if (i11 != 3) {
                if (i11 == 1) {
                    int ceil = (int) Math.ceil(arrayList.size() / u10Var.s);
                    int i12 = u10Var.s;
                    ((org.telegram.ui.Components.u00) view).v = i12 - ((ceil * i12) - arrayList.size());
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view;
            r2Var.s2 = i10 != h() - 1;
            MessageObject messageObject = (MessageObject) arrayList.get(i10);
            boolean z10 = r2Var.getMessage() != null && r2Var.getMessage().getId() == messageObject.getId();
            r2Var.O = u10Var.p0;
            r2Var.W(messageObject.getDialogId(), messageObject, messageObject.messageOwner.date, false, false);
            if (!u10Var.o0.g()) {
                r2Var.V(false, z10);
                return;
            }
            int id2 = messageObject.getId();
            m10Var.a = messageObject.getDialogId();
            m10Var.b = id2;
            r2Var.V(u10Var.o0.c(m10Var), z10);
            return;
        }
        org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) view;
        u7Var.setItemsCount(u10Var.s);
        u7Var.setIsFirst(i10 == 0);
        int i13 = 0;
        while (true) {
            int i14 = u10Var.s;
            if (i13 >= i14) {
                u7Var.requestLayout();
                return;
            }
            int i15 = (i14 * i10) + i13;
            if (i15 < arrayList.size()) {
                MessageObject messageObject2 = (MessageObject) arrayList.get(i15);
                u7Var.c(i13, arrayList.indexOf(messageObject2), messageObject2);
                if (u10Var.o0.g()) {
                    int id3 = messageObject2.getId();
                    m10Var.a = messageObject2.getDialogId();
                    m10Var.b = id3;
                    u7Var.b(i13, u10Var.o0.c(m10Var));
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
    /* JADX WARN: Type inference failed for: r6v10, types: [org.telegram.ui.Components.u00, org.telegram.ui.i10] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [android.view.View] */
    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        ?? r62;
        Context context = this.c;
        if (i10 == 0) {
            final org.telegram.ui.Cells.u7 u7Var = new org.telegram.ui.Cells.u7(context);
            Paint paint = new Paint();
            u7Var.n = paint;
            u7Var.s = UserConfig.selectedAccount;
            u7Var.r = 1;
            paint.setColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Lh, false));
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
                        u10 u10Var = ((s10) gVar.b).d;
                        if (!u10Var.o0.g()) {
                            u10.a(u10Var, messageObject, u7Var2, intValue);
                            return true;
                        }
                        u10 u10Var2 = ((s10) gVar.b).d;
                        SpannableStringBuilder[] spannableStringBuilderArr = u10.s0;
                        u10Var2.f(i12, u7Var2, messageObject, intValue);
                        return true;
                    }
                });
            }
            u7Var.setDelegate(new g(this, 17));
            frameLayout = u7Var;
        } else {
            if (i10 != 2) {
                r62 = new i10(this, context, 1);
                r62.setIsSingleCell(true);
                r62.setViewType(2);
                return com.google.android.gms.internal.vision.e2.k(r62, r62, -1, -2);
            }
            FrameLayout v3Var = new org.telegram.ui.Cells.v3(context, null);
            v3Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.e7, false) & (-218103809));
            frameLayout = v3Var;
        }
        r62 = frameLayout;
        return com.google.android.gms.internal.vision.e2.k(r62, r62, -1, -2);
    }
}
