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
import org.telegram.ui.x10;
import org.telegram.ui.z10;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class x10 extends org.telegram.ui.Components.ul0 {
    public final Context c;
    public final /* synthetic */ z10 d;

    public x10(z10 z10Var, Context context) {
        this.d = z10Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.ul0
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override // s4.h0
    public final int h() {
        z10 z10Var = this.d;
        if (z10Var.f.isEmpty()) {
            return 0;
        }
        return ((int) Math.ceil(r1.size() / z10Var.s)) + (!z10Var.N ? 1 : 0);
    }

    @Override // s4.h0
    public final int j(int i10) {
        z10 z10Var = this.d;
        return i10 < ((int) Math.ceil((double) (((float) z10Var.f.size()) / ((float) z10Var.s)))) ? 0 : 1;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        z10 z10Var = this.d;
        r10 r10Var = z10Var.S;
        ArrayList arrayList = z10Var.f;
        int i11 = c1Var.f;
        View view = c1Var.a;
        if (i11 != 0) {
            if (i11 != 3) {
                if (i11 == 1) {
                    int ceil = (int) Math.ceil(arrayList.size() / z10Var.s);
                    int i12 = z10Var.s;
                    ((org.telegram.ui.Components.a10) view).v = i12 - ((ceil * i12) - arrayList.size());
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view;
            r2Var.s2 = i10 != h() - 1;
            MessageObject messageObject = (MessageObject) arrayList.get(i10);
            boolean z10 = r2Var.getMessage() != null && r2Var.getMessage().getId() == messageObject.getId();
            r2Var.O = z10Var.p0;
            r2Var.W(messageObject.getDialogId(), messageObject, messageObject.messageOwner.date, false, false);
            if (!z10Var.o0.f()) {
                r2Var.V(false, z10);
                return;
            }
            int id2 = messageObject.getId();
            r10Var.a = messageObject.getDialogId();
            r10Var.b = id2;
            r2Var.V(z10Var.o0.b(r10Var), z10);
            return;
        }
        org.telegram.ui.Cells.v7 v7Var = (org.telegram.ui.Cells.v7) view;
        v7Var.setItemsCount(z10Var.s);
        v7Var.setIsFirst(i10 == 0);
        int i13 = 0;
        while (true) {
            int i14 = z10Var.s;
            if (i13 >= i14) {
                v7Var.requestLayout();
                return;
            }
            int i15 = (i14 * i10) + i13;
            if (i15 < arrayList.size()) {
                MessageObject messageObject2 = (MessageObject) arrayList.get(i15);
                v7Var.c(i13, arrayList.indexOf(messageObject2), messageObject2);
                if (z10Var.o0.f()) {
                    int id3 = messageObject2.getId();
                    r10Var.a = messageObject2.getDialogId();
                    r10Var.b = id3;
                    v7Var.b(i13, z10Var.o0.b(r10Var));
                } else {
                    v7Var.b(i13, false);
                }
            } else {
                v7Var.c(i13, i15, null);
            }
            i13++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [org.telegram.ui.Components.a10, org.telegram.ui.n10] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [android.view.View] */
    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        ?? r62;
        Context context = this.c;
        if (i10 == 0) {
            final org.telegram.ui.Cells.v7 v7Var = new org.telegram.ui.Cells.v7(context);
            Paint paint = new Paint();
            v7Var.n = paint;
            v7Var.s = UserConfig.selectedAccount;
            v7Var.r = 1;
            paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Lh, false));
            v7Var.b = new MessageObject[6];
            v7Var.a = new org.telegram.ui.Cells.r7[6];
            v7Var.c = new int[6];
            for (int i11 = 0; i11 < 6; i11++) {
                v7Var.a[i11] = new org.telegram.ui.Cells.r7(v7Var, context);
                v7Var.addView(v7Var.a[i11]);
                v7Var.a[i11].setVisibility(4);
                v7Var.a[i11].setTag(Integer.valueOf(i11));
                v7Var.a[i11].setOnClickListener(new org.telegram.ui.Cells.a(v7Var, 10));
                v7Var.a[i11].setOnLongClickListener(new View.OnLongClickListener() { // from class: org.telegram.ui.Cells.q7
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        v7 v7Var2 = v7.this;
                        if (v7Var2.d == null) {
                            return false;
                        }
                        int intValue = ((Integer) view.getTag()).intValue();
                        s7 s7Var = v7Var2.d;
                        int i12 = v7Var2.c[intValue];
                        MessageObject messageObject = v7Var2.b[intValue];
                        org.telegram.ui.g gVar = (org.telegram.ui.g) s7Var;
                        z10 z10Var = ((x10) gVar.b).d;
                        if (!z10Var.o0.f()) {
                            z10.a(z10Var, messageObject, v7Var2, intValue);
                            return true;
                        }
                        z10 z10Var2 = ((x10) gVar.b).d;
                        SpannableStringBuilder[] spannableStringBuilderArr = z10.s0;
                        z10Var2.f(i12, v7Var2, messageObject, intValue);
                        return true;
                    }
                });
            }
            v7Var.setDelegate(new g(this, 17));
            frameLayout = v7Var;
        } else {
            if (i10 != 2) {
                r62 = new n10(this, context, 1);
                r62.setIsSingleCell(true);
                r62.setViewType(2);
                return com.google.android.gms.internal.vision.e2.j(r62, r62, -1, -2);
            }
            FrameLayout u3Var = new org.telegram.ui.Cells.u3(context, null);
            u3Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.e7, false) & (-218103809));
            frameLayout = u3Var;
        }
        r62 = frameLayout;
        return com.google.android.gms.internal.vision.e2.j(r62, r62, -1, -2);
    }
}
