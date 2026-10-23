package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class z00 extends org.telegram.ui.Components.fm0 {
    public final Context r;
    public final int s;
    public final /* synthetic */ e10 v;

    public z00(e10 e10Var, Context context, int i10) {
        this.v = e10Var;
        this.r = context;
        this.s = i10;
    }

    @Override // org.telegram.ui.Components.rl0
    public final String F(int i10) {
        return null;
    }

    @Override // org.telegram.ui.Components.rl0
    public final void G(org.telegram.ui.Components.jm0 jm0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // org.telegram.ui.Components.fm0
    public final int M(int i10) {
        e10 e10Var = this.v;
        if (i10 < e10Var.n.size()) {
            return ((ArrayList) e10Var.r.get(e10Var.n.get(i10))).size() + (i10 == 0 ? 0 : 1);
        }
        return 1;
    }

    @Override // org.telegram.ui.Components.fm0
    public final Object O(int i10, int i11) {
        return null;
    }

    @Override // org.telegram.ui.Components.fm0
    public final int P(int i10, int i11) {
        if (i10 >= this.v.n.size()) {
            return 2;
        }
        if (i10 != 0 && i11 == 0) {
            return 0;
        }
        int i12 = this.s;
        return (i12 == 2 || i12 == 4) ? 3 : 1;
    }

    @Override // org.telegram.ui.Components.fm0
    public final int R() {
        e10 e10Var = this.v;
        int i10 = 0;
        if (e10Var.n.isEmpty()) {
            return 0;
        }
        int size = e10Var.n.size();
        if (!e10Var.n.isEmpty() && !e10Var.N) {
            i10 = 1;
        }
        return size + i10;
    }

    @Override // org.telegram.ui.Components.fm0
    public final View T(int i10, View view) {
        if (view == null) {
            view = new org.telegram.ui.Cells.u3(this.r, null);
            view.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.e7, false) & (-218103809));
        }
        if (i10 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        if (i10 < this.v.n.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.u3) view).setText(LocaleController.formatSectionDate(((MessageObject) ((ArrayList) r1.r.get((String) r1.n.get(i10))).get(0)).messageOwner.date));
        }
        return view;
    }

    @Override // org.telegram.ui.Components.fm0
    public final boolean V(int i10, int i11, s4.b1 b1Var) {
        return i10 == 0 || i11 != 0;
    }

    @Override // org.telegram.ui.Components.fm0
    public final void W(int i10, int i11, s4.b1 b1Var) {
        boolean z10;
        e10 e10Var = this.v;
        ArrayList arrayList = e10Var.n;
        int i12 = b1Var.f;
        View view = b1Var.a;
        if (i12 != 2) {
            ArrayList arrayList2 = (ArrayList) e10Var.r.get((String) arrayList.get(i10));
            int i13 = b1Var.f;
            boolean z11 = false;
            if (i13 == 0) {
                ((org.telegram.ui.Cells.u3) view).setText(LocaleController.formatSectionDate(((MessageObject) arrayList2.get(0)).messageOwner.date));
                return;
            }
            boolean z12 = true;
            if (i13 != 1) {
                if (i13 != 3) {
                    return;
                }
                if (i10 != 0) {
                    i11--;
                }
                org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view;
                MessageObject messageObject = (MessageObject) arrayList2.get(i11);
                boolean z13 = h7Var.getMessage() != null && h7Var.getMessage().getId() == messageObject.getId();
                if (i11 != arrayList2.size() - 1 || (i10 == arrayList.size() - 1 && e10Var.M)) {
                    z11 = true;
                }
                h7Var.f(messageObject, z11);
                h7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.lk(this, h7Var, messageObject, z13, 3));
                return;
            }
            if (i10 != 0) {
                i11--;
            }
            org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view;
            MessageObject messageObject2 = (MessageObject) arrayList2.get(i11);
            if (i7Var.getMessage() == null || i7Var.getMessage().getId() != messageObject2.getId()) {
                z10 = false;
            } else {
                z10 = false;
                z11 = true;
            }
            if (i11 == arrayList2.size() - 1 && (i10 != arrayList.size() - 1 || !e10Var.M)) {
                z12 = z10;
            }
            i7Var.c(messageObject2, z12);
            i7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.lk(this, i7Var, messageObject2, z11, 2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        Context context = this.r;
        if (i10 == 0) {
            frameLayout = new org.telegram.ui.Cells.u3(context, null);
        } else if (i10 == 1) {
            frameLayout = new org.telegram.ui.Cells.i7(context, 2, null);
        } else {
            if (i10 != 2) {
                frameLayout2 = new y00(this, context);
                return com.google.android.gms.internal.play_billing.k3.l(frameLayout2, frameLayout2, -1, -2);
            }
            org.telegram.ui.Components.b10 b10Var = new org.telegram.ui.Components.b10(context, null);
            int i11 = this.s;
            if (i11 == 2 || i11 == 4) {
                b10Var.setViewType(4);
            } else {
                b10Var.setViewType(3);
            }
            b10Var.setIsSingleCell(true);
            frameLayout = b10Var;
        }
        frameLayout2 = frameLayout;
        return com.google.android.gms.internal.play_billing.k3.l(frameLayout2, frameLayout2, -1, -2);
    }
}
