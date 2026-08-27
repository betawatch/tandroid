package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class z11 extends org.telegram.ui.Components.yk0 {
    public final Context c;
    public final /* synthetic */ a21 d;

    public z11(a21 a21Var, Context context) {
        this.d = a21Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(f2.o1 o1Var) {
        int b10 = o1Var.b();
        if (b10 == 0) {
            return true;
        }
        a21 a21Var = this.d;
        return b10 == a21Var.c || b10 == a21Var.d || b10 == a21Var.e;
    }

    @Override // f2.q0
    public final int h() {
        return this.d.h;
    }

    @Override // f2.q0
    public final int j(int i10) {
        a21 a21Var = this.d;
        if (i10 == a21Var.f) {
            return 0;
        }
        if (i10 == 0 || i10 == a21Var.c || i10 == a21Var.d || i10 == a21Var.e) {
            return i10 + 9;
        }
        return 1;
    }

    @Override // f2.q0
    public final void v(f2.o1 o1Var, int i10) {
        String str;
        String str2;
        int i11 = o1Var.f;
        View view = o1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
            x8Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(this.c, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.b7));
            x8Var.setText(LocaleController.getString(R.string.VoipQuickRepliesExplain));
            return;
        }
        if (i11 == 1) {
            return;
        }
        a21 a21Var = this.d;
        if (i11 == 4) {
            ((org.telegram.ui.Cells.p8) view).f(LocaleController.getString(R.string.AllowCustomQuickReply), a21Var.getParentActivity().getSharedPreferences("mainconfig", 0).getBoolean("quick_reply_allow_custom", true), false);
            return;
        }
        switch (i11) {
            case 9:
            case 10:
            case 11:
            case 12:
                org.telegram.ui.Cells.h3 h3Var = (org.telegram.ui.Cells.h3) view;
                if (i10 == 0) {
                    str = LocaleController.getString(R.string.QuickReplyDefault1);
                    str2 = "quick_reply_msg1";
                } else if (i10 == a21Var.c) {
                    str = LocaleController.getString(R.string.QuickReplyDefault2);
                    str2 = "quick_reply_msg2";
                } else if (i10 == a21Var.d) {
                    str = LocaleController.getString(R.string.QuickReplyDefault3);
                    str2 = "quick_reply_msg3";
                } else if (i10 == a21Var.e) {
                    str = LocaleController.getString(R.string.QuickReplyDefault4);
                    str2 = "quick_reply_msg4";
                } else {
                    str = null;
                    str2 = null;
                }
                String string = a21Var.getParentActivity().getSharedPreferences("mainconfig", 0).getString(str2, "");
                boolean z10 = i10 != a21Var.e;
                EditTextBoldCursor editTextBoldCursor = h3Var.a;
                editTextBoldCursor.setText(string);
                editTextBoldCursor.setHint(str);
                h3Var.b = z10;
                h3Var.setWillNotDraw(!z10);
                break;
        }
    }

    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View x8Var;
        Context context = this.c;
        if (i10 == 0) {
            x8Var = new org.telegram.ui.Cells.x8(context);
        } else if (i10 != 1) {
            switch (i10) {
                case 9:
                case 10:
                case 11:
                case 12:
                    org.telegram.ui.Cells.h3 h3Var = new org.telegram.ui.Cells.h3(context);
                    h3Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
                    this.d.n[i10 - 9] = h3Var;
                    x8Var = h3Var;
                    break;
                default:
                    x8Var = new org.telegram.ui.Cells.p8(context);
                    x8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
                    break;
            }
        } else {
            x8Var = new org.telegram.ui.Cells.x9(context);
            x8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
        }
        x8Var.setLayoutParams(new f2.y0(-1, -2));
        return new org.telegram.ui.Components.lk0(x8Var);
    }
}
