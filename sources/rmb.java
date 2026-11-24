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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class rmb extends f {
    public final /* synthetic */ byte r3 = 1;
    public final /* synthetic */ Object s3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rmb(d0 d0Var, Context context, d dVar, int i, ArrayList arrayList, ArrayList arrayList2) {
        super(context, dVar, i, arrayList, arrayList2);
        this.s3 = d0Var;
    }

    @Override // org.telegram.ui.Cells.f
    public final void C1(bmb bmbVar) {
        CharSequence[] charSequenceArr;
        boolean z;
        int[] iArr;
        switch (this.r3) {
            case 0:
                d0 d0Var = ((d0) this.s3).e.a;
                ThemeActivity themeActivity = d0Var.e;
                if (themeActivity.getParentActivity() != null) {
                    if ((bmbVar.G == null || bmbVar.V) && themeActivity.f != 1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                        if (bmbVar.b == null) {
                            charSequenceArr = new CharSequence[]{null, jb6.M0(2131750795, "ExportTheme")};
                            iArr = new int[]{0, R.drawable.msg_shareout};
                            z = false;
                        } else {
                            TLRPC.TL_theme tL_theme = bmbVar.G;
                            boolean z2 = tL_theme == null || !tL_theme.isDefault;
                            String M0 = jb6.M0(2131745193, "ShareFile");
                            String M02 = jb6.M0(2131750795, "ExportTheme");
                            TLRPC.TL_theme tL_theme2 = bmbVar.G;
                            String M03 = (tL_theme2 == null || (!tL_theme2.isDefault && tL_theme2.creator)) ? jb6.M0(2131751272, "Edit") : null;
                            TLRPC.TL_theme tL_theme3 = bmbVar.G;
                            boolean z3 = z2;
                            charSequenceArr = new CharSequence[]{M0, M02, M03, (tL_theme3 == null || !tL_theme3.creator) ? null : jb6.M0(2131743830, "ThemeSetUrl"), z2 ? jb6.M0(2131751535, "Delete") : null};
                            z = z3;
                            iArr = new int[]{R.drawable.msg_share, R.drawable.msg_shareout, R.drawable.msg_edit, R.drawable.msg_link, R.drawable.msg_delete};
                        }
                        ff ffVar = new ff((Object) d0Var, (Object) bmbVar, (byte) 14);
                        he heVar = alertDialog$Builder.a;
                        heVar.Q = charSequenceArr;
                        heVar.R = iArr;
                        heVar.N = ffVar;
                        themeActivity.showDialog(heVar);
                        if (z) {
                            heVar.l(heVar.O0.size() - 1, cmb.w0(null, cmb.p7, false), cmb.w0(null, cmb.o7, false));
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
                ((d0) obj).e.F0(false);
                break;
            default:
                ((my0) ((k6d) obj).b).y0.run();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rmb(Context context, d dVar, ArrayList arrayList, ArrayList arrayList2, k6d k6dVar) {
        super(context, dVar, 2, arrayList, arrayList2);
        this.s3 = k6dVar;
    }
}
