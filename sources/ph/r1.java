package ph;

import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.cd;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.o71;
import org.telegram.ui.Components.vq0;
import rh.u5;
import rh.v5;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class r1 extends o71 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p6 b;
    public final /* synthetic */ vq0 c;

    public r1(vq0 vq0Var, int i10, p6 p6Var) {
        this.c = vq0Var;
        this.a = i10;
        this.b = p6Var;
    }

    @Override // org.telegram.ui.Components.o71
    public final void a(ArrayList arrayList) {
        vq0 vq0Var = this.c;
        m1 m1Var = vq0Var.Q;
        u5 u5Var = vq0Var.e;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Integer num = (Integer) obj;
            int intValue = num.intValue();
            if (intValue != -1 && intValue != -2) {
                arrayList2.add(num);
            }
        }
        u5Var.getClass();
        HashMap hashMap = new HashMap();
        ArrayList arrayList3 = u5Var.e;
        int size2 = arrayList3.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList3.get(i11);
            i11++;
            TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj2;
            hashMap.put(Integer.valueOf(tL_starGiftCollection.collection_id), tL_starGiftCollection);
        }
        ArrayList arrayList4 = new ArrayList();
        int size3 = arrayList2.size();
        int i12 = 0;
        while (i12 < size3) {
            Object obj3 = arrayList2.get(i12);
            i12++;
            Integer num2 = (Integer) obj3;
            num2.getClass();
            TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) hashMap.get(num2);
            if (tL_starGiftCollection2 != null) {
                arrayList4.add(tL_starGiftCollection2);
            }
        }
        arrayList3.clear();
        arrayList3.addAll(arrayList4);
        u5Var.j();
        f2 currentPage = vq0Var.getCurrentPage();
        if (currentPage != null) {
            int f7 = currentPage.d ? u5Var.f(currentPage.e.d) + 1 : 0;
            vq0Var.n.e(0.0f, f7, f7);
        }
        org.telegram.messenger.i0.r(m1Var);
        org.telegram.messenger.i0.h3(m1Var, 1000L);
    }

    @Override // org.telegram.ui.Components.o71
    public final void b(View view, int i10, int i11) {
        v5 v5Var;
        boolean z10;
        vq0 vq0Var = this.c;
        u5 u5Var = vq0Var.e;
        f2 f2Var = (f2) view;
        if (i11 == 0) {
            v5Var = vq0Var.d;
            z10 = false;
        } else {
            int i12 = i10 - 1;
            if (i12 < 0) {
                u5Var.getClass();
            } else if (i12 < u5Var.d().size()) {
                v5Var = u5Var.e(((TL_stars.TL_starGiftCollection) u5Var.d().get(i12)).collection_id);
                z10 = true;
            }
            v5Var = null;
            z10 = true;
        }
        f2Var.d = z10;
        f2Var.e = v5Var;
        if (v5Var != null) {
            v5Var.b();
        }
        f2Var.f(false);
        LinearLayout linearLayout = f2Var.D;
        if (linearLayout != null) {
            linearLayout.setVisibility(f2Var.a.e.h() ? 0 : 8);
        }
        f2Var.setVisibleHeight(vq0Var.T);
        f2Var.setHasTabs(!u5Var.d().isEmpty());
    }

    @Override // org.telegram.ui.Components.o71
    public final boolean c(int i10) {
        return i10 != 0;
    }

    @Override // org.telegram.ui.Components.o71
    public final View d(int i10) {
        if (i10 == -1) {
            return null;
        }
        int i11 = this.a;
        p6 p6Var = this.b;
        vq0 vq0Var = this.c;
        f2 f2Var = new f2(vq0Var, i11, p6Var);
        ei.r rVar = vq0Var.N;
        if (rVar != null) {
            rVar.b(f2Var.f);
        }
        return f2Var;
    }

    @Override // org.telegram.ui.Components.o71
    public final int e() {
        return this.c.e.d().size() + 1;
    }

    @Override // org.telegram.ui.Components.o71
    public final int f(int i10) {
        if (i10 == 0) {
            return -2;
        }
        return ((TL_stars.TL_starGiftCollection) this.c.e.d().get(i10 - 1)).collection_id;
    }

    @Override // org.telegram.ui.Components.o71
    public final CharSequence g(int i10) {
        if (i10 == 0) {
            return cd.L0(2131750257, null);
        }
        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.c.e.d().get(i10 - 1);
        if (tL_starGiftCollection == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_starGiftCollection.title);
        if (tL_starGiftCollection.icon != null) {
            TextPaint textPaint = new TextPaint(1);
            textPaint.setTextSize(org.telegram.messenger.i0.L(16.0f));
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("e ");
            spannableStringBuilder2.setSpan(new o5(tL_starGiftCollection.icon, textPaint.getFontMetricsInt()), 0, 1, 33);
            spannableStringBuilder.insert(0, (CharSequence) spannableStringBuilder2);
        }
        return spannableStringBuilder;
    }

    @Override // org.telegram.ui.Components.o71
    public final int h(int i10) {
        return i10 == 0 ? 0 : 1;
    }
}
