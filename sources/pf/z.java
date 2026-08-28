package pf;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.yy;
import org.telegram.ui.w50;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class z implements TextWatcher {
    public final /* synthetic */ e0 a;

    public z(e0 e0Var) {
        this.a = e0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int currentTop;
        e0 e0Var = this.a;
        w50 w50Var = e0Var.s;
        yy yyVar = e0Var.A;
        b0 b0Var = e0Var.x;
        String obj = editable.toString();
        if (obj.isEmpty()) {
            if (w50Var.getAdapter() != b0Var) {
                currentTop = e0Var.getCurrentTop();
                yyVar.c();
                w50Var.setAdapter(b0Var);
                b0Var.l();
                if (currentTop > 0) {
                    e0Var.v.h1(0, -currentTop);
                }
            }
        } else if (yyVar != null) {
            yyVar.setText(LocaleController.getString(R.string.NoResult));
        }
        c0 c0Var = e0Var.y;
        if (c0Var != null) {
            e0 e0Var2 = c0Var.f;
            w50 w50Var2 = e0Var2.s;
            ArrayList arrayList = c0Var.d;
            arrayList.clear();
            c0Var.e = obj;
            String translitSafe = AndroidUtilities.translitSafe(obj);
            if (translitSafe.startsWith("/")) {
                translitSafe = translitSafe.substring(1);
            }
            ArrayList arrayList2 = r1.f(UserConfig.selectedAccount).b;
            for (int i9 = 0; i9 < arrayList2.size(); i9++) {
                q1 q1Var = (q1) arrayList2.get(i9);
                if (!r1.g(q1Var.b)) {
                    String translitSafe2 = AndroidUtilities.translitSafe(q1Var.b);
                    if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.l0.w(" ", translitSafe, translitSafe2)) {
                        arrayList.add(q1Var);
                    }
                }
            }
            f2.r0 adapter = w50Var2.getAdapter();
            c0 c0Var2 = e0Var2.y;
            if (adapter != c0Var2) {
                w50Var2.setAdapter(c0Var2);
            }
            c0Var.l();
        }
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }
}
