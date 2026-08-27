package qf;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.y1;
import org.telegram.ui.Components.az;
import org.telegram.ui.a60;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
        a60 a60Var = e0Var.s;
        az azVar = e0Var.A;
        b0 b0Var = e0Var.x;
        String obj = editable.toString();
        if (obj.isEmpty()) {
            if (a60Var.getAdapter() != b0Var) {
                currentTop = e0Var.getCurrentTop();
                azVar.c();
                a60Var.setAdapter(b0Var);
                b0Var.l();
                if (currentTop > 0) {
                    e0Var.v.h1(0, -currentTop);
                }
            }
        } else if (azVar != null) {
            azVar.setText(LocaleController.getString(R.string.NoResult));
        }
        c0 c0Var = e0Var.y;
        if (c0Var != null) {
            e0 e0Var2 = c0Var.f;
            a60 a60Var2 = e0Var2.s;
            ArrayList arrayList = c0Var.d;
            arrayList.clear();
            c0Var.e = obj;
            String translitSafe = AndroidUtilities.translitSafe(obj);
            if (translitSafe.startsWith("/")) {
                translitSafe = translitSafe.substring(1);
            }
            ArrayList arrayList2 = q1.f(UserConfig.selectedAccount).b;
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                p1 p1Var = (p1) arrayList2.get(i10);
                if (!q1.g(p1Var.b)) {
                    String translitSafe2 = AndroidUtilities.translitSafe(p1Var.b);
                    if (translitSafe2.startsWith(translitSafe) || y1.x(" ", translitSafe, translitSafe2)) {
                        arrayList.add(p1Var);
                    }
                }
            }
            f2.q0 adapter = a60Var2.getAdapter();
            c0 c0Var2 = e0Var2.y;
            if (adapter != c0Var2) {
                a60Var2.setAdapter(c0Var2);
            }
            c0Var.l();
        }
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
