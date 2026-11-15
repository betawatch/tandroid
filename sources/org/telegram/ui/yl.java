package org.telegram.ui;

import android.app.Activity;
import java.io.IOException;
import java.util.Locale;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class yl implements org.telegram.ui.ActionBar.q1, h2.j {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ yl(a8.xa xaVar, x2.t tVar, x2.b0 b0Var, IOException iOException, boolean z10) {
        this.c = xaVar;
        this.d = tVar;
        this.e = b0Var;
        this.f = iOException;
        this.b = z10;
    }

    @Override // h2.j
    public void accept(Object obj) {
        a8.xa xaVar = (a8.xa) this.c;
        ((x2.j0) obj).r(xaVar.b, (x2.f0) xaVar.c, (x2.t) this.d, (x2.b0) this.e, (IOException) this.f, this.b);
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        int i10;
        int i11 = this.a;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        boolean z10 = this.b;
        switch (i11) {
            case 0:
                lm lmVar = (lm) obj4;
                TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                an anVar = lmVar.a;
                li.v vVar = new li.v(23, lmVar, (org.telegram.ui.Cells.q1) obj3);
                if (!((boolean[]) obj2)[0]) {
                    vVar.a(Boolean.FALSE);
                    break;
                } else if (!z10 && (contentsettings == null || !contentsettings.sensitive_can_change)) {
                    vVar.a(Boolean.TRUE);
                    break;
                } else {
                    Activity parentActivity = anVar.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
                    ThemeActivity.H0(i10, parentActivity, new li.v(24, lmVar, vVar), anVar.getResourceProvider());
                    break;
                }
            default:
                org.telegram.ui.Components.ib0 ib0Var = (org.telegram.ui.Components.ib0) obj4;
                org.telegram.ui.Components.ib0 ib0Var2 = (org.telegram.ui.Components.ib0) obj3;
                org.telegram.ui.Components.ib0 ib0Var3 = (org.telegram.ui.Components.ib0) obj2;
                ai.r1 r1Var = (ai.r1) obj;
                if (z10) {
                    org.telegram.ui.Components.t4.d(ib0Var, ib0Var2, ib0Var3);
                }
                int value = ib0Var3.getValue();
                int value2 = ib0Var2.getValue();
                int value3 = ib0Var.getValue();
                ek0 ek0Var = (ek0) r1Var.c;
                int i12 = r1Var.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) r1Var.d;
                if (i12 == 8) {
                    int[] iArr = ek0Var.y;
                    iArr[0] = value;
                    iArr[1] = value2 + 1;
                    iArr[2] = value3;
                } else {
                    ek0Var.getClass();
                }
                editTextBoldCursor.setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(value3), Integer.valueOf(value2 + 1), Integer.valueOf(value)));
                break;
        }
    }

    public /* synthetic */ yl(lm lmVar, org.telegram.ui.Cells.q1 q1Var, boolean[] zArr, boolean z10, TL_account.contentSettings contentsettings) {
        this.c = lmVar;
        this.d = q1Var;
        this.e = zArr;
        this.b = z10;
        this.f = contentsettings;
    }

    public /* synthetic */ yl(boolean z10, org.telegram.ui.Components.ib0 ib0Var, org.telegram.ui.Components.ib0 ib0Var2, org.telegram.ui.Components.ib0 ib0Var3, ai.r1 r1Var) {
        this.b = z10;
        this.c = ib0Var;
        this.d = ib0Var2;
        this.e = ib0Var3;
        this.f = r1Var;
    }
}
