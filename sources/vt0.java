// default package

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ShapeDrawable;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public abstract class vt0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, int i, long j, long j2, TL_bots.BotVerifierSettings botVerifierSettings, qt0 qt0Var) {
        String str;
        TLRPC.Chat chat;
        if (j2 >= 0) {
            TLRPC.User X1 = uc7.s1(i).X1(Long.valueOf(j2));
            str = lbc.l(X1);
            chat = X1;
        } else {
            TLRPC.Chat M0 = uc7.s1(i).M0(Long.valueOf(-j2));
            if (M0 == null) {
                str = "";
                chat = M0;
            } else {
                str = M0.title;
                chat = M0;
            }
        }
        FrameLayout frameLayout = new FrameLayout(activity);
        FrameLayout frameLayout2 = new FrameLayout(activity);
        int L = hl.L(28.0f);
        int L2 = hl.L(28.0f);
        int i2 = aob.Ti;
        ShapeDrawable c0 = aob.c0(L, L2, aob.w0(null, i2, false));
        uob M = yob.M(i2);
        frameLayout2.setBackground(c0);
        yob.j(frameLayout2, c0, M, null, null);
        de0 de0Var = new de0(activity);
        de0Var.setRoundRadius(hl.L(28.0f));
        rb0 rb0Var = new rb0((vnb) null);
        rb0Var.k(chat);
        de0Var.f(chat, rb0Var);
        frameLayout2.addView(de0Var, tre.e(28, 28, 51));
        de0 de0Var2 = new de0(activity);
        de0Var2.setEmojiColorFilter(new PorterDuffColorFilter(aob.w0(null, aob.z9, false), PorterDuff.Mode.SRC_IN));
        de0Var2.setAnimatedEmojiDrawable(wl.m(i, botVerifierSettings.icon, null, 3));
        frameLayout2.addView(de0Var2, tre.d(20, 20.0f, 19, 34.0f, 0.0f, 0.0f, 0.0f));
        ema emaVar = new ema(activity);
        yob.W(emaVar, aob.j5, null);
        emaVar.setTextSize(13);
        emaVar.setEllipsizeByGradient(true);
        emaVar.l(str, false);
        emaVar.setWidthWrapContent(true);
        frameLayout2.addView(emaVar, tre.d(-2, -2.0f, 19, 57.0f, 0.0f, 10.0f, 0.0f));
        frameLayout.addView(frameLayout2, tre.d(-2, -2.0f, 17, 16.0f, 0.0f, 16.0f, 0.0f));
        boolean[] zArr = new boolean[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        String M02 = ob6.M0(2131752978, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M02;
        idVar.U = ob6.M0(j2 >= 0 ? 2131752979 : 2131752980, null);
        alertDialog$Builder.n(frameLayout);
        alertDialog$Builder.g(ob6.M0(2131752570, null), null);
        alertDialog$Builder.j(ob6.M0(2131746048, null), new tt0(zArr, i, j, j2, qt0Var));
        alertDialog$Builder.c(-1);
        alertDialog$Builder.o();
    }
}
