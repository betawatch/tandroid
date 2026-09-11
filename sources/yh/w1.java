package yh;

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
import org.telegram.ui.Components.a81;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.Components.z5;
import zh.i5;
import zh.j5;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class w1 extends a81 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f6 b;
    public final /* synthetic */ nr0 c;

    public w1(nr0 nr0Var, int i10, f6 f6Var) {
        this.c = nr0Var;
        this.a = i10;
        this.b = f6Var;
    }

    @Override // org.telegram.ui.Components.a81
    public final void a(ArrayList arrayList) {
        nr0 nr0Var = this.c;
        s1 s1Var = nr0Var.N;
        i5 i5Var = nr0Var.e;
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
        i5Var.getClass();
        HashMap hashMap = new HashMap();
        ArrayList arrayList3 = i5Var.e;
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
        i5Var.j();
        m2 currentPage = nr0Var.getCurrentPage();
        if (currentPage != null) {
            int f7 = currentPage.d ? i5Var.f(currentPage.e.d) + 1 : 0;
            nr0Var.n.e(0.0f, f7, f7);
        }
        AndroidUtilities.cancelRunOnUIThread(s1Var);
        AndroidUtilities.runOnUIThread(s1Var, 1000L);
    }

    @Override // org.telegram.ui.Components.a81
    public final void b(View view, int i10, int i11) {
        j5 j5Var;
        boolean z10;
        nr0 nr0Var = this.c;
        i5 i5Var = nr0Var.e;
        m2 m2Var = (m2) view;
        if (i11 == 0) {
            j5Var = nr0Var.d;
            z10 = false;
        } else {
            int i12 = i10 - 1;
            if (i12 < 0) {
                i5Var.getClass();
            } else if (i12 < i5Var.d().size()) {
                j5Var = i5Var.e(((TL_stars.TL_starGiftCollection) i5Var.d().get(i12)).collection_id);
                z10 = true;
            }
            j5Var = null;
            z10 = true;
        }
        m2Var.d = z10;
        m2Var.e = j5Var;
        if (j5Var != null) {
            j5Var.a();
        }
        m2Var.f(false);
        LinearLayout linearLayout = m2Var.E;
        if (linearLayout != null) {
            linearLayout.setVisibility(m2Var.a.e.h() ? 0 : 8);
        }
        m2Var.setVisibleHeight(nr0Var.Q);
        m2Var.setHasTabs(!i5Var.d().isEmpty());
    }

    @Override // org.telegram.ui.Components.a81
    public final boolean c(int i10) {
        return i10 != 0;
    }

    @Override // org.telegram.ui.Components.a81
    public final View d(int i10) {
        if (i10 == -1) {
            return null;
        }
        return new m2(this.c, this.a, this.b);
    }

    @Override // org.telegram.ui.Components.a81
    public final int e() {
        return this.c.e.d().size() + 1;
    }

    @Override // org.telegram.ui.Components.a81
    public final int f(int i10) {
        if (i10 == 0) {
            return -2;
        }
        return ((TL_stars.TL_starGiftCollection) this.c.e.d().get(i10 - 1)).collection_id;
    }

    @Override // org.telegram.ui.Components.a81
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
            spannableStringBuilder2.setSpan(new z5(tL_starGiftCollection.icon, textPaint.getFontMetricsInt()), 0, 1, 33);
            spannableStringBuilder.insert(0, (CharSequence) spannableStringBuilder2);
        }
        return spannableStringBuilder;
    }

    @Override // org.telegram.ui.Components.a81
    public final int h(int i10) {
        return i10 == 0 ? 0 : 1;
    }
}
