package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class s31 extends org.telegram.ui.Components.rl0 {
    public final Context c;
    public final boolean d;
    public final /* synthetic */ t31 e;

    public s31(t31 t31Var, Context context, boolean z4) {
        this.e = t31Var;
        this.c = context;
        this.d = z4;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.m1 m1Var) {
        return m1Var.f == 0;
    }

    @Override // f2.p0
    public final int h() {
        boolean z4 = this.d;
        t31 t31Var = this.e;
        if (!z4) {
            return t31Var.h.size() + (t31Var.e >= 0 ? 1 : 0);
        }
        ArrayList arrayList = t31Var.f;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // f2.p0
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
    @Override // f2.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.m1 m1Var, int i10) {
        boolean z4;
        int i11 = m1Var.f;
        View view = m1Var.a;
        if (i11 != 0) {
            if (i11 != 1) {
                return;
            }
            return;
        }
        org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
        boolean z10 = this.d;
        t31 t31Var = this.e;
        TranslateController.Language language = null;
        if (!z10) {
            int i12 = t31Var.e;
            if (i12 >= 0 && i10 > i12) {
                i10--;
            }
            if (i10 >= 0 && i10 < t31Var.h.size()) {
                language = (TranslateController.Language) t31Var.h.get(i10);
            }
            z4 = false;
        } else if (i10 >= 0 && i10 < t31Var.f.size()) {
            language = (TranslateController.Language) t31Var.f.get(i10);
        }
        if (language == null) {
            return;
        }
        String str = language.ownDisplayName;
        if (str == null) {
            str = language.displayName;
        }
        t8Var.b(str, language.displayName, false, !z4);
        t8Var.setChecked(t31Var.r.contains(language.code));
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        View view;
        Context context = this.c;
        if (i10 == 0) {
            view = new org.telegram.ui.Cells.t8(context);
        } else if (i10 != 2) {
            view = new org.telegram.ui.Cells.z6(context, (b) null);
        } else {
            org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context);
            m4Var.setText(LocaleController.getString(R.string.ChooseLanguages));
            view = m4Var;
        }
        return new org.telegram.ui.Components.el0(view);
    }
}
