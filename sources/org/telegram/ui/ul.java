package org.telegram.ui;

import android.app.Activity;
import java.io.IOException;
import java.util.Locale;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ul implements org.telegram.ui.ActionBar.p1, g2.k {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ul(b8.kg kgVar, w2.u uVar, w2.c0 c0Var, IOException iOException, boolean z10) {
        this.c = kgVar;
        this.d = uVar;
        this.e = c0Var;
        this.f = iOException;
        this.b = z10;
    }

    @Override // g2.k
    public void accept(Object obj) {
        b8.kg kgVar = (b8.kg) this.c;
        ((w2.k0) obj).j(kgVar.b, (w2.g0) kgVar.c, (w2.u) this.d, (w2.c0) this.e, (IOException) this.f, this.b);
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        int i10;
        int i11 = this.a;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        boolean z10 = this.b;
        switch (i11) {
            case 0:
                hm hmVar = (hm) obj4;
                TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                wm wmVar = hmVar.a;
                mi.f fVar = new mi.f(22, hmVar, (org.telegram.ui.Cells.q1) obj3);
                if (!((boolean[]) obj2)[0]) {
                    fVar.a(Boolean.FALSE);
                    break;
                } else if (!z10 && (contentsettings == null || !contentsettings.sensitive_can_change)) {
                    fVar.a(Boolean.TRUE);
                    break;
                } else {
                    Activity parentActivity = wmVar.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
                    ThemeActivity.H0(i10, parentActivity, new mi.f(23, hmVar, fVar), wmVar.getResourceProvider());
                    break;
                }
            default:
                org.telegram.ui.Components.cb0 cb0Var = (org.telegram.ui.Components.cb0) obj4;
                org.telegram.ui.Components.cb0 cb0Var2 = (org.telegram.ui.Components.cb0) obj3;
                org.telegram.ui.Components.cb0 cb0Var3 = (org.telegram.ui.Components.cb0) obj2;
                k2.y yVar = (k2.y) obj;
                if (z10) {
                    org.telegram.ui.Components.t4.d(cb0Var, cb0Var2, cb0Var3);
                }
                int value = cb0Var3.getValue();
                int value2 = cb0Var2.getValue();
                int value3 = cb0Var.getValue();
                yj0 yj0Var = (yj0) yVar.c;
                int i12 = yVar.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) yVar.d;
                if (i12 == 8) {
                    int[] iArr = yj0Var.y;
                    iArr[0] = value;
                    iArr[1] = value2 + 1;
                    iArr[2] = value3;
                } else {
                    yj0Var.getClass();
                }
                editTextBoldCursor.setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(value3), Integer.valueOf(value2 + 1), Integer.valueOf(value)));
                break;
        }
    }

    public /* synthetic */ ul(hm hmVar, org.telegram.ui.Cells.q1 q1Var, boolean[] zArr, boolean z10, TL_account.contentSettings contentsettings) {
        this.c = hmVar;
        this.d = q1Var;
        this.e = zArr;
        this.b = z10;
        this.f = contentsettings;
    }

    public /* synthetic */ ul(boolean z10, org.telegram.ui.Components.cb0 cb0Var, org.telegram.ui.Components.cb0 cb0Var2, org.telegram.ui.Components.cb0 cb0Var3, k2.y yVar) {
        this.b = z10;
        this.c = cb0Var;
        this.d = cb0Var2;
        this.e = cb0Var3;
        this.f = yVar;
    }
}
