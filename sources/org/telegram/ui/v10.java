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
import org.telegram.ui.v10;
import org.telegram.ui.x10;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class v10 extends org.telegram.ui.Components.kl0 {
    public final Context c;
    public final /* synthetic */ x10 d;

    public v10(x10 x10Var, Context context) {
        this.d = x10Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.kl0
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override // s4.h0
    public final int h() {
        x10 x10Var = this.d;
        if (x10Var.f.isEmpty()) {
            return 0;
        }
        return ((int) Math.ceil(r1.size() / x10Var.s)) + (!x10Var.N ? 1 : 0);
    }

    @Override // s4.h0
    public final int j(int i10) {
        x10 x10Var = this.d;
        return i10 < ((int) Math.ceil((double) (((float) x10Var.f.size()) / ((float) x10Var.s)))) ? 0 : 1;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        x10 x10Var = this.d;
        p10 p10Var = x10Var.S;
        ArrayList arrayList = x10Var.f;
        int i11 = c1Var.f;
        View view = c1Var.a;
        if (i11 != 0) {
            if (i11 != 3) {
                if (i11 == 1) {
                    int ceil = (int) Math.ceil(arrayList.size() / x10Var.s);
                    int i12 = x10Var.s;
                    ((org.telegram.ui.Components.t00) view).v = i12 - ((ceil * i12) - arrayList.size());
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view;
            r2Var.s2 = i10 != h() - 1;
            MessageObject messageObject = (MessageObject) arrayList.get(i10);
            boolean z10 = r2Var.getMessage() != null && r2Var.getMessage().getId() == messageObject.getId();
            r2Var.O = x10Var.p0;
            r2Var.W(messageObject.getDialogId(), messageObject, messageObject.messageOwner.date, false, false);
            if (!x10Var.o0.g()) {
                r2Var.V(false, z10);
                return;
            }
            int id2 = messageObject.getId();
            p10Var.a = messageObject.getDialogId();
            p10Var.b = id2;
            r2Var.V(x10Var.o0.b(p10Var), z10);
            return;
        }
        org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) view;
        u7Var.setItemsCount(x10Var.s);
        u7Var.setIsFirst(i10 == 0);
        int i13 = 0;
        while (true) {
            int i14 = x10Var.s;
            if (i13 >= i14) {
                u7Var.requestLayout();
                return;
            }
            int i15 = (i14 * i10) + i13;
            if (i15 < arrayList.size()) {
                MessageObject messageObject2 = (MessageObject) arrayList.get(i15);
                u7Var.c(i13, arrayList.indexOf(messageObject2), messageObject2);
                if (x10Var.o0.g()) {
                    int id3 = messageObject2.getId();
                    p10Var.a = messageObject2.getDialogId();
                    p10Var.b = id3;
                    u7Var.b(i13, x10Var.o0.b(p10Var));
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
    /* JADX WARN: Type inference failed for: r6v10, types: [org.telegram.ui.Components.t00, org.telegram.ui.l10] */
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
            paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Lh, false));
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
                        x10 x10Var = ((v10) gVar.b).d;
                        if (!x10Var.o0.g()) {
                            x10.a(x10Var, messageObject, u7Var2, intValue);
                            return true;
                        }
                        x10 x10Var2 = ((v10) gVar.b).d;
                        SpannableStringBuilder[] spannableStringBuilderArr = x10.s0;
                        x10Var2.f(i12, u7Var2, messageObject, intValue);
                        return true;
                    }
                });
            }
            u7Var.setDelegate(new g(this, 17));
            frameLayout = u7Var;
        } else {
            if (i10 != 2) {
                r62 = new l10(this, context, 1);
                r62.setIsSingleCell(true);
                r62.setViewType(2);
                return com.google.android.gms.internal.vision.e2.l(r62, r62, -1, -2);
            }
            FrameLayout u3Var = new org.telegram.ui.Cells.u3(context, null);
            u3Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.e7, false) & (-218103809));
            frameLayout = u3Var;
        }
        r62 = frameLayout;
        return com.google.android.gms.internal.vision.e2.l(r62, r62, -1, -2);
    }
}
