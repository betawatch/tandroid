// default package

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Cells.f;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.d0;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class qkb extends f {
    public final /* synthetic */ byte r3 = 1;
    public final /* synthetic */ Object s3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qkb(d0 d0Var, Context context, d dVar, int i, ArrayList arrayList, ArrayList arrayList2) {
        super(context, dVar, i, arrayList, arrayList2);
        this.s3 = d0Var;
    }

    @Override // org.telegram.ui.Cells.f
    public final void C1(akb akbVar) {
        CharSequence[] charSequenceArr;
        boolean z;
        int[] iArr;
        switch (this.r3) {
            case 0:
                d0 d0Var = ((d0) this.s3).e.a;
                ThemeActivity themeActivity = d0Var.e;
                if (themeActivity.getParentActivity() != null) {
                    if ((akbVar.G == null || akbVar.V) && themeActivity.f != 1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                        if (akbVar.b == null) {
                            charSequenceArr = new CharSequence[]{null, k96.M0(2131750846, "ExportTheme")};
                            iArr = new int[]{0, R.drawable.msg_shareout};
                            z = false;
                        } else {
                            TLRPC.TL_theme tL_theme = akbVar.G;
                            boolean z2 = tL_theme == null || !tL_theme.isDefault;
                            String M0 = k96.M0(2131745267, "ShareFile");
                            String M02 = k96.M0(2131750846, "ExportTheme");
                            TLRPC.TL_theme tL_theme2 = akbVar.G;
                            String M03 = (tL_theme2 == null || (!tL_theme2.isDefault && tL_theme2.creator)) ? k96.M0(2131751323, "Edit") : null;
                            TLRPC.TL_theme tL_theme3 = akbVar.G;
                            boolean z3 = z2;
                            charSequenceArr = new CharSequence[]{M0, M02, M03, (tL_theme3 == null || !tL_theme3.creator) ? null : k96.M0(2131743904, "ThemeSetUrl"), z2 ? k96.M0(2131751586, "Delete") : null};
                            z = z3;
                            iArr = new int[]{R.drawable.msg_share, R.drawable.msg_shareout, R.drawable.msg_edit, R.drawable.msg_link, R.drawable.msg_delete};
                        }
                        fe feVar = new fe((Object) d0Var, (Object) akbVar, (byte) 14);
                        hd hdVar = alertDialog$Builder.a;
                        hdVar.Q = charSequenceArr;
                        hdVar.R = iArr;
                        hdVar.N = feVar;
                        themeActivity.showDialog(hdVar);
                        if (z) {
                            hdVar.l(hdVar.O0.size() - 1, bkb.w0(null, bkb.p7, false), bkb.w0(null, bkb.o7, false));
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.Cells.f
    public final void D1() {
        byte b = this.r3;
        Object obj = this.s3;
        switch (b) {
            case 0:
                ((d0) obj).e.E0(false);
                break;
            default:
                ((fx0) ((i4d) obj).a).y0.run();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qkb(Context context, d dVar, ArrayList arrayList, ArrayList arrayList2, i4d i4dVar) {
        super(context, dVar, 2, arrayList, arrayList2);
        this.s3 = i4dVar;
    }
}
