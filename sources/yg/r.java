package yg;

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
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.y5;
import org.telegram.ui.l71;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class r extends l71 {
    public boolean d2;
    public final /* synthetic */ s e2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar, s sVar2, Activity activity, f6 f6Var, int i10) {
        super(sVar2, activity, false, null, 6, false, f6Var, 16, i10);
        this.e2 = sVar;
        this.d2 = true;
        setDrawBackground(false);
    }

    @Override // org.telegram.ui.l71, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.d2) {
            this.d2 = false;
            this.e2.b.s(null);
        }
    }

    @Override // org.telegram.ui.l71
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        s sVar = this.e2;
        int i10 = sVar.J;
        ArrayList arrayList = sVar.F;
        LinkedHashMap linkedHashMap = sVar.E;
        if (linkedHashMap.containsKey(l4)) {
            arrayList.remove(l4);
            y5 y5Var = (y5) linkedHashMap.remove(l4);
            y5Var.setRemoved(new q(0, this, y5Var));
            sVar.W(y5Var);
            sVar.b.x(l4, true);
            sVar.Y(false);
            return;
        }
        if (linkedHashMap.size() - (linkedHashMap.containsKey(-1L) ? 1 : 0) >= i10) {
            wc.a0(sVar).t(LocaleController.formatPluralString("ReactionMaxCountError", i10, new Object[0]), null).j();
            return;
        }
        try {
            int editTextSelectionEnd = sVar.n.getEditTextSelectionEnd();
            SpannableString spannableString = new SpannableString("b");
            y5 e = r0.e(document, l4, sVar.n.getFontMetricsInt());
            e.cacheType = p5.g();
            e.setAdded();
            arrayList.add(w7.q.b(editTextSelectionEnd, 0, arrayList.size()), l4);
            linkedHashMap.put(l4, e);
            spannableString.setSpan(e, 0, spannableString.length(), 33);
            sVar.n.getText().insert(editTextSelectionEnd, spannableString);
            sVar.n.setSelection(editTextSelectionEnd + spannableString.length());
            sVar.b.x(l4, true);
            sVar.Y(true);
            sVar.W(e);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }
}
