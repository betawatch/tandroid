package zh;

import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.View;
import android.widget.LinearLayout;
import bi.t9;
import bi.v9;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.id;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.n61;
import org.telegram.ui.Components.r5;
import org.telegram.ui.Components.vp0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class l1 extends n61 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g6 b;
    public final /* synthetic */ vp0 c;

    public l1(vp0 vp0Var, int i7, g6 g6Var) {
        this.c = vp0Var;
        this.a = i7;
        this.b = g6Var;
    }

    @Override // org.telegram.ui.Components.n61
    public final void a(ArrayList arrayList) {
        vp0 vp0Var = this.c;
        h1 h1Var = vp0Var.Q;
        t9 t9Var = vp0Var.e;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            Integer num = (Integer) obj;
            int intValue = num.intValue();
            if (intValue != -1 && intValue != -2) {
                arrayList2.add(num);
            }
        }
        t9Var.getClass();
        HashMap hashMap = new HashMap();
        ArrayList arrayList3 = t9Var.e;
        int size2 = arrayList3.size();
        int i10 = 0;
        while (i10 < size2) {
            Object obj2 = arrayList3.get(i10);
            i10++;
            TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj2;
            hashMap.put(Integer.valueOf(tL_starGiftCollection.collection_id), tL_starGiftCollection);
        }
        ArrayList arrayList4 = new ArrayList();
        int size3 = arrayList2.size();
        int i11 = 0;
        while (i11 < size3) {
            Object obj3 = arrayList2.get(i11);
            i11++;
            Integer num2 = (Integer) obj3;
            num2.getClass();
            TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) hashMap.get(num2);
            if (tL_starGiftCollection2 != null) {
                arrayList4.add(tL_starGiftCollection2);
            }
        }
        arrayList3.clear();
        arrayList3.addAll(arrayList4);
        t9Var.j();
        z1 currentPage = vp0Var.getCurrentPage();
        if (currentPage != null) {
            int f10 = currentPage.d ? t9Var.f(currentPage.e.d) + 1 : 0;
            vp0Var.n.e(0.0f, f10, f10);
        }
        org.telegram.messenger.g0.r(h1Var);
        org.telegram.messenger.g0.i3(h1Var, 1000L);
    }

    @Override // org.telegram.ui.Components.n61
    public final void b(View view, int i7, int i10) {
        v9 v9Var;
        boolean z9;
        vp0 vp0Var = this.c;
        t9 t9Var = vp0Var.e;
        z1 z1Var = (z1) view;
        if (i10 == 0) {
            v9Var = vp0Var.d;
            z9 = false;
        } else {
            int i11 = i7 - 1;
            if (i11 < 0) {
                t9Var.getClass();
            } else if (i11 < t9Var.d().size()) {
                v9Var = t9Var.e(((TL_stars.TL_starGiftCollection) t9Var.d().get(i11)).collection_id);
                z9 = true;
            }
            v9Var = null;
            z9 = true;
        }
        z1Var.d = z9;
        z1Var.e = v9Var;
        if (v9Var != null) {
            v9Var.a();
        }
        z1Var.f(false);
        LinearLayout linearLayout = z1Var.D;
        if (linearLayout != null) {
            linearLayout.setVisibility(z1Var.a.e.h() ? 0 : 8);
        }
        z1Var.setVisibleHeight(vp0Var.T);
        z1Var.setHasTabs(!t9Var.d().isEmpty());
    }

    @Override // org.telegram.ui.Components.n61
    public final boolean c(int i7) {
        return i7 != 0;
    }

    @Override // org.telegram.ui.Components.n61
    public final View d(int i7) {
        if (i7 == -1) {
            return null;
        }
        int i10 = this.a;
        g6 g6Var = this.b;
        vp0 vp0Var = this.c;
        z1 z1Var = new z1(vp0Var, i10, g6Var);
        oi.q qVar = vp0Var.N;
        if (qVar != null) {
            qVar.b(z1Var.f);
        }
        return z1Var;
    }

    @Override // org.telegram.ui.Components.n61
    public final int e() {
        return this.c.e.d().size() + 1;
    }

    @Override // org.telegram.ui.Components.n61
    public final int f(int i7) {
        if (i7 == 0) {
            return -2;
        }
        return ((TL_stars.TL_starGiftCollection) this.c.e.d().get(i7 - 1)).collection_id;
    }

    @Override // org.telegram.ui.Components.n61
    public final CharSequence g(int i7) {
        if (i7 == 0) {
            return id.M0(2131750248, null);
        }
        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.c.e.d().get(i7 - 1);
        if (tL_starGiftCollection == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_starGiftCollection.title);
        if (tL_starGiftCollection.icon != null) {
            TextPaint textPaint = new TextPaint(1);
            textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("e ");
            spannableStringBuilder2.setSpan(new r5(tL_starGiftCollection.icon, textPaint.getFontMetricsInt()), 0, 1, 33);
            spannableStringBuilder.insert(0, (CharSequence) spannableStringBuilder2);
        }
        return spannableStringBuilder;
    }

    @Override // org.telegram.ui.Components.n61
    public final int h(int i7) {
        return i7 == 0 ? 0 : 1;
    }
}
