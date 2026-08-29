package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class va1 extends org.telegram.ui.Cells.ja {
    public final /* synthetic */ int f3 = 1;
    public final /* synthetic */ Object g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public va1(Context context, org.telegram.ui.ActionBar.o2 o2Var, ArrayList arrayList, ArrayList arrayList2, org.telegram.ui.ActionBar.a3 a3Var) {
        super(context, o2Var, 2, arrayList, arrayList2);
        this.g3 = a3Var;
    }

    @Override // org.telegram.ui.Cells.ja
    public final void A1() {
        Runnable runnable;
        switch (this.f3) {
            case 0:
                ((ya1) this.g3).e.A0(false);
                break;
            default:
                runnable = ((org.telegram.ui.ActionBar.a3) this.g3).a.dismissRunnable;
                runnable.run();
                break;
        }
    }

    @Override // org.telegram.ui.Cells.ja
    public void z1(org.telegram.ui.ActionBar.f6 f6Var) {
        CharSequence[] charSequenceArr;
        boolean z10;
        int[] iArr;
        switch (this.f3) {
            case 0:
                ya1 ya1Var = ((ya1) this.g3).e.a;
                ThemeActivity themeActivity = ya1Var.e;
                if (themeActivity.getParentActivity() != null) {
                    if ((f6Var.B == null || f6Var.Q) && themeActivity.f != 1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                        if (f6Var.b == null) {
                            charSequenceArr = new CharSequence[]{null, LocaleController.getString("ExportTheme", R.string.ExportTheme)};
                            iArr = new int[]{0, R.drawable.msg_shareout};
                            z10 = false;
                        } else {
                            TLRPC.TL_theme tL_theme = f6Var.B;
                            boolean z11 = tL_theme == null || !tL_theme.isDefault;
                            String string = LocaleController.getString("ShareFile", R.string.ShareFile);
                            String string2 = LocaleController.getString("ExportTheme", R.string.ExportTheme);
                            TLRPC.TL_theme tL_theme2 = f6Var.B;
                            String string3 = (tL_theme2 == null || (!tL_theme2.isDefault && tL_theme2.creator)) ? LocaleController.getString("Edit", R.string.Edit) : null;
                            TLRPC.TL_theme tL_theme3 = f6Var.B;
                            boolean z12 = z11;
                            charSequenceArr = new CharSequence[]{string, string2, string3, (tL_theme3 == null || !tL_theme3.creator) ? null : LocaleController.getString("ThemeSetUrl", R.string.ThemeSetUrl), z11 ? LocaleController.getString("Delete", R.string.Delete) : null};
                            z10 = z12;
                            iArr = new int[]{R.drawable.msg_share, R.drawable.msg_shareout, R.drawable.msg_edit, R.drawable.msg_link, R.drawable.msg_delete};
                        }
                        ag.y1 y1Var = new ag.y1(12, ya1Var, f6Var);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                        c2Var.L = charSequenceArr;
                        c2Var.M = iArr;
                        c2Var.I = y1Var;
                        themeActivity.showDialog(c2Var);
                        if (z10) {
                            c2Var.l(c2Var.J0.size() - 1, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q7, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.p7, false));
                            break;
                        }
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public va1(ya1 ya1Var, Context context, org.telegram.ui.ActionBar.o2 o2Var, int i10, ArrayList arrayList, ArrayList arrayList2) {
        super(context, o2Var, i10, arrayList, arrayList2);
        this.g3 = ya1Var;
    }
}
