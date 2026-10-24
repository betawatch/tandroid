package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class wa1 extends org.telegram.ui.Cells.na {
    public final /* synthetic */ int k3 = 1;
    public final /* synthetic */ Object l3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wa1(Context context, org.telegram.ui.ActionBar.o2 o2Var, ArrayList arrayList, ArrayList arrayList2, org.telegram.ui.ActionBar.b3 b3Var) {
        super(context, o2Var, 2, arrayList, arrayList2);
        this.l3 = b3Var;
    }

    @Override // org.telegram.ui.Cells.na
    public void F1(org.telegram.ui.ActionBar.j6 j6Var) {
        CharSequence[] charSequenceArr;
        boolean z10;
        int[] iArr;
        switch (this.k3) {
            case 0:
                za1 za1Var = ((za1) this.l3).e.a;
                ThemeActivity themeActivity = za1Var.e;
                if (themeActivity.getParentActivity() != null) {
                    if ((j6Var.F == null || j6Var.U) && themeActivity.f != 1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                        if (j6Var.b == null) {
                            charSequenceArr = new CharSequence[]{null, LocaleController.getString("ExportTheme", R.string.ExportTheme)};
                            iArr = new int[]{0, R.drawable.msg_shareout};
                            z10 = false;
                        } else {
                            TLRPC.TL_theme tL_theme = j6Var.F;
                            boolean z11 = tL_theme == null || !tL_theme.isDefault;
                            String string = LocaleController.getString("ShareFile", R.string.ShareFile);
                            String string2 = LocaleController.getString("ExportTheme", R.string.ExportTheme);
                            TLRPC.TL_theme tL_theme2 = j6Var.F;
                            String string3 = (tL_theme2 == null || (!tL_theme2.isDefault && tL_theme2.creator)) ? LocaleController.getString("Edit", R.string.Edit) : null;
                            TLRPC.TL_theme tL_theme3 = j6Var.F;
                            boolean z12 = z11;
                            charSequenceArr = new CharSequence[]{string, string2, string3, (tL_theme3 == null || !tL_theme3.creator) ? null : LocaleController.getString("ThemeSetUrl", R.string.ThemeSetUrl), z11 ? LocaleController.getString("Delete", R.string.Delete) : null};
                            z10 = z12;
                            iArr = new int[]{R.drawable.msg_share, R.drawable.msg_shareout, R.drawable.msg_edit, R.drawable.msg_link, R.drawable.msg_delete};
                        }
                        mg.j jVar = new mg.j(13, za1Var, j6Var);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                        c2Var.P = charSequenceArr;
                        c2Var.Q = iArr;
                        c2Var.M = jVar;
                        themeActivity.showDialog(c2Var);
                        if (z10) {
                            c2Var.m(c2Var.P0.size() - 1, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.q7, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.p7, false));
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.Cells.na
    public final void G1() {
        Runnable runnable;
        switch (this.k3) {
            case 0:
                ((za1) this.l3).e.A0(false);
                break;
            default:
                runnable = ((org.telegram.ui.ActionBar.b3) this.l3).a.dismissRunnable;
                runnable.run();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wa1(za1 za1Var, Context context, org.telegram.ui.ActionBar.o2 o2Var, int i10, ArrayList arrayList, ArrayList arrayList2) {
        super(context, o2Var, i10, arrayList, arrayList2);
        this.l3 = za1Var;
    }
}
