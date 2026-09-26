package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class vb1 extends org.telegram.ui.Cells.pa {
    public final /* synthetic */ int j3 = 1;
    public final /* synthetic */ Object k3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vb1(Context context, org.telegram.ui.ActionBar.m2 m2Var, ArrayList arrayList, ArrayList arrayList2, org.telegram.ui.ActionBar.z2 z2Var) {
        super(context, m2Var, 2, arrayList, arrayList2);
        this.k3 = z2Var;
    }

    @Override // org.telegram.ui.Cells.pa
    public final void A1() {
        Runnable runnable;
        switch (this.j3) {
            case 0:
                ((yb1) this.k3).e.A0(false);
                break;
            default:
                runnable = ((org.telegram.ui.ActionBar.z2) this.k3).a.dismissRunnable;
                runnable.run();
                break;
        }
    }

    @Override // org.telegram.ui.Cells.pa
    public void z1(org.telegram.ui.ActionBar.g6 g6Var) {
        CharSequence[] charSequenceArr;
        boolean z10;
        int[] iArr;
        switch (this.j3) {
            case 0:
                yb1 yb1Var = ((yb1) this.k3).e.a;
                ThemeActivity themeActivity = yb1Var.e;
                if (themeActivity.getParentActivity() != null) {
                    if ((g6Var.F == null || g6Var.U) && themeActivity.f != 1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                        if (g6Var.b == null) {
                            charSequenceArr = new CharSequence[]{null, LocaleController.getString("ExportTheme", R.string.ExportTheme)};
                            iArr = new int[]{0, R.drawable.msg_shareout};
                            z10 = false;
                        } else {
                            TLRPC.TL_theme tL_theme = g6Var.F;
                            boolean z11 = tL_theme == null || !tL_theme.isDefault;
                            String string = LocaleController.getString("ShareFile", R.string.ShareFile);
                            String string2 = LocaleController.getString("ExportTheme", R.string.ExportTheme);
                            TLRPC.TL_theme tL_theme2 = g6Var.F;
                            String string3 = (tL_theme2 == null || (!tL_theme2.isDefault && tL_theme2.creator)) ? LocaleController.getString("Edit", R.string.Edit) : null;
                            TLRPC.TL_theme tL_theme3 = g6Var.F;
                            boolean z12 = z11;
                            charSequenceArr = new CharSequence[]{string, string2, string3, (tL_theme3 == null || !tL_theme3.creator) ? null : LocaleController.getString("ThemeSetUrl", R.string.ThemeSetUrl), z11 ? LocaleController.getString("Delete", R.string.Delete) : null};
                            z10 = z12;
                            iArr = new int[]{R.drawable.msg_share, R.drawable.msg_shareout, R.drawable.msg_edit, R.drawable.msg_link, R.drawable.msg_delete};
                        }
                        lg.j jVar = new lg.j(13, yb1Var, g6Var);
                        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
                        a2Var.P = charSequenceArr;
                        a2Var.Q = iArr;
                        a2Var.M = jVar;
                        themeActivity.showDialog(a2Var);
                        if (z10) {
                            a2Var.l(a2Var.N0.size() - 1, org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.q7, false), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.p7, false));
                            break;
                        }
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vb1(yb1 yb1Var, Context context, org.telegram.ui.ActionBar.m2 m2Var, int i10, ArrayList arrayList, ArrayList arrayList2) {
        super(context, m2Var, i10, arrayList, arrayList2);
        this.k3 = yb1Var;
    }
}
