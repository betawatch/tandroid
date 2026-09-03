package vh;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.p70;
import org.telegram.ui.cr0;
import org.telegram.ui.qy;
import ph.z8;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public abstract class e4 {
    public static EditTextBoldCursor a(Context context, f6 f6Var, String str, String str2) {
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setTextColor(j6.v0(j6.j5, f6Var));
        editTextBoldCursor.setHintText(str);
        editTextBoldCursor.setHintColor(j6.v0(j6.H6, f6Var));
        editTextBoldCursor.setHeaderHintColor(j6.v0(j6.L6, f6Var));
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setFocusable(true);
        editTextBoldCursor.setTransformHintToHeaderOnFocus(false);
        editTextBoldCursor.setTransformHintToHeader(true);
        if (str2 == null) {
            str2 = "";
        }
        editTextBoldCursor.setText(str2);
        editTextBoldCursor.setLineColors(j6.v0(j6.k6, f6Var), j6.v0(j6.l6, f6Var), j6.v0(j6.p7, f6Var));
        editTextBoldCursor.setImeOptions(5);
        editTextBoldCursor.setBackgroundDrawable(null);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setHighlightColor(j6.v0(j6.uf, f6Var));
        editTextBoldCursor.setHandlesColor(j6.v0(j6.vf, f6Var));
        return editTextBoldCursor;
    }

    public static p70 b(p70 p70Var, org.telegram.ui.ActionBar.p2 p2Var, final r3 r3Var, final boolean z4) {
        TL_iv.textButton textbutton;
        f4 f4Var = r3Var.d;
        TL_keyboard.InlineButtonType inlineButtonType = (f4Var == null || (textbutton = f4Var.a) == null) ? null : textbutton.type;
        if (inlineButtonType == null) {
            final int i10 = 0;
            p70Var.c(R.drawable.media_link_24, LocaleController.getString(R.string.ChatLink), new Runnable() { // from class: vh.a4
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            e4.i(r3Var, z4);
                            break;
                        default:
                            e4.h(r3Var, z4);
                            break;
                    }
                }
            }, false);
            final int i11 = 1;
            p70Var.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new Runnable() { // from class: vh.a4
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            e4.i(r3Var, z4);
                            break;
                        default:
                            e4.h(r3Var, z4);
                            break;
                    }
                }
            }, false);
            p70Var.c(R.drawable.left_status_profile, LocaleController.getString(R.string.RichEditorUserProfile), new cr0(p2Var, r3Var, z4, 14), false);
            p70Var.Z();
            return p70Var;
        }
        if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl) {
            i(r3Var, z4);
        } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
            h(r3Var, z4);
        } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
            r3Var.f.n3(true);
            k(p2Var, z4, new b4(r3Var, 2));
        }
        return null;
    }

    public static p70 c(p70 p70Var, org.telegram.ui.ActionBar.p2 p2Var, final Context context, final f6 f6Var, final p3 p3Var, final boolean z4) {
        int i10 = p3Var.b;
        TL_iv.pageBlockButtonRow d = p3Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i10 < 0 || i10 >= d.buttons.size()) ? null : d.buttons.get(i10);
        TL_keyboard.InlineButtonType inlineButtonType = pageButton == null ? null : pageButton.type;
        if (inlineButtonType != null) {
            if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl) {
                e(context, f6Var, p3Var, z4);
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
                d(context, f6Var, p3Var, z4);
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
                f(p2Var, context, f6Var, p3Var, z4);
            }
            return null;
        }
        final int i11 = 0;
        p70Var.c(R.drawable.media_link_24, LocaleController.getString(R.string.ChatLink), new Runnable() { // from class: vh.c4
            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        e4.e(context, f6Var, p3Var, z4);
                        break;
                    default:
                        e4.d(context, f6Var, p3Var, z4);
                        break;
                }
            }
        }, false);
        final int i12 = 1;
        p70Var.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new Runnable() { // from class: vh.c4
            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        e4.e(context, f6Var, p3Var, z4);
                        break;
                    default:
                        e4.d(context, f6Var, p3Var, z4);
                        break;
                }
            }
        }, false);
        p70Var.c(R.drawable.left_status_profile, LocaleController.getString(R.string.RichEditorUserProfile), new gg.j(p2Var, (Object) context, (Object) f6Var, (Object) p3Var, z4, 23), false);
        p70Var.Z();
        return p70Var;
    }

    public static void d(Context context, f6 f6Var, p3 p3Var, boolean z4) {
        boolean c3 = p3Var.c();
        int i10 = p3Var.b;
        TL_iv.pageBlockButtonRow d = p3Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i10 < 0 || i10 >= d.buttons.size()) ? null : d.buttons.get(i10);
        TL_keyboard.InlineButtonType inlineButtonType = pageButton != null ? pageButton.type : null;
        g(context, f6Var, p3Var, z4, LocaleController.getString(c3 ? R.string.RichEditorEditCopyButton : R.string.RichEditorCreateCopyButton), LocaleController.getString(R.string.RichEditorButtonCopyText), inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy ? ((TL_keyboard.TL_inlineButtonTypeCopy) inlineButtonType).copy_text : "", new z3(p3Var, 3));
    }

    public static void e(Context context, f6 f6Var, p3 p3Var, boolean z4) {
        boolean c3 = p3Var.c();
        int i10 = p3Var.b;
        TL_iv.pageBlockButtonRow d = p3Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i10 < 0 || i10 >= d.buttons.size()) ? null : d.buttons.get(i10);
        TL_keyboard.InlineButtonType inlineButtonType = pageButton != null ? pageButton.type : null;
        g(context, f6Var, p3Var, z4, LocaleController.getString(c3 ? R.string.RichEditorEditLinkButton : R.string.RichEditorCreateLinkButton), LocaleController.getString(R.string.RichEditorButtonURL), inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl ? ((TL_keyboard.TL_inlineButtonTypeUrl) inlineButtonType).url : "http://", new z3(p3Var, 1));
    }

    public static void f(org.telegram.ui.ActionBar.p2 p2Var, Context context, f6 f6Var, p3 p3Var, boolean z4) {
        boolean c3 = p3Var.c();
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
        int i10 = 0;
        f10.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        String string = LocaleController.getString(R.string.RichEditorButtonText);
        int i11 = p3Var.b;
        TL_iv.pageBlockButtonRow d = p3Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i11 < 0 || i11 >= d.buttons.size()) ? null : d.buttons.get(i11);
        EditTextBoldCursor a2 = a(context, f6Var, string, pageButton == null ? "" : y5.l(pageButton.text));
        f10.addView(a2, b6.n(-1, 64));
        cg.u0 u0Var = new cg.u0(a2, p2Var, z4, p3Var, 28);
        AlertDialog$Builder alertDialog$Builder = z4 ? new AlertDialog$Builder(context, 0, f6Var) : new org.telegram.ui.ActionBar.g2(context, 0, f6Var);
        String string2 = LocaleController.getString(c3 ? R.string.RichEditorEditProfileButton : R.string.RichEditorCreateProfileButton);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        d2Var.O = string2;
        alertDialog$Builder.n(f10);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new o9.b(c3, u0Var, a2, p3Var, 6));
        if (c3) {
            alertDialog$Builder.i(LocaleController.getString(R.string.RichEditorChangeUser), new z8(u0Var, 15));
            String string3 = LocaleController.getString(R.string.Delete);
            z3 z3Var = new z3(p3Var, 2);
            d2Var.m0 = string3;
            d2Var.n0 = z3Var;
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            d2Var.G0 = true;
            i10 = -4;
        } else {
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        }
        j(alertDialog$Builder, a2, i10, f6Var);
    }

    public static void g(Context context, f6 f6Var, p3 p3Var, boolean z4, String str, String str2, String str3, z3 z3Var) {
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
        f10.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        String string = LocaleController.getString(R.string.RichEditorButtonText);
        int i10 = p3Var.b;
        TL_iv.pageBlockButtonRow d = p3Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i10 < 0 || i10 >= d.buttons.size()) ? null : d.buttons.get(i10);
        EditTextBoldCursor a2 = a(context, f6Var, string, pageButton == null ? "" : y5.l(pageButton.text));
        EditTextBoldCursor a10 = a(context, f6Var, str2, str3);
        f10.addView(a2, b6.n(-1, 64));
        f10.addView(a10, b6.n(-1, 64));
        AlertDialog$Builder alertDialog$Builder = z4 ? new AlertDialog$Builder(context, 0, f6Var) : new org.telegram.ui.ActionBar.g2(context, 0, f6Var);
        alertDialog$Builder.a.O = str;
        alertDialog$Builder.n(f10);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new ph.l1(a2, a10, z3Var, 7));
        if (p3Var.c()) {
            alertDialog$Builder.i(LocaleController.getString(R.string.Delete), new z3(p3Var, 0));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        } else {
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        }
        if (!TextUtils.isEmpty(a2.getText())) {
            a2 = a10;
        }
        j(alertDialog$Builder, a2, p3Var.c() ? -3 : 0, f6Var);
    }

    public static void h(r3 r3Var, boolean z4) {
        TL_iv.textButton textbutton;
        f4 f4Var = r3Var.d;
        TL_keyboard.InlineButtonType inlineButtonType = (f4Var == null || (textbutton = f4Var.a) == null) ? null : textbutton.type;
        boolean z10 = inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy;
        String l10 = z10 ? ((TL_keyboard.TL_inlineButtonTypeCopy) inlineButtonType).copy_text : y5.l(r3Var.e);
        r3Var.f.n3(false);
        r3Var.a.showInputDialog(LocaleController.getString(z10 ? R.string.RichEditorEditCopyButton : R.string.RichEditorCreateCopyButton), LocaleController.getString(R.string.RichEditorButtonCopyText), l10, false, !z4, new b4(r3Var, 1));
    }

    public static void i(r3 r3Var, boolean z4) {
        TL_iv.textButton textbutton;
        f4 f4Var = r3Var.d;
        TL_keyboard.InlineButtonType inlineButtonType = (f4Var == null || (textbutton = f4Var.a) == null) ? null : textbutton.type;
        boolean z10 = inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl;
        String str = z10 ? ((TL_keyboard.TL_inlineButtonTypeUrl) inlineButtonType).url : "http://";
        r3Var.f.n3(false);
        r3Var.a.showInputDialog(LocaleController.getString(z10 ? R.string.RichEditorEditLinkButton : R.string.RichEditorCreateLinkButton), LocaleController.getString(R.string.RichEditorButtonURL), str, true, !z4, new b4(r3Var, 0));
    }

    public static void j(AlertDialog$Builder alertDialog$Builder, EditTextBoldCursor editTextBoldCursor, int i10, f6 f6Var) {
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        d2Var.setOnShowListener(new kh.j(3, editTextBoldCursor));
        d2Var.q(250L);
        if (i10 == 0 || !(d2Var.d(i10) instanceof TextView)) {
            return;
        }
        ((TextView) d2Var.d(i10)).setTextColor(j6.v0(j6.q7, f6Var));
    }

    public static void k(org.telegram.ui.ActionBar.p2 p2Var, boolean z4, d4 d4Var) {
        if (p2Var == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("onlySelect", true);
        bundle.putBoolean("checkCanWrite", false);
        bundle.putInt("dialogsType", 4);
        qy qyVar = new qy(bundle);
        qyVar.z2 = new z8(d4Var, 16);
        if (!z4) {
            p2Var.presentFragment(qyVar);
            return;
        }
        org.telegram.ui.ActionBar.n2 n2Var = new org.telegram.ui.ActionBar.n2();
        n2Var.a = true;
        p2Var.showAsSheet(qyVar, n2Var);
    }
}
