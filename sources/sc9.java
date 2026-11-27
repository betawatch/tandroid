// default package

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class sc9 extends a8c {
    public static final /* synthetic */ int b = 0;

    static {
        a8c.h(new sc9());
    }

    @Override // a8c
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        rc9 rc9Var;
        tc9 tc9Var = (tc9) view;
        TL_stars.StarGift starGift = (TL_stars.StarGift) b8cVar.H;
        String str = (String) b8cVar.m;
        boolean z2 = b8cVar.e;
        e29 e29Var = tc9Var.c;
        TLRPC.Document document = starGift.getDocument();
        if (document != null && ((rc9Var = tc9Var.b0) == null || tc9Var.a0 != document.id)) {
            tc9Var.a0 = document.id;
            if (rc9Var != null) {
                rc9Var.o(e29Var);
            }
            tc9Var.b0 = new rc9(3, tc9Var.W, document);
        }
        if (tc9Var.b0 != null && e29Var.isAttachedToWindow()) {
            tc9Var.b0.b(e29Var);
        }
        CharSequence charSequence = starGift.title;
        if (charSequence == null) {
            charSequence = "";
        }
        if (!TextUtils.isEmpty(str)) {
            charSequence = hl.u1(charSequence, str, tc9Var.P);
        }
        if (starGift.availability_resale > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            spannableStringBuilder.append((CharSequence) "  ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) ob6.E(starGift.availability_resale, ','));
            spannableStringBuilder.setSpan(new y7c(hl.o()), length, spannableStringBuilder.length(), 33);
            charSequence = spannableStringBuilder;
        }
        tc9Var.j(charSequence, 0, tc9Var.b0);
        tc9Var.setChecked(z2);
    }

    @Override // a8c
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        return new tc9(i, vnbVar, context);
    }
}
