package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class z21 extends org.telegram.ui.Components.mm0 {
    public final Context c;
    public final boolean d;
    public final /* synthetic */ a31 e;

    public z21(a31 a31Var, Context context, boolean z10) {
        this.e = a31Var;
        this.c = context;
        this.d = z10;
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean D(s4.e1 e1Var) {
        return e1Var.f == 0;
    }

    @Override // s4.h0
    public final int h() {
        boolean z10 = this.d;
        a31 a31Var = this.e;
        if (!z10) {
            return a31Var.h.size() + (a31Var.e >= 0 ? 1 : 0);
        }
        ArrayList arrayList = a31Var.f;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // s4.h0
    public final int j(int i10) {
        return (!this.d && i10 == this.e.e) ? 1 : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        if (r8 == (r3.f.size() - 1)) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0057, code lost:
    
        if (r8 == (r3.h.size() - 1)) goto L16;
     */
    @Override // s4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.e1 e1Var, int i10) {
        boolean z10;
        int i11 = e1Var.f;
        View view = e1Var.a;
        if (i11 != 0) {
            if (i11 != 1) {
                return;
            }
            return;
        }
        org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
        boolean z11 = this.d;
        a31 a31Var = this.e;
        TranslateController.Language language = null;
        if (!z11) {
            int i12 = a31Var.e;
            if (i12 >= 0 && i10 > i12) {
                i10--;
            }
            if (i10 >= 0 && i10 < a31Var.h.size()) {
                language = (TranslateController.Language) a31Var.h.get(i10);
            }
            z10 = false;
        } else if (i10 >= 0 && i10 < a31Var.f.size()) {
            language = (TranslateController.Language) a31Var.f.get(i10);
        }
        if (language == null) {
            return;
        }
        String str = language.ownDisplayName;
        if (str == null) {
            str = language.displayName;
        }
        b9Var.b(str, language.displayName, false, !z10);
        b9Var.setChecked(a31Var.r.contains(language.code));
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View view;
        Context context = this.c;
        if (i10 == 0) {
            view = new org.telegram.ui.Cells.b9(context);
        } else if (i10 != 2) {
            view = new org.telegram.ui.Cells.f7(context, (d3) null);
        } else {
            org.telegram.ui.Cells.q4 q4Var = new org.telegram.ui.Cells.q4(context);
            q4Var.setText(LocaleController.getString(R.string.ChooseLanguages));
            view = q4Var;
        }
        return new org.telegram.ui.Components.wl0(view);
    }
}
