package org.telegram.ui;

import android.text.SpannableStringBuilder;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class yy0 extends org.telegram.ui.Components.o71 {
    public boolean a;
    public final /* synthetic */ org.telegram.ui.Components.zq0 b;

    public yy0(org.telegram.ui.Components.zq0 zq0Var) {
        this.b = zq0Var;
    }

    @Override // org.telegram.ui.Components.o71
    public final void a(ArrayList arrayList) {
        org.telegram.ui.Components.zq0 zq0Var = this.b;
        wv0 wv0Var = zq0Var.w;
        org.telegram.ui.Components.v71 v71Var = zq0Var.b;
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
        int f7 = f(v71Var.getCurrentPosition());
        th.t4 t4Var = zq0Var.c;
        t4Var.getClass();
        HashMap hashMap = new HashMap();
        ArrayList arrayList3 = t4Var.h;
        int size2 = arrayList3.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList3.get(i12);
            i12++;
            th.y4 y4Var = (th.y4) obj2;
            hashMap.put(Integer.valueOf(y4Var.a), y4Var);
        }
        ArrayList arrayList4 = new ArrayList();
        int size3 = arrayList2.size();
        while (i10 < size3) {
            Object obj3 = arrayList2.get(i10);
            i10++;
            Integer num2 = (Integer) obj3;
            num2.getClass();
            th.y4 y4Var2 = (th.y4) hashMap.get(num2);
            if (y4Var2 != null) {
                arrayList4.add(y4Var2);
            }
        }
        arrayList3.clear();
        arrayList3.addAll(arrayList4);
        if (f7 >= 0) {
            int i13 = i(f7);
            v71Var.e(0.0f, i13, i13);
        }
        org.telegram.messenger.i0.r(wv0Var);
        org.telegram.messenger.i0.h3(wv0Var, 1000L);
    }

    @Override // org.telegram.ui.Components.o71
    public final boolean c(int i10) {
        if (i10 == 0) {
            return false;
        }
        return (this.a && i10 == e() - 1) ? false : true;
    }

    @Override // org.telegram.ui.Components.o71
    public final View d(int i10) {
        if (i10 == -1) {
            return null;
        }
        return new View(this.b.getContext());
    }

    @Override // org.telegram.ui.Components.o71
    public final int e() {
        return this.b.c.h.size() + 1 + (this.a ? 1 : 0);
    }

    @Override // org.telegram.ui.Components.o71
    public final int f(int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (this.a && i10 == e() - 1) {
            return -1;
        }
        return ((th.y4) this.b.c.h.get(i10 - 1)).a;
    }

    @Override // org.telegram.ui.Components.o71
    public final CharSequence g(int i10) {
        if (i10 == 0) {
            return org.telegram.messenger.cd.L0(2131744804, null);
        }
        if (!this.a || i10 != e() - 1) {
            return ((th.y4) this.b.c.h.get(i10 - 1)).b;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("+ ");
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.cd.L0(2131744825, null));
        org.telegram.ui.Components.dq dqVar = new org.telegram.ui.Components.dq(R.drawable.poll_add_plus, 0);
        dqVar.G = 0.8f;
        spannableStringBuilder.setSpan(dqVar, 0, 1, 33);
        return spannableStringBuilder;
    }

    @Override // org.telegram.ui.Components.o71
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
        int c10 = this.b.c.c(i10);
        if (c10 == -1) {
            return -1;
        }
        return c10 + 1;
    }

    @Override // org.telegram.ui.Components.o71
    public final void b(View view, int i10, int i11) {
    }
}
