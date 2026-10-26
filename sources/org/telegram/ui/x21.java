package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class x21 extends org.telegram.ui.Components.lm0 {
    public final Context c;
    public final boolean d;
    public final /* synthetic */ y21 e;

    public x21(y21 y21Var, Context context, boolean z10) {
        this.e = y21Var;
        this.c = context;
        this.d = z10;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.e1 e1Var) {
        return e1Var.f == 0;
    }

    @Override // s4.h0
    public final int h() {
        boolean z10 = this.d;
        y21 y21Var = this.e;
        if (!z10) {
            return y21Var.h.size() + (y21Var.e >= 0 ? 1 : 0);
        }
        ArrayList arrayList = y21Var.f;
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
        y21 y21Var = this.e;
        TranslateController.Language language = null;
        if (!z11) {
            int i12 = y21Var.e;
            if (i12 >= 0 && i10 > i12) {
                i10--;
            }
            if (i10 >= 0 && i10 < y21Var.h.size()) {
                language = (TranslateController.Language) y21Var.h.get(i10);
            }
            z10 = false;
        } else if (i10 >= 0 && i10 < y21Var.f.size()) {
            language = (TranslateController.Language) y21Var.f.get(i10);
        }
        if (language == null) {
            return;
        }
        String str = language.ownDisplayName;
        if (str == null) {
            str = language.displayName;
        }
        b9Var.b(str, language.displayName, false, !z10);
        b9Var.setChecked(y21Var.r.contains(language.code));
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
        return new org.telegram.ui.Components.vl0(view);
    }
}
