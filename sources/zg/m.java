package zg;

import android.app.Activity;
import android.text.SpannableString;
import android.view.View;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.z5;
import org.telegram.ui.a71;
import yh.s5;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class m extends a71 {
    public boolean d2;
    public final /* synthetic */ o e2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(o oVar, o oVar2, Activity activity, d6 d6Var, int i10) {
        super(oVar2, activity, false, null, 6, false, d6Var, 16, i10);
        this.e2 = oVar;
        this.d2 = true;
        setDrawBackground(false);
    }

    @Override // org.telegram.ui.a71, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.d2) {
            this.d2 = false;
            this.e2.b.s(null);
        }
    }

    @Override // org.telegram.ui.a71
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        o oVar = this.e2;
        int i10 = oVar.M;
        ArrayList arrayList = oVar.I;
        LinkedHashMap linkedHashMap = oVar.H;
        if (linkedHashMap.containsKey(l4)) {
            arrayList.remove(l4);
            z5 z5Var = (z5) linkedHashMap.remove(l4);
            z5Var.setRemoved(new s5(5, this, z5Var));
            oVar.W(z5Var);
            oVar.b.x(l4, true);
            oVar.Y(false);
            return;
        }
        if (linkedHashMap.size() - (linkedHashMap.containsKey(-1L) ? 1 : 0) >= i10) {
            yc.a0(oVar).t(LocaleController.formatPluralString("ReactionMaxCountError", i10, new Object[0]), null).j();
            return;
        }
        try {
            int editTextSelectionEnd = oVar.h.getEditTextSelectionEnd();
            SpannableString spannableString = new SpannableString("b");
            z5 e7 = o0.e(document, l4, oVar.h.getFontMetricsInt());
            e7.cacheType = q5.g();
            e7.setAdded();
            arrayList.add(w7.q.b(editTextSelectionEnd, 0, arrayList.size()), l4);
            linkedHashMap.put(l4, e7);
            spannableString.setSpan(e7, 0, spannableString.length(), 33);
            oVar.h.getText().insert(editTextSelectionEnd, spannableString);
            oVar.h.setSelection(editTextSelectionEnd + spannableString.length());
            oVar.b.x(l4, true);
            oVar.Y(true);
            oVar.W(e7);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }
}
