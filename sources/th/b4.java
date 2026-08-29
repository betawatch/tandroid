package th;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import i7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.j70;
import org.telegram.ui.fy;
import org.telegram.ui.mp0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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

    public static j70 b(j70 j70Var, org.telegram.ui.ActionBar.o2 o2Var, final o3 o3Var, final boolean z10) {
        TL_iv.textButton textbutton;
        c4 c4Var = o3Var.d;
        TL_keyboard.InlineButtonType inlineButtonType = (c4Var == null || (textbutton = c4Var.a) == null) ? null : textbutton.type;
        if (inlineButtonType == null) {
            final int i10 = 0;
            j70Var.c(R.drawable.media_link_24, LocaleController.getString(R.string.ChatLink), new Runnable() { // from class: th.x3
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
            j70Var.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new Runnable() { // from class: th.x3
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
            j70Var.c(R.drawable.left_status_profile, LocaleController.getString(R.string.RichEditorUserProfile), new mp0(o2Var, o3Var, z10, 14), false);
            j70Var.Z();
            return j70Var;
        }
        if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl) {
            i(o3Var, z10);
        } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
            h(o3Var, z10);
        } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
            o3Var.f.o3(true);
            k(o2Var, z10, new y3(o3Var, 2));
        }
        return null;
    }

    public static j70 c(j70 j70Var, org.telegram.ui.ActionBar.o2 o2Var, final Context context, final c6 c6Var, final m3 m3Var, final boolean z10) {
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
                f(o2Var, context, c6Var, m3Var, z10);
            }
            return null;
        }
        final int i11 = 0;
        j70Var.c(R.drawable.media_link_24, LocaleController.getString(R.string.ChatLink), new Runnable() { // from class: th.z3
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
        j70Var.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new Runnable() { // from class: th.z3
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
        j70Var.c(R.drawable.left_status_profile, LocaleController.getString(R.string.RichEditorUserProfile), new eg.j(o2Var, (Object) context, (Object) c6Var, (Object) m3Var, z10, 23), false);
        j70Var.Z();
        return j70Var;
    }

    public static void d(Context context, c6 c6Var, m3 m3Var, boolean z10) {
        boolean c3 = m3Var.c();
        int i10 = m3Var.b;
        TL_iv.pageBlockButtonRow d = m3Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i10 < 0 || i10 >= d.buttons.size()) ? null : d.buttons.get(i10);
        TL_keyboard.InlineButtonType inlineButtonType = pageButton != null ? pageButton.type : null;
        g(context, c6Var, m3Var, z10, LocaleController.getString(c3 ? R.string.RichEditorEditCopyButton : R.string.RichEditorCreateCopyButton), LocaleController.getString(R.string.RichEditorButtonCopyText), inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy ? ((TL_keyboard.TL_inlineButtonTypeCopy) inlineButtonType).copy_text : "", new w3(m3Var, 3));
    }

    public static void e(Context context, c6 c6Var, m3 m3Var, boolean z10) {
        boolean c3 = m3Var.c();
        int i10 = m3Var.b;
        TL_iv.pageBlockButtonRow d = m3Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i10 < 0 || i10 >= d.buttons.size()) ? null : d.buttons.get(i10);
        TL_keyboard.InlineButtonType inlineButtonType = pageButton != null ? pageButton.type : null;
        g(context, c6Var, m3Var, z10, LocaleController.getString(c3 ? R.string.RichEditorEditLinkButton : R.string.RichEditorCreateLinkButton), LocaleController.getString(R.string.RichEditorButtonURL), inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl ? ((TL_keyboard.TL_inlineButtonTypeUrl) inlineButtonType).url : "http://", new w3(m3Var, 1));
    }

    public static void f(org.telegram.ui.ActionBar.o2 o2Var, Context context, c6 c6Var, m3 m3Var, boolean z10) {
        boolean c3 = m3Var.c();
        LinearLayout g10 = org.telegram.messenger.x3.g(context, 1);
        int i10 = 0;
        g10.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        String string = LocaleController.getString(R.string.RichEditorButtonText);
        int i11 = m3Var.b;
        TL_iv.pageBlockButtonRow d = m3Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i11 < 0 || i11 >= d.buttons.size()) ? null : d.buttons.get(i11);
        EditTextBoldCursor a2 = a(context, c6Var, string, pageButton == null ? "" : v5.l(pageButton.text));
        g10.addView(a2, f6.n(-1, 64));
        ag.w0 w0Var = new ag.w0(a2, o2Var, z10, m3Var, 28);
        AlertDialog$Builder alertDialog$Builder = z10 ? new AlertDialog$Builder(context, 0, c6Var) : new org.telegram.ui.ActionBar.f2(context, 0, c6Var);
        String string2 = LocaleController.getString(c3 ? R.string.RichEditorEditProfileButton : R.string.RichEditorCreateProfileButton);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.N = string2;
        alertDialog$Builder.n(g10);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new m9.b(c3, w0Var, a2, m3Var, 6));
        if (c3) {
            alertDialog$Builder.i(LocaleController.getString(R.string.RichEditorChangeUser), new sf.f1(w0Var, 7));
            String string3 = LocaleController.getString(R.string.Delete);
            w3 w3Var = new w3(m3Var, 2);
            c2Var.l0 = string3;
            c2Var.m0 = w3Var;
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            c2Var.F0 = true;
            i10 = -4;
        } else {
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        }
        j(alertDialog$Builder, a2, i10, c6Var);
    }

    public static void g(Context context, c6 c6Var, m3 m3Var, boolean z10, String str, String str2, String str3, w3 w3Var) {
        LinearLayout g10 = org.telegram.messenger.x3.g(context, 1);
        g10.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        String string = LocaleController.getString(R.string.RichEditorButtonText);
        int i10 = m3Var.b;
        TL_iv.pageBlockButtonRow d = m3Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i10 < 0 || i10 >= d.buttons.size()) ? null : d.buttons.get(i10);
        EditTextBoldCursor a2 = a(context, c6Var, string, pageButton == null ? "" : v5.l(pageButton.text));
        EditTextBoldCursor a10 = a(context, c6Var, str2, str3);
        g10.addView(a2, f6.n(-1, 64));
        g10.addView(a10, f6.n(-1, 64));
        AlertDialog$Builder alertDialog$Builder = z10 ? new AlertDialog$Builder(context, 0, c6Var) : new org.telegram.ui.ActionBar.f2(context, 0, c6Var);
        alertDialog$Builder.a.N = str;
        alertDialog$Builder.n(g10);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new org.telegram.ui.Components.voip.w1(a2, a10, w3Var, 7));
        if (m3Var.c()) {
            alertDialog$Builder.i(LocaleController.getString(R.string.Delete), new w3(m3Var, 0));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        } else {
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        }
        if (!TextUtils.isEmpty(a2.getText())) {
            a2 = a10;
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
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.setOnShowListener(new ih.k(3, editTextBoldCursor));
        c2Var.q(250L);
        if (i10 == 0 || !(c2Var.d(i10) instanceof TextView)) {
            return;
        }
        ((TextView) c2Var.d(i10)).setTextColor(g6.v0(g6.q7, c6Var));
    }

    public static void k(org.telegram.ui.ActionBar.o2 o2Var, boolean z10, a4 a4Var) {
        if (o2Var == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("onlySelect", true);
        bundle.putBoolean("checkCanWrite", false);
        bundle.putInt("dialogsType", 4);
        fy fyVar = new fy(bundle);
        fyVar.y2 = new sf.f1(a4Var, 8);
        if (!z10) {
            o2Var.presentFragment(fyVar);
            return;
        }
        org.telegram.ui.ActionBar.m2 m2Var = new org.telegram.ui.ActionBar.m2();
        m2Var.a = true;
        o2Var.showAsSheet(fyVar, m2Var);
    }
}
