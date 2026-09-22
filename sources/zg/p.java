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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.y5;
import org.telegram.ui.j71;
import yh.s5;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class p extends j71 {
    public boolean d2;
    public final /* synthetic */ q e2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, q qVar2, Activity activity, f6 f6Var, int i10) {
        super(qVar2, activity, false, null, 6, false, f6Var, 16, i10);
        this.e2 = qVar;
        this.d2 = true;
        setDrawBackground(false);
    }

    @Override // org.telegram.ui.j71, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.d2) {
            this.d2 = false;
            this.e2.b.s(null);
        }
    }

    @Override // org.telegram.ui.j71
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        q qVar = this.e2;
        int i10 = qVar.J;
        ArrayList arrayList = qVar.F;
        LinkedHashMap linkedHashMap = qVar.E;
        if (linkedHashMap.containsKey(l4)) {
            arrayList.remove(l4);
            y5 y5Var = (y5) linkedHashMap.remove(l4);
            y5Var.setRemoved(new s5(5, this, y5Var));
            qVar.W(y5Var);
            qVar.b.x(l4, true);
            qVar.Y(false);
            return;
        }
        if (linkedHashMap.size() - (linkedHashMap.containsKey(-1L) ? 1 : 0) >= i10) {
            xc.a0(qVar).t(LocaleController.formatPluralString("ReactionMaxCountError", i10, new Object[0]), null).j();
            return;
        }
        try {
            int editTextSelectionEnd = qVar.n.getEditTextSelectionEnd();
            SpannableString spannableString = new SpannableString("b");
            y5 e = r0.e(document, l4, qVar.n.getFontMetricsInt());
            e.cacheType = p5.g();
            e.setAdded();
            arrayList.add(w7.q.b(editTextSelectionEnd, 0, arrayList.size()), l4);
            linkedHashMap.put(l4, e);
            spannableString.setSpan(e, 0, spannableString.length(), 33);
            qVar.n.getText().insert(editTextSelectionEnd, spannableString);
            qVar.n.setSelection(editTextSelectionEnd + spannableString.length());
            qVar.b.x(l4, true);
            qVar.Y(true);
            qVar.W(e);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }
}
