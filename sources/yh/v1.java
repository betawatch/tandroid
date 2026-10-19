package yh;

import ai.v9;
import ai.y9;
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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.a6;
import org.telegram.ui.Components.js0;
import org.telegram.ui.Components.v81;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class v1 extends v81 {
    public final /* synthetic */ int a;
    public final /* synthetic */ d6 b;
    public final /* synthetic */ js0 c;

    public v1(js0 js0Var, int i10, d6 d6Var) {
        this.c = js0Var;
        this.a = i10;
        this.b = d6Var;
    }

    @Override // org.telegram.ui.Components.v81
    public final void a(ArrayList arrayList) {
        js0 js0Var = this.c;
        q1 q1Var = js0Var.N;
        v9 v9Var = js0Var.e;
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
        v9Var.getClass();
        HashMap hashMap = new HashMap();
        ArrayList arrayList3 = v9Var.e;
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
        v9Var.j();
        l2 currentPage = js0Var.getCurrentPage();
        if (currentPage != null) {
            int f7 = currentPage.d ? v9Var.f(currentPage.e.d) + 1 : 0;
            js0Var.n.e(0.0f, f7, f7);
        }
        AndroidUtilities.cancelRunOnUIThread(q1Var);
        AndroidUtilities.runOnUIThread(q1Var, 1000L);
    }

    @Override // org.telegram.ui.Components.v81
    public final void b(View view, int i10, int i11) {
        y9 y9Var;
        boolean z10;
        js0 js0Var = this.c;
        v9 v9Var = js0Var.e;
        l2 l2Var = (l2) view;
        if (i11 == 0) {
            y9Var = js0Var.d;
            z10 = false;
        } else {
            int i12 = i10 - 1;
            if (i12 < 0) {
                v9Var.getClass();
            } else if (i12 < v9Var.d().size()) {
                y9Var = v9Var.e(((TL_stars.TL_starGiftCollection) v9Var.d().get(i12)).collection_id);
                z10 = true;
            }
            y9Var = null;
            z10 = true;
        }
        l2Var.d = z10;
        l2Var.e = y9Var;
        if (y9Var != null) {
            y9Var.a();
        }
        l2Var.f(false);
        LinearLayout linearLayout = l2Var.E;
        if (linearLayout != null) {
            linearLayout.setVisibility(l2Var.a.e.h() ? 0 : 8);
        }
        l2Var.setVisibleHeight(js0Var.Q);
        l2Var.setHasTabs(!v9Var.d().isEmpty());
    }

    @Override // org.telegram.ui.Components.v81
    public final boolean c(int i10) {
        return i10 != 0;
    }

    @Override // org.telegram.ui.Components.v81
    public final View d(int i10) {
        if (i10 == -1) {
            return null;
        }
        return new l2(this.c, this.a, this.b);
    }

    @Override // org.telegram.ui.Components.v81
    public final int e() {
        return this.c.e.d().size() + 1;
    }

    @Override // org.telegram.ui.Components.v81
    public final int f(int i10) {
        if (i10 == 0) {
            return -2;
        }
        return ((TL_stars.TL_starGiftCollection) this.c.e.d().get(i10 - 1)).collection_id;
    }

    @Override // org.telegram.ui.Components.v81
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
            spannableStringBuilder2.setSpan(new a6(tL_starGiftCollection.icon, textPaint.getFontMetricsInt()), 0, 1, 33);
            spannableStringBuilder.insert(0, (CharSequence) spannableStringBuilder2);
        }
        return spannableStringBuilder;
    }

    @Override // org.telegram.ui.Components.v81
    public final int h(int i10) {
        return i10 == 0 ? 0 : 1;
    }
}
