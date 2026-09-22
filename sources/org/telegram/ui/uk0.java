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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class uk0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ Context a;
    public final /* synthetic */ yk0 b;

    public uk0(yk0 yk0Var, Context context) {
        this.b = yk0Var;
        this.a = context;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        int i11;
        int i12;
        org.telegram.ui.ActionBar.k kVar;
        yk0 yk0Var = this.b;
        org.telegram.ui.ActionBar.e6 e6Var = yk0Var.h;
        SparseArray sparseArray = yk0Var.J;
        if (i10 == -1) {
            kVar = ((org.telegram.ui.ActionBar.n2) yk0Var).actionBar;
            if (kVar.s()) {
                yk0.W(yk0Var);
                return;
            } else {
                yk0Var.finishFragment();
                return;
            }
        }
        if (i10 == 1) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yk0Var.getParentActivity(), 0, e6Var);
            alertDialog$Builder.a.R = LocaleController.formatPluralString("DeleteTones", sparseArray.size(), new Object[0]);
            alertDialog$Builder.a.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString("DeleteTonesMessage", sparseArray.size(), new Object[0]));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.Components.in0(27));
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new hu(this, 28));
            TextView textView = (TextView) alertDialog$Builder.o().d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.q7, e6Var));
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
                wk0 wk0Var = (wk0) sparseArray.valueAt(0);
                i12 = ((org.telegram.ui.ActionBar.n2) yk0Var).currentAccount;
                Uri a2 = wk0Var.a(i12);
                if (a2 != null) {
                    intent.putExtra("android.intent.extra.STREAM", a2);
                    context.startActivity(intent);
                }
            } else {
                Intent intent2 = new Intent(context, (Class<?>) LaunchActivity.class);
                intent2.setAction("android.intent.action.SEND_MULTIPLE");
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (int i13 = 0; i13 < sparseArray.size(); i13++) {
                    wk0 wk0Var2 = (wk0) sparseArray.valueAt(i13);
                    i11 = ((org.telegram.ui.ActionBar.n2) yk0Var).currentAccount;
                    Uri a10 = wk0Var2.a(i11);
                    if (a10 != null) {
                        arrayList.add(a10);
                    }
                }
                if (!arrayList.isEmpty()) {
                    intent2.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
                    context.startActivity(intent2);
                }
            }
            yk0.W(yk0Var);
            yk0Var.c0();
            yk0Var.f.l();
        }
    }
}
