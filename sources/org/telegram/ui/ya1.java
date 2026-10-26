package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ya1 extends org.telegram.ui.Cells.ra {
    public final /* synthetic */ int r3 = 1;
    public final /* synthetic */ Object s3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ya1(Context context, org.telegram.ui.ActionBar.r2 r2Var, ArrayList arrayList, ArrayList arrayList2, org.telegram.ui.ActionBar.e3 e3Var) {
        super(context, r2Var, 2, arrayList, arrayList2);
        this.s3 = e3Var;
    }

    @Override // org.telegram.ui.Cells.ra
    public void F1(org.telegram.ui.ActionBar.x6 x6Var) {
        CharSequence[] charSequenceArr;
        boolean z10;
        int[] iArr;
        switch (this.r3) {
            case 0:
                bb1 bb1Var = ((bb1) this.s3).e.a;
                ThemeActivity themeActivity = bb1Var.e;
                if (themeActivity.getParentActivity() != null) {
                    if ((x6Var.F == null || x6Var.U) && themeActivity.f != 1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                        if (x6Var.b == null) {
                            charSequenceArr = new CharSequence[]{null, LocaleController.getString("ExportTheme", R.string.ExportTheme)};
                            iArr = new int[]{0, R.drawable.msg_shareout};
                            z10 = false;
                        } else {
                            TLRPC.TL_theme tL_theme = x6Var.F;
                            boolean z11 = tL_theme == null || !tL_theme.isDefault;
                            String string = LocaleController.getString("ShareFile", R.string.ShareFile);
                            String string2 = LocaleController.getString("ExportTheme", R.string.ExportTheme);
                            TLRPC.TL_theme tL_theme2 = x6Var.F;
                            String string3 = (tL_theme2 == null || (!tL_theme2.isDefault && tL_theme2.creator)) ? LocaleController.getString("Edit", R.string.Edit) : null;
                            TLRPC.TL_theme tL_theme3 = x6Var.F;
                            boolean z12 = z11;
                            charSequenceArr = new CharSequence[]{string, string2, string3, (tL_theme3 == null || !tL_theme3.creator) ? null : LocaleController.getString("ThemeSetUrl", R.string.ThemeSetUrl), z11 ? LocaleController.getString("Delete", R.string.Delete) : null};
                            z10 = z12;
                            iArr = new int[]{R.drawable.msg_share, R.drawable.msg_shareout, R.drawable.msg_edit, R.drawable.msg_link, R.drawable.msg_delete};
                        }
                        ng.j jVar = new ng.j(13, bb1Var, x6Var);
                        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
                        e2Var.P = charSequenceArr;
                        e2Var.Q = iArr;
                        e2Var.M = jVar;
                        themeActivity.showDialog(e2Var);
                        if (z10) {
                            e2Var.m(e2Var.P0.size() - 1, org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.q7, false), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.p7, false));
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.Cells.ra
    public final void G1() {
        Runnable runnable;
        switch (this.r3) {
            case 0:
                ((bb1) this.s3).e.B0(false);
                break;
            default:
                runnable = ((org.telegram.ui.ActionBar.e3) this.s3).a.dismissRunnable;
                runnable.run();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ya1(bb1 bb1Var, Context context, org.telegram.ui.ActionBar.r2 r2Var, int i10, ArrayList arrayList, ArrayList arrayList2) {
        super(context, r2Var, i10, arrayList, arrayList2);
        this.s3 = bb1Var;
    }
}
