package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class v71 extends org.telegram.ui.Cells.ga {
    public final /* synthetic */ int q3 = 1;
    public final /* synthetic */ Object r3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v71(Context context, org.telegram.ui.ActionBar.k2 k2Var, ArrayList arrayList, ArrayList arrayList2, l2.f fVar) {
        super(context, k2Var, 2, arrayList, arrayList2);
        this.r3 = fVar;
    }

    @Override // org.telegram.ui.Cells.ga
    public void C1(org.telegram.ui.ActionBar.s6 s6Var) {
        char c10;
        String str;
        int[] iArr;
        boolean z10;
        CharSequence[] charSequenceArr;
        switch (this.q3) {
            case 0:
                x71 x71Var = ((x71) this.r3).e.a;
                ThemeActivity themeActivity = x71Var.e;
                if (themeActivity.getParentActivity() != null) {
                    if ((s6Var.F == null || s6Var.U) && themeActivity.f != 1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                        if (s6Var.b == null) {
                            charSequenceArr = new CharSequence[]{null, org.telegram.messenger.cd.L0(2131750859, "ExportTheme")};
                            iArr = new int[]{0, R.drawable.msg_shareout};
                            z10 = false;
                        } else {
                            TLRPC.TL_theme tL_theme = s6Var.F;
                            boolean z11 = tL_theme == null || !tL_theme.isDefault;
                            String L0 = org.telegram.messenger.cd.L0(2131745477, "ShareFile");
                            String L02 = org.telegram.messenger.cd.L0(2131750859, "ExportTheme");
                            TLRPC.TL_theme tL_theme2 = s6Var.F;
                            String L03 = (tL_theme2 == null || (!tL_theme2.isDefault && tL_theme2.creator)) ? org.telegram.messenger.cd.L0(2131751336, "Edit") : null;
                            TLRPC.TL_theme tL_theme3 = s6Var.F;
                            String L04 = (tL_theme3 == null || !tL_theme3.creator) ? null : org.telegram.messenger.cd.L0(2131744170, "ThemeSetUrl");
                            if (z11) {
                                c10 = 1;
                                str = org.telegram.messenger.cd.L0(2131751599, "Delete");
                            } else {
                                c10 = 1;
                                str = null;
                            }
                            CharSequence[] charSequenceArr2 = new CharSequence[5];
                            charSequenceArr2[0] = L0;
                            charSequenceArr2[c10] = L02;
                            charSequenceArr2[2] = L03;
                            charSequenceArr2[3] = L04;
                            charSequenceArr2[4] = str;
                            int[] iArr2 = new int[5];
                            iArr2[0] = R.drawable.msg_share;
                            iArr2[c10] = R.drawable.msg_shareout;
                            iArr2[2] = R.drawable.msg_edit;
                            iArr2[3] = R.drawable.msg_link;
                            iArr2[4] = R.drawable.msg_delete;
                            iArr = iArr2;
                            z10 = z11;
                            charSequenceArr = charSequenceArr2;
                        }
                        eg.j jVar = new eg.j(14, x71Var, s6Var);
                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                        x1Var.P = charSequenceArr;
                        x1Var.Q = iArr;
                        x1Var.M = jVar;
                        themeActivity.showDialog(x1Var);
                        if (z10) {
                            x1Var.m(x1Var.P0.size() - 1, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.q7, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.p7, false));
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.Cells.ga
    public final void D1() {
        switch (this.q3) {
            case 0:
                ((x71) this.r3).e.E0(false);
                break;
            default:
                ((org.telegram.ui.ActionBar.z2) ((l2.f) this.r3).b).x0.run();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v71(x71 x71Var, Context context, org.telegram.ui.ActionBar.k2 k2Var, int i10, ArrayList arrayList, ArrayList arrayList2) {
        super(context, k2Var, i10, arrayList, arrayList2);
        this.r3 = x71Var;
    }
}
