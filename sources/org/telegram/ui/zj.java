package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.WeakHashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class zj extends org.telegram.ui.Components.g71 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ rn b;

    public zj(rn rnVar, Context context) {
        this.b = rnVar;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.g71
    public final void b(View view, int i10, int i11) {
        if (view instanceof tn) {
            ((tn) view).a.Jc(this.b.q3);
        }
        WeakHashMap weakHashMap = r0.j0.a;
        r0.z.c(view);
    }

    @Override // org.telegram.ui.Components.g71
    public final View d(int i10) {
        Context context = this.a;
        rn rnVar = this.b;
        if (i10 == 0) {
            return new fn(rnVar, context);
        }
        Bundle bundle = new Bundle();
        bundle.putInt("chatMode", 7);
        bundle.putInt("searchType", i10);
        bundle.putString("searchHashtag", rnVar.q3);
        yj yjVar = new yj(context, rnVar.getParentLayout(), bundle, 0);
        yjVar.h = false;
        sn snVar = yjVar.a;
        snVar.H.a = rnVar.H;
        snVar.Y9 = rnVar.aa;
        snVar.Z9 = rnVar;
        snVar.R8 = new g(this, 13);
        return yjVar;
    }

    @Override // org.telegram.ui.Components.g71
    public final int e() {
        return 3;
    }

    @Override // org.telegram.ui.Components.g71
    public final CharSequence g(int i10) {
        return i10 != 1 ? i10 != 2 ? LocaleController.getString(R.string.SearchThisChat) : LocaleController.getString(R.string.SearchPublicPosts) : LocaleController.getString(R.string.SearchMyMessages);
    }

    @Override // org.telegram.ui.Components.g71
    public final int h(int i10) {
        return i10;
    }
}
