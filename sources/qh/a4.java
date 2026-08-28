package qh;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import g7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.ll;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.hq0;
import org.telegram.ui.Components.x60;
import org.telegram.ui.dy;
import org.telegram.ui.np0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public abstract class a4 {
    public static EditTextBoldCursor a(Context context, b6 b6Var, String str, String str2) {
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setTextColor(f6.v0(f6.j5, b6Var));
        editTextBoldCursor.setHintText(str);
        editTextBoldCursor.setHintColor(f6.v0(f6.H6, b6Var));
        editTextBoldCursor.setHeaderHintColor(f6.v0(f6.L6, b6Var));
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setFocusable(true);
        editTextBoldCursor.setTransformHintToHeaderOnFocus(false);
        editTextBoldCursor.setTransformHintToHeader(true);
        if (str2 == null) {
            str2 = "";
        }
        editTextBoldCursor.setText(str2);
        editTextBoldCursor.setLineColors(f6.v0(f6.k6, b6Var), f6.v0(f6.l6, b6Var), f6.v0(f6.p7, b6Var));
        editTextBoldCursor.setImeOptions(5);
        editTextBoldCursor.setBackgroundDrawable(null);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setHighlightColor(f6.v0(f6.uf, b6Var));
        editTextBoldCursor.setHandlesColor(f6.v0(f6.vf, b6Var));
        return editTextBoldCursor;
    }

    public static x60 b(x60 x60Var, org.telegram.ui.ActionBar.o2 o2Var, final n3 n3Var, final boolean z10) {
        TL_iv.textButton textbutton;
        b4 b4Var = n3Var.d;
        TL_keyboard.InlineButtonType inlineButtonType = (b4Var == null || (textbutton = b4Var.a) == null) ? null : textbutton.type;
        if (inlineButtonType == null) {
            final int i9 = 0;
            x60Var.c(R.drawable.media_link_24, LocaleController.getString(R.string.ChatLink), new Runnable() { // from class: qh.w3
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i9) {
                        case 0:
                            a4.i(n3Var, z10);
                            break;
                        default:
                            a4.h(n3Var, z10);
                            break;
                    }
                }
            }, false);
            final int i10 = 1;
            x60Var.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new Runnable() { // from class: qh.w3
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            a4.i(n3Var, z10);
                            break;
                        default:
                            a4.h(n3Var, z10);
                            break;
                    }
                }
            }, false);
            x60Var.c(R.drawable.left_status_profile, LocaleController.getString(R.string.RichEditorUserProfile), new np0(o2Var, n3Var, z10, 14), false);
            x60Var.Z();
            return x60Var;
        }
        if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl) {
            i(n3Var, z10);
        } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
            h(n3Var, z10);
        } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
            n3Var.f.o3(true);
            k(o2Var, z10, new x3(n3Var, 2));
        }
        return null;
    }

    public static x60 c(x60 x60Var, org.telegram.ui.ActionBar.o2 o2Var, final Context context, final b6 b6Var, final l3 l3Var, final boolean z10) {
        int i9 = l3Var.b;
        TL_iv.pageBlockButtonRow d = l3Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i9 < 0 || i9 >= d.buttons.size()) ? null : d.buttons.get(i9);
        TL_keyboard.InlineButtonType inlineButtonType = pageButton == null ? null : pageButton.type;
        if (inlineButtonType != null) {
            if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl) {
                e(context, b6Var, l3Var, z10);
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
                d(context, b6Var, l3Var, z10);
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
                f(o2Var, context, b6Var, l3Var, z10);
            }
            return null;
        }
        final int i10 = 0;
        x60Var.c(R.drawable.media_link_24, LocaleController.getString(R.string.ChatLink), new Runnable() { // from class: qh.y3
            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        a4.e(context, b6Var, l3Var, z10);
                        break;
                    default:
                        a4.d(context, b6Var, l3Var, z10);
                        break;
                }
            }
        }, false);
        final int i11 = 1;
        x60Var.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new Runnable() { // from class: qh.y3
            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        a4.e(context, b6Var, l3Var, z10);
                        break;
                    default:
                        a4.d(context, b6Var, l3Var, z10);
                        break;
                }
            }
        }, false);
        x60Var.c(R.drawable.left_status_profile, LocaleController.getString(R.string.RichEditorUserProfile), new bg.m(o2Var, (Object) context, (Object) b6Var, (Object) l3Var, z10, 23), false);
        x60Var.Z();
        return x60Var;
    }

    public static void d(Context context, b6 b6Var, l3 l3Var, boolean z10) {
        boolean c10 = l3Var.c();
        int i9 = l3Var.b;
        TL_iv.pageBlockButtonRow d = l3Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i9 < 0 || i9 >= d.buttons.size()) ? null : d.buttons.get(i9);
        TL_keyboard.InlineButtonType inlineButtonType = pageButton != null ? pageButton.type : null;
        g(context, b6Var, l3Var, z10, LocaleController.getString(c10 ? R.string.RichEditorEditCopyButton : R.string.RichEditorCreateCopyButton), LocaleController.getString(R.string.RichEditorButtonCopyText), inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy ? ((TL_keyboard.TL_inlineButtonTypeCopy) inlineButtonType).copy_text : "", new v3(l3Var, 3));
    }

    public static void e(Context context, b6 b6Var, l3 l3Var, boolean z10) {
        boolean c10 = l3Var.c();
        int i9 = l3Var.b;
        TL_iv.pageBlockButtonRow d = l3Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i9 < 0 || i9 >= d.buttons.size()) ? null : d.buttons.get(i9);
        TL_keyboard.InlineButtonType inlineButtonType = pageButton != null ? pageButton.type : null;
        g(context, b6Var, l3Var, z10, LocaleController.getString(c10 ? R.string.RichEditorEditLinkButton : R.string.RichEditorCreateLinkButton), LocaleController.getString(R.string.RichEditorButtonURL), inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl ? ((TL_keyboard.TL_inlineButtonTypeUrl) inlineButtonType).url : "http://", new v3(l3Var, 1));
    }

    public static void f(org.telegram.ui.ActionBar.o2 o2Var, Context context, b6 b6Var, l3 l3Var, boolean z10) {
        boolean c10 = l3Var.c();
        LinearLayout f10 = ll.f(context, 1);
        int i9 = 0;
        f10.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        String string = LocaleController.getString(R.string.RichEditorButtonText);
        int i10 = l3Var.b;
        TL_iv.pageBlockButtonRow d = l3Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i10 < 0 || i10 >= d.buttons.size()) ? null : d.buttons.get(i10);
        EditTextBoldCursor a2 = a(context, b6Var, string, pageButton == null ? "" : u5.l(pageButton.text));
        f10.addView(a2, e6.n(-1, 64));
        bg.d dVar = new bg.d(a2, o2Var, z10, l3Var, 27);
        AlertDialog$Builder alertDialog$Builder = z10 ? new AlertDialog$Builder(context, 0, b6Var) : new org.telegram.ui.ActionBar.f2(context, 0, b6Var);
        String string2 = LocaleController.getString(c10 ? R.string.RichEditorEditProfileButton : R.string.RichEditorCreateProfileButton);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.N = string2;
        alertDialog$Builder.n(f10);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new k9.b(c10, dVar, a2, l3Var, 6));
        if (c10) {
            alertDialog$Builder.i(LocaleController.getString(R.string.RichEditorChangeUser), new kh.p(dVar, 24));
            String string3 = LocaleController.getString(R.string.Delete);
            v3 v3Var = new v3(l3Var, 2);
            c2Var.l0 = string3;
            c2Var.m0 = v3Var;
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            c2Var.F0 = true;
            i9 = -4;
        } else {
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        }
        j(alertDialog$Builder, a2, i9, b6Var);
    }

    public static void g(Context context, b6 b6Var, l3 l3Var, boolean z10, String str, String str2, String str3, v3 v3Var) {
        LinearLayout f10 = ll.f(context, 1);
        f10.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        String string = LocaleController.getString(R.string.RichEditorButtonText);
        int i9 = l3Var.b;
        TL_iv.pageBlockButtonRow d = l3Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i9 < 0 || i9 >= d.buttons.size()) ? null : d.buttons.get(i9);
        EditTextBoldCursor a2 = a(context, b6Var, string, pageButton == null ? "" : u5.l(pageButton.text));
        EditTextBoldCursor a3 = a(context, b6Var, str2, str3);
        f10.addView(a2, e6.n(-1, 64));
        f10.addView(a3, e6.n(-1, 64));
        AlertDialog$Builder alertDialog$Builder = z10 ? new AlertDialog$Builder(context, 0, b6Var) : new org.telegram.ui.ActionBar.f2(context, 0, b6Var);
        alertDialog$Builder.a.N = str;
        alertDialog$Builder.n(f10);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new hq0(a2, a3, v3Var, 6));
        if (l3Var.c()) {
            alertDialog$Builder.i(LocaleController.getString(R.string.Delete), new v3(l3Var, 0));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        } else {
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        }
        if (!TextUtils.isEmpty(a2.getText())) {
            a2 = a3;
        }
        j(alertDialog$Builder, a2, l3Var.c() ? -3 : 0, b6Var);
    }

    public static void h(n3 n3Var, boolean z10) {
        TL_iv.textButton textbutton;
        b4 b4Var = n3Var.d;
        TL_keyboard.InlineButtonType inlineButtonType = (b4Var == null || (textbutton = b4Var.a) == null) ? null : textbutton.type;
        boolean z11 = inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy;
        String l10 = z11 ? ((TL_keyboard.TL_inlineButtonTypeCopy) inlineButtonType).copy_text : u5.l(n3Var.e);
        n3Var.f.o3(false);
        n3Var.a.showInputDialog(LocaleController.getString(z11 ? R.string.RichEditorEditCopyButton : R.string.RichEditorCreateCopyButton), LocaleController.getString(R.string.RichEditorButtonCopyText), l10, false, !z10, new x3(n3Var, 1));
    }

    public static void i(n3 n3Var, boolean z10) {
        TL_iv.textButton textbutton;
        b4 b4Var = n3Var.d;
        TL_keyboard.InlineButtonType inlineButtonType = (b4Var == null || (textbutton = b4Var.a) == null) ? null : textbutton.type;
        boolean z11 = inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl;
        String str = z11 ? ((TL_keyboard.TL_inlineButtonTypeUrl) inlineButtonType).url : "http://";
        n3Var.f.o3(false);
        n3Var.a.showInputDialog(LocaleController.getString(z11 ? R.string.RichEditorEditLinkButton : R.string.RichEditorCreateLinkButton), LocaleController.getString(R.string.RichEditorButtonURL), str, true, !z10, new x3(n3Var, 0));
    }

    public static void j(AlertDialog$Builder alertDialog$Builder, EditTextBoldCursor editTextBoldCursor, int i9, b6 b6Var) {
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.setOnShowListener(new fh.k(3, editTextBoldCursor));
        c2Var.q(250L);
        if (i9 == 0 || !(c2Var.d(i9) instanceof TextView)) {
            return;
        }
        ((TextView) c2Var.d(i9)).setTextColor(f6.v0(f6.q7, b6Var));
    }

    public static void k(org.telegram.ui.ActionBar.o2 o2Var, boolean z10, z3 z3Var) {
        if (o2Var == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("onlySelect", true);
        bundle.putBoolean("checkCanWrite", false);
        bundle.putInt("dialogsType", 4);
        dy dyVar = new dy(bundle);
        dyVar.y2 = new kh.p(z3Var, 25);
        if (!z10) {
            o2Var.presentFragment(dyVar);
            return;
        }
        org.telegram.ui.ActionBar.m2 m2Var = new org.telegram.ui.ActionBar.m2();
        m2Var.a = true;
        o2Var.showAsSheet(dyVar, m2Var);
    }
}
