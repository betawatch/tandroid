package org.telegram.ui;

import android.text.SpannableStringBuilder;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class x01 extends org.telegram.ui.Components.g71 {
    public boolean a;
    public final /* synthetic */ org.telegram.ui.Components.ar0 b;

    public x01(org.telegram.ui.Components.ar0 ar0Var) {
        this.b = ar0Var;
    }

    @Override // org.telegram.ui.Components.g71
    public final void a(ArrayList arrayList) {
        org.telegram.ui.Components.ar0 ar0Var = this.b;
        ky0 ky0Var = ar0Var.C;
        org.telegram.ui.Components.o71 o71Var = ar0Var.n;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            Integer num = (Integer) obj;
            int intValue = num.intValue();
            if (intValue != -1 && intValue != -2 && intValue != 0) {
                arrayList2.add(num);
            }
        }
        int f10 = f(o71Var.getCurrentPosition());
        jh.f6 f6Var = ar0Var.r;
        f6Var.getClass();
        HashMap hashMap = new HashMap();
        ArrayList arrayList3 = f6Var.h;
        int size2 = arrayList3.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList3.get(i12);
            i12++;
            jh.k6 k6Var = (jh.k6) obj2;
            hashMap.put(Integer.valueOf(k6Var.a), k6Var);
        }
        ArrayList arrayList4 = new ArrayList();
        int size3 = arrayList2.size();
        while (i10 < size3) {
            Object obj3 = arrayList2.get(i10);
            i10++;
            Integer num2 = (Integer) obj3;
            num2.getClass();
            jh.k6 k6Var2 = (jh.k6) hashMap.get(num2);
            if (k6Var2 != null) {
                arrayList4.add(k6Var2);
            }
        }
        arrayList3.clear();
        arrayList3.addAll(arrayList4);
        if (f10 >= 0) {
            int i13 = i(f10);
            o71Var.e(0.0f, i13, i13);
        }
        AndroidUtilities.cancelRunOnUIThread(ky0Var);
        AndroidUtilities.runOnUIThread(ky0Var, 1000L);
    }

    @Override // org.telegram.ui.Components.g71
    public final boolean c(int i10) {
        if (i10 == 0) {
            return false;
        }
        return (this.a && i10 == e() - 1) ? false : true;
    }

    @Override // org.telegram.ui.Components.g71
    public final View d(int i10) {
        if (i10 == -1) {
            return null;
        }
        return new View(this.b.getContext());
    }

    @Override // org.telegram.ui.Components.g71
    public final int e() {
        return this.b.r.h.size() + 1 + (this.a ? 1 : 0);
    }

    @Override // org.telegram.ui.Components.g71
    public final int f(int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (this.a && i10 == e() - 1) {
            return -1;
        }
        return ((jh.k6) this.b.r.h.get(i10 - 1)).a;
    }

    @Override // org.telegram.ui.Components.g71
    public final CharSequence g(int i10) {
        if (i10 == 0) {
            return LocaleController.getString(R.string.StoriesAlbumNameAllStories);
        }
        if (!this.a || i10 != e() - 1) {
            return ((jh.k6) this.b.r.h.get(i10 - 1)).b;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("+ ");
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StoriesAlbumAddAlbum));
        org.telegram.ui.Components.cq cqVar = new org.telegram.ui.Components.cq(R.drawable.poll_add_plus, 0);
        cqVar.spaceScaleX = 0.8f;
        spannableStringBuilder.setSpan(cqVar, 0, 1, 33);
        return spannableStringBuilder;
    }

    @Override // org.telegram.ui.Components.g71
    public final int h(int i10) {
        if (this.a && i10 == e() - 1) {
            return -1;
        }
        return i10;
    }

    public final int i(int i10) {
        if (i10 == 0) {
            return 0;
        }
        int c10 = this.b.r.c(i10);
        if (c10 == -1) {
            return -1;
        }
        return c10 + 1;
    }

    @Override // org.telegram.ui.Components.g71
    public final void b(View view, int i10, int i11) {
    }
}
