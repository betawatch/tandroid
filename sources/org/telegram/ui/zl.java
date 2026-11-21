package org.telegram.ui;

import android.app.Activity;
import java.io.IOException;
import java.util.Locale;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zl implements org.telegram.ui.ActionBar.q1, h2.j {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ zl(a8.xa xaVar, x2.u uVar, x2.c0 c0Var, IOException iOException, boolean z10) {
        this.c = xaVar;
        this.d = uVar;
        this.e = c0Var;
        this.f = iOException;
        this.b = z10;
    }

    @Override // h2.j
    public void accept(Object obj) {
        a8.xa xaVar = (a8.xa) this.c;
        ((x2.k0) obj).r(xaVar.b, (x2.g0) xaVar.c, (x2.u) this.d, (x2.c0) this.e, (IOException) this.f, this.b);
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
                mm mmVar = (mm) obj4;
                TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                bn bnVar = mmVar.a;
                li.d dVar = new li.d(22, mmVar, (org.telegram.ui.Cells.r1) obj3);
                if (!((boolean[]) obj2)[0]) {
                    dVar.a(Boolean.FALSE);
                    break;
                } else if (!z10 && (contentsettings == null || !contentsettings.sensitive_can_change)) {
                    dVar.a(Boolean.TRUE);
                    break;
                } else {
                    Activity parentActivity = bnVar.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
                    ThemeActivity.H0(i10, parentActivity, new li.d(23, mmVar, dVar), bnVar.getResourceProvider());
                    break;
                }
            default:
                org.telegram.ui.Components.tb0 tb0Var = (org.telegram.ui.Components.tb0) obj4;
                org.telegram.ui.Components.tb0 tb0Var2 = (org.telegram.ui.Components.tb0) obj3;
                org.telegram.ui.Components.tb0 tb0Var3 = (org.telegram.ui.Components.tb0) obj2;
                ai.t1 t1Var2 = (ai.t1) obj;
                if (z10) {
                    org.telegram.ui.Components.c5.d(tb0Var, tb0Var2, tb0Var3);
                }
                int value = tb0Var3.getValue();
                int value2 = tb0Var2.getValue();
                int value3 = tb0Var.getValue();
                hk0 hk0Var = (hk0) t1Var2.c;
                int i12 = t1Var2.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) t1Var2.d;
                if (i12 == 8) {
                    int[] iArr = hk0Var.y;
                    iArr[0] = value;
                    iArr[1] = value2 + 1;
                    iArr[2] = value3;
                } else {
                    hk0Var.getClass();
                }
                editTextBoldCursor.setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(value3), Integer.valueOf(value2 + 1), Integer.valueOf(value)));
                break;
        }
    }

    public /* synthetic */ zl(mm mmVar, org.telegram.ui.Cells.r1 r1Var, boolean[] zArr, boolean z10, TL_account.contentSettings contentsettings) {
        this.c = mmVar;
        this.d = r1Var;
        this.e = zArr;
        this.b = z10;
        this.f = contentsettings;
    }

    public /* synthetic */ zl(boolean z10, org.telegram.ui.Components.tb0 tb0Var, org.telegram.ui.Components.tb0 tb0Var2, org.telegram.ui.Components.tb0 tb0Var3, ai.t1 t1Var) {
        this.b = z10;
        this.c = tb0Var;
        this.d = tb0Var2;
        this.e = tb0Var3;
        this.f = t1Var;
    }
}
