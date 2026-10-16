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
import org.telegram.ui.b20;
import org.telegram.ui.z10;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class z10 extends org.telegram.ui.Components.lm0 {
    public final Context c;
    public final /* synthetic */ b20 d;

    public z10(b20 b20Var, Context context) {
        this.d = b20Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        return false;
    }

    @Override // s4.g0
    public final int h() {
        b20 b20Var = this.d;
        if (b20Var.f.isEmpty()) {
            return 0;
        }
        return ((int) Math.ceil(r1.size() / b20Var.s)) + (!b20Var.N ? 1 : 0);
    }

    @Override // s4.g0
    public final int j(int i10) {
        b20 b20Var = this.d;
        return i10 < ((int) Math.ceil((double) (((float) b20Var.f.size()) / ((float) b20Var.s)))) ? 0 : 1;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        b20 b20Var = this.d;
        t10 t10Var = b20Var.S;
        ArrayList arrayList = b20Var.f;
        int i11 = b1Var.f;
        View view = b1Var.a;
        if (i11 != 0) {
            if (i11 != 3) {
                if (i11 == 1) {
                    int ceil = (int) Math.ceil(arrayList.size() / b20Var.s);
                    int i12 = b20Var.s;
                    ((org.telegram.ui.Components.f10) view).v = i12 - ((ceil * i12) - arrayList.size());
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) view;
            s2Var.s2 = i10 != h() - 1;
            MessageObject messageObject = (MessageObject) arrayList.get(i10);
            boolean z10 = s2Var.getMessage() != null && s2Var.getMessage().getId() == messageObject.getId();
            s2Var.O = b20Var.p0;
            s2Var.W(messageObject.getDialogId(), messageObject, messageObject.messageOwner.date, false, false);
            if (!b20Var.o0.g()) {
                s2Var.V(false, z10);
                return;
            }
            int id2 = messageObject.getId();
            t10Var.a = messageObject.getDialogId();
            t10Var.b = id2;
            s2Var.V(b20Var.o0.b(t10Var), z10);
            return;
        }
        org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) view;
        u7Var.setItemsCount(b20Var.s);
        u7Var.setIsFirst(i10 == 0);
        int i13 = 0;
        while (true) {
            int i14 = b20Var.s;
            if (i13 >= i14) {
                u7Var.requestLayout();
                return;
            }
            int i15 = (i14 * i10) + i13;
            if (i15 < arrayList.size()) {
                MessageObject messageObject2 = (MessageObject) arrayList.get(i15);
                u7Var.c(i13, arrayList.indexOf(messageObject2), messageObject2);
                if (b20Var.o0.g()) {
                    int id3 = messageObject2.getId();
                    t10Var.a = messageObject2.getDialogId();
                    t10Var.b = id3;
                    u7Var.b(i13, b20Var.o0.b(t10Var));
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
    /* JADX WARN: Type inference failed for: r6v10, types: [org.telegram.ui.Components.f10, org.telegram.ui.p10] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [android.view.View] */
    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        ?? r62;
        Context context = this.c;
        if (i10 == 0) {
            final org.telegram.ui.Cells.u7 u7Var = new org.telegram.ui.Cells.u7(context);
            Paint paint = new Paint();
            u7Var.n = paint;
            u7Var.s = UserConfig.selectedAccount;
            u7Var.r = 1;
            paint.setColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Lh, false));
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
                        b20 b20Var = ((z10) gVar.b).d;
                        if (!b20Var.o0.g()) {
                            b20.a(b20Var, messageObject, u7Var2, intValue);
                            return true;
                        }
                        b20 b20Var2 = ((z10) gVar.b).d;
                        SpannableStringBuilder[] spannableStringBuilderArr = b20.s0;
                        b20Var2.f(i12, u7Var2, messageObject, intValue);
                        return true;
                    }
                });
            }
            u7Var.setDelegate(new g(this, 17));
            frameLayout = u7Var;
        } else {
            if (i10 != 2) {
                r62 = new p10(this, context, 1);
                r62.setIsSingleCell(true);
                r62.setViewType(2);
                return com.google.android.gms.internal.play_billing.k3.l(r62, r62, -1, -2);
            }
            FrameLayout v3Var = new org.telegram.ui.Cells.v3(context, null);
            v3Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.e7, false) & (-218103809));
            frameLayout = v3Var;
        }
        r62 = frameLayout;
        return com.google.android.gms.internal.play_billing.k3.l(r62, r62, -1, -2);
    }
}
