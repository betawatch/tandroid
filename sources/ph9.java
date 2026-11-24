// default package

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public abstract class ph9 {
    public static EditTextBoldCursor a(Context context, ylb ylbVar, String str, String str2) {
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setTextSize(1, 18.0f);
        anb.X(editTextBoldCursor, cmb.i5, ylbVar);
        editTextBoldCursor.setHintText(str);
        anb.l(editTextBoldCursor, 34, cmb.G6, ylbVar);
        anb.l(editTextBoldCursor, 35, cmb.K6, ylbVar);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setFocusable(true);
        editTextBoldCursor.setTransformHintToHeaderOnFocus(false);
        editTextBoldCursor.setTransformHintToHeader(true);
        if (str2 == null) {
            str2 = "";
        }
        editTextBoldCursor.setText(str2);
        anb.F(editTextBoldCursor, cmb.j6, cmb.k6, cmb.o7, ylbVar);
        editTextBoldCursor.setImeOptions(5);
        editTextBoldCursor.setBackgroundDrawable(null);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        anb.C(editTextBoldCursor, cmb.kg, ylbVar);
        anb.l(editTextBoldCursor, 36, cmb.lg, ylbVar);
        return editTextBoldCursor;
    }

    public static bu5 b(bu5 bu5Var, d dVar, final bh9 bh9Var, final boolean z) {
        TL_iv.textButton textbutton;
        qh9 qh9Var = bh9Var.d;
        TL_keyboard.InlineButtonType inlineButtonType = (qh9Var == null || (textbutton = qh9Var.a) == null) ? null : textbutton.type;
        final byte b = 1;
        if (inlineButtonType == null) {
            final byte b2 = 0;
            bu5Var.b(R.drawable.media_link_24, jb6.M0(2131752163, null), new Runnable() { // from class: lh9
                @Override // java.lang.Runnable
                public final void run() {
                    byte b3 = b2;
                    boolean z2 = z;
                    bh9 bh9Var2 = bh9Var;
                    switch (b3) {
                        case 0:
                            ph9.i(bh9Var2, z2);
                            break;
                        default:
                            ph9.h(bh9Var2, z2);
                            break;
                    }
                }
            }, false);
            bu5Var.b(R.drawable.msg_copy, jb6.M0(2131751704, null), new Runnable() { // from class: lh9
                @Override // java.lang.Runnable
                public final void run() {
                    byte b3 = b;
                    boolean z2 = z;
                    bh9 bh9Var2 = bh9Var;
                    switch (b3) {
                        case 0:
                            ph9.i(bh9Var2, z2);
                            break;
                        default:
                            ph9.h(bh9Var2, z2);
                            break;
                    }
                }
            }, false);
            bu5Var.b(R.drawable.left_status_profile, jb6.M0(2131745732, null), new yl6((Object) dVar, (Object) bh9Var, z, (byte) 19), false);
            bu5Var.a0();
            return bu5Var;
        }
        if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl) {
            i(bh9Var, z);
            return null;
        }
        if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
            h(bh9Var, z);
            return null;
        }
        if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
            bh9Var.f.k3(true);
            k(dVar, z, new mh9(bh9Var, (byte) 2));
        }
        return null;
    }

    public static bu5 c(bu5 bu5Var, d dVar, final Context context, final ylb ylbVar, final zg9 zg9Var, final boolean z) {
        int i = zg9Var.b;
        TL_iv.pageBlockButtonRow d = zg9Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i < 0 || i >= d.buttons.size()) ? null : d.buttons.get(i);
        TL_keyboard.InlineButtonType inlineButtonType = pageButton == null ? null : pageButton.type;
        if (inlineButtonType == null) {
            final byte b = 0;
            bu5Var.b(R.drawable.media_link_24, jb6.M0(2131752163, null), new Runnable() { // from class: nh9
                @Override // java.lang.Runnable
                public final void run() {
                    byte b2 = b;
                    boolean z2 = z;
                    zg9 zg9Var2 = zg9Var;
                    ylb ylbVar2 = ylbVar;
                    Context context2 = context;
                    switch (b2) {
                        case 0:
                            ph9.e(context2, ylbVar2, zg9Var2, z2);
                            break;
                        default:
                            ph9.d(context2, ylbVar2, zg9Var2, z2);
                            break;
                    }
                }
            }, false);
            final byte b2 = 1;
            bu5Var.b(R.drawable.msg_copy, jb6.M0(2131751704, null), new Runnable() { // from class: nh9
                @Override // java.lang.Runnable
                public final void run() {
                    byte b22 = b2;
                    boolean z2 = z;
                    zg9 zg9Var2 = zg9Var;
                    ylb ylbVar2 = ylbVar;
                    Context context2 = context;
                    switch (b22) {
                        case 0:
                            ph9.e(context2, ylbVar2, zg9Var2, z2);
                            break;
                        default:
                            ph9.d(context2, ylbVar2, zg9Var2, z2);
                            break;
                    }
                }
            }, false);
            bu5Var.b(R.drawable.left_status_profile, jb6.M0(2131745732, null), new aa7(dVar, (Object) context, (Object) ylbVar, (Object) zg9Var, z, (byte) 17), false);
            bu5Var.a0();
            return bu5Var;
        }
        if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl) {
            e(context, ylbVar, zg9Var, z);
            return null;
        }
        if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
            d(context, ylbVar, zg9Var, z);
            return null;
        }
        if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
            f(dVar, context, ylbVar, zg9Var, z);
        }
        return null;
    }

    public static void d(Context context, ylb ylbVar, zg9 zg9Var, boolean z) {
        boolean c = zg9Var.c();
        int i = zg9Var.b;
        TL_iv.pageBlockButtonRow d = zg9Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i < 0 || i >= d.buttons.size()) ? null : d.buttons.get(i);
        TL_keyboard.InlineButtonType inlineButtonType = pageButton == null ? null : pageButton.type;
        g(context, ylbVar, zg9Var, z, jb6.M0(c ? 2131745735 : 2131745739, null), jb6.M0(2131745743, null), inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy ? ((TL_keyboard.TL_inlineButtonTypeCopy) inlineButtonType).copy_text : "", new kh9(zg9Var, (byte) 3));
    }

    public static void e(Context context, ylb ylbVar, zg9 zg9Var, boolean z) {
        boolean c = zg9Var.c();
        int i = zg9Var.b;
        TL_iv.pageBlockButtonRow d = zg9Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i < 0 || i >= d.buttons.size()) ? null : d.buttons.get(i);
        TL_keyboard.InlineButtonType inlineButtonType = pageButton == null ? null : pageButton.type;
        g(context, ylbVar, zg9Var, z, jb6.M0(c ? 2131745734 : 2131745738, null), jb6.M0(2131745741, null), inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl ? ((TL_keyboard.TL_inlineButtonTypeUrl) inlineButtonType).url : "http://", new kh9(zg9Var, (byte) 1));
    }

    public static void f(d dVar, Context context, ylb ylbVar, zg9 zg9Var, boolean z) {
        boolean c = zg9Var.c();
        byte b = 1;
        LinearLayout i = hg9.i(context, 1);
        int i2 = 0;
        i.setPadding(gm.L(24.0f), 0, gm.L(24.0f), 0);
        String M0 = jb6.M0(2131745742, null);
        int i3 = zg9Var.b;
        TL_iv.pageBlockButtonRow d = zg9Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i3 < 0 || i3 >= d.buttons.size()) ? null : d.buttons.get(i3);
        EditTextBoldCursor a = a(context, ylbVar, M0, pageButton == null ? "" : zk9.l(pageButton.text));
        i.addView(a, qoe.o(-1, 64));
        eb7 eb7Var = new eb7((Object) a, (Object) dVar, z, (Object) zg9Var, (byte) 10);
        AlertDialog$Builder alertDialog$Builder = z ? new AlertDialog$Builder(0, ylbVar, context) : new me(0, ylbVar, context);
        String M02 = jb6.M0(c ? 2131745733 : 2131745737, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M02;
        alertDialog$Builder.n(i);
        alertDialog$Builder.j(jb6.M0(2131747564, null), new wg(c, (Object) eb7Var, (Object) a, (Object) zg9Var, (byte) 7));
        if (c) {
            alertDialog$Builder.h(jb6.M0(2131745740, null), new yf9(eb7Var, b));
            String M03 = jb6.M0(2131751535, null);
            kh9 kh9Var = new kh9(zg9Var, (byte) 2);
            heVar.q0 = M03;
            heVar.r0 = kh9Var;
            alertDialog$Builder.g(jb6.M0(2131752542, null), null);
            heVar.K0 = true;
            i2 = -4;
        } else {
            alertDialog$Builder.g(jb6.M0(2131752542, null), null);
        }
        j(alertDialog$Builder, a, i2, ylbVar);
    }

    public static void g(Context context, ylb ylbVar, zg9 zg9Var, boolean z, String str, String str2, String str3, kh9 kh9Var) {
        LinearLayout i = hg9.i(context, 1);
        i.setPadding(gm.L(24.0f), 0, gm.L(24.0f), 0);
        String M0 = jb6.M0(2131745742, null);
        int i2 = zg9Var.b;
        TL_iv.pageBlockButtonRow d = zg9Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i2 < 0 || i2 >= d.buttons.size()) ? null : d.buttons.get(i2);
        EditTextBoldCursor a = a(context, ylbVar, M0, pageButton == null ? "" : zk9.l(pageButton.text));
        EditTextBoldCursor a2 = a(context, ylbVar, str2, str3);
        i.addView(a, qoe.o(-1, 64));
        i.addView(a2, qoe.o(-1, 64));
        AlertDialog$Builder alertDialog$Builder = z ? new AlertDialog$Builder(0, ylbVar, context) : new me(0, ylbVar, context);
        alertDialog$Builder.a.S = str;
        alertDialog$Builder.n(i);
        alertDialog$Builder.j(jb6.M0(2131747564, null), new wu2(a, a2, kh9Var));
        if (zg9Var.c()) {
            alertDialog$Builder.h(jb6.M0(2131751535, null), new kh9(zg9Var, (byte) 0));
            alertDialog$Builder.g(jb6.M0(2131752542, null), null);
        } else {
            alertDialog$Builder.g(jb6.M0(2131752542, null), null);
        }
        if (!TextUtils.isEmpty(a.getText())) {
            a = a2;
        }
        j(alertDialog$Builder, a, zg9Var.c() ? -3 : 0, ylbVar);
    }

    public static void h(bh9 bh9Var, boolean z) {
        TL_iv.textButton textbutton;
        qh9 qh9Var = bh9Var.d;
        TL_keyboard.InlineButtonType inlineButtonType = (qh9Var == null || (textbutton = qh9Var.a) == null) ? null : textbutton.type;
        boolean z2 = inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy;
        String l = z2 ? ((TL_keyboard.TL_inlineButtonTypeCopy) inlineButtonType).copy_text : zk9.l(bh9Var.e);
        bh9Var.f.k3(false);
        bh9Var.a.I(jb6.M0(z2 ? 2131745735 : 2131745739, null), jb6.M0(2131745743, null), l, false, !z, new mh9(bh9Var, (byte) 1));
    }

    public static void i(bh9 bh9Var, boolean z) {
        TL_iv.textButton textbutton;
        qh9 qh9Var = bh9Var.d;
        TL_keyboard.InlineButtonType inlineButtonType = (qh9Var == null || (textbutton = qh9Var.a) == null) ? null : textbutton.type;
        boolean z2 = inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl;
        String str = z2 ? ((TL_keyboard.TL_inlineButtonTypeUrl) inlineButtonType).url : "http://";
        bh9Var.f.k3(false);
        bh9Var.a.I(jb6.M0(z2 ? 2131745734 : 2131745738, null), jb6.M0(2131745741, null), str, true, !z, new mh9(bh9Var, (byte) 0));
    }

    public static void j(AlertDialog$Builder alertDialog$Builder, EditTextBoldCursor editTextBoldCursor, int i, ylb ylbVar) {
        he heVar = alertDialog$Builder.a;
        heVar.setOnShowListener(new he4(editTextBoldCursor, (byte) 1));
        heVar.q(250L);
        if (i == 0 || !(heVar.c(i) instanceof TextView)) {
            return;
        }
        anb.X((TextView) heVar.c(i), cmb.p7, ylbVar);
    }

    public static void k(d dVar, boolean z, oh9 oh9Var) {
        if (dVar == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("onlySelect", true);
        bundle.putBoolean("checkCanWrite", false);
        bundle.putInt("dialogsType", 4);
        nk3 nk3Var = new nk3(bundle);
        nk3Var.E2 = new yf9(oh9Var, (byte) 2);
        if (!z) {
            dVar.presentFragment(nk3Var);
            return;
        }
        bh0 bh0Var = new bh0();
        bh0Var.a = true;
        dVar.showAsSheet(nk3Var, bh0Var);
    }
}
