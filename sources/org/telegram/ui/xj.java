package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.WeakHashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class xj extends org.telegram.ui.Components.e71 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ qn b;

    public xj(qn qnVar, Context context) {
        this.b = qnVar;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.e71
    public final void b(View view, int i9, int i10) {
        if (view instanceof sn) {
            ((sn) view).a.Jc(this.b.q3);
        }
        WeakHashMap weakHashMap = r0.j0.a;
        r0.z.c(view);
    }

    @Override // org.telegram.ui.Components.e71
    public final View d(int i9) {
        Context context = this.a;
        qn qnVar = this.b;
        if (i9 == 0) {
            return new en(qnVar, context);
        }
        Bundle bundle = new Bundle();
        bundle.putInt("chatMode", 7);
        bundle.putInt("searchType", i9);
        bundle.putString("searchHashtag", qnVar.q3);
        wj wjVar = new wj(context, qnVar.getParentLayout(), bundle, 0);
        wjVar.h = false;
        rn rnVar = wjVar.a;
        rnVar.H.a = qnVar.H;
        rnVar.Y9 = qnVar.aa;
        rnVar.Z9 = qnVar;
        rnVar.R8 = new g(this, 13);
        return wjVar;
    }

    @Override // org.telegram.ui.Components.e71
    public final int e() {
        return 3;
    }

    @Override // org.telegram.ui.Components.e71
    public final CharSequence g(int i9) {
        return i9 != 1 ? i9 != 2 ? LocaleController.getString(R.string.SearchThisChat) : LocaleController.getString(R.string.SearchPublicPosts) : LocaleController.getString(R.string.SearchMyMessages);
    }

    @Override // org.telegram.ui.Components.e71
    public final int h(int i9) {
        return i9;
    }
}
