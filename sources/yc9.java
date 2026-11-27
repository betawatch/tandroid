// default package

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class yc9 extends a8c {
    public static final /* synthetic */ int b = 0;

    static {
        a8c.h(new yc9());
    }

    @Override // a8c
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        zc9 zc9Var = (zc9) view;
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) b8cVar.H;
        int i = b8cVar.A;
        String str = (String) b8cVar.m;
        boolean z2 = b8cVar.e;
        e29 e29Var = zc9Var.c;
        xc9 xc9Var = zc9Var.b0;
        if (xc9Var == null || zc9Var.a0 != stargiftattributemodel.document.id) {
            zc9Var.a0 = stargiftattributemodel.document.id;
            if (xc9Var != null) {
                xc9Var.o(e29Var);
            }
            zc9Var.b0 = new xc9(3, zc9Var.W, stargiftattributemodel.document);
        }
        if (e29Var.isAttachedToWindow()) {
            zc9Var.b0.b(e29Var);
        }
        CharSequence charSequence = stargiftattributemodel.name;
        if (!TextUtils.isEmpty(str)) {
            charSequence = hl.u1(charSequence, str, zc9Var.P);
        }
        if (i > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            spannableStringBuilder.append((CharSequence) "  ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) Integer.toString(i));
            spannableStringBuilder.setSpan(new y7c(hl.o()), length, spannableStringBuilder.length(), 33);
            charSequence = spannableStringBuilder;
        }
        zc9Var.j(charSequence, 0, zc9Var.b0);
        zc9Var.setChecked(z2);
    }

    @Override // a8c
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        return new zc9(i, vnbVar, context);
    }
}
