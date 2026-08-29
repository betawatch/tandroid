package sf;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.x3;
import org.telegram.ui.Components.hz;
import org.telegram.ui.i71;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class y implements TextWatcher {
    public final /* synthetic */ d0 a;

    public y(d0 d0Var) {
        this.a = d0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int currentTop;
        d0 d0Var = this.a;
        i71 i71Var = d0Var.s;
        hz hzVar = d0Var.A;
        a0 a0Var = d0Var.x;
        String obj = editable.toString();
        if (obj.isEmpty()) {
            if (i71Var.getAdapter() != a0Var) {
                currentTop = d0Var.getCurrentTop();
                hzVar.c();
                i71Var.setAdapter(a0Var);
                a0Var.l();
                if (currentTop > 0) {
                    d0Var.v.h1(0, -currentTop);
                }
            }
        } else if (hzVar != null) {
            hzVar.setText(LocaleController.getString(R.string.NoResult));
        }
        b0 b0Var = d0Var.y;
        if (b0Var != null) {
            d0 d0Var2 = b0Var.f;
            i71 i71Var2 = d0Var2.s;
            ArrayList arrayList = b0Var.d;
            arrayList.clear();
            b0Var.e = obj;
            String translitSafe = AndroidUtilities.translitSafe(obj);
            if (translitSafe.startsWith("/")) {
                translitSafe = translitSafe.substring(1);
            }
            ArrayList arrayList2 = s1.f(UserConfig.selectedAccount).b;
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                r1 r1Var = (r1) arrayList2.get(i10);
                if (!s1.g(r1Var.b)) {
                    String translitSafe2 = AndroidUtilities.translitSafe(r1Var.b);
                    if (translitSafe2.startsWith(translitSafe) || x3.w(" ", translitSafe, translitSafe2)) {
                        arrayList.add(r1Var);
                    }
                }
            }
            f2.p0 adapter = i71Var2.getAdapter();
            b0 b0Var2 = d0Var2.y;
            if (adapter != b0Var2) {
                i71Var2.setAdapter(b0Var2);
            }
            b0Var.l();
        }
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
