package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class t51 extends org.telegram.ui.Cells.ga {
    public final /* synthetic */ int r3 = 1;
    public final /* synthetic */ Object s3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t51(Context context, org.telegram.ui.ActionBar.d2 d2Var, ArrayList arrayList, ArrayList arrayList2, hi.d dVar) {
        super(context, d2Var, 2, arrayList, arrayList2);
        this.s3 = dVar;
    }

    @Override // org.telegram.ui.Cells.ga
    public void C1(org.telegram.ui.ActionBar.j6 j6Var) {
        char c2;
        String str;
        int[] iArr;
        boolean z10;
        CharSequence[] charSequenceArr;
        switch (this.r3) {
            case 0:
                v51 v51Var = ((v51) this.s3).e.a;
                ThemeActivity themeActivity = v51Var.e;
                if (themeActivity.getParentActivity() != null) {
                    if ((j6Var.G == null || j6Var.V) && themeActivity.f != 1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                        if (j6Var.b == null) {
                            charSequenceArr = new CharSequence[]{null, org.telegram.messenger.bd.M0(2131750859, "ExportTheme")};
                            iArr = new int[]{0, R.drawable.msg_shareout};
                            z10 = false;
                        } else {
                            TLRPC.TL_theme tL_theme = j6Var.G;
                            boolean z11 = tL_theme == null || !tL_theme.isDefault;
                            String M0 = org.telegram.messenger.bd.M0(2131745469, "ShareFile");
                            String M02 = org.telegram.messenger.bd.M0(2131750859, "ExportTheme");
                            TLRPC.TL_theme tL_theme2 = j6Var.G;
                            String M03 = (tL_theme2 == null || (!tL_theme2.isDefault && tL_theme2.creator)) ? org.telegram.messenger.bd.M0(2131751336, "Edit") : null;
                            TLRPC.TL_theme tL_theme3 = j6Var.G;
                            String M04 = (tL_theme3 == null || !tL_theme3.creator) ? null : org.telegram.messenger.bd.M0(2131744155, "ThemeSetUrl");
                            if (z11) {
                                c2 = 1;
                                str = org.telegram.messenger.bd.M0(2131751599, "Delete");
                            } else {
                                c2 = 1;
                                str = null;
                            }
                            CharSequence[] charSequenceArr2 = new CharSequence[5];
                            charSequenceArr2[0] = M0;
                            charSequenceArr2[c2] = M02;
                            charSequenceArr2[2] = M03;
                            charSequenceArr2[3] = M04;
                            charSequenceArr2[4] = str;
                            int[] iArr2 = new int[5];
                            iArr2[0] = R.drawable.msg_share;
                            iArr2[c2] = R.drawable.msg_shareout;
                            iArr2[2] = R.drawable.msg_edit;
                            iArr2[3] = R.drawable.msg_link;
                            iArr2[4] = R.drawable.msg_delete;
                            iArr = iArr2;
                            z10 = z11;
                            charSequenceArr = charSequenceArr2;
                        }
                        u uVar = new u(12, v51Var, j6Var);
                        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                        s1Var.Q = charSequenceArr;
                        s1Var.R = iArr;
                        s1Var.N = uVar;
                        themeActivity.showDialog(s1Var);
                        if (z10) {
                            s1Var.m(s1Var.Q0.size() - 1, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.q7, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.p7, false));
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.Cells.ga
    public final void D1() {
        switch (this.r3) {
            case 0:
                ((v51) this.s3).e.F0(false);
                break;
            default:
                ((org.telegram.ui.ActionBar.t2) ((hi.d) this.s3).b).y0.run();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t51(v51 v51Var, Context context, org.telegram.ui.ActionBar.d2 d2Var, int i3, ArrayList arrayList, ArrayList arrayList2) {
        super(context, d2Var, i3, arrayList, arrayList2);
        this.s3 = v51Var;
    }
}
