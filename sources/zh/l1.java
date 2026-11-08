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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.r5;
import org.telegram.ui.Components.up0;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class l1 extends m61 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f6 b;
    public final /* synthetic */ up0 c;

    public l1(up0 up0Var, int i7, f6 f6Var) {
        this.c = up0Var;
        this.a = i7;
        this.b = f6Var;
    }

    @Override // org.telegram.ui.Components.m61
    public final void a(ArrayList arrayList) {
        up0 up0Var = this.c;
        h1 h1Var = up0Var.Q;
        t9 t9Var = up0Var.e;
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
        z1 currentPage = up0Var.getCurrentPage();
        if (currentPage != null) {
            int f10 = currentPage.d ? t9Var.f(currentPage.e.d) + 1 : 0;
            up0Var.n.e(0.0f, f10, f10);
        }
        org.telegram.messenger.g0.r(h1Var);
        org.telegram.messenger.g0.i3(h1Var, 1000L);
    }

    @Override // org.telegram.ui.Components.m61
    public final void b(View view, int i7, int i10) {
        v9 v9Var;
        boolean z9;
        up0 up0Var = this.c;
        t9 t9Var = up0Var.e;
        z1 z1Var = (z1) view;
        if (i10 == 0) {
            v9Var = up0Var.d;
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
        z1Var.setVisibleHeight(up0Var.T);
        z1Var.setHasTabs(!t9Var.d().isEmpty());
    }

    @Override // org.telegram.ui.Components.m61
    public final boolean c(int i7) {
        return i7 != 0;
    }

    @Override // org.telegram.ui.Components.m61
    public final View d(int i7) {
        if (i7 == -1) {
            return null;
        }
        int i10 = this.a;
        f6 f6Var = this.b;
        up0 up0Var = this.c;
        z1 z1Var = new z1(up0Var, i10, f6Var);
        oi.q qVar = up0Var.N;
        if (qVar != null) {
            qVar.b(z1Var.f);
        }
        return z1Var;
    }

    @Override // org.telegram.ui.Components.m61
    public final int e() {
        return this.c.e.d().size() + 1;
    }

    @Override // org.telegram.ui.Components.m61
    public final int f(int i7) {
        if (i7 == 0) {
            return -2;
        }
        return ((TL_stars.TL_starGiftCollection) this.c.e.d().get(i7 - 1)).collection_id;
    }

    @Override // org.telegram.ui.Components.m61
    public final CharSequence g(int i7) {
        if (i7 == 0) {
            return id.M0(2131750249, null);
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

    @Override // org.telegram.ui.Components.m61
    public final int h(int i7) {
        return i7 == 0 ? 0 : 1;
    }
}
