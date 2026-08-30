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
import org.telegram.ui.Components.o70;
import org.telegram.ui.oy;
import org.telegram.ui.vq0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public abstract class d4 {
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

    public static o70 b(o70 o70Var, org.telegram.ui.ActionBar.p2 p2Var, final q3 q3Var, final boolean z4) {
        TL_iv.textButton textbutton;
        e4 e4Var = q3Var.d;
        TL_keyboard.InlineButtonType inlineButtonType = (e4Var == null || (textbutton = e4Var.a) == null) ? null : textbutton.type;
        if (inlineButtonType == null) {
            final int i10 = 0;
            o70Var.c(R.drawable.media_link_24, LocaleController.getString(R.string.ChatLink), new Runnable() { // from class: vh.z3
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            d4.i(q3Var, z4);
                            break;
                        default:
                            d4.h(q3Var, z4);
                            break;
                    }
                }
            }, false);
            final int i11 = 1;
            o70Var.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new Runnable() { // from class: vh.z3
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            d4.i(q3Var, z4);
                            break;
                        default:
                            d4.h(q3Var, z4);
                            break;
                    }
                }
            }, false);
            o70Var.c(R.drawable.left_status_profile, LocaleController.getString(R.string.RichEditorUserProfile), new vq0(p2Var, q3Var, z4, 14), false);
            o70Var.Z();
            return o70Var;
        }
        if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl) {
            i(q3Var, z4);
        } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
            h(q3Var, z4);
        } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
            q3Var.f.o3(true);
            k(p2Var, z4, new a4(q3Var, 2));
        }
        return null;
    }

    public static o70 c(o70 o70Var, org.telegram.ui.ActionBar.p2 p2Var, final Context context, final f6 f6Var, final o3 o3Var, final boolean z4) {
        int i10 = o3Var.b;
        TL_iv.pageBlockButtonRow d = o3Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i10 < 0 || i10 >= d.buttons.size()) ? null : d.buttons.get(i10);
        TL_keyboard.InlineButtonType inlineButtonType = pageButton == null ? null : pageButton.type;
        if (inlineButtonType != null) {
            if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl) {
                e(context, f6Var, o3Var, z4);
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
                d(context, f6Var, o3Var, z4);
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
                f(p2Var, context, f6Var, o3Var, z4);
            }
            return null;
        }
        final int i11 = 0;
        o70Var.c(R.drawable.media_link_24, LocaleController.getString(R.string.ChatLink), new Runnable() { // from class: vh.b4
            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        d4.e(context, f6Var, o3Var, z4);
                        break;
                    default:
                        d4.d(context, f6Var, o3Var, z4);
                        break;
                }
            }
        }, false);
        final int i12 = 1;
        o70Var.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new Runnable() { // from class: vh.b4
            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        d4.e(context, f6Var, o3Var, z4);
                        break;
                    default:
                        d4.d(context, f6Var, o3Var, z4);
                        break;
                }
            }
        }, false);
        o70Var.c(R.drawable.left_status_profile, LocaleController.getString(R.string.RichEditorUserProfile), new gg.j(p2Var, (Object) context, (Object) f6Var, (Object) o3Var, z4, 23), false);
        o70Var.Z();
        return o70Var;
    }

    public static void d(Context context, f6 f6Var, o3 o3Var, boolean z4) {
        boolean c3 = o3Var.c();
        int i10 = o3Var.b;
        TL_iv.pageBlockButtonRow d = o3Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i10 < 0 || i10 >= d.buttons.size()) ? null : d.buttons.get(i10);
        TL_keyboard.InlineButtonType inlineButtonType = pageButton != null ? pageButton.type : null;
        g(context, f6Var, o3Var, z4, LocaleController.getString(c3 ? R.string.RichEditorEditCopyButton : R.string.RichEditorCreateCopyButton), LocaleController.getString(R.string.RichEditorButtonCopyText), inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy ? ((TL_keyboard.TL_inlineButtonTypeCopy) inlineButtonType).copy_text : "", new y3(o3Var, 3));
    }

    public static void e(Context context, f6 f6Var, o3 o3Var, boolean z4) {
        boolean c3 = o3Var.c();
        int i10 = o3Var.b;
        TL_iv.pageBlockButtonRow d = o3Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i10 < 0 || i10 >= d.buttons.size()) ? null : d.buttons.get(i10);
        TL_keyboard.InlineButtonType inlineButtonType = pageButton != null ? pageButton.type : null;
        g(context, f6Var, o3Var, z4, LocaleController.getString(c3 ? R.string.RichEditorEditLinkButton : R.string.RichEditorCreateLinkButton), LocaleController.getString(R.string.RichEditorButtonURL), inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl ? ((TL_keyboard.TL_inlineButtonTypeUrl) inlineButtonType).url : "http://", new y3(o3Var, 1));
    }

    public static void f(org.telegram.ui.ActionBar.p2 p2Var, Context context, f6 f6Var, o3 o3Var, boolean z4) {
        boolean c3 = o3Var.c();
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
        int i10 = 0;
        f10.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        String string = LocaleController.getString(R.string.RichEditorButtonText);
        int i11 = o3Var.b;
        TL_iv.pageBlockButtonRow d = o3Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i11 < 0 || i11 >= d.buttons.size()) ? null : d.buttons.get(i11);
        EditTextBoldCursor a2 = a(context, f6Var, string, pageButton == null ? "" : x5.l(pageButton.text));
        f10.addView(a2, b6.n(-1, 64));
        cg.u0 u0Var = new cg.u0(a2, p2Var, z4, o3Var, 28);
        AlertDialog$Builder alertDialog$Builder = z4 ? new AlertDialog$Builder(context, 0, f6Var) : new org.telegram.ui.ActionBar.g2(context, 0, f6Var);
        String string2 = LocaleController.getString(c3 ? R.string.RichEditorEditProfileButton : R.string.RichEditorCreateProfileButton);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        d2Var.O = string2;
        alertDialog$Builder.n(f10);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new o9.b(c3, u0Var, a2, o3Var, 6));
        if (c3) {
            alertDialog$Builder.i(LocaleController.getString(R.string.RichEditorChangeUser), new rh.e(u0Var, 12));
            String string3 = LocaleController.getString(R.string.Delete);
            y3 y3Var = new y3(o3Var, 2);
            d2Var.m0 = string3;
            d2Var.n0 = y3Var;
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            d2Var.G0 = true;
            i10 = -4;
        } else {
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        }
        j(alertDialog$Builder, a2, i10, f6Var);
    }

    public static void g(Context context, f6 f6Var, o3 o3Var, boolean z4, String str, String str2, String str3, y3 y3Var) {
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
        f10.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        String string = LocaleController.getString(R.string.RichEditorButtonText);
        int i10 = o3Var.b;
        TL_iv.pageBlockButtonRow d = o3Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i10 < 0 || i10 >= d.buttons.size()) ? null : d.buttons.get(i10);
        EditTextBoldCursor a2 = a(context, f6Var, string, pageButton == null ? "" : x5.l(pageButton.text));
        EditTextBoldCursor a10 = a(context, f6Var, str2, str3);
        f10.addView(a2, b6.n(-1, 64));
        f10.addView(a10, b6.n(-1, 64));
        AlertDialog$Builder alertDialog$Builder = z4 ? new AlertDialog$Builder(context, 0, f6Var) : new org.telegram.ui.ActionBar.g2(context, 0, f6Var);
        alertDialog$Builder.a.O = str;
        alertDialog$Builder.n(f10);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new ph.m1(a2, a10, y3Var, 7));
        if (o3Var.c()) {
            alertDialog$Builder.i(LocaleController.getString(R.string.Delete), new y3(o3Var, 0));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        } else {
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        }
        if (!TextUtils.isEmpty(a2.getText())) {
            a2 = a10;
        }
        j(alertDialog$Builder, a2, o3Var.c() ? -3 : 0, f6Var);
    }

    public static void h(q3 q3Var, boolean z4) {
        TL_iv.textButton textbutton;
        e4 e4Var = q3Var.d;
        TL_keyboard.InlineButtonType inlineButtonType = (e4Var == null || (textbutton = e4Var.a) == null) ? null : textbutton.type;
        boolean z10 = inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy;
        String l10 = z10 ? ((TL_keyboard.TL_inlineButtonTypeCopy) inlineButtonType).copy_text : x5.l(q3Var.e);
        q3Var.f.o3(false);
        q3Var.a.showInputDialog(LocaleController.getString(z10 ? R.string.RichEditorEditCopyButton : R.string.RichEditorCreateCopyButton), LocaleController.getString(R.string.RichEditorButtonCopyText), l10, false, !z4, new a4(q3Var, 1));
    }

    public static void i(q3 q3Var, boolean z4) {
        TL_iv.textButton textbutton;
        e4 e4Var = q3Var.d;
        TL_keyboard.InlineButtonType inlineButtonType = (e4Var == null || (textbutton = e4Var.a) == null) ? null : textbutton.type;
        boolean z10 = inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl;
        String str = z10 ? ((TL_keyboard.TL_inlineButtonTypeUrl) inlineButtonType).url : "http://";
        q3Var.f.o3(false);
        q3Var.a.showInputDialog(LocaleController.getString(z10 ? R.string.RichEditorEditLinkButton : R.string.RichEditorCreateLinkButton), LocaleController.getString(R.string.RichEditorButtonURL), str, true, !z4, new a4(q3Var, 0));
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

    public static void k(org.telegram.ui.ActionBar.p2 p2Var, boolean z4, c4 c4Var) {
        if (p2Var == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("onlySelect", true);
        bundle.putBoolean("checkCanWrite", false);
        bundle.putInt("dialogsType", 4);
        oy oyVar = new oy(bundle);
        oyVar.z2 = new rh.e(c4Var, 13);
        if (!z4) {
            p2Var.presentFragment(oyVar);
            return;
        }
        org.telegram.ui.ActionBar.n2 n2Var = new org.telegram.ui.ActionBar.n2();
        n2Var.a = true;
        p2Var.showAsSheet(oyVar, n2Var);
    }
}
