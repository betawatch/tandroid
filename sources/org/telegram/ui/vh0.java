package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import android.util.SparseArray;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class vh0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ Context a;
    public final /* synthetic */ yh0 b;

    public vh0(yh0 yh0Var, Context context) {
        this.b = yh0Var;
        this.a = context;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i7) {
        int i10;
        int i11;
        org.telegram.ui.ActionBar.z4 z4Var;
        yh0 yh0Var = this.b;
        org.telegram.ui.ActionBar.h6 h6Var = yh0Var.f;
        SparseArray sparseArray = yh0Var.J;
        if (i7 == -1) {
            z4Var = ((org.telegram.ui.ActionBar.g2) yh0Var).simpleActionBar;
            if (z4Var.x()) {
                yh0.b0(yh0Var);
                return;
            } else {
                yh0Var.finishFragment();
                return;
            }
        }
        if (i7 == 1) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, yh0Var.getParentActivity(), h6Var);
            String G = org.telegram.messenger.gd.G(sparseArray.size(), "DeleteTones", new Object[0]);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
            t1Var.S = G;
            t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.G(sparseArray.size(), "DeleteTonesMessage", new Object[0]));
            alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), new m60(4));
            alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131751586, null), new zr(this, 28));
            TextView textView = (TextView) alertDialog$Builder.p().d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.q7, h6Var);
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
                wh0 wh0Var = (wh0) sparseArray.valueAt(0);
                i11 = ((org.telegram.ui.ActionBar.g2) yh0Var).currentAccount;
                Uri a10 = wh0Var.a(i11);
                if (a10 != null) {
                    intent.putExtra("android.intent.extra.STREAM", a10);
                    context.startActivity(intent);
                }
            } else {
                Intent intent2 = new Intent(context, (Class<?>) LaunchActivity.class);
                intent2.setAction("android.intent.action.SEND_MULTIPLE");
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (int i12 = 0; i12 < sparseArray.size(); i12++) {
                    wh0 wh0Var2 = (wh0) sparseArray.valueAt(i12);
                    i10 = ((org.telegram.ui.ActionBar.g2) yh0Var).currentAccount;
                    Uri a11 = wh0Var2.a(i10);
                    if (a11 != null) {
                        arrayList.add(a11);
                    }
                }
                if (!arrayList.isEmpty()) {
                    intent2.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
                    context.startActivity(intent2);
                }
            }
            yh0.b0(yh0Var);
            yh0Var.i0();
            yh0Var.e.f();
        }
    }
}
