package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ua1 extends org.telegram.ui.Cells.ma {
    public final /* synthetic */ int f3 = 1;
    public final /* synthetic */ Object g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ua1(Context context, org.telegram.ui.ActionBar.o2 o2Var, ArrayList arrayList, ArrayList arrayList2, org.telegram.ui.ActionBar.a3 a3Var) {
        super(context, o2Var, 2, arrayList, arrayList2);
        this.g3 = a3Var;
    }

    @Override // org.telegram.ui.Cells.ma
    public final void A1() {
        switch (this.f3) {
            case 0:
                ((xa1) this.g3).e.z0(false);
                break;
            default:
                ((org.telegram.ui.ActionBar.a3) this.g3).a.dismissRunnable.run();
                break;
        }
    }

    @Override // org.telegram.ui.Cells.ma
    public void z1(org.telegram.ui.ActionBar.e6 e6Var) {
        CharSequence[] charSequenceArr;
        boolean z10;
        int[] iArr;
        switch (this.f3) {
            case 0:
                xa1 xa1Var = ((xa1) this.g3).e.a;
                ThemeActivity themeActivity = xa1Var.e;
                if (themeActivity.getParentActivity() != null) {
                    if ((e6Var.B == null || e6Var.Q) && themeActivity.f != 1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                        if (e6Var.b == null) {
                            charSequenceArr = new CharSequence[]{null, LocaleController.getString("ExportTheme", R.string.ExportTheme)};
                            iArr = new int[]{0, R.drawable.msg_shareout};
                            z10 = false;
                        } else {
                            TLRPC.TL_theme tL_theme = e6Var.B;
                            boolean z11 = tL_theme == null || !tL_theme.isDefault;
                            String string = LocaleController.getString("ShareFile", R.string.ShareFile);
                            String string2 = LocaleController.getString("ExportTheme", R.string.ExportTheme);
                            TLRPC.TL_theme tL_theme2 = e6Var.B;
                            String string3 = (tL_theme2 == null || (!tL_theme2.isDefault && tL_theme2.creator)) ? LocaleController.getString("Edit", R.string.Edit) : null;
                            TLRPC.TL_theme tL_theme3 = e6Var.B;
                            boolean z12 = z11;
                            charSequenceArr = new CharSequence[]{string, string2, string3, (tL_theme3 == null || !tL_theme3.creator) ? null : LocaleController.getString("ThemeSetUrl", R.string.ThemeSetUrl), z11 ? LocaleController.getString("Delete", R.string.Delete) : null};
                            z10 = z12;
                            iArr = new int[]{R.drawable.msg_share, R.drawable.msg_shareout, R.drawable.msg_edit, R.drawable.msg_link, R.drawable.msg_delete};
                        }
                        v vVar = new v(11, xa1Var, e6Var);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                        c2Var.L = charSequenceArr;
                        c2Var.M = iArr;
                        c2Var.I = vVar;
                        themeActivity.showDialog(c2Var);
                        if (z10) {
                            c2Var.l(c2Var.J0.size() - 1, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q7, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.p7, false));
                            break;
                        }
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ua1(xa1 xa1Var, Context context, org.telegram.ui.ActionBar.o2 o2Var, int i9, ArrayList arrayList, ArrayList arrayList2) {
        super(context, o2Var, i9, arrayList, arrayList2);
        this.g3 = xa1Var;
    }
}
