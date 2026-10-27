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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class rk0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ Context a;
    public final /* synthetic */ vk0 b;

    public rk0(vk0 vk0Var, Context context) {
        this.b = vk0Var;
        this.a = context;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        int i11;
        int i12;
        org.telegram.ui.ActionBar.r5 r5Var;
        vk0 vk0Var = this.b;
        org.telegram.ui.ActionBar.u6 u6Var = vk0Var.f;
        SparseArray sparseArray = vk0Var.I;
        if (i10 == -1) {
            r5Var = ((org.telegram.ui.ActionBar.r2) vk0Var).simpleActionBar;
            if (r5Var.o()) {
                vk0.X(vk0Var);
                return;
            } else {
                vk0Var.finishFragment();
                return;
            }
        }
        if (i10 == 1) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vk0Var.getParentActivity(), 0, u6Var);
            alertDialog$Builder.a.R = LocaleController.formatPluralString("DeleteTones", sparseArray.size(), new Object[0]);
            alertDialog$Builder.a.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString("DeleteTonesMessage", sparseArray.size(), new Object[0]));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.Components.voip.c1(13));
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new st(this, 29));
            TextView textView = (TextView) alertDialog$Builder.p().d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.q7, u6Var);
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
                tk0 tk0Var = (tk0) sparseArray.valueAt(0);
                i12 = ((org.telegram.ui.ActionBar.r2) vk0Var).currentAccount;
                Uri a2 = tk0Var.a(i12);
                if (a2 != null) {
                    intent.putExtra("android.intent.extra.STREAM", a2);
                    context.startActivity(intent);
                }
            } else {
                Intent intent2 = new Intent(context, (Class<?>) LaunchActivity.class);
                intent2.setAction("android.intent.action.SEND_MULTIPLE");
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (int i13 = 0; i13 < sparseArray.size(); i13++) {
                    tk0 tk0Var2 = (tk0) sparseArray.valueAt(i13);
                    i11 = ((org.telegram.ui.ActionBar.r2) vk0Var).currentAccount;
                    Uri a10 = tk0Var2.a(i11);
                    if (a10 != null) {
                        arrayList.add(a10);
                    }
                }
                if (!arrayList.isEmpty()) {
                    intent2.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
                    context.startActivity(intent2);
                }
            }
            vk0.X(vk0Var);
            vk0Var.e0();
            vk0Var.e.l();
        }
    }
}
