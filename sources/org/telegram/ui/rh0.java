package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import android.util.SparseArray;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class rh0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ Context a;
    public final /* synthetic */ uh0 b;

    public rh0(uh0 uh0Var, Context context) {
        this.b = uh0Var;
        this.a = context;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i7) {
        int i10;
        int i11;
        org.telegram.ui.ActionBar.y4 y4Var;
        uh0 uh0Var = this.b;
        org.telegram.ui.ActionBar.g6 g6Var = uh0Var.f;
        SparseArray sparseArray = uh0Var.I;
        if (i7 == -1) {
            y4Var = ((org.telegram.ui.ActionBar.f2) uh0Var).simpleActionBar;
            if (y4Var.t()) {
                uh0.b0(uh0Var);
                return;
            } else {
                uh0Var.finishFragment();
                return;
            }
        }
        if (i7 == 1) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, uh0Var.getParentActivity(), g6Var);
            String G = org.telegram.messenger.id.G(sparseArray.size(), "DeleteTones", new Object[0]);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
            u1Var.R = G;
            u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.G(sparseArray.size(), "DeleteTonesMessage", new Object[0]));
            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), new org.telegram.ui.Components.jl0(27));
            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751598, null), new yr(this, 28));
            TextView textView = (TextView) alertDialog$Builder.p().d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.q7, g6Var);
                return;
            }
            return;
        }
        if (i7 == 2) {
            int size = sparseArray.size();
            Context context = this.a;
            if (size == 1) {
                Intent intent = new Intent(context, (Class<?>) LaunchActivity.class);
                intent.setAction("android.intent.action.SEND");
                sh0 sh0Var = (sh0) sparseArray.valueAt(0);
                i11 = ((org.telegram.ui.ActionBar.f2) uh0Var).currentAccount;
                Uri a10 = sh0Var.a(i11);
                if (a10 != null) {
                    intent.putExtra("android.intent.extra.STREAM", a10);
                    context.startActivity(intent);
                }
            } else {
                Intent intent2 = new Intent(context, (Class<?>) LaunchActivity.class);
                intent2.setAction("android.intent.action.SEND_MULTIPLE");
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (int i12 = 0; i12 < sparseArray.size(); i12++) {
                    sh0 sh0Var2 = (sh0) sparseArray.valueAt(i12);
                    i10 = ((org.telegram.ui.ActionBar.f2) uh0Var).currentAccount;
                    Uri a11 = sh0Var2.a(i10);
                    if (a11 != null) {
                        arrayList.add(a11);
                    }
                }
                if (!arrayList.isEmpty()) {
                    intent2.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
                    context.startActivity(intent2);
                }
            }
            uh0.b0(uh0Var);
            uh0Var.i0();
            uh0Var.e.f();
        }
    }
}
