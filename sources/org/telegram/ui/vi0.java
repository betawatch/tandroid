package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import android.util.SparseArray;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class vi0 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ Context a;
    public final /* synthetic */ yi0 b;

    public vi0(yi0 yi0Var, Context context) {
        this.b = yi0Var;
        this.a = context;
    }

    @Override // org.telegram.ui.ActionBar.k
    public final void b(int i10) {
        int i11;
        int i12;
        org.telegram.ui.ActionBar.i5 i5Var;
        yi0 yi0Var = this.b;
        org.telegram.ui.ActionBar.p6 p6Var = yi0Var.f;
        SparseArray sparseArray = yi0Var.I;
        if (i10 == -1) {
            i5Var = ((org.telegram.ui.ActionBar.k2) yi0Var).simpleActionBar;
            if (i5Var.s()) {
                yi0.a0(yi0Var);
                return;
            } else {
                yi0Var.finishFragment();
                return;
            }
        }
        if (i10 == 1) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, yi0Var.getParentActivity(), p6Var);
            String G = org.telegram.messenger.cd.G(sparseArray.size(), "DeleteTones", new Object[0]);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
            x1Var.R = G;
            x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.G(sparseArray.size(), "DeleteTonesMessage", new Object[0]));
            alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), new org.telegram.ui.Components.z11(17));
            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751599, null), new tt(this, 28));
            TextView textView = (TextView) alertDialog$Builder.p().d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q7, p6Var);
                return;
            }
            return;
        }
        if (i10 == 2) {
            int size = sparseArray.size();
            Context context = this.a;
            if (size == 1) {
                Intent intent = new Intent(context, (Class<?>) LaunchActivity.class);
                intent.setAction("android.intent.action.SEND");
                wi0 wi0Var = (wi0) sparseArray.valueAt(0);
                i12 = ((org.telegram.ui.ActionBar.k2) yi0Var).currentAccount;
                Uri a2 = wi0Var.a(i12);
                if (a2 != null) {
                    intent.putExtra("android.intent.extra.STREAM", a2);
                    context.startActivity(intent);
                }
            } else {
                Intent intent2 = new Intent(context, (Class<?>) LaunchActivity.class);
                intent2.setAction("android.intent.action.SEND_MULTIPLE");
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (int i13 = 0; i13 < sparseArray.size(); i13++) {
                    wi0 wi0Var2 = (wi0) sparseArray.valueAt(i13);
                    i11 = ((org.telegram.ui.ActionBar.k2) yi0Var).currentAccount;
                    Uri a10 = wi0Var2.a(i11);
                    if (a10 != null) {
                        arrayList.add(a10);
                    }
                }
                if (!arrayList.isEmpty()) {
                    intent2.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
                    context.startActivity(intent2);
                }
            }
            yi0.a0(yi0Var);
            yi0Var.h0();
            yi0Var.e.f();
        }
    }
}
