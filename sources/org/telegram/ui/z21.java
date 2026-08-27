package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class z21 extends org.telegram.ui.Components.yk0 {
    public final Context c;
    public final boolean d;
    public final /* synthetic */ a31 e;

    public z21(a31 a31Var, Context context, boolean z10) {
        this.e = a31Var;
        this.c = context;
        this.d = z10;
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(f2.o1 o1Var) {
        return o1Var.f == 0;
    }

    @Override // f2.q0
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

    @Override // f2.q0
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
    @Override // f2.q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.o1 o1Var, int i10) {
        boolean z10;
        int i11 = o1Var.f;
        View view = o1Var.a;
        if (i11 != 0) {
            if (i11 != 1) {
                return;
            }
            return;
        }
        org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
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
        q8Var.b(str, language.displayName, false, !z10);
        q8Var.setChecked(a31Var.r.contains(language.code));
    }

    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View view;
        Context context = this.c;
        if (i10 == 0) {
            view = new org.telegram.ui.Cells.q8(context);
        } else if (i10 != 2) {
            view = new org.telegram.ui.Cells.w6(context, (org.telegram.messenger.rl) null);
        } else {
            org.telegram.ui.Cells.j4 j4Var = new org.telegram.ui.Cells.j4(context);
            j4Var.setText(LocaleController.getString(R.string.ChooseLanguages));
            view = j4Var;
        }
        return new org.telegram.ui.Components.lk0(view);
    }
}
