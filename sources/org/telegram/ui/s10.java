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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class s10 extends org.telegram.ui.Components.ql0 {
    public final Context c;
    public final /* synthetic */ u10 d;

    public s10(u10 u10Var, Context context) {
        this.d = u10Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.ql0
    public final boolean D(f2.l1 l1Var) {
        return false;
    }

    @Override // f2.o0
    public final int h() {
        u10 u10Var = this.d;
        if (u10Var.f.isEmpty()) {
            return 0;
        }
        return ((int) Math.ceil(r1.size() / u10Var.s)) + (!u10Var.K ? 1 : 0);
    }

    @Override // f2.o0
    public final int j(int i10) {
        u10 u10Var = this.d;
        return i10 < ((int) Math.ceil((double) (((float) u10Var.f.size()) / ((float) u10Var.s)))) ? 0 : 1;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        u10 u10Var = this.d;
        m10 m10Var = u10Var.P;
        ArrayList arrayList = u10Var.f;
        int i11 = l1Var.f;
        View view = l1Var.a;
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
            org.telegram.ui.Cells.q2 q2Var = (org.telegram.ui.Cells.q2) view;
            q2Var.p2 = i10 != h() - 1;
            MessageObject messageObject = (MessageObject) arrayList.get(i10);
            boolean z4 = q2Var.getMessage() != null && q2Var.getMessage().getId() == messageObject.getId();
            q2Var.L = u10Var.m0;
            q2Var.W(messageObject.getDialogId(), messageObject, messageObject.messageOwner.date, false, false);
            if (!u10Var.l0.f()) {
                q2Var.V(false, z4);
                return;
            }
            int id2 = messageObject.getId();
            m10Var.a = messageObject.getDialogId();
            m10Var.b = id2;
            q2Var.V(u10Var.l0.b(m10Var), z4);
            return;
        }
        org.telegram.ui.Cells.r7 r7Var = (org.telegram.ui.Cells.r7) view;
        r7Var.setItemsCount(u10Var.s);
        r7Var.setIsFirst(i10 == 0);
        int i13 = 0;
        while (true) {
            int i14 = u10Var.s;
            if (i13 >= i14) {
                r7Var.requestLayout();
                return;
            }
            int i15 = (i14 * i10) + i13;
            if (i15 < arrayList.size()) {
                MessageObject messageObject2 = (MessageObject) arrayList.get(i15);
                r7Var.c(i13, arrayList.indexOf(messageObject2), messageObject2);
                if (u10Var.l0.f()) {
                    int id3 = messageObject2.getId();
                    m10Var.a = messageObject2.getDialogId();
                    m10Var.b = id3;
                    r7Var.b(i13, u10Var.l0.b(m10Var));
                } else {
                    r7Var.b(i13, false);
                }
            } else {
                r7Var.c(i13, i15, null);
            }
            i13++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [org.telegram.ui.Components.u00, org.telegram.ui.i10] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [android.view.View] */
    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        ?? r62;
        Context context = this.c;
        if (i10 == 0) {
            final org.telegram.ui.Cells.r7 r7Var = new org.telegram.ui.Cells.r7(context);
            Paint paint = new Paint();
            r7Var.n = paint;
            r7Var.s = UserConfig.selectedAccount;
            r7Var.r = 1;
            paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Lh, false));
            r7Var.b = new MessageObject[6];
            r7Var.a = new org.telegram.ui.Cells.n7[6];
            r7Var.c = new int[6];
            for (int i11 = 0; i11 < 6; i11++) {
                r7Var.a[i11] = new org.telegram.ui.Cells.n7(r7Var, context);
                r7Var.addView(r7Var.a[i11]);
                r7Var.a[i11].setVisibility(4);
                r7Var.a[i11].setTag(Integer.valueOf(i11));
                r7Var.a[i11].setOnClickListener(new org.telegram.ui.Cells.a(r7Var, 10));
                r7Var.a[i11].setOnLongClickListener(new View.OnLongClickListener() { // from class: org.telegram.ui.Cells.m7
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        r7 r7Var2 = r7.this;
                        if (r7Var2.d == null) {
                            return false;
                        }
                        int intValue = ((Integer) view.getTag()).intValue();
                        o7 o7Var = r7Var2.d;
                        int i12 = r7Var2.c[intValue];
                        MessageObject messageObject = r7Var2.b[intValue];
                        org.telegram.ui.h hVar = (org.telegram.ui.h) o7Var;
                        u10 u10Var = ((s10) hVar.b).d;
                        if (!u10Var.l0.f()) {
                            u10.a(u10Var, messageObject, r7Var2, intValue);
                            return true;
                        }
                        u10 u10Var2 = ((s10) hVar.b).d;
                        SpannableStringBuilder[] spannableStringBuilderArr = u10.p0;
                        u10Var2.f(i12, r7Var2, messageObject, intValue);
                        return true;
                    }
                });
            }
            r7Var.setDelegate(new h(this, 17));
            frameLayout = r7Var;
        } else {
            if (i10 != 2) {
                r62 = new i10(this, context, 1);
                r62.setIsSingleCell(true);
                r62.setViewType(2);
                return ai.n(r62, r62, -1, -2);
            }
            FrameLayout t3Var = new org.telegram.ui.Cells.t3(context, null);
            t3Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.e7, false) & (-218103809));
            frameLayout = t3Var;
        }
        r62 = frameLayout;
        return ai.n(r62, r62, -1, -2);
    }
}
