package wh;

import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.n81;
import org.telegram.ui.Components.wr0;
import org.telegram.ui.Components.y5;
import xh.l5;
import xh.n5;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class w1 extends n81 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f6 b;
    public final /* synthetic */ wr0 c;

    public w1(wr0 wr0Var, int i10, f6 f6Var) {
        this.c = wr0Var;
        this.a = i10;
        this.b = f6Var;
    }

    @Override // org.telegram.ui.Components.n81
    public final void a(ArrayList arrayList) {
        wr0 wr0Var = this.c;
        s1 s1Var = wr0Var.N;
        l5 l5Var = wr0Var.e;
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
        l5Var.getClass();
        HashMap hashMap = new HashMap();
        ArrayList arrayList3 = l5Var.e;
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
        l5Var.j();
        m2 currentPage = wr0Var.getCurrentPage();
        if (currentPage != null) {
            int f7 = currentPage.d ? l5Var.f(currentPage.e.d) + 1 : 0;
            wr0Var.n.e(0.0f, f7, f7);
        }
        AndroidUtilities.cancelRunOnUIThread(s1Var);
        AndroidUtilities.runOnUIThread(s1Var, 1000L);
    }

    @Override // org.telegram.ui.Components.n81
    public final void b(View view, int i10, int i11) {
        n5 n5Var;
        boolean z10;
        wr0 wr0Var = this.c;
        l5 l5Var = wr0Var.e;
        m2 m2Var = (m2) view;
        if (i11 == 0) {
            n5Var = wr0Var.d;
            z10 = false;
        } else {
            int i12 = i10 - 1;
            if (i12 < 0) {
                l5Var.getClass();
            } else if (i12 < l5Var.d().size()) {
                n5Var = l5Var.e(((TL_stars.TL_starGiftCollection) l5Var.d().get(i12)).collection_id);
                z10 = true;
            }
            n5Var = null;
            z10 = true;
        }
        m2Var.d = z10;
        m2Var.e = n5Var;
        if (n5Var != null) {
            n5Var.a();
        }
        m2Var.f(false);
        LinearLayout linearLayout = m2Var.E;
        if (linearLayout != null) {
            linearLayout.setVisibility(m2Var.a.e.h() ? 0 : 8);
        }
        m2Var.setVisibleHeight(wr0Var.Q);
        m2Var.setHasTabs(!l5Var.d().isEmpty());
    }

    @Override // org.telegram.ui.Components.n81
    public final boolean c(int i10) {
        return i10 != 0;
    }

    @Override // org.telegram.ui.Components.n81
    public final View d(int i10) {
        if (i10 == -1) {
            return null;
        }
        return new m2(this.c, this.a, this.b);
    }

    @Override // org.telegram.ui.Components.n81
    public final int e() {
        return this.c.e.d().size() + 1;
    }

    @Override // org.telegram.ui.Components.n81
    public final int f(int i10) {
        if (i10 == 0) {
            return -2;
        }
        return ((TL_stars.TL_starGiftCollection) this.c.e.d().get(i10 - 1)).collection_id;
    }

    @Override // org.telegram.ui.Components.n81
    public final CharSequence g(int i10) {
        if (i10 == 0) {
            return LocaleController.getString(R.string.Gift2CollectionAll);
        }
        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.c.e.d().get(i10 - 1);
        if (tL_starGiftCollection == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_starGiftCollection.title);
        if (tL_starGiftCollection.icon != null) {
            TextPaint textPaint = new TextPaint(1);
            textPaint.setTextSize(AndroidUtilities.dp(16.0f));
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("e ");
            spannableStringBuilder2.setSpan(new y5(tL_starGiftCollection.icon, textPaint.getFontMetricsInt()), 0, 1, 33);
            spannableStringBuilder.insert(0, (CharSequence) spannableStringBuilder2);
        }
        return spannableStringBuilder;
    }

    @Override // org.telegram.ui.Components.n81
    public final int h(int i10) {
        return i10 == 0 ? 0 : 1;
    }
}
