package org.telegram.ui;

import android.app.Activity;
import java.io.IOException;
import java.util.Locale;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class tm implements org.telegram.ui.ActionBar.u1, e2.j {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ tm(a5.a aVar, u2.u uVar, u2.c0 c0Var, IOException iOException, boolean z10) {
        this.c = aVar;
        this.d = uVar;
        this.e = c0Var;
        this.f = iOException;
        this.b = z10;
    }

    @Override // e2.j
    public void accept(Object obj) {
        a5.a aVar = (a5.a) this.c;
        ((u2.k0) obj).B(aVar.b, (u2.g0) aVar.c, (u2.u) this.d, (u2.c0) this.e, (IOException) this.f, this.b);
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        int i11;
        int i12 = this.a;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        boolean z10 = this.b;
        switch (i12) {
            case 0:
                fn fnVar = (fn) obj4;
                TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                un unVar = fnVar.a;
                ag.e0 e0Var = new ag.e0(25, fnVar, (org.telegram.ui.Cells.q1) obj3);
                if (!((boolean[]) obj2)[0]) {
                    e0Var.a(Boolean.FALSE);
                    break;
                } else if (!z10 && (contentsettings == null || !contentsettings.sensitive_can_change)) {
                    e0Var.a(Boolean.TRUE);
                    break;
                } else {
                    Activity parentActivity = unVar.getParentActivity();
                    i11 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
                    ThemeActivity.G0(i11, parentActivity, new ag.e0(26, fnVar, e0Var), unVar.getResourceProvider());
                    break;
                }
            default:
                org.telegram.ui.Components.ac0 ac0Var = (org.telegram.ui.Components.ac0) obj4;
                org.telegram.ui.Components.ac0 ac0Var2 = (org.telegram.ui.Components.ac0) obj3;
                org.telegram.ui.Components.ac0 ac0Var3 = (org.telegram.ui.Components.ac0) obj2;
                ag.b0 b0Var = (ag.b0) obj;
                if (z10) {
                    org.telegram.ui.Components.s4.d(ac0Var, ac0Var2, ac0Var3);
                }
                int value = ac0Var3.getValue();
                int value2 = ac0Var2.getValue();
                int value3 = ac0Var.getValue();
                ll0 ll0Var = (ll0) b0Var.c;
                int i13 = b0Var.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) b0Var.d;
                if (i13 == 8) {
                    int[] iArr = ll0Var.y;
                    iArr[0] = value;
                    iArr[1] = value2 + 1;
                    iArr[2] = value3;
                } else {
                    ll0Var.getClass();
                }
                editTextBoldCursor.setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(value3), Integer.valueOf(value2 + 1), Integer.valueOf(value)));
                break;
        }
    }

    public /* synthetic */ tm(fn fnVar, org.telegram.ui.Cells.q1 q1Var, boolean[] zArr, boolean z10, TL_account.contentSettings contentsettings) {
        this.c = fnVar;
        this.d = q1Var;
        this.e = zArr;
        this.b = z10;
        this.f = contentsettings;
    }

    public /* synthetic */ tm(boolean z10, org.telegram.ui.Components.ac0 ac0Var, org.telegram.ui.Components.ac0 ac0Var2, org.telegram.ui.Components.ac0 ac0Var3, ag.b0 b0Var) {
        this.b = z10;
        this.c = ac0Var;
        this.d = ac0Var2;
        this.e = ac0Var3;
        this.f = b0Var;
    }
}
