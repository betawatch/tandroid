package org.telegram.ui;

import android.app.Activity;
import java.io.IOException;
import java.util.Locale;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yl implements org.telegram.ui.ActionBar.r1, h2.j {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ yl(a8.wa waVar, x2.u uVar, x2.c0 c0Var, IOException iOException, boolean z9) {
        this.c = waVar;
        this.d = uVar;
        this.e = c0Var;
        this.f = iOException;
        this.b = z9;
    }

    @Override // h2.j
    public void accept(Object obj) {
        a8.wa waVar = (a8.wa) this.c;
        ((x2.k0) obj).r(waVar.b, (x2.g0) waVar.c, (x2.u) this.d, (x2.c0) this.e, (IOException) this.f, this.b);
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        int i10;
        int i11 = this.a;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        boolean z9 = this.b;
        switch (i11) {
            case 0:
                lm lmVar = (lm) obj4;
                TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                an anVar = lmVar.a;
                org.telegram.messenger.voip.k kVar = new org.telegram.messenger.voip.k(18, lmVar, (org.telegram.ui.Cells.q1) obj3);
                if (!((boolean[]) obj2)[0]) {
                    kVar.a(Boolean.FALSE);
                    break;
                } else if (!z9 && (contentsettings == null || !contentsettings.sensitive_can_change)) {
                    kVar.a(Boolean.TRUE);
                    break;
                } else {
                    Activity parentActivity = anVar.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.f2) anVar).currentAccount;
                    ThemeActivity.H0(i10, parentActivity, new org.telegram.messenger.voip.k(19, lmVar, kVar), anVar.getResourceProvider());
                    break;
                }
            default:
                org.telegram.ui.Components.hb0 hb0Var = (org.telegram.ui.Components.hb0) obj4;
                org.telegram.ui.Components.hb0 hb0Var2 = (org.telegram.ui.Components.hb0) obj3;
                org.telegram.ui.Components.hb0 hb0Var3 = (org.telegram.ui.Components.hb0) obj2;
                jg.a2 a2Var = (jg.a2) obj;
                if (z9) {
                    org.telegram.ui.Components.v4.d(hb0Var, hb0Var2, hb0Var3);
                }
                int value = hb0Var3.getValue();
                int value2 = hb0Var2.getValue();
                int value3 = hb0Var.getValue();
                bk0 bk0Var = (bk0) a2Var.c;
                int i12 = a2Var.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) a2Var.d;
                if (i12 == 8) {
                    int[] iArr = bk0Var.y;
                    iArr[0] = value;
                    iArr[1] = value2 + 1;
                    iArr[2] = value3;
                } else {
                    bk0Var.getClass();
                }
                editTextBoldCursor.setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(value3), Integer.valueOf(value2 + 1), Integer.valueOf(value)));
                break;
        }
    }

    public /* synthetic */ yl(lm lmVar, org.telegram.ui.Cells.q1 q1Var, boolean[] zArr, boolean z9, TL_account.contentSettings contentsettings) {
        this.c = lmVar;
        this.d = q1Var;
        this.e = zArr;
        this.b = z9;
        this.f = contentsettings;
    }

    public /* synthetic */ yl(boolean z9, org.telegram.ui.Components.hb0 hb0Var, org.telegram.ui.Components.hb0 hb0Var2, org.telegram.ui.Components.hb0 hb0Var3, jg.a2 a2Var) {
        this.b = z9;
        this.c = hb0Var;
        this.d = hb0Var2;
        this.e = hb0Var3;
        this.f = a2Var;
    }
}
