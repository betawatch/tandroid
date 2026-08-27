package rh;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import h7.z5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.iq0;
import org.telegram.ui.gy;
import org.telegram.ui.op0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public abstract class b4 {
    public static EditTextBoldCursor a(Context context, c6 c6Var, String str, String str2) {
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setTextColor(g6.v0(g6.j5, c6Var));
        editTextBoldCursor.setHintText(str);
        editTextBoldCursor.setHintColor(g6.v0(g6.H6, c6Var));
        editTextBoldCursor.setHeaderHintColor(g6.v0(g6.L6, c6Var));
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setFocusable(true);
        editTextBoldCursor.setTransformHintToHeaderOnFocus(false);
        editTextBoldCursor.setTransformHintToHeader(true);
        if (str2 == null) {
            str2 = "";
        }
        editTextBoldCursor.setText(str2);
        editTextBoldCursor.setLineColors(g6.v0(g6.k6, c6Var), g6.v0(g6.l6, c6Var), g6.v0(g6.p7, c6Var));
        editTextBoldCursor.setImeOptions(5);
        editTextBoldCursor.setBackgroundDrawable(null);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setHighlightColor(g6.v0(g6.uf, c6Var));
        editTextBoldCursor.setHandlesColor(g6.v0(g6.vf, c6Var));
        return editTextBoldCursor;
    }

    public static b70 b(b70 b70Var, org.telegram.ui.ActionBar.n2 n2Var, final o3 o3Var, final boolean z10) {
        TL_iv.textButton textbutton;
        c4 c4Var = o3Var.d;
        TL_keyboard.InlineButtonType inlineButtonType = (c4Var == null || (textbutton = c4Var.a) == null) ? null : textbutton.type;
        if (inlineButtonType == null) {
            final int i10 = 0;
            b70Var.c(R.drawable.media_link_24, LocaleController.getString(R.string.ChatLink), new Runnable() { // from class: rh.x3
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            b4.i(o3Var, z10);
                            break;
                        default:
                            b4.h(o3Var, z10);
                            break;
                    }
                }
            }, false);
            final int i11 = 1;
            b70Var.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new Runnable() { // from class: rh.x3
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            b4.i(o3Var, z10);
                            break;
                        default:
                            b4.h(o3Var, z10);
                            break;
                    }
                }
            }, false);
            b70Var.c(R.drawable.left_status_profile, LocaleController.getString(R.string.RichEditorUserProfile), new op0(n2Var, o3Var, z10, 14), false);
            b70Var.Z();
            return b70Var;
        }
        if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl) {
            i(o3Var, z10);
        } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
            h(o3Var, z10);
        } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
            o3Var.f.o3(true);
            k(n2Var, z10, new y3(o3Var, 2));
        }
        return null;
    }

    public static b70 c(b70 b70Var, org.telegram.ui.ActionBar.n2 n2Var, final Context context, final c6 c6Var, final m3 m3Var, final boolean z10) {
        int i10 = m3Var.b;
        TL_iv.pageBlockButtonRow d = m3Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i10 < 0 || i10 >= d.buttons.size()) ? null : d.buttons.get(i10);
        TL_keyboard.InlineButtonType inlineButtonType = pageButton == null ? null : pageButton.type;
        if (inlineButtonType != null) {
            if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl) {
                e(context, c6Var, m3Var, z10);
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
                d(context, c6Var, m3Var, z10);
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
                f(n2Var, context, c6Var, m3Var, z10);
            }
            return null;
        }
        final int i11 = 0;
        b70Var.c(R.drawable.media_link_24, LocaleController.getString(R.string.ChatLink), new Runnable() { // from class: rh.z3
            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        b4.e(context, c6Var, m3Var, z10);
                        break;
                    default:
                        b4.d(context, c6Var, m3Var, z10);
                        break;
                }
            }
        }, false);
        final int i12 = 1;
        b70Var.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new Runnable() { // from class: rh.z3
            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        b4.e(context, c6Var, m3Var, z10);
                        break;
                    default:
                        b4.d(context, c6Var, m3Var, z10);
                        break;
                }
            }
        }, false);
        b70Var.c(R.drawable.left_status_profile, LocaleController.getString(R.string.RichEditorUserProfile), new cg.j(n2Var, (Object) context, (Object) c6Var, (Object) m3Var, z10, 23), false);
        b70Var.Z();
        return b70Var;
    }

    public static void d(Context context, c6 c6Var, m3 m3Var, boolean z10) {
        boolean c10 = m3Var.c();
        int i10 = m3Var.b;
        TL_iv.pageBlockButtonRow d = m3Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i10 < 0 || i10 >= d.buttons.size()) ? null : d.buttons.get(i10);
        TL_keyboard.InlineButtonType inlineButtonType = pageButton != null ? pageButton.type : null;
        g(context, c6Var, m3Var, z10, LocaleController.getString(c10 ? R.string.RichEditorEditCopyButton : R.string.RichEditorCreateCopyButton), LocaleController.getString(R.string.RichEditorButtonCopyText), inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy ? ((TL_keyboard.TL_inlineButtonTypeCopy) inlineButtonType).copy_text : "", new w3(m3Var, 3));
    }

    public static void e(Context context, c6 c6Var, m3 m3Var, boolean z10) {
        boolean c10 = m3Var.c();
        int i10 = m3Var.b;
        TL_iv.pageBlockButtonRow d = m3Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i10 < 0 || i10 >= d.buttons.size()) ? null : d.buttons.get(i10);
        TL_keyboard.InlineButtonType inlineButtonType = pageButton != null ? pageButton.type : null;
        g(context, c6Var, m3Var, z10, LocaleController.getString(c10 ? R.string.RichEditorEditLinkButton : R.string.RichEditorCreateLinkButton), LocaleController.getString(R.string.RichEditorButtonURL), inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl ? ((TL_keyboard.TL_inlineButtonTypeUrl) inlineButtonType).url : "http://", new w3(m3Var, 1));
    }

    public static void f(org.telegram.ui.ActionBar.n2 n2Var, Context context, c6 c6Var, m3 m3Var, boolean z10) {
        boolean c10 = m3Var.c();
        LinearLayout g10 = org.telegram.messenger.y1.g(context, 1);
        int i10 = 0;
        g10.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        String string = LocaleController.getString(R.string.RichEditorButtonText);
        int i11 = m3Var.b;
        TL_iv.pageBlockButtonRow d = m3Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i11 < 0 || i11 >= d.buttons.size()) ? null : d.buttons.get(i11);
        EditTextBoldCursor a2 = a(context, c6Var, string, pageButton == null ? "" : v5.l(pageButton.text));
        g10.addView(a2, z5.n(-1, 64));
        cg.c cVar = new cg.c(a2, n2Var, z10, m3Var, 27);
        AlertDialog$Builder alertDialog$Builder = z10 ? new AlertDialog$Builder(context, 0, c6Var) : new org.telegram.ui.ActionBar.e2(context, 0, c6Var);
        String string2 = LocaleController.getString(c10 ? R.string.RichEditorEditProfileButton : R.string.RichEditorCreateProfileButton);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        b2Var.N = string2;
        alertDialog$Builder.n(g10);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new l9.b(c10, cVar, a2, m3Var, 6));
        if (c10) {
            alertDialog$Builder.i(LocaleController.getString(R.string.RichEditorChangeUser), new lh.p(cVar, 24));
            String string3 = LocaleController.getString(R.string.Delete);
            w3 w3Var = new w3(m3Var, 2);
            b2Var.l0 = string3;
            b2Var.m0 = w3Var;
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            b2Var.F0 = true;
            i10 = -4;
        } else {
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        }
        j(alertDialog$Builder, a2, i10, c6Var);
    }

    public static void g(Context context, c6 c6Var, m3 m3Var, boolean z10, String str, String str2, String str3, w3 w3Var) {
        LinearLayout g10 = org.telegram.messenger.y1.g(context, 1);
        g10.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        String string = LocaleController.getString(R.string.RichEditorButtonText);
        int i10 = m3Var.b;
        TL_iv.pageBlockButtonRow d = m3Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i10 < 0 || i10 >= d.buttons.size()) ? null : d.buttons.get(i10);
        EditTextBoldCursor a2 = a(context, c6Var, string, pageButton == null ? "" : v5.l(pageButton.text));
        EditTextBoldCursor a3 = a(context, c6Var, str2, str3);
        g10.addView(a2, z5.n(-1, 64));
        g10.addView(a3, z5.n(-1, 64));
        AlertDialog$Builder alertDialog$Builder = z10 ? new AlertDialog$Builder(context, 0, c6Var) : new org.telegram.ui.ActionBar.e2(context, 0, c6Var);
        alertDialog$Builder.a.N = str;
        alertDialog$Builder.n(g10);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new iq0(a2, a3, w3Var, 7));
        if (m3Var.c()) {
            alertDialog$Builder.i(LocaleController.getString(R.string.Delete), new w3(m3Var, 0));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        } else {
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        }
        if (!TextUtils.isEmpty(a2.getText())) {
            a2 = a3;
        }
        j(alertDialog$Builder, a2, m3Var.c() ? -3 : 0, c6Var);
    }

    public static void h(o3 o3Var, boolean z10) {
        TL_iv.textButton textbutton;
        c4 c4Var = o3Var.d;
        TL_keyboard.InlineButtonType inlineButtonType = (c4Var == null || (textbutton = c4Var.a) == null) ? null : textbutton.type;
        boolean z11 = inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy;
        String l10 = z11 ? ((TL_keyboard.TL_inlineButtonTypeCopy) inlineButtonType).copy_text : v5.l(o3Var.e);
        o3Var.f.o3(false);
        o3Var.a.showInputDialog(LocaleController.getString(z11 ? R.string.RichEditorEditCopyButton : R.string.RichEditorCreateCopyButton), LocaleController.getString(R.string.RichEditorButtonCopyText), l10, false, !z10, new y3(o3Var, 1));
    }

    public static void i(o3 o3Var, boolean z10) {
        TL_iv.textButton textbutton;
        c4 c4Var = o3Var.d;
        TL_keyboard.InlineButtonType inlineButtonType = (c4Var == null || (textbutton = c4Var.a) == null) ? null : textbutton.type;
        boolean z11 = inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl;
        String str = z11 ? ((TL_keyboard.TL_inlineButtonTypeUrl) inlineButtonType).url : "http://";
        o3Var.f.o3(false);
        o3Var.a.showInputDialog(LocaleController.getString(z11 ? R.string.RichEditorEditLinkButton : R.string.RichEditorCreateLinkButton), LocaleController.getString(R.string.RichEditorButtonURL), str, true, !z10, new y3(o3Var, 0));
    }

    public static void j(AlertDialog$Builder alertDialog$Builder, EditTextBoldCursor editTextBoldCursor, int i10, c6 c6Var) {
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        b2Var.setOnShowListener(new gh.k(3, editTextBoldCursor));
        b2Var.q(250L);
        if (i10 == 0 || !(b2Var.d(i10) instanceof TextView)) {
            return;
        }
        ((TextView) b2Var.d(i10)).setTextColor(g6.v0(g6.q7, c6Var));
    }

    public static void k(org.telegram.ui.ActionBar.n2 n2Var, boolean z10, a4 a4Var) {
        if (n2Var == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("onlySelect", true);
        bundle.putBoolean("checkCanWrite", false);
        bundle.putInt("dialogsType", 4);
        gy gyVar = new gy(bundle);
        gyVar.y2 = new lh.p(a4Var, 25);
        if (!z10) {
            n2Var.presentFragment(gyVar);
            return;
        }
        org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
        l2Var.a = true;
        n2Var.showAsSheet(gyVar, l2Var);
    }
}
