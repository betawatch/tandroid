// default package

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Cells.f;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.d0;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class pob extends f {
    public final /* synthetic */ byte r3 = 1;
    public final /* synthetic */ Object s3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pob(d0 d0Var, Context context, e eVar, int i, ArrayList arrayList, ArrayList arrayList2) {
        super(context, eVar, i, arrayList, arrayList2);
        this.s3 = d0Var;
    }

    @Override // org.telegram.ui.Cells.f
    public final void D1(znb znbVar) {
        CharSequence[] charSequenceArr;
        boolean z;
        int[] iArr;
        switch (this.r3) {
            case 0:
                d0 d0Var = ((d0) this.s3).e.a;
                ThemeActivity themeActivity = d0Var.e;
                if (themeActivity.getParentActivity() != null) {
                    if ((znbVar.G == null || znbVar.V) && themeActivity.f != 1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                        if (znbVar.b == null) {
                            charSequenceArr = new CharSequence[]{null, ob6.M0(2131750823, "ExportTheme")};
                            iArr = new int[]{0, R.drawable.msg_shareout};
                            z = false;
                        } else {
                            TLRPC.TL_theme tL_theme = znbVar.G;
                            boolean z2 = tL_theme == null || !tL_theme.isDefault;
                            String M0 = ob6.M0(2131745187, "ShareFile");
                            String M02 = ob6.M0(2131750823, "ExportTheme");
                            TLRPC.TL_theme tL_theme2 = znbVar.G;
                            String M03 = (tL_theme2 == null || (!tL_theme2.isDefault && tL_theme2.creator)) ? ob6.M0(2131751300, "Edit") : null;
                            TLRPC.TL_theme tL_theme3 = znbVar.G;
                            boolean z3 = z2;
                            charSequenceArr = new CharSequence[]{M0, M02, M03, (tL_theme3 == null || !tL_theme3.creator) ? null : ob6.M0(2131743798, "ThemeSetUrl"), z2 ? ob6.M0(2131751563, "Delete") : null};
                            z = z3;
                            iArr = new int[]{R.drawable.msg_share, R.drawable.msg_shareout, R.drawable.msg_edit, R.drawable.msg_link, R.drawable.msg_delete};
                        }
                        oh ohVar = new oh((Object) d0Var, (Object) znbVar, (byte) 14);
                        id idVar = alertDialog$Builder.a;
                        idVar.Q = charSequenceArr;
                        idVar.R = iArr;
                        idVar.N = ohVar;
                        themeActivity.showDialog(idVar);
                        if (z) {
                            idVar.l(idVar.O0.size() - 1, aob.w0(null, aob.q7, false), aob.w0(null, aob.p7, false));
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.Cells.f
    public final void E1() {
        byte b = this.r3;
        Object obj = this.s3;
        switch (b) {
            case 0:
                ((d0) obj).e.F0(false);
                break;
            default:
                ((nx0) ((z8d) obj).b).y0.run();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pob(Context context, e eVar, ArrayList arrayList, ArrayList arrayList2, z8d z8dVar) {
        super(context, eVar, 2, arrayList, arrayList2);
        this.s3 = z8dVar;
    }
}
