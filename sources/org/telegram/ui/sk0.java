package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import android.util.SparseArray;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class sk0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ Context a;
    public final /* synthetic */ wk0 b;

    public sk0(wk0 wk0Var, Context context) {
        this.b = wk0Var;
        this.a = context;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        int i11;
        int i12;
        org.telegram.ui.ActionBar.k kVar;
        wk0 wk0Var = this.b;
        org.telegram.ui.ActionBar.d6 d6Var = wk0Var.h;
        SparseArray sparseArray = wk0Var.J;
        if (i10 == -1) {
            kVar = ((org.telegram.ui.ActionBar.n2) wk0Var).actionBar;
            if (kVar.s()) {
                wk0.U(wk0Var);
                return;
            } else {
                wk0Var.finishFragment();
                return;
            }
        }
        if (i10 == 1) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wk0Var.getParentActivity(), 0, d6Var);
            alertDialog$Builder.a.R = LocaleController.formatPluralString("DeleteTones", sparseArray.size(), new Object[0]);
            alertDialog$Builder.a.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString("DeleteTonesMessage", sparseArray.size(), new Object[0]));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.Components.voip.e1(15));
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new bu(this, 29));
            TextView textView = (TextView) alertDialog$Builder.o().d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.q7, d6Var));
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
                uk0 uk0Var = (uk0) sparseArray.valueAt(0);
                i12 = ((org.telegram.ui.ActionBar.n2) wk0Var).currentAccount;
                Uri a2 = uk0Var.a(i12);
                if (a2 != null) {
                    intent.putExtra("android.intent.extra.STREAM", a2);
                    context.startActivity(intent);
                }
            } else {
                Intent intent2 = new Intent(context, (Class<?>) LaunchActivity.class);
                intent2.setAction("android.intent.action.SEND_MULTIPLE");
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (int i13 = 0; i13 < sparseArray.size(); i13++) {
                    uk0 uk0Var2 = (uk0) sparseArray.valueAt(i13);
                    i11 = ((org.telegram.ui.ActionBar.n2) wk0Var).currentAccount;
                    Uri a10 = uk0Var2.a(i11);
                    if (a10 != null) {
                        arrayList.add(a10);
                    }
                }
                if (!arrayList.isEmpty()) {
                    intent2.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
                    context.startActivity(intent2);
                }
            }
            wk0.U(wk0Var);
            wk0Var.c0();
            wk0Var.f.l();
        }
    }
}
